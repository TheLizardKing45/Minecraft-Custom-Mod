package com.mrbengonio.first.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTechComponent extends ItemTechIngot {

	public ItemTechComponent(String name, ItemGroup tab, int maxSize) {
		super(name, tab, maxSize, 10);
	}

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
	}

}
