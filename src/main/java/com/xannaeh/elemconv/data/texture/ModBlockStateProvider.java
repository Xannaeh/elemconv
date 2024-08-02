package com.xannaeh.elemconv.data.texture;

import com.xannaeh.elemconv.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static com.xannaeh.elemconv.main.ElemConv.MODID;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        normalBlock(ModBlocks.DARKNESS_ORE.get());
        normalBlock(ModBlocks.LIGHT_ORE.get());
        normalBlock(ModBlocks.DARKNESS_TREE_PLANKS.get());
//        normalBlock(ModBlocks.DARKNESS_TREE_LOG.get());
//        normalBlock(ModBlocks.DARKNESS_TREE_SLAB.get());
//        normalBlock(ModBlocks.DARKNESS_FLOWER.get());
    }

    private void normalBlock(Block block) {
        ResourceLocation blockKey = BuiltInRegistries.BLOCK.getKey(block);
        String path = blockKey.getPath();
        simpleBlock(block, models().cubeAll(path, modLoc("block/" + path)));
        simpleBlockItem(block, models().getExistingFile(modLoc("block/" + path)));
    }
}
