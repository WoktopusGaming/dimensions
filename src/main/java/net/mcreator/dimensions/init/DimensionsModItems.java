
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimensions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.dimensions.item.Packed_EmeraldSwordItem;
import net.mcreator.dimensions.item.Packed_EmeraldShovelItem;
import net.mcreator.dimensions.item.Packed_EmeraldPickaxeItem;
import net.mcreator.dimensions.item.Packed_EmeraldHoeItem;
import net.mcreator.dimensions.item.Packed_EmeraldAxeItem;
import net.mcreator.dimensions.item.OverworldIgniterItem;
import net.mcreator.dimensions.item.NetherIgniterItem;
import net.mcreator.dimensions.item.MoukiSwordItem;
import net.mcreator.dimensions.item.MoukiShovelItem;
import net.mcreator.dimensions.item.MoukiPickaxeItem;
import net.mcreator.dimensions.item.MoukiIngotItem;
import net.mcreator.dimensions.item.MoukiHoeItem;
import net.mcreator.dimensions.item.MoukiAxeItem;
import net.mcreator.dimensions.item.MoukiArmorItem;
import net.mcreator.dimensions.item.LushtSwordItem;
import net.mcreator.dimensions.item.LushtShovelItem;
import net.mcreator.dimensions.item.LushtPickaxeItem;
import net.mcreator.dimensions.item.LushtHoeItem;
import net.mcreator.dimensions.item.LushtDustItem;
import net.mcreator.dimensions.item.LushtAxeItem;
import net.mcreator.dimensions.item.LushtArmorItem;
import net.mcreator.dimensions.item.HeartofOverworldItem;
import net.mcreator.dimensions.item.HeartofNetherItem;
import net.mcreator.dimensions.item.HeartofFirstDimensionItem;
import net.mcreator.dimensions.item.EmerarmorArmorItem;
import net.mcreator.dimensions.item.Dimension1IgniterItem;
import net.mcreator.dimensions.item.BrokenPortalFrameItem;
import net.mcreator.dimensions.DimensionsMod;

public class DimensionsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DimensionsMod.MODID);
	public static final RegistryObject<Item> LUSHT_DUST = REGISTRY.register("lusht_dust", () -> new LushtDustItem());
	public static final RegistryObject<Item> LUSHT_ORE = block(DimensionsModBlocks.LUSHT_ORE, DimensionsModTabs.TAB_DIMENSIONS_ORES);
	public static final RegistryObject<Item> LUSHT_BLOCK = block(DimensionsModBlocks.LUSHT_BLOCK, DimensionsModTabs.TAB_DIMENSIONS_ORES);
	public static final RegistryObject<Item> LUSHT_PICKAXE = REGISTRY.register("lusht_pickaxe", () -> new LushtPickaxeItem());
	public static final RegistryObject<Item> LUSHT_AXE = REGISTRY.register("lusht_axe", () -> new LushtAxeItem());
	public static final RegistryObject<Item> LUSHT_SWORD = REGISTRY.register("lusht_sword", () -> new LushtSwordItem());
	public static final RegistryObject<Item> LUSHT_SHOVEL = REGISTRY.register("lusht_shovel", () -> new LushtShovelItem());
	public static final RegistryObject<Item> LUSHT_HOE = REGISTRY.register("lusht_hoe", () -> new LushtHoeItem());
	public static final RegistryObject<Item> LUSHT_ARMOR_HELMET = REGISTRY.register("lusht_armor_helmet", () -> new LushtArmorItem.Helmet());
	public static final RegistryObject<Item> LUSHT_ARMOR_CHESTPLATE = REGISTRY.register("lusht_armor_chestplate",
			() -> new LushtArmorItem.Chestplate());
	public static final RegistryObject<Item> LUSHT_ARMOR_LEGGINGS = REGISTRY.register("lusht_armor_leggings", () -> new LushtArmorItem.Leggings());
	public static final RegistryObject<Item> LUSHT_ARMOR_BOOTS = REGISTRY.register("lusht_armor_boots", () -> new LushtArmorItem.Boots());
	public static final RegistryObject<Item> RANDOM_ORES = block(DimensionsModBlocks.RANDOM_ORES, DimensionsModTabs.TAB_DIMENSIONS_ORES);
	public static final RegistryObject<Item> MOUKI_WOOD = block(DimensionsModBlocks.MOUKI_WOOD, DimensionsModTabs.TAB_DIMENSIONS_ORES);
	public static final RegistryObject<Item> MOUKI_LOG = block(DimensionsModBlocks.MOUKI_LOG, DimensionsModTabs.TAB_DIMENSIONS_ORES);
	public static final RegistryObject<Item> MOUKI_PLANKS = block(DimensionsModBlocks.MOUKI_PLANKS, DimensionsModTabs.TAB_DIMENSIONS_ORES);
	public static final RegistryObject<Item> MOUKI_LEAVES = block(DimensionsModBlocks.MOUKI_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MOUKI_STAIRS = block(DimensionsModBlocks.MOUKI_STAIRS, DimensionsModTabs.TAB_DIMENSIONS_ORES);
	public static final RegistryObject<Item> MOUKI_SLAB = block(DimensionsModBlocks.MOUKI_SLAB, DimensionsModTabs.TAB_DIMENSIONS_ORES);
	public static final RegistryObject<Item> MOUKI_FENCE = block(DimensionsModBlocks.MOUKI_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MOUKI_FENCE_GATE = block(DimensionsModBlocks.MOUKI_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> MOUKI_PRESSURE_PLATE = block(DimensionsModBlocks.MOUKI_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> MOUKI_BUTTON = block(DimensionsModBlocks.MOUKI_BUTTON, DimensionsModTabs.TAB_DIMENSIONS_ORES);
	public static final RegistryObject<Item> PACKED_EMERALD_PICKAXE = REGISTRY.register("packed_emerald_pickaxe",
			() -> new Packed_EmeraldPickaxeItem());
	public static final RegistryObject<Item> PACKED_EMERALD_AXE = REGISTRY.register("packed_emerald_axe", () -> new Packed_EmeraldAxeItem());
	public static final RegistryObject<Item> PACKED_EMERALD_SWORD = REGISTRY.register("packed_emerald_sword", () -> new Packed_EmeraldSwordItem());
	public static final RegistryObject<Item> PACKED_EMERALD_SHOVEL = REGISTRY.register("packed_emerald_shovel", () -> new Packed_EmeraldShovelItem());
	public static final RegistryObject<Item> PACKED_EMERALD_HOE = REGISTRY.register("packed_emerald_hoe", () -> new Packed_EmeraldHoeItem());
	public static final RegistryObject<Item> GRASS_1 = block(DimensionsModBlocks.GRASS_1, DimensionsModTabs.TAB_DIMENSIONS_ORES);
	public static final RegistryObject<Item> MOUKI_INGOT = REGISTRY.register("mouki_ingot", () -> new MoukiIngotItem());
	public static final RegistryObject<Item> MOUKI_ORE = block(DimensionsModBlocks.MOUKI_ORE, DimensionsModTabs.TAB_DIMENSIONS_ORES);
	public static final RegistryObject<Item> MOUKI_BLOCK = block(DimensionsModBlocks.MOUKI_BLOCK, DimensionsModTabs.TAB_DIMENSIONS_ORES);
	public static final RegistryObject<Item> MOUKI_PICKAXE = REGISTRY.register("mouki_pickaxe", () -> new MoukiPickaxeItem());
	public static final RegistryObject<Item> MOUKI_AXE = REGISTRY.register("mouki_axe", () -> new MoukiAxeItem());
	public static final RegistryObject<Item> MOUKI_SWORD = REGISTRY.register("mouki_sword", () -> new MoukiSwordItem());
	public static final RegistryObject<Item> MOUKI_SHOVEL = REGISTRY.register("mouki_shovel", () -> new MoukiShovelItem());
	public static final RegistryObject<Item> MOUKI_HOE = REGISTRY.register("mouki_hoe", () -> new MoukiHoeItem());
	public static final RegistryObject<Item> MOUKI_ARMOR_HELMET = REGISTRY.register("mouki_armor_helmet", () -> new MoukiArmorItem.Helmet());
	public static final RegistryObject<Item> MOUKI_ARMOR_CHESTPLATE = REGISTRY.register("mouki_armor_chestplate",
			() -> new MoukiArmorItem.Chestplate());
	public static final RegistryObject<Item> MOUKI_ARMOR_LEGGINGS = REGISTRY.register("mouki_armor_leggings", () -> new MoukiArmorItem.Leggings());
	public static final RegistryObject<Item> MOUKI_ARMOR_BOOTS = REGISTRY.register("mouki_armor_boots", () -> new MoukiArmorItem.Boots());
	public static final RegistryObject<Item> EMERARMOR_ARMOR_HELMET = REGISTRY.register("emerarmor_armor_helmet",
			() -> new EmerarmorArmorItem.Helmet());
	public static final RegistryObject<Item> EMERARMOR_ARMOR_CHESTPLATE = REGISTRY.register("emerarmor_armor_chestplate",
			() -> new EmerarmorArmorItem.Chestplate());
	public static final RegistryObject<Item> EMERARMOR_ARMOR_LEGGINGS = REGISTRY.register("emerarmor_armor_leggings",
			() -> new EmerarmorArmorItem.Leggings());
	public static final RegistryObject<Item> EMERARMOR_ARMOR_BOOTS = REGISTRY.register("emerarmor_armor_boots", () -> new EmerarmorArmorItem.Boots());
	public static final RegistryObject<Item> BLUEWOOD_WOOD = block(DimensionsModBlocks.BLUEWOOD_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLUEWOOD_LOG = block(DimensionsModBlocks.BLUEWOOD_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLUEWOOD_PLANKS = block(DimensionsModBlocks.BLUEWOOD_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLUEWOOD_LEAVES = block(DimensionsModBlocks.BLUEWOOD_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BLUEWOOD_STAIRS = block(DimensionsModBlocks.BLUEWOOD_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLUEWOOD_SLAB = block(DimensionsModBlocks.BLUEWOOD_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> BLUEWOOD_FENCE = block(DimensionsModBlocks.BLUEWOOD_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> BLUEWOOD_FENCE_GATE = block(DimensionsModBlocks.BLUEWOOD_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> BLUEWOOD_PRESSURE_PLATE = block(DimensionsModBlocks.BLUEWOOD_PRESSURE_PLATE,
			CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> BLUEWOOD_BUTTON = block(DimensionsModBlocks.BLUEWOOD_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TELEPORT_BLOCK = block(DimensionsModBlocks.TELEPORT_BLOCK, DimensionsModTabs.TAB_DIMENSIONS_ORES);
	public static final RegistryObject<Item> DIMENSION_1_IGNITER = REGISTRY.register("dimension_1_igniter", () -> new Dimension1IgniterItem());
	public static final RegistryObject<Item> OVERWORLD_IGNITER = REGISTRY.register("overworld_igniter", () -> new OverworldIgniterItem());
	public static final RegistryObject<Item> NETHER_IGNITER = REGISTRY.register("nether_igniter", () -> new NetherIgniterItem());
	public static final RegistryObject<Item> FLAMEWOOD_WOOD = block(DimensionsModBlocks.FLAMEWOOD_WOOD, DimensionsModTabs.TAB_DIMENSIONS_ORES);
	public static final RegistryObject<Item> FLAMEWOOD_LOG = block(DimensionsModBlocks.FLAMEWOOD_LOG, DimensionsModTabs.TAB_DIMENSIONS_ORES);
	public static final RegistryObject<Item> FLAMEWOOD_PLANKS = block(DimensionsModBlocks.FLAMEWOOD_PLANKS, DimensionsModTabs.TAB_DIMENSIONS_ORES);
	public static final RegistryObject<Item> FLAMEWOOD_LEAVES = block(DimensionsModBlocks.FLAMEWOOD_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> FLAMEWOOD_STAIRS = block(DimensionsModBlocks.FLAMEWOOD_STAIRS, DimensionsModTabs.TAB_DIMENSIONS_ORES);
	public static final RegistryObject<Item> FLAMEWOOD_SLAB = block(DimensionsModBlocks.FLAMEWOOD_SLAB, DimensionsModTabs.TAB_DIMENSIONS_ORES);
	public static final RegistryObject<Item> FLAMEWOOD_FENCE = block(DimensionsModBlocks.FLAMEWOOD_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> FLAMEWOOD_FENCE_GATE = block(DimensionsModBlocks.FLAMEWOOD_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> FLAMEWOOD_PRESSURE_PLATE = block(DimensionsModBlocks.FLAMEWOOD_PRESSURE_PLATE,
			CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> FLAMEWOOD_BUTTON = block(DimensionsModBlocks.FLAMEWOOD_BUTTON, DimensionsModTabs.TAB_DIMENSIONS_ORES);
	public static final RegistryObject<Item> HEARTOF_NETHER = REGISTRY.register("heartof_nether", () -> new HeartofNetherItem());
	public static final RegistryObject<Item> HEARTOF_OVERWORLD = REGISTRY.register("heartof_overworld", () -> new HeartofOverworldItem());
	public static final RegistryObject<Item> HEARTOF_FIRST_DIMENSION = REGISTRY.register("heartof_first_dimension",
			() -> new HeartofFirstDimensionItem());
	public static final RegistryObject<Item> BROKEN_PORTAL_FRAME = REGISTRY.register("broken_portal_frame", () -> new BrokenPortalFrameItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
