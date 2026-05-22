package dev.forgeeverything.everythingores.registry;

import dev.forgeeverything.everythingores.EverythingOres;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * Registers every item owned by Everything Ores.
 *
 * Three categories:
 *   1. Block items   — one per ore block (registered via registerSimpleBlockItem)
 *   2. Raw ores      — raw_<metal> dropped by metallic ore blocks
 *   3. Ingots/mats   — final processed form for each material
 *
 * Copper is vanilla — no copper items are registered here.
 * Bauxite ore drops raw_aluminum, which smelts into aluminum_ingot.
 */
public class EOItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(EverythingOres.MOD_ID);

    // ----------------------------------------------------------------
    // Block items  (auto-links Item to its Block)
    // ----------------------------------------------------------------

    // Tin
    public static final DeferredItem<BlockItem> TIN_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.TIN_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_TIN_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_TIN_ORE);

    // Lead
    public static final DeferredItem<BlockItem> LEAD_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.LEAD_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_LEAD_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_LEAD_ORE);

    // Nickel
    public static final DeferredItem<BlockItem> NICKEL_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.NICKEL_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_NICKEL_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_NICKEL_ORE);

    // Bauxite
    public static final DeferredItem<BlockItem> BAUXITE_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.BAUXITE_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_BAUXITE_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_BAUXITE_ORE);

    // Zinc
    public static final DeferredItem<BlockItem> ZINC_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.ZINC_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_ZINC_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_ZINC_ORE);

    // Silver
    public static final DeferredItem<BlockItem> SILVER_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.SILVER_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_SILVER_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_SILVER_ORE);

    // Uranium
    public static final DeferredItem<BlockItem> URANIUM_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.URANIUM_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_URANIUM_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_URANIUM_ORE);

    // Platinum
    public static final DeferredItem<BlockItem> PLATINUM_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.PLATINUM_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_PLATINUM_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_PLATINUM_ORE);

    // Sulfur
    public static final DeferredItem<BlockItem> SULFUR_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.SULFUR_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_SULFUR_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_SULFUR_ORE);

    // Saltpeter
    public static final DeferredItem<BlockItem> SALTPETER_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.SALTPETER_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_SALTPETER_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_SALTPETER_ORE);

    // Salt
    public static final DeferredItem<BlockItem> SALT_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.SALT_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_SALT_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_SALT_ORE);

    // Monazite
    public static final DeferredItem<BlockItem> MONAZITE_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.MONAZITE_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_MONAZITE_ORE_ITEM =
            ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_MONAZITE_ORE);

    // ----------------------------------------------------------------
    // Raw ores  (metallic — smelt or process into ingots)
    // ----------------------------------------------------------------
    public static final DeferredItem<Item> RAW_TIN       = ITEMS.registerSimpleItem("raw_tin");
    public static final DeferredItem<Item> RAW_LEAD      = ITEMS.registerSimpleItem("raw_lead");
    public static final DeferredItem<Item> RAW_NICKEL    = ITEMS.registerSimpleItem("raw_nickel");
    public static final DeferredItem<Item> RAW_ALUMINUM  = ITEMS.registerSimpleItem("raw_aluminum");
    public static final DeferredItem<Item> RAW_ZINC      = ITEMS.registerSimpleItem("raw_zinc");
    public static final DeferredItem<Item> RAW_SILVER    = ITEMS.registerSimpleItem("raw_silver");
    public static final DeferredItem<Item> RAW_URANIUM   = ITEMS.registerSimpleItem("raw_uranium");
    public static final DeferredItem<Item> RAW_PLATINUM  = ITEMS.registerSimpleItem("raw_platinum");

    // ----------------------------------------------------------------
    // Ingots  (smelted/processed output for metallic ores)
    // ----------------------------------------------------------------
    public static final DeferredItem<Item> TIN_INGOT      = ITEMS.registerSimpleItem("tin_ingot");
    public static final DeferredItem<Item> LEAD_INGOT     = ITEMS.registerSimpleItem("lead_ingot");
    public static final DeferredItem<Item> NICKEL_INGOT   = ITEMS.registerSimpleItem("nickel_ingot");
    public static final DeferredItem<Item> ALUMINUM_INGOT = ITEMS.registerSimpleItem("aluminum_ingot");
    public static final DeferredItem<Item> ZINC_INGOT     = ITEMS.registerSimpleItem("zinc_ingot");
    public static final DeferredItem<Item> SILVER_INGOT   = ITEMS.registerSimpleItem("silver_ingot");
    public static final DeferredItem<Item> URANIUM_INGOT  = ITEMS.registerSimpleItem("uranium_ingot");
    public static final DeferredItem<Item> PLATINUM_INGOT = ITEMS.registerSimpleItem("platinum_ingot");

    // ----------------------------------------------------------------
    // Mineral drops  (dropped directly from ore blocks, no raw form)
    // ----------------------------------------------------------------
    public static final DeferredItem<Item> SULFUR          = ITEMS.registerSimpleItem("sulfur");
    public static final DeferredItem<Item> SALTPETER       = ITEMS.registerSimpleItem("saltpeter");
    public static final DeferredItem<Item> SALT            = ITEMS.registerSimpleItem("salt");
    public static final DeferredItem<Item> MONAZITE_CRYSTAL = ITEMS.registerSimpleItem("monazite_crystal");
}
