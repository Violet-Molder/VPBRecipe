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
import net.minecraftforge.registries.RegistryObject;

public class VPBRMaterial {
    public static final DeferredRegister<Item> ITEMS;
    public static final RegistryObject<Item> PISTOL_BARREL;
    public static final RegistryObject<Item> GLOCK_17_GRIP;
    public static final RegistryObject<Item> GLOCK_18_GRIP;
    public static final RegistryObject<Item> GLOCK_17_SHELL;
    public static final RegistryObject<Item> GLOCK_18_SHELL;
    public static final RegistryObject<Item> M1911A1_SHELL;
    public static final RegistryObject<Item> M1911A1_GRIP;
    public static final RegistryObject<Item> RIFLE_BARREL;
    public static final RegistryObject<Item> RIFLE_GRIP_I;
    public static final RegistryObject<Item> RIFLE_SHELL_I;
    public static final RegistryObject<Item> RIFLE_SHELL_II;
    public static final RegistryObject<Item> RIFLE_STOCK_I;
    public static final RegistryObject<Item> RIFLE_STOCK_II;
    public static final RegistryObject<Item> RIFLE_MAGAZINE_I;
    public static final RegistryObject<Item> RIFLE_MAGAZINE_II;
    public static final RegistryObject<Item> RIFLE_SIGHT_I;
    public static final RegistryObject<Item> RIFLE_SIGHT_II;

    public VPBRMaterial() {
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    static {
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VPBRecipeMod.MOD_ID);
        PISTOL_BARREL = ITEMS.register("pistol_barrel", () -> {
            return new Item(new Item.Properties());
        });
        GLOCK_17_GRIP = ITEMS.register("glock_17_grip", () -> {
            return new Item(new Item.Properties());
        });
        GLOCK_18_GRIP = ITEMS.register("glock_18_grip", () -> {
            return new Item(new Item.Properties());
        });
        GLOCK_17_SHELL = ITEMS.register("glock_17_shell", () -> {
            return new Item(new Item.Properties());
        });
        GLOCK_18_SHELL = ITEMS.register("glock_18_shell", () -> {
            return new Item(new Item.Properties());
        });
        M1911A1_SHELL = ITEMS.register("m1911a1_shell", () -> {
            return new Item(new Item.Properties());
        });
        M1911A1_GRIP = ITEMS.register("m1911a1_grip", () -> {
            return new Item(new Item.Properties());
        });
        RIFLE_BARREL = ITEMS.register("rifle_barrel", () -> {
            return new Item(new Item.Properties());
        });
        RIFLE_GRIP_I = ITEMS.register("rifle_grip_1", () -> {
            return new Item(new Item.Properties());
        });
        RIFLE_SHELL_I = ITEMS.register("rifle_shell_1", () -> {
            return new Item(new Item.Properties());
        });
        RIFLE_SHELL_II = ITEMS.register("rifle_shell_2", () -> {
            return new Item(new Item.Properties());
        });
        RIFLE_STOCK_I = ITEMS.register("rifle_stock_1", () -> {
            return new Item(new Item.Properties());
        });
        RIFLE_STOCK_II = ITEMS.register("rifle_stock_2", () -> {
            return new Item(new Item.Properties());
        });
        RIFLE_MAGAZINE_I = ITEMS.register("rifle_magazine_1", () -> {
            return new Item(new Item.Properties());
        });
        RIFLE_MAGAZINE_II = ITEMS.register("rifle_magazine_2", () -> {
            return new Item(new Item.Properties());
        });
        RIFLE_SIGHT_I = ITEMS.register("rifle_sight_1", () -> {
            return new Item(new Item.Properties());
        });
        RIFLE_SIGHT_II = ITEMS.register("rifle_sight_2", () -> {
            return new Item(new Item.Properties());
        });
    }
}
