//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.linweiyun.vpbrecipemod.worldgen;

import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import com.linweiyun.vpbrecipemod.block.VPBROre;
import java.util.List;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class VPBROreConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> ZINC_ORE_KEY = registerKey("zinc_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALUMINIUM_ORE_KEY = registerKey("aluminium_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SALTPETER_ORE_KEY = registerKey("saltpeter_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SULFUR_ORE_KEY = registerKey("sulfur_ore_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OIL_SHALE_ORE_KEY = registerKey("oil_shale_ore_key");

    public VPBROreConfiguredFeatures() {
    }

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepReplaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        List<OreConfiguration.TargetBlockState> zincOres = List.of(
                OreConfiguration.target(stoneReplaceable,
                        VPBROre.ZINC_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepReplaceable,
                        VPBROre.DEEPSLATE_ZINC_ORE.get().defaultBlockState()
                ));
        List<OreConfiguration.TargetBlockState> aluminiumOres = List.of(
                OreConfiguration.target(stoneReplaceable,
                        VPBROre.ALUMINIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepReplaceable,
                        VPBROre.DEEPSLATE_ALUMINIUM_ORE.get().defaultBlockState()
                ));
        List<OreConfiguration.TargetBlockState> saltpeterOres = List.of(
                OreConfiguration.target(stoneReplaceable,
                        VPBROre.SALTPETER_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepReplaceable,
                        VPBROre.DEEPSLATE_SALTPETER_ORE.get().defaultBlockState()
                ));
        List<OreConfiguration.TargetBlockState> sulfurOres = List.of(
                OreConfiguration.target(stoneReplaceable,
                        VPBROre.SULFUR_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepReplaceable,
                        VPBROre.DEEPSLATE_SULFUR_ORE.get().defaultBlockState()
                ));
        List<OreConfiguration.TargetBlockState> oilShaleOres = List.of(
                OreConfiguration.target(stoneReplaceable,
                        VPBROre.OIL_SHALE_ORE.get().defaultBlockState()
                ));
        register(context, ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(zincOres, 7));
        register(context, ALUMINIUM_ORE_KEY, Feature.ORE, new OreConfiguration(aluminiumOres, 7));
        register(context, SALTPETER_ORE_KEY, Feature.ORE, new OreConfiguration(saltpeterOres, 7));
        register(context, SULFUR_ORE_KEY, Feature.ORE, new OreConfiguration(sulfurOres, 7));
        register(context, OIL_SHALE_ORE_KEY, Feature.ORE, new OreConfiguration(oilShaleOres, 7));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(VPBRecipeMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key,
                                                                                          F feature, FC configuration) {
        context.register(key, new ConfiguredFeature(feature, configuration));
    }
}
