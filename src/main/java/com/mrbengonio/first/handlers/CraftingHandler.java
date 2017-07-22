package com.mrbengonio.first.handlers;

import com.mrbengonio.first.init.ModBlocks;
import com.mrbengonio.first.init.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingHandler {

	public static void RegisterCrafting() {

		// Armor
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianHelm), "OOO", "OXO", "XXX", 'O',
				ModItems.obsidianshard);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianChest), "OXO", "OOO", "OOO", 'O',
				ModItems.obsidianshard);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianlegs), "OOO", "OXO", "OXO", 'O',
				ModItems.obsidianshard);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianboots), "XXX", "OXO", "OXO", 'O',
				ModItems.obsidianshard);

		// Tools
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianAxe), "OOX", "OSX", "XSX", 'O',
				ModItems.obsidianshard, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianPickaxe), "OOO", "XSX", "XSX", 'O',
				ModItems.obsidianshard, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianSpade), "XOX", "XSX", "XSX", 'O',
				ModItems.obsidianshard, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianSword), "XOX", "XOX", "XSX", 'O',
				ModItems.obsidianshard, 'S', Items.STICK);

		// Other
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.OBSIDIAN, 1), ModItems.obsidianshard,
				ModItems.obsidianshard, ModItems.obsidianshard, ModItems.obsidianshard);

	}

	public static void RegisterSmelting() {
		// Ores
		GameRegistry.addSmelting(ModBlocks.cupaliteOre, new ItemStack(ModItems.cupaliteingot), 1.0F);
		GameRegistry.addSmelting(ModBlocks.kreuthilOre, new ItemStack(ModItems.kreuthilingot), 1.0F);
		GameRegistry.addSmelting(ModBlocks.saspumOre, new ItemStack(ModItems.saspumingot), 1.0F);
		GameRegistry.addSmelting(ModBlocks.xasmoOre, new ItemStack(ModItems.xasmoingot), 1.0F);
	}

}
