package com.thevale.moretimecapsulesmod.client.renders.consoles;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import com.thevale.moretimecapsulesmod.client.models.consoles.CoralConsole;
import com.thevale.moretimecapsulesmod.tileentities.consoles.CoralConsoleTile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;

public class CoralConsoleRender extends TileEntityRenderer<CoralConsoleTile> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(Moretimecapsulesmod.MODID, "textures/consoles/coralconsole.png");
	public static final CoralConsole MODEL = new CoralConsole();

	public CoralConsoleRender(TileEntityRendererDispatcher rendererDispatcherIn) {
		super(rendererDispatcherIn);
	}

	@Override
	public void render(CoralConsoleTile tileEntityIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
		matrixStackIn.push();
		float scale = 0.0625F;
		matrixStackIn.translate(0.5, 1.6, 0.5);
		matrixStackIn.scale((float) 1.15, (float) 1.255, (float) 1.15);
		matrixStackIn.rotate(Vector3f.XP.rotationDegrees(180));
		MODEL.render(tileEntityIn, scale, matrixStackIn, bufferIn.getBuffer(RenderType.getEntityTranslucent(TEXTURE )), combinedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
		matrixStackIn.pop();
		matrixStackIn.push();
		matrixStackIn.translate(0.85, 0.9,0.925);
		matrixStackIn.scale((float) 0.5, (float) 0.5, (float) 0.5);
		matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(145));
		Minecraft.getInstance().getItemRenderer().renderItem(tileEntityIn.getSonicItem(), ItemCameraTransforms.TransformType.NONE, combinedLightIn, combinedOverlayIn, matrixStackIn, bufferIn);
		matrixStackIn.pop();
	}
}