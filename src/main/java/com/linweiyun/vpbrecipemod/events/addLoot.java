package com.linweiyun.vpbrecipemod.events;


import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.entries.LootTableReference;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = VPBRecipeMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class addLoot {

    @SubscribeEvent
    public static void lootLoad(LootTableLoadEvent evt) {
        String prefix = "minecraft:chests/";
        String name = evt.getName().toString();


        if (name.startsWith(prefix)) {
            String file = name.substring(name.indexOf(prefix) + prefix.length());
            switch (file) {
                case "abandoned_mineshaft":
                case "desert_pyramid":
                case "jungle_temple":
                case "simple_dungeon":
                case "stronghold_crossing":
                case "stronghold_library":
                case "ancient_city":
                case "stronghold_corridor": evt.getTable().addPool(getInjectPool(file)); break;
                default: break;
            }
        }

    }


    public static LootPool getInjectPool(String entryName) {
        return LootPool.lootPool()
                .add(getInjectEntry(entryName))
                .name("lootbagmod_inject")
                .build();
    }

    @SuppressWarnings("rawtypes")
    private static LootPoolEntryContainer.Builder getInjectEntry(String name) {
        ResourceLocation table = new ResourceLocation(VPBRecipeMod.MOD_ID, "chests/" + name);
        return LootTableReference.lootTableReference(table);
    }

}
