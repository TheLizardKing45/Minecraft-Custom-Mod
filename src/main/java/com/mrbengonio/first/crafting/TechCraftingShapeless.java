package com.mrbengonio.first.crafting;

import java.util.List;
import java.util.Random;

import com.mrbengonio.first.First;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.nbt.NBTTagCompound;

public class TechCraftingShapeless extends ShapelessRecipes {

	public TechCraftingShapeless(ItemStack output, List<ItemStack> inputList) {
		super(output, inputList);
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
					First.LOGGER.info("Added item for quality, quality: " + quality + ", number: " + number);
				}
			}
		}
		average = (quality / number);

		First.LOGGER.info("Average: " + average);
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
