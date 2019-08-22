package com.mrbengonio.first.init;

import java.util.HashMap;
import java.util.Map;

import com.mrbengonio.first.handlers.ItemGroupHandler;
import com.mrbengonio.first.handlers.MaterialHandler;
import com.mrbengonio.first.items.ItemEffectItem;
import com.mrbengonio.first.items.ItemGenericItem;
import com.mrbengonio.first.items.ItemSandvich;
import com.mrbengonio.first.items.ItemTechComponent;
import com.mrbengonio.first.items.ItemTechIngot;
import com.mrbengonio.first.items.ItemTrollItem;
import com.mrbengonio.first.items.armor.ArmorGenericArmor;
import com.mrbengonio.first.items.records.ItemGenericRecord;
import com.mrbengonio.first.items.tools.ItemGenericAxe;
import com.mrbengonio.first.items.tools.ItemGenericHoe;
import com.mrbengonio.first.items.tools.ItemGenericPickaxe;
import com.mrbengonio.first.items.tools.ItemGenericSpade;
import com.mrbengonio.first.items.tools.ItemGenericSword;
import com.mrbengonio.first.items.tools.ItemOrnateSword;

import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;

public class ModItems {

	public static final Map<String, Item> ITEMS = new HashMap<String, Item>() {
		{
			// Ingots
			put("ingot_cupalite", new ItemTechIngot("cupalite_ingot", ItemGroupHandler.tabKreuthil, 16, 5));
			put("ingot_saspum", new ItemTechIngot("saspum_ingot", ItemGroupHandler.tabKreuthil, 32, 5));
			put("ingot_kreuthil", new ItemTechIngot("kreuthil_ingot", ItemGroupHandler.tabKreuthil, 16, 5));
			put("ingot_xasmoninium", new ItemTechIngot("xasmoninium_ingot", ItemGroupHandler.tabKreuthil, 16, 5));

			put("alloy_tech", new ItemTechComponent("tech_alloy", ItemGroupHandler.tabKreuthil, 16));

			// Gems
			put("gem_obsidian", new ItemGenericItem("obsidian_gem", ItemGroupHandler.tabKreuthil, 64));

			// Powders
			put("powder_xasmoninium", new ItemTechComponent("xasmoninium_dust", ItemGroupHandler.tabKreuthil, 64));
			put("powder_saspum", new ItemTechComponent("saspum_dust", ItemGroupHandler.tabKreuthil, 64));
			put("powder_cupalite", new ItemTechComponent("cupalite_dust", ItemGroupHandler.tabKreuthil, 64));
			put("powder_tech", new ItemTechComponent("tech_dust", ItemGroupHandler.tabKreuthil, 16));

			// Shards
			put("shard_obsidian", new ItemGenericItem("obsidian_shard", ItemGroupHandler.tabKreuthil, 64));

			// Crafting Components
			put("cog_cupalite", new ItemTechComponent("Cupalite_cog", ItemGroupHandler.tabKreuthil, 64));
			put("bearingball_saspum", new ItemTechComponent("saspum_bearingball", ItemGroupHandler.tabKreuthil, 64));
			put("ballbearing_saspum", new ItemTechComponent("saspum_ballbearing", ItemGroupHandler.tabKreuthil, 32));
			put("bearingcasing_iron", new ItemGenericItem("iron_bearingcasing", ItemGroupHandler.tabKreuthil, 32));
			put("component_gearbox", new ItemTechComponent("gearbox", ItemGroupHandler.tabKreuthil, 8));
			put("component_opticboard", new ItemTechComponent("optic_board", ItemGroupHandler.tabKreuthil, 64));

			// Armor
			put("helmet_obsidian", new ArmorGenericArmor("obsidian_helmet", ItemGroupHandler.tabKreuthil,
					MaterialHandler.obsidianArmor, 0, EntityEquipmentSlot.HEAD));
			put("chestplate_obsidian", new ArmorGenericArmor("obsidian_chestplate", ItemGroupHandler.tabKreuthil,
					MaterialHandler.obsidianArmor, 0, EntityEquipmentSlot.CHEST));
			put("leggings_obsidian", new ArmorGenericArmor("obsidian_leggings", ItemGroupHandler.tabKreuthil,
					MaterialHandler.obsidianArmor, 1, EntityEquipmentSlot.LEGS));
			put("boots_obsidian", new ArmorGenericArmor("obsidian_boots", ItemGroupHandler.tabKreuthil,
					MaterialHandler.obsidianArmor, 0, EntityEquipmentSlot.FEET));
			put("helmet_tech", new ArmorGenericArmor("tech_helmet", ItemGroupHandler.tabKreuthil,
					MaterialHandler.techArmor, 0, EntityEquipmentSlot.HEAD));
			put("chestplate_explosive", new ArmorGenericArmor("bomber_chestplate", ItemGroupHandler.tabKreuthil,
					ItemArmor.ArmorMaterial.LEATHER, 0, EntityEquipmentSlot.CHEST));

			// Tools
			put("pickaxe_obsidian", new ItemGenericPickaxe("obsidian_pickaxe", ItemGroupHandler.tabKreuthil,
					MaterialHandler.obsidianTool));
			put("axe_obsidian",
					new ItemGenericAxe("obsidian_axe", ItemGroupHandler.tabKreuthil, MaterialHandler.obsidianTool));
			put("spade_obsidian", new ItemGenericSpade("obsidian_spade", ItemGroupHandler.tabKreuthil,
					MaterialHandler.obsidianTool));
			put("sword_obsidian", new ItemGenericSword("obsidian_sword", ItemGroupHandler.tabKreuthil,
					MaterialHandler.obsidianTool));
			put("hoe_obsidian",
					new ItemGenericHoe("obsidian_hoe", ItemGroupHandler.tabKreuthil, MaterialHandler.obsidianTool));

			put("sword_ornate",
					new ItemOrnateSword("ornate_sword", ItemGroupHandler.tabKreuthil, ToolMaterial.IRON));

			// Effect orbs

			put("orb_poison",
					new ItemEffectItem("poison_orb", ItemGroupHandler.tabKreuthil, 1, 64, MobEffects.POISON));
			put("orb_levitation", new ItemEffectItem("levitation_orb", ItemGroupHandler.tabKreuthil, 2, 64,
					MobEffects.LEVITATION));
			put("orb_glowing",
					new ItemEffectItem("glowing_orb", ItemGroupHandler.tabKreuthil, 4, 64, MobEffects.GLOWING));
			put("orb_blindness",
					new ItemEffectItem("blindness_orb", ItemGroupHandler.tabKreuthil, 3, 64, MobEffects.BLINDNESS));
			put("orb_regeneration", new ItemEffectItem("regeneration_orb", ItemGroupHandler.tabKreuthil, 4, 64,
					MobEffects.REGENERATION, MobEffects.RESISTANCE));

			// FOOD
			put("deity_sandvich", new ItemSandvich("deity_sandvich", 10, 20));

			// Jukebox discs
			put("record_miracle", new ItemGenericRecord("miracle_record", ModSounds.miracle,
					"Are You Ready For A Miracle?", "Patti LaBelle"));
			put("record_lobby", new ItemGenericRecord("lobby_record", ModSounds.lobby, "Lobby Time", "Kevin MacLeod"));
			put("record_holiday", new ItemGenericRecord("holiday_record", ModSounds.holiday, "Allah's Holiday",
					"Ted Lewis & His Band"));

			// TROLL
			put("troll_troll", new ItemTrollItem("troll_troll", ItemGroupHandler.tabKreuthil, 1));

		}
	};
}