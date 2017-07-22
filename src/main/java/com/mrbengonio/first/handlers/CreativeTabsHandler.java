package com.mrbengonio.first.handlers;

import com.mrbengonio.first.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabsHandler {
	public static final CreativeTabs tabKreuthil = new CreativeTabs("kreuthil_items") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.obsidianshard);
		}
	};

}
