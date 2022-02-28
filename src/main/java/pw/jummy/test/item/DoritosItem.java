package pw.jummy.test.item;

import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class DoritosItem extends Item {
	public DoritosItem(Item.Settings settings) {
		super(settings);
	}
	   
	@Override
	public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
		ItemStack itemStack = super.finishUsing(stack, world, user);
		world.spawnEntity(new ItemEntity(world, user.getPos().x, user.getPos().y, user.getPos().z, new ItemStack(CustomItems.DORITOS_DUST)));
		return itemStack;
	}
}