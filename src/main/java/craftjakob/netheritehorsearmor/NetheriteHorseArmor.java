package craftjakob.netheritehorsearmor;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import craftjakob.netheritehorsearmor.core.init.ModItems;

@Mod(NetheriteHorseArmor.MODID)
public class NetheriteHorseArmor {
    public static final String MODID = "netheritehorsearmor";
    private static final Logger LOGGER = LogManager.getLogger();

    public NetheriteHorseArmor() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);

        eventBus.addListener(this::setup);
    }
    private void setup(final FMLCommonSetupEvent event) {
    	LOGGER.info("Netherite Horse Armor is loaded!");
    }
}