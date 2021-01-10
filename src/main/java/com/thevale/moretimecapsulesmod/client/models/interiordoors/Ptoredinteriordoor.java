package com.thevale.moretimecapsulesmod.client.models.interiordoors;// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.platform.GlStateManager;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.models.interiordoors.IInteriorDoorRenderer;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class Ptoredinteriordoor extends Model implements IInteriorDoorRenderer {
	public static final ResourceLocation TEXTURE = new ResourceLocation("moretimecapsulesmod", "textures/interiordoor/ptoredinterior.png");
	private final RendererModel Chassis;
	private final RendererModel DoorR;
	private final RendererModel cube_r1;
	private final RendererModel DoorL;
	private final RendererModel cube_r2;

	public Ptoredinteriordoor() {
		textureWidth = 256;
		textureHeight = 256;

		Chassis = new RendererModel(this);
		Chassis.setRotationPoint(-1.1875F, -11.7188F, 9.0938F);
		setRotationAngle(Chassis, 0.0F, 1.5708F, 0.0F);
		Chassis.cubeList.add(new ModelBox(Chassis, 0, 0, 14.1875F, 32.7188F, -17.0938F, 3, 3, 36, 0.0F, false));
		Chassis.cubeList.add(new ModelBox(Chassis, 42, 76, 14.1875F, -24.2813F, 14.9063F, 3, 57, 3, 0.0F, false));
		Chassis.cubeList.add(new ModelBox(Chassis, 30, 76, 14.1875F, -24.2813F, -16.0938F, 3, 57, 3, 0.0F, false));
		Chassis.cubeList.add(new ModelBox(Chassis, 0, 39, 12.1875F, -23.2813F, -15.0938F, 5, 5, 32, 0.0F, false));

		DoorR = new RendererModel(this);
		DoorR.setRotationPoint(14.1875F, 32.7188F, 14.9063F);
		Chassis.addChild(DoorR);
		DoorR.cubeList.add(new ModelBox(DoorR, 0, 0, 1.0F, -34.0F, -13.0F, 1, 5, 1, 0.0F, false));

		cube_r1 = new RendererModel(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		DoorR.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 76, -14.0F, -51.0F, -1.0F, 14, 51, 1, 0.0F, false));

		DoorL = new RendererModel(this);
		DoorL.setRotationPoint(14.1875F, 32.7188F, -13.0938F);
		Chassis.addChild(DoorL);
		DoorL.cubeList.add(new ModelBox(DoorL, 4, 4, 1.0F, -33.0F, 2.0F, 1, 3, 1, 0.0F, false));

		cube_r2 = new RendererModel(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		DoorL.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 75, 75, 0.0F, -51.0F, -1.0F, 14, 51, 1, 0.0F, false));
	}

	public void render(DoorEntity door) {
		 EnumDoorState state = door.getOpenState();
		GlStateManager.pushMatrix();
		GlStateManager.enableRescaleNormal();
		GlStateManager.translated(0.0D, 0.57D, -0.3D);
		GlStateManager.scalef(0.65F, 0.65F, 0.65F);
		switch (state) {
			case ONE:
				this.DoorR.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.PTORED.getRotationForState(EnumDoorState.ONE));
				this.DoorL.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.PTORED.getRotationForState(EnumDoorState.CLOSED));
				break;
			case BOTH:
				this.DoorR.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.PTORED.getRotationForState(EnumDoorState.ONE));
				this.DoorL.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.PTORED.getRotationForState(EnumDoorState.BOTH));
				break;
			case CLOSED:
				this.DoorR.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.PTORED.getRotationForState(EnumDoorState.CLOSED));
				this.DoorL.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.PTORED.getRotationForState(EnumDoorState.CLOSED));
		}
		this.Chassis.render(0.0625F);
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