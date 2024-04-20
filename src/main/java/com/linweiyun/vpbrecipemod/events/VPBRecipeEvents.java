package com.linweiyun.vpbrecipemod.events;


import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import com.linweiyun.vpbrecipemod.block.VPBROre;
import com.linweiyun.vpbrecipemod.item.VPBRGunItem;
import com.linweiyun.vpbrecipemod.item.VPBRMaterial;
import com.linweiyun.vpbrecipemod.item.VPBROreItem;
import com.linweiyun.vpbrecipemod.villager.VPBRecipeVillagers;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.network.NetworkHooks;

import java.util.List;

@Mod.EventBusSubscriber(modid = VPBRecipeMod.MOD_ID)
public class VPBRecipeEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() == VPBRecipeVillagers.ARMS_DEALER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get(), 5),
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 2),
                    new ItemStack(VPBRGunItem.GLOCK17_ITEM.get(), 1),
                    4, 5, 0.01F));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get(), 6),
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 4),
                    new ItemStack(VPBRGunItem.GLOCK18_ITEM.get(), 1),
                    4, 5, 0.01F));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROre.INDUSTRIAL_PLANKS.get(), 4),
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 5),
                    new ItemStack(VPBRGunItem.M1911A1_ITEM.get(), 1),
                    4, 5, 0.01F));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.ZINC_INGOT.get(), 3),
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 8),
                    new ItemStack(VPBRGunItem.M4A1_ITEM.get(), 1),
                    4, 5, 0.01F));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.BRASS_INGOT.get(), 1),
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 9),
                    new ItemStack(VPBRGunItem.M4A1MODI_TEM.get(), 1),
                    4, 30, 0.01F));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get(), 5),
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 8),
                    new ItemStack(VPBRGunItem.STAR15_ITEM.get(), 1),
                    4, 30, 0.01F));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.ALUMINIUM_INGOT.get(), 3),
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 9),
                    new ItemStack(VPBRGunItem.M4SOPMODII_ITEM.get(), 1),
                    4, 30, 0.01F));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get(), 3),
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 8),
                    new ItemStack(VPBRGunItem.M16A1_ITEM.get(), 1),
                    4, 30, 0.01F));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.ALUMINIUM_INGOT.get(), 4),
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 9),
                    new ItemStack(VPBRGunItem.M4SOPMODII_ITEM.get(), 1),
                    4, 40, 0.01F));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROre.INDUSTRIAL_PLANKS.get(), 6),
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 8),
                    new ItemStack(VPBRGunItem.XM7_ITEM.get(), 1),
                    4, 40, 0.01F));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get(), 3),
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 7),
                    new ItemStack(VPBRGunItem.G36C_ITEM.get(), 1),
                    4, 40, 0.01F));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get(), 5),
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 8),
                    new ItemStack(VPBRGunItem.G36K_ITEM.get(), 1),
                    4, 40, 0.01F));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get(), 16),
                    new ItemStack(VPBROre.INDUSTRIAL_PLANKS.get(), 6),
                    new ItemStack(VPBRGunItem.AUG_ITEM.get(), 1),
                    4, 50, 0.01F));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 8),
                    new ItemStack(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get(), 3),
                    new ItemStack(VPBRGunItem.G41_ITEM.get(), 1),
                    4, 50, 0.01F));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 10),
                    new ItemStack(VPBROre.INDUSTRIAL_PLANKS.get(), 4),
                    new ItemStack(VPBRGunItem.AK47_ITEM.get(), 1),
                    4, 50, 0.01F));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 8),
                    new ItemStack(VPBROre.INDUSTRIAL_PLANKS.get(), 4),
                    new ItemStack(VPBRGunItem.AK74_ITEM.get(), 1),
                    4, 50, 0.01F));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 10),
                    new ItemStack(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get(), 4),
                    new ItemStack(VPBRGunItem.AK12_ITEM.get(), 1),
                    4, 50, 0.01F));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 8),
                    new ItemStack(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get(), 5),
                    new ItemStack(VPBRGunItem.MP5_ITEM.get(), 1),
                    4, 50, 0.01F));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 6),
                    new ItemStack(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get(), 4),
                    new ItemStack(VPBRGunItem.MP7_ITEM.get(), 1),
                    4, 50, 0.01F));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 7),
                    new ItemStack(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get(), 4),
                    new ItemStack(VPBRGunItem.MP7A2DEVGRU_ITEM.get(), 1),
                    4, 50, 0.01F));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 3),
                    new ItemStack(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get(), 10),
                    new ItemStack(VPBRGunItem.UMP45_ITEM.get(), 1),
                    4, 50, 0.01F));
        }
    }

    @SubscribeEvent
    public static void addCustomTradesII(VillagerTradesEvent event) {
        if (event.getType() == VPBRecipeVillagers.AMMUNITION_DEALER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get(), 10),
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 3),
                    new ItemStack(VPBRGunItem.TMP_ITEM.get(), 1),
                    4, 5, 0.01F));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get(), 6),
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 6),
                    new ItemStack(VPBRGunItem.M950_ITEM.get(), 1),
                    4, 5, 0.01F));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get(), 15),
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 5),
                    new ItemStack(VPBRGunItem.SL8_ITEM.get(), 1),
                    4, 5, 0.01F));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get(), 12),
                    new ItemStack(VPBROreItem.ZINC_INGOT.get(), 8),
                    new ItemStack(VPBRGunItem.MK14EBR_ITEM.get(), 1),
                    4, 5, 0.01F));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROre.INDUSTRIAL_PLANKS.get(), 16),
                    new ItemStack(VPBROreItem.ALUMINIUM_INGOT.get(), 12),
                    new ItemStack(VPBRGunItem.WA2000_ITEM.get(), 1),
                    4, 5, 0.01F));


            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get(), 8),
                    new ItemStack(VPBROreItem.ZINC_INGOT.get(), 12),
                    new ItemStack(VPBRGunItem.XM3_ITEM.get(), 1),
                    4, 30, 0.01F));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get(), 6),
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 12),
                    new ItemStack(VPBRGunItem.C14_ITEM.get(), 1),
                    4, 30, 0.01F));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.ALUMINIUM_INGOT.get(), 6),
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 12),
                    new ItemStack(VPBRGunItem.L96A1_ITEM.get(), 1),
                    4, 30, 0.01F));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.ALUMINIUM_INGOT.get(), 8),
                    new ItemStack(VPBROreItem.ZINC_INGOT.get(), 8),
                    new ItemStack(VPBRGunItem.GM6LYNX_ITEM.get(), 1),
                    4, 30, 0.01F));


            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROre.INDUSTRIAL_PLANKS.get(), 8),
                    new ItemStack(VPBROreItem.ZINC_INGOT.get(), 8),
                    new ItemStack(VPBRGunItem.M590_ITEM.get(), 1),
                    4, 40, 0.01F));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.ALUMINIUM_INGOT.get(), 12),
                    new ItemStack(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get(), 10),
                    new ItemStack(VPBRGunItem.M870_ITEM.get(), 1),
                    4, 40, 0.01F));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 9),
                    new ItemStack(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get(), 9),
                    new ItemStack(VPBRGunItem.SPAS12_ITEM.get(), 1),
                    4, 40, 0.01F));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 14),
                    new ItemStack(VPBROreItem.ALUMINIUM_INGOT.get(), 6),
                    new ItemStack(VPBRGunItem.M1014_ITEM.get(), 1),
                    4, 50, 0.01F));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 20),
                    new ItemStack(VPBROreItem.ZINC_INGOT.get(), 4),
                    new ItemStack(VPBRGunItem.AA12_ITEM.get(), 1),
                    4, 50, 0.01F));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 12),
                    new ItemStack(VPBROre.INDUSTRIAL_PLANKS.get(), 8),
                    new ItemStack(VPBRGunItem.CITORICXS_ITEM.get(), 1),
                    4, 50, 0.01F));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.STEEL_INGOT.get(), 10),
                    new ItemStack(VPBROreItem.ALUMINIUM_INGOT.get(), 8),
                    new ItemStack(VPBRGunItem.CITORICXS_ITEM.get(), 1),
                    4, 50, 0.01F));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get(), 18),
                    new ItemStack(VPBROreItem.ALUMINIUM_INGOT.get(), 4),
                    new ItemStack(VPBRGunItem.AUGHBAR_ITEM.get(), 1),
                    4, 50, 0.01F));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(VPBROreItem.ENGINEERING_PLASTIC_BOARD.get(), 8),
                    new ItemStack(VPBROreItem.ALUMINIUM_INGOT.get(), 22),
                    new ItemStack(VPBRGunItem.LAMG_ITEM.get(), 1),
                    4, 50, 0.01F));

        }
    }
}
