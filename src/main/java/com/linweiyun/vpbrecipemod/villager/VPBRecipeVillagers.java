package com.linweiyun.vpbrecipemod.villager;

import com.google.common.collect.ImmutableSet;
import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import com.linweiyun.vpbrecipemod.block.VPBRBlock;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VPBRecipeVillagers {
    public static final DeferredRegister<VillagerProfession> PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, VPBRecipeMod.MOD_ID);
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, VPBRecipeMod.MOD_ID);

    public static final RegistryObject<PoiType> ARMS_DEALER_POI = POI_TYPES.register("arms_dealer_poi",
            () -> new PoiType(ImmutableSet.copyOf(VPBRBlock.FIREARM_ASSEMBLY_STATION.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<PoiType> AMMUNITION_DEALER_POI = POI_TYPES.register("ammunition_dealer_poi",
            () -> new PoiType(ImmutableSet.copyOf(VPBRBlock.AMMUNITION_ASSEMBLY_STATION.get().getStateDefinition().getPossibleStates()),
                    1, 1));
    public static final RegistryObject<VillagerProfession> ARMS_DEALER =
            PROFESSIONS.register("arms_dealer", () -> new VillagerProfession("arms_dealer",
                    holder -> holder.get() == ARMS_DEALER_POI.get(), holder -> holder.get() == ARMS_DEALER_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_WEAPONSMITH));

    public static final RegistryObject<VillagerProfession> AMMUNITION_DEALER =
            PROFESSIONS.register("ammunition_dealer", () -> new VillagerProfession("ammunition_dealer",
                    holder -> holder.get() == AMMUNITION_DEALER_POI.get(), holder -> holder.get() == AMMUNITION_DEALER_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_WEAPONSMITH));

    public static void register(IEventBus eventBus){
        PROFESSIONS.register(eventBus);
        POI_TYPES.register(eventBus);
    }
}
