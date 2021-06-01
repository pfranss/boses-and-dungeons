
package net.mcreator.bossesanddungeons.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.bossesanddungeons.itemgroup.BossesanddungeonsItemGroup;
import net.mcreator.bossesanddungeons.BossesAndDungeonsModElements;

@BossesAndDungeonsModElements.ModElement.Tag
public class PoisonousdaggerItem extends BossesAndDungeonsModElements.ModElement {
	@ObjectHolder("bosses_and_dungeons:poisonousdagger")
	public static final Item block = null;
	public PoisonousdaggerItem(BossesAndDungeonsModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SpidertoothItem.block, (int) (1)));
			}
		}, 3, -2.0999999999999999f, new Item.Properties().group(BossesanddungeonsItemGroup.tab)) {
		}.setRegistryName("poisonousdagger"));
	}
}
