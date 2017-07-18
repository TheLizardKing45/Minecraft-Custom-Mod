package com.mrbengonio.first.handlers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CreativeTabsHandler {
	public static final CreativeTabs tabKreuthil = new CreativeTabs("Kreuthil Items") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Items.DRAGON_BREATH);
		}
	};

}
