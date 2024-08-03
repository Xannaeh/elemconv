package com.xannaeh.elemconv.data.texture;

import com.xannaeh.elemconv.elements.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static com.xannaeh.elemconv.main.ElemConv.MODID;

public class ModItemStateProvider extends ItemModelProvider {
    public ModItemStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Items
        // Darkness
        basicItem(ModItems.DARKNESS_RAW.get());
        basicItem(ModItems.DARKNESS_INGOT.get());
        basicItem(ModItems.DARKNESS_ESSENCE.get());
        basicItem(ModItems.DARKNESS_FRUIT.get());
        basicItem(ModItems.DARKNESS_FRUIT_DRIED.get());
        basicItem(ModItems.DARKNESS_IN_A_BOTTLE.get());
        basicItem(ModItems.DARKNESS_COAL.get());

        // Light
        basicItem(ModItems.LIGHT_RAW.get());
        basicItem(ModItems.LIGHT_INGOT.get());
        basicItem(ModItems.LIGHT_ESSENCE.get());
        basicItem(ModItems.LIGHT_FRUIT.get());
        basicItem(ModItems.LIGHT_FRUIT_DRIED.get());
        basicItem(ModItems.LIGHT_IN_A_BOTTLE.get());
        basicItem(ModItems.LIGHT_COAL.get());

        // Tools + Armors
        // Darkness
        basicItem(ModItems.DARKNESS_AXE.get());

        // Light
        basicItem(ModItems.LIGHT_AXE.get());

    }

}
