//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.linweiyun.vpbrecipemod.datagen;

import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import com.linweiyun.vpbrecipemod.item.VPBRMaterial;
import com.linweiyun.vpbrecipemod.item.VPBROreItem;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class VPBRItemModelProvider extends ItemModelProvider {
    public VPBRItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, VPBRecipeMod.MOD_ID, existingFileHelper);
    }

    protected void registerModels() {
        this.simpleItemModel(VPBROreItem.MODEL_GUN);
        this.simpleItemModel(VPBROreItem.RAW_ZINC);
        this.simpleItemModel(VPBROreItem.ZINC_INGOT);
        this.simpleItemModel(VPBROreItem.RAW_ALUMINIUM);
        this.simpleItemModel(VPBROreItem.ALUMINIUM_INGOT);
        this.simpleItemModel(VPBROreItem.STEEL_INGOT);
        this.simpleItemModel(VPBROreItem.BRASS_INGOT);
        this.simpleItemModel(VPBRMaterial.PISTOL_BARREL);
        this.simpleItemModel(VPBRMaterial.GLOCK_17_GRIP);
        this.simpleItemModel(VPBRMaterial.GLOCK_18_GRIP);
        this.simpleItemModel(VPBRMaterial.GLOCK_17_SHELL);
        this.simpleItemModel(VPBRMaterial.GLOCK_18_SHELL);
        this.simpleItemModel(VPBRMaterial.M1911A1_GRIP);
        this.simpleItemModel(VPBRMaterial.M1911A1_SHELL);
        this.simpleItemModel(VPBRMaterial.RIFLE_BARREL);
        this.simpleItemModel(VPBRMaterial.RIFLE_GRIP_I);
        this.simpleItemModel(VPBRMaterial.RIFLE_SHELL_I);
        this.simpleItemModel(VPBRMaterial.RIFLE_SHELL_II);
        this.simpleItemModel(VPBRMaterial.RIFLE_STOCK_I);
        this.simpleItemModel(VPBRMaterial.RIFLE_STOCK_II);
        this.simpleItemModel(VPBRMaterial.RIFLE_MAGAZINE_I);
        this.simpleItemModel(VPBRMaterial.RIFLE_MAGAZINE_II);
        this.simpleItemModel(VPBRMaterial.RIFLE_SIGHT_I);
        this.simpleItemModel(VPBRMaterial.RIFLE_SIGHT_II);
    }

    private ItemModelBuilder simpleItemModel(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(VPBRecipeMod.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItemModel(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(VPBRecipeMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
