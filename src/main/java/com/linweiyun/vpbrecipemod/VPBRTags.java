package com.linweiyun.vpbrecipemod;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class VPBRTags {
    public static class Items {
        public static final TagKey<Item> STEEL_INGOTS = tag("ingots/steel");
        public static final TagKey<Item> ALUMINIUM_INGOTS = tag("ingots/aluminium");
        public static final TagKey<Item> ZINC_INGOTS = tag("ingots/zinc");
        public static final TagKey<Item> BRASS_INGOTS = tag("ingots/brass");


        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Blocks {




        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
