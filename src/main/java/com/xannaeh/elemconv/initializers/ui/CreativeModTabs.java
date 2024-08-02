package com.xannaeh.elemconv.initializers.ui;

import com.xannaeh.elemconv.initializers.block.ModBlocks;
import com.xannaeh.elemconv.initializers.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


import static com.xannaeh.elemconv.main.ElemConv.MODID;

public class CreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);


    public static final String ELEM_CONV_LIGHT_TITLE = "lightGroup.elemconv";
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ELEM_CONV_LIGHT =
            CREATIVE_TABS.register("elemconv_light", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable(ELEM_CONV_LIGHT_TITLE))
                            .withTabsBefore(CreativeModeTabs.COMBAT)
                            .icon(() -> ModItems.DARKNESS_ESSENCE.get().getDefaultInstance()) //TODO: Change for real icon later
                            .displayItems(((itemDisplay, output) -> {
                                output.accept(ModBlocks.LIGHT_ORE.get());
                            }))
                            .build());

    public static final String ELEM_CONV_DARKNESS_TITLE = "darknessGroup.elemconv";
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ELEM_CONV_DARKNESS =
            CREATIVE_TABS.register("elemconv_darkness", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable(ELEM_CONV_DARKNESS_TITLE))
                            .withTabsBefore(ELEM_CONV_LIGHT.getKey())
                            .icon(() -> ModItems.DARKNESS_ESSENCE.get().getDefaultInstance()) //TODO: Change for real icon later
                            .displayItems(((parameters, output) -> {
                                output.accept(ModBlocks.DARKNESS_ORE.get());
                                output.accept(ModItems.RAW_DARKNESS.get());
                                output.accept(ModItems.DARKNESS_INGOT.get());
                                output.accept(ModBlocks.DARKNESS_TREE_LOG.get());
                                output.accept(ModBlocks.DARKNESS_TREE_PLANKS.get());
                                output.accept(ModBlocks.DARKNESS_TREE_SLAB.get());
                                output.accept(ModBlocks.DARKNESS_FLOWER.get());
                                output.accept(ModItems.DARKNESS_FRUIT.get());
                                output.accept(ModItems.DARKNESS_FRUIT_DRIED.get());
                                output.accept(ModItems.DARKNESS_ESSENCE.get());
                            }))
                            .build());

    public static final String ELEM_CONV_ARCANE_TITLE = "arcaneGroup.elemconv";
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ELEM_CONV_ARCANE =
            CREATIVE_TABS.register("elemconv_arcane", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable(ELEM_CONV_ARCANE_TITLE))
                            .withTabsBefore(ELEM_CONV_DARKNESS.getKey())
                            .icon(() -> ModItems.RAW_DARKNESS.get().getDefaultInstance()) //TODO: Change for real icon later
                            .displayItems(((itemDisplay, output) -> {
                            }))
                            .build());

    public static final String ELEM_CONV_DUAL_TITLE = "dualGroup.elemconv";
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ELEM_CONV_DUAL =
            CREATIVE_TABS.register("elemconv_dual", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable(ELEM_CONV_DUAL_TITLE))
                            .withTabsBefore(ELEM_CONV_ARCANE.getKey())
                            .icon(() -> ModItems.RAW_DARKNESS.get().getDefaultInstance()) //TODO: Change for real icon later
                            .displayItems(((itemDisplay, output) -> {
                            }))
                            .build());

    public static final String ELEM_CONV_MISC_TITLE = "miscGroup.elemconv";
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ELEM_CONV_MISC =
            CREATIVE_TABS.register("elemconv_misc", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable(ELEM_CONV_MISC_TITLE))
                            .withTabsBefore(ELEM_CONV_DUAL.getKey())
                            .icon(() -> ModItems.RAW_DARKNESS.get().getDefaultInstance()) //TODO: Change for real icon later
                            .displayItems(((itemDisplay, output) -> {
                            }))
                            .build());

}
