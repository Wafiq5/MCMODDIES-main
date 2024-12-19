package com.mcmoddies.item;

import com.google.common.base.Suppliers;
import com.mcmoddies.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    // Rainbow Diamond Tool
    RAINBOW_DIAMOND(ModTags.Blocks.INCORRECT_FOR_RAINBOW_DIAMOND_TOOL, 3021, 11.0F, 4.0F, 25, () -> Ingredient.ofItems(ModItems.RAINBOW_DIAMOND)),

    // Purple Diamond Tool
    PURPLE_DIAMOND(ModTags.Blocks.INCORRECT_FOR_PURPLE_DIAMOND_TOOL, 2012, 9.0F, 3.5F, 20, () -> Ingredient.ofItems(ModItems.PURPLE_DIAMOND)),

    // Orange Diamond Tool
    ORANGE_DIAMOND(ModTags.Blocks.INCORRECT_FOR_ORANGE_DIAMOND_TOOL, 1891, 8.5F, 3.3F, 18, () -> Ingredient.ofItems(ModItems.ORANGE_DIAMOND)),

    // Red Diamond Tool
    RED_DIAMOND(ModTags.Blocks.INCORRECT_FOR_RED_DIAMOND_TOOL, 1740, 8.0F, 3.2F, 16, () -> Ingredient.ofItems(ModItems.RED_DIAMOND)),

    // Yellow Diamond Tool
    YELLOW_DIAMOND(ModTags.Blocks.INCORRECT_FOR_YELLOW_DIAMOND_TOOL, 1600, 7.5F, 3.0F, 15, () -> Ingredient.ofItems(ModItems.YELLOW_DIAMOND)),

    // Green Diamond Tool
    GREEN_DIAMOND(ModTags.Blocks.INCORRECT_FOR_GREEN_DIAMOND_TOOL, 1450, 7.0F, 2.8F, 14, () -> Ingredient.ofItems(ModItems.GREEN_DIAMOND));


    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private ModToolMaterials(
            final TagKey<Block> inverseTag,
            final int itemDurability,
            final float miningSpeed,
            final float attackDamage,
            final int enchantability,
            final Supplier<Ingredient> repairIngredient
    ) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
