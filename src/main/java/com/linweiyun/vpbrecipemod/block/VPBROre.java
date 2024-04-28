//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.linweiyun.vpbrecipemod.block;

import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import com.linweiyun.vpbrecipemod.init.VPBRRegistry;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VPBROre {


    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, VPBRecipeMod.MOD_ID);
    public static final RegistryObject<Block> ZINC_ORE = VPBRRegistry.registerBlock("zinc_ore", REGISTRY, () -> {
        return new DropExperienceBlock(Properties.copy(Blocks.STONE)
                .requiresCorrectToolForDrops()
                .strength(6.0F),
                UniformInt.of(1, 7)
        );
    });
    public static final RegistryObject<Block> DEEPSLATE_ZINC_ORE = VPBRRegistry.registerBlock("deepslate_zinc_ore", REGISTRY, () -> {
        return new DropExperienceBlock(Properties.copy(Blocks.STONE)
                .requiresCorrectToolForDrops()
                .strength(10.0F)
                , UniformInt.of(1, 7)
        );
    });
    public static final RegistryObject<Block> ALUMINIUM_ORE = VPBRRegistry.registerBlock("aluminium_ore", REGISTRY, () -> {
        return new DropExperienceBlock(Properties.copy(Blocks.STONE)
                .requiresCorrectToolForDrops()
                .strength(6.0F)
                , UniformInt.of(1, 7)
        );
    });
    public static final RegistryObject<Block> DEEPSLATE_ALUMINIUM_ORE = VPBRRegistry.registerBlock("deepslate_aluminium_ore", REGISTRY, () -> {
        return new DropExperienceBlock(Properties.copy(Blocks.STONE)
                .requiresCorrectToolForDrops()
                .strength(10.0F)
                , UniformInt.of(1, 7)
        );
    });

    public static final RegistryObject<Block> SALTPETER_ORE = VPBRRegistry.registerBlock("saltpeter_ore", REGISTRY, () -> {
        return new DropExperienceBlock(Properties.copy(Blocks.STONE)
                .requiresCorrectToolForDrops()
                .strength(6.0F)
                , UniformInt.of(1, 7)
        );
    });
    public static final RegistryObject<Block> DEEPSLATE_SALTPETER_ORE = VPBRRegistry.registerBlock("deepslate_saltpeter_ore", REGISTRY, () -> {
        return new DropExperienceBlock(Properties.copy(Blocks.STONE)
                .requiresCorrectToolForDrops()
                .strength(10.0F)
                , UniformInt.of(1, 7)
        );
    });

    public static final RegistryObject<Block> SULFUR_ORE = VPBRRegistry.registerBlock("sulfur_ore", REGISTRY, () -> {
        return new DropExperienceBlock(Properties.copy(Blocks.STONE)
                .requiresCorrectToolForDrops()
                .strength(6.0F)
                , UniformInt.of(1, 7)
        );
    });
    public static final RegistryObject<Block> DEEPSLATE_SULFUR_ORE = VPBRRegistry.registerBlock("deepslate_sulfur_ore", REGISTRY, () -> {
        return new DropExperienceBlock(Properties.copy(Blocks.STONE)
                .requiresCorrectToolForDrops()
                .strength(10.0F)
                , UniformInt.of(1, 7)
        );
    });

    public static final RegistryObject<Block> OIL_SHALE_ORE = VPBRRegistry.registerBlock("oil_shale_ore", REGISTRY, () -> {
        return new DropExperienceBlock(Properties.copy(Blocks.STONE)
                .requiresCorrectToolForDrops()
                .strength(6.0F)
                , UniformInt.of(1, 7)
        );
    });



    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
}

