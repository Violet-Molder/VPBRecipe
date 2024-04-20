package com.linweiyun.vpbrecipemod.item.button;


import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import com.linweiyun.vpbrecipemod.screen.WeaponCraftingTbaleMenu;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WeaponBoxButtonMessage {

    // 按钮ID、坐标x、y、z作为类成员变量
    private final int buttonID;
    private boolean actionTriggered = false; // 新增布尔值

    // 构造函数，从FriendlyByteBuf中解码数据
    public WeaponBoxButtonMessage(FriendlyByteBuf buffer) {
        this.buttonID = buffer.readInt();
        this.actionTriggered = buffer.readBoolean();
    }

    // 构造函数，直接接收按钮ID和坐标值
    public WeaponBoxButtonMessage(int buttonID, boolean actionTriggered) {
        this.buttonID = buttonID;
        this.actionTriggered = actionTriggered;
    }

    // 封装方法，将消息数据编码到FriendlyByteBuf中
    public static void buffer(WeaponBoxButtonMessage message, FriendlyByteBuf buffer) {
        buffer.writeInt(message.buttonID);
        buffer.writeBoolean(message.actionTriggered);
    }

    // 处理消息的方法，注册到网络事件处理器中
    public static void handler(WeaponBoxButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();


        // 在工作线程中执行按钮操作
        context.enqueueWork(() -> {
            Player entity = context.getSender();
            int buttonID = message.buttonID;
            boolean actionTriggered = message.actionTriggered; // 从消息中获取布尔值

            WeaponCraftingTbaleMenu menu = (WeaponCraftingTbaleMenu) entity.containerMenu;
            //menu.onActionTriggered(actionTriggered); // 调用 PistolWeaponBoxMenu.onActionTriggered

            handleButtonAction(entity, buttonID);
        });

        // 标记消息已处理
        context.setPacketHandled(true);
    }



    // 具体的按钮动作处理逻辑，根据buttonID执行相应操作

    public static void handleButtonAction(Player entity, int buttonID) {
        Level world = entity.level();
            if (buttonID == 0) {
                    Minecraft.getInstance().player.closeContainer();
                ItemStack itemstack = entity.getItemInHand(InteractionHand.MAIN_HAND);
                itemstack.shrink(1);
                entity.setItemInHand(InteractionHand.MAIN_HAND, itemstack);
            }
        }


    // 注册消息事件的监听器
    @SubscribeEvent
    public static void registerMessage(FMLCommonSetupEvent event) {
        // 使用LycorisMod提供的addNetworkMessage方法注册消息
        VPBRecipeMod.addNetworkMessage(
                WeaponBoxButtonMessage.class, // 消息类
                WeaponBoxButtonMessage::buffer, // 编码器：将消息对象写入Buffer的方法
                WeaponBoxButtonMessage::new,   // 解码器：从Buffer创建消息对象的方法
                WeaponBoxButtonMessage::handler // 消息处理器：处理接收到的消息的方法
        );
    }



        }