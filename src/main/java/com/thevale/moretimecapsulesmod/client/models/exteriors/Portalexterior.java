package com.thevale.moretimecapsulesmod.client.models.exteriors;// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.platform.GlStateManager;
import com.thevale.moretimecapsulesmod.tileentities.PortalTile;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;

public class Portalexterior extends EntityModel {
	private final RendererModel frame;
	private final RendererModel lights;

	public Portalexterior() {
		textureWidth = 256;
		textureHeight = 256;

		frame = new RendererModel(this);
		frame.setRotationPoint(0.0F, 24.0F, 0.0F);
		frame.cubeList.add(new ModelBox(frame, 0, 104, -10.0F, -3.0F, 6.0F, 20, 3, 3, 0.0F, false));
		frame.cubeList.add(new ModelBox(frame, 46, 104, -9.5F, -37.0F, 6.0F, 3, 34, 3, 0.0F, false));
		frame.cubeList.add(new ModelBox(frame, 46, 104, 6.5F, -37.0F, 6.0F, 3, 34, 3, 0.0F, true));
		frame.cubeList.add(new ModelBox(frame, 0, 0, -9.0F, -37.0F, 7.0F, 18, 34, 1, 0.0F, false));

		lights = new RendererModel(this);
		lights.setRotationPoint(0.0F, 20.0F, 5.25F);
		lights.cubeList.add(new ModelBox(lights, 74, 0, -9.0F, -33.0F, 1.0F, 18, 34, 0, 0.0F, false));
		lights.cubeList.add(new ModelBox(lights, 72, 34, -9.0F, -33.0F, 1.25F, 18, 34, 0, 0.0F, false));
		lights.cubeList.add(new ModelBox(lights, 72, 72, -9.0F, -33.0F, 1.45F, 18, 34, 0, 0.0F, false));
		lights.cubeList.add(new ModelBox(lights, 36, 70, -9.0F, -33.0F, 1.725F, 18, 34, 0, 0.0F, false));
	}

	public void render(PortalTile door) {
		 EnumDoorState state = door.getOpen();
		GlStateManager.pushMatrix();
		GlStateManager.enableRescaleNormal();
		GlStateManager.translated(0.0D, 0.0D, 0.0D);
		GlStateManager.scalef(1.0F, 1.0F, 1.0F);
		switch (state) {
			case ONE:
				this.lights.offsetZ = 0.025F;
				break;
			case BOTH:
				this.lights.offsetZ = 0.0F;
				break;
			case CLOSED:
				this.lights.offsetZ = 0.05F;
		}
		this.frame.render(0.0625F);
		this.lights.render(0.0625F);
		GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}