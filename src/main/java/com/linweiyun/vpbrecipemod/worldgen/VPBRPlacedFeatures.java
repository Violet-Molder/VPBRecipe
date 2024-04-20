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

public class VPBRPlacedFeatures {
    public static final ResourceKey<PlacedFeature> ZINC_ORE_PLACED_KEY = registerKey("zinc_ore_placed");
    public static final ResourceKey<PlacedFeature> ALUMINIUM_ORE_PLACED_KEY = registerKey("aluminium_ore_placed");
    public static final ResourceKey<PlacedFeature> SALTPETER_ORE_PLACED_KEY = registerKey("saltpeter_ore_placed");
    public static final ResourceKey<PlacedFeature> SULFUR_ORE_PLACED_KEY = registerKey("sulfur_ore_placed");
    public static final ResourceKey<PlacedFeature> OIL_SHALE_ORE_PLACED_KEY = registerKey("oil_shale_ore_placed");

    public VPBRPlacedFeatures() {
    }

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ZINC_ORE_PLACED_KEY, configuredFeatures.getOrThrow(VPBROreConfiguredFeatures.ZINC_ORE_KEY),
                VPBROrePlacement.commonOrePlacement(18, HeightRangePlacement.triangle(
                        VerticalAnchor.absolute(-64), VerticalAnchor.absolute(150))));
        register(context, ALUMINIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(VPBROreConfiguredFeatures.ALUMINIUM_ORE_KEY),
                VPBROrePlacement.commonOrePlacement(24, HeightRangePlacement.triangle(
                        VerticalAnchor.absolute(-64), VerticalAnchor.absolute(150))));
        register(context, SALTPETER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(VPBROreConfiguredFeatures.SALTPETER_ORE_KEY),
                VPBROrePlacement.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64), VerticalAnchor.absolute(150))));
        register(context, SULFUR_ORE_PLACED_KEY, configuredFeatures.getOrThrow(VPBROreConfiguredFeatures.SULFUR_ORE_KEY),
                VPBROrePlacement.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(-64), VerticalAnchor.absolute(150))));
        register(context, OIL_SHALE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(VPBROreConfiguredFeatures.OIL_SHALE_ORE_KEY),
                VPBROrePlacement.commonOrePlacement(12, HeightRangePlacement.uniform(
                        VerticalAnchor.absolute(0), VerticalAnchor.absolute(150))));
    }

    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(VPBRecipeMod.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
