package com.mrbengonio.first.handlers;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorMaterialHandler {
	public static final ArmorMaterial obsidian = EnumHelper.addArmorMaterial("Obsidian", "mfm:obsidian", 5,
			new int[] { 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
}
