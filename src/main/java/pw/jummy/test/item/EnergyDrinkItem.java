package pw.jummy.test.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.UseAction;

public class EnergyDrinkItem extends Item {
	public EnergyDrinkItem(Item.Settings settings) {
		super(settings);
	}
   
	public UseAction getUseAction(ItemStack stack) {
		return UseAction.DRINK;
	}
}
