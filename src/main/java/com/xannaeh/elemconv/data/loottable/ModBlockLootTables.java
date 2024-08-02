package com.xannaeh.elemconv.data.loottable;

import com.xannaeh.elemconv.initializers.block.ModBlocks;
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
        dropSelf(ModBlocks.DARKNESS_ORE.get());
        dropSelf(ModBlocks.LIGHT_ORE.get());
        dropSelf(ModBlocks.DARKNESS_TREE_LOG.get());
        dropSelf(ModBlocks.DARKNESS_TREE_PLANKS.get());
        dropSelf(ModBlocks.DARKNESS_TREE_SLAB.get());
        dropSelf(ModBlocks.DARKNESS_FLOWER.get());
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
