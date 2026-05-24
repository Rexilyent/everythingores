package dev.forgeeverything.everythingores.registry;

import dev.forgeeverything.everythingores.EverythingOres;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * Registers every armor item owned by Everything Ores.
 *
 * 19 materials × 4 pieces = 76 items.
 *
 * Uses its own DeferredRegister.Items so that calling
 * EOArmor.ITEMS.register(modEventBus) in the mod constructor forces
 * static initialisation inside the RegisterEvent window — the same
 * pattern used by EOTools to avoid late-registration crashes.
 *
 * ArmorMaterial Holders live in EOArmorMaterials, which must be
 * registered before this class initialises (handled by registration
 * order in EverythingOres.java).
 */
public class EOArmor {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(EverythingOres.MOD_ID);

    // ── Helper ────────────────────────────────────────────────────────────────

    private static DeferredItem<ArmorItem> armor(String name,
            net.minecraft.core.Holder<net.minecraft.world.item.ArmorMaterial> mat,
            ArmorItem.Type type) {
        return ITEMS.register(name,
                () -> new ArmorItem(mat, type, new Item.Properties()));
    }

    // ================================================================
    // BRONZE
    // ================================================================
    public static final DeferredItem<ArmorItem> BRONZE_HELMET     = armor("bronze_helmet",     EOArmorMaterials.BRONZE, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> BRONZE_CHESTPLATE = armor("bronze_chestplate", EOArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> BRONZE_LEGGINGS   = armor("bronze_leggings",   EOArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> BRONZE_BOOTS      = armor("bronze_boots",      EOArmorMaterials.BRONZE, ArmorItem.Type.BOOTS);

    // ================================================================
    // ALUMINUM
    // ================================================================
    public static final DeferredItem<ArmorItem> ALUMINUM_HELMET     = armor("aluminum_helmet",     EOArmorMaterials.ALUMINUM, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> ALUMINUM_CHESTPLATE = armor("aluminum_chestplate", EOArmorMaterials.ALUMINUM, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> ALUMINUM_LEGGINGS   = armor("aluminum_leggings",   EOArmorMaterials.ALUMINUM, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> ALUMINUM_BOOTS      = armor("aluminum_boots",      EOArmorMaterials.ALUMINUM, ArmorItem.Type.BOOTS);

    // ================================================================
    // ELECTRUM
    // ================================================================
    public static final DeferredItem<ArmorItem> ELECTRUM_HELMET     = armor("electrum_helmet",     EOArmorMaterials.ELECTRUM, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> ELECTRUM_CHESTPLATE = armor("electrum_chestplate", EOArmorMaterials.ELECTRUM, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> ELECTRUM_LEGGINGS   = armor("electrum_leggings",   EOArmorMaterials.ELECTRUM, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> ELECTRUM_BOOTS      = armor("electrum_boots",      EOArmorMaterials.ELECTRUM, ArmorItem.Type.BOOTS);

    // ================================================================
    // NICKEL
    // ================================================================
    public static final DeferredItem<ArmorItem> NICKEL_HELMET     = armor("nickel_helmet",     EOArmorMaterials.NICKEL, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> NICKEL_CHESTPLATE = armor("nickel_chestplate", EOArmorMaterials.NICKEL, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> NICKEL_LEGGINGS   = armor("nickel_leggings",   EOArmorMaterials.NICKEL, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> NICKEL_BOOTS      = armor("nickel_boots",      EOArmorMaterials.NICKEL, ArmorItem.Type.BOOTS);

    // ================================================================
    // INVAR
    // ================================================================
    public static final DeferredItem<ArmorItem> INVAR_HELMET     = armor("invar_helmet",     EOArmorMaterials.INVAR, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> INVAR_CHESTPLATE = armor("invar_chestplate", EOArmorMaterials.INVAR, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> INVAR_LEGGINGS   = armor("invar_leggings",   EOArmorMaterials.INVAR, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> INVAR_BOOTS      = armor("invar_boots",      EOArmorMaterials.INVAR, ArmorItem.Type.BOOTS);

    // ================================================================
    // CONSTANTAN
    // ================================================================
    public static final DeferredItem<ArmorItem> CONSTANTAN_HELMET     = armor("constantan_helmet",     EOArmorMaterials.CONSTANTAN, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> CONSTANTAN_CHESTPLATE = armor("constantan_chestplate", EOArmorMaterials.CONSTANTAN, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> CONSTANTAN_LEGGINGS   = armor("constantan_leggings",   EOArmorMaterials.CONSTANTAN, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> CONSTANTAN_BOOTS      = armor("constantan_boots",      EOArmorMaterials.CONSTANTAN, ArmorItem.Type.BOOTS);

    // ================================================================
    // SILVER
    // ================================================================
    public static final DeferredItem<ArmorItem> SILVER_HELMET     = armor("silver_helmet",     EOArmorMaterials.SILVER, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> SILVER_CHESTPLATE = armor("silver_chestplate", EOArmorMaterials.SILVER, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> SILVER_LEGGINGS   = armor("silver_leggings",   EOArmorMaterials.SILVER, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> SILVER_BOOTS      = armor("silver_boots",      EOArmorMaterials.SILVER, ArmorItem.Type.BOOTS);

    // ================================================================
    // BISMUTH
    // ================================================================
    public static final DeferredItem<ArmorItem> BISMUTH_HELMET     = armor("bismuth_helmet",     EOArmorMaterials.BISMUTH, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> BISMUTH_CHESTPLATE = armor("bismuth_chestplate", EOArmorMaterials.BISMUTH, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> BISMUTH_LEGGINGS   = armor("bismuth_leggings",   EOArmorMaterials.BISMUTH, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> BISMUTH_BOOTS      = armor("bismuth_boots",      EOArmorMaterials.BISMUTH, ArmorItem.Type.BOOTS);

    // ================================================================
    // STEEL
    // ================================================================
    public static final DeferredItem<ArmorItem> STEEL_HELMET     = armor("steel_helmet",     EOArmorMaterials.STEEL, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> STEEL_CHESTPLATE = armor("steel_chestplate", EOArmorMaterials.STEEL, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> STEEL_LEGGINGS   = armor("steel_leggings",   EOArmorMaterials.STEEL, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> STEEL_BOOTS      = armor("steel_boots",      EOArmorMaterials.STEEL, ArmorItem.Type.BOOTS);

    // ================================================================
    // STAINLESS STEEL
    // ================================================================
    public static final DeferredItem<ArmorItem> STAINLESS_STEEL_HELMET     = armor("stainless_steel_helmet",     EOArmorMaterials.STAINLESS_STEEL, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> STAINLESS_STEEL_CHESTPLATE = armor("stainless_steel_chestplate", EOArmorMaterials.STAINLESS_STEEL, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> STAINLESS_STEEL_LEGGINGS   = armor("stainless_steel_leggings",   EOArmorMaterials.STAINLESS_STEEL, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> STAINLESS_STEEL_BOOTS      = armor("stainless_steel_boots",      EOArmorMaterials.STAINLESS_STEEL, ArmorItem.Type.BOOTS);

    // ================================================================
    // PLATINUM
    // ================================================================
    public static final DeferredItem<ArmorItem> PLATINUM_HELMET     = armor("platinum_helmet",     EOArmorMaterials.PLATINUM, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> PLATINUM_CHESTPLATE = armor("platinum_chestplate", EOArmorMaterials.PLATINUM, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> PLATINUM_LEGGINGS   = armor("platinum_leggings",   EOArmorMaterials.PLATINUM, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> PLATINUM_BOOTS      = armor("platinum_boots",      EOArmorMaterials.PLATINUM, ArmorItem.Type.BOOTS);

    // ================================================================
    // TUNGSTEN
    // ================================================================
    public static final DeferredItem<ArmorItem> TUNGSTEN_HELMET     = armor("tungsten_helmet",     EOArmorMaterials.TUNGSTEN, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> TUNGSTEN_CHESTPLATE = armor("tungsten_chestplate", EOArmorMaterials.TUNGSTEN, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> TUNGSTEN_LEGGINGS   = armor("tungsten_leggings",   EOArmorMaterials.TUNGSTEN, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> TUNGSTEN_BOOTS      = armor("tungsten_boots",      EOArmorMaterials.TUNGSTEN, ArmorItem.Type.BOOTS);

    // ================================================================
    // IRIDIUM
    // ================================================================
    public static final DeferredItem<ArmorItem> IRIDIUM_HELMET     = armor("iridium_helmet",     EOArmorMaterials.IRIDIUM, ArmorItem.Type.HELMET);
    public static final DeferredItem<ArmorItem> IRIDIUM_CHESTPLATE = armor("iridium_chestplate", EOArmorMaterials.IRIDIUM, ArmorItem.Type.CHESTPLATE);
    public static final DeferredItem<ArmorItem> IRIDIUM_LEGGINGS   = armor("iridium_leggings",   EOArmorMaterials.IRIDIUM, ArmorItem.Type.LEGGINGS);
    public static final DeferredItem<ArmorItem> IRIDIUM_BOOTS      = armor("iridium_boots",      EOArmorMaterials.IRIDIUM, ArmorItem.Type.BOOTS);
}
