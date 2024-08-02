package com.xannaeh.elemconv.data;

import com.xannaeh.elemconv.data.lang.ModEnLangProvider;
import com.xannaeh.elemconv.data.loottable.ModLootTables;
import com.xannaeh.elemconv.data.tag.ModBlockTagProvider;
import com.xannaeh.elemconv.data.texture.ModBlockStateProvider;
import com.xannaeh.elemconv.data.texture.ModItemStateProvider;
import com.xannaeh.elemconv.main.ElemConv;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class DataGenerators {
    public static void gatherData(GatherDataEvent event) {
        try {
            DataGenerator generator = event.getGenerator();
            PackOutput output = generator.getPackOutput();
            ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

            generator.addProvider(true, new ModEnLangProvider(output));
            generator.addProvider(true, new ModItemStateProvider(output, existingFileHelper));
            generator.addProvider(true, new ModBlockStateProvider(output, existingFileHelper));
            generator.addProvider(true, new ModBlockTagProvider(output, event.getLookupProvider(), existingFileHelper));
            generator.addProvider(true, new ModLootTables(output, event.getLookupProvider()));
        } catch (RuntimeException e) {
            ElemConv.logger.error("Failed to gather data", e);
        }

    }
}
