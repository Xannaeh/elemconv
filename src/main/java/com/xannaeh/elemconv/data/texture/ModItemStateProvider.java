package com.xannaeh.elemconv.data.texture;

import com.xannaeh.elemconv.initializers.item.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import static com.xannaeh.elemconv.main.ElemConv.MODID;

public class ModItemStateProvider extends ItemModelProvider {
    public ModItemStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Items
        //Darkness
        item(ModItems.DARKNESS_RAW.get());
        item(ModItems.DARKNESS_INGOT.get());
        item(ModItems.DARKNESS_ESSENCE.get());
        item(ModItems.DARKNESS_FRUIT.get());
        item(ModItems.DARKNESS_FRUIT_DRIED.get());

        //Blocks
        item(ModItems.LIGHT_RAW.get());

    }

    private void item(Item item) {
        String name = getItemName(item);
        getBuilder(name)
                .parent(getExistingFile(mcLoc("item/generated")))
                .texture("layer0", "item/" + name);
    }


    private String getItemName(Item item) {
        return BuiltInRegistries.ITEM.getKey(item).toString().replace(MODID + ":", "");
    }
}
