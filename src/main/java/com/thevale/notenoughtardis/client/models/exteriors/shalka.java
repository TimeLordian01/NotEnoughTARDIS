package com.thevale.notenoughtardis.client.models.exteriors;// Made with Blockbench 4.1.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.notenoughtardis.tileentities.exteriors.ShalkaTile;
import com.thevale.notenoughtardis.util.EnumDoorTypes;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.tardis.mod.client.models.exteriors.ExteriorModel;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

import java.util.function.Function;

public class shalka extends ExteriorModel {
	private final ModelRenderer right_door;
	private final ModelRenderer left_door;
	private final ModelRenderer base;

	public shalka() {
		textureWidth = 256;
		textureHeight = 256;

		right_door = new ModelRenderer(this);
		right_door.setRotationPoint(9.0F, -2.0F, -11.0F);
		right_door.setTextureOffset(124, 131).addBox(-9.0F, -23.0F, -1.0F, 9.0F, 48.0F, 1.0F, 0.0F, false);
		right_door.setTextureOffset(0, 8).addBox(-8.0F, -8.5F, -1.05F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		right_door.setTextureOffset(0, 0).addBox(-8.0F, -6.0F, -1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		left_door = new ModelRenderer(this);
		left_door.setRotationPoint(-9.0F, -2.0F, -11.0F);
		left_door.setTextureOffset(43, 90).addBox(0.0F, -23.0F, -1.0F, 9.0F, 48.0F, 1.0F, 0.0F, false);
		left_door.setTextureOffset(81, 150).addBox(8.5F, -24.0F, -1.25F, 1.0F, 49.0F, 1.0F, 0.0F, false);

		base = new ModelRenderer(this);
		base.setRotationPoint(0.0F, 20.0F, 0.0F);
		base.setTextureOffset(0, 0).addBox(-14.0F, 3.0F, -14.0F, 28.0F, 1.0F, 28.0F, 0.0F, false);
		base.setTextureOffset(56, 147).addBox(-13.0F, -50.0F, -13.0F, 3.0F, 53.0F, 3.0F, 0.0F, false);
		base.setTextureOffset(145, 131).addBox(10.0F, -50.0F, -13.0F, 3.0F, 53.0F, 3.0F, 0.0F, false);
		base.setTextureOffset(91, 150).addBox(9.0F, -45.0F, -12.0F, 1.0F, 48.0F, 1.0F, 0.0F, false);
		base.setTextureOffset(86, 150).addBox(-10.0F, -45.0F, -12.0F, 1.0F, 48.0F, 1.0F, 0.0F, false);
		base.setTextureOffset(43, 140).addBox(10.0F, -50.0F, 10.0F, 3.0F, 53.0F, 3.0F, 0.0F, false);
		base.setTextureOffset(64, 90).addBox(-13.0F, -50.0F, 10.0F, 3.0F, 53.0F, 3.0F, 0.0F, false);
		base.setTextureOffset(124, 81).addBox(-10.0F, -45.0F, 11.0F, 20.0F, 48.0F, 1.0F, 0.0F, false);
		base.setTextureOffset(0, 90).addBox(-12.0F, -45.0F, -10.0F, 1.0F, 48.0F, 20.0F, 0.0F, false);
		base.setTextureOffset(81, 81).addBox(11.0F, -45.0F, -10.0F, 1.0F, 48.0F, 20.0F, 0.0F, false);
		base.setTextureOffset(0, 30).addBox(-11.0F, -49.0F, -14.0F, 22.0F, 4.0F, 28.0F, 0.0F, false);
		base.setTextureOffset(0, 63).addBox(-14.0F, -49.0F, -11.0F, 28.0F, 4.0F, 22.0F, 0.0F, false);
		base.setTextureOffset(73, 30).addBox(-12.0F, -51.0F, -12.0F, 24.0F, 2.0F, 24.0F, 0.0F, false);
		base.setTextureOffset(79, 57).addBox(-11.0F, -52.0F, -11.0F, 22.0F, 1.0F, 22.0F, 0.0F, false);
		base.setTextureOffset(0, 16).addBox(-1.5F, -57.5F, -1.5F, 3.0F, 5.0F, 3.0F, 0.0F, false);
		base.setTextureOffset(0, 30).addBox(1.7F, -57.75F, -2.7F, 1.0F, 6.0F, 1.0F, -0.25F, false);
		base.setTextureOffset(0, 8).addBox(-3.0F, -58.25F, -3.0F, 6.0F, 1.0F, 6.0F, -0.25F, false);
		base.setTextureOffset(0, 0).addBox(-3.0F, -52.75F, -3.0F, 6.0F, 1.0F, 6.0F, -0.25F, false);
		base.setTextureOffset(23, 16).addBox(-2.7F, -57.75F, -2.7F, 1.0F, 6.0F, 1.0F, -0.25F, false);
		base.setTextureOffset(18, 16).addBox(-2.7F, -57.75F, 1.7F, 1.0F, 6.0F, 1.0F, -0.25F, false);
		base.setTextureOffset(13, 16).addBox(1.7F, -57.75F, 1.7F, 1.0F, 6.0F, 1.0F, -0.25F, false);
		base.setTextureOffset(69, 147).addBox(-12.25F, -46.0F, -0.5F, 1.0F, 49.0F, 1.0F, 0.0F, false);
		base.setTextureOffset(76, 146).addBox(-0.5F, -46.0F, 11.25F, 1.0F, 49.0F, 1.0F, 0.0F, false);
		base.setTextureOffset(146, 0).addBox(11.25F, -46.0F, -0.5F, 1.0F, 49.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {


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
				this.right_door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.ONE));
				this.left_door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.CLOSED));
				break;
			case BOTH:
				this.right_door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.ONE));
				this.left_door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.BOTH));
				break;
			case CLOSED:
				this.right_door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.CLOSED));
				this.left_door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.CLOSED));
		}
		this.right_door.render(matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn, 1, 1, 1, alpha);
		this.left_door.render(matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn, 1, 1, 1, alpha);
		this.base.render(matrixStackIn, bufferIn, combinedLightIn, combinedOverlayIn, 1, 1, 1, alpha);
		matrixStackIn.pop();
	}
}