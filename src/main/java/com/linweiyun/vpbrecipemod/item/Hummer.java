package com.linweiyun.vpbrecipemod.item;

import com.linweiyun.vpbrecipemod.block.VPBRBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;

public class Hummer extends Item {
    public Hummer(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Player player = pContext.getPlayer();
        if (!pContext.getLevel().isClientSide & player.isShiftKeyDown()){
            BlockPos pos = pContext.getClickedPos();//获取拿该物品右键的方块的位置
            BlockState state = pContext.getLevel().getBlockState(pos);
            if (state.is(Blocks.CRAFTING_TABLE)){
                pContext.getLevel().setBlock(pos,
                        VPBRBlock.FIREARM_ASSEMBLY_STATION.get().defaultBlockState().setValue(HorizontalDirectionalBlock.FACING,
                                player.getDirection().getOpposite()),1);
                return InteractionResult.SUCCESS;
            }
            if (state.is(VPBRBlock.FIREARM_ASSEMBLY_STATION.get())) {
                pContext.getLevel().setBlock(pos,
                        VPBRBlock.AMMUNITION_ASSEMBLY_STATION.get().defaultBlockState().setValue(HorizontalDirectionalBlock.FACING,
                                player.getDirection().getOpposite()),1);
                return InteractionResult.SUCCESS;
            }
            if (state.is(VPBRBlock.AMMUNITION_ASSEMBLY_STATION.get())) {
                pContext.getLevel().setBlock(pos,
                        Blocks.CRAFTING_TABLE.defaultBlockState(),1);
                return InteractionResult.SUCCESS;
            }

        }
        return InteractionResult.SUCCESS;
    }
}
