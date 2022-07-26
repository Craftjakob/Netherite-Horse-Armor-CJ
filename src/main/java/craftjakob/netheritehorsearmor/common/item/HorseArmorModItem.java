package craftjakob.netheritehorsearmor.common.item;

import java.util.List;

import craftjakob.netheritehorsearmor.NetheriteHorseArmor;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.HorseArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@SuppressWarnings("unused")

@Mod.EventBusSubscriber(modid = NetheriteHorseArmor.MODID, bus = Bus.MOD)
public class HorseArmorModItem extends HorseArmorItem {
private static final String TEX_FOLDER = "textures/entity/horse/";
   private final int protection;
   private final ResourceLocation texture;
   
   public HorseArmorModItem(int p_41364_, String String, HorseArmorModItem.Properties Properties) {
      this(p_41364_, new ResourceLocation(NetheriteHorseArmor.MODID, "textures/entity/horse/armor/" + String + ".png"), Properties);
   }

   public HorseArmorModItem(int p_41364_, ResourceLocation ResourceLocation, HorseArmorModItem.Properties Properties) {
      super(p_41364_, ResourceLocation, Properties);
      this.protection = p_41364_;
      this.texture = ResourceLocation;
   }

   public ResourceLocation getTexture() {
      return texture;
   }

   public int getProtection() {
      return this.protection;
   }
	@Override
	public void appendHoverText(ItemStack ItemStack, Level Level, List<Component> p_41423_, TooltipFlag TooltipFlag) {
		p_41423_.add(Component.literal("+" + Float.toString(this.getProtection()) + " ")
				.append(Component.translatable("item.netheritehorsearmor.protection_tooltip")).withStyle(ChatFormatting.DARK_BLUE));
		super.appendHoverText(ItemStack, Level, p_41423_, TooltipFlag);
	}
   
}
