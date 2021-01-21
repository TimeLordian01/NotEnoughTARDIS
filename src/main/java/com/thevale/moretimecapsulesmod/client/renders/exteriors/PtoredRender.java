package com.thevale.moretimecapsulesmod.client.renders.exteriors;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.thevale.moretimecapsulesmod.client.models.exteriors.PTORed;
import com.thevale.moretimecapsulesmod.tileentities.PtoredTile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.misc.WorldText;


public class PtoredRender extends ExteriorRenderer<PtoredTile> {
public static final ResourceLocation TEXTURE = new ResourceLocation("moretimecapsulesmod","textures/exteriors/ptored.png");
public static PTORed MODEL = new PTORed();
public static WorldText TEXT = new WorldText(0.87F, 0.125F, 0.015F, 0x000000);

    public PtoredRender(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    @Override
    public void renderExterior(PtoredTile ptoredTile, float v, MatrixStack matrixStack, IRenderTypeBuffer iRenderTypeBuffer, int i, int i1, float v1) {
        matrixStack.push();
        matrixStack.translate(0, -1, 0);
        MODEL.render(ptoredTile, 0.25F, matrixStack, iRenderTypeBuffer.getBuffer(RenderType.getEntityCutoutNoCull(TEXTURE)), i, i1, v1);
        matrixStack.pop();
    }
}
