package pw.jummy.test.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;

public class CustomItems {
	public static final CustomItems INSTANCE = new CustomItems();
	
	public static final Item GRAVEL_BITS = new Item(new FabricItemSettings()
			.group(ItemGroup.MISC)
			.food(new FoodComponent.Builder()
					.hunger(1)
					.saturationModifier(0.0f)
					.statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 20, 19), 1.0f)
					.statusEffect(new StatusEffectInstance(StatusEffects.POISON, 20, 1), 0.1f)
					.build()
					)
			);
	public static final CactusJuiceItem CACTUS_JUICE = new CactusJuiceItem(new FabricItemSettings()
			.group(ItemGroup.FOOD)
			.maxCount(1)
			.food(new FoodComponent.Builder()
					.hunger(2)
					.saturationModifier(2.0f)
					.alwaysEdible()
					.build()
					)
			);
	public static final Item SWEET_POTATO = new Item(new FabricItemSettings()
			.group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(1)
					.saturationModifier(0.8f)
					.build()
					)
			);
	public static final Item BAKED_SWEET_POTATO = new Item(new FabricItemSettings()
			.group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(6)
					.saturationModifier(1.0f)
					.build()
					)
			);
	public static final Item SWEET_BAKED_POTATO = new Item(new FabricItemSettings()
			.group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(6)
					.saturationModifier(1.0f)
					.build()
					)
			);
	public static final Item BAKED_POISONOUS_POTATO = new Item(new FabricItemSettings()
			.group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(7)
					.saturationModifier(0.6f)
					.statusEffect(new StatusEffectInstance(StatusEffects.POISON, 30 * 20, 0), 0.6f)
					.build()
					)
			);
	public static final Item DIAMOND_EMERALD_BAKED_POTATO = new Item(new FabricItemSettings()
			.group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(5)
					.saturationModifier(1.2f)
					.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 0), 1.0f)
					.build()
					)
			);
	public static final Item OVERCOOKED_POTATO = new Item(new FabricItemSettings()
			.group(ItemGroup.FOOD)			.food(new FoodComponent.Builder()
					.hunger(5)
					.saturationModifier(0.0f)
					.build()
					)
			);
	public static final Item LAVA_BAKED_POTATO = new Item(new FabricItemSettings()
			.group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(5)
					.saturationModifier(1.0f)
					.build()
					)
			);
	public static final Item DIAMOND_STRING = new Item(new FabricItemSettings()
			.group(ItemGroup.MISC)
			);
	public static final Item REDSTONE_STRING = new Item(new FabricItemSettings()
			.group(ItemGroup.MISC)
			);
	public static final Item ENDER_STRING = new Item(new FabricItemSettings()
			.group(ItemGroup.MISC)
			);
	public static final Item ONE_DOLLAR_BILL = new Item(new FabricItemSettings()
			.group(ItemGroup.MISC)
			);
	public static final Item TWO_DOLLAR_BILL = new Item(new FabricItemSettings()
			.group(ItemGroup.MISC)
			);
	public static final Item FIVE_DOLLAR_BILL = new Item(new FabricItemSettings()
			.group(ItemGroup.MISC)
			);
	public static final Item TEN_DOLLAR_BILL = new Item(new FabricItemSettings()
			.group(ItemGroup.MISC)
			);
	public static final Item TWENTY_DOLLAR_BILL = new Item(new FabricItemSettings()
			.group(ItemGroup.MISC)
			);
	public static final Item FIFTY_DOLLAR_BILL = new Item(new FabricItemSettings()
			.group(ItemGroup.MISC)
			);
	public static final Item ONE_HUNDRED_DOLLAR_BILL = new Item(new FabricItemSettings()
			.group(ItemGroup.MISC)
			);
	public static final Item DIAMOND_APPLE = new Item(new FabricItemSettings()
			.group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
				.hunger(4)
				.saturationModifier(2.0F)
				.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 2), 1.0f)
				.statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 1), 1.0f)
				.alwaysEdible()
				.build()
				)
			);
	public static final Item BLUE_PAPER = new Item(new FabricItemSettings()
			.group(ItemGroup.MISC)
			);
	public static final Item COMPLETELY_BLACK_FLINT = new Item(new FabricItemSettings()
			.group(ItemGroup.MISC)
			);
	public static final ThisIsNotAGlitchItem THIS_IS_NOT_A_GLITCH = new ThisIsNotAGlitchItem(new FabricItemSettings()
			.group(ItemGroup.MISC)
			.food(new FoodComponent.Builder()
					.hunger(0)
					.saturationModifier(0.0f)
					.alwaysEdible()
					.build()
					)
			);
	public static final Item CHEESE = new Item(new FabricItemSettings()
			.group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(1)
					.saturationModifier(0.2f)
					.build()
					)
			);
	public static final Item CHEESEBURGER = new Item(new FabricItemSettings()
			.group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(14)
					.saturationModifier(1.5f)
					.build()
					)
			);
	public static final Item HAMBURGER = new Item(new FabricItemSettings()
			.group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(13)
					.saturationModifier(1.5f)
					.build()
					)
			);
	public static final Item DORITOS = new Item(new FabricItemSettings()
			.group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(5)
					.saturationModifier(1.0f)
					.build()
					)
			);
	public static final Item VERY_POISONOUS_POTATO = new Item(new FabricItemSettings()
			.group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(12)
					.saturationModifier(0.6f)
					.statusEffect(new StatusEffectInstance(StatusEffects.POISON, 30 * 20, 3), 1.0f)
					.build()
					)
			);
	public static final Item RUBY = new Item(new FabricItemSettings()
			.group(ItemGroup.MISC)
			);
	public static final Item OVERCOOKED_BEEF = new Item(new FabricItemSettings()
			.group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(7)
					.saturationModifier(0.0f)
					.build()
					)
			);
	public static final Item WET_APPLE = new Item(new FabricItemSettings()
			.group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(4)
					.saturationModifier(0.6f)
					.build()
					)
			);
	public static final Item BREAKFAST = new Item(new FabricItemSettings()
			.group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(3)
					.saturationModifier(1.0f)
					.build()
					)
			);
	public static final Item OVERCOOKED_CHICKEN = new Item(new FabricItemSettings()
			.group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(5)
					.saturationModifier(0.0f)
					.build()
					)
			);
	public static final Item LEAF = new Item(new FabricItemSettings()
			.group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(1)
					.saturationModifier(0.0f)
					.snack()
					.build()
					)
			);
	public static final Item MARSHMALLOW = new Item(new FabricItemSettings()
			.group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(1)
					.saturationModifier(0.2f)
					.build()
					)
			);
	
	public static final Item TWINKIE = new Item(new FabricItemSettings()
			.group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(2)
					.saturationModifier(0.25f)
					.snack()
					.build()
					)
			);
	
	public static final Item APPLE_PIE = new Item(new FabricItemSettings()
			.group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(6)
					.saturationModifier(0.75f)
					.build()
					)
			);
	public static final Item SALT = new Item(new FabricItemSettings()
			.group(ItemGroup.MISC)
			);
	public static final Item MILK = new Item(new FabricItemSettings()
			.group(ItemGroup.MISC)
			);
	public static final Item PLASTIC = new Item(new FabricItemSettings()
			.group(ItemGroup.FOOD)
			.food(new FoodComponent.Builder()
					.hunger(0)
					.alwaysEdible()
					.saturationModifier(1f)
					.statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 10 * 20, 0), 0.2f)
					.build()
					)
			);
	public static final EnergyDrinkItem ENERGY_DRINK = new EnergyDrinkItem(new FabricItemSettings()
			.group(ItemGroup.FOOD)
			.maxCount(1)
			.food(new FoodComponent.Builder()
					.hunger(1)
					.alwaysEdible()
					.saturationModifier(2.0f)
					.statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 30 * 20, 0), 0.15f)
					.statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 30 * 20, 0), 0.15f)
					.statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 30 * 20, 0), 0.15f)
					.statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 30 * 20, 0), 0.15f)
					.statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 30 * 20, 0), 0.15f)
					.statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 3, 0), 0.15f)
					.statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 30 * 20, 0), 0.15f)
					.statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 10, 0), 0.15f)
					.statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 30 * 20, 0), 0.15f)
					.statusEffect(new StatusEffectInstance(StatusEffects.POISON, 30 * 20, 0), 0.02f)
					.statusEffect(new StatusEffectInstance(StatusEffects.POISON, 30 * 20, 1), 0.02f)
					.statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 30 * 20, 0), 0.02f)
					.statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 30 * 20, 1), 0.02f)
					.statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 30 * 20, 0), 0.02f)
					.statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 30 * 20, 1), 0.02f)
					.statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 30 * 20, 0), 0.02f)
					.statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 30 * 20, 1), 0.02f)
					.statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 30 * 20, 0), 0.02f)
					.statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 30 * 20, 1), 0.02f)
					.statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 30 * 20, 0), 0.02f)
					.statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 30 * 20, 1), 0.02f)
					.build()
					)
			);
	
	public static final ToolItem GRAVEL_SWORD = new SwordItem(
			GravelToolMaterial.INSTANCE,
			2, // 2 + 1 + 1 = 4 HP
			-2.4f, // 4 - 2.4 = 1.6 Hz
			new FabricItemSettings()
					.group(ItemGroup.COMBAT)
			);
	public static final ToolItem GRAVEL_SHOVEL = new ShovelItem(
			GravelToolMaterial.INSTANCE,
			1.5f, // 1.5 + 1 + 1 = 3.5 HP
			-3.0f, // 4 - 3 = 1 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem GRAVEL_PICKAXE = new CustomPickaxeItem(
			GravelToolMaterial.INSTANCE,
			1, // 1 + 1 + 1 = 3 HP
			-2.8f, // 4 - 2.8 = 1.2 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem GRAVEL_AXE = new CustomAxeItem(
			GravelToolMaterial.INSTANCE,
			6, // 6 + 1 + 1 = 8 HP
			-3.2f, // 4 - 3.2 = 0.8 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem GRAVEL_HOE = new CustomHoeItem(
			GravelToolMaterial.INSTANCE,
			0, // 0 + 1 + 1 = 2 HP
			-3.0f, // 4 - 3 = 1 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	
	public static final ToolItem OBSIDIAN_SWORD = new SwordItem(
			ObsidianToolMaterial.INSTANCE,
			5, // 5 + 1 + 1 = 7 HP
			-3.2f, // 4 - 3.2 = 0.8 Hz
			new FabricItemSettings()
					.group(ItemGroup.COMBAT)
			);
	public static final ToolItem OBSIDIAN_SHOVEL = new ShovelItem(
			ObsidianToolMaterial.INSTANCE,
			2.5f, // 2.5 + 1 + 1 = 4.5 HP
			-3.5f, // 4 - 3.5 = 0.5 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem OBSIDIAN_PICKAXE = new CustomPickaxeItem(
			ObsidianToolMaterial.INSTANCE,
			2, // 2 + 1 + 1 = 4 HP
			-3.4f, // 4 - 3.4 = 0.6 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem OBSIDIAN_AXE = new CustomAxeItem(
			ObsidianToolMaterial.INSTANCE,
			8, // 8 + 1 + 1 = 10 HP
			-3.55f, // 4 - 3.55 = 0.45 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem OBSIDIAN_HOE = new CustomHoeItem(
			ObsidianToolMaterial.INSTANCE,
			0, // 0 + 1 + 1 = 2 HP
			-3.5f, // 4 - 3.5 = 0.5 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	
	public static final ToolItem DIRT_SWORD = new SwordItem(
			DirtToolMaterial.INSTANCE,
			3, // 3 + 0 + 1 = 4 HP
			-2.6f, // 4 - 2.6 = 1.4 Hz
			new FabricItemSettings()
					.group(ItemGroup.COMBAT)
			);
	public static final ToolItem DIRT_SHOVEL = new ShovelItem(
			DirtToolMaterial.INSTANCE,
			1.5f, // 1.5 + 0 + 1 = 2.5 HP
			-3.0f, // 4 - 3 = 1 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem DIRT_PICKAXE = new CustomPickaxeItem(
			DirtToolMaterial.INSTANCE,
			1, // 1 + 0 + 1 = 2 HP
			-3.0f, // 4 - 3 = 1 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem DIRT_AXE = new CustomAxeItem(
			DirtToolMaterial.INSTANCE,
			4, // 4 + 0 + 1 = 5 HP
			-3.2f, // 4 - 3.2 = 0.8 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem DIRT_HOE = new CustomHoeItem(
			DirtToolMaterial.INSTANCE,
			0, // 0 + 0 + 1 = 1 HP
			-3.0f, // 4 - 3 = 1 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem AIR_SWORD = new SwordItem(
			AirToolMaterial.INSTANCE,
			0, // 0 + 0 + 1 = 1 HP
			0f, // 4 - 0 = 4 Hz
			new FabricItemSettings()
					.group(ItemGroup.COMBAT)
			);
	public static final ToolItem AIR_SHOVEL = new ShovelItem(
			AirToolMaterial.INSTANCE,
			0f, // 0 + 0 + 1 = 1 HP
			0f, // 4 - 0 = 4 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem AIR_PICKAXE = new CustomPickaxeItem(
			AirToolMaterial.INSTANCE,
			0, // 0 + 0 + 1 = 1 HP
			0f, // 4 - 0 = 4 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem AIR_AXE = new CustomAxeItem(
			AirToolMaterial.INSTANCE,
			0, // 0 + 0 + 1 = 1 HP
			0f, // 4 - 0 = 4 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem AIR_HOE = new CustomHoeItem(
			AirToolMaterial.INSTANCE,
			0, // 0 + 0 + 1 = 1 HP
			0f, // 4 - 0 = 4 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem BEDROCK_SWORD = new SwordItem(
			BedrockToolMaterial.INSTANCE,
			12, // 12 + 1 + 1 = 14 HP
			-3.992f, // 4 - 3.992 = 0.008 Hz
			new FabricItemSettings()
					.group(ItemGroup.COMBAT)
			);
	public static final ToolItem BEDROCK_SHOVEL = new ShovelItem(
			BedrockToolMaterial.INSTANCE,
			9f, // 9 + 1 + 1 = 11 HP
			-3.995f, // 4 - 3.995 = 0.005 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem BEDROCK_PICKAXE = new CustomPickaxeItem(
			BedrockToolMaterial.INSTANCE,
			8, // 8 + 1 + 1 = 10 HP
			-3.994f, // 4 - 3.994 = 0.006 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem BEDROCK_AXE = new CustomAxeItem(
			BedrockToolMaterial.INSTANCE,
			16, // 16 + 1 + 1 = 18 HP
			-3.995f, // 4 - 3.995 = 0.005 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem BEDROCK_HOE = new CustomHoeItem(
			BedrockToolMaterial.INSTANCE,
			2, // 0 + 1 + 1 = 4 HP
			-3.98f, // 4 - 3.98 = 0.02 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem THICK_WOODEN_SWORD = new SwordItem(
			LogToolMaterial.INSTANCE,
			3, // 3 + 0 + 1 = 4 HP
			-2.8f, // 4 - 2.8 = 1.2 Hz
			new FabricItemSettings()
					.group(ItemGroup.COMBAT)
			);
	public static final ToolItem THICK_WOODEN_SHOVEL = new ShovelItem(
			LogToolMaterial.INSTANCE,
			1.5f, // 1.5 + 0 + 1 = 2.5 HP
			-3.25f, // 4 - 3.25 = 0.75 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem THICK_WOODEN_PICKAXE = new CustomPickaxeItem(
			LogToolMaterial.INSTANCE,
			1, // 1 + 0 + 1 = 2 HP
			-3.1f, // 4 - 3.1 = 0.9 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem THICK_WOODEN_AXE = new CustomAxeItem(
			LogToolMaterial.INSTANCE,
			6, // 6 + 0 + 1 = 7 HP
			-3.4f, // 4 - 3.4 = 0.6 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem THICK_WOODEN_HOE = new CustomHoeItem(
			LogToolMaterial.INSTANCE,
			0, // 0 + 0 + 1 = 1 HP
			-3.25f, // 4 - 3.25 = 0.75 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	
	public static final ToolItem THICK_IRON_SWORD = new SwordItem(
			IronBlockToolMaterial.INSTANCE,
			3, // 3 + 2 + 1 = 6 HP
			-2.8f, // 4 - 2.8 = 1.2 Hz
			new FabricItemSettings()
					.group(ItemGroup.COMBAT)
			);
	public static final ToolItem THICK_IRON_SHOVEL = new ShovelItem(
			IronBlockToolMaterial.INSTANCE,
			1.5f, // 1.5 + 2 + 1 = 4.5 HP
			-3.25f, // 4 - 3.25 = 0.75 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem THICK_IRON_PICKAXE = new CustomPickaxeItem(
			IronBlockToolMaterial.INSTANCE,
			1, // 1 + 2 + 1 = 4 HP
			-3.1f, // 4 - 3.1 = 0.9 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem THICK_IRON_AXE = new CustomAxeItem(
			IronBlockToolMaterial.INSTANCE,
			6, // 6 + 2 + 1 = 9 HP
			-3.325f, // 4 - 3.325 = 0.675 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem THICK_IRON_HOE = new CustomHoeItem(
			IronBlockToolMaterial.INSTANCE,
			-2, // -2 + 2 + 1 = 1 HP
			-1.75f, // 4 - 1.75 = 2.25 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	
	public static final ToolItem THICK_GOLDEN_SWORD = new SwordItem(
			GoldBlockToolMaterial.INSTANCE,
			3, // 3 + 0 + 1 = 4 HP
			-2.8f, // 4 - 2.8 = 1.2 Hz
			new FabricItemSettings()
					.group(ItemGroup.COMBAT)
			);
	public static final ToolItem THICK_GOLDEN_SHOVEL = new ShovelItem(
			GoldBlockToolMaterial.INSTANCE,
			1.5f, // 1.5 + 0 + 1 = 2.5 HP
			-3.25f, // 4 - 3.25 = 0.75 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem THICK_GOLDEN_PICKAXE = new CustomPickaxeItem(
			GoldBlockToolMaterial.INSTANCE,
			1, // 1 + 0 + 1 = 2 HP
			-3.1f, // 4 - 3.1 = 0.9 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem THICK_GOLDEN_AXE = new CustomAxeItem(
			GoldBlockToolMaterial.INSTANCE,
			6, // 6 + 0 + 1 = 9 HP
			-3.25f, // 4 - 3.25 = 0.75 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem THICK_GOLDEN_HOE = new CustomHoeItem(
			GoldBlockToolMaterial.INSTANCE,
			0, // 0 + 0 + 1 = 1 HP
			-3.25f, // 4 - 3.25 = 0.75 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	
	public static final ToolItem THICK_DIAMOND_SWORD = new SwordItem(
			DiamondBlockToolMaterial.INSTANCE,
			3, // 3 + 3 + 1 = 7 HP
			-2.8f, // 4 - 2.8 = 1.2 Hz
			new FabricItemSettings()
					.group(ItemGroup.COMBAT)
			);
	public static final ToolItem THICK_DIAMOND_SHOVEL = new ShovelItem(
			DiamondBlockToolMaterial.INSTANCE,
			1.5f, // 1.5 + 3 + 1 = 5.5 HP
			-3.25f, // 4 - 3.25 = 0.75 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem THICK_DIAMOND_PICKAXE = new CustomPickaxeItem(
			DiamondBlockToolMaterial.INSTANCE,
			1, // 1 + 3 + 1 = 5 HP
			-3.1f, // 4 - 3.1 = 0.9 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem THICK_DIAMOND_AXE = new CustomAxeItem(
			DiamondBlockToolMaterial.INSTANCE,
			5, // 5 + 3 + 1 = 9 HP
			-3.25f, // 4 - 3.25 = 0.75 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem THICK_DIAMOND_HOE = new CustomHoeItem(
			DiamondBlockToolMaterial.INSTANCE,
			-3, // -3 + 3 + 1 = 1 HP
			-1f, // 4 - 1 = 3 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	
	public static final ToolItem THICK_NETHERITE_SWORD = new SwordItem(
			NetheriteBlockToolMaterial.INSTANCE,
			3, // 3 + 4 + 1 = 8 HP
			-2.8f, // 4 - 2.8 = 1.2 Hz
			new FabricItemSettings()
					.group(ItemGroup.COMBAT)
			);
	public static final ToolItem THICK_NETHERITE_SHOVEL = new ShovelItem(
			NetheriteBlockToolMaterial.INSTANCE,
			1.5f, // 1.5 + 4 + 1 = 6.5 HP
			-3.25f, // 4 - 3.25 = 0.75 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem THICK_NETHERITE_PICKAXE = new CustomPickaxeItem(
			NetheriteBlockToolMaterial.INSTANCE,
			1, // 1 + 4 + 1 = 6 HP
			-3.1f, // 4 - 3.1 = 0.9 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem THICK_NETHERITE_AXE = new CustomAxeItem(
			NetheriteBlockToolMaterial.INSTANCE,
			5, // 5 + 4 + 1 = 10 HP
			-3.25f, // 4 - 3.25 = 0.75 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);
	public static final ToolItem THICK_NETHERITE_HOE = new CustomHoeItem(
			NetheriteBlockToolMaterial.INSTANCE,
			-4, // -4 + 4 + 1 = 1 HP
			-1f, // 4 - 1 = 3 Hz
			new FabricItemSettings()
					.group(ItemGroup.TOOLS)
			);

	public static final ArmorItem SHADES = new ArmorItem(
    		PlasticArmorMaterial.INSTANCE,
    		EquipmentSlot.HEAD,
    		new FabricItemSettings()
    				.group(ItemGroup.COMBAT)
    		);
    public static final ArmorItem NETHER_STAR_HELMET = new ArmorItem(
    		NetherStarArmorMaterial.INSTANCE,
    		EquipmentSlot.HEAD,
    		new FabricItemSettings()
    				.group(ItemGroup.COMBAT)
    		);
    public static final ArmorItem NETHER_STAR_CHESTPLATE = new ArmorItem(
    		NetherStarArmorMaterial.INSTANCE,
    		EquipmentSlot.CHEST,
    		new FabricItemSettings()
    				.group(ItemGroup.COMBAT)
    		);
    public static final ArmorItem NETHER_STAR_LEGGINGS = new ArmorItem(
    		NetherStarArmorMaterial.INSTANCE,
    		EquipmentSlot.LEGS,
    		new FabricItemSettings()
    				.group(ItemGroup.COMBAT)
    		);
    public static final ArmorItem NETHER_STAR_BOOTS = new ArmorItem(
    		NetherStarArmorMaterial.INSTANCE,
    		EquipmentSlot.FEET,
    		new FabricItemSettings()
    				.group(ItemGroup.COMBAT)
    		);
    
    public static final Item WATER = new BlockItem(
    		Blocks.WATER,
    		new FabricItemSettings()
					.maxCount(1)
    				.group(ItemGroup.MISC)
    		);
    
    public static final Item LAVA = new BlockItem(
    		Blocks.LAVA,
    		new FabricItemSettings()
					.maxCount(1)
    				.group(ItemGroup.MISC)
    		);
    
    public static final Item AIR = new BlockItem(
    		Blocks.AIR,
    		new FabricItemSettings()
    				.group(ItemGroup.MISC)
    		);

}
