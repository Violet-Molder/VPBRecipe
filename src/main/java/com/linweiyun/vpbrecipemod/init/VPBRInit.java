//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.linweiyun.vpbrecipemod.init;

import com.linweiyun.vpbrecipemod.block.VPBROre;
import com.linweiyun.vpbrecipemod.item.VPBRMaterial;
import com.linweiyun.vpbrecipemod.item.VPBROreItem;
import net.minecraftforge.eventbus.api.IEventBus;

public class VPBRInit {
    public VPBRInit() {
    }

    public static void registerLycorisItems(IEventBus eventBus) {
        VPBROreItem.register(eventBus);
        VPBRMaterial.register(eventBus);
    }

    public static void registerLycorisBlocks(IEventBus eventBus) {
        VPBROre.register(eventBus);
    }

    public static void registerLycorisBlockEntities(IEventBus eventBus) {
    }

    public static void registerLycorisRecipes(IEventBus eventBus) {
    }

    public static void registerLycorisMenuType(IEventBus eventBus) {
    }

    public static void registerLycorisScreens() {
    }
}
