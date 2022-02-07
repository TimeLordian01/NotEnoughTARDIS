package com.thevale.moretimecapsulesmod.client.renders.exteriors;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.moretimecapsulesmod.client.models.exteriors.PTORed;
import com.thevale.moretimecapsulesmod.tileentities.exteriors.PtoredTile;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.TRenderTypes;
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
    public void renderExterior(PtoredTile tile, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn, float alpha) {
        matrixStackIn.push();
        matrixStackIn.translate(0, -1, 0);

        ResourceLocation texture = TEXTURE;
        if(tile.getVariant() != null)
            texture = tile.getVariant().getTexture();
        IVertexBuilder ivertexbuilder = bufferIn.getBuffer(TRenderTypes.getTardis(texture));
        MODEL.render(tile, 0.25F, matrixStackIn, ivertexbuilder, combinedLightIn, OverlayTexture.NO_OVERLAY, alpha);
        matrixStackIn.pop();
    }
}
