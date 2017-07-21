package com.mrbengonio.first.handlers;

import com.mrbengonio.first.init.ModBlocks;
import com.mrbengonio.first.init.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingHandler {

	public static void RegisterCrafting() {

	}

	public static void RegisterSmelting() {
		// Ores
		GameRegistry.addSmelting(ModBlocks.cupaliteOre, new ItemStack(ModItems.cupaliteingot), 1.0F);
		GameRegistry.addSmelting(ModBlocks.kreuthilOre, new ItemStack(ModItems.kreuthilingot), 1.0F);
		GameRegistry.addSmelting(ModBlocks.saspumOre, new ItemStack(ModItems.saspumingot), 1.0F);
		GameRegistry.addSmelting(ModBlocks.xasmoOre, new ItemStack(ModItems.xasmoingot), 1.0F);
	}

}
