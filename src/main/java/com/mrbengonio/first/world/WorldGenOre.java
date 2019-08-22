package com.mrbengonio.first.world;

import java.util.Random;

import com.google.common.base.Predicate;
import com.mrbengonio.first.init.ModBlocks;

import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.AbstractChunkProvider;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenOre implements IWorldGenerator {

	private void genSurface(World world, Random random, int chunkX, int chunkZ) {

		addOreSpawn(ModBlocks.BLOCKS.get("ore_kreuthil").getDefaultState(), world, random, chunkX, chunkZ, 16, 12,
				1 + random.nextInt(3), 13, 1, 10, BlockMatcher.forBlock(Blocks.STONE));

		addOreSpawn(ModBlocks.BLOCKS.get("ore_cupalite").getDefaultState(), world, random, chunkX, chunkZ, 16, 16,
				2 + random.nextInt(8), 12, 16, 32, BlockMatcher.forBlock(Blocks.STONE));

		addOreSpawn(ModBlocks.BLOCKS.get("ore_saspum").getDefaultState(), world, random, chunkX, chunkZ, 16, 16, 4, 20,
				100, 200, BlockMatcher.forBlock(Blocks.STONE));

		addOreSpawn(ModBlocks.BLOCKS.get("ore_xasmoninium").getDefaultState(), world, random, chunkX, chunkZ, 16, 16,
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

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, ChunkGenerator chunkGenerator,
			AbstractChunkProvider chunkProvider) {
		switch (world.getDimension().getType().getId()) {
		case 0:
			genSurface(world, random, chunkX * 16, chunkZ * 16);
			break;
		
	}

}
