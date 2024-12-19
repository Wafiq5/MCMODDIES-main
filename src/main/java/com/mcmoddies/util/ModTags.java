package com.mcmoddies.util;

import com.mcmoddies.MCMODDIES;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

        //!RAINBOW DIAMOND TOOL TAGS
        public static final TagKey<Block> NEEDS_RAINBOW_DIAMOND_TOOL = createTag("needs_rainbow_diamond_tool");
        public static final TagKey<Block> INCORRECT_FOR_RAINBOW_DIAMOND_TOOL = createTag("incorrect_for_rainbow_diamond_tool");

        // Purple Diamond Tool Tags
        public static final TagKey<Block> NEEDS_PURPLE_DIAMOND_TOOL = createTag("needs_purple_diamond_tool");
        public static final TagKey<Block> INCORRECT_FOR_PURPLE_DIAMOND_TOOL = createTag("incorrect_for_purple_diamond_tool");

        // Orange Diamond Tool Tags
        public static final TagKey<Block> NEEDS_ORANGE_DIAMOND_TOOL = createTag("needs_orange_diamond_tool");
        public static final TagKey<Block> INCORRECT_FOR_ORANGE_DIAMOND_TOOL = createTag("incorrect_for_orange_diamond_tool");

        // Red Diamond Tool Tags
        public static final TagKey<Block> NEEDS_RED_DIAMOND_TOOL = createTag("needs_red_diamond_tool");
        public static final TagKey<Block> INCORRECT_FOR_RED_DIAMOND_TOOL = createTag("incorrect_for_red_diamond_tool");

        // Yellow Diamond Tool Tags
        public static final TagKey<Block> NEEDS_YELLOW_DIAMOND_TOOL = createTag("needs_yellow_diamond_tool");
        public static final TagKey<Block> INCORRECT_FOR_YELLOW_DIAMOND_TOOL = createTag("incorrect_for_yellow_diamond_tool");

        // Green Diamond Tool Tags
        public static final TagKey<Block> NEEDS_GREEN_DIAMOND_TOOL = createTag("needs_green_diamond_tool");
        public static final TagKey<Block> INCORRECT_FOR_GREEN_DIAMOND_TOOL = createTag("incorrect_for_green_diamond_tool");

        public static final TagKey<Block> DIAMOND_DETECTOR_DETECTABLE_BLOCKS =
                createTag("diamond_detector_detectable_blocks");


        public static final TagKey<Block> METAL_DETECTOR_DETECTABLE_BLOCKS =
                createTag("metal_detector_detectable_blocks");


        public static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(MCMODDIES.MOD_ID, name));
        }
    }
    public static class Items {
        public static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(MCMODDIES.MOD_ID, name));
        }
    }
}
