package com.mrbengonio.first.handlers;

import com.mrbengonio.first.init.ModItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupHandler {
	public static final ItemGroup tabKreuthil = new ItemGroup("kreuthil_items") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(ModItems.ITEMS.get("ingot_kreuthil"));
		}
	};

}
