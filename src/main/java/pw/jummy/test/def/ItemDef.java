package pw.jummy.test.def;

import net.minecraft.item.Item;

public class ItemDef {
	private String key;
	private Item item;
	
	public ItemDef(String key, Item item) {
		this.key = key;
		this.item = item;
	}
	
	public String getKey() {
		return key;
	}
	
	public Item getItem() {
		return item;
	}
}
