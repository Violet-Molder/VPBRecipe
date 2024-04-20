package com.linweiyun.vpbrecipemod.datagen;

import com.linweiyun.vpbrecipemod.VPBRTags;
import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import com.linweiyun.vpbrecipemod.item.VPBROreItem;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class VPBRItemTagProvider extends ItemTagsProvider {
    public VPBRItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> future, CompletableFuture<TagLookup<Block>> future1, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, future, future1, VPBRecipeMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(VPBRTags.Items.STEEL_INGOTS)
                .add(
                        VPBROreItem.STEEL_INGOT.get()
                );
        this.tag(VPBRTags.Items.ALUMINIUM_INGOTS)
                .add(
                        VPBROreItem.ALUMINIUM_INGOT.get()
                );
        this.tag(VPBRTags.Items.ZINC_INGOTS)
                .add(
                        VPBROreItem.ZINC_INGOT.get()
                );
        this.tag(VPBRTags.Items.BRASS_INGOTS)
                .add(
                        VPBROreItem.BRASS_INGOT.get()
                );

    }
}
