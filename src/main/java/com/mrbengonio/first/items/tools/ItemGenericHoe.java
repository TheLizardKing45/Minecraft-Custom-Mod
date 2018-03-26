package com.mrbengonio.first.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class ItemGenericHoe extends ItemHoe {

	public ItemGenericHoe(String name, CreativeTabs tab, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
	}

}
