package dev.forgeeverything.everythingores.registry;

import dev.forgeeverything.everythingores.EverythingOres;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Registers every ArmorMaterial owned by Everything Ores.
 *
 * Tier overview (defense sum / toughness / enchantability):
 *   Leather=7/0/15  Gold=12/0/25  Iron=15/0/9  Diamond=20/2/10  Netherite=20/3/15
 *
 *   Tin           9/0.0/14  — early game, leather+
 *   Bronze       13/0.0/12  — chainmail-tier (Cu+Sn)
 *   Zinc         12/0.0/12  — chainmail-adjacent
 *   Aluminum     13/0.0/14  — iron-adjacent, light
 *   Electrum     13/0.0/25  — Au+Ag alloy, gold enchant, better prot
 *   Lead         15/0.0/5   — iron-tier, low enchant (dense)
 *   Nickel       15/0.0/9   — iron-tier
 *   Invar        15/1.0/10  — Fe+Ni alloy, iron++
 *   Constantan   15/1.0/8   — Cu+Ni alloy, iron++
 *   Silver       15/0.0/25  — iron-tier, very high enchant
 *   Bismuth      15/1.0/15  — mid-tier, decent enchant
 *   Uranium      15/1.0/5   — iron-tier, radioactive
 *   Steel        19/1.5/9   — iron++ to diamond-
 *   Stainless    19/1.5/10  — Fe+Cr, marginally better than steel
 *   Osmium       19/2.0/9   — heavy pre-diamond
 *   Chromium     20/2.0/10  — diamond-tier
 *   Platinum     20/2.0/18  — diamond-tier, high enchant
 *   Tungsten     20/3.0/7   — very heavy, high toughness + KBR
 *   Iridium      20/3.0/15  — near-netherite, high enchant + KBR
 */
public class EOArmorMaterials {

    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS =
            DeferredRegister.create(Registries.ARMOR_MATERIAL, EverythingOres.MOD_ID);

    // ── Helper ────────────────────────────────────────────────────────────────

    private static Holder<ArmorMaterial> register(
            String name,
            int helmet, int chestplate, int leggings, int boots,
            int enchantability,
            float toughness,
            float knockbackResistance,
            Supplier<Ingredient> repair) {
        return ARMOR_MATERIALS.register(name, () -> new ArmorMaterial(
                Map.of(
                        ArmorItem.Type.HELMET,     helmet,
                        ArmorItem.Type.CHESTPLATE, chestplate,
                        ArmorItem.Type.LEGGINGS,   leggings,
                        ArmorItem.Type.BOOTS,      boots
                ),
                enchantability,
                SoundEvents.ARMOR_EQUIP_IRON,
                repair,
                List.of(new ArmorMaterial.Layer(
                        ResourceLocation.fromNamespaceAndPath(EverythingOres.MOD_ID, name))),
                toughness,
                knockbackResistance
        ));
    }

    // ================================================================
    // EARLY GAME
    // ================================================================

    public static final Holder<ArmorMaterial> BRONZE = register(
            "bronze", 2, 5, 4, 2, 12, 0.0f, 0.0f,
            () -> Ingredient.of(EOItems.BRONZE_INGOT.get()));

    // ================================================================
    // MID GAME — Iron tier and adjacent
    // ================================================================

    public static final Holder<ArmorMaterial> ALUMINUM = register(
            "aluminum", 2, 5, 4, 2, 14, 0.0f, 0.0f,
            () -> Ingredient.of(EOItems.ALUMINUM_INGOT.get()));

    public static final Holder<ArmorMaterial> ELECTRUM = register(
            "electrum", 2, 5, 4, 2, 25, 0.0f, 0.0f,
            () -> Ingredient.of(EOItems.ELECTRUM_INGOT.get()));

    public static final Holder<ArmorMaterial> NICKEL = register(
            "nickel", 2, 6, 5, 2, 9, 0.0f, 0.0f,
            () -> Ingredient.of(EOItems.NICKEL_INGOT.get()));

    public static final Holder<ArmorMaterial> INVAR = register(
            "invar", 2, 6, 5, 2, 10, 1.0f, 0.0f,
            () -> Ingredient.of(EOItems.INVAR_INGOT.get()));

    public static final Holder<ArmorMaterial> CONSTANTAN = register(
            "constantan", 2, 6, 5, 2, 8, 1.0f, 0.0f,
            () -> Ingredient.of(EOItems.CONSTANTAN_INGOT.get()));

    public static final Holder<ArmorMaterial> SILVER = register(
            "silver", 2, 6, 5, 2, 25, 0.0f, 0.0f,
            () -> Ingredient.of(EOItems.SILVER_INGOT.get()));

    public static final Holder<ArmorMaterial> BISMUTH = register(
            "bismuth", 2, 6, 5, 2, 15, 1.0f, 0.0f,
            () -> Ingredient.of(EOItems.BISMUTH_INGOT.get()));

    // ================================================================
    // LATE GAME — Diamond tier and approaching Netherite
    // ================================================================

    public static final Holder<ArmorMaterial> STEEL = register(
            "steel", 3, 7, 6, 3, 9, 1.5f, 0.0f,
            () -> Ingredient.of(EOItems.STEEL_INGOT.get()));

    public static final Holder<ArmorMaterial> STAINLESS_STEEL = register(
            "stainless_steel", 3, 7, 6, 3, 10, 1.5f, 0.0f,
            () -> Ingredient.of(EOItems.STAINLESS_STEEL_INGOT.get()));

    public static final Holder<ArmorMaterial> PLATINUM = register(
            "platinum", 3, 8, 6, 3, 18, 2.0f, 0.0f,
            () -> Ingredient.of(EOItems.PLATINUM_INGOT.get()));

    public static final Holder<ArmorMaterial> TUNGSTEN = register(
            "tungsten", 3, 8, 6, 3, 7, 3.0f, 0.1f,
            () -> Ingredient.of(EOItems.TUNGSTEN_INGOT.get()));

    public static final Holder<ArmorMaterial> IRIDIUM = register(
            "iridium", 3, 8, 6, 3, 15, 3.0f, 0.1f,
            () -> Ingredient.of(EOItems.IRIDIUM_INGOT.get()));
}
