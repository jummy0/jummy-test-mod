package pw.jummy.test.def;

import net.minecraft.block.Block;

public class BlockDef {
	private String key;
	private Block block;
	
	public BlockDef(String key, Block block) {
		this.key = key;
		this.block = block;
	}
	
	public String getKey() {
		return key;
	}
	
	public Block getBlock() {
		return block;
	}
}
