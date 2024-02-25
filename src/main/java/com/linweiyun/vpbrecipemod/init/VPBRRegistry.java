//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.linweiyun.vpbrecipemod.init;

import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import com.linweiyun.vpbrecipemod.item.VPBROreItem;
import java.util.function.Supplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VPBRRegistry {
    public static final DeferredRegister<Item> ITEMS;

    public VPBRRegistry() {
    }

    public static <T extends Block> RegistryObject<T> registerFireproofBlock(String name, DeferredRegister<Block> RBlock, Supplier<T> block) {
        RegistryObject<T> blockObject = RBlock.register(name, block);
        registerFireproofBlcokItem(name, blockObject);
        return blockObject;
    }

    private static <T extends Block> RegistryObject<Item> registerFireproofBlcokItem(String name, RegistryObject<T> block) {
        return VPBROreItem.ITEMS.register(name, () -> {
            return new BlockItem((Block)block.get(), (new Item.Properties()).fireResistant());
        });
    }

    public static <T extends Block> RegistryObject<T> registerBlock(String name, DeferredRegister<Block> RBlock, Supplier<T> block) {
        RegistryObject<T> blockObject = RBlock.register(name, block);
        registerBlcokItem(name, blockObject);
        return blockObject;
    }

    private static <T extends Block> RegistryObject<Item> registerBlcokItem(String name, RegistryObject<T> block) {
        return VPBROreItem.ITEMS.register(name, () -> {
            return new BlockItem((Block)block.get(), new Item.Properties());
        });
    }

    static {
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VPBRecipeMod.MOD_ID);
    }
}
