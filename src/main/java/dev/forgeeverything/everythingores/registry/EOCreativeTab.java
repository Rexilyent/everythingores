package dev.forgeeverything.everythingores.registry;

import dev.forgeeverything.everythingores.EverythingOres;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
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

                        // ── Ore blocks ──────────────────────────────────────────
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
                        output.accept(EOItems.OSMIUM_ORE_ITEM.get());
                        output.accept(EOItems.DEEPSLATE_OSMIUM_ORE_ITEM.get());
                        output.accept(EOItems.FLUORITE_ORE_ITEM.get());
                        output.accept(EOItems.DEEPSLATE_FLUORITE_ORE_ITEM.get());
                        output.accept(EOItems.BISMUTH_ORE_ITEM.get());
                        output.accept(EOItems.DEEPSLATE_BISMUTH_ORE_ITEM.get());
                        output.accept(EOItems.CHROMIUM_ORE_ITEM.get());
                        output.accept(EOItems.DEEPSLATE_CHROMIUM_ORE_ITEM.get());
                        output.accept(EOItems.TUNGSTEN_ORE_ITEM.get());
                        output.accept(EOItems.DEEPSLATE_TUNGSTEN_ORE_ITEM.get());
                        output.accept(EOItems.IRIDIUM_ORE_ITEM.get());
                        output.accept(EOItems.DEEPSLATE_IRIDIUM_ORE_ITEM.get());

                        // ── Raw ores ────────────────────────────────────────────
                        output.accept(EOItems.RAW_TIN.get());
                        output.accept(EOItems.RAW_LEAD.get());
                        output.accept(EOItems.RAW_NICKEL.get());
                        output.accept(EOItems.RAW_ALUMINUM.get());
                        output.accept(EOItems.RAW_ZINC.get());
                        output.accept(EOItems.RAW_SILVER.get());
                        output.accept(EOItems.RAW_URANIUM.get());
                        output.accept(EOItems.RAW_PLATINUM.get());
                        output.accept(EOItems.RAW_OSMIUM.get());
                        output.accept(EOItems.RAW_BISMUTH.get());
                        output.accept(EOItems.RAW_CHROMIUM.get());
                        output.accept(EOItems.RAW_TUNGSTEN.get());
                        output.accept(EOItems.RAW_IRIDIUM.get());

                        // ── Raw ore storage blocks ──────────────────────────────
                        output.accept(EOItems.RAW_TIN_BLOCK_ITEM.get());
                        output.accept(EOItems.RAW_LEAD_BLOCK_ITEM.get());
                        output.accept(EOItems.RAW_NICKEL_BLOCK_ITEM.get());
                        output.accept(EOItems.RAW_ALUMINUM_BLOCK_ITEM.get());
                        output.accept(EOItems.RAW_ZINC_BLOCK_ITEM.get());
                        output.accept(EOItems.RAW_SILVER_BLOCK_ITEM.get());
                        output.accept(EOItems.RAW_URANIUM_BLOCK_ITEM.get());
                        output.accept(EOItems.RAW_PLATINUM_BLOCK_ITEM.get());
                        output.accept(EOItems.RAW_OSMIUM_BLOCK_ITEM.get());
                        output.accept(EOItems.RAW_BISMUTH_BLOCK_ITEM.get());
                        output.accept(EOItems.RAW_CHROMIUM_BLOCK_ITEM.get());
                        output.accept(EOItems.RAW_TUNGSTEN_BLOCK_ITEM.get());
                        output.accept(EOItems.RAW_IRIDIUM_BLOCK_ITEM.get());

                        // ── Ingots ──────────────────────────────────────────────
                        output.accept(EOItems.TIN_INGOT.get());
                        output.accept(EOItems.LEAD_INGOT.get());
                        output.accept(EOItems.NICKEL_INGOT.get());
                        output.accept(EOItems.ALUMINUM_INGOT.get());
                        output.accept(EOItems.ZINC_INGOT.get());
                        output.accept(EOItems.SILVER_INGOT.get());
                        output.accept(EOItems.URANIUM_INGOT.get());
                        output.accept(EOItems.PLATINUM_INGOT.get());
                        output.accept(EOItems.OSMIUM_INGOT.get());
                        output.accept(EOItems.BISMUTH_INGOT.get());
                        output.accept(EOItems.CHROMIUM_INGOT.get());
                        output.accept(EOItems.TUNGSTEN_INGOT.get());
                        output.accept(EOItems.IRIDIUM_INGOT.get());

                        // ── Alloy ingots ────────────────────────────────────────
                        output.accept(EOItems.STEEL_INGOT.get());
                        output.accept(EOItems.ELECTRUM_INGOT.get());
                        output.accept(EOItems.CONSTANTAN_INGOT.get());
                        output.accept(EOItems.INVAR_INGOT.get());
                        output.accept(EOItems.BRONZE_INGOT.get());
                        output.accept(EOItems.STAINLESS_STEEL_INGOT.get());

                        // ── Metal storage blocks ────────────────────────────────
                        output.accept(EOItems.TIN_BLOCK_ITEM.get());
                        output.accept(EOItems.LEAD_BLOCK_ITEM.get());
                        output.accept(EOItems.NICKEL_BLOCK_ITEM.get());
                        output.accept(EOItems.ALUMINUM_BLOCK_ITEM.get());
                        output.accept(EOItems.ZINC_BLOCK_ITEM.get());
                        output.accept(EOItems.SILVER_BLOCK_ITEM.get());
                        output.accept(EOItems.URANIUM_BLOCK_ITEM.get());
                        output.accept(EOItems.PLATINUM_BLOCK_ITEM.get());
                        output.accept(EOItems.OSMIUM_BLOCK_ITEM.get());
                        output.accept(EOItems.BISMUTH_BLOCK_ITEM.get());
                        output.accept(EOItems.CHROMIUM_BLOCK_ITEM.get());
                        output.accept(EOItems.TUNGSTEN_BLOCK_ITEM.get());
                        output.accept(EOItems.IRIDIUM_BLOCK_ITEM.get());

                        // ── Alloy storage blocks ────────────────────────────────
                        output.accept(EOItems.STEEL_BLOCK_ITEM.get());
                        output.accept(EOItems.ELECTRUM_BLOCK_ITEM.get());
                        output.accept(EOItems.CONSTANTAN_BLOCK_ITEM.get());
                        output.accept(EOItems.INVAR_BLOCK_ITEM.get());
                        output.accept(EOItems.BRONZE_BLOCK_ITEM.get());
                        output.accept(EOItems.STAINLESS_STEEL_BLOCK_ITEM.get());

                        // ── Mineral drops ───────────────────────────────────────
                        output.accept(EOItems.SULFUR.get());
                        output.accept(EOItems.SALTPETER.get());
                        output.accept(EOItems.SALT.get());
                        output.accept(EOItems.MONAZITE_CRYSTAL.get());
                        output.accept(EOItems.FLUORITE_CRYSTAL.get());

                        // ── Dusts ───────────────────────────────────────────────
                        output.accept(EOItems.IRON_DUST.get());
                        output.accept(EOItems.GOLD_DUST.get());
                        output.accept(EOItems.COPPER_DUST.get());
                        output.accept(EOItems.TIN_DUST.get());
                        output.accept(EOItems.LEAD_DUST.get());
                        output.accept(EOItems.NICKEL_DUST.get());
                        output.accept(EOItems.ALUMINUM_DUST.get());
                        output.accept(EOItems.ZINC_DUST.get());
                        output.accept(EOItems.SILVER_DUST.get());
                        output.accept(EOItems.URANIUM_DUST.get());
                        output.accept(EOItems.PLATINUM_DUST.get());
                        output.accept(EOItems.OSMIUM_DUST.get());
                        output.accept(EOItems.BISMUTH_DUST.get());
                        output.accept(EOItems.CHROMIUM_DUST.get());
                        output.accept(EOItems.TUNGSTEN_DUST.get());
                        output.accept(EOItems.IRIDIUM_DUST.get());
                        output.accept(EOItems.SULFUR_DUST.get());
                        output.accept(EOItems.FLUORITE_DUST.get());
                        output.accept(EOItems.STEEL_DUST.get());
                        output.accept(EOItems.ELECTRUM_DUST.get());
                        output.accept(EOItems.CONSTANTAN_DUST.get());
                        output.accept(EOItems.INVAR_DUST.get());
                        output.accept(EOItems.BRONZE_DUST.get());
                        output.accept(EOItems.STAINLESS_STEEL_DUST.get());
                    })
                    .build());
}
