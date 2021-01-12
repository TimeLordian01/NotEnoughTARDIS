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

public class CanonExteriorFive extends EntityModel {
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

	public CanonExteriorFive() {
		textureWidth = 1024;
		textureHeight = 1024;

		Right_Door = new RendererModel(this);
		Right_Door.setRotationPoint(-18.0F, 24.0F, -21.375F);
		Right_Door.cubeList.add(new ModelBox(Right_Door, 897, 443, 0.0F, -74.0F, 0.0F, 3, 70, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 996, 106, 2.875F, -6.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 996, 388, 2.875F, -20.5F, 0.5625F, 13, 14, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 996, 373, 2.875F, -37.5F, 0.5625F, 13, 14, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 965, 126, 2.875F, -54.0F, 0.5625F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 965, 126, 2.875F, -42.0F, 0.5625F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 864, 510, 3.5F, -53.0F, 0.5625F, 1, 11, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 864, 510, 14.0F, -53.0F, 0.5625F, 2, 11, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 936, 28, 4.25F, -53.0F, 0.8125F, 10, 11, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 996, 110, 2.875F, -58.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 996, 110, 2.875F, -41.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 996, 110, 2.875F, -24.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 996, 110, 2.875F, -7.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 992, 90, 2.75F, -70.75F, 0.125F, 1, 65, 1, -0.25F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 911, 482, 6.75F, -70.75F, 0.375F, 1, 13, 1, -0.25F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 911, 482, 10.875F, -70.75F, 0.375F, 1, 13, 1, -0.25F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 992, 90, 15.0F, -70.75F, 0.125F, 1, 65, 1, -0.25F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 996, 110, 2.875F, -71.5F, 0.4375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 996, 110, 2.875F, -55.0F, 0.375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 996, 110, 2.875F, -38.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 996, 110, 2.875F, -21.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 805, 295, 2.375F, -64.75F, 0.25F, 14, 1, 1, -0.25F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 996, 106, 2.875F, -23.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 996, 106, 2.875F, -40.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 996, 106, 2.875F, -57.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 996, 106, 2.875F, -73.875F, 0.0625F, 13, 3, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 1018, 346, 15.75F, -74.0F, 0.0F, 2, 70, 1, 0.0F, false));
		Right_Door.cubeList.add(new ModelBox(Right_Door, 1018, 346, 17.0F, -74.0F, -0.5F, 2, 70, 1, 0.0F, false));

		Left_Door = new RendererModel(this);
		Left_Door.setRotationPoint(18.0F, 24.0F, -21.375F);
		Left_Door.cubeList.add(new ModelBox(Left_Door, 955, 354, -3.0F, -74.0F, 0.0F, 3, 70, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 996, 106, -15.875F, -6.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 996, 382, -15.875F, -20.5F, 0.5625F, 13, 14, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 996, 364, -15.875F, -37.5F, 0.5625F, 13, 14, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 996, 346, -15.875F, -54.5F, 0.5625F, 13, 14, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 996, 110, -15.875F, -58.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 996, 110, -15.875F, -41.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 996, 110, -15.875F, -24.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 996, 110, -15.875F, -7.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 992, 90, -3.75F, -70.75F, 0.125F, 1, 65, 1, -0.25F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 911, 482, -7.75F, -70.75F, 0.375F, 1, 13, 1, -0.25F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 911, 482, -11.875F, -70.75F, 0.375F, 1, 13, 1, -0.25F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 992, 90, -16.0F, -70.75F, 0.125F, 1, 65, 1, -0.25F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 996, 110, -15.875F, -71.5F, 0.4375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 996, 110, -15.875F, -55.0F, 0.375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 996, 110, -15.875F, -38.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 996, 110, -15.875F, -21.0F, 0.4375F, 13, 1, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 805, 295, -16.375F, -64.75F, 0.25F, 14, 1, 1, -0.25F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 996, 106, -15.875F, -23.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 996, 106, -15.875F, -40.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 996, 106, -15.875F, -57.5F, 0.0625F, 13, 3, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 996, 106, -15.875F, -73.875F, 0.0625F, 13, 3, 1, 0.0F, false));
		Left_Door.cubeList.add(new ModelBox(Left_Door, 1018, 346, -17.75F, -74.0F, 0.0F, 2, 70, 1, 0.0F, false));

		CallSignsLight = new RendererModel(this);
		CallSignsLight.setRotationPoint(0.0F, 24.0F, 0.0F);
		CallSignsLight.cubeList.add(new ModelBox(CallSignsLight, 936, 0, -20.0F, -79.25F, -24.0F, 40, 5, 4, 0.0F, false));
		CallSignsLight.cubeList.add(new ModelBox(CallSignsLight, 888, 45, -24.0F, -79.25F, -20.0F, 4, 5, 40, 0.0F, false));
		CallSignsLight.cubeList.add(new ModelBox(CallSignsLight, 936, 11, -20.0F, -79.25F, 20.0F, 40, 5, 4, 0.0F, false));
		CallSignsLight.cubeList.add(new ModelBox(CallSignsLight, 888, 0, 20.0F, -79.25F, -20.0F, 4, 5, 40, 0.0F, false));

		ShellWindows = new RendererModel(this);
		ShellWindows.setRotationPoint(13.125F, -34.375F, -21.0F);
		ShellWindows.cubeList.add(new ModelBox(ShellWindows, 901, 58, -34.125F, -13.0F, 5.875F, 1, 14, 13, -0.375F, false));
		ShellWindows.cubeList.add(new ModelBox(ShellWindows, 900, 25, -28.25F, -13.0F, 41.0F, 13, 14, 1, -0.375F, false));
		ShellWindows.cubeList.add(new ModelBox(ShellWindows, 901, 58, 6.875F, -13.0F, 23.125F, 1, 14, 13, -0.375F, false));
		ShellWindows.cubeList.add(new ModelBox(ShellWindows, 901, 58, -34.125F, -13.0F, 23.125F, 1, 14, 13, -0.375F, false));
		ShellWindows.cubeList.add(new ModelBox(ShellWindows, 900, 25, -11.0F, -13.0F, 41.0F, 13, 14, 1, -0.375F, false));
		ShellWindows.cubeList.add(new ModelBox(ShellWindows, 901, 58, 6.875F, -13.0F, 5.875F, 1, 14, 13, -0.375F, false));

		Lamp = new RendererModel(this);
		Lamp.setRotationPoint(20.0F, -73.875F, -19.5F);
		Lamp.cubeList.add(new ModelBox(Lamp, 945, 58, -22.5F, -0.75F, 17.0F, 5, 7, 5, -0.5F, false));

		Shell = new RendererModel(this);
		Shell.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Roof = new RendererModel(this);
		Roof.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Roof);
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -21.0F, -84.0F, -21.0F, 42, 5, 42, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -19.0F, -87.0F, -19.0F, 38, 3, 38, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -17.0F, -87.375F, -17.0F, 34, 3, 34, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -15.0F, -87.625F, -15.0F, 30, 3, 30, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -13.0F, -87.875F, -13.0F, 26, 3, 26, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -11.0F, -88.25F, -11.0F, 22, 3, 22, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -9.0F, -88.5F, -9.0F, 18, 3, 18, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -7.0F, -88.75F, -7.0F, 14, 3, 14, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -5.0F, -89.0F, -5.0F, 10, 3, 10, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -3.5F, -92.0F, -3.5F, 7, 3, 7, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -3.5F, -92.5F, -3.5F, 7, 3, 7, -0.25F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -3.5F, -99.875F, -3.5F, 7, 2, 7, -0.25F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -3.5F, -93.0F, -3.5F, 7, 3, 7, -0.5F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -3.5F, -100.375F, -3.5F, 7, 3, 7, -0.5F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -3.0F, -100.625F, -3.0F, 6, 3, 6, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -3.0F, -101.125F, -3.0F, 6, 3, 6, -0.5F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -2.75F, -98.25F, 1.75F, 1, 6, 1, -0.25F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, 1.75F, -98.25F, 1.75F, 1, 6, 1, -0.25F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, 1.75F, -98.25F, -2.75F, 1, 6, 1, -0.25F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, 0.25F, -98.5F, -2.75F, 1, 7, 1, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -2.75F, -98.5F, -1.25F, 1, 7, 1, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -1.25F, -98.5F, 1.75F, 1, 7, 1, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, 1.75F, -98.5F, 0.25F, 1, 7, 1, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -1.25F, -98.5F, -2.75F, 1, 7, 1, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -2.6875F, -95.8125F, -2.375F, 1, 1, 5, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -2.375F, -95.8125F, 1.6875F, 5, 1, 1, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, 1.6875F, -95.8125F, -2.625F, 1, 1, 5, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -2.625F, -95.8125F, -2.6875F, 5, 1, 1, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -2.75F, -98.5F, 0.25F, 1, 7, 1, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, 0.25F, -98.5F, 1.75F, 1, 7, 1, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, 1.75F, -98.5F, -1.25F, 1, 7, 1, -0.375F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -2.75F, -98.25F, -2.75F, 1, 6, 1, -0.25F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, 19.25F, -83.5F, -21.25F, 2, 3, 2, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -21.25F, -83.5F, -21.25F, 2, 3, 2, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, -21.25F, -83.5F, 19.25F, 2, 3, 2, 0.0F, false));
		Roof.cubeList.add(new ModelBox(Roof, 849, 197, 19.25F, -83.5F, 19.25F, 2, 3, 2, 0.0F, false));

		Walls = new RendererModel(this);
		Walls.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Walls);
		

		leftside = new RendererModel(this);
		leftside.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls.addChild(leftside);
		leftside.cubeList.add(new ModelBox(leftside, 848, 456, -21.375F, -74.0F, -18.0F, 1, 70, 3, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 996, 90, -21.3125F, -6.5F, -15.125F, 1, 3, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 998, 453, -20.8125F, -20.5F, -15.125F, 1, 14, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 998, 566, -20.8125F, -37.5F, -15.125F, 1, 14, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 998, 441, -20.8125F, -54.5F, -15.125F, 1, 14, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 996, 112, -20.9375F, -58.0F, -15.125F, 1, 1, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 996, 112, -20.9375F, -41.0F, -15.125F, 1, 1, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 996, 112, -20.9375F, -24.0F, -15.125F, 1, 1, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 996, 112, -20.9375F, -7.0F, -15.125F, 1, 1, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 852, 432, -21.25F, -70.75F, -15.25F, 1, 65, 1, -0.25F, false));
		leftside.cubeList.add(new ModelBox(leftside, 911, 482, -21.0F, -70.75F, -11.25F, 1, 13, 1, -0.25F, false));
		leftside.cubeList.add(new ModelBox(leftside, 911, 482, -21.0F, -70.75F, -7.125F, 1, 13, 1, -0.25F, false));
		leftside.cubeList.add(new ModelBox(leftside, 852, 432, -21.25F, -70.75F, -3.0F, 1, 65, 1, -0.25F, false));
		leftside.cubeList.add(new ModelBox(leftside, 996, 112, -20.9375F, -71.5F, -15.125F, 1, 1, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 996, 112, -21.0F, -55.0F, -15.125F, 1, 1, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 996, 112, -20.9375F, -38.0F, -15.125F, 1, 1, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 996, 112, -20.9375F, -21.0F, -15.125F, 1, 1, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 996, 112, -21.125F, -64.75F, -15.625F, 1, 1, 14, -0.25F, false));
		leftside.cubeList.add(new ModelBox(leftside, 996, 90, -21.3125F, -23.5F, -15.125F, 1, 3, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 996, 90, -21.3125F, -40.5F, -15.125F, 1, 3, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 996, 90, -21.3125F, -57.5F, -15.125F, 1, 3, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 996, 90, -21.3125F, -73.875F, -15.125F, 1, 3, 13, 0.0F, false));
		leftside.cubeList.add(new ModelBox(leftside, 904, 436, -21.375F, -74.0F, -2.25F, 1, 70, 2, 0.0F, false));

		leftside2 = new RendererModel(this);
		leftside2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls.addChild(leftside2);
		leftside2.cubeList.add(new ModelBox(leftside2, 892, 464, -18.0F, -74.0F, 20.375F, 3, 70, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 996, 106, -15.125F, -6.5F, 20.3125F, 13, 3, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 996, 388, -15.125F, -20.5F, 19.8125F, 13, 14, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 996, 388, -15.125F, -37.5F, 19.8125F, 13, 14, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 996, 388, -15.125F, -54.5F, 19.8125F, 13, 14, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 996, 110, -15.125F, -58.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 996, 110, -15.125F, -41.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 996, 110, -15.125F, -24.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 996, 110, -15.125F, -7.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 992, 90, -15.25F, -70.75F, 20.25F, 1, 65, 1, -0.25F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 911, 482, -11.25F, -70.75F, 20.0F, 1, 13, 1, -0.25F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 911, 482, -7.125F, -70.75F, 20.0F, 1, 13, 1, -0.25F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 992, 90, -3.0F, -70.75F, 20.25F, 1, 65, 1, -0.25F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 996, 110, -15.125F, -71.5F, 19.9375F, 13, 1, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 996, 110, -15.125F, -55.0F, 20.0F, 13, 1, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 996, 110, -15.125F, -38.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 996, 110, -15.125F, -21.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 805, 295, -15.625F, -64.75F, 20.125F, 14, 1, 1, -0.25F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 996, 106, -15.125F, -23.5F, 20.3125F, 13, 3, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 996, 106, -15.125F, -40.5F, 20.3125F, 13, 3, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 996, 106, -15.125F, -57.5F, 20.3125F, 13, 3, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 996, 106, -15.125F, -73.875F, 20.3125F, 13, 3, 1, 0.0F, false));
		leftside2.cubeList.add(new ModelBox(leftside2, 1018, 346, -2.25F, -74.0F, 20.375F, 2, 70, 1, 0.0F, false));

		leftside3 = new RendererModel(this);
		leftside3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls.addChild(leftside3);
		leftside3.cubeList.add(new ModelBox(leftside3, 848, 452, 20.375F, -74.0F, 15.0F, 1, 70, 3, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 996, 90, 20.3125F, -6.5F, 2.125F, 1, 3, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 891, 443, 19.8125F, -20.5F, 2.125F, 1, 14, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 896, 433, 19.8125F, -37.5F, 2.125F, 1, 14, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 857, 414, 19.8125F, -54.5F, 2.125F, 1, 14, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 996, 112, 19.9375F, -58.0F, 2.125F, 1, 1, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 996, 112, 19.9375F, -41.0F, 2.125F, 1, 1, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 996, 112, 19.9375F, -24.0F, 2.125F, 1, 1, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 996, 112, 19.9375F, -7.0F, 2.125F, 1, 1, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 836, 344, 20.25F, -70.75F, 14.25F, 1, 65, 1, -0.25F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 911, 482, 20.0F, -70.75F, 10.25F, 1, 13, 1, -0.25F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 911, 482, 20.0F, -70.75F, 6.125F, 1, 13, 1, -0.25F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 836, 344, 20.25F, -70.75F, 2.0F, 1, 65, 1, -0.25F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 996, 112, 19.9375F, -71.5F, 2.125F, 1, 1, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 996, 112, 20.0F, -55.0F, 2.125F, 1, 1, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 996, 112, 19.9375F, -38.0F, 2.125F, 1, 1, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 996, 112, 19.9375F, -21.0F, 2.125F, 1, 1, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 996, 112, 20.125F, -64.75F, 1.625F, 1, 1, 14, -0.25F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 996, 90, 20.3125F, -23.5F, 2.125F, 1, 3, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 996, 90, 20.3125F, -40.5F, 2.125F, 1, 3, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 996, 90, 20.3125F, -57.5F, 2.125F, 1, 3, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 996, 90, 20.3125F, -73.875F, 2.125F, 1, 3, 13, 0.0F, false));
		leftside3.cubeList.add(new ModelBox(leftside3, 904, 432, 20.375F, -74.0F, 0.25F, 1, 70, 2, 0.0F, false));

		rightside = new RendererModel(this);
		rightside.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls.addChild(rightside);
		rightside.cubeList.add(new ModelBox(rightside, 904, 432, -21.375F, -74.0F, 15.0F, 1, 70, 3, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 996, 90, -21.3125F, -6.5F, 2.125F, 1, 3, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 998, 423, -20.8125F, -20.5F, 2.125F, 1, 14, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 998, 566, -20.8125F, -37.5F, 2.125F, 1, 14, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 996, 112, -20.9375F, -58.0F, 2.125F, 1, 1, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 996, 112, -20.9375F, -41.0F, 2.125F, 1, 1, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 996, 112, -20.9375F, -24.0F, 2.125F, 1, 1, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 996, 112, -20.9375F, -7.0F, 2.125F, 1, 1, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 852, 432, -21.25F, -70.75F, 14.25F, 1, 65, 1, -0.25F, false));
		rightside.cubeList.add(new ModelBox(rightside, 911, 482, -21.0F, -70.75F, 10.25F, 1, 13, 1, -0.25F, false));
		rightside.cubeList.add(new ModelBox(rightside, 911, 482, -21.0F, -70.75F, 6.125F, 1, 13, 1, -0.25F, false));
		rightside.cubeList.add(new ModelBox(rightside, 852, 432, -21.25F, -70.75F, 2.0F, 1, 65, 1, -0.25F, false));
		rightside.cubeList.add(new ModelBox(rightside, 996, 112, -20.9375F, -71.5F, 2.125F, 1, 1, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 996, 112, -21.0F, -55.0F, 2.125F, 1, 1, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 996, 112, -20.9375F, -38.0F, 2.125F, 1, 1, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 996, 112, -20.9375F, -21.0F, 2.125F, 1, 1, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 996, 112, -21.125F, -64.75F, 1.625F, 1, 1, 14, -0.25F, false));
		rightside.cubeList.add(new ModelBox(rightside, 996, 90, -21.3125F, -23.5F, 2.125F, 1, 3, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 996, 90, -21.3125F, -40.5F, 2.125F, 1, 3, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 996, 90, -21.3125F, -57.5F, 2.125F, 1, 3, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 996, 90, -21.3125F, -73.875F, 2.125F, 1, 3, 13, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 880, 428, -21.375F, -74.0F, 0.25F, 1, 70, 2, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 856, 468, -21.875F, -74.0F, -1.0F, 1, 70, 2, 0.0F, false));
		rightside.cubeList.add(new ModelBox(rightside, 998, 492, -20.8125F, -54.5F, 2.125F, 1, 14, 13, 0.0F, false));

		rightside2 = new RendererModel(this);
		rightside2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls.addChild(rightside2);
		rightside2.cubeList.add(new ModelBox(rightside2, 900, 448, 15.0F, -74.0F, 20.375F, 3, 70, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 996, 106, 2.125F, -6.5F, 20.3125F, 13, 3, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 996, 364, 2.125F, -20.5F, 19.8125F, 13, 14, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 996, 388, 2.125F, -37.5F, 19.8125F, 13, 14, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 996, 110, 2.125F, -58.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 996, 110, 2.125F, -41.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 996, 110, 2.125F, -24.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 996, 110, 2.125F, -7.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 992, 90, 14.25F, -70.75F, 20.25F, 1, 65, 1, -0.25F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 911, 482, 10.25F, -70.75F, 20.0F, 1, 13, 1, -0.25F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 911, 482, 6.125F, -70.75F, 20.0F, 1, 13, 1, -0.25F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 992, 90, 2.0F, -70.75F, 20.25F, 1, 65, 1, -0.25F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 996, 110, 2.125F, -71.5F, 19.9375F, 13, 1, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 996, 110, 2.125F, -55.0F, 20.0F, 13, 1, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 996, 110, 2.125F, -38.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 996, 110, 2.125F, -21.0F, 19.9375F, 13, 1, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 805, 295, 1.625F, -64.75F, 20.125F, 14, 1, 1, -0.25F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 996, 106, 2.125F, -23.5F, 20.3125F, 13, 3, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 996, 106, 2.125F, -40.5F, 20.3125F, 13, 3, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 996, 106, 2.125F, -57.5F, 20.3125F, 13, 3, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 996, 106, 2.125F, -73.875F, 20.3125F, 13, 3, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 1018, 346, 0.25F, -74.0F, 20.375F, 2, 70, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 1018, 346, -1.0F, -74.0F, 20.875F, 2, 70, 1, 0.0F, false));
		rightside2.cubeList.add(new ModelBox(rightside2, 996, 388, 2.125F, -54.5F, 19.8125F, 13, 14, 1, 0.0F, false));

		rightside3 = new RendererModel(this);
		rightside3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls.addChild(rightside3);
		rightside3.cubeList.add(new ModelBox(rightside3, 884, 440, 20.375F, -74.0F, -18.0F, 1, 70, 3, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 996, 90, 20.3125F, -6.5F, -15.125F, 1, 3, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 891, 453, 19.8125F, -20.5F, -15.125F, 1, 14, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 935, 458, 19.8125F, -37.5F, -15.125F, 1, 14, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 996, 112, 19.9375F, -58.0F, -15.125F, 1, 1, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 996, 112, 19.9375F, -41.0F, -15.125F, 1, 1, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 996, 112, 19.9375F, -24.0F, -15.125F, 1, 1, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 996, 112, 19.9375F, -7.0F, -15.125F, 1, 1, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 836, 344, 20.25F, -70.75F, -15.25F, 1, 65, 1, -0.25F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 911, 482, 20.0F, -70.75F, -11.25F, 1, 13, 1, -0.25F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 911, 482, 20.0F, -70.75F, -7.125F, 1, 13, 1, -0.25F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 836, 344, 20.25F, -70.75F, -3.0F, 1, 65, 1, -0.25F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 996, 112, 19.9375F, -71.5F, -15.125F, 1, 1, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 996, 112, 20.0F, -55.0F, -15.125F, 1, 1, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 996, 112, 19.9375F, -38.0F, -15.125F, 1, 1, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 996, 112, 19.9375F, -21.0F, -15.125F, 1, 1, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 996, 112, 20.125F, -64.75F, -15.625F, 1, 1, 14, -0.25F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 996, 90, 20.3125F, -23.5F, -15.125F, 1, 3, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 996, 90, 20.3125F, -40.5F, -15.125F, 1, 3, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 996, 90, 20.3125F, -57.5F, -15.125F, 1, 3, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 996, 90, 20.3125F, -73.875F, -15.125F, 1, 3, 13, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 932, 428, 20.375F, -74.0F, -2.25F, 1, 70, 2, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 820, 448, 20.875F, -74.0F, -1.0F, 1, 70, 2, 0.0F, false));
		rightside3.cubeList.add(new ModelBox(rightside3, 940, 443, 19.8125F, -54.5F, -15.125F, 1, 14, 13, 0.0F, false));

		PCBSign = new RendererModel(this);
		PCBSign.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(PCBSign);
		PCBSign.cubeList.add(new ModelBox(PCBSign, 849, 241, -20.5F, -74.75F, -25.0F, 41, 1, 4, -0.1875F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 847, 433, -25.0F, -74.75F, -20.5F, 4, 1, 41, -0.1875F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 849, 241, -20.5F, -74.75F, 21.0F, 41, 1, 4, -0.1875F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 847, 450, 21.0F, -74.75F, -20.5F, 4, 1, 41, -0.1875F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 849, 241, 19.5F, -79.25F, -25.0F, 1, 5, 4, -0.1874F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 849, 241, -25.0F, -79.25F, -20.5F, 4, 5, 1, -0.1874F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 849, 241, -20.5F, -79.25F, 21.0F, 1, 5, 4, -0.1874F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 849, 241, 21.0F, -79.25F, 19.5F, 4, 5, 1, -0.1874F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 849, 241, -20.5F, -79.25F, -25.0F, 1, 5, 4, -0.1874F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 849, 241, -25.0F, -79.25F, 19.5F, 4, 5, 1, -0.1874F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 849, 241, 19.5F, -79.25F, 21.0F, 1, 5, 4, -0.1874F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 849, 241, 21.0F, -79.25F, -20.5F, 4, 5, 1, -0.1874F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 849, 241, -20.5F, -79.75F, -25.0F, 41, 1, 4, -0.1875F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 847, 433, -25.0F, -79.75F, -20.5F, 4, 1, 41, -0.1875F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 849, 241, -20.5F, -79.75F, 21.0F, 41, 1, 4, -0.1875F, false));
		PCBSign.cubeList.add(new ModelBox(PCBSign, 864, 438, 21.0F, -79.75F, -20.5F, 4, 1, 41, -0.1875F, false));

		Frames = new RendererModel(this);
		Frames.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Frames);
		Frames.cubeList.add(new ModelBox(Frames, 866, 453, 17.3125F, -74.0F, -22.375F, 1, 70, 1, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 920, 456, -22.375F, -74.0F, -18.3125F, 1, 70, 1, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 832, 473, -18.3125F, -74.0F, 21.375F, 1, 70, 1, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 866, 453, 21.375F, -74.0F, 17.3125F, 1, 70, 1, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 847, 217, -18.0F, -74.0F, -22.375F, 36, 1, 1, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 849, 473, -22.375F, -74.0F, -18.0F, 1, 1, 36, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 847, 217, -18.0F, -74.0F, 21.375F, 36, 1, 1, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 849, 473, 21.375F, -74.0F, -18.0F, 1, 1, 36, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 866, 453, -18.3125F, -74.0F, -22.375F, 1, 70, 1, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 866, 453, -22.375F, -74.0F, 17.3125F, 1, 70, 1, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 832, 473, 17.3125F, -74.0F, 21.375F, 1, 70, 1, 0.0F, false));
		Frames.cubeList.add(new ModelBox(Frames, 866, 453, 21.375F, -74.0F, -18.3125F, 1, 70, 1, 0.0F, false));

		Posts = new RendererModel(this);
		Posts.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Posts);
		Posts.cubeList.add(new ModelBox(Posts, 1006, 507, 18.25F, -80.625F, -23.25F, 5, 77, 5, 0.0F, false));
		Posts.cubeList.add(new ModelBox(Posts, 916, 504, -23.25F, -80.625F, -23.25F, 5, 77, 5, 0.0F, false));
		Posts.cubeList.add(new ModelBox(Posts, 888, 504, -23.25F, -80.625F, 18.25F, 5, 77, 5, 0.0F, false));
		Posts.cubeList.add(new ModelBox(Posts, 900, 504, 18.25F, -80.625F, 18.25F, 5, 77, 5, 0.0F, false));
		Posts.cubeList.add(new ModelBox(Posts, 874, 482, 17.9375F, -80.5625F, -22.9375F, 5, 77, 5, 0.0F, false));
		Posts.cubeList.add(new ModelBox(Posts, 874, 482, -22.9375F, -80.5625F, -22.9375F, 5, 77, 5, 0.0F, false));
		Posts.cubeList.add(new ModelBox(Posts, 874, 482, -22.9375F, -80.5625F, 17.9375F, 5, 77, 5, 0.0F, false));
		Posts.cubeList.add(new ModelBox(Posts, 874, 482, 17.9375F, -80.5625F, 17.9375F, 5, 77, 5, 0.0F, false));

		Base = new RendererModel(this);
		Base.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Base);
		Base.cubeList.add(new ModelBox(Base, 795, 217, -24.0F, -4.0F, -24.0F, 48, 1, 48, 0.0F, false));
		Base.cubeList.add(new ModelBox(Base, 795, 217, -24.0F, -3.5F, -24.0F, 48, 1, 48, 0.25F, false));
		Base.cubeList.add(new ModelBox(Base, 795, 217, -24.0F, -2.875F, -24.0F, 48, 1, 48, 0.5F, false));
		Base.cubeList.add(new ModelBox(Base, 795, 217, -24.0F, -2.4375F, -24.0F, 48, 1, 48, 0.75F, false));
		Base.cubeList.add(new ModelBox(Base, 795, 217, -25.0F, -3.0F, -25.0F, 50, 3, 50, 0.0F, false));

		boti = new RendererModel(this);
		boti.setRotationPoint(0.0F, 24.0F, 0.0F);
		boti.cubeList.add(new ModelBox(boti, 657, 209, -20.0F, -80.0F, -4.5F, 40, 76, 1, 0.0F, false));

		LeftWindow = new RendererModel(this);
		LeftWindow.setRotationPoint(18.0F, -34.375F, -21.375F);
		LeftWindow.cubeList.add(new ModelBox(LeftWindow, 900, 25, -15.875F, -13.0F, 0.375F, 13, 14, 1, -0.375F, false));

		RightWindow = new RendererModel(this);
		RightWindow.setRotationPoint(-18.0F, -34.375F, -21.375F);
		RightWindow.cubeList.add(new ModelBox(RightWindow, 900, 25, 2.875F, -13.0F, 0.375F, 13, 14, 1, -0.375F, false));
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