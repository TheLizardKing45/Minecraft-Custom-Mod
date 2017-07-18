package com.mrbengonio.first.init;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register( ) {
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.obsidianingot), "NNN", 
																		     "NNN",
																		     "NNN", '')
	}

}
