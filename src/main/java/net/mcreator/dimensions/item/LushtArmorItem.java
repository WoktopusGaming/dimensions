
package net.mcreator.dimensions.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.dimensions.init.DimensionsModTabs;
import net.mcreator.dimensions.init.DimensionsModItems;

public abstract class LushtArmorItem extends ArmorItem {
	public LushtArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 45;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{6, 18, 15, 6}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 27;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DimensionsModItems.LUSHT_DUST.get()));
			}

			@Override
			public String getName() {
				return "lusht_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends LushtArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(DimensionsModTabs.TAB_DIMENSIONS_ORES));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dimensions:textures/models/armor/lusht_layer_1.png";
		}
	}

	public static class Chestplate extends LushtArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(DimensionsModTabs.TAB_DIMENSIONS_ORES));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dimensions:textures/models/armor/lusht_layer_1.png";
		}
	}

	public static class Leggings extends LushtArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(DimensionsModTabs.TAB_DIMENSIONS_ORES));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dimensions:textures/models/armor/lusht_layer_2.png";
		}
	}

	public static class Boots extends LushtArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(DimensionsModTabs.TAB_DIMENSIONS_ORES));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "dimensions:textures/models/armor/lusht_layer_1.png";
		}
	}
}
