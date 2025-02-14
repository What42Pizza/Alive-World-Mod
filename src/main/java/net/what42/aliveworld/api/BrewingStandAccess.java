package net.what42.aliveworld.api;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.BlockState;
import net.what42.aliveworld.simulator.BrewingSimulator;

public interface BrewingStandAccess {
	BrewingSimulator createSimulator();
	void apply(World world, BlockPos pos, BlockState state, BrewingSimulator simulator);
}
