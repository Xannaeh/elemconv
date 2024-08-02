package com.xannaeh.elemconv.data.tag;

import com.xannaeh.elemconv.initializers.block.ModBlocks;
import com.xannaeh.elemconv.initializers.tag.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static com.xannaeh.elemconv.main.ElemConv.MODID;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        // Ores
        // Darkness
        tag(ModTags.ModBlockTags.DARKNESS_ORE_TAG)
                .add(ModBlocks.DARKNESS_ORE.get());
        tag(ModTags.ModBlockTags.DARKNESS_ORE_DEEPSLATE_TAG)
                .add(ModBlocks.DARKNESS_ORE_DEEPSLATE.get());
        // Light
        tag(ModTags.ModBlockTags.LIGHT_ORE_TAG)
                .add(ModBlocks.LIGHT_ORE.get());
        tag(ModTags.ModBlockTags.LIGHT_ORE_DEEPSLATE_TAG)
                .add(ModBlocks.LIGHT_ORE_DEEPSLATE.get());

        // TOOLS
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.DARKNESS_ORE.get())
                .add(ModBlocks.DARKNESS_ORE_DEEPSLATE.get())
                .add(ModBlocks.LIGHT_ORE.get())
                .add(ModBlocks.LIGHT_ORE_DEEPSLATE.get());

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.DARKNESS_TREE_LOG.get())
                .add(ModBlocks.DARKNESS_TREE_PLANKS.get())
                .add(ModBlocks.DARKNESS_TREE_SLAB.get())
                .add(ModBlocks.LIGHT_TREE_LOG.get())
                .add(ModBlocks.LIGHT_TREE_PLANKS.get())
                .add(ModBlocks.LIGHT_TREE_SLAB.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.DARKNESS_ORE.get())
                .add(ModBlocks.DARKNESS_ORE_DEEPSLATE.get())
                .add(ModBlocks.LIGHT_ORE.get())
                .add(ModBlocks.LIGHT_ORE_DEEPSLATE.get())
                .add(ModBlocks.DARKNESS_TREE_LOG.get())
                .add(ModBlocks.DARKNESS_TREE_PLANKS.get())
                .add(ModBlocks.DARKNESS_TREE_SLAB.get())
                .add(ModBlocks.LIGHT_TREE_LOG.get())
                .add(ModBlocks.LIGHT_TREE_PLANKS.get())
                .add(ModBlocks.LIGHT_TREE_SLAB.get());

    }
}
