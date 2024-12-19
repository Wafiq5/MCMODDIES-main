package com.mcmoddies.datagen;

import com.mcmoddies.block.ModBlocks;
import com.mcmoddies.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        //!PICKAXE MINEABLE
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                //RUBIES
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RAW_RUBY_BLOCK)


                //STONE DIAMOND ORES
                .add(ModBlocks.RAW_STONE_RAINBOW_DIAMOND_BLOCK)
                .add(ModBlocks.RAW_STONE_PURPLE_DIAMOND_BLOCK)
                .add(ModBlocks.RAW_STONE_ORANGE_DIAMOND_BLOCK)
                .add(ModBlocks.RAW_STONE_RED_DIAMOND_BLOCK)
                .add(ModBlocks.RAW_STONE_YELLOW_DIAMOND_BLOCK)
                .add(ModBlocks.RAW_STONE_GREEN_DIAMOND_BLOCK)
                //DEEPSLATE DIAMOND ORES
                .add(ModBlocks.RAW_DEEPSLATE_RAINBOW_DIAMOND_BLOCK)
                .add(ModBlocks.RAW_DEEPSLATE_PURPLE_DIAMOND_BLOCK)
                .add(ModBlocks.RAW_DEEPSLATE_ORANGE_DIAMOND_BLOCK)
                .add(ModBlocks.RAW_DEEPSLATE_RED_DIAMOND_BLOCK)
                .add(ModBlocks.RAW_DEEPSLATE_YELLOW_DIAMOND_BLOCK)
                .add(ModBlocks.RAW_DEEPSLATE_GREEN_DIAMOND_BLOCK)
                //DIAMOND BLOCKS
                .add(ModBlocks.RAINBOW_DIAMOND_BLOCK)
                .add(ModBlocks.PURPLE_DIAMOND_BLOCK)
                .add(ModBlocks.ORANGE_DIAMOND_BLOCK)
                .add(ModBlocks.RED_DIAMOND_BLOCK)
                .add(ModBlocks.YELLOW_DIAMOND_BLOCK)
                .add(ModBlocks.GREEN_DIAMOND_BLOCK);

        //!NEEDS IRON PICKAXE (ALL THE DIAMONDS WITHOUT RAINBOW DIAMOND)
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                //STONE DIAMOND ORES
                .add(ModBlocks.RAW_STONE_PURPLE_DIAMOND_BLOCK)
                .add(ModBlocks.RAW_STONE_ORANGE_DIAMOND_BLOCK)
                .add(ModBlocks.RAW_STONE_RED_DIAMOND_BLOCK)
                .add(ModBlocks.RAW_STONE_YELLOW_DIAMOND_BLOCK)
                .add(ModBlocks.RAW_STONE_GREEN_DIAMOND_BLOCK)

                //DEEPSLATE DIAMOND ORES
                .add(ModBlocks.RAW_DEEPSLATE_PURPLE_DIAMOND_BLOCK)
                .add(ModBlocks.RAW_DEEPSLATE_ORANGE_DIAMOND_BLOCK)
                .add(ModBlocks.RAW_DEEPSLATE_RED_DIAMOND_BLOCK)
                .add(ModBlocks.RAW_DEEPSLATE_YELLOW_DIAMOND_BLOCK)
                .add(ModBlocks.RAW_DEEPSLATE_GREEN_DIAMOND_BLOCK)

                //DIAMOND BLOCKS
                .add(ModBlocks.PURPLE_DIAMOND_BLOCK)
                .add(ModBlocks.ORANGE_DIAMOND_BLOCK)
                .add(ModBlocks.RED_DIAMOND_BLOCK)
                .add(ModBlocks.YELLOW_DIAMOND_BLOCK)
                .add(ModBlocks.GREEN_DIAMOND_BLOCK);

        //!NEEDS DIAMOND PICKAXE (RAINBOW DIAMOND)
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RAW_STONE_RAINBOW_DIAMOND_BLOCK)
                .add(ModBlocks.RAW_DEEPSLATE_RAINBOW_DIAMOND_BLOCK);

        //!POWER LEVEL FOR TOOLS
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_RAINBOW_DIAMOND_TOOL).addTag(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_PURPLE_DIAMOND_TOOL).addTag(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_ORANGE_DIAMOND_TOOL).addTag(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_RED_DIAMOND_TOOL).addTag(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_YELLOW_DIAMOND_TOOL).addTag(BlockTags.NEEDS_IRON_TOOL);

        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_GREEN_DIAMOND_TOOL).addTag(BlockTags.NEEDS_IRON_TOOL);
        }



}
