package com.mrbengonio.first.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemGenericAxe extends ItemAxe {

	public ItemGenericAxe(String name, CreativeTabs tab, ToolMaterial material) {
		super(material, material.getDamageVsEntity(), material.getEfficiencyOnProperMaterial());
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
	}

}
