package com.linweiyun.vpbrecipemod.item.inventory;


import com.linweiyun.vpbrecipemod.item.VPBRGunItem;
import com.linweiyun.vpbrecipemod.item.VPBRMaterial;
import com.linweiyun.vpbrecipemod.screen.WeaponCraftingTableScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@Mod.EventBusSubscriber(Dist.CLIENT)
public class WeaponBoxInventory implements ICapabilitySerializable<CompoundTag> {
    //订阅ItemTossEvent事件，也就是玩家丢弃该物品时触发的事件。
    //使用@OnlyIn（Dist.CLIENT）注解确保此方法仅在客户端执行。
    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void onItemDropped(ItemTossEvent event) {
        //检查被丢弃的物品是否是指定的物品
        if (event.getEntity().getItem().getItem() == VPBRGunItem.LAMG_ITEM.get()) {
            //如果当前打开的屏幕是指定的屏幕。则关闭该容器界面。
            if (Minecraft.getInstance().screen instanceof WeaponCraftingTableScreen) {
                Minecraft.getInstance().player.closeContainer();
            }
        }
    }

    // 使用LazyOptional包装一个ItemStackHandler实例，延迟初始化以提高性能。
    private final LazyOptional<ItemStackHandler> inventory = LazyOptional.of(this::createItemHandler);
    // 实现ICapabilitySerializable接口的方法，用于获取指定能力的实例。
    // 在这里，当请求ForgeCapabilities.ITEM_HANDLER能力时，返回封装的ItemStackHandler实例。
    @Override
    public <T> LazyOptional<T> getCapability(@Nonnull Capability<T> capability, @Nullable Direction side) {
        return capability == ForgeCapabilities.ITEM_HANDLER ? this.inventory.cast() : LazyOptional.empty();
    }


    // 实现ICapabilitySerializable接口的方法，将库存数据序列化为CompoundTag（NBT）格式。
    @Override
    public CompoundTag serializeNBT() {
        return getItemHandler().serializeNBT();
    }

    // 实现ICapabilitySerializable接口的方法，从CompoundTag（NBT）格式反序列化库存数据。
    @Override
    public void deserializeNBT(CompoundTag nbt) {
        getItemHandler().deserializeNBT(nbt);
    }

    // 创建并返回一个新的ItemStackHandler实例，用于管理库存。
    // 定义其容量为8个槽位，每个槽位最大堆叠数为64，且不允许存放指定的武器（LycorisModItems.WEAPON）。
    private ItemStackHandler createItemHandler() {
        return new ItemStackHandler(8) {

            @Override
            public int getSlotLimit(int slot) {
                return 64;
            }
            @Override
            public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
                return stack.getItem() != VPBRMaterial.GLOCK_17_GRIP.get();
            }
        };
    }

    // 获取实际的ItemStackHandler实例，若尚未初始化则抛出异常。
    private ItemStackHandler getItemHandler() {
        return inventory.orElseThrow(RuntimeException::new);
    }

}


