package pw.jummy.test.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ThisIsNotAGlitchItem extends Item {
	public ThisIsNotAGlitchItem(Item.Settings settings) {
		super(settings);
	}
	
	public int getMaxUseTime(ItemStack stack) {
		return 1;
	}
}
