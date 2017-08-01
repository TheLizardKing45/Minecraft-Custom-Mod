package com.mrbengonio.first.handlers;

import com.mrbengonio.first.crafting.TechCraftingManager;
import com.mrbengonio.first.crafting.TechCraftingShaped;
import com.mrbengonio.first.crafting.TechCraftingShapeless;
import com.mrbengonio.first.init.ModBlocks;
import com.mrbengonio.first.init.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.RecipeSorter;

public class CraftingHandler {

	public static void RegisterCrafting() {

		RecipeSorter.register("mfm:techshaped", TechCraftingShaped.class, RecipeSorter.Category.SHAPED,
				"before:mfm:techshapeless after:minecraft:shapeless");
		RecipeSorter.register("mfm:techshapeless", TechCraftingShapeless.class, RecipeSorter.Category.SHAPELESS,
				"after:mfm:techshaped after:minecraft:shapeless");

		// Armor
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianHelm), "OOO", "OXO", "XXX", 'O',
				ModItems.obsidianshard);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianChest), "OXO", "OOO", "OOO", 'O',
				ModItems.obsidianshard);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianlegs), "OOO", "OXO", "OXO", 'O',
				ModItems.obsidianshard);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianboots), "XXX", "OXO", "OXO", 'O',
				ModItems.obsidianshard);

		GameRegistry.addShapedRecipe(new ItemStack(ModItems.BomberVest), "LTL", "LVL", "LTL", 'L', Items.LEATHER, 'T',
				Blocks.TNT, 'V', Items.LEATHER_CHESTPLATE);

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

		TechCraftingManager.AddRecipe(new ItemStack(ModItems.CupaliteCog, 1), " C ", "C C", " C ", 'C',
				ModItems.cupaliteingot);

		GameRegistry.addShapedRecipe(new ItemStack(ModItems.Iron_BearingCasing, 2), "III", "I I", "III", 'I',
				Items.IRON_INGOT);

		TechCraftingManager.addShapelessRecipe(new ItemStack(ModItems.saspumBearingBall), ModItems.saspumingot);

		TechCraftingManager.AddRecipe(new ItemStack(ModItems.saspumBallBearing), "BBB", "BCB", "BBB", 'B',
				ModItems.saspumBearingBall, 'C', ModItems.Iron_BearingCasing);

		TechCraftingManager.AddRecipe(new ItemStack(ModItems.GearBox), "IGI", "BGB", "IGI", 'I', Items.IRON_INGOT, 'G',
				ModItems.CupaliteCog, 'B', ModItems.saspumBallBearing);

	}

	public static void RegisterSmelting() {
		// Ores
		GameRegistry.addSmelting(ModBlocks.cupaliteOre, new ItemStack(ModItems.cupaliteingot), 1.0F);
		GameRegistry.addSmelting(ModBlocks.kreuthilOre, new ItemStack(ModItems.kreuthilingot), 1.0F);
		GameRegistry.addSmelting(ModBlocks.saspumOre, new ItemStack(ModItems.saspumingot), 1.0F);
		GameRegistry.addSmelting(ModBlocks.xasmoOre, new ItemStack(ModItems.xasmoingot), 1.0F);
	}

}
