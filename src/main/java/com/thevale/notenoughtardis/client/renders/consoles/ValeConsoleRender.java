package com.thevale.notenoughtardis.client.renders.consoles;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.thevale.notenoughtardis.client.models.consoles.ValeConsoleModel;
import com.thevale.notenoughtardis.tileentities.consoles.ValeConsoleTile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;

public class ValeConsoleRender extends TileEntityRenderer<ValeConsoleTile> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(com.thevale.notenoughtardis.NotEnoughTardis.MODID, "textures/consoles/valeconsole.png");
	public static final ValeConsoleModel MODEL = new ValeConsoleModel();

	public ValeConsoleRender(TileEntityRendererDispatcher rendererDispatcherIn) {
		super(rendererDispatcherIn);
	}

	@Override
	public void render(ValeConsoleTile tileEntityIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
		matrixStackIn.push();
		float scale = 1F;
		matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(180));
		matrixStackIn.translate(-0.5, -1.74, 0.5);
		matrixStackIn.scale((float) 1.15, (float) 1.15, (float) 1.15);
		MODEL.render(tileEntityIn, scale, matrixStackIn, bufferIn.getBuffer(RenderType.getEntityTranslucent(TEXTURE )), combinedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
		matrixStackIn.pop();
		matrixStackIn.push();
		matrixStackIn.translate(0.35, 0.7,0.125);
		matrixStackIn.scale((float) 0.5, (float) 0.5, (float) 0.5);
		matrixStackIn.rotate(Vector3f.XP.rotationDegrees(90));
		matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90));
		Minecraft.getInstance().getItemRenderer().renderItem(tileEntityIn.getSonicItem(), ItemCameraTransforms.TransformType.NONE, combinedLightIn, combinedOverlayIn, matrixStackIn, bufferIn);
		matrixStackIn.pop();
	}
}