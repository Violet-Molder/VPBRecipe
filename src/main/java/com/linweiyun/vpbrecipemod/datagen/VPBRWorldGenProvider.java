//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.linweiyun.vpbrecipemod.datagen;

import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import com.linweiyun.vpbrecipemod.worldgen.LycorisBiomeModifiers;
import com.linweiyun.vpbrecipemod.worldgen.LycorisOreConfiguredFeatures;
import com.linweiyun.vpbrecipemod.worldgen.LycorisPlacedFeatures;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries.Keys;

public class VPBRWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER;

    public VPBRWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(VPBRecipeMod.MOD_ID));
    }

    static {
        BUILDER = (new RegistrySetBuilder())
                .add(Registries.CONFIGURED_FEATURE, LycorisOreConfiguredFeatures::bootstrap)
                .add(Registries.PLACED_FEATURE, LycorisPlacedFeatures::bootstrap)
                .add(Keys.BIOME_MODIFIERS, LycorisBiomeModifiers::bootstrap);
    }
}
