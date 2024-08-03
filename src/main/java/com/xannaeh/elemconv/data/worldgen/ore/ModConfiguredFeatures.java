package com.xannaeh.elemconv.data.worldgen.ore;

import com.xannaeh.elemconv.elements.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

import static com.xannaeh.elemconv.main.ElemConv.MODID;

public class ModConfiguredFeatures {
    protected static ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DARKNESS_ORE = createKey("overworld_darkness_ore");
    protected static ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LIGHT_ORE = createKey("overworld_light_ore");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> darknessOre =
                List.of(OreConfiguration.target(stoneReplaceable, ModBlocks.DARKNESS_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceable, ModBlocks.DARKNESS_ORE_DEEPSLATE.get().defaultBlockState()));
        register(context, OVERWORLD_DARKNESS_ORE, Feature.ORE, new OreConfiguration(darknessOre, 4));

        List<OreConfiguration.TargetBlockState> lightOre =
                List.of(OreConfiguration.target(stoneReplaceable, ModBlocks.LIGHT_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceable, ModBlocks.LIGHT_ORE_DEEPSLATE.get().defaultBlockState()));
        register(context, OVERWORLD_LIGHT_ORE, Feature.ORE, new OreConfiguration(lightOre, 4));
    }

    private static ResourceKey<ConfiguredFeature<?, ?>> createKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC config) {
        context.register(key, new ConfiguredFeature<>(feature, config));
    }
}
