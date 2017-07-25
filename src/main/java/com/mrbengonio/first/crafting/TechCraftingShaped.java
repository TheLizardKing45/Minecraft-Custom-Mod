package com.mrbengonio.first.crafting;

import java.util.Random;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.nbt.NBTTagCompound;

public class TechCraftingShaped extends ShapedRecipes {

	public TechCraftingShaped(int width, int height, ItemStack[] ingredientsIn, ItemStack output) {
		super(width, height, ingredientsIn, output);
	}

	@Override
	public ItemStack getCraftingResult(InventoryCrafting inv) {
		ItemStack result = super.getRecipeOutput().copy();
		NBTTagCompound nbt = new NBTTagCompound();

		int number = 0, quality = 0, average = 0;

		for (int j = 0; j < inv.getSizeInventory(); ++j) {
			ItemStack item = inv.getStackInSlot(j);
			if (!item.isEmpty()) {
				if (item.hasTagCompound() && item.getTagCompound().hasKey("Quality")) {
					number++;
					quality += item.getTagCompound().getInteger("Quality");
				}
			}
		}
		if (number != 0)
			average = (quality / number);
		else
			average = 0;

		if (!result.hasTagCompound()) {
			Random rn = new Random();
			// Set NBT Quality data
			nbt.setInteger("Quality", average);
			nbt.setInteger("MaxQuality", 5);
			result.setTagCompound(nbt);
		}

		return result;
	}

}
