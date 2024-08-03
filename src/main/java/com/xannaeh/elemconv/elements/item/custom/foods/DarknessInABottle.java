package com.xannaeh.elemconv.elements.item.custom.foods;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;


public class DarknessInABottle extends Item {
    public DarknessInABottle(Item.Properties pProperties) {
        super(pProperties);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.DRINK;
    }
}
