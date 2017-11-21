package com.mrbengonio.first.handlers;

import com.mrbengonio.first.init.ModBlocks;
import com.mrbengonio.first.init.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingHandler {

	// Armor
	/*
	 * GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianChest), "OXO",
	 * "OOO", "OOO", 'O', ModItems.obsidianshard); GameRegistry.addShapedRecipe(new
	 * ItemStack(ModItems.obsidianlegs), "OOO", "OXO", "OXO", 'O',
	 * ModItems.obsidianshard); GameRegistry.addShapedRecipe(new
	 * ItemStack(ModItems.obsidianboots), "XXX", "OXO", "OXO", 'O',
	 * ModItems.obsidianshard);
	 * 
	 * GameRegistry.addShapedRecipe(new ItemStack(ModItems.BomberVest), "LTL",
	 * "LVL", "LTL", 'L', Items.LEATHER, 'T', Blocks.TNT, 'V',
	 * Items.LEATHER_CHESTPLATE);
	 * 
	 * // Tools GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianAxe),
	 * "OOX", "OSX", "XSX", 'O', ModItems.obsidianshard, 'S', Items.STICK);
	 * GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianPickaxe), "OOO",
	 * "XSX", "XSX", 'O', ModItems.obsidianshard, 'S', Items.STICK);
	 * GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianSpade), "XOX",
	 * "XSX", "XSX", 'O', ModItems.obsidianshard, 'S', Items.STICK);
	 * GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianSword), "XOX",
	 * "XOX", "XSX", 'O', ModItems.obsidianshard, 'S', Items.STICK);
	 * 
	 * // Other GameRegistry.addShapelessRecipe(new ItemStack(Blocks.OBSIDIAN, 1),
	 * ModItems.obsidianshard, ModItems.obsidianshard, ModItems.obsidianshard,
	 * ModItems.obsidianshard);
	 * 
	 * GameRegistry.addShapedRecipe(new ItemStack(ModItems.CupaliteCog, 1), " C ",
	 * "C C", " C ", 'C', ModItems.cupaliteingot);
	 * 
	 * GameRegistry.addShapedRecipe(new ItemStack(ModItems.Iron_BearingCasing, 2),
	 * "III", "I I", "III", 'I', Items.IRON_INGOT);
	 * 
	 * GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cupaliteDust),
	 * ModItems.cupaliteingot); GameRegistry.addShapelessRecipe(new
	 * ItemStack(ModItems.saspumDust), ModItems.saspumingot);
	 * GameRegistry.addShapelessRecipe(new ItemStack(ModItems.techalloyDust, 4),
	 * ModItems.cupaliteDust, ModItems.saspumDust, ModItems.xasmoDust,
	 * ModItems.obsidianshard); GameRegistry.addShapelessRecipe(new
	 * ItemStack(ModItems.xasmoDust), ModItems.xasmoingot);
	 * GameRegistry.addShapelessRecipe(new ItemStack(ModItems.saspumBearingBall),
	 * ModItems.saspumingot);
	 * 
	 * GameRegistry.addShapedRecipe(new ItemStack(ModItems.saspumBallBearing),
	 * "BBB", "BCB", "BBB", 'B', ModItems.saspumBearingBall, 'C',
	 * ModItems.Iron_BearingCasing);
	 * 
	 * GameRegistry.addShapedRecipe(new ItemStack(ModItems.GearBox), "IGI", "BGB",
	 * "IGI", 'I', Items.IRON_INGOT, 'G', ModItems.CupaliteCog, 'B',
	 * ModItems.saspumBallBearing);
	 * 
	 * GameRegistry.addShapedRecipe(new ItemStack(ModItems.tech_helmet), "TTT",
	 * "GCG", "TTT", 'T', ModItems.TechAlloy, 'G', Blocks.GLASS, 'C',
	 * ModItems.optic_board);
	 * 
	 * GameRegistry.addShapedRecipe(new ItemStack(ModItems.optic_board), "RSR",
	 * "IKI", "RSR", 'R', Items.REDSTONE, 'I', Items.IRON_INGOT, 'S',
	 * ModItems.saspumingot, 'K', ModItems.kreuthilingot); }
	 */
	public static void RegisterSmelting() {
		// Ores
		GameRegistry.addSmelting(ModBlocks.cupaliteOre, new ItemStack(ModItems.cupaliteingot), 1.0F);
		GameRegistry.addSmelting(ModBlocks.kreuthilOre, new ItemStack(ModItems.kreuthilingot), 1.0F);
		GameRegistry.addSmelting(ModBlocks.saspumOre, new ItemStack(ModItems.saspumingot), 1.0F);
		GameRegistry.addSmelting(ModBlocks.xasmoOre, new ItemStack(ModItems.xasmoingot), 1.0F);

		GameRegistry.addSmelting(ModItems.techalloyDust, new ItemStack(ModItems.TechAlloy), 1.0F);
		GameRegistry.addSmelting(ModItems.cupaliteDust, new ItemStack(ModItems.cupaliteingot), 1.0F);
		GameRegistry.addSmelting(ModItems.saspumDust, new ItemStack(ModItems.saspumingot), 1.0F);
		GameRegistry.addSmelting(ModItems.xasmoDust, new ItemStack(ModItems.xasmoingot), 1.0F);
	}

}
