package com.linweiyun.vpbrecipemod.screen;

import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import com.linweiyun.vpbrecipemod.block.custom.blockeneity.WeaponCraftingTableEntity;
import com.linweiyun.vpbrecipemod.item.VPBRGunItem;
import com.linweiyun.vpbrecipemod.item.button.WeaponBoxButtonMessage;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.SimpleContainer;
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



    public WeaponCraftingTbaleMenu(int id, Inventory inventory, FriendlyByteBuf extraData)
    {
        this(id,inventory,inventory.player.level().getBlockEntity(extraData.readBlockPos()));
    }


    public WeaponCraftingTbaleMenu(int id, Inventory inventory, BlockEntity entity){

        super(VPBRGui.WEAPON_CRAFTING_TABLE_MENU.get(), id);
        this.entity = (WeaponCraftingTableEntity) entity;
        this.level = inventory.player.level();
        this.handler = this.entity.itemStackHandler;

        addPlayerInventory(inventory);
        addPlayerHotbar(inventory);

        this.entity.getCapability(ForgeCapabilities.ITEM_HANDLER).ifPresent(handler -> {
            this.addSlot(new SlotItemHandler(handler,0,34,60));
            for (int a = 0; a < 4; a++){
                for (int b = 0; b < 4; b++){
                    this.addSlot(new SlotItemHandler(handler,a*4+b + 1,79+b*18,33+a*18)
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
            this.addSlot(new SlotItemHandler(handler,17,178,60){
                @Override
                public boolean mayPlace(@NotNull ItemStack stack) {
                    return false;
                }
            });
        });

        //for (int a = 0; a < 4; a++){
        //    for (int b = 0; b < 4; b++){
        //        this.addSlot(new SlotItemHandler(handler,a*4+b + 1,79+b*18,33+a*18)
        //        {
        //            @Override
        //            public boolean mayPlace(@NotNull ItemStack stack) {
        //                return false;
        //            }
        //
        //            @Override
        //            public boolean mayPickup(Player playerIn) {
        //                return false;
        //            }
        //        });
        //    }
        //}




        //this.internal.setStackInSlot(0, new ItemStack(VPBRGunItem.GLOCK17_ITEM.get()));

    }

    private void addPlayerInventory(Inventory playerInventory){
        for (int i=0;i<3;i++){
            for (int l =0;l<9;l++){
                this.addSlot(new Slot(playerInventory,l+i*9+9,34+l*18,138+i*18));
            }
        }
    }
    private void addPlayerHotbar(Inventory playerInventory){
        for(int i=0;i<9;i++){
            this.addSlot(new Slot(playerInventory,i,34+i*18,196));
        }
    }

    @Override
    public void clicked(int pSlotId, int pButton, ClickType pClickType, Player pPlayer) {
        super.clicked(pSlotId, pButton, pClickType, pPlayer);
        System.out.println("pSlotID"+pSlotId);
        System.out.println("slots"+entity.itemStackHandler.getSlots());

        if (36 < pSlotId && pSlotId < 53){
            ItemStack stack = getItems().get(pSlotId);
            entity.itemStackHandler.setStackInSlot(17, stack);
        }
        if (53 == pSlotId){
            entity.itemStackHandler.setStackInSlot(0, new ItemStack(entity.itemStackHandler.getStackInSlot(0).getItem(),
                    entity.itemStackHandler.getStackInSlot(0).getCount() - 1));
        }
    }

    // 重写父类方法，判断GUI是否仍然有效（根据绑定状态）
    @Override
    public boolean stillValid(Player player) {
        return true;
    }

    private static final int HOTBAR_SLOT_COUNT = 9;
    private static final int PLAYER_INVENTORY_ROW_COUNT = 3;
    private static final int PLAYER_INVENTORY_COLUMN_COUNT = 9;
    private static final int PLAYER_INVENTORY_SLOT_COUNT = PLAYER_INVENTORY_COLUMN_COUNT * PLAYER_INVENTORY_ROW_COUNT;
    private static final int VANILLA_SLOT_COUNT = HOTBAR_SLOT_COUNT + PLAYER_INVENTORY_SLOT_COUNT;
    private static final int VANILLA_FIRST_SLOT_INDEX = 0;
    private static final int TE_INVENTORY_FIRST_SLOT_INDEX = VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT;

    // THIS YOU HAVE TO DEFINE!
    private static final int TE_INVENTORY_SLOT_COUNT = 18;  // must be the number of slots you have!容器的槽位数量

    @Override
    public ItemStack quickMoveStack(Player playerIn, int index) {
        Slot sourceSlot = slots.get(index);
        if (sourceSlot == null || !sourceSlot.hasItem()) return ItemStack.EMPTY;  //EMPTY_ITEM
        ItemStack sourceStack = sourceSlot.getItem();
        ItemStack copyOfSourceStack = sourceStack.copy();

        // Check if the slot clicked is one of the vanilla container slots
        if (index < VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT) {
            // This is a vanilla container slot so merge the stack into the tile inventory
            if (!moveItemStackTo(sourceStack, TE_INVENTORY_FIRST_SLOT_INDEX, TE_INVENTORY_FIRST_SLOT_INDEX
                    + TE_INVENTORY_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;  // EMPTY_ITEM
            }
        } else if (index < TE_INVENTORY_FIRST_SLOT_INDEX + TE_INVENTORY_SLOT_COUNT) {
            // This is a TE slot so merge the stack into the players inventory
            if (!moveItemStackTo(sourceStack, VANILLA_FIRST_SLOT_INDEX, VANILLA_FIRST_SLOT_INDEX + VANILLA_SLOT_COUNT, false)) {
                return ItemStack.EMPTY;
            }
        } else {
            System.out.println("Invalid slotIndex:" + index);
            return ItemStack.EMPTY;
        }
        // If stack size == 0 (the entire stack was moved) set slot contents to null
        if (sourceStack.getCount() == 0) {
            sourceSlot.set(ItemStack.EMPTY);
        } else {
            sourceSlot.setChanged();
        }
        sourceSlot.onTake(playerIn, sourceStack);
        return copyOfSourceStack;
    }

}
