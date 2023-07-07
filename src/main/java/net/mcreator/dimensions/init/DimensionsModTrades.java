
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.dimensions.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class DimensionsModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 12), new ItemStack(DimensionsModItems.LUSHT_DUST.get(), 2), new ItemStack(DimensionsModItems.LUSHT_SWORD.get()), 10, 25, 0.2f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 6), new ItemStack(DimensionsModItems.LUSHT_DUST.get(), 4), new ItemStack(DimensionsModItems.LUSHT_PICKAXE.get()), 6, 25, 0.1f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8), new ItemStack(DimensionsModItems.LUSHT_DUST.get(), 6), new ItemStack(DimensionsModItems.LUSHT_AXE.get()), 6, 15, 0.5f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 6), new ItemStack(DimensionsModItems.LUSHT_DUST.get(), 3), new ItemStack(DimensionsModItems.LUSHT_SHOVEL.get()), 6, 15, 0.6f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10), new ItemStack(DimensionsModItems.LUSHT_DUST.get(), 5), new ItemStack(DimensionsModItems.LUSHT_HOE.get()), 8, 10, 0.05f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8), new ItemStack(DimensionsModBlocks.RANDOM_ORES.get()), new ItemStack(DimensionsModItems.LUSHT_ARMOR_HELMET.get()), 5, 15, 1f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 12), new ItemStack(DimensionsModBlocks.RANDOM_ORES.get(), 2), new ItemStack(DimensionsModItems.LUSHT_ARMOR_CHESTPLATE.get()), 5, 15, 1f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 14), new ItemStack(DimensionsModBlocks.RANDOM_ORES.get(), 4), new ItemStack(DimensionsModItems.LUSHT_ARMOR_LEGGINGS.get()), 5, 20, 1f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 12), new ItemStack(DimensionsModBlocks.RANDOM_ORES.get(), 2), new ItemStack(DimensionsModItems.LUSHT_ARMOR_BOOTS.get()), 5, 15, 1f));
		}
	}
}
