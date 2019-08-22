package com.mrbengonio.first.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FoodBase extends Item {

	public FoodBase(String name, ItemGroup tab, int hunger, float saturation) {
		this(name, tab, 64, hunger, saturation);
	}

	public FoodBase(String name, ItemGroup tab, int maxSize, int hunger, float saturation) {
		this(name, tab, maxSize, hunger, saturation, new EffectInstance(Effects.LUCK, 0, 0, false, false), 0);

	}

	public FoodBase(String name, ItemGroup tab, int maxSize, int hunger, float saturation, EffectInstance effectIn,
			float probability) {
		super(new Item.Properties()
				.food((new Food.Builder()).hunger(hunger).saturation(saturation).effect(effectIn, probability).build())
				.group(tab).maxStackSize(maxSize));
		setRegistryName(name);
	}
}