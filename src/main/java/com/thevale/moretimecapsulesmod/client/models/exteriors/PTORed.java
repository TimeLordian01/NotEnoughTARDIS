package com.thevale.moretimecapsulesmod.client.models.exteriors;// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.platform.GlStateManager;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class PTORed extends EntityModel {
	private final RendererModel Chassis;
	private final RendererModel cube_r1;
	private final RendererModel cube_r2;
	private final RendererModel DoorR;
	private final RendererModel cube_r3;
	private final RendererModel DoorL;
	private final RendererModel cube_r4;

	public PTORed() {
		textureWidth = 256;
		textureHeight = 256;

		Chassis = new RendererModel(this);
		Chassis.setRotationPoint(-0.1875F, -11.7188F, -0.9063F);
		setRotationAngle(Chassis, 0.0F, 1.5708F, 0.0F);
		Chassis.cubeList.add(new ModelBox(Chassis, 0, 0, -18.8125F, 32.7188F, -17.7188F, 36, 3, 36, 0.0F, false));
		Chassis.cubeList.add(new ModelBox(Chassis, 30, 165, 13.1875F, -24.2813F, 14.2813F, 3, 57, 3, 0.0F, false));
		Chassis.cubeList.add(new ModelBox(Chassis, 42, 165, 13.1875F, -24.2813F, -16.7188F, 3, 57, 3, 0.0F, false));
		Chassis.cubeList.add(new ModelBox(Chassis, 66, 189, -17.8125F, -24.2813F, 14.2813F, 3, 57, 3, 0.0F, false));
		Chassis.cubeList.add(new ModelBox(Chassis, 54, 189, -17.8125F, -24.2813F, -16.7188F, 3, 57, 3, 0.0F, false));
		Chassis.cubeList.add(new ModelBox(Chassis, 104, 104, -16.8125F, -25.2813F, -15.7188F, 32, 1, 32, 0.0F, false));
		Chassis.cubeList.add(new ModelBox(Chassis, 0, 76, -18.8125F, -23.2813F, -15.7188F, 36, 5, 32, 0.0F, false));
		Chassis.cubeList.add(new ModelBox(Chassis, 0, 0, -3.8125F, -26.2813F, -2.7188F, 6, 1, 6, 0.0F, false));
		Chassis.cubeList.add(new ModelBox(Chassis, 0, 7, -2.8125F, -30.2813F, -1.7188F, 4, 4, 4, 0.0F, false));
		Chassis.cubeList.add(new ModelBox(Chassis, 104, 39, -15.8125F, -24.2813F, -14.7188F, 30, 1, 30, 0.0F, false));
		Chassis.cubeList.add(new ModelBox(Chassis, 116, 137, -14.8125F, -18.2813F, 14.2813F, 28, 51, 1, 0.0F, false));
		Chassis.cubeList.add(new ModelBox(Chassis, 58, 137, -14.8125F, -18.2813F, -14.7188F, 28, 51, 1, 0.0F, false));

		cube_r1 = new RendererModel(this);
		cube_r1.setRotationPoint(-17.1875F, 32.7188F, -10.7188F);
		Chassis.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 113, -3.0F, -51.0F, -2.375F, 28, 51, 1, 0.0F, false));

		cube_r2 = new RendererModel(this);
		cube_r2.setRotationPoint(-1.1875F, -22.2813F, 2.2813F);
		Chassis.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 1.5708F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 39, -16.0F, -1.0F, -15.625F, 36, 5, 32, 0.0F, false));

		DoorR = new RendererModel(this);
		DoorR.setRotationPoint(13.1875F, 4.2188F, 14.2813F);
		Chassis.addChild(DoorR);
		DoorR.cubeList.add(new ModelBox(DoorR, 0, 0, 1.0F, -5.5F, -13.0F, 1, 5, 1, 0.0F, false));

		cube_r3 = new RendererModel(this);
		cube_r3.setRotationPoint(-0.375F, 28.5F, 2.0F);
		DoorR.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -1.5708F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 165, -16.0F, -51.0F, -1.375F, 14, 51, 1, 0.0F, false));

		DoorL = new RendererModel(this);
		DoorL.setRotationPoint(13.1875F, 4.2188F, -13.7188F);
		Chassis.addChild(DoorL);
		DoorL.cubeList.add(new ModelBox(DoorL, 0, 7, 1.0F, -4.5F, 2.0F, 1, 3, 1, 0.0F, false));

		cube_r4 = new RendererModel(this);
		cube_r4.setRotationPoint(-0.375F, 28.5F, 2.0F);
		DoorL.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -1.5708F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 174, 174, -2.0F, -51.0F, -1.375F, 14, 51, 1, 0.0F, false));
	}

public void render(ExteriorTile tile) {
		EnumDoorState state = tile.getOpen();
		GlStateManager.pushMatrix();
        GlStateManager.enableRescaleNormal();
        GlStateManager.translated(0.0D, 0.55, 0.0D);
        GlStateManager.scalef(0.65F, 0.65F, 0.65F);
		switch(state) {
        case ONE:
            this.DoorR.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.PTORED.getRotationForState(EnumDoorState.ONE));
            this.DoorL.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.PTORED.getRotationForState(EnumDoorState.CLOSED));
            break;
        case BOTH:
            this.DoorR.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.PTORED.getRotationForState(EnumDoorState.ONE));
            this.DoorL.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.PTORED.getRotationForState(EnumDoorState.BOTH));
            break;
        case CLOSED:
            this.DoorR.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.PTORED.getRotationForState(EnumDoorState.CLOSED));
            this.DoorL.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.PTORED.getRotationForState(EnumDoorState.CLOSED));
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
}