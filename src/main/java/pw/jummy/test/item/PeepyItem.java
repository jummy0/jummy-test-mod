package pw.jummy.test.item;

import java.util.List;

import org.jetbrains.annotations.Nullable;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import pw.jummy.test.sound.CustomSoundEvents;

public class PeepyItem extends Item {

	public PeepyItem() {
		super(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1));
	}

   @Override
@Environment(EnvType.CLIENT)
   public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
      tooltip.add(this.getNthDescription(1).formatted(Formatting.GRAY)); // descriptive name
      tooltip.add(this.getNthDescription(2).formatted(Formatting.GRAY).formatted(Formatting.ITALIC)); // This is a collectible artwork and not a toy.
      tooltip.add(this.getNthDescription(3).formatted(Formatting.GRAY).formatted(Formatting.ITALIC)); // Do not give to children under 12 years old or pets.
      tooltip.add(this.getNthDescription(4).formatted(Formatting.GRAY).formatted(Formatting.ITALIC)); // Peepy (C) itemLabel LLC

   }

   @Environment(EnvType.CLIENT)
   public MutableText getNthDescription(int n) {
	  if (n == 1) {
		  return new TranslatableText(this.getTranslationKey() + ".desc");
	  } else {
		  return new TranslatableText(this.getTranslationKey() + ".desc_" + n);
	  }
   }
   
   @Override
public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
	   if (!world.isClient) {
		   world.playSound(
	           null,
	           playerEntity.getPos().x,
	           playerEntity.getPos().y,
	           playerEntity.getPos().z,
	           CustomSoundEvents.PEEPY_SQUEAK, // The sound that will play
	           SoundCategory.PLAYERS, // This determines which of the volume sliders affect this sound
	           1f, //Volume multiplier, 1 is normal, 0.5 is half volume, etc
	           playerEntity.getPitch() / -120f + 1.25f // Pitch multiplier, 1 is normal, 0.5 is half pitch, etc
			   );
	   }
	   return TypedActionResult.success(playerEntity.getStackInHand(hand));
   }
}
