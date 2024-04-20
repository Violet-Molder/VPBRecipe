package com.linweiyun.vpbrecipemod.item;

import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VPBRGunItem {
    public static final DeferredRegister<Item> ITEMS;
    public static final RegistryObject<Item> GLOCK17_ITEM;
    public static final RegistryObject<Item> GLOCK18_ITEM;
    public static final RegistryObject<Item> M1911A1_ITEM;
    public static final RegistryObject<Item> M4A1_ITEM;
    public static final RegistryObject<Item> M4A1MODI_TEM;
    public static final RegistryObject<Item> STAR15_ITEM;
    public static final RegistryObject<Item> M4SOPMODII_ITEM;
    public static final RegistryObject<Item> M16A1_ITEM;
    public static final RegistryObject<Item> SCARL_ITEM;
    public static final RegistryObject<Item> XM7_ITEM;
    public static final RegistryObject<Item> G36C_ITEM;
    public static final RegistryObject<Item> G36K_ITEM;
    public static final RegistryObject<Item> AUG_ITEM;
    public static final RegistryObject<Item> G41_ITEM;
    public static final RegistryObject<Item> AK47_ITEM;
    public static final RegistryObject<Item> AK74_ITEM;
    public static final RegistryObject<Item> AK12_ITEM;
    public static final RegistryObject<Item> MP5_ITEM;
    public static final RegistryObject<Item> MP7_ITEM;
    public static final RegistryObject<Item> MP7A2DEVGRU_ITEM;
    public static final RegistryObject<Item> UMP45_ITEM;
    public static final RegistryObject<Item> TMP_ITEM;
    public static final RegistryObject<Item> M950_ITEM;
    public static final RegistryObject<Item> SL8_ITEM;
    public static final RegistryObject<Item> MK14EBR_ITEM;
    public static final RegistryObject<Item> WA2000_ITEM;
    public static final RegistryObject<Item> XM3_ITEM;
    public static final RegistryObject<Item> C14_ITEM;
    public static final RegistryObject<Item> L96A1_ITEM;
    public static final RegistryObject<Item> GM6LYNX_ITEM;
    public static final RegistryObject<Item> M590_ITEM;
    public static final RegistryObject<Item> M870_ITEM;
    public static final RegistryObject<Item> SPAS12_ITEM;
    public static final RegistryObject<Item> M1014_ITEM;
    public static final RegistryObject<Item> AA12_ITEM;
    public static final RegistryObject<Item> CITORICXS_ITEM;
    public static final RegistryObject<Item> HS12_ITEM;
    public static final RegistryObject<Item> AUGHBAR_ITEM;
    public static final RegistryObject<Item> LAMG_ITEM;



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    static {
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VPBRecipeMod.MOD_ID);
        GLOCK17_ITEM = ITEMS.register("glock17_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        GLOCK18_ITEM = ITEMS.register("glock18_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        M1911A1_ITEM = ITEMS.register("m1911a1_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        M4A1_ITEM = ITEMS.register("m4a1_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        M4A1MODI_TEM = ITEMS.register("m4a1mod1_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        STAR15_ITEM = ITEMS.register("star15_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        M4SOPMODII_ITEM = ITEMS.register("m4sopmodii_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        M16A1_ITEM = ITEMS.register("m16a1_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        SCARL_ITEM = ITEMS.register("scarl_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        XM7_ITEM = ITEMS.register("xm7_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        G36C_ITEM = ITEMS.register("g36c_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        G36K_ITEM = ITEMS.register("g36k_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        AUG_ITEM = ITEMS.register("aug_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        G41_ITEM = ITEMS.register("g41_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        AK47_ITEM = ITEMS.register("ak47_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        AK74_ITEM = ITEMS.register("ak74_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        AK12_ITEM = ITEMS.register("ak12_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        MP5_ITEM = ITEMS.register("mp5_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        MP7_ITEM = ITEMS.register("mp7_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        MP7A2DEVGRU_ITEM = ITEMS.register("mp7a2devgru_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        UMP45_ITEM = ITEMS.register("ump45_item",() -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        TMP_ITEM = ITEMS.register("tmp_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        M950_ITEM = ITEMS.register("m950_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        SL8_ITEM = ITEMS.register("sl8_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        MK14EBR_ITEM = ITEMS.register("mk14ebr_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        WA2000_ITEM = ITEMS.register("wa2000_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        XM3_ITEM = ITEMS.register("xm3_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        C14_ITEM = ITEMS.register("c14_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        L96A1_ITEM = ITEMS.register("l96a1_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        GM6LYNX_ITEM = ITEMS.register("gm6lynx_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        M590_ITEM = ITEMS.register("m590_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        M870_ITEM = ITEMS.register("m870_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        SPAS12_ITEM = ITEMS.register("spas12_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        M1014_ITEM = ITEMS.register("m1014_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        AA12_ITEM = ITEMS.register("aa12_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        CITORICXS_ITEM = ITEMS.register("citoricxs_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        HS12_ITEM = ITEMS.register("hs12_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        AUGHBAR_ITEM = ITEMS.register("aughbar_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });
        LAMG_ITEM = ITEMS.register("lamg_item", () -> {
            return new Item(new Item.Properties().stacksTo(1));
        });



    }
}
