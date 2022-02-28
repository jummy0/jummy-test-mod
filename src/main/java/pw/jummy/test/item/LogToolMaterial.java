package pw.jummy.test.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;

public class LogToolMaterial implements ToolMaterial {
	public static final LogToolMaterial INSTANCE = new LogToolMaterial();
	
	@Override
	public int getMiningLevel() {
		return MiningLevels.WOOD;
	}
	
	@Override
	public int getDurability() {
		return 59 * 4;
	}
	
	@Override
	public float getMiningSpeedMultiplier() {
		return 2.0f * 0.75f;
	}
	
	@Override
	public float getAttackDamage() {
		return 0.0f;
	}
	
	@Override
	public int getEnchantability() {
		return 8;
	}
	
	public Ingredient getRepairIngredient() {
		return Ingredient.fromTag(ItemTags.LOGS);
	}
}
