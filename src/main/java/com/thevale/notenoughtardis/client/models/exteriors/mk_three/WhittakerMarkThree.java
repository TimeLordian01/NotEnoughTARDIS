package com.thevale.notenoughtardis.client.models.exteriors.mk_three;// Made with Blockbench 4.1.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.notenoughtardis.util.EnumDoorTypes;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.tardis.mod.client.models.exteriors.ExteriorModel;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class WhittakerMarkThree extends ExteriorModel {
	private final ModelRenderer LeftDoor;
	private final ModelRenderer RightDoor;
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public WhittakerMarkThree() {
		textureWidth = 512;
		textureHeight = 512;

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setRotationPoint(-16.9167F, -18.2308F, -22.0167F);
		LeftDoor.setTextureOffset(240, 286).addBox(-0.0833F, -37.7692F, 0.0167F, 2.0F, 74.0F, 1.0F, 0.0F, false);
		LeftDoor.setTextureOffset(234, 286).addBox(14.9167F, -37.7692F, 0.0167F, 2.0F, 74.0F, 1.0F, 0.0F, false);
		LeftDoor.setTextureOffset(28, 0).addBox(1.9167F, -12.2692F, -0.4833F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.setTextureOffset(78, 278).addBox(15.9167F, -37.7692F, -0.9833F, 2.0F, 74.0F, 1.0F, 0.0F, false);
		LeftDoor.setTextureOffset(132, 132).addBox(1.9167F, 33.2308F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.setTextureOffset(0, 124).addBox(1.9167F, 18.2308F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.setTextureOffset(132, 128).addBox(1.9167F, 15.2308F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.setTextureOffset(0, 108).addBox(1.9167F, 0.2308F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.setTextureOffset(132, 124).addBox(1.9167F, -2.7692F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.setTextureOffset(0, 89).addBox(1.9167F, -17.7692F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		LeftDoor.setTextureOffset(132, 120).addBox(1.9167F, -20.7692F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		LeftDoor.setTextureOffset(132, 139).addBox(1.9167F, -37.7692F, 0.0167F, 13.0F, 2.0F, 1.0F, 0.0F, false);
		LeftDoor.setTextureOffset(0, 73).addBox(1.9167F, -35.7692F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);

		RightDoor = new ModelRenderer(this);
		RightDoor.setRotationPoint(16.9167F, -18.1667F, -22.0167F);
		RightDoor.setTextureOffset(155, 286).addBox(-16.9167F, -37.8333F, 0.0167F, 2.0F, 74.0F, 1.0F, 0.0F, false);
		RightDoor.setTextureOffset(84, 278).addBox(-1.9167F, -37.8333F, 0.0167F, 2.0F, 74.0F, 1.0F, 0.0F, false);
		RightDoor.setTextureOffset(132, 116).addBox(-14.9167F, 33.1667F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.setTextureOffset(0, 57).addBox(-14.9167F, 18.1667F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.setTextureOffset(132, 112).addBox(-14.9167F, 15.1667F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.setTextureOffset(0, 32).addBox(-14.9167F, 0.1667F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.setTextureOffset(132, 108).addBox(-14.9167F, -2.8333F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.setTextureOffset(0, 16).addBox(-14.9167F, -17.8333F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.setTextureOffset(0, 48).addBox(-14.9167F, -20.8333F, 0.0167F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		RightDoor.setTextureOffset(132, 136).addBox(-14.9167F, -37.8333F, 0.0167F, 13.0F, 2.0F, 1.0F, 0.0F, false);
		RightDoor.setTextureOffset(0, 0).addBox(-14.9167F, -35.8333F, 0.5167F, 13.0F, 15.0F, 1.0F, 0.0F, false);
		RightDoor.setTextureOffset(28, 6).addBox(-15.9167F, -12.3333F, -0.9833F, 1.0F, 5.0F, 1.0F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(0, 0).addBox(-26.0F, -5.0F, -26.0F, 52.0F, 5.0F, 52.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 57).addBox(-25.0F, -6.0F, -25.0F, 50.0F, 1.0F, 50.0F, 0.0F, false);
		bb_main.setTextureOffset(72, 157).addBox(-24.0F, -88.0F, -24.0F, 6.0F, 82.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(270, 286).addBox(17.0F, -80.0F, -23.0F, 1.0F, 74.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(266, 286).addBox(-18.0F, -80.0F, -23.0F, 1.0F, 74.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(90, 157).addBox(-18.0F, -81.0F, -23.0F, 36.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 108).addBox(-22.0F, -92.0F, -22.0F, 44.0F, 5.0F, 44.0F, 0.0F, false);
		bb_main.setTextureOffset(132, 108).addBox(-18.0F, -95.0F, -18.0F, 36.0F, 3.0F, 36.0F, 0.0F, false);
		bb_main.setTextureOffset(232, 0).addBox(-21.0F, -87.0F, -26.0F, 42.0F, 6.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(48, 157).addBox(18.0F, -88.0F, -24.0F, 6.0F, 82.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(42, 278).addBox(-22.0F, -80.0F, 15.0F, 1.0F, 74.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(36, 278).addBox(-22.0F, -80.0F, 0.0F, 1.0F, 74.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(30, 278).addBox(-23.0F, -80.0F, -1.0F, 1.0F, 74.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(236, 253).addBox(-22.0F, -9.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		bb_main.setTextureOffset(228, 147).addBox(-21.5F, -24.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		bb_main.setTextureOffset(62, 245).addBox(-22.0F, -27.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		bb_main.setTextureOffset(204, 225).addBox(-21.5F, -42.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 245).addBox(-22.0F, -45.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		bb_main.setTextureOffset(172, 210).addBox(-21.5F, -60.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		bb_main.setTextureOffset(128, 240).addBox(-22.0F, -63.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		bb_main.setTextureOffset(160, 255).addBox(-22.0F, -80.0F, -15.0F, 1.0F, 2.0F, 30.0F, 0.0F, false);
		bb_main.setTextureOffset(96, 210).addBox(-21.5F, -78.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		bb_main.setTextureOffset(24, 278).addBox(-22.0F, -80.0F, -2.0F, 1.0F, 74.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(18, 278).addBox(-22.0F, -80.0F, -17.0F, 1.0F, 74.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(262, 286).addBox(-23.0F, -80.0F, -18.0F, 1.0F, 74.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(96, 159).addBox(-23.0F, -81.0F, -18.0F, 1.0F, 1.0F, 36.0F, 0.0F, false);
		bb_main.setTextureOffset(258, 286).addBox(-23.0F, -80.0F, 17.0F, 1.0F, 74.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(254, 286).addBox(-18.0F, -80.0F, 22.0F, 1.0F, 74.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(150, 105).addBox(-18.0F, -81.0F, 22.0F, 36.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(250, 286).addBox(17.0F, -80.0F, 22.0F, 1.0F, 74.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(246, 286).addBox(22.0F, -80.0F, 17.0F, 1.0F, 74.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(156, 0).addBox(22.0F, -81.0F, -18.0F, 1.0F, 1.0F, 36.0F, 0.0F, false);
		bb_main.setTextureOffset(90, 278).addBox(22.0F, -80.0F, -18.0F, 1.0F, 74.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(24, 157).addBox(-24.0F, -88.0F, 18.0F, 6.0F, 82.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 157).addBox(18.0F, -88.0F, 18.0F, 6.0F, 82.0F, 6.0F, 0.0F, false);
		bb_main.setTextureOffset(150, 57).addBox(-26.0F, -87.0F, -21.0F, 4.0F, 6.0F, 42.0F, 0.0F, false);
		bb_main.setTextureOffset(204, 210).addBox(-21.0F, -87.0F, 22.0F, 42.0F, 6.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(134, 147).addBox(22.0F, -87.0F, -21.0F, 4.0F, 6.0F, 42.0F, 0.0F, false);
		bb_main.setTextureOffset(28, 64).addBox(19.0F, -91.0F, -23.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(28, 57).addBox(-23.0F, -91.0F, -23.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(28, 40).addBox(-23.0F, -91.0F, 19.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(28, 33).addBox(19.0F, -91.0F, 19.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);
		bb_main.setTextureOffset(72, 278).addBox(-17.0F, -80.0F, 21.0F, 2.0F, 74.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(66, 278).addBox(-2.0F, -80.0F, 21.0F, 2.0F, 74.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(260, 147).addBox(-15.0F, -78.0F, 20.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(232, 10).addBox(-15.0F, -80.0F, 21.0F, 30.0F, 2.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(204, 220).addBox(-15.0F, -63.0F, 21.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(258, 192).addBox(-15.0F, -60.0F, 20.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(96, 204).addBox(-15.0F, -45.0F, 21.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(232, 55).addBox(-15.0F, -42.0F, 20.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(96, 200).addBox(-15.0F, -27.0F, 21.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(184, 147).addBox(-15.0F, -24.0F, 20.5F, 30.0F, 15.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(96, 196).addBox(-15.0F, -9.0F, 21.0F, 30.0F, 3.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(60, 278).addBox(-1.0F, -80.0F, 22.0F, 2.0F, 74.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(54, 278).addBox(0.0F, -80.0F, 21.0F, 2.0F, 74.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(48, 278).addBox(15.0F, -80.0F, 21.0F, 2.0F, 74.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(12, 278).addBox(21.0F, -80.0F, 15.0F, 1.0F, 74.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(6, 278).addBox(21.0F, -80.0F, 0.0F, 1.0F, 74.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(200, 52).addBox(20.5F, -78.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		bb_main.setTextureOffset(94, 255).addBox(21.0F, -80.0F, -15.0F, 1.0F, 2.0F, 30.0F, 0.0F, false);
		bb_main.setTextureOffset(240, 108).addBox(21.0F, -63.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		bb_main.setTextureOffset(200, 7).addBox(20.5F, -60.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		bb_main.setTextureOffset(236, 220).addBox(21.0F, -45.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		bb_main.setTextureOffset(196, 165).addBox(20.5F, -42.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		bb_main.setTextureOffset(232, 75).addBox(21.0F, -27.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		bb_main.setTextureOffset(140, 195).addBox(20.5F, -24.0F, -15.0F, 1.0F, 15.0F, 30.0F, 0.0F, false);
		bb_main.setTextureOffset(232, 22).addBox(21.0F, -9.0F, -15.0F, 1.0F, 3.0F, 30.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 278).addBox(22.0F, -80.0F, -1.0F, 1.0F, 74.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(228, 270).addBox(21.0F, -80.0F, -2.0F, 1.0F, 74.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(222, 270).addBox(21.0F, -80.0F, -17.0F, 1.0F, 74.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.7854F, 0.0F);
		cube_r1.setTextureOffset(28, 71).addBox(-2.5F, -102.0F, -0.5F, 5.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.7854F, 0.0F);
		cube_r2.setTextureOffset(28, 77).addBox(-2.5F, -102.0F, -0.5F, 5.0F, 5.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(28, 17).addBox(-2.0F, -102.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		cube_r2.setTextureOffset(28, 47).addBox(-2.0F, -104.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r2.setTextureOffset(27, 10).addBox(-3.0F, -103.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		cube_r2.setTextureOffset(27, 26).addBox(-3.0F, -97.0F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		cube_r2.setTextureOffset(28, 0).addBox(-2.5F, -96.0F, -2.5F, 5.0F, 1.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void renderBones(ExteriorTile exteriorTile, float v, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v1) {

	}

	public void render(ExteriorTile tile, float scale, MatrixStack matrixStackIn, IVertexBuilder bufferIn, int combinedLightIn, int combinedOverlayIn, float alpha) {
			EnumDoorState state = tile.getOpen();
			matrixStackIn.push();
			matrixStackIn.translate(0.0D, 0.6, 0.0D);
			matrixStackIn.scale(1.25F, 1.25F, 1.25F);
			switch(state) {
				case ONE:
					this.RightDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.ONE));
					this.LeftDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.CLOSED));
					break;
				case BOTH:
					this.RightDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.ONE));
					this.LeftDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.BOTH));
					break;
				case CLOSED:
					this.RightDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.CLOSED));
					this.LeftDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.CLOSED));
			}
		LeftDoor.render(matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn, 1,1,1,alpha);
		RightDoor.render(matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn, 1,1,1,alpha);
		bb_main.render(matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn, 1,1,1,alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}