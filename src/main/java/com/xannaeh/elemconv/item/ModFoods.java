package com.xannaeh.elemconv.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties TEST_FOOD = new FoodProperties.Builder() //TODO: just for test
            .nutrition(10)
            .saturationModifier(0.5f)
            .alwaysEdible()
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED,100,2),0.5f)
            .build();
}
