package pw.jummy.test.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class GoldBlockToolMaterial implements ToolMaterial {
	public static final GoldBlockToolMaterial INSTANCE = new GoldBlockToolMaterial();
	
	@Override
	public int getMiningLevel() {
		return MiningLevels.WOOD;
	}
	
	@Override
	public int getDurability() {
		return 32 * 9;
	}
	
	@Override
	public float getMiningSpeedMultiplier() {
		return 12.0f * 0.75f;
	}
	
	@Override
	public float getAttackDamage() {
		return 0.0f;
	}
	
	@Override
	public int getEnchantability() {
		return 11;
	}
	
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.GOLD_BLOCK);
	}
}
