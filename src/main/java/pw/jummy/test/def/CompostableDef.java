package pw.jummy.test.def;

import net.minecraft.item.Item;

public class CompostableDef {
	private Item item;
	private float chance;
	
	public CompostableDef(Item item, float chance) {
		this.item = item;
		this.chance = chance;
	}
	
	public Item getItem() {
		return item;
	}
	
	public float getChance() {
		return chance;
	}
}
