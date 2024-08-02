package com.xannaeh.elemconv.initializers.tag;

import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {
    // Darkness
    public static final TagKey<Item> RAW_DARKNESS = ItemTags.create(ModTags.createGenericItemsLocation("raw_darkness"));
    public static final TagKey<Item> DARKNESS_INGOT = ItemTags.create(ModTags.createGenericItemsLocation("darkness_ingot"));
    public static final TagKey<Item> DARKNESS_ESSENCE = ItemTags.create(ModTags.createGenericItemsLocation("darkness_essence"));
    public static final TagKey<Item> DARKNESS_FRUIT = ItemTags.create(ModTags.createGenericItemsLocation("darkness_fruit"));
    public static final TagKey<Item> DARKNESS_FRUIT_DRIED = ItemTags.create(ModTags.createGenericItemsLocation("darkness_fruit_dried"));
    // Light
}
