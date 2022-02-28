package pw.jummy.test.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class IronBlockToolMaterial implements ToolMaterial {
	public static final IronBlockToolMaterial INSTANCE = new IronBlockToolMaterial();
	
	@Override
	public int getMiningLevel() {
		return MiningLevels.IRON;
	}
	
	@Override
	public int getDurability() {
		return 250 * 9;
	}
	
	@Override
	public float getMiningSpeedMultiplier() {
		return 6.0f * 0.75f;
	}
	
	@Override
	public float getAttackDamage() {
		return 2.0f;
	}
	
	@Override
	public int getEnchantability() {
		return 7;
	}
	
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.IRON_BLOCK);
	}
}
