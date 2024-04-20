//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.linweiyun.vpbrecipemod;

import com.linweiyun.vpbrecipemod.block.VPBROre;
import com.linweiyun.vpbrecipemod.block.VPBRBlock;
import com.linweiyun.vpbrecipemod.item.VPBRGunItem;
import com.linweiyun.vpbrecipemod.item.VPBRMaterial;
import com.linweiyun.vpbrecipemod.item.VPBROreItem;
import com.linweiyun.vpbrecipemod.item.WeaponBox.WeaponBox;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class VPBRItemGroups {

    public static final DeferredRegister<CreativeModeTab> ITEM_GROUPS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VPBRecipeMod.MOD_ID);
    public static final String VPB_ORE_GROUP = "creativetab.vpb.ore_group";
    public static final String VPB_MATERIAL_GROUP = "creativetab.vpb.material_group";
    public static final RegistryObject<CreativeModeTab> VPB_ORE = ITEM_GROUPS.register("vpb_ore",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(VPBROreItem.ZINC_INGOT.get()))
                    .title(Component.translatable(VPB_ORE_GROUP))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(VPBROreItem.HAMMER.get());
                        pOutput.accept(VPBROreItem.RAW_ZINC.get());
                        pOutput.accept(VPBROreItem.RAW_ALUMINIUM.get());
                        pOutput.accept(VPBROreItem.ZINC_INGOT.get());
                        pOutput.accept(VPBROreItem.ALUMINIUM_INGOT.get());
                        pOutput.accept(VPBROreItem.STEEL_INGOT.get());
                        pOutput.accept(VPBROreItem.BRASS_INGOT.get());
                        pOutput.accept(VPBROreItem.SALTPETER_DUST.get());
                        pOutput.accept(VPBROreItem.SULFUR_DUST.get());
                        pOutput.accept(VPBROreItem.OIL_SHALE.get());
                        pOutput.accept(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get());
                        pOutput.accept(VPBROre.ZINC_ORE.get());
                        pOutput.accept(VPBROre.DEEPSLATE_ZINC_ORE.get());
                        pOutput.accept(VPBROre.ALUMINIUM_ORE.get());
                        pOutput.accept(VPBROre.DEEPSLATE_ALUMINIUM_ORE.get());
                        pOutput.accept(VPBROre.SALTPETER_ORE.get());
                        pOutput.accept(VPBROre.DEEPSLATE_SALTPETER_ORE.get());
                        pOutput.accept(VPBROre.SULFUR_ORE.get());
                        pOutput.accept(VPBROre.DEEPSLATE_SULFUR_ORE.get());
                        pOutput.accept(VPBROre.OIL_SHALE_ORE.get());
                        pOutput.accept(VPBROre.INDUSTRIAL_PLANKS.get());
                        pOutput.accept(VPBROreItem.WML.get());


                        pOutput.accept(WeaponBox.WEAPON_BOX.get());
                        pOutput.accept(VPBRBlock.WEAPON_CRAFTING_TABLE.get());

                    }).
                    build());
    public static final RegistryObject<CreativeModeTab> VPB_MATERIAL= ITEM_GROUPS.register("vpb_material",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(VPBRMaterial.GLOCK_17_SHELL.get()))
                    .title(Component.translatable(VPB_MATERIAL_GROUP))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(VPBRBlock.FIREARM_ASSEMBLY_STATION.get());
                        pOutput.accept(VPBRBlock.AMMUNITION_ASSEMBLY_STATION.get());
                        pOutput.accept(VPBRMaterial.RIFLE_BARREL.get());
                        pOutput.accept(VPBRMaterial.PISTOL_BARREL.get());
                        pOutput.accept(VPBRMaterial.GLOCK_17_SHELL.get());
                        pOutput.accept(VPBRMaterial.GLOCK_17_GRIP.get());
                        pOutput.accept(VPBRMaterial.GLOCK_18_SHELL.get());
                        pOutput.accept(VPBRMaterial.GLOCK_18_GRIP.get());
                        pOutput.accept(VPBRMaterial.M1911A1_SHELL.get());
                        pOutput.accept(VPBRMaterial.M1911A1_GRIP.get());
                        pOutput.accept(VPBRMaterial.RIFLE_SHELL_I.get());
                        pOutput.accept(VPBRMaterial.RIFLE_SHELL_II.get());
                        pOutput.accept(VPBRMaterial.RIFLE_SHELL_III.get());

                        pOutput.accept(VPBRMaterial.RIFLE_GRIP_I.get());

                        pOutput.accept(VPBRMaterial.RIFLE_STOCK_I.get());
                        pOutput.accept(VPBRMaterial.RIFLE_STOCK_II.get());
                        pOutput.accept(VPBRMaterial.RIFLE_STOCK_III.get());

                        pOutput.accept(VPBRMaterial.RIFLE_MAGAZINE_I.get());
                        pOutput.accept(VPBRMaterial.RIFLE_MAGAZINE_II.get());

                        pOutput.accept(VPBRMaterial.RIFLE_SIGHT_I.get());
                        pOutput.accept(VPBRMaterial.RIFLE_SIGHT_II.get());
                    })
                    .build());
    public static final RegistryObject<CreativeModeTab> VPB_GUN_ITEM= ITEM_GROUPS.register("vpb_gun_lottery",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(VPBRGunItem.AK47_ITEM.get()))
                    .title(Component.translatable("creativetab.vpb.gun_lottery"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(VPBRGunItem.GLOCK17_ITEM.get());
                        pOutput.accept(VPBRGunItem.GLOCK18_ITEM.get());
                        pOutput.accept(VPBRGunItem.M1911A1_ITEM.get());
                        pOutput.accept(VPBRGunItem.M4A1_ITEM.get());
                        pOutput.accept(VPBRGunItem.M4A1MODI_TEM.get());
                        pOutput.accept(VPBRGunItem.STAR15_ITEM.get());
                        pOutput.accept(VPBRGunItem.M4SOPMODII_ITEM.get());
                        pOutput.accept(VPBRGunItem.M16A1_ITEM.get());
                        pOutput.accept(VPBRGunItem.SCARL_ITEM.get());
                        pOutput.accept(VPBRGunItem.XM7_ITEM.get());
                        pOutput.accept(VPBRGunItem.G36C_ITEM.get());
                        pOutput.accept(VPBRGunItem.G36K_ITEM.get());
                        pOutput.accept(VPBRGunItem.AUG_ITEM.get());
                        pOutput.accept(VPBRGunItem.G41_ITEM.get());
                        pOutput.accept(VPBRGunItem.AK47_ITEM.get());
                        pOutput.accept(VPBRGunItem.AK74_ITEM.get());
                        pOutput.accept(VPBRGunItem.AK12_ITEM.get());
                        pOutput.accept(VPBRGunItem.MP5_ITEM.get());
                        pOutput.accept(VPBRGunItem.MP7_ITEM.get());
                        pOutput.accept(VPBRGunItem.MP7A2DEVGRU_ITEM.get());
                        pOutput.accept(VPBRGunItem.UMP45_ITEM.get());
                        pOutput.accept(VPBRGunItem.TMP_ITEM.get());
                        pOutput.accept(VPBRGunItem.M950_ITEM.get());
                        pOutput.accept(VPBRGunItem.SL8_ITEM.get());
                        pOutput.accept(VPBRGunItem.MK14EBR_ITEM.get());
                        pOutput.accept(VPBRGunItem.WA2000_ITEM.get());
                        pOutput.accept(VPBRGunItem.XM3_ITEM.get());
                        pOutput.accept(VPBRGunItem.C14_ITEM.get());
                        pOutput.accept(VPBRGunItem.L96A1_ITEM.get());
                        pOutput.accept(VPBRGunItem.GM6LYNX_ITEM.get());
                        pOutput.accept(VPBRGunItem.M590_ITEM.get());
                        pOutput.accept(VPBRGunItem.M870_ITEM.get());
                        pOutput.accept(VPBRGunItem.SPAS12_ITEM.get());
                        pOutput.accept(VPBRGunItem.M1014_ITEM.get());
                        pOutput.accept(VPBRGunItem.AA12_ITEM.get());
                        pOutput.accept(VPBRGunItem.CITORICXS_ITEM.get());
                        pOutput.accept(VPBRGunItem.HS12_ITEM.get());
                        pOutput.accept(VPBRGunItem.AUGHBAR_ITEM.get());
                        pOutput.accept(VPBRGunItem.LAMG_ITEM.get());
                    })
                    .build());

    public VPBRItemGroups() {
    }

    public static void register(IEventBus eventBus) {
        ITEM_GROUPS.register(eventBus);
    }

    }

