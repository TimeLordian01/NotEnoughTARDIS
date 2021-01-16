package com.thevale.moretimecapsulesmod.client.models.interiordoors;// Made with Blockbench 3.7.5
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

public class FiveInteriorDoor extends Model implements IInteriorDoorRenderer {
	public static final ResourceLocation TEXTURE = new ResourceLocation("moretimecapsulesmod", "textures/interiordoor/fiveinteriordoor.png");
	private final RendererModel Right_Door;
	private final RendererModel RightWindow;
	private final RendererModel Left_Door;
	private final RendererModel LeftWindow;
	private final RendererModel CallSignsLight;
	private final RendererModel Shell;
	private final RendererModel PCBSign;
	private final RendererModel Frames;
	private final RendererModel Posts;
	private final RendererModel Base;

	public FiveInteriorDoor() {
		textureWidth = 432;
		textureHeight = 432;

		Right_Door = new RendererModel(this);
		Right_Door.setRotationPoint(-18.0F, 24.0F, -21.375F);
		Right_Door.cubeList.add(new ModelBox(Right_Door, 60, 306, 0.0F, -74.0F, 0.0F, 3, 70, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 294, 295, 0.0F, -74.0F, 1.875F, 3, 70, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 200, 89, 2.875F, -6.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 294, 278, 2.875F, -6.5F, 1.5625F, 13, 3, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 241, 83, 2.875F, -20.5F, 0.5625F, 13, 14, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 360, 238, 2.875F, -20.5F, 1.0625F, 13, 14, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 225, 72, 2.875F, -37.5F, 0.5625F, 13, 14, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 360, 238, 2.875F, -37.5F, 1.0625F, 13, 14, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 200, 89, 2.875F, -54.0F, 0.5625F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 294, 279, 2.875F, -54.0F, 1.1875F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 200, 89, 2.875F, -42.0F, 0.5625F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 294, 280, 2.875F, -42.0F, 1.1875F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 200, 89, 3.5F, -53.0F, 0.5625F, 1, 11, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 299, 322, 3.5F, -53.0F, 1.1875F, 1, 11, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 200, 89, 14.0F, -53.0F, 0.5625F, 2, 11, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 296, 312, 14.0F, -53.0F, 1.1875F, 2, 11, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 167, 0, 4.25F, -53.0F, 0.8125F, 10, 11, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 360, 238, 4.25F, -53.0F, 0.9375F, 10, 11, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 200, 89, 2.875F, -58.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 294, 280, 2.875F, -58.0F, 1.3125F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 200, 89, 2.875F, -41.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 294, 280, 2.875F, -41.0F, 1.3125F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 200, 89, 2.875F, -24.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 294, 280, 2.875F, -24.0F, 1.3125F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 200, 89, 2.875F, -7.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 294, 280, 2.875F, -7.0F, 1.3125F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 296, 298, 2.75F, -70.75F, 1.6875F, 1, 65, 1, -0.25F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 132, 205, 2.75F, -70.75F, -0.0625F, 1, 65, 1, -0.25F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 150, 82, 6.75F, -70.75F, 0.375F, 1, 13, 1, -0.25F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 299, 314, 6.75F, -70.75F, 1.5F, 1, 13, 1, -0.25F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 150, 82, 10.875F, -70.75F, 0.375F, 1, 13, 1, -0.25F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 299, 314, 10.875F, -70.75F, 1.5F, 1, 13, 1, -0.25F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 296, 298, 15.0F, -70.75F, 1.6875F, 1, 65, 1, -0.25F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 132, 205, 15.0F, -70.75F, -0.0625F, 1, 65, 1, -0.25F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 200, 89, 2.875F, -71.5F, 0.4375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 294, 280, 2.875F, -71.5F, 1.3125F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 200, 89, 2.875F, -55.0F, 0.375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 294, 280, 2.875F, -55.0F, 1.25F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 200, 89, 2.875F, -38.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 294, 280, 2.875F, -38.0F, 1.3125F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 200, 89, 2.875F, -21.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 294, 280, 2.875F, -21.0F, 1.3125F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 200, 89, 2.375F, -64.75F, 0.25F, 14, 1, 1, -0.25F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 295, 279, 2.375F, -64.75F, 1.375F, 14, 1, 1, -0.25F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 200, 89, 2.875F, -23.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 294, 278, 2.875F, -23.5F, 1.5625F, 13, 3, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 200, 89, 2.875F, -40.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 294, 278, 2.875F, -40.5F, 1.5625F, 13, 3, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 200, 89, 2.875F, -57.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 294, 278, 2.875F, -57.5F, 1.5625F, 13, 3, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 200, 89, 2.875F, -73.875F, 0.0625F, 13, 3, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 294, 278, 2.875F, -73.875F, 1.5625F, 13, 3, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 60, 306, 15.75F, -74.0F, 0.0F, 2, 70, 2, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 294, 295, 15.75F, -74.0F, 1.875F, 2, 70, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 61, 306, 17.0F, -74.0F, -0.5F, 2, 70, 1, 0.0F, false));

		RightWindow = new RendererModel(this);
		RightWindow.setRotationPoint(4.875F, -58.375F, 0.375F);
		Right_Door.addChild(RightWindow);
		RightWindow.cubeList.add(new ModelBox(RightWindow, 317, 0, -2.0F, -13.0F, 0.0F, 13, 14, 1, -0.375F, false));
		RightWindow.cubeList.add(new ModelBox(RightWindow, 317, 16, -2.0F, -13.0F, 1.0625F, 13, 14, 1, -0.375F, false));

		Left_Door = new RendererModel(this);
		Left_Door.setRotationPoint(18.0F, 24.0F, -21.375F);
		Left_Door.cubeList.add(new ModelBox(Left_Door, 60, 306, -3.0F, -74.0F, 0.0F, 3, 70, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 294, 295, -3.0F, -74.0F, 1.875F, 3, 70, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 200, 89, -15.875F, -6.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 294, 278, -15.875F, -6.5F, 1.5625F, 13, 3, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 225, 72, -15.875F, -20.5F, 0.5625F, 13, 14, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 360, 238, -15.875F, -20.5F, 1.0625F, 13, 14, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 225, 81, -15.875F, -37.5F, 0.5625F, 13, 14, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 360, 238, -15.875F, -37.5F, 1.0625F, 13, 14, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 225, 72, -15.875F, -54.5F, 0.5625F, 13, 14, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 360, 238, -15.875F, -54.5F, 1.0625F, 13, 14, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 200, 89, -15.875F, -58.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 294, 280, -15.875F, -58.0F, 1.3125F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 200, 89, -15.875F, -41.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 294, 280, -15.875F, -41.0F, 1.3125F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 200, 89, -15.875F, -24.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 294, 280, -15.875F, -24.0F, 1.3125F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 200, 89, -15.875F, -7.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 294, 280, -15.875F, -7.0F, 1.3125F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 296, 298, -3.75F, -70.75F, 1.6875F, 1, 65, 1, -0.25F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 132, 205, -3.75F, -70.75F, -0.0625F, 1, 65, 1, -0.25F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 150, 82, -7.75F, -70.75F, 0.375F, 1, 13, 1, -0.25F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 300, 306, -7.75F, -70.75F, 1.5F, 1, 13, 1, -0.25F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 150, 82, -11.875F, -70.75F, 0.375F, 1, 13, 1, -0.25F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 300, 306, -11.875F, -70.75F, 1.5F, 1, 13, 1, -0.25F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 296, 298, -16.0F, -70.75F, 1.6875F, 1, 65, 1, -0.25F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 132, 205, -16.0F, -70.75F, -0.0625F, 1, 65, 1, -0.25F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 200, 89, -15.875F, -71.5F, 0.4375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 294, 280, -15.875F, -71.5F, 1.3125F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 200, 89, -15.875F, -55.0F, 0.375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 294, 280, -15.875F, -55.0F, 1.25F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 200, 89, -15.875F, -38.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 294, 280, -15.875F, -38.0F, 1.3125F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 200, 89, -15.875F, -21.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 294, 280, -15.875F, -21.0F, 1.3125F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 200, 89, -16.375F, -64.75F, 0.25F, 14, 1, 1, -0.25F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 295, 279, -16.375F, -64.75F, 1.375F, 14, 1, 1, -0.25F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 200, 89, -15.875F, -23.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 294, 278, -15.875F, -23.5F, 1.5625F, 13, 3, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 200, 89, -15.875F, -40.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 294, 278, -15.875F, -40.5F, 1.5625F, 13, 3, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 200, 89, -15.875F, -57.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 294, 278, -15.875F, -57.5F, 1.5625F, 13, 3, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 200, 89, -15.875F, -73.875F, 0.0625F, 13, 3, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 294, 278, -15.875F, -73.875F, 1.5625F, 13, 3, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 60, 306, -17.75F, -74.0F, 0.0F, 2, 70, 2, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 294, 295, -17.75F, -74.0F, 1.875F, 2, 70, 1, 0.0F, false));

		LeftWindow = new RendererModel(this);
		LeftWindow.setRotationPoint(-4.875F, -58.375F, 0.375F);
		Left_Door.addChild(LeftWindow);
		LeftWindow.cubeList.add(new ModelBox(LeftWindow, 317, 16, -11.0F, -13.0F, 0.0F, 13, 14, 1, -0.375F, false));
		LeftWindow.cubeList.add(new ModelBox(LeftWindow, 317, 16, -11.0F, -13.0F, 1.0625F, 13, 14, 1, -0.375F, false));

		CallSignsLight = new RendererModel(this);
		CallSignsLight.setRotationPoint(0.0F, 24.0F, 0.0F);
		CallSignsLight.cubeList.add(new ModelBox(CallSignsLight, 290, 48, -20.0F, -79.25F, -24.0F, 40, 5, 4, 0.0F, false));

		Shell = new RendererModel(this);
		Shell.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		PCBSign = new RendererModel(this);
		PCBSign.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(PCBSign);
		PCBSign.cubeList.add(new ModelBox(PCBSign, 200, 89, -20.5F, -74.75F, -25.0F, 41, 1, 4, -0.1875F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 200, 89, 19.5F, -79.25F, -25.0F, 1, 5, 4, -0.1874F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 200, 89, -25.0F, -79.25F, -20.5F, 4, 5, 1, -0.1874F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 200, 89, -20.5F, -79.25F, -25.0F, 1, 5, 4, -0.1874F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 200, 89, 21.0F, -79.25F, -20.5F, 4, 5, 1, -0.1874F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 200, 89, -20.5F, -79.75F, -25.0F, 41, 1, 4, -0.1875F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 200, 89, -20.5F, -80.0F, -21.25F, 41, 1, 3, -0.1875F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 200, 89, -20.5F, -74.75F, -21.25F, 41, 1, 3, -0.1875F, false));

		Frames = new RendererModel(this);
		Frames.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Frames);
		Frames.cubeList.add(new ModelBox(Frames, 132, 201, 17.3125F, -74.0F, -22.375F, 1, 70, 1, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 132, 201, -22.375F, -74.0F, -18.3125F, 1, 70, 1, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 200, 89, -18.0F, -74.0F, -22.375F, 36, 1, 1, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 132, 201, -18.3125F, -74.0F, -22.375F, 1, 70, 1, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 132, 201, 21.375F, -74.0F, -18.3125F, 1, 70, 1, 0.0F, false));

		Posts = new RendererModel(this);
		Posts.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Posts);
		Posts.cubeList.add(new ModelBox(Posts, 204, 279, 18.25F, -80.625F, -23.25F, 5, 77, 5, 0.0F, false));
		Posts.cubeList.add(new ModelBox(Posts, 225, 282, -23.25F, -80.625F, -23.25F, 5, 77, 5, 0.0F, false));
		Posts.cubeList.add(new ModelBox(Posts, 204, 279, 17.9375F, -80.5625F, -22.9375F, 5, 77, 5, 0.0F, false));
		Posts.cubeList.add(new ModelBox(Posts, 204, 279, -22.9375F, -80.5625F, -22.9375F, 5, 77, 5, 0.0F, false));

		Base = new RendererModel(this);
		Base.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Base);
		Base.cubeList.add(new ModelBox(Base, 58, 419, -24.0F, -4.0F, -24.0F, 48, 1, 7, 0.0F, false));
		Base.cubeList.add(new ModelBox(Base, 55, 424, -24.0F, -3.5F, -24.0F, 48, 1, 7, 0.25F, false));
		Base.cubeList.add(new ModelBox(Base, 48, 416, -24.0F, -2.875F, -24.0F, 48, 1, 7, 0.5F, false));
		Base.cubeList.add(new ModelBox(Base, 69, 417, -24.0F, -2.4375F, -24.0F, 48, 1, 7, 0.75F, false));
		Base.cubeList.add(new ModelBox(Base, 9, 414, -25.0F, -3.0F, -25.0F, 50, 3, 9, 0.0F, false));
	}

	public void render(DoorEntity door) {
		 EnumDoorState state = door.getOpenState();
		GlStateManager.pushMatrix();
		GlStateManager.enableRescaleNormal();
		GlStateManager.translated(0.0D, 0.75D, 0.1D);
		GlStateManager.scalef(0.5F, 0.5F, 0.5F);
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
		this.Shell.render(0.0625F);
		this.Right_Door.render(0.0625F);
		this.Left_Door.render(0.0625F);
		this.CallSignsLight.render(0.0625F);
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
