package com.mrbengonio.first.init;

import com.mrbengonio.first.handlers.ArmorMaterialHandler;
import com.mrbengonio.first.handlers.CreativeTabsHandler;
import com.mrbengonio.first.items.ItemGenericArmor;
import com.mrbengonio.first.items.ItemGenericItem;
import com.mrbengonio.first.items.ItemQualityIngot;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

public class Items {

	// Register Items

	// Ingot
	public static final Item obsidianingot = new ItemGenericItem("obsidianingot", CreativeTabsHandler.tabKreuthil, 64);
	public static final Item cupaliteingot = new ItemQualityIngot("cupalite_ingot", CreativeTabsHandler.tabKreuthil, 16,
			5);
	public static final Item saspumingot = new ItemQualityIngot("saspum_ingot", CreativeTabsHandler.tabKreuthil, 32, 5);
	public static final Item kreuthilingot = new ItemQualityIngot("kreuthil_ingot", CreativeTabsHandler.tabKreuthil, 16,
			5);
	public static final Item xasmoingot = new ItemQualityIngot("xasmoninium_ingot", CreativeTabsHandler.tabKreuthil, 16,
			5);

	// Armor
	public static final Item obsidianHelm = new ItemGenericArmor("obsidianHelm", CreativeTabsHandler.tabKreuthil,
			ArmorMaterialHandler.obsidian, 0, EntityEquipmentSlot.HEAD);
	public static final Item obsidianChest = new ItemGenericArmor("obsidianChest", CreativeTabsHandler.tabKreuthil,
			ArmorMaterialHandler.obsidian, 0, EntityEquipmentSlot.CHEST);
	public static final Item obsidianlegs = new ItemGenericArmor("obsidianLegs", CreativeTabsHandler.tabKreuthil,
			ArmorMaterialHandler.obsidian, 1, EntityEquipmentSlot.LEGS);
	public static final Item obsidianboots = new ItemGenericArmor("obsidianBoots", CreativeTabsHandler.tabKreuthil,
			ArmorMaterialHandler.obsidian, 0, EntityEquipmentSlot.FEET);

}
