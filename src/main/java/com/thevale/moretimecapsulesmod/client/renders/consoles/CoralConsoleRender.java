package com.thevale.moretimecapsulesmod.client.renders.consoles;

import com.mojang.blaze3d.platform.GlStateManager;
import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import com.thevale.moretimecapsulesmod.client.models.consoles.CoralConsole;
import com.thevale.moretimecapsulesmod.client.models.consoles.ValeConsoleModel;
import com.thevale.moretimecapsulesmod.tileentities.consoles.CoralConsoleTile;
import com.thevale.moretimecapsulesmod.tileentities.consoles.ValeConsoleTile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.util.ResourceLocation;

public class CoralConsoleRender extends TileEntityRenderer<CoralConsoleTile> {

	public static final ResourceLocation TEXTURE = new ResourceLocation(Moretimecapsulesmod.MODID, "textures/consoles/coralconsole.png");
	public static final CoralConsole MODEL = new CoralConsole();

	@Override
	public void render(CoralConsoleTile tileEntityIn, double x, double y, double z, float partialTicks, int destroyStage) {
		GlStateManager.pushMatrix();
		GlStateManager.translated(x + 0.5, y + 1.6, z + 0.5);
		GlStateManager.enableRescaleNormal();
		GlStateManager.scaled(1.15, 1.255, 1.15);
		GlStateManager.disableRescaleNormal();
		GlStateManager.rotated(180, 180, 0, 0);
		this.bindTexture(TEXTURE);
		MODEL.render(tileEntityIn);
		GlStateManager.popMatrix();
	}

	@Override
	protected void bindTexture(ResourceLocation location) {
		Minecraft.getInstance().getTextureManager().bindTexture(location);
	}

}