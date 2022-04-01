package com.thevale.notenoughtardis.client.models.consoles;// Made with Blockbench 4.2.1
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.notenoughtardis.tileentities.consoles.SmithConsoleTile;
import com.thevale.notenoughtardis.tileentities.consoles.VToyotaConsoleTile;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.client.models.TileModel;

public class VToyotaConsole extends EntityModel<Entity> implements TileModel<VToyotaConsoleTile> {
	private final ModelRenderer ConsoleUnit;
	private final ModelRenderer BasePlinth;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer PlinthToPanel;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer MainConsole;
	private final ModelRenderer Undersidepanels;
	private final ModelRenderer cube_r19;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r20;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r21;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r22;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r23;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r24;
	private final ModelRenderer Braces;
	private final ModelRenderer Brace1;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer Brace2;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer Brace3;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer Brace4;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer Brace5;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer Brace6;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer Edge;
	private final ModelRenderer cube_r37;
	private final ModelRenderer Edge2;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;
	private final ModelRenderer Edge3;
	private final ModelRenderer cube_r41;
	private final ModelRenderer Edge4;
	private final ModelRenderer cube_r42;
	private final ModelRenderer Edge5;
	private final ModelRenderer cube_r43;
	private final ModelRenderer Edge6;
	private final ModelRenderer cube_r44;
	private final ModelRenderer Panels;
	private final ModelRenderer Panel1;
	private final ModelRenderer cube_r45;
	private final ModelRenderer cube_r46;
	private final ModelRenderer Panel2;
	private final ModelRenderer cube_r47;
	private final ModelRenderer Panel3;
	private final ModelRenderer cube_r48;
	private final ModelRenderer Panel4;
	private final ModelRenderer cube_r49;
	private final ModelRenderer cube_r50;
	private final ModelRenderer Panel5;
	private final ModelRenderer cube_r51;
	private final ModelRenderer Panel6;
	private final ModelRenderer cube_r52;
	private final ModelRenderer TimeRotorCasing;
	private final ModelRenderer cube_r53;
	private final ModelRenderer cube_r54;
	private final ModelRenderer cube_r55;
	private final ModelRenderer cube_r56;
	private final ModelRenderer cube_r57;
	private final ModelRenderer cube_r58;
	private final ModelRenderer cube_r59;
	private final ModelRenderer cube_r60;
	private final ModelRenderer cube_r61;
	private final ModelRenderer cube_r62;
	private final ModelRenderer cube_r63;
	private final ModelRenderer cube_r64;
	private final ModelRenderer cube_r65;
	private final ModelRenderer cube_r66;
	private final ModelRenderer cube_r67;
	private final ModelRenderer InnerRotor;
	private final ModelRenderer cube_r68;
	private final ModelRenderer cube_r69;
	private final ModelRenderer cube_r70;
	private final ModelRenderer cube_r71;
	private final ModelRenderer cube_r72;
	private final ModelRenderer cube_r73;
	private final ModelRenderer cube_r74;
	private final ModelRenderer cube_r75;
	private final ModelRenderer cube_r76;
	private final ModelRenderer cube_r77;
	private final ModelRenderer cube_r78;
	private final ModelRenderer cube_r79;
	private final ModelRenderer cube_r80;
	private final ModelRenderer cube_r81;
	private final ModelRenderer cube_r82;
	private final ModelRenderer MovingLower;
	private final ModelRenderer cube_r83;
	private final ModelRenderer MovingUpper;
	private final ModelRenderer cube_r84;
	private final ModelRenderer Controls;
	private final ModelRenderer PowerPanelControlSupports;
	private final ModelRenderer cube_r85;
	private final ModelRenderer cube_r86;
	private final ModelRenderer PowerPanelControlLevers;
	private final ModelRenderer RedLever1;
	private final ModelRenderer cube_r87;
	private final ModelRenderer FastReturn;
	private final ModelRenderer cube_r88;
	private final ModelRenderer RedLever2;
	private final ModelRenderer cube_r89;
	private final ModelRenderer Refuel;
	private final ModelRenderer cube_r90;
	private final ModelRenderer SixSet1;
	private final ModelRenderer cube_r91;
	private final ModelRenderer SixSet2;
	private final ModelRenderer cube_r92;
	private final ModelRenderer SixSet3;
	private final ModelRenderer cube_r93;
	private final ModelRenderer SixSet4;
	private final ModelRenderer cube_r94;
	private final ModelRenderer SixSet5;
	private final ModelRenderer cube_r95;
	private final ModelRenderer SixSet6;
	private final ModelRenderer cube_r96;
	private final ModelRenderer HelmicRegulatorPanel;
	private final ModelRenderer cube_r97;
	private final ModelRenderer cube_r98;
	private final ModelRenderer cube_r99;
	private final ModelRenderer GearHandle2;
	private final ModelRenderer gearhandlecube_r1;
	private final ModelRenderer GearHandle1;
	private final ModelRenderer gearhandlecube_r2;
	private final ModelRenderer GearPlanes;
	private final ModelRenderer gearplanesmall_r1;
	private final ModelRenderer CommunicationsPanel;
	private final ModelRenderer cube_r100;
	private final ModelRenderer cube_r101;
	private final ModelRenderer cube_r102;
	private final ModelRenderer cube_r103;
	private final ModelRenderer cube_r104;
	private final ModelRenderer cube_r105;
	private final ModelRenderer cube_r106;
	private final ModelRenderer cube_r107;
	private final ModelRenderer FlightPanel;
	private final ModelRenderer Button;
	private final ModelRenderer cube_r108;
	private final ModelRenderer cube_r109;
	private final ModelRenderer FlightLeverSet;
	private final ModelRenderer Fl1;
	private final ModelRenderer cube_r110;
	private final ModelRenderer Fl2;
	private final ModelRenderer cube_r111;
	private final ModelRenderer Fl3;
	private final ModelRenderer cube_r112;
	private final ModelRenderer Fl4;
	private final ModelRenderer cube_r113;
	private final ModelRenderer Fl5;
	private final ModelRenderer cube_r114;
	private final ModelRenderer Handbrake;
	private final ModelRenderer HandbrakeLever_r1;
	private final ModelRenderer HandbrakeBase_r1;
	private final ModelRenderer HandbrakeBase_r2;
	private final ModelRenderer Throttle;
	private final ModelRenderer cube_r115;
	private final ModelRenderer ThrottleLever;
	private final ModelRenderer cube_r116;
	private final ModelRenderer MonitorPanel;
	private final ModelRenderer cube_r117;
	private final ModelRenderer cube_r118;
	private final ModelRenderer cube_r119;
	private final ModelRenderer cube_r120;

	public VToyotaConsole() {
		textureWidth = 512;
		textureHeight = 512;

		ConsoleUnit = new ModelRenderer(this);
		ConsoleUnit.setRotationPoint(0.0F, 24.0F, 0.0F);


		BasePlinth = new ModelRenderer(this);
		BasePlinth.setRotationPoint(0.0F, -3.0F, 0.0F);
		ConsoleUnit.addChild(BasePlinth);
		BasePlinth.setTextureOffset(360, 74).addBox(-7.0F, 0.0F, -17.0F, 14.0F, 3.0F, 34.0F, 0.0F, false);
		BasePlinth.setTextureOffset(408, 232).addBox(-6.5F, -1.0F, -15.5F, 13.0F, 1.0F, 31.0F, 0.0F, false);
		BasePlinth.setTextureOffset(220, 114).addBox(-6.0F, -18.0F, 12.5F, 1.0F, 16.0F, 2.0F, 0.0F, false);
		BasePlinth.setTextureOffset(220, 132).addBox(5.0F, -18.0F, 12.5F, 1.0F, 16.0F, 2.0F, 0.0F, false);
		BasePlinth.setTextureOffset(118, 233).addBox(-6.0F, -2.0F, 12.5F, 12.0F, 1.0F, 2.0F, 0.0F, false);
		BasePlinth.setTextureOffset(224, 80).addBox(-6.0F, -19.0F, 12.5F, 12.0F, 1.0F, 2.0F, 0.0F, false);
		BasePlinth.setTextureOffset(145, 191).addBox(-5.5F, -18.0F, 12.25F, 11.0F, 16.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		BasePlinth.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.7854F, 0.0F);
		cube_r1.setTextureOffset(177, 188).addBox(-5.5F, -18.0F, 12.25F, 11.0F, 16.0F, 1.0F, 0.0F, false);
		cube_r1.setTextureOffset(0, 201).addBox(-6.0F, -19.0F, 12.5F, 12.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(184, 232).addBox(-6.0F, -2.0F, 12.5F, 12.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(101, 220).addBox(5.0F, -18.0F, 12.5F, 1.0F, 16.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(95, 220).addBox(-6.0F, -18.0F, 12.5F, 1.0F, 16.0F, 2.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		BasePlinth.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -1.5708F, 0.0F);
		cube_r2.setTextureOffset(104, 54).addBox(-5.5F, -18.0F, 12.25F, 11.0F, 16.0F, 1.0F, 0.0F, false);
		cube_r2.setTextureOffset(192, 169).addBox(-6.0F, -19.0F, 12.5F, 12.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r2.setTextureOffset(242, 0).addBox(-6.0F, -18.0F, 12.5F, 1.0F, 16.0F, 2.0F, 0.0F, false);
		cube_r2.setTextureOffset(242, 109).addBox(5.0F, -18.0F, 12.5F, 1.0F, 16.0F, 2.0F, 0.0F, false);
		cube_r2.setTextureOffset(118, 230).addBox(-6.0F, -2.0F, 12.5F, 12.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		BasePlinth.addChild(cube_r3);
		setRotationAngle(cube_r3, -3.1416F, -0.7854F, 3.1416F);
		cube_r3.setTextureOffset(20, 66).addBox(-5.5F, -18.0F, 12.25F, 11.0F, 16.0F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(184, 235).addBox(-6.0F, -2.0F, 12.5F, 12.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		BasePlinth.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 1.5708F, 0.0F);
		cube_r4.setTextureOffset(0, 206).addBox(-5.5F, -18.0F, 12.25F, 11.0F, 16.0F, 1.0F, 0.0F, false);
		cube_r4.setTextureOffset(220, 232).addBox(5.0F, -18.0F, 12.5F, 1.0F, 16.0F, 2.0F, 0.0F, false);
		cube_r4.setTextureOffset(40, 229).addBox(-6.0F, -18.0F, 12.5F, 1.0F, 16.0F, 2.0F, 0.0F, false);
		cube_r4.setTextureOffset(358, 157).addBox(-7.0F, 0.0F, -17.0F, 14.0F, 3.0F, 34.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		BasePlinth.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.7854F, 0.0F);
		cube_r5.setTextureOffset(201, 188).addBox(-5.5F, -18.0F, 12.25F, 11.0F, 16.0F, 1.0F, 0.0F, false);
		cube_r5.setTextureOffset(177, 205).addBox(-6.0F, -19.0F, 12.5F, 12.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r5.setTextureOffset(59, 233).addBox(-6.0F, -2.0F, 12.5F, 12.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r5.setTextureOffset(34, 229).addBox(5.0F, -18.0F, 12.5F, 1.0F, 16.0F, 2.0F, 0.0F, false);
		cube_r5.setTextureOffset(28, 229).addBox(-6.0F, -18.0F, 12.5F, 1.0F, 16.0F, 2.0F, 0.0F, false);
		cube_r5.setTextureOffset(291, 408).addBox(-6.5F, -1.0F, -15.5F, 13.0F, 1.0F, 31.0F, 0.0F, false);
		cube_r5.setTextureOffset(360, 37).addBox(-7.0F, 0.0F, -17.0F, 14.0F, 3.0F, 34.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		BasePlinth.addChild(cube_r6);
		setRotationAngle(cube_r6, -3.1416F, 0.7854F, -3.1416F);
		cube_r6.setTextureOffset(24, 206).addBox(-5.5F, -18.0F, 12.25F, 11.0F, 16.0F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(236, 132).addBox(5.0F, -18.0F, 12.5F, 1.0F, 16.0F, 2.0F, 0.0F, false);
		cube_r6.setTextureOffset(236, 109).addBox(-6.0F, -18.0F, 12.5F, 1.0F, 16.0F, 2.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		BasePlinth.addChild(cube_r7);
		setRotationAngle(cube_r7, -3.1416F, 0.0F, -3.1416F);
		cube_r7.setTextureOffset(59, 210).addBox(-5.5F, -18.0F, 12.25F, 11.0F, 16.0F, 1.0F, 0.0F, false);
		cube_r7.setTextureOffset(236, 175).addBox(5.0F, -18.0F, 12.5F, 1.0F, 16.0F, 2.0F, 0.0F, false);
		cube_r7.setTextureOffset(236, 157).addBox(-6.0F, -18.0F, 12.5F, 1.0F, 16.0F, 2.0F, 0.0F, false);
		cube_r7.setTextureOffset(0, 235).addBox(-6.0F, -2.0F, 12.5F, 12.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, -17.0F, 0.0F);
		BasePlinth.addChild(cube_r8);
		setRotationAngle(cube_r8, -3.1416F, 1.5708F, 3.1416F);
		cube_r8.setTextureOffset(224, 100).addBox(-6.0F, -2.0F, 12.5F, 12.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -17.0F, 0.0F);
		BasePlinth.addChild(cube_r9);
		setRotationAngle(cube_r9, -3.1416F, 0.0F, -3.1416F);
		cube_r9.setTextureOffset(16, 187).addBox(-6.0F, -2.0F, 12.5F, 12.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, -17.0F, 0.0F);
		BasePlinth.addChild(cube_r10);
		setRotationAngle(cube_r10, -3.1416F, -0.7854F, 3.1416F);
		cube_r10.setTextureOffset(18, 169).addBox(-6.0F, -2.0F, 12.5F, 12.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, -17.0F, 0.0F);
		BasePlinth.addChild(cube_r11);
		setRotationAngle(cube_r11, -3.1416F, 0.7854F, 3.1416F);
		cube_r11.setTextureOffset(59, 148).addBox(-6.0F, -2.0F, 12.5F, 12.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		BasePlinth.addChild(cube_r12);
		setRotationAngle(cube_r12, -3.1416F, -0.7854F, -3.1416F);
		cube_r12.setTextureOffset(238, 235).addBox(5.0F, -18.0F, 12.5F, 1.0F, 16.0F, 2.0F, 0.0F, false);
		cube_r12.setTextureOffset(238, 210).addBox(-6.0F, -18.0F, 12.5F, 1.0F, 16.0F, 2.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		BasePlinth.addChild(cube_r13);
		setRotationAngle(cube_r13, -3.1416F, 0.7854F, 3.1416F);
		cube_r13.setTextureOffset(59, 236).addBox(-6.0F, -2.0F, 12.5F, 12.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r13.setTextureOffset(98, 406).addBox(-6.5F, -1.0F, -15.5F, 13.0F, 1.0F, 31.0F, 0.0F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		BasePlinth.addChild(cube_r14);
		setRotationAngle(cube_r14, -3.1416F, 1.5708F, 3.1416F);
		cube_r14.setTextureOffset(236, 106).addBox(-6.0F, -2.0F, 12.5F, 12.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r14.setTextureOffset(155, 407).addBox(-6.5F, -1.0F, -15.5F, 13.0F, 1.0F, 31.0F, 0.0F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 3.0F, 0.0F);
		BasePlinth.addChild(cube_r15);
		setRotationAngle(cube_r15, -3.1416F, 0.7854F, 3.1416F);
		cube_r15.setTextureOffset(350, 0).addBox(-7.0F, -3.0F, -17.0F, 14.0F, 3.0F, 34.0F, 0.0F, false);

		PlinthToPanel = new ModelRenderer(this);
		PlinthToPanel.setRotationPoint(0.0F, 0.0F, 0.0F);
		ConsoleUnit.addChild(PlinthToPanel);


		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.55F, 0.0F);
		PlinthToPanel.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.5236F, 0.0F);
		cube_r16.setTextureOffset(0, 261).addBox(-19.0F, -24.999F, -11.0F, 38.0F, 3.0F, 22.0F, 0.0F, false);
		cube_r16.setTextureOffset(285, 132).addBox(-19.0F, -47.5F, -11.0F, 38.0F, 3.0F, 22.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 0.55F, 0.0F);
		PlinthToPanel.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, -0.5236F, 0.0F);
		cube_r17.setTextureOffset(242, 0).addBox(-19.0F, -25.0F, -11.0F, 38.0F, 3.0F, 22.0F, 0.0F, false);
		cube_r17.setTextureOffset(240, 261).addBox(-19.0F, -47.5011F, -11.0F, 38.0F, 3.0F, 22.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 0.55F, 0.0F);
		PlinthToPanel.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, -1.5708F, 0.0F);
		cube_r18.setTextureOffset(238, 210).addBox(-19.0F, -25.0011F, -11.0F, 38.0F, 3.0F, 22.0F, 0.0F, false);
		cube_r18.setTextureOffset(120, 261).addBox(-19.0F, -47.4949F, -11.0F, 38.0F, 3.0F, 22.0F, 0.0F, false);

		MainConsole = new ModelRenderer(this);
		MainConsole.setRotationPoint(0.0F, 0.0F, 0.0F);
		ConsoleUnit.addChild(MainConsole);


		Undersidepanels = new ModelRenderer(this);
		Undersidepanels.setRotationPoint(0.0F, -7.7991F, -38.5595F);
		MainConsole.addChild(Undersidepanels);


		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, 0.0F, 77.1191F);
		Undersidepanels.addChild(cube_r19);
		setRotationAngle(cube_r19, 1.5708F, -1.2217F, -1.5708F);
		cube_r19.setTextureOffset(118, 126).addBox(-16.0F, -24.0F, -10.0F, 4.0F, 2.0F, 20.0F, 0.0F, false);
		cube_r19.setTextureOffset(408, 317).addBox(-12.0F, -24.0F, -14.0F, 8.0F, 2.0F, 28.0F, 0.0F, false);
		cube_r19.setTextureOffset(374, 194).addBox(-4.0F, -24.0F, -18.0F, 8.0F, 2.0F, 36.0F, 0.0F, false);
		cube_r19.setTextureOffset(248, 334).addBox(4.0F, -24.0F, -20.0F, 8.0F, 2.0F, 40.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 7.7991F, 38.5595F);
		Undersidepanels.addChild(bone);
		setRotationAngle(bone, 0.0F, 1.0472F, 0.0F);


		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, -7.7991F, 38.5595F);
		bone.addChild(cube_r20);
		setRotationAngle(cube_r20, 1.5708F, -1.2217F, -1.5708F);
		cube_r20.setTextureOffset(59, 126).addBox(-16.0F, -24.0F, -10.0F, 4.0F, 2.0F, 20.0F, 0.0F, false);
		cube_r20.setTextureOffset(140, 368).addBox(-12.0F, -24.0F, -14.0F, 8.0F, 2.0F, 28.0F, 0.0F, false);
		cube_r20.setTextureOffset(370, 372).addBox(-4.0F, -24.0F, -18.0F, 8.0F, 2.0F, 36.0F, 0.0F, false);
		cube_r20.setTextureOffset(192, 326).addBox(4.0F, -24.0F, -20.0F, 8.0F, 2.0F, 40.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 7.7991F, 38.5595F);
		Undersidepanels.addChild(bone2);
		setRotationAngle(bone2, -3.1416F, 1.0472F, 3.1416F);


		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.0F, -7.7991F, 38.5595F);
		bone2.addChild(cube_r21);
		setRotationAngle(cube_r21, 1.5708F, -1.2217F, -1.5708F);
		cube_r21.setTextureOffset(0, 122).addBox(-16.0F, -24.0F, -10.0F, 4.0F, 2.0F, 20.0F, 0.0F, false);
		cube_r21.setTextureOffset(52, 368).addBox(-12.0F, -24.0F, -14.0F, 8.0F, 2.0F, 28.0F, 0.0F, false);
		cube_r21.setTextureOffset(370, 279).addBox(-4.0F, -24.0F, -18.0F, 8.0F, 2.0F, 36.0F, 0.0F, false);
		cube_r21.setTextureOffset(96, 326).addBox(4.0F, -24.0F, -20.0F, 8.0F, 2.0F, 40.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 7.7991F, 38.5595F);
		Undersidepanels.addChild(bone3);
		setRotationAngle(bone3, -3.1416F, 0.0F, 3.1416F);


		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, -7.7991F, 38.5595F);
		bone3.addChild(cube_r22);
		setRotationAngle(cube_r22, 1.5708F, -1.2217F, -1.5708F);
		cube_r22.setTextureOffset(118, 104).addBox(-16.0F, -24.0F, -10.0F, 4.0F, 2.0F, 20.0F, 0.0F, false);
		cube_r22.setTextureOffset(152, 326).addBox(-12.0F, -24.0F, -14.0F, 8.0F, 2.0F, 28.0F, 0.0F, false);
		cube_r22.setTextureOffset(176, 368).addBox(-4.0F, -24.0F, -18.0F, 8.0F, 2.0F, 36.0F, 0.0F, false);
		cube_r22.setTextureOffset(0, 326).addBox(4.0F, -24.0F, -20.0F, 8.0F, 2.0F, 40.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 7.7991F, 38.5595F);
		Undersidepanels.addChild(bone4);
		setRotationAngle(bone4, -3.1416F, -1.0472F, 3.1416F);


		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, -7.7991F, 38.5595F);
		bone4.addChild(cube_r23);
		setRotationAngle(cube_r23, 1.5708F, -1.2217F, -1.5708F);
		cube_r23.setTextureOffset(59, 104).addBox(-16.0F, -24.0F, -10.0F, 4.0F, 2.0F, 20.0F, 0.0F, false);
		cube_r23.setTextureOffset(168, 286).addBox(-12.0F, -24.0F, -14.0F, 8.0F, 2.0F, 28.0F, 0.0F, false);
		cube_r23.setTextureOffset(88, 368).addBox(-4.0F, -24.0F, -18.0F, 8.0F, 2.0F, 36.0F, 0.0F, false);
		cube_r23.setTextureOffset(318, 203).addBox(4.0F, -24.0F, -20.0F, 8.0F, 2.0F, 40.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 7.7991F, 38.5595F);
		Undersidepanels.addChild(bone5);
		setRotationAngle(bone5, 0.0F, -1.0472F, 0.0F);


		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, -7.7991F, 38.5595F);
		bone5.addChild(cube_r24);
		setRotationAngle(cube_r24, 1.5708F, -1.2217F, -1.5708F);
		cube_r24.setTextureOffset(0, 100).addBox(-16.0F, -24.0F, -10.0F, 4.0F, 2.0F, 20.0F, 0.0F, false);
		cube_r24.setTextureOffset(66, 286).addBox(-12.0F, -24.0F, -14.0F, 8.0F, 2.0F, 28.0F, 0.0F, false);
		cube_r24.setTextureOffset(0, 368).addBox(-4.0F, -24.0F, -18.0F, 8.0F, 2.0F, 36.0F, 0.0F, false);
		cube_r24.setTextureOffset(314, 286).addBox(4.0F, -24.0F, -20.0F, 8.0F, 2.0F, 40.0F, 0.0F, false);

		Braces = new ModelRenderer(this);
		Braces.setRotationPoint(0.0F, -7.7991F, -38.5595F);
		MainConsole.addChild(Braces);


		Brace1 = new ModelRenderer(this);
		Brace1.setRotationPoint(0.0F, 7.7991F, 38.5595F);
		Braces.addChild(Brace1);
		setRotationAngle(Brace1, -3.1416F, -0.5236F, 3.1416F);
		Brace1.setTextureOffset(177, 126).addBox(0.25F, -36.0252F, 49.9963F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		Brace1.setTextureOffset(177, 120).addBox(-3.25F, -36.0252F, 49.9963F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		Brace1.setTextureOffset(59, 157).addBox(-1.0F, -36.0188F, 49.7647F, 2.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, -7.7991F, 38.5595F);
		Brace1.addChild(cube_r25);
		setRotationAngle(cube_r25, 1.5708F, 1.309F, 1.5708F);
		cube_r25.setTextureOffset(422, 307).addBox(-17.517F, -20.3294F, -2.25F, 34.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r25.setTextureOffset(422, 98).addBox(-17.9922F, -22.2178F, -3.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r25.setTextureOffset(422, 279).addBox(-17.9922F, -22.2178F, 0.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.0F, -7.7991F, -38.5595F);
		Brace1.addChild(cube_r26);
		setRotationAngle(cube_r26, -1.5708F, -1.2654F, 1.5708F);
		cube_r26.setTextureOffset(152, 356).addBox(40.6731F, -53.6997F, -2.0F, 36.0F, 3.0F, 4.0F, 0.0F, false);
		cube_r26.setTextureOffset(422, 285).addBox(40.9231F, -53.8496F, 0.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r26.setTextureOffset(422, 291).addBox(40.9231F, -53.8496F, -3.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);

		Brace2 = new ModelRenderer(this);
		Brace2.setRotationPoint(0.0F, 7.7991F, 38.5595F);
		Braces.addChild(Brace2);
		setRotationAngle(Brace2, -3.1416F, 0.5236F, 3.1416F);
		Brace2.setTextureOffset(118, 177).addBox(0.25F, -36.0252F, 49.9963F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		Brace2.setTextureOffset(169, 3).addBox(-3.25F, -36.0252F, 49.9963F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		Brace2.setTextureOffset(96, 54).addBox(-1.0F, -36.0188F, 49.7647F, 2.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.0F, -7.7991F, 38.5595F);
		Brace2.addChild(cube_r27);
		setRotationAngle(cube_r27, 1.5708F, 1.309F, 1.5708F);
		cube_r27.setTextureOffset(422, 302).addBox(-17.517F, -20.3294F, -2.25F, 34.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r27.setTextureOffset(422, 74).addBox(-17.9922F, -22.2178F, -3.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r27.setTextureOffset(422, 80).addBox(-17.9922F, -22.2178F, 0.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.0F, -7.7991F, -38.5595F);
		Brace2.addChild(cube_r28);
		setRotationAngle(cube_r28, -1.5708F, -1.2654F, 1.5708F);
		cube_r28.setTextureOffset(310, 117).addBox(40.6731F, -53.6997F, -2.0F, 36.0F, 3.0F, 4.0F, 0.0F, false);
		cube_r28.setTextureOffset(422, 86).addBox(40.9231F, -53.8496F, 0.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r28.setTextureOffset(422, 92).addBox(40.9231F, -53.8496F, -3.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);

		Brace3 = new ModelRenderer(this);
		Brace3.setRotationPoint(0.0F, 7.7991F, 38.5595F);
		Braces.addChild(Brace3);
		setRotationAngle(Brace3, 0.0F, 1.5708F, 0.0F);
		Brace3.setTextureOffset(158, 136).addBox(0.25F, -36.0252F, 49.9963F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		Brace3.setTextureOffset(158, 126).addBox(-3.25F, -36.0252F, 49.9963F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		Brace3.setTextureOffset(84, 54).addBox(-1.0F, -36.0188F, 49.7647F, 2.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.0F, -7.7991F, 38.5595F);
		Brace3.addChild(cube_r29);
		setRotationAngle(cube_r29, 1.5708F, 1.309F, 1.5708F);
		cube_r29.setTextureOffset(422, 297).addBox(-17.517F, -20.3294F, -2.25F, 34.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r29.setTextureOffset(422, 43).addBox(-17.9922F, -22.2178F, -3.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r29.setTextureOffset(422, 49).addBox(-17.9922F, -22.2178F, 0.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.0F, -7.7991F, -38.5595F);
		Brace3.addChild(cube_r30);
		setRotationAngle(cube_r30, -1.5708F, -1.2654F, 1.5708F);
		cube_r30.setTextureOffset(280, 245).addBox(40.6731F, -53.6997F, -2.0F, 36.0F, 3.0F, 4.0F, 0.0F, false);
		cube_r30.setTextureOffset(422, 55).addBox(40.9231F, -53.8496F, 0.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r30.setTextureOffset(422, 61).addBox(40.9231F, -53.8496F, -3.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);

		Brace4 = new ModelRenderer(this);
		Brace4.setRotationPoint(0.0F, 7.7991F, 38.5595F);
		Braces.addChild(Brace4);
		setRotationAngle(Brace4, 0.0F, 0.5236F, 0.0F);
		Brace4.setTextureOffset(146, 136).addBox(0.25F, -36.0252F, 49.9963F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		Brace4.setTextureOffset(146, 126).addBox(-3.25F, -36.0252F, 49.9963F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		Brace4.setTextureOffset(12, 76).addBox(-1.0F, -36.0188F, 49.7647F, 2.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.0F, -7.7991F, 38.5595F);
		Brace4.addChild(cube_r31);
		setRotationAngle(cube_r31, 1.5708F, 1.309F, 1.5708F);
		cube_r31.setTextureOffset(408, 365).addBox(-17.517F, -20.3294F, -2.25F, 34.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r31.setTextureOffset(420, 169).addBox(-17.9922F, -22.2178F, -3.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r31.setTextureOffset(420, 175).addBox(-17.9922F, -22.2178F, 0.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.0F, -7.7991F, -38.5595F);
		Brace4.addChild(cube_r32);
		setRotationAngle(cube_r32, -1.5708F, -1.2654F, 1.5708F);
		cube_r32.setTextureOffset(118, 252).addBox(40.6731F, -53.6997F, -2.0F, 36.0F, 3.0F, 4.0F, 0.0F, false);
		cube_r32.setTextureOffset(420, 181).addBox(40.9231F, -53.8496F, 0.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r32.setTextureOffset(422, 37).addBox(40.9231F, -53.8496F, -3.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);

		Brace5 = new ModelRenderer(this);
		Brace5.setRotationPoint(0.0F, 7.7991F, 38.5595F);
		Braces.addChild(Brace5);
		setRotationAngle(Brace5, 0.0F, -0.5236F, 0.0F);
		Brace5.setTextureOffset(146, 114).addBox(0.25F, -36.0252F, 49.9963F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		Brace5.setTextureOffset(146, 104).addBox(-3.25F, -36.0252F, 49.9963F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		Brace5.setTextureOffset(0, 76).addBox(-1.0F, -36.0188F, 49.7647F, 2.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.0F, -7.7991F, 38.5595F);
		Brace5.addChild(cube_r33);
		setRotationAngle(cube_r33, 1.5708F, 1.309F, 1.5708F);
		cube_r33.setTextureOffset(280, 252).addBox(-17.517F, -20.3294F, -2.25F, 34.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r33.setTextureOffset(408, 347).addBox(-17.9922F, -22.2178F, -3.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r33.setTextureOffset(408, 353).addBox(-17.9922F, -22.2178F, 0.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.0F, -7.7991F, -38.5595F);
		Brace5.addChild(cube_r34);
		setRotationAngle(cube_r34, -1.5708F, -1.2654F, 1.5708F);
		cube_r34.setTextureOffset(242, 32).addBox(40.6731F, -53.6997F, -2.0F, 36.0F, 3.0F, 4.0F, 0.0F, false);
		cube_r34.setTextureOffset(408, 359).addBox(40.9231F, -53.8496F, 0.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r34.setTextureOffset(412, 24).addBox(40.9231F, -53.8496F, -3.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);

		Brace6 = new ModelRenderer(this);
		Brace6.setRotationPoint(0.0F, 7.7991F, 38.5595F);
		Braces.addChild(Brace6);
		setRotationAngle(Brace6, 0.0F, -1.5708F, 0.0F);
		Brace6.setTextureOffset(108, 74).addBox(0.25F, -36.0252F, 49.9963F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		Brace6.setTextureOffset(0, 66).addBox(-3.25F, -36.0252F, 49.9963F, 3.0F, 5.0F, 1.0F, 0.0F, false);
		Brace6.setTextureOffset(0, 50).addBox(-1.0F, -36.0188F, 49.7647F, 2.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.0F, -7.7991F, 38.5595F);
		Brace6.addChild(cube_r35);
		setRotationAngle(cube_r35, 1.5708F, 1.309F, 1.5708F);
		cube_r35.setTextureOffset(236, 203).addBox(-17.517F, -20.3294F, -2.25F, 34.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r35.setTextureOffset(168, 44).addBox(-17.9922F, -22.2178F, -3.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r35.setTextureOffset(280, 235).addBox(-17.9922F, -22.2178F, 0.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(0.0F, -7.7991F, -38.5595F);
		Brace6.addChild(cube_r36);
		setRotationAngle(cube_r36, -1.5708F, -1.2654F, 1.5708F);
		cube_r36.setTextureOffset(242, 25).addBox(40.6731F, -53.6997F, -2.0F, 36.0F, 3.0F, 4.0F, 0.0F, false);
		cube_r36.setTextureOffset(408, 264).addBox(40.9231F, -53.8496F, 0.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);
		cube_r36.setTextureOffset(408, 270).addBox(40.9231F, -53.8496F, -3.25F, 36.0F, 3.0F, 3.0F, 0.0F, false);

		Edge = new ModelRenderer(this);
		Edge.setRotationPoint(0.0F, 7.7991F, 38.5595F);
		Braces.addChild(Edge);


		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, -1.5708F, 0.0F);
		cube_r37.setTextureOffset(168, 71).addBox(43.25F, -34.0F, 19.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r37.setTextureOffset(168, 78).addBox(43.25F, -34.0F, -24.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r37.setTextureOffset(118, 159).addBox(39.25F, -34.0F, -25.5F, 4.0F, 2.0F, 51.0F, 0.0F, false);
		cube_r37.setTextureOffset(179, 210).addBox(39.25F, -36.0F, -24.5F, 5.0F, 2.0F, 49.0F, 0.0F, false);
		cube_r37.setTextureOffset(177, 159).addBox(43.25F, -34.0F, -6.5F, 1.0F, 2.0F, 13.0F, 0.0F, false);

		Edge2 = new ModelRenderer(this);
		Edge2.setRotationPoint(0.0F, 7.7991F, 38.5595F);
		Braces.addChild(Edge2);
		setRotationAngle(Edge2, 0.0F, 1.0472F, 0.0F);


		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge2.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0F, -1.5708F, 0.0F);
		cube_r38.setTextureOffset(168, 54).addBox(43.25F, -34.0F, 19.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r38.setTextureOffset(168, 61).addBox(43.25F, -34.0F, -24.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r38.setTextureOffset(59, 157).addBox(39.25F, -34.0F, -25.5F, 4.0F, 2.0F, 51.0F, 0.0F, false);
		cube_r38.setTextureOffset(165, 55).addBox(39.25F, -36.0F, -24.5F, 5.0F, 2.0F, 49.0F, 0.0F, false);
		cube_r38.setTextureOffset(177, 135).addBox(43.25F, -34.0F, -6.5F, 1.0F, 2.0F, 13.0F, 0.0F, false);

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-4.6F, -35.9647F, 44.2361F);
		Edge2.addChild(cube_r39);
		setRotationAngle(cube_r39, -1.5708F, -0.9599F, 1.5708F);
		cube_r39.setTextureOffset(11, 0).addBox(-0.1806F, -0.0494F, -2.0F, 2.0F, 0.0F, 4.0F, 0.0F, false);

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(-4.5F, -36.75F, 41.75F);
		Edge2.addChild(cube_r40);
		setRotationAngle(cube_r40, -1.5708F, -1.2654F, 1.5708F);
		cube_r40.setTextureOffset(0, 57).addBox(-1.55F, -0.1F, -1.9F, 4.0F, 0.0F, 4.0F, 0.0F, false);

		Edge3 = new ModelRenderer(this);
		Edge3.setRotationPoint(0.0F, 7.7991F, 38.5595F);
		Braces.addChild(Edge3);
		setRotationAngle(Edge3, -3.1416F, 1.0472F, 3.1416F);


		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge3.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.0F, -1.5708F, 0.0F);
		cube_r41.setTextureOffset(168, 22).addBox(43.25F, -34.0F, 19.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r41.setTextureOffset(168, 29).addBox(43.25F, -34.0F, -24.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r41.setTextureOffset(0, 153).addBox(39.25F, -34.0F, -25.5F, 4.0F, 2.0F, 51.0F, 0.0F, false);
		cube_r41.setTextureOffset(59, 210).addBox(39.25F, -36.0F, -24.5F, 5.0F, 2.0F, 49.0F, 0.0F, false);
		cube_r41.setTextureOffset(177, 120).addBox(43.25F, -34.0F, -6.5F, 1.0F, 2.0F, 13.0F, 0.0F, false);

		Edge4 = new ModelRenderer(this);
		Edge4.setRotationPoint(0.0F, 7.7991F, 38.5595F);
		Braces.addChild(Edge4);
		setRotationAngle(Edge4, -3.1416F, 0.0F, 3.1416F);


		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge4.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, -1.5708F, 0.0F);
		cube_r42.setTextureOffset(138, 164).addBox(43.25F, -34.0F, 19.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r42.setTextureOffset(154, 166).addBox(43.25F, -34.0F, -24.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r42.setTextureOffset(118, 106).addBox(39.25F, -34.0F, -25.5F, 4.0F, 2.0F, 51.0F, 0.0F, false);
		cube_r42.setTextureOffset(0, 206).addBox(39.25F, -36.0F, -24.5F, 5.0F, 2.0F, 49.0F, 0.0F, false);
		cube_r42.setTextureOffset(118, 177).addBox(43.25F, -34.0F, -6.5F, 1.0F, 2.0F, 13.0F, 0.0F, false);

		Edge5 = new ModelRenderer(this);
		Edge5.setRotationPoint(0.0F, 7.7991F, 38.5595F);
		Braces.addChild(Edge5);
		setRotationAngle(Edge5, -3.1416F, -1.0472F, 3.1416F);


		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge5.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.0F, -1.5708F, 0.0F);
		cube_r43.setTextureOffset(79, 163).addBox(43.25F, -34.0F, 19.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r43.setTextureOffset(95, 163).addBox(43.25F, -34.0F, -24.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r43.setTextureOffset(59, 104).addBox(39.25F, -34.0F, -25.5F, 4.0F, 2.0F, 51.0F, 0.0F, false);
		cube_r43.setTextureOffset(177, 159).addBox(39.25F, -36.0F, -24.5F, 5.0F, 2.0F, 49.0F, 0.0F, false);
		cube_r43.setTextureOffset(141, 175).addBox(43.25F, -34.0F, -6.5F, 1.0F, 2.0F, 13.0F, 0.0F, false);

		Edge6 = new ModelRenderer(this);
		Edge6.setRotationPoint(0.0F, 7.7991F, 38.5595F);
		Braces.addChild(Edge6);
		setRotationAngle(Edge6, 0.0F, -1.0472F, 0.0F);


		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge6.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.0F, -1.5708F, 0.0F);
		cube_r44.setTextureOffset(84, 32).addBox(43.25F, -34.0F, 19.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r44.setTextureOffset(154, 159).addBox(43.25F, -34.0F, -24.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r44.setTextureOffset(0, 100).addBox(39.25F, -34.0F, -25.5F, 4.0F, 2.0F, 51.0F, 0.0F, false);
		cube_r44.setTextureOffset(177, 106).addBox(39.25F, -36.0F, -24.5F, 5.0F, 2.0F, 49.0F, 0.0F, false);
		cube_r44.setTextureOffset(82, 173).addBox(43.25F, -34.0F, -6.5F, 1.0F, 2.0F, 13.0F, 0.0F, false);

		Panels = new ModelRenderer(this);
		Panels.setRotationPoint(0.0F, 0.0F, 0.0F);
		ConsoleUnit.addChild(Panels);


		Panel1 = new ModelRenderer(this);
		Panel1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(Panel1);
		setRotationAngle(Panel1, -3.1416F, 0.0F, 3.1416F);


		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(0.0F, -39.0491F, -36.8095F);
		Panel1.addChild(cube_r45);
		setRotationAngle(cube_r45, -1.5708F, -1.2217F, 1.5708F);
		cube_r45.setTextureOffset(189, 87).addBox(68.5F, -24.25F, 15.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r45.setTextureOffset(192, 120).addBox(63.5F, -24.25F, 8.0F, 5.0F, 2.0F, 9.0F, 0.0F, false);
		cube_r45.setTextureOffset(168, 87).addBox(57.5F, -24.25F, 6.0F, 6.0F, 3.0F, 9.0F, 0.0F, false);
		cube_r45.setTextureOffset(80, 188).addBox(57.5F, -24.25F, -15.0F, 6.0F, 3.0F, 9.0F, 0.0F, false);
		cube_r45.setTextureOffset(192, 135).addBox(63.5F, -24.25F, -17.0F, 5.0F, 2.0F, 9.0F, 0.0F, false);
		cube_r45.setTextureOffset(206, 146).addBox(68.5F, -24.25F, -20.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r45.setTextureOffset(212, 410).addBox(46.5F, -24.25F, -11.0F, 11.0F, 3.0F, 22.0F, 0.0F, false);
		cube_r45.setTextureOffset(184, 238).addBox(68.5F, -23.75F, 11.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		cube_r45.setTextureOffset(238, 189).addBox(68.5F, -23.75F, -15.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		cube_r45.setTextureOffset(304, 332).addBox(68.5F, -24.25F, -11.0F, 4.0F, 2.0F, 22.0F, 0.0F, false);
		cube_r45.setTextureOffset(310, 71).addBox(72.5F, -24.25F, -22.0F, 3.0F, 2.0F, 44.0F, 0.0F, false);

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(18.0F, -19.7301F, -41.0585F);
		Panel1.addChild(cube_r46);
		setRotationAngle(cube_r46, -1.5708F, -1.3963F, 1.5708F);
		cube_r46.setTextureOffset(422, 372).addBox(59.5F, -31.75F, 10.0F, 13.0F, 2.0F, 16.0F, 0.0F, false);

		Panel2 = new ModelRenderer(this);
		Panel2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(Panel2);
		setRotationAngle(Panel2, -3.1416F, -1.0472F, 3.1416F);


		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(0.0F, -39.0491F, -36.8095F);
		Panel2.addChild(cube_r47);
		setRotationAngle(cube_r47, -1.5708F, -1.2217F, 1.5708F);
		cube_r47.setTextureOffset(411, 410).addBox(60.5F, -23.75F, -12.0F, 7.0F, 2.0F, 24.0F, 0.0F, false);
		cube_r47.setTextureOffset(0, 0).addBox(58.5F, -23.75F, -10.0F, 2.0F, 2.0F, 20.0F, 0.0F, false);
		cube_r47.setTextureOffset(0, 22).addBox(67.5F, -23.75F, -10.0F, 2.0F, 2.0F, 20.0F, 0.0F, false);
		cube_r47.setTextureOffset(0, 169).addBox(56.5F, -23.75F, -7.0F, 2.0F, 2.0F, 14.0F, 0.0F, false);
		cube_r47.setTextureOffset(168, 71).addBox(69.5F, -23.75F, -7.0F, 2.0F, 2.0F, 14.0F, 0.0F, false);
		cube_r47.setTextureOffset(28, 223).addBox(60.5F, -24.25F, -16.0F, 5.0F, 2.0F, 4.0F, 0.0F, false);
		cube_r47.setTextureOffset(210, 214).addBox(60.5F, -24.25F, 12.0F, 5.0F, 2.0F, 4.0F, 0.0F, false);
		cube_r47.setTextureOffset(158, 114).addBox(58.5F, -24.25F, -13.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		cube_r47.setTextureOffset(158, 104).addBox(58.5F, -24.25F, 10.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		cube_r47.setTextureOffset(59, 157).addBox(65.5F, -24.25F, 12.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		cube_r47.setTextureOffset(118, 159).addBox(65.5F, -24.25F, -18.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		cube_r47.setTextureOffset(133, 177).addBox(67.5F, -24.25F, -18.0F, 2.0F, 2.0F, 8.0F, 0.0F, false);
		cube_r47.setTextureOffset(118, 167).addBox(56.5F, -24.25F, 7.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		cube_r47.setTextureOffset(59, 165).addBox(56.5F, -24.25F, -13.0F, 2.0F, 2.0F, 6.0F, 0.0F, false);
		cube_r47.setTextureOffset(177, 174).addBox(69.5F, -24.25F, -19.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		cube_r47.setTextureOffset(146, 136).addBox(67.5F, -24.25F, 10.0F, 2.0F, 2.0F, 8.0F, 0.0F, false);
		cube_r47.setTextureOffset(0, 185).addBox(69.5F, -24.25F, 7.0F, 2.0F, 2.0F, 12.0F, 0.0F, false);
		cube_r47.setTextureOffset(238, 235).addBox(46.5F, -24.25F, -11.0F, 10.0F, 2.0F, 22.0F, 0.0F, false);
		cube_r47.setTextureOffset(306, 157).addBox(71.5F, -24.25F, -22.0F, 4.0F, 2.0F, 44.0F, 0.0F, false);

		Panel3 = new ModelRenderer(this);
		Panel3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(Panel3);
		setRotationAngle(Panel3, 0.0F, -1.0472F, 0.0F);


		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(0.0F, -39.0491F, -36.8095F);
		Panel3.addChild(cube_r48);
		setRotationAngle(cube_r48, -1.5708F, -1.2217F, 1.5708F);
		cube_r48.setTextureOffset(138, 159).addBox(63.5F, -24.25F, 3.0F, 1.0F, 2.0F, 14.0F, 0.0F, false);
		cube_r48.setTextureOffset(79, 157).addBox(63.5F, -24.25F, -17.0F, 1.0F, 2.0F, 14.0F, 0.0F, false);
		cube_r48.setTextureOffset(168, 22).addBox(67.5F, -24.25F, 3.0F, 1.0F, 2.0F, 15.0F, 0.0F, false);
		cube_r48.setTextureOffset(168, 54).addBox(67.5F, -24.25F, -18.0F, 1.0F, 2.0F, 15.0F, 0.0F, false);
		cube_r48.setTextureOffset(177, 135).addBox(55.5F, -24.25F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r48.setTextureOffset(177, 139).addBox(59.5F, -24.25F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r48.setTextureOffset(0, 66).addBox(58.5F, -24.25F, -9.0F, 1.0F, 2.0F, 18.0F, 0.0F, false);
		cube_r48.setTextureOffset(348, 410).addBox(46.5F, -24.25F, -10.0F, 8.0F, 2.0F, 20.0F, 0.0F, false);
		cube_r48.setTextureOffset(0, 66).addBox(54.5F, -24.25F, -4.0F, 1.0F, 2.0F, 8.0F, 0.0F, false);
		cube_r48.setTextureOffset(185, 54).addBox(62.5F, -24.25F, -6.0F, 1.0F, 2.0F, 12.0F, 0.0F, false);
		cube_r48.setTextureOffset(186, 71).addBox(68.5F, -24.25F, -6.0F, 1.0F, 2.0F, 12.0F, 0.0F, false);
		cube_r48.setTextureOffset(31, 86).addBox(54.5F, -24.25F, -12.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		cube_r48.setTextureOffset(0, 153).addBox(54.5F, -24.25F, 8.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		cube_r48.setTextureOffset(118, 236).addBox(57.5F, -24.25F, 9.0F, 3.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r48.setTextureOffset(36, 153).addBox(60.5F, -24.25F, 12.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		cube_r48.setTextureOffset(95, 157).addBox(64.5F, -24.25F, 14.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		cube_r48.setTextureOffset(44, 144).addBox(68.5F, -24.25F, -18.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r48.setTextureOffset(124, 42).addBox(68.5F, -24.25F, 16.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r48.setTextureOffset(200, 238).addBox(69.5F, -24.25F, 16.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		cube_r48.setTextureOffset(134, 236).addBox(57.5F, -24.25F, -14.0F, 3.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r48.setTextureOffset(79, 157).addBox(60.5F, -24.25F, -16.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		cube_r48.setTextureOffset(0, 159).addBox(64.5F, -24.25F, -18.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		cube_r48.setTextureOffset(59, 239).addBox(69.5F, -24.25F, -20.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		cube_r48.setTextureOffset(338, 245).addBox(54.5F, -23.75F, -16.0F, 19.0F, 2.0F, 32.0F, 0.0F, false);
		cube_r48.setTextureOffset(84, 54).addBox(72.5F, -24.25F, -9.0F, 1.0F, 2.0F, 18.0F, 0.0F, false);
		cube_r48.setTextureOffset(362, 328).addBox(73.5F, -24.25F, -21.0F, 2.0F, 2.0F, 42.0F, 0.0F, false);

		Panel4 = new ModelRenderer(this);
		Panel4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(Panel4);


		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(0.0F, -39.0491F, -36.8095F);
		Panel4.addChild(cube_r49);
		setRotationAngle(cube_r49, -1.5708F, -1.2217F, 1.5708F);
		cube_r49.setTextureOffset(420, 145).addBox(46.5F, -24.25F, -11.0F, 9.0F, 2.0F, 22.0F, 0.0F, false);
		cube_r49.setTextureOffset(84, 62).addBox(55.5F, -24.25F, 7.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r49.setTextureOffset(76, 175).addBox(55.5F, -24.25F, -12.0F, 4.0F, 2.0F, 5.0F, 0.0F, false);
		cube_r49.setTextureOffset(83, 210).addBox(59.5F, -24.25F, -15.0F, 4.0F, 2.0F, 8.0F, 0.0F, false);
		cube_r49.setTextureOffset(204, 222).addBox(59.5F, -24.25F, 7.0F, 4.0F, 2.0F, 8.0F, 0.0F, false);
		cube_r49.setTextureOffset(56, 326).addBox(63.5F, -24.25F, -17.0F, 4.0F, 2.0F, 34.0F, 0.0F, false);
		cube_r49.setTextureOffset(52, 406).addBox(67.5F, -24.25F, -19.0F, 4.0F, 2.0F, 38.0F, 0.0F, false);
		cube_r49.setTextureOffset(298, 25).addBox(71.5F, -24.25F, -22.0F, 4.0F, 2.0F, 44.0F, 0.0F, false);

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(0.0F, -38.7909F, -37.6204F);
		Panel4.addChild(cube_r50);
		setRotationAngle(cube_r50, -1.5708F, -1.3963F, 1.5708F);
		cube_r50.setTextureOffset(0, 50).addBox(59.5F, -13.25F, -7.0F, 8.0F, 2.0F, 14.0F, 0.0F, false);

		Panel5 = new ModelRenderer(this);
		Panel5.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(Panel5);
		setRotationAngle(Panel5, 0.0F, 1.0472F, 0.0F);


		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.0F, -39.0491F, -36.8095F);
		Panel5.addChild(cube_r51);
		setRotationAngle(cube_r51, -1.5708F, -1.2217F, 1.5708F);
		cube_r51.setTextureOffset(412, 0).addBox(46.5F, -24.25F, -11.0F, 9.0F, 2.0F, 22.0F, 0.0F, false);
		cube_r51.setTextureOffset(252, 410).addBox(55.5F, -24.25F, -13.0F, 5.0F, 2.0F, 26.0F, 0.0F, false);
		cube_r51.setTextureOffset(91, 238).addBox(69.5F, -24.25F, 16.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		cube_r51.setTextureOffset(84, 74).addBox(66.5F, -24.25F, 14.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		cube_r51.setTextureOffset(36, 159).addBox(62.5F, -24.25F, 13.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);
		cube_r51.setTextureOffset(138, 159).addBox(62.5F, -24.25F, -16.0F, 4.0F, 2.0F, 3.0F, 0.0F, false);
		cube_r51.setTextureOffset(84, 80).addBox(66.5F, -24.25F, -18.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		cube_r51.setTextureOffset(238, 146).addBox(69.5F, -24.25F, -20.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		cube_r51.setTextureOffset(168, 0).addBox(62.5F, -23.75F, 7.0F, 11.0F, 2.0F, 9.0F, 0.0F, false);
		cube_r51.setTextureOffset(168, 11).addBox(62.5F, -23.75F, -16.0F, 11.0F, 2.0F, 9.0F, 0.0F, false);
		cube_r51.setTextureOffset(0, 153).addBox(62.5F, -24.25F, -7.0F, 11.0F, 2.0F, 14.0F, 0.0F, false);
		cube_r51.setTextureOffset(379, 410).addBox(60.5F, -24.25F, -14.0F, 2.0F, 2.0F, 28.0F, 0.0F, false);
		cube_r51.setTextureOffset(314, 328).addBox(73.5F, -24.25F, -22.0F, 2.0F, 2.0F, 44.0F, 0.0F, false);

		Panel6 = new ModelRenderer(this);
		Panel6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(Panel6);
		setRotationAngle(Panel6, -3.1416F, 1.0472F, 3.1416F);


		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(0.0F, -39.0491F, -36.8095F);
		Panel6.addChild(cube_r52);
		setRotationAngle(cube_r52, -1.5708F, -1.2217F, 1.5708F);
		cube_r52.setTextureOffset(19, 190).addBox(62.5F, -24.25F, 8.0F, 5.0F, 2.0F, 9.0F, 0.0F, false);
		cube_r52.setTextureOffset(0, 76).addBox(59.5F, -24.25F, 8.0F, 3.0F, 2.0F, 6.0F, 0.0F, false);
		cube_r52.setTextureOffset(236, 132).addBox(46.5F, -24.25F, -10.0F, 9.0F, 2.0F, 20.0F, 0.0F, false);
		cube_r52.setTextureOffset(108, 74).addBox(55.5F, -24.25F, -12.0F, 2.0F, 2.0F, 8.0F, 0.0F, false);
		cube_r52.setTextureOffset(146, 104).addBox(55.5F, -24.25F, 4.0F, 2.0F, 2.0F, 8.0F, 0.0F, false);
		cube_r52.setTextureOffset(146, 114).addBox(57.5F, -24.25F, 6.0F, 2.0F, 2.0F, 8.0F, 0.0F, false);
		cube_r52.setTextureOffset(146, 126).addBox(57.5F, -24.25F, -14.0F, 2.0F, 2.0F, 8.0F, 0.0F, false);
		cube_r52.setTextureOffset(84, 54).addBox(59.5F, -24.25F, -14.0F, 3.0F, 2.0F, 6.0F, 0.0F, false);
		cube_r52.setTextureOffset(59, 191).addBox(62.5F, -24.25F, -17.0F, 5.0F, 2.0F, 9.0F, 0.0F, false);
		cube_r52.setTextureOffset(19, 172).addBox(67.5F, -24.25F, -19.0F, 2.0F, 2.0F, 13.0F, 0.0F, false);
		cube_r52.setTextureOffset(59, 175).addBox(67.5F, -24.25F, 6.0F, 2.0F, 2.0F, 13.0F, 0.0F, false);
		cube_r52.setTextureOffset(59, 157).addBox(69.5F, -24.25F, 4.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
		cube_r52.setTextureOffset(118, 159).addBox(69.5F, -24.25F, -20.0F, 2.0F, 2.0F, 16.0F, 0.0F, false);
		cube_r52.setTextureOffset(262, 286).addBox(71.5F, -24.25F, -22.0F, 4.0F, 2.0F, 44.0F, 0.0F, false);

		TimeRotorCasing = new ModelRenderer(this);
		TimeRotorCasing.setRotationPoint(0.0F, -45.0F, 0.0F);
		ConsoleUnit.addChild(TimeRotorCasing);
		TimeRotorCasing.setTextureOffset(232, 376).addBox(-6.5F, -86.0F, -16.0F, 13.0F, 2.0F, 32.0F, 0.0F, false);
		TimeRotorCasing.setTextureOffset(102, 286).addBox(-7.5F, -90.0F, -18.0F, 15.0F, 4.0F, 36.0F, 0.0F, false);
		TimeRotorCasing.setTextureOffset(236, 88).addBox(-8.5F, -94.0F, -20.0F, 17.0F, 4.0F, 40.0F, 0.0F, false);
		TimeRotorCasing.setTextureOffset(0, 50).addBox(-9.5F, -98.0F, -23.0F, 19.0F, 4.0F, 46.0F, 0.0F, false);
		TimeRotorCasing.setTextureOffset(224, 74).addBox(-6.0F, -6.0F, 12.5F, 12.0F, 4.0F, 2.0F, 0.0F, false);
		TimeRotorCasing.setTextureOffset(118, 212).addBox(-6.0F, -85.0F, 12.5F, 12.0F, 4.0F, 2.0F, 0.0F, false);
		TimeRotorCasing.setTextureOffset(193, 174).addBox(-6.5F, -7.0F, 12.65F, 13.0F, 2.0F, 3.0F, 0.0F, false);

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(0.0F, -80.0F, 0.0F);
		TimeRotorCasing.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.0F, 0.7854F, 0.0F);
		cube_r53.setTextureOffset(224, 62).addBox(-6.0F, -5.0F, 12.5F, 12.0F, 4.0F, 2.0F, 0.0F, false);
		cube_r53.setTextureOffset(193, 179).addBox(-6.5F, 73.0F, 12.65F, 13.0F, 2.0F, 3.0F, 0.0F, false);
		cube_r53.setTextureOffset(224, 68).addBox(-6.0F, 74.0F, 12.5F, 12.0F, 4.0F, 2.0F, 0.0F, false);
		cube_r53.setTextureOffset(84, 54).addBox(-9.5F, -18.0F, -23.0F, 19.0F, 4.0F, 46.0F, 0.0F, false);
		cube_r53.setTextureOffset(168, 0).addBox(-8.5F, -14.0F, -20.0F, 17.0F, 4.0F, 40.0F, 0.0F, false);
		cube_r53.setTextureOffset(118, 212).addBox(-7.5F, -10.0F, -18.0F, 15.0F, 4.0F, 36.0F, 0.0F, false);
		cube_r53.setTextureOffset(383, 111).addBox(-6.5F, -6.0F, -16.0F, 13.0F, 2.0F, 32.0F, 0.0F, false);

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(0.0F, -80.0F, 0.0F);
		TimeRotorCasing.addChild(cube_r54);
		setRotationAngle(cube_r54, -3.1416F, 1.5708F, 3.1416F);
		cube_r54.setTextureOffset(224, 56).addBox(-6.0F, -5.0F, 12.5F, 12.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(0.0F, -80.0F, 0.0F);
		TimeRotorCasing.addChild(cube_r55);
		setRotationAngle(cube_r55, -3.1416F, -0.7854F, 3.1416F);
		cube_r55.setTextureOffset(224, 50).addBox(-6.0F, -5.0F, 12.5F, 12.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(0.0F, -80.0F, 0.0F);
		TimeRotorCasing.addChild(cube_r56);
		setRotationAngle(cube_r56, -3.1416F, 0.0F, -3.1416F);
		cube_r56.setTextureOffset(0, 223).addBox(-6.0F, -5.0F, 12.5F, 12.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(0.0F, -80.0F, 0.0F);
		TimeRotorCasing.addChild(cube_r57);
		setRotationAngle(cube_r57, -3.1416F, 0.7854F, 3.1416F);
		cube_r57.setTextureOffset(184, 218).addBox(-6.0F, -5.0F, 12.5F, 12.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(0.0F, -3.0F, 0.0F);
		TimeRotorCasing.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.0F, -0.7854F, 0.0F);
		cube_r58.setTextureOffset(192, 164).addBox(-6.5F, -4.0F, 12.65F, 13.0F, 2.0F, 3.0F, 0.0F, false);
		cube_r58.setTextureOffset(184, 212).addBox(-6.0F, -82.0F, 12.5F, 12.0F, 4.0F, 2.0F, 0.0F, false);
		cube_r58.setTextureOffset(224, 88).addBox(-6.0F, -3.0F, 12.5F, 12.0F, 4.0F, 2.0F, 0.0F, false);
		cube_r58.setTextureOffset(84, 4).addBox(-9.5F, -95.0F, -23.0F, 19.0F, 4.0F, 46.0F, 0.0F, false);
		cube_r58.setTextureOffset(224, 44).addBox(-8.5F, -91.0F, -20.0F, 17.0F, 4.0F, 40.0F, 0.0F, false);
		cube_r58.setTextureOffset(0, 286).addBox(-7.5F, -87.0F, -18.0F, 15.0F, 4.0F, 36.0F, 0.0F, false);
		cube_r58.setTextureOffset(312, 374).addBox(-6.5F, -83.0F, -16.0F, 13.0F, 2.0F, 32.0F, 0.0F, false);

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(0.0F, -1.0F, 0.0F);
		TimeRotorCasing.addChild(cube_r59);
		setRotationAngle(cube_r59, -3.1416F, -0.7854F, 3.1416F);
		cube_r59.setTextureOffset(118, 224).addBox(-6.0F, -5.0F, 12.5F, 12.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(0.0F, -1.0F, 0.0F);
		TimeRotorCasing.addChild(cube_r60);
		setRotationAngle(cube_r60, -3.1416F, 0.0F, -3.1416F);
		cube_r60.setTextureOffset(184, 224).addBox(-6.0F, -5.0F, 12.5F, 12.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(0.0F, -1.0F, 0.0F);
		TimeRotorCasing.addChild(cube_r61);
		setRotationAngle(cube_r61, -3.1416F, 0.7854F, 3.1416F);
		cube_r61.setTextureOffset(59, 227).addBox(-6.0F, -5.0F, 12.5F, 12.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(0.0F, -1.0F, 0.0F);
		TimeRotorCasing.addChild(cube_r62);
		setRotationAngle(cube_r62, -3.1416F, 1.5708F, 3.1416F);
		cube_r62.setTextureOffset(0, 229).addBox(-6.0F, -5.0F, 12.5F, 12.0F, 4.0F, 2.0F, 0.0F, false);

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(0.0F, -80.0F, 0.0F);
		TimeRotorCasing.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.0F, -1.5708F, 0.0F);
		cube_r63.setTextureOffset(118, 218).addBox(-6.0F, -5.0F, 12.5F, 12.0F, 4.0F, 2.0F, 0.0F, false);
		cube_r63.setTextureOffset(224, 94).addBox(-6.0F, 74.0F, 12.5F, 12.0F, 4.0F, 2.0F, 0.0F, false);
		cube_r63.setTextureOffset(192, 159).addBox(-6.5F, 73.0F, 12.65F, 13.0F, 2.0F, 3.0F, 0.0F, false);

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(0.0F, -3.0F, 0.0F);
		TimeRotorCasing.addChild(cube_r64);
		setRotationAngle(cube_r64, -3.1416F, -0.7854F, 3.1416F);
		cube_r64.setTextureOffset(177, 150).addBox(-6.5F, -4.0F, 12.65F, 13.0F, 2.0F, 3.0F, 0.0F, false);

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(0.0F, -3.0F, 0.0F);
		TimeRotorCasing.addChild(cube_r65);
		setRotationAngle(cube_r65, -3.1416F, 0.0F, -3.1416F);
		cube_r65.setTextureOffset(118, 148).addBox(-6.5F, -4.0F, 12.65F, 13.0F, 2.0F, 3.0F, 0.0F, false);

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(0.0F, -18.0F, 0.0F);
		TimeRotorCasing.addChild(cube_r66);
		setRotationAngle(cube_r66, 0.0F, 1.5708F, 0.0F);
		cube_r66.setTextureOffset(0, 0).addBox(-9.5F, -80.0F, -23.0F, 19.0F, 4.0F, 46.0F, 0.0F, false);
		cube_r66.setTextureOffset(236, 157).addBox(-8.5F, -76.0F, -20.0F, 17.0F, 4.0F, 40.0F, 0.0F, false);
		cube_r66.setTextureOffset(204, 286).addBox(-7.5F, -72.0F, -18.0F, 15.0F, 4.0F, 36.0F, 0.0F, false);
		cube_r66.setTextureOffset(0, 406).addBox(-6.5F, -68.0F, -16.0F, 13.0F, 2.0F, 32.0F, 0.0F, false);
		cube_r66.setTextureOffset(0, 144).addBox(-6.5F, 11.0F, 12.65F, 13.0F, 2.0F, 3.0F, 0.0F, false);

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(0.0F, -3.0F, 0.0F);
		TimeRotorCasing.addChild(cube_r67);
		setRotationAngle(cube_r67, -3.1416F, 0.7854F, -3.1416F);
		cube_r67.setTextureOffset(84, 90).addBox(-6.5F, -4.0F, 12.65F, 13.0F, 2.0F, 3.0F, 0.0F, false);

		InnerRotor = new ModelRenderer(this);
		InnerRotor.setRotationPoint(0.0F, -14.0F, 0.0F);
		ConsoleUnit.addChild(InnerRotor);


		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(0.0F, 0.0F, 0.0F);
		InnerRotor.addChild(cube_r68);
		setRotationAngle(cube_r68, 0.0F, 1.5708F, 0.0F);
		cube_r68.setTextureOffset(118, 0).addBox(-1.5F, -101.0F, -1.5F, 3.0F, 18.0F, 3.0F, 0.0F, false);
		cube_r68.setTextureOffset(118, 21).addBox(-1.5F, -65.0F, -1.5F, 3.0F, 18.0F, 3.0F, 0.0F, false);
		cube_r68.setTextureOffset(87, 126).addBox(-2.5F, -115.0F, -2.5F, 5.0F, 14.0F, 5.0F, 0.0F, false);
		cube_r68.setTextureOffset(118, 126).addBox(-2.5F, -47.0F, -2.5F, 5.0F, 14.0F, 5.0F, 0.0F, false);

		cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(0.0F, -54.0F, 0.0F);
		InnerRotor.addChild(cube_r69);
		setRotationAngle(cube_r69, 0.0F, -1.0472F, 0.0F);
		cube_r69.setTextureOffset(0, 22).addBox(-2.5F, -61.0F, -10.0F, 5.0F, 14.0F, 5.0F, 0.0F, false);
		cube_r69.setTextureOffset(243, 435).addBox(-1.5F, -47.0F, -9.0F, 3.0F, 54.0F, 3.0F, 0.0F, false);
		cube_r69.setTextureOffset(0, 0).addBox(-2.5F, 7.0F, -10.0F, 5.0F, 14.0F, 5.0F, 0.0F, false);

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(0.0F, -54.0F, 0.0F);
		InnerRotor.addChild(cube_r70);
		setRotationAngle(cube_r70, -3.1416F, -1.0908F, 3.1416F);
		cube_r70.setTextureOffset(24, 22).addBox(-2.5F, -61.0F, -10.0F, 5.0F, 14.0F, 5.0F, 0.0F, false);

		cube_r71 = new ModelRenderer(this);
		cube_r71.setRotationPoint(0.0F, 0.0F, 0.0F);
		InnerRotor.addChild(cube_r71);
		setRotationAngle(cube_r71, -3.1416F, -1.0908F, 3.1416F);
		cube_r71.setTextureOffset(436, 437).addBox(-1.5F, -101.0F, -9.0F, 3.0F, 54.0F, 3.0F, 0.0F, false);

		cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(0.0F, 14.0F, 0.0F);
		InnerRotor.addChild(cube_r72);
		setRotationAngle(cube_r72, -3.1416F, -1.0908F, 3.1416F);
		cube_r72.setTextureOffset(24, 0).addBox(-2.5F, -61.0F, -10.0F, 5.0F, 14.0F, 5.0F, 0.0F, false);

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(0.0F, -54.0F, 0.0F);
		InnerRotor.addChild(cube_r73);
		setRotationAngle(cube_r73, -3.1416F, 0.0F, 3.1416F);
		cube_r73.setTextureOffset(28, 100).addBox(-2.5F, -61.0F, -10.0F, 5.0F, 14.0F, 5.0F, 0.0F, false);

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(0.0F, 0.0F, 0.0F);
		InnerRotor.addChild(cube_r74);
		setRotationAngle(cube_r74, -3.1416F, 0.0F, 3.1416F);
		cube_r74.setTextureOffset(136, 438).addBox(-1.5F, -101.0F, -9.0F, 3.0F, 54.0F, 3.0F, 0.0F, false);

		cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(0.0F, 14.0F, 0.0F);
		InnerRotor.addChild(cube_r75);
		setRotationAngle(cube_r75, -3.1416F, 0.0F, 3.1416F);
		cube_r75.setTextureOffset(0, 100).addBox(-2.5F, -61.0F, -10.0F, 5.0F, 14.0F, 5.0F, 0.0F, false);

		cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(0.0F, -54.0F, 0.0F);
		InnerRotor.addChild(cube_r76);
		setRotationAngle(cube_r76, -3.1416F, 1.0472F, 3.1416F);
		cube_r76.setTextureOffset(87, 104).addBox(-2.5F, -61.0F, -10.0F, 5.0F, 14.0F, 5.0F, 0.0F, false);

		cube_r77 = new ModelRenderer(this);
		cube_r77.setRotationPoint(0.0F, 0.0F, 0.0F);
		InnerRotor.addChild(cube_r77);
		setRotationAngle(cube_r77, -3.1416F, 1.0472F, 3.1416F);
		cube_r77.setTextureOffset(255, 438).addBox(-1.5F, -101.0F, -9.0F, 3.0F, 54.0F, 3.0F, 0.0F, false);

		cube_r78 = new ModelRenderer(this);
		cube_r78.setRotationPoint(0.0F, 14.0F, 0.0F);
		InnerRotor.addChild(cube_r78);
		setRotationAngle(cube_r78, -3.1416F, 1.0472F, 3.1416F);
		cube_r78.setTextureOffset(59, 100).addBox(-2.5F, -61.0F, -10.0F, 5.0F, 14.0F, 5.0F, 0.0F, false);

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(0.0F, -54.0F, 0.0F);
		InnerRotor.addChild(cube_r79);
		setRotationAngle(cube_r79, 0.0F, 1.0472F, 0.0F);
		cube_r79.setTextureOffset(0, 122).addBox(-2.5F, -61.0F, -10.0F, 5.0F, 14.0F, 5.0F, 0.0F, false);
		cube_r79.setTextureOffset(267, 438).addBox(-1.5F, -47.0F, -9.0F, 3.0F, 54.0F, 3.0F, 0.0F, false);
		cube_r79.setTextureOffset(118, 104).addBox(-2.5F, 7.0F, -10.0F, 5.0F, 14.0F, 5.0F, 0.0F, false);

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(0.0F, -54.0F, 0.0F);
		InnerRotor.addChild(cube_r80);
		setRotationAngle(cube_r80, -3.1416F, 3.1416F, 3.1416F);
		cube_r80.setTextureOffset(59, 126).addBox(-2.5F, -61.0F, -10.0F, 5.0F, 14.0F, 5.0F, 0.0F, false);

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(0.0F, 0.0F, 0.0F);
		InnerRotor.addChild(cube_r81);
		setRotationAngle(cube_r81, -3.1416F, 3.1416F, 3.1416F);
		cube_r81.setTextureOffset(279, 438).addBox(-1.5F, -101.0F, -9.0F, 3.0F, 54.0F, 3.0F, 0.0F, false);

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(0.0F, 14.0F, 0.0F);
		InnerRotor.addChild(cube_r82);
		setRotationAngle(cube_r82, -3.1416F, 3.1416F, 3.1416F);
		cube_r82.setTextureOffset(28, 122).addBox(-2.5F, -61.0F, -10.0F, 5.0F, 14.0F, 5.0F, 0.0F, false);

		MovingLower = new ModelRenderer(this);
		MovingLower.setRotationPoint(0.0F, 0.0F, 0.0F);
		InnerRotor.addChild(MovingLower);


		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(0.0F, 0.0F, 0.0F);
		MovingLower.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.0F, 1.5708F, 0.0F);
		cube_r83.setTextureOffset(146, 212).addBox(-1.0F, -68.0F, -1.0F, 2.0F, 18.0F, 2.0F, 0.0F, false);

		MovingUpper = new ModelRenderer(this);
		MovingUpper.setRotationPoint(0.0F, 0.0F, 0.0F);
		InnerRotor.addChild(MovingUpper);


		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(0.0F, 0.0F, 0.0F);
		MovingUpper.addChild(cube_r84);
		setRotationAngle(cube_r84, 0.0F, 1.5708F, 0.0F);
		cube_r84.setTextureOffset(87, 220).addBox(-1.0F, -97.0F, -1.0F, 2.0F, 18.0F, 2.0F, 0.0F, false);

		Controls = new ModelRenderer(this);
		Controls.setRotationPoint(0.0F, 24.0F, 0.0F);


		PowerPanelControlSupports = new ModelRenderer(this);
		PowerPanelControlSupports.setRotationPoint(0.0F, 0.0F, 0.0F);
		Controls.addChild(PowerPanelControlSupports);
		setRotationAngle(PowerPanelControlSupports, -3.1416F, 0.0F, 3.1416F);


		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(18.0F, -19.7301F, -41.0585F);
		PowerPanelControlSupports.addChild(cube_r85);
		setRotationAngle(cube_r85, -1.5708F, -1.3963F, 1.5708F);
		cube_r85.setTextureOffset(47, 170).addBox(60.7F, -33.25F, 22.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r85.setTextureOffset(128, 169).addBox(60.7F, -33.25F, 20.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r85.setTextureOffset(118, 169).addBox(60.7F, -33.25F, 18.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r85.setTextureOffset(106, 169).addBox(60.7F, -33.25F, 16.6F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r85.setTextureOffset(44, 169).addBox(60.7F, -33.25F, 14.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r85.setTextureOffset(9, 169).addBox(60.7F, -33.25F, 13.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r85.setTextureOffset(168, 24).addBox(62.75F, -32.95F, 22.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r85.setTextureOffset(168, 22).addBox(62.75F, -32.95F, 20.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r85.setTextureOffset(168, 0).addBox(62.75F, -32.95F, 18.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r85.setTextureOffset(145, 167).addBox(62.75F, -32.95F, 16.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r85.setTextureOffset(138, 167).addBox(62.75F, -32.95F, 14.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r85.setTextureOffset(128, 167).addBox(62.75F, -32.95F, 13.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r85.setTextureOffset(128, 153).addBox(62.5F, -31.95F, 22.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r85.setTextureOffset(158, 109).addBox(62.5F, -31.95F, 13.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r85.setTextureOffset(36, 44).addBox(62.5F, -31.95F, 18.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r85.setTextureOffset(95, 153).addBox(62.5F, -31.95F, 16.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r85.setTextureOffset(118, 153).addBox(62.5F, -31.95F, 20.25F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r85.setTextureOffset(158, 119).addBox(62.5F, -31.95F, 14.75F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(0.0F, -39.0491F, -36.8095F);
		PowerPanelControlSupports.addChild(cube_r86);
		setRotationAngle(cube_r86, -1.5708F, -1.2217F, 1.5708F);
		cube_r86.setTextureOffset(171, 1).addBox(58.0F, -26.25F, -9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r86.setTextureOffset(84, 182).addBox(57.5F, -25.25F, -9.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r86.setTextureOffset(0, 169).addBox(60.5F, -26.25F, -11.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		cube_r86.setTextureOffset(158, 132).addBox(54.0F, -26.25F, -8.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r86.setTextureOffset(118, 171).addBox(56.0F, -25.25F, -8.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r86.setTextureOffset(177, 178).addBox(56.0F, -26.25F, 5.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r86.setTextureOffset(128, 171).addBox(56.0F, -25.25F, 7.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r86.setTextureOffset(0, 178).addBox(60.5F, -25.0F, 7.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r86.setTextureOffset(84, 39).addBox(60.0F, -24.5F, 6.5F, 2.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r86.setTextureOffset(177, 110).addBox(64.5F, -25.25F, 8.5F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r86.setTextureOffset(69, 165).addBox(71.0F, -25.5F, -14.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r86.setTextureOffset(0, 0).addBox(71.0F, -27.5F, 13.75F, 1.0F, 4.0F, 1.0F, 0.0F, false);
		cube_r86.setTextureOffset(89, 165).addBox(71.0F, -25.5F, -12.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r86.setTextureOffset(59, 168).addBox(71.75F, -25.5F, 6.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r86.setTextureOffset(168, 56).addBox(71.75F, -25.5F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r86.setTextureOffset(168, 54).addBox(71.75F, -25.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r86.setTextureOffset(168, 31).addBox(71.75F, -25.5F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r86.setTextureOffset(168, 29).addBox(71.75F, -25.5F, -7.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r86.setTextureOffset(156, 182).addBox(71.25F, -24.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r86.setTextureOffset(119, 87).addBox(54.25F, -24.5F, -5.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r86.setTextureOffset(74, 100).addBox(54.25F, -24.5F, 2.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r86.setTextureOffset(182, 159).addBox(71.25F, -24.5F, 2.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r86.setTextureOffset(182, 163).addBox(71.25F, -24.5F, -4.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r86.setTextureOffset(168, 71).addBox(70.0F, -24.5F, 4.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r86.setTextureOffset(69, 168).addBox(70.0F, -24.5F, -5.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r86.setTextureOffset(168, 63).addBox(70.0F, -24.5F, -2.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r86.setTextureOffset(168, 61).addBox(70.0F, -24.5F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r86.setTextureOffset(168, 73).addBox(73.5F, -24.5F, 4.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r86.setTextureOffset(168, 78).addBox(73.5F, -24.5F, 1.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r86.setTextureOffset(168, 80).addBox(73.5F, -24.5F, -2.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r86.setTextureOffset(154, 168).addBox(73.5F, -24.5F, -5.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r86.setTextureOffset(182, 167).addBox(71.25F, -24.5F, -8.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r86.setTextureOffset(177, 182).addBox(71.25F, -24.5F, 6.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r86.setTextureOffset(118, 183).addBox(70.25F, -24.0F, 11.25F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r86.setTextureOffset(96, 69).addBox(69.0F, -24.5F, 11.25F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r86.setTextureOffset(138, 171).addBox(69.25F, -24.5F, -12.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r86.setTextureOffset(177, 106).addBox(64.5F, -25.25F, -10.5F, 4.0F, 2.0F, 2.0F, 0.0F, false);

		PowerPanelControlLevers = new ModelRenderer(this);
		PowerPanelControlLevers.setRotationPoint(0.0F, 0.0F, 0.0F);
		Controls.addChild(PowerPanelControlLevers);
		setRotationAngle(PowerPanelControlLevers, -3.1416F, 0.0F, 3.1416F);


		RedLever1 = new ModelRenderer(this);
		RedLever1.setRotationPoint(9.5F, -40.2258F, 33.8561F);
		PowerPanelControlLevers.addChild(RedLever1);


		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(-9.5F, 1.1767F, -70.6657F);
		RedLever1.addChild(cube_r87);
		setRotationAngle(cube_r87, -1.5708F, -1.2217F, 1.5708F);
		cube_r87.setTextureOffset(18, 44).addBox(65.5F, -26.25F, -10.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		FastReturn = new ModelRenderer(this);
		FastReturn.setRotationPoint(-12.25F, -38.413F, 36.8099F);
		PowerPanelControlLevers.addChild(FastReturn);


		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(0.0F, 0.0F, 0.0F);
		FastReturn.addChild(cube_r88);
		setRotationAngle(cube_r88, -1.5708F, -1.2217F, 1.5708F);
		cube_r88.setTextureOffset(146, 142).addBox(-2.8972F, -0.9184F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		RedLever2 = new ModelRenderer(this);
		RedLever2.setRotationPoint(-9.5F, -40.2258F, 33.8561F);
		PowerPanelControlLevers.addChild(RedLever2);


		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(9.5F, 1.1767F, -70.6656F);
		RedLever2.addChild(cube_r89);
		setRotationAngle(cube_r89, -1.5708F, -1.2217F, 1.5708F);
		cube_r89.setTextureOffset(18, 44).addBox(65.5F, -26.25F, 9.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		Refuel = new ModelRenderer(this);
		Refuel.setRotationPoint(-8.5F, -41.6211F, 29.2874F);
		PowerPanelControlLevers.addChild(Refuel);


		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(8.5F, 2.572F, -66.097F);
		Refuel.addChild(cube_r90);
		setRotationAngle(cube_r90, -1.5708F, -1.2217F, 1.5708F);
		cube_r90.setTextureOffset(158, 142).addBox(61.0F, -25.65F, 8.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		SixSet1 = new ModelRenderer(this);
		SixSet1.setRotationPoint(4.5F, -40.4725F, 27.3671F);
		PowerPanelControlLevers.addChild(SixSet1);


		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(13.5F, 20.7424F, -68.1756F);
		SixSet1.addChild(cube_r91);
		setRotationAngle(cube_r91, -1.5708F, -1.3963F, 1.5708F);
		cube_r91.setTextureOffset(0, 149).addBox(63.5F, -33.2F, 13.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		SixSet2 = new ModelRenderer(this);
		SixSet2.setRotationPoint(2.75F, -40.4725F, 27.3671F);
		PowerPanelControlLevers.addChild(SixSet2);


		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(15.25F, 20.7424F, -68.4256F);
		SixSet2.addChild(cube_r92);
		setRotationAngle(cube_r92, -1.5708F, -1.3963F, 1.5708F);
		cube_r92.setTextureOffset(83, 153).addBox(63.7462F, -33.2434F, 14.75F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		SixSet3 = new ModelRenderer(this);
		SixSet3.setRotationPoint(0.9F, -40.4725F, 27.3671F);
		PowerPanelControlLevers.addChild(SixSet3);


		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(17.0F, 20.7424F, -68.4256F);
		SixSet3.addChild(cube_r93);
		setRotationAngle(cube_r93, -1.5708F, -1.3963F, 1.5708F);
		cube_r93.setTextureOffset(59, 153).addBox(63.7462F, -33.2434F, 16.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		SixSet4 = new ModelRenderer(this);
		SixSet4.setRotationPoint(-1.0F, -40.4725F, 27.3671F);
		PowerPanelControlLevers.addChild(SixSet4);


		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(19.0F, 20.7424F, -68.4256F);
		SixSet4.addChild(cube_r94);
		setRotationAngle(cube_r94, -1.5708F, -1.3963F, 1.5708F);
		cube_r94.setTextureOffset(98, 149).addBox(63.7462F, -33.2434F, 18.5F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		SixSet5 = new ModelRenderer(this);
		SixSet5.setRotationPoint(-2.75F, -40.4725F, 27.3671F);
		PowerPanelControlLevers.addChild(SixSet5);


		cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(20.75F, 20.7424F, -68.4256F);
		SixSet5.addChild(cube_r95);
		setRotationAngle(cube_r95, -1.5708F, -1.3963F, 1.5708F);
		cube_r95.setTextureOffset(71, 153).addBox(63.7462F, -33.2434F, 20.25F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		SixSet6 = new ModelRenderer(this);
		SixSet6.setRotationPoint(-4.5F, -40.4725F, 27.3671F);
		PowerPanelControlLevers.addChild(SixSet6);


		cube_r96 = new ModelRenderer(this);
		cube_r96.setRotationPoint(22.5F, 20.7424F, -68.4256F);
		SixSet6.addChild(cube_r96);
		setRotationAngle(cube_r96, -1.5708F, -1.3963F, 1.5708F);
		cube_r96.setTextureOffset(12, 149).addBox(63.7462F, -33.2434F, 22.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);

		HelmicRegulatorPanel = new ModelRenderer(this);
		HelmicRegulatorPanel.setRotationPoint(0.0F, 0.0F, 0.0F);
		Controls.addChild(HelmicRegulatorPanel);
		setRotationAngle(HelmicRegulatorPanel, -3.1416F, 1.0472F, 3.1416F);


		cube_r97 = new ModelRenderer(this);
		cube_r97.setRotationPoint(0.0F, -39.0491F, -36.8095F);
		HelmicRegulatorPanel.addChild(cube_r97);
		setRotationAngle(cube_r97, -1.5708F, -1.2217F, 1.5708F);
		cube_r97.setTextureOffset(15, 4).addBox(52.75F, -27.5F, -5.75F, 2.0F, 1.0F, 0.0F, 0.0F, false);
		cube_r97.setTextureOffset(44, 17).addBox(53.25F, -26.5F, -5.75F, 1.0F, 2.0F, 0.0F, 0.0F, false);
		cube_r97.setTextureOffset(76, 182).addBox(51.5F, -25.5F, -5.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r97.setTextureOffset(0, 174).addBox(71.25F, -24.5F, -12.0F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r97.setTextureOffset(59, 175).addBox(71.25F, -25.0F, -17.25F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r97.setTextureOffset(95, 166).addBox(72.25F, -25.75F, -16.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r97.setTextureOffset(148, 166).addBox(68.25F, -25.75F, -14.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r97.setTextureOffset(156, 175).addBox(67.25F, -25.0F, -15.25F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r97.setTextureOffset(108, 80).addBox(67.25F, -26.75F, -14.25F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r97.setTextureOffset(59, 175).addBox(70.25F, -25.0F, 9.75F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r97.setTextureOffset(154, 166).addBox(71.25F, -25.75F, 10.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r97.setTextureOffset(59, 175).addBox(70.25F, -25.75F, 9.75F, 3.0F, 0.0F, 3.0F, 0.0F, false);
		cube_r97.setTextureOffset(118, 167).addBox(53.25F, -25.25F, 4.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r97.setTextureOffset(146, 110).addBox(52.25F, -26.25F, 4.75F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r97.setTextureOffset(59, 175).addBox(52.25F, -25.0F, 3.75F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r97.setTextureOffset(59, 175).addBox(52.25F, -25.0F, -7.25F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r97.setTextureOffset(68, 0).addBox(54.5F, -23.75F, -8.0F, 17.0F, 0.0F, 16.0F, 0.0F, false);
		cube_r97.setTextureOffset(68, 16).addBox(54.5F, -22.75F, -8.0F, 17.0F, 0.0F, 16.0F, 0.0F, false);
		cube_r97.setTextureOffset(145, 164).addBox(65.5F, -25.25F, 4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r98 = new ModelRenderer(this);
		cube_r98.setRotationPoint(15.75F, -38.834F, 40.5311F);
		HelmicRegulatorPanel.addChild(cube_r98);
		setRotationAngle(cube_r98, -2.7925F, 0.0F, -3.1416F);
		cube_r98.setTextureOffset(59, 182).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r98.setTextureOffset(0, 72).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		cube_r99 = new ModelRenderer(this);
		cube_r99.setRotationPoint(4.5F, -41.1427F, 29.1882F);
		HelmicRegulatorPanel.addChild(cube_r99);
		setRotationAngle(cube_r99, -1.5708F, -1.2217F, 1.5708F);
		cube_r99.setTextureOffset(145, 164).addBox(-0.5F, -0.75F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		GearHandle2 = new ModelRenderer(this);
		GearHandle2.setRotationPoint(-4.5F, -37.3839F, 32.8201F);
		HelmicRegulatorPanel.addChild(GearHandle2);


		gearhandlecube_r1 = new ModelRenderer(this);
		gearhandlecube_r1.setRotationPoint(0.0F, -0.9469F, 0.3868F);
		GearHandle2.addChild(gearhandlecube_r1);
		setRotationAngle(gearhandlecube_r1, -1.5708F, -1.2217F, 1.5708F);
		gearhandlecube_r1.setTextureOffset(146, 120).addBox(-0.5396F, -2.9779F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		GearHandle1 = new ModelRenderer(this);
		GearHandle1.setRotationPoint(4.5F, -41.9753F, 29.5554F);
		HelmicRegulatorPanel.addChild(GearHandle1);


		gearhandlecube_r2 = new ModelRenderer(this);
		gearhandlecube_r2.setRotationPoint(0.0F, 1.7988F, -0.8909F);
		GearHandle1.addChild(gearhandlecube_r2);
		setRotationAngle(gearhandlecube_r2, -1.5708F, -1.2217F, 1.5708F);
		gearhandlecube_r2.setTextureOffset(146, 120).addBox(-0.3384F, -2.8371F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		GearPlanes = new ModelRenderer(this);
		GearPlanes.setRotationPoint(0.0F, 0.0F, 0.0F);
		HelmicRegulatorPanel.addChild(GearPlanes);


		gearplanesmall_r1 = new ModelRenderer(this);
		gearplanesmall_r1.setRotationPoint(0.0F, -39.0491F, -36.8095F);
		GearPlanes.addChild(gearplanesmall_r1);
		setRotationAngle(gearplanesmall_r1, -1.5708F, -1.2217F, 1.5708F);
		gearplanesmall_r1.setTextureOffset(36, 22).addBox(59.5F, -23.0F, -6.0F, 3.0F, 0.0F, 3.0F, 0.0F, false);
		gearplanesmall_r1.setTextureOffset(25, 55).addBox(59.5F, -23.25F, -4.0F, 5.0F, 0.0F, 5.0F, 0.0F, false);
		gearplanesmall_r1.setTextureOffset(6, 66).addBox(60.5F, -23.25F, 2.75F, 4.0F, 0.0F, 4.0F, 0.0F, false);
		gearplanesmall_r1.setTextureOffset(6, 66).addBox(56.5F, -23.5F, -2.25F, 4.0F, 0.0F, 4.0F, 0.0F, false);
		gearplanesmall_r1.setTextureOffset(6, 66).addBox(66.75F, -23.5F, -3.5F, 4.0F, 0.0F, 4.0F, 0.0F, false);
		gearplanesmall_r1.setTextureOffset(25, 55).addBox(63.5F, -23.0F, -2.0F, 5.0F, 0.0F, 5.0F, 0.0F, false);
		gearplanesmall_r1.setTextureOffset(36, 22).addBox(57.5F, -23.25F, 1.0F, 3.0F, 0.0F, 3.0F, 0.0F, false);
		gearplanesmall_r1.setTextureOffset(36, 22).addBox(64.5F, -23.0F, -6.25F, 3.0F, 0.0F, 3.0F, 0.0F, false);
		gearplanesmall_r1.setTextureOffset(36, 22).addBox(64.5F, -23.25F, 3.0F, 3.0F, 0.0F, 3.0F, 0.0F, false);

		CommunicationsPanel = new ModelRenderer(this);
		CommunicationsPanel.setRotationPoint(0.0F, 0.0F, 0.0F);
		Controls.addChild(CommunicationsPanel);
		setRotationAngle(CommunicationsPanel, 0.0F, 1.0472F, 0.0F);


		cube_r100 = new ModelRenderer(this);
		cube_r100.setRotationPoint(0.0F, -39.0491F, -36.8095F);
		CommunicationsPanel.addChild(cube_r100);
		setRotationAngle(cube_r100, -1.5708F, -1.2217F, 1.5708F);
		cube_r100.setTextureOffset(108, 84).addBox(64.1F, -25.5F, 4.5F, 9.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r100.setTextureOffset(79, 166).addBox(65.0F, -24.5F, 2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(165, 152).addBox(62.5F, -24.5F, 2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(165, 135).addBox(63.75F, -24.5F, 2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(165, 131).addBox(67.5F, -24.5F, 2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(165, 125).addBox(66.25F, -24.5F, 2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(165, 115).addBox(68.75F, -24.5F, 2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(165, 113).addBox(70.0F, -24.5F, 2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(8, 165).addBox(71.25F, -24.5F, 2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(4, 165).addBox(72.5F, -24.5F, 2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(40, 94).addBox(71.25F, -24.25F, -10.9F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(0, 165).addBox(71.75F, -24.65F, -15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(145, 181).addBox(71.25F, -24.05F, -15.5F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r100.setTextureOffset(39, 3).addBox(71.25F, -24.25F, -13.3F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(97, 181).addBox(63.2F, -24.0F, -12.15F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r100.setTextureOffset(97, 173).addBox(67.2F, -24.5F, 9.05F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r100.setTextureOffset(177, 174).addBox(63.2F, -25.0F, 10.3F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r100.setTextureOffset(105, 153).addBox(71.95F, -24.0F, 7.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(118, 129).addBox(67.45F, -24.0F, 12.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(133, 107).addBox(68.95F, -24.0F, 12.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(133, 129).addBox(70.45F, -24.0F, 13.05F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(47, 140).addBox(71.95F, -24.0F, 13.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(106, 144).addBox(71.95F, -24.0F, 12.05F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(106, 147).addBox(71.95F, -24.0F, 10.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(24, 149).addBox(71.95F, -24.0F, 9.05F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(155, 0).addBox(69.95F, -24.0F, 7.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(154, 162).addBox(68.2F, -24.0F, 7.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(164, 142).addBox(66.45F, -24.0F, 7.55F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(42, 181).addBox(63.2F, -24.0F, 7.8F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r100.setTextureOffset(133, 181).addBox(63.2F, -24.0F, -9.95F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r100.setTextureOffset(185, 31).addBox(66.0F, -24.0F, -12.35F, 5.0F, 1.0F, 5.0F, 0.0F, false);
		cube_r100.setTextureOffset(39, 25).addBox(71.25F, -24.25F, -12.1F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(138, 153).addBox(71.25F, -24.25F, -9.7F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(69, 157).addBox(71.25F, -24.25F, -8.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(0, 125).addBox(57.75F, -25.25F, -3.9999F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(15, 125).addBox(60.75F, -25.25F, -5.2499F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(47, 118).addBox(54.25F, -25.25F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(87, 107).addBox(54.25F, -25.25F, -0.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(59, 103).addBox(54.25F, -25.25F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(177, 159).addBox(52.0F, -25.25F, 3.75F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r100.setTextureOffset(177, 163).addBox(52.0F, -25.25F, -1.25F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r100.setTextureOffset(177, 167).addBox(52.0F, -25.25F, -6.25F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r100.setTextureOffset(118, 107).addBox(54.25F, -25.25F, -5.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(75, 122).addBox(54.25F, -25.25F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(106, 122).addBox(54.25F, -25.25F, -2.75F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(28, 125).addBox(55.75F, -25.25F, -2.7499F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(59, 129).addBox(56.25F, -25.25F, -1.4999F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(74, 129).addBox(57.75F, -25.25F, -0.2499F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(87, 129).addBox(60.0F, -25.25F, 1.0001F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(0, 57).addBox(60.25F, -27.0F, 9.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(15, 103).addBox(58.25F, -25.0F, 9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(28, 103).addBox(56.25F, -25.0F, 9.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(112, 91).addBox(56.25F, -25.0F, 3.5F, 5.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r100.setTextureOffset(27, 144).addBox(55.75F, -24.5F, 3.0F, 6.0F, 1.0F, 5.0F, 0.0F, false);
		cube_r100.setTextureOffset(0, 61).addBox(55.75F, -24.75F, 1.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(84, 69).addBox(55.75F, -24.75F, -0.25F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(84, 86).addBox(55.75F, -24.75F, -1.5F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(31, 92).addBox(55.75F, -24.75F, -2.75F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(112, 42).addBox(55.75F, -24.75F, -4.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(85, 148).addBox(55.75F, -24.75F, -5.25F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r100.setTextureOffset(0, 86).addBox(62.5F, -24.5F, -6.5F, 11.0F, 1.0F, 9.0F, 0.0F, false);
		cube_r100.setTextureOffset(130, 0).addBox(62.5F, -24.5F, 4.0F, 11.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r101 = new ModelRenderer(this);
		cube_r101.setRotationPoint(0.0F, -39.0491F, -36.8095F);
		CommunicationsPanel.addChild(cube_r101);
		setRotationAngle(cube_r101, -1.5708F, -1.5708F, 1.5708F);
		cube_r101.setTextureOffset(18, 180).addBox(62.75F, -6.25F, -9.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r101.setTextureOffset(84, 32).addBox(63.25F, -7.25F, -8.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r101.setTextureOffset(156, 179).addBox(62.5F, -8.25F, -9.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r101.setTextureOffset(36, 180).addBox(62.5F, -4.25F, -9.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r101.setTextureOffset(118, 202).addBox(60.5F, -3.75F, -10.0F, 5.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(-5.25F, -44.3691F, 21.8012F);
		CommunicationsPanel.addChild(cube_r102);
		setRotationAngle(cube_r102, -1.5708F, -1.2217F, 1.5708F);
		cube_r102.setTextureOffset(44, 8).addBox(-0.2565F, -1.7048F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(-0.25F, -44.3691F, 21.8012F);
		CommunicationsPanel.addChild(cube_r103);
		setRotationAngle(cube_r103, -1.5708F, -1.2217F, 1.5708F);
		cube_r103.setTextureOffset(44, 6).addBox(-0.2565F, -1.7048F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(4.75F, -44.3691F, 21.8012F);
		CommunicationsPanel.addChild(cube_r104);
		setRotationAngle(cube_r104, -1.5708F, -1.2217F, 1.5708F);
		cube_r104.setTextureOffset(44, 4).addBox(-0.2565F, -1.7048F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(-5.25F, -44.7111F, 20.8615F);
		CommunicationsPanel.addChild(cube_r105);
		setRotationAngle(cube_r105, -1.5708F, -1.2217F, 1.5708F);
		cube_r105.setTextureOffset(44, 10).addBox(-0.2565F, -1.7048F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(-0.25F, -44.7111F, 20.8615F);
		CommunicationsPanel.addChild(cube_r106);
		setRotationAngle(cube_r106, -1.5708F, -1.2217F, 1.5708F);
		cube_r106.setTextureOffset(44, 12).addBox(-0.2565F, -1.7048F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(4.75F, -44.7111F, 20.8615F);
		CommunicationsPanel.addChild(cube_r107);
		setRotationAngle(cube_r107, -1.5708F, -1.2217F, 1.5708F);
		cube_r107.setTextureOffset(44, 14).addBox(-0.2565F, -1.7048F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);

		FlightPanel = new ModelRenderer(this);
		FlightPanel.setRotationPoint(0.0F, 0.0F, 0.0F);
		Controls.addChild(FlightPanel);


		Button = new ModelRenderer(this);
		Button.setRotationPoint(0.0F, -39.0491F, -36.8095F);
		FlightPanel.addChild(Button);


		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(0.0F, 0.0F, 0.0F);
		Button.addChild(cube_r108);
		setRotationAngle(cube_r108, -1.5708F, -1.2217F, 1.5708F);
		cube_r108.setTextureOffset(5, 178).addBox(63.5F, -25.7F, 2.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(59, 179).addBox(63.5F, -25.7F, -0.5F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(38, 83).addBox(63.5F, -25.7F, -3.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(158, 0).addBox(63.0F, -24.7F, 1.5F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r108.setTextureOffset(72, 119).addBox(65.0F, -24.7F, -4.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(127, 0).addBox(65.0F, -24.7F, 3.75F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(120, 71).addBox(62.75F, -24.7F, 3.75F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		cube_r108.setTextureOffset(120, 76).addBox(62.75F, -24.7F, -6.75F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		cube_r108.setTextureOffset(18, 172).addBox(63.0F, -24.7F, -3.5F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r108.setTextureOffset(36, 172).addBox(63.0F, -24.7F, -1.0F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r108.setTextureOffset(118, 192).addBox(68.0F, -24.45F, 8.0F, 5.0F, 2.0F, 8.0F, 0.0F, false);
		cube_r108.setTextureOffset(75, 240).addBox(59.5F, -24.45F, -12.0F, 5.0F, 2.0F, 3.0F, 0.0F, false);
		cube_r108.setTextureOffset(84, 74).addBox(62.5F, -24.45F, -7.0F, 5.0F, 2.0F, 14.0F, 0.0F, false);
		cube_r108.setTextureOffset(79, 157).addBox(72.75F, -24.7F, -4.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(46, 153).addBox(72.75F, -24.7F, -5.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(59, 126).addBox(74.25F, -24.7F, 4.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(28, 122).addBox(74.25F, -24.7F, 3.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(15, 122).addBox(72.75F, -24.7F, 4.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(0, 122).addBox(72.75F, -24.7F, 3.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(126, 91).addBox(74.25F, -24.7F, 1.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(126, 87).addBox(74.25F, -24.7F, 0.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(87, 126).addBox(72.75F, -24.7F, 1.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(74, 126).addBox(72.75F, -24.7F, 0.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(133, 104).addBox(72.75F, -24.7F, -1.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(118, 126).addBox(72.75F, -24.7F, -2.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(0, 153).addBox(74.25F, -24.7F, -1.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(133, 126).addBox(74.25F, -24.7F, -2.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(36, 153).addBox(74.25F, -24.7F, -4.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(10, 153).addBox(74.25F, -24.7F, -5.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(0, 159).addBox(70.0F, -24.7F, -4.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(105, 157).addBox(70.0F, -24.7F, -5.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(95, 157).addBox(71.5F, -24.7F, -4.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(89, 157).addBox(71.5F, -24.7F, -5.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(118, 159).addBox(70.0F, -24.7F, -1.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(69, 159).addBox(70.0F, -24.7F, -2.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(47, 159).addBox(71.5F, -24.7F, -1.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(10, 159).addBox(71.5F, -24.7F, -2.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(128, 162).addBox(70.0F, -24.7F, 1.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(118, 162).addBox(70.0F, -24.7F, 0.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(154, 159).addBox(71.5F, -24.7F, 1.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(128, 159).addBox(71.5F, -24.7F, 0.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(86, 163).addBox(71.5F, -24.7F, 4.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(79, 163).addBox(71.5F, -24.7F, 3.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(95, 163).addBox(70.0F, -24.7F, 3.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(138, 164).addBox(70.0F, -24.7F, 4.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r108.setTextureOffset(175, 61).addBox(67.75F, -24.7F, 0.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r108.setTextureOffset(133, 177).addBox(67.75F, -24.7F, -2.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r108.setTextureOffset(177, 143).addBox(67.75F, -24.7F, -5.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r108.setTextureOffset(145, 177).addBox(67.75F, -24.7F, 3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r108.setTextureOffset(84, 32).addBox(67.5F, -24.45F, -6.0F, 8.0F, 2.0F, 12.0F, 0.0F, false);

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(1.0F, 0.0F, 0.0F);
		Button.addChild(cube_r109);
		setRotationAngle(cube_r109, -1.5708F, -1.2217F, 1.5708F);
		cube_r109.setTextureOffset(185, 22).addBox(66.5F, -24.45F, -15.0F, 3.0F, 2.0F, 7.0F, 0.0F, false);
		cube_r109.setTextureOffset(195, 106).addBox(69.5F, -24.45F, -16.0F, 5.0F, 2.0F, 8.0F, 0.0F, false);

		FlightLeverSet = new ModelRenderer(this);
		FlightLeverSet.setRotationPoint(-0.12F, -43.6168F, 28.0147F);
		FlightPanel.addChild(FlightLeverSet);


		Fl1 = new ModelRenderer(this);
		Fl1.setRotationPoint(5.62F, 2.5F, -2.5F);
		FlightLeverSet.addChild(Fl1);
		setRotationAngle(Fl1, 0.0873F, 0.0F, 0.0F);


		cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(-5.62F, -3.25F, 0.75F);
		Fl1.addChild(cube_r110);
		setRotationAngle(cube_r110, -1.5708F, -1.3963F, 1.5708F);
		cube_r110.setTextureOffset(168, 87).addBox(-1.0F, -3.5F, -6.12F, 2.0F, 8.0F, 1.0F, 0.0F, false);

		Fl2 = new ModelRenderer(this);
		Fl2.setRotationPoint(-5.38F, 2.5F, -2.5F);
		FlightLeverSet.addChild(Fl2);
		setRotationAngle(Fl2, 0.0873F, 0.0F, 0.0F);


		cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(-5.62F, -3.25F, 0.75F);
		Fl2.addChild(cube_r111);
		setRotationAngle(cube_r111, -1.5708F, -1.3963F, 1.5708F);
		cube_r111.setTextureOffset(168, 11).addBox(-1.0F, -3.5F, -6.12F, 2.0F, 8.0F, 1.0F, 0.0F, false);

		Fl3 = new ModelRenderer(this);
		Fl3.setRotationPoint(-2.38F, 2.5F, -2.5F);
		FlightLeverSet.addChild(Fl3);
		setRotationAngle(Fl3, 0.0873F, 0.0F, 0.0F);


		cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(-5.62F, -3.25F, 0.75F);
		Fl3.addChild(cube_r112);
		setRotationAngle(cube_r112, -1.5708F, -1.3963F, 1.5708F);
		cube_r112.setTextureOffset(112, 32).addBox(-1.0F, -3.5F, -5.87F, 2.0F, 8.0F, 1.0F, 0.0F, false);

		Fl4 = new ModelRenderer(this);
		Fl4.setRotationPoint(2.62F, 2.5F, -2.5F);
		FlightLeverSet.addChild(Fl4);
		setRotationAngle(Fl4, 0.0873F, 0.0F, 0.0F);


		cube_r113 = new ModelRenderer(this);
		cube_r113.setRotationPoint(-5.62F, -3.25F, 0.75F);
		Fl4.addChild(cube_r113);
		setRotationAngle(cube_r113, -1.5708F, -1.3963F, 1.5708F);
		cube_r113.setTextureOffset(0, 86).addBox(-1.0F, -3.5F, -6.37F, 2.0F, 8.0F, 1.0F, 0.0F, false);

		Fl5 = new ModelRenderer(this);
		Fl5.setRotationPoint(0.12F, 2.5F, -2.5F);
		FlightLeverSet.addChild(Fl5);
		setRotationAngle(Fl5, 0.0873F, 0.0F, 0.0F);


		cube_r114 = new ModelRenderer(this);
		cube_r114.setRotationPoint(-5.62F, -3.25F, 0.75F);
		Fl5.addChild(cube_r114);
		setRotationAngle(cube_r114, -1.5708F, -1.3963F, 1.5708F);
		cube_r114.setTextureOffset(40, 50).addBox(-1.0F, -3.5F, -6.12F, 2.0F, 8.0F, 1.0F, 0.0F, false);

		Handbrake = new ModelRenderer(this);
		Handbrake.setRotationPoint(0.0F, 0.0F, 0.0F);
		FlightPanel.addChild(Handbrake);


		HandbrakeLever_r1 = new ModelRenderer(this);
		HandbrakeLever_r1.setRotationPoint(12.75F, -37.7411F, 38.271F);
		Handbrake.addChild(HandbrakeLever_r1);
		setRotationAngle(HandbrakeLever_r1, -2.7597F, -0.4084F, 2.9834F);
		HandbrakeLever_r1.setTextureOffset(0, 50).addBox(-0.5F, -1.75F, -0.25F, 1.0F, 1.0F, 6.0F, 0.0F, false);

		HandbrakeBase_r1 = new ModelRenderer(this);
		HandbrakeBase_r1.setRotationPoint(12.75F, -37.7411F, 38.271F);
		Handbrake.addChild(HandbrakeBase_r1);
		setRotationAngle(HandbrakeBase_r1, -1.5708F, -1.2217F, 1.5708F);
		HandbrakeBase_r1.setTextureOffset(91, 32).addBox(2.0F, -0.5F, 2.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		HandbrakeBase_r1.setTextureOffset(0, 100).addBox(0.5F, -0.5F, 2.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		HandbrakeBase_r1.setTextureOffset(28, 100).addBox(-2.5F, -0.5F, 2.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		HandbrakeBase_r1.setTextureOffset(59, 100).addBox(-3.75F, -0.5F, 1.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		HandbrakeBase_r1.setTextureOffset(87, 104).addBox(-3.75F, -0.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		HandbrakeBase_r1.setTextureOffset(118, 104).addBox(-3.75F, -0.5F, -2.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		HandbrakeBase_r1.setTextureOffset(145, 148).addBox(-2.0F, -1.0F, -3.0F, 5.0F, 2.0F, 5.0F, 0.0F, false);

		HandbrakeBase_r2 = new ModelRenderer(this);
		HandbrakeBase_r2.setRotationPoint(11.75F, -37.7411F, 38.271F);
		Handbrake.addChild(HandbrakeBase_r2);
		setRotationAngle(HandbrakeBase_r2, -1.5708F, -1.2217F, 1.5708F);
		HandbrakeBase_r2.setTextureOffset(15, 100).addBox(-1.0F, -0.5F, 1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		HandbrakeBase_r2.setTextureOffset(97, 62).addBox(-2.75F, -0.5F, 3.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		HandbrakeBase_r2.setTextureOffset(94, 80).addBox(-6.0F, -0.5F, -0.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		HandbrakeBase_r2.setTextureOffset(94, 74).addBox(-6.0F, -0.5F, 1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		HandbrakeBase_r2.setTextureOffset(92, 39).addBox(-4.5F, -0.5F, 3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		Throttle = new ModelRenderer(this);
		Throttle.setRotationPoint(0.0F, 0.0F, 0.0F);
		FlightPanel.addChild(Throttle);


		cube_r115 = new ModelRenderer(this);
		cube_r115.setRotationPoint(0.0F, -39.0491F, -36.8095F);
		Throttle.addChild(cube_r115);
		setRotationAngle(cube_r115, -1.5708F, -1.2217F, 1.5708F);
		cube_r115.setTextureOffset(177, 114).addBox(68.0F, -26.45F, 8.5F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r115.setTextureOffset(36, 164).addBox(68.0F, -26.45F, 14.5F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r115.setTextureOffset(91, 35).addBox(68.0F, -25.45F, 9.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r115.setTextureOffset(84, 65).addBox(68.0F, -25.45F, 13.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r115.setTextureOffset(97, 65).addBox(72.0F, -25.45F, 13.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r115.setTextureOffset(0, 103).addBox(72.0F, -25.45F, 9.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r115.setTextureOffset(59, 119).addBox(68.0F, -26.45F, 10.5F, 5.0F, 2.0F, 3.0F, 0.0F, false);

		ThrottleLever = new ModelRenderer(this);
		ThrottleLever.setRotationPoint(-10.0F, -38.0F, 38.0F);
		Throttle.addChild(ThrottleLever);
		setRotationAngle(ThrottleLever, 1.1345F, 0.0F, 0.0F);


		cube_r116 = new ModelRenderer(this);
		cube_r116.setRotationPoint(0.0F, -0.8518F, 0.1432F);
		ThrottleLever.addChild(cube_r116);
		setRotationAngle(cube_r116, -1.5708F, -1.2217F, 1.5708F);
		cube_r116.setTextureOffset(15, 22).addBox(-0.5F, -6.0F, 4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r116.setTextureOffset(175, 29).addBox(-0.5F, -7.0F, 2.3F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r116.setTextureOffset(175, 54).addBox(-0.5F, -7.0F, -1.3F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r116.setTextureOffset(0, 22).addBox(-0.5F, -6.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r116.setTextureOffset(24, 0).addBox(-0.5F, -3.0F, 3.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		cube_r116.setTextureOffset(24, 22).addBox(-0.5F, -3.0F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		MonitorPanel = new ModelRenderer(this);
		MonitorPanel.setRotationPoint(0.0F, 0.0F, 0.0F);
		Controls.addChild(MonitorPanel);
		setRotationAngle(MonitorPanel, -3.1416F, -1.0472F, 3.1416F);


		cube_r117 = new ModelRenderer(this);
		cube_r117.setRotationPoint(0.0F, -39.0491F, -36.8095F);
		MonitorPanel.addChild(cube_r117);
		setRotationAngle(cube_r117, -1.5708F, 1.2217F, -1.5708F);
		cube_r117.setTextureOffset(198, 94).addBox(-74.5F, -24.5F, -17.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		cube_r117.setTextureOffset(102, 126).addBox(-70.0F, -24.5F, -13.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r117.setTextureOffset(84, 80).addBox(-53.75F, -25.25F, 2.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r117.setTextureOffset(31, 86).addBox(-53.75F, -25.25F, 3.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r117.setTextureOffset(41, 86).addBox(-53.75F, -25.25F, 4.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r117.setTextureOffset(177, 106).addBox(-54.75F, -24.5F, -6.0F, 3.0F, 2.0F, 12.0F, 0.0F, false);
		cube_r117.setTextureOffset(161, 159).addBox(-73.5F, -24.5F, -11.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r117.setTextureOffset(160, 148).addBox(-74.5F, -24.5F, -8.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r118 = new ModelRenderer(this);
		cube_r118.setRotationPoint(0.0F, -39.0491F, -36.8095F);
		MonitorPanel.addChild(cube_r118);
		setRotationAngle(cube_r118, -1.5708F, -1.2217F, 1.5708F);
		cube_r118.setTextureOffset(84, 74).addBox(52.75F, -25.25F, 4.75F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r118.setTextureOffset(84, 62).addBox(52.75F, -25.25F, 3.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r118.setTextureOffset(43, 100).addBox(52.25F, -25.25F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r118.setTextureOffset(84, 39).addBox(52.75F, -25.25F, 2.25F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r118.setTextureOffset(102, 163).addBox(68.0F, -24.5F, -13.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r118.setTextureOffset(161, 166).addBox(71.5F, -24.5F, -11.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r118.setTextureOffset(175, 22).addBox(72.5F, -24.5F, -8.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		cube_r118.setTextureOffset(0, 238).addBox(70.5F, -24.5F, -17.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r119 = new ModelRenderer(this);
		cube_r119.setRotationPoint(0.0F, -38.0491F, -35.3095F);
		MonitorPanel.addChild(cube_r119);
		setRotationAngle(cube_r119, -1.5708F, 1.2217F, -1.5708F);
		cube_r119.setTextureOffset(102, 104).addBox(-54.25F, -25.5F, -9.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		cube_r120 = new ModelRenderer(this);
		cube_r120.setRotationPoint(0.0F, -38.0491F, -35.3095F);
		MonitorPanel.addChild(cube_r120);
		setRotationAngle(cube_r120, -1.5708F, -1.2217F, 1.5708F);
		cube_r120.setTextureOffset(43, 122).addBox(52.25F, -25.5F, -8.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
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

	@Override
	public void render(VToyotaConsoleTile vToyotaConsoleTile, float v, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v1, float v2, float v3, float v4) {
/*
		RandomiserControl randomiserControl = tile.getControl(RandomiserControl.class);
		this.bone91.rotateAngleY = (float) Math.toRadians(randomiserControl.getAnimationProgress() * 720.0F );

		HandbrakeControl handbrake = tile.getControl(HandbrakeControl.class);
		if (!handbrake.isFree()) {
			Lev3.rotateAngleX = (float) (Math.toRadians(-30f));
		} else {
			Lev3.rotateAngleX = (float) (Math.toRadians(30f));
		}

		RefuelerControl refuelerControl = tile.getControl(RefuelerControl.class);
		if (refuelerControl.isRefueling()) {
			Lev2.rotateAngleX = (float) (Math.toRadians(20));
		} else {
			Lev2.rotateAngleX = (float) (Math.toRadians(-20));
		}

		LandingTypeControl landingTypeControl = tile.getControl(LandingTypeControl.class);


       tile.getSubsystem(StabilizerSubsystem.class).ifPresent(sys ->{
       			if (sys.isActivated()) {
       				Pump4.rotateAngleY = -0.1355F;
       				Pump4.rotateAngleZ = -0.035F;
				} else{
       				Pump4.rotateAngleY = -0.0F;
       				Pump4.rotateAngleZ = -0.0F;
       			} System.out.println(sys.isActivated());
       		}
       );

		net.tardis.mod.controls.RandomiserControl random = tile.getControl(RandomiserControl.class);
		float randomOff = random.getAnimationTicks() == 0 ? 0 : 0.006F;



		ThrottleControl throttleA = tile.getControl(ThrottleControl.class);
		this.Handle.rotateAngleX = 1F + throttleA.getAmount() * 60;
		tile.getDoor().ifPresent(door -> {
			this.DoorControlLever.rotateAngleX = (float) Math.toRadians(door.getOpenState() == EnumDoorState.CLOSED ? 30F : 0F);
		});

		IncModControl inc = tile.getControl(IncModControl.class);
		this.Handle2.rotateAngleZ = (float) Math.toRadians(((inc.index / (float)IncModControl.COORD_MODS.length) * -180f) - 20f);

		XControl x = tile.getControl(XControl.class);


		YControl y = tile.getControl(YControl.class);


		ZControl z = tile.getControl(ZControl.class);

		*/
		ConsoleUnit.render(matrixStack, iVertexBuilder, i, i1);
		Controls.render(matrixStack,iVertexBuilder,i,i1);
		matrixStack.push();

		matrixStack.translate(-1.3, 0.555, -0.68);
		matrixStack.rotate(Vector3f.YP.rotationDegrees(1));
		matrixStack.rotate(Vector3f.XP.rotationDegrees(0.8F));
		matrixStack.rotate(Vector3f.ZP.rotationDegrees(0));

		//TODO Find out wtf this below is
		//WorldText text = new WorldText(0.22F, 0.15F, 0.002F, 0xFFFFFF);
		//text.renderMonitor(Helper.getConsoleText(tile));

		matrixStack.scale(0.4F, 0.3F, 0.4F); //Size of sonic in port
		matrixStack.translate(1.1, -1.2, 2.55); //Location XYZ
		matrixStack.rotate(Vector3f.YP.rotationDegrees(0));
		matrixStack.rotate(Vector3f.XP.rotationDegrees(0F));
		matrixStack.rotate(Vector3f.ZP.rotationDegrees(0.5F));
		matrixStack.pop();
	}

	public void render(VToyotaConsoleTile tileEntityIn, float v, MatrixStack matrixStackIn, IVertexBuilder ivertexbuilder, int combinedLightIn, int combinedOverlayIn) {
	}
}