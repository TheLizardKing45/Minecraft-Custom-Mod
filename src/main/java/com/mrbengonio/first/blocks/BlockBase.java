package com.mrbengonio.first.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;

public class BlockBase extends Block {

	public BlockBase(String name, Material mat, ItemGroup tab, float hardness, float resistance) {
		this(name, mat, tab, hardness, resistance, 0);

	}

	public BlockBase(String name, Material mat, ItemGroup tab, float hardness, float resistance, int light) {

		this(name, tab, Properties.create(mat).hardnessAndResistance(hardness, resistance).lightValue(light));
	}

	public BlockBase(String name, Material mat, ItemGroup tab, float hardness, float resistance, int light,
			ToolType tool, int harvest) {

		this(name, tab, Properties.create(mat).hardnessAndResistance(hardness, resistance).lightValue(light)
				.harvestTool(tool).harvestLevel(harvest));
	}

	public BlockBase(String name, ItemGroup tab, Properties props) {
		super(props);
		setRegistryName(name);
	}
}
