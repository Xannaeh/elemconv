package com.xannaeh.elemconv.data.tag;

import com.xannaeh.elemconv.elements.item.ModItems;
import com.xannaeh.elemconv.elements.tag.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.concurrent.CompletableFuture;

import static com.xannaeh.elemconv.main.ElemConv.MODID;
import static com.xannaeh.elemconv.main.ElemConv.logger;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, BlockTagsProvider provider, ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, provider.contentsGetter(), MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        try {
            // Blocks
            // Darkness
            copy(ModTags.ModBlockTags.DARKNESS_ORE_TAG, ModTags.ModItemTags.DARKNESS_ORE_TAG);
            copy(ModTags.ModBlockTags.DARKNESS_ORE_DEEPSLATE_TAG, ModTags.ModItemTags.DARKNESS_ORE_DEEPSLATE_TAG);
            // Light
            copy(ModTags.ModBlockTags.LIGHT_ORE_TAG, ModTags.ModItemTags.LIGHT_ORE_TAG);
            copy(ModTags.ModBlockTags.LIGHT_ORE_DEEPSLATE_TAG, ModTags.ModItemTags.LIGHT_ORE_DEEPSLATE_TAG);

            // Items
            //Darkness
            tag(ModTags.ModItemTags.DARKNESS_RAW_TAG).add(ModItems.DARKNESS_RAW.get());
            //Light
            tag(ModTags.ModItemTags.LIGHT_RAW_TAG).add(ModItems.LIGHT_RAW.get());

            logger.info("Tags successfully added items and blocks.");
        } catch (Exception e) {
            logger.error("Error while adding tags", e);
        }

    }
}
