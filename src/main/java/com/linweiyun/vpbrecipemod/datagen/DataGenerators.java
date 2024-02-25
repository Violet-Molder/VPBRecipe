//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.linweiyun.vpbrecipemod.datagen;

import java.util.concurrent.CompletableFuture;

import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(
        modid = VPBRecipeMod.MOD_ID,
        bus = Bus.MOD
)
public class DataGenerators {
    public DataGenerators() {
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        generator.addProvider(event.includeClient(), new VPBRBlockStateProvider(output, existingFileHelper));
        generator.addProvider(event.includeClient(), new VPBRItemModelProvider(output, existingFileHelper));
        VPBRBlockTagProvider blockTagGenerator = (VPBRBlockTagProvider)generator.addProvider(event.includeServer(), new VPBRBlockTagProvider(output, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new VPBRWorldGenProvider(output, lookupProvider));
    }
}
