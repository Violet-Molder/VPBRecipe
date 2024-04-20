package com.linweiyun.vpbrecipemod.block.custom.blockeneity;

import com.linweiyun.vpbrecipemod.block.custom.WeaponCraftingTable;
import com.linweiyun.vpbrecipemod.item.WeaponBox.WeaponBox;
import com.linweiyun.vpbrecipemod.recipetype.WeaponCraftingTableRecipeType;
import com.linweiyun.vpbrecipemod.screen.WeaponCraftingTableScreen;
import com.linweiyun.vpbrecipemod.screen.WeaponCraftingTbaleMenu;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.Optional;

public class WeaponCraftingTableEntity extends BlockEntity implements MenuProvider, BlockEntityRenderer<WeaponCraftingTableEntity> {
    public WeaponCraftingTableEntity(BlockPos pPos, BlockState pBlockState) {
        super(VBlockEntity.WEAPON_CRAFTING_TABLE_ENTITY.get(),pPos, pBlockState);
    }

    public  final ItemStackHandler itemStackHandler = new ItemStackHandler(26){
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
    @Override
    public void render(WeaponCraftingTableEntity weaponCraftingTableEntity, float v, PoseStack poseStack, MultiBufferSource multiBufferSource, int i, int i1) {

    }








    @Override
    public Component getDisplayName() {
        return null;
    }

}
