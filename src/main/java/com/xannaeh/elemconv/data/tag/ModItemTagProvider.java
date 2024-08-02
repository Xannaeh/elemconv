package com.xannaeh.elemconv.data.tag;

import com.xannaeh.elemconv.initializers.item.ModItems;
import com.xannaeh.elemconv.initializers.tag.ModBlockItemTags;
import com.xannaeh.elemconv.initializers.tag.ModBlockTags;
import com.xannaeh.elemconv.initializers.tag.ModItemTags;
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
//        try {
//            // Blocks
//            // Darkness
//            copy(ModBlockTags.DARKNESS_ORE, ModBlockItemTags.DARKNESS_ORE);
//            copy(ModBlockTags.DARKNESS_TREE_LOG, ModBlockItemTags.DARKNESS_TREE_LOG);
//            copy(ModBlockTags.DARKNESS_TREE_PLANKS, ModBlockItemTags.DARKNESS_TREE_PLANKS);
//            copy(ModBlockTags.DARKNESS_TREE_SLAB, ModBlockItemTags.DARKNESS_TREE_SLAB);
//            copy(ModBlockTags.DARKNESS_FLOWER, ModBlockItemTags.DARKNESS_FLOWER);
//            // Light
//            copy(ModBlockTags.LIGHT_ORE, ModBlockItemTags.LIGHT_ORE);
//
//            // Items
//            //Darkness
//            tag(ModItemTags.RAW_DARKNESS).add(ModItems.RAW_DARKNESS.get());
//            tag(ModItemTags.DARKNESS_INGOT).add(ModItems.DARKNESS_INGOT.get());
//            tag(ModItemTags.DARKNESS_ESSENCE).add(ModItems.DARKNESS_ESSENCE.get());
//            tag(ModItemTags.DARKNESS_FRUIT).add(ModItems.DARKNESS_FRUIT.get());
//            tag(ModItemTags.DARKNESS_FRUIT_DRIED).add(ModItems.DARKNESS_FRUIT_DRIED.get());
//            //Light
//            logger.info("Tags successfully added items and blocks.");
//        } catch (Exception e) {
//            logger.error("Error while adding tags", e);
//        }

    }
}
