package dev.forgeeverything.everythingores.registry;

import dev.forgeeverything.everythingores.EverythingOres;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * Registers every ore block owned by Everything Ores.
 *
 * OreBlock was removed in NeoForge 1.21.1 — DropExperienceBlock is the
 * direct replacement. It takes the same UniformInt XP range as its first
 * constructor argument, followed by BlockBehaviour.Properties.
 *
 * Copper is intentionally absent — vanilla owns copper_ore / deepslate_copper_ore.
 * Those blocks are tagged into neoforge:ores/copper via the tag JSON files,
 * and other mods' copper worldgen is suppressed via KubeJS.
 *
 * Ores owned here (12 materials, 24 blocks):
 *   Metallic  → Tin, Lead, Nickel, Zinc, Silver, Uranium, Platinum
 *   Bauxite   → ore block that yields raw_aluminum (→ aluminum_ingot)
 *   Mineral   → Sulfur, Saltpeter, Salt, Monazite
 */
public class EOBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(EverythingOres.MOD_ID);

    // ----------------------------------------------------------------
    // Helpers
    // ----------------------------------------------------------------

    private static DeferredBlock<DropExperienceBlock> stoneOre(String name, UniformInt xp,
                                                                float hardness, MapColor color) {
        return BLOCKS.registerBlock(name,
                props -> new DropExperienceBlock(xp, props),
                BlockBehaviour.Properties.of()
                        .mapColor(color)
                        .requiresCorrectToolForDrops()
                        .strength(hardness, 3.0F)
                        .sound(SoundType.STONE));
    }

    private static DeferredBlock<DropExperienceBlock> deepslateOre(String name, UniformInt xp,
                                                                     float hardness, MapColor color) {
        return BLOCKS.registerBlock(name,
                props -> new DropExperienceBlock(xp, props),
                BlockBehaviour.Properties.of()
                        .mapColor(color)
                        .requiresCorrectToolForDrops()
                        .strength(hardness, 3.0F)
                        .sound(SoundType.DEEPSLATE));
    }

    // ----------------------------------------------------------------
    // TIN  (common, mid-level)
    // ----------------------------------------------------------------
    public static final DeferredBlock<DropExperienceBlock> TIN_ORE =
            stoneOre("tin_ore", UniformInt.of(0, 2), 3.0F, MapColor.STONE);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_TIN_ORE =
            deepslateOre("deepslate_tin_ore", UniformInt.of(0, 2), 4.5F, MapColor.DEEPSLATE);

    // ----------------------------------------------------------------
    // LEAD  (mid-deep)
    // ----------------------------------------------------------------
    public static final DeferredBlock<DropExperienceBlock> LEAD_ORE =
            stoneOre("lead_ore", UniformInt.of(0, 2), 3.0F, MapColor.STONE);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_LEAD_ORE =
            deepslateOre("deepslate_lead_ore", UniformInt.of(0, 2), 4.5F, MapColor.DEEPSLATE);

    // ----------------------------------------------------------------
    // NICKEL  (mid-deep)
    // ----------------------------------------------------------------
    public static final DeferredBlock<DropExperienceBlock> NICKEL_ORE =
            stoneOre("nickel_ore", UniformInt.of(0, 2), 3.0F, MapColor.STONE);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_NICKEL_ORE =
            deepslateOre("deepslate_nickel_ore", UniformInt.of(0, 2), 4.5F, MapColor.DEEPSLATE);

    // ----------------------------------------------------------------
    // BAUXITE  (yields raw_aluminum → aluminum_ingot)
    // ----------------------------------------------------------------
    public static final DeferredBlock<DropExperienceBlock> BAUXITE_ORE =
            stoneOre("bauxite_ore", UniformInt.of(0, 2), 3.0F, MapColor.COLOR_ORANGE);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_BAUXITE_ORE =
            deepslateOre("deepslate_bauxite_ore", UniformInt.of(0, 2), 4.5F, MapColor.DEEPSLATE);

    // ----------------------------------------------------------------
    // ZINC  (common, upper-mid)
    // ----------------------------------------------------------------
    public static final DeferredBlock<DropExperienceBlock> ZINC_ORE =
            stoneOre("zinc_ore", UniformInt.of(0, 2), 3.0F, MapColor.STONE);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_ZINC_ORE =
            deepslateOre("deepslate_zinc_ore", UniformInt.of(0, 2), 4.5F, MapColor.DEEPSLATE);

    // ----------------------------------------------------------------
    // SILVER  (deep)
    // ----------------------------------------------------------------
    public static final DeferredBlock<DropExperienceBlock> SILVER_ORE =
            stoneOre("silver_ore", UniformInt.of(0, 3), 3.0F, MapColor.STONE);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_SILVER_ORE =
            deepslateOre("deepslate_silver_ore", UniformInt.of(0, 3), 4.5F, MapColor.DEEPSLATE);

    // ----------------------------------------------------------------
    // URANIUM  (deep, radioactive — requires diamond tool)
    // ----------------------------------------------------------------
    public static final DeferredBlock<DropExperienceBlock> URANIUM_ORE =
            stoneOre("uranium_ore", UniformInt.of(1, 4), 3.0F, MapColor.COLOR_GREEN);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_URANIUM_ORE =
            deepslateOre("deepslate_uranium_ore", UniformInt.of(1, 4), 4.5F, MapColor.DEEPSLATE);

    // ----------------------------------------------------------------
    // PLATINUM  (very deep, rare — requires diamond tool)
    // ----------------------------------------------------------------
    public static final DeferredBlock<DropExperienceBlock> PLATINUM_ORE =
            stoneOre("platinum_ore", UniformInt.of(2, 5), 3.0F, MapColor.METAL);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_PLATINUM_ORE =
            deepslateOre("deepslate_platinum_ore", UniformInt.of(2, 5), 4.5F, MapColor.DEEPSLATE);

    // ----------------------------------------------------------------
    // SULFUR  (near-surface mineral, drops sulfur directly)
    // ----------------------------------------------------------------
    public static final DeferredBlock<DropExperienceBlock> SULFUR_ORE =
            stoneOre("sulfur_ore", UniformInt.of(2, 5), 2.0F, MapColor.COLOR_YELLOW);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_SULFUR_ORE =
            deepslateOre("deepslate_sulfur_ore", UniformInt.of(2, 5), 3.5F, MapColor.DEEPSLATE);

    // ----------------------------------------------------------------
    // SALTPETER  (mid-level mineral, drops saltpeter directly)
    // ----------------------------------------------------------------
    public static final DeferredBlock<DropExperienceBlock> SALTPETER_ORE =
            stoneOre("saltpeter_ore", UniformInt.of(1, 3), 2.0F, MapColor.SNOW);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_SALTPETER_ORE =
            deepslateOre("deepslate_saltpeter_ore", UniformInt.of(1, 3), 3.5F, MapColor.DEEPSLATE);

    // ----------------------------------------------------------------
    // SALT  (near-surface mineral, drops salt directly)
    // ----------------------------------------------------------------
    public static final DeferredBlock<DropExperienceBlock> SALT_ORE =
            stoneOre("salt_ore", UniformInt.of(0, 1), 2.0F, MapColor.SNOW);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_SALT_ORE =
            deepslateOre("deepslate_salt_ore", UniformInt.of(0, 1), 3.5F, MapColor.DEEPSLATE);

    // ----------------------------------------------------------------
    // MONAZITE  (deep rare-earth mineral, drops monazite_crystal)
    // ----------------------------------------------------------------
    public static final DeferredBlock<DropExperienceBlock> MONAZITE_ORE =
            stoneOre("monazite_ore", UniformInt.of(2, 5), 3.0F, MapColor.COLOR_LIGHT_GRAY);
    public static final DeferredBlock<DropExperienceBlock> DEEPSLATE_MONAZITE_ORE =
            deepslateOre("deepslate_monazite_ore", UniformInt.of(2, 5), 4.5F, MapColor.DEEPSLATE);
}