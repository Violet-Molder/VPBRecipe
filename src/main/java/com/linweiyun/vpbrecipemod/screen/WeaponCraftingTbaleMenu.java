package com.linweiyun.vpbrecipemod.screen;

import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import com.linweiyun.vpbrecipemod.block.custom.blockeneity.WeaponCraftingTableEntity;
import com.linweiyun.vpbrecipemod.item.VPBRGunItem;
import com.linweiyun.vpbrecipemod.item.button.WeaponBoxButtonMessage;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ClickType;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class WeaponCraftingTbaleMenu extends AbstractContainerMenu {
    public final WeaponCraftingTableEntity entity;
    private final Level level;
    public static ItemStackHandler handler;



    //public void onActionTriggered(boolean triggered) {
    //    if (!world.isClientSide){
    //        this.actionTriggered = triggered;
    //        //如果需要立即执行相关逻辑，可以在这里添加
    //        ItemStack outputstack = WeaponCraftingTbaleMenu.getOutStack();
    //        // 新增：检查 outputstack 是否为 null
    //        if (outputstack == null) {
    //            // 可以在此处添加处理逻辑，如打印日志、忽略操作等
    //            return;
    //        }
    //        if (!outputstack.isEmpty()){
    //            boolean drop = true;
    //            for (int i = 0; i < entity.getInventory().getContainerSize()-5; i++) {
    //                ItemStack currentStack = entity.getInventory().getItem(i);
    //
    //                if (currentStack.isEmpty() && drop) {
    //                    entity.getInventory().setItem(i, outputstack.copy()); // 使用 copy() 防止原始堆栈被修改
    //                    drop = false;
    //
    //                    break; // 找到空槽位并添加，结束循环
    //                }
    //            }
    //            // 如果 outStack 仍有物品（表示背包已满），则将其作为掉落物添加到世界中
    //            if (drop) {
    //                ItemEntity itemEntity = new ItemEntity(world, entity.getX(), entity.getY(), entity.getZ(), getOutStack());
    //                itemEntity.setPickUpDelay(10); // 设置延迟拾取时间（可选）
    //                world.addFreshEntity(itemEntity);
    //            }
    //
    //        }
    //
    //    }
    //    VPBRecipeMod.PACKET_HANDLER.sendToServer(new WeaponBoxButtonMessage(0, false));
    //
    //    setOutStack();
    //    canCloseScreen = true;
    //    Minecraft.getInstance().player.closeContainer();
    //
    //}

    public WeaponCraftingTbaleMenu(int id, Inventory inventory, FriendlyByteBuf extraData)
    {
        this(id,inventory,inventory.player.level().getBlockEntity(extraData.readBlockPos()));
    }


    public WeaponCraftingTbaleMenu(int id, Inventory inventory, BlockEntity entity){

        super(VPBRGui.WEAPON_CRAFTING_TABLE_MENU.get(), id);
        this.entity = (WeaponCraftingTableEntity) entity;
        this.level = inventory.player.level();
        this.handler = this.entity.itemStackHandler;
        for (int a = 0; a<3; a++){
            for (int b = 0; b<3; b++){
                this.addSlot(new SlotItemHandler(handler,a*3+b,21+b*18,43+a*18));
            }
        }
        for (int a = 0; a < 4; a++){
            for (int b = 0; b < 4; b++){
                this.addSlot(new SlotItemHandler(handler,a*4+b+9,96+b*18,34+a*18)
                {
                    @Override
                    public boolean mayPlace(@NotNull ItemStack stack) {
                        return false;
                    }

                    @Override
                    public boolean mayPickup(Player playerIn) {
                        return false;
                    }
                });
            }
        }
        this.addSlot(new SlotItemHandler(handler,25,189,61));



        //this.internal.setStackInSlot(0, new ItemStack(VPBRGunItem.GLOCK17_ITEM.get()));
        //this.internal.setStackInSlot(1, new ItemStack(VPBRGunItem.GLOCK18_ITEM.get()));
        //this.internal.setStackInSlot(2, new ItemStack(VPBRGunItem.M1911A1_ITEM.get()));
        //this.internal.setStackInSlot(3, new ItemStack(VPBRGunItem.M1911A1_ITEM.get()));
        //this.internal.setStackInSlot(4, new ItemStack(VPBRGunItem.M1911A1_ITEM.get()));
        //this.internal.setStackInSlot(5, new ItemStack(VPBRGunItem.M1911A1_ITEM.get()));
        //this.internal.setStackInSlot(6, new ItemStack(VPBRGunItem.M1911A1_ITEM.get()));
        //ItemStack fixedItem = new ItemStack(Items.DIAMOND_SWORD); // 替换为您想要固定的物品


        for (int si = 0; si < 3; ++si)
            for (int sj = 0; sj < 9; ++sj)
                this.addSlot(new Slot(inventory, sj + (si + 1) * 9, 34 + sj * 18, 138 + si * 18){
                });
        for (int si = 0; si < 9; ++si)
            this.addSlot(new Slot(inventory, si, 34 + si * 18, 196){
            });
    }
    // 重写父类方法，判断GUI是否仍然有效（根据绑定状态）
    @Override
    public boolean stillValid(Player player) {
        return true;
    }

    @Override
    public ItemStack quickMoveStack(Player player, int i) {
        return null;
    }
}
