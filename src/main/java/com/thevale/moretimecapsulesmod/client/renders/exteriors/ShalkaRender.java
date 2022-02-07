package com.thevale.moretimecapsulesmod.client.renders.exteriors;

import com.mojang.blaze3d.matrix.MatrixStack;

import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import com.thevale.moretimecapsulesmod.client.models.exteriors.shalka;
import com.thevale.moretimecapsulesmod.tileentities.exteriors.ShalkaTile;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.Tardis;
import net.tardis.mod.client.TRenderTypes;
import net.tardis.mod.client.models.exteriors.TelephoneExteriorModel;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.misc.WorldText;
import net.tardis.mod.tileentities.exteriors.TelephoneExteriorTile;

public class ShalkaRender extends ExteriorRenderer<ShalkaTile> {

    public ShalkaRender(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    public static final ResourceLocation TEXTURE = new ResourceLocation(Moretimecapsulesmod.MODID, "textures/exteriors/shalka.png");
    public static shalka MODEL = new shalka();
    public static WorldText TEXT = new WorldText(0.87F, 0.125F, 0.015F, 0x000000);

    @Override
    public void renderExterior(ShalkaTile tile, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn, float alpha) {
        matrixStackIn.push();
        matrixStackIn.translate(0, -1, 0);
        ResourceLocation texture = TEXTURE;
        if(tile.getVariant() != null)
            texture = tile.getVariant().getTexture();
        MODEL.render(tile, 1.0F, matrixStackIn, bufferIn.getBuffer(TRenderTypes.getTardis(texture)), combinedLightIn, combinedOverlayIn, alpha);
        matrixStackIn.pop();
    }

}
