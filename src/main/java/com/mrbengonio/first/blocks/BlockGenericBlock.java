package com.mrbengonio.first.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;

public class BlockGenericBlock extends BlockBase {
	public BlockGenericBlock(String name, Material mat, ItemGroup tab, float hardness, float resistance, ToolType tool,
			int harvest) {

		super(name, mat, tab, hardness, resistance, 0, tool, harvest);
	}

}
