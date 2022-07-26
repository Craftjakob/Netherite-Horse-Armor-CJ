package craftjakob.netheritehorsearmor.core.init;

import craftjakob.netheritehorsearmor.NetheriteHorseArmor;
import craftjakob.netheritehorsearmor.common.item.HorseArmorModItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NetheriteHorseArmor.MODID);

    public static final RegistryObject<Item> NETHERITE_HORSE_ARMOR = ITEMS.register("netherite_horse_armor",
            () -> new HorseArmorModItem(14, "netherite_horse_armor", new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC).fireResistant()));
    
    
    public static final RegistryObject<Item> GILDED_NETHERITE_HORSE_ARMOR = ITEMS.register("gilded_netherite_horse_armor",
            () -> new HorseArmorModItem(16, "gilded_netherite_horse_armor", new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC).fireResistant()));
    
/*  More Horse Armor?  
    public static final RegistryObject<Item> COPPER_HORSE_ARMOR = ITEMS.register("copper_horse_armor",
            () -> new HorseArmorModItem(5, "netherite_horse_armor", new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC).fireResistant()));
    
    public static final RegistryObject<Item> EMERALD_HORSE_ARMOR = ITEMS.register("emerald_horse_armor",
            () -> new HorseArmorModItem(10, "emerald_horse_armor", new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MISC).fireResistant()));
	*/
    public static void register(IEventBus eventBus) {
	ITEMS.register(eventBus);
	}

}

