package pw.jummy.test;

import java.util.Arrays;
import java.util.List;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import pw.jummy.test.block.CustomBlocks;
import pw.jummy.test.def.BlockDef;
import pw.jummy.test.def.BlockItemDef;
import pw.jummy.test.def.CompostableDef;
import pw.jummy.test.def.FlammableDef;
import pw.jummy.test.def.FuelDef;
import pw.jummy.test.def.ItemDef;
import pw.jummy.test.item.CustomItems;
import pw.jummy.test.item.MiscDescItem;
import pw.jummy.test.item.PeepyItem;

public class JummyTestMod implements ModInitializer {
	public static final String MOD_ID = "jummy";
	
	private static final List<BlockItemDef> CUSTOM_BLOCKITEMS = Arrays.asList(
		new BlockItemDef("7up_cap", CustomBlocks.SEVENUP_CAP, ItemGroup.MISC),
		new BlockItemDef("apple_block", CustomBlocks.APPLE_BLOCK, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("beetroot_block", CustomBlocks.BEETROOT_BLOCK, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("breakfast_block", CustomBlocks.BREAKFAST_BLOCK, ItemGroup.MISC),
		new BlockItemDef("carrot_block", CustomBlocks.CARROT_BLOCK, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("cheese_block", CustomBlocks.CHEESE_BLOCK, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("coal_block_2", CustomBlocks.COAL_BLOCK_2, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("coal_block_3", CustomBlocks.COAL_BLOCK_3, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("coal_block_4", CustomBlocks.COAL_BLOCK_4, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("coal_block_5", CustomBlocks.COAL_BLOCK_5, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("coca_cola_cap", CustomBlocks.COCA_COLA_CAP, ItemGroup.MISC),
		new BlockItemDef("copper_block_2", CustomBlocks.COPPER_BLOCK_2, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("copper_block_3", CustomBlocks.COPPER_BLOCK_3, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("copper_block_4", CustomBlocks.COPPER_BLOCK_4, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("copper_block_5", CustomBlocks.COPPER_BLOCK_5, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("diamond_block_2", CustomBlocks.DIAMOND_BLOCK_2, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("diamond_block_3", CustomBlocks.DIAMOND_BLOCK_3, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("diamond_block_4", CustomBlocks.DIAMOND_BLOCK_4, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("diamond_block_5", CustomBlocks.DIAMOND_BLOCK_5, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("dr_pepper_cap", CustomBlocks.DR_PEPPER_CAP, ItemGroup.MISC),
		new BlockItemDef("emerald_block_2", CustomBlocks.EMERALD_BLOCK_2, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("emerald_block_3", CustomBlocks.EMERALD_BLOCK_3, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("emerald_block_4", CustomBlocks.EMERALD_BLOCK_4, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("emerald_block_5", CustomBlocks.EMERALD_BLOCK_5, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("enchanted_golden_apple_block", CustomBlocks.ENCHANTED_GOLDEN_APPLE_BLOCK, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("exposed_copper_2", CustomBlocks.EXPOSED_COPPER_2, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("exposed_copper_3", CustomBlocks.EXPOSED_COPPER_3, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("exposed_copper_4", CustomBlocks.EXPOSED_COPPER_4, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("exposed_copper_5", CustomBlocks.EXPOSED_COPPER_5, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("funnel_cake", CustomBlocks.FUNNEL_CAKE, ItemGroup.MISC),
		new BlockItemDef("glistering_melon_block", CustomBlocks.GLISTERING_MELON_BLOCK, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("gold_block_2", CustomBlocks.GOLD_BLOCK_2, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("gold_block_3", CustomBlocks.GOLD_BLOCK_3, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("gold_block_4", CustomBlocks.GOLD_BLOCK_4, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("gold_block_5", CustomBlocks.GOLD_BLOCK_5, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("golden_apple_block", CustomBlocks.GOLDEN_APPLE_BLOCK, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("golden_carrot_block", CustomBlocks.GOLDEN_CARROT_BLOCK, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("green", CustomBlocks.GREEN, ItemGroup.MISC),
		new BlockItemDef("half_powered_nether_reactor", CustomBlocks.HALF_POWERED_NETHER_REACTOR, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("iron_block_2", CustomBlocks.IRON_BLOCK_2, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("iron_block_3", CustomBlocks.IRON_BLOCK_3, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("iron_block_4", CustomBlocks.IRON_BLOCK_4, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("iron_block_5", CustomBlocks.IRON_BLOCK_5, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("lapis_block_2", CustomBlocks.LAPIS_BLOCK_2, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("lapis_block_3", CustomBlocks.LAPIS_BLOCK_3, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("lapis_block_4", CustomBlocks.LAPIS_BLOCK_4, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("lapis_block_5", CustomBlocks.LAPIS_BLOCK_5, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("milk_block", CustomBlocks.MILK_BLOCK, ItemGroup.MISC),
		new BlockItemDef("nether_reactor", CustomBlocks.NETHER_REACTOR, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("netherite_block_2", CustomBlocks.NETHERITE_BLOCK_2, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("netherite_block_3", CustomBlocks.NETHERITE_BLOCK_3, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("netherite_block_4", CustomBlocks.NETHERITE_BLOCK_4, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("netherite_block_5", CustomBlocks.NETHERITE_BLOCK_5, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("oxidized_copper_2", CustomBlocks.OXIDIZED_COPPER_2, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("oxidized_copper_3", CustomBlocks.OXIDIZED_COPPER_3, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("oxidized_copper_4", CustomBlocks.OXIDIZED_COPPER_4, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("oxidized_copper_5", CustomBlocks.OXIDIZED_COPPER_5, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("poisonous_potato_block", CustomBlocks.POISONOUS_POTATO_BLOCK, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("potato_block", CustomBlocks.POTATO_BLOCK, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("powered_nether_reactor", CustomBlocks.POWERED_NETHER_REACTOR, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("redstone_block_2", CustomBlocks.REDSTONE_BLOCK_2, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("redstone_block_3", CustomBlocks.REDSTONE_BLOCK_3, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("redstone_block_4", CustomBlocks.REDSTONE_BLOCK_4, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("redstone_block_5", CustomBlocks.REDSTONE_BLOCK_5, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("rotten_flesh_block", CustomBlocks.ROTTEN_FLESH_BLOCK, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("secret_cheese_block", CustomBlocks.SECRET_CHEESE_BLOCK, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("stick_block", CustomBlocks.STICK_BLOCK, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("weathered_copper_2", CustomBlocks.WEATHERED_COPPER_2, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("weathered_copper_3", CustomBlocks.WEATHERED_COPPER_3, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("weathered_copper_4", CustomBlocks.WEATHERED_COPPER_4, ItemGroup.BUILDING_BLOCKS),
		new BlockItemDef("weathered_copper_5", CustomBlocks.WEATHERED_COPPER_5, ItemGroup.BUILDING_BLOCKS)
		);
	
	private static final List<BlockDef> CUSTOM_BLOCKS = Arrays.asList(
		new BlockDef("balls", CustomBlocks.BALLS)
		);
	
	private static final List<ItemDef> CUSTOM_ITEMS = Arrays.asList(
		new ItemDef("apple_pie", CustomItems.APPLE_PIE),
		new ItemDef("baked_poisonous_potato", CustomItems.BAKED_POISONOUS_POTATO),
		new ItemDef("baked_sweet_potato", CustomItems.BAKED_SWEET_POTATO),
		new ItemDef("ball_bucket", CustomItems.BALL_BUCKET),
		new ItemDef("blue_paper", CustomItems.BLUE_PAPER),
		new ItemDef("blue_cheese", CustomItems.BLUE_CHEESE),
		new ItemDef("breakfast", CustomItems.BREAKFAST),
		new ItemDef("cactus_juice", CustomItems.CACTUS_JUICE),
		new ItemDef("cheese", CustomItems.CHEESE),
		new ItemDef("cheese_stick", CustomItems.CHEESE_STICK),
		new ItemDef("cheeseburger", CustomItems.CHEESEBURGER),
		new ItemDef("coal_nugget", CustomItems.COAL_NUGGET),
		new ItemDef("completely_black_flint", CustomItems.COMPLETELY_BLACK_FLINT),
		new ItemDef("copper_nugget", CustomItems.COPPER_NUGGET),
		new ItemDef("diamond_apple", CustomItems.DIAMOND_APPLE),
		new ItemDef("diamond_emerald_baked_potato", CustomItems.DIAMOND_EMERALD_BAKED_POTATO),
		new ItemDef("diamond_nugget", CustomItems.DIAMOND_NUGGET),
		new ItemDef("diamond_string", CustomItems.DIAMOND_STRING),
		new ItemDef("doritos", CustomItems.DORITOS),
		new ItemDef("doritos_dust", CustomItems.DORITOS_DUST),
		new ItemDef("emerald_nugget", CustomItems.EMERALD_NUGGET),
		new ItemDef("ender_string", CustomItems.ENDER_STRING),
		new ItemDef("energy_drink", CustomItems.ENERGY_DRINK),
		new ItemDef("gravel_bits", CustomItems.GRAVEL_BITS),
		new ItemDef("hamburger", CustomItems.HAMBURGER),
		new ItemDef("lapis_nugget", CustomItems.LAPIS_NUGGET),
		new ItemDef("lava_baked_potato", CustomItems.LAVA_BAKED_POTATO),
		new ItemDef("leaf", CustomItems.LEAF),
		new ItemDef("marshmallow", CustomItems.MARSHMALLOW),
		new ItemDef("milk", CustomItems.MILK),
		new ItemDef("netherite_nugget", CustomItems.NETHERITE_NUGGET),
		new ItemDef("overcooked_beef", CustomItems.OVERCOOKED_BEEF),
		new ItemDef("overcooked_chicken", CustomItems.OVERCOOKED_CHICKEN),
		new ItemDef("overcooked_potato", CustomItems.OVERCOOKED_POTATO),
		new ItemDef("plastic", CustomItems.PLASTIC),
		new ItemDef("plastic_nugget", CustomItems.PLASTIC_NUGGET),
		new ItemDef("redstone_string", CustomItems.REDSTONE_STRING),
		new ItemDef("ruby", CustomItems.RUBY),
		new ItemDef("salt", CustomItems.SALT),
		new ItemDef("sawdust", CustomItems.SAWDUST),
		new ItemDef("string_cheese", CustomItems.STRING_CHEESE),
		new ItemDef("sweet_baked_potato", CustomItems.SWEET_BAKED_POTATO),
		new ItemDef("sweet_potato", CustomItems.SWEET_POTATO),
		new ItemDef("this_is_not_a_glitch", CustomItems.THIS_IS_NOT_A_GLITCH),
		new ItemDef("twinkie", CustomItems.TWINKIE),
		new ItemDef("very_poisonous_potato", CustomItems.VERY_POISONOUS_POTATO),
		new ItemDef("wet_apple", CustomItems.WET_APPLE),
		new ItemDef("wood_nugget", CustomItems.WOOD_NUGGET),

		// dollars
		new ItemDef("one_dollar_bill", CustomItems.ONE_DOLLAR_BILL),
		new ItemDef("two_dollar_bill", CustomItems.TWO_DOLLAR_BILL),
		new ItemDef("five_dollar_bill", CustomItems.FIVE_DOLLAR_BILL),
		new ItemDef("ten_dollar_bill", CustomItems.TEN_DOLLAR_BILL),
		new ItemDef("twenty_dollar_bill", CustomItems.TWENTY_DOLLAR_BILL),
		new ItemDef("fifty_dollar_bill", CustomItems.FIFTY_DOLLAR_BILL),
		new ItemDef("one_hundred_dollar_bill", CustomItems.ONE_HUNDRED_DOLLAR_BILL),

		// media discs
		new ItemDef("blu_ray_disc_the_sixth_sense", new MiscDescItem()),
		new ItemDef("cd_rom_backyard_baseball_2001", new MiscDescItem()),
		new ItemDef("cd_rom_kid_pix_deluxe_3", new MiscDescItem()),
		new ItemDef("cd_rom_mavis_beacon_teaches_typing_version_18", new MiscDescItem()),
		new ItemDef("cd_rom_monopoly", new MiscDescItem()),
		new ItemDef("cd_rom_phonics_4_kids", new MiscDescItem()),
		new ItemDef("cd_rom_planet_blupi", new MiscDescItem()),
		new ItemDef("gamecube_game_disc_mary_kate_and_ashley_sweet_16_licensed_to_drive", new MiscDescItem()),
		new ItemDef("ps2_dvd_rom_bambi", new MiscDescItem()),
		new ItemDef("ps3_blu_ray_disc_sonic_the_hedgehog", new MiscDescItem()),

		// itemlabel
		new ItemDef("cowpy", new PeepyItem()),
		new ItemDef("pinkpy", new PeepyItem()),
		new ItemDef("black_sheepy", new PeepyItem()),
		new ItemDef("celebpy", new PeepyItem()),
		new ItemDef("cornpy", new PeepyItem()),
		new ItemDef("mistakepy", new PeepyItem()),
		new ItemDef("purple_fuzzpy", new PeepyItem()),
		new ItemDef("lemonpy", new PeepyItem()),
		new ItemDef("shroompy", new PeepyItem()),
		new ItemDef("golden_peepy", new PeepyItem()),

		// tools
		new ItemDef("air_sword", CustomItems.AIR_SWORD),
		new ItemDef("air_shovel", CustomItems.AIR_SHOVEL),
		new ItemDef("air_pickaxe", CustomItems.AIR_PICKAXE),
		new ItemDef("air_axe", CustomItems.AIR_AXE),
		new ItemDef("air_hoe", CustomItems.AIR_HOE),

		new ItemDef("bedrock_sword", CustomItems.BEDROCK_SWORD),
		new ItemDef("bedrock_shovel", CustomItems.BEDROCK_SHOVEL),
		new ItemDef("bedrock_pickaxe", CustomItems.BEDROCK_PICKAXE),
		new ItemDef("bedrock_axe", CustomItems.BEDROCK_AXE),
		new ItemDef("bedrock_hoe", CustomItems.BEDROCK_HOE),

		new ItemDef("copper_sword", CustomItems.COPPER_SWORD),
		new ItemDef("copper_shovel", CustomItems.COPPER_SHOVEL),
		new ItemDef("copper_pickaxe", CustomItems.COPPER_PICKAXE),
		new ItemDef("copper_axe", CustomItems.COPPER_AXE),
		new ItemDef("copper_hoe", CustomItems.COPPER_HOE),

		new ItemDef("dirt_sword", CustomItems.DIRT_SWORD),
		new ItemDef("dirt_shovel", CustomItems.DIRT_SHOVEL),
		new ItemDef("dirt_pickaxe", CustomItems.DIRT_PICKAXE),
		new ItemDef("dirt_axe", CustomItems.DIRT_AXE),
		new ItemDef("dirt_hoe", CustomItems.DIRT_HOE),

		new ItemDef("end_stone_sword", CustomItems.END_STONE_SWORD),
		new ItemDef("end_stone_shovel", CustomItems.END_STONE_SHOVEL),
		new ItemDef("end_stone_pickaxe", CustomItems.END_STONE_PICKAXE),
		new ItemDef("end_stone_axe", CustomItems.END_STONE_AXE),
		new ItemDef("end_stone_hoe", CustomItems.END_STONE_HOE),

		new ItemDef("gravel_sword", CustomItems.GRAVEL_SWORD),
		new ItemDef("gravel_shovel", CustomItems.GRAVEL_SHOVEL),
		new ItemDef("gravel_pickaxe", CustomItems.GRAVEL_PICKAXE),
		new ItemDef("gravel_axe", CustomItems.GRAVEL_AXE),
		new ItemDef("gravel_hoe", CustomItems.GRAVEL_HOE),

		new ItemDef("obsidian_sword", CustomItems.OBSIDIAN_SWORD),
		new ItemDef("obsidian_shovel", CustomItems.OBSIDIAN_SHOVEL),
		new ItemDef("obsidian_pickaxe", CustomItems.OBSIDIAN_PICKAXE),
		new ItemDef("obsidian_axe", CustomItems.OBSIDIAN_AXE),
		new ItemDef("obsidian_hoe", CustomItems.OBSIDIAN_HOE),

		new ItemDef("thick_copper_sword", CustomItems.THICK_COPPER_SWORD),
		new ItemDef("thick_copper_shovel", CustomItems.THICK_COPPER_SHOVEL),
		new ItemDef("thick_copper_pickaxe", CustomItems.THICK_COPPER_PICKAXE),
		new ItemDef("thick_copper_axe", CustomItems.THICK_COPPER_AXE),
		new ItemDef("thick_copper_hoe", CustomItems.THICK_COPPER_HOE),

		new ItemDef("thick_diamond_sword", CustomItems.THICK_DIAMOND_SWORD),
		new ItemDef("thick_diamond_shovel", CustomItems.THICK_DIAMOND_SHOVEL),
		new ItemDef("thick_diamond_pickaxe", CustomItems.THICK_DIAMOND_PICKAXE),
		new ItemDef("thick_diamond_axe", CustomItems.THICK_DIAMOND_AXE),
		new ItemDef("thick_diamond_hoe", CustomItems.THICK_DIAMOND_HOE),

		new ItemDef("thick_golden_sword", CustomItems.THICK_GOLDEN_SWORD),
		new ItemDef("thick_golden_shovel", CustomItems.THICK_GOLDEN_SHOVEL),
		new ItemDef("thick_golden_pickaxe", CustomItems.THICK_GOLDEN_PICKAXE),
		new ItemDef("thick_golden_axe", CustomItems.THICK_GOLDEN_AXE),
		new ItemDef("thick_golden_hoe", CustomItems.THICK_GOLDEN_HOE),

		new ItemDef("thick_iron_sword", CustomItems.THICK_IRON_SWORD),
		new ItemDef("thick_iron_shovel", CustomItems.THICK_IRON_SHOVEL),
		new ItemDef("thick_iron_pickaxe", CustomItems.THICK_IRON_PICKAXE),
		new ItemDef("thick_iron_axe", CustomItems.THICK_IRON_AXE),
		new ItemDef("thick_iron_hoe", CustomItems.THICK_IRON_HOE),

		new ItemDef("thick_netherite_sword", CustomItems.THICK_NETHERITE_SWORD),
		new ItemDef("thick_netherite_shovel", CustomItems.THICK_NETHERITE_SHOVEL),
		new ItemDef("thick_netherite_pickaxe", CustomItems.THICK_NETHERITE_PICKAXE),
		new ItemDef("thick_netherite_axe", CustomItems.THICK_NETHERITE_AXE),
		new ItemDef("thick_netherite_hoe", CustomItems.THICK_NETHERITE_HOE),

		new ItemDef("thick_wooden_sword", CustomItems.THICK_WOODEN_SWORD),
		new ItemDef("thick_wooden_shovel", CustomItems.THICK_WOODEN_SHOVEL),
		new ItemDef("thick_wooden_pickaxe", CustomItems.THICK_WOODEN_PICKAXE),
		new ItemDef("thick_wooden_axe", CustomItems.THICK_WOODEN_AXE),
		new ItemDef("thick_wooden_hoe", CustomItems.THICK_WOODEN_HOE),

		// armors
		new ItemDef("shades", CustomItems.SHADES),

		new ItemDef("nether_star_helmet", CustomItems.NETHER_STAR_HELMET),
		new ItemDef("nether_star_chestplate", CustomItems.NETHER_STAR_CHESTPLATE),
		new ItemDef("nether_star_leggings", CustomItems.NETHER_STAR_LEGGINGS),
		new ItemDef("nether_star_boots", CustomItems.NETHER_STAR_BOOTS),

		// :^)
		new ItemDef("water", CustomItems.WATER),
		new ItemDef("lava", CustomItems.LAVA),
		new ItemDef("air", CustomItems.AIR)
		);
	
	private static final List<FuelDef> CUSTOM_FUELS = Arrays.asList(
		new FuelDef(CustomItems.COAL_NUGGET, 160), // 0.8 items
		new FuelDef(CustomItems.SAWDUST, 1), // 0.005 items
		new FuelDef(CustomItems.THICK_WOODEN_AXE, 400), // 2 items
		new FuelDef(CustomItems.THICK_WOODEN_HOE, 400), // 2 items
		new FuelDef(CustomItems.THICK_WOODEN_PICKAXE, 400), // 2 items
		new FuelDef(CustomItems.THICK_WOODEN_SHOVEL, 400), // 2 items
		new FuelDef(CustomItems.THICK_WOODEN_SWORD, 400), // 2 items
		new FuelDef(CustomItems.THIS_IS_NOT_A_GLITCH, 199), // 0.995 items
		new FuelDef(CustomItems.WOOD_NUGGET, 10) // 0.05 items
		);
	
	private static final List<FlammableDef> CUSTOM_FLAMMABLES = Arrays.asList(
		new FlammableDef(CustomBlocks.STICK_BLOCK, 5, 20)
		);
	
	private static final List<CompostableDef> CUSTOM_COMPOSTABLES = Arrays.asList(
		new CompostableDef(CustomItems.BAKED_SWEET_POTATO, 0.85f),
		new CompostableDef(CustomItems.CHEESE, 0.3f),
		new CompostableDef(CustomItems.CHEESEBURGER, 1.0f),
		new CompostableDef(CustomItems.HAMBURGER, 1.0f),
		new CompostableDef(CustomItems.SWEET_POTATO, 0.65f),
		new CompostableDef(CustomItems.SWEET_BAKED_POTATO, 0.85f),
		new CompostableDef(CustomItems.LAVA_BAKED_POTATO, 0.85f),
		new CompostableDef(CustomItems.LEAF, 0.075f),
		new CompostableDef(CustomItems.MARSHMALLOW, 0.3f),
		new CompostableDef(CustomItems.OVERCOOKED_BEEF, 0.85f),
		new CompostableDef(CustomItems.OVERCOOKED_CHICKEN, 0.85f),
		new CompostableDef(CustomItems.OVERCOOKED_POTATO, 0.85f),
		new CompostableDef(CustomItems.WET_APPLE, 0.65f)
		);
	
	@Override
	public void onInitialize() {
		CUSTOM_BLOCKITEMS.forEach(def -> {
			Registry.register(Registry.BLOCK, new Identifier(MOD_ID, def.getKey()), def.getBlock());
			Registry.register(Registry.ITEM, new Identifier(MOD_ID, def.getKey()), new BlockItem(def.getBlock(), new FabricItemSettings().group(def.getItemGroup())));

		});
		
		CUSTOM_BLOCKS.forEach(def -> {
			Registry.register(Registry.BLOCK, new Identifier(MOD_ID, def.getKey()), def.getBlock());
		});
		
		CUSTOM_ITEMS.forEach(def -> {
			Registry.register(Registry.ITEM, new Identifier(MOD_ID, def.getKey()), def.getItem());
		});
		
		CUSTOM_FUELS.forEach(def -> {
			FuelRegistry.INSTANCE.add(def.getItem(), def.getTicks());
		});
		
		CUSTOM_FLAMMABLES.forEach(def -> {
			FlammableBlockRegistry.getDefaultInstance().add(def.getBlock(), def.getBurn(), def.getSpread());
		});
		
		CUSTOM_COMPOSTABLES.forEach(def -> {
			CompostingChanceRegistry.INSTANCE.add(def.getItem(), def.getChance());
		});
		
		// transparent blocks
		BlockRenderLayerMap.INSTANCE.putBlock(CustomBlocks.SECRET_CHEESE_BLOCK, RenderLayer.getCutout());
	}	
}
