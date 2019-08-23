package com.mrbengonio.first.items;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemTechIngot extends ItemBase {

	int MaxQuality;

	public ItemTechIngot(String name, ItemGroup tab, int maxSize, int maxQuality) {
		super(name, tab, maxSize);
		MaxQuality = maxQuality;
	}

	int Quality;

	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		CompoundNBT nbt;

		// Setup tag compound on the item
		if (!stack.hasTag()) {

			PlayerEntity player = (PlayerEntity) entityIn;
			int stackSize = stack.getCount() - 1;

			// If the itemstack is larger than 1, delete extra items!
			if (stack.getCount() > 1) {
				stack.split(stackSize);
			}

			// chooses a random item quality!
			Random rn = new Random();
			nbt = new CompoundNBT();
			// Set NBT Quality data
			nbt.putFloat("Quality", rn.nextInt(MaxQuality) + 1);
			nbt.putInt("MaxQuality", MaxQuality);
			stack.setTag(nbt);

			// re-adds the deleted items as a new itemstack!
			if (!player.inventory.addItemStackToInventory(new ItemStack(stack.getItem(), stackSize))) {
				// spawns item drop if inventory is full
				if (!worldIn.isRemote)
					player.entityDropItem(new ItemStack(stack.getItem(), stackSize), 0F);
			}

		}
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip,
			ITooltipFlag flagIn) {
		if (stack.hasTag() && stack.getTag().hasUniqueId("Quality") && stack.getTag().getInt("MaxQuality") > 0) {
			NumberFormat nf = new DecimalFormat("##.###");

			tooltip.add(new TranslationTextComponent("lore.quality.QUALITY")
					.appendText(": " + nf.format(stack.getTag().getFloat("Quality")) + "/"
							+ Integer.toString(stack.getTag().getInt("MaxQuality"))));
		} else {
			tooltip.add(new TranslationTextComponent("lore.quality.QUALITY").appendText(": ")
					.appendSibling(new TranslationTextComponent("lore.quality.UNKNOWN")));
		}
	}

}
