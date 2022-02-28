package pw.jummy.test.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class BedrockToolMaterial implements ToolMaterial {
	public static final BedrockToolMaterial INSTANCE = new BedrockToolMaterial();
	
	@Override
	public int getMiningLevel() {
		return MiningLevels.NETHERITE;
	}
	
	@Override
	public int getDurability() {
		return 65535;
	}
	
	@Override
	public float getMiningSpeedMultiplier() {
		return 1.0f;
	}
	
	@Override
	public float getAttackDamage() {
		return 1.0f;
	}
	
	@Override
	public int getEnchantability() {
		return 1;
	}
	
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.BEDROCK);
	}
}
