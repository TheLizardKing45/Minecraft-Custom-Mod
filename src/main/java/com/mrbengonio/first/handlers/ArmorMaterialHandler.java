package com.mrbengonio.first.handlers;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorMaterialHandler {
	public static final ArmorMaterial obsidian = EnumHelper.addArmorMaterial("Obsidian", "mfm:obsidian", 1500,
			new int[] { 3, 3, 3, 3 }, 30, SoundEvents.ENTITY_HORSE_BREATHE, 3);
}
