package com.mrbengonio.first.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTrollItem extends ItemBase {

	public ItemTrollItem(String name, ItemGroup tab, int maxSize) {
		super(name, tab, maxSize);
	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		PlayerEntity player = (PlayerEntity) entityIn;

		player.replaceItemInInventory(player.inventory.getFirstEmptyStack(), new ItemStack(stack.getItem()));

	}

}
