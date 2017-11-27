package com.mrbengonio.first.init;

import java.util.HashMap;
import java.util.Map;

import com.mrbengonio.first.handlers.CreativeTabsHandler;
import com.mrbengonio.first.handlers.MaterialHandler;
import com.mrbengonio.first.items.ItemGenericItem;
import com.mrbengonio.first.items.ItemTechComponent;
import com.mrbengonio.first.items.ItemTechIngot;
import com.mrbengonio.first.items.armor.ArmorGenericArmor;
import com.mrbengonio.first.items.records.ItemGenericRecord;
import com.mrbengonio.first.items.tools.ItemGenericAxe;
import com.mrbengonio.first.items.tools.ItemGenericPickaxe;
import com.mrbengonio.first.items.tools.ItemGenericSpade;
import com.mrbengonio.first.items.tools.ItemGenericSword;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class ModItems {

	public static final Map<String, Item> ITEMS = new HashMap<String, Item>() {
		{
			// Ingots
			put("ingot_cupalite", new ItemTechIngot("cupalite_ingot", CreativeTabsHandler.tabKreuthil, 16, 5));
			put("ingot_saspum", new ItemTechIngot("saspum_ingot", CreativeTabsHandler.tabKreuthil, 32, 5));
			put("ingot_kreuthil", new ItemTechIngot("kreuthil_ingot", CreativeTabsHandler.tabKreuthil, 16, 5));
			put("ingot_xasmoninium", new ItemTechIngot("xasmoninium_ingot", CreativeTabsHandler.tabKreuthil, 16, 5));

			put("alloy_tech", new ItemTechComponent("tech_alloy", CreativeTabsHandler.tabKreuthil, 16));

			// Powders
			put("powder_xasmoninium", new ItemTechComponent("xasmoninium_dust", CreativeTabsHandler.tabKreuthil, 64));
			put("powder_saspum", new ItemTechComponent("saspum_dust", CreativeTabsHandler.tabKreuthil, 64));
			put("powder_cupalite", new ItemTechComponent("cupalite_dust", CreativeTabsHandler.tabKreuthil, 64));
			put("powder_tech", new ItemTechComponent("tech_dust", CreativeTabsHandler.tabKreuthil, 16));

			// Shards
			put("shard_obsidian", new ItemGenericItem("obsidian_shard", CreativeTabsHandler.tabKreuthil, 64));

			// Crafting Components
			put("cog_cupalite", new ItemTechComponent("Cupalite_cog", CreativeTabsHandler.tabKreuthil, 64));
			put("bearingball_saspum", new ItemTechComponent("saspum_bearingball", CreativeTabsHandler.tabKreuthil, 64));
			put("ballbearing_saspum", new ItemTechComponent("saspum_ballbearing", CreativeTabsHandler.tabKreuthil, 32));
			put("bearingcasing_iron", new ItemGenericItem("iron_bearingcasing", CreativeTabsHandler.tabKreuthil, 32));
			put("component_gearbox", new ItemTechComponent("gearbox", CreativeTabsHandler.tabKreuthil, 8));
			put("component_opticboard", new ItemTechComponent("optic_board", CreativeTabsHandler.tabKreuthil, 64));

			// Armor
			put("helmet_obsidian", new ArmorGenericArmor("obsidian_helmet", CreativeTabsHandler.tabKreuthil,
					MaterialHandler.obsidianArmor, 0, EntityEquipmentSlot.HEAD));
			put("chestplate_obsidian", new ArmorGenericArmor("obsidian_chestplate", CreativeTabsHandler.tabKreuthil,
					MaterialHandler.obsidianArmor, 0, EntityEquipmentSlot.CHEST));
			put("leggings_obsidian", new ArmorGenericArmor("obsidian_leggings", CreativeTabsHandler.tabKreuthil,
					MaterialHandler.obsidianArmor, 1, EntityEquipmentSlot.LEGS));
			put("boots_obsidian", new ArmorGenericArmor("obsidian_boots", CreativeTabsHandler.tabKreuthil,
					MaterialHandler.obsidianArmor, 0, EntityEquipmentSlot.FEET));
			put("helmet_tech", new ArmorGenericArmor("tech_helmet", CreativeTabsHandler.tabKreuthil,
					MaterialHandler.techArmor, 0, EntityEquipmentSlot.HEAD));
			put("chestplate_explosive", new ArmorGenericArmor("bomber_chestplate", CreativeTabsHandler.tabKreuthil,
					ItemArmor.ArmorMaterial.LEATHER, 0, EntityEquipmentSlot.CHEST));

			// Tools
			put("pickaxe_obsidian", new ItemGenericPickaxe("obsidian_pickaxe", CreativeTabsHandler.tabKreuthil,
					MaterialHandler.obsidianTool));
			put("axe_obsidian",
					new ItemGenericAxe("obsidian_axe", CreativeTabsHandler.tabKreuthil, MaterialHandler.obsidianTool));
			put("spade_obsidian", new ItemGenericSpade("obsidian_spade", CreativeTabsHandler.tabKreuthil,
					MaterialHandler.obsidianTool));
			put("sword_obsidian", new ItemGenericSword("obsidian_sword", CreativeTabsHandler.tabKreuthil,
					MaterialHandler.obsidianTool));

			// Jukebox discs
			put("record_miracle", new ItemGenericRecord("miracle_record", ModSounds.miracle,
					"Are You Ready For A Miracle?", "Patti LaBelle"));
			put("record_lobby", new ItemGenericRecord("lobby_record", ModSounds.lobby, "Lobby Time", "Kevin MacLeod"));
		}
	};
}