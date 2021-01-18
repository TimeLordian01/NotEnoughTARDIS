package com.thevale.moretimecapsulesmod.client.renders.consoles;

import com.mojang.blaze3d.platform.GlStateManager;
import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import com.thevale.moretimecapsulesmod.client.models.consoles.ValeConsoleModel;
import com.thevale.moretimecapsulesmod.tileentities.consoles.ValeConsoleTile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.util.ResourceLocation;

public class ValeConsoleRender extends TileEntityRenderer<ValeConsoleTile> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(Moretimecapsulesmod.MODID, "textures/consoles/valeconsole.png");
	public static final ValeConsoleModel MODEL = new ValeConsoleModel();

	@Override
	public void render(ValeConsoleTile tileEntityIn, double x, double y, double z, float partialTicks, int destroyStage) {
		GlStateManager.pushMatrix();
		GlStateManager.translated(x + 0.5, y + 1.75, z + 0.5);
		GlStateManager.enableRescaleNormal();
		GlStateManager.scaled(1.15, 1.15, 1.15);
		GlStateManager.disableRescaleNormal();
		GlStateManager.rotated(180, 0, 0, 1);
		this.bindTexture(TEXTURE);
		MODEL.render(tileEntityIn);
		GlStateManager.popMatrix();
	}

	@Override
	protected void bindTexture(ResourceLocation location) {
		Minecraft.getInstance().getTextureManager().bindTexture(location);
	}

}