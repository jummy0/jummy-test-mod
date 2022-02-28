package pw.jummy.test.def;

import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;

public class BlockItemDef extends BlockDef {
	private ItemGroup itemGroup;
	
	public BlockItemDef(String key, Block block) {
		super(key, block);
		this.itemGroup = ItemGroup.MISC;
	}
	
	public BlockItemDef(String key, Block block, ItemGroup itemGroup) {
		super(key, block);
		this.itemGroup = itemGroup;
	}
	
	public ItemGroup getItemGroup() {
		return itemGroup;
	}
}
