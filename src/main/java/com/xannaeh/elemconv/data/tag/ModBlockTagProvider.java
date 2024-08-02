package com.xannaeh.elemconv.data.tag;

import com.xannaeh.elemconv.initializers.block.ModBlocks;
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
//        tag(ModBlockTags.EXAMPLE_BLOCK_TAG)
//                .add(ModBlocks.DARKNESS_ORE.get());

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.DARKNESS_ORE.get())
                .add(ModBlocks.LIGHT_ORE.get());

        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.DARKNESS_TREE_LOG.get())
                .add(ModBlocks.DARKNESS_TREE_PLANKS.get())
                .add(ModBlocks.DARKNESS_TREE_SLAB.get());


//        TagKey<Block> netherite = createNeoForgeTag("needs_netherite_tool");

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.DARKNESS_ORE.get())
                .add(ModBlocks.LIGHT_ORE.get())
                .add(ModBlocks.DARKNESS_TREE_LOG.get())
                .add(ModBlocks.DARKNESS_TREE_PLANKS.get())
                .add(ModBlocks.DARKNESS_TREE_SLAB.get());

    }
}
