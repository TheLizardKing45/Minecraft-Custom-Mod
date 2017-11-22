package com.mrbengonio.first.init;

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

	public static final Item[] ITEMS = {

			// Register Items

			// 1-4
			new ItemTechIngot("cupalite_ingot", CreativeTabsHandler.tabKreuthil, 16, 5),
			new ItemTechIngot("saspum_ingot", CreativeTabsHandler.tabKreuthil, 32, 5),
			new ItemTechIngot("kreuthil_ingot", CreativeTabsHandler.tabKreuthil, 16, 5),
			new ItemTechIngot("xasmoninium_ingot", CreativeTabsHandler.tabKreuthil, 16, 5),

			// 5
			new ItemTechComponent("tech_alloy", CreativeTabsHandler.tabKreuthil, 16),

			// Ingot Powders
			new ItemTechComponent("xasmoninium_dust", CreativeTabsHandler.tabKreuthil, 64),
			new ItemTechComponent("saspum_dust", CreativeTabsHandler.tabKreuthil, 64),
			new ItemTechComponent("cupalite_dust", CreativeTabsHandler.tabKreuthil, 64),
			new ItemTechComponent("tech_dust", CreativeTabsHandler.tabKreuthil, 16),

			// Tech Components
			new ItemTechComponent("Cupalite_cog", CreativeTabsHandler.tabKreuthil, 64),

			new ItemTechComponent("saspum_bearingball", CreativeTabsHandler.tabKreuthil, 64),

			new ItemTechComponent("saspum_ballbearing", CreativeTabsHandler.tabKreuthil, 32),

			new ItemTechComponent("gearbox", CreativeTabsHandler.tabKreuthil, 8),

			// Components
			new ItemGenericItem("iron_bearingcasing", CreativeTabsHandler.tabKreuthil, 32),

			new ItemTechComponent("optic_board", CreativeTabsHandler.tabKreuthil, 64),

			// Shards
			new ItemGenericItem("obsidian_shard", CreativeTabsHandler.tabKreuthil, 64),

			// Armor
			new ArmorGenericArmor("obsidian_helmet", CreativeTabsHandler.tabKreuthil, MaterialHandler.obsidianArmor, 0,
					EntityEquipmentSlot.HEAD),
			new ArmorGenericArmor("obsidian_chestplate", CreativeTabsHandler.tabKreuthil, MaterialHandler.obsidianArmor,
					0, EntityEquipmentSlot.CHEST),
			new ArmorGenericArmor("obsidian_leggings", CreativeTabsHandler.tabKreuthil, MaterialHandler.obsidianArmor,
					1, EntityEquipmentSlot.LEGS),
			new ArmorGenericArmor("obsidian_boots", CreativeTabsHandler.tabKreuthil, MaterialHandler.obsidianArmor, 0,
					EntityEquipmentSlot.FEET),

			new ArmorGenericArmor("tech_helmet", CreativeTabsHandler.tabKreuthil, MaterialHandler.techArmor, 0,
					EntityEquipmentSlot.HEAD), // 20

			new ArmorGenericArmor("bomber_chestplate", CreativeTabsHandler.tabKreuthil, ItemArmor.ArmorMaterial.LEATHER,
					0, EntityEquipmentSlot.CHEST), // 21

			// Tools
			new ItemGenericPickaxe("obsidian_pickaxe", CreativeTabsHandler.tabKreuthil, MaterialHandler.obsidianTool),
			new ItemGenericAxe("obsidian_axe", CreativeTabsHandler.tabKreuthil, MaterialHandler.obsidianTool),
			new ItemGenericSpade("obsidian_spade", CreativeTabsHandler.tabKreuthil, MaterialHandler.obsidianTool),
			new ItemGenericSword("obsidian_sword", CreativeTabsHandler.tabKreuthil, MaterialHandler.obsidianTool),

			// Other
			new ItemGenericRecord("miracle_record", ModSounds.miracle, "Are You Ready For A Miracle?",
					"Patti LaBelle") };
}
