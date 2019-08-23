package com.mrbengonio.first.items.records;

import com.mrbengonio.first.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemGenericRecord extends MusicDiscItem {

	public final String title;

	public ItemGenericRecord(String name, SoundEvent song, String title, String author) {
		super(0, song, new Item.Properties().maxStackSize(1));
		this.title = author + " - " + title;
		setRegistryName(name);
	}

	// public ItemGenericRecord(int comparatorValueIn, SoundEvent soundIn,
	// Item.Properties builder) {
	// super(comparatorValueIn, soundIn, builder);
	// }

	@OnlyIn(Dist.CLIENT)
	public ResourceLocation getRecordResource(String name) {
		return new ResourceLocation(Reference.MOD_ID, name);
	}

}
