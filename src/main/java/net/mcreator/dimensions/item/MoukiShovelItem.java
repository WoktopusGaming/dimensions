
package net.mcreator.dimensions.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.dimensions.init.DimensionsModItems;

public class MoukiShovelItem extends ShovelItem {
	public MoukiShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 183;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 11;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DimensionsModItems.MOUKI_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
