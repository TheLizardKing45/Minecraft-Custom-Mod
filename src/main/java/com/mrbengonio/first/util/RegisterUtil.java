package com.mrbengonio.first.util;

import com.mrbengonio.first.Mfm;
import com.mrbengonio.first.Reference;
import com.mrbengonio.first.handlers.ItemGroupHandler;
import com.mrbengonio.first.init.ModBlocks;
import com.mrbengonio.first.init.ModItems;
import com.mrbengonio.first.init.ModSounds;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class RegisterUtil {

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {

		for (Block block : ModBlocks.BLOCKS.values()) {
			event.getRegistry().register(block);
		}

		Mfm.LOGGER.info("Registered blocks");
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {

		Item.Properties properties = new Item.Properties().group(ItemGroupHandler.tabKreuthil);

		for (Item item : ModItems.ITEMS.values()) {
			event.getRegistry().register(item);
		}
		for (Block block : ModBlocks.BLOCKS.values()) {
			event.getRegistry().register(new BlockItem(block, properties).setRegistryName(block.getRegistryName()));

		}

		Mfm.LOGGER.info("Registered items");
	}

	// @SubscribeEvent
	// public static void registerModels(ModelRegistryEvent event) {
	// for (Block block : ModBlocks.BLOCKS.values()) {
	// ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
	// new ModelResourceLocation(block.getRegistryName(), "inventory"));
	// }
	// for (Item item : ModItems.ITEMS.values()) {
	// ModelLoader.setCustomModelResourceLocation(item, 0,new
	// ModelResourceLocation(item.getRegistryName(), "inventory"));

	// }
	// Mfm.LOGGER.info("Registered models");
	// }

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		event.getRegistry().registerAll(ModSounds.miracle, ModSounds.lobby);

		Mfm.LOGGER.info("Registered sounds");
	}
}
