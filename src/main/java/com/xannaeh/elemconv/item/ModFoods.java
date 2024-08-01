package com.xannaeh.elemconv.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties DARKNESS_FRUIT = new FoodProperties.Builder() //TODO: adjust parameters
            .nutrition(10)
            .saturationModifier(0.5f)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.INVISIBILITY,100,1), 0.5f)
            .build();
    public static final FoodProperties DARKNESS_FRUIT_DRIED = new FoodProperties.Builder() //TODO: adjust parameters
            .nutrition(15)
            .saturationModifier(0.75f)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.INVISIBILITY,100,1), 1f)
            .build();
}
