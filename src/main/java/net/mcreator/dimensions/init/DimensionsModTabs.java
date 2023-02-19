
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dimensions.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DimensionsModTabs {
	public static CreativeModeTab TAB_DIMENSIONS_ORES;
	public static CreativeModeTab TAB_DIMENSIONS_TOOLS;
	public static CreativeModeTab TAB_DIMENSIONS_MATERIALS;

	public static void load() {
		TAB_DIMENSIONS_ORES = new CreativeModeTab("tabdimensions_ores") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DimensionsModBlocks.GRASS_1.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_DIMENSIONS_TOOLS = new CreativeModeTab("tabdimensions_tools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DimensionsModItems.PACKED_EMERALD_SWORD.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_DIMENSIONS_MATERIALS = new CreativeModeTab("tabdimensions_materials") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DimensionsModItems.LUSHT_DUST.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
