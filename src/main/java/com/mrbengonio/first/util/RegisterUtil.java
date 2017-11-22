package com.mrbengonio.first.util;

import com.mrbengonio.first.First;
import com.mrbengonio.first.Reference;
import com.mrbengonio.first.init.ModBlocks;
import com.mrbengonio.first.init.ModItems;
import com.mrbengonio.first.init.ModSounds;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class RegisterUtil {

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(ModBlocks.BLOCKS);

		First.LOGGER.info("Registered blocks");
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ModItems.ITEMS);

		for (Block block : ModBlocks.BLOCKS) {
			event.getRegistry().register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		}

		First.LOGGER.info("Registered items");
	}

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		for (Block block : ModBlocks.BLOCKS) {
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
					new ModelResourceLocation(block.getRegistryName(), "inventory"));
		}
		for (Item item : ModItems.ITEMS) {
			ModelLoader.setCustomModelResourceLocation(item, 0,
					new ModelResourceLocation(item.getRegistryName(), "inventory"));
		}
		First.LOGGER.info("Registered models");
	}

	// Pretty sure this isn't being called
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		event.getRegistry().registerAll(ModSounds.miracle);

		First.LOGGER.info("Registered sounds");
	}
}
