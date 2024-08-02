package com.xannaeh.elemconv.initializers.item;

import com.xannaeh.elemconv.main.ElemConv;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ElemConv.MODID);

    // Darkness
    public static DeferredItem<Item> DARKNESS_RAW = ITEMS.register("darkness_raw", () ->
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


    // Light
    public static DeferredItem<Item> LIGHT_RAW = ITEMS.register("light_raw", () ->
            new Item(new Item.Properties()
                    .stacksTo(64)
            )
    );
    public static final DeferredItem<Item> LIGHT_INGOT = ITEMS.register("light_ingot", () ->
            new Item(new Item.Properties()
                    .stacksTo(64)
            )
    );
    public static final DeferredItem<Item> LIGHT_ESSENCE = ITEMS.register("light_essence", () ->
            new Item(new Item.Properties()
                    .stacksTo(64)
            )
    );
    public static final DeferredItem<Item> LIGHT_FRUIT = ITEMS.register("light_fruit", () ->
            new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(ModFoods.LIGHT_FRUIT)
            )
    );
    public static final DeferredItem<Item> LIGHT_FRUIT_DRIED = ITEMS.register("light_fruit_dried", () ->
            new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(ModFoods.LIGHT_FRUIT_DRIED)
            )
    );

}
