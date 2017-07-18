package com.mrbengonio.first.init;

import com.mrbengonio.first.blocks.BlockGenericBlock;
import com.mrbengonio.first.handlers.CreativeTabsHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Blocks {

	// Register Blocks here
	public static final Block LukasBlock = new BlockGenericBlock("lukas_block", Material.ROCK,
			CreativeTabsHandler.tabKreuthil, 5F, 15F, "pickaxe", 1);

}
