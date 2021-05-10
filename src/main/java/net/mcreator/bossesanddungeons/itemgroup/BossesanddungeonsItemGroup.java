
package net.mcreator.bossesanddungeons.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.bossesanddungeons.item.SuperSaberItem;
import net.mcreator.bossesanddungeons.BossesAndDungeonsModElements;

@BossesAndDungeonsModElements.ModElement.Tag
public class BossesanddungeonsItemGroup extends BossesAndDungeonsModElements.ModElement {
	public BossesanddungeonsItemGroup(BossesAndDungeonsModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabbossesanddungeons") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SuperSaberItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
