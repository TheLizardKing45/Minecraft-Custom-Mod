package com.mrbengonio.first.init;

import com.mrbengonio.first.blocks.BlockGenericBlock;
import com.mrbengonio.first.handlers.CreativeTabsHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blocks {

	// Register Blocks here

	// Ores
	public static final Block cupaliteOre = new BlockGenericBlock("cupalite_ore", Material.ROCK,
			CreativeTabsHandler.tabKreuthil, 6F, 50F, "pickaxe", 4);
	public static final Block saspumOre = new BlockGenericBlock("saspum_ore", Material.ROCK,
			CreativeTabsHandler.tabKreuthil, 6F, 50F, "pickaxe", 4);
	public static final Block kreuthilOre = new BlockGenericBlock("kreuthil_ore", Material.ROCK,
			CreativeTabsHandler.tabKreuthil, 6F, 50F, "pickaxe", 4);
	public static final Block xasmoOre = new BlockGenericBlock("xasmoninium_ore", Material.ROCK,
			CreativeTabsHandler.tabKreuthil, 6F, 50F, "pickaxe", 4);

	// Other Blocks
}
