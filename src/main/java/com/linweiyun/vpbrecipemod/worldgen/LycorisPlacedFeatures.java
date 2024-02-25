//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.linweiyun.vpbrecipemod.worldgen;

import java.util.List;

import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

public class LycorisPlacedFeatures {
    public static final ResourceKey<PlacedFeature> ZINC_ORE_PLACED_KEY = registerKey("zinc_ore_placed");
    public static final ResourceKey<PlacedFeature> ALUMINIUM_ORE_PLACED_KEY = registerKey("aluminium_ore_placed");

    public LycorisPlacedFeatures() {
    }

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ZINC_ORE_PLACED_KEY, configuredFeatures.getOrThrow(LycorisOreConfiguredFeatures.ZINC_ORE_KEY),
                LycorisOrePlacement.commonOrePlacement(12, HeightRangePlacement.triangle(
                        VerticalAnchor.absolute(-64), VerticalAnchor.absolute(100))));
        register(context, ALUMINIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(LycorisOreConfiguredFeatures.ALUMINIUM_ORE_KEY),
                LycorisOrePlacement.commonOrePlacement(24, HeightRangePlacement.triangle(
                        VerticalAnchor.absolute(-64), VerticalAnchor.absolute(100))));
    }

    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(VPBRecipeMod.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
