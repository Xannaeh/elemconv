package com.xannaeh.elemconv.data.blockstate;

import com.xannaeh.elemconv.elements.block.ModBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.NotNull;

import static com.xannaeh.elemconv.main.ElemConv.MODID;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Ores
        // Darkness
        modSimpleBlockWithItem(ModBlocks.DARKNESS_ORE);
        modSimpleBlockWithItem(ModBlocks.DARKNESS_ORE_DEEPSLATE);
        modSimpleBlockWithItem(ModBlocks.DARKNESS_ORE_ENDSTONE);
        modSimpleBlockWithItem(ModBlocks.DARKNESS_RAW_BLOCK);
        // Light
        modSimpleBlockWithItem(ModBlocks.LIGHT_ORE);
        modSimpleBlockWithItem(ModBlocks.LIGHT_ORE_DEEPSLATE);
        modSimpleBlockWithItem(ModBlocks.LIGHT_ORE_NETHERRACK);
        modSimpleBlockWithItem(ModBlocks.LIGHT_RAW_BLOCK);

        // Blocks
        // Darkness
        modSimpleBlockWithItem(ModBlocks.DARKNESS_INGOT_BLOCK);
        modLogBlock(ModBlocks.DARKNESS_TREE_LOG.get());
        modSimpleWoodBlockWithItem(ModBlocks.DARKNESS_TREE_WOOD.get());
        modLogBlock(ModBlocks.DARKNESS_TREE_LOG_STRIPPED.get());
        modSimpleBlockWithItem(ModBlocks.DARKNESS_TREE_PLANKS);
        modSlabBlock(ModBlocks.DARKNESS_TREE_SLAB, ModBlocks.DARKNESS_TREE_PLANKS);
        modStairsBlock(ModBlocks.DARKNESS_TREE_STAIRS, ModBlocks.DARKNESS_TREE_PLANKS);
        modPressurePlate(ModBlocks.DARKNESS_TREE_PRESSURE_PLATE, ModBlocks.DARKNESS_TREE_PLANKS);
        modButton(ModBlocks.DARKNESS_TREE_BUTTON, ModBlocks.DARKNESS_TREE_PLANKS);
        modFenceBlock(ModBlocks.DARKNESS_TREE_FENCE, ModBlocks.DARKNESS_TREE_PLANKS);
        modFenceGateBlock(ModBlocks.DARKNESS_TREE_FENCE_GATE, ModBlocks.DARKNESS_TREE_PLANKS);
        modWallBlock(ModBlocks.DARKNESS_TREE_WALL, ModBlocks.DARKNESS_TREE_PLANKS);
        modCrossBlock(ModBlocks.DARKNESS_FLOWER.get());
        modCrossBlock(ModBlocks.DARKNESS_TREE_SAPLING.get());
        modSideBottomTopBlock(ModBlocks.DARKNESS_INFUSER_BASIC.get());
        // Light
        modSimpleBlockWithItem(ModBlocks.LIGHT_INGOT_BLOCK);
        modLogBlock(ModBlocks.LIGHT_TREE_LOG.get());
        modSimpleWoodBlockWithItem(ModBlocks.LIGHT_TREE_WOOD.get());
        modLogBlock(ModBlocks.LIGHT_TREE_LOG_STRIPPED.get());
        modSimpleBlockWithItem(ModBlocks.LIGHT_TREE_PLANKS);
        modSlabBlock(ModBlocks.LIGHT_TREE_SLAB, ModBlocks.LIGHT_TREE_PLANKS);
        modStairsBlock(ModBlocks.LIGHT_TREE_STAIRS, ModBlocks.LIGHT_TREE_PLANKS);
        modPressurePlate(ModBlocks.LIGHT_TREE_PRESSURE_PLATE, ModBlocks.LIGHT_TREE_PLANKS);
        modButton(ModBlocks.LIGHT_TREE_BUTTON, ModBlocks.LIGHT_TREE_PLANKS);
        modFenceBlock(ModBlocks.LIGHT_TREE_FENCE, ModBlocks.LIGHT_TREE_PLANKS);
        modFenceGateBlock(ModBlocks.LIGHT_TREE_FENCE_GATE, ModBlocks.LIGHT_TREE_PLANKS);
        modWallBlock(ModBlocks.LIGHT_TREE_WALL, ModBlocks.LIGHT_TREE_PLANKS);
        modCrossBlock(ModBlocks.LIGHT_FLOWER.get());
        modCrossBlock(ModBlocks.LIGHT_TREE_SAPLING.get());
        modSideBottomTopBlock(ModBlocks.LIGHT_INFUSER_BASIC.get());
    }

    private void modSimpleBlockWithItem(@NotNull DeferredBlock<Block> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }


    private void modSlabBlock(@NotNull DeferredBlock<Block> deferredBlock, @NotNull DeferredBlock<Block> textureBlock) {
        slabBlock(((SlabBlock) deferredBlock.get()), blockTexture(textureBlock.get()), blockTexture(textureBlock.get()));
        modBlockItem(deferredBlock);
    }

    private void modStairsBlock(@NotNull DeferredBlock<Block> deferredBlock, @NotNull DeferredBlock<Block> textureBlock) {
        stairsBlock(((StairBlock) deferredBlock.get()), blockTexture(textureBlock.get()));
        modBlockItem(deferredBlock);
    }

    private void modPressurePlate(@NotNull DeferredBlock<Block> deferredBlock, @NotNull DeferredBlock<Block> textureBlock) {
        pressurePlateBlock(((PressurePlateBlock) deferredBlock.get()), blockTexture(textureBlock.get()));
        modBlockItem(deferredBlock);
    }

    private void modButton(@NotNull DeferredBlock<Block> deferredBlock, @NotNull DeferredBlock<Block> textureBlock) {
        buttonBlock(((ButtonBlock) deferredBlock.get()), blockTexture(textureBlock.get()));
        // You have to manually create the item!
    }

    private void modFenceBlock(@NotNull DeferredBlock<Block> deferredBlock, @NotNull DeferredBlock<Block> textureBlock) {
        fenceBlock(((FenceBlock) deferredBlock.get()), blockTexture(textureBlock.get()));
        // You have to manually create the item!
    }

    private void modFenceGateBlock(@NotNull DeferredBlock<Block> deferredBlock, @NotNull DeferredBlock<Block> textureBlock) {
        fenceGateBlock(((FenceGateBlock) deferredBlock.get()), blockTexture(textureBlock.get()));
        modBlockItem(deferredBlock);
    }

    private void modWallBlock(@NotNull DeferredBlock<Block> deferredBlock, @NotNull DeferredBlock<Block> textureBlock) {
        wallBlock(((WallBlock) deferredBlock.get()), blockTexture(textureBlock.get()));
        // You have to manually create the item!
    }

    private void modBlockItem(@NotNull DeferredBlock<Block> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile(MODID + ":block/" + deferredBlock.getId().getPath()));
    }


    private void modSimpleWoodBlockWithItem(Block block) {
        ResourceLocation blockKey = BuiltInRegistries.BLOCK.getKey(block);
        String path = blockKey.getPath();
        String path_log = path.replace("wood", "log");
        simpleBlock(block, models().cubeColumn(path, modLoc("block/" + path_log), modLoc("block/" + path_log)));
//        simpleBlock(block, models().cubeColumnHorizontal(path, modLoc("block/" + path), modLoc("block/" + path)));
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


    private void modCrossBlock(Block block) {
        ResourceLocation blockKey = BuiltInRegistries.BLOCK.getKey(block);
        String path = blockKey.getPath();
        simpleBlock(block, models().cross(path, modLoc("block/" + path)).renderType(RenderType.cutout().name));
        simpleBlockItem(block, models().getExistingFile(modLoc("block/" + path)));
    }
}
