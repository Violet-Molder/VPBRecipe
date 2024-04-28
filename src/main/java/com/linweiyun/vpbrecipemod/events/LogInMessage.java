package com.linweiyun.vpbrecipemod.events;

import com.linweiyun.vpbrecipemod.VPBRConfing;
import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.awt.*;

@Mod.EventBusSubscriber(modid = VPBRecipeMod.MOD_ID)
public class LogInMessage {

    @SubscribeEvent
    public static void LogInMessage(PlayerEvent.PlayerLoggedInEvent event){
        ServerPlayer player = (ServerPlayer) event.getEntity();
        VPBRConfing.CommonConfig config = VPBRConfing.COMMON;
        if (config.sendLoginMessage.get()){
            player.sendSystemMessage(
                    Component.literal("§c§l[VPB's Recipe]§f 欢迎使用VPB的配方，本Mod尚为开发版。"));
            player.sendSystemMessage(Component.literal("作者对枪械了解并不多，有任何意见或者建议，或对本MOD有疑惑的都可以进QQ群联系：892764506"));

        }

    }

}
