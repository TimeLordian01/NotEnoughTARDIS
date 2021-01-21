package com.thevale.moretimecapsulesmod.client.models.consoles;// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.moretimecapsulesmod.tileentities.consoles.ValeConsoleTile;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.client.models.TileModel;
import net.tardis.mod.controls.*;
import net.tardis.mod.enums.EnumDoorState;

public class ValeConsoleModel extends EntityModel<Entity> implements TileModel<ValeConsoleTile> {
	private final ModelRenderer MainBase;
	private final ModelRenderer SwivelLevers;
	private final ModelRenderer facingcontrol;
	private final ModelRenderer SwivelLever7;
	private final ModelRenderer bone4;
	private final ModelRenderer SwivelLever4;
	private final ModelRenderer SwivelLever2;
	private final ModelRenderer SwivelLever3;
	private final ModelRenderer RandomiserControl;
	private final ModelRenderer SwivelLever5;
	private final ModelRenderer SwivelLever6;
	private final ModelRenderer SwivelLever8;
	private final ModelRenderer SwivelLever9;
	private final ModelRenderer Switches4;
	private final ModelRenderer Base20;
	private final ModelRenderer landingtype;
	private final ModelRenderer Base21;
	private final ModelRenderer Switches3;
	private final ModelRenderer Base14;
	private final ModelRenderer Switch13;
	private final ModelRenderer Base16;
	private final ModelRenderer Switch15;
	private final ModelRenderer Base17;
	private final ModelRenderer Switch16;
	private final ModelRenderer Base15;
	private final ModelRenderer Switch14;
	private final ModelRenderer RadBox;
	private final ModelRenderer Box;
	private final ModelRenderer Base12;
	private final ModelRenderer Box2;
	private final ModelRenderer Base13;
	private final ModelRenderer bone5;
	private final ModelRenderer TMControls;
	private final ModelRenderer HandbrakeAll;
	private final ModelRenderer Base;
	private final ModelRenderer handbrakelever;
	private final ModelRenderer ThrottleAll;
	private final ModelRenderer Base2;
	private final ModelRenderer throttle;
	private final ModelRenderer verticallanding3;
	private final ModelRenderer Base3;
	private final ModelRenderer DoorSwitch;
	private final ModelRenderer Base4;
	private final ModelRenderer doorcontrol;
	private final ModelRenderer Controls26;
	private final ModelRenderer Indicators;
	private final ModelRenderer Base5;
	private final ModelRenderer Switches;
	private final ModelRenderer Base6;
	private final ModelRenderer Switch;
	private final ModelRenderer Switch2;
	private final ModelRenderer Switch3;
	private final ModelRenderer Switch4;
	private final ModelRenderer Switch5;
	private final ModelRenderer Switch6;
	private final ModelRenderer Switches2;
	private final ModelRenderer Base8;
	private final ModelRenderer refuel;
	private final ModelRenderer Switch8;
	private final ModelRenderer refuel2;
	private final ModelRenderer Switch10;
	private final ModelRenderer Switch11;
	private final ModelRenderer refuel3;
	private final ModelRenderer SpeakersLightsGrates;
	private final ModelRenderer Base7;
	private final ModelRenderer SpeakersLightsGrates2;
	private final ModelRenderer Base11;
	private final ModelRenderer RedBall2;
	private final ModelRenderer Base10;
	private final ModelRenderer RedBall;
	private final ModelRenderer Base9;
	private final ModelRenderer TimeRotor;
	private final ModelRenderer Centre;
	private final ModelRenderer Ring;
	private final ModelRenderer bone;
	private final ModelRenderer an;
	private final ModelRenderer an4;
	private final ModelRenderer an5;
	private final ModelRenderer an6;
	private final ModelRenderer an7;
	private final ModelRenderer an10;
	private final ModelRenderer an11;
	private final ModelRenderer an12;
	private final ModelRenderer Ring3;
	private final ModelRenderer bone3;
	private final ModelRenderer an2;
	private final ModelRenderer an3;
	private final ModelRenderer an8;
	private final ModelRenderer an9;
	private final ModelRenderer an13;
	private final ModelRenderer an14;
	private final ModelRenderer an19;
	private final ModelRenderer an20;
	private final ModelRenderer Ring2;
	private final ModelRenderer bone2;
	private final ModelRenderer an15;
	private final ModelRenderer an16;
	private final ModelRenderer an17;
	private final ModelRenderer an18;
	private final ModelRenderer an21;
	private final ModelRenderer an22;
	private final ModelRenderer an23;
	private final ModelRenderer an24;
	private final ModelRenderer Panelstands;
	private final ModelRenderer Stand;
	private final ModelRenderer Dividers;
	private final ModelRenderer r1;
	private final ModelRenderer Panel1;
	private final ModelRenderer Panel2;
	private final ModelRenderer r2;
	private final ModelRenderer Panel3;
	private final ModelRenderer Panel4;
	private final ModelRenderer r3;
	private final ModelRenderer Panel5;
	private final ModelRenderer Panel6;
	private final ModelRenderer r4;
	private final ModelRenderer Panel7;
	private final ModelRenderer Panel8;
	private final ModelRenderer r5;
	private final ModelRenderer Panel9;
	private final ModelRenderer Panel10;
	private final ModelRenderer r6;
	private final ModelRenderer Panel11;
	private final ModelRenderer Panel12;
	private final ModelRenderer Edgeing;
	private final ModelRenderer p1;
	private final ModelRenderer p2;
	private final ModelRenderer p3;
	private final ModelRenderer InnerStandPanels;
	private final ModelRenderer BaseSlants;
	private final ModelRenderer r7;
	private final ModelRenderer Slant;
	private final ModelRenderer r8;
	private final ModelRenderer Slant2;
	private final ModelRenderer r9;
	private final ModelRenderer Slant3;
	private final ModelRenderer r10;
	private final ModelRenderer Slant4;
	private final ModelRenderer r11;
	private final ModelRenderer Slant5;
	private final ModelRenderer r12;
	private final ModelRenderer Slant6;
	private final ModelRenderer Panels;
	private final ModelRenderer Undercarrage;
	private final ModelRenderer Rot0;
	private final ModelRenderer Rot60;
	private final ModelRenderer Rot120;
	private final ModelRenderer PanelDividers;
	private final ModelRenderer r0;
	private final ModelRenderer Slant7;
	private final ModelRenderer r60;
	private final ModelRenderer Slant8;
	private final ModelRenderer r120;
	private final ModelRenderer Slant9;
	private final ModelRenderer r180;
	private final ModelRenderer Slant10;
	private final ModelRenderer r_120;
	private final ModelRenderer Slant11;
	private final ModelRenderer r_60;
	private final ModelRenderer Slant12;
	private final ModelRenderer CPanel1;
	private final ModelRenderer Main;
	private final ModelRenderer CPanel2;
	private final ModelRenderer Main2;
	private final ModelRenderer CPanel3;
	private final ModelRenderer Main3;
	private final ModelRenderer CPanel4;
	private final ModelRenderer Main4;
	private final ModelRenderer CPanel5;
	private final ModelRenderer Main5;
	private final ModelRenderer CPanel6;
	private final ModelRenderer Main6;

	public ValeConsoleModel() {
		textureWidth = 256;
		textureHeight = 256;

		MainBase = new ModelRenderer(this);
		MainBase.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		SwivelLevers = new ModelRenderer(this);
		SwivelLevers.setRotationPoint(0.0F, 0.0F, 0.0F);
		MainBase.addChild(SwivelLevers);
		

		facingcontrol = new ModelRenderer(this);
		facingcontrol.setRotationPoint(-12.625F, -12.5F, -1.5F);
		SwivelLevers.addChild(facingcontrol);
		setRotationAngle(facingcontrol, 0.0F, 1.0472F, 0.0F);
		facingcontrol.setTextureOffset(198, 140).addBox(-0.4865F, -1.4375F, -1.5039F, 1.0F, 1.0F, 2.0F, -0.375F, false);
		facingcontrol.setTextureOffset(203, 200).addBox(-0.4865F, -1.4375F, -0.5039F, 1.0F, 1.0F, 1.0F, -0.25F, false);

		SwivelLever7 = new ModelRenderer(this);
		SwivelLever7.setRotationPoint(0.0F, -1.0F, 0.0F);
		SwivelLevers.addChild(SwivelLever7);
		setRotationAngle(SwivelLever7, 0.0F, 1.0472F, 0.0F);
		SwivelLever7.setTextureOffset(198, 140).addBox(-4.5F, -12.9375F, -13.1875F, 1.0F, 1.0F, 2.0F, -0.375F, false);
		SwivelLever7.setTextureOffset(203, 200).addBox(-4.5F, -12.9375F, -12.1875F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		SwivelLever7.setTextureOffset(211, 118).addBox(-5.0F, -12.875F, -12.6875F, 2.0F, 2.0F, 2.0F, -0.6875F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-0.049F, -11.5F, -2.8164F);
		SwivelLever7.addChild(bone4);
		setRotationAngle(bone4, 0.0F, -1.5708F, 0.0F);
		bone4.setTextureOffset(211, 118).addBox(-9.875F, -1.375F, 3.9375F, 2.0F, 2.0F, 2.0F, -0.6875F, false);

		SwivelLever4 = new ModelRenderer(this);
		SwivelLever4.setRotationPoint(0.0F, -1.0F, 0.0F);
		SwivelLevers.addChild(SwivelLever4);
		setRotationAngle(SwivelLever4, 0.0F, 2.0944F, 0.0F);
		SwivelLever4.setTextureOffset(198, 140).addBox(-5.5F, -13.0F, -13.1875F, 1.0F, 1.0F, 2.0F, -0.375F, false);
		SwivelLever4.setTextureOffset(203, 200).addBox(-5.5F, -12.9375F, -12.1875F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		SwivelLever4.setTextureOffset(211, 118).addBox(-6.0F, -12.875F, -12.6875F, 2.0F, 2.0F, 2.0F, -0.6875F, false);

		SwivelLever2 = new ModelRenderer(this);
		SwivelLever2.setRotationPoint(0.0F, -1.0F, 0.0F);
		SwivelLevers.addChild(SwivelLever2);
		setRotationAngle(SwivelLever2, 0.0F, 2.0944F, 0.0F);
		SwivelLever2.setTextureOffset(198, 140).addBox(-4.625F, -13.25F, -12.8125F, 1.0F, 1.0F, 2.0F, -0.375F, false);
		SwivelLever2.setTextureOffset(203, 200).addBox(-4.625F, -13.1875F, -11.8125F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		SwivelLever2.setTextureOffset(211, 118).addBox(-5.125F, -13.125F, -12.3125F, 2.0F, 2.0F, 2.0F, -0.6875F, false);

		SwivelLever3 = new ModelRenderer(this);
		SwivelLever3.setRotationPoint(0.0F, -1.0F, 0.0F);
		SwivelLevers.addChild(SwivelLever3);
		setRotationAngle(SwivelLever3, 0.0F, 1.0472F, 0.0F);
		SwivelLever3.setTextureOffset(211, 118).addBox(-1.0F, -14.125F, -10.1875F, 2.0F, 2.0F, 2.0F, -0.6875F, false);

		RandomiserControl = new ModelRenderer(this);
		RandomiserControl.setRotationPoint(0.0F, -13.6875F, -9.1875F);
		SwivelLever3.addChild(RandomiserControl);
		setRotationAngle(RandomiserControl, 0.0F, 0.829F, 0.0F);
		RandomiserControl.setTextureOffset(198, 140).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 2.0F, -0.375F, false);
		RandomiserControl.setTextureOffset(203, 200).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.25F, false);

		SwivelLever5 = new ModelRenderer(this);
		SwivelLever5.setRotationPoint(0.0F, -1.0F, 0.0F);
		SwivelLevers.addChild(SwivelLever5);
		setRotationAngle(SwivelLever5, 0.0F, 2.0944F, 0.0F);
		SwivelLever5.setTextureOffset(198, 140).addBox(-1.0F, -14.25F, -10.5625F, 1.0F, 1.0F, 2.0F, -0.375F, false);
		SwivelLever5.setTextureOffset(203, 200).addBox(-1.0F, -14.1875F, -9.5625F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		SwivelLever5.setTextureOffset(211, 118).addBox(-1.5F, -14.125F, -10.0625F, 2.0F, 2.0F, 2.0F, -0.6875F, false);

		SwivelLever6 = new ModelRenderer(this);
		SwivelLever6.setRotationPoint(0.0F, -1.0F, 0.0F);
		SwivelLevers.addChild(SwivelLever6);
		setRotationAngle(SwivelLever6, 0.0F, 2.0944F, 0.0F);
		SwivelLever6.setTextureOffset(198, 140).addBox(0.0F, -14.25F, -10.5625F, 1.0F, 1.0F, 2.0F, -0.375F, false);
		SwivelLever6.setTextureOffset(203, 200).addBox(0.0F, -14.1875F, -9.5625F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		SwivelLever6.setTextureOffset(211, 118).addBox(-0.5F, -14.125F, -10.0625F, 2.0F, 2.0F, 2.0F, -0.6875F, false);

		SwivelLever8 = new ModelRenderer(this);
		SwivelLever8.setRotationPoint(0.0F, -1.0F, 0.0F);
		SwivelLevers.addChild(SwivelLever8);
		setRotationAngle(SwivelLever8, 0.0F, -1.0472F, 0.0F);
		SwivelLever8.setTextureOffset(198, 140).addBox(2.0F, -13.75F, -12.0625F, 1.0F, 1.0F, 2.0F, -0.375F, false);
		SwivelLever8.setTextureOffset(198, 140).addBox(-3.0F, -13.75F, -12.0625F, 1.0F, 1.0F, 2.0F, -0.375F, false);
		SwivelLever8.setTextureOffset(203, 200).addBox(2.0F, -13.6875F, -11.0625F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		SwivelLever8.setTextureOffset(203, 200).addBox(-3.0F, -13.6875F, -11.0625F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		SwivelLever8.setTextureOffset(209, 112).addBox(1.5F, -13.625F, -11.5625F, 2.0F, 2.0F, 2.0F, -0.6875F, false);

		SwivelLever9 = new ModelRenderer(this);
		SwivelLever9.setRotationPoint(0.0F, -1.0F, 0.0F);
		SwivelLevers.addChild(SwivelLever9);
		setRotationAngle(SwivelLever9, 0.0F, -1.0472F, 0.0F);
		SwivelLever9.setTextureOffset(209, 112).addBox(-3.5F, -13.625F, -11.5625F, 2.0F, 2.0F, 2.0F, -0.6875F, false);

		Switches4 = new ModelRenderer(this);
		Switches4.setRotationPoint(0.0F, 0.0F, 0.0F);
		MainBase.addChild(Switches4);
		setRotationAngle(Switches4, 0.0F, 1.0472F, 0.0F);
		

		Base20 = new ModelRenderer(this);
		Base20.setRotationPoint(7.5625F, -12.5F, -13.0F);
		Switches4.addChild(Base20);
		setRotationAngle(Base20, 0.4538F, 0.0F, 0.0F);
		Base20.setTextureOffset(196, 95).addBox(-10.3125F, 0.1875F, 3.6875F, 0.0F, 1.0F, 1.0F, 0.1875F, false);
		Base20.setTextureOffset(187, 101).addBox(-6.0625F, -0.4375F, 1.75F, 2.0F, 1.0F, 2.0F, -0.5625F, false);
		Base20.setTextureOffset(187, 101).addBox(-8.5625F, -0.4375F, 1.75F, 2.0F, 1.0F, 2.0F, -0.5625F, false);
		Base20.setTextureOffset(187, 101).addBox(-9.5625F, -0.4375F, 3.125F, 2.0F, 1.0F, 2.0F, -0.5625F, false);
		Base20.setTextureOffset(187, 101).addBox(-7.5625F, -0.4375F, 3.125F, 2.0F, 1.0F, 2.0F, -0.5625F, false);
		Base20.setTextureOffset(187, 101).addBox(-11.0625F, -0.4375F, 1.75F, 2.0F, 1.0F, 2.0F, -0.5625F, false);
		Base20.setTextureOffset(193, 229).addBox(-5.5625F, -0.1875F, 2.25F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		Base20.setTextureOffset(195, 226).addBox(-8.0625F, -0.1875F, 2.25F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		Base20.setTextureOffset(193, 229).addBox(-9.0625F, -0.1875F, 3.625F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		Base20.setTextureOffset(201, 239).addBox(-7.0625F, -0.1875F, 3.625F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		Base20.setTextureOffset(201, 239).addBox(-10.5625F, -0.1875F, 2.25F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		Base20.setTextureOffset(224, 111).addBox(-9.5625F, -0.375F, 5.0625F, 4.0F, 1.0F, 2.0F, -0.4375F, false);
		Base20.setTextureOffset(184, 107).addBox(-9.5625F, -0.375F, 0.3125F, 4.0F, 1.0F, 2.0F, -0.4375F, false);
		Base20.setTextureOffset(183, 151).addBox(-5.5625F, -0.375F, 0.3125F, 2.0F, 1.0F, 2.0F, -0.4375F, false);
		Base20.setTextureOffset(196, 150).addBox(-11.3125F, -1.0F, 2.6875F, 2.0F, 3.0F, 3.0F, -0.875F, false);

		landingtype = new ModelRenderer(this);
		landingtype.setRotationPoint(-10.3125F, 0.125F, 4.1875F);
		Base20.addChild(landingtype);
		setRotationAngle(landingtype, 0.7854F, 0.0F, 0.0F);
		landingtype.setTextureOffset(193, 95).addBox(-1.0F, -1.75F, -1.0F, 2.0F, 3.0F, 2.0F, -0.9375F, false);
		landingtype.setTextureOffset(127, 222).addBox(-1.0F, -1.75F, -1.0F, 2.0F, 2.0F, 2.0F, -0.875F, false);

		Base21 = new ModelRenderer(this);
		Base21.setRotationPoint(7.5625F, -12.5F, -13.0F);
		Switches4.addChild(Base21);
		setRotationAngle(Base21, 0.4538F, 0.0F, 0.0F);
		Base21.setTextureOffset(224, 111).addBox(-3.4375F, 0.1875F, 2.1875F, 0.0F, 1.0F, 1.0F, 0.1875F, false);
		Base21.setTextureOffset(224, 111).addBox(-3.9375F, 0.1875F, 2.1875F, 0.0F, 1.0F, 1.0F, 0.1875F, false);
		Base21.setTextureOffset(224, 111).addBox(-2.9375F, 0.1875F, 2.1875F, 0.0F, 1.0F, 1.0F, 0.1875F, false);
		Base21.setTextureOffset(61, 222).addBox(-4.4375F, -1.0F, 1.1875F, 2.0F, 3.0F, 3.0F, -0.875F, false);
		Base21.setTextureOffset(61, 222).addBox(-4.9375F, -1.0F, 1.1875F, 2.0F, 3.0F, 3.0F, -0.875F, false);
		Base21.setTextureOffset(61, 222).addBox(-3.9375F, -1.0F, 1.1875F, 2.0F, 3.0F, 3.0F, -0.875F, false);

		Switches3 = new ModelRenderer(this);
		Switches3.setRotationPoint(0.0F, 0.0F, 0.0F);
		MainBase.addChild(Switches3);
		setRotationAngle(Switches3, 0.0F, 2.0944F, 0.0F);
		

		Base14 = new ModelRenderer(this);
		Base14.setRotationPoint(7.5625F, -12.5F, -13.0F);
		Switches3.addChild(Base14);
		setRotationAngle(Base14, 0.4538F, 0.0F, 0.0F);
		Base14.setTextureOffset(207, 120).addBox(-9.625F, 0.1875F, 1.1875F, 0.0F, 1.0F, 1.0F, 0.1875F, false);
		Base14.setTextureOffset(174, 149).addBox(-10.625F, -1.0F, 0.1875F, 2.0F, 3.0F, 3.0F, -0.875F, false);

		Switch13 = new ModelRenderer(this);
		Switch13.setRotationPoint(-9.625F, -0.375F, 3.1875F);
		Base14.addChild(Switch13);
		Switch13.setTextureOffset(179, 108).addBox(-1.0F, -1.25F, -2.5F, 2.0F, 3.0F, 2.0F, -0.9375F, false);
		Switch13.setTextureOffset(132, 226).addBox(-1.0F, -1.25F, -2.5F, 2.0F, 2.0F, 2.0F, -0.875F, false);

		Base16 = new ModelRenderer(this);
		Base16.setRotationPoint(7.5625F, -12.5F, -13.0F);
		Switches3.addChild(Base16);
		setRotationAngle(Base16, 0.4538F, 0.0F, 0.0F);
		Base16.setTextureOffset(207, 120).addBox(-9.625F, 0.1875F, 2.6875F, 0.0F, 1.0F, 1.0F, 0.1875F, false);
		Base16.setTextureOffset(174, 149).addBox(-10.625F, -1.0F, 1.6875F, 2.0F, 3.0F, 3.0F, -0.875F, false);

		Switch15 = new ModelRenderer(this);
		Switch15.setRotationPoint(-9.625F, -0.375F, 3.1875F);
		Base16.addChild(Switch15);
		Switch15.setTextureOffset(179, 108).addBox(-1.0F, -1.25F, -1.0F, 2.0F, 3.0F, 2.0F, -0.9375F, false);
		Switch15.setTextureOffset(132, 226).addBox(-1.0F, -1.25F, -1.0F, 2.0F, 2.0F, 2.0F, -0.875F, false);

		Base17 = new ModelRenderer(this);
		Base17.setRotationPoint(7.5625F, -12.5F, -13.0F);
		Switches3.addChild(Base17);
		setRotationAngle(Base17, 0.4538F, 0.0F, 0.0F);
		Base17.setTextureOffset(207, 120).addBox(-9.625F, 0.1875F, 4.1875F, 0.0F, 1.0F, 1.0F, 0.1875F, false);
		Base17.setTextureOffset(207, 113).addBox(-11.125F, -0.0625F, 4.1875F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		Base17.setTextureOffset(207, 113).addBox(-11.125F, -0.0625F, 2.6875F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		Base17.setTextureOffset(207, 113).addBox(-11.125F, -0.0625F, 1.1875F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		Base17.setTextureOffset(167, 105).addBox(-10.5F, -0.4375F, 0.5625F, 1.0F, 1.0F, 5.0F, -0.4375F, false);
		Base17.setTextureOffset(167, 105).addBox(-11.75F, -0.4375F, 0.5625F, 1.0F, 1.0F, 5.0F, -0.4375F, false);
		Base17.setTextureOffset(211, 116).addBox(-12.75F, -0.25F, 2.5625F, 2.0F, 1.0F, 2.0F, -0.6875F, false);
		Base17.setTextureOffset(117, 234).addBox(-6.75F, 0.0F, 1.1875F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		Base17.setTextureOffset(188, 100).addBox(-7.25F, -0.375F, 1.75F, 2.0F, 1.0F, 2.0F, -0.5625F, false);
		Base17.setTextureOffset(185, 241).addBox(-6.75F, -0.125F, 2.25F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		Base17.setTextureOffset(208, 108).addBox(-9.25F, -0.25F, 0.5625F, 3.0F, 1.0F, 4.0F, -0.6875F, false);
		Base17.setTextureOffset(157, 103).addBox(-9.5625F, -0.25F, 4.0625F, 4.0F, 1.0F, 3.0F, -0.6875F, false);
		Base17.setTextureOffset(68, 228).addBox(-6.5625F, -0.25F, 3.5F, 3.0F, 1.0F, 3.0F, -0.6875F, false);
		Base17.setTextureOffset(189, 104).addBox(-6.25F, -0.25F, 0.5625F, 3.0F, 1.0F, 4.0F, -0.6875F, false);
		Base17.setTextureOffset(174, 149).addBox(-10.625F, -1.0F, 3.1875F, 2.0F, 3.0F, 3.0F, -0.875F, false);
		Base17.setTextureOffset(185, 241).addBox(-12.125F, -1.25F, 3.1875F, 3.0F, 3.0F, 3.0F, -1.125F, false);
		Base17.setTextureOffset(185, 241).addBox(-12.125F, -1.25F, 1.6875F, 3.0F, 3.0F, 3.0F, -1.125F, false);
		Base17.setTextureOffset(185, 241).addBox(-12.125F, -1.25F, 0.1875F, 3.0F, 3.0F, 3.0F, -1.125F, false);

		Switch16 = new ModelRenderer(this);
		Switch16.setRotationPoint(-9.625F, -0.375F, 3.1875F);
		Base17.addChild(Switch16);
		Switch16.setTextureOffset(179, 108).addBox(-1.0F, -1.25F, 0.5F, 2.0F, 3.0F, 2.0F, -0.9375F, false);
		Switch16.setTextureOffset(132, 226).addBox(-1.0F, -1.25F, 0.5F, 2.0F, 2.0F, 2.0F, -0.875F, false);

		Base15 = new ModelRenderer(this);
		Base15.setRotationPoint(7.5625F, -12.5F, -13.0F);
		Switches3.addChild(Base15);
		setRotationAngle(Base15, 0.4538F, 0.0F, 0.0F);
		Base15.setTextureOffset(207, 120).addBox(-9.1875F, 0.1875F, 1.1875F, 0.0F, 1.0F, 1.0F, 0.1875F, false);
		Base15.setTextureOffset(179, 96).addBox(-3.4375F, 0.1875F, 1.1875F, 0.0F, 1.0F, 1.0F, 0.1875F, false);
		Base15.setTextureOffset(179, 96).addBox(-2.9375F, 0.1875F, 1.1875F, 0.0F, 1.0F, 1.0F, 0.1875F, false);
		Base15.setTextureOffset(174, 149).addBox(-10.1875F, -1.0F, 0.1875F, 2.0F, 3.0F, 3.0F, -0.875F, false);
		Base15.setTextureOffset(58, 228).addBox(-4.4375F, -1.0F, 0.1875F, 2.0F, 3.0F, 3.0F, -0.875F, false);
		Base15.setTextureOffset(58, 228).addBox(-3.9375F, -1.0F, 0.1875F, 2.0F, 3.0F, 3.0F, -0.875F, false);

		Switch14 = new ModelRenderer(this);
		Switch14.setRotationPoint(-9.625F, -0.375F, 3.1875F);
		Base15.addChild(Switch14);
		Switch14.setTextureOffset(179, 108).addBox(-0.5625F, -1.25F, -2.5F, 2.0F, 3.0F, 2.0F, -0.9375F, false);
		Switch14.setTextureOffset(132, 226).addBox(-0.5625F, -1.25F, -2.5F, 2.0F, 2.0F, 2.0F, -0.875F, false);

		RadBox = new ModelRenderer(this);
		RadBox.setRotationPoint(0.0F, 0.0F, 0.0F);
		MainBase.addChild(RadBox);
		setRotationAngle(RadBox, 0.0F, -2.0944F, 0.0F);
		

		Box = new ModelRenderer(this);
		Box.setRotationPoint(0.0F, 0.0F, 0.0F);
		RadBox.addChild(Box);
		

		Base12 = new ModelRenderer(this);
		Base12.setRotationPoint(0.5F, -12.5F, -13.0F);
		Box.addChild(Base12);
		setRotationAngle(Base12, 0.4538F, 0.0F, 0.0F);
		Base12.setTextureOffset(179, 110).addBox(-4.5F, 0.0625F, 1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		Base12.setTextureOffset(194, 197).addBox(-1.0F, 0.0625F, 1.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
		Base12.setTextureOffset(172, 93).addBox(-2.0F, 0.0625F, 5.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Base12.setTextureOffset(228, 113).addBox(1.5F, 0.0625F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Base12.setTextureOffset(210, 138).addBox(2.9375F, -0.0625F, 1.0F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		Base12.setTextureOffset(210, 138).addBox(-0.9375F, -0.0625F, 1.0F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		Base12.setTextureOffset(185, 241).addBox(1.5F, -0.125F, 5.0F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		Base12.setTextureOffset(121, 234).addBox(2.9375F, -0.25F, 1.0F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		Base12.setTextureOffset(121, 234).addBox(-0.9375F, -0.25F, 1.0F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		Base12.setTextureOffset(206, 113).addBox(-0.75F, 0.0625F, 2.375F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Base12.setTextureOffset(220, 159).addBox(-0.75F, -0.3125F, 2.375F, 2.0F, 1.0F, 2.0F, -0.125F, false);
		Base12.setTextureOffset(206, 113).addBox(1.75F, 0.0625F, 2.375F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Base12.setTextureOffset(220, 159).addBox(1.75F, -0.3125F, 2.375F, 2.0F, 1.0F, 2.0F, -0.125F, false);
		Base12.setTextureOffset(227, 101).addBox(-1.4375F, -0.375F, 0.375F, 2.0F, 1.0F, 1.0F, -0.4375F, false);
		Base12.setTextureOffset(227, 101).addBox(2.4375F, -0.375F, 0.375F, 2.0F, 1.0F, 1.0F, -0.4375F, false);
		Base12.setTextureOffset(227, 101).addBox(1.125F, -0.375F, 0.375F, 2.0F, 1.0F, 1.0F, -0.4375F, false);
		Base12.setTextureOffset(227, 101).addBox(-0.125F, -0.375F, 0.375F, 2.0F, 1.0F, 1.0F, -0.4375F, false);

		Box2 = new ModelRenderer(this);
		Box2.setRotationPoint(0.0F, 0.0F, 0.0F);
		RadBox.addChild(Box2);
		Box2.setTextureOffset(152, 85).addBox(-4.0F, -14.5F, -11.5F, 3.0F, 2.0F, 3.0F, -0.125F, false);

		Base13 = new ModelRenderer(this);
		Base13.setRotationPoint(-3.0311F, -6.6875F, 1.75F);
		Box2.addChild(Base13);
		setRotationAngle(Base13, 0.4538F, -1.0472F, 0.0F);
		

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.5F, -11.5F, -13.0F);
		Base13.addChild(bone5);
		bone5.setTextureOffset(200, 149).addBox(-4.8439F, -0.9375F, 3.375F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone5.setTextureOffset(224, 109).addBox(-3.4689F, -0.9375F, 2.375F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		bone5.setTextureOffset(224, 109).addBox(-2.4689F, -0.9375F, 2.375F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		bone5.setTextureOffset(224, 109).addBox(-1.4689F, -0.9375F, 2.375F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		bone5.setTextureOffset(224, 109).addBox(-0.4689F, -0.9375F, 2.375F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		bone5.setTextureOffset(224, 109).addBox(0.5311F, -0.9375F, 2.375F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		bone5.setTextureOffset(224, 109).addBox(1.5311F, -0.9375F, 2.375F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		bone5.setTextureOffset(79, 229).addBox(-4.8439F, -1.3125F, 3.375F, 2.0F, 1.0F, 2.0F, -0.125F, false);
		bone5.setTextureOffset(185, 241).addBox(-3.4689F, -1.125F, 2.375F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		bone5.setTextureOffset(185, 241).addBox(-2.4689F, -1.125F, 2.375F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		bone5.setTextureOffset(185, 241).addBox(-1.4689F, -1.125F, 2.375F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		bone5.setTextureOffset(185, 241).addBox(-0.4689F, -1.125F, 2.375F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		bone5.setTextureOffset(185, 241).addBox(0.5311F, -1.125F, 2.375F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		bone5.setTextureOffset(185, 241).addBox(1.5311F, -1.125F, 2.375F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		bone5.setTextureOffset(208, 109).addBox(-2.4689F, -1.1875F, 3.25F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		bone5.setTextureOffset(208, 109).addBox(-0.2814F, -1.1875F, 3.25F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		bone5.setTextureOffset(224, 109).addBox(-3.9689F, -1.375F, 0.875F, 7.0F, 1.0F, 2.0F, -0.5F, false);
		bone5.setTextureOffset(224, 109).addBox(-2.9689F, -1.375F, 4.875F, 5.0F, 1.0F, 3.0F, -0.625F, false);
		bone5.setTextureOffset(200, 149).addBox(2.0311F, -0.9375F, 3.375F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		bone5.setTextureOffset(79, 229).addBox(2.0311F, -1.3125F, 3.375F, 2.0F, 1.0F, 2.0F, -0.125F, false);

		TMControls = new ModelRenderer(this);
		TMControls.setRotationPoint(0.0F, 0.0F, 0.0F);
		MainBase.addChild(TMControls);
		

		HandbrakeAll = new ModelRenderer(this);
		HandbrakeAll.setRotationPoint(0.0F, 0.0F, 0.0F);
		TMControls.addChild(HandbrakeAll);
		

		Base = new ModelRenderer(this);
		Base.setRotationPoint(0.5F, -12.5F, -13.0F);
		HandbrakeAll.addChild(Base);
		setRotationAngle(Base, 0.4538F, 0.0F, 0.0F);
		Base.setTextureOffset(248, 110).addBox(-4.5F, 0.0F, 1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		Base.setTextureOffset(206, 147).addBox(-4.5F, -0.25F, 1.0F, 1.0F, 1.0F, 3.0F, -0.125F, false);

		handbrakelever = new ModelRenderer(this);
		handbrakelever.setRotationPoint(0.5F, -12.5F, -13.0F);
		HandbrakeAll.addChild(handbrakelever);
		setRotationAngle(handbrakelever, 0.4538F, 0.0F, 0.0F);
		handbrakelever.setTextureOffset(55, 230).addBox(-4.5F, -0.5F, 3.0F, 1.0F, 1.0F, 1.0F, -0.1875F, false);

		ThrottleAll = new ModelRenderer(this);
		ThrottleAll.setRotationPoint(2.375F, 0.0F, 0.0F);
		TMControls.addChild(ThrottleAll);
		

		Base2 = new ModelRenderer(this);
		Base2.setRotationPoint(0.5F, -12.5F, -13.0F);
		ThrottleAll.addChild(Base2);
		setRotationAngle(Base2, 0.4538F, 0.0F, 0.0F);
		Base2.setTextureOffset(248, 110).addBox(-4.5F, 0.0F, 1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		Base2.setTextureOffset(206, 147).addBox(-4.5F, -0.25F, 1.0F, 1.0F, 1.0F, 3.0F, -0.125F, false);

		throttle = new ModelRenderer(this);
		throttle.setRotationPoint(0.5F, -12.5F, -13.0F);
		ThrottleAll.addChild(throttle);
		setRotationAngle(throttle, 0.4538F, 0.0F, 0.0F);
		throttle.setTextureOffset(118, 223).addBox(-4.5F, -0.5F, 3.0F, 1.0F, 1.0F, 1.0F, -0.1875F, false);

		verticallanding3 = new ModelRenderer(this);
		verticallanding3.setRotationPoint(1.625F, 0.0F, 0.0F);
		TMControls.addChild(verticallanding3);
		

		Base3 = new ModelRenderer(this);
		Base3.setRotationPoint(0.5F, -12.5F, -13.0F);
		verticallanding3.addChild(Base3);
		setRotationAngle(Base3, 0.4538F, 0.0F, 0.0F);
		Base3.setTextureOffset(198, 105).addBox(-4.9375F, 0.0F, 2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Base3.setTextureOffset(128, 226).addBox(-4.9375F, -0.25F, 2.5F, 1.0F, 1.0F, 1.0F, -0.125F, false);

		DoorSwitch = new ModelRenderer(this);
		DoorSwitch.setRotationPoint(0.0F, 0.0F, 0.0F);
		TMControls.addChild(DoorSwitch);
		setRotationAngle(DoorSwitch, 0.0F, -1.0472F, 0.0F);
		

		Base4 = new ModelRenderer(this);
		Base4.setRotationPoint(2.875F, -12.5F, -13.0F);
		DoorSwitch.addChild(Base4);
		setRotationAngle(Base4, 0.4538F, 0.0F, 0.0F);
		Base4.setTextureOffset(223, 102).addBox(-3.375F, 0.0F, 1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		Base4.setTextureOffset(188, 146).addBox(-3.375F, -0.25F, 1.0F, 1.0F, 1.0F, 3.0F, -0.125F, false);

		doorcontrol = new ModelRenderer(this);
		doorcontrol.setRotationPoint(2.875F, -12.5F, -13.0F);
		DoorSwitch.addChild(doorcontrol);
		setRotationAngle(doorcontrol, 0.4538F, 0.0F, 0.0F);
		doorcontrol.setTextureOffset(122, 228).addBox(-3.375F, -0.5F, 1.0F, 1.0F, 1.0F, 1.0F, -0.1875F, false);

		Controls26 = new ModelRenderer(this);
		Controls26.setRotationPoint(0.0F, 0.0F, 0.0F);
		MainBase.addChild(Controls26);
		

		Indicators = new ModelRenderer(this);
		Indicators.setRotationPoint(4.875F, 0.0F, 0.0F);
		Controls26.addChild(Indicators);
		

		Base5 = new ModelRenderer(this);
		Base5.setRotationPoint(1.5F, -12.5F, -13.0F);
		Indicators.addChild(Base5);
		setRotationAngle(Base5, 0.4538F, 0.0F, 0.0F);
		Base5.setTextureOffset(196, 104).addBox(-6.0F, 0.1875F, 1.1875F, 2.0F, 1.0F, 1.0F, 0.1875F, false);
		Base5.setTextureOffset(201, 150).addBox(-6.9375F, -1.0F, 0.1875F, 2.0F, 3.0F, 3.0F, -0.875F, false);
		Base5.setTextureOffset(127, 230).addBox(-6.9375F, -1.125F, 1.1875F, 2.0F, 3.0F, 2.0F, -0.875F, false);
		Base5.setTextureOffset(201, 150).addBox(-6.5625F, -1.0F, 0.1875F, 2.0F, 3.0F, 3.0F, -0.875F, false);
		Base5.setTextureOffset(71, 227).addBox(-6.5625F, -1.125F, 1.1875F, 2.0F, 3.0F, 2.0F, -0.875F, false);
		Base5.setTextureOffset(201, 150).addBox(-6.1875F, -1.0F, 0.1875F, 2.0F, 3.0F, 3.0F, -0.875F, false);
		Base5.setTextureOffset(71, 227).addBox(-6.1875F, -1.125F, 1.1875F, 2.0F, 3.0F, 2.0F, -0.875F, false);
		Base5.setTextureOffset(201, 150).addBox(-5.8125F, -1.0F, 0.1875F, 2.0F, 3.0F, 3.0F, -0.875F, false);
		Base5.setTextureOffset(71, 227).addBox(-5.8125F, -1.125F, 1.1875F, 2.0F, 3.0F, 2.0F, -0.875F, false);
		Base5.setTextureOffset(201, 150).addBox(-5.4375F, -1.0F, 0.1875F, 2.0F, 3.0F, 3.0F, -0.875F, false);
		Base5.setTextureOffset(71, 227).addBox(-5.4375F, -1.125F, 1.1875F, 2.0F, 3.0F, 2.0F, -0.875F, false);
		Base5.setTextureOffset(201, 150).addBox(-5.0625F, -1.0F, 0.1875F, 2.0F, 3.0F, 3.0F, -0.875F, false);
		Base5.setTextureOffset(71, 227).addBox(-5.0625F, -1.125F, 1.1875F, 2.0F, 3.0F, 2.0F, -0.875F, false);

		Switches = new ModelRenderer(this);
		Switches.setRotationPoint(6.0625F, 0.0F, 0.0F);
		Controls26.addChild(Switches);
		

		Base6 = new ModelRenderer(this);
		Base6.setRotationPoint(1.5F, -12.5F, -13.0F);
		Switches.addChild(Base6);
		setRotationAngle(Base6, 0.4538F, 0.0F, 0.0F);
		Base6.setTextureOffset(196, 110).addBox(-6.0F, 0.1875F, 2.6875F, 2.0F, 1.0F, 1.0F, 0.1875F, false);
		Base6.setTextureOffset(183, 145).addBox(-6.9375F, -1.0F, 1.6875F, 2.0F, 3.0F, 3.0F, -0.875F, false);
		Base6.setTextureOffset(183, 145).addBox(-6.5625F, -1.0F, 1.6875F, 2.0F, 3.0F, 3.0F, -0.875F, false);
		Base6.setTextureOffset(183, 145).addBox(-6.1875F, -1.0F, 1.6875F, 2.0F, 3.0F, 3.0F, -0.875F, false);
		Base6.setTextureOffset(183, 145).addBox(-5.8125F, -1.0F, 1.6875F, 2.0F, 3.0F, 3.0F, -0.875F, false);
		Base6.setTextureOffset(183, 145).addBox(-5.4375F, -1.0F, 1.6875F, 2.0F, 3.0F, 3.0F, -0.875F, false);
		Base6.setTextureOffset(183, 145).addBox(-5.0625F, -1.0F, 1.6875F, 2.0F, 3.0F, 3.0F, -0.875F, false);

		Switch = new ModelRenderer(this);
		Switch.setRotationPoint(-5.9375F, 0.125F, 3.1875F);
		Base6.addChild(Switch);
		setRotationAngle(Switch, -0.6109F, 0.0F, 0.0F);
		Switch.setTextureOffset(200, 106).addBox(-1.0F, -1.75F, -1.0F, 2.0F, 3.0F, 2.0F, -0.9375F, false);
		Switch.setTextureOffset(118, 233).addBox(-1.0F, -1.75F, -1.0F, 2.0F, 2.0F, 2.0F, -0.875F, false);

		Switch2 = new ModelRenderer(this);
		Switch2.setRotationPoint(-5.5625F, 0.125F, 3.1875F);
		Base6.addChild(Switch2);
		setRotationAngle(Switch2, 0.6981F, 0.0F, 0.0F);
		Switch2.setTextureOffset(180, 108).addBox(-1.0F, -1.75F, -1.0F, 2.0F, 3.0F, 2.0F, -0.9375F, false);
		Switch2.setTextureOffset(118, 233).addBox(-1.0F, -1.75F, -1.0F, 2.0F, 2.0F, 2.0F, -0.875F, false);

		Switch3 = new ModelRenderer(this);
		Switch3.setRotationPoint(-5.1875F, 0.125F, 3.1875F);
		Base6.addChild(Switch3);
		setRotationAngle(Switch3, 0.5236F, 0.0F, 0.0F);
		Switch3.setTextureOffset(200, 106).addBox(-1.0F, -1.75F, -1.0F, 2.0F, 3.0F, 2.0F, -0.9375F, false);
		Switch3.setTextureOffset(118, 233).addBox(-1.0F, -1.75F, -1.0F, 2.0F, 2.0F, 2.0F, -0.875F, false);

		Switch4 = new ModelRenderer(this);
		Switch4.setRotationPoint(-4.8125F, 0.125F, 3.1875F);
		Base6.addChild(Switch4);
		setRotationAngle(Switch4, -0.1745F, 0.0F, 0.0F);
		Switch4.setTextureOffset(200, 106).addBox(-1.0F, -1.75F, -1.0F, 2.0F, 3.0F, 2.0F, -0.9375F, false);
		Switch4.setTextureOffset(118, 233).addBox(-1.0F, -1.75F, -1.0F, 2.0F, 2.0F, 2.0F, -0.875F, false);

		Switch5 = new ModelRenderer(this);
		Switch5.setRotationPoint(-4.4375F, 0.125F, 3.1875F);
		Base6.addChild(Switch5);
		setRotationAngle(Switch5, -0.8727F, 0.0F, 0.0F);
		Switch5.setTextureOffset(200, 106).addBox(-1.0F, -1.75F, -1.0F, 2.0F, 3.0F, 2.0F, -0.9375F, false);
		Switch5.setTextureOffset(118, 233).addBox(-1.0F, -1.75F, -1.0F, 2.0F, 2.0F, 2.0F, -0.875F, false);

		Switch6 = new ModelRenderer(this);
		Switch6.setRotationPoint(-4.0625F, 0.125F, 3.1875F);
		Base6.addChild(Switch6);
		setRotationAngle(Switch6, 0.8727F, 0.0F, 0.0F);
		Switch6.setTextureOffset(188, 96).addBox(-1.0F, -1.75F, -1.0F, 2.0F, 3.0F, 2.0F, -0.9375F, false);
		Switch6.setTextureOffset(118, 233).addBox(-1.0F, -1.75F, -1.0F, 2.0F, 2.0F, 2.0F, -0.875F, false);

		Switches2 = new ModelRenderer(this);
		Switches2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Controls26.addChild(Switches2);
		setRotationAngle(Switches2, 0.0F, -1.0472F, 0.0F);
		

		Base8 = new ModelRenderer(this);
		Base8.setRotationPoint(7.5625F, -12.5F, -13.0F);
		Switches2.addChild(Base8);
		setRotationAngle(Base8, 0.4538F, 0.0F, 0.0F);
		Base8.setTextureOffset(205, 123).addBox(-8.5625F, 0.1875F, 4.6875F, 2.0F, 1.0F, 1.0F, 0.1875F, false);
		Base8.setTextureOffset(185, 134).addBox(-9.5F, -1.0F, 3.6875F, 2.0F, 3.0F, 3.0F, -0.875F, false);
		Base8.setTextureOffset(185, 134).addBox(-9.125F, -1.0F, 3.6875F, 2.0F, 3.0F, 3.0F, -0.875F, false);
		Base8.setTextureOffset(185, 134).addBox(-8.75F, -1.0F, 3.6875F, 2.0F, 3.0F, 3.0F, -0.875F, false);
		Base8.setTextureOffset(185, 134).addBox(-8.375F, -1.0F, 3.6875F, 2.0F, 3.0F, 3.0F, -0.875F, false);
		Base8.setTextureOffset(185, 134).addBox(-8.0F, -1.0F, 3.6875F, 2.0F, 3.0F, 3.0F, -0.875F, false);
		Base8.setTextureOffset(185, 134).addBox(-7.625F, -1.0F, 3.6875F, 2.0F, 3.0F, 3.0F, -0.875F, false);

		refuel = new ModelRenderer(this);
		refuel.setRotationPoint(-9.0F, 0.125F, 5.1875F);
		Base8.addChild(refuel);
		setRotationAngle(refuel, -0.1745F, 0.0F, 0.0F);
		refuel.setTextureOffset(197, 96).addBox(-0.5F, -1.75F, -1.0F, 2.0F, 3.0F, 2.0F, -0.9375F, false);
		refuel.setTextureOffset(118, 230).addBox(-0.5F, -1.75F, -1.0F, 2.0F, 2.0F, 2.0F, -0.875F, false);

		Switch8 = new ModelRenderer(this);
		Switch8.setRotationPoint(-9.0F, 0.125F, 5.1875F);
		Base8.addChild(Switch8);
		setRotationAngle(Switch8, -0.1745F, 0.0F, 0.0F);
		Switch8.setTextureOffset(197, 96).addBox(-0.125F, -1.75F, -1.0F, 2.0F, 3.0F, 2.0F, -0.9375F, false);
		Switch8.setTextureOffset(118, 230).addBox(-0.125F, -1.75F, -1.0F, 2.0F, 2.0F, 2.0F, -0.875F, false);

		refuel2 = new ModelRenderer(this);
		refuel2.setRotationPoint(-9.0F, 0.125F, 5.1875F);
		Base8.addChild(refuel2);
		setRotationAngle(refuel2, -0.1745F, 0.0F, 0.0F);
		refuel2.setTextureOffset(197, 96).addBox(0.25F, -1.75F, -1.0F, 2.0F, 3.0F, 2.0F, -0.9375F, false);
		refuel2.setTextureOffset(118, 230).addBox(0.25F, -1.75F, -1.0F, 2.0F, 2.0F, 2.0F, -0.875F, false);

		Switch10 = new ModelRenderer(this);
		Switch10.setRotationPoint(-9.0F, 0.125F, 5.1875F);
		Base8.addChild(Switch10);
		setRotationAngle(Switch10, -0.1745F, 0.0F, 0.0F);
		Switch10.setTextureOffset(197, 96).addBox(0.625F, -1.75F, -1.0F, 2.0F, 3.0F, 2.0F, -0.9375F, false);
		Switch10.setTextureOffset(118, 230).addBox(0.625F, -1.75F, -1.0F, 2.0F, 2.0F, 2.0F, -0.875F, false);

		Switch11 = new ModelRenderer(this);
		Switch11.setRotationPoint(-9.0F, 0.125F, 5.1875F);
		Base8.addChild(Switch11);
		setRotationAngle(Switch11, -0.1745F, 0.0F, 0.0F);
		Switch11.setTextureOffset(197, 96).addBox(1.0F, -1.75F, -1.0F, 2.0F, 3.0F, 2.0F, -0.9375F, false);
		Switch11.setTextureOffset(118, 230).addBox(1.0F, -1.75F, -1.0F, 2.0F, 2.0F, 2.0F, -0.875F, false);

		refuel3 = new ModelRenderer(this);
		refuel3.setRotationPoint(-9.0F, 0.125F, 5.1875F);
		Base8.addChild(refuel3);
		setRotationAngle(refuel3, -0.1745F, 0.0F, 0.0F);
		refuel3.setTextureOffset(197, 96).addBox(1.375F, -1.75F, -1.0F, 2.0F, 3.0F, 2.0F, -0.9375F, false);
		refuel3.setTextureOffset(118, 230).addBox(1.375F, -1.75F, -1.0F, 2.0F, 2.0F, 2.0F, -0.875F, false);

		SpeakersLightsGrates = new ModelRenderer(this);
		SpeakersLightsGrates.setRotationPoint(1.625F, 0.0F, 0.0F);
		Controls26.addChild(SpeakersLightsGrates);
		

		Base7 = new ModelRenderer(this);
		Base7.setRotationPoint(0.5F, -12.5F, -13.0F);
		SpeakersLightsGrates.addChild(Base7);
		setRotationAngle(Base7, 0.4538F, 0.0F, 0.0F);
		Base7.setTextureOffset(214, 99).addBox(-4.625F, -0.0625F, 4.375F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		Base7.setTextureOffset(185, 241).addBox(-4.625F, -0.1875F, 4.375F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		Base7.setTextureOffset(214, 99).addBox(-0.625F, -0.0625F, 4.375F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		Base7.setTextureOffset(186, 120).addBox(0.5F, -0.0625F, 4.0625F, 1.0F, 1.0F, 2.0F, -0.125F, false);
		Base7.setTextureOffset(185, 241).addBox(-0.625F, -0.1875F, 4.375F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		Base7.setTextureOffset(66, 242).addBox(0.5F, -0.4375F, 4.0625F, 1.0F, 1.0F, 2.0F, -0.1875F, false);
		Base7.setTextureOffset(214, 99).addBox(-1.625F, -0.0625F, 5.0F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		Base7.setTextureOffset(185, 241).addBox(-1.625F, -0.1875F, 5.0F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		Base7.setTextureOffset(214, 99).addBox(-3.625F, -0.0625F, 5.0F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		Base7.setTextureOffset(185, 241).addBox(-3.625F, -0.1875F, 5.0F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		Base7.setTextureOffset(214, 99).addBox(-2.625F, -0.0625F, 5.0F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		Base7.setTextureOffset(156, 252).addBox(-2.625F, -0.1875F, 5.0F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		Base7.setTextureOffset(215, 113).addBox(-3.125F, -0.0625F, 4.0F, 2.0F, 1.0F, 1.0F, -0.0625F, false);
		Base7.setTextureOffset(198, 113).addBox(-3.125F, -0.0625F, 6.0F, 2.0F, 1.0F, 1.0F, -0.0625F, false);

		SpeakersLightsGrates2 = new ModelRenderer(this);
		SpeakersLightsGrates2.setRotationPoint(-1.625F, 0.0F, 0.0F);
		SpeakersLightsGrates.addChild(SpeakersLightsGrates2);
		setRotationAngle(SpeakersLightsGrates2, 0.0F, -1.0472F, 0.0F);
		

		Base11 = new ModelRenderer(this);
		Base11.setRotationPoint(2.125F, -12.5F, -13.0F);
		SpeakersLightsGrates2.addChild(Base11);
		setRotationAngle(Base11, 0.4538F, 0.0F, 0.0F);
		Base11.setTextureOffset(220, 111).addBox(-7.0709F, -0.0488F, 1.4031F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		Base11.setTextureOffset(185, 241).addBox(-7.125F, -0.1875F, 1.375F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		Base11.setTextureOffset(220, 111).addBox(1.875F, -0.0625F, 1.375F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		Base11.setTextureOffset(185, 241).addBox(1.875F, -0.1875F, 1.375F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		Base11.setTextureOffset(220, 111).addBox(0.875F, -0.0625F, 3.0F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		Base11.setTextureOffset(220, 111).addBox(-0.125F, -0.0625F, 4.5F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		Base11.setTextureOffset(185, 241).addBox(0.875F, -0.1875F, 3.0F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		Base11.setTextureOffset(185, 241).addBox(-0.125F, -0.1875F, 4.5F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		Base11.setTextureOffset(220, 111).addBox(-6.1334F, -0.0488F, 3.0281F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		Base11.setTextureOffset(220, 111).addBox(-5.1875F, -0.0625F, 4.5F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		Base11.setTextureOffset(185, 241).addBox(-6.1875F, -0.1875F, 3.0F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		Base11.setTextureOffset(185, 241).addBox(-5.1875F, -0.1875F, 4.5F, 1.0F, 1.0F, 1.0F, -0.125F, false);

		RedBall2 = new ModelRenderer(this);
		RedBall2.setRotationPoint(-1.625F, 0.0F, 0.0F);
		SpeakersLightsGrates.addChild(RedBall2);
		setRotationAngle(RedBall2, 0.0F, -1.0472F, 0.0F);
		

		Base10 = new ModelRenderer(this);
		Base10.setRotationPoint(2.125F, -12.5F, -13.0F);
		RedBall2.addChild(Base10);
		setRotationAngle(Base10, 0.4538F, 0.0F, 0.0F);
		Base10.setTextureOffset(75, 229).addBox(0.625F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Base10.setTextureOffset(126, 225).addBox(0.625F, -0.25F, 1.0F, 1.0F, 1.0F, 1.0F, -0.125F, false);

		RedBall = new ModelRenderer(this);
		RedBall.setRotationPoint(-1.625F, 0.0F, 0.0F);
		SpeakersLightsGrates.addChild(RedBall);
		setRotationAngle(RedBall, 0.0F, -1.0472F, 0.0F);
		

		Base9 = new ModelRenderer(this);
		Base9.setRotationPoint(2.125F, -12.5F, -13.0F);
		RedBall.addChild(Base9);
		setRotationAngle(Base9, 0.4538F, 0.0F, 0.0F);
		Base9.setTextureOffset(75, 229).addBox(-5.875F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Base9.setTextureOffset(126, 225).addBox(-5.875F, -0.25F, 1.0F, 1.0F, 1.0F, 1.0F, -0.125F, false);

		TimeRotor = new ModelRenderer(this);
		TimeRotor.setRotationPoint(0.0F, -2.5F, 0.0F);
		MainBase.addChild(TimeRotor);
		

		Centre = new ModelRenderer(this);
		Centre.setRotationPoint(0.0F, 0.0F, 0.0F);
		TimeRotor.addChild(Centre);
		Centre.setTextureOffset(122, 229).addBox(-0.5F, -19.0F, -0.5F, 1.0F, 9.0F, 1.0F, -0.125F, false);
		Centre.setTextureOffset(201, 243).addBox(-0.5F, -17.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.375F, false);
		Centre.setTextureOffset(194, 152).addBox(-1.0F, -17.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.25F, false);
		Centre.setTextureOffset(194, 152).addBox(-0.5F, -17.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.25F, false);

		Ring = new ModelRenderer(this);
		Ring.setRotationPoint(0.0F, 0.0F, 0.0F);
		TimeRotor.addChild(Ring);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -16.5F, 0.0F);
		Ring.addChild(bone);
		setRotationAngle(bone, -0.1745F, 0.0F, 0.7854F);
		bone.setTextureOffset(196, 235).addBox(0.9142F, 0.8927F, -3.2544F, 1.0F, 1.0F, 7.0F, -0.25F, false);

		an = new ModelRenderer(this);
		an.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring.addChild(an);
		an.setTextureOffset(214, 100).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		an4 = new ModelRenderer(this);
		an4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring.addChild(an4);
		setRotationAngle(an4, 0.0F, -1.5708F, 0.0F);
		an4.setTextureOffset(209, 114).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		an5 = new ModelRenderer(this);
		an5.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring.addChild(an5);
		setRotationAngle(an5, 0.0F, -2.0944F, 0.0F);
		an5.setTextureOffset(209, 114).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		an6 = new ModelRenderer(this);
		an6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring.addChild(an6);
		setRotationAngle(an6, 0.0F, -2.618F, 0.0F);
		an6.setTextureOffset(209, 114).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		an7 = new ModelRenderer(this);
		an7.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring.addChild(an7);
		setRotationAngle(an7, 0.0F, 3.1416F, 0.0F);
		an7.setTextureOffset(209, 114).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		an10 = new ModelRenderer(this);
		an10.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring.addChild(an10);
		setRotationAngle(an10, 0.0F, 1.5708F, 0.0F);
		an10.setTextureOffset(214, 100).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		an11 = new ModelRenderer(this);
		an11.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring.addChild(an11);
		setRotationAngle(an11, 0.0F, 1.0472F, 0.0F);
		an11.setTextureOffset(214, 100).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		an12 = new ModelRenderer(this);
		an12.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring.addChild(an12);
		setRotationAngle(an12, 0.0F, 0.5236F, 0.0F);
		an12.setTextureOffset(214, 100).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		Ring3 = new ModelRenderer(this);
		Ring3.setRotationPoint(0.0F, -4.5F, 0.0F);
		TimeRotor.addChild(Ring3);
		setRotationAngle(Ring3, 0.0F, 1.5708F, 0.0F);
		

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -16.5F, 0.0F);
		Ring3.addChild(bone3);
		setRotationAngle(bone3, -0.1745F, 0.0F, 0.7854F);
		bone3.setTextureOffset(48, 230).addBox(0.9142F, 0.8927F, -3.2544F, 1.0F, 1.0F, 7.0F, -0.25F, false);

		an2 = new ModelRenderer(this);
		an2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring3.addChild(an2);
		an2.setTextureOffset(60, 232).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		an3 = new ModelRenderer(this);
		an3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring3.addChild(an3);
		setRotationAngle(an3, 0.0F, -1.5708F, 0.0F);
		an3.setTextureOffset(106, 223).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		an8 = new ModelRenderer(this);
		an8.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring3.addChild(an8);
		setRotationAngle(an8, 0.0F, -2.0944F, 0.0F);
		an8.setTextureOffset(106, 223).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		an9 = new ModelRenderer(this);
		an9.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring3.addChild(an9);
		setRotationAngle(an9, 0.0F, -2.618F, 0.0F);
		an9.setTextureOffset(106, 223).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		an13 = new ModelRenderer(this);
		an13.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring3.addChild(an13);
		setRotationAngle(an13, 0.0F, 3.1416F, 0.0F);
		an13.setTextureOffset(106, 223).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		an14 = new ModelRenderer(this);
		an14.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring3.addChild(an14);
		setRotationAngle(an14, 0.0F, 1.5708F, 0.0F);
		an14.setTextureOffset(60, 232).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		an19 = new ModelRenderer(this);
		an19.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring3.addChild(an19);
		setRotationAngle(an19, 0.0F, 1.0472F, 0.0F);
		an19.setTextureOffset(60, 232).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		an20 = new ModelRenderer(this);
		an20.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring3.addChild(an20);
		setRotationAngle(an20, 0.0F, 0.5236F, 0.0F);
		an20.setTextureOffset(60, 232).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		Ring2 = new ModelRenderer(this);
		Ring2.setRotationPoint(0.0F, -1.0F, 0.0F);
		TimeRotor.addChild(Ring2);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -16.5F, 0.0F);
		Ring2.addChild(bone2);
		setRotationAngle(bone2, -0.1309F, -1.5708F, 0.0F);
		bone2.setTextureOffset(119, 220).addBox(-0.5F, 1.4829F, -3.2389F, 1.0F, 1.0F, 7.0F, -0.25F, false);

		an15 = new ModelRenderer(this);
		an15.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring2.addChild(an15);
		setRotationAngle(an15, 0.0F, -1.0472F, 0.0F);
		an15.setTextureOffset(60, 232).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		an16 = new ModelRenderer(this);
		an16.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring2.addChild(an16);
		setRotationAngle(an16, 0.0F, -1.5708F, 0.0F);
		an16.setTextureOffset(60, 232).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		an17 = new ModelRenderer(this);
		an17.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring2.addChild(an17);
		setRotationAngle(an17, 0.0F, -2.0944F, 0.0F);
		an17.setTextureOffset(60, 232).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		an18 = new ModelRenderer(this);
		an18.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring2.addChild(an18);
		setRotationAngle(an18, 0.0F, -2.618F, 0.0F);
		an18.setTextureOffset(60, 232).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		an21 = new ModelRenderer(this);
		an21.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring2.addChild(an21);
		setRotationAngle(an21, 0.0F, 2.0944F, 0.0F);
		an21.setTextureOffset(122, 231).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		an22 = new ModelRenderer(this);
		an22.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring2.addChild(an22);
		setRotationAngle(an22, 0.0F, 1.5708F, 0.0F);
		an22.setTextureOffset(122, 231).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		an23 = new ModelRenderer(this);
		an23.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring2.addChild(an23);
		setRotationAngle(an23, 0.0F, 1.0472F, 0.0F);
		an23.setTextureOffset(122, 231).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		an24 = new ModelRenderer(this);
		an24.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring2.addChild(an24);
		setRotationAngle(an24, 0.0F, 0.5236F, 0.0F);
		an24.setTextureOffset(122, 231).addBox(-1.0F, -15.0F, -3.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);
		an24.setTextureOffset(121, 227).addBox(0.0F, -18.5F, -3.0F, 1.0F, 4.0F, 1.0F, -0.25F, false);
		an24.setTextureOffset(60, 232).addBox(-1.0F, -18.5F, 2.0F, 1.0F, 4.0F, 1.0F, -0.25F, false);

		Panelstands = new ModelRenderer(this);
		Panelstands.setRotationPoint(0.0F, 0.0F, 0.0F);
		MainBase.addChild(Panelstands);
		

		Stand = new ModelRenderer(this);
		Stand.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panelstands.addChild(Stand);
		

		Dividers = new ModelRenderer(this);
		Dividers.setRotationPoint(0.0F, 0.0F, 0.0F);
		Stand.addChild(Dividers);
		

		r1 = new ModelRenderer(this);
		r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Dividers.addChild(r1);
		

		Panel1 = new ModelRenderer(this);
		Panel1.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r1.addChild(Panel1);
		setRotationAngle(Panel1, 0.0F, -0.1309F, 0.0F);
		Panel1.setTextureOffset(184, 240).addBox(1.797F, -5.75F, -1.0238F, 7.0F, 12.0F, 1.0F, -0.25F, false);

		Panel2 = new ModelRenderer(this);
		Panel2.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r1.addChild(Panel2);
		setRotationAngle(Panel2, 0.0F, 0.1309F, 0.0F);
		Panel2.setTextureOffset(184, 240).addBox(1.7982F, -5.75F, -0.4847F, 7.0F, 12.0F, 1.0F, -0.25F, false);

		r2 = new ModelRenderer(this);
		r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Dividers.addChild(r2);
		setRotationAngle(r2, 0.0F, -1.0472F, 0.0F);
		

		Panel3 = new ModelRenderer(this);
		Panel3.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r2.addChild(Panel3);
		setRotationAngle(Panel3, 0.0F, -0.1309F, 0.0F);
		Panel3.setTextureOffset(210, 196).addBox(1.797F, -5.75F, -1.0238F, 7.0F, 12.0F, 1.0F, -0.25F, false);

		Panel4 = new ModelRenderer(this);
		Panel4.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r2.addChild(Panel4);
		setRotationAngle(Panel4, 0.0F, 0.1309F, 0.0F);
		Panel4.setTextureOffset(184, 240).addBox(1.7982F, -5.75F, -0.4847F, 7.0F, 12.0F, 1.0F, -0.25F, false);

		r3 = new ModelRenderer(this);
		r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Dividers.addChild(r3);
		setRotationAngle(r3, 0.0F, -2.0944F, 0.0F);
		

		Panel5 = new ModelRenderer(this);
		Panel5.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r3.addChild(Panel5);
		setRotationAngle(Panel5, 0.0F, -0.1309F, 0.0F);
		Panel5.setTextureOffset(184, 240).addBox(1.797F, -5.75F, -1.0238F, 7.0F, 12.0F, 1.0F, -0.25F, false);

		Panel6 = new ModelRenderer(this);
		Panel6.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r3.addChild(Panel6);
		setRotationAngle(Panel6, 0.0F, 0.1309F, 0.0F);
		Panel6.setTextureOffset(184, 240).addBox(1.7982F, -5.75F, -0.4847F, 7.0F, 12.0F, 1.0F, -0.25F, false);

		r4 = new ModelRenderer(this);
		r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Dividers.addChild(r4);
		setRotationAngle(r4, 0.0F, 3.1416F, 0.0F);
		

		Panel7 = new ModelRenderer(this);
		Panel7.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r4.addChild(Panel7);
		setRotationAngle(Panel7, 0.0F, -0.1309F, 0.0F);
		Panel7.setTextureOffset(184, 240).addBox(1.797F, -5.75F, -1.0238F, 7.0F, 12.0F, 1.0F, -0.25F, false);

		Panel8 = new ModelRenderer(this);
		Panel8.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r4.addChild(Panel8);
		setRotationAngle(Panel8, 0.0F, 0.1309F, 0.0F);
		Panel8.setTextureOffset(184, 240).addBox(1.7982F, -5.75F, -0.4847F, 7.0F, 12.0F, 1.0F, -0.25F, false);

		r5 = new ModelRenderer(this);
		r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		Dividers.addChild(r5);
		setRotationAngle(r5, 0.0F, 2.0944F, 0.0F);
		

		Panel9 = new ModelRenderer(this);
		Panel9.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r5.addChild(Panel9);
		setRotationAngle(Panel9, 0.0F, -0.1309F, 0.0F);
		Panel9.setTextureOffset(184, 240).addBox(1.797F, -5.75F, -1.0238F, 7.0F, 12.0F, 1.0F, -0.25F, false);

		Panel10 = new ModelRenderer(this);
		Panel10.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r5.addChild(Panel10);
		setRotationAngle(Panel10, 0.0F, 0.1309F, 0.0F);
		Panel10.setTextureOffset(184, 240).addBox(1.7982F, -5.75F, -0.4847F, 7.0F, 12.0F, 1.0F, -0.25F, false);

		r6 = new ModelRenderer(this);
		r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Dividers.addChild(r6);
		setRotationAngle(r6, 0.0F, 1.0472F, 0.0F);
		

		Panel11 = new ModelRenderer(this);
		Panel11.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r6.addChild(Panel11);
		setRotationAngle(Panel11, 0.0F, -0.1309F, 0.0F);
		Panel11.setTextureOffset(184, 240).addBox(1.797F, -5.75F, -1.0238F, 7.0F, 12.0F, 1.0F, -0.25F, false);

		Panel12 = new ModelRenderer(this);
		Panel12.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r6.addChild(Panel12);
		setRotationAngle(Panel12, 0.0F, 0.1309F, 0.0F);
		Panel12.setTextureOffset(184, 240).addBox(1.7982F, -5.75F, -0.4847F, 7.0F, 12.0F, 1.0F, -0.25F, false);

		Edgeing = new ModelRenderer(this);
		Edgeing.setRotationPoint(0.0F, 0.0F, 0.0F);
		Dividers.addChild(Edgeing);
		

		p1 = new ModelRenderer(this);
		p1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edgeing.addChild(p1);
		p1.setTextureOffset(192, 140).addBox(-8.0F, -11.75F, -0.5F, 16.0F, 12.0F, 1.0F, -0.25F, false);
		p1.setTextureOffset(174, 106).addBox(-14.0F, -12.0625F, -1.0F, 28.0F, 1.0F, 2.0F, -0.25F, false);

		p2 = new ModelRenderer(this);
		p2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edgeing.addChild(p2);
		setRotationAngle(p2, 0.0F, -1.0472F, 0.0F);
		p2.setTextureOffset(202, 148).addBox(-8.0F, -11.75F, -0.5F, 16.0F, 12.0F, 1.0F, -0.25F, false);
		p2.setTextureOffset(174, 106).addBox(-14.0F, -12.0625F, -1.0F, 28.0F, 1.0F, 2.0F, -0.25F, false);

		p3 = new ModelRenderer(this);
		p3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edgeing.addChild(p3);
		setRotationAngle(p3, 0.0F, -2.0944F, 0.0F);
		p3.setTextureOffset(202, 148).addBox(-8.0F, -11.75F, -0.5F, 16.0F, 12.0F, 1.0F, -0.25F, false);
		p3.setTextureOffset(174, 106).addBox(-14.0F, -12.0625F, -1.0F, 28.0F, 1.0F, 2.0F, -0.25F, false);

		InnerStandPanels = new ModelRenderer(this);
		InnerStandPanels.setRotationPoint(0.0F, 0.0F, 0.0F);
		Stand.addChild(InnerStandPanels);
		

		BaseSlants = new ModelRenderer(this);
		BaseSlants.setRotationPoint(0.0F, 0.0F, 0.0F);
		InnerStandPanels.addChild(BaseSlants);
		

		r7 = new ModelRenderer(this);
		r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		BaseSlants.addChild(r7);
		r7.setTextureOffset(202, 148).addBox(-4.0F, -0.75F, -7.0F, 8.0F, 1.0F, 1.0F, -0.25F, false);
		r7.setTextureOffset(208, 106).addBox(-3.0F, -15.75F, -4.5F, 6.0F, 15.0F, 1.0F, -0.25F, false);
		r7.setTextureOffset(204, 106).addBox(-4.0F, -16.375F, -6.875F, 8.0F, 2.0F, 7.0F, -0.125F, false);
		r7.setTextureOffset(189, 144).addBox(-4.0F, -17.625F, -6.4375F, 8.0F, 2.0F, 3.0F, -0.625F, false);

		Slant = new ModelRenderer(this);
		Slant.setRotationPoint(0.0F, -0.5F, -8.5F);
		r7.addChild(Slant);
		setRotationAngle(Slant, 0.4363F, 0.0F, 0.0F);
		Slant.setTextureOffset(193, 152).addBox(-3.5F, 0.4896F, 1.336F, 7.0F, 1.0F, 2.0F, -0.25F, false);
		Slant.setTextureOffset(210, 196).addBox(3.0F, 0.4896F, 1.336F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		Slant.setTextureOffset(210, 196).addBox(-4.0F, 0.4896F, 1.336F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		Slant.setTextureOffset(193, 152).addBox(-3.0F, 0.4896F, 2.836F, 6.0F, 1.0F, 2.0F, -0.25F, false);

		r8 = new ModelRenderer(this);
		r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		BaseSlants.addChild(r8);
		setRotationAngle(r8, 0.0F, -1.0472F, 0.0F);
		r8.setTextureOffset(202, 148).addBox(-4.0F, -0.75F, -7.0F, 8.0F, 1.0F, 1.0F, -0.25F, false);
		r8.setTextureOffset(208, 106).addBox(-3.0F, -15.75F, -4.5F, 6.0F, 15.0F, 1.0F, -0.25F, false);
		r8.setTextureOffset(204, 106).addBox(-4.0F, -16.375F, -6.875F, 8.0F, 2.0F, 7.0F, -0.125F, false);
		r8.setTextureOffset(189, 144).addBox(-4.0F, -17.625F, -6.4375F, 8.0F, 2.0F, 3.0F, -0.625F, false);

		Slant2 = new ModelRenderer(this);
		Slant2.setRotationPoint(0.0F, -0.5F, -8.5F);
		r8.addChild(Slant2);
		setRotationAngle(Slant2, 0.4363F, 0.0F, 0.0F);
		Slant2.setTextureOffset(193, 152).addBox(-3.5F, 0.4896F, 1.336F, 7.0F, 1.0F, 2.0F, -0.25F, false);
		Slant2.setTextureOffset(210, 196).addBox(3.0F, 0.4896F, 1.336F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		Slant2.setTextureOffset(210, 196).addBox(-4.0F, 0.4896F, 1.336F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		Slant2.setTextureOffset(193, 152).addBox(-3.0F, 0.4896F, 2.836F, 6.0F, 1.0F, 2.0F, -0.25F, false);

		r9 = new ModelRenderer(this);
		r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		BaseSlants.addChild(r9);
		setRotationAngle(r9, 0.0F, -2.0944F, 0.0F);
		r9.setTextureOffset(202, 148).addBox(-4.0F, -0.75F, -7.0F, 8.0F, 1.0F, 1.0F, -0.25F, false);
		r9.setTextureOffset(208, 106).addBox(-3.0F, -15.75F, -4.5F, 6.0F, 15.0F, 1.0F, -0.25F, false);
		r9.setTextureOffset(204, 106).addBox(-4.0F, -16.375F, -6.875F, 8.0F, 2.0F, 7.0F, -0.125F, false);
		r9.setTextureOffset(189, 144).addBox(-4.0F, -17.625F, -6.4375F, 8.0F, 2.0F, 3.0F, -0.625F, false);

		Slant3 = new ModelRenderer(this);
		Slant3.setRotationPoint(0.0F, -0.5F, -8.5F);
		r9.addChild(Slant3);
		setRotationAngle(Slant3, 0.4363F, 0.0F, 0.0F);
		Slant3.setTextureOffset(193, 152).addBox(-3.5F, 0.4896F, 1.336F, 7.0F, 1.0F, 2.0F, -0.25F, false);
		Slant3.setTextureOffset(210, 196).addBox(3.0F, 0.4896F, 1.336F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		Slant3.setTextureOffset(210, 196).addBox(-4.0F, 0.4896F, 1.336F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		Slant3.setTextureOffset(193, 152).addBox(-3.0F, 0.4896F, 2.836F, 6.0F, 1.0F, 2.0F, -0.25F, false);

		r10 = new ModelRenderer(this);
		r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		BaseSlants.addChild(r10);
		setRotationAngle(r10, 0.0F, 3.1416F, 0.0F);
		r10.setTextureOffset(202, 148).addBox(-4.0F, -0.75F, -7.0F, 8.0F, 1.0F, 1.0F, -0.25F, false);
		r10.setTextureOffset(208, 106).addBox(-3.0F, -15.75F, -4.5F, 6.0F, 15.0F, 1.0F, -0.25F, false);
		r10.setTextureOffset(204, 106).addBox(-4.0F, -16.375F, -6.875F, 8.0F, 2.0F, 7.0F, -0.125F, false);
		r10.setTextureOffset(189, 144).addBox(-4.0F, -17.625F, -6.4375F, 8.0F, 2.0F, 3.0F, -0.625F, false);

		Slant4 = new ModelRenderer(this);
		Slant4.setRotationPoint(0.0F, -0.5F, -8.5F);
		r10.addChild(Slant4);
		setRotationAngle(Slant4, 0.4363F, 0.0F, 0.0F);
		Slant4.setTextureOffset(193, 152).addBox(-3.5F, 0.4896F, 1.336F, 7.0F, 1.0F, 2.0F, -0.25F, false);
		Slant4.setTextureOffset(210, 196).addBox(3.0F, 0.4896F, 1.336F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		Slant4.setTextureOffset(210, 196).addBox(-4.0F, 0.4896F, 1.336F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		Slant4.setTextureOffset(193, 152).addBox(-3.0F, 0.4896F, 2.836F, 6.0F, 1.0F, 2.0F, -0.25F, false);

		r11 = new ModelRenderer(this);
		r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		BaseSlants.addChild(r11);
		setRotationAngle(r11, 0.0F, 2.0944F, 0.0F);
		r11.setTextureOffset(202, 148).addBox(-4.0F, -0.75F, -7.0F, 8.0F, 1.0F, 1.0F, -0.25F, false);
		r11.setTextureOffset(208, 106).addBox(-3.0F, -15.75F, -4.5F, 6.0F, 15.0F, 1.0F, -0.25F, false);
		r11.setTextureOffset(204, 106).addBox(-4.0F, -16.375F, -6.875F, 8.0F, 2.0F, 7.0F, -0.125F, false);
		r11.setTextureOffset(189, 144).addBox(-4.0F, -17.625F, -6.4375F, 8.0F, 2.0F, 3.0F, -0.625F, false);

		Slant5 = new ModelRenderer(this);
		Slant5.setRotationPoint(0.0F, -0.5F, -8.5F);
		r11.addChild(Slant5);
		setRotationAngle(Slant5, 0.4363F, 0.0F, 0.0F);
		Slant5.setTextureOffset(193, 152).addBox(-3.5F, 0.4896F, 1.336F, 7.0F, 1.0F, 2.0F, -0.25F, false);
		Slant5.setTextureOffset(210, 196).addBox(3.0F, 0.4896F, 1.336F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		Slant5.setTextureOffset(210, 196).addBox(-4.0F, 0.4896F, 1.336F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		Slant5.setTextureOffset(193, 152).addBox(-3.0F, 0.4896F, 2.836F, 6.0F, 1.0F, 2.0F, -0.25F, false);

		r12 = new ModelRenderer(this);
		r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		BaseSlants.addChild(r12);
		setRotationAngle(r12, 0.0F, 1.0472F, 0.0F);
		r12.setTextureOffset(202, 148).addBox(-4.0F, -0.75F, -7.0F, 8.0F, 1.0F, 1.0F, -0.25F, false);
		r12.setTextureOffset(208, 106).addBox(-3.0F, -15.75F, -4.5F, 6.0F, 15.0F, 1.0F, -0.25F, false);
		r12.setTextureOffset(204, 106).addBox(-4.0F, -16.375F, -6.875F, 8.0F, 2.0F, 7.0F, -0.125F, false);
		r12.setTextureOffset(189, 144).addBox(-4.0F, -17.625F, -6.4375F, 8.0F, 2.0F, 3.0F, -0.625F, false);

		Slant6 = new ModelRenderer(this);
		Slant6.setRotationPoint(0.0F, -0.5F, -8.5F);
		r12.addChild(Slant6);
		setRotationAngle(Slant6, 0.4363F, 0.0F, 0.0F);
		Slant6.setTextureOffset(193, 152).addBox(-3.5F, 0.4896F, 1.336F, 7.0F, 1.0F, 2.0F, -0.25F, false);
		Slant6.setTextureOffset(210, 196).addBox(3.0F, 0.4896F, 1.336F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		Slant6.setTextureOffset(210, 196).addBox(-4.0F, 0.4896F, 1.336F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		Slant6.setTextureOffset(193, 152).addBox(-3.0F, 0.4896F, 2.836F, 6.0F, 1.0F, 2.0F, -0.25F, false);

		Panels = new ModelRenderer(this);
		Panels.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panelstands.addChild(Panels);
		

		Undercarrage = new ModelRenderer(this);
		Undercarrage.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(Undercarrage);
		

		Rot0 = new ModelRenderer(this);
		Rot0.setRotationPoint(0.0F, 0.0F, 0.0F);
		Undercarrage.addChild(Rot0);
		Rot0.setTextureOffset(222, 146).addBox(-7.0F, -12.5F, -13.0F, 14.0F, 1.0F, 2.0F, 0.0F, false);
		Rot0.setTextureOffset(207, 111).addBox(-6.5067F, -12.5F, -12.953F, 13.0F, 1.0F, 1.0F, 0.125F, false);
		Rot0.setTextureOffset(207, 111).addBox(-6.5067F, -12.5F, 11.953F, 13.0F, 1.0F, 1.0F, 0.125F, false);
		Rot0.setTextureOffset(222, 146).addBox(-7.0F, -12.5F, 11.0F, 14.0F, 1.0F, 2.0F, 0.0F, false);
		Rot0.setTextureOffset(222, 146).addBox(-7.0F, -12.5625F, -12.0F, 14.0F, 1.0F, 24.0F, -0.125F, false);

		Rot60 = new ModelRenderer(this);
		Rot60.setRotationPoint(0.0F, 0.0F, 0.0F);
		Undercarrage.addChild(Rot60);
		setRotationAngle(Rot60, 0.0F, -1.0472F, 0.0F);
		Rot60.setTextureOffset(222, 146).addBox(-7.0F, -12.5F, -13.0F, 14.0F, 1.0F, 2.0F, 0.0F, false);
		Rot60.setTextureOffset(222, 146).addBox(-7.0F, -12.5F, 11.0F, 14.0F, 1.0F, 2.0F, 0.0F, false);
		Rot60.setTextureOffset(222, 146).addBox(-7.0F, -12.5625F, -12.0F, 14.0F, 1.0F, 24.0F, -0.125F, false);
		Rot60.setTextureOffset(207, 111).addBox(-6.5067F, -12.5F, -12.953F, 13.0F, 1.0F, 1.0F, 0.125F, false);
		Rot60.setTextureOffset(207, 111).addBox(-6.5067F, -12.5F, 11.953F, 13.0F, 1.0F, 1.0F, 0.125F, false);

		Rot120 = new ModelRenderer(this);
		Rot120.setRotationPoint(0.0F, 0.0F, 0.0F);
		Undercarrage.addChild(Rot120);
		setRotationAngle(Rot120, 0.0F, -2.0944F, 0.0F);
		Rot120.setTextureOffset(222, 146).addBox(-7.0F, -12.5F, -13.0F, 14.0F, 1.0F, 2.0F, 0.0F, false);
		Rot120.setTextureOffset(222, 146).addBox(-7.0F, -12.5F, 11.0F, 14.0F, 1.0F, 2.0F, 0.0F, false);
		Rot120.setTextureOffset(222, 146).addBox(-7.0F, -12.5625F, -12.0F, 14.0F, 1.0F, 24.0F, -0.125F, false);
		Rot120.setTextureOffset(207, 111).addBox(-6.5067F, -12.5F, -12.953F, 13.0F, 1.0F, 1.0F, 0.125F, false);
		Rot120.setTextureOffset(207, 111).addBox(-6.5067F, -12.5F, 11.953F, 13.0F, 1.0F, 1.0F, 0.125F, false);

		PanelDividers = new ModelRenderer(this);
		PanelDividers.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(PanelDividers);
		

		r0 = new ModelRenderer(this);
		r0.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelDividers.addChild(r0);
		r0.setTextureOffset(222, 146).addBox(13.0625F, -13.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.25F, false);

		Slant7 = new ModelRenderer(this);
		Slant7.setRotationPoint(15.1717F, -12.9561F, 0.0F);
		r0.addChild(Slant7);
		setRotationAngle(Slant7, 0.0F, 0.0F, 0.384F);
		Slant7.setTextureOffset(222, 146).addBox(-9.0058F, 0.0757F, -1.0F, 9.0F, 2.0F, 2.0F, -0.25F, false);

		r60 = new ModelRenderer(this);
		r60.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelDividers.addChild(r60);
		setRotationAngle(r60, 0.0F, -1.0472F, 0.0F);
		r60.setTextureOffset(222, 146).addBox(13.0625F, -13.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.25F, false);

		Slant8 = new ModelRenderer(this);
		Slant8.setRotationPoint(15.1717F, -12.9561F, 0.0F);
		r60.addChild(Slant8);
		setRotationAngle(Slant8, 0.0F, 0.0F, 0.384F);
		Slant8.setTextureOffset(222, 146).addBox(-9.0058F, 0.0757F, -1.0F, 9.0F, 2.0F, 2.0F, -0.25F, false);

		r120 = new ModelRenderer(this);
		r120.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelDividers.addChild(r120);
		setRotationAngle(r120, 0.0F, -2.0944F, 0.0F);
		r120.setTextureOffset(222, 146).addBox(13.0625F, -13.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.25F, false);

		Slant9 = new ModelRenderer(this);
		Slant9.setRotationPoint(15.1717F, -12.9561F, 0.0F);
		r120.addChild(Slant9);
		setRotationAngle(Slant9, 0.0F, 0.0F, 0.384F);
		Slant9.setTextureOffset(222, 146).addBox(-9.0058F, 0.0757F, -1.0F, 9.0F, 2.0F, 2.0F, -0.25F, false);

		r180 = new ModelRenderer(this);
		r180.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelDividers.addChild(r180);
		setRotationAngle(r180, 0.0F, 3.1416F, 0.0F);
		r180.setTextureOffset(222, 146).addBox(13.0625F, -13.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.25F, false);

		Slant10 = new ModelRenderer(this);
		Slant10.setRotationPoint(15.1717F, -12.9561F, 0.0F);
		r180.addChild(Slant10);
		setRotationAngle(Slant10, 0.0F, 0.0F, 0.384F);
		Slant10.setTextureOffset(222, 146).addBox(-9.0058F, 0.0757F, -1.0F, 9.0F, 2.0F, 2.0F, -0.25F, false);

		r_120 = new ModelRenderer(this);
		r_120.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelDividers.addChild(r_120);
		setRotationAngle(r_120, 0.0F, 2.0944F, 0.0F);
		r_120.setTextureOffset(222, 146).addBox(13.0625F, -13.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.25F, false);

		Slant11 = new ModelRenderer(this);
		Slant11.setRotationPoint(15.1717F, -12.9561F, 0.0F);
		r_120.addChild(Slant11);
		setRotationAngle(Slant11, 0.0F, 0.0F, 0.384F);
		Slant11.setTextureOffset(222, 146).addBox(-9.0058F, 0.0757F, -1.0F, 9.0F, 2.0F, 2.0F, -0.25F, false);

		r_60 = new ModelRenderer(this);
		r_60.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelDividers.addChild(r_60);
		setRotationAngle(r_60, 0.0F, 1.0472F, 0.0F);
		r_60.setTextureOffset(222, 146).addBox(13.0625F, -13.0F, -1.0F, 2.0F, 2.0F, 2.0F, -0.25F, false);

		Slant12 = new ModelRenderer(this);
		Slant12.setRotationPoint(15.1717F, -12.9561F, 0.0F);
		r_60.addChild(Slant12);
		setRotationAngle(Slant12, 0.0F, 0.0F, 0.384F);
		Slant12.setTextureOffset(222, 146).addBox(-9.0058F, 0.0757F, -1.0F, 9.0F, 2.0F, 2.0F, -0.25F, false);

		CPanel1 = new ModelRenderer(this);
		CPanel1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(CPanel1);
		

		Main = new ModelRenderer(this);
		Main.setRotationPoint(0.5F, -12.5F, -13.0F);
		CPanel1.addChild(Main);
		setRotationAngle(Main, 0.4538F, 0.0F, 0.0F);
		Main.setTextureOffset(222, 146).addBox(-7.5F, 0.125F, 0.0F, 14.0F, 1.0F, 2.0F, 0.0F, false);
		Main.setTextureOffset(222, 146).addBox(-6.5F, 0.125F, 2.0F, 12.0F, 1.0F, 2.0F, 0.0F, false);
		Main.setTextureOffset(222, 146).addBox(-5.5F, 0.125F, 4.0F, 10.0F, 1.0F, 2.0F, 0.0F, false);
		Main.setTextureOffset(222, 146).addBox(-4.5F, 0.125F, 6.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		CPanel2 = new ModelRenderer(this);
		CPanel2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(CPanel2);
		setRotationAngle(CPanel2, 0.0F, -1.0472F, 0.0F);
		

		Main2 = new ModelRenderer(this);
		Main2.setRotationPoint(0.5F, -12.5F, -13.0F);
		CPanel2.addChild(Main2);
		setRotationAngle(Main2, 0.4538F, 0.0F, 0.0F);
		Main2.setTextureOffset(222, 146).addBox(-7.5F, 0.125F, 0.0F, 14.0F, 1.0F, 2.0F, 0.0F, false);
		Main2.setTextureOffset(222, 146).addBox(-3.5F, -0.3125F, 1.0F, 6.0F, 1.0F, 1.0F, -0.375F, false);
		Main2.setTextureOffset(222, 146).addBox(-3.5F, -0.3125F, 3.75F, 6.0F, 1.0F, 1.0F, -0.375F, false);
		Main2.setTextureOffset(222, 146).addBox(-6.5F, 0.125F, 2.0F, 12.0F, 1.0F, 2.0F, 0.0F, false);
		Main2.setTextureOffset(222, 146).addBox(-5.5F, 0.125F, 4.0F, 10.0F, 1.0F, 2.0F, 0.0F, false);
		Main2.setTextureOffset(222, 146).addBox(-4.5F, 0.125F, 6.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		CPanel3 = new ModelRenderer(this);
		CPanel3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(CPanel3);
		setRotationAngle(CPanel3, 0.0F, -2.0944F, 0.0F);
		

		Main3 = new ModelRenderer(this);
		Main3.setRotationPoint(0.5F, -12.5F, -13.0F);
		CPanel3.addChild(Main3);
		setRotationAngle(Main3, 0.4538F, 0.0F, 0.0F);
		Main3.setTextureOffset(222, 146).addBox(-7.5F, 0.125F, 0.0F, 14.0F, 1.0F, 2.0F, 0.0F, false);
		Main3.setTextureOffset(222, 146).addBox(-6.5F, 0.125F, 2.0F, 12.0F, 1.0F, 2.0F, 0.0F, false);
		Main3.setTextureOffset(222, 146).addBox(-5.5F, 0.125F, 4.0F, 10.0F, 1.0F, 2.0F, 0.0F, false);
		Main3.setTextureOffset(222, 146).addBox(-4.5F, 0.125F, 6.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		CPanel4 = new ModelRenderer(this);
		CPanel4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(CPanel4);
		setRotationAngle(CPanel4, 0.0F, 3.1416F, 0.0F);
		

		Main4 = new ModelRenderer(this);
		Main4.setRotationPoint(0.5F, -12.5F, -13.0F);
		CPanel4.addChild(Main4);
		setRotationAngle(Main4, 0.4538F, 0.0F, 0.0F);
		Main4.setTextureOffset(222, 146).addBox(-7.5F, 0.125F, 0.0F, 14.0F, 1.0F, 2.0F, 0.0F, false);
		Main4.setTextureOffset(222, 146).addBox(-6.5F, 0.125F, 2.0F, 12.0F, 1.0F, 2.0F, 0.0F, false);
		Main4.setTextureOffset(222, 146).addBox(-5.5F, 0.125F, 4.0F, 10.0F, 1.0F, 2.0F, 0.0F, false);
		Main4.setTextureOffset(222, 146).addBox(-4.5F, 0.125F, 6.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		CPanel5 = new ModelRenderer(this);
		CPanel5.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(CPanel5);
		setRotationAngle(CPanel5, 0.0F, 2.0944F, 0.0F);
		

		Main5 = new ModelRenderer(this);
		Main5.setRotationPoint(0.5F, -12.5F, -13.0F);
		CPanel5.addChild(Main5);
		setRotationAngle(Main5, 0.4538F, 0.0F, 0.0F);
		Main5.setTextureOffset(222, 146).addBox(-7.5F, 0.125F, 0.0F, 14.0F, 1.0F, 2.0F, 0.0F, false);
		Main5.setTextureOffset(222, 146).addBox(-6.5F, 0.125F, 2.0F, 12.0F, 1.0F, 2.0F, 0.0F, false);
		Main5.setTextureOffset(222, 146).addBox(-5.5F, 0.125F, 4.0F, 10.0F, 1.0F, 2.0F, 0.0F, false);
		Main5.setTextureOffset(222, 146).addBox(-4.5F, 0.125F, 6.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);

		CPanel6 = new ModelRenderer(this);
		CPanel6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(CPanel6);
		setRotationAngle(CPanel6, 0.0F, 1.0472F, 0.0F);
		

		Main6 = new ModelRenderer(this);
		Main6.setRotationPoint(0.5F, -12.5F, -13.0F);
		CPanel6.addChild(Main6);
		setRotationAngle(Main6, 0.4538F, 0.0F, 0.0F);
		Main6.setTextureOffset(222, 146).addBox(-7.5F, 0.125F, 0.0F, 14.0F, 1.0F, 2.0F, 0.0F, false);
		Main6.setTextureOffset(222, 146).addBox(-6.5F, 0.125F, 2.0F, 12.0F, 1.0F, 2.0F, 0.0F, false);
		Main6.setTextureOffset(222, 146).addBox(-5.5F, 0.125F, 4.0F, 10.0F, 1.0F, 2.0F, 0.0F, false);
		Main6.setTextureOffset(222, 146).addBox(-4.5F, 0.125F, 6.0F, 8.0F, 1.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {

	}

	@Override
	public void render(ValeConsoleTile tile, float v, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v1, float v2, float v3, float v4) {
		net.tardis.mod.controls.RandomiserControl randomiserControl = tile.getControl(net.tardis.mod.controls.RandomiserControl.class);
		this.RandomiserControl.rotateAngleY = (float) Math.toRadians(randomiserControl.getAnimationProgress() * 720.0F );

		HandbrakeControl handbrake = tile.getControl(HandbrakeControl.class);
		if (!handbrake.isFree()) {
			handbrakelever.rotationPointZ = -0.1F;
			handbrakelever.rotationPointY = 0.05F;
			handbrakelever.rotationPointX = 0.0F;
		} else {
			handbrakelever.rotationPointZ = -0.01F;
			handbrakelever.rotationPointY = 0.005F;
			handbrakelever.rotationPointX = 0.0F;
		}

		RefuelerControl refuelerControl = tile.getControl(RefuelerControl.class);
		if (refuelerControl.isRefueling()) {
			refuel.rotateAngleX = (float) (Math.toRadians(-50f));
			refuel2.rotateAngleX = (float) (Math.toRadians(40f));
			refuel3.rotateAngleX = (float) (Math.toRadians(25f));
		} else {
			refuel.rotateAngleX = (float) (Math.toRadians(50f));
			refuel2.rotateAngleX = (float) (Math.toRadians(-25f));
			refuel3.rotateAngleX = (float) (Math.toRadians(-35f));
		}

		LandingTypeControl landingTypeControl = tile.getControl(LandingTypeControl.class);
		if (landingTypeControl.getLandType() == LandingTypeControl.EnumLandType.DOWN) {
			landingtype.rotateAngleX = (float) (Math.toRadians(45F));
		} else {
			landingtype.rotateAngleX = (float) (Math.toRadians(-45F));
		}


		this.TimeRotor.rotateAngleY = (float)Math.toRadians((double)(tile.flightTicks * 2 % 360));
		this.TimeRotor.rotationPointY = - (float)Math.cos((double)tile.flightTicks * 0.1D) * 0.05F;

		net.tardis.mod.controls.RandomiserControl random = tile.getControl(RandomiserControl.class);
		float randomOff = random.getAnimationTicks() == 0 ? 0 : 0.006F;
		//this.random_but_1.offsetY = this.random_but_6.offsetY = this.random_but_8.offsetY = randomOff;

		ThrottleControl throttleA = tile.getControl(ThrottleControl.class);
		this.throttle.rotationPointZ = -0.1F + throttleA.getAmount() * 0.1F;
		this.throttle.rotationPointY = 0.05F + throttleA.getAmount() * -0.05F;
		tile.getDoor().ifPresent(door -> {
			this.doorcontrol.rotationPointZ = door.getOpenState() == EnumDoorState.CLOSED ? -0.0F : 0.11F;
			this.doorcontrol.rotationPointY = door.getOpenState() == EnumDoorState.CLOSED ? -0.0F : -0.055F;
		});


		IncModControl inc = tile.getControl(IncModControl.class);
		this.Switch.rotateAngleX = (float) Math.toRadians(((inc.index / (float)IncModControl.COORD_MODS.length) * 100.0F) - 50.0F);

		XControl x = tile.getControl(XControl.class);
		//this.x.offsetY = x.getAnimationTicks() == 0 ? 0 : 0.006F;

		YControl y = tile.getControl(YControl.class);
		//this.y.offsetY = y.getAnimationTicks() == 0 ? 0 : 0.006F;

		ZControl z = tile.getControl(ZControl.class);
		//this.z.offsetY = z.getAnimationTicks() == 0 ? 0 : 0.006F;

		MainBase.render(matrixStack, iVertexBuilder, i, i1);

		//TODO Find out wtf this below is
		//WorldText text = new WorldText(0.22F, 0.15F, 0.002F, 0xFFFFFF);
		//text.renderMonitor(Helper.getConsoleText(tile));
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}