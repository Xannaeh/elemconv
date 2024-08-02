package com.xannaeh.elemconv.initializers.block;

import com.xannaeh.elemconv.initializers.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.SuspiciousStewEffects;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.xannaeh.elemconv.main.ElemConv.MODID;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

    // Darkness
    public static final DeferredBlock<Block> DARKNESS_ORE = registerBlock("darkness_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))); //TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_TREE_LOG = registerBlock("darkness_tree_log", () -> new DarknessTreeLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_LOG))); //TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_TREE_PLANKS = registerBlock("darkness_tree_planks", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS))); //TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_TREE_SLAB = registerBlock("darkness_tree_slab", () -> new SlabBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_SLAB))); //TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_FLOWER = registerBlock("darkness_flower", () -> new FlowerBlock(SuspiciousStewEffects.EMPTY, BlockBehaviour.Properties.ofFullCopy(Blocks.POPPY))); //TODO: modify latter
    // Light
    public static final DeferredBlock<Block> LIGHT_ORE = registerBlock("light_ore", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))); //TODO: modify latter


    public static DeferredBlock<Block> registerBlock(String name, Supplier<Block> block) {
        DeferredBlock<Block> blockReg = BLOCKS.register(name, block);
        ModItems.ITEMS.register(name, () -> new BlockItem(blockReg.get(), new Item.Properties()));
        return blockReg;
    }

}
