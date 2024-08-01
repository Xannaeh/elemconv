package com.xannaeh.elemconv.item;

import com.xannaeh.elemconv.block.ModBlocks;
import com.xannaeh.elemconv.main.ElemConv;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ElemConv.MODID);

    // ITEMS

    public static final DeferredItem<Item> RAW_DARKNESS = ITEMS.register("raw_darkness", () ->
            new Item(new Item.Properties()
                    .stacksTo(64)
                    .food(ModFoods.TEST_FOOD) //TODO: just for test
            )
    );

    // BLOCKS

    public static final DeferredItem<BlockItem> DARKNESS_ORE = ITEMS.registerSimpleBlockItem("darkness_ore",
            ModBlocks.DARKNESS_ORE);

    public static final DeferredItem<BlockItem> LIGHT_ORE = ITEMS.registerSimpleBlockItem("light_ore",
            ModBlocks.LIGHT_ORE);

    public static final DeferredItem<BlockItem> DARKNESS_TREE_LOG = ITEMS.registerSimpleBlockItem("darkness_tree_log",
            ModBlocks.DARKNESS_TREE_LOG);

    public static final DeferredItem<BlockItem> DARKNESS_TREE_PLANKS = ITEMS.registerSimpleBlockItem("darkness_tree_planks",
            ModBlocks.DARKNESS_TREE_PLANKS);
}
