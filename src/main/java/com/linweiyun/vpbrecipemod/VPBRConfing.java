package com.linweiyun.vpbrecipemod;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.commons.lang3.tuple.Pair;

public class VPBRConfing {
    public static final CommonConfig COMMON;

    public static class CommonConfig {
        public final ForgeConfigSpec.BooleanValue sendLoginMessage;

        CommonConfig(ForgeConfigSpec.Builder builder) {
            builder.comment("gen").push("common");
            sendLoginMessage = builder
                    .comment("是否在进入存档时发送消息")
                    .define("sendLoginMessage", true);
            builder.pop();
        }
    }

    static {
        final Pair<CommonConfig, ForgeConfigSpec> commonSpecPair = new ForgeConfigSpec.Builder().configure(CommonConfig::new);
        COMMON = commonSpecPair.getLeft();
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, commonSpecPair.getRight());
    }

    public static void register() {
    }
}
