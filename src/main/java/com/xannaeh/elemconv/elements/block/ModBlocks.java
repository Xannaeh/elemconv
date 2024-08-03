package com.xannaeh.elemconv.elements.block;

import com.xannaeh.elemconv.elements.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.SuspiciousStewEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.xannaeh.elemconv.main.ElemConv.MODID;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

    // Darkness
    public static final DeferredBlock<Block> DARKNESS_ORE = registerBlock("darkness_ore", () ->
            new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.of()
                    .destroyTime(3.0f)
                    .explosionResistance(10.0f)
                    .sound(SoundType.METAL)
                    .lightLevel((state) -> 1)
                    .requiresCorrectToolForDrops())); //TODO: modify latter

    public static final DeferredBlock<Block> DARKNESS_ORE_DEEPSLATE = registerBlock("darkness_ore_deepslate", () ->
            new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.of()
                    .destroyTime(5.0f)
                    .explosionResistance(10.0f)
                    .sound(SoundType.METAL)
                    .lightLevel((state) -> 1)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DARKNESS_ORE_ENDSTONE = registerBlock("darkness_ore_endstone", () ->
            new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.of()
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
            new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.of()
                    .destroyTime(3.0f)
                    .explosionResistance(10.0f)
                    .sound(SoundType.METAL)
                    .lightLevel((state) -> 10)
                    .requiresCorrectToolForDrops())); //TODO: modify latter

    public static final DeferredBlock<Block> LIGHT_ORE_DEEPSLATE = registerBlock("light_ore_deepslate", () ->
            new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.of()
                    .destroyTime(5.0f)
                    .explosionResistance(10.0f)
                    .sound(SoundType.METAL)
                    .lightLevel((state) -> 10)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> LIGHT_ORE_NETHERRACK = registerBlock("light_ore_netherrack", () ->
            new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.of()
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

    public static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> blockReg = BLOCKS.register(name, block);
        registerBlockItem(name, blockReg);
        return blockReg;
    }

    public static <T extends Block> void registerBlockItem(String name, Supplier<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus) {
        ModBlocks.BLOCKS.register(eventBus);
    }
}
