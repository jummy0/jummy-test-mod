package pw.jummy.test.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ObsidianToolMaterial implements ToolMaterial {
	public static final ObsidianToolMaterial INSTANCE = new ObsidianToolMaterial();

	@Override
	public int getMiningLevel() {
		return MiningLevels.STONE;
	}

	@Override
	public int getDurability() {
		return 3592;
	}

	@Override
	public float getMiningSpeedMultiplier() {
		return 6.0f;
	}

	@Override
	public float getAttackDamage() {
		return 1.0f;
	}

	@Override
	public int getEnchantability() {
		return 5;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.OBSIDIAN);
	}
}
