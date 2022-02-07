package com.thevale.moretimecapsulesmod.client.models.exteriors;// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.tardis.mod.client.models.exteriors.ExteriorModel;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class PTORed extends ExteriorModel {
	private final ModelRenderer Chassis;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer DoorR;
	private final ModelRenderer cube_r3;
	private final ModelRenderer DoorL;
	private final ModelRenderer cube_r4;

	public PTORed() {
		textureWidth = 256;
		textureHeight = 256;

		Chassis = new ModelRenderer(this);
		Chassis.setRotationPoint(-0.1875F, -11.7188F, -0.9063F);
		setRotationAngle(Chassis, 0.0F, 1.5708F, 0.0F);
		Chassis.setTextureOffset(0, 0).addBox(-18.8125F, 32.7188F, -17.7188F, 36.0F, 3.0F, 36.0F, 0.0F, false);
		Chassis.setTextureOffset(30, 165).addBox(13.1875F, -24.2813F, 14.2813F, 3.0F, 57.0F, 3.0F, 0.0F, false);
		Chassis.setTextureOffset(42, 165).addBox(13.1875F, -24.2813F, -16.7188F, 3.0F, 57.0F, 3.0F, 0.0F, false);
		Chassis.setTextureOffset(66, 189).addBox(-17.8125F, -24.2813F, 14.2813F, 3.0F, 57.0F, 3.0F, 0.0F, false);
		Chassis.setTextureOffset(54, 189).addBox(-17.8125F, -24.2813F, -16.7188F, 3.0F, 57.0F, 3.0F, 0.0F, false);
		Chassis.setTextureOffset(104, 104).addBox(-16.8125F, -25.2813F, -15.7188F, 32.0F, 1.0F, 32.0F, 0.0F, false);
		Chassis.setTextureOffset(0, 76).addBox(-18.8125F, -23.2813F, -15.7188F, 36.0F, 5.0F, 32.0F, 0.0F, false);
		Chassis.setTextureOffset(0, 0).addBox(-3.8125F, -26.2813F, -2.7188F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		Chassis.setTextureOffset(0, 7).addBox(-2.8125F, -30.2813F, -1.7188F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		Chassis.setTextureOffset(104, 39).addBox(-15.8125F, -24.2813F, -14.7188F, 30.0F, 1.0F, 30.0F, 0.0F, false);
		Chassis.setTextureOffset(116, 137).addBox(-14.8125F, -18.2813F, 14.2813F, 28.0F, 51.0F, 1.0F, 0.0F, false);
		Chassis.setTextureOffset(58, 137).addBox(-14.8125F, -18.2813F, -14.7188F, 28.0F, 51.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-17.1875F, 32.7188F, -10.7188F);
		Chassis.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
		cube_r1.setTextureOffset(0, 113).addBox(-3.0F, -51.0F, -2.375F, 28.0F, 51.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.1875F, -22.2813F, 2.2813F);
		Chassis.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 1.5708F, 0.0F);
		cube_r2.setTextureOffset(0, 39).addBox(-16.0F, -1.0F, -15.625F, 36.0F, 5.0F, 32.0F, 0.0F, false);

		DoorR = new ModelRenderer(this);
		DoorR.setRotationPoint(13.1875F, 4.2188F, 14.2813F);
		Chassis.addChild(DoorR);
		DoorR.setTextureOffset(0, 0).addBox(1.0F, -5.5F, -13.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.375F, 28.5F, 2.0F);
		DoorR.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -1.5708F, 0.0F);
		cube_r3.setTextureOffset(0, 165).addBox(-16.0F, -51.0F, -1.375F, 14.0F, 51.0F, 1.0F, 0.0F, false);

		DoorL = new ModelRenderer(this);
		DoorL.setRotationPoint(13.1875F, 4.2188F, -13.7188F);
		Chassis.addChild(DoorL);
		DoorL.setTextureOffset(0, 7).addBox(1.0F, -4.5F, 2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.375F, 28.5F, 2.0F);
		DoorL.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -1.5708F, 0.0F);
		cube_r4.setTextureOffset(174, 174).addBox(-2.0F, -51.0F, -1.375F, 14.0F, 51.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(ExteriorTile tile, float v, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float v1) {
		EnumDoorState state = tile.getOpen();
		matrixStack.push();
		matrixStack.translate(0.0D, 0.55, 0.0D);
		matrixStack.scale(0.65F, 0.65F, 0.65F);
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
		Chassis.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
	}

	@Override
	public void renderBones(ExteriorTile exteriorTile, float v, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v1) {

	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}