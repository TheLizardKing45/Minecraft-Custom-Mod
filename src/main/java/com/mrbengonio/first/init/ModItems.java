package com.mrbengonio.first.init;

import com.mrbengonio.first.handlers.CreativeTabsHandler;
import com.mrbengonio.first.handlers.MaterialHandler;
import com.mrbengonio.first.items.ItemGenericItem;
import com.mrbengonio.first.items.ItemTechComponent;
import com.mrbengonio.first.items.ItemTechIngot;
import com.mrbengonio.first.items.armor.ArmorGenericArmor;
import com.mrbengonio.first.items.tools.ItemGenericAxe;
import com.mrbengonio.first.items.tools.ItemGenericPickaxe;
import com.mrbengonio.first.items.tools.ItemGenericSpade;
import com.mrbengonio.first.items.tools.ItemGenericSword;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

public class ModItems {

	// Register Items

	// Ingot
	public static final Item cupaliteingot = new ItemTechIngot("cupalite_ingot", CreativeTabsHandler.tabKreuthil, 16,
			5);
	public static final Item saspumingot = new ItemTechIngot("saspum_ingot", CreativeTabsHandler.tabKreuthil, 32, 5);
	public static final Item kreuthilingot = new ItemTechIngot("kreuthil_ingot", CreativeTabsHandler.tabKreuthil, 16,
			5);
	public static final Item xasmoingot = new ItemTechIngot("xasmoninium_ingot", CreativeTabsHandler.tabKreuthil, 16,
			5);

	// Tech Components
	public static final Item CupaliteCog = new ItemTechComponent("Cupalite_cog", CreativeTabsHandler.tabKreuthil, 64);

	public static final Item saspumBearingBall = new ItemTechComponent("saspum_bearingball",
			CreativeTabsHandler.tabKreuthil, 64);

	public static final Item saspumBallBearing = new ItemTechComponent("saspum_ballbearing",
			CreativeTabsHandler.tabKreuthil, 32);

	public static final Item GearBox = new ItemTechComponent("gearbox", CreativeTabsHandler.tabKreuthil, 8);

	// Components
	public static final Item Iron_BearingCasing = new ItemGenericItem("iron_bearingcasing",
			CreativeTabsHandler.tabKreuthil, 32);

	// Shards
	public static final Item obsidianshard = new ItemGenericItem("obsidian_shard", CreativeTabsHandler.tabKreuthil, 64);

	// Armor
	public static final Item obsidianHelm = new ArmorGenericArmor("obsidian_helmet", CreativeTabsHandler.tabKreuthil,
			MaterialHandler.obsidianArmor, 0, EntityEquipmentSlot.HEAD);
	public static final Item obsidianChest = new ArmorGenericArmor("obsidian_chestplate",
			CreativeTabsHandler.tabKreuthil, MaterialHandler.obsidianArmor, 0, EntityEquipmentSlot.CHEST);
	public static final Item obsidianlegs = new ArmorGenericArmor("obsidian_leggings", CreativeTabsHandler.tabKreuthil,
			MaterialHandler.obsidianArmor, 1, EntityEquipmentSlot.LEGS);
	public static final Item obsidianboots = new ArmorGenericArmor("obsidian_boots", CreativeTabsHandler.tabKreuthil,
			MaterialHandler.obsidianArmor, 0, EntityEquipmentSlot.FEET);

	// Tools
	public static final Item obsidianPickaxe = new ItemGenericPickaxe("obsidian_pickaxe",
			CreativeTabsHandler.tabKreuthil, MaterialHandler.obsidianTool);
	public static final Item obsidianAxe = new ItemGenericAxe("obsidian_axe", CreativeTabsHandler.tabKreuthil,
			MaterialHandler.obsidianTool);
	public static final Item obsidianSpade = new ItemGenericSpade("obsidian_spade", CreativeTabsHandler.tabKreuthil,
			MaterialHandler.obsidianTool);
	public static final Item obsidianSword = new ItemGenericSword("obsidian_sword", CreativeTabsHandler.tabKreuthil,
			MaterialHandler.obsidianTool);

}
