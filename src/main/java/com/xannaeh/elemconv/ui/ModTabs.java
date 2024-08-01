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

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ELEM_CONV_ITEMS =
            CREATIVE_TABS.register("elemconvitems", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable("itemGroup.elemconv"))
                            .withTabsBefore(CreativeModeTabs.COMBAT)
                            .icon(() -> ModItems.RAW_DARKNESS.get().getDefaultInstance()) //TODO: Change for real icon later
                            .displayItems(((parameters, output) -> {
                                output.accept(ModItems.RAW_DARKNESS.get());
                            }))
                            .build());

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ELEM_CONV_BLOCK =
            CREATIVE_TABS.register("elemconvblocks", () ->
                    CreativeModeTab.builder()
                            .title(Component.translatable("blockGroup.elemconv"))
                            .withTabsBefore(ELEM_CONV_ITEMS.getKey())
                            .icon(() -> ModItems.DARKNESS_ORE.get().getDefaultInstance()) //TODO: Change for real icon later
                            .displayItems(((parameters, output) -> {
                                output.accept(ModBlocks.DARKNESS_ORE.get());
                                output.accept(ModBlocks.LIGHT_ORE.get());
                                output.accept(ModBlocks.DARKNESS_TREE_LOG.get());
                            }))
                            .build());
}
