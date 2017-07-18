package com.mrbengonio.first.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGenericBlock extends BlockBase {
	public BlockGenericBlock(String name, Material mat, CreativeTabs tab, float hardness, float resistance, String tool,
			int harvest) {
		super(name, mat, tab, hardness, resistance, tool, harvest);
	}

}
