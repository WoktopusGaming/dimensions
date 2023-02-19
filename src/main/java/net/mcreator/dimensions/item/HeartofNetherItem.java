
package net.mcreator.dimensions.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.dimensions.init.DimensionsModTabs;

import java.util.List;

public class HeartofNetherItem extends Item {
	public HeartofNetherItem() {
		super(new Item.Properties().tab(DimensionsModTabs.TAB_DIMENSIONS_MATERIALS).stacksTo(64).rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("A heart of Nether, used for portal frames for the Teleport Block."));
	}
}
