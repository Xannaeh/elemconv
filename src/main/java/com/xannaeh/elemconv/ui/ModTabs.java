package com.xannaeh.elemconv.ui;

import com.xannaeh.elemconv.block.ModBlocks;
import com.xannaeh.elemconv.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


import static com.xannaeh.elemconv.main.ElemConv.MODID;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ELEM_CONV_LIGHT =
            CREATIVE_TABS.register("elemconv_light", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable("lightGroup.elemconv"))
                            .withTabsBefore(CreativeModeTabs.COMBAT)
                            .icon(() -> ModItems.RAW_DARKNESS.get().getDefaultInstance()) //TODO: Change for real icon later
                            .displayItems(((itemDisplay, output) -> {
                                output.accept(ModBlocks.LIGHT_ORE.get());
                            }))
                            .build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ELEM_CONV_DARKNESS =
            CREATIVE_TABS.register("elemconv_darkness", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable("darknessGroup.elemconv"))
                            .withTabsBefore(ELEM_CONV_LIGHT.getKey())
                            .icon(() -> ModItems.DARKNESS_ORE.get().getDefaultInstance()) //TODO: Change for real icon later
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

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ELEM_CONV_ARCANE =
            CREATIVE_TABS.register("elemconv_arcane", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable("arcaneGroup.elemconv"))
                            .withTabsBefore(ELEM_CONV_DARKNESS.getKey())
                            .icon(() -> ModItems.RAW_DARKNESS.get().getDefaultInstance()) //TODO: Change for real icon later
                            .displayItems(((itemDisplay, output) -> {
                            }))
                            .build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ELEM_CONV_DUAL =
            CREATIVE_TABS.register("elemconv_dual", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable("dualGroup.elemconv"))
                            .withTabsBefore(ELEM_CONV_ARCANE.getKey())
                            .icon(() -> ModItems.RAW_DARKNESS.get().getDefaultInstance()) //TODO: Change for real icon later
                            .displayItems(((itemDisplay, output) -> {
                            }))
                            .build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ELEM_CONV_MISC =
            CREATIVE_TABS.register("elemconv_misc", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable("miscGroup.elemconv"))
                            .withTabsBefore(ELEM_CONV_DUAL.getKey())
                            .icon(() -> ModItems.RAW_DARKNESS.get().getDefaultInstance()) //TODO: Change for real icon later
                            .displayItems(((itemDisplay, output) -> {
                            }))
                            .build());

}
