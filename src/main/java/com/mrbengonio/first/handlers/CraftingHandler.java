package com.mrbengonio.first.handlers;

import com.mrbengonio.first.init.Blocks;
import com.mrbengonio.first.init.Items;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingHandler {

	public static void RegisterCrafting() {

	}

	public static void RegisterSmelting() {
		// Ores
		GameRegistry.addSmelting(Blocks.cupaliteOre, new ItemStack(Items.cupaliteingot), 1.0F);
		GameRegistry.addSmelting(Blocks.kreuthilOre, new ItemStack(Items.kreuthilingot), 1.0F);
		GameRegistry.addSmelting(Blocks.saspumOre, new ItemStack(Items.saspumingot), 1.0F);
		GameRegistry.addSmelting(Blocks.xasmoOre, new ItemStack(Items.xasmoingot), 1.0F);
	}

}
