package com.xannaeh.elemconv.main;

import com.xannaeh.elemconv.elements.block.ModBlocks;
import com.xannaeh.elemconv.data.DataGenerators;
import com.xannaeh.elemconv.elements.item.ModItems;
import com.xannaeh.elemconv.elements.ui.CreativeModTabs;
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
    public static final Logger logger = LoggerFactory.getLogger(ElemConv.class);

    public ElemConv(IEventBus modEventBus, ModContainer modContainer) {

        ModItems.register(modEventBus);
        CreativeModTabs.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(DataGenerators::gatherData);
        modEventBus.addListener(this::setup);
    }

    private void setup(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ModList.get().getModContainerById(MODID).ifPresent(modContainer -> {
                logger.info("Hello from Elemental Convergence, using version: {}", modContainer.getModInfo().getVersion());
            });
        });
    }
}
