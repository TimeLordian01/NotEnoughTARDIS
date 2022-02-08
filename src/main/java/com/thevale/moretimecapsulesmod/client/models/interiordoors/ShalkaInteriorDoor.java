package com.thevale.moretimecapsulesmod.client.models.interiordoors;// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import com.thevale.moretimecapsulesmod.client.renders.exteriors.PtoredRender;
import com.thevale.moretimecapsulesmod.client.renders.exteriors.ShalkaRender;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.models.interiordoors.IInteriorDoorRenderer;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.misc.TexVariant;
import net.tardis.mod.tileentities.ConsoleTile;

public class ShalkaInteriorDoor extends EntityModel<Entity> implements IInteriorDoorRenderer {
	private final ModelRenderer Frame;
	private final ModelRenderer Base;
	private final ModelRenderer PCB;
	private final ModelRenderer RightDoor;
	private final ModelRenderer LeftDoor;

	public ShalkaInteriorDoor() {
		textureWidth = 512;
		textureHeight = 512;

		Frame = new ModelRenderer(this);
		Frame.setRotationPoint(0.0F, 24.0F, 0.0F);


		Base = new ModelRenderer(this);
		Base.setRotationPoint(0.0F, 0.0F, 0.0F);
		Frame.addChild(Base);
		Base.setTextureOffset(0, 0).addBox(-10.5F, -1.0F, -8.375F, 21.0F, 1.0F, 4.0F, 0.0F, false);
		Base.setTextureOffset(0, 0).addBox(-10.5F, -42.5F, -8.375F, 21.0F, 1.0F, 4.0F, 0.0F, false);
		Base.setTextureOffset(228, 0).addBox(8.375F, -41.75F, -7.25F, 1.0F, 40.0F, 1.0F, 0.75F, false);
		Base.setTextureOffset(233, 0).addBox(-9.375F, -41.75F, -7.25F, 1.0F, 40.0F, 1.0F, 0.75F, false);
		Base.setTextureOffset(248, 0).addBox(7.75F, -38.5F, -7.125F, 1.0F, 37.0F, 1.0F, 0.5F, false);
		Base.setTextureOffset(272, 0).addBox(-9.25F, -38.5F, -6.625F, 1.0F, 37.0F, 1.0F, 0.5F, false);
		Base.setTextureOffset(252, 0).addBox(8.25F, -38.5F, -6.625F, 1.0F, 37.0F, 1.0F, 0.5F, false);
		Base.setTextureOffset(244, 0).addBox(-8.75F, -38.5F, -7.125F, 1.0F, 37.0F, 1.0F, 0.5F, false);
		Base.setTextureOffset(276, 0).addBox(6.5F, -38.75F, -7.375F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		Base.setTextureOffset(288, 0).addBox(-9.5F, -38.75F, -5.375F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		Base.setTextureOffset(280, 0).addBox(8.5F, -38.75F, -5.375F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		Base.setTextureOffset(276, 0).addBox(-7.5F, -38.75F, -7.375F, 1.0F, 38.0F, 1.0F, -0.25F, false);

		PCB = new ModelRenderer(this);
		PCB.setRotationPoint(0.0F, -1.75F, 0.0F);
		Frame.addChild(PCB);
		PCB.setTextureOffset(421, 14).addBox(-8.0F, -37.25F, -9.25F, 16.0F, 1.0F, 3.0F, -0.25F, false);
		PCB.setTextureOffset(421, 14).addBox(-8.0625F, -39.6875F, -9.3125F, 2.0F, 3.0F, 3.0F, -0.3125F, false);
		PCB.setTextureOffset(421, 14).addBox(6.0625F, -39.6875F, -9.3125F, 2.0F, 3.0F, 3.0F, -0.3125F, false);
		PCB.setTextureOffset(186, 18).addBox(-7.0F, -39.6875F, -7.8125F, 14.0F, 3.0F, 1.0F, -0.3125F, false);
		PCB.setTextureOffset(421, 14).addBox(-8.0F, -40.125F, -9.25F, 16.0F, 1.0F, 3.0F, -0.25F, false);

		RightDoor = new ModelRenderer(this);
		RightDoor.setRotationPoint(7.3221F, 0.4087F, -6.6181F);
		RightDoor.setTextureOffset(292, 0).addBox(-1.8221F, -15.1587F, -0.2569F, 2.0F, 38.0F, 1.0F, -0.25F, false);
		RightDoor.setTextureOffset(331, 6).addBox(-6.9471F, 19.9038F, -0.2569F, 6.0F, 3.0F, 1.0F, -0.3125F, false);
		RightDoor.setTextureOffset(331, 6).addBox(-6.9471F, 11.4038F, -0.2569F, 6.0F, 2.0F, 1.0F, -0.3125F, false);
		RightDoor.setTextureOffset(331, 6).addBox(-6.9471F, 2.9038F, -0.2569F, 6.0F, 2.0F, 1.0F, -0.3125F, false);
		RightDoor.setTextureOffset(331, 6).addBox(-6.9471F, -5.9712F, -0.2569F, 6.0F, 2.0F, 1.0F, -0.3125F, false);
		RightDoor.setTextureOffset(331, 6).addBox(-6.9471F, -14.9712F, -0.2569F, 6.0F, 2.0F, 1.0F, -0.3125F, false);
		RightDoor.setTextureOffset(331, 6).addBox(-5.4471F, -14.0962F, -0.1319F, 1.0F, 9.0F, 1.0F, -0.25F, true);
		RightDoor.setTextureOffset(331, 6).addBox(-3.6971F, -14.0962F, -0.1319F, 1.0F, 9.0F, 1.0F, -0.25F, true);
		RightDoor.setTextureOffset(331, 6).addBox(-7.6971F, -9.9712F, -0.0694F, 7.0F, 1.0F, 1.0F, -0.25F, true);
		RightDoor.setTextureOffset(195, 25).addBox(-7.6971F, -13.7837F, -0.1944F, 7.0F, 9.0F, 1.0F, -0.4375F, false);
		RightDoor.setTextureOffset(385, 15).addBox(-7.5096F, -5.3462F, -0.2569F, 7.0F, 26.0F, 1.0F, -0.4375F, false);
		RightDoor.setTextureOffset(276, 0).addBox(-7.3221F, -15.1587F, -0.2569F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		RightDoor.setTextureOffset(276, 0).addBox(-7.8221F, -15.1587F, -0.2569F, 1.0F, 38.0F, 1.0F, -0.25F, false);

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setRotationPoint(-7.2743F, 0.5451F, -6.6181F);
		LeftDoor.setTextureOffset(292, 0).addBox(-0.2257F, -15.2951F, -0.2569F, 2.0F, 38.0F, 1.0F, -0.25F, false);
		LeftDoor.setTextureOffset(276, 0).addBox(6.7743F, -15.2951F, -0.7569F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		LeftDoor.setTextureOffset(276, 0).addBox(6.2743F, -15.2951F, -0.2569F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		LeftDoor.setTextureOffset(331, 6).addBox(0.8993F, 19.7674F, -0.2569F, 6.0F, 3.0F, 1.0F, -0.3125F, false);
		LeftDoor.setTextureOffset(385, 15).addBox(0.8368F, 3.5174F, -0.2569F, 7.0F, 17.0F, 1.0F, -0.4375F, false);
		LeftDoor.setTextureOffset(331, 6).addBox(0.8993F, 11.2674F, -0.2569F, 6.0F, 2.0F, 1.0F, -0.3125F, false);
		LeftDoor.setTextureOffset(331, 6).addBox(0.8993F, 2.7674F, -0.2569F, 6.0F, 2.0F, 1.0F, -0.3125F, false);
		LeftDoor.setTextureOffset(414, 24).addBox(0.5243F, -4.0451F, -0.2569F, 2.0F, 7.0F, 1.0F, -0.4375F, false);
		LeftDoor.setTextureOffset(216, 18).addBox(1.5243F, -4.0451F, -0.1319F, 5.0F, 7.0F, 1.0F, -0.4375F, false);
		LeftDoor.setTextureOffset(414, 24).addBox(5.5243F, -4.0451F, -0.2569F, 2.0F, 7.0F, 1.0F, -0.4375F, false);
		LeftDoor.setTextureOffset(414, 24).addBox(0.6493F, 2.0799F, -0.2569F, 7.0F, 2.0F, 1.0F, -0.4375F, false);
		LeftDoor.setTextureOffset(195, 25).addBox(0.6493F, -13.9201F, -0.1944F, 7.0F, 9.0F, 1.0F, -0.4375F, false);
		LeftDoor.setTextureOffset(414, 24).addBox(0.6493F, -5.1701F, -0.2569F, 7.0F, 2.0F, 1.0F, -0.4375F, false);
		LeftDoor.setTextureOffset(331, 6).addBox(0.8993F, -6.1076F, -0.2569F, 6.0F, 2.0F, 1.0F, -0.3125F, false);
		LeftDoor.setTextureOffset(331, 6).addBox(0.8993F, -15.1076F, -0.2569F, 6.0F, 2.0F, 1.0F, -0.3125F, false);
		LeftDoor.setTextureOffset(331, 6).addBox(2.6493F, -14.2326F, -0.1319F, 1.0F, 9.0F, 1.0F, -0.25F, false);
		LeftDoor.setTextureOffset(331, 6).addBox(4.3993F, -14.2326F, -0.1319F, 1.0F, 9.0F, 1.0F, -0.25F, false);
		LeftDoor.setTextureOffset(331, 6).addBox(0.6493F, -10.1076F, -0.0694F, 7.0F, 1.0F, 1.0F, -0.25F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(DoorEntity door, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay) {
		EnumDoorState state = door.getOpenState();
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

		this.LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		this.RightDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		this.Frame.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	@Override
	public void renderBones(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1) {

	}

	@Override
	public void renderBoti(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1) {

	}

	@Override
	public ResourceLocation getTexture() {
		ConsoleTile tile = TardisHelper.getConsoleInWorld(Minecraft.getInstance().world).orElse(null);
		ResourceLocation TEXTURE = new ResourceLocation(Moretimecapsulesmod.MODID, "textures/interiordoor/shalkadoor.png");
		return TEXTURE;
	}

	@Override
	public void renderDoorWhenClosed(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, ModelRenderer modelRenderer) {

	}

	@Override
	public void renderDoorWhenClosed(DoorEntity doorEntity, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, ModelRenderer... modelRenderers) {

	}

	@Override
	public boolean doesDoorOpenIntoBotiWindow() {
		return false;
	}

	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {

	}
}