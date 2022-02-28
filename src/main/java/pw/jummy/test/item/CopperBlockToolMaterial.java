package pw.jummy.test.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CopperBlockToolMaterial implements ToolMaterial {
	public static final CopperBlockToolMaterial INSTANCE = new CopperBlockToolMaterial();
	
	@Override
	public int getMiningLevel() {
		return MiningLevels.STONE;
	}
	
	@Override
	public int getDurability() {
		return 200 * 9;
	}
	
	@Override
	public float getMiningSpeedMultiplier() {
		return 5.0f * 0.75f;
	}
	
	@Override
	public float getAttackDamage() {
		return 1.0f;
	}
	
	@Override
	public int getEnchantability() {
		return 4;
	}
	
	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.COPPER_BLOCK);
	}
}
