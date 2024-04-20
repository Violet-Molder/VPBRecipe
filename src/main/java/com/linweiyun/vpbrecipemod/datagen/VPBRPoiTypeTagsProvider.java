package com.linweiyun.vpbrecipemod.datagen;

import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.PoiTypeTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.PoiTypeTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class VPBRPoiTypeTagsProvider extends PoiTypeTagsProvider {
    public VPBRPoiTypeTagsProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pProvider, VPBRecipeMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(PoiTypeTags.ACQUIRABLE_JOB_SITE)
                .addOptional(new ResourceLocation(VPBRecipeMod.MOD_ID, "arms_dealer_poi"))
                .addOptional(new ResourceLocation(VPBRecipeMod.MOD_ID, "ammunition_dealer_poi"));

    }
}
