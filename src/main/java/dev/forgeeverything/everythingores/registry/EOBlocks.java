package dev.forgeeverything.everythingores.registry;

import dev.forgeeverything.everythingores.EverythingOres;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * Registers every block owned by Everything Ores.
 *
 * Three block categories:
 *   1. Ore blocks     — stone + deepslate variants (18 materials × 2 = 36 blocks)
 *   2. Storage blocks — 9 ingots → 1 block, all metals + alloys (19 blocks)
 *   3. Raw blocks     — 9 raw ores → 1 block, metallic materials only (13 blocks)
 *
 * Alloys registered here (no ore — crafted from base metals):
 *   Steel, Electrum, Constantan, Invar, Bronze, Stainless Steel
 *
 * Copper is absent from ore/storage blocks — vanilla owns copper_ore,
 * deepslate_copper_ore, and copper_block.
 */
public class EOBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(EverythingOres.MOD_ID);

    // ================================================================
    // HELPERS
    // ================================================================

    private static DeferredBlock<DropExperienceBlock> stoneOre(String name, UniformInt xp,
                                                                float hardness, MapColor color) {
        return BLOCKS.registerBlock(name,
                props -> new DropExperienceBlock(xp, props),
                BlockBehaviour.Properties.of()
                        .mapColor(color).requiresCorrectToolForDrops()
                        .strength(hardness, 3.0F).sound(SoundType.STONE));
    }

    private static DeferredBlock<DropExperienceBlock> deepslateOre(String name, UniformInt xp,
                                                                     float hardness, MapColor color) {
        return BLOCKS.registerBlock(name,
                props -> new DropExperienceBlock(xp, props),
                BlockBehaviour.Properties.of()
                        .mapColor(color).requiresCorrectToolForDrops()
                        .strength(hardness, 3.0F).sound(SoundType.DEEPSLATE));
    }

    /** 9-ingot storage block — drops itself, metal sound. */
    private static DeferredBlock<Block> metalBlock(String name, float hardness, MapColor color) {
        return BLOCKS.registerSimpleBlock(name,
                BlockBehaviour.Properties.of()
                        .mapColor(color).requiresCorrectToolForDrops()
                        .strength(hardness, 6.0F).sound(SoundType.METAL));
    }

    /** 9-raw-ore storage block — drops itself, stone sound. */
    private static DeferredBlock<Block> rawBlock(String name, float hardness, MapColor color) {
        return BLOCKS.registerSimpleBlock(name,
                BlockBehaviour.Properties.of()
                        .mapColor(color).requiresCorrectToolForDrops()
                        .strength(hardness, 3.0F).sound(SoundType.STONE));
    }

    // ================================================================
    // ORE BLOCKS — Original set
    // ================================================================

    public static final DeferredBlock<DropExperienceBlock> TIN_ORE =
            stoneOre("tin_ore", UniformInt.of(0, 2), 3.0F, MapColor.STONE);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_TIN_ORE =
            deepslateOre("deepslate_tin_ore", UniformInt.of(0, 2), 4.5F, MapColor.DEEPSLATE);

    public static final DeferredBlock<DropExperienceBlock> LEAD_ORE =
            stoneOre("lead_ore", UniformInt.of(0, 2), 3.0F, MapColor.STONE);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_LEAD_ORE =
            deepslateOre("deepslate_lead_ore", UniformInt.of(0, 2), 4.5F, MapColor.DEEPSLATE);

    public static final DeferredBlock<DropExperienceBlock> NICKEL_ORE =
            stoneOre("nickel_ore", UniformInt.of(0, 2), 3.0F, MapColor.STONE);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_NICKEL_ORE =
            deepslateOre("deepslate_nickel_ore", UniformInt.of(0, 2), 4.5F, MapColor.DEEPSLATE);

    public static final DeferredBlock<DropExperienceBlock> BAUXITE_ORE =
            stoneOre("bauxite_ore", UniformInt.of(0, 2), 3.0F, MapColor.COLOR_ORANGE);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_BAUXITE_ORE =
            deepslateOre("deepslate_bauxite_ore", UniformInt.of(0, 2), 4.5F, MapColor.DEEPSLATE);

    public static final DeferredBlock<DropExperienceBlock> ZINC_ORE =
            stoneOre("zinc_ore", UniformInt.of(0, 2), 3.0F, MapColor.STONE);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_ZINC_ORE =
            deepslateOre("deepslate_zinc_ore", UniformInt.of(0, 2), 4.5F, MapColor.DEEPSLATE);

    public static final DeferredBlock<DropExperienceBlock> SILVER_ORE =
            stoneOre("silver_ore", UniformInt.of(0, 3), 3.0F, MapColor.STONE);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_SILVER_ORE =
            deepslateOre("deepslate_silver_ore", UniformInt.of(0, 3), 4.5F, MapColor.DEEPSLATE);

    public static final DeferredBlock<DropExperienceBlock> URANIUM_ORE =
            stoneOre("uranium_ore", UniformInt.of(1, 4), 3.0F, MapColor.COLOR_GREEN);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_URANIUM_ORE =
            deepslateOre("deepslate_uranium_ore", UniformInt.of(1, 4), 4.5F, MapColor.DEEPSLATE);

    public static final DeferredBlock<DropExperienceBlock> PLATINUM_ORE =
            stoneOre("platinum_ore", UniformInt.of(2, 5), 3.0F, MapColor.METAL);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_PLATINUM_ORE =
            deepslateOre("deepslate_platinum_ore", UniformInt.of(2, 5), 4.5F, MapColor.DEEPSLATE);

    public static final DeferredBlock<DropExperienceBlock> SULFUR_ORE =
            stoneOre("sulfur_ore", UniformInt.of(2, 5), 2.0F, MapColor.COLOR_YELLOW);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_SULFUR_ORE =
            deepslateOre("deepslate_sulfur_ore", UniformInt.of(2, 5), 3.5F, MapColor.DEEPSLATE);

    public static final DeferredBlock<DropExperienceBlock> SALTPETER_ORE =
            stoneOre("saltpeter_ore", UniformInt.of(1, 3), 2.0F, MapColor.SNOW);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_SALTPETER_ORE =
            deepslateOre("deepslate_saltpeter_ore", UniformInt.of(1, 3), 3.5F, MapColor.DEEPSLATE);

    public static final DeferredBlock<DropExperienceBlock> SALT_ORE =
            stoneOre("salt_ore", UniformInt.of(0, 1), 2.0F, MapColor.SNOW);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_SALT_ORE =
            deepslateOre("deepslate_salt_ore", UniformInt.of(0, 1), 3.5F, MapColor.DEEPSLATE);

    public static final DeferredBlock<DropExperienceBlock> MONAZITE_ORE =
            stoneOre("monazite_ore", UniformInt.of(2, 5), 3.0F, MapColor.COLOR_LIGHT_GRAY);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_MONAZITE_ORE =
            deepslateOre("deepslate_monazite_ore", UniformInt.of(2, 5), 4.5F, MapColor.DEEPSLATE);

    // ================================================================
    // ORE BLOCKS — Unified set
    // ================================================================

    public static final DeferredBlock<DropExperienceBlock> OSMIUM_ORE =
            stoneOre("osmium_ore", UniformInt.of(0, 2), 3.0F, MapColor.COLOR_BLUE);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_OSMIUM_ORE =
            deepslateOre("deepslate_osmium_ore", UniformInt.of(0, 2), 4.5F, MapColor.DEEPSLATE);

    public static final DeferredBlock<DropExperienceBlock> FLUORITE_ORE =
            stoneOre("fluorite_ore", UniformInt.of(2, 4), 2.0F, MapColor.COLOR_CYAN);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_FLUORITE_ORE =
            deepslateOre("deepslate_fluorite_ore", UniformInt.of(2, 4), 3.5F, MapColor.DEEPSLATE);

    public static final DeferredBlock<DropExperienceBlock> BISMUTH_ORE =
            stoneOre("bismuth_ore", UniformInt.of(0, 2), 3.0F, MapColor.COLOR_PINK);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_BISMUTH_ORE =
            deepslateOre("deepslate_bismuth_ore", UniformInt.of(0, 2), 4.5F, MapColor.DEEPSLATE);

    public static final DeferredBlock<DropExperienceBlock> CHROMIUM_ORE =
            stoneOre("chromium_ore", UniformInt.of(1, 3), 3.0F, MapColor.METAL);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_CHROMIUM_ORE =
            deepslateOre("deepslate_chromium_ore", UniformInt.of(1, 3), 4.5F, MapColor.DEEPSLATE);

    public static final DeferredBlock<DropExperienceBlock> TUNGSTEN_ORE =
            stoneOre("tungsten_ore", UniformInt.of(1, 4), 4.5F, MapColor.COLOR_GRAY);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_TUNGSTEN_ORE =
            deepslateOre("deepslate_tungsten_ore", UniformInt.of(1, 4), 6.0F, MapColor.DEEPSLATE);

    public static final DeferredBlock<DropExperienceBlock> IRIDIUM_ORE =
            stoneOre("iridium_ore", UniformInt.of(3, 7), 3.0F, MapColor.GOLD);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_IRIDIUM_ORE =
            deepslateOre("deepslate_iridium_ore", UniformInt.of(3, 7), 4.5F, MapColor.DEEPSLATE);

    // ================================================================
    // RAW ORE STORAGE BLOCKS  (9 raw ores → 1 block)
    // ================================================================

    // Original metals
    public static final DeferredBlock<Block> RAW_TIN_BLOCK      = rawBlock("raw_tin_block",      4.5F, MapColor.STONE);
    public static final DeferredBlock<Block> RAW_LEAD_BLOCK     = rawBlock("raw_lead_block",     4.5F, MapColor.STONE);
    public static final DeferredBlock<Block> RAW_NICKEL_BLOCK   = rawBlock("raw_nickel_block",   4.5F, MapColor.STONE);
    public static final DeferredBlock<Block> RAW_ALUMINUM_BLOCK = rawBlock("raw_aluminum_block", 4.5F, MapColor.COLOR_ORANGE);
    public static final DeferredBlock<Block> RAW_ZINC_BLOCK     = rawBlock("raw_zinc_block",     4.5F, MapColor.STONE);
    public static final DeferredBlock<Block> RAW_SILVER_BLOCK   = rawBlock("raw_silver_block",   4.5F, MapColor.STONE);
    public static final DeferredBlock<Block> RAW_URANIUM_BLOCK  = rawBlock("raw_uranium_block",  4.5F, MapColor.COLOR_GREEN);
    public static final DeferredBlock<Block> RAW_PLATINUM_BLOCK = rawBlock("raw_platinum_block", 4.5F, MapColor.METAL);

    // Unified metals
    public static final DeferredBlock<Block> RAW_OSMIUM_BLOCK   = rawBlock("raw_osmium_block",   4.5F, MapColor.COLOR_BLUE);
    public static final DeferredBlock<Block> RAW_BISMUTH_BLOCK  = rawBlock("raw_bismuth_block",  4.5F, MapColor.COLOR_PINK);
    public static final DeferredBlock<Block> RAW_CHROMIUM_BLOCK = rawBlock("raw_chromium_block", 4.5F, MapColor.METAL);
    public static final DeferredBlock<Block> RAW_TUNGSTEN_BLOCK = rawBlock("raw_tungsten_block", 5.5F, MapColor.COLOR_GRAY);
    public static final DeferredBlock<Block> RAW_IRIDIUM_BLOCK  = rawBlock("raw_iridium_block",  4.5F, MapColor.GOLD);

    // ================================================================
    // METAL STORAGE BLOCKS  (9 ingots → 1 block)
    // ================================================================

    // Original metals
    public static final DeferredBlock<Block> TIN_BLOCK      = metalBlock("tin_block",      5.0F, MapColor.METAL);
    public static final DeferredBlock<Block> LEAD_BLOCK     = metalBlock("lead_block",     5.0F, MapColor.COLOR_GRAY);
    public static final DeferredBlock<Block> NICKEL_BLOCK   = metalBlock("nickel_block",   5.0F, MapColor.METAL);
    public static final DeferredBlock<Block> ALUMINUM_BLOCK = metalBlock("aluminum_block", 5.0F, MapColor.METAL);
    public static final DeferredBlock<Block> ZINC_BLOCK     = metalBlock("zinc_block",     5.0F, MapColor.METAL);
    public static final DeferredBlock<Block> SILVER_BLOCK   = metalBlock("silver_block",   5.0F, MapColor.METAL);
    public static final DeferredBlock<Block> URANIUM_BLOCK  = metalBlock("uranium_block",  6.0F, MapColor.COLOR_GREEN);
    public static final DeferredBlock<Block> PLATINUM_BLOCK = metalBlock("platinum_block", 5.0F, MapColor.GOLD);

    // Unified metals
    public static final DeferredBlock<Block> OSMIUM_BLOCK   = metalBlock("osmium_block",   5.0F, MapColor.COLOR_BLUE);
    public static final DeferredBlock<Block> BISMUTH_BLOCK  = metalBlock("bismuth_block",  5.0F, MapColor.COLOR_PINK);
    public static final DeferredBlock<Block> CHROMIUM_BLOCK = metalBlock("chromium_block", 5.0F, MapColor.METAL);
    public static final DeferredBlock<Block> TUNGSTEN_BLOCK = metalBlock("tungsten_block", 7.0F, MapColor.COLOR_GRAY);
    public static final DeferredBlock<Block> IRIDIUM_BLOCK  = metalBlock("iridium_block",  6.0F, MapColor.GOLD);

    // ================================================================
    // ALLOY STORAGE BLOCKS  (9 ingots → 1 block, no ore counterpart)
    // ================================================================

    public static final DeferredBlock<Block> STEEL_BLOCK           = metalBlock("steel_block",           6.0F, MapColor.METAL);
    public static final DeferredBlock<Block> ELECTRUM_BLOCK        = metalBlock("electrum_block",        5.0F, MapColor.GOLD);
    public static final DeferredBlock<Block> CONSTANTAN_BLOCK      = metalBlock("constantan_block",      5.0F, MapColor.METAL);
    public static final DeferredBlock<Block> INVAR_BLOCK           = metalBlock("invar_block",           5.0F, MapColor.METAL);
    public static final DeferredBlock<Block> BRONZE_BLOCK          = metalBlock("bronze_block",          5.0F, MapColor.COLOR_ORANGE);
    public static final DeferredBlock<Block> STAINLESS_STEEL_BLOCK = metalBlock("stainless_steel_block", 6.0F, MapColor.METAL);
}
