package pw.jummy.test.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AirToolMaterial implements ToolMaterial {
	public static final AirToolMaterial INSTANCE = new AirToolMaterial();
	
	@Override
	public int getMiningLevel() {
		return MiningLevels.WOOD;
	}
	
	@Override
	public int getDurability() {
		return 6;
	}
	
	@Override
	public float getMiningSpeedMultiplier() {
		return 1.0f;
	}
	
	@Override
	public float getAttackDamage() {
		return 0.0f;
	}
	
	@Override
	public int getEnchantability() {
		return 1;
	}
	
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(CustomItems.AIR);
	}
}
