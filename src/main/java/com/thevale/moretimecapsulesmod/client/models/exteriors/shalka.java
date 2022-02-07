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

public class shalka extends ExteriorModel {
	private final ModelRenderer Shell;
	private final ModelRenderer Base;
	private final ModelRenderer PCB;
	private final ModelRenderer PCB2;
	private final ModelRenderer PCB3;
	private final ModelRenderer PCB4;
	private final ModelRenderer Walls1;
	private final ModelRenderer Right2;
	private final ModelRenderer Left2;
	private final ModelRenderer Walls2;
	private final ModelRenderer Right3;
	private final ModelRenderer Left3;
	private final ModelRenderer Walls3;
	private final ModelRenderer Right4;
	private final ModelRenderer Left4;
	private final ModelRenderer LeftDoor;
	private final ModelRenderer RightDoor;
	private final ModelRenderer boti;

	public shalka() {
		textureWidth = 512;
		textureHeight = 512;

		Shell = new ModelRenderer(this);
		Shell.setRotationPoint(0.0F, 24.0F, 0.0F);


		Base = new ModelRenderer(this);
		Base.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Base);
		Base.setTextureOffset(0, 0).addBox(-10.5F, -1.0F, -10.5F, 21.0F, 1.0F, 21.0F, 0.0F, false);
		Base.setTextureOffset(84, 0).addBox(-9.5F, -43.625F, -9.5F, 19.0F, 2.0F, 19.0F, 0.0F, false);
		Base.setTextureOffset(160, 0).addBox(-8.5F, -44.625F, -8.5F, 17.0F, 1.0F, 17.0F, 0.0F, false);
		Base.setTextureOffset(394, 25).addBox(-2.0F, -45.375F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		Base.setTextureOffset(394, 25).addBox(-2.0F, -50.125F, -2.0F, 4.0F, 1.0F, 4.0F, -0.125F, false);
		Base.setTextureOffset(394, 25).addBox(1.0F, -49.375F, -2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Base.setTextureOffset(196, 49).addBox(-1.5F, -49.375F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		Base.setTextureOffset(394, 25).addBox(-2.0F, -49.375F, -2.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Base.setTextureOffset(394, 25).addBox(-2.0F, -49.375F, 1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Base.setTextureOffset(394, 25).addBox(1.0F, -49.375F, 1.0F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		Base.setTextureOffset(228, 0).addBox(8.375F, -41.75F, -9.375F, 1.0F, 40.0F, 1.0F, 0.75F, false);
		Base.setTextureOffset(233, 0).addBox(-9.375F, -41.75F, -9.375F, 1.0F, 40.0F, 1.0F, 0.75F, false);
		Base.setTextureOffset(236, 0).addBox(-9.375F, -41.75F, 8.375F, 1.0F, 40.0F, 1.0F, 0.75F, false);
		Base.setTextureOffset(240, 0).addBox(8.375F, -41.75F, 8.375F, 1.0F, 40.0F, 1.0F, 0.75F, false);
		Base.setTextureOffset(248, 0).addBox(7.75F, -38.5F, -9.25F, 1.0F, 37.0F, 1.0F, 0.5F, false);
		Base.setTextureOffset(272, 0).addBox(-9.25F, -38.5F, -8.75F, 1.0F, 37.0F, 1.0F, 0.5F, false);
		Base.setTextureOffset(264, 0).addBox(-8.75F, -38.5F, 8.25F, 1.0F, 37.0F, 1.0F, 0.5F, false);
		Base.setTextureOffset(256, 0).addBox(8.25F, -38.5F, 7.75F, 1.0F, 37.0F, 1.0F, 0.5F, false);
		Base.setTextureOffset(252, 0).addBox(8.25F, -38.5F, -8.75F, 1.0F, 37.0F, 1.0F, 0.5F, false);
		Base.setTextureOffset(244, 0).addBox(-8.75F, -38.5F, -9.25F, 1.0F, 37.0F, 1.0F, 0.5F, false);
		Base.setTextureOffset(268, 0).addBox(-9.25F, -38.5F, 7.75F, 1.0F, 37.0F, 1.0F, 0.5F, false);
		Base.setTextureOffset(260, 0).addBox(7.75F, -38.5F, 8.25F, 1.0F, 37.0F, 1.0F, 0.5F, false);
		Base.setTextureOffset(276, 0).addBox(6.5F, -38.75F, -9.5F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		Base.setTextureOffset(288, 0).addBox(-9.5F, -38.75F, -7.5F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		Base.setTextureOffset(284, 0).addBox(-7.5F, -38.75F, 8.5F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		Base.setTextureOffset(280, 0).addBox(8.5F, -38.75F, 6.5F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		Base.setTextureOffset(280, 0).addBox(8.5F, -38.75F, -7.5F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		Base.setTextureOffset(276, 0).addBox(-7.5F, -38.75F, -9.5F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		Base.setTextureOffset(288, 0).addBox(-9.5F, -38.75F, 6.5F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		Base.setTextureOffset(284, 0).addBox(6.5F, -38.75F, 8.5F, 1.0F, 38.0F, 1.0F, -0.25F, false);

		PCB = new ModelRenderer(this);
		PCB.setRotationPoint(0.0F, -1.75F, 0.0F);
		Shell.addChild(PCB);
		PCB.setTextureOffset(421, 14).addBox(-8.0F, -37.25F, -11.375F, 16.0F, 1.0F, 3.0F, -0.25F, false);
		PCB.setTextureOffset(421, 14).addBox(-8.0625F, -39.6875F, -11.4375F, 2.0F, 3.0F, 3.0F, -0.3125F, false);
		PCB.setTextureOffset(421, 14).addBox(6.0625F, -39.6875F, -11.4375F, 2.0F, 3.0F, 3.0F, -0.3125F, false);
		PCB.setTextureOffset(186, 18).addBox(-7.0F, -39.6875F, -10.8125F, 14.0F, 3.0F, 1.0F, -0.3125F, false);
		PCB.setTextureOffset(421, 14).addBox(-8.0F, -40.125F, -11.375F, 16.0F, 1.0F, 3.0F, -0.25F, false);

		PCB2 = new ModelRenderer(this);
		PCB2.setRotationPoint(0.0F, -1.75F, 0.0F);
		Shell.addChild(PCB2);
		PCB2.setTextureOffset(421, 14).addBox(-11.375F, -37.25F, -8.0F, 3.0F, 1.0F, 16.0F, -0.25F, false);
		PCB2.setTextureOffset(421, 14).addBox(-11.4375F, -39.6875F, 6.0625F, 3.0F, 3.0F, 2.0F, -0.3125F, false);
		PCB2.setTextureOffset(421, 14).addBox(-11.4375F, -39.6875F, -8.0625F, 3.0F, 3.0F, 2.0F, -0.3125F, false);
		PCB2.setTextureOffset(198, 22).addBox(-10.8125F, -39.6875F, -7.0F, 1.0F, 3.0F, 14.0F, -0.3125F, false);
		PCB2.setTextureOffset(421, 14).addBox(-11.375F, -40.125F, -8.0F, 3.0F, 1.0F, 16.0F, -0.25F, false);

		PCB3 = new ModelRenderer(this);
		PCB3.setRotationPoint(0.0F, -1.75F, 0.0F);
		Shell.addChild(PCB3);
		PCB3.setTextureOffset(421, 14).addBox(-8.0F, -37.25F, 8.375F, 16.0F, 1.0F, 3.0F, -0.25F, false);
		PCB3.setTextureOffset(421, 14).addBox(6.0625F, -39.6875F, 8.4375F, 2.0F, 3.0F, 3.0F, -0.3125F, false);
		PCB3.setTextureOffset(421, 14).addBox(-8.0625F, -39.6875F, 8.4375F, 2.0F, 3.0F, 3.0F, -0.3125F, false);
		PCB3.setTextureOffset(186, 18).addBox(-7.0F, -39.6875F, 9.8125F, 14.0F, 3.0F, 1.0F, -0.3125F, false);
		PCB3.setTextureOffset(421, 14).addBox(-8.0F, -40.125F, 8.375F, 16.0F, 1.0F, 3.0F, -0.25F, false);

		PCB4 = new ModelRenderer(this);
		PCB4.setRotationPoint(0.0F, -1.75F, 0.0F);
		Shell.addChild(PCB4);
		PCB4.setTextureOffset(421, 14).addBox(8.375F, -37.25F, -8.0F, 3.0F, 1.0F, 16.0F, -0.25F, false);
		PCB4.setTextureOffset(421, 14).addBox(8.4375F, -39.6875F, -8.0625F, 3.0F, 3.0F, 2.0F, -0.3125F, false);
		PCB4.setTextureOffset(421, 14).addBox(8.4375F, -39.6875F, 6.0625F, 3.0F, 3.0F, 2.0F, -0.3125F, false);
		PCB4.setTextureOffset(198, 22).addBox(9.8125F, -39.6875F, -7.0F, 1.0F, 3.0F, 14.0F, -0.3125F, false);
		PCB4.setTextureOffset(421, 14).addBox(8.375F, -40.125F, -8.0F, 3.0F, 1.0F, 16.0F, -0.25F, false);

		Walls1 = new ModelRenderer(this);
		Walls1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Walls1);
		Walls1.setTextureOffset(331, 6).addBox(-8.8125F, -33.5625F, -6.625F, 1.0F, 1.0F, 7.0F, -0.25F, true);
		Walls1.setTextureOffset(331, 6).addBox(-8.8125F, -33.5625F, -6.625F, 1.0F, 1.0F, 7.0F, -0.25F, true);
		Walls1.setTextureOffset(331, 6).addBox(-8.75F, -37.6875F, -2.875F, 1.0F, 9.0F, 1.0F, -0.25F, true);
		Walls1.setTextureOffset(331, 6).addBox(-8.75F, -37.6875F, -2.875F, 1.0F, 9.0F, 1.0F, -0.25F, true);
		Walls1.setTextureOffset(331, 6).addBox(-8.75F, -37.6875F, -4.625F, 1.0F, 9.0F, 1.0F, -0.25F, true);
		Walls1.setTextureOffset(331, 6).addBox(-8.75F, -37.6875F, -4.625F, 1.0F, 9.0F, 1.0F, -0.25F, true);
		Walls1.setTextureOffset(331, 6).addBox(-8.75F, -37.6875F, 1.875F, 1.0F, 9.0F, 1.0F, -0.25F, false);
		Walls1.setTextureOffset(331, 6).addBox(-8.75F, -37.6875F, 1.875F, 1.0F, 9.0F, 1.0F, -0.25F, false);
		Walls1.setTextureOffset(331, 6).addBox(-8.8125F, -33.5625F, -0.375F, 1.0F, 1.0F, 7.0F, -0.25F, false);
		Walls1.setTextureOffset(331, 6).addBox(-8.8125F, -33.5625F, -0.375F, 1.0F, 1.0F, 7.0F, -0.25F, false);
		Walls1.setTextureOffset(331, 6).addBox(-8.75F, -37.6875F, 3.625F, 1.0F, 9.0F, 1.0F, -0.25F, false);
		Walls1.setTextureOffset(331, 6).addBox(-8.75F, -37.6875F, 3.625F, 1.0F, 9.0F, 1.0F, -0.25F, false);

		Right2 = new ModelRenderer(this);
		Right2.setRotationPoint(7.2344F, -22.8438F, -8.7396F);
		Walls1.addChild(Right2);
		Right2.setTextureOffset(310, 0).addBox(-16.2344F, -15.9063F, 1.2396F, 1.0F, 38.0F, 2.0F, -0.25F, false);
		Right2.setTextureOffset(331, 6).addBox(-16.2344F, 19.1563F, 2.3646F, 1.0F, 3.0F, 6.0F, -0.3125F, false);
		Right2.setTextureOffset(331, 6).addBox(-16.2344F, 10.6563F, 2.3646F, 1.0F, 2.0F, 6.0F, -0.3125F, false);
		Right2.setTextureOffset(331, 6).addBox(-16.2344F, 2.1563F, 2.3646F, 1.0F, 2.0F, 6.0F, -0.3125F, false);
		Right2.setTextureOffset(331, 6).addBox(-16.1719F, -6.7188F, 2.3646F, 1.0F, 2.0F, 6.0F, -0.3125F, false);
		Right2.setTextureOffset(331, 6).addBox(-16.2344F, -15.7188F, 2.3646F, 1.0F, 2.0F, 6.0F, -0.3125F, false);
		Right2.setTextureOffset(196, 40).addBox(-16.1094F, -14.5313F, 2.1146F, 1.0F, 9.0F, 7.0F, -0.4375F, false);
		Right2.setTextureOffset(497, 7).addBox(-16.2344F, -6.0938F, 1.9271F, 1.0F, 26.0F, 7.0F, -0.4375F, false);
		Right2.setTextureOffset(288, 0).addBox(-16.2344F, -15.9063F, 7.7396F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		Right2.setTextureOffset(288, 0).addBox(-16.2344F, -15.9063F, 8.2396F, 1.0F, 38.0F, 1.0F, -0.25F, false);

		Left2 = new ModelRenderer(this);
		Left2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls1.addChild(Left2);
		Left2.setTextureOffset(310, 0).addBox(-9.0F, -38.75F, 5.5F, 1.0F, 38.0F, 2.0F, -0.25F, false);
		Left2.setTextureOffset(288, 0).addBox(-9.5F, -38.75F, -0.5F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		Left2.setTextureOffset(288, 0).addBox(-9.0F, -38.75F, 0.0F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		Left2.setTextureOffset(331, 6).addBox(-9.0F, -3.6875F, 0.375F, 1.0F, 3.0F, 6.0F, -0.3125F, false);
		Left2.setTextureOffset(462, 8).addBox(-9.0F, -28.9375F, -0.5625F, 1.0F, 26.0F, 7.0F, -0.4375F, false);
		Left2.setTextureOffset(331, 6).addBox(-9.0F, -12.1875F, 0.375F, 1.0F, 2.0F, 6.0F, -0.3125F, false);
		Left2.setTextureOffset(331, 6).addBox(-9.0F, -20.6875F, 0.375F, 1.0F, 2.0F, 6.0F, -0.3125F, false);
		Left2.setTextureOffset(196, 40).addBox(-8.875F, -37.375F, -0.375F, 1.0F, 9.0F, 7.0F, -0.4375F, false);
		Left2.setTextureOffset(331, 6).addBox(-8.9375F, -29.5625F, 0.375F, 1.0F, 2.0F, 6.0F, -0.3125F, false);
		Left2.setTextureOffset(331, 6).addBox(-9.0F, -38.5625F, 0.375F, 1.0F, 2.0F, 6.0F, -0.3125F, false);

		Walls2 = new ModelRenderer(this);
		Walls2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Walls2);
		Walls2.setTextureOffset(331, 6).addBox(-6.625F, -33.5625F, 7.8125F, 7.0F, 1.0F, 1.0F, -0.25F, true);
		Walls2.setTextureOffset(331, 6).addBox(-6.625F, -33.5625F, 7.8125F, 7.0F, 1.0F, 1.0F, -0.25F, true);
		Walls2.setTextureOffset(331, 6).addBox(-2.875F, -37.6875F, 7.75F, 1.0F, 9.0F, 1.0F, -0.25F, true);
		Walls2.setTextureOffset(331, 6).addBox(-2.875F, -37.6875F, 7.75F, 1.0F, 9.0F, 1.0F, -0.25F, true);
		Walls2.setTextureOffset(331, 6).addBox(-4.625F, -37.6875F, 7.75F, 1.0F, 9.0F, 1.0F, -0.25F, true);
		Walls2.setTextureOffset(331, 6).addBox(-4.625F, -37.6875F, 7.75F, 1.0F, 9.0F, 1.0F, -0.25F, true);
		Walls2.setTextureOffset(331, 6).addBox(1.875F, -37.6875F, 7.75F, 1.0F, 9.0F, 1.0F, -0.25F, false);
		Walls2.setTextureOffset(331, 6).addBox(1.875F, -37.6875F, 7.75F, 1.0F, 9.0F, 1.0F, -0.25F, false);
		Walls2.setTextureOffset(331, 6).addBox(-0.375F, -33.5625F, 7.8125F, 7.0F, 1.0F, 1.0F, -0.25F, false);
		Walls2.setTextureOffset(331, 6).addBox(-0.375F, -33.5625F, 7.8125F, 7.0F, 1.0F, 1.0F, -0.25F, false);
		Walls2.setTextureOffset(331, 6).addBox(3.625F, -37.6875F, 7.75F, 1.0F, 9.0F, 1.0F, -0.25F, false);
		Walls2.setTextureOffset(331, 6).addBox(3.625F, -37.6875F, 7.75F, 1.0F, 9.0F, 1.0F, -0.25F, false);

		Right3 = new ModelRenderer(this);
		Right3.setRotationPoint(7.2344F, -22.8438F, -8.7396F);
		Walls2.addChild(Right3);
		Right3.setTextureOffset(304, 0).addBox(-14.7344F, -15.9063F, 16.7396F, 2.0F, 38.0F, 1.0F, -0.25F, false);
		Right3.setTextureOffset(331, 6).addBox(-13.6094F, 19.1563F, 16.7396F, 6.0F, 3.0F, 1.0F, -0.3125F, false);
		Right3.setTextureOffset(331, 6).addBox(-13.6094F, 10.6563F, 16.7396F, 6.0F, 2.0F, 1.0F, -0.3125F, false);
		Right3.setTextureOffset(331, 6).addBox(-13.6094F, 2.1563F, 16.7396F, 6.0F, 2.0F, 1.0F, -0.3125F, false);
		Right3.setTextureOffset(331, 6).addBox(-13.6094F, -6.7188F, 16.6771F, 6.0F, 2.0F, 1.0F, -0.3125F, false);
		Right3.setTextureOffset(331, 6).addBox(-13.6094F, -15.7188F, 16.7396F, 6.0F, 2.0F, 1.0F, -0.3125F, false);
		Right3.setTextureOffset(195, 25).addBox(-13.8594F, -14.5313F, 16.6146F, 7.0F, 9.0F, 1.0F, -0.4375F, false);
		Right3.setTextureOffset(385, 15).addBox(-14.0469F, -6.0938F, 16.7396F, 7.0F, 26.0F, 1.0F, -0.4375F, false);
		Right3.setTextureOffset(284, 0).addBox(-8.2344F, -15.9063F, 16.7396F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		Right3.setTextureOffset(284, 0).addBox(-7.7344F, -15.9063F, 16.7396F, 1.0F, 38.0F, 1.0F, -0.25F, false);

		Left3 = new ModelRenderer(this);
		Left3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls2.addChild(Left3);
		Left3.setTextureOffset(304, 0).addBox(5.5F, -38.75F, 8.0F, 2.0F, 38.0F, 1.0F, -0.25F, false);
		Left3.setTextureOffset(284, 0).addBox(-0.5F, -38.75F, 8.5F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		Left3.setTextureOffset(284, 0).addBox(0.0F, -38.75F, 8.0F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		Left3.setTextureOffset(331, 6).addBox(0.375F, -3.6875F, 8.0F, 6.0F, 3.0F, 1.0F, -0.3125F, false);
		Left3.setTextureOffset(385, 15).addBox(-0.5625F, -28.9375F, 8.0F, 7.0F, 26.0F, 1.0F, -0.4375F, false);
		Left3.setTextureOffset(331, 6).addBox(0.375F, -12.1875F, 8.0F, 6.0F, 2.0F, 1.0F, -0.3125F, false);
		Left3.setTextureOffset(331, 6).addBox(0.375F, -20.6875F, 8.0F, 6.0F, 2.0F, 1.0F, -0.3125F, false);
		Left3.setTextureOffset(195, 25).addBox(-0.375F, -37.375F, 7.875F, 7.0F, 9.0F, 1.0F, -0.4375F, false);
		Left3.setTextureOffset(331, 6).addBox(0.375F, -29.5625F, 7.9375F, 6.0F, 2.0F, 1.0F, -0.3125F, false);
		Left3.setTextureOffset(331, 6).addBox(0.375F, -38.5625F, 8.0F, 6.0F, 2.0F, 1.0F, -0.3125F, false);

		Walls3 = new ModelRenderer(this);
		Walls3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Walls3);
		Walls3.setTextureOffset(331, 6).addBox(7.8125F, -33.5625F, -0.375F, 1.0F, 1.0F, 7.0F, -0.25F, true);
		Walls3.setTextureOffset(331, 6).addBox(7.8125F, -33.5625F, -0.375F, 1.0F, 1.0F, 7.0F, -0.25F, true);
		Walls3.setTextureOffset(331, 6).addBox(7.75F, -37.6875F, 1.875F, 1.0F, 9.0F, 1.0F, -0.25F, true);
		Walls3.setTextureOffset(331, 6).addBox(7.75F, -37.6875F, 1.875F, 1.0F, 9.0F, 1.0F, -0.25F, true);
		Walls3.setTextureOffset(331, 6).addBox(7.75F, -37.6875F, 3.625F, 1.0F, 9.0F, 1.0F, -0.25F, true);
		Walls3.setTextureOffset(331, 6).addBox(7.75F, -37.6875F, 3.625F, 1.0F, 9.0F, 1.0F, -0.25F, true);
		Walls3.setTextureOffset(331, 6).addBox(7.75F, -37.6875F, -2.875F, 1.0F, 9.0F, 1.0F, -0.25F, false);
		Walls3.setTextureOffset(331, 6).addBox(7.75F, -37.6875F, -2.875F, 1.0F, 9.0F, 1.0F, -0.25F, false);
		Walls3.setTextureOffset(331, 6).addBox(7.8125F, -33.5625F, -6.625F, 1.0F, 1.0F, 7.0F, -0.25F, false);
		Walls3.setTextureOffset(331, 6).addBox(7.8125F, -33.5625F, -6.625F, 1.0F, 1.0F, 7.0F, -0.25F, false);
		Walls3.setTextureOffset(331, 6).addBox(7.75F, -37.6875F, -4.625F, 1.0F, 9.0F, 1.0F, -0.25F, false);
		Walls3.setTextureOffset(331, 6).addBox(7.75F, -37.6875F, -4.625F, 1.0F, 9.0F, 1.0F, -0.25F, false);

		Right4 = new ModelRenderer(this);
		Right4.setRotationPoint(7.2344F, -22.8438F, -8.7396F);
		Walls3.addChild(Right4);
		Right4.setTextureOffset(298, 0).addBox(0.7656F, -15.9063F, 14.2396F, 1.0F, 38.0F, 2.0F, -0.25F, false);
		Right4.setTextureOffset(331, 6).addBox(0.7656F, 19.1563F, 9.1146F, 1.0F, 3.0F, 6.0F, -0.3125F, false);
		Right4.setTextureOffset(331, 6).addBox(0.7656F, 10.6563F, 9.1146F, 1.0F, 2.0F, 6.0F, -0.3125F, false);
		Right4.setTextureOffset(331, 6).addBox(0.7656F, 2.1563F, 9.1146F, 1.0F, 2.0F, 6.0F, -0.3125F, false);
		Right4.setTextureOffset(331, 6).addBox(0.7031F, -6.7188F, 9.1146F, 1.0F, 2.0F, 6.0F, -0.3125F, false);
		Right4.setTextureOffset(331, 6).addBox(0.7656F, -15.7188F, 9.1146F, 1.0F, 2.0F, 6.0F, -0.3125F, false);
		Right4.setTextureOffset(196, 40).addBox(0.6406F, -14.5313F, 8.3646F, 1.0F, 9.0F, 7.0F, -0.4375F, false);
		Right4.setTextureOffset(427, 3).addBox(0.7656F, -6.0938F, 8.5521F, 1.0F, 26.0F, 7.0F, -0.4375F, false);
		Right4.setTextureOffset(280, 0).addBox(0.7656F, -15.9063F, 8.7396F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		Right4.setTextureOffset(280, 0).addBox(0.7656F, -15.9063F, 8.2396F, 1.0F, 38.0F, 1.0F, -0.25F, false);

		Left4 = new ModelRenderer(this);
		Left4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls3.addChild(Left4);
		Left4.setTextureOffset(298, 0).addBox(8.0F, -38.75F, -7.5F, 1.0F, 38.0F, 2.0F, -0.25F, false);
		Left4.setTextureOffset(280, 0).addBox(8.5F, -38.75F, -0.5F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		Left4.setTextureOffset(280, 0).addBox(8.0F, -38.75F, -1.0F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		Left4.setTextureOffset(331, 6).addBox(8.0F, -3.6875F, -6.375F, 1.0F, 3.0F, 6.0F, -0.3125F, false);
		Left4.setTextureOffset(385, 5).addBox(8.0F, -28.9375F, -6.4375F, 1.0F, 26.0F, 7.0F, -0.4375F, false);
		Left4.setTextureOffset(331, 6).addBox(8.0F, -12.1875F, -6.375F, 1.0F, 2.0F, 6.0F, -0.3125F, false);
		Left4.setTextureOffset(331, 6).addBox(8.0F, -20.6875F, -6.375F, 1.0F, 2.0F, 6.0F, -0.3125F, false);
		Left4.setTextureOffset(196, 40).addBox(7.875F, -37.375F, -6.625F, 1.0F, 9.0F, 7.0F, -0.4375F, false);
		Left4.setTextureOffset(331, 6).addBox(7.9375F, -29.5625F, -6.375F, 1.0F, 2.0F, 6.0F, -0.3125F, false);
		Left4.setTextureOffset(331, 6).addBox(8.0F, -38.5625F, -6.375F, 1.0F, 2.0F, 6.0F, -0.3125F, false);

		LeftDoor = new ModelRenderer(this);
		LeftDoor.setRotationPoint(-7.2118F, 0.5729F, -8.7951F);
		LeftDoor.setTextureOffset(292, 0).addBox(-0.2882F, -15.3229F, -0.2049F, 2.0F, 38.0F, 1.0F, -0.25F, false);
		LeftDoor.setTextureOffset(276, 0).addBox(6.7118F, -15.3229F, -0.7049F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		LeftDoor.setTextureOffset(276, 0).addBox(6.2118F, -15.3229F, -0.2049F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		LeftDoor.setTextureOffset(331, 6).addBox(0.8368F, 19.7396F, -0.2049F, 6.0F, 3.0F, 1.0F, -0.3125F, false);
		LeftDoor.setTextureOffset(385, 15).addBox(0.7743F, 3.4896F, -0.2049F, 7.0F, 17.0F, 1.0F, -0.4375F, false);
		LeftDoor.setTextureOffset(331, 6).addBox(0.8368F, 11.2396F, -0.2049F, 6.0F, 2.0F, 1.0F, -0.3125F, false);
		LeftDoor.setTextureOffset(331, 6).addBox(0.8368F, 2.7396F, -0.2049F, 6.0F, 2.0F, 1.0F, -0.3125F, false);
		LeftDoor.setTextureOffset(414, 24).addBox(0.4618F, -4.0729F, -0.2049F, 2.0F, 7.0F, 1.0F, -0.4375F, false);
		LeftDoor.setTextureOffset(216, 18).addBox(1.4618F, -4.0729F, -0.0799F, 5.0F, 7.0F, 1.0F, -0.4375F, false);
		LeftDoor.setTextureOffset(414, 24).addBox(5.4618F, -4.0729F, -0.2049F, 2.0F, 7.0F, 1.0F, -0.4375F, false);
		LeftDoor.setTextureOffset(414, 24).addBox(0.5868F, 2.0521F, -0.2049F, 7.0F, 2.0F, 1.0F, -0.4375F, false);
		LeftDoor.setTextureOffset(195, 25).addBox(0.5868F, -13.9479F, -0.0799F, 7.0F, 9.0F, 1.0F, -0.4375F, false);
		LeftDoor.setTextureOffset(414, 24).addBox(0.5868F, -5.1979F, -0.2049F, 7.0F, 2.0F, 1.0F, -0.4375F, false);
		LeftDoor.setTextureOffset(331, 6).addBox(0.8368F, -6.1354F, -0.1424F, 6.0F, 2.0F, 1.0F, -0.3125F, false);
		LeftDoor.setTextureOffset(331, 6).addBox(0.8368F, -15.1354F, -0.2049F, 6.0F, 2.0F, 1.0F, -0.3125F, false);
		LeftDoor.setTextureOffset(331, 6).addBox(2.5868F, -14.2604F, 0.0451F, 1.0F, 9.0F, 1.0F, -0.25F, false);
		LeftDoor.setTextureOffset(331, 6).addBox(4.3368F, -14.2604F, 0.0451F, 1.0F, 9.0F, 1.0F, -0.25F, false);
		LeftDoor.setTextureOffset(331, 6).addBox(0.5868F, -10.1354F, -0.0174F, 7.0F, 1.0F, 1.0F, -0.25F, false);

		RightDoor = new ModelRenderer(this);
		RightDoor.setRotationPoint(7.2344F, 1.1563F, -8.7396F);
		RightDoor.setTextureOffset(292, 0).addBox(-1.7344F, -15.9063F, -0.2604F, 2.0F, 38.0F, 1.0F, -0.25F, false);
		RightDoor.setTextureOffset(331, 6).addBox(-6.8594F, 19.1563F, -0.2604F, 6.0F, 3.0F, 1.0F, -0.3125F, false);
		RightDoor.setTextureOffset(331, 6).addBox(-6.8594F, 10.6563F, -0.2604F, 6.0F, 2.0F, 1.0F, -0.3125F, false);
		RightDoor.setTextureOffset(331, 6).addBox(-6.8594F, 2.1563F, -0.2604F, 6.0F, 2.0F, 1.0F, -0.3125F, false);
		RightDoor.setTextureOffset(331, 6).addBox(-6.8594F, -6.7188F, -0.1979F, 6.0F, 2.0F, 1.0F, -0.3125F, false);
		RightDoor.setTextureOffset(331, 6).addBox(-6.8594F, -15.7188F, -0.2604F, 6.0F, 2.0F, 1.0F, -0.3125F, false);
		RightDoor.setTextureOffset(331, 6).addBox(-5.3594F, -14.8438F, -0.0104F, 1.0F, 9.0F, 1.0F, -0.25F, true);
		RightDoor.setTextureOffset(331, 6).addBox(-3.6094F, -14.8438F, -0.0104F, 1.0F, 9.0F, 1.0F, -0.25F, true);
		RightDoor.setTextureOffset(331, 6).addBox(-7.6094F, -10.7188F, -0.0729F, 7.0F, 1.0F, 1.0F, -0.25F, true);
		RightDoor.setTextureOffset(195, 25).addBox(-7.6094F, -14.5313F, -0.1354F, 7.0F, 9.0F, 1.0F, -0.4375F, false);
		RightDoor.setTextureOffset(385, 15).addBox(-7.4219F, -6.0938F, -0.2604F, 7.0F, 26.0F, 1.0F, -0.4375F, false);
		RightDoor.setTextureOffset(276, 0).addBox(-7.2344F, -15.9063F, -0.2604F, 1.0F, 38.0F, 1.0F, -0.25F, false);
		RightDoor.setTextureOffset(276, 0).addBox(-7.7344F, -15.9063F, -0.2604F, 1.0F, 38.0F, 1.0F, -0.25F, false);

		boti = new ModelRenderer(this);
		boti.setRotationPoint(0.0F, 24.0F, 0.0F);
		boti.setTextureOffset(0, 0).addBox(-7.0F, -39.0F, -8.0F, 14.0F, 38.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void render(ExteriorTile tile, float v, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float v1) {
		EnumDoorState state = tile.getOpen();
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
		this.Shell.render(matrixStack, buffer, packedLight, packedOverlay);
		this.RightDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		this.LeftDoor.render(matrixStack, buffer, packedLight, packedOverlay);
		this.boti.render(matrixStack, buffer, packedLight, packedOverlay);
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
}