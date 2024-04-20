package com.linweiyun.vpbrecipemod.item.WeaponBox;

import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class WeaponBox {
    public static final DeferredRegister<Item> WEAPON_BOX_ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, VPBRecipeMod.MOD_ID);
    public static final RegistryObject<Item> WEAPON_BOX = WEAPON_BOX_ITEM.register("pistol_weapon_box",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        WEAPON_BOX_ITEM.register(eventBus);
    }
}
