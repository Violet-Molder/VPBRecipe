package com.linweiyun.vpbrecipemod.recipetype;

import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VRecipeType {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, VPBRecipeMod.MOD_ID);


    public static final RegistryObject<RecipeSerializer<WeaponCraftingTableRecipeType>> WEAPON_CRAFTING_TABLE_RECIPE_TYPE =
            SERIALIZERS.register("weapon_crafting_table", () -> WeaponCraftingTableRecipeType.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
