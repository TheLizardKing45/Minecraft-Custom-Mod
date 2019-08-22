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
	public void onUpdate(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected) {
	}

}
