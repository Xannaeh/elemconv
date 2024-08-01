package com.xannaeh.elemconv.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.xannaeh.elemconv.main.ElemConv.MODID;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

    public static final DeferredBlock<Block> DARKNESS_ORE = BLOCKS.register("darkness_ore",
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))); //TODO: modify latter

    public static final DeferredBlock<Block> LIGHT_ORE = BLOCKS.register("light_ore",
            () -> new DarknessTreeLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_LOG))); //TODO: modify latter

    public static final DeferredBlock<Block> DARKNESS_TREE_LOG = BLOCKS.register("darkness_tree_log",
            () -> new DarknessTreeLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_LOG))); //TODO: modify latter

    public static final DeferredBlock<Block> DARKNESS_TREE_PLANKS = BLOCKS.register("darkness_tree_planks",
            () -> new DarknessTreeLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))); //TODO: modify latter

}
