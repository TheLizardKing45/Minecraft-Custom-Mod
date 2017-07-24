package com.mrbengonio.first.world;

import java.util.Random;

import com.google.common.base.Predicate;
import com.mrbengonio.first.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenOre implements IWorldGenerator {

	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
		case 0:
			genSurface(world, random, chunkX * 16, chunkZ * 16);
			break;
		}
	}

	private void genSurface(World world, Random random, int chunkX, int chunkZ) {
		// Block.getdefaultstate(), world, random, chunkX, chunkZ, maxVeinSize,
		// chanceToSpawn, miny, maxy, spawninblock

		addOreSpawn(ModBlocks.kreuthilOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 12,
				1 + random.nextInt(3), 13, 1, 10, BlockMatcher.forBlock(Blocks.STONE));

		addOreSpawn(ModBlocks.cupaliteOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,
				2 + random.nextInt(8), 12, 16, 32, BlockMatcher.forBlock(Blocks.STONE));

		addOreSpawn(ModBlocks.saspumOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, 20, 100, 200,
				BlockMatcher.forBlock(Blocks.STONE));

		addOreSpawn(ModBlocks.xasmoOre.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,
				1 + (random.nextInt(5)), 20, 32, 50, BlockMatcher.forBlock(Blocks.STONE));

	}

	private void addOreSpawn(IBlockState block, World world, Random random, int blockXPos, int BlockZPos, int maxX,
			int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY, Predicate<IBlockState> blockToSpawnIn) {
		for (int i = 0; i < chanceToSpawn; i++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = BlockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, maxVeinSize, blockToSpawnIn)).generate(world, random,
					new BlockPos(posX, posY, posZ));
		}
	}

}
