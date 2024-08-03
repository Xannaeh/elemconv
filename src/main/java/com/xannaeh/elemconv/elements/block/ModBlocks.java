package com.xannaeh.elemconv.elements.block;

import com.xannaeh.elemconv.elements.block.custom.DarknessInfuserBasic;
import com.xannaeh.elemconv.elements.block.custom.DarknessTreeLogBlock;
import com.xannaeh.elemconv.elements.block.custom.LightInfuserBasic;
import com.xannaeh.elemconv.elements.block.custom.LightTreeLogBlock;
import com.xannaeh.elemconv.elements.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.SuspiciousStewEffects;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
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
                    .strength(4)
                    .requiresCorrectToolForDrops())
    ); //TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_ORE_DEEPSLATE = registerBlock("darkness_ore_deepslate", () ->
            new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.of()
                    .destroyTime(5.0f)
                    .explosionResistance(10.0f)
                    .sound(SoundType.METAL)
                    .lightLevel((state) -> 1)
                    .strength(6)
                    .requiresCorrectToolForDrops())
    );//TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_ORE_ENDSTONE = registerBlock("darkness_ore_endstone", () ->
            new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.of()
                    .destroyTime(5.0f)
                    .explosionResistance(10.0f)
                    .sound(SoundType.METAL)
                    .lightLevel((state) -> 1)
                    .strength(4)
                    .requiresCorrectToolForDrops())
    );//TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_RAW_BLOCK = registerBlock("darkness_raw_block", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK)
                    .lightLevel((state) -> 1)
                    .strength(4)
                    .requiresCorrectToolForDrops())
    ); //TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_INGOT_BLOCK = registerBlock("darkness_ingot_block", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                    .lightLevel((state) -> 1)
                    .strength(4)
                    .requiresCorrectToolForDrops())
    ); //TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_TREE_LOG = registerBlock("darkness_tree_log", () ->
            new DarknessTreeLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_LOG)
                    .lightLevel((state) -> 1)
                    .strength(4)
                    .requiresCorrectToolForDrops())
    ); //TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_TREE_WOOD = registerBlock("darkness_tree_wood", () ->
            new DarknessTreeLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_WOOD)
                    .lightLevel((state) -> 1)
                    .strength(4)
                    .requiresCorrectToolForDrops())
    ); //TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_TREE_LOG_STRIPPED = registerBlock("darkness_tree_log_stripped", () ->
            new DarknessTreeLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_ACACIA_LOG)
                    .lightLevel((state) -> 1)
                    .strength(4)
                    .requiresCorrectToolForDrops())
    ); //TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_TREE_PLANKS = registerBlock("darkness_tree_planks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)
                    .lightLevel((state) -> 1)
                    .strength(4)
                    .requiresCorrectToolForDrops())
    ); //TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_TREE_SLAB = registerBlock("darkness_tree_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.of()
                    .lightLevel((state) -> 1)
                    .strength(4)
                    .requiresCorrectToolForDrops())
    ); //TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_TREE_PRESSURE_PLATE = registerBlock("darkness_tree_pressure_plate", () ->
            new PressurePlateBlock(BlockSetType.ACACIA, BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .lightLevel((state) -> 1)
                    .strength(4))
    ); //TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_TREE_FENCE = registerBlock("darkness_tree_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .lightLevel((state) -> 1)
                    .strength(4))
    ); //TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_TREE_FENCE_GATE = registerBlock("darkness_tree_fence_gate", () ->
            new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .lightLevel((state) -> 1)
                    .strength(4))
    ); //TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_TREE_WALL = registerBlock("darkness_tree_wall", () ->
            new WallBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .lightLevel((state) -> 1)
                    .strength(4))
    ); //TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_TREE_BUTTON = registerBlock("darkness_tree_button", () ->
            new ButtonBlock(BlockSetType.ACACIA, 20, BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4)
                    .noCollission()
                    .lightLevel((state) -> 1))
    ); //TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_TREE_STAIRS = registerBlock("darkness_tree_stairs", () ->
            new StairBlock(ModBlocks.DARKNESS_TREE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .lightLevel((state) -> 1)
                            .strength(4)
                            .requiresCorrectToolForDrops())
    ); //TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_FLOWER = registerBlock("darkness_flower", () ->
            new FlowerBlock(SuspiciousStewEffects.EMPTY, BlockBehaviour.Properties.ofFullCopy(Blocks.POPPY)
                    .lightLevel((state) -> 1)
                    .strength(4))
    ); //TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_TREE_SAPLING = registerBlock("darkness_tree_sapling", () ->
            new SaplingBlock(TreeGrower.ACACIA, BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_SAPLING)
                    .lightLevel((state) -> 1)
                    .strength(4))
    ); //TODO: modify latter
    public static final DeferredBlock<Block> DARKNESS_INFUSER_BASIC = registerBlock("darkness_infuser_basic", () ->
            new DarknessInfuserBasic(BlockBehaviour.Properties.of()
                    .destroyTime(5.0f)
                    .explosionResistance(10.0f)
                    .sound(SoundType.AMETHYST)
                    .lightLevel((state) -> 5)
                    .strength(4)
                    .requiresCorrectToolForDrops())
    );//TODO: modify latter

    // Light
    public static final DeferredBlock<Block> LIGHT_ORE = registerBlock("light_ore", () ->
            new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.of()
                    .destroyTime(3.0f)
                    .explosionResistance(10.0f)
                    .sound(SoundType.METAL)
                    .lightLevel((state) -> 10)
                    .strength(4)
                    .requiresCorrectToolForDrops())
    ); //TODO: modify latter
    public static final DeferredBlock<Block> LIGHT_ORE_DEEPSLATE = registerBlock("light_ore_deepslate", () ->
            new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.of()
                    .destroyTime(5.0f)
                    .explosionResistance(10.0f)
                    .sound(SoundType.METAL)
                    .lightLevel((state) -> 10)
                    .strength(4)
                    .requiresCorrectToolForDrops())
    );//TODO: modify latter
    public static final DeferredBlock<Block> LIGHT_ORE_NETHERRACK = registerBlock("light_ore_netherrack", () ->
            new DropExperienceBlock(UniformInt.of(2, 5), BlockBehaviour.Properties.of()
                    .destroyTime(5.0f)
                    .explosionResistance(10.0f)
                    .sound(SoundType.METAL)
                    .lightLevel((state) -> 10)
                    .strength(4)
                    .requiresCorrectToolForDrops())
    );//TODO: modify latter
    public static final DeferredBlock<Block> LIGHT_RAW_BLOCK = registerBlock("light_raw_block", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK)
                    .lightLevel((state) -> 1)
                    .requiresCorrectToolForDrops()
                    .strength(4))
    ); //TODO: modify latter
    public static final DeferredBlock<Block> LIGHT_INGOT_BLOCK = registerBlock("light_ingot_block", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                    .lightLevel((state) -> 1)
                    .requiresCorrectToolForDrops()
                    .strength(4))
    ); //TODO: modify latter
    public static final DeferredBlock<Block> LIGHT_TREE_LOG = registerBlock("light_tree_log", () ->
            new LightTreeLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_LOG)
                    .requiresCorrectToolForDrops()
                    .lightLevel((state) -> 10)
                    .strength(4))
    ); //TODO: modify latter
    public static final DeferredBlock<Block> LIGHT_TREE_WOOD = registerBlock("light_tree_wood", () ->
            new DarknessTreeLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_WOOD)
                    .requiresCorrectToolForDrops()
                    .strength(4))
    ); //TODO: modify latter
    public static final DeferredBlock<Block> LIGHT_TREE_LOG_STRIPPED = registerBlock("light_tree_log_stripped", () ->
            new LightTreeLogBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_ACACIA_LOG)
                    .requiresCorrectToolForDrops()
                    .lightLevel((state) -> 10)
                    .strength(4))
    ); //TODO: modify latter
    public static final DeferredBlock<Block> LIGHT_TREE_PLANKS = registerBlock("light_tree_planks", () ->
            new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS)
                    .requiresCorrectToolForDrops()
                    .lightLevel((state) -> 10)
                    .strength(4))
    ); //TODO: modify latter
    public static final DeferredBlock<Block> LIGHT_TREE_SLAB = registerBlock("light_tree_slab", () ->
            new SlabBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .lightLevel((state) -> 10)
                    .strength(4))
    ); //TODO: modify latter
    public static final DeferredBlock<Block> LIGHT_TREE_PRESSURE_PLATE = registerBlock("light_tree_pressure_plate", () ->
            new PressurePlateBlock(BlockSetType.ACACIA, BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .lightLevel((state) -> 10)
                    .strength(4))
    ); //TODO: modify latter
    public static final DeferredBlock<Block> LIGHT_TREE_FENCE = registerBlock("light_tree_fence", () ->
            new FenceBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .lightLevel((state) -> 10)
                    .strength(4))
    ); //TODO: modify latter
    public static final DeferredBlock<Block> LIGHT_TREE_FENCE_GATE = registerBlock("light_tree_fence_gate", () ->
            new FenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .lightLevel((state) -> 10)
                    .strength(4))
    ); //TODO: modify latter
    public static final DeferredBlock<Block> LIGHT_TREE_WALL = registerBlock("light_tree_wall", () ->
            new WallBlock(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .lightLevel((state) -> 10)
                    .strength(4))
    ); //TODO: modify latter
    public static final DeferredBlock<Block> LIGHT_TREE_BUTTON = registerBlock("light_tree_button", () ->
            new ButtonBlock(BlockSetType.ACACIA, 10, BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4)
                    .noCollission()
                    .lightLevel((state) -> 10))
    ); //TODO: modify latter
    public static final DeferredBlock<Block> LIGHT_TREE_STAIRS = registerBlock("light_tree_stairs", () ->
            new StairBlock(ModBlocks.LIGHT_TREE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                            .lightLevel((state) -> 10)
                            .strength(4)
                            .requiresCorrectToolForDrops())
    ); //TODO: modify latter
    public static final DeferredBlock<Block> LIGHT_FLOWER = registerBlock("light_flower", () ->
            new FlowerBlock(SuspiciousStewEffects.EMPTY, BlockBehaviour.Properties.ofFullCopy(Blocks.POPPY)
                    .lightLevel((state) -> 10))
    ); //TODO: modify latter
    public static final DeferredBlock<Block> LIGHT_TREE_SAPLING = registerBlock("light_tree_sapling", () ->
            new SaplingBlock(TreeGrower.ACACIA, BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_SAPLING)
                    .lightLevel((state) -> 10))
    ); //TODO: modify latter
    public static final DeferredBlock<Block> LIGHT_INFUSER_BASIC = registerBlock("light_infuser_basic", () ->
            new LightInfuserBasic(BlockBehaviour.Properties.of()
                    .destroyTime(5.0f)
                    .explosionResistance(10.0f)
                    .sound(SoundType.AMETHYST)
                    .lightLevel((state) -> 5)
                    .strength(4)
                    .requiresCorrectToolForDrops())
    );//TODO: modify latter


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
