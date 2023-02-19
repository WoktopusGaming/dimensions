
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimensions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.dimensions.block.TeleportBlockBlock;
import net.mcreator.dimensions.block.RandomLootOresBlock;
import net.mcreator.dimensions.block.MoukiWoodBlock;
import net.mcreator.dimensions.block.MoukiStairsBlock;
import net.mcreator.dimensions.block.MoukiSlabBlock;
import net.mcreator.dimensions.block.MoukiPressurePlateBlock;
import net.mcreator.dimensions.block.MoukiPlanksBlock;
import net.mcreator.dimensions.block.MoukiOreBlock;
import net.mcreator.dimensions.block.MoukiLogBlock;
import net.mcreator.dimensions.block.MoukiLeavesBlock;
import net.mcreator.dimensions.block.MoukiFenceGateBlock;
import net.mcreator.dimensions.block.MoukiFenceBlock;
import net.mcreator.dimensions.block.MoukiButtonBlock;
import net.mcreator.dimensions.block.MoukiBlockBlock;
import net.mcreator.dimensions.block.LushtOreBlock;
import net.mcreator.dimensions.block.LushtBlockBlock;
import net.mcreator.dimensions.block.Grass1Block;
import net.mcreator.dimensions.block.FlamewoodWoodBlock;
import net.mcreator.dimensions.block.FlamewoodStairsBlock;
import net.mcreator.dimensions.block.FlamewoodSlabBlock;
import net.mcreator.dimensions.block.FlamewoodPressurePlateBlock;
import net.mcreator.dimensions.block.FlamewoodPlanksBlock;
import net.mcreator.dimensions.block.FlamewoodLogBlock;
import net.mcreator.dimensions.block.FlamewoodLeavesBlock;
import net.mcreator.dimensions.block.FlamewoodFenceGateBlock;
import net.mcreator.dimensions.block.FlamewoodFenceBlock;
import net.mcreator.dimensions.block.FlamewoodButtonBlock;
import net.mcreator.dimensions.block.BluewoodWoodBlock;
import net.mcreator.dimensions.block.BluewoodStairsBlock;
import net.mcreator.dimensions.block.BluewoodSlabBlock;
import net.mcreator.dimensions.block.BluewoodPressurePlateBlock;
import net.mcreator.dimensions.block.BluewoodPlanksBlock;
import net.mcreator.dimensions.block.BluewoodLogBlock;
import net.mcreator.dimensions.block.BluewoodLeavesBlock;
import net.mcreator.dimensions.block.BluewoodFenceGateBlock;
import net.mcreator.dimensions.block.BluewoodFenceBlock;
import net.mcreator.dimensions.block.BluewoodButtonBlock;
import net.mcreator.dimensions.DimensionsMod;

public class DimensionsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DimensionsMod.MODID);
	public static final RegistryObject<Block> LUSHT_ORE = REGISTRY.register("lusht_ore", () -> new LushtOreBlock());
	public static final RegistryObject<Block> LUSHT_BLOCK = REGISTRY.register("lusht_block", () -> new LushtBlockBlock());
	public static final RegistryObject<Block> RANDOM_ORES = REGISTRY.register("random_ores", () -> new RandomLootOresBlock());
	public static final RegistryObject<Block> MOUKI_WOOD = REGISTRY.register("mouki_wood", () -> new MoukiWoodBlock());
	public static final RegistryObject<Block> MOUKI_LOG = REGISTRY.register("mouki_log", () -> new MoukiLogBlock());
	public static final RegistryObject<Block> MOUKI_PLANKS = REGISTRY.register("mouki_planks", () -> new MoukiPlanksBlock());
	public static final RegistryObject<Block> MOUKI_LEAVES = REGISTRY.register("mouki_leaves", () -> new MoukiLeavesBlock());
	public static final RegistryObject<Block> MOUKI_STAIRS = REGISTRY.register("mouki_stairs", () -> new MoukiStairsBlock());
	public static final RegistryObject<Block> MOUKI_SLAB = REGISTRY.register("mouki_slab", () -> new MoukiSlabBlock());
	public static final RegistryObject<Block> MOUKI_FENCE = REGISTRY.register("mouki_fence", () -> new MoukiFenceBlock());
	public static final RegistryObject<Block> MOUKI_FENCE_GATE = REGISTRY.register("mouki_fence_gate", () -> new MoukiFenceGateBlock());
	public static final RegistryObject<Block> MOUKI_PRESSURE_PLATE = REGISTRY.register("mouki_pressure_plate", () -> new MoukiPressurePlateBlock());
	public static final RegistryObject<Block> MOUKI_BUTTON = REGISTRY.register("mouki_button", () -> new MoukiButtonBlock());
	public static final RegistryObject<Block> GRASS_1 = REGISTRY.register("grass_1", () -> new Grass1Block());
	public static final RegistryObject<Block> MOUKI_ORE = REGISTRY.register("mouki_ore", () -> new MoukiOreBlock());
	public static final RegistryObject<Block> MOUKI_BLOCK = REGISTRY.register("mouki_block", () -> new MoukiBlockBlock());
	public static final RegistryObject<Block> BLUEWOOD_WOOD = REGISTRY.register("bluewood_wood", () -> new BluewoodWoodBlock());
	public static final RegistryObject<Block> BLUEWOOD_LOG = REGISTRY.register("bluewood_log", () -> new BluewoodLogBlock());
	public static final RegistryObject<Block> BLUEWOOD_PLANKS = REGISTRY.register("bluewood_planks", () -> new BluewoodPlanksBlock());
	public static final RegistryObject<Block> BLUEWOOD_LEAVES = REGISTRY.register("bluewood_leaves", () -> new BluewoodLeavesBlock());
	public static final RegistryObject<Block> BLUEWOOD_STAIRS = REGISTRY.register("bluewood_stairs", () -> new BluewoodStairsBlock());
	public static final RegistryObject<Block> BLUEWOOD_SLAB = REGISTRY.register("bluewood_slab", () -> new BluewoodSlabBlock());
	public static final RegistryObject<Block> BLUEWOOD_FENCE = REGISTRY.register("bluewood_fence", () -> new BluewoodFenceBlock());
	public static final RegistryObject<Block> BLUEWOOD_FENCE_GATE = REGISTRY.register("bluewood_fence_gate", () -> new BluewoodFenceGateBlock());
	public static final RegistryObject<Block> BLUEWOOD_PRESSURE_PLATE = REGISTRY.register("bluewood_pressure_plate",
			() -> new BluewoodPressurePlateBlock());
	public static final RegistryObject<Block> BLUEWOOD_BUTTON = REGISTRY.register("bluewood_button", () -> new BluewoodButtonBlock());
	public static final RegistryObject<Block> TELEPORT_BLOCK = REGISTRY.register("teleport_block", () -> new TeleportBlockBlock());
	public static final RegistryObject<Block> FLAMEWOOD_WOOD = REGISTRY.register("flamewood_wood", () -> new FlamewoodWoodBlock());
	public static final RegistryObject<Block> FLAMEWOOD_LOG = REGISTRY.register("flamewood_log", () -> new FlamewoodLogBlock());
	public static final RegistryObject<Block> FLAMEWOOD_PLANKS = REGISTRY.register("flamewood_planks", () -> new FlamewoodPlanksBlock());
	public static final RegistryObject<Block> FLAMEWOOD_LEAVES = REGISTRY.register("flamewood_leaves", () -> new FlamewoodLeavesBlock());
	public static final RegistryObject<Block> FLAMEWOOD_STAIRS = REGISTRY.register("flamewood_stairs", () -> new FlamewoodStairsBlock());
	public static final RegistryObject<Block> FLAMEWOOD_SLAB = REGISTRY.register("flamewood_slab", () -> new FlamewoodSlabBlock());
	public static final RegistryObject<Block> FLAMEWOOD_FENCE = REGISTRY.register("flamewood_fence", () -> new FlamewoodFenceBlock());
	public static final RegistryObject<Block> FLAMEWOOD_FENCE_GATE = REGISTRY.register("flamewood_fence_gate", () -> new FlamewoodFenceGateBlock());
	public static final RegistryObject<Block> FLAMEWOOD_PRESSURE_PLATE = REGISTRY.register("flamewood_pressure_plate",
			() -> new FlamewoodPressurePlateBlock());
	public static final RegistryObject<Block> FLAMEWOOD_BUTTON = REGISTRY.register("flamewood_button", () -> new FlamewoodButtonBlock());
}
