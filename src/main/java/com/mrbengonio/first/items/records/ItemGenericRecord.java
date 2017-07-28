package com.mrbengonio.first.items.records;

import com.mrbengonio.first.Reference;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemGenericRecord extends ItemRecord {

	public final String title;

	public ItemGenericRecord(String name, SoundEvent song, String title, String author) {
		super(title, song);
		this.title = author + " - " + title;
		setUnlocalizedName(name);
		setRegistryName(name);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getRecordNameLocal() {
		return title;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ResourceLocation getRecordResource(String name) {
		return new ResourceLocation(Reference.MOD_ID, name);
	}

}
