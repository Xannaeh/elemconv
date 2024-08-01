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
            () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT))); //TODO: modify latter

}
