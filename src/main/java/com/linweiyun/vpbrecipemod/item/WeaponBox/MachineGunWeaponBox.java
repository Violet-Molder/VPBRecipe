package com.linweiyun.vpbrecipemod.item.WeaponBox;

import com.linweiyun.vpbrecipemod.item.VPBRGunItem;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Random;

public class MachineGunWeaponBox extends Item {

    public MachineGunWeaponBox(Properties pProperties) {
        super(pProperties);
    }
    Level level;
    Player player;

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        this.level = pLevel;
        this.player = pPlayer;
        // 获取玩家手中持有的PistolWeaponBox物品堆叠
        ItemStack weaponBoxStack = pPlayer.getItemInHand(pUsedHand);

        weaponBoxStack.shrink(1);
        pPlayer.setItemInHand(pUsedHand, weaponBoxStack);
        super.use(pLevel, pPlayer, pUsedHand);
        Random random = new Random();
        switch (random.nextInt(4) + 1){
            case 1:
                giveOriDropItem(new ItemStack(VPBRGunItem.AUGHBAR_ITEM.get()));
                break;
            case 2:
                giveOriDropItem(new ItemStack(VPBRGunItem.LAMG_ITEM.get()));
                break;
            case 3:
                giveOriDropItem(new ItemStack(VPBRGunItem.MK48_ITEM.get()));
                break;
            case 4:
                giveOriDropItem(new ItemStack(VPBRGunItem.M249_ITEM.get()));
                break;

        }

        return InteractionResultHolder.sidedSuccess(pPlayer.getItemInHand(pUsedHand), pLevel.isClientSide());
    }
    void giveOriDropItem(ItemStack stack){
        boolean canDrop = true;
        boolean canGive = true;
        for (int i = 0; i < player.getInventory().getContainerSize()-4; i++){//    -4是为了排除装备栏
            ItemStack itemStack = player.getInventory().getItem(i);
            if (itemStack.isEmpty() && canGive){
                player.getInventory().setItem(i,stack);
                canGive = false;
                canDrop = false;
            }
        }
        if (canDrop){
            ItemEntity entity = new ItemEntity(level, player.getX(), player.getY(), player.getZ(), stack);
            entity.setPickUpDelay(5);
            level.addFreshEntity(entity);
        }
   }
}
