package pw.jummy.test.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class NetheriteBlockToolMaterial implements ToolMaterial {
	public static final NetheriteBlockToolMaterial INSTANCE = new NetheriteBlockToolMaterial();
	
	@Override
	public int getMiningLevel() {
		return MiningLevels.NETHERITE;
	}
	
	@Override
	public int getDurability() {
		return 2031 * 9;
	}
	
	@Override
	public float getMiningSpeedMultiplier() {
		return 9.0f * 0.75f;
	}
	
	@Override
	public float getAttackDamage() {
		return 4.0f;
	}
	
	@Override
	public int getEnchantability() {
		return 8;
	}
	
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.NETHERITE_BLOCK);
	}
}
