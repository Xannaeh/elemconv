package com.xannaeh.elemconv.data.worldgen.ore;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

import static com.xannaeh.elemconv.main.ElemConv.MODID;

public class ModPlacedFeatures {
    public static ResourceKey<PlacedFeature> DARKNESS_ORE = createKey("darkness_ore");
    public static ResourceKey<PlacedFeature> LIGHT_ORE = createKey("light_ore");


    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        Holder<ConfiguredFeature<?, ?>> holder_darkness_ore = configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_DARKNESS_ORE);
        register(context, DARKNESS_ORE, holder_darkness_ore, ModOrePlacement.commonOrePlacements(3, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(20)))); //TODO: set up latter

        Holder<ConfiguredFeature<?, ?>> holder_light_ore = configuredFeatures.getOrThrow(ModConfiguredFeatures.OVERWORLD_LIGHT_ORE);
        register(context, LIGHT_ORE, holder_light_ore, ModOrePlacement.commonOrePlacements(3, HeightRangePlacement.uniform(VerticalAnchor.absolute(-20), VerticalAnchor.absolute(44)))); //TODO: set up latter
    }

    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MODID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> feature, List<PlacementModifier> placementModifiers) {
        context.register(key, new PlacedFeature(feature, placementModifiers));
    }
}
