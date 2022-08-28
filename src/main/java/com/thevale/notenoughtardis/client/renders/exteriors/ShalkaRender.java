package com.thevale.notenoughtardis.client.renders.exteriors;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.notenoughtardis.client.models.exteriors.PTORed;
import com.thevale.notenoughtardis.client.models.exteriors.shalka;
import com.thevale.notenoughtardis.tileentities.exteriors.PtoredTile;
import com.thevale.notenoughtardis.tileentities.exteriors.ShalkaTile;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.TRenderTypes;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.misc.WorldText;


public class ShalkaRender extends ExteriorRenderer<ShalkaTile> {

    public static final ResourceLocation TEXTURE = new ResourceLocation("notenoughtardis","textures/exteriors/shalkaentity.png");
    public static shalka MODEL = new shalka();

    public ShalkaRender(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    @Override
    public void renderExterior(ShalkaTile tile, float scale, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn, float alpha) {
        matrixStackIn.push();
        matrixStackIn.translate(0, -1, 0);
        matrixStackIn.scale(0.6F, 0.6F, 0.6F);

        ResourceLocation texture = TEXTURE;
        if(tile.getVariant() != null)
            texture = tile.getVariant().getTexture();
        IVertexBuilder ivertexbuilder = bufferIn.getBuffer(TRenderTypes.getTardis(texture));
        MODEL.render(tile, 0.25F, matrixStackIn, ivertexbuilder, combinedLightIn, OverlayTexture.NO_OVERLAY, alpha);
        matrixStackIn.pop();
    }
}