package dev.forgeeverything.everythingores.registry;

import dev.forgeeverything.everythingores.EverythingOres;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Consumer;

/**
 * Registers crude oil as a first-class fluid owned by Everything Ores.
 *
 * Absorbs / unifies:
 *   - PneumaticCraft Repressurized : pneumaticcraft:oil
 *   - Oritech                      : oritech:crude_oil
 *   - Other tech mods that add an oil fluid
 *
 * Five pieces required for every NeoForge fluid:
 *   1. FluidType        — render properties, physics constants (density/viscosity)
 *   2. Source fluid     — the "still" form placed by buckets
 *   3. Flowing fluid    — the spreading form
 *   4. LiquidBlock      — the in-world block form (registered in EOBlocks.BLOCKS)
 *   5. BucketItem       — filled bucket (registered in EOItems.ITEMS)
 *
 * Circular dependency is broken by declaring CRUDE_OIL_PROPERTIES last.
 * The lambdas that create Source and Flowing reference CRUDE_OIL_PROPERTIES
 * by static field — Java resolves static fields at invocation time, not lambda
 * creation time, so by the time RegisterEvent fires the field is non-null.
 */
public class EOFluids {

    // ── DeferredRegisters ──────────────────────────────────────────────────────

    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, EverythingOres.MOD_ID);

    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(Registries.FLUID, EverythingOres.MOD_ID);

    // ================================================================
    // CRUDE OIL
    // ================================================================

    // ── 1. FluidType — physics + render properties ────────────────────────────
    public static final DeferredHolder<FluidType, FluidType> CRUDE_OIL_TYPE =
            FLUID_TYPES.register("crude_oil", () -> new FluidType(
                    FluidType.Properties.create()
                            .density(1200)        // denser than water (1000)
                            .viscosity(2000)      // much thicker than water (1000)
                            .temperature(300)     // room temperature
                            .motionScale(0.014)   // sluggish surface movement
                            .canSwim(false)
                            .canDrown(true)
                            .supportsBoating(false)
            ) {
                @Override
                public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                    consumer.accept(new IClientFluidTypeExtensions() {
                        private static final ResourceLocation STILL =
                                ResourceLocation.fromNamespaceAndPath(
                                        EverythingOres.MOD_ID, "fluid/crude_oil_still");
                        private static final ResourceLocation FLOWING =
                                ResourceLocation.fromNamespaceAndPath(
                                        EverythingOres.MOD_ID, "fluid/crude_oil_flowing");
                        private static final ResourceLocation OVERLAY =
                                ResourceLocation.fromNamespaceAndPath(
                                        EverythingOres.MOD_ID, "fluid/crude_oil_overlay");

                        @Override public ResourceLocation getStillTexture()   { return STILL; }
                        @Override public ResourceLocation getFlowingTexture() { return FLOWING; }
                        @Override public ResourceLocation getOverlayTexture() { return OVERLAY; }

                        /** Very dark brown-black, mostly opaque. */
                        @Override public int getTintColor() { return 0xFF1A1208; }
                    });
                }
            });

    // ── 2 & 3. Source and Flowing fluids ─────────────────────────────────────
    // Lambdas reference CRUDE_OIL_PROPERTIES — safe because lambdas read static
    // fields at invocation time, and CRUDE_OIL_PROPERTIES is set before any
    // registry event fires.
    public static final DeferredHolder<Fluid, FlowingFluid> CRUDE_OIL =
            FLUIDS.register("crude_oil",
                    () -> new BaseFlowingFluid.Source(EOFluids.CRUDE_OIL_PROPERTIES));

    public static final DeferredHolder<Fluid, FlowingFluid> CRUDE_OIL_FLOWING =
            FLUIDS.register("crude_oil_flowing",
                    () -> new BaseFlowingFluid.Flowing(EOFluids.CRUDE_OIL_PROPERTIES));

    // ── 4. LiquidBlock — registered in EOBlocks so it shares that BLOCKS register
    public static final DeferredBlock<LiquidBlock> CRUDE_OIL_BLOCK =
            EOBlocks.BLOCKS.register("crude_oil",
                    () -> new LiquidBlock(EOFluids.CRUDE_OIL.get(),
                            BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)
                                    .mapColor(MapColor.COLOR_BLACK)
                                    .noLootTable()));

    // ── 5. BucketItem — registered in EOItems so it shares that ITEMS register
    public static final DeferredItem<BucketItem> CRUDE_OIL_BUCKET =
            EOItems.ITEMS.register("crude_oil_bucket",
                    () -> new BucketItem(EOFluids.CRUDE_OIL.get(),
                            new Item.Properties()
                                    .stacksTo(1)
                                    .craftRemainder(Items.BUCKET)));

    // ── FluidProperties — declared LAST to break the circular dependency ───────
    public static final BaseFlowingFluid.Properties CRUDE_OIL_PROPERTIES =
            new BaseFlowingFluid.Properties(
                    CRUDE_OIL_TYPE,
                    CRUDE_OIL,
                    CRUDE_OIL_FLOWING)
                    .slopeFindDistance(4)
                    .levelDecreasePerBlock(2)
                    .block(CRUDE_OIL_BLOCK)
                    .bucket(CRUDE_OIL_BUCKET);
}
