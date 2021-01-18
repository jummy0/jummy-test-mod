package pw.jummy.test.item;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class MiscDescItem extends Item {

	public MiscDescItem() {
		super(new FabricItemSettings().group(ItemGroup.MISC));
	}

   @Environment(EnvType.CLIENT)
   public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
      tooltip.add(this.getDescription().formatted(Formatting.GRAY));
   }

   @Environment(EnvType.CLIENT)
   public MutableText getDescription() {
      return new TranslatableText(this.getTranslationKey() + ".desc");
   }
}
