package com.mcmoddies.item;

import com.mcmoddies.MCMODDIES;
import com.mcmoddies.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MCMODDIES.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        //!ITEMS: RUBIES
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                    }).build());

    public static final ItemGroup DIAMOND_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(MCMODDIES.MOD_ID, "rainbow_diamond"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rainbow_diamond"))
                    .icon(() -> new ItemStack(ModItems.RAINBOW_DIAMOND)).entries((displayContext, entries) -> {
                        //! ITEMS: DIAMONDS
                        entries.add(ModItems.PURPLE_DIAMOND);
                        entries.add(ModItems.ORANGE_DIAMOND);
                        entries.add(ModItems.RED_DIAMOND);
                        entries.add(ModItems.YELLOW_DIAMOND);
                        entries.add(ModItems.GREEN_DIAMOND);
                        entries.add(ModItems.RAINBOW_DIAMOND);
                        //! ITEMS: DIAMOND BLOCKS
                        entries.add(ModBlocks.PURPLE_DIAMOND_BLOCK);
                        entries.add(ModBlocks.ORANGE_DIAMOND_BLOCK);
                        entries.add(ModBlocks.RED_DIAMOND_BLOCK);
                        entries.add(ModBlocks.YELLOW_DIAMOND_BLOCK);
                        entries.add(ModBlocks.GREEN_DIAMOND_BLOCK);
                        entries.add(ModBlocks.RAINBOW_DIAMOND_BLOCK);
                        //! ITEMS: STONE DIAMOND ORES (RAW DIAMOND ORES)
                        entries.add(ModBlocks.RAW_STONE_PURPLE_DIAMOND_BLOCK);
                        entries.add(ModBlocks.RAW_STONE_ORANGE_DIAMOND_BLOCK);
                        entries.add(ModBlocks.RAW_STONE_RED_DIAMOND_BLOCK);
                        entries.add(ModBlocks.RAW_STONE_YELLOW_DIAMOND_BLOCK);
                        entries.add(ModBlocks.RAW_STONE_GREEN_DIAMOND_BLOCK);
                        entries.add(ModBlocks.RAW_STONE_RAINBOW_DIAMOND_BLOCK);
                        //! ITEMS: DEEPSLATE DIAMOND ORES (RAW DIAMOND ORES)
                        entries.add(ModBlocks.RAW_DEEPSLATE_PURPLE_DIAMOND_BLOCK);
                        entries.add(ModBlocks.RAW_DEEPSLATE_ORANGE_DIAMOND_BLOCK);
                        entries.add(ModBlocks.RAW_DEEPSLATE_RED_DIAMOND_BLOCK);
                        entries.add(ModBlocks.RAW_DEEPSLATE_YELLOW_DIAMOND_BLOCK);
                        entries.add(ModBlocks.RAW_DEEPSLATE_GREEN_DIAMOND_BLOCK);
                        entries.add(ModBlocks.RAW_DEEPSLATE_RAINBOW_DIAMOND_BLOCK);
                        //! ADVANCED ITEMS
                        //METAL DETECTOR
                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModItems.DIAMOND_DETECTOR);
                        //!CUSTOM TOOLS
                        // Rainbow Diamond Tools
                        entries.add(ModItems.RAINBOW_DIAMOND_SWORD);
                        entries.add(ModItems.RAINBOW_DIAMOND_PICKAXE);
                        entries.add(ModItems.RAINBOW_DIAMOND_AXE);
                        entries.add(ModItems.RAINBOW_DIAMOND_SHOVEL);
                        entries.add(ModItems.RAINBOW_DIAMOND_HOE);

                        // Purple Diamond Tools
                        entries.add(ModItems.PURPLE_DIAMOND_SWORD);
                        entries.add(ModItems.PURPLE_DIAMOND_PICKAXE);
                        entries.add(ModItems.PURPLE_DIAMOND_AXE);
                        entries.add(ModItems.PURPLE_DIAMOND_SHOVEL);
                        entries.add(ModItems.PURPLE_DIAMOND_HOE);

                        // Orange Diamond Tools
                        entries.add(ModItems.ORANGE_DIAMOND_SWORD);
                        entries.add(ModItems.ORANGE_DIAMOND_PICKAXE);
                        entries.add(ModItems.ORANGE_DIAMOND_AXE);
                        entries.add(ModItems.ORANGE_DIAMOND_SHOVEL);
                        entries.add(ModItems.ORANGE_DIAMOND_HOE);

                        // Red Diamond Tools
                        entries.add(ModItems.RED_DIAMOND_SWORD);
                        entries.add(ModItems.RED_DIAMOND_PICKAXE);
                        entries.add(ModItems.RED_DIAMOND_AXE);
                        entries.add(ModItems.RED_DIAMOND_SHOVEL);
                        entries.add(ModItems.RED_DIAMOND_HOE);

                        // Yellow Diamond Tools
                        entries.add(ModItems.YELLOW_DIAMOND_SWORD);
                        entries.add(ModItems.YELLOW_DIAMOND_PICKAXE);
                        entries.add(ModItems.YELLOW_DIAMOND_AXE);
                        entries.add(ModItems.YELLOW_DIAMOND_SHOVEL);
                        entries.add(ModItems.YELLOW_DIAMOND_HOE);

                        // Green Diamond Tools
                        entries.add(ModItems.GREEN_DIAMOND_SWORD);
                        entries.add(ModItems.GREEN_DIAMOND_PICKAXE);
                        entries.add(ModItems.GREEN_DIAMOND_AXE);
                        entries.add(ModItems.GREEN_DIAMOND_SHOVEL);
                        entries.add(ModItems.GREEN_DIAMOND_HOE);

                    }).build());
    public static void registerItemGroups(){
        MCMODDIES.LOGGER.info("Regestering Item Groups for " + MCMODDIES.MOD_ID);
    }
}
