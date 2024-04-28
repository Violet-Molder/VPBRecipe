package com.linweiyun.vpbrecipemod.screen;

import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VPBRGui {
    public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, VPBRecipeMod.MOD_ID);
    public static final RegistryObject<MenuType<WeaponCraftingTbaleMenu>> WEAPON_CRAFTING_TABLE_MENU = REGISTRY.register("weapon_crafting_table_menu", () -> IForgeMenuType.create(WeaponCraftingTbaleMenu::new));

    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
}
