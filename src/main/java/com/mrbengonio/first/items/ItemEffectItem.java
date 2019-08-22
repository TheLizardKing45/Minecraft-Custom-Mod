package com.mrbengonio.first.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.world.World;

public class ItemEffectItem extends ItemBase {

	Effect PotionEffect[];
	int Clock = 0;
	int Length;

	public ItemEffectItem(String name, ItemGroup tab, int length, int StackSize, Effect... eff) {
		super(name, tab, StackSize);
		PotionEffect = eff;
		Length = length * 20;
	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		Clock++;
		PlayerEntity playerIn = (PlayerEntity) entityIn;
		if (Clock >= Length) {
			stack.shrink(1);
			for (int i = 0; i < PotionEffect.length; i++) {

				playerIn.addPotionEffect(new EffectInstance(PotionEffect[i], Length, 5, false, false));
			}
			Clock = 0;
		}

	}
}