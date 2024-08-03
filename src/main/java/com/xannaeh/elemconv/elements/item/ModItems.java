package com.xannaeh.elemconv.elements.item;

import com.xannaeh.elemconv.elements.item.custom.tools.DarknessAxeItem;
import com.xannaeh.elemconv.elements.item.custom.foods.DarknessInABottleItem;
import com.xannaeh.elemconv.elements.item.custom.fuel.FuelItem;
import com.xannaeh.elemconv.main.ElemConv;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ElemConv.MODID);


    // Darkness
    public static DeferredItem<Item> DARKNESS_RAW = ITEMS.registerItem("darkness_raw", Item::new,
            new Item.Properties()
                    .stacksTo(64)

    );
    public static final DeferredItem<Item> DARKNESS_INGOT = ITEMS.registerItem("darkness_ingot", Item::new,
            new Item.Properties()
                    .stacksTo(64)

    );
    public static final DeferredItem<Item> DARKNESS_ESSENCE = ITEMS.registerItem("darkness_essence", Item::new,
            new Item.Properties()
                    .stacksTo(64)

    );
    public static final DeferredItem<Item> DARKNESS_FRUIT = ITEMS.registerItem("darkness_fruit", Item::new,
            new Item.Properties()
                    .stacksTo(64)
                    .food(ModFoods.DARKNESS_FRUIT)

    );
    public static final DeferredItem<Item> DARKNESS_FRUIT_DRIED = ITEMS.registerItem("darkness_fruit_dried", Item::new,
            new Item.Properties()
                    .stacksTo(64)
                    .food(ModFoods.DARKNESS_FRUIT_DRIED)

    );
    public static final DeferredItem<Item> DARKNESS_IN_A_BOTTLE = ITEMS.registerItem("darkness_in_a_bottle", DarknessInABottleItem::new,
            new Item.Properties()
                    .stacksTo(16)
                    .food(ModFoods.DARKNESS_IN_A_BOTTLE)

    );
    public static final DeferredItem<Item> DARKNESS_COAL = ITEMS.registerItem("darkness_coal", properties -> new FuelItem(properties, 3200),
            new Item.Properties()
                    .stacksTo(99)

    );


    // Light
    public static DeferredItem<Item> LIGHT_RAW = ITEMS.registerItem("light_raw", Item::new,
            new Item.Properties()
                    .stacksTo(64)

    );
    public static final DeferredItem<Item> LIGHT_INGOT = ITEMS.registerItem("light_ingot", Item::new,
            new Item.Properties()
                    .stacksTo(64)

    );
    public static final DeferredItem<Item> LIGHT_ESSENCE = ITEMS.registerItem("light_essence", Item::new,
            new Item.Properties()
                    .stacksTo(64)

    );
    public static final DeferredItem<Item> LIGHT_FRUIT = ITEMS.registerItem("light_fruit", Item::new,
            new Item.Properties()
                    .stacksTo(64)
                    .food(ModFoods.LIGHT_FRUIT)

    );
    public static final DeferredItem<Item> LIGHT_FRUIT_DRIED = ITEMS.registerItem("light_fruit_dried", Item::new,
            new Item.Properties()
                    .stacksTo(64)
                    .food(ModFoods.LIGHT_FRUIT_DRIED)

    );
    public static final DeferredItem<Item> LIGHT_IN_A_BOTTLE = ITEMS.registerItem("light_in_a_bottle", DarknessInABottleItem::new,
            new Item.Properties()
                    .stacksTo(16)
                    .food(ModFoods.LIGHT_IN_A_BOTTLE)

    );
    public static final DeferredItem<Item> LIGHT_COAL = ITEMS.registerItem("light_coal", properties -> new FuelItem(properties, 3200),
            new Item.Properties()
                    .stacksTo(99)

    );


    // Tools + Armors
    // Darkness
    public static final DeferredItem<Item> DARKNESS_AXE = ITEMS.registerItem("darkness_axe", DarknessAxeItem::new,
            new Item.Properties()
                    .stacksTo(1)
                    .durability(200)

    );
    // Light

    public static void register(IEventBus eventBus) {
        ModItems.ITEMS.register(eventBus);
    }

}
