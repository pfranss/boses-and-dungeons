
package net.mcreator.bossesanddungeons.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.block.Blocks;

import net.mcreator.bossesanddungeons.itemgroup.BossesanddungeonsItemGroup;
import net.mcreator.bossesanddungeons.BossesAndDungeonsModElements;

@BossesAndDungeonsModElements.ModElement.Tag
public class BamboostaffItem extends BossesAndDungeonsModElements.ModElement {
	@ObjectHolder("bosses_and_dungeons:bamboostaff")
	public static final Item block = null;
	public BamboostaffItem(BossesAndDungeonsModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1000;
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
				return Ingredient.fromStacks(new ItemStack(Blocks.BAMBOO, (int) (1)));
			}
		}, 3, -2f, new Item.Properties().group(BossesanddungeonsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("bamboostaff"));
	}
}
