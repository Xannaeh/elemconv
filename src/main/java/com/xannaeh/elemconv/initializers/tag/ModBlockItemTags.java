package com.xannaeh.elemconv.initializers.tag;

import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModBlockItemTags {
    // Darkness
    public static final TagKey<Item> DARKNESS_ORE = ItemTags.create(ModTags.createBlockLocation("darkness_ore"));
    public static final TagKey<Item> DARKNESS_TREE_LOG = ItemTags.create(ModTags.createBlockLocation("darkness_tree_log"));
    public static final TagKey<Item> DARKNESS_TREE_PLANKS = ItemTags.create(ModTags.createBlockLocation("darkness_tree_planks"));
    public static final TagKey<Item> DARKNESS_TREE_SLAB = ItemTags.create(ModTags.createBlockLocation("darkness_tree_slab"));
    public static final TagKey<Item> DARKNESS_FLOWER = ItemTags.create(ModTags.createBlockLocation("darkness_flower"));
    // Light
    public static final TagKey<Item> LIGHT_ORE = ItemTags.create(ModTags.createBlockLocation("light_ore"));
}
