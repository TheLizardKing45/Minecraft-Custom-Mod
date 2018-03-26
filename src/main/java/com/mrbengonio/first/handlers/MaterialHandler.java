package com.mrbengonio.first.handlers;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class MaterialHandler {

	public static final ArmorMaterial obsidianArmor = EnumHelper.addArmorMaterial("Obsidian", "mfm:obsidian", 5,
			new int[] { 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);

	public static final ToolMaterial obsidianTool = EnumHelper.addToolMaterial("Obsidian", 4, 97, 10F, 3.5F, 15);

	public static final ArmorMaterial techArmor = EnumHelper.addArmorMaterial("tech", "mfm:tech", 5,
			new int[] { 3, 8, 6, 3 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5F);
}