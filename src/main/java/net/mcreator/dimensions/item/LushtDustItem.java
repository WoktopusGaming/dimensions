
package net.mcreator.dimensions.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.dimensions.init.DimensionsModTabs;

public class LushtDustItem extends Item {
	public LushtDustItem() {
		super(new Item.Properties().tab(DimensionsModTabs.TAB_DIMENSIONS_MATERIALS).stacksTo(64).rarity(Rarity.COMMON));
	}
}
