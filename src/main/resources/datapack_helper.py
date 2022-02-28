import os
namespace = 'jummy'

subdir = 'dph'

os.makedirs(os.path.join(subdir, 'assets', namespace, 'models', 'item'), 0o777, True)
#os.makedirs(os.path.join(subdir, 'assets', namespace, 'textures', 'item'), 0o777, True)
os.makedirs(os.path.join(subdir, 'data', namespace, 'advancements', 'recipes'), 0o777, True)
os.makedirs(os.path.join(subdir, 'data', namespace, 'recipes'), 0o777, True)
#os.makedirs(os.path.join(subdir, 'data', 'fabric', 'tags', 'items'), 0o777, True)

def gen_tool_class(prefix, material, material_type):
	write_all_jsons('axe', prefix + '_axe', material, material_type)
	write_all_jsons('hoe', prefix + '_hoe', material, material_type)
	write_all_jsons('pickaxe', prefix + '_pickaxe', material, material_type)
	write_all_jsons('shovel', prefix + '_shovel', material, material_type)
	write_all_jsons('sword', prefix + '_sword', material, material_type)

def write_all_jsons(tool_type, item, material, material_type):
	write_model(item)
	write_recipe(tool_type, item, material, material_type)
	write_advancement(item, material, material_type)

def write_model(item):
	model = open(os.path.join(subdir, 'assets', namespace, 'models', 'item', item + ".json"), 'w')
	model.writelines([
	'{\n',
	'\t"parent": "minecraft:item/handheld",\n',
	'\t"textures": {\n',
	'\t\t"layer0": "' + namespace + ':item/' + item + '"\n',
	'\t}\n',
	'}\n'
	])

def write_advancement(item, material, material_type):
	advancement = open(os.path.join(subdir, 'data', namespace, 'advancements', 'recipes', item + ".json"), 'w')
	if material_type == 'tag':
		advancement.writelines([
		'{\n',
		'\t"parent": "minecraft:recipes/root",\n',
		'\t"rewards": {\n',
		'\t\t"recipes": [\n',
		'\t\t\t"' + namespace + ':' + item + '"\n',
		'\t\t]\n',
		'\t},\n',
		'\t"criteria": {\n',
		'\t\t"has_material": {\n',
		'\t\t\t"trigger": "minecraft:inventory_changed",\n',
		'\t\t\t"conditions": {\n',
		'\t\t\t\t"items": [\n',
		'\t\t\t\t\t{\n',
		'\t\t\t\t\t\t"tag": "' + material + '"\n',
		'\t\t\t\t\t}\n',
		'\t\t\t\t]\n',
		'\t\t\t}\n',
		'\t\t},\n',
		'\t\t"has_the_recipe": {\n',
		'\t\t\t"trigger": "minecraft:recipe_unlocked",\n',
		'\t\t\t"conditions": {\n',
		'\t\t\t\t"recipe": "' + namespace + ':' + item + '"\n',
		'\t\t\t}\n',
		'\t\t}\n',
		'\t},\n',
		'\t"requirements": [\n',
		'\t\t[\n',
		'\t\t\t"has_material",\n',
		'\t\t\t"has_the_recipe"\n',
		'\t\t]\n',
		'\t]\n',
		'}\n'
		])
	else:
		advancement.writelines([
		'{\n',
		'\t"parent": "minecraft:recipes/root",\n',
		'\t"rewards": {\n',
		'\t\t"recipes": [\n',
		'\t\t\t"' + namespace + ':' + item + '"\n',
		'\t\t]\n',
		'\t},\n',
		'\t"criteria": {\n',
		'\t\t"has_material": {\n',
		'\t\t\t"trigger": "minecraft:inventory_changed",\n',
		'\t\t\t"conditions": {\n',
		'\t\t\t\t"items": [\n',
		'\t\t\t\t\t{\n',
		'\t\t\t\t\t\t"items": [\n',
		'\t\t\t\t\t\t\t"' + material + '"\n',
		'\t\t\t\t\t\t]\n',
		'\t\t\t\t\t}\n',
		'\t\t\t\t]\n',
		'\t\t\t}\n',
		'\t\t},\n',
		'\t\t"has_the_recipe": {\n',
		'\t\t\t"trigger": "minecraft:recipe_unlocked",\n',
		'\t\t\t"conditions": {\n',
		'\t\t\t\t"recipe": "' + namespace + ':' + item + '"\n',
		'\t\t\t}\n',
		'\t\t}\n',
		'\t},\n',
		'\t"requirements": [\n',
		'\t\t[\n',
		'\t\t\t"has_material",\n',
		'\t\t\t"has_the_recipe"\n',
		'\t\t]\n',
		'\t]\n',
		'}\n'
		])

def write_recipe(tool_type, item, material, material_type):
	recipe = open(os.path.join(subdir, 'data', namespace, 'recipes', item + ".json"), 'w')
	if tool_type == 'axe':
		recipe.writelines([
		'{\n',
		'\t"type": "minecraft:crafting_shaped",\n',
		'\t"pattern": [\n',
		'\t\t"GG",\n',
		'\t\t"|G",\n',
		'\t\t"| "\n',
		'\t],\n',
		'\t"key": {\n',
		'\t\t"G": {\n',
		'\t\t\t"' + material_type + '": "' + material + '"\n',
		'\t\t},\n',
		'\t\t"|": {\n',
		'\t\t\t"item": "minecraft:stick"\n',
		'\t}\n',
		'\t},\n',
		'\t"result": {\n\n',
		'\t"item": "' + namespace + ':' + item + '"\n',
		'\t}\n',
		'}\n'
		])
	elif tool_type == 'hoe':
		recipe.writelines([
		'{\n',
		'\t"type": "minecraft:crafting_shaped",\n',
		'\t"pattern": [\n',
		'\t\t"GG",\n',
		'\t\t"| ",\n',
		'\t\t"| "\n',
		'\t],\n',
		'\t"key": {\n',
		'\t\t"G": {\n',
		'\t\t\t"' + material_type + '": "' + material + '"\n',
		'\t\t},\n',
		'\t\t"|": {\n',
		'\t\t\t"item": "minecraft:stick"\n',
		'\t}\n',
		'\t},\n',
		'\t"result": {\n\n',
		'\t"item": "' + namespace + ':' + item + '"\n',
		'\t}\n',
		'}\n'
		])
	elif tool_type == 'pickaxe':
		recipe.writelines([
		'{\n',
		'\t"type": "minecraft:crafting_shaped",\n',
		'\t"pattern": [\n',
		'\t\t"GGG",\n',
		'\t\t" | ",\n',
		'\t\t" | "\n',
		'\t],\n',
		'\t"key": {\n',
		'\t\t"G": {\n',
		'\t\t\t"' + material_type + '": "' + material + '"\n',
		'\t\t},\n',
		'\t\t"|": {\n',
		'\t\t\t"item": "minecraft:stick"\n',
		'\t}\n',
		'\t},\n',
		'\t"result": {\n\n',
		'\t"item": "' + namespace + ':' + item + '"\n',
		'\t}\n',
		'}\n'
		])
	elif tool_type == 'shovel':
		recipe.writelines([
		'{\n',
		'\t"type": "minecraft:crafting_shaped",\n',
		'\t"pattern": [\n',
		'\t\t"G",\n',
		'\t\t"|",\n',
		'\t\t"|"\n',
		'\t],\n',
		'\t"key": {\n',
		'\t\t"G": {\n',
		'\t\t\t"' + material_type + '": "' + material + '"\n',
		'\t\t},\n',
		'\t\t"|": {\n',
		'\t\t\t"item": "minecraft:stick"\n',
		'\t}\n',
		'\t},\n',
		'\t"result": {\n\n',
		'\t"item": "' + namespace + ':' + item + '"\n',
		'\t}\n',
		'}\n'
		])
	elif tool_type == 'sword':
		recipe.writelines([
		'{\n',
		'\t"type": "minecraft:crafting_shaped",\n',
		'\t"pattern": [\n',
		'\t\t"G",\n',
		'\t\t"G",\n',
		'\t\t"|"\n',
		'\t],\n',
		'\t"key": {\n',
		'\t\t"G": {\n',
		'\t\t\t"item": "' + material + '"\n',
		'\t\t},\n',
		'\t\t"|": {\n',
		'\t\t\t"item": "minecraft:stick"\n',
		'\t}\n',
		'\t},\n',
		'\t"result": {\n\n',
		'\t"item": "' + namespace + ':' + item + '"\n',
		'\t}\n',
		'}\n'
		])
		
#gen_tool_class('air', 'jummy:air', 'item')
#gen_tool_class('dirt', 'minecraft:dirt', 'item')
#gen_tool_class('copper', 'minecraft:copper_ingot', 'item')
#gen_tool_class('end_stone', 'minecraft:end_stone', 'item')
#gen_tool_class('gravel', 'jummy:gravel_tool_materials', 'tag')
#gen_tool_class('obsidian', 'jummy:obsidian_tool_materials', 'tag')
#gen_tool_class('thick_copper', 'minecraft:copper_block', 'item')
#gen_tool_class('thick_diamond', 'minecraft:diamond_block', 'item')
#gen_tool_class('thick_golden', 'minecraft:gold_block', 'item')
#gen_tool_class('thick_iron', 'minecraft:iron_block', 'item')
#gen_tool_class('thick_netherite', 'minecraft:netherite_block', 'item')
#gen_tool_class('thick_wooden', 'minecraft:logs', 'tag')