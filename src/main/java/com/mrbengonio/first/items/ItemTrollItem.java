package com.mrbengonio.first.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTrollItem extends ItemBase {

	public ItemTrollItem(String name, CreativeTabs tab, int maxSize) {
		super(name, tab, maxSize);
	}

	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		EntityPlayer player = (EntityPlayer) entityIn;

		player.replaceItemInInventory(player.inventory.getFirstEmptyStack(), new ItemStack(stack.getItem()));

	}

	@Override
	public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
		return false;
	}

}
