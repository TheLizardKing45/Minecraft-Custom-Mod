package com.mrbengonio.first.items;

import java.util.List;
import java.util.Random;

import net.minecraft.client.resources.I18n;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemTechIngot extends ItemBase {

	int MaxQuality;

	public ItemTechIngot(String name, CreativeTabs tab, int maxSize, int maxQuality) {
		super(name, tab, maxSize);
		MaxQuality = maxQuality;
	}

	int Quality;

	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected) {
		NBTTagCompound nbt;

		// Setup tag compound on the item
		if (!stack.hasTagCompound()) {

			EntityPlayer player = (EntityPlayer) entity;
			int stackSize = stack.getCount() - 1;

			// If the itemstack is larger than 1, delete extra items!
			if (stack.getCount() > 1) {
				stack.splitStack(stackSize);
			}

			// chooses a random item quality!
			Random rn = new Random();
			nbt = new NBTTagCompound();
			// Set NBT Quality data
			nbt.setInteger("Quality", rn.nextInt(MaxQuality) + 1);
			nbt.setInteger("MaxQuality", MaxQuality);
			stack.setTagCompound(nbt);

			// re-adds the deleted items as a new itemstack!
			if (!player.inventory.addItemStackToInventory(new ItemStack(stack.getItem(), stackSize))) {
				// spawns item drop if inventory is full
				if (!world.isRemote)
					player.entityDropItem(new ItemStack(stack.getItem(), stackSize), 0F);
			}

		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> lores, boolean advanced) {
		if (stack.hasTagCompound() && stack.getTagCompound().hasKey("Quality")
				&& stack.getTagCompound().getInteger("MaxQuality") > 0) {
			lores.add(I18n.format("lore.quality.QUALITY") + ": "
					+ Integer.toString(stack.getTagCompound().getInteger("Quality")) + "/"
					+ Integer.toString(stack.getTagCompound().getInteger("MaxQuality")));
		} else {
			lores.add(I18n.format("lore.quality.QUALITY") + ": " + I18n.format("lore.quality.UNKNOWN"));
		}
	}

}
