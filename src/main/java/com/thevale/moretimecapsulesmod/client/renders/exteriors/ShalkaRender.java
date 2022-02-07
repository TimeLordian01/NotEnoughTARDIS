package com.thevale.moretimecapsulesmod.client.renders.exteriors;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.thevale.moretimecapsulesmod.client.models.exteriors.shalka;
import com.thevale.moretimecapsulesmod.tileentities.exteriors.ShalkaTile;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.misc.WorldText;


public class ShalkaRender extends ExteriorRenderer<ShalkaTile> {
public static final ResourceLocation TEXTURE = new ResourceLocation("moretimecapsulesmod","textures/exteriors/shalkaentity.png");
public static shalka MODEL = new shalka();
public static WorldText TEXT = new WorldText(0.87F, 0.125F, 0.015F, 0x000000);

    public ShalkaRender(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    @Override
    public void renderExterior(ShalkaTile shalkaTile, float v, MatrixStack matrixStack, IRenderTypeBuffer iRenderTypeBuffer, int i, int i1, float v1) {
        matrixStack.push();
        matrixStack.translate(0, -1, 0);
        MODEL.render(shalkaTile, 0.25F, matrixStack, iRenderTypeBuffer.getBuffer(RenderType.getEntityCutoutNoCull(TEXTURE)), i, i1, v1);
        matrixStack.pop();
    }
}
