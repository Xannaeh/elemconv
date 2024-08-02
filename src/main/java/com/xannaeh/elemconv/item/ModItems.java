package com.xannaeh.elemconv.item;

import com.xannaeh.elemconv.main.ElemConv;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ElemConv.MODID);

    // ITEMS
    public static final DeferredItem<Item> RAW_DARKNESS = ITEMS.register("raw_darkness", () ->
            new Item(new Item.Properties()
                    .stacksTo(64)
            )
    );
    public static final DeferredItem<Item> DARKNESS_INGOT = ITEMS.register("darkness_ingot", () ->
            new Item(new Item.Properties()
                    .stacksTo(64)
            )
    );
    public static final DeferredItem<Item> DARKNESS_ESSENCE = ITEMS.register("darkness_essence", () ->
            new Item(new Item.Properties()
                    .stacksTo(64)
            )
    );
    public static final DeferredItem<Item> DARKNESS_FRUIT = ITEMS.register("darkness_fruit", () ->
            new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(ModFoods.DARKNESS_FRUIT)
            )
    );
    public static final DeferredItem<Item> DARKNESS_FRUIT_DRIED = ITEMS.register("darkness_fruit_dried", () ->
            new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(ModFoods.DARKNESS_FRUIT_DRIED)
            )
    );

}
