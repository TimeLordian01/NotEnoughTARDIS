package com.thevale.moretimecapsulesmod.client.renders.exteriors;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import com.thevale.moretimecapsulesmod.client.models.exteriors.WardrobeExterior;
import com.thevale.moretimecapsulesmod.tileentities.exteriors.WardrobeTile;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.TRenderTypes;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.misc.WorldText;


public class WardrobeRender extends ExteriorRenderer<WardrobeTile> {
public static final ResourceLocation TEXTURE = new ResourceLocation(Moretimecapsulesmod.MODID,"textures/exteriors/wardrobe_oak_variant.png");
public static WardrobeExterior MODEL = new WardrobeExterior();
public static WorldText TEXT = new WorldText(0.87F, 0.125F, 0.015F, 0x000000);

    public WardrobeRender(TileEntityRendererDispatcher rendererDispatcherIn) {
        super(rendererDispatcherIn);
    }

    @Override
    public void renderExterior(WardrobeTile tile, float v, MatrixStack matrixStack, IRenderTypeBuffer bufferIn, int i, int i1, float v1) {
        matrixStack.push();
        matrixStack.translate(0, -1, 0);

        ResourceLocation texture = TEXTURE;
        if (tile.getVariant() != null) {
            texture = tile.getVariant().getTexture();
        }
        IVertexBuilder ivertexbuilder = bufferIn.getBuffer(TRenderTypes.getTardis(texture));
        MODEL.render(tile, 0.25F, matrixStack, ivertexbuilder, i, i1, v1);

        matrixStack.pop();
    }
}
