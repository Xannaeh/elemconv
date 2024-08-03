package com.xannaeh.elemconv.elements.tag;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static com.xannaeh.elemconv.main.ElemConv.MODID;

public class ModTags {
    public static ResourceLocation createOreLocation(String name) {
        return ResourceLocation.fromNamespaceAndPath(MODID, "ores/" + name);
    }

    public static ResourceLocation createBlockLocation(String name) {
        return ResourceLocation.fromNamespaceAndPath(MODID, name);
    }

    public static ResourceLocation createGenericItemsLocation(String name) {
        return ResourceLocation.fromNamespaceAndPath(MODID, name);
    }

    public static ResourceLocation createRawItemsLocation(String name) {
        return ResourceLocation.fromNamespaceAndPath(MODID, "raw/" + name);
    }

    public static TagKey<Block> createToolTag(String name) {
        return TagKey.create(BuiltInRegistries.BLOCK.key(), ResourceLocation.fromNamespaceAndPath(MODID, name));
    }

    public class ModItemTags {
        // Items
        // Darkness
        public static final TagKey<Item> DARKNESS_RAW_TAG = ItemTags.create(createRawItemsLocation("darkness_raw"));
        // Light
        public static final TagKey<Item> LIGHT_RAW_TAG = ItemTags.create(createRawItemsLocation("light_raw"));
        // Blocks
        // Darkness
        public static final TagKey<Item> DARKNESS_ORE_TAG = ItemTags.create(createRawItemsLocation("darkness_ore"));
        public static final TagKey<Item> DARKNESS_ORE_DEEPSLATE_TAG = ItemTags.create(createRawItemsLocation("darkness_ore_deepslate"));
        // Light
        public static final TagKey<Item> LIGHT_ORE_TAG = ItemTags.create(createRawItemsLocation("light_ore"));
        public static final TagKey<Item> LIGHT_ORE_DEEPSLATE_TAG = ItemTags.create(createRawItemsLocation("light_ore_deepslate"));

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(MODID, name));
        }

    }

    public class ModBlockTags {
        // Darkness
        public static final TagKey<Block> DARKNESS_ORE_TAG = BlockTags.create(ModTags.createOreLocation("darkness_ore"));
        public static final TagKey<Block> DARKNESS_ORE_DEEPSLATE_TAG = BlockTags.create(ModTags.createOreLocation("darkness_ore_deepslate"));
        // Light
        public static final TagKey<Block> LIGHT_ORE_TAG = BlockTags.create(ModTags.createOreLocation("light_ore"));
        public static final TagKey<Block> LIGHT_ORE_DEEPSLATE_TAG = BlockTags.create(ModTags.createOreLocation("light_ore_deepslate"));


        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(MODID, name));
        }
    }

}
