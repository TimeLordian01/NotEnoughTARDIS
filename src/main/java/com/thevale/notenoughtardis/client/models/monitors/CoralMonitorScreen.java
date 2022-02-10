package com.thevale.notenoughtardis.client.models.monitors;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SimpleSound;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.guis.monitors.BaseMonitorScreen;
import net.tardis.mod.sounds.TSounds;

public class CoralMonitorScreen extends BaseMonitorScreen {

    public static final ResourceLocation TEXTURE = new ResourceLocation("notenoughtardis", "textures/gui/monitors/coralconsole.png");

    protected void init() {
        super.init();
        Minecraft.getInstance().getSoundHandler().play(SimpleSound.master(TSounds.EYE_MONITOR_INTERACT.get(), 1.0F));
    }

    @Override
    public void renderMonitor(MatrixStack matrixStack) {
        Minecraft.getInstance().getTextureManager().bindTexture(TEXTURE);
        this.renderBackground(matrixStack);
        int guiWidth = 255;
        int guiHeight = 182;
        this.blit(matrixStack, this.width / 2 - guiWidth / 2, this.height / 2 - guiHeight / 2, 0, 0, guiWidth, guiHeight);
    }

    @Override
    public int getMinY() {
        return this.height / 2 + 45;
    }

    @Override
    public int getMinX() {
        return this.width / 2 - 100;
    }

    @Override
    public int getMaxX() {
        return this.getMinX() + 200;
    }

    @Override
    public int getMaxY() {
        return this.getMinY() - 120;
    }

    @Override
    public int getWidth() {
        return 200;
    }

    @Override
    public int getHeight() {
        return 135;
    }

    @Override
    public int getGuiID() {
        return 8;
    }
}