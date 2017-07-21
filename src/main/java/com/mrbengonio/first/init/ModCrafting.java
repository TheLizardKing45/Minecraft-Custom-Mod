package com.mrbengonio.first.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		// Armor
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianHelm), "OOO", "OXO", "XXX", 'O',
				ModItems.obsidianingot);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianChest), "OXO", "OOO", "OOO", 'O',
				ModItems.obsidianingot);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianlegs), "OOO", "OXO", "OXO", 'O',
				ModItems.obsidianingot);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianboots), "XXX", "OXO", "OXO", 'O',
				ModItems.obsidianingot);

		// Tools
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianAxe), "OOX", "OSX", "XSX", 'O',
				ModItems.obsidianingot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianPickaxe), "OOO", "XSX", "XSX", 'O',
				ModItems.obsidianingot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianSpade), "XOX", "XSX", "XSX", 'O',
				ModItems.obsidianingot, 'S', Items.STICK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianSword), "XOX", "XOX", "XSX", 'O',
				ModItems.obsidianingot, 'S', Items.STICK);
	}

}
