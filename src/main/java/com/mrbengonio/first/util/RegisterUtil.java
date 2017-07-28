package com.mrbengonio.first.util;

import com.mrbengonio.first.init.ModBlocks;
import com.mrbengonio.first.init.ModItems;
import com.mrbengonio.first.init.ModSounds;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class RegisterUtil {
	// register it here
	public static void registerAll(FMLPreInitializationEvent event) {
		registerBlocks(event, ModBlocks.cupaliteOre, ModBlocks.kreuthilOre, ModBlocks.saspumOre, ModBlocks.xasmoOre);
		registerItems(event, ModItems.obsidianingot, ModItems.cupaliteingot, ModItems.kreuthilingot,
				ModItems.saspumingot, ModItems.xasmoingot, ModItems.obsidianHelm, ModItems.obsidianChest,
				ModItems.obsidianlegs, ModItems.obsidianboots, ModItems.obsidianPickaxe, ModItems.obsidianAxe,
				ModItems.obsidianSpade, ModItems.obsidianSword, ModItems.miraclerecord);
		registerSounds(event, ModSounds.miracle);
	}

	// A method used to register blocks
	private static void registerBlocks(FMLPreInitializationEvent event, Block... blocks) {
		for (Block block : blocks) { // New instance of a block for every block passed through
			final ItemBlock itemblock = new ItemBlock(block);
			if (event.getSide() == Side.CLIENT) {
				GameRegistry.register(block);
				GameRegistry.register(itemblock, block.getRegistryName());
				ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
						new ModelResourceLocation(block.getRegistryName(), "inventory"));
			}
		}

	}

	private static void registerItems(FMLPreInitializationEvent event, Item... items) {
		for (Item item : items) {
			if (event.getSide() == Side.CLIENT) {
				GameRegistry.register(item);
				ModelLoader.setCustomModelResourceLocation(item, 0,
						new ModelResourceLocation(item.getRegistryName(), "inventory"));
			}

		}
	}

	private static void registerSounds(FMLPreInitializationEvent event, SoundEvent... sounds) {
		for (SoundEvent sound : sounds) {
			GameRegistry.register(sound, sound.getSoundName());
		}
	}

}
