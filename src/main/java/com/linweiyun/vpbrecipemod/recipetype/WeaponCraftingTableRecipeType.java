package com.linweiyun.vpbrecipemod.recipetype;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import com.linweiyun.vpbrecipemod.block.VPBRBlock;
import it.unimi.dsi.fastutil.ints.IntList;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.StackedContents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

// recipe类仅描述了配方数据和执行逻辑，
// 通过container子类提供数据
// 任何输入的Container都应该是不可变的，任何的操作都应该通过copy输入副本。

public class WeaponCraftingTableRecipeType implements Recipe<SimpleContainer> {
    private final ResourceLocation id;
    private final ItemStack output;
    private final NonNullList<Ingredient> recipeItems;
    public WeaponCraftingTableRecipeType(ResourceLocation id, ItemStack output,
                                         NonNullList<Ingredient> recipeItems){
        this.id = id;
        this.output = output;
        this.recipeItems = recipeItems;
    }
    // 为了能够通过管理器获得配方，match必须返回true
    // 此方法用于管理容器是否输入有效。
    // 通过代用test检测
    // 检查容器内的物品和配方是否匹配。
@Override
public boolean matches(SimpleContainer pContainer, Level pLevel) {
    // 如果当前环境为客户端，则返回false，不在客户端进行合成匹配验证
    if (pLevel.isClientSide()) {
        return false;
    }

    // 创建一个StackedContents对象，用于追踪容器内物品堆叠情况
    StackedContents stackedContents = new StackedContents();

    // 初始化计数器，用于统计非空物品槽位的数量
    int i = 0;

    // 遍历容器内除首尾槽位之外的所有槽位
    for (int j = 0; j < 9; ++j) {
        // 获取当前槽位中的物品
        ItemStack itemStack = pContainer.getItem(j);

        // 如果物品不是空的
        if (!itemStack.isEmpty()) {
            // 增加计数器
            ++i;

            // 将当前物品的信息计入StackedContents，用于后续合成验证
            stackedContents.accountStack(itemStack, 1);
        }
    }

    // 直接判断计数器i所代表的非空物品槽位数量是否等于本配方所需物品数量
    // 并使用StackedContents确认容器内的物品组合是否满足本配方的合成条件
    // 同时检查容器中首个槽位的物品是否满足本配方定义的催化剂条件
    return i == this.recipeItems.size() && stackedContents.canCraft(this, (IntList) null);
}

    // 获得合成表所需要的item stacks
    @Override
    public NonNullList<Ingredient> getIngredients() {
        return recipeItems;
    }

    // 构建配方
    // 返回了合成表的结果output
    @Override
    public ItemStack assemble(SimpleContainer pContainer, RegistryAccess registryAccess) {
        return output;
    }
    // 这个方法用于判断合成表是否可以在指定的dimensions合成。
    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }
    // 获得合成表物品的copy()
    @Override
    public ItemStack getResultItem(RegistryAccess registryAccess) {
        return output.copy();
    }

    //
    @Override
    public ResourceLocation getId() {
        return id;
    }
    // 返回Serializer 必须返回
    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }
    // 返回type
    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    // 注册新的合成的type
    public static class Type implements RecipeType<WeaponCraftingTableRecipeType>{
        private Type(){}
        public static final Type INSTANCE = new Type();
        // 标识了合成的类型，和json文件中的type一致
        public static final String ID = "weapon_crafting_table";
    }

    // 负责解码JSON并通过网络通信
    // 需要注册
    public static class Serializer implements RecipeSerializer<WeaponCraftingTableRecipeType> {
        public static final Serializer INSTANCE = new Serializer();
        public static final  ResourceLocation ID =
                new ResourceLocation(VPBRecipeMod.MOD_ID,"weapon_crafting_table");
        // 将JSON解码为recipe子类型
        @Override
        public WeaponCraftingTableRecipeType fromJson(ResourceLocation pRecipeId, JsonObject pSerializedRecipe) {
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(pSerializedRecipe,"output"));

            JsonArray ingredients = GsonHelper.getAsJsonArray(pSerializedRecipe,"ingredients");


            NonNullList<Ingredient> inputs = NonNullList.withSize(ingredients.size(),Ingredient.EMPTY);

            for(int i =0;i<inputs.size();i++){
                inputs.set(i,Ingredient.fromJson(ingredients.get(i)));
            }
            return new WeaponCraftingTableRecipeType(pRecipeId,output,inputs);
        }
        // 从服务器中发送的数据中解码recipe，配方标识符不需要解码。
        @Override
        public @Nullable WeaponCraftingTableRecipeType fromNetwork(ResourceLocation pRecipeId, FriendlyByteBuf pBuffer) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(pBuffer.readInt(),Ingredient.EMPTY);
            for (int i=0;i < inputs.size();i++){
                inputs.set(i,Ingredient.fromNetwork(pBuffer));
            }
            ItemStack output = pBuffer.readItem();
            Ingredient catalyst = Ingredient.fromNetwork(pBuffer);
            return new WeaponCraftingTableRecipeType(pRecipeId,output,inputs);
        }

        @Override
        public void toNetwork(FriendlyByteBuf pBuffer, WeaponCraftingTableRecipeType pRecipe) {
            pBuffer.writeInt(pRecipe.getIngredients().size());
            for (Ingredient ing : pRecipe.getIngredients()){
                ing.toNetwork(pBuffer);
            }
            pBuffer.writeItemStack(pRecipe.getResultItem(null),false);
        }
    }


}