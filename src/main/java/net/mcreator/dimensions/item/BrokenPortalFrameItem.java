
package net.mcreator.dimensions.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.dimensions.init.DimensionsModTabs;

import java.util.List;

public class BrokenPortalFrameItem extends Item {
	public BrokenPortalFrameItem() {
		super(new Item.Properties().tab(DimensionsModTabs.TAB_DIMENSIONS_MATERIALS).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Nothing but a broken portal frame"));
	}
}
