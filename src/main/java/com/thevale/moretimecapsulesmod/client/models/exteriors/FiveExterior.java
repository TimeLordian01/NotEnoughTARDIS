package com.thevale.moretimecapsulesmod.client.models.exteriors;// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.model.RenderMaterial;
import net.minecraft.entity.Entity;
import net.tardis.mod.client.models.exteriors.ExteriorModel;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.ModelHelper;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class FiveExterior extends ExteriorModel {
	private final ModelRenderer Right_Door;
	private final ModelRenderer Left_Door;
	private final ModelRenderer CallSignsLight;
	private final ModelRenderer ShellWindows;
	private final ModelRenderer Lamp;
	private final ModelRenderer Shell;
	private final ModelRenderer Roof;
	private final ModelRenderer Walls;
	private final ModelRenderer leftside;
	private final ModelRenderer leftside2;
	private final ModelRenderer leftside3;
	private final ModelRenderer rightside;
	private final ModelRenderer rightside2;
	private final ModelRenderer rightside3;
	private final ModelRenderer PCBSign;
	private final ModelRenderer Frames;
	private final ModelRenderer Posts;
	private final ModelRenderer Base;
	private final ModelRenderer boti;
	private final ModelRenderer LeftWindow;
	private final ModelRenderer RightWindow;

	public FiveExterior() {
		textureWidth = 432;
		textureHeight = 432;

		Right_Door = new ModelRenderer(this);
		Right_Door.setRotationPoint(-18.0F, 24.0F, -21.375F);
		Right_Door.setTextureOffset(78, 306).addBox(0.0F, -74.0F, 0.0F, 3.0F, 70.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(0, 296).addBox(2.875F, -6.5F, 0.0625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(360, 238).addBox(2.875F, -20.5F, 0.5625F, 13.0F, 14.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(360, 222).addBox(2.875F, -37.5F, 0.5625F, 13.0F, 14.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(377, 343).addBox(2.875F, -54.0F, 0.5625F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(320, 41).addBox(2.875F, -42.0F, 0.5625F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(152, 54).addBox(3.5F, -53.0F, 0.5625F, 1.0F, 11.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(145, 54).addBox(14.0F, -53.0F, 0.5625F, 2.0F, 11.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(167, 0).addBox(4.25F, -53.0F, 0.8125F, 10.0F, 11.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(377, 81).addBox(2.875F, -58.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(377, 75).addBox(2.875F, -41.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(376, 121).addBox(2.875F, -24.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(363, 340).addBox(2.875F, -7.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(356, 356).addBox(2.75F, -70.75F, 0.125F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		Right_Door.setTextureOffset(29, 170).addBox(6.75F, -70.75F, 0.375F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		Right_Door.setTextureOffset(144, 157).addBox(10.875F, -70.75F, 0.375F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		Right_Door.setTextureOffset(355, 276).addBox(15.0F, -70.75F, 0.125F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		Right_Door.setTextureOffset(377, 78).addBox(2.875F, -71.5F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(377, 72).addBox(2.875F, -55.0F, 0.375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(377, 377).addBox(2.875F, -38.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(376, 118).addBox(2.875F, -21.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(278, 38).addBox(2.375F, -64.75F, 0.25F, 14.0F, 1.0F, 1.0F, -0.25F, false);
		Right_Door.setTextureOffset(294, 278).addBox(2.875F, -23.5F, 0.0625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(290, 97).addBox(2.875F, -40.5F, 0.0625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(290, 92).addBox(2.875F, -57.5F, 0.0625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(241, 279).addBox(2.875F, -73.875F, 0.0625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(182, 316).addBox(15.75F, -74.0F, 0.0F, 2.0F, 70.0F, 1.0F, 0.0F, false);
		Right_Door.setTextureOffset(168, 316).addBox(17.0F, -74.0F, -0.5F, 2.0F, 70.0F, 1.0F, 0.0F, false);

		Left_Door = new ModelRenderer(this);
		Left_Door.setRotationPoint(18.0F, 24.0F, -21.375F);
		Left_Door.setTextureOffset(69, 306).addBox(-3.0F, -74.0F, 0.0F, 3.0F, 70.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(180, 279).addBox(-15.875F, -6.5F, 0.0625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(358, 190).addBox(-15.875F, -20.5F, 0.5625F, 13.0F, 14.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(358, 174).addBox(-15.875F, -37.5F, 0.5625F, 13.0F, 14.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(358, 158).addBox(-15.875F, -54.5F, 0.5625F, 13.0F, 14.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(363, 337).addBox(-15.875F, -58.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(363, 334).addBox(-15.875F, -41.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(363, 331).addBox(-15.875F, -24.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(337, 129).addBox(-15.875F, -7.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(355, 209).addBox(-3.75F, -70.75F, 0.125F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		Left_Door.setTextureOffset(150, 82).addBox(-7.75F, -70.75F, 0.375F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		Left_Door.setTextureOffset(145, 82).addBox(-11.875F, -70.75F, 0.375F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		Left_Door.setTextureOffset(353, 142).addBox(-16.0F, -70.75F, 0.125F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		Left_Door.setTextureOffset(337, 126).addBox(-15.875F, -71.5F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(321, 317).addBox(-15.875F, -55.0F, 0.375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(320, 314).addBox(-15.875F, -38.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(320, 44).addBox(-15.875F, -21.0F, 0.4375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(252, 205).addBox(-16.375F, -64.75F, 0.25F, 14.0F, 1.0F, 1.0F, -0.25F, false);
		Left_Door.setTextureOffset(66, 279).addBox(-15.875F, -23.5F, 0.0625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(50, 268).addBox(-15.875F, -40.5F, 0.0625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(245, 266).addBox(-15.875F, -57.5F, 0.0625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(50, 263).addBox(-15.875F, -73.875F, 0.0625F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		Left_Door.setTextureOffset(175, 316).addBox(-17.75F, -74.0F, 0.0F, 2.0F, 70.0F, 1.0F, 0.0F, false);

		CallSignsLight = new ModelRenderer(this);
		CallSignsLight.setRotationPoint(0.0F, 24.0F, 0.0F);
		CallSignsLight.setTextureOffset(290, 48).addBox(-20.0F, -79.25F, -24.0F, 40.0F, 5.0F, 4.0F, 0.0F, false);
		CallSignsLight.setTextureOffset(196, 233).addBox(-24.0F, -79.25F, -20.0F, 4.0F, 5.0F, 40.0F, 0.0F, false);
		CallSignsLight.setTextureOffset(282, 132).addBox(-20.0F, -79.25F, 20.0F, 40.0F, 5.0F, 4.0F, 0.0F, false);
		CallSignsLight.setTextureOffset(65, 233).addBox(20.0F, -79.25F, -20.0F, 4.0F, 5.0F, 40.0F, 0.0F, false);

		ShellWindows = new ModelRenderer(this);
		ShellWindows.setRotationPoint(13.125F, -34.375F, -21.0F);
		ShellWindows.setTextureOffset(161, 69).addBox(-34.125F, -13.0F, 5.875F, 1.0F, 14.0F, 13.0F, -0.375F, false);
		ShellWindows.setTextureOffset(317, 16).addBox(-28.25F, -13.0F, 41.0F, 13.0F, 14.0F, 1.0F, -0.375F, false);
		ShellWindows.setTextureOffset(16, 16).addBox(6.875F, -13.0F, 23.125F, 1.0F, 14.0F, 13.0F, -0.375F, false);
		ShellWindows.setTextureOffset(154, 154).addBox(-34.125F, -13.0F, 23.125F, 1.0F, 14.0F, 13.0F, -0.375F, false);
		ShellWindows.setTextureOffset(317, 0).addBox(-11.0F, -13.0F, 41.0F, 13.0F, 14.0F, 1.0F, -0.375F, false);
		ShellWindows.setTextureOffset(0, 0).addBox(6.875F, -13.0F, 5.875F, 1.0F, 14.0F, 13.0F, -0.375F, false);

		Lamp = new ModelRenderer(this);
		Lamp.setRotationPoint(20.0F, -73.875F, -19.5F);
		Lamp.setTextureOffset(16, 157).addBox(-22.5F, -0.75F, 17.0F, 5.0F, 7.0F, 5.0F, -0.5F, false);

		Shell = new ModelRenderer(this);
		Shell.setRotationPoint(0.0F, 24.0F, 0.0F);


		Roof = new ModelRenderer(this);
		Roof.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Roof);
		Roof.setTextureOffset(151, 0).addBox(-21.0F, -84.0F, -21.0F, 42.0F, 5.0F, 42.0F, 0.0F, false);
		Roof.setTextureOffset(0, 157).addBox(-19.0F, -87.0F, -19.0F, 38.0F, 3.0F, 38.0F, 0.0F, false);
		Roof.setTextureOffset(145, 106).addBox(-17.0F, -87.375F, -17.0F, 34.0F, 3.0F, 34.0F, 0.0F, false);
		Roof.setTextureOffset(0, 199).addBox(-15.0F, -87.625F, -15.0F, 30.0F, 3.0F, 30.0F, 0.0F, false);
		Roof.setTextureOffset(0, 233).addBox(-13.0F, -87.875F, -13.0F, 26.0F, 3.0F, 26.0F, 0.0F, false);
		Roof.setTextureOffset(248, 106).addBox(-11.0F, -88.25F, -11.0F, 22.0F, 3.0F, 22.0F, 0.0F, false);
		Roof.setTextureOffset(290, 70).addBox(-9.0F, -88.5F, -9.0F, 18.0F, 3.0F, 18.0F, 0.0F, false);
		Roof.setTextureOffset(290, 142).addBox(-7.0F, -88.75F, -7.0F, 14.0F, 3.0F, 14.0F, 0.0F, false);
		Roof.setTextureOffset(151, 28).addBox(-5.0F, -89.0F, -5.0F, 10.0F, 3.0F, 10.0F, 0.0F, false);
		Roof.setTextureOffset(161, 54).addBox(-3.5F, -92.0F, -3.5F, 7.0F, 3.0F, 7.0F, 0.0F, false);
		Roof.setTextureOffset(16, 0).addBox(-3.5F, -92.5F, -3.5F, 7.0F, 3.0F, 7.0F, -0.25F, false);
		Roof.setTextureOffset(0, 185).addBox(-3.5F, -99.875F, -3.5F, 7.0F, 2.0F, 7.0F, -0.25F, false);
		Roof.setTextureOffset(16, 104).addBox(-3.5F, -93.0F, -3.5F, 7.0F, 3.0F, 7.0F, -0.5F, false);
		Roof.setTextureOffset(16, 54).addBox(-3.5F, -100.375F, -3.5F, 7.0F, 3.0F, 7.0F, -0.5F, false);
		Roof.setTextureOffset(0, 233).addBox(-3.0F, -100.625F, -3.0F, 6.0F, 3.0F, 6.0F, -0.375F, false);
		Roof.setTextureOffset(79, 233).addBox(-3.0F, -101.125F, -3.0F, 6.0F, 3.0F, 6.0F, -0.5F, false);
		Roof.setTextureOffset(144, 172).addBox(-2.75F, -98.25F, 1.75F, 1.0F, 6.0F, 1.0F, -0.25F, false);
		Roof.setTextureOffset(171, 106).addBox(1.75F, -98.25F, 1.75F, 1.0F, 6.0F, 1.0F, -0.25F, false);
		Roof.setTextureOffset(170, 154).addBox(1.75F, -98.25F, -2.75F, 1.0F, 6.0F, 1.0F, -0.25F, false);
		Roof.setTextureOffset(166, 106).addBox(0.25F, -98.5F, -2.75F, 1.0F, 7.0F, 1.0F, -0.375F, false);
		Roof.setTextureOffset(136, 157).addBox(-2.75F, -98.5F, -1.25F, 1.0F, 7.0F, 1.0F, -0.375F, false);
		Roof.setTextureOffset(120, 157).addBox(-1.25F, -98.5F, 1.75F, 1.0F, 7.0F, 1.0F, -0.375F, false);
		Roof.setTextureOffset(156, 28).addBox(1.75F, -98.5F, 0.25F, 1.0F, 7.0F, 1.0F, -0.375F, false);
		Roof.setTextureOffset(161, 106).addBox(-1.25F, -98.5F, -2.75F, 1.0F, 7.0F, 1.0F, -0.375F, false);
		Roof.setTextureOffset(0, 104).addBox(-2.6875F, -95.8125F, -2.375F, 1.0F, 1.0F, 5.0F, -0.375F, false);
		Roof.setTextureOffset(0, 38).addBox(-2.375F, -95.8125F, 1.6875F, 5.0F, 1.0F, 1.0F, -0.375F, false);
		Roof.setTextureOffset(154, 154).addBox(1.6875F, -95.8125F, -2.625F, 1.0F, 1.0F, 5.0F, -0.375F, false);
		Roof.setTextureOffset(0, 10).addBox(-2.625F, -95.8125F, -2.6875F, 5.0F, 1.0F, 1.0F, -0.375F, false);
		Roof.setTextureOffset(131, 157).addBox(-2.75F, -98.5F, 0.25F, 1.0F, 7.0F, 1.0F, -0.375F, false);
		Roof.setTextureOffset(115, 157).addBox(0.25F, -98.5F, 1.75F, 1.0F, 7.0F, 1.0F, -0.375F, false);
		Roof.setTextureOffset(151, 28).addBox(1.75F, -98.5F, -1.25F, 1.0F, 7.0F, 1.0F, -0.375F, false);
		Roof.setTextureOffset(32, 21).addBox(-2.75F, -98.25F, -2.75F, 1.0F, 6.0F, 1.0F, -0.25F, false);
		Roof.setTextureOffset(0, 61).addBox(19.25F, -83.5F, -21.25F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		Roof.setTextureOffset(38, 54).addBox(-21.25F, -83.5F, -21.25F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		Roof.setTextureOffset(38, 44).addBox(-21.25F, -83.5F, 19.25F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		Roof.setTextureOffset(29, 44).addBox(19.25F, -83.5F, 19.25F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		Walls = new ModelRenderer(this);
		Walls.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Walls);


		leftside = new ModelRenderer(this);
		leftside.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls.addChild(leftside);
		leftside.setTextureOffset(42, 306).addBox(-21.375F, -74.0F, -18.0F, 1.0F, 70.0F, 3.0F, 0.0F, false);
		leftside.setTextureOffset(316, 297).addBox(-21.3125F, -6.5F, -15.125F, 1.0F, 3.0F, 13.0F, 0.0F, false);
		leftside.setTextureOffset(236, 195).addBox(-20.8125F, -20.5F, -15.125F, 1.0F, 14.0F, 13.0F, 0.0F, false);
		leftside.setTextureOffset(91, 199).addBox(-20.8125F, -37.5F, -15.125F, 1.0F, 14.0F, 13.0F, 0.0F, false);
		leftside.setTextureOffset(0, 199).addBox(-20.8125F, -54.5F, -15.125F, 1.0F, 14.0F, 13.0F, 0.0F, false);
		leftside.setTextureOffset(376, 316).addBox(-20.9375F, -58.0F, -15.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		leftside.setTextureOffset(376, 301).addBox(-20.9375F, -41.0F, -15.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		leftside.setTextureOffset(376, 286).addBox(-20.9375F, -24.0F, -15.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		leftside.setTextureOffset(376, 271).addBox(-20.9375F, -7.0F, -15.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		leftside.setTextureOffset(351, 351).addBox(-21.25F, -70.75F, -15.25F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		leftside.setTextureOffset(5, 132).addBox(-21.0F, -70.75F, -11.25F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		leftside.setTextureOffset(0, 132).addBox(-21.0F, -70.75F, -7.125F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		leftside.setTextureOffset(350, 276).addBox(-21.25F, -70.75F, -3.0F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		leftside.setTextureOffset(376, 256).addBox(-20.9375F, -71.5F, -15.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		leftside.setTextureOffset(376, 241).addBox(-21.0F, -55.0F, -15.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		leftside.setTextureOffset(376, 103).addBox(-20.9375F, -38.0F, -15.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		leftside.setTextureOffset(361, 376).addBox(-20.9375F, -21.0F, -15.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		leftside.setTextureOffset(163, 273).addBox(-21.125F, -64.75F, -15.625F, 1.0F, 1.0F, 14.0F, -0.25F, false);
		leftside.setTextureOffset(315, 106).addBox(-21.3125F, -23.5F, -15.125F, 1.0F, 3.0F, 13.0F, 0.0F, false);
		leftside.setTextureOffset(311, 216).addBox(-21.3125F, -40.5F, -15.125F, 1.0F, 3.0F, 13.0F, 0.0F, false);
		leftside.setTextureOffset(306, 164).addBox(-21.3125F, -57.5F, -15.125F, 1.0F, 3.0F, 13.0F, 0.0F, false);
		leftside.setTextureOffset(112, 296).addBox(-21.3125F, -73.875F, -15.125F, 1.0F, 3.0F, 13.0F, 0.0F, false);
		leftside.setTextureOffset(140, 316).addBox(-21.375F, -74.0F, -2.25F, 1.0F, 70.0F, 2.0F, 0.0F, false);

		leftside2 = new ModelRenderer(this);
		leftside2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls.addChild(leftside2);
		leftside2.setTextureOffset(60, 306).addBox(-18.0F, -74.0F, 20.375F, 3.0F, 70.0F, 1.0F, 0.0F, false);
		leftside2.setTextureOffset(245, 261).addBox(-15.125F, -6.5F, 20.3125F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		leftside2.setTextureOffset(353, 32).addBox(-15.125F, -20.5F, 19.8125F, 13.0F, 14.0F, 1.0F, 0.0F, false);
		leftside2.setTextureOffset(346, 16).addBox(-15.125F, -37.5F, 19.8125F, 13.0F, 14.0F, 1.0F, 0.0F, false);
		leftside2.setTextureOffset(346, 0).addBox(-15.125F, -54.5F, 19.8125F, 13.0F, 14.0F, 1.0F, 0.0F, false);
		leftside2.setTextureOffset(317, 32).addBox(-15.125F, -58.0F, 19.9375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		leftside2.setTextureOffset(315, 123).addBox(-15.125F, -41.0F, 19.9375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		leftside2.setTextureOffset(309, 38).addBox(-15.125F, -24.0F, 19.9375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		leftside2.setTextureOffset(163, 309).addBox(-15.125F, -7.0F, 19.9375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		leftside2.setTextureOffset(346, 346).addBox(-15.25F, -70.75F, 20.25F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		leftside2.setTextureOffset(32, 115).addBox(-11.25F, -70.75F, 20.0F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		leftside2.setTextureOffset(5, 82).addBox(-7.125F, -70.75F, 20.0F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		leftside2.setTextureOffset(345, 227).addBox(-3.0F, -70.75F, 20.25F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		leftside2.setTextureOffset(306, 187).addBox(-15.125F, -71.5F, 19.9375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		leftside2.setTextureOffset(306, 184).addBox(-15.125F, -55.0F, 20.0F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		leftside2.setTextureOffset(306, 181).addBox(-15.125F, -38.0F, 19.9375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		leftside2.setTextureOffset(306, 160).addBox(-15.125F, -21.0F, 19.9375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		leftside2.setTextureOffset(248, 137).addBox(-15.625F, -64.75F, 20.125F, 14.0F, 1.0F, 1.0F, -0.25F, false);
		leftside2.setTextureOffset(252, 200).addBox(-15.125F, -23.5F, 20.3125F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		leftside2.setTextureOffset(252, 195).addBox(-15.125F, -40.5F, 20.3125F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		leftside2.setTextureOffset(248, 132).addBox(-15.125F, -57.5F, 20.3125F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		leftside2.setTextureOffset(245, 230).addBox(-15.125F, -73.875F, 20.3125F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		leftside2.setTextureOffset(161, 316).addBox(-2.25F, -74.0F, 20.375F, 2.0F, 70.0F, 1.0F, 0.0F, false);

		leftside3 = new ModelRenderer(this);
		leftside3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls.addChild(leftside3);
		leftside3.setTextureOffset(121, 199).addBox(20.375F, -74.0F, 15.0F, 1.0F, 70.0F, 3.0F, 0.0F, false);
		leftside3.setTextureOffset(278, 0).addBox(20.3125F, -6.5F, 2.125F, 1.0F, 3.0F, 13.0F, 0.0F, false);
		leftside3.setTextureOffset(0, 104).addBox(19.8125F, -20.5F, 2.125F, 1.0F, 14.0F, 13.0F, 0.0F, false);
		leftside3.setTextureOffset(16, 69).addBox(19.8125F, -37.5F, 2.125F, 1.0F, 14.0F, 13.0F, 0.0F, false);
		leftside3.setTextureOffset(0, 54).addBox(19.8125F, -54.5F, 2.125F, 1.0F, 14.0F, 13.0F, 0.0F, false);
		leftside3.setTextureOffset(360, 314).addBox(19.9375F, -58.0F, 2.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		leftside3.setTextureOffset(360, 299).addBox(19.9375F, -41.0F, 2.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		leftside3.setTextureOffset(360, 284).addBox(19.9375F, -24.0F, 2.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		leftside3.setTextureOffset(360, 269).addBox(19.9375F, -7.0F, 2.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		leftside3.setTextureOffset(336, 336).addBox(20.25F, -70.75F, 14.25F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		leftside3.setTextureOffset(45, 27).addBox(20.0F, -70.75F, 10.25F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		leftside3.setTextureOffset(45, 0).addBox(20.0F, -70.75F, 6.125F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		leftside3.setTextureOffset(335, 243).addBox(20.25F, -70.75F, 2.0F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		leftside3.setTextureOffset(360, 254).addBox(19.9375F, -71.5F, 2.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		leftside3.setTextureOffset(360, 111).addBox(20.0F, -55.0F, 2.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		leftside3.setTextureOffset(347, 330).addBox(19.9375F, -38.0F, 2.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		leftside3.setTextureOffset(290, 177).addBox(19.9375F, -21.0F, 2.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		leftside3.setTextureOffset(245, 245).addBox(20.125F, -64.75F, 1.625F, 1.0F, 1.0F, 14.0F, -0.25F, false);
		leftside3.setTextureOffset(145, 84).addBox(20.3125F, -23.5F, 2.125F, 1.0F, 3.0F, 13.0F, 0.0F, false);
		leftside3.setTextureOffset(0, 134).addBox(20.3125F, -40.5F, 2.125F, 1.0F, 3.0F, 13.0F, 0.0F, false);
		leftside3.setTextureOffset(0, 84).addBox(20.3125F, -57.5F, 2.125F, 1.0F, 3.0F, 13.0F, 0.0F, false);
		leftside3.setTextureOffset(0, 31).addBox(20.3125F, -73.875F, 2.125F, 1.0F, 3.0F, 13.0F, 0.0F, false);
		leftside3.setTextureOffset(309, 309).addBox(20.375F, -74.0F, 0.25F, 1.0F, 70.0F, 2.0F, 0.0F, false);

		rightside = new ModelRenderer(this);
		rightside.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls.addChild(rightside);
		rightside.setTextureOffset(139, 199).addBox(-21.375F, -74.0F, 15.0F, 1.0F, 70.0F, 3.0F, 0.0F, false);
		rightside.setTextureOffset(295, 212).addBox(-21.3125F, -6.5F, 2.125F, 1.0F, 3.0F, 13.0F, 0.0F, false);
		rightside.setTextureOffset(115, 157).addBox(-20.8125F, -20.5F, 2.125F, 1.0F, 14.0F, 13.0F, 0.0F, false);
		rightside.setTextureOffset(0, 157).addBox(-20.8125F, -37.5F, 2.125F, 1.0F, 14.0F, 13.0F, 0.0F, false);
		rightside.setTextureOffset(90, 376).addBox(-20.9375F, -58.0F, 2.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		rightside.setTextureOffset(265, 370).addBox(-20.9375F, -41.0F, 2.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		rightside.setTextureOffset(375, 35).addBox(-20.9375F, -24.0F, 2.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		rightside.setTextureOffset(375, 15).addBox(-20.9375F, -7.0F, 2.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		rightside.setTextureOffset(350, 209).addBox(-21.25F, -70.75F, 14.25F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		rightside.setTextureOffset(42, 115).addBox(-21.0F, -70.75F, 10.25F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		rightside.setTextureOffset(37, 115).addBox(-21.0F, -70.75F, 6.125F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		rightside.setTextureOffset(348, 142).addBox(-21.25F, -70.75F, 2.0F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		rightside.setTextureOffset(375, 0).addBox(-20.9375F, -71.5F, 2.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		rightside.setTextureOffset(374, 57).addBox(-21.0F, -55.0F, 2.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		rightside.setTextureOffset(281, 372).addBox(-20.9375F, -38.0F, 2.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		rightside.setTextureOffset(371, 126).addBox(-20.9375F, -21.0F, 2.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		rightside.setTextureOffset(0, 263).addBox(-21.125F, -64.75F, 1.625F, 1.0F, 1.0F, 14.0F, -0.25F, false);
		rightside.setTextureOffset(295, 195).addBox(-21.3125F, -23.5F, 2.125F, 1.0F, 3.0F, 13.0F, 0.0F, false);
		rightside.setTextureOffset(294, 261).addBox(-21.3125F, -40.5F, 2.125F, 1.0F, 3.0F, 13.0F, 0.0F, false);
		rightside.setTextureOffset(294, 244).addBox(-21.3125F, -57.5F, 2.125F, 1.0F, 3.0F, 13.0F, 0.0F, false);
		rightside.setTextureOffset(290, 160).addBox(-21.3125F, -73.875F, 2.125F, 1.0F, 3.0F, 13.0F, 0.0F, false);
		rightside.setTextureOffset(133, 316).addBox(-21.375F, -74.0F, 0.25F, 1.0F, 70.0F, 2.0F, 0.0F, false);
		rightside.setTextureOffset(126, 316).addBox(-21.875F, -74.0F, -1.0F, 1.0F, 70.0F, 2.0F, 0.0F, false);
		rightside.setTextureOffset(151, 0).addBox(-20.8125F, -54.5F, 2.125F, 1.0F, 14.0F, 13.0F, 0.0F, false);

		rightside2 = new ModelRenderer(this);
		rightside2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls.addChild(rightside2);
		rightside2.setTextureOffset(51, 306).addBox(15.0F, -74.0F, 20.375F, 3.0F, 70.0F, 1.0F, 0.0F, false);
		rightside2.setTextureOffset(236, 225).addBox(2.125F, -6.5F, 20.3125F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		rightside2.setTextureOffset(345, 70).addBox(2.125F, -20.5F, 19.8125F, 13.0F, 14.0F, 1.0F, 0.0F, false);
		rightside2.setTextureOffset(344, 108).addBox(2.125F, -37.5F, 19.8125F, 13.0F, 14.0F, 1.0F, 0.0F, false);
		rightside2.setTextureOffset(163, 306).addBox(2.125F, -58.0F, 19.9375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		rightside2.setTextureOffset(304, 290).addBox(2.125F, -41.0F, 19.9375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		rightside2.setTextureOffset(304, 287).addBox(2.125F, -24.0F, 19.9375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		rightside2.setTextureOffset(0, 301).addBox(2.125F, -7.0F, 19.9375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		rightside2.setTextureOffset(343, 160).addBox(14.25F, -70.75F, 20.25F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		rightside2.setTextureOffset(0, 82).addBox(10.25F, -70.75F, 20.0F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		rightside2.setTextureOffset(42, 65).addBox(6.125F, -70.75F, 20.0F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		rightside2.setTextureOffset(341, 341).addBox(2.0F, -70.75F, 20.25F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		rightside2.setTextureOffset(50, 299).addBox(2.125F, -71.5F, 19.9375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		rightside2.setTextureOffset(50, 296).addBox(2.125F, -55.0F, 20.0F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		rightside2.setTextureOffset(295, 233).addBox(2.125F, -38.0F, 19.9375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		rightside2.setTextureOffset(115, 192).addBox(2.125F, -21.0F, 19.9375F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		rightside2.setTextureOffset(154, 187).addBox(1.625F, -64.75F, 20.125F, 14.0F, 1.0F, 1.0F, -0.25F, false);
		rightside2.setTextureOffset(115, 185).addBox(2.125F, -23.5F, 20.3125F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		rightside2.setTextureOffset(154, 182).addBox(2.125F, -40.5F, 20.3125F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		rightside2.setTextureOffset(145, 134).addBox(2.125F, -57.5F, 20.3125F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		rightside2.setTextureOffset(145, 145).addBox(2.125F, -73.875F, 20.3125F, 13.0F, 3.0F, 1.0F, 0.0F, false);
		rightside2.setTextureOffset(154, 316).addBox(0.25F, -74.0F, 20.375F, 2.0F, 70.0F, 1.0F, 0.0F, false);
		rightside2.setTextureOffset(147, 316).addBox(-1.0F, -74.0F, 20.875F, 2.0F, 70.0F, 1.0F, 0.0F, false);
		rightside2.setTextureOffset(338, 92).addBox(2.125F, -54.5F, 19.8125F, 13.0F, 14.0F, 1.0F, 0.0F, false);

		rightside3 = new ModelRenderer(this);
		rightside3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls.addChild(rightside3);
		rightside3.setTextureOffset(130, 199).addBox(20.375F, -74.0F, -18.0F, 1.0F, 70.0F, 3.0F, 0.0F, false);
		rightside3.setTextureOffset(163, 289).addBox(20.3125F, -6.5F, -15.125F, 1.0F, 3.0F, 13.0F, 0.0F, false);
		rightside3.setTextureOffset(145, 106).addBox(19.8125F, -20.5F, -15.125F, 1.0F, 14.0F, 13.0F, 0.0F, false);
		rightside3.setTextureOffset(145, 54).addBox(19.8125F, -37.5F, -15.125F, 1.0F, 14.0F, 13.0F, 0.0F, false);
		rightside3.setTextureOffset(236, 370).addBox(19.9375F, -58.0F, -15.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		rightside3.setTextureOffset(367, 88).addBox(19.9375F, -41.0F, -15.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		rightside3.setTextureOffset(220, 365).addBox(19.9375F, -24.0F, -15.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		rightside3.setTextureOffset(74, 365).addBox(19.9375F, -7.0F, -15.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		rightside3.setTextureOffset(340, 227).addBox(20.25F, -70.75F, -15.25F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		rightside3.setTextureOffset(37, 65).addBox(20.0F, -70.75F, -11.25F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		rightside3.setTextureOffset(32, 65).addBox(20.0F, -70.75F, -7.125F, 1.0F, 13.0F, 1.0F, -0.25F, false);
		rightside3.setTextureOffset(338, 160).addBox(20.25F, -70.75F, -3.0F, 1.0F, 65.0F, 1.0F, -0.25F, false);
		rightside3.setTextureOffset(204, 362).addBox(19.9375F, -71.5F, -15.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		rightside3.setTextureOffset(361, 345).addBox(20.0F, -55.0F, -15.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		rightside3.setTextureOffset(361, 73).addBox(19.9375F, -38.0F, -15.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		rightside3.setTextureOffset(361, 361).addBox(19.9375F, -21.0F, -15.125F, 1.0F, 1.0F, 13.0F, 0.0F, false);
		rightside3.setTextureOffset(251, 209).addBox(20.125F, -64.75F, -15.625F, 1.0F, 1.0F, 14.0F, -0.25F, false);
		rightside3.setTextureOffset(112, 279).addBox(20.3125F, -23.5F, -15.125F, 1.0F, 3.0F, 13.0F, 0.0F, false);
		rightside3.setTextureOffset(50, 279).addBox(20.3125F, -40.5F, -15.125F, 1.0F, 3.0F, 13.0F, 0.0F, false);
		rightside3.setTextureOffset(0, 279).addBox(20.3125F, -57.5F, -15.125F, 1.0F, 3.0F, 13.0F, 0.0F, false);
		rightside3.setTextureOffset(278, 17).addBox(20.3125F, -73.875F, -15.125F, 1.0F, 3.0F, 13.0F, 0.0F, false);
		rightside3.setTextureOffset(119, 316).addBox(20.375F, -74.0F, -2.25F, 1.0F, 70.0F, 2.0F, 0.0F, false);
		rightside3.setTextureOffset(112, 316).addBox(20.875F, -74.0F, -1.0F, 1.0F, 70.0F, 2.0F, 0.0F, false);
		rightside3.setTextureOffset(16, 119).addBox(19.8125F, -54.5F, -15.125F, 1.0F, 14.0F, 13.0F, 0.0F, false);

		PCBSign = new ModelRenderer(this);
		PCBSign.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(PCBSign);
		PCBSign.setTextureOffset(290, 64).addBox(-20.5F, -74.75F, -25.0F, 41.0F, 1.0F, 4.0F, -0.1875F, false);
		PCBSign.setTextureOffset(113, 273).addBox(-25.0F, -74.75F, -20.5F, 4.0F, 1.0F, 41.0F, -0.1875F, false);
		PCBSign.setTextureOffset(245, 238).addBox(-20.5F, -74.75F, 21.0F, 41.0F, 1.0F, 4.0F, -0.1875F, false);
		PCBSign.setTextureOffset(245, 195).addBox(21.0F, -74.75F, -20.5F, 4.0F, 1.0F, 41.0F, -0.1875F, false);
		PCBSign.setTextureOffset(39, 17).addBox(19.5F, -79.25F, -25.0F, 1.0F, 5.0F, 4.0F, -0.1874F, false);
		PCBSign.setTextureOffset(0, 157).addBox(-25.0F, -79.25F, -20.5F, 4.0F, 5.0F, 1.0F, -0.1874F, false);
		PCBSign.setTextureOffset(0, 28).addBox(-20.5F, -79.25F, 21.0F, 1.0F, 5.0F, 4.0F, -0.1874F, false);
		PCBSign.setTextureOffset(151, 0).addBox(21.0F, -79.25F, 19.5F, 4.0F, 5.0F, 1.0F, -0.1874F, false);
		PCBSign.setTextureOffset(32, 11).addBox(-20.5F, -79.25F, -25.0F, 1.0F, 5.0F, 4.0F, -0.1874F, false);
		PCBSign.setTextureOffset(154, 154).addBox(-25.0F, -79.25F, 19.5F, 4.0F, 5.0F, 1.0F, -0.1874F, false);
		PCBSign.setTextureOffset(0, 0).addBox(19.5F, -79.25F, 21.0F, 1.0F, 5.0F, 4.0F, -0.1874F, false);
		PCBSign.setTextureOffset(145, 106).addBox(21.0F, -79.25F, -20.5F, 4.0F, 5.0F, 1.0F, -0.1874F, false);
		PCBSign.setTextureOffset(290, 58).addBox(-20.5F, -79.75F, -25.0F, 41.0F, 1.0F, 4.0F, -0.1875F, false);
		PCBSign.setTextureOffset(0, 263).addBox(-25.0F, -79.75F, -20.5F, 4.0F, 1.0F, 41.0F, -0.1875F, false);
		PCBSign.setTextureOffset(197, 50).addBox(-20.5F, -79.75F, 21.0F, 41.0F, 1.0F, 4.0F, -0.1875F, false);
		PCBSign.setTextureOffset(244, 244).addBox(21.0F, -79.75F, -20.5F, 4.0F, 1.0F, 41.0F, -0.1875F, false);

		Frames = new ModelRenderer(this);
		Frames.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Frames);
		Frames.setTextureOffset(331, 331).addBox(17.3125F, -74.0F, -22.375F, 1.0F, 70.0F, 1.0F, 0.0F, false);
		Frames.setTextureOffset(321, 321).addBox(-22.375F, -74.0F, -18.3125F, 1.0F, 70.0F, 1.0F, 0.0F, false);
		Frames.setTextureOffset(199, 316).addBox(-18.3125F, -74.0F, 21.375F, 1.0F, 70.0F, 1.0F, 0.0F, false);
		Frames.setTextureOffset(189, 316).addBox(21.375F, -74.0F, 17.3125F, 1.0F, 70.0F, 1.0F, 0.0F, false);
		Frames.setTextureOffset(75, 154).addBox(-18.0F, -74.0F, -22.375F, 36.0F, 1.0F, 1.0F, 0.0F, false);
		Frames.setTextureOffset(278, 0).addBox(-22.375F, -74.0F, -18.0F, 1.0F, 1.0F, 36.0F, 0.0F, false);
		Frames.setTextureOffset(0, 154).addBox(-18.0F, -74.0F, 21.375F, 36.0F, 1.0F, 1.0F, 0.0F, false);
		Frames.setTextureOffset(115, 154).addBox(21.375F, -74.0F, -18.0F, 1.0F, 1.0F, 36.0F, 0.0F, false);
		Frames.setTextureOffset(326, 326).addBox(-18.3125F, -74.0F, -22.375F, 1.0F, 70.0F, 1.0F, 0.0F, false);
		Frames.setTextureOffset(316, 316).addBox(-22.375F, -74.0F, 17.3125F, 1.0F, 70.0F, 1.0F, 0.0F, false);
		Frames.setTextureOffset(194, 316).addBox(17.3125F, -74.0F, 21.375F, 1.0F, 70.0F, 1.0F, 0.0F, false);
		Frames.setTextureOffset(148, 199).addBox(21.375F, -74.0F, -18.3125F, 1.0F, 70.0F, 1.0F, 0.0F, false);

		Posts = new ModelRenderer(this);
		Posts.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Posts);
		Posts.setTextureOffset(21, 306).addBox(18.25F, -80.625F, -23.25F, 5.0F, 77.0F, 5.0F, 0.0F, false);
		Posts.setTextureOffset(288, 288).addBox(-23.25F, -80.625F, -23.25F, 5.0F, 77.0F, 5.0F, 0.0F, false);
		Posts.setTextureOffset(267, 287).addBox(-23.25F, -80.625F, 18.25F, 5.0F, 77.0F, 5.0F, 0.0F, false);
		Posts.setTextureOffset(246, 287).addBox(18.25F, -80.625F, 18.25F, 5.0F, 77.0F, 5.0F, 0.0F, false);
		Posts.setTextureOffset(0, 306).addBox(17.9375F, -80.5625F, -22.9375F, 5.0F, 77.0F, 5.0F, 0.0F, false);
		Posts.setTextureOffset(225, 282).addBox(-22.9375F, -80.5625F, -22.9375F, 5.0F, 77.0F, 5.0F, 0.0F, false);
		Posts.setTextureOffset(204, 279).addBox(-22.9375F, -80.5625F, 17.9375F, 5.0F, 77.0F, 5.0F, 0.0F, false);
		Posts.setTextureOffset(91, 279).addBox(17.9375F, -80.5625F, 17.9375F, 5.0F, 77.0F, 5.0F, 0.0F, false);

		Base = new ModelRenderer(this);
		Base.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Base);
		Base.setTextureOffset(145, 56).addBox(-24.0F, -4.0F, -24.0F, 48.0F, 1.0F, 48.0F, 0.0F, false);
		Base.setTextureOffset(145, 145).addBox(-24.0F, -3.5F, -24.0F, 48.0F, 1.0F, 48.0F, 0.25F, false);
		Base.setTextureOffset(0, 104).addBox(-24.0F, -2.875F, -24.0F, 48.0F, 1.0F, 48.0F, 0.5F, false);
		Base.setTextureOffset(0, 54).addBox(-24.0F, -2.4375F, -24.0F, 48.0F, 1.0F, 48.0F, 0.75F, false);
		Base.setTextureOffset(0, 0).addBox(-25.0F, -3.0F, -25.0F, 50.0F, 3.0F, 50.0F, 0.0F, false);

		boti = new ModelRenderer(this);
		boti.setRotationPoint(0.0F, 24.0F, 0.0F);
		boti.setTextureOffset(153, 195).addBox(-20.0F, -80.0F, -4.5F, 40.0F, 76.0F, 1.0F, 0.0F, false);

		LeftWindow = new ModelRenderer(this);
		LeftWindow.setRotationPoint(18.0F, -34.375F, -21.375F);
		LeftWindow.setTextureOffset(358, 142).addBox(-15.875F, -13.0F, 0.375F, 13.0F, 14.0F, 1.0F, -0.375F, false);

		RightWindow = new ModelRenderer(this);
		RightWindow.setRotationPoint(-18.0F, -34.375F, -21.375F);
		RightWindow.setTextureOffset(360, 206).addBox(2.875F, -13.0F, 0.375F, 13.0F, 14.0F, 1.0F, -0.375F, false);
	}

	@Override
	public void render(ExteriorTile tile, float v, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float v1) {
		EnumDoorState state = tile.getOpen();
		matrixStack.push();
		matrixStack.translate(0.0D, 0.75, 0.0D);
		matrixStack.scale(0.5F, 0.5F, 0.5F);
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
		Right_Door.render(matrixStack, buffer, packedLight, packedOverlay);
		Left_Door.render(matrixStack, buffer, packedLight, packedOverlay);
		CallSignsLight.render(matrixStack, buffer, packedLight, packedOverlay);
		ShellWindows.render(matrixStack, buffer, packedLight, packedOverlay);
		Lamp.render(matrixStack, buffer, packedLight, packedOverlay);
		Shell.render(matrixStack, buffer, packedLight, packedOverlay);
		boti.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftWindow.render(matrixStack, buffer, packedLight, packedOverlay);
		RightWindow.render(matrixStack, buffer, packedLight, packedOverlay);
		ModelHelper.renderPartBrightness(matrixStack, buffer, packedLight, packedOverlay, tile.getLightLevel(), this.RightWindow);
		ModelHelper.renderPartBrightness(matrixStack, buffer, packedLight, packedOverlay, tile.getLightLevel(), this.LeftWindow);
		ModelHelper.renderPartBrightness(matrixStack, buffer, packedLight, packedOverlay, tile.getLightLevel(), this.Lamp);
		ModelHelper.renderPartBrightness(matrixStack, buffer, packedLight, packedOverlay, tile.getLightLevel(), this.CallSignsLight);
		ModelHelper.renderPartBrightness(matrixStack, buffer, packedLight, packedOverlay, tile.getLightLevel(), this.ShellWindows);
		matrixStack.pop();
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		//previously the render function, render code was moved to a method below
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {

	}
}