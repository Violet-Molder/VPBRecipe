//package com.linweiyun.vpbrecipemod.item.WeaponBox;
//
//import com.linweiyun.vpbrecipemod.item.inventory.WeaponBoxInventory;
//import com.linweiyun.vpbrecipemod.screen.WeaponCraftingTbaleMenu;
//import io.netty.buffer.Unpooled;
//import net.minecraft.nbt.CompoundTag;
//import net.minecraft.network.FriendlyByteBuf;
//import net.minecraft.network.chat.Component;
//import net.minecraft.server.level.ServerPlayer;
//import net.minecraft.world.InteractionHand;
//import net.minecraft.world.InteractionResultHolder;
//import net.minecraft.world.MenuProvider;
//import net.minecraft.world.entity.player.Inventory;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.inventory.AbstractContainerMenu;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.ItemStack;
//import net.minecraft.world.level.Level;
//import net.minecraftforge.common.capabilities.ForgeCapabilities;
//import net.minecraftforge.common.capabilities.ICapabilityProvider;
//import net.minecraftforge.items.ItemStackHandler;
//import net.minecraftforge.network.NetworkHooks;
//import org.jetbrains.annotations.Nullable;
//
//public class PistolWeaponBox extends Item{
//
//    public final ItemStackHandler itemStackHandler = new ItemStackHandler(8);
//
//    public PistolWeaponBox(Properties properties) {
//        super(properties);
//    }
//
//
//    @Override
//    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
//        super.use(pLevel, pPlayer, pUsedHand);
//        if (pPlayer instanceof ServerPlayer player){
//            NetworkHooks.openScreen(player, new MenuProvider(){
//                @Override
//                public Component getDisplayName() {
//                    return Component.literal("null");
//                }
//
//                @Nullable
//                @Override
//                public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
//                    return new WeaponCraftingTbaleMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()));
//                }
//            });
//
//        }
//        return InteractionResultHolder.success(pPlayer.getItemInHand(pUsedHand));
//    }
//
//
//    // 重写父类方法，为该武器物品初始化附加能力（Capability）
//    @Override
//    public @Nullable ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundTag nbt) {
//        return new WeaponBoxInventory();
//    }
//
//    // 重写父类方法，获取用于网络同步的共享标签（NBT数据）
//    @Override
//    public CompoundTag getShareTag(ItemStack stack) {
//        // 获取或创建物品堆栈的标签
//        CompoundTag nbt = stack.getOrCreateTag();
//
//        // 如果物品具有ITEM_HANDLER能力，将其库存数据写入标签
//        stack.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> nbt.put("Inventory", ((ItemStackHandler) capability).serializeNBT()));
//
//        // 返回带有库存数据的标签
//        return nbt;
//    }
//
//    // 重写父类方法，从网络同步的共享标签中读取数据
//    @Override
//    public void readShareTag(ItemStack stack, @Nullable CompoundTag nbt) {
//        // 首先调用父类方法完成基本数据读取
//        super.readShareTag(stack, nbt);
//
//        // 如果传入的标签不为空，且物品具有ITEM_HANDLER能力，从标签中反序列化库存数据
//        if (nbt != null)
//            stack.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> ((ItemStackHandler) capability).deserializeNBT((CompoundTag) nbt.get("Inventory")));
//    }
//
//
//}
