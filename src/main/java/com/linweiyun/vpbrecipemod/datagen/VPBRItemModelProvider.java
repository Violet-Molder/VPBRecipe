//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.linweiyun.vpbrecipemod.datagen;

import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import com.linweiyun.vpbrecipemod.item.VPBRGunItem;
import com.linweiyun.vpbrecipemod.item.VPBRMaterial;
import com.linweiyun.vpbrecipemod.item.VPBROreItem;
import com.linweiyun.vpbrecipemod.item.WeaponBox.WeaponBox;
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
        this.simpleItemModel(WeaponBox.WEAPON_BOX);

        this.simpleItemModel(VPBROreItem.MODEL_GUN);
        this.simpleItemModel(VPBROreItem.RAW_ZINC);
        this.simpleItemModel(VPBROreItem.ZINC_INGOT);
        this.simpleItemModel(VPBROreItem.RAW_ALUMINIUM);
        this.simpleItemModel(VPBROreItem.ALUMINIUM_INGOT);
        this.simpleItemModel(VPBROreItem.STEEL_INGOT);
        this.simpleItemModel(VPBROreItem.BRASS_INGOT);
        this.simpleItemModel(VPBROreItem.SALTPETER_DUST);
        this.simpleItemModel(VPBROreItem.SULFUR_DUST);
        this.simpleItemModel(VPBROreItem.OIL_SHALE);
        this.simpleItemModel(VPBROreItem.ENGINEERING_PLASTIC_BOARD);
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
        this.simpleItemModel(VPBRMaterial.RIFLE_SHELL_III);

        this.simpleItemModel(VPBRMaterial.RIFLE_STOCK_I);
        this.simpleItemModel(VPBRMaterial.RIFLE_STOCK_II);
        this.simpleItemModel(VPBRMaterial.RIFLE_STOCK_III);

        this.simpleItemModel(VPBRMaterial.RIFLE_MAGAZINE_I);
        this.simpleItemModel(VPBRMaterial.RIFLE_MAGAZINE_II);

        this.simpleItemModel(VPBRMaterial.RIFLE_SIGHT_I);
        this.simpleItemModel(VPBRMaterial.RIFLE_SIGHT_II);

        this.simpleItemModel(VPBRGunItem.GLOCK17_ITEM);
        this.simpleItemModel(VPBRGunItem.GLOCK18_ITEM);
        this.simpleItemModel(VPBRGunItem.M1911A1_ITEM);
        this.simpleItemModel(VPBRGunItem.M4A1_ITEM);
        this.simpleItemModel(VPBRGunItem.M4A1MODI_TEM);
        this.simpleItemModel(VPBRGunItem.STAR15_ITEM);
        this.simpleItemModel(VPBRGunItem.M4SOPMODII_ITEM);
        this.simpleItemModel(VPBRGunItem.M16A1_ITEM);
        this.simpleItemModel(VPBRGunItem.SCARL_ITEM);
        this.simpleItemModel(VPBRGunItem.XM7_ITEM);
        this.simpleItemModel(VPBRGunItem.G36C_ITEM);
        this.simpleItemModel(VPBRGunItem.G36K_ITEM);
        this.simpleItemModel(VPBRGunItem.AUG_ITEM);
        this.simpleItemModel(VPBRGunItem.G41_ITEM);
        this.simpleItemModel(VPBRGunItem.AK47_ITEM);
        this.simpleItemModel(VPBRGunItem.AK74_ITEM);
        this.simpleItemModel(VPBRGunItem.AK12_ITEM);
        this.simpleItemModel(VPBRGunItem.MP5_ITEM);
        this.simpleItemModel(VPBRGunItem.MP7_ITEM);
        this.simpleItemModel(VPBRGunItem.MP7A2DEVGRU_ITEM);
        this.simpleItemModel(VPBRGunItem.UMP45_ITEM);
        this.simpleItemModel(VPBRGunItem.TMP_ITEM);
        this.simpleItemModel(VPBRGunItem.M950_ITEM);
        this.simpleItemModel(VPBRGunItem.SL8_ITEM);
        this.simpleItemModel(VPBRGunItem.MK14EBR_ITEM);
        this.simpleItemModel(VPBRGunItem.WA2000_ITEM);
        this.simpleItemModel(VPBRGunItem.XM3_ITEM);
        this.simpleItemModel(VPBRGunItem.C14_ITEM);
        this.simpleItemModel(VPBRGunItem.L96A1_ITEM);
        this.simpleItemModel(VPBRGunItem.GM6LYNX_ITEM);
        this.simpleItemModel(VPBRGunItem.M590_ITEM);
        this.simpleItemModel(VPBRGunItem.M870_ITEM);
        this.simpleItemModel(VPBRGunItem.SPAS12_ITEM);
        this.simpleItemModel(VPBRGunItem.M1014_ITEM);
        this.simpleItemModel(VPBRGunItem.AA12_ITEM);
        this.simpleItemModel(VPBRGunItem.CITORICXS_ITEM);
        this.simpleItemModel(VPBRGunItem.HS12_ITEM);
        this.simpleItemModel(VPBRGunItem.AUGHBAR_ITEM);
        this.simpleItemModel(VPBRGunItem.LAMG_ITEM);

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
