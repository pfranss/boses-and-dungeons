
package net.mcreator.bossesanddungeons.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.bossesanddungeons.BossesAndDungeonsModElements;

@BossesAndDungeonsModElements.ModElement.Tag
public class SuperSaberItem extends BossesAndDungeonsModElements.ModElement {
	@ObjectHolder("bosses_and_dungeons:super_saber")
	public static final Item block = null;
	public SuperSaberItem(BossesAndDungeonsModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2053;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 7.5f;
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
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
		}.setRegistryName("super_saber"));
	}
}
