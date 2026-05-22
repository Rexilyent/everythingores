package dev.forgeeverything.everythingores.registry;

import dev.forgeeverything.everythingores.EverythingOres;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class EOCreativeTab {

    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EverythingOres.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EVERYTHING_ORES_TAB =
            TABS.register("everything_ores_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.everythingores.everything_ores_tab"))
                    .icon(() -> EOItems.TIN_INGOT.get().getDefaultInstance())
                    .displayItems((params, output) -> {

                        // --- Ore blocks (stone variants first, then deepslate) ---
                        output.accept(EOItems.TIN_ORE_ITEM.get());
                        output.accept(EOItems.DEEPSLATE_TIN_ORE_ITEM.get());
                        output.accept(EOItems.LEAD_ORE_ITEM.get());
                        output.accept(EOItems.DEEPSLATE_LEAD_ORE_ITEM.get());
                        output.accept(EOItems.NICKEL_ORE_ITEM.get());
                        output.accept(EOItems.DEEPSLATE_NICKEL_ORE_ITEM.get());
                        output.accept(EOItems.BAUXITE_ORE_ITEM.get());
                        output.accept(EOItems.DEEPSLATE_BAUXITE_ORE_ITEM.get());
                        output.accept(EOItems.ZINC_ORE_ITEM.get());
                        output.accept(EOItems.DEEPSLATE_ZINC_ORE_ITEM.get());
                        output.accept(EOItems.SILVER_ORE_ITEM.get());
                        output.accept(EOItems.DEEPSLATE_SILVER_ORE_ITEM.get());
                        output.accept(EOItems.URANIUM_ORE_ITEM.get());
                        output.accept(EOItems.DEEPSLATE_URANIUM_ORE_ITEM.get());
                        output.accept(EOItems.PLATINUM_ORE_ITEM.get());
                        output.accept(EOItems.DEEPSLATE_PLATINUM_ORE_ITEM.get());
                        output.accept(EOItems.SULFUR_ORE_ITEM.get());
                        output.accept(EOItems.DEEPSLATE_SULFUR_ORE_ITEM.get());
                        output.accept(EOItems.SALTPETER_ORE_ITEM.get());
                        output.accept(EOItems.DEEPSLATE_SALTPETER_ORE_ITEM.get());
                        output.accept(EOItems.SALT_ORE_ITEM.get());
                        output.accept(EOItems.DEEPSLATE_SALT_ORE_ITEM.get());
                        output.accept(EOItems.MONAZITE_ORE_ITEM.get());
                        output.accept(EOItems.DEEPSLATE_MONAZITE_ORE_ITEM.get());

                        // --- Raw ores ---
                        output.accept(EOItems.RAW_TIN.get());
                        output.accept(EOItems.RAW_LEAD.get());
                        output.accept(EOItems.RAW_NICKEL.get());
                        output.accept(EOItems.RAW_ALUMINUM.get());
                        output.accept(EOItems.RAW_ZINC.get());
                        output.accept(EOItems.RAW_SILVER.get());
                        output.accept(EOItems.RAW_URANIUM.get());
                        output.accept(EOItems.RAW_PLATINUM.get());

                        // --- Ingots ---
                        output.accept(EOItems.TIN_INGOT.get());
                        output.accept(EOItems.LEAD_INGOT.get());
                        output.accept(EOItems.NICKEL_INGOT.get());
                        output.accept(EOItems.ALUMINUM_INGOT.get());
                        output.accept(EOItems.ZINC_INGOT.get());
                        output.accept(EOItems.SILVER_INGOT.get());
                        output.accept(EOItems.URANIUM_INGOT.get());
                        output.accept(EOItems.PLATINUM_INGOT.get());

                        // --- Mineral drops ---
                        output.accept(EOItems.SULFUR.get());
                        output.accept(EOItems.SALTPETER.get());
                        output.accept(EOItems.SALT.get());
                        output.accept(EOItems.MONAZITE_CRYSTAL.get());
                    })
                    .build());
}
