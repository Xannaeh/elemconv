package com.xannaeh.elemconv.data.loottable;

import com.xannaeh.elemconv.elements.block.ModBlocks;
import com.xannaeh.elemconv.elements.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import org.jetbrains.annotations.NotNull;


import java.util.Set;


public class ModBlockLootTableProvider extends BlockLootSubProvider {
    public ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
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
        //Arcane
//        add(ModBlocks.ARCANE_ORE.get(), createMultipleOreDrops(ModBlocks.ARCANE_ORE.get(), ModItems.ARCANE_GEM.get(),1,5)); //TODO: add when needed

        // Blocks
        // Darkness
        dropSelf(ModBlocks.DARKNESS_INGOT_BLOCK.get());
        dropSelf(ModBlocks.DARKNESS_RAW_BLOCK.get());
        dropSelf(ModBlocks.DARKNESS_TREE_LOG.get());
        dropSelf(ModBlocks.DARKNESS_TREE_WOOD.get());
        dropSelf(ModBlocks.DARKNESS_TREE_LOG_STRIPPED.get());
        dropSelf(ModBlocks.DARKNESS_TREE_PLANKS.get());
        modDropSlab(ModBlocks.DARKNESS_TREE_SLAB.get());
        dropSelf(ModBlocks.DARKNESS_TREE_STAIRS.get());
        dropSelf(ModBlocks.DARKNESS_TREE_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.DARKNESS_TREE_BUTTON.get());
        dropSelf(ModBlocks.DARKNESS_TREE_FENCE.get());
        dropSelf(ModBlocks.DARKNESS_TREE_FENCE_GATE.get());
        dropSelf(ModBlocks.DARKNESS_TREE_WALL.get());
        dropSelf(ModBlocks.DARKNESS_FLOWER.get());
        dropSelf(ModBlocks.DARKNESS_TREE_SAPLING.get());
        dropSelf(ModBlocks.DARKNESS_INFUSER_BASIC.get());
        // Light
        dropSelf(ModBlocks.LIGHT_INGOT_BLOCK.get());
        dropSelf(ModBlocks.LIGHT_RAW_BLOCK.get());
        dropSelf(ModBlocks.LIGHT_TREE_LOG.get());
        dropSelf(ModBlocks.LIGHT_TREE_WOOD.get());
        dropSelf(ModBlocks.LIGHT_TREE_LOG_STRIPPED.get());
        dropSelf(ModBlocks.LIGHT_TREE_PLANKS.get());
        modDropSlab(ModBlocks.LIGHT_TREE_SLAB.get());
        dropSelf(ModBlocks.LIGHT_TREE_STAIRS.get());
        dropSelf(ModBlocks.LIGHT_TREE_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.LIGHT_TREE_BUTTON.get());
        dropSelf(ModBlocks.LIGHT_TREE_FENCE.get());
        dropSelf(ModBlocks.LIGHT_TREE_FENCE_GATE.get());
        dropSelf(ModBlocks.LIGHT_TREE_WALL.get());
        dropSelf(ModBlocks.LIGHT_FLOWER.get());
        dropSelf(ModBlocks.LIGHT_TREE_SAPLING.get());
        dropSelf(ModBlocks.LIGHT_INFUSER_BASIC.get());
    }

    protected void modDropSlab(Block pBlock) {
        add(pBlock, block -> createSlabItemTable(pBlock));
    }

    protected LootTable.Builder modCreateMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock,
                LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }

}
