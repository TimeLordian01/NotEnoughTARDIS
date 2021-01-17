package com.thevale.moretimecapsulesmod.client.models.interiordoors;// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports



import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.models.interiordoors.IInteriorDoorRenderer;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;

public class Portalinteriordoor extends Model implements IInteriorDoorRenderer {
	 public static final ResourceLocation TEXTURE = new ResourceLocation("moretimecapsulesmod", "textures/exteriors/portaltexture.png");


	private final RendererModel frame;
	private final RendererModel portal;

	public Portalinteriordoor() {
		textureWidth = 256;
		textureHeight = 256;

		frame = new RendererModel(this);
		frame.setRotationPoint(11.0F, 24.0F, 0.0F);
		frame.cubeList.add(new ModelBox(frame, 0, 104, -21.0F, -3.0F, 6.0F, 20, 3, 3, 0.0F, false));
		frame.cubeList.add(new ModelBox(frame, 46, 104, -20.5F, -37.0F, 6.0F, 3, 34, 3, 0.0F, false));
		frame.cubeList.add(new ModelBox(frame, 46, 104, -4.5F, -37.0F, 6.0F, 3, 34, 3, 0.0F, true));
		frame.cubeList.add(new ModelBox(frame, 0, 0, -20.0F, -37.0F, 7.0F, 18, 34, 1, 0.0F, false));

		portal = new RendererModel(this);
		portal.setRotationPoint(11.0F, 20.0F, 5.25F);
		portal.cubeList.add(new ModelBox(portal, 0, 69, -20.0F, -33.0F, 1.725F, 18, 34, 0, 0.0F, false));
		portal.cubeList.add(new ModelBox(portal, 0, 35, -20.0F, -33.0F, 1.45F, 18, 34, 0, 0.0F, false));
		portal.cubeList.add(new ModelBox(portal, 36, 36, -20.0F, -33.0F, 1.25F, 18, 34, 0, 0.0F, false));
		portal.cubeList.add(new ModelBox(portal, 38, 0, -20.0F, -33.0F, 1.0F, 18, 34, 0, 0.0F, false));
	}

public void render(DoorEntity door) {
		 EnumDoorState state = door.getOpenState();
		GlStateManager.pushMatrix();
		GlStateManager.enableRescaleNormal();
		GlStateManager.translated(0.0D, 0.0D, -0.05D);
		GlStateManager.rotated(180D,0.0D,180.0D,0.0D);
		GlStateManager.scalef(1.0F, 1.0F, 1.0F);
		switch (state) {
			case ONE:
				this.portal.offsetZ = 0.025F;
				break;
			case BOTH:
				this.portal.offsetZ = 0.0F;
				break;
			case CLOSED:
				this.portal.offsetZ = 0.05F;
		}
		this.frame.render(0.0625F);
		this.portal.render(0.0625F);
		GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public ResourceLocation getTexture() {
		return TEXTURE;
	}
}