package com.thevale.moretimecapsulesmod.client.models.interiordoors;// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.moretimecapsulesmod.client.renders.exteriors.FiveRender;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.models.interiordoors.IInteriorDoorRenderer;
import net.tardis.mod.client.renderers.exteriors.FortuneExteriorRenderer;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.misc.TexVariant;
import net.tardis.mod.tileentities.ConsoleTile;

public class FiveInteriorDoor extends EntityModel<Entity> implements IInteriorDoorRenderer {
	private final ModelRenderer Right_Door;
	private final ModelRenderer RightWindow;
	private final ModelRenderer Left_Door;
	private final ModelRenderer LeftWindow;
	private final ModelRenderer CallSignsLight;
	private final ModelRenderer Shell;
	private final ModelRenderer PCBSign;
	private final ModelRenderer Frames;
	private final ModelRenderer Posts;
	private final ModelRenderer Base;

	public FiveInteriorDoor() {
		textureWidth = 432;
		textureHeight = 432;

		Right_Door = new ModelRenderer(this);
		Right_Door.setRotationPoint(-18.0F, 24.0F, -21.375F);
		Right_Door.setTextureOffset(60, 306).addBox(0.0F, -74.0F, 0.0F, 3.0F, 70.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(294, 295).addBox(0.0F, -74.0F, 1.875F, 3.0F, 70.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(200, 89).addBox(2.875F, -6.5F, 0.0625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(294, 278).addBox(2.875F, -6.5F, 1.5625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(241, 83).addBox(2.875F, -20.5F, 0.5625F, 13.0F, 14.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(360, 238).addBox(2.875F, -20.5F, 1.0625F, 13.0F, 14.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(225, 72).addBox(2.875F, -37.5F, 0.5625F, 13.0F, 14.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(360, 238).addBox(2.875F, -37.5F, 1.0625F, 13.0F, 14.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(200, 89).addBox(2.875F, -54.0F, 0.5625F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(294, 279).addBox(2.875F, -54.0F, 1.1875F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(200, 89).addBox(2.875F, -42.0F, 0.5625F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(294, 280).addBox(2.875F, -42.0F, 1.1875F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(200, 89).addBox(3.5F, -53.0F, 0.5625F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(299, 322).addBox(3.5F, -53.0F, 1.1875F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(200, 89).addBox(14.0F, -53.0F, 0.5625F, 2.0F, 11.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(296, 312).addBox(14.0F, -53.0F, 1.1875F, 2.0F, 11.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(167, 0).addBox(4.25F, -53.0F, 0.8125F, 10.0F, 11.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(360, 238).addBox(4.25F, -53.0F, 0.9375F, 10.0F, 11.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(200, 89).addBox(2.875F, -58.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(294, 280).addBox(2.875F, -58.0F, 1.3125F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(200, 89).addBox(2.875F, -41.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(294, 280).addBox(2.875F, -41.0F, 1.3125F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(200, 89).addBox(2.875F, -24.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(294, 280).addBox(2.875F, -24.0F, 1.3125F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(200, 89).addBox(2.875F, -7.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(294, 280).addBox(2.875F, -7.0F, 1.3125F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(296, 298).addBox(2.75F, -70.75F, 1.6875F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		Right_Door.setTextureOffset(132, 205).addBox(2.75F, -70.75F, -0.0625F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		Right_Door.setTextureOffset(150, 82).addBox(6.75F, -70.75F, 0.375F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		Right_Door.setTextureOffset(299, 314).addBox(6.75F, -70.75F, 1.5F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		Right_Door.setTextureOffset(150, 82).addBox(10.875F, -70.75F, 0.375F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		Right_Door.setTextureOffset(299, 314).addBox(10.875F, -70.75F, 1.5F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		Right_Door.setTextureOffset(296, 298).addBox(15.0F, -70.75F, 1.6875F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		Right_Door.setTextureOffset(132, 205).addBox(15.0F, -70.75F, -0.0625F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		Right_Door.setTextureOffset(200, 89).addBox(2.875F, -71.5F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(294, 280).addBox(2.875F, -71.5F, 1.3125F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(200, 89).addBox(2.875F, -55.0F, 0.375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(294, 280).addBox(2.875F, -55.0F, 1.25F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(200, 89).addBox(2.875F, -38.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(294, 280).addBox(2.875F, -38.0F, 1.3125F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(200, 89).addBox(2.875F, -21.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(294, 280).addBox(2.875F, -21.0F, 1.3125F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(200, 89).addBox(2.375F, -64.75F, 0.25F, 14.0F, 1.0F, 1.0F, -0.25F, false);
		Right_Door.setTextureOffset(295, 279).addBox(2.375F, -64.75F, 1.375F, 14.0F, 1.0F, 1.0F, -0.25F, false);
		Right_Door.setTextureOffset(200, 89).addBox(2.875F, -23.5F, 0.0625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(294, 278).addBox(2.875F, -23.5F, 1.5625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(200, 89).addBox(2.875F, -40.5F, 0.0625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(294, 278).addBox(2.875F, -40.5F, 1.5625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(200, 89).addBox(2.875F, -57.5F, 0.0625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(294, 278).addBox(2.875F, -57.5F, 1.5625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(200, 89).addBox(2.875F, -73.875F, 0.0625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(294, 278).addBox(2.875F, -73.875F, 1.5625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(60, 306).addBox(15.75F, -74.0F, 0.0F, 2.0F, 70.0F, 2.0F, 0.0F, false);
		Right_Door.setTextureOffset(294, 295).addBox(15.75F, -74.0F, 1.875F, 2.0F, 70.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(61, 306).addBox(17.0F, -74.0F, -0.5F, 2.0F, 70.0F, 1.0F, 0.0F, false);

		RightWindow = new ModelRenderer(this);
		RightWindow.setRotationPoint(4.875F, -58.375F, 0.375F);
		Right_Door.addChild(RightWindow);
		RightWindow.setTextureOffset(317, 0).addBox(-2.0F, -13.0F, 0.0F, 13.0F, 14.0F, 1.0F, -0.375F, false);
		RightWindow.setTextureOffset(317, 16).addBox(-2.0F, -13.0F, 1.0625F, 13.0F, 14.0F, 1.0F, -0.375F, false);

		Left_Door = new ModelRenderer(this);
		Left_Door.setRotationPoint(18.0F, 24.0F, -21.375F);
		Left_Door.setTextureOffset(60, 306).addBox(-3.0F, -74.0F, 0.0F, 3.0F, 70.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(294, 295).addBox(-3.0F, -74.0F, 1.875F, 3.0F, 70.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(200, 89).addBox(-15.875F, -6.5F, 0.0625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(294, 278).addBox(-15.875F, -6.5F, 1.5625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(225, 72).addBox(-15.875F, -20.5F, 0.5625F, 13.0F, 14.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(360, 238).addBox(-15.875F, -20.5F, 1.0625F, 13.0F, 14.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(225, 81).addBox(-15.875F, -37.5F, 0.5625F, 13.0F, 14.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(360, 238).addBox(-15.875F, -37.5F, 1.0625F, 13.0F, 14.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(225, 72).addBox(-15.875F, -54.5F, 0.5625F, 13.0F, 14.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(360, 238).addBox(-15.875F, -54.5F, 1.0625F, 13.0F, 14.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(200, 89).addBox(-15.875F, -58.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(294, 280).addBox(-15.875F, -58.0F, 1.3125F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(200, 89).addBox(-15.875F, -41.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(294, 280).addBox(-15.875F, -41.0F, 1.3125F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(200, 89).addBox(-15.875F, -24.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(294, 280).addBox(-15.875F, -24.0F, 1.3125F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(200, 89).addBox(-15.875F, -7.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(294, 280).addBox(-15.875F, -7.0F, 1.3125F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(296, 298).addBox(-3.75F, -70.75F, 1.6875F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		Left_Door.setTextureOffset(132, 205).addBox(-3.75F, -70.75F, -0.0625F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		Left_Door.setTextureOffset(150, 82).addBox(-7.75F, -70.75F, 0.375F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		Left_Door.setTextureOffset(300, 306).addBox(-7.75F, -70.75F, 1.5F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		Left_Door.setTextureOffset(150, 82).addBox(-11.875F, -70.75F, 0.375F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		Left_Door.setTextureOffset(300, 306).addBox(-11.875F, -70.75F, 1.5F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		Left_Door.setTextureOffset(296, 298).addBox(-16.0F, -70.75F, 1.6875F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		Left_Door.setTextureOffset(132, 205).addBox(-16.0F, -70.75F, -0.0625F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		Left_Door.setTextureOffset(200, 89).addBox(-15.875F, -71.5F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(294, 280).addBox(-15.875F, -71.5F, 1.3125F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(200, 89).addBox(-15.875F, -55.0F, 0.375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(294, 280).addBox(-15.875F, -55.0F, 1.25F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(200, 89).addBox(-15.875F, -38.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(294, 280).addBox(-15.875F, -38.0F, 1.3125F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(200, 89).addBox(-15.875F, -21.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(294, 280).addBox(-15.875F, -21.0F, 1.3125F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(200, 89).addBox(-16.375F, -64.75F, 0.25F, 14.0F, 1.0F, 1.0F, -0.25F, false);
		Left_Door.setTextureOffset(295, 279).addBox(-16.375F, -64.75F, 1.375F, 14.0F, 1.0F, 1.0F, -0.25F, false);
		Left_Door.setTextureOffset(200, 89).addBox(-15.875F, -23.5F, 0.0625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(294, 278).addBox(-15.875F, -23.5F, 1.5625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(200, 89).addBox(-15.875F, -40.5F, 0.0625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(294, 278).addBox(-15.875F, -40.5F, 1.5625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(200, 89).addBox(-15.875F, -57.5F, 0.0625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(294, 278).addBox(-15.875F, -57.5F, 1.5625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(200, 89).addBox(-15.875F, -73.875F, 0.0625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(294, 278).addBox(-15.875F, -73.875F, 1.5625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(60, 306).addBox(-17.75F, -74.0F, 0.0F, 2.0F, 70.0F, 2.0F, 0.0F, false);
		Left_Door.setTextureOffset(294, 295).addBox(-17.75F, -74.0F, 1.875F, 2.0F, 70.0F, 1.0F, 0.0F, false);

		LeftWindow = new ModelRenderer(this);
		LeftWindow.setRotationPoint(-4.875F, -58.375F, 0.375F);
		Left_Door.addChild(LeftWindow);
		LeftWindow.setTextureOffset(317, 16).addBox(-11.0F, -13.0F, 0.0F, 13.0F, 14.0F, 1.0F, -0.375F, false);
		LeftWindow.setTextureOffset(317, 16).addBox(-11.0F, -13.0F, 1.0625F, 13.0F, 14.0F, 1.0F, -0.375F, false);

		CallSignsLight = new ModelRenderer(this);
		CallSignsLight.setRotationPoint(0.0F, 24.0F, 0.0F);
		CallSignsLight.setTextureOffset(290, 48).addBox(-20.0F, -79.25F, -24.0F, 40.0F, 5.0F, 4.0F, 0.0F, false);

		Shell = new ModelRenderer(this);
		Shell.setRotationPoint(0.0F, 24.0F, 0.0F);


		PCBSign = new ModelRenderer(this);
		PCBSign.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(PCBSign);
		PCBSign.setTextureOffset(200, 89).addBox(-20.5F, -74.75F, -25.0F, 41.0F, 1.0F, 4.0F, -0.1875F, false);
		PCBSign.setTextureOffset(200, 89).addBox(19.5F, -79.25F, -25.0F, 1.0F, 5.0F, 4.0F, -0.1874F, false);
		PCBSign.setTextureOffset(200, 89).addBox(-25.0F, -79.25F, -20.5F, 4.0F, 5.0F, 1.0F, -0.1874F, false);
		PCBSign.setTextureOffset(200, 89).addBox(-20.5F, -79.25F, -25.0F, 1.0F, 5.0F, 4.0F, -0.1874F, false);
		PCBSign.setTextureOffset(200, 89).addBox(21.0F, -79.25F, -20.5F, 4.0F, 5.0F, 1.0F, -0.1874F, false);
		PCBSign.setTextureOffset(200, 89).addBox(-20.5F, -79.75F, -25.0F, 41.0F, 1.0F, 4.0F, -0.1875F, false);
		PCBSign.setTextureOffset(200, 89).addBox(-20.5F, -80.0F, -21.25F, 41.0F, 1.0F, 3.0F, -0.1875F, false);
		PCBSign.setTextureOffset(200, 89).addBox(-20.5F, -74.75F, -21.25F, 41.0F, 1.0F, 3.0F, -0.1875F, false);

		Frames = new ModelRenderer(this);
		Frames.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Frames);
		Frames.setTextureOffset(132, 201).addBox(17.3125F, -74.0F, -22.375F, 1.0F, 70.0F, 1.0F, 0.0F, false);
		Frames.setTextureOffset(132, 201).addBox(-22.375F, -74.0F, -18.3125F, 1.0F, 70.0F, 1.0F, 0.0F, false);
		Frames.setTextureOffset(200, 89).addBox(-18.0F, -74.0F, -22.375F, 36.0F, 1.0F, 1.0F, 0.0F, false);
		Frames.setTextureOffset(132, 201).addBox(-18.3125F, -74.0F, -22.375F, 1.0F, 70.0F, 1.0F, 0.0F, false);
		Frames.setTextureOffset(132, 201).addBox(21.375F, -74.0F, -18.3125F, 1.0F, 70.0F, 1.0F, 0.0F, false);

		Posts = new ModelRenderer(this);
		Posts.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Posts);
		Posts.setTextureOffset(204, 279).addBox(18.25F, -80.625F, -23.25F, 5.0F, 77.0F, 5.0F, 0.0F, false);
		Posts.setTextureOffset(225, 282).addBox(-23.25F, -80.625F, -23.25F, 5.0F, 77.0F, 5.0F, 0.0F, false);
		Posts.setTextureOffset(204, 279).addBox(17.9375F, -80.5625F, -22.9375F, 5.0F, 77.0F, 5.0F, 0.0F, false);
		Posts.setTextureOffset(204, 279).addBox(-22.9375F, -80.5625F, -22.9375F, 5.0F, 77.0F, 5.0F, 0.0F, false);

		Base = new ModelRenderer(this);
		Base.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Base);
		Base.setTextureOffset(58, 419).addBox(-24.0F, -4.0F, -24.0F, 48.0F, 1.0F, 7.0F, 0.0F, false);
		Base.setTextureOffset(55, 424).addBox(-24.0F, -3.5F, -24.0F, 48.0F, 1.0F, 7.0F, 0.25F, false);
		Base.setTextureOffset(48, 416).addBox(-24.0F, -2.875F, -24.0F, 48.0F, 1.0F, 7.0F, 0.5F, false);
		Base.setTextureOffset(69, 417).addBox(-24.0F, -2.4375F, -24.0F, 48.0F, 1.0F, 7.0F, 0.75F, false);
		Base.setTextureOffset(9, 414).addBox(-25.0F, -3.0F, -25.0F, 50.0F, 3.0F, 9.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void render(DoorEntity door, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay) {
		EnumDoorState state = door.getOpenState();
		matrixStack.push();
		matrixStack.translate(0.0D, 0.75D, 0.1D);
		matrixStack.scale(0.5F, 0.5F, 0.5F);
		switch (state) {
			case ONE:
				this.Left_Door.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.CANON05.getRotationForState(EnumDoorState.ONE));
				this.Right_Door.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.CANON05.getRotationForState(EnumDoorState.CLOSED));
				break;
			case BOTH:
				this.Left_Door.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.CANON05.getRotationForState(EnumDoorState.ONE));
				this.Right_Door.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.CANON05.getRotationForState(EnumDoorState.BOTH));
				break;
			case CLOSED:
				this.Right_Door.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.CANON05.getRotationForState(EnumDoorState.CLOSED));
				this.Left_Door.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.CANON05.getRotationForState(EnumDoorState.CLOSED));
		}
		Right_Door.render(matrixStack, buffer, packedLight, packedOverlay);
		Left_Door.render(matrixStack, buffer, packedLight, packedOverlay);
		CallSignsLight.render(matrixStack, buffer, packedLight, packedOverlay);
		Shell.render(matrixStack, buffer, packedLight, packedOverlay);
		matrixStack.pop();
	}

	public ResourceLocation getTexture() {
		ConsoleTile tile = TardisHelper.getConsoleInWorld(Minecraft.getInstance().world).orElse(null);
		if (tile != null) {
			int index = tile.getExteriorManager().getExteriorVariant();
			TexVariant[] vars = tile.getExterior().getVariants();
			if (vars != null && index < vars.length) {
				return vars[index].getTexture();
			}
		}

		return FiveRender.TEXTURE;
	}
}