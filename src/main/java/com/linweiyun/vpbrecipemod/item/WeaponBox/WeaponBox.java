package com.linweiyun.vpbrecipemod.item.WeaponBox;

import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class WeaponBox{
    public static final DeferredRegister<Item> WEAPON_BOX_ITEM = DeferredRegister.create(ForgeRegistries.ITEMS, VPBRecipeMod.MOD_ID);
    public static final RegistryObject<Item> PISTOL_WEAPON_BOX = WEAPON_BOX_ITEM.register("weapon_box_pistol",
            ()-> new PistolWeaponBox(new Item.Properties()));
    public static final RegistryObject<Item> SUB_GUN_WEAPON_BOX = WEAPON_BOX_ITEM.register("weapon_box_sub_gun",
            ()-> new SubGunWeaponBox(new Item.Properties()));
    public static final RegistryObject<Item> RIFLE_WEAPON_BOX = WEAPON_BOX_ITEM.register("weapon_box_rifle",
            ()-> new RifleWeaponBox(new Item.Properties()));
    public static final RegistryObject<Item> SNIPER_RIFLE_WEAPON_BOX = WEAPON_BOX_ITEM.register("weapon_box_sniper_rifle",
            ()-> new SniperRifleWeaponBox(new Item.Properties()));
    public static final RegistryObject<Item> SHOTGUN_WEAPON_BOX = WEAPON_BOX_ITEM.register("weapon_box_shotgun",
            ()-> new ShotgunWeaponBox(new Item.Properties()));
    public static final RegistryObject<Item> MACHINE_GUN_WEAPON_BOX = WEAPON_BOX_ITEM.register("weapon_box_machine_gun",
            ()-> new MachineGunWeaponBox(new Item.Properties()));
    public static final RegistryObject<Item> ROCKET_WEAPON_BOX = WEAPON_BOX_ITEM.register("weapon_box_rocket",
            ()-> new RocketWeaponBox(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        WEAPON_BOX_ITEM.register(eventBus);
    }
}
