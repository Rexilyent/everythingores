package dev.forgeeverything.everythingores;

import dev.forgeeverything.everythingores.registry.EOBlocks;
import dev.forgeeverything.everythingores.registry.EOCreativeTab;
import dev.forgeeverything.everythingores.registry.EOItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

@Mod(EverythingOres.MOD_ID)
public class EverythingOres {

    public static final String MOD_ID = "everythingores";
    public static final Logger LOGGER = LogUtils.getLogger();

    public EverythingOres(IEventBus modEventBus) {
        EOBlocks.BLOCKS.register(modEventBus);
        EOItems.ITEMS.register(modEventBus);
        EOCreativeTab.TABS.register(modEventBus);

        LOGGER.info("Everything Ores initialised — {} owns the veins now.", MOD_ID);
    }
}
