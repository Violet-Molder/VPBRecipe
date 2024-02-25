//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.linweiyun.vpbrecipemod.datagen;

import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import com.linweiyun.vpbrecipemod.block.VPBROre;
import java.util.concurrent.CompletableFuture;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class VPBRBlockTagProvider extends BlockTagsProvider {
    public VPBRBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, VPBRecipeMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(Blocks.ORES)
                .add(
                        VPBROre.ALUMINIUM_ORE.get(),
                        VPBROre.ZINC_ORE.get(),
                        VPBROre.DEEPSLATE_ZINC_ORE.get(),
                        VPBROre.DEEPSLATE_ALUMINIUM_ORE.get()
                );
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(
                        VPBROre.ALUMINIUM_ORE.get(),
                        VPBROre.ZINC_ORE.get(),
                        VPBROre.DEEPSLATE_ZINC_ORE.get(),
                        VPBROre.DEEPSLATE_ALUMINIUM_ORE.get()
                );
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(
                        VPBROre.ALUMINIUM_ORE.get(),
                        VPBROre.ZINC_ORE.get(),
                        VPBROre.DEEPSLATE_ZINC_ORE.get(),
                        VPBROre.DEEPSLATE_ALUMINIUM_ORE.get()
        );
    }
}
