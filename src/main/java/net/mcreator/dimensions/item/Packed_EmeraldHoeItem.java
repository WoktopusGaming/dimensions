
package net.mcreator.dimensions.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.dimensions.init.DimensionsModTabs;

public class Packed_EmeraldHoeItem extends HoeItem {
	public Packed_EmeraldHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 427;
			}

			public float getSpeed() {
				return 13f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 7;
			}

			public int getEnchantmentValue() {
				return 49;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.EMERALD));
			}
		}, 0, -3f, new Item.Properties().tab(DimensionsModTabs.TAB_DIMENSIONS_TOOLS));
	}
}
