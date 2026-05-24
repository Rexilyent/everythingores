package dev.forgeeverything.everythingores.registry;

import dev.forgeeverything.everythingores.EverythingOres;
import dev.forgeeverything.everythingores.registry.EOArmor;
import dev.forgeeverything.everythingores.registry.EOTools;

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
                        output.accept(EOItems.CHROMITE_ORE_ITEM.get());
                        output.accept(EOItems.DEEPSLATE_CHROMITE_ORE_ITEM.get());
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
                        output.accept(EOItems.RAW_CHROMITE.get());
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
                        output.accept(EOItems.RAW_CHROMITE_BLOCK_ITEM.get());
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
                        output.accept(EOItems.TUNGSTEN_INGOT.get());
                        output.accept(EOItems.IRIDIUM_INGOT.get());

                        // ── Alloy ingots ────────────────────────────────────────
                        output.accept(EOItems.STEEL_INGOT.get());
                        output.accept(EOItems.ELECTRUM_INGOT.get());
                        output.accept(EOItems.CONSTANTAN_INGOT.get());
                        output.accept(EOItems.INVAR_INGOT.get());
                        output.accept(EOItems.BRONZE_INGOT.get());
                        output.accept(EOItems.STAINLESS_STEEL_INGOT.get());
                        output.accept(EOItems.RED_ALLOY_INGOT.get());

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
                        output.accept(EOItems.RED_ALLOY_BLOCK_ITEM.get());

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
												output.accept(EOItems.CHROMITE_DUST.get());
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
                        output.accept(EOItems.RED_ALLOY_DUST.get());

                        // ── Tiny dusts ──────────────────────────────────────────────────
                        output.accept(EOItems.TINY_IRON_DUST.get());
                        output.accept(EOItems.TINY_GOLD_DUST.get());
                        output.accept(EOItems.TINY_COPPER_DUST.get());
                        output.accept(EOItems.TINY_TIN_DUST.get());
                        output.accept(EOItems.TINY_LEAD_DUST.get());
                        output.accept(EOItems.TINY_NICKEL_DUST.get());
                        output.accept(EOItems.TINY_ALUMINUM_DUST.get());
                        output.accept(EOItems.TINY_ZINC_DUST.get());
                        output.accept(EOItems.TINY_SILVER_DUST.get());
                        output.accept(EOItems.TINY_URANIUM_DUST.get());
                        output.accept(EOItems.TINY_PLATINUM_DUST.get());
                        output.accept(EOItems.TINY_OSMIUM_DUST.get());
                        output.accept(EOItems.TINY_BISMUTH_DUST.get());
												output.accept(EOItems.TINY_CHROMIUM_DUST.get());
												output.accept(EOItems.TINY_CHROMITE_DUST.get());
                        output.accept(EOItems.TINY_TUNGSTEN_DUST.get());
                        output.accept(EOItems.TINY_IRIDIUM_DUST.get());
                        output.accept(EOItems.TINY_SULFUR_DUST.get());
                        output.accept(EOItems.TINY_FLUORITE_DUST.get());
                        output.accept(EOItems.TINY_STEEL_DUST.get());
                        output.accept(EOItems.TINY_ELECTRUM_DUST.get());
                        output.accept(EOItems.TINY_CONSTANTAN_DUST.get());
                        output.accept(EOItems.TINY_INVAR_DUST.get());
                        output.accept(EOItems.TINY_BRONZE_DUST.get());
                        output.accept(EOItems.TINY_STAINLESS_STEEL_DUST.get());
                        output.accept(EOItems.TINY_RED_ALLOY_DUST.get());

                        // ── Plates ──────────────────────────────────────────────────────
                        output.accept(EOItems.IRON_PLATE.get());
                        output.accept(EOItems.GOLD_PLATE.get());
                        output.accept(EOItems.COPPER_PLATE.get());
                        output.accept(EOItems.TIN_PLATE.get());
                        output.accept(EOItems.LEAD_PLATE.get());
                        output.accept(EOItems.NICKEL_PLATE.get());
                        output.accept(EOItems.ALUMINUM_PLATE.get());
                        output.accept(EOItems.ZINC_PLATE.get());
                        output.accept(EOItems.SILVER_PLATE.get());
                        output.accept(EOItems.URANIUM_PLATE.get());
                        output.accept(EOItems.PLATINUM_PLATE.get());
                        output.accept(EOItems.OSMIUM_PLATE.get());
                        output.accept(EOItems.BISMUTH_PLATE.get());
                        output.accept(EOItems.TUNGSTEN_PLATE.get());
                        output.accept(EOItems.IRIDIUM_PLATE.get());
                        output.accept(EOItems.STEEL_PLATE.get());
                        output.accept(EOItems.ELECTRUM_PLATE.get());
                        output.accept(EOItems.CONSTANTAN_PLATE.get());
                        output.accept(EOItems.INVAR_PLATE.get());
                        output.accept(EOItems.BRONZE_PLATE.get());
                        output.accept(EOItems.STAINLESS_STEEL_PLATE.get());
                        output.accept(EOItems.RED_ALLOY_PLATE.get());

                        // ── Armor ─────────────────────────────────────────────────────
                        output.accept(EOArmor.BRONZE_HELMET.get());
                        output.accept(EOArmor.BRONZE_CHESTPLATE.get());
                        output.accept(EOArmor.BRONZE_LEGGINGS.get());
                        output.accept(EOArmor.BRONZE_BOOTS.get());
                        output.accept(EOArmor.ALUMINUM_HELMET.get());
                        output.accept(EOArmor.ALUMINUM_CHESTPLATE.get());
                        output.accept(EOArmor.ALUMINUM_LEGGINGS.get());
                        output.accept(EOArmor.ALUMINUM_BOOTS.get());
                        output.accept(EOArmor.ELECTRUM_HELMET.get());
                        output.accept(EOArmor.ELECTRUM_CHESTPLATE.get());
                        output.accept(EOArmor.ELECTRUM_LEGGINGS.get());
                        output.accept(EOArmor.ELECTRUM_BOOTS.get());
                        output.accept(EOArmor.NICKEL_HELMET.get());
                        output.accept(EOArmor.NICKEL_CHESTPLATE.get());
                        output.accept(EOArmor.NICKEL_LEGGINGS.get());
                        output.accept(EOArmor.NICKEL_BOOTS.get());
                        output.accept(EOArmor.INVAR_HELMET.get());
                        output.accept(EOArmor.INVAR_CHESTPLATE.get());
                        output.accept(EOArmor.INVAR_LEGGINGS.get());
                        output.accept(EOArmor.INVAR_BOOTS.get());
                        output.accept(EOArmor.CONSTANTAN_HELMET.get());
                        output.accept(EOArmor.CONSTANTAN_CHESTPLATE.get());
                        output.accept(EOArmor.CONSTANTAN_LEGGINGS.get());
                        output.accept(EOArmor.CONSTANTAN_BOOTS.get());
                        output.accept(EOArmor.SILVER_HELMET.get());
                        output.accept(EOArmor.SILVER_CHESTPLATE.get());
                        output.accept(EOArmor.SILVER_LEGGINGS.get());
                        output.accept(EOArmor.SILVER_BOOTS.get());
                        output.accept(EOArmor.BISMUTH_HELMET.get());
                        output.accept(EOArmor.BISMUTH_CHESTPLATE.get());
                        output.accept(EOArmor.BISMUTH_LEGGINGS.get());
                        output.accept(EOArmor.BISMUTH_BOOTS.get());
                        output.accept(EOArmor.STEEL_HELMET.get());
                        output.accept(EOArmor.STEEL_CHESTPLATE.get());
                        output.accept(EOArmor.STEEL_LEGGINGS.get());
                        output.accept(EOArmor.STEEL_BOOTS.get());
                        output.accept(EOArmor.STAINLESS_STEEL_HELMET.get());
                        output.accept(EOArmor.STAINLESS_STEEL_CHESTPLATE.get());
                        output.accept(EOArmor.STAINLESS_STEEL_LEGGINGS.get());
                        output.accept(EOArmor.STAINLESS_STEEL_BOOTS.get());
                        output.accept(EOArmor.PLATINUM_HELMET.get());
                        output.accept(EOArmor.PLATINUM_CHESTPLATE.get());
                        output.accept(EOArmor.PLATINUM_LEGGINGS.get());
                        output.accept(EOArmor.PLATINUM_BOOTS.get());
                        output.accept(EOArmor.TUNGSTEN_HELMET.get());
                        output.accept(EOArmor.TUNGSTEN_CHESTPLATE.get());
                        output.accept(EOArmor.TUNGSTEN_LEGGINGS.get());
                        output.accept(EOArmor.TUNGSTEN_BOOTS.get());
                        output.accept(EOArmor.IRIDIUM_HELMET.get());
                        output.accept(EOArmor.IRIDIUM_CHESTPLATE.get());
                        output.accept(EOArmor.IRIDIUM_LEGGINGS.get());
                        output.accept(EOArmor.IRIDIUM_BOOTS.get());

                        // ── Tools ──────────────────────────────────────────────────────────
                        output.accept(EOTools.BRONZE_SWORD.get());
                        output.accept(EOTools.BRONZE_PICKAXE.get());
                        output.accept(EOTools.BRONZE_AXE.get());
                        output.accept(EOTools.BRONZE_SHOVEL.get());
                        output.accept(EOTools.BRONZE_HOE.get());
                        output.accept(EOTools.ALUMINUM_SWORD.get());
                        output.accept(EOTools.ALUMINUM_PICKAXE.get());
                        output.accept(EOTools.ALUMINUM_AXE.get());
                        output.accept(EOTools.ALUMINUM_SHOVEL.get());
                        output.accept(EOTools.ALUMINUM_HOE.get());
                        output.accept(EOTools.ELECTRUM_SWORD.get());
                        output.accept(EOTools.ELECTRUM_PICKAXE.get());
                        output.accept(EOTools.ELECTRUM_AXE.get());
                        output.accept(EOTools.ELECTRUM_SHOVEL.get());
                        output.accept(EOTools.ELECTRUM_HOE.get());
                        output.accept(EOTools.NICKEL_SWORD.get());
                        output.accept(EOTools.NICKEL_PICKAXE.get());
                        output.accept(EOTools.NICKEL_AXE.get());
                        output.accept(EOTools.NICKEL_SHOVEL.get());
                        output.accept(EOTools.NICKEL_HOE.get());
                        output.accept(EOTools.SILVER_SWORD.get());
                        output.accept(EOTools.SILVER_PICKAXE.get());
                        output.accept(EOTools.SILVER_AXE.get());
                        output.accept(EOTools.SILVER_SHOVEL.get());
                        output.accept(EOTools.SILVER_HOE.get());
                        output.accept(EOTools.INVAR_SWORD.get());
                        output.accept(EOTools.INVAR_PICKAXE.get());
                        output.accept(EOTools.INVAR_AXE.get());
                        output.accept(EOTools.INVAR_SHOVEL.get());
                        output.accept(EOTools.INVAR_HOE.get());
                        output.accept(EOTools.CONSTANTAN_SWORD.get());
                        output.accept(EOTools.CONSTANTAN_PICKAXE.get());
                        output.accept(EOTools.CONSTANTAN_AXE.get());
                        output.accept(EOTools.CONSTANTAN_SHOVEL.get());
                        output.accept(EOTools.CONSTANTAN_HOE.get());
                        output.accept(EOTools.BISMUTH_SWORD.get());
                        output.accept(EOTools.BISMUTH_PICKAXE.get());
                        output.accept(EOTools.BISMUTH_AXE.get());
                        output.accept(EOTools.BISMUTH_SHOVEL.get());
                        output.accept(EOTools.BISMUTH_HOE.get());
                        output.accept(EOTools.STEEL_SWORD.get());
                        output.accept(EOTools.STEEL_PICKAXE.get());
                        output.accept(EOTools.STEEL_AXE.get());
                        output.accept(EOTools.STEEL_SHOVEL.get());
                        output.accept(EOTools.STEEL_HOE.get());
                        output.accept(EOTools.STAINLESS_STEEL_SWORD.get());
                        output.accept(EOTools.STAINLESS_STEEL_PICKAXE.get());
                        output.accept(EOTools.STAINLESS_STEEL_AXE.get());
                        output.accept(EOTools.STAINLESS_STEEL_SHOVEL.get());
                        output.accept(EOTools.STAINLESS_STEEL_HOE.get());
                        output.accept(EOTools.PLATINUM_SWORD.get());
                        output.accept(EOTools.PLATINUM_PICKAXE.get());
                        output.accept(EOTools.PLATINUM_AXE.get());
                        output.accept(EOTools.PLATINUM_SHOVEL.get());
                        output.accept(EOTools.PLATINUM_HOE.get());
                        output.accept(EOTools.TUNGSTEN_SWORD.get());
                        output.accept(EOTools.TUNGSTEN_PICKAXE.get());
                        output.accept(EOTools.TUNGSTEN_AXE.get());
                        output.accept(EOTools.TUNGSTEN_SHOVEL.get());
                        output.accept(EOTools.TUNGSTEN_HOE.get());
                        output.accept(EOTools.IRIDIUM_SWORD.get());
                        output.accept(EOTools.IRIDIUM_PICKAXE.get());
                        output.accept(EOTools.IRIDIUM_AXE.get());
                        output.accept(EOTools.IRIDIUM_SHOVEL.get());
                        output.accept(EOTools.IRIDIUM_HOE.get());
                    })
                    .build());
}
