package com.xannaeh.elemconv.initializers.tag;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {
    //Darkness
    public static final TagKey<Block> DARKNESS_ORE = BlockTags.create(ModTags.createBlockLocation("darkness_ore"));
    public static final TagKey<Block> DARKNESS_TREE_LOG = BlockTags.create(ModTags.createBlockLocation("darkness_tree_log"));
    public static final TagKey<Block> DARKNESS_TREE_PLANKS = BlockTags.create(ModTags.createBlockLocation("darkness_tree_planks"));
    public static final TagKey<Block> DARKNESS_TREE_SLAB = BlockTags.create(ModTags.createBlockLocation("darkness_tree_slab"));
    public static final TagKey<Block> DARKNESS_FLOWER = BlockTags.create(ModTags.createBlockLocation("darkness_flower"));
    //Light
    public static final TagKey<Block> LIGHT_ORE = BlockTags.create(ModTags.createBlockLocation("light_ore"));
}
