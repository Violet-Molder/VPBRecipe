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

public class RifleWeaponBox extends Item {

    public RifleWeaponBox(Properties pProperties) {
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
        switch (random.nextInt(15) + 1){
            case 1:
                giveOriDropItem(new ItemStack(VPBRGunItem.M4A1_ITEM.get()));
                break;
            case 2:
                giveOriDropItem(new ItemStack(VPBRGunItem.M4A1MODI_TEM.get()));
                break;
            case 3:
                giveOriDropItem(new ItemStack(VPBRGunItem.STAR15_ITEM.get()));
                break;
            case 4:
                giveOriDropItem(new ItemStack(VPBRGunItem.M4SOPMODII_ITEM.get()));
                break;
            case 5:
                giveOriDropItem(new ItemStack(VPBRGunItem.M16A1_ITEM.get()));
                break;
            case 6:
                giveOriDropItem(new ItemStack(VPBRGunItem.HK416_ITEM.get()));
                break;
            case 7:
                giveOriDropItem(new ItemStack(VPBRGunItem.SCARL_ITEM.get()));
                break;
            case 8:
                giveOriDropItem(new ItemStack(VPBRGunItem.XM7_ITEM.get()));
                break;
            case 9:
                giveOriDropItem(new ItemStack(VPBRGunItem.G36C_ITEM.get()));
                break;
            case 10:
                giveOriDropItem(new ItemStack(VPBRGunItem.G36K_ITEM.get()));
                break;
            case 11:
                giveOriDropItem(new ItemStack(VPBRGunItem.AUG_ITEM.get()));
                break;
            case 12:
                giveOriDropItem(new ItemStack(VPBRGunItem.G41_ITEM.get()));
                break;
            case 13:
                giveOriDropItem(new ItemStack(VPBRGunItem.AK47_ITEM.get()));
                break;
            case 14:
                giveOriDropItem(new ItemStack(VPBRGunItem.AK74_ITEM.get()));
                break;
            case 15:
                giveOriDropItem(new ItemStack(VPBRGunItem.AK12_ITEM.get()));
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
