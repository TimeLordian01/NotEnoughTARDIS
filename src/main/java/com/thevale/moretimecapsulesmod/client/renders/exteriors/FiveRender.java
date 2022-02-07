package com.thevale.moretimecapsulesmod.client.renders.exteriors;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.thevale.moretimecapsulesmod.client.models.exteriors.FiveExterior;
import com.thevale.moretimecapsulesmod.tileentities.exteriors.FiveTile;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.TRenderTypes;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.misc.WorldText;


public class FiveRender extends ExteriorRenderer<FiveTile> {
    public static final ResourceLocation TEXTURE = new ResourceLocation("moretimecapsulesmod", "textures/exteriors/fiveexterior.png");
    public static FiveExterior MODEL = new FiveExterior();
    public static WorldText TEXT = new WorldText(0.87F, 0.125F, 0.015F, 0x000000);

    public FiveRender(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    @Override
    public void renderExterior(FiveTile tile, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn, float alpha) {
        matrixStackIn.push();
        matrixStackIn.translate(0, -1, 0);
        ResourceLocation texture = TEXTURE;
        if(tile.getVariant() != null)
            texture = tile.getVariant().getTexture();
        MODEL.render(tile, 1.0F, matrixStackIn, bufferIn.getBuffer(TRenderTypes.getTardis(texture)), combinedLightIn, combinedOverlayIn, alpha);
        matrixStackIn.pop();
    }
}