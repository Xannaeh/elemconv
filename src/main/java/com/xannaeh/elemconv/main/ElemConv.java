package com.xannaeh.elemconv.main;

import com.xannaeh.elemconv.block.ModBlocks;
import com.xannaeh.elemconv.item.ModItems;
import com.xannaeh.elemconv.ui.ModTabs;
import net.neoforged.fml.ModList;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import org.slf4j.Logger;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.LoggerFactory;


@Mod(ElemConv.MODID)
public class ElemConv {
    public static final String MODID = "elemconv";
    private static final Logger logger = LoggerFactory.getLogger(ElemConv.class);

    public ElemConv(IEventBus modEventBus, ModContainer modContainer) {
        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        ModTabs.CREATIVE_TABS.register(modEventBus);
        modEventBus.addListener(FMLClientSetupEvent.class, (fmlClientSetupEvent -> {
            fmlClientSetupEvent.enqueueWork(() -> {
                ModList.get().getModContainerById(MODID).ifPresent(modContainer1 -> {
                    logger.info("Hello from Elemental Convergence, using version: {}", modContainer.getModInfo().getVersion());
                });
            });
        }));
    }
}
