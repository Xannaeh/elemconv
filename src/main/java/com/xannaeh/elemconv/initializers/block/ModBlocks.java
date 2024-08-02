package com.xannaeh.elemconv.initializers.block;

import com.xannaeh.elemconv.initializers.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.SuspiciousStewEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.xannaeh.elemconv.main.ElemConv.MODID;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

    // Darkness
    public static final DeferredBlock<Block> DARKNESS_ORE = registerBlock("darkness_ore", () ->
            new Block(BlockBehaviour.Properties.of()
                    .destroyTime(3.0f)
                    .explosionResistance(10.0f)
                    .sound(SoundType.METAL)
                    .lightLevel((state) -> 1)
                    .requiresCorrectToolForDrops())); //TODO: modify latter

    public static final DeferredBlock<Block> DARKNESS_ORE_DEEPSLATE = registerBlock("darkness_ore_deepslate", () ->
            new Block(BlockBehaviour.Properties.of()
                    .destroyTime(5.0f)
                    .explosionResistance(10.0f)
                    .sound(SoundType.METAL)
                    .lightLevel((state) -> 1)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DARKNESS_TREE_LOG = registerBlock("darkness_tree_log", () ->
            new DarknessTreeLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_LOG)
                    .requiresCorrectToolForDrops())); //TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_TREE_PLANKS = registerBlock("darkness_tree_planks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)
                    .requiresCorrectToolForDrops())); //TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_TREE_SLAB = registerBlock("darkness_tree_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_SLAB)
                    .requiresCorrectToolForDrops())); //TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_FLOWER = registerBlock("darkness_flower", () ->
            new FlowerBlock(SuspiciousStewEffects.EMPTY, BlockBehaviour.Properties.ofFullCopy(Blocks.POPPY))); //TODO: modify latter
    // Light
    public static final DeferredBlock<Block> LIGHT_ORE = registerBlock("light_ore", () ->
            new Block(BlockBehaviour.Properties.of()
                    .destroyTime(3.0f)
                    .explosionResistance(10.0f)
                    .sound(SoundType.METAL)
                    .lightLevel((state) -> 10)
                    .requiresCorrectToolForDrops())); //TODO: modify latter

    public static final DeferredBlock<Block> LIGHT_ORE_DEEPSLATE = registerBlock("light_ore_deepslate", () ->
            new Block(BlockBehaviour.Properties.of()
                    .destroyTime(5.0f)
                    .explosionResistance(10.0f)
                    .sound(SoundType.METAL)
                    .lightLevel((state) -> 10)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> LIGHT_TREE_LOG = registerBlock("light_tree_log", () ->
            new LightTreeLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_LOG)
                    .requiresCorrectToolForDrops()
                    .lightLevel((state) -> 10))); //TODO: modify latter
    public static final DeferredBlock<Block> LIGHT_TREE_PLANKS = registerBlock("light_tree_planks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)
                    .requiresCorrectToolForDrops()
                    .lightLevel((state) -> 10))); //TODO: modify latter
    public static final DeferredBlock<Block> LIGHT_TREE_SLAB = registerBlock("light_tree_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_SLAB)
                    .requiresCorrectToolForDrops()
                    .lightLevel((state) -> 10))); //TODO: modify latter
    public static final DeferredBlock<Block> LIGHT_FLOWER = registerBlock("light_flower", () ->
            new FlowerBlock(SuspiciousStewEffects.EMPTY, BlockBehaviour.Properties.ofFullCopy(Blocks.POPPY)
                    .lightLevel((state) -> 10))); //TODO: modify latter

    public static DeferredBlock<Block> registerBlock(String name, Supplier<Block> block) {
        DeferredBlock<Block> blockReg = BLOCKS.register(name, block);
        ModItems.ITEMS.register(name, () -> new BlockItem(blockReg.get(), new Item.Properties()));
        return blockReg;
    }

}
