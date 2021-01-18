package pw.jummy.test.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class DiamondBlockToolMaterial implements ToolMaterial {
	public static final DiamondBlockToolMaterial INSTANCE = new DiamondBlockToolMaterial();
	
	@Override
	public int getMiningLevel() {
		return 3;
	}
	
	@Override
	public int getDurability() {
		return 1561 * 9;
	}
	
	@Override
	public float getMiningSpeedMultiplier() {
		return 8.0f * 0.75f;
	}
	
	@Override
	public float getAttackDamage() {
		return 3.0f;
	}
	
	@Override
	public int getEnchantability() {
		return 5;
	}
	
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.DIAMOND_BLOCK);
	}
}
