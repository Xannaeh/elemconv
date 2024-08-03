package com.xannaeh.elemconv.data;

import com.xannaeh.elemconv.data.lang.ModEnLangProvider;
import com.xannaeh.elemconv.data.loottable.ModBlockLootTableProvider;
import com.xannaeh.elemconv.data.loottable.ModLootTableProvider;
import com.xannaeh.elemconv.data.recipe.ModRecipeProvider;
import com.xannaeh.elemconv.data.tag.ModBlockTagProvider;
import com.xannaeh.elemconv.data.tag.ModItemTagProvider;
import com.xannaeh.elemconv.data.texture.ModBlockStateProvider;
import com.xannaeh.elemconv.data.texture.ModItemStateProvider;
import com.xannaeh.elemconv.data.worldgen.ModWorldGenProvider;
import com.xannaeh.elemconv.main.ElemConv;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.xannaeh.elemconv.main.ElemConv.MODID;

@EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        try {
            net.minecraft.data.DataGenerator generator = event.getGenerator();
            PackOutput packOutput = generator.getPackOutput();
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
            CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

            generator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput, lookupProvider));
            generator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(),
                    List.of(new LootTableProvider.SubProviderEntry(ModBlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));
            BlockTagsProvider blockTagsProvider = new ModBlockTagProvider(packOutput, lookupProvider, existingFileHelper);
            generator.addProvider(event.includeServer(), blockTagsProvider);
            generator.addProvider(event.includeServer(), new ModItemTagProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
            generator.addProvider(event.includeClient(), new ModItemStateProvider(packOutput, existingFileHelper));
            generator.addProvider(event.includeClient(), new ModBlockStateProvider(packOutput, existingFileHelper));
            generator.addProvider(event.includeClient(), new ModEnLangProvider(packOutput));

            generator.addProvider(event.includeServer(), new ModWorldGenProvider(packOutput, event.getLookupProvider()));
        } catch (RuntimeException e) {
            ElemConv.logger.error("Failed to gather data", e);
        }

    }
}
