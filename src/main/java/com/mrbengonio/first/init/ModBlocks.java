package com.mrbengonio.first.init;

import com.mrbengonio.first.blocks.BlockGenericBlock;
import com.mrbengonio.first.handlers.CreativeTabsHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	// Register Blocks here

	// Ores

	public static final Block[] BLOCKS = {
			new BlockGenericBlock("cupalite_ore", Material.ROCK, CreativeTabsHandler.tabKreuthil, 6F, 50F, "pickaxe",
					4),
			new BlockGenericBlock("saspum_ore", Material.ROCK, CreativeTabsHandler.tabKreuthil, 6F, 50F, "pickaxe", 4),
			new BlockGenericBlock("kreuthil_ore", Material.ROCK, CreativeTabsHandler.tabKreuthil, 6F, 50F, "pickaxe",
					4),
			new BlockGenericBlock("xasmoninium_ore", Material.ROCK, CreativeTabsHandler.tabKreuthil, 6F, 50F, "pickaxe",
					4) };
	// Other Blocks
}
