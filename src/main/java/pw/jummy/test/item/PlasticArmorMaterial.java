package pw.jummy.test.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class PlasticArmorMaterial implements ArmorMaterial {
	public static final PlasticArmorMaterial INSTANCE = new PlasticArmorMaterial();
	
	private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
	private static final int[] PROTECTION_VALUES = new int[] {1, 1, 1, 1};
 
	@Override
	public int getDurability(EquipmentSlot slot) {
		return BASE_DURABILITY[slot.getEntitySlotId()] * 9;
	}
 
	@Override
	public int getProtectionAmount(EquipmentSlot slot) {
		return PROTECTION_VALUES[slot.getEntitySlotId()];
	}
 
	@Override
	public int getEnchantability() {
		return 5;
	}
 
	@Override
	public SoundEvent getEquipSound() {
		return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
	}
 
	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(CustomItems.PLASTIC);
	}
 
	@Override
	public String getName() {
		return "plastic";
	}
 
	@Override
	public float getToughness() {
		return 0.0F;
	}
 
	@Override
	public float getKnockbackResistance() {
		return 0F;
	}
}