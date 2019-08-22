package com.mrbengonio.first.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
	public ItemBase(String name, ItemGroup tab) {
		this(name, tab, 64);

	}

	public ItemBase(String name, ItemGroup tab, int maxSize) {
		super(new Item.Properties().group(tab).maxStackSize(maxSize));
		setRegistryName(name);
	}

}
