//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.linweiyun.vpbrecipemod.datagen;

import com.linweiyun.vpbrecipemod.block.VPBROre;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class VPBRBlockStateProvider extends BlockStateProvider {
    public VPBRBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, "vpbrecipe", exFileHelper);
    }

    protected void registerStatesAndModels() {
        this.blockWithItem(VPBROre.ALUMINIUM_ORE);
        this.blockWithItem(VPBROre.ZINC_ORE);
        this.blockWithItem(VPBROre.DEEPSLATE_ALUMINIUM_ORE);
        this.blockWithItem(VPBROre.DEEPSLATE_ZINC_ORE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        this.simpleBlockWithItem((Block)blockRegistryObject.get(), this.cubeAll((Block)blockRegistryObject.get()));
    }
}
