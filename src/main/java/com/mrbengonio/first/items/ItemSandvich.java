package com.mrbengonio.first.items;

import com.mrbengonio.first.handlers.ItemGroupHandler;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class ItemSandvich extends FoodBase {

	public ItemSandvich(String name, ItemGroup tab, int hunger, float saturation) {

		// String name, ItemGroup tab, int maxSize, int hunger, float saturation,
		// EffectInstance effectIn, float probability
		super(name, ItemGroupHandler.tabKreuthil, 64, 1, 1,
				new EffectInstance(Effects.ABSORPTION, 20 * 10, 5, false, true), 100);
	}

	protected void onFoodEaten(ItemStack stack, World worldIn, Entity player) {
		// player.addPotionEffect(new EffectInstance(Effects.HEALTH_BOOST, 20 * 10, 5,
		// false, true));
		// player.addPotionEffect(new EffectInstance(Effects.REGENERATION, 20 * 10, 5,
		// false, true));
	}

}
