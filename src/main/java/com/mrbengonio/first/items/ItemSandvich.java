package com.mrbengonio.first.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemSandvich extends FoodBase {
	public ItemSandvich(String name, int healAmount, int saturation) {
		super(name, CreativeTabs.FOOD, 1, healAmount, saturation, false);
		super.setAlwaysEdible();
		super.setFull3D();
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 20 * 10, 5, false, true));
		player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 20 * 10, 5, false, true));
		player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 20 * 10, 5, false, true));
	}

}
