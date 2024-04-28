package com.linweiyun.vpbrecipemod.screen;

import com.linweiyun.vpbrecipemod.VPBRecipeMod;
import com.linweiyun.vpbrecipemod.item.button.WeaponBoxButtonMessage;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class WeaponCraftingTableScreen extends AbstractContainerScreen<WeaponCraftingTbaleMenu> {


    // 屏幕相关的世界、坐标和玩家实体变量
    //private final Level world;
    //private final Player entity;
    //private final int x, y, z;

    // 创建一个按钮实例，用于“确认”操作
    Button button_que_ren;

    // 构造函数，接收 WeaponBoxMenu 容器、Inventory 和 Component 文本参数
    public WeaponCraftingTableScreen(WeaponCraftingTbaleMenu container, Inventory inventory, Component text) {
        super(container, inventory, text);
        // 初始化屏幕所需的世界、坐标和玩家实体变量
        //this.x = container.x;
        //this.y = container.y;
        //this.z = container.z;
        //this.world = container.world;
        //this.entity = container.entity;
        // 设置屏幕宽度和高度
        this.imageWidth = 228;
        this.imageHeight = 220;
    }

    // 定义屏幕背景纹理资源位置
    private static final ResourceLocation texture = new ResourceLocation("vpbrecipe:textures/gui/weapon_crafting_table.png");

    // 重写渲染方法，处理鼠标位置、绘制背景、调用父类方法和绘制提示文本
    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(guiGraphics);

        super.render(guiGraphics, mouseX, mouseY, partialTicks);

        this.renderTooltip(guiGraphics, mouseX, mouseY);
    }

    // 重写背景渲染方法，使用指定的纹理、位置和尺寸绘制背景
    @Override
    protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
        RenderSystem.setShaderColor(1, 1, 1, 1);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();

        guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

        RenderSystem.disableBlend();
    }

    // 重写键盘按键事件处理方法，检查 ESC 键关闭容器，否则调用父类方法
    @Override
    public boolean keyPressed(int key, int b, int c) {
        if (key == 256) { // 256 代表 ESC 键
            this.minecraft.player.closeContainer();
            return true;
        }

        return super.keyPressed(key, b, c);
    }

    // 重写容器每 tick 更新方法，调用父类方法
    @Override
    public void containerTick() {
        super.containerTick();
    }

    // 重写标签渲染方法，绘制指定文本标签
    @Override
    protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {

    }

    // 重写关闭方法，调用父类方法
    @Override
    public void onClose() {
        super.onClose();
        //WeaponCraftingTbaleMenu.setOutStack();

    }
}

    // 重写初始化方法，调用父类方法并创建并配置“确认”按钮、将其添加到 guistate 映射和屏幕渲染组件列表

