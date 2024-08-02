package com.xannaeh.elemconv.data.lang;

import com.xannaeh.elemconv.initializers.block.ModBlocks;
import com.xannaeh.elemconv.initializers.item.ModItems;
import com.xannaeh.elemconv.main.ElemConv;
import com.xannaeh.elemconv.initializers.ui.CreativeModTabs;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModEnLangProvider extends LanguageProvider {
    public ModEnLangProvider(PackOutput output) {
        super(output, ElemConv.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {

        // Items
        // Darkness
        addItem(ModItems.DARKNESS_RAW, "Raw Darkness");
        addItem(ModItems.DARKNESS_INGOT, "Raw ingot");
        addItem(ModItems.DARKNESS_FRUIT, "Raw fruit");
        addItem(ModItems.DARKNESS_FRUIT_DRIED, "Raw fruit dried");
        addItem(ModItems.DARKNESS_ESSENCE, "Raw essence");
        // Light
        addItem(ModItems.LIGHT_RAW, "Raw Light");

        // Blocks
        // Darkness
        addBlock(ModBlocks.DARKNESS_ORE, "Darkness ore");
        addBlock(ModBlocks.DARKNESS_ORE_DEEPSLATE, "Darkness ore deepslate");
        addBlock(ModBlocks.DARKNESS_TREE_LOG, "Darkness tree log");
        addBlock(ModBlocks.DARKNESS_TREE_PLANKS, "Darkness tree planks");
        addBlock(ModBlocks.DARKNESS_TREE_SLAB, "Darkness tree slab");
        addBlock(ModBlocks.DARKNESS_FLOWER, "Darkness flower");
        // Light
        addBlock(ModBlocks.LIGHT_ORE, "Light ore");
        addBlock(ModBlocks.LIGHT_ORE_DEEPSLATE, "Light ore deepslate");

        // UI
        // CreativeTabs
        add(CreativeModTabs.ELEM_CONV_LIGHT_TITLE, "Elemental Convergence Light");
        add(CreativeModTabs.ELEM_CONV_DARKNESS_TITLE, "Elemental Convergence Darkness");
        add(CreativeModTabs.ELEM_CONV_ARCANE_TITLE, "Elemental Convergence Arcane");
        add(CreativeModTabs.ELEM_CONV_DUAL_TITLE, "Elemental Convergence Dual");
        add(CreativeModTabs.ELEM_CONV_MISC_TITLE, "Elemental Convergence Miscellaneous");

    }
}
