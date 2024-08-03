package com.xannaeh.elemconv.data.loottable;

import com.xannaeh.elemconv.initializers.block.ModBlocks;
import com.xannaeh.elemconv.initializers.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import static com.xannaeh.elemconv.main.ElemConv.MODID;

public class ModBlockLootTables extends BlockLootSubProvider {
    protected ModBlockLootTables(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        // Ores
        // Darkness
        add(ModBlocks.DARKNESS_ORE.get(), createOreDrop(ModBlocks.DARKNESS_ORE.get(), ModItems.DARKNESS_RAW.get()));
        add(ModBlocks.DARKNESS_ORE_DEEPSLATE.get(), createOreDrop(ModBlocks.DARKNESS_ORE_DEEPSLATE.get(), ModItems.DARKNESS_RAW.get()));
        add(ModBlocks.DARKNESS_ORE_ENDSTONE.get(), createOreDrop(ModBlocks.DARKNESS_ORE_ENDSTONE.get(), ModItems.DARKNESS_RAW.get()));
        // Light
        add(ModBlocks.LIGHT_ORE.get(), createOreDrop(ModBlocks.LIGHT_ORE.get(), ModItems.LIGHT_RAW.get()));
        add(ModBlocks.LIGHT_ORE_DEEPSLATE.get(), createOreDrop(ModBlocks.LIGHT_ORE_DEEPSLATE.get(), ModItems.LIGHT_RAW.get()));
        add(ModBlocks.LIGHT_ORE_NETHERRACK.get(), createOreDrop(ModBlocks.LIGHT_ORE_NETHERRACK.get(), ModItems.LIGHT_RAW.get()));


        // Blocks
        // Darkness
        dropSelf(ModBlocks.DARKNESS_TREE_LOG.get());
        dropSelf(ModBlocks.DARKNESS_TREE_PLANKS.get());
        dropSelf(ModBlocks.DARKNESS_TREE_SLAB.get());
        dropSelf(ModBlocks.DARKNESS_FLOWER.get());
        // Light
        dropSelf(ModBlocks.LIGHT_TREE_LOG.get());
        dropSelf(ModBlocks.LIGHT_TREE_PLANKS.get());
        dropSelf(ModBlocks.LIGHT_TREE_SLAB.get());
        dropSelf(ModBlocks.LIGHT_FLOWER.get());
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return BuiltInRegistries.BLOCK.stream()
                .filter(block -> Optional.of(BuiltInRegistries.BLOCK.getKey(block))
                        .filter(key -> key.getNamespace().equals(MODID))
                        .isPresent())
                .collect(Collectors.toSet());
    }
}
