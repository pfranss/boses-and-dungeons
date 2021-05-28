
package net.mcreator.bossesanddungeons.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.bossesanddungeons.itemgroup.BossesanddungeonsItemGroup;
import net.mcreator.bossesanddungeons.BossesAndDungeonsModElements;

@BossesAndDungeonsModElements.ModElement.Tag
public class LightsaberItem extends BossesAndDungeonsModElements.ModElement {
	@ObjectHolder("bosses_and_dungeons:lightsaber")
	public static final Item block = null;
	public LightsaberItem(BossesAndDungeonsModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 3000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 4.5f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.4000000000000001f, new Item.Properties().group(BossesanddungeonsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("lightsaber"));
	}
}
