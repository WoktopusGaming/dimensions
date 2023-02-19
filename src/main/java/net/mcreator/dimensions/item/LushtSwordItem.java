
package net.mcreator.dimensions.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.dimensions.init.DimensionsModTabs;
import net.mcreator.dimensions.init.DimensionsModItems;

public class LushtSwordItem extends SwordItem {
	public LushtSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1164;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 16f;
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
		}, 3, -3f, new Item.Properties().tab(DimensionsModTabs.TAB_DIMENSIONS_TOOLS));
	}
}
