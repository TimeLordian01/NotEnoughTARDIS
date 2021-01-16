package com.thevale.moretimecapsulesmod.client.models.exteriors;// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.platform.GlStateManager;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.ModelHelper;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class FiveExterior extends EntityModel {
	private final RendererModel Right_Door;
	private final RendererModel Left_Door;
	private final RendererModel CallSignsLight;
	private final RendererModel ShellWindows;
	private final RendererModel Lamp;
	private final RendererModel Shell;
	private final RendererModel Roof;
	private final RendererModel Walls;
	private final RendererModel leftside;
	private final RendererModel leftside2;
	private final RendererModel leftside3;
	private final RendererModel rightside;
	private final RendererModel rightside2;
	private final RendererModel rightside3;
	private final RendererModel PCBSign;
	private final RendererModel Frames;
	private final RendererModel Posts;
	private final RendererModel Base;
	private final RendererModel boti;
	private final RendererModel LeftWindow;
	private final RendererModel RightWindow;

	public FiveExterior() {
		textureWidth = 432;
		textureHeight = 432;

		Right_Door = new RendererModel(this);
		Right_Door.setRotationPoint(-18.0F, 24.0F, -21.375F);
		Right_Door.cubeList.add(new ModelBox(Right_Door, 78, 306, 0.0F, -74.0F, 0.0F, 3, 70, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 0, 296, 2.875F, -6.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 360, 238, 2.875F, -20.5F, 0.5625F, 13, 14, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 360, 222, 2.875F, -37.5F, 0.5625F, 13, 14, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 377, 343, 2.875F, -54.0F, 0.5625F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 320, 41, 2.875F, -42.0F, 0.5625F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 152, 54, 3.5F, -53.0F, 0.5625F, 1, 11, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 145, 54, 14.0F, -53.0F, 0.5625F, 2, 11, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 167, 0, 4.25F, -53.0F, 0.8125F, 10, 11, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 377, 81, 2.875F, -58.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 377, 75, 2.875F, -41.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 376, 121, 2.875F, -24.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 363, 340, 2.875F, -7.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 356, 356, 2.75F, -70.75F, 0.125F, 1, 65, 1, -0.25F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 29, 170, 6.75F, -70.75F, 0.375F, 1, 13, 1, -0.25F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 144, 157, 10.875F, -70.75F, 0.375F, 1, 13, 1, -0.25F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 355, 276, 15.0F, -70.75F, 0.125F, 1, 65, 1, -0.25F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 377, 78, 2.875F, -71.5F, 0.4375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 377, 72, 2.875F, -55.0F, 0.375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 377, 377, 2.875F, -38.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 376, 118, 2.875F, -21.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 278, 38, 2.375F, -64.75F, 0.25F, 14, 1, 1, -0.25F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 294, 278, 2.875F, -23.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 290, 97, 2.875F, -40.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 290, 92, 2.875F, -57.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 241, 279, 2.875F, -73.875F, 0.0625F, 13, 3, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 182, 316, 15.75F, -74.0F, 0.0F, 2, 70, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 168, 316, 17.0F, -74.0F, -0.5F, 2, 70, 1, 0.0F, false));

		Left_Door = new RendererModel(this);
		Left_Door.setRotationPoint(18.0F, 24.0F, -21.375F);
		Left_Door.cubeList.add(new ModelBox(Left_Door, 69, 306, -3.0F, -74.0F, 0.0F, 3, 70, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 180, 279, -15.875F, -6.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 358, 190, -15.875F, -20.5F, 0.5625F, 13, 14, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 358, 174, -15.875F, -37.5F, 0.5625F, 13, 14, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 358, 158, -15.875F, -54.5F, 0.5625F, 13, 14, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 363, 337, -15.875F, -58.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 363, 334, -15.875F, -41.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 363, 331, -15.875F, -24.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 337, 129, -15.875F, -7.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 355, 209, -3.75F, -70.75F, 0.125F, 1, 65, 1, -0.25F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 150, 82, -7.75F, -70.75F, 0.375F, 1, 13, 1, -0.25F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 145, 82, -11.875F, -70.75F, 0.375F, 1, 13, 1, -0.25F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 353, 142, -16.0F, -70.75F, 0.125F, 1, 65, 1, -0.25F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 337, 126, -15.875F, -71.5F, 0.4375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 321, 317, -15.875F, -55.0F, 0.375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 320, 314, -15.875F, -38.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 320, 44, -15.875F, -21.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 252, 205, -16.375F, -64.75F, 0.25F, 14, 1, 1, -0.25F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 66, 279, -15.875F, -23.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 50, 268, -15.875F, -40.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 245, 266, -15.875F, -57.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 50, 263, -15.875F, -73.875F, 0.0625F, 13, 3, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 175, 316, -17.75F, -74.0F, 0.0F, 2, 70, 1, 0.0F, false));

		CallSignsLight = new RendererModel(this);
		CallSignsLight.setRotationPoint(0.0F, 24.0F, 0.0F);
		CallSignsLight.cubeList.add(new ModelBox(CallSignsLight, 290, 48, -20.0F, -79.25F, -24.0F, 40, 5, 4, 0.0F, false));
		CallSignsLight.cubeList.add(new ModelBox(CallSignsLight, 196, 233, -24.0F, -79.25F, -20.0F, 4, 5, 40, 0.0F, false));
		CallSignsLight.cubeList.add(new ModelBox(CallSignsLight, 282, 132, -20.0F, -79.25F, 20.0F, 40, 5, 4, 0.0F, false));
		CallSignsLight.cubeList.add(new ModelBox(CallSignsLight, 65, 233, 20.0F, -79.25F, -20.0F, 4, 5, 40, 0.0F, false));

		ShellWindows = new RendererModel(this);
		ShellWindows.setRotationPoint(13.125F, -34.375F, -21.0F);
		ShellWindows.cubeList.add(new ModelBox(ShellWindows, 161, 69, -34.125F, -13.0F, 5.875F, 1, 14, 13, -0.375F, false));
		ShellWindows.cubeList.add(new ModelBox(ShellWindows, 317, 16, -28.25F, -13.0F, 41.0F, 13, 14, 1, -0.375F, false));
		ShellWindows.cubeList.add(new ModelBox(ShellWindows, 16, 16, 6.875F, -13.0F, 23.125F, 1, 14, 13, -0.375F, false));
		ShellWindows.cubeList.add(new ModelBox(ShellWindows, 154, 154, -34.125F, -13.0F, 23.125F, 1, 14, 13, -0.375F, false));
		ShellWindows.cubeList.add(new ModelBox(ShellWindows, 317, 0, -11.0F, -13.0F, 41.0F, 13, 14, 1, -0.375F, false));
		ShellWindows.cubeList.add(new ModelBox(ShellWindows, 0, 0, 6.875F, -13.0F, 5.875F, 1, 14, 13, -0.375F, false));

		Lamp = new RendererModel(this);
		Lamp.setRotationPoint(20.0F, -73.875F, -19.5F);
		Lamp.cubeList.add(new ModelBox(Lamp, 16, 157, -22.5F, -0.75F, 17.0F, 5, 7, 5, -0.5F, false));

		Shell = new RendererModel(this);
		Shell.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Roof = new RendererModel(this);
		Roof.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Roof);
		Roof.cubeList.add(new ModelBox(Roof, 151, 0, -21.0F, -84.0F, -21.0F, 42, 5, 42, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 0, 157, -19.0F, -87.0F, -19.0F, 38, 3, 38, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 145, 106, -17.0F, -87.375F, -17.0F, 34, 3, 34, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 0, 199, -15.0F, -87.625F, -15.0F, 30, 3, 30, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 0, 233, -13.0F, -87.875F, -13.0F, 26, 3, 26, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 248, 106, -11.0F, -88.25F, -11.0F, 22, 3, 22, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 290, 70, -9.0F, -88.5F, -9.0F, 18, 3, 18, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 290, 142, -7.0F, -88.75F, -7.0F, 14, 3, 14, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 151, 28, -5.0F, -89.0F, -5.0F, 10, 3, 10, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 161, 54, -3.5F, -92.0F, -3.5F, 7, 3, 7, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 16, 0, -3.5F, -92.5F, -3.5F, 7, 3, 7, -0.25F, false));
		Roof.cubeList.add(new ModelBox(Roof, 0, 185, -3.5F, -99.875F, -3.5F, 7, 2, 7, -0.25F, false));
		Roof.cubeList.add(new ModelBox(Roof, 16, 104, -3.5F, -93.0F, -3.5F, 7, 3, 7, -0.5F, false));
		Roof.cubeList.add(new ModelBox(Roof, 16, 54, -3.5F, -100.375F, -3.5F, 7, 3, 7, -0.5F, false));
		Roof.cubeList.add(new ModelBox(Roof, 0, 233, -3.0F, -100.625F, -3.0F, 6, 3, 6, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 79, 233, -3.0F, -101.125F, -3.0F, 6, 3, 6, -0.5F, false));
		Roof.cubeList.add(new ModelBox(Roof, 144, 172, -2.75F, -98.25F, 1.75F, 1, 6, 1, -0.25F, false));
		Roof.cubeList.add(new ModelBox(Roof, 171, 106, 1.75F, -98.25F, 1.75F, 1, 6, 1, -0.25F, false));
		Roof.cubeList.add(new ModelBox(Roof, 170, 154, 1.75F, -98.25F, -2.75F, 1, 6, 1, -0.25F, false));
		Roof.cubeList.add(new ModelBox(Roof, 166, 106, 0.25F, -98.5F, -2.75F, 1, 7, 1, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 136, 157, -2.75F, -98.5F, -1.25F, 1, 7, 1, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 120, 157, -1.25F, -98.5F, 1.75F, 1, 7, 1, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 156, 28, 1.75F, -98.5F, 0.25F, 1, 7, 1, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 161, 106, -1.25F, -98.5F, -2.75F, 1, 7, 1, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 0, 104, -2.6875F, -95.8125F, -2.375F, 1, 1, 5, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 0, 38, -2.375F, -95.8125F, 1.6875F, 5, 1, 1, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 154, 154, 1.6875F, -95.8125F, -2.625F, 1, 1, 5, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 0, 10, -2.625F, -95.8125F, -2.6875F, 5, 1, 1, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 131, 157, -2.75F, -98.5F, 0.25F, 1, 7, 1, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 115, 157, 0.25F, -98.5F, 1.75F, 1, 7, 1, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 151, 28, 1.75F, -98.5F, -1.25F, 1, 7, 1, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 32, 21, -2.75F, -98.25F, -2.75F, 1, 6, 1, -0.25F, false));
		Roof.cubeList.add(new ModelBox(Roof, 0, 61, 19.25F, -83.5F, -21.25F, 2, 3, 2, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 38, 54, -21.25F, -83.5F, -21.25F, 2, 3, 2, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 38, 44, -21.25F, -83.5F, 19.25F, 2, 3, 2, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 29, 44, 19.25F, -83.5F, 19.25F, 2, 3, 2, 0.0F, false));

		Walls = new RendererModel(this);
		Walls.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Walls);
		

		leftside = new RendererModel(this);
		leftside.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls.addChild(leftside);
		leftside.cubeList.add(new ModelBox(leftside, 42, 306, -21.375F, -74.0F, -18.0F, 1, 70, 3, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 316, 297, -21.3125F, -6.5F, -15.125F, 1, 3, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 236, 195, -20.8125F, -20.5F, -15.125F, 1, 14, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 91, 199, -20.8125F, -37.5F, -15.125F, 1, 14, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 0, 199, -20.8125F, -54.5F, -15.125F, 1, 14, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 376, 316, -20.9375F, -58.0F, -15.125F, 1, 1, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 376, 301, -20.9375F, -41.0F, -15.125F, 1, 1, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 376, 286, -20.9375F, -24.0F, -15.125F, 1, 1, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 376, 271, -20.9375F, -7.0F, -15.125F, 1, 1, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 351, 351, -21.25F, -70.75F, -15.25F, 1, 65, 1, -0.25F, false));
		leftside.cubeList.add(new ModelBox(leftside, 5, 132, -21.0F, -70.75F, -11.25F, 1, 13, 1, -0.25F, false));
		leftside.cubeList.add(new ModelBox(leftside, 0, 132, -21.0F, -70.75F, -7.125F, 1, 13, 1, -0.25F, false));
		leftside.cubeList.add(new ModelBox(leftside, 350, 276, -21.25F, -70.75F, -3.0F, 1, 65, 1, -0.25F, false));
		leftside.cubeList.add(new ModelBox(leftside, 376, 256, -20.9375F, -71.5F, -15.125F, 1, 1, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 376, 241, -21.0F, -55.0F, -15.125F, 1, 1, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 376, 103, -20.9375F, -38.0F, -15.125F, 1, 1, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 361, 376, -20.9375F, -21.0F, -15.125F, 1, 1, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 163, 273, -21.125F, -64.75F, -15.625F, 1, 1, 14, -0.25F, false));
		leftside.cubeList.add(new ModelBox(leftside, 315, 106, -21.3125F, -23.5F, -15.125F, 1, 3, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 311, 216, -21.3125F, -40.5F, -15.125F, 1, 3, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 306, 164, -21.3125F, -57.5F, -15.125F, 1, 3, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 112, 296, -21.3125F, -73.875F, -15.125F, 1, 3, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 140, 316, -21.375F, -74.0F, -2.25F, 1, 70, 2, 0.0F, false));

		leftside2 = new RendererModel(this);
		leftside2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls.addChild(leftside2);
		leftside2.cubeList.add(new ModelBox(leftside2, 60, 306, -18.0F, -74.0F, 20.375F, 3, 70, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 245, 261, -15.125F, -6.5F, 20.3125F, 13, 3, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 353, 32, -15.125F, -20.5F, 19.8125F, 13, 14, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 346, 16, -15.125F, -37.5F, 19.8125F, 13, 14, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 346, 0, -15.125F, -54.5F, 19.8125F, 13, 14, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 317, 32, -15.125F, -58.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 315, 123, -15.125F, -41.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 309, 38, -15.125F, -24.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 163, 309, -15.125F, -7.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 346, 346, -15.25F, -70.75F, 20.25F, 1, 65, 1, -0.25F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 32, 115, -11.25F, -70.75F, 20.0F, 1, 13, 1, -0.25F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 5, 82, -7.125F, -70.75F, 20.0F, 1, 13, 1, -0.25F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 345, 227, -3.0F, -70.75F, 20.25F, 1, 65, 1, -0.25F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 306, 187, -15.125F, -71.5F, 19.9375F, 13, 1, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 306, 184, -15.125F, -55.0F, 20.0F, 13, 1, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 306, 181, -15.125F, -38.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 306, 160, -15.125F, -21.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 248, 137, -15.625F, -64.75F, 20.125F, 14, 1, 1, -0.25F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 252, 200, -15.125F, -23.5F, 20.3125F, 13, 3, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 252, 195, -15.125F, -40.5F, 20.3125F, 13, 3, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 248, 132, -15.125F, -57.5F, 20.3125F, 13, 3, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 245, 230, -15.125F, -73.875F, 20.3125F, 13, 3, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 161, 316, -2.25F, -74.0F, 20.375F, 2, 70, 1, 0.0F, false));

		leftside3 = new RendererModel(this);
		leftside3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls.addChild(leftside3);
		leftside3.cubeList.add(new ModelBox(leftside3, 121, 199, 20.375F, -74.0F, 15.0F, 1, 70, 3, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 278, 0, 20.3125F, -6.5F, 2.125F, 1, 3, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 0, 104, 19.8125F, -20.5F, 2.125F, 1, 14, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 16, 69, 19.8125F, -37.5F, 2.125F, 1, 14, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 0, 54, 19.8125F, -54.5F, 2.125F, 1, 14, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 360, 314, 19.9375F, -58.0F, 2.125F, 1, 1, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 360, 299, 19.9375F, -41.0F, 2.125F, 1, 1, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 360, 284, 19.9375F, -24.0F, 2.125F, 1, 1, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 360, 269, 19.9375F, -7.0F, 2.125F, 1, 1, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 336, 336, 20.25F, -70.75F, 14.25F, 1, 65, 1, -0.25F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 45, 27, 20.0F, -70.75F, 10.25F, 1, 13, 1, -0.25F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 45, 0, 20.0F, -70.75F, 6.125F, 1, 13, 1, -0.25F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 335, 243, 20.25F, -70.75F, 2.0F, 1, 65, 1, -0.25F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 360, 254, 19.9375F, -71.5F, 2.125F, 1, 1, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 360, 111, 20.0F, -55.0F, 2.125F, 1, 1, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 347, 330, 19.9375F, -38.0F, 2.125F, 1, 1, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 290, 177, 19.9375F, -21.0F, 2.125F, 1, 1, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 245, 245, 20.125F, -64.75F, 1.625F, 1, 1, 14, -0.25F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 145, 84, 20.3125F, -23.5F, 2.125F, 1, 3, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 0, 134, 20.3125F, -40.5F, 2.125F, 1, 3, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 0, 84, 20.3125F, -57.5F, 2.125F, 1, 3, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 0, 31, 20.3125F, -73.875F, 2.125F, 1, 3, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 309, 309, 20.375F, -74.0F, 0.25F, 1, 70, 2, 0.0F, false));

		rightside = new RendererModel(this);
		rightside.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls.addChild(rightside);
		rightside.cubeList.add(new ModelBox(rightside, 139, 199, -21.375F, -74.0F, 15.0F, 1, 70, 3, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 295, 212, -21.3125F, -6.5F, 2.125F, 1, 3, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 115, 157, -20.8125F, -20.5F, 2.125F, 1, 14, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 0, 157, -20.8125F, -37.5F, 2.125F, 1, 14, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 90, 376, -20.9375F, -58.0F, 2.125F, 1, 1, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 265, 370, -20.9375F, -41.0F, 2.125F, 1, 1, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 375, 35, -20.9375F, -24.0F, 2.125F, 1, 1, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 375, 15, -20.9375F, -7.0F, 2.125F, 1, 1, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 350, 209, -21.25F, -70.75F, 14.25F, 1, 65, 1, -0.25F, false));
		rightside.cubeList.add(new ModelBox(rightside, 42, 115, -21.0F, -70.75F, 10.25F, 1, 13, 1, -0.25F, false));
		rightside.cubeList.add(new ModelBox(rightside, 37, 115, -21.0F, -70.75F, 6.125F, 1, 13, 1, -0.25F, false));
		rightside.cubeList.add(new ModelBox(rightside, 348, 142, -21.25F, -70.75F, 2.0F, 1, 65, 1, -0.25F, false));
		rightside.cubeList.add(new ModelBox(rightside, 375, 0, -20.9375F, -71.5F, 2.125F, 1, 1, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 374, 57, -21.0F, -55.0F, 2.125F, 1, 1, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 281, 372, -20.9375F, -38.0F, 2.125F, 1, 1, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 371, 126, -20.9375F, -21.0F, 2.125F, 1, 1, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 0, 263, -21.125F, -64.75F, 1.625F, 1, 1, 14, -0.25F, false));
		rightside.cubeList.add(new ModelBox(rightside, 295, 195, -21.3125F, -23.5F, 2.125F, 1, 3, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 294, 261, -21.3125F, -40.5F, 2.125F, 1, 3, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 294, 244, -21.3125F, -57.5F, 2.125F, 1, 3, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 290, 160, -21.3125F, -73.875F, 2.125F, 1, 3, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 133, 316, -21.375F, -74.0F, 0.25F, 1, 70, 2, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 126, 316, -21.875F, -74.0F, -1.0F, 1, 70, 2, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 151, 0, -20.8125F, -54.5F, 2.125F, 1, 14, 13, 0.0F, false));

		rightside2 = new RendererModel(this);
		rightside2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls.addChild(rightside2);
		rightside2.cubeList.add(new ModelBox(rightside2, 51, 306, 15.0F, -74.0F, 20.375F, 3, 70, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 236, 225, 2.125F, -6.5F, 20.3125F, 13, 3, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 345, 70, 2.125F, -20.5F, 19.8125F, 13, 14, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 344, 108, 2.125F, -37.5F, 19.8125F, 13, 14, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 163, 306, 2.125F, -58.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 304, 290, 2.125F, -41.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 304, 287, 2.125F, -24.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 0, 301, 2.125F, -7.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 343, 160, 14.25F, -70.75F, 20.25F, 1, 65, 1, -0.25F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 0, 82, 10.25F, -70.75F, 20.0F, 1, 13, 1, -0.25F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 42, 65, 6.125F, -70.75F, 20.0F, 1, 13, 1, -0.25F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 341, 341, 2.0F, -70.75F, 20.25F, 1, 65, 1, -0.25F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 50, 299, 2.125F, -71.5F, 19.9375F, 13, 1, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 50, 296, 2.125F, -55.0F, 20.0F, 13, 1, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 295, 233, 2.125F, -38.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 115, 192, 2.125F, -21.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 154, 187, 1.625F, -64.75F, 20.125F, 14, 1, 1, -0.25F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 115, 185, 2.125F, -23.5F, 20.3125F, 13, 3, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 154, 182, 2.125F, -40.5F, 20.3125F, 13, 3, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 145, 134, 2.125F, -57.5F, 20.3125F, 13, 3, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 145, 145, 2.125F, -73.875F, 20.3125F, 13, 3, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 154, 316, 0.25F, -74.0F, 20.375F, 2, 70, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 147, 316, -1.0F, -74.0F, 20.875F, 2, 70, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 338, 92, 2.125F, -54.5F, 19.8125F, 13, 14, 1, 0.0F, false));

		rightside3 = new RendererModel(this);
		rightside3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls.addChild(rightside3);
		rightside3.cubeList.add(new ModelBox(rightside3, 130, 199, 20.375F, -74.0F, -18.0F, 1, 70, 3, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 163, 289, 20.3125F, -6.5F, -15.125F, 1, 3, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 145, 106, 19.8125F, -20.5F, -15.125F, 1, 14, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 145, 54, 19.8125F, -37.5F, -15.125F, 1, 14, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 236, 370, 19.9375F, -58.0F, -15.125F, 1, 1, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 367, 88, 19.9375F, -41.0F, -15.125F, 1, 1, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 220, 365, 19.9375F, -24.0F, -15.125F, 1, 1, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 74, 365, 19.9375F, -7.0F, -15.125F, 1, 1, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 340, 227, 20.25F, -70.75F, -15.25F, 1, 65, 1, -0.25F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 37, 65, 20.0F, -70.75F, -11.25F, 1, 13, 1, -0.25F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 32, 65, 20.0F, -70.75F, -7.125F, 1, 13, 1, -0.25F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 338, 160, 20.25F, -70.75F, -3.0F, 1, 65, 1, -0.25F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 204, 362, 19.9375F, -71.5F, -15.125F, 1, 1, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 361, 345, 20.0F, -55.0F, -15.125F, 1, 1, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 361, 73, 19.9375F, -38.0F, -15.125F, 1, 1, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 361, 361, 19.9375F, -21.0F, -15.125F, 1, 1, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 251, 209, 20.125F, -64.75F, -15.625F, 1, 1, 14, -0.25F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 112, 279, 20.3125F, -23.5F, -15.125F, 1, 3, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 50, 279, 20.3125F, -40.5F, -15.125F, 1, 3, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 0, 279, 20.3125F, -57.5F, -15.125F, 1, 3, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 278, 17, 20.3125F, -73.875F, -15.125F, 1, 3, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 119, 316, 20.375F, -74.0F, -2.25F, 1, 70, 2, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 112, 316, 20.875F, -74.0F, -1.0F, 1, 70, 2, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 16, 119, 19.8125F, -54.5F, -15.125F, 1, 14, 13, 0.0F, false));

		PCBSign = new RendererModel(this);
		PCBSign.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(PCBSign);
		PCBSign.cubeList.add(new ModelBox(PCBSign, 290, 64, -20.5F, -74.75F, -25.0F, 41, 1, 4, -0.1875F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 113, 273, -25.0F, -74.75F, -20.5F, 4, 1, 41, -0.1875F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 245, 238, -20.5F, -74.75F, 21.0F, 41, 1, 4, -0.1875F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 245, 195, 21.0F, -74.75F, -20.5F, 4, 1, 41, -0.1875F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 39, 17, 19.5F, -79.25F, -25.0F, 1, 5, 4, -0.1874F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 0, 157, -25.0F, -79.25F, -20.5F, 4, 5, 1, -0.1874F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 0, 28, -20.5F, -79.25F, 21.0F, 1, 5, 4, -0.1874F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 151, 0, 21.0F, -79.25F, 19.5F, 4, 5, 1, -0.1874F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 32, 11, -20.5F, -79.25F, -25.0F, 1, 5, 4, -0.1874F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 154, 154, -25.0F, -79.25F, 19.5F, 4, 5, 1, -0.1874F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 0, 0, 19.5F, -79.25F, 21.0F, 1, 5, 4, -0.1874F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 145, 106, 21.0F, -79.25F, -20.5F, 4, 5, 1, -0.1874F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 290, 58, -20.5F, -79.75F, -25.0F, 41, 1, 4, -0.1875F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 0, 263, -25.0F, -79.75F, -20.5F, 4, 1, 41, -0.1875F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 197, 50, -20.5F, -79.75F, 21.0F, 41, 1, 4, -0.1875F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 244, 244, 21.0F, -79.75F, -20.5F, 4, 1, 41, -0.1875F, false));

		Frames = new RendererModel(this);
		Frames.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Frames);
		Frames.cubeList.add(new ModelBox(Frames, 331, 331, 17.3125F, -74.0F, -22.375F, 1, 70, 1, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 321, 321, -22.375F, -74.0F, -18.3125F, 1, 70, 1, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 199, 316, -18.3125F, -74.0F, 21.375F, 1, 70, 1, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 189, 316, 21.375F, -74.0F, 17.3125F, 1, 70, 1, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 75, 154, -18.0F, -74.0F, -22.375F, 36, 1, 1, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 278, 0, -22.375F, -74.0F, -18.0F, 1, 1, 36, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 0, 154, -18.0F, -74.0F, 21.375F, 36, 1, 1, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 115, 154, 21.375F, -74.0F, -18.0F, 1, 1, 36, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 326, 326, -18.3125F, -74.0F, -22.375F, 1, 70, 1, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 316, 316, -22.375F, -74.0F, 17.3125F, 1, 70, 1, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 194, 316, 17.3125F, -74.0F, 21.375F, 1, 70, 1, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 148, 199, 21.375F, -74.0F, -18.3125F, 1, 70, 1, 0.0F, false));

		Posts = new RendererModel(this);
		Posts.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Posts);
		Posts.cubeList.add(new ModelBox(Posts, 21, 306, 18.25F, -80.625F, -23.25F, 5, 77, 5, 0.0F, false));
		Posts.cubeList.add(new ModelBox(Posts, 288, 288, -23.25F, -80.625F, -23.25F, 5, 77, 5, 0.0F, false));
		Posts.cubeList.add(new ModelBox(Posts, 267, 287, -23.25F, -80.625F, 18.25F, 5, 77, 5, 0.0F, false));
		Posts.cubeList.add(new ModelBox(Posts, 246, 287, 18.25F, -80.625F, 18.25F, 5, 77, 5, 0.0F, false));
		Posts.cubeList.add(new ModelBox(Posts, 0, 306, 17.9375F, -80.5625F, -22.9375F, 5, 77, 5, 0.0F, false));
		Posts.cubeList.add(new ModelBox(Posts, 225, 282, -22.9375F, -80.5625F, -22.9375F, 5, 77, 5, 0.0F, false));
		Posts.cubeList.add(new ModelBox(Posts, 204, 279, -22.9375F, -80.5625F, 17.9375F, 5, 77, 5, 0.0F, false));
		Posts.cubeList.add(new ModelBox(Posts, 91, 279, 17.9375F, -80.5625F, 17.9375F, 5, 77, 5, 0.0F, false));

		Base = new RendererModel(this);
		Base.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Base);
		Base.cubeList.add(new ModelBox(Base, 145, 56, -24.0F, -4.0F, -24.0F, 48, 1, 48, 0.0F, false));
		Base.cubeList.add(new ModelBox(Base, 145, 145, -24.0F, -3.5F, -24.0F, 48, 1, 48, 0.25F, false));
		Base.cubeList.add(new ModelBox(Base, 0, 104, -24.0F, -2.875F, -24.0F, 48, 1, 48, 0.5F, false));
		Base.cubeList.add(new ModelBox(Base, 0, 54, -24.0F, -2.4375F, -24.0F, 48, 1, 48, 0.75F, false));
		Base.cubeList.add(new ModelBox(Base, 0, 0, -25.0F, -3.0F, -25.0F, 50, 3, 50, 0.0F, false));

		boti = new RendererModel(this);
		boti.setRotationPoint(0.0F, 24.0F, 0.0F);
		boti.cubeList.add(new ModelBox(boti, 153, 195, -20.0F, -80.0F, -4.5F, 40, 76, 1, 0.0F, false));

		LeftWindow = new RendererModel(this);
		LeftWindow.setRotationPoint(18.0F, -34.375F, -21.375F);
		LeftWindow.cubeList.add(new ModelBox(LeftWindow, 358, 142, -15.875F, -13.0F, 0.375F, 13, 14, 1, -0.375F, false));

		RightWindow = new RendererModel(this);
		RightWindow.setRotationPoint(-18.0F, -34.375F, -21.375F);
		RightWindow.cubeList.add(new ModelBox(RightWindow, 360, 206, 2.875F, -13.0F, 0.375F, 13, 14, 1, -0.375F, false));
	}

	public void render(ExteriorTile tile) {
		EnumDoorState state = tile.getOpen();
		GlStateManager.pushMatrix();
        GlStateManager.enableRescaleNormal();
        GlStateManager.translated(0.0D, 0.75, 0.0D);
        GlStateManager.scalef(0.5F, 0.5F, 0.5F);
        switch(state) {
        case ONE:
            this.Left_Door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.CANON05.getRotationForState(EnumDoorState.ONE));
            this.LeftWindow.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.CANON05.getRotationForState(EnumDoorState.ONE));
            this.Right_Door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.CANON05.getRotationForState(EnumDoorState.CLOSED));
            this.RightWindow.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.CANON05.getRotationForState(EnumDoorState.CLOSED));
            break;
        case BOTH:
            this.Left_Door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.CANON05.getRotationForState(EnumDoorState.ONE));
            this.LeftWindow.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.CANON05.getRotationForState(EnumDoorState.ONE));
            this.Right_Door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.CANON05.getRotationForState(EnumDoorState.BOTH));
            this.RightWindow.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.CANON05.getRotationForState(EnumDoorState.BOTH));
            break;
        case CLOSED:
            this.Left_Door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.CANON05.getRotationForState(EnumDoorState.CLOSED));
            this.LeftWindow.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.CANON05.getRotationForState(EnumDoorState.CLOSED));
            this.Right_Door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.CANON05.getRotationForState(EnumDoorState.CLOSED));
            this.RightWindow.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.CANON05.getRotationForState(EnumDoorState.CLOSED));
        }
		this.Shell.render(0.0625F);
        this.boti.render(0.0625F);
        this.Right_Door.render(0.0625F);
        this.Left_Door.render(0.0625F);
        float glow = tile.getLightLevel();
        ModelHelper.renderPartBrightness(glow, new RendererModel[]{this.RightWindow});
        ModelHelper.renderPartBrightness(glow, new RendererModel[]{this.LeftWindow});
        ModelHelper.renderPartBrightness(glow, new RendererModel[]{this.Lamp});
        ModelHelper.renderPartBrightness(glow, new RendererModel[]{this.CallSignsLight});
        ModelHelper.renderPartBrightness(glow, new RendererModel[]{this.ShellWindows});
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}