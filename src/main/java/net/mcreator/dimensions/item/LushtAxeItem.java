
package net.mcreator.dimensions.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.dimensions.init.DimensionsModTabs;
import net.mcreator.dimensions.init.DimensionsModItems;

public class LushtAxeItem extends AxeItem {
	public LushtAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1164;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 25f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 42;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DimensionsModItems.LUSHT_DUST.get()));
			}
		}, 1, -3f, new Item.Properties().tab(DimensionsModTabs.TAB_DIMENSIONS_TOOLS));
	}
}
