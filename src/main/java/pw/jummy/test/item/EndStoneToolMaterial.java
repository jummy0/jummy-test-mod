package pw.jummy.test.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EndStoneToolMaterial implements ToolMaterial {
	public static final EndStoneToolMaterial INSTANCE = new EndStoneToolMaterial();
	
	@Override
	public int getMiningLevel() {
		return MiningLevels.STONE;
	}
	
	@Override
	public int getDurability() {
		return 131;
	}
	
	@Override
	public float getMiningSpeedMultiplier() {
		return 8.0f;
	}
	
	@Override
	public float getAttackDamage() {
		return 1.0f;
	}
	
	@Override
	public int getEnchantability() {
		return 8;
	}
	
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.END_STONE);
	}
}
