package com.mcmoddies.datagen;

import com.mcmoddies.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        // Adding Rainbow Diamond Sword to the Swords tag
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.RAINBOW_DIAMOND_SWORD)
                .add(ModItems.PURPLE_DIAMOND_SWORD)
                .add(ModItems.ORANGE_DIAMOND_SWORD)
                .add(ModItems.RED_DIAMOND_SWORD)
                .add(ModItems.YELLOW_DIAMOND_SWORD)
                .add(ModItems.GREEN_DIAMOND_SWORD);

// Adding Rainbow Diamond Pickaxe to the Pickaxes tag
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.RAINBOW_DIAMOND_PICKAXE)
                .add(ModItems.PURPLE_DIAMOND_PICKAXE)
                .add(ModItems.ORANGE_DIAMOND_PICKAXE)
                .add(ModItems.RED_DIAMOND_PICKAXE)
                .add(ModItems.YELLOW_DIAMOND_PICKAXE)
                .add(ModItems.GREEN_DIAMOND_PICKAXE);

// Adding Rainbow Diamond Axe to the Axes tag
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.RAINBOW_DIAMOND_AXE)
                .add(ModItems.PURPLE_DIAMOND_AXE)
                .add(ModItems.ORANGE_DIAMOND_AXE)
                .add(ModItems.RED_DIAMOND_AXE)
                .add(ModItems.YELLOW_DIAMOND_AXE)
                .add(ModItems.GREEN_DIAMOND_AXE);

// Adding Rainbow Diamond Shovel to the Shovels tag
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.RAINBOW_DIAMOND_SHOVEL)
                .add(ModItems.PURPLE_DIAMOND_SHOVEL)
                .add(ModItems.ORANGE_DIAMOND_SHOVEL)
                .add(ModItems.RED_DIAMOND_SHOVEL)
                .add(ModItems.YELLOW_DIAMOND_SHOVEL)
                .add(ModItems.GREEN_DIAMOND_SHOVEL);

// Adding Rainbow Diamond Hoe to the Hoes tag
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.RAINBOW_DIAMOND_HOE)
                .add(ModItems.PURPLE_DIAMOND_HOE)
                .add(ModItems.ORANGE_DIAMOND_HOE)
                .add(ModItems.RED_DIAMOND_HOE)
                .add(ModItems.YELLOW_DIAMOND_HOE)
                .add(ModItems.GREEN_DIAMOND_HOE);

    }
}
