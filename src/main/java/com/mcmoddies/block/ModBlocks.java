package com.mcmoddies.block;

import com.mcmoddies.MCMODDIES;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //THE ACTUAL CUSTOM BLOCKS
    //!RUBY BLOCKS
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block RAW_RUBY_BLOCK = registerBlock("raw_ruby_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));



    //!DIAMOND BLOCKS
    public static final Block RAINBOW_DIAMOND_BLOCK = registerBlock("rainbow_diamond_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    public static final Block PURPLE_DIAMOND_BLOCK = registerBlock("purple_diamond_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    public static final Block ORANGE_DIAMOND_BLOCK = registerBlock("orange_diamond_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    public static final Block RED_DIAMOND_BLOCK = registerBlock("red_diamond_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    public static final Block YELLOW_DIAMOND_BLOCK = registerBlock("yellow_diamond_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    public static final Block GREEN_DIAMOND_BLOCK = registerBlock("green_diamond_block",
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    //!STONE DIAMOND ORES (RAW DIAMOND BLOCKS)
    public static final Block RAW_STONE_RAINBOW_DIAMOND_BLOCK = registerBlock("raw_stone_rainbow_diamond_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).strength(4.5f)));

    public static final Block RAW_STONE_PURPLE_DIAMOND_BLOCK = registerBlock("raw_stone_purple_diamond_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));

    public static final Block RAW_STONE_ORANGE_DIAMOND_BLOCK = registerBlock("raw_stone_orange_diamond_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));

    public static final Block RAW_STONE_RED_DIAMOND_BLOCK = registerBlock("raw_stone_red_diamond_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));

    public static final Block RAW_STONE_YELLOW_DIAMOND_BLOCK = registerBlock("raw_stone_yellow_diamond_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));

    public static final Block RAW_STONE_GREEN_DIAMOND_BLOCK = registerBlock("raw_stone_green_diamond_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));


    //!DEEPSLATE DIAMOND ORES (RAW DIAMOND BLOCKS)
    public static final Block RAW_DEEPSLATE_RAINBOW_DIAMOND_BLOCK = registerBlock("raw_deepslate_rainbow_diamond_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).strength(5.5f)));

    public static final Block RAW_DEEPSLATE_PURPLE_DIAMOND_BLOCK = registerBlock("raw_deepslate_purple_diamond_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));

    public static final Block RAW_DEEPSLATE_ORANGE_DIAMOND_BLOCK = registerBlock("raw_deepslate_orange_diamond_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));

    public static final Block RAW_DEEPSLATE_RED_DIAMOND_BLOCK = registerBlock("raw_deepslate_red_diamond_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));

    public static final Block RAW_DEEPSLATE_YELLOW_DIAMOND_BLOCK = registerBlock("raw_deepslate_yellow_diamond_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));

    public static final Block RAW_DEEPSLATE_GREEN_DIAMOND_BLOCK = registerBlock("raw_deepslate_green_diamond_block",
            new Block(AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));


    // HELPER METHODS
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MCMODDIES.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(MCMODDIES.MOD_ID, name),
                new BlockItem(block, new Item.Settings())
        );
    }

    public static void registerModBlocks(){
        MCMODDIES.LOGGER.info("Registering Mod Blocks for " + MCMODDIES.MOD_ID);
    }
}
