package pw.jummy.test.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.RedstoneBlock;
import net.minecraft.sound.BlockSoundGroup;

public class CustomBlocks {
	public static final Block FUNNEL_CAKE = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.GRAY)
			.nonOpaque()
			.strength(3.0f, 4.8f)
			.requiresTool()
			);
	public static final BottleCapBlock COCA_COLA_CAP = new BottleCapBlock(FabricBlockSettings
			.of(Material.STONE, MapColor.RED)
			.nonOpaque()
			.strength(0.0f, 0.0f)
			.breakInstantly()
			);
	public static final BottleCapBlock DR_PEPPER_CAP = new BottleCapBlock(FabricBlockSettings
			.of(Material.STONE, MapColor.RED)
			.nonOpaque()
			.strength(0.0f, 0.0f)
			.breakInstantly()
			);
	public static final BottleCapBlock SEVENUP_CAP = new BottleCapBlock(FabricBlockSettings
			.of(Material.STONE, MapColor.RED)
			.nonOpaque()
			.strength(0.0f, 0.0f)
			.breakInstantly()
			);
	public static final Block GREEN = new Block(FabricBlockSettings
			.of(Material.STONE, MapColor.GREEN)
			.strength(0.0f, 0.0f)
			.breakInstantly()
			);
	public static final Block BREAKFAST_BLOCK = new Block(FabricBlockSettings
			.of(Material.STONE, MapColor.RED)
			.requiresTool()
			.strength(2.0f, 6.0f)
			);
	public static final Block MILK_BLOCK = new Block(FabricBlockSettings
			.of(Material.ORGANIC_PRODUCT, MapColor.WHITE)
			.sounds(BlockSoundGroup.SLIME)
			.velocityMultiplier(0.8f)
			.jumpVelocityMultiplier(0.817f)
			.strength(1.0f, 1.0f)
			);
	public static final Block DIAMOND_BLOCK_2 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.DIAMOND_BLUE)
			.breakByTool(FabricToolTags.PICKAXES, 2) // iron
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(10.0f, 54.0f)
			);
	public static final Block DIAMOND_BLOCK_3 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.DIAMOND_BLUE)
			.breakByTool(FabricToolTags.PICKAXES, 2) // iron
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(15.0f, 486.0f)
			);
	public static final Block DIAMOND_BLOCK_4 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.DIAMOND_BLUE)
			.breakByTool(FabricToolTags.PICKAXES, 2) // iron
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(20.0f, 4374.0f)
			);
	public static final Block DIAMOND_BLOCK_5 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.DIAMOND_BLUE)
			.breakByTool(FabricToolTags.PICKAXES, 2) // iron
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(25.0f, 39366.0f)
			);
	public static final Block EMERALD_BLOCK_2 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.EMERALD_GREEN)
			.breakByTool(FabricToolTags.PICKAXES, 2) // iron
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(10.0f, 54.0f)
			);
	public static final Block EMERALD_BLOCK_3 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.EMERALD_GREEN)
			.breakByTool(FabricToolTags.PICKAXES, 2) // iron
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(15.0f, 486.0f)
			);
	public static final Block EMERALD_BLOCK_4 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.EMERALD_GREEN)
			.breakByTool(FabricToolTags.PICKAXES, 2) // iron
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(20.0f, 4374.0f)
			);
	public static final Block EMERALD_BLOCK_5 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.EMERALD_GREEN)
			.breakByTool(FabricToolTags.PICKAXES, 2) // iron
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(25.0f, 39366.0f)
			);
	public static final Block GOLD_BLOCK_2 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.GOLD)
			.breakByTool(FabricToolTags.PICKAXES, 2) // iron
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(6.0f, 54.0f)
			);
	public static final Block GOLD_BLOCK_3 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.GOLD)
			.breakByTool(FabricToolTags.PICKAXES, 2) // iron
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(9.0f, 486.0f)
			);
	public static final Block GOLD_BLOCK_4 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.GOLD)
			.breakByTool(FabricToolTags.PICKAXES, 2) // iron
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(12.0f, 4374.0f)
			);
	public static final Block GOLD_BLOCK_5 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.GOLD)
			.breakByTool(FabricToolTags.PICKAXES, 2) // iron
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(15.0f, 39366.0f)
			);
	public static final Block IRON_BLOCK_2 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.IRON_GRAY)
			.breakByTool(FabricToolTags.PICKAXES, 1) // stone
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(10.0f, 54.0f)
			);
	public static final Block IRON_BLOCK_3 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.IRON_GRAY)
			.breakByTool(FabricToolTags.PICKAXES, 1) // stone
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(15.0f, 486.0f)
			);
	public static final Block IRON_BLOCK_4 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.IRON_GRAY)
			.breakByTool(FabricToolTags.PICKAXES, 1) // stone
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(20.0f, 4374.0f)
			);
	public static final Block IRON_BLOCK_5 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.IRON_GRAY)
			.breakByTool(FabricToolTags.PICKAXES, 1) // stone
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(25.0f, 39366.0f)
			);
	public static final Block REDSTONE_BLOCK_2 = new RedstoneBlock(FabricBlockSettings
			.of(Material.METAL, MapColor.BRIGHT_RED)
			.breakByTool(FabricToolTags.PICKAXES, 2) // iron
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(10.0f, 54.0f)
			);
	public static final Block REDSTONE_BLOCK_3 = new RedstoneBlock(FabricBlockSettings
			.of(Material.METAL, MapColor.BRIGHT_RED)
			.breakByTool(FabricToolTags.PICKAXES, 2) // iron
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(15.0f, 486.0f)
			);
	public static final Block REDSTONE_BLOCK_4 = new RedstoneBlock(FabricBlockSettings
			.of(Material.METAL, MapColor.BRIGHT_RED)
			.breakByTool(FabricToolTags.PICKAXES, 2) // iron
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(20.0f, 4374.0f)
			);
	public static final Block REDSTONE_BLOCK_5 = new RedstoneBlock(FabricBlockSettings
			.of(Material.METAL, MapColor.BRIGHT_RED)
			.breakByTool(FabricToolTags.PICKAXES, 2) // iron
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(25.0f, 39366.0f)
			);
	public static final Block NETHERITE_BLOCK_2 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.BLACK)
			.breakByTool(FabricToolTags.PICKAXES, 3) // diamond
			.sounds(BlockSoundGroup.NETHERITE)
			.requiresTool()
			.strength(100.0f, 10800.0f)
			);
	public static final Block NETHERITE_BLOCK_3 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.BLACK)
			.breakByTool(FabricToolTags.PICKAXES, 3) // diamond
			.sounds(BlockSoundGroup.NETHERITE)
			.requiresTool()
			.strength(150.0f, 97200.0f)
			);
	public static final Block NETHERITE_BLOCK_4 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.BLACK)
			.breakByTool(FabricToolTags.PICKAXES, 3) // diamond
			.sounds(BlockSoundGroup.NETHERITE)
			.requiresTool()
			.strength(200.0f, 874_800.0f)
			);
	public static final Block NETHERITE_BLOCK_5 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.BLACK)
			.breakByTool(FabricToolTags.PICKAXES, 3) // diamond
			.sounds(BlockSoundGroup.NETHERITE)
			.requiresTool()
			.strength(250.0f, 7_873_200.0f)
			);
	public static final Block LAPIS_BLOCK_2 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.LAPIS_BLUE)
			.breakByTool(FabricToolTags.PICKAXES, 1) // stone
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(6.0f, 27.0f)
			);
	public static final Block LAPIS_BLOCK_3 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.LAPIS_BLUE)
			.breakByTool(FabricToolTags.PICKAXES, 1) // stone
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(9.0f, 243.0f)
			);
	public static final Block LAPIS_BLOCK_4 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.LAPIS_BLUE)
			.breakByTool(FabricToolTags.PICKAXES, 1) // stone
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(12.0f, 2187.0f)
			);
	public static final Block LAPIS_BLOCK_5 = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.LAPIS_BLUE)
			.breakByTool(FabricToolTags.PICKAXES, 1) // stone
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(15.0f, 19683.0f)
			);
	public static final Block COAL_BLOCK_2 = new Block(FabricBlockSettings
			.of(Material.STONE, MapColor.BLACK)
			.sounds(BlockSoundGroup.STONE)
			.requiresTool()
			.strength(10.0f, 54.0f)
			);
	public static final Block COAL_BLOCK_3 = new Block(FabricBlockSettings
			.of(Material.STONE, MapColor.BLACK)
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(15.0f, 486.0f)
			);
	public static final Block COAL_BLOCK_4 = new Block(FabricBlockSettings
			.of(Material.STONE, MapColor.BLACK)
			.sounds(BlockSoundGroup.STONE)
			.requiresTool()
			.strength(20.0f, 4374.0f)
			);
	public static final Block COAL_BLOCK_5 = new Block(FabricBlockSettings
			.of(Material.STONE, MapColor.BLACK)
			.sounds(BlockSoundGroup.STONE)
			.requiresTool()
			.strength(25.0f, 39366.0f)
			);
	public static final Block NETHER_REACTOR = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.BLACK)
			.breakByTool(FabricToolTags.PICKAXES, 3) // diamond
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(5.0f, 1200.0f)
			);
	public static final Block HALF_POWERED_NETHER_REACTOR = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.RED)
			.breakByTool(FabricToolTags.PICKAXES, 3) // diamond
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(5.0f, 1200.0f)
			);
	public static final Block POWERED_NETHER_REACTOR = new Block(FabricBlockSettings
			.of(Material.METAL, MapColor.DIAMOND_BLUE)
			.breakByTool(FabricToolTags.PICKAXES, 3) // diamond
			.sounds(BlockSoundGroup.METAL)
			.requiresTool()
			.strength(5.0f, 1200.0f)
			);
}
