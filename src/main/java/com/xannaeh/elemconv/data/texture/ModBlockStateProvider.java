package com.xannaeh.elemconv.data.texture;

import com.xannaeh.elemconv.elements.block.ModBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static com.xannaeh.elemconv.main.ElemConv.MODID;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Ores
        // Darkness
        modNormalBlock(ModBlocks.DARKNESS_ORE.get());
        modNormalBlock(ModBlocks.DARKNESS_ORE_DEEPSLATE.get());
        modNormalBlock(ModBlocks.DARKNESS_ORE_ENDSTONE.get());
        // Light
        modNormalBlock(ModBlocks.LIGHT_ORE.get());
        modNormalBlock(ModBlocks.LIGHT_ORE_DEEPSLATE.get());
        modNormalBlock(ModBlocks.LIGHT_ORE_NETHERRACK.get());

        // Blocks
        // Darkness
        modNormalBlock(ModBlocks.DARKNESS_TREE_PLANKS.get());
        modLogBlock(ModBlocks.DARKNESS_TREE_LOG.get());
        modPlanksSlabBlock(ModBlocks.DARKNESS_TREE_SLAB.get());
        modCrossBlock(ModBlocks.DARKNESS_FLOWER.get());
        modSideBottomTopBlock(ModBlocks.DARKNESS_INFUSER_BASIC.get());
        // Light
        modNormalBlock(ModBlocks.LIGHT_TREE_PLANKS.get());
        modLogBlock(ModBlocks.LIGHT_TREE_LOG.get());
        modPlanksSlabBlock(ModBlocks.LIGHT_TREE_SLAB.get());
        modCrossBlock(ModBlocks.LIGHT_FLOWER.get());
    }

    private void modNormalBlock(Block block) {
        ResourceLocation blockKey = BuiltInRegistries.BLOCK.getKey(block);
        String path = blockKey.getPath();
        simpleBlock(block, models().cubeAll(path, modLoc("block/" + path)));
        simpleBlockItem(block, models().getExistingFile(modLoc("block/" + path)));
    }

    private void modSideBottomTopBlock(Block block) {
        ResourceLocation blockKey = BuiltInRegistries.BLOCK.getKey(block);
        String path = blockKey.getPath() + "_side";
        String pathTop = blockKey.getPath() + "_top";
        String pathBottom = blockKey.getPath() + "_bottom";
        simpleBlock(block, models().cubeBottomTop(path, modLoc("block/" + path), modLoc("block/" + pathBottom), modLoc("block/" + pathTop)));
        simpleBlockItem(block, models().getExistingFile(modLoc("block/" + path)));
    }

    private void modLogBlock(Block block) {
        ResourceLocation blockKey = BuiltInRegistries.BLOCK.getKey(block);
//        ResourceLocation blockKeyHorizontal = BuiltInRegistries.BLOCK.getKey(block);
        String path = blockKey.getPath();
        String pathTop = path + "_top";
        simpleBlock(block, models().cubeColumn(path, modLoc("block/" + path), modLoc("block/" + pathTop)));
//        simpleBlock(block, models().cubeColumnHorizontal(path, modLoc("block/" + path), modLoc("block/" + pathTop)));
        simpleBlockItem(block, models().getExistingFile(modLoc("block/" + path)));
    }

    private void modPlanksSlabBlock(Block block) {
        ResourceLocation blockKey = BuiltInRegistries.BLOCK.getKey(block);
        String path = blockKey.getPath();
        String pathFullBlock = path.replace("_slab", "_planks");
        simpleBlock(block, models().slab(path, modLoc("block/" + pathFullBlock), modLoc("block/" + pathFullBlock), modLoc("block/" + pathFullBlock)));
//        simpleBlock(block, models().slabTop(path, modLoc("block/" + path), modLoc("block/" + path), modLoc("block/" + path)));
        simpleBlockItem(block, models().getExistingFile(modLoc("block/" + path)));
    }

    private void modCrossBlock(Block block) {
        ResourceLocation blockKey = BuiltInRegistries.BLOCK.getKey(block);
        String path = blockKey.getPath();
        simpleBlock(block, models().cross(path, modLoc("block/" + path)).renderType(RenderType.cutout().name));
        simpleBlockItem(block, models().getExistingFile(modLoc("block/" + path)));
    }
}
