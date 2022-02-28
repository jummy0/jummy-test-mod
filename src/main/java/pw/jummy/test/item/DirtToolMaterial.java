package pw.jummy.test.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class DirtToolMaterial implements ToolMaterial {
	public static final DirtToolMaterial INSTANCE = new DirtToolMaterial();
	
	@Override
	public int getMiningLevel() {
		return MiningLevels.WOOD;
	}
	
	@Override
	public int getDurability() {
		return 25;
	}
	
	@Override
	public float getMiningSpeedMultiplier() {
		return 1.4f;
	}
	
	@Override
	public float getAttackDamage() {
		return 0.0f;
	}
	
	@Override
	public int getEnchantability() {
		return 32;
	}
	
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.DIRT);
	}
}
