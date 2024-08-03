package com.xannaeh.elemconv.data.lang;

import com.xannaeh.elemconv.elements.block.ModBlocks;
import com.xannaeh.elemconv.elements.block.custom.DarknessInfuserBasic;
import com.xannaeh.elemconv.elements.block.custom.LightInfuserBasic;
import com.xannaeh.elemconv.elements.item.ModItems;
import com.xannaeh.elemconv.elements.item.custom.tools.DarknessAxeItem;
import com.xannaeh.elemconv.elements.item.custom.tools.LightAxeItem;
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
        addItem(ModItems.DARKNESS_COAL, "Darkness coal");
        // Light
        addItem(ModItems.LIGHT_RAW, "Raw Light");
        addItem(ModItems.LIGHT_INGOT, "Light ingot");
        addItem(ModItems.LIGHT_FRUIT, "Light fruit");
        addItem(ModItems.LIGHT_FRUIT_DRIED, "Light fruit dried");
        addItem(ModItems.LIGHT_ESSENCE, "Light essence");
        addItem(ModItems.LIGHT_IN_A_BOTTLE, "Light in a bottle");
        addItem(ModItems.LIGHT_COAL, "Light coal");

        // Blocks
        // Darkness
        addBlock(ModBlocks.DARKNESS_ORE, "Darkness ore");
        addBlock(ModBlocks.DARKNESS_ORE_DEEPSLATE, "Darkness ore deepslate");
        addBlock(ModBlocks.DARKNESS_ORE_ENDSTONE, "Darkness ore endstone");
        addBlock(ModBlocks.DARKNESS_INGOT_BLOCK, "Darkness ingot block");
        addBlock(ModBlocks.DARKNESS_RAW_BLOCK, "Darkness raw block");
        addBlock(ModBlocks.DARKNESS_TREE_LOG, "Darkness tree log");
        addBlock(ModBlocks.DARKNESS_TREE_WOOD, "Darkness tree wood");
        addBlock(ModBlocks.DARKNESS_TREE_LOG_STRIPPED, "Darkness tree stripped log");
        addBlock(ModBlocks.DARKNESS_TREE_PLANKS, "Darkness tree planks");
        addBlock(ModBlocks.DARKNESS_TREE_SLAB, "Darkness tree slab");
        addBlock(ModBlocks.DARKNESS_TREE_STAIRS, "Darkness tree stairs");
        addBlock(ModBlocks.DARKNESS_FLOWER, "Darkness flower");
        addBlock(ModBlocks.DARKNESS_TREE_SAPLING, "Darkness tree sapling");
        addBlock(ModBlocks.DARKNESS_INFUSER_BASIC, "Darkness basic infuser");
        add(DarknessInfuserBasic.SHIFT_TOOLTIP, "Press Shit for more Information!");
        add(DarknessInfuserBasic.TOOLTIP_LINE_1, "To use the \"Darkness basic infuser\" throw the materials on top of the infuser.");
        // Light
        addBlock(ModBlocks.LIGHT_ORE, "Light ore");
        addBlock(ModBlocks.LIGHT_ORE_DEEPSLATE, "Light ore deepslate");
        addBlock(ModBlocks.LIGHT_ORE_NETHERRACK, "Light ore netherrack");
        addBlock(ModBlocks.LIGHT_INGOT_BLOCK, "Light ingot block");
        addBlock(ModBlocks.LIGHT_RAW_BLOCK, "Light raw block");
        addBlock(ModBlocks.LIGHT_TREE_LOG, "Light tree log");
        addBlock(ModBlocks.LIGHT_TREE_WOOD, "Light tree wood");
        addBlock(ModBlocks.LIGHT_TREE_LOG_STRIPPED, "Light tree stripped log");
        addBlock(ModBlocks.LIGHT_TREE_PLANKS, "Light tree planks");
        addBlock(ModBlocks.LIGHT_TREE_SLAB, "Light tree slab");
        addBlock(ModBlocks.LIGHT_TREE_STAIRS, "Light tree stairs");
        addBlock(ModBlocks.LIGHT_FLOWER, "Light flower");
        addBlock(ModBlocks.LIGHT_TREE_SAPLING, "Light tree sapling");
        addBlock(ModBlocks.LIGHT_INFUSER_BASIC, "Light basic infuser");
        add(LightInfuserBasic.SHIFT_TOOLTIP, "Press Shit for more Information!");
        add(LightInfuserBasic.TOOLTIP_LINE_1, "To use a \"Light basic infuser\" throw the materials on top of the infuser.");

        // TOOLS + ARMORS
        // Darkness
        addItem(ModItems.DARKNESS_AXE, "Darkness axe");
        add(DarknessAxeItem.SHIFT_TOOLTIP, "Press Shit for more Information!");
        add(DarknessAxeItem.TOOLTIP_LINE_1, "Use the \"Darkness infuser\" to transform a \"Golden axe\" into a \"Darkness axe\".");
        // Light
        addItem(ModItems.LIGHT_AXE, "Light axe");
        add(LightAxeItem.SHIFT_TOOLTIP, "Press Shit for more Information!");
        add(LightAxeItem.TOOLTIP_LINE_1, "Use a \"Light infuser\" to transform a \"Golden axe\" into a \"Light axe\".");

        // UI
        // CreativeTabs
        add(CreativeModTabs.ELEM_CONV_LIGHT_TITLE, "Elemental Convergence Light");
        add(CreativeModTabs.ELEM_CONV_DARKNESS_TITLE, "Elemental Convergence Darkness");
        add(CreativeModTabs.ELEM_CONV_ARCANE_TITLE, "Elemental Convergence Arcane");
        add(CreativeModTabs.ELEM_CONV_DUAL_TITLE, "Elemental Convergence Dual");
        add(CreativeModTabs.ELEM_CONV_MISC_TITLE, "Elemental Convergence Miscellaneous");

    }
}
