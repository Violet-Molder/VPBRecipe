package com.linweiyun.vpbrecipemod.block;

import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import com.linweiyun.vpbrecipemod.block.custom.WeaponCraftingTable;
import com.linweiyun.vpbrecipemod.init.VPBRRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class VPBRBlock extends Block {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, VPBRecipeMod.MOD_ID);

    public static final RegistryObject<Block> FIREARM_ASSEMBLY_STATION = VPBRRegistry.registerBlock("firearm_assembly_station",
            BLOCKS, () -> new VPBRBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .noOcclusion()
                    .strength(1f)));
    public static final RegistryObject<Block> AMMUNITION_ASSEMBLY_STATION = VPBRRegistry.registerBlock("ammunition_assembly_station",
            BLOCKS, () -> new VPBRBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .noOcclusion()
                    .strength(1f)));

    public static final RegistryObject<Block> WEAPON_CRAFTING_TABLE = VPBRRegistry.registerBlock("weapon_crafting_table",
            BLOCKS, () -> new WeaponCraftingTable(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)
                    .noOcclusion()
                    .strength(1f)));


    public VPBRBlock(BlockBehaviour.Properties pProperties) {
        super(pProperties);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(new Property[]{HorizontalDirectionalBlock.FACING});
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, context.getHorizontalDirection().getOpposite());
    }



    public static void reigster(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }

}
