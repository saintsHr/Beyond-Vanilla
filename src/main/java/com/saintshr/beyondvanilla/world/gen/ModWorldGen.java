package com.saintshr.beyondvanilla.world.gen;

import java.util.Random;

import com.saintshr.beyondvanilla.init.ModBlocks;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator {
	private final WorldGenMinable tutorialOverworldGen;

	public static final int TITANIUM_VEIN_SIZE  = 10;
	public static final int TITANIUM_RARITY     = 10;
	public static final int TITANIUM_MAX_HEIGHT = 32;
	public static final int TITANIUM_MIN_HEIGHT = 0;

	public ModWorldGen() {
		tutorialOverworldGen = new WorldGenMinable(
			ModBlocks.TITANIUM_ORE_BLOCK.getDefaultState(),
			TITANIUM_VEIN_SIZE,
			BlockMatcher.forBlock(Blocks.STONE)
		);
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimensionType()) {
			case NETHER:
				break;
			case OVERWORLD:
				genStandard(
					tutorialOverworldGen,
					world,
					random,
					chunkX,
					chunkZ,
					TITANIUM_RARITY,
					TITANIUM_MIN_HEIGHT,
					TITANIUM_MAX_HEIGHT
				);
				break;
			case THE_END:
				break;
		}
	}

	private void genStandard(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int spawnTries, int minHeight, int maxHeight) {
		if(minHeight < 0) minHeight = 0;
		if(maxHeight > 255) maxHeight = 255;
	
		if(maxHeight < minHeight) {
			int i = minHeight;
			minHeight = maxHeight;
			maxHeight = i;
		} else if(maxHeight == minHeight) {
			if(maxHeight < 255) {
				maxHeight++;
			} else minHeight--;
		}
	
		BlockPos chunkPosAsBlockPos = new BlockPos(chunkX << 4, 0, chunkZ << 4);
		int heightDiff = maxHeight - minHeight + 1;
	
		for (int i = 0; i < spawnTries; i++) {
			generator.generate(world, random, 
				chunkPosAsBlockPos.add(
					random.nextInt(16),
					minHeight + random.nextInt(heightDiff),
					random.nextInt(16)
				)
			);
		}
	}
}
