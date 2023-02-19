
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimensions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.dimensions.world.features.ores.RandomLootOresFeature;
import net.mcreator.dimensions.world.features.ores.MoukiOreFeature;
import net.mcreator.dimensions.world.features.ores.LushtOreFeature;
import net.mcreator.dimensions.world.features.ores.Grass1Feature;
import net.mcreator.dimensions.DimensionsMod;

@Mod.EventBusSubscriber
public class DimensionsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, DimensionsMod.MODID);
	public static final RegistryObject<Feature<?>> LUSHT_ORE = REGISTRY.register("lusht_ore", LushtOreFeature::feature);
	public static final RegistryObject<Feature<?>> RANDOM_ORES = REGISTRY.register("random_ores", RandomLootOresFeature::feature);
	public static final RegistryObject<Feature<?>> GRASS_1 = REGISTRY.register("grass_1", Grass1Feature::feature);
	public static final RegistryObject<Feature<?>> MOUKI_ORE = REGISTRY.register("mouki_ore", MoukiOreFeature::feature);
}
