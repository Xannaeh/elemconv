package com.xannaeh.elemconv.elements.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    // Darkness
    public static final FoodProperties DARKNESS_FRUIT = new FoodProperties.Builder() //TODO: adjust parameters
            .nutrition(10)
            .saturationModifier(0.5f)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.INVISIBILITY, 100, 1), 0.5f)
            .build();
    public static final FoodProperties DARKNESS_FRUIT_DRIED = new FoodProperties.Builder() //TODO: adjust parameters
            .nutrition(15)
            .saturationModifier(0.75f)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.INVISIBILITY, 300, 2), 1f)
            .build();
    public static final FoodProperties DARKNESS_IN_A_BOTTLE = new FoodProperties.Builder() //TODO: adjust parameters
            .nutrition(0)
            .saturationModifier(0)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.INVISIBILITY, 500, 3), 1f)
            .build();
    // Light
    public static final FoodProperties LIGHT_FRUIT = new FoodProperties.Builder() //TODO: adjust parameters
            .nutrition(10)
            .saturationModifier(0.5f)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 100, 1), 0.5f)
            .build();
    public static final FoodProperties LIGHT_FRUIT_DRIED = new FoodProperties.Builder() //TODO: adjust parameters
            .nutrition(15)
            .saturationModifier(0.75f)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 300, 2), 1f)
            .build();
    public static final FoodProperties LIGHT_IN_A_BOTTLE = new FoodProperties.Builder() //TODO: adjust parameters
            .nutrition(0)
            .saturationModifier(0)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 500, 3), 1f)
            .build();
}
