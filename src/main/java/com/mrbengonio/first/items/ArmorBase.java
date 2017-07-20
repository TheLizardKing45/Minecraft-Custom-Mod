package com.mrbengonio.first.items;

import com.mrbengonio.first.handlers.CreativeTabsHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor {
	public ArmorBase(String name, ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlot) {
		this(name, CreativeTabsHandler.tabKreuthil, material, renderIndex, equipmentSlot);
	}

	public ArmorBase(String name, CreativeTabs tab, ArmorMaterial material, int renderIndex,
			EntityEquipmentSlot equipmentSlot) {
		super(material, renderIndex, equipmentSlot);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
	}
}
