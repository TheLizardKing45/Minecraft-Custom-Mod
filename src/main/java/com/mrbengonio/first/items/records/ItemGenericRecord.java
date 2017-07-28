package com.mrbengonio.first.items.records;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.SoundEvent;

public class ItemGenericRecord extends ItemRecordBase {

	public ItemGenericRecord(String name, CreativeTabs tab, SoundEvent sound) {
		super(name, sound);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);

	}

}
