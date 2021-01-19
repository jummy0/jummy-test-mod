package pw.jummy.test;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import pw.jummy.test.block.CustomBlocks;
import pw.jummy.test.item.CustomItems;
import pw.jummy.test.item.MiscDescItem;

public class JummyTestMod implements ModInitializer {
	@Override
	public void onInitialize() {
		// blocks
		
		Registry.register(Registry.BLOCK, new Identifier("jummy", "7up_cap"), CustomBlocks.SEVENUP_CAP);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "breakfast_block"), CustomBlocks.BREAKFAST_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "coca_cola_cap"), CustomBlocks.COCA_COLA_CAP);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "dr_pepper_cap"), CustomBlocks.DR_PEPPER_CAP);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "funnel_cake"), CustomBlocks.FUNNEL_CAKE);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "green"), CustomBlocks.GREEN);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "milk_block"), CustomBlocks.MILK_BLOCK);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "coal_block_2"), CustomBlocks.COAL_BLOCK_2);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "coal_block_3"), CustomBlocks.COAL_BLOCK_3);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "coal_block_4"), CustomBlocks.COAL_BLOCK_4);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "coal_block_5"), CustomBlocks.COAL_BLOCK_5);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "diamond_block_2"), CustomBlocks.DIAMOND_BLOCK_2);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "diamond_block_3"), CustomBlocks.DIAMOND_BLOCK_3);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "diamond_block_4"), CustomBlocks.DIAMOND_BLOCK_4);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "diamond_block_5"), CustomBlocks.DIAMOND_BLOCK_5);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "emerald_block_2"), CustomBlocks.EMERALD_BLOCK_2);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "emerald_block_3"), CustomBlocks.EMERALD_BLOCK_3);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "emerald_block_4"), CustomBlocks.EMERALD_BLOCK_4);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "emerald_block_5"), CustomBlocks.EMERALD_BLOCK_5);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "gold_block_2"), CustomBlocks.GOLD_BLOCK_2);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "gold_block_3"), CustomBlocks.GOLD_BLOCK_3);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "gold_block_4"), CustomBlocks.GOLD_BLOCK_4);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "gold_block_5"), CustomBlocks.GOLD_BLOCK_5);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "iron_block_2"), CustomBlocks.IRON_BLOCK_2);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "iron_block_3"), CustomBlocks.IRON_BLOCK_3);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "iron_block_4"), CustomBlocks.IRON_BLOCK_4);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "iron_block_5"), CustomBlocks.IRON_BLOCK_5);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "lapis_block_2"), CustomBlocks.LAPIS_BLOCK_2);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "lapis_block_3"), CustomBlocks.LAPIS_BLOCK_3);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "lapis_block_4"), CustomBlocks.LAPIS_BLOCK_4);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "lapis_block_5"), CustomBlocks.LAPIS_BLOCK_5);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "netherite_block_2"), CustomBlocks.NETHERITE_BLOCK_2);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "netherite_block_3"), CustomBlocks.NETHERITE_BLOCK_3);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "netherite_block_4"), CustomBlocks.NETHERITE_BLOCK_4);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "netherite_block_5"), CustomBlocks.NETHERITE_BLOCK_5);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "redstone_block_2"), CustomBlocks.REDSTONE_BLOCK_2);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "redstone_block_3"), CustomBlocks.REDSTONE_BLOCK_3);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "redstone_block_4"), CustomBlocks.REDSTONE_BLOCK_4);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "redstone_block_5"), CustomBlocks.REDSTONE_BLOCK_5);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "nether_reactor"), CustomBlocks.NETHER_REACTOR);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "half_powered_nether_reactor"), CustomBlocks.HALF_POWERED_NETHER_REACTOR);
		Registry.register(Registry.BLOCK, new Identifier("jummy", "powered_nether_reactor"), CustomBlocks.POWERED_NETHER_REACTOR);
		
		// blockitems
		
		Registry.register(Registry.ITEM, new Identifier("jummy", "7up_cap"), new BlockItem(CustomBlocks.SEVENUP_CAP, new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "breakfast_block"), new BlockItem(CustomBlocks.BREAKFAST_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "coca_cola_cap"), new BlockItem(CustomBlocks.COCA_COLA_CAP, new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "dr_pepper_cap"), new BlockItem(CustomBlocks.DR_PEPPER_CAP, new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "funnel_cake"), new BlockItem(CustomBlocks.FUNNEL_CAKE, new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "green"), new BlockItem(CustomBlocks.GREEN, new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "milk_block"), new BlockItem(CustomBlocks.MILK_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "coal_block_2"), new BlockItem(CustomBlocks.COAL_BLOCK_2, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "coal_block_3"), new BlockItem(CustomBlocks.COAL_BLOCK_3, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "coal_block_4"), new BlockItem(CustomBlocks.COAL_BLOCK_4, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "coal_block_5"), new BlockItem(CustomBlocks.COAL_BLOCK_5, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "diamond_block_2"), new BlockItem(CustomBlocks.DIAMOND_BLOCK_2, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "diamond_block_3"), new BlockItem(CustomBlocks.DIAMOND_BLOCK_3, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "diamond_block_4"), new BlockItem(CustomBlocks.DIAMOND_BLOCK_4, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "diamond_block_5"), new BlockItem(CustomBlocks.DIAMOND_BLOCK_5, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "emerald_block_2"), new BlockItem(CustomBlocks.EMERALD_BLOCK_2, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "emerald_block_3"), new BlockItem(CustomBlocks.EMERALD_BLOCK_3, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "emerald_block_4"), new BlockItem(CustomBlocks.EMERALD_BLOCK_4, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "emerald_block_5"), new BlockItem(CustomBlocks.EMERALD_BLOCK_5, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "gold_block_2"), new BlockItem(CustomBlocks.GOLD_BLOCK_2, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "gold_block_3"), new BlockItem(CustomBlocks.GOLD_BLOCK_3, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "gold_block_4"), new BlockItem(CustomBlocks.GOLD_BLOCK_4, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "gold_block_5"), new BlockItem(CustomBlocks.GOLD_BLOCK_5, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "iron_block_2"), new BlockItem(CustomBlocks.IRON_BLOCK_2, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "iron_block_3"), new BlockItem(CustomBlocks.IRON_BLOCK_3, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "iron_block_4"), new BlockItem(CustomBlocks.IRON_BLOCK_4, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "iron_block_5"), new BlockItem(CustomBlocks.IRON_BLOCK_5, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "lapis_block_2"), new BlockItem(CustomBlocks.LAPIS_BLOCK_2, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "lapis_block_3"), new BlockItem(CustomBlocks.LAPIS_BLOCK_3, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "lapis_block_4"), new BlockItem(CustomBlocks.LAPIS_BLOCK_4, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "lapis_block_5"), new BlockItem(CustomBlocks.LAPIS_BLOCK_5, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "netherite_block_2"), new BlockItem(CustomBlocks.NETHERITE_BLOCK_2, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "netherite_block_3"), new BlockItem(CustomBlocks.NETHERITE_BLOCK_3, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "netherite_block_4"), new BlockItem(CustomBlocks.NETHERITE_BLOCK_4, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "netherite_block_5"), new BlockItem(CustomBlocks.NETHERITE_BLOCK_5, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "redstone_block_2"), new BlockItem(CustomBlocks.REDSTONE_BLOCK_2, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "redstone_block_3"), new BlockItem(CustomBlocks.REDSTONE_BLOCK_3, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "redstone_block_4"), new BlockItem(CustomBlocks.REDSTONE_BLOCK_4, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "redstone_block_5"), new BlockItem(CustomBlocks.REDSTONE_BLOCK_5, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "nether_reactor"), new BlockItem(CustomBlocks.NETHER_REACTOR, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "half_powered_nether_reactor"), new BlockItem(CustomBlocks.HALF_POWERED_NETHER_REACTOR, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("jummy", "powered_nether_reactor"), new BlockItem(CustomBlocks.POWERED_NETHER_REACTOR, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
		
		// general items
		
		Registry.register(Registry.ITEM, new Identifier("jummy", "gravel_bits"), CustomItems.GRAVEL_BITS);
		Registry.register(Registry.ITEM, new Identifier("jummy", "cactus_juice"), CustomItems.CACTUS_JUICE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "sweet_potato"), CustomItems.SWEET_POTATO);
		Registry.register(Registry.ITEM, new Identifier("jummy", "baked_sweet_potato"), CustomItems.BAKED_SWEET_POTATO);
		Registry.register(Registry.ITEM, new Identifier("jummy", "sweet_baked_potato"), CustomItems.SWEET_BAKED_POTATO);
		Registry.register(Registry.ITEM, new Identifier("jummy", "baked_poisonous_potato"), CustomItems.BAKED_POISONOUS_POTATO);
		Registry.register(Registry.ITEM, new Identifier("jummy", "diamond_emerald_baked_potato"), CustomItems.DIAMOND_EMERALD_BAKED_POTATO);
		Registry.register(Registry.ITEM, new Identifier("jummy", "overcooked_potato"), CustomItems.OVERCOOKED_POTATO);
		Registry.register(Registry.ITEM, new Identifier("jummy", "lava_baked_potato"), CustomItems.LAVA_BAKED_POTATO);
		Registry.register(Registry.ITEM, new Identifier("jummy", "diamond_string"), CustomItems.DIAMOND_STRING);
		Registry.register(Registry.ITEM, new Identifier("jummy", "redstone_string"), CustomItems.REDSTONE_STRING);
		Registry.register(Registry.ITEM, new Identifier("jummy", "ender_string"), CustomItems.ENDER_STRING);
		Registry.register(Registry.ITEM, new Identifier("jummy", "one_dollar_bill"), CustomItems.ONE_DOLLAR_BILL);
		Registry.register(Registry.ITEM, new Identifier("jummy", "two_dollar_bill"), CustomItems.TWO_DOLLAR_BILL);
		Registry.register(Registry.ITEM, new Identifier("jummy", "five_dollar_bill"), CustomItems.FIVE_DOLLAR_BILL);
		Registry.register(Registry.ITEM, new Identifier("jummy", "ten_dollar_bill"), CustomItems.TEN_DOLLAR_BILL);
		Registry.register(Registry.ITEM, new Identifier("jummy", "twenty_dollar_bill"), CustomItems.TWENTY_DOLLAR_BILL);
		Registry.register(Registry.ITEM, new Identifier("jummy", "fifty_dollar_bill"), CustomItems.FIFTY_DOLLAR_BILL);
		Registry.register(Registry.ITEM, new Identifier("jummy", "one_hundred_dollar_bill"), CustomItems.ONE_HUNDRED_DOLLAR_BILL);
		Registry.register(Registry.ITEM, new Identifier("jummy", "diamond_apple"), CustomItems.DIAMOND_APPLE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "blue_paper"), CustomItems.BLUE_PAPER);
		Registry.register(Registry.ITEM, new Identifier("jummy", "completely_black_flint"), CustomItems.COMPLETELY_BLACK_FLINT);
		Registry.register(Registry.ITEM, new Identifier("jummy", "this_is_not_a_glitch"), CustomItems.THIS_IS_NOT_A_GLITCH);
		Registry.register(Registry.ITEM, new Identifier("jummy", "cheese"), CustomItems.CHEESE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "cheeseburger"), CustomItems.CHEESEBURGER);
		Registry.register(Registry.ITEM, new Identifier("jummy", "hamburger"), CustomItems.HAMBURGER);
		Registry.register(Registry.ITEM, new Identifier("jummy", "doritos"), CustomItems.DORITOS);
		Registry.register(Registry.ITEM, new Identifier("jummy", "very_poisonous_potato"), CustomItems.VERY_POISONOUS_POTATO);
		Registry.register(Registry.ITEM, new Identifier("jummy", "ruby"), CustomItems.RUBY);
		Registry.register(Registry.ITEM, new Identifier("jummy", "overcooked_beef"), CustomItems.OVERCOOKED_BEEF);
		Registry.register(Registry.ITEM, new Identifier("jummy", "overcooked_chicken"), CustomItems.OVERCOOKED_CHICKEN);
		Registry.register(Registry.ITEM, new Identifier("jummy", "breakfast"), CustomItems.BREAKFAST);
		Registry.register(Registry.ITEM, new Identifier("jummy", "wet_apple"), CustomItems.WET_APPLE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "leaf"), CustomItems.LEAF);
		Registry.register(Registry.ITEM, new Identifier("jummy", "marshmallow"), CustomItems.MARSHMALLOW);
		Registry.register(Registry.ITEM, new Identifier("jummy", "energy_drink"), CustomItems.ENERGY_DRINK);
		Registry.register(Registry.ITEM, new Identifier("jummy", "salt"), CustomItems.SALT);
		Registry.register(Registry.ITEM, new Identifier("jummy", "milk"), CustomItems.MILK);
		Registry.register(Registry.ITEM, new Identifier("jummy", "plastic"), CustomItems.PLASTIC);
		Registry.register(Registry.ITEM, new Identifier("jummy", "blu_ray_disc_the_sixth_sense"), new MiscDescItem());
		Registry.register(Registry.ITEM, new Identifier("jummy", "gamecube_game_disc_mary_kate_and_ashley_sweet_16_licensed_to_drive"), new MiscDescItem());
		Registry.register(Registry.ITEM, new Identifier("jummy", "cd_rom_planet_blupi"), new MiscDescItem());
		Registry.register(Registry.ITEM, new Identifier("jummy", "ps2_dvd_rom_bambi"), new MiscDescItem());
		Registry.register(Registry.ITEM, new Identifier("jummy", "cd_rom_monopoly"), new MiscDescItem());
		Registry.register(Registry.ITEM, new Identifier("jummy", "cd_rom_backyard_baseball_2001"), new MiscDescItem());
		Registry.register(Registry.ITEM, new Identifier("jummy", "cd_rom_phonics_4_kids"), new MiscDescItem());
		Registry.register(Registry.ITEM, new Identifier("jummy", "cd_rom_kid_pix_deluxe_3"), new MiscDescItem());
		Registry.register(Registry.ITEM, new Identifier("jummy", "cd_rom_mavis_beacon_teaches_typing_version_18"), new MiscDescItem());
		Registry.register(Registry.ITEM, new Identifier("jummy", "ps3_blu_ray_disc_sonic_the_hedgehog"), new MiscDescItem());
		Registry.register(Registry.ITEM, new Identifier("jummy", "twinkie"), CustomItems.TWINKIE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "apple_pie"), CustomItems.APPLE_PIE);
		
		// tools
		
		Registry.register(Registry.ITEM, new Identifier("jummy", "dirt_sword"), CustomItems.DIRT_SWORD);
		Registry.register(Registry.ITEM, new Identifier("jummy", "dirt_shovel"), CustomItems.DIRT_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("jummy", "dirt_pickaxe"), CustomItems.DIRT_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "dirt_axe"), CustomItems.DIRT_AXE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "dirt_hoe"), CustomItems.DIRT_HOE);
		
		Registry.register(Registry.ITEM, new Identifier("jummy", "gravel_sword"), CustomItems.GRAVEL_SWORD);
		Registry.register(Registry.ITEM, new Identifier("jummy", "gravel_shovel"), CustomItems.GRAVEL_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("jummy", "gravel_pickaxe"), CustomItems.GRAVEL_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "gravel_axe"), CustomItems.GRAVEL_AXE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "gravel_hoe"), CustomItems.GRAVEL_HOE);
		
		Registry.register(Registry.ITEM, new Identifier("jummy", "obsidian_sword"), CustomItems.OBSIDIAN_SWORD);
		Registry.register(Registry.ITEM, new Identifier("jummy", "obsidian_shovel"), CustomItems.OBSIDIAN_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("jummy", "obsidian_pickaxe"), CustomItems.OBSIDIAN_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "obsidian_axe"), CustomItems.OBSIDIAN_AXE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "obsidian_hoe"), CustomItems.OBSIDIAN_HOE);
		
		Registry.register(Registry.ITEM, new Identifier("jummy", "air_sword"), CustomItems.AIR_SWORD);
		Registry.register(Registry.ITEM, new Identifier("jummy", "air_shovel"), CustomItems.AIR_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("jummy", "air_pickaxe"), CustomItems.AIR_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "air_axe"), CustomItems.AIR_AXE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "air_hoe"), CustomItems.AIR_HOE);
		
		Registry.register(Registry.ITEM, new Identifier("jummy", "bedrock_sword"), CustomItems.BEDROCK_SWORD);
		Registry.register(Registry.ITEM, new Identifier("jummy", "bedrock_shovel"), CustomItems.BEDROCK_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("jummy", "bedrock_pickaxe"), CustomItems.BEDROCK_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "bedrock_axe"), CustomItems.BEDROCK_AXE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "bedrock_hoe"), CustomItems.BEDROCK_HOE);
		
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_wooden_sword"), CustomItems.THICK_WOODEN_SWORD);
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_wooden_shovel"), CustomItems.THICK_WOODEN_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_wooden_pickaxe"), CustomItems.THICK_WOODEN_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_wooden_axe"), CustomItems.THICK_WOODEN_AXE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_wooden_hoe"), CustomItems.THICK_WOODEN_HOE);
		
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_golden_sword"), CustomItems.THICK_GOLDEN_SWORD);
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_golden_shovel"), CustomItems.THICK_GOLDEN_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_golden_pickaxe"), CustomItems.THICK_GOLDEN_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_golden_axe"), CustomItems.THICK_GOLDEN_AXE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_golden_hoe"), CustomItems.THICK_GOLDEN_HOE);
		
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_iron_sword"), CustomItems.THICK_IRON_SWORD);
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_iron_shovel"), CustomItems.THICK_IRON_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_iron_pickaxe"), CustomItems.THICK_IRON_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_iron_axe"), CustomItems.THICK_IRON_AXE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_iron_hoe"), CustomItems.THICK_IRON_HOE);
		
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_diamond_sword"), CustomItems.THICK_DIAMOND_SWORD);
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_diamond_shovel"), CustomItems.THICK_DIAMOND_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_diamond_pickaxe"), CustomItems.THICK_DIAMOND_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_diamond_axe"), CustomItems.THICK_DIAMOND_AXE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_diamond_hoe"), CustomItems.THICK_DIAMOND_HOE);
		
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_netherite_sword"), CustomItems.THICK_NETHERITE_SWORD);
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_netherite_shovel"), CustomItems.THICK_NETHERITE_SHOVEL);
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_netherite_pickaxe"), CustomItems.THICK_NETHERITE_PICKAXE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_netherite_axe"), CustomItems.THICK_NETHERITE_AXE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "thick_netherite_hoe"), CustomItems.THICK_NETHERITE_HOE);
		
		// armors
		
		Registry.register(Registry.ITEM, new Identifier("jummy", "shades"), CustomItems.SHADES);
		
		Registry.register(Registry.ITEM, new Identifier("jummy", "nether_star_helmet"), CustomItems.NETHER_STAR_HELMET);
		Registry.register(Registry.ITEM, new Identifier("jummy", "nether_star_chestplate"), CustomItems.NETHER_STAR_CHESTPLATE);
		Registry.register(Registry.ITEM, new Identifier("jummy", "nether_star_leggings"), CustomItems.NETHER_STAR_LEGGINGS);
		Registry.register(Registry.ITEM, new Identifier("jummy", "nether_star_boots"), CustomItems.NETHER_STAR_BOOTS);
		
		// fuels
		
		FuelRegistry.INSTANCE.add(CustomBlocks.COAL_BLOCK_2, 160_000); // 800 items (2 hours)
		FuelRegistry.INSTANCE.add(CustomBlocks.COAL_BLOCK_3, 1_600_000); // 8000 items (22 hours)
		FuelRegistry.INSTANCE.add(CustomBlocks.COAL_BLOCK_4, 16_000_000); // 80000 items (9 days)
		FuelRegistry.INSTANCE.add(CustomBlocks.COAL_BLOCK_5, 160_000_000); // 800 000 items (92 days)
		FuelRegistry.INSTANCE.add(CustomItems.COAL_NUGGET, 160); // 0.8 items
		FuelRegistry.INSTANCE.add(CustomItems.THICK_WOODEN_AXE, 400); // 2 items
		FuelRegistry.INSTANCE.add(CustomItems.THICK_WOODEN_HOE, 400); // 2 items
		FuelRegistry.INSTANCE.add(CustomItems.THICK_WOODEN_PICKAXE, 400); // 2 items
		FuelRegistry.INSTANCE.add(CustomItems.THICK_WOODEN_SHOVEL, 400); // 2 items
		FuelRegistry.INSTANCE.add(CustomItems.THICK_WOODEN_SWORD, 400); // 2 items
		FuelRegistry.INSTANCE.add(CustomBlocks.POWERED_NETHER_REACTOR, 16_777_215); // 83886.075 items (9 days)
		FuelRegistry.INSTANCE.add(CustomItems.THIS_IS_NOT_A_GLITCH, 199); // 0.995 items
		
		// :^)
		
		Registry.register(Registry.ITEM, new Identifier("jummy", "water"), CustomItems.WATER);
		Registry.register(Registry.ITEM, new Identifier("jummy", "lava"), CustomItems.LAVA);
		Registry.register(Registry.ITEM, new Identifier("jummy", "air"), CustomItems.AIR);
	}
	
}
