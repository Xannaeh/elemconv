package com.xannaeh.elemconv.data.blockstate;

import com.xannaeh.elemconv.elements.block.ModBlocks;
import com.xannaeh.elemconv.elements.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import org.jetbrains.annotations.NotNull;

import static com.xannaeh.elemconv.main.ElemConv.MODID;

public class ModItemStateProvider extends ItemModelProvider {
    public ModItemStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Items
        // Darkness
        basicItem(ModItems.DARKNESS_RAW.get());
        basicItem(ModItems.DARKNESS_INGOT.get());
        basicItem(ModItems.DARKNESS_ESSENCE.get());
        basicItem(ModItems.DARKNESS_FRUIT.get());
        basicItem(ModItems.DARKNESS_FRUIT_DRIED.get());
        basicItem(ModItems.DARKNESS_IN_A_BOTTLE.get());
        basicItem(ModItems.DARKNESS_COAL.get());

        // Light
        basicItem(ModItems.LIGHT_RAW.get());
        basicItem(ModItems.LIGHT_INGOT.get());
        basicItem(ModItems.LIGHT_ESSENCE.get());
        basicItem(ModItems.LIGHT_FRUIT.get());
        basicItem(ModItems.LIGHT_FRUIT_DRIED.get());
        basicItem(ModItems.LIGHT_IN_A_BOTTLE.get());
        basicItem(ModItems.LIGHT_COAL.get());

        // Tools + Armors
        // Darkness
        basicItem(ModItems.DARKNESS_AXE.get());

        // Light
        basicItem(ModItems.LIGHT_AXE.get());

        // Blocks
        // Darkness
        modButtonItem(ModBlocks.DARKNESS_TREE_BUTTON, ModBlocks.DARKNESS_TREE_PLANKS);
        modFenceItem(ModBlocks.DARKNESS_TREE_FENCE, ModBlocks.DARKNESS_TREE_PLANKS);
        modWallItem(ModBlocks.DARKNESS_TREE_WALL, ModBlocks.DARKNESS_TREE_PLANKS);
        // Light
        modButtonItem(ModBlocks.LIGHT_TREE_BUTTON, ModBlocks.LIGHT_TREE_PLANKS);
        modFenceItem(ModBlocks.LIGHT_TREE_FENCE, ModBlocks.LIGHT_TREE_PLANKS);
        modWallItem(ModBlocks.LIGHT_TREE_WALL, ModBlocks.LIGHT_TREE_PLANKS);

    }

    public void modButtonItem(@NotNull DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(MODID, "block/" + baseBlock.getId().getPath()));
    }

    public void modFenceItem(@NotNull DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(MODID, "block/" + baseBlock.getId().getPath()));
    }

    public void modWallItem(@NotNull DeferredBlock<Block> block, DeferredBlock<Block> baseBlock) {
        withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", ResourceLocation.fromNamespaceAndPath(MODID, "block/" + baseBlock.getId().getPath()));
    }

}
