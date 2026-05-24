package dev.forgeeverything.everythingores.registry;

import dev.forgeeverything.everythingores.EverythingOres;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * Registers every item owned by Everything Ores.
 *
 * Six sections:
 *   1. Block items      — one per ore/storage/raw block
 *   2. Raw ores         — raw_<metal>, dropped by metallic ore blocks
 *   3. Ingots           — base metal ingots (original + unified)
 *   4. Alloy ingots     — steel, electrum, constantan, invar, bronze, stainless steel
 *   5. Mineral drops    — direct drops from non-metallic ore blocks (no raw form)
 *   6. Dusts            — ground form of every metal + alloy + vanilla metals
 *
 * Copper is vanilla — no copper items registered here.
 * Bauxite drops raw_aluminum → aluminum_ingot.
 */
public class EOItems {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(EverythingOres.MOD_ID);

    // ================================================================
    // BLOCK ITEMS — Ore blocks
    // ================================================================

    // Original ores
    public static final DeferredItem<BlockItem> TIN_ORE_ITEM                 = ITEMS.registerSimpleBlockItem(EOBlocks.TIN_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_TIN_ORE_ITEM       = ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_TIN_ORE);
    public static final DeferredItem<BlockItem> LEAD_ORE_ITEM                = ITEMS.registerSimpleBlockItem(EOBlocks.LEAD_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_LEAD_ORE_ITEM      = ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_LEAD_ORE);
    public static final DeferredItem<BlockItem> NICKEL_ORE_ITEM              = ITEMS.registerSimpleBlockItem(EOBlocks.NICKEL_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_NICKEL_ORE_ITEM    = ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_NICKEL_ORE);
    public static final DeferredItem<BlockItem> BAUXITE_ORE_ITEM             = ITEMS.registerSimpleBlockItem(EOBlocks.BAUXITE_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_BAUXITE_ORE_ITEM   = ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_BAUXITE_ORE);
    public static final DeferredItem<BlockItem> ZINC_ORE_ITEM                = ITEMS.registerSimpleBlockItem(EOBlocks.ZINC_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_ZINC_ORE_ITEM      = ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_ZINC_ORE);
    public static final DeferredItem<BlockItem> SILVER_ORE_ITEM              = ITEMS.registerSimpleBlockItem(EOBlocks.SILVER_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_SILVER_ORE_ITEM    = ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_SILVER_ORE);
    public static final DeferredItem<BlockItem> URANIUM_ORE_ITEM             = ITEMS.registerSimpleBlockItem(EOBlocks.URANIUM_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_URANIUM_ORE_ITEM   = ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_URANIUM_ORE);
    public static final DeferredItem<BlockItem> PLATINUM_ORE_ITEM            = ITEMS.registerSimpleBlockItem(EOBlocks.PLATINUM_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_PLATINUM_ORE_ITEM  = ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_PLATINUM_ORE);
    public static final DeferredItem<BlockItem> SULFUR_ORE_ITEM              = ITEMS.registerSimpleBlockItem(EOBlocks.SULFUR_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_SULFUR_ORE_ITEM    = ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_SULFUR_ORE);
    public static final DeferredItem<BlockItem> SALTPETER_ORE_ITEM           = ITEMS.registerSimpleBlockItem(EOBlocks.SALTPETER_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_SALTPETER_ORE_ITEM = ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_SALTPETER_ORE);
    public static final DeferredItem<BlockItem> SALT_ORE_ITEM                = ITEMS.registerSimpleBlockItem(EOBlocks.SALT_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_SALT_ORE_ITEM      = ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_SALT_ORE);
    public static final DeferredItem<BlockItem> MONAZITE_ORE_ITEM            = ITEMS.registerSimpleBlockItem(EOBlocks.MONAZITE_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_MONAZITE_ORE_ITEM  = ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_MONAZITE_ORE);

    // Unified ores
    public static final DeferredItem<BlockItem> OSMIUM_ORE_ITEM              = ITEMS.registerSimpleBlockItem(EOBlocks.OSMIUM_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_OSMIUM_ORE_ITEM    = ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_OSMIUM_ORE);
    public static final DeferredItem<BlockItem> FLUORITE_ORE_ITEM            = ITEMS.registerSimpleBlockItem(EOBlocks.FLUORITE_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_FLUORITE_ORE_ITEM  = ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_FLUORITE_ORE);
    public static final DeferredItem<BlockItem> BISMUTH_ORE_ITEM             = ITEMS.registerSimpleBlockItem(EOBlocks.BISMUTH_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_BISMUTH_ORE_ITEM   = ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_BISMUTH_ORE);
    public static final DeferredItem<BlockItem> CHROMITE_ORE_ITEM            = ITEMS.registerSimpleBlockItem(EOBlocks.CHROMITE_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_CHROMITE_ORE_ITEM  = ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_CHROMITE_ORE);
    public static final DeferredItem<BlockItem> TUNGSTEN_ORE_ITEM            = ITEMS.registerSimpleBlockItem(EOBlocks.TUNGSTEN_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_TUNGSTEN_ORE_ITEM  = ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_TUNGSTEN_ORE);
    public static final DeferredItem<BlockItem> IRIDIUM_ORE_ITEM             = ITEMS.registerSimpleBlockItem(EOBlocks.IRIDIUM_ORE);
    public static final DeferredItem<BlockItem> DEEPSLATE_IRIDIUM_ORE_ITEM   = ITEMS.registerSimpleBlockItem(EOBlocks.DEEPSLATE_IRIDIUM_ORE);

    // ================================================================
    // BLOCK ITEMS — Raw ore storage blocks
    // ================================================================

    public static final DeferredItem<BlockItem> RAW_TIN_BLOCK_ITEM      = ITEMS.registerSimpleBlockItem(EOBlocks.RAW_TIN_BLOCK);
    public static final DeferredItem<BlockItem> RAW_LEAD_BLOCK_ITEM     = ITEMS.registerSimpleBlockItem(EOBlocks.RAW_LEAD_BLOCK);
    public static final DeferredItem<BlockItem> RAW_NICKEL_BLOCK_ITEM   = ITEMS.registerSimpleBlockItem(EOBlocks.RAW_NICKEL_BLOCK);
    public static final DeferredItem<BlockItem> RAW_ALUMINUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(EOBlocks.RAW_ALUMINUM_BLOCK);
    public static final DeferredItem<BlockItem> RAW_ZINC_BLOCK_ITEM     = ITEMS.registerSimpleBlockItem(EOBlocks.RAW_ZINC_BLOCK);
    public static final DeferredItem<BlockItem> RAW_SILVER_BLOCK_ITEM   = ITEMS.registerSimpleBlockItem(EOBlocks.RAW_SILVER_BLOCK);
    public static final DeferredItem<BlockItem> RAW_URANIUM_BLOCK_ITEM  = ITEMS.registerSimpleBlockItem(EOBlocks.RAW_URANIUM_BLOCK);
    public static final DeferredItem<BlockItem> RAW_PLATINUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(EOBlocks.RAW_PLATINUM_BLOCK);
    public static final DeferredItem<BlockItem> RAW_OSMIUM_BLOCK_ITEM   = ITEMS.registerSimpleBlockItem(EOBlocks.RAW_OSMIUM_BLOCK);
    public static final DeferredItem<BlockItem> RAW_BISMUTH_BLOCK_ITEM  = ITEMS.registerSimpleBlockItem(EOBlocks.RAW_BISMUTH_BLOCK);
    public static final DeferredItem<BlockItem> RAW_CHROMITE_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(EOBlocks.RAW_CHROMITE_BLOCK);
    public static final DeferredItem<BlockItem> RAW_TUNGSTEN_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(EOBlocks.RAW_TUNGSTEN_BLOCK);
    public static final DeferredItem<BlockItem> RAW_IRIDIUM_BLOCK_ITEM  = ITEMS.registerSimpleBlockItem(EOBlocks.RAW_IRIDIUM_BLOCK);

    // ================================================================
    // BLOCK ITEMS — Metal storage blocks
    // ================================================================

    // Original metals
    public static final DeferredItem<BlockItem> TIN_BLOCK_ITEM      = ITEMS.registerSimpleBlockItem(EOBlocks.TIN_BLOCK);
    public static final DeferredItem<BlockItem> LEAD_BLOCK_ITEM     = ITEMS.registerSimpleBlockItem(EOBlocks.LEAD_BLOCK);
    public static final DeferredItem<BlockItem> NICKEL_BLOCK_ITEM   = ITEMS.registerSimpleBlockItem(EOBlocks.NICKEL_BLOCK);
    public static final DeferredItem<BlockItem> ALUMINUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(EOBlocks.ALUMINUM_BLOCK);
    public static final DeferredItem<BlockItem> ZINC_BLOCK_ITEM     = ITEMS.registerSimpleBlockItem(EOBlocks.ZINC_BLOCK);
    public static final DeferredItem<BlockItem> SILVER_BLOCK_ITEM   = ITEMS.registerSimpleBlockItem(EOBlocks.SILVER_BLOCK);
    public static final DeferredItem<BlockItem> URANIUM_BLOCK_ITEM  = ITEMS.registerSimpleBlockItem(EOBlocks.URANIUM_BLOCK);
    public static final DeferredItem<BlockItem> PLATINUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(EOBlocks.PLATINUM_BLOCK);

    // Unified metals
    public static final DeferredItem<BlockItem> OSMIUM_BLOCK_ITEM   = ITEMS.registerSimpleBlockItem(EOBlocks.OSMIUM_BLOCK);
    public static final DeferredItem<BlockItem> BISMUTH_BLOCK_ITEM  = ITEMS.registerSimpleBlockItem(EOBlocks.BISMUTH_BLOCK);
    public static final DeferredItem<BlockItem> CHROMIUM_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(EOBlocks.CHROMIUM_BLOCK);
    public static final DeferredItem<BlockItem> TUNGSTEN_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(EOBlocks.TUNGSTEN_BLOCK);
    public static final DeferredItem<BlockItem> IRIDIUM_BLOCK_ITEM  = ITEMS.registerSimpleBlockItem(EOBlocks.IRIDIUM_BLOCK);

    // ================================================================
    // BLOCK ITEMS — Alloy storage blocks
    // ================================================================

    public static final DeferredItem<BlockItem> STEEL_BLOCK_ITEM           = ITEMS.registerSimpleBlockItem(EOBlocks.STEEL_BLOCK);
    public static final DeferredItem<BlockItem> ELECTRUM_BLOCK_ITEM        = ITEMS.registerSimpleBlockItem(EOBlocks.ELECTRUM_BLOCK);
    public static final DeferredItem<BlockItem> CONSTANTAN_BLOCK_ITEM      = ITEMS.registerSimpleBlockItem(EOBlocks.CONSTANTAN_BLOCK);
    public static final DeferredItem<BlockItem> INVAR_BLOCK_ITEM           = ITEMS.registerSimpleBlockItem(EOBlocks.INVAR_BLOCK);
    public static final DeferredItem<BlockItem> BRONZE_BLOCK_ITEM          = ITEMS.registerSimpleBlockItem(EOBlocks.BRONZE_BLOCK);
    public static final DeferredItem<BlockItem> STAINLESS_STEEL_BLOCK_ITEM = ITEMS.registerSimpleBlockItem(EOBlocks.STAINLESS_STEEL_BLOCK);
    public static final DeferredItem<BlockItem> RED_ALLOY_BLOCK_ITEM       = ITEMS.registerSimpleBlockItem(EOBlocks.RED_ALLOY_BLOCK);

    // ================================================================
    // RAW ORES  (dropped by metallic ore blocks)
    // ================================================================

    // Original metals
    public static final DeferredItem<Item> RAW_TIN      = ITEMS.registerSimpleItem("raw_tin");
    public static final DeferredItem<Item> RAW_LEAD     = ITEMS.registerSimpleItem("raw_lead");
    public static final DeferredItem<Item> RAW_NICKEL   = ITEMS.registerSimpleItem("raw_nickel");
    public static final DeferredItem<Item> RAW_ALUMINUM = ITEMS.registerSimpleItem("raw_aluminum");
    public static final DeferredItem<Item> RAW_ZINC     = ITEMS.registerSimpleItem("raw_zinc");
    public static final DeferredItem<Item> RAW_SILVER   = ITEMS.registerSimpleItem("raw_silver");
    public static final DeferredItem<Item> RAW_URANIUM  = ITEMS.registerSimpleItem("raw_uranium");
    public static final DeferredItem<Item> RAW_PLATINUM = ITEMS.registerSimpleItem("raw_platinum");

    // Unified metals
    public static final DeferredItem<Item> RAW_OSMIUM   = ITEMS.registerSimpleItem("raw_osmium");
    public static final DeferredItem<Item> RAW_BISMUTH  = ITEMS.registerSimpleItem("raw_bismuth");
    public static final DeferredItem<Item> RAW_CHROMITE = ITEMS.registerSimpleItem("raw_chromite");
    public static final DeferredItem<Item> RAW_TUNGSTEN = ITEMS.registerSimpleItem("raw_tungsten");
    public static final DeferredItem<Item> RAW_IRIDIUM  = ITEMS.registerSimpleItem("raw_iridium");

    // ================================================================
    // INGOTS — Base metals
    // ================================================================

    // Original metals
    public static final DeferredItem<Item> TIN_INGOT      = ITEMS.registerSimpleItem("tin_ingot");
    public static final DeferredItem<Item> LEAD_INGOT     = ITEMS.registerSimpleItem("lead_ingot");
    public static final DeferredItem<Item> NICKEL_INGOT   = ITEMS.registerSimpleItem("nickel_ingot");
    public static final DeferredItem<Item> ALUMINUM_INGOT = ITEMS.registerSimpleItem("aluminum_ingot");
    public static final DeferredItem<Item> ZINC_INGOT     = ITEMS.registerSimpleItem("zinc_ingot");
    public static final DeferredItem<Item> SILVER_INGOT   = ITEMS.registerSimpleItem("silver_ingot");
    public static final DeferredItem<Item> URANIUM_INGOT  = ITEMS.registerSimpleItem("uranium_ingot");
    public static final DeferredItem<Item> PLATINUM_INGOT = ITEMS.registerSimpleItem("platinum_ingot");

    // Unified metals
    public static final DeferredItem<Item> OSMIUM_INGOT   = ITEMS.registerSimpleItem("osmium_ingot");
    public static final DeferredItem<Item> BISMUTH_INGOT  = ITEMS.registerSimpleItem("bismuth_ingot");
    public static final DeferredItem<Item> CHROMIUM_INGOT = ITEMS.registerSimpleItem("chromium_ingot");
    public static final DeferredItem<Item> TUNGSTEN_INGOT = ITEMS.registerSimpleItem("tungsten_ingot");
    public static final DeferredItem<Item> IRIDIUM_INGOT  = ITEMS.registerSimpleItem("iridium_ingot");

    // ================================================================
    // INGOTS — Alloys  (no ore block; crafted from base metals)
    // ================================================================

    public static final DeferredItem<Item> STEEL_INGOT          = ITEMS.registerSimpleItem("steel_ingot");
    public static final DeferredItem<Item> ELECTRUM_INGOT       = ITEMS.registerSimpleItem("electrum_ingot");
    public static final DeferredItem<Item> CONSTANTAN_INGOT     = ITEMS.registerSimpleItem("constantan_ingot");
    public static final DeferredItem<Item> INVAR_INGOT          = ITEMS.registerSimpleItem("invar_ingot");
    public static final DeferredItem<Item> BRONZE_INGOT         = ITEMS.registerSimpleItem("bronze_ingot");
    public static final DeferredItem<Item> STAINLESS_STEEL_INGOT = ITEMS.registerSimpleItem("stainless_steel_ingot");
    // Red Alloy — Cu + Redstone. Absorbs MoreRed:red_alloy_ingot and EnderIO:redstone_alloy_ingot.
    public static final DeferredItem<Item> RED_ALLOY_INGOT      = ITEMS.registerSimpleItem("red_alloy_ingot");

    // ================================================================
    // MINERAL DROPS  (dropped directly from non-metallic ore blocks)
    // ================================================================

    public static final DeferredItem<Item> SULFUR           = ITEMS.registerSimpleItem("sulfur");
    public static final DeferredItem<Item> SALTPETER        = ITEMS.registerSimpleItem("saltpeter");
    public static final DeferredItem<Item> SALT             = ITEMS.registerSimpleItem("salt");
    public static final DeferredItem<Item> MONAZITE_CRYSTAL = ITEMS.registerSimpleItem("monazite_crystal");
    public static final DeferredItem<Item> FLUORITE_CRYSTAL = ITEMS.registerSimpleItem("fluorite_crystal");

    // ================================================================
    // DUSTS
    //
    // Registered here so EO is the canonical source across the pack.
    // Almost Unified redirects competing mods' recipes to these items.
    // Tags (neoforge:dusts/<metal>) wire them into Mekanism / IE machines.
    // ================================================================

    // Vanilla metals — Mekanism and IE both produce these; EO owns the item
    public static final DeferredItem<Item> IRON_DUST   = ITEMS.registerSimpleItem("iron_dust");
    public static final DeferredItem<Item> GOLD_DUST   = ITEMS.registerSimpleItem("gold_dust");
    public static final DeferredItem<Item> COPPER_DUST = ITEMS.registerSimpleItem("copper_dust");

    // Original metals
    public static final DeferredItem<Item> TIN_DUST      = ITEMS.registerSimpleItem("tin_dust");
    public static final DeferredItem<Item> LEAD_DUST     = ITEMS.registerSimpleItem("lead_dust");
    public static final DeferredItem<Item> NICKEL_DUST   = ITEMS.registerSimpleItem("nickel_dust");
    public static final DeferredItem<Item> ALUMINUM_DUST = ITEMS.registerSimpleItem("aluminum_dust");
    public static final DeferredItem<Item> ZINC_DUST     = ITEMS.registerSimpleItem("zinc_dust");
    public static final DeferredItem<Item> SILVER_DUST   = ITEMS.registerSimpleItem("silver_dust");
    public static final DeferredItem<Item> URANIUM_DUST  = ITEMS.registerSimpleItem("uranium_dust");
    public static final DeferredItem<Item> PLATINUM_DUST = ITEMS.registerSimpleItem("platinum_dust");

    // Unified metals
    public static final DeferredItem<Item> OSMIUM_DUST   = ITEMS.registerSimpleItem("osmium_dust");
    public static final DeferredItem<Item> BISMUTH_DUST  = ITEMS.registerSimpleItem("bismuth_dust");
    public static final DeferredItem<Item> CHROMIUM_DUST = ITEMS.registerSimpleItem("chromium_dust");
		public static final DeferredItem<Item> CHROMITE_DUST = ITEMS.registerSimpleItem("chromite_dust");
    public static final DeferredItem<Item> TUNGSTEN_DUST = ITEMS.registerSimpleItem("tungsten_dust");
    public static final DeferredItem<Item> IRIDIUM_DUST  = ITEMS.registerSimpleItem("iridium_dust");

    // Minerals with a dust form used by other mods
    public static final DeferredItem<Item> SULFUR_DUST   = ITEMS.registerSimpleItem("sulfur_dust");
    public static final DeferredItem<Item> FLUORITE_DUST = ITEMS.registerSimpleItem("fluorite_dust");

    // Alloy dusts
    public static final DeferredItem<Item> STEEL_DUST           = ITEMS.registerSimpleItem("steel_dust");
    public static final DeferredItem<Item> ELECTRUM_DUST        = ITEMS.registerSimpleItem("electrum_dust");
    public static final DeferredItem<Item> CONSTANTAN_DUST      = ITEMS.registerSimpleItem("constantan_dust");
    public static final DeferredItem<Item> INVAR_DUST           = ITEMS.registerSimpleItem("invar_dust");
    public static final DeferredItem<Item> BRONZE_DUST          = ITEMS.registerSimpleItem("bronze_dust");
    public static final DeferredItem<Item> STAINLESS_STEEL_DUST = ITEMS.registerSimpleItem("stainless_steel_dust");
    public static final DeferredItem<Item> RED_ALLOY_DUST       = ITEMS.registerSimpleItem("red_alloy_dust");

    // ================================================================
    // TINY DUSTS  (1/9 of a full dust — used in Mekanism ore processing
    //             and several other tech mod processing chains)
    // ================================================================

    // Vanilla metals
    public static final DeferredItem<Item> TINY_IRON_DUST   = ITEMS.registerSimpleItem("tiny_iron_dust");
    public static final DeferredItem<Item> TINY_GOLD_DUST   = ITEMS.registerSimpleItem("tiny_gold_dust");
    public static final DeferredItem<Item> TINY_COPPER_DUST = ITEMS.registerSimpleItem("tiny_copper_dust");

    // Original metals
    public static final DeferredItem<Item> TINY_TIN_DUST      = ITEMS.registerSimpleItem("tiny_tin_dust");
    public static final DeferredItem<Item> TINY_LEAD_DUST     = ITEMS.registerSimpleItem("tiny_lead_dust");
    public static final DeferredItem<Item> TINY_NICKEL_DUST   = ITEMS.registerSimpleItem("tiny_nickel_dust");
    public static final DeferredItem<Item> TINY_ALUMINUM_DUST = ITEMS.registerSimpleItem("tiny_aluminum_dust");
    public static final DeferredItem<Item> TINY_ZINC_DUST     = ITEMS.registerSimpleItem("tiny_zinc_dust");
    public static final DeferredItem<Item> TINY_SILVER_DUST   = ITEMS.registerSimpleItem("tiny_silver_dust");
    public static final DeferredItem<Item> TINY_URANIUM_DUST  = ITEMS.registerSimpleItem("tiny_uranium_dust");
    public static final DeferredItem<Item> TINY_PLATINUM_DUST = ITEMS.registerSimpleItem("tiny_platinum_dust");

    // Unified metals
    public static final DeferredItem<Item> TINY_OSMIUM_DUST   = ITEMS.registerSimpleItem("tiny_osmium_dust");
    public static final DeferredItem<Item> TINY_BISMUTH_DUST  = ITEMS.registerSimpleItem("tiny_bismuth_dust");
    public static final DeferredItem<Item> TINY_TUNGSTEN_DUST = ITEMS.registerSimpleItem("tiny_tungsten_dust");
    public static final DeferredItem<Item> TINY_IRIDIUM_DUST  = ITEMS.registerSimpleItem("tiny_iridium_dust");
		public static final DeferredItem<Item> TINY_CHROMIUM_DUST = ITEMS.registerSimpleItem("tiny_chromium_dust");
		public static final DeferredItem<Item> TINY_CHROMITE_DUST = ITEMS.registerSimpleItem("tiny_chromite_dust");

    // Minerals
    public static final DeferredItem<Item> TINY_SULFUR_DUST   = ITEMS.registerSimpleItem("tiny_sulfur_dust");
    public static final DeferredItem<Item> TINY_FLUORITE_DUST = ITEMS.registerSimpleItem("tiny_fluorite_dust");

    // Alloys
    public static final DeferredItem<Item> TINY_STEEL_DUST           = ITEMS.registerSimpleItem("tiny_steel_dust");
    public static final DeferredItem<Item> TINY_ELECTRUM_DUST        = ITEMS.registerSimpleItem("tiny_electrum_dust");
    public static final DeferredItem<Item> TINY_CONSTANTAN_DUST      = ITEMS.registerSimpleItem("tiny_constantan_dust");
    public static final DeferredItem<Item> TINY_INVAR_DUST           = ITEMS.registerSimpleItem("tiny_invar_dust");
    public static final DeferredItem<Item> TINY_BRONZE_DUST          = ITEMS.registerSimpleItem("tiny_bronze_dust");
    public static final DeferredItem<Item> TINY_STAINLESS_STEEL_DUST = ITEMS.registerSimpleItem("tiny_stainless_steel_dust");
    public static final DeferredItem<Item> TINY_RED_ALLOY_DUST       = ITEMS.registerSimpleItem("tiny_red_alloy_dust");

    // ================================================================
    // PLATES  (pressed ingot form — used by IE, Mekanism, MI, and
    //          many other tech mods in their crafting recipes)
    // ================================================================

    // Vanilla metals
    public static final DeferredItem<Item> IRON_PLATE   = ITEMS.registerSimpleItem("iron_plate");
    public static final DeferredItem<Item> GOLD_PLATE   = ITEMS.registerSimpleItem("gold_plate");
    public static final DeferredItem<Item> COPPER_PLATE = ITEMS.registerSimpleItem("copper_plate");

    // Original metals
    public static final DeferredItem<Item> TIN_PLATE      = ITEMS.registerSimpleItem("tin_plate");
    public static final DeferredItem<Item> LEAD_PLATE     = ITEMS.registerSimpleItem("lead_plate");
    public static final DeferredItem<Item> NICKEL_PLATE   = ITEMS.registerSimpleItem("nickel_plate");
    public static final DeferredItem<Item> ALUMINUM_PLATE = ITEMS.registerSimpleItem("aluminum_plate");
    public static final DeferredItem<Item> ZINC_PLATE     = ITEMS.registerSimpleItem("zinc_plate");
    public static final DeferredItem<Item> SILVER_PLATE   = ITEMS.registerSimpleItem("silver_plate");
    public static final DeferredItem<Item> URANIUM_PLATE  = ITEMS.registerSimpleItem("uranium_plate");
    public static final DeferredItem<Item> PLATINUM_PLATE = ITEMS.registerSimpleItem("platinum_plate");

    // Unified metals
    public static final DeferredItem<Item> OSMIUM_PLATE   = ITEMS.registerSimpleItem("osmium_plate");
    public static final DeferredItem<Item> BISMUTH_PLATE  = ITEMS.registerSimpleItem("bismuth_plate");
    public static final DeferredItem<Item> TUNGSTEN_PLATE = ITEMS.registerSimpleItem("tungsten_plate");
    public static final DeferredItem<Item> IRIDIUM_PLATE  = ITEMS.registerSimpleItem("iridium_plate");

    // Alloys
    public static final DeferredItem<Item> STEEL_PLATE           = ITEMS.registerSimpleItem("steel_plate");
    public static final DeferredItem<Item> ELECTRUM_PLATE        = ITEMS.registerSimpleItem("electrum_plate");
    public static final DeferredItem<Item> CONSTANTAN_PLATE      = ITEMS.registerSimpleItem("constantan_plate");
    public static final DeferredItem<Item> INVAR_PLATE           = ITEMS.registerSimpleItem("invar_plate");
    public static final DeferredItem<Item> BRONZE_PLATE          = ITEMS.registerSimpleItem("bronze_plate");
    public static final DeferredItem<Item> STAINLESS_STEEL_PLATE = ITEMS.registerSimpleItem("stainless_steel_plate");
    public static final DeferredItem<Item> RED_ALLOY_PLATE       = ITEMS.registerSimpleItem("red_alloy_plate");
}