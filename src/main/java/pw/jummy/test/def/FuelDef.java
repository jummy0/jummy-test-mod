package pw.jummy.test.def;

import net.minecraft.item.Item;

public class FuelDef {
	private Item item;
	private int ticks;
	
	public FuelDef(Item item, int ticks) {
		this.item = item;
		this.ticks = ticks;
	}
	
	public Item getItem() {
		return item;
	}
	
	public int getTicks() {
		return ticks;
	}
}
