package dev.forgeeverything.everythingores;

import dev.forgeeverything.everythingores.registry.EOArmor;
import dev.forgeeverything.everythingores.registry.EOArmorMaterials;
import dev.forgeeverything.everythingores.registry.EOBlocks;
import dev.forgeeverything.everythingores.registry.EOCreativeTab;
import dev.forgeeverything.everythingores.registry.EOItems;
import dev.forgeeverything.everythingores.registry.EOTools;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

@Mod(EverythingOres.MOD_ID)
public class EverythingOres {

    public static final String MOD_ID = "everythingores";
    public static final Logger LOGGER = LogUtils.getLogger();

    public EverythingOres(IEventBus modEventBus) {
        // ArmorMaterials first — EOArmor's fields reference these Holders.
        EOArmorMaterials.ARMOR_MATERIALS.register(modEventBus);

        // Each .register(modEventBus) call forces the class to initialise,
        // guaranteeing all item registrations happen inside RegisterEvent.
        EOBlocks.BLOCKS.register(modEventBus);
        EOItems.ITEMS.register(modEventBus);
        EOArmor.ITEMS.register(modEventBus);
        EOTools.ITEMS.register(modEventBus);

        EOCreativeTab.TABS.register(modEventBus);

        LOGGER.info("Everything Ores initialised — {} owns the veins now.", MOD_ID);
    }
}
