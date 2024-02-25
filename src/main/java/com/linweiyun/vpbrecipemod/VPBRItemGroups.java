//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.linweiyun.vpbrecipemod;

import com.linweiyun.vpbrecipemod.block.VPBROre;
import com.linweiyun.vpbrecipemod.item.VPBRMaterial;
import com.linweiyun.vpbrecipemod.item.VPBROreItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
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
                        pOutput.accept(VPBROre.ZINC_ORE.get());
                        pOutput.accept(VPBROre.DEEPSLATE_ZINC_ORE.get());
                        pOutput.accept(VPBROre.ALUMINIUM_ORE.get());
                        pOutput.accept(VPBROre.DEEPSLATE_ALUMINIUM_ORE.get());
                        pOutput.accept(VPBROreItem.RAW_ZINC.get());
                        pOutput.accept(VPBROreItem.RAW_ALUMINIUM.get());
                        pOutput.accept(VPBROreItem.ZINC_INGOT.get());
                        pOutput.accept(VPBROreItem.ALUMINIUM_INGOT.get());
                        pOutput.accept(VPBROreItem.STEEL_INGOT.get());
                        pOutput.accept(VPBROreItem.BRASS_INGOT.get());
                    }).
                    build());
    public static final RegistryObject<CreativeModeTab> VPB_MATERIAL= ITEM_GROUPS.register("vpb_material",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(VPBRMaterial.GLOCK_17_SHELL.get()))
                    .title(Component.translatable(VPB_MATERIAL_GROUP))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(VPBRMaterial.PISTOL_BARREL.get());
                        pOutput.accept(VPBRMaterial.GLOCK_17_SHELL.get());
                        pOutput.accept(VPBRMaterial.GLOCK_17_GRIP.get());
                        pOutput.accept(VPBRMaterial.GLOCK_18_SHELL.get());
                        pOutput.accept(VPBRMaterial.GLOCK_18_GRIP.get());
                        pOutput.accept(VPBRMaterial.M1911A1_SHELL.get());
                        pOutput.accept(VPBRMaterial.M1911A1_GRIP.get());
                        pOutput.accept(VPBRMaterial.RIFLE_SHELL_I.get());
                        pOutput.accept(VPBRMaterial.RIFLE_SHELL_II.get());
                        pOutput.accept(VPBRMaterial.RIFLE_GRIP_I.get());
                        pOutput.accept(VPBRMaterial.RIFLE_STOCK_I.get());
                        pOutput.accept(VPBRMaterial.RIFLE_STOCK_II.get());
                        pOutput.accept(VPBRMaterial.RIFLE_MAGAZINE_I.get());
                        pOutput.accept(VPBRMaterial.RIFLE_MAGAZINE_II.get());
                        pOutput.accept(VPBRMaterial.RIFLE_SIGHT_I.get());
                        pOutput.accept(VPBRMaterial.RIFLE_SIGHT_II.get());
                    })
                    .build());

    public VPBRItemGroups() {
    }

    public static void register(IEventBus eventBus) {
        ITEM_GROUPS.register(eventBus);
    }

    }

