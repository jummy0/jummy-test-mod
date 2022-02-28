package pw.jummy.test.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CopperToolMaterial implements ToolMaterial {
	public static final CopperToolMaterial INSTANCE = new CopperToolMaterial();
	
	@Override
	public int getMiningLevel() {
		return MiningLevels.STONE;
	}
	
	@Override
	public int getDurability() {
		return 200;
	}
	
	@Override
	public float getMiningSpeedMultiplier() {
		return 5.0f;
	}
	
	@Override
	public float getAttackDamage() {
		return 1.0f;
	}
	
	@Override
	public int getEnchantability() {
		return 9;
	}
	
	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.COPPER_INGOT);
	}
}
