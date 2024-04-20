//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.linweiyun.vpbrecipemod.item;

import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;

public class VPBROreItem {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VPBRecipeMod.MOD_ID);
    public static final DeferredRegister<Item> ITEMS_2 = DeferredRegister.create(ForgeRegistries.ITEMS, "pointblank");
    public static final RegistryObject<Item> RAW_ZINC;
    public static final RegistryObject<Item> ZINC_INGOT;
    public static final RegistryObject<Item> RAW_ALUMINIUM;
    public static final RegistryObject<Item> ALUMINIUM_INGOT;
    public static final RegistryObject<Item> STEEL_INGOT;
    public static final RegistryObject<Item> BRASS_INGOT;
    public static final RegistryObject<Item> MODEL_GUN;

    public static final RegistryObject<Item> HAMMER = ITEMS.register("hammer", () -> {
        return new Hummer(new Item.Properties().stacksTo(1));
    });

    public static final RegistryObject<Item> OIL_SHALE = ITEMS.register("oil_shale", () -> {
        return new Item(new Item.Properties());
    });
    public static final RegistryObject<Item> SULFUR_DUST = ITEMS.register("sulfur_dust", () -> {
        return new Item(new Item.Properties());
    });
    public static final RegistryObject<Item> SALTPETER_DUST = ITEMS.register("saltpeter_dust", () -> {
        return new Item(new Item.Properties());
    });

    public static final RegistryObject<Item> ENGINEERING_PLASTIC_BOARD = ITEMS.register("engineering_plastic_board", () -> {
        return new Item(new Item.Properties());
    });

    public static final RegistryObject<Item> WML = ITEMS_2.register("wml", () -> {
        return new Item(new Item.Properties());
    });





    public VPBROreItem() {
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        ITEMS_2.register(eventBus);
    }

    static {
        RAW_ZINC = ITEMS.register("raw_zinc", () -> {
            return new Item(new Item.Properties());
        });
        ZINC_INGOT = ITEMS.register("zinc_ingot", () -> {
            return new Item(new Item.Properties());
        });
        RAW_ALUMINIUM = ITEMS.register("raw_aluminium", () -> {
            return new Item(new Item.Properties());
        });
        ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot", () -> {
            return new Item(new Item.Properties());
        });
        STEEL_INGOT = ITEMS.register("steel_ingot", () -> {
            return new Item(new Item.Properties());
        });
        BRASS_INGOT = ITEMS.register("brass_ingot", () -> {
            return new Item(new Item.Properties());
        });
        MODEL_GUN = ITEMS.register("model_gun", () -> {
            return new Item(new Item.Properties());
        });
    }
}
