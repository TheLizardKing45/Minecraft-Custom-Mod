package com.mrbengonio.first.util;

import com.mrbengonio.first.Reference;
import com.mrbengonio.first.init.ModBlocks;
import com.mrbengonio.first.init.ModItems;
import com.mrbengonio.first.init.ModSounds;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class RegisterUtil {

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(ModBlocks.cupaliteOre, ModBlocks.kreuthilOre, ModBlocks.saspumOre,
				ModBlocks.xasmoOre);
	}

	private static void registerBlockModels(RegistryEvent.Register<Block> event, Block... blocks) {
		for (Block block : blocks) {
			final ItemBlock itemblock = new ItemBlock(block);
			event.getRegistry().register(block);
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
					new ModelResourceLocation(block.getRegistryName(), "inventory"));
		}
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		registerItemModels(event, ModItems.obsidianshard, ModItems.cupaliteingot, ModItems.kreuthilingot,
				ModItems.saspumingot, ModItems.xasmoingot, ModItems.obsidianHelm, ModItems.obsidianChest,
				ModItems.obsidianlegs, ModItems.obsidianboots, ModItems.obsidianPickaxe, ModItems.obsidianAxe,
				ModItems.obsidianSpade, ModItems.obsidianSword, ModItems.BomberVest, ModItems.CupaliteCog,
				ModItems.saspumBallBearing, ModItems.saspumBearingBall, ModItems.GearBox, ModItems.Iron_BearingCasing,
				ModItems.miraclerecord, ModItems.tech_helmet, ModItems.TechAlloy, ModItems.xasmoDust,
				ModItems.cupaliteDust, ModItems.saspumDust, ModItems.techalloyDust, ModItems.optic_board);
	}

	private static void registerItemModels(RegistryEvent.Register<Item> event, Item... items) {
		for (Item item : items) {
			event.getRegistry().register(item);
			ModelLoader.setCustomModelResourceLocation(item, 0,
					new ModelResourceLocation(item.getRegistryName(), "inventory"));
		}
	}

	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		event.getRegistry().registerAll(ModSounds.miracle);
	}
}
