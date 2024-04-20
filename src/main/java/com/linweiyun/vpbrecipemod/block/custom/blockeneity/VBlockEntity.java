package com.linweiyun.vpbrecipemod.block.custom.blockeneity;

import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import com.linweiyun.vpbrecipemod.block.VPBRBlock;
import com.linweiyun.vpbrecipemod.block.custom.WeaponCraftingTable;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VBlockEntity {
    public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, VPBRecipeMod.MOD_ID);
    public static final RegistryObject<BlockEntityType<WeaponCraftingTableEntity>> WEAPON_CRAFTING_TABLE_ENTITY =
            REGISTRY.register("weapon_crafting_table_entity",
                    ()->BlockEntityType.Builder.of(WeaponCraftingTableEntity::new,
                            VPBRBlock.WEAPON_CRAFTING_TABLE.get()).build(null));
    public static void register(IEventBus eventBus)
    {
        REGISTRY.register(eventBus);
    }
}
