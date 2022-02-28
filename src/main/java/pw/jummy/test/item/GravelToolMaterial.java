package pw.jummy.test.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class GravelToolMaterial implements ToolMaterial {
	public static final GravelToolMaterial INSTANCE = new GravelToolMaterial();
	
	@Override
	public int getMiningLevel() {
		return MiningLevels.STONE;
	}
	
	@Override
	public int getDurability() {
		return 59;
	}
	
	@Override
	public float getMiningSpeedMultiplier() {
		return 3.0f;
	}
	
	@Override
	public float getAttackDamage() {
		return 1.0f;
	}
	
	@Override
	public int getEnchantability() {
		return 10;
	}
	
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.GRAVEL);
	}
}
