package com.mrbengonio.first.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemGenericArmor extends ItemArmor {
	public ItemGenericArmor(String name, CreativeTabs tab, ArmorMaterial material, int renderIndex,
			EntityEquipmentSlot equipmentSlot) {
		super(material, renderIndex, equipmentSlot);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
	}
}
