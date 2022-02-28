package pw.jummy.test.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
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
		.requiresTool());
	public static final BottleCapBlock COCA_COLA_CAP = new BottleCapBlock(FabricBlockSettings
		.of(Material.STONE, MapColor.RED)
		.nonOpaque()
		.strength(0.0f, 0.0f)
		.breakInstantly());
	public static final BottleCapBlock DR_PEPPER_CAP = new BottleCapBlock(FabricBlockSettings
		.of(Material.STONE, MapColor.RED)
		.nonOpaque()
		.strength(0.0f, 0.0f)
		.breakInstantly());
	public static final BottleCapBlock SEVENUP_CAP = new BottleCapBlock(FabricBlockSettings
		.of(Material.STONE, MapColor.RED)
		.nonOpaque()
		.strength(0.0f, 0.0f)
		.breakInstantly());
	public static final Block GREEN = new Block(FabricBlockSettings
		.of(Material.STONE, MapColor.GREEN)
		.strength(0.0f, 0.0f)
		.breakInstantly());
	public static final Block BREAKFAST_BLOCK = new Block(FabricBlockSettings
		.of(Material.STONE, MapColor.RED)
		.requiresTool()
		.strength(2.0f, 6.0f));
	public static final Block MILK_BLOCK = new Block(FabricBlockSettings
		.of(Material.ORGANIC_PRODUCT, MapColor.WHITE)
		.sounds(BlockSoundGroup.SLIME)
		.velocityMultiplier(0.8f)
		.jumpVelocityMultiplier(0.817f)
		.strength(1.0f, 1.0f));
	public static final Block DIAMOND_BLOCK_2 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.DIAMOND_BLUE)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(10.0f, 54.0f));
	public static final Block DIAMOND_BLOCK_3 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.DIAMOND_BLUE)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(15.0f, 486.0f));
	public static final Block DIAMOND_BLOCK_4 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.DIAMOND_BLUE)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(20.0f, 4374.0f));
	public static final Block DIAMOND_BLOCK_5 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.DIAMOND_BLUE)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(25.0f, 39366.0f));
	public static final Block EMERALD_BLOCK_2 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.EMERALD_GREEN)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(10.0f, 54.0f));
	public static final Block EMERALD_BLOCK_3 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.EMERALD_GREEN)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(15.0f, 486.0f));
	public static final Block EMERALD_BLOCK_4 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.EMERALD_GREEN)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(20.0f, 4374.0f));
	public static final Block EMERALD_BLOCK_5 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.EMERALD_GREEN)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(25.0f, 39366.0f));
	public static final Block GOLD_BLOCK_2 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.GOLD)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(6.0f, 54.0f));
	public static final Block GOLD_BLOCK_3 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.GOLD)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(9.0f, 486.0f));
	public static final Block GOLD_BLOCK_4 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.GOLD)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(12.0f, 4374.0f));
	public static final Block GOLD_BLOCK_5 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.GOLD)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(15.0f, 39366.0f));
	public static final Block IRON_BLOCK_2 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.IRON_GRAY)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(10.0f, 54.0f));
	public static final Block IRON_BLOCK_3 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.IRON_GRAY)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(15.0f, 486.0f));
	public static final Block IRON_BLOCK_4 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.IRON_GRAY)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(20.0f, 4374.0f));
	public static final Block IRON_BLOCK_5 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.IRON_GRAY)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(25.0f, 39366.0f));
	public static final Block REDSTONE_BLOCK_2 = new RedstoneBlock(FabricBlockSettings
		.of(Material.METAL, MapColor.BRIGHT_RED)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(10.0f, 54.0f));
	public static final Block REDSTONE_BLOCK_3 = new RedstoneBlock(FabricBlockSettings
		.of(Material.METAL, MapColor.BRIGHT_RED)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(15.0f, 486.0f));
	public static final Block REDSTONE_BLOCK_4 = new RedstoneBlock(FabricBlockSettings
		.of(Material.METAL, MapColor.BRIGHT_RED)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(20.0f, 4374.0f));
	public static final Block REDSTONE_BLOCK_5 = new RedstoneBlock(FabricBlockSettings
		.of(Material.METAL, MapColor.BRIGHT_RED)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(25.0f, 39366.0f));
	public static final Block NETHERITE_BLOCK_2 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.BLACK)
		.sounds(BlockSoundGroup.NETHERITE)
		.requiresTool()
		.strength(100.0f, 10800.0f));
	public static final Block NETHERITE_BLOCK_3 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.BLACK)
		.sounds(BlockSoundGroup.NETHERITE)
		.requiresTool()
		.strength(150.0f, 97200.0f));
	public static final Block NETHERITE_BLOCK_4 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.BLACK)
		.sounds(BlockSoundGroup.NETHERITE)
		.requiresTool()
		.strength(200.0f, 874_800.0f));
	public static final Block NETHERITE_BLOCK_5 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.BLACK)
		.sounds(BlockSoundGroup.NETHERITE)
		.requiresTool()
		.strength(250.0f, 7_873_200.0f));
	public static final Block LAPIS_BLOCK_2 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.LAPIS_BLUE)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(6.0f, 27.0f));
	public static final Block LAPIS_BLOCK_3 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.LAPIS_BLUE)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(9.0f, 243.0f));
	public static final Block LAPIS_BLOCK_4 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.LAPIS_BLUE)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(12.0f, 2187.0f));
	public static final Block LAPIS_BLOCK_5 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.LAPIS_BLUE)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(15.0f, 19683.0f));
	public static final Block COAL_BLOCK_2 = new Block(FabricBlockSettings
		.of(Material.STONE, MapColor.BLACK)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool()
		.strength(10.0f, 54.0f));
	public static final Block COAL_BLOCK_3 = new Block(FabricBlockSettings
		.of(Material.STONE, MapColor.BLACK)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(15.0f, 486.0f));
	public static final Block COAL_BLOCK_4 = new Block(FabricBlockSettings
		.of(Material.STONE, MapColor.BLACK)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool()
		.strength(20.0f, 4374.0f));
	public static final Block COAL_BLOCK_5 = new Block(FabricBlockSettings
		.of(Material.STONE, MapColor.BLACK)
		.sounds(BlockSoundGroup.STONE)
		.requiresTool()
		.strength(25.0f, 39366.0f));
	public static final Block COPPER_BLOCK_2 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.ORANGE)
		.sounds(BlockSoundGroup.COPPER)
		.requiresTool()
		.strength(6.0f, 54.0f));
	public static final Block COPPER_BLOCK_3 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.ORANGE)
		.sounds(BlockSoundGroup.COPPER)
		.requiresTool()
		.strength(9.0f, 486.0f));
	public static final Block COPPER_BLOCK_4 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.ORANGE)
		.sounds(BlockSoundGroup.COPPER)
		.requiresTool()
		.strength(12.0f, 4374.0f));
	public static final Block COPPER_BLOCK_5 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.ORANGE)
		.sounds(BlockSoundGroup.COPPER)
		.requiresTool()
		.strength(15.0f, 39366.0f));
	public static final Block EXPOSED_COPPER_2 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.TERRACOTTA_LIGHT_GRAY)
		.sounds(BlockSoundGroup.COPPER)
		.requiresTool()
		.strength(6.0f, 54.0f));
	public static final Block EXPOSED_COPPER_3 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.TERRACOTTA_LIGHT_GRAY)
		.sounds(BlockSoundGroup.COPPER)
		.requiresTool()
		.strength(9.0f, 486.0f));
	public static final Block EXPOSED_COPPER_4 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.TERRACOTTA_LIGHT_GRAY)
		.sounds(BlockSoundGroup.COPPER)
		.requiresTool()
		.strength(12.0f, 4374.0f));
	public static final Block EXPOSED_COPPER_5 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.TERRACOTTA_LIGHT_GRAY)
		.sounds(BlockSoundGroup.COPPER)
		.requiresTool()
		.strength(15.0f, 39366.0f));
	public static final Block WEATHERED_COPPER_2 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.DARK_AQUA)
		.sounds(BlockSoundGroup.COPPER)
		.requiresTool()
		.strength(6.0f, 54.0f));
	public static final Block WEATHERED_COPPER_3 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.DARK_AQUA)
		.sounds(BlockSoundGroup.COPPER)
		.requiresTool()
		.strength(9.0f, 486.0f));
	public static final Block WEATHERED_COPPER_4 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.DARK_AQUA)
		.sounds(BlockSoundGroup.COPPER)
		.requiresTool()
		.strength(12.0f, 4374.0f));
	public static final Block WEATHERED_COPPER_5 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.DARK_AQUA)
		.sounds(BlockSoundGroup.COPPER)
		.requiresTool()
		.strength(15.0f, 39366.0f));
	public static final Block OXIDIZED_COPPER_2 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.TEAL)
		.sounds(BlockSoundGroup.COPPER)
		.requiresTool()
		.strength(6.0f, 54.0f));
	public static final Block OXIDIZED_COPPER_3 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.TEAL)
		.sounds(BlockSoundGroup.COPPER)
		.requiresTool()
		.strength(9.0f, 486.0f));
	public static final Block OXIDIZED_COPPER_4 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.TEAL)
		.sounds(BlockSoundGroup.COPPER)
		.requiresTool()
		.strength(12.0f, 4374.0f));
	public static final Block OXIDIZED_COPPER_5 = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.TEAL)
		.sounds(BlockSoundGroup.COPPER)
		.requiresTool()
		.strength(15.0f, 39366.0f));
	public static final Block NETHER_REACTOR = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.BLACK)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(5.0f, 1200.0f));
	public static final Block HALF_POWERED_NETHER_REACTOR = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.RED)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(5.0f, 1200.0f));
	public static final Block POWERED_NETHER_REACTOR = new Block(FabricBlockSettings
		.of(Material.METAL, MapColor.DIAMOND_BLUE)
		.sounds(BlockSoundGroup.METAL)
		.requiresTool()
		.strength(5.0f, 1200.0f));
	public static final Block STICK_BLOCK = new Block(FabricBlockSettings
		.of(Material.WOOD, MapColor.BROWN)
		.sounds(BlockSoundGroup.WOOD)
		.strength(1.0f, 1.5f));
	public static final Block BALLS = new BallsBlock(AbstractBlock.Settings
		.of(Material.AGGREGATE)
		.strength(1.5f, 3.0f)
		.sounds(BlockSoundGroup.FUNGUS)
		.dynamicBounds());
	public static final Block CHEESE_BLOCK = new Block(FabricBlockSettings
		.of(Material.SPONGE)
		.strength(1.0f, 1.0f)
		.sounds(BlockSoundGroup.GRAVEL));
	public static final Block APPLE_BLOCK = new Block(FabricBlockSettings
		.of(Material.GOURD)
		.strength(1.0f, 1.0f)
		.sounds(BlockSoundGroup.WOOD));
	public static final Block GOLDEN_APPLE_BLOCK = new Block(FabricBlockSettings
		.of(Material.GOURD)
		.strength(3.0f, 6.0f)
		.sounds(BlockSoundGroup.WOOD));
	public static final Block ENCHANTED_GOLDEN_APPLE_BLOCK = new Block(FabricBlockSettings
		.of(Material.GOURD)
		.strength(5.0f, 9.0f)
		.sounds(BlockSoundGroup.WOOD));
	public static final Block ROTTEN_FLESH_BLOCK = new Block(FabricBlockSettings
		.of(Material.ORGANIC_PRODUCT)
		.strength(1.0f, 1.0f)
		.sounds(BlockSoundGroup.GRAVEL));
	public static final Block POTATO_BLOCK = new Block(FabricBlockSettings
		.of(Material.GOURD)
		.strength(1.0f, 1.0f)
		.sounds(BlockSoundGroup.WOOD));
	public static final Block POISONOUS_POTATO_BLOCK = new Block(FabricBlockSettings
		.of(Material.GOURD)
		.strength(1.0f, 1.0f)
		.sounds(BlockSoundGroup.WOOD));
	public static final Block CARROT_BLOCK = new Block(FabricBlockSettings
		.of(Material.GOURD)
		.strength(1.0f, 1.0f)
		.sounds(BlockSoundGroup.WOOD));
	public static final Block BEETROOT_BLOCK = new Block(FabricBlockSettings
		.of(Material.GOURD)
		.strength(1.0f, 1.0f)
		.sounds(BlockSoundGroup.WOOD));
	public static final Block WHEAT_SEED_BLOCK = new Block(FabricBlockSettings
		.of(Material.MOSS_BLOCK)
		.strength(1.0f, 1.0f)
		.sounds(BlockSoundGroup.GRASS));
	public static final Block GLISTERING_MELON_BLOCK = new Block(FabricBlockSettings
		.of(Material.GOURD)
		.strength(3.0f, 6.0f)
		.sounds(BlockSoundGroup.WOOD));
	public static final Block GOLDEN_CARROT_BLOCK = new Block(FabricBlockSettings
		.of(Material.GOURD)
		.strength(3.0f, 6.0f)
		.sounds(BlockSoundGroup.WOOD));
	public static final Block SECRET_CHEESE_BLOCK = new Block(FabricBlockSettings
		.of(Material.SPONGE)
		.strength(1.0f, 2.0f)
		.sounds(BlockSoundGroup.GRAVEL)
		.noCollision()
		.nonOpaque());

}
