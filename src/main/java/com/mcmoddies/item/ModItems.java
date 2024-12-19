package com.mcmoddies.item;

import com.mcmoddies.MCMODDIES;

import com.mcmoddies.block.ModBlocks;
import com.mcmoddies.item.custom.DiamondDetectorItem;
import com.mcmoddies.item.custom.MetalDetectorItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // CUSTOM ITEMS
    //!RUBIES
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new Item.Settings()));
    //!DIAMONDS
    public static final Item RAINBOW_DIAMOND = registerItem("rainbow_diamond", new Item(new Item.Settings()));
    public static final Item PURPLE_DIAMOND = registerItem("purple_diamond", new Item(new Item.Settings()));
    public static final Item ORANGE_DIAMOND = registerItem("orange_diamond", new Item(new Item.Settings()));
    public static final Item RED_DIAMOND = registerItem("red_diamond", new Item(new Item.Settings()));
    public static final Item YELLOW_DIAMOND = registerItem("yellow_diamond", new Item(new Item.Settings()));
    public static final Item GREEN_DIAMOND = registerItem("green_diamond", new Item(new Item.Settings()));
    //ADVANCED ITEMS
    //!METAL DETECTOR
    public static final Item METAL_DETECTOR = registerItem("metal_detector", new MetalDetectorItem(new Item.Settings().maxDamage(64)));
    public static final Item DIAMOND_DETECTOR = registerItem("diamond_detector", new DiamondDetectorItem(new Item.Settings().maxDamage(64)));


    //!CUSTOM TOOLS
// Rainbow Diamond Tools - Legendary
    public static final Item RAINBOW_DIAMOND_SWORD = registerItem("rainbow_diamond_sword",
            new SwordItem(ModToolMaterials.RAINBOW_DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.RAINBOW_DIAMOND, 11, -2.2f))));
    public static final Item RAINBOW_DIAMOND_PICKAXE = registerItem("rainbow_diamond_pickaxe",
            new PickaxeItem(ModToolMaterials.RAINBOW_DIAMOND, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.RAINBOW_DIAMOND, 8, -2.8f))));
    public static final Item RAINBOW_DIAMOND_AXE = registerItem("rainbow_diamond_axe",
            new AxeItem(ModToolMaterials.RAINBOW_DIAMOND, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.RAINBOW_DIAMOND, 13, -3.0f))));
    public static final Item RAINBOW_DIAMOND_SHOVEL = registerItem("rainbow_diamond_shovel",
            new ShovelItem(ModToolMaterials.RAINBOW_DIAMOND, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.RAINBOW_DIAMOND, 6, -2.5f))));
    public static final Item RAINBOW_DIAMOND_HOE = registerItem("rainbow_diamond_hoe",
            new HoeItem(ModToolMaterials.RAINBOW_DIAMOND, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.RAINBOW_DIAMOND, 2, -1.0f))));

    // Purple Diamond Tools
    public static final Item PURPLE_DIAMOND_SWORD = registerItem("purple_diamond_sword",
            new SwordItem(ModToolMaterials.PURPLE_DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PURPLE_DIAMOND, 9, -2.3f))));
    public static final Item PURPLE_DIAMOND_PICKAXE = registerItem("purple_diamond_pickaxe",
            new PickaxeItem(ModToolMaterials.PURPLE_DIAMOND, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PURPLE_DIAMOND, 7, -2.9f))));
    public static final Item PURPLE_DIAMOND_AXE = registerItem("purple_diamond_axe",
            new AxeItem(ModToolMaterials.PURPLE_DIAMOND, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PURPLE_DIAMOND, 10, -3.1f))));
    public static final Item PURPLE_DIAMOND_SHOVEL = registerItem("purple_diamond_shovel",
            new ShovelItem(ModToolMaterials.PURPLE_DIAMOND, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PURPLE_DIAMOND, 5, -2.6f))));
    public static final Item PURPLE_DIAMOND_HOE = registerItem("purple_diamond_hoe",
            new HoeItem(ModToolMaterials.PURPLE_DIAMOND, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PURPLE_DIAMOND, 1, -1.1f))));

    // Orange Diamond Tools
    public static final Item ORANGE_DIAMOND_SWORD = registerItem("orange_diamond_sword",
            new SwordItem(ModToolMaterials.ORANGE_DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ORANGE_DIAMOND, 8, -2.4f))));
    public static final Item ORANGE_DIAMOND_PICKAXE = registerItem("orange_diamond_pickaxe",
            new PickaxeItem(ModToolMaterials.ORANGE_DIAMOND, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.ORANGE_DIAMOND, 6, -3.0f))));
    public static final Item ORANGE_DIAMOND_AXE = registerItem("orange_diamond_axe",
            new AxeItem(ModToolMaterials.ORANGE_DIAMOND, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.ORANGE_DIAMOND, 9, -3.2f))));
    public static final Item ORANGE_DIAMOND_SHOVEL = registerItem("orange_diamond_shovel",
            new ShovelItem(ModToolMaterials.ORANGE_DIAMOND, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.ORANGE_DIAMOND, 4, -2.7f))));
    public static final Item ORANGE_DIAMOND_HOE = registerItem("orange_diamond_hoe",
            new HoeItem(ModToolMaterials.ORANGE_DIAMOND, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.ORANGE_DIAMOND, 1, -1.2f))));

    // Red Diamond Tools
    public static final Item RED_DIAMOND_SWORD = registerItem("red_diamond_sword",
            new SwordItem(ModToolMaterials.RED_DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.RED_DIAMOND, 7, -2.4f))));
    public static final Item RED_DIAMOND_PICKAXE = registerItem("red_diamond_pickaxe",
            new PickaxeItem(ModToolMaterials.RED_DIAMOND, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.RED_DIAMOND, 6, -3.1f))));
    public static final Item RED_DIAMOND_AXE = registerItem("red_diamond_axe",
            new AxeItem(ModToolMaterials.RED_DIAMOND, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.RED_DIAMOND, 8, -3.3f))));
    public static final Item RED_DIAMOND_SHOVEL = registerItem("red_diamond_shovel",
            new ShovelItem(ModToolMaterials.RED_DIAMOND, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.RED_DIAMOND, 4, -2.8f))));
    public static final Item RED_DIAMOND_HOE = registerItem("red_diamond_hoe",
            new HoeItem(ModToolMaterials.RED_DIAMOND, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.RED_DIAMOND, 1, -1.3f))));

    // Yellow Diamond Tools
    public static final Item YELLOW_DIAMOND_SWORD = registerItem("yellow_diamond_sword",
            new SwordItem(ModToolMaterials.YELLOW_DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.YELLOW_DIAMOND, 6, -2.5f))));
    public static final Item YELLOW_DIAMOND_PICKAXE = registerItem("yellow_diamond_pickaxe",
            new PickaxeItem(ModToolMaterials.YELLOW_DIAMOND, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.YELLOW_DIAMOND, 5, -3.2f))));
    public static final Item YELLOW_DIAMOND_AXE = registerItem("yellow_diamond_axe",
            new AxeItem(ModToolMaterials.YELLOW_DIAMOND, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.YELLOW_DIAMOND, 7, -3.4f))));
    public static final Item YELLOW_DIAMOND_SHOVEL = registerItem("yellow_diamond_shovel",
            new ShovelItem(ModToolMaterials.YELLOW_DIAMOND, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.YELLOW_DIAMOND, 3, -2.9f))));
    public static final Item YELLOW_DIAMOND_HOE = registerItem("yellow_diamond_hoe",
            new HoeItem(ModToolMaterials.YELLOW_DIAMOND, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.YELLOW_DIAMOND, 0, -1.4f))));

    // Green Diamond Tools
    public static final Item GREEN_DIAMOND_SWORD = registerItem("green_diamond_sword",
            new SwordItem(ModToolMaterials.GREEN_DIAMOND, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.GREEN_DIAMOND, 5, -2.6f))));
    public static final Item GREEN_DIAMOND_PICKAXE = registerItem("green_diamond_pickaxe",
            new PickaxeItem(ModToolMaterials.GREEN_DIAMOND, new Item.Settings().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.GREEN_DIAMOND, 4, -3.3f))));
    public static final Item GREEN_DIAMOND_AXE = registerItem("green_diamond_axe",
            new AxeItem(ModToolMaterials.GREEN_DIAMOND, new Item.Settings().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.GREEN_DIAMOND, 5, .5f))));
    public static final Item GREEN_DIAMOND_SHOVEL = registerItem("green_diamond_shovel",
            new ShovelItem(ModToolMaterials.GREEN_DIAMOND, new Item.Settings().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.GREEN_DIAMOND, 3, -1.0f))));
    public static final Item GREEN_DIAMOND_HOE = registerItem("green_diamond_hoe",
            new HoeItem(ModToolMaterials.GREEN_DIAMOND, new Item.Settings().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.GREEN_DIAMOND, 0, -0.5f))));



    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        //!RUBIES
        entries.add(RUBY);
        entries.add(RAW_RUBY);
        //! RUBY BLOCK
        entries.add(ModBlocks.RUBY_BLOCK);
        //!RAW RUBY BLOCK
        entries.add(ModBlocks.RAW_RUBY_BLOCK);



        //!DIAMONDS
        entries.add(RAINBOW_DIAMOND);
        entries.add(PURPLE_DIAMOND);
        entries.add(ORANGE_DIAMOND);
        entries.add(RED_DIAMOND);
        entries.add(YELLOW_DIAMOND);
        entries.add(GREEN_DIAMOND);
        //! DIAMOND BLOCKS
        entries.add(ModBlocks.RAINBOW_DIAMOND_BLOCK);
        entries.add(ModBlocks.PURPLE_DIAMOND_BLOCK);
        entries.add(ModBlocks.ORANGE_DIAMOND_BLOCK);
        entries.add(ModBlocks.RED_DIAMOND_BLOCK);
        entries.add(ModBlocks.YELLOW_DIAMOND_BLOCK);
        entries.add(ModBlocks.GREEN_DIAMOND_BLOCK);
        //!STONE DIAMOND ORES (RAW DIAMOND BLOCKS)
        entries.add(ModBlocks.RAW_STONE_RAINBOW_DIAMOND_BLOCK);
        entries.add(ModBlocks.RAW_STONE_PURPLE_DIAMOND_BLOCK);
        entries.add(ModBlocks.RAW_STONE_ORANGE_DIAMOND_BLOCK);
        entries.add(ModBlocks.RAW_STONE_RED_DIAMOND_BLOCK);
        entries.add(ModBlocks.RAW_STONE_YELLOW_DIAMOND_BLOCK);
        entries.add(ModBlocks.RAW_STONE_GREEN_DIAMOND_BLOCK);
        //!DEEPSLATE DIAMOND ORES (RAW DIAMOND BLOCKS)
        entries.add(ModBlocks.RAW_DEEPSLATE_RAINBOW_DIAMOND_BLOCK);
        entries.add(ModBlocks.RAW_DEEPSLATE_PURPLE_DIAMOND_BLOCK);
        entries.add(ModBlocks.RAW_DEEPSLATE_ORANGE_DIAMOND_BLOCK);
        entries.add(ModBlocks.RAW_DEEPSLATE_RED_DIAMOND_BLOCK);
        entries.add(ModBlocks.RAW_DEEPSLATE_YELLOW_DIAMOND_BLOCK);
        entries.add(ModBlocks.RAW_DEEPSLATE_GREEN_DIAMOND_BLOCK);
        //!ADVANCED ITEMS
        entries.add(METAL_DETECTOR);
        entries.add(DIAMOND_DETECTOR);
    }

    // HELPER METHODS
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(MCMODDIES.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MCMODDIES.LOGGER.info("Registering Mod Items for " + MCMODDIES.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
