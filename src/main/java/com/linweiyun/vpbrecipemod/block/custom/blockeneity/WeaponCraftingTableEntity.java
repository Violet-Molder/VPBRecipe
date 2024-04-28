package com.linweiyun.vpbrecipemod.block.custom.blockeneity;

import com.linweiyun.vpbrecipemod.item.VPBRGunItem;
import com.linweiyun.vpbrecipemod.item.WeaponBox.WeaponBox;
import com.linweiyun.vpbrecipemod.screen.WeaponCraftingTbaleMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class WeaponCraftingTableEntity extends BlockEntity implements MenuProvider {
    public WeaponCraftingTableEntity(BlockPos pPos, BlockState pBlockState) {
        super(VBlockEntity.WEAPON_CRAFTING_TABLE_ENTITY.get(),pPos, pBlockState);
    }

    public  final ItemStackHandler itemStackHandler = new ItemStackHandler(19){
        // 当槽位的内容改变时候，设置改变
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();

        }
    };
    private LazyOptional<IItemHandler> lazyItemHandler = LazyOptional.empty();

    @Override
    public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
        return new WeaponCraftingTbaleMenu(id, inventory, this);
    }



    // 读取实体的数据
    // 重写了BlockEntity中的getCapability的方法，
    // 提供对lazyItemHandler的访问
    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> cap, @Nullable Direction side) {
        if(cap == ForgeCapabilities.ITEM_HANDLER){
            return lazyItemHandler.cast();
        }
        return super.getCapability(cap, side);
    }

    // 在onload阶段，加载lazyItemHandler
    @Override
    public void onLoad() {
        super.onLoad();
        lazyItemHandler = LazyOptional.of(()->itemStackHandler);
    }

    // 重写了BlockEntity中的invalidateCaps方法。
    // 在卸载实体方块时候将layItemHandler变量无效
    @Override
    public void invalidateCaps() {
        super.invalidateCaps();
        lazyItemHandler.invalidate();
    }
    // 存储实体的数据
    @Override
    protected void saveAdditional(CompoundTag nbt) {
        nbt.put("inventory",itemStackHandler.serializeNBT());
        super.saveAdditional(nbt);
    }

    // 读取实体的数据
    @Override
    public void load(CompoundTag nbt) {
        super.load(nbt);
        itemStackHandler.deserializeNBT(nbt.getCompound("inventory"));
    }

    public static void tick(Level level,  BlockPos blockPos, BlockState state, WeaponCraftingTableEntity entity) {
        if (level.isClientSide){
            return;
        }
        //  仅仅在服务器端运行
        // 判断是否能够合成
        craft(entity);
    }



    private static void craft(WeaponCraftingTableEntity entity){
        if (entity.itemStackHandler.getStackInSlot(0).isEmpty()){
            clearItemStack(entity);
        }
        Item item = entity.itemStackHandler.getStackInSlot(0).getItem();
        if (item == WeaponBox.PISTOL_WEAPON_BOX.get()){
            setItemStack(1, new ItemStack(VPBRGunItem.GLOCK17_ITEM.get()), entity);
            setItemStack(2, new ItemStack(VPBRGunItem.GLOCK18_ITEM.get()), entity);
            setItemStack(3, new ItemStack(VPBRGunItem.M9_ITEM.get()), entity);
            setItemStack(4, new ItemStack(VPBRGunItem.M1911A1_ITEM.get()), entity);
            setItemStack(5, new ItemStack(VPBRGunItem.TTI_VIPER_ITEM.get()), entity);
            setItemStack(6, new ItemStack(VPBRGunItem.P30L_ITEM.get()), entity);
            setItemStack(7, new ItemStack(VPBRGunItem.RHINO_ITEM.get()), entity);
        }
        else if (item == WeaponBox.SUB_GUN_WEAPON_BOX.get()){
            setItemStack(1, new ItemStack(VPBRGunItem.MP5_ITEM.get()), entity);
            setItemStack(2, new ItemStack(VPBRGunItem.MP7_ITEM.get()), entity);
            setItemStack(3, new ItemStack(VPBRGunItem.MP7A2DEVGRU_ITEM.get()), entity);
            setItemStack(4, new ItemStack(VPBRGunItem.UMP45_ITEM.get()), entity);
            setItemStack(5, new ItemStack(VPBRGunItem.M950_ITEM.get()), entity);
            setItemStack(6, new ItemStack(VPBRGunItem.TMP_ITEM.get()), entity);
        }
        else if (item == WeaponBox.RIFLE_WEAPON_BOX.get()){
            setItemStack(1, new ItemStack(VPBRGunItem.M4A1_ITEM.get()), entity);
            setItemStack(2, new ItemStack(VPBRGunItem.M4A1MODI_TEM.get()), entity);
            setItemStack(3, new ItemStack(VPBRGunItem.STAR15_ITEM.get()), entity);
            setItemStack(4, new ItemStack(VPBRGunItem.M4SOPMODII_ITEM.get()), entity);
            setItemStack(5, new ItemStack(VPBRGunItem.M16A1_ITEM.get()), entity);
            setItemStack(6, new ItemStack(VPBRGunItem.HK416_ITEM.get()), entity);
            setItemStack(7, new ItemStack(VPBRGunItem.SCARL_ITEM.get()), entity);
            setItemStack(8, new ItemStack(VPBRGunItem.XM7_ITEM.get()), entity);
            setItemStack(9, new ItemStack(VPBRGunItem.G36C_ITEM.get()), entity);
            setItemStack(10, new ItemStack(VPBRGunItem.G36K_ITEM.get()), entity);
            setItemStack(11, new ItemStack(VPBRGunItem.AUG_ITEM.get()), entity);
            setItemStack(12, new ItemStack(VPBRGunItem.G41_ITEM.get()), entity);
            setItemStack(13, new ItemStack(VPBRGunItem.AK47_ITEM.get()), entity);
            setItemStack(14, new ItemStack(VPBRGunItem.AK74_ITEM.get()), entity);
            setItemStack(15, new ItemStack(VPBRGunItem.AK12_ITEM.get()), entity);
        }
        else if (item == WeaponBox.SNIPER_RIFLE_WEAPON_BOX.get()){
            setItemStack(1, new ItemStack(VPBRGunItem.SL8_ITEM.get()), entity);
            setItemStack(2, new ItemStack(VPBRGunItem.MK14EBR_ITEM.get()), entity);
            setItemStack(3, new ItemStack(VPBRGunItem.UAR10_ITEM.get()), entity);
            setItemStack(4, new ItemStack(VPBRGunItem.WA2000_ITEM.get()), entity);
            setItemStack(5, new ItemStack(VPBRGunItem.XM3_ITEM.get()), entity);
            setItemStack(6, new ItemStack(VPBRGunItem.C14_ITEM.get()), entity);
            setItemStack(7, new ItemStack(VPBRGunItem.L96A1_ITEM.get()), entity);
            setItemStack(8, new ItemStack(VPBRGunItem.GM6LYNX_ITEM.get()), entity);
        }
        else if (item == WeaponBox.SHOTGUN_WEAPON_BOX.get()){
            setItemStack(1, new ItemStack(VPBRGunItem.M590_ITEM.get()), entity);
            setItemStack(2, new ItemStack(VPBRGunItem.M870_ITEM.get()), entity);
            setItemStack(3, new ItemStack(VPBRGunItem.SPAS12_ITEM.get()), entity);
            setItemStack(4, new ItemStack(VPBRGunItem.M1014_ITEM.get()), entity);
            setItemStack(5, new ItemStack(VPBRGunItem.AA12_ITEM.get()), entity);
            setItemStack(6, new ItemStack(VPBRGunItem.CITORICXS_ITEM.get()), entity);
            setItemStack(7, new ItemStack(VPBRGunItem.HS12_ITEM.get()), entity);
        }
        else if (item == WeaponBox.MACHINE_GUN_WEAPON_BOX.get()){
            setItemStack(1, new ItemStack(VPBRGunItem.AUGHBAR_ITEM.get()), entity);
            setItemStack(2, new ItemStack(VPBRGunItem.LAMG_ITEM.get()), entity);
            setItemStack(3, new ItemStack(VPBRGunItem.MK48_ITEM.get()), entity);
            setItemStack(4, new ItemStack(VPBRGunItem.M249_ITEM.get()), entity);

        }
        else if (item == WeaponBox.ROCKET_WEAPON_BOX.get()){
            setItemStack(1, new ItemStack(VPBRGunItem.M32MGL_ITEM.get()), entity);
            setItemStack(2, new ItemStack(VPBRGunItem.SMAW_ITEM.get()), entity);
            setItemStack(3, new ItemStack(VPBRGunItem.AT4_ITEM.get()), entity);
            setItemStack(4, new ItemStack(VPBRGunItem.JAVELIN_ITEM.get()), entity);
            setItemStack(5, new ItemStack(VPBRGunItem.M134MINIGUN_ITEM.get()), entity);
        }

    }



    private static void clearItemStack(WeaponCraftingTableEntity entity){
        for (int i = 1; i < 18; i++){
            entity.itemStackHandler.setStackInSlot(i, ItemStack.EMPTY);
        }
    }
    private static void setItemStack(int slot, ItemStack itemStack ,WeaponCraftingTableEntity entity){
        entity.itemStackHandler.setStackInSlot(slot, itemStack);
    }


    @Override
    public Component getDisplayName() {
        return Component.translatable("block.vpbrecipemod.weapon_crafting_table");
    }
}
