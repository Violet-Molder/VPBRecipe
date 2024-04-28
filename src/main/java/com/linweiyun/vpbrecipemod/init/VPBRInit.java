//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.linweiyun.vpbrecipemod.init;

import com.linweiyun.vpbrecipemod.block.VPBROre;
import com.linweiyun.vpbrecipemod.block.VPBRBlock;
import com.linweiyun.vpbrecipemod.block.custom.blockeneity.VBlockEntity;
import com.linweiyun.vpbrecipemod.item.VPBRGunItem;
import com.linweiyun.vpbrecipemod.item.VPBRMaterial;
import com.linweiyun.vpbrecipemod.item.VPBROreItem;
import com.linweiyun.vpbrecipemod.item.WeaponBox.WeaponBox;
import com.linweiyun.vpbrecipemod.screen.VPBRGui;
import com.linweiyun.vpbrecipemod.screen.WeaponCraftingTableScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.eventbus.api.IEventBus;

public class VPBRInit {
    public VPBRInit() {
    }

    public static void registerVPBRItems(IEventBus eventBus) {
        VPBROreItem.register(eventBus);
        VPBRMaterial.register(eventBus);
        VPBRGunItem.register(eventBus);
        WeaponBox.register(eventBus);
    }

    public static void registerVPBRBlocks(IEventBus eventBus) {
        VPBROre.register(eventBus);
        VPBRBlock.reigster(eventBus);
    }

    public static void registerVPBRVillagers(IEventBus eventBus) {
    }

    public static void registerVPBRBlockEntities(IEventBus eventBus) {
        VBlockEntity.register(eventBus);
    }

    public static void registerVPBRRecipes(IEventBus eventBus) {
    }

    public static void registerVPBRMenuType(IEventBus eventBus) {
        VPBRGui.register(eventBus);
    }

    public static void registerVPBRScreens() {
        MenuScreens.register(VPBRGui.WEAPON_CRAFTING_TABLE_MENU.get(), WeaponCraftingTableScreen::new);
    }
}
