package com.mrbengonio.first.items;

import net.minecraft.creativetab.CreativeTabs;

public class ItemGenericFood extends FoodBase {
	public ItemGenericFood(String name, int MaxSize, int healAmount, int saturation) {
		super(name, CreativeTabs.FOOD, MaxSize, healAmount, saturation, false);
	}
}
