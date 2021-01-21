package com.thevale.moretimecapsulesmod.client.renders.consoles;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import com.thevale.moretimecapsulesmod.client.models.consoles.SmithConsole;
import com.thevale.moretimecapsulesmod.tileentities.consoles.SmithConsoleTile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;

public class SmithConsoleRender extends TileEntityRenderer<SmithConsoleTile> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(Moretimecapsulesmod.MODID, "textures/consoles/smithconsole.png");
	public static final SmithConsole MODEL = new SmithConsole();

	public SmithConsoleRender(TileEntityRendererDispatcher rendererDispatcherIn) {
		super(rendererDispatcherIn);
	}

	@Override
	public void render(SmithConsoleTile tileEntityIn, float partialTicks, MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int combinedLightIn, int combinedOverlayIn) {
		matrixStackIn.push();
		float scale = 0.0625F;
		matrixStackIn.scale((float) 1.15, (float) 1.15, (float) 1.15);
		matrixStackIn.rotate(Vector3f.XP.rotationDegrees(180));
		matrixStackIn.rotate(Vector3f.YP.rotationDegrees(180));
		matrixStackIn.translate(-0.5, -1.68, 0.5);
		Minecraft.getInstance().getItemRenderer().renderItem(tileEntityIn.getSonicItem(), ItemCameraTransforms.TransformType.NONE, combinedLightIn, combinedOverlayIn, matrixStackIn, bufferIn);
		MODEL.render(tileEntityIn, scale, matrixStackIn, bufferIn.getBuffer(RenderType.getEntityTranslucent(TEXTURE )), combinedLightIn, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
		matrixStackIn.pop();
	}
}