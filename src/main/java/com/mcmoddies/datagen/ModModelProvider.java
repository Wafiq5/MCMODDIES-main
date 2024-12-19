package com.mcmoddies.datagen;

import com.mcmoddies.block.ModBlocks;
import com.mcmoddies.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_RUBY_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAINBOW_DIAMOND_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PURPLE_DIAMOND_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_DIAMOND_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_DIAMOND_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_DIAMOND_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_DIAMOND_BLOCK);

        // STONE DIAMOND ORES
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_STONE_PURPLE_DIAMOND_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_STONE_ORANGE_DIAMOND_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_STONE_RED_DIAMOND_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_STONE_YELLOW_DIAMOND_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_STONE_GREEN_DIAMOND_BLOCK);

        // DEEPSLATE DIAMOND ORES
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_DEEPSLATE_PURPLE_DIAMOND_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_DEEPSLATE_ORANGE_DIAMOND_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_DEEPSLATE_RED_DIAMOND_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_DEEPSLATE_YELLOW_DIAMOND_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_DEEPSLATE_GREEN_DIAMOND_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RUBY, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAINBOW_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURPLE_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORANGE_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.YELLOW_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.GREEN_DIAMOND, Models.GENERATED);

        itemModelGenerator.register(ModItems.DIAMOND_DETECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);

        // Registering Sword models (Handheld)
        itemModelGenerator.register(ModItems.RAINBOW_DIAMOND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURPLE_DIAMOND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORANGE_DIAMOND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RED_DIAMOND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.YELLOW_DIAMOND_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GREEN_DIAMOND_SWORD, Models.HANDHELD);

        // Registering Pickaxe models (Handheld)
        itemModelGenerator.register(ModItems.RAINBOW_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURPLE_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORANGE_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RED_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.YELLOW_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GREEN_DIAMOND_PICKAXE, Models.HANDHELD);

        // Registering Axe models (Handheld)
        itemModelGenerator.register(ModItems.RAINBOW_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURPLE_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORANGE_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RED_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.YELLOW_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GREEN_DIAMOND_AXE, Models.HANDHELD);

        // Registering Shovel models (Handheld)
        itemModelGenerator.register(ModItems.RAINBOW_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURPLE_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORANGE_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RED_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.YELLOW_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GREEN_DIAMOND_SHOVEL, Models.HANDHELD);

        // Registering Hoe models (Handheld)
        itemModelGenerator.register(ModItems.RAINBOW_DIAMOND_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PURPLE_DIAMOND_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ORANGE_DIAMOND_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RED_DIAMOND_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.YELLOW_DIAMOND_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GREEN_DIAMOND_HOE, Models.HANDHELD);
    }
}
