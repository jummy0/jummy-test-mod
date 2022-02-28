package pw.jummy.test.def;

import net.minecraft.block.Block;

public class FlammableDef {
	private Block block;
	private int burn;
	private int spread;
	
	public FlammableDef(Block block, int burn, int spread) {
		this.block = block;
		this.burn = burn;
		this.spread = spread;
	}
	
	public Block getBlock() {
		return block;
	}
	
	public int getBurn() {
		return burn;
	}
	
	public int getSpread() {
		return spread;
	}
}
