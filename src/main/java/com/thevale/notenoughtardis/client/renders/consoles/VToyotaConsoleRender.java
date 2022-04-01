package com.thevale.notenoughtardis.client.renders.consoles;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.notenoughtardis.client.models.consoles.VToyotaConsole;
import com.thevale.notenoughtardis.tileentities.consoles.VToyotaConsoleTile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.client.TRenderTypes;

public class VToyotaConsoleRender extends TileEntityRenderer<VToyotaConsoleTile> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(com.thevale.notenoughtardis.NotEnoughTardis.MODID, "textures/consoles/toyota_smith.png");
	public static final VToyotaConsole MODEL = new VToyotaConsole();

	public VToyotaConsoleRender(TileEntityRendererDispatcher rendererDispatcherIn) {
		super(rendererDispatcherIn);
	}

	@Override
	public void render(VToyotaConsoleTile tileEntityIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
		matrixStackIn.push();
		float scale = 1F;
		matrixStackIn.translate(0.5, 0, 0.5);
		matrixStackIn.scale((float) 1.15, (float) 1.255, (float) 1.15);
		matrixStackIn.rotate(Vector3f.XP.rotationDegrees(180));

		ResourceLocation texture = TEXTURE;
		if (tileEntityIn.getVariant() != null) {
			texture = tileEntityIn.getVariant().getTexture();
		}
		IVertexBuilder ivertexbuilder = bufferIn.getBuffer(TRenderTypes.getTardis(texture));

		MODEL.render(tileEntityIn, 0.25F, matrixStackIn, ivertexbuilder, combinedLightIn, combinedOverlayIn);
		matrixStackIn.pop();
	}
}