package com.mrbengonio.first.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood {

	public FoodBase(String name, CreativeTabs tab, int HealAmount) {
		this(name, tab, 64, HealAmount, 0.6F, false);
	}

	public FoodBase(String name, CreativeTabs tab, int maxSize, int HealAmount, float saturation, boolean isWolfFood) {
		super(HealAmount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		setMaxStackSize(maxSize);
	}
}