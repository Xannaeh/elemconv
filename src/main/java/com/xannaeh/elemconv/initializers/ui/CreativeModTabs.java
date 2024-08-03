package com.xannaeh.elemconv.initializers.ui;

import com.xannaeh.elemconv.initializers.block.ModBlocks;
import com.xannaeh.elemconv.initializers.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


import static com.xannaeh.elemconv.main.ElemConv.MODID;

public class CreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final String ELEM_CONV_DARKNESS_TITLE = "darknessGroup.elemconv";
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ELEM_CONV_DARKNESS =
            CREATIVE_TABS.register("elemconv_darkness", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable(ELEM_CONV_DARKNESS_TITLE))
                            .withTabsBefore(CreativeModeTabs.COMBAT)
                            .icon(() -> ModItems.DARKNESS_ESSENCE.get().getDefaultInstance()) //TODO: Change for real icon later
                            .displayItems(((parameters, output) -> {
                                output.accept(ModBlocks.DARKNESS_ORE.get());
                                output.accept(ModBlocks.DARKNESS_ORE_DEEPSLATE.get());
                                output.accept(ModBlocks.DARKNESS_ORE_ENDSTONE.get());
                                output.accept(ModItems.DARKNESS_RAW.get());
                                output.accept(ModItems.DARKNESS_INGOT.get());
                                output.accept(ModItems.DARKNESS_FRUIT.get());
                                output.accept(ModItems.DARKNESS_FRUIT_DRIED.get());
                                output.accept(ModItems.DARKNESS_ESSENCE.get());
                            }))
                            .build());


    public static final String ELEM_CONV_LIGHT_TITLE = "lightGroup.elemconv";
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ELEM_CONV_LIGHT =
            CREATIVE_TABS.register("elemconv_light", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable(ELEM_CONV_LIGHT_TITLE))
                            .withTabsBefore(ELEM_CONV_DARKNESS.getKey())
                            .icon(() -> ModItems.LIGHT_ESSENCE.get().getDefaultInstance()) //TODO: Change for real icon later
                            .displayItems(((itemDisplay, output) -> {
                                output.accept(ModBlocks.LIGHT_ORE.get());
                                output.accept(ModBlocks.LIGHT_ORE_DEEPSLATE.get());
                                output.accept(ModBlocks.LIGHT_ORE_NETHERRACK.get());
                                output.accept(ModItems.LIGHT_RAW.get());
                                output.accept(ModItems.LIGHT_INGOT.get());
                                output.accept(ModItems.LIGHT_FRUIT.get());
                                output.accept(ModItems.LIGHT_FRUIT_DRIED.get());
                                output.accept(ModItems.LIGHT_ESSENCE.get());
                                output.accept(ModBlocks.LIGHT_TREE_LOG.get());
                                output.accept(ModBlocks.LIGHT_TREE_PLANKS.get());
                                output.accept(ModBlocks.LIGHT_TREE_SLAB.get());
                                output.accept(ModBlocks.LIGHT_FLOWER.get());
                            }))
                            .build());

    public static final String ELEM_CONV_ARCANE_TITLE = "arcaneGroup.elemconv";
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ELEM_CONV_ARCANE =
            CREATIVE_TABS.register("elemconv_arcane", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable(ELEM_CONV_ARCANE_TITLE))
                            .withTabsBefore(ELEM_CONV_DARKNESS.getKey())
                            .icon(() -> ModItems.DARKNESS_RAW.get().getDefaultInstance()) //TODO: Change for real icon later
                            .displayItems(((itemDisplay, output) -> {
                            }))
                            .build());

    public static final String ELEM_CONV_DUAL_TITLE = "dualGroup.elemconv";
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ELEM_CONV_DUAL =
            CREATIVE_TABS.register("elemconv_dual", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable(ELEM_CONV_DUAL_TITLE))
                            .withTabsBefore(ELEM_CONV_ARCANE.getKey())
                            .icon(() -> ModItems.DARKNESS_RAW.get().getDefaultInstance()) //TODO: Change for real icon later
                            .displayItems(((itemDisplay, output) -> {
                            }))
                            .build());

    public static final String ELEM_CONV_MISC_TITLE = "miscGroup.elemconv";
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ELEM_CONV_MISC =
            CREATIVE_TABS.register("elemconv_misc", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable(ELEM_CONV_MISC_TITLE))
                            .withTabsBefore(ELEM_CONV_DUAL.getKey())
                            .icon(() -> ModItems.DARKNESS_RAW.get().getDefaultInstance()) //TODO: Change for real icon later
                            .displayItems(((itemDisplay, output) -> {
                            }))
                            .build());


    public static void register(IEventBus eventBus) {
        CreativeModTabs.CREATIVE_TABS.register(eventBus);
    }

}
