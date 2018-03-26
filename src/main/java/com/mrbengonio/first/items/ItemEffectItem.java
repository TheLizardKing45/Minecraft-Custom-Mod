package com.mrbengonio.first.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemEffectItem extends ItemBase {

	Potion Effect[];
	int Clock = 0;
	int Length;

	public ItemEffectItem(String name, CreativeTabs tab, int length, int StackSize, Potion... effect) {
		super(name, tab, StackSize);
		Effect = effect;
		Length = length * 20;
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		Clock++;
		EntityLivingBase playerIn = (EntityLivingBase) entityIn;
		if (Clock >= Length) {
			stack.shrink(1);
			for (int i = 0; i < Effect.length; i++) {
				playerIn.addPotionEffect(new PotionEffect(Effect[i], Length, 5, false, false));
			}
			Clock = 0;
		}

	}
}