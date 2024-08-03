package com.xannaeh.elemconv.data.lang;

import com.xannaeh.elemconv.elements.block.ModBlocks;
import com.xannaeh.elemconv.elements.item.ModItems;
import com.xannaeh.elemconv.main.ElemConv;
import com.xannaeh.elemconv.elements.ui.CreativeModTabs;
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
        addItem(ModItems.DARKNESS_INGOT, "Darkness ingot");
        addItem(ModItems.DARKNESS_FRUIT, "Darkness fruit");
        addItem(ModItems.DARKNESS_FRUIT_DRIED, "Darkness fruit dried");
        addItem(ModItems.DARKNESS_ESSENCE, "Darkness essence");
        addItem(ModItems.DARKNESS_IN_A_BOTTLE, "Darkness in a bottle");
        // Light
        addItem(ModItems.LIGHT_RAW, "Raw Light");
        addItem(ModItems.LIGHT_INGOT, "Light ingot");
        addItem(ModItems.LIGHT_FRUIT, "Light fruit");
        addItem(ModItems.LIGHT_FRUIT_DRIED, "Light fruit dried");
        addItem(ModItems.LIGHT_ESSENCE, "Light essence");
        addItem(ModItems.LIGHT_IN_A_BOTTLE, "Light in a bottle");

        // Blocks
        // Darkness
        addBlock(ModBlocks.DARKNESS_ORE, "Darkness ore");
        addBlock(ModBlocks.DARKNESS_ORE_DEEPSLATE, "Darkness ore deepslate");
        addBlock(ModBlocks.DARKNESS_ORE_ENDSTONE, "Darkness ore endstone");
        addBlock(ModBlocks.DARKNESS_TREE_LOG, "Darkness tree log");
        addBlock(ModBlocks.DARKNESS_TREE_PLANKS, "Darkness tree planks");
        addBlock(ModBlocks.DARKNESS_TREE_SLAB, "Darkness tree slab");
        addBlock(ModBlocks.DARKNESS_FLOWER, "Darkness flower");
        addBlock(ModBlocks.DARKNESS_INFUSER_BASIC, "Darkness basic infuser");
        // Light
        addBlock(ModBlocks.LIGHT_ORE, "Light ore");
        addBlock(ModBlocks.LIGHT_ORE_DEEPSLATE, "Light ore deepslate");
        addBlock(ModBlocks.LIGHT_ORE_NETHERRACK, "Light ore netherrack");
        addBlock(ModBlocks.LIGHT_TREE_LOG, "Light tree log");
        addBlock(ModBlocks.LIGHT_TREE_PLANKS, "Light tree planks");
        addBlock(ModBlocks.LIGHT_TREE_SLAB, "Light tree slab");
        addBlock(ModBlocks.LIGHT_FLOWER, "Light flower");

        // TOOLS + ARMORS
        addItem(ModItems.DARKNESS_AXE, "Darkness axe");

        // UI
        // CreativeTabs
        add(CreativeModTabs.ELEM_CONV_LIGHT_TITLE, "Elemental Convergence Light");
        add(CreativeModTabs.ELEM_CONV_DARKNESS_TITLE, "Elemental Convergence Darkness");
        add(CreativeModTabs.ELEM_CONV_ARCANE_TITLE, "Elemental Convergence Arcane");
        add(CreativeModTabs.ELEM_CONV_DUAL_TITLE, "Elemental Convergence Dual");
        add(CreativeModTabs.ELEM_CONV_MISC_TITLE, "Elemental Convergence Miscellaneous");

    }
}
