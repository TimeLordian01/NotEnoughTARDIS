package com.thevale.moretimecapsulesmod.client.models.exteriors;// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.tardis.mod.client.models.exteriors.ExteriorModel;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class WardrobeExterior extends ExteriorModel {
	private final ModelRenderer LeftDoor;
	private final ModelRenderer Walls;
	private final ModelRenderer RightDoor;
	private final ModelRenderer boti;

	public WardrobeExterior() {
		textureWidth = 128;
		textureHeight = 128;

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setRotationPoint(-6.2734F, 10.3125F, -3.6016F);
		LeftDoor.setTextureOffset(101, 126).addBox(0.2734F, 10.6875F, 0.0391F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.setTextureOffset(8, 105).addBox(5.2734F, -10.6875F, -0.0234F, 1.0F, 22.0F, 1.0F, 0.001F, false);
		LeftDoor.setTextureOffset(101, 126).addBox(0.2734F, 3.4375F, 0.0391F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.setTextureOffset(101, 126).addBox(0.2734F, -4.1875F, 0.0391F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.setTextureOffset(101, 126).addBox(0.2734F, -11.1875F, -0.0234F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		LeftDoor.setTextureOffset(8, 105).addBox(-0.3516F, -10.6875F, -0.0234F, 1.0F, 22.0F, 1.0F, 0.001F, false);
		LeftDoor.setTextureOffset(48, 111).addBox(5.0234F, -2.1875F, -0.5234F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		LeftDoor.setTextureOffset(30, 105).addBox(0.4609F, -11.1875F, -0.0234F, 6.0F, 22.0F, 1.0F, -0.125F, false);

		Walls = new ModelRenderer(this);
		Walls.setRotationPoint(7.5F, 1.0F, 2.0F);
		Walls.setTextureOffset(46, 120).addBox(-15.5F, 21.5F, -6.5F, 2.0F, 2.0F, 2.0F, -0.5F, false);
		Walls.setTextureOffset(46, 120).addBox(-15.5F, 21.5F, 0.5F, 2.0F, 2.0F, 2.0F, -0.5F, false);
		Walls.setTextureOffset(46, 120).addBox(-1.5F, 21.5F, -6.5F, 2.0F, 2.0F, 2.0F, -0.5F, false);
		Walls.setTextureOffset(46, 120).addBox(-1.5F, 21.5F, 0.5F, 2.0F, 2.0F, 2.0F, -0.5F, false);
		Walls.setTextureOffset(46, 116).addBox(-16.0F, 20.625F, -7.0F, 17.0F, 2.0F, 10.0F, -0.5F, false);
		Walls.setTextureOffset(46, 105).addBox(-16.0F, -4.0F, -7.0F, 17.0F, 2.0F, 10.0F, -0.5F, false);
		Walls.setTextureOffset(48, 86).addBox(-13.5F, -3.875F, -6.0F, 12.0F, 1.0F, 8.0F, 0.0F, false);
		Walls.setTextureOffset(47, 95).addBox(-15.5F, 20.4375F, -6.5F, 16.0F, 2.0F, 9.0F, -0.5F, false);
		Walls.setTextureOffset(48, 106).addBox(-15.5F, -3.375F, -6.5F, 16.0F, 2.0F, 9.0F, -0.5F, false);
		Walls.setTextureOffset(0, 102).addBox(-1.25F, -3.375F, -5.75F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		Walls.setTextureOffset(48, 117).addBox(-1.625F, -2.375F, -5.6875F, 1.0F, 1.0F, 1.0F, 0.01F, false);
		Walls.setTextureOffset(48, 117).addBox(-1.625F, 20.625F, -5.6875F, 1.0F, 1.0F, 1.0F, 0.01F, false);
		Walls.setTextureOffset(48, 117).addBox(-14.375F, -2.375F, -5.6875F, 1.0F, 1.0F, 1.0F, 0.01F, false);
		Walls.setTextureOffset(48, 117).addBox(-14.375F, 20.625F, -5.6875F, 1.0F, 1.0F, 1.0F, 0.01F, false);
		Walls.setTextureOffset(0, 102).addBox(-14.75F, -3.375F, -5.75F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		Walls.setTextureOffset(0, 102).addBox(-1.25F, -3.375F, 0.75F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		Walls.setTextureOffset(0, 102).addBox(-14.75F, -3.375F, 0.75F, 1.0F, 25.0F, 1.0F, 0.0F, false);
		Walls.setTextureOffset(14, 98).addBox(-14.375F, -2.375F, -5.0F, 1.0F, 24.0F, 6.0F, 0.0F, false);
		Walls.setTextureOffset(14, 98).addBox(-1.625F, -2.375F, -5.0F, 1.0F, 24.0F, 6.0F, 0.0F, false);
		Walls.setTextureOffset(0, 73).addBox(-14.0F, -2.375F, 0.5F, 13.0F, 23.0F, 1.0F, 0.0F, false);
		Walls.setTextureOffset(4, 103).addBox(-1.875F, -2.375F, 0.625F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		Walls.setTextureOffset(4, 103).addBox(-14.125F, -2.375F, 0.625F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		Walls.setTextureOffset(4, 103).addBox(-8.0F, -2.375F, 0.625F, 1.0F, 24.0F, 1.0F, 0.0F, false);
		Walls.setTextureOffset(101, 124).addBox(-13.5F, 20.0F, 0.5625F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		Walls.setTextureOffset(101, 124).addBox(-13.5F, -1.875F, 0.5625F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		Walls.setTextureOffset(101, 124).addBox(-13.5F, 5.125F, 0.5625F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		Walls.setTextureOffset(101, 124).addBox(-13.5F, 12.75F, 0.5625F, 12.0F, 1.0F, 1.0F, 0.0F, false);
		Walls.setTextureOffset(101, 117).addBox(-14.5F, 12.75F, -5.0F, 1.0F, 1.0F, 6.0F, 0.01F, false);
		Walls.setTextureOffset(101, 117).addBox(-1.5F, 12.75F, -5.0F, 1.0F, 1.0F, 6.0F, 0.01F, false);
		Walls.setTextureOffset(101, 117).addBox(-14.5F, 5.125F, -5.0F, 1.0F, 1.0F, 6.0F, 0.01F, false);
		Walls.setTextureOffset(101, 117).addBox(-1.5F, 5.125F, -5.0F, 1.0F, 1.0F, 6.0F, 0.01F, false);
		Walls.setTextureOffset(101, 117).addBox(-14.5F, -1.875F, -5.0F, 1.0F, 1.0F, 6.0F, 0.01F, false);
		Walls.setTextureOffset(101, 117).addBox(-1.5F, -1.875F, -5.0F, 1.0F, 1.0F, 6.0F, 0.01F, false);

		RightDoor = new ModelRenderer(this);
		RightDoor.setRotationPoint(6.2734F, 11.1875F, -3.6016F);
		RightDoor.setTextureOffset(101, 126).addBox(-6.2734F, 9.8125F, 0.0391F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		RightDoor.setTextureOffset(8, 105).addBox(-6.2734F, -11.5625F, -0.0234F, 1.0F, 22.0F, 1.0F, 0.001F, false);
		RightDoor.setTextureOffset(101, 126).addBox(-6.2734F, 2.5625F, 0.0391F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		RightDoor.setTextureOffset(101, 126).addBox(-6.2734F, -5.0625F, 0.0391F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		RightDoor.setTextureOffset(101, 126).addBox(-6.2734F, -12.0625F, -0.0234F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		RightDoor.setTextureOffset(8, 105).addBox(-0.6484F, -11.5625F, -0.0234F, 1.0F, 22.0F, 1.0F, 0.001F, false);
		RightDoor.setTextureOffset(48, 111).addBox(-6.0234F, -3.0625F, -0.5234F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		RightDoor.setTextureOffset(30, 105).addBox(-6.4609F, -12.0625F, -0.0234F, 6.0F, 22.0F, 1.0F, -0.125F, false);

		boti = new ModelRenderer(this);
		boti.setRotationPoint(0.0F, 24.0F, 0.0F);
		boti.setTextureOffset(0, 0).addBox(-7.0F, -25.0F, -3.0F, 13.0F, 23.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(ExteriorTile tile, float v, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float v1) {
		matrixStack.push();
		EnumDoorState state = tile.getOpen();
		matrixStack.translate(0.0D, -0.75D, 0.0D);
		matrixStack.scale(1.5F, 1.5F, 1.5F);
		switch (state) {
			case ONE:
				this.RightDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.ONE));
				this.LeftDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.CLOSED));
				break;
			case BOTH:
				this.RightDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.ONE));
				this.LeftDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.BOTH));
				break;
			case CLOSED:
				this.RightDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.CLOSED));
				this.LeftDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.CLOSED));
		}
		LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		Walls.render(matrixStack, buffer, packedLight, packedOverlay);
		RightDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		boti.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.pop();
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
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