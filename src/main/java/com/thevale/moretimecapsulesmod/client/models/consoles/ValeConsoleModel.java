package com.thevale.moretimecapsulesmod.client.models.consoles;// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.util.Direction;
import net.tardis.mod.controls.*;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.tileentities.ConsoleTile;

public class ValeConsoleModel extends Model {
	private final RendererModel MainBase;
	private final RendererModel SwivelLevers;
	private final RendererModel facingcontrol;
	private final RendererModel SwivelLever7;
	private final RendererModel bone4;
	private final RendererModel SwivelLever4;
	private final RendererModel SwivelLever2;
	private final RendererModel SwivelLever3;
	private final RendererModel RandomiserControl;
	private final RendererModel SwivelLever5;
	private final RendererModel SwivelLever6;
	private final RendererModel SwivelLever8;
	private final RendererModel SwivelLever9;
	private final RendererModel Switches4;
	private final RendererModel Base20;
	private final RendererModel landingtype;
	private final RendererModel Base21;
	private final RendererModel Switches3;
	private final RendererModel Base14;
	private final RendererModel Switch13;
	private final RendererModel Base16;
	private final RendererModel Switch15;
	private final RendererModel Base17;
	private final RendererModel Switch16;
	private final RendererModel Base15;
	private final RendererModel Switch14;
	private final RendererModel RadBox;
	private final RendererModel Box;
	private final RendererModel Base12;
	private final RendererModel Box2;
	private final RendererModel Base13;
	private final RendererModel bone5;
	private final RendererModel TMControls;
	private final RendererModel HandbrakeAll;
	private final RendererModel Base;
	private final RendererModel handbrakelever;
	private final RendererModel ThrottleAll;
	private final RendererModel Base2;
	private final RendererModel throttle;
	private final RendererModel verticallanding3;
	private final RendererModel Base3;
	private final RendererModel DoorSwitch;
	private final RendererModel Base4;
	private final RendererModel doorcontrol;
	private final RendererModel Controls26;
	private final RendererModel Indicators;
	private final RendererModel Base5;
	private final RendererModel Switches;
	private final RendererModel Base6;
	private final RendererModel Switch;
	private final RendererModel Switch2;
	private final RendererModel Switch3;
	private final RendererModel Switch4;
	private final RendererModel Switch5;
	private final RendererModel Switch6;
	private final RendererModel Switches2;
	private final RendererModel Base8;
	private final RendererModel refuel;
	private final RendererModel Switch8;
	private final RendererModel refuel2;
	private final RendererModel Switch10;
	private final RendererModel Switch11;
	private final RendererModel refuel3;
	private final RendererModel SpeakersLightsGrates;
	private final RendererModel Base7;
	private final RendererModel SpeakersLightsGrates2;
	private final RendererModel Base11;
	private final RendererModel RedBall2;
	private final RendererModel Base10;
	private final RendererModel RedBall;
	private final RendererModel Base9;
	private final RendererModel TimeRotor;
	private final RendererModel Centre;
	private final RendererModel Ring;
	private final RendererModel bone;
	private final RendererModel an;
	private final RendererModel an4;
	private final RendererModel an5;
	private final RendererModel an6;
	private final RendererModel an7;
	private final RendererModel an10;
	private final RendererModel an11;
	private final RendererModel an12;
	private final RendererModel Ring3;
	private final RendererModel bone3;
	private final RendererModel an2;
	private final RendererModel an3;
	private final RendererModel an8;
	private final RendererModel an9;
	private final RendererModel an13;
	private final RendererModel an14;
	private final RendererModel an19;
	private final RendererModel an20;
	private final RendererModel Ring2;
	private final RendererModel bone2;
	private final RendererModel an15;
	private final RendererModel an16;
	private final RendererModel an17;
	private final RendererModel an18;
	private final RendererModel an21;
	private final RendererModel an22;
	private final RendererModel an23;
	private final RendererModel an24;
	private final RendererModel Panelstands;
	private final RendererModel Stand;
	private final RendererModel Dividers;
	private final RendererModel r1;
	private final RendererModel Panel1;
	private final RendererModel Panel2;
	private final RendererModel r2;
	private final RendererModel Panel3;
	private final RendererModel Panel4;
	private final RendererModel r3;
	private final RendererModel Panel5;
	private final RendererModel Panel6;
	private final RendererModel r4;
	private final RendererModel Panel7;
	private final RendererModel Panel8;
	private final RendererModel r5;
	private final RendererModel Panel9;
	private final RendererModel Panel10;
	private final RendererModel r6;
	private final RendererModel Panel11;
	private final RendererModel Panel12;
	private final RendererModel Edgeing;
	private final RendererModel p1;
	private final RendererModel p2;
	private final RendererModel p3;
	private final RendererModel InnerStandPanels;
	private final RendererModel BaseSlants;
	private final RendererModel r7;
	private final RendererModel Slant;
	private final RendererModel r8;
	private final RendererModel Slant2;
	private final RendererModel r9;
	private final RendererModel Slant3;
	private final RendererModel r10;
	private final RendererModel Slant4;
	private final RendererModel r11;
	private final RendererModel Slant5;
	private final RendererModel r12;
	private final RendererModel Slant6;
	private final RendererModel Panels;
	private final RendererModel Undercarrage;
	private final RendererModel Rot0;
	private final RendererModel Rot60;
	private final RendererModel Rot120;
	private final RendererModel PanelDividers;
	private final RendererModel r0;
	private final RendererModel Slant7;
	private final RendererModel r60;
	private final RendererModel Slant8;
	private final RendererModel r120;
	private final RendererModel Slant9;
	private final RendererModel r180;
	private final RendererModel Slant10;
	private final RendererModel r_120;
	private final RendererModel Slant11;
	private final RendererModel r_60;
	private final RendererModel Slant12;
	private final RendererModel CPanel1;
	private final RendererModel Main;
	private final RendererModel CPanel2;
	private final RendererModel Main2;
	private final RendererModel CPanel3;
	private final RendererModel Main3;
	private final RendererModel CPanel4;
	private final RendererModel Main4;
	private final RendererModel CPanel5;
	private final RendererModel Main5;
	private final RendererModel CPanel6;
	private final RendererModel Main6;

	public ValeConsoleModel() {
		textureWidth = 256;
		textureHeight = 256;

		MainBase = new RendererModel(this);
		MainBase.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		SwivelLevers = new RendererModel(this);
		SwivelLevers.setRotationPoint(0.0F, 0.0F, 0.0F);
		MainBase.addChild(SwivelLevers);
		

		facingcontrol = new RendererModel(this);
		facingcontrol.setRotationPoint(-12.625F, -12.5F, -1.5F);
		SwivelLevers.addChild(facingcontrol);
		setRotationAngle(facingcontrol, 0.0F, 1.0472F, 0.0F);
		facingcontrol.cubeList.add(new ModelBox(facingcontrol, 198, 140, -0.4865F, -1.4375F, -1.5039F, 1, 1, 2, -0.375F, false));
		facingcontrol.cubeList.add(new ModelBox(facingcontrol, 203, 200, -0.4865F, -1.4375F, -0.5039F, 1, 1, 1, -0.25F, false));

		SwivelLever7 = new RendererModel(this);
		SwivelLever7.setRotationPoint(0.0F, -1.0F, 0.0F);
		SwivelLevers.addChild(SwivelLever7);
		setRotationAngle(SwivelLever7, 0.0F, 1.0472F, 0.0F);
		SwivelLever7.cubeList.add(new ModelBox(SwivelLever7, 198, 140, -4.5F, -12.9375F, -13.1875F, 1, 1, 2, -0.375F, false));
		SwivelLever7.cubeList.add(new ModelBox(SwivelLever7, 203, 200, -4.5F, -12.9375F, -12.1875F, 1, 1, 1, -0.25F, false));
		SwivelLever7.cubeList.add(new ModelBox(SwivelLever7, 211, 118, -5.0F, -12.875F, -12.6875F, 2, 2, 2, -0.6875F, false));

		bone4 = new RendererModel(this);
		bone4.setRotationPoint(-0.049F, -11.5F, -2.8164F);
		SwivelLever7.addChild(bone4);
		setRotationAngle(bone4, 0.0F, -1.5708F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 211, 118, -9.875F, -1.375F, 3.9375F, 2, 2, 2, -0.6875F, false));

		SwivelLever4 = new RendererModel(this);
		SwivelLever4.setRotationPoint(0.0F, -1.0F, 0.0F);
		SwivelLevers.addChild(SwivelLever4);
		setRotationAngle(SwivelLever4, 0.0F, 2.0944F, 0.0F);
		SwivelLever4.cubeList.add(new ModelBox(SwivelLever4, 198, 140, -5.5F, -13.0F, -13.1875F, 1, 1, 2, -0.375F, false));
		SwivelLever4.cubeList.add(new ModelBox(SwivelLever4, 203, 200, -5.5F, -12.9375F, -12.1875F, 1, 1, 1, -0.25F, false));
		SwivelLever4.cubeList.add(new ModelBox(SwivelLever4, 211, 118, -6.0F, -12.875F, -12.6875F, 2, 2, 2, -0.6875F, false));

		SwivelLever2 = new RendererModel(this);
		SwivelLever2.setRotationPoint(0.0F, -1.0F, 0.0F);
		SwivelLevers.addChild(SwivelLever2);
		setRotationAngle(SwivelLever2, 0.0F, 2.0944F, 0.0F);
		SwivelLever2.cubeList.add(new ModelBox(SwivelLever2, 198, 140, -4.625F, -13.25F, -12.8125F, 1, 1, 2, -0.375F, false));
		SwivelLever2.cubeList.add(new ModelBox(SwivelLever2, 203, 200, -4.625F, -13.1875F, -11.8125F, 1, 1, 1, -0.25F, false));
		SwivelLever2.cubeList.add(new ModelBox(SwivelLever2, 211, 118, -5.125F, -13.125F, -12.3125F, 2, 2, 2, -0.6875F, false));

		SwivelLever3 = new RendererModel(this);
		SwivelLever3.setRotationPoint(0.0F, -1.0F, 0.0F);
		SwivelLevers.addChild(SwivelLever3);
		setRotationAngle(SwivelLever3, 0.0F, 1.0472F, 0.0F);
		SwivelLever3.cubeList.add(new ModelBox(SwivelLever3, 211, 118, -1.0F, -14.125F, -10.1875F, 2, 2, 2, -0.6875F, false));

		RandomiserControl = new RendererModel(this);
		RandomiserControl.setRotationPoint(0.0F, -13.6875F, -9.1875F);
		SwivelLever3.addChild(RandomiserControl);
		setRotationAngle(RandomiserControl, 0.0F, 0.829F, 0.0F);
		RandomiserControl.cubeList.add(new ModelBox(RandomiserControl, 198, 140, -0.5F, -0.5F, -1.5F, 1, 1, 2, -0.375F, false));
		RandomiserControl.cubeList.add(new ModelBox(RandomiserControl, 203, 200, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));

		SwivelLever5 = new RendererModel(this);
		SwivelLever5.setRotationPoint(0.0F, -1.0F, 0.0F);
		SwivelLevers.addChild(SwivelLever5);
		setRotationAngle(SwivelLever5, 0.0F, 2.0944F, 0.0F);
		SwivelLever5.cubeList.add(new ModelBox(SwivelLever5, 198, 140, -1.0F, -14.25F, -10.5625F, 1, 1, 2, -0.375F, false));
		SwivelLever5.cubeList.add(new ModelBox(SwivelLever5, 203, 200, -1.0F, -14.1875F, -9.5625F, 1, 1, 1, -0.25F, false));
		SwivelLever5.cubeList.add(new ModelBox(SwivelLever5, 211, 118, -1.5F, -14.125F, -10.0625F, 2, 2, 2, -0.6875F, false));

		SwivelLever6 = new RendererModel(this);
		SwivelLever6.setRotationPoint(0.0F, -1.0F, 0.0F);
		SwivelLevers.addChild(SwivelLever6);
		setRotationAngle(SwivelLever6, 0.0F, 2.0944F, 0.0F);
		SwivelLever6.cubeList.add(new ModelBox(SwivelLever6, 198, 140, 0.0F, -14.25F, -10.5625F, 1, 1, 2, -0.375F, false));
		SwivelLever6.cubeList.add(new ModelBox(SwivelLever6, 203, 200, 0.0F, -14.1875F, -9.5625F, 1, 1, 1, -0.25F, false));
		SwivelLever6.cubeList.add(new ModelBox(SwivelLever6, 211, 118, -0.5F, -14.125F, -10.0625F, 2, 2, 2, -0.6875F, false));

		SwivelLever8 = new RendererModel(this);
		SwivelLever8.setRotationPoint(0.0F, -1.0F, 0.0F);
		SwivelLevers.addChild(SwivelLever8);
		setRotationAngle(SwivelLever8, 0.0F, -1.0472F, 0.0F);
		SwivelLever8.cubeList.add(new ModelBox(SwivelLever8, 198, 140, 2.0F, -13.75F, -12.0625F, 1, 1, 2, -0.375F, false));
		SwivelLever8.cubeList.add(new ModelBox(SwivelLever8, 198, 140, -3.0F, -13.75F, -12.0625F, 1, 1, 2, -0.375F, false));
		SwivelLever8.cubeList.add(new ModelBox(SwivelLever8, 203, 200, 2.0F, -13.6875F, -11.0625F, 1, 1, 1, -0.25F, false));
		SwivelLever8.cubeList.add(new ModelBox(SwivelLever8, 203, 200, -3.0F, -13.6875F, -11.0625F, 1, 1, 1, -0.25F, false));
		SwivelLever8.cubeList.add(new ModelBox(SwivelLever8, 209, 112, 1.5F, -13.625F, -11.5625F, 2, 2, 2, -0.6875F, false));

		SwivelLever9 = new RendererModel(this);
		SwivelLever9.setRotationPoint(0.0F, -1.0F, 0.0F);
		SwivelLevers.addChild(SwivelLever9);
		setRotationAngle(SwivelLever9, 0.0F, -1.0472F, 0.0F);
		SwivelLever9.cubeList.add(new ModelBox(SwivelLever9, 209, 112, -3.5F, -13.625F, -11.5625F, 2, 2, 2, -0.6875F, false));

		Switches4 = new RendererModel(this);
		Switches4.setRotationPoint(0.0F, 0.0F, 0.0F);
		MainBase.addChild(Switches4);
		setRotationAngle(Switches4, 0.0F, 1.0472F, 0.0F);
		

		Base20 = new RendererModel(this);
		Base20.setRotationPoint(7.5625F, -12.5F, -13.0F);
		Switches4.addChild(Base20);
		setRotationAngle(Base20, 0.4538F, 0.0F, 0.0F);
		Base20.cubeList.add(new ModelBox(Base20, 196, 95, -10.3125F, 0.1875F, 3.6875F, 0, 1, 1, 0.1875F, false));
		Base20.cubeList.add(new ModelBox(Base20, 187, 101, -5.5625F, 0.0F, 2.25F, 1, 1, 1, -0.0625F, false));
		Base20.cubeList.add(new ModelBox(Base20, 187, 101, -8.0625F, 0.0F, 2.25F, 1, 1, 1, -0.0625F, false));
		Base20.cubeList.add(new ModelBox(Base20, 187, 101, -9.0625F, 0.0F, 3.625F, 1, 1, 1, -0.0625F, false));
		Base20.cubeList.add(new ModelBox(Base20, 187, 101, -7.0625F, 0.0F, 3.625F, 1, 1, 1, -0.0625F, false));
		Base20.cubeList.add(new ModelBox(Base20, 187, 101, -10.5625F, 0.0F, 2.25F, 1, 1, 1, -0.0625F, false));
		Base20.cubeList.add(new ModelBox(Base20, 193, 229, -5.5625F, -0.1875F, 2.25F, 1, 1, 1, -0.125F, false));
		Base20.cubeList.add(new ModelBox(Base20, 195, 226, -8.0625F, -0.1875F, 2.25F, 1, 1, 1, -0.125F, false));
		Base20.cubeList.add(new ModelBox(Base20, 193, 229, -9.0625F, -0.1875F, 3.625F, 1, 1, 1, -0.125F, false));
		Base20.cubeList.add(new ModelBox(Base20, 201, 239, -7.0625F, -0.1875F, 3.625F, 1, 1, 1, -0.125F, false));
		Base20.cubeList.add(new ModelBox(Base20, 201, 239, -10.5625F, -0.1875F, 2.25F, 1, 1, 1, -0.125F, false));
		Base20.cubeList.add(new ModelBox(Base20, 224, 111, -9.5625F, -0.375F, 5.0625F, 4, 1, 2, -0.4375F, false));
		Base20.cubeList.add(new ModelBox(Base20, 184, 107, -9.5625F, -0.375F, 0.3125F, 4, 1, 2, -0.4375F, false));
		Base20.cubeList.add(new ModelBox(Base20, 183, 151, -5.5625F, -0.375F, 0.3125F, 2, 1, 2, -0.4375F, false));
		Base20.cubeList.add(new ModelBox(Base20, 196, 150, -11.3125F, -1.0F, 2.6875F, 2, 3, 3, -0.875F, false));

		landingtype = new RendererModel(this);
		landingtype.setRotationPoint(-10.3125F, 0.125F, 4.1875F);
		Base20.addChild(landingtype);
		setRotationAngle(landingtype, 0.7854F, 0.0F, 0.0F);
		landingtype.cubeList.add(new ModelBox(landingtype, 193, 95, -1.0F, -1.75F, -1.0F, 2, 3, 2, -0.9375F, false));
		landingtype.cubeList.add(new ModelBox(landingtype, 127, 222, -1.0F, -1.75F, -1.0F, 2, 2, 2, -0.875F, false));

		Base21 = new RendererModel(this);
		Base21.setRotationPoint(7.5625F, -12.5F, -13.0F);
		Switches4.addChild(Base21);
		setRotationAngle(Base21, 0.4538F, 0.0F, 0.0F);
		Base21.cubeList.add(new ModelBox(Base21, 224, 111, -3.4375F, 0.1875F, 2.1875F, 0, 1, 1, 0.1875F, false));
		Base21.cubeList.add(new ModelBox(Base21, 224, 111, -3.9375F, 0.1875F, 2.1875F, 0, 1, 1, 0.1875F, false));
		Base21.cubeList.add(new ModelBox(Base21, 224, 111, -2.9375F, 0.1875F, 2.1875F, 0, 1, 1, 0.1875F, false));
		Base21.cubeList.add(new ModelBox(Base21, 61, 222, -4.4375F, -1.0F, 1.1875F, 2, 3, 3, -0.875F, false));
		Base21.cubeList.add(new ModelBox(Base21, 61, 222, -4.9375F, -1.0F, 1.1875F, 2, 3, 3, -0.875F, false));
		Base21.cubeList.add(new ModelBox(Base21, 61, 222, -3.9375F, -1.0F, 1.1875F, 2, 3, 3, -0.875F, false));

		Switches3 = new RendererModel(this);
		Switches3.setRotationPoint(0.0F, 0.0F, 0.0F);
		MainBase.addChild(Switches3);
		setRotationAngle(Switches3, 0.0F, 2.0944F, 0.0F);
		

		Base14 = new RendererModel(this);
		Base14.setRotationPoint(7.5625F, -12.5F, -13.0F);
		Switches3.addChild(Base14);
		setRotationAngle(Base14, 0.4538F, 0.0F, 0.0F);
		Base14.cubeList.add(new ModelBox(Base14, 207, 120, -9.625F, 0.1875F, 1.1875F, 0, 1, 1, 0.1875F, false));
		Base14.cubeList.add(new ModelBox(Base14, 174, 149, -10.625F, -1.0F, 0.1875F, 2, 3, 3, -0.875F, false));

		Switch13 = new RendererModel(this);
		Switch13.setRotationPoint(-9.625F, -0.375F, 3.1875F);
		Base14.addChild(Switch13);
		Switch13.cubeList.add(new ModelBox(Switch13, 179, 108, -1.0F, -1.25F, -2.5F, 2, 3, 2, -0.9375F, false));
		Switch13.cubeList.add(new ModelBox(Switch13, 132, 226, -1.0F, -1.25F, -2.5F, 2, 2, 2, -0.875F, false));

		Base16 = new RendererModel(this);
		Base16.setRotationPoint(7.5625F, -12.5F, -13.0F);
		Switches3.addChild(Base16);
		setRotationAngle(Base16, 0.4538F, 0.0F, 0.0F);
		Base16.cubeList.add(new ModelBox(Base16, 207, 120, -9.625F, 0.1875F, 2.6875F, 0, 1, 1, 0.1875F, false));
		Base16.cubeList.add(new ModelBox(Base16, 174, 149, -10.625F, -1.0F, 1.6875F, 2, 3, 3, -0.875F, false));

		Switch15 = new RendererModel(this);
		Switch15.setRotationPoint(-9.625F, -0.375F, 3.1875F);
		Base16.addChild(Switch15);
		Switch15.cubeList.add(new ModelBox(Switch15, 179, 108, -1.0F, -1.25F, -1.0F, 2, 3, 2, -0.9375F, false));
		Switch15.cubeList.add(new ModelBox(Switch15, 132, 226, -1.0F, -1.25F, -1.0F, 2, 2, 2, -0.875F, false));

		Base17 = new RendererModel(this);
		Base17.setRotationPoint(7.5625F, -12.5F, -13.0F);
		Switches3.addChild(Base17);
		setRotationAngle(Base17, 0.4538F, 0.0F, 0.0F);
		Base17.cubeList.add(new ModelBox(Base17, 207, 120, -9.625F, 0.1875F, 4.1875F, 0, 1, 1, 0.1875F, false));
		Base17.cubeList.add(new ModelBox(Base17, 207, 113, -11.125F, -0.0625F, 4.1875F, 1, 1, 1, -0.0625F, false));
		Base17.cubeList.add(new ModelBox(Base17, 207, 113, -11.125F, -0.0625F, 2.6875F, 1, 1, 1, -0.0625F, false));
		Base17.cubeList.add(new ModelBox(Base17, 207, 113, -11.125F, -0.0625F, 1.1875F, 1, 1, 1, -0.0625F, false));
		Base17.cubeList.add(new ModelBox(Base17, 167, 105, -10.5F, -0.4375F, 0.5625F, 1, 1, 5, -0.4375F, false));
		Base17.cubeList.add(new ModelBox(Base17, 167, 105, -11.75F, -0.4375F, 0.5625F, 1, 1, 5, -0.4375F, false));
		Base17.cubeList.add(new ModelBox(Base17, 211, 116, -12.75F, -0.25F, 2.5625F, 2, 1, 2, -0.6875F, false));
		Base17.cubeList.add(new ModelBox(Base17, 117, 234, -6.75F, 0.0F, 1.1875F, 1, 1, 1, -0.0625F, false));
		Base17.cubeList.add(new ModelBox(Base17, 188, 100, -7.25F, -0.375F, 1.75F, 2, 1, 2, -0.5625F, false));
		Base17.cubeList.add(new ModelBox(Base17, 185, 241, -6.75F, -0.125F, 2.25F, 1, 1, 1, -0.125F, false));
		Base17.cubeList.add(new ModelBox(Base17, 208, 108, -9.25F, -0.25F, 0.5625F, 3, 1, 4, -0.6875F, false));
		Base17.cubeList.add(new ModelBox(Base17, 157, 103, -9.5625F, -0.25F, 4.0625F, 4, 1, 3, -0.6875F, false));
		Base17.cubeList.add(new ModelBox(Base17, 68, 228, -6.5625F, -0.25F, 3.5F, 3, 1, 3, -0.6875F, false));
		Base17.cubeList.add(new ModelBox(Base17, 189, 104, -6.25F, -0.25F, 0.5625F, 3, 1, 4, -0.6875F, false));
		Base17.cubeList.add(new ModelBox(Base17, 174, 149, -10.625F, -1.0F, 3.1875F, 2, 3, 3, -0.875F, false));
		Base17.cubeList.add(new ModelBox(Base17, 185, 241, -12.125F, -1.25F, 3.1875F, 3, 3, 3, -1.125F, false));
		Base17.cubeList.add(new ModelBox(Base17, 185, 241, -12.125F, -1.25F, 1.6875F, 3, 3, 3, -1.125F, false));
		Base17.cubeList.add(new ModelBox(Base17, 185, 241, -12.125F, -1.25F, 0.1875F, 3, 3, 3, -1.125F, false));

		Switch16 = new RendererModel(this);
		Switch16.setRotationPoint(-9.625F, -0.375F, 3.1875F);
		Base17.addChild(Switch16);
		Switch16.cubeList.add(new ModelBox(Switch16, 179, 108, -1.0F, -1.25F, 0.5F, 2, 3, 2, -0.9375F, false));
		Switch16.cubeList.add(new ModelBox(Switch16, 132, 226, -1.0F, -1.25F, 0.5F, 2, 2, 2, -0.875F, false));

		Base15 = new RendererModel(this);
		Base15.setRotationPoint(7.5625F, -12.5F, -13.0F);
		Switches3.addChild(Base15);
		setRotationAngle(Base15, 0.4538F, 0.0F, 0.0F);
		Base15.cubeList.add(new ModelBox(Base15, 207, 120, -9.1875F, 0.1875F, 1.1875F, 0, 1, 1, 0.1875F, false));
		Base15.cubeList.add(new ModelBox(Base15, 179, 96, -3.4375F, 0.1875F, 1.1875F, 0, 1, 1, 0.1875F, false));
		Base15.cubeList.add(new ModelBox(Base15, 179, 96, -2.9375F, 0.1875F, 1.1875F, 0, 1, 1, 0.1875F, false));
		Base15.cubeList.add(new ModelBox(Base15, 174, 149, -10.1875F, -1.0F, 0.1875F, 2, 3, 3, -0.875F, false));
		Base15.cubeList.add(new ModelBox(Base15, 58, 228, -4.4375F, -1.0F, 0.1875F, 2, 3, 3, -0.875F, false));
		Base15.cubeList.add(new ModelBox(Base15, 58, 228, -3.9375F, -1.0F, 0.1875F, 2, 3, 3, -0.875F, false));

		Switch14 = new RendererModel(this);
		Switch14.setRotationPoint(-9.625F, -0.375F, 3.1875F);
		Base15.addChild(Switch14);
		Switch14.cubeList.add(new ModelBox(Switch14, 179, 108, -0.5625F, -1.25F, -2.5F, 2, 3, 2, -0.9375F, false));
		Switch14.cubeList.add(new ModelBox(Switch14, 132, 226, -0.5625F, -1.25F, -2.5F, 2, 2, 2, -0.875F, false));

		RadBox = new RendererModel(this);
		RadBox.setRotationPoint(0.0F, 0.0F, 0.0F);
		MainBase.addChild(RadBox);
		setRotationAngle(RadBox, 0.0F, -2.0944F, 0.0F);
		

		Box = new RendererModel(this);
		Box.setRotationPoint(0.0F, 0.0F, 0.0F);
		RadBox.addChild(Box);
		

		Base12 = new RendererModel(this);
		Base12.setRotationPoint(0.5F, -12.5F, -13.0F);
		Box.addChild(Base12);
		setRotationAngle(Base12, 0.4538F, 0.0F, 0.0F);
		Base12.cubeList.add(new ModelBox(Base12, 179, 110, -4.5F, 0.0625F, 1.5F, 3, 1, 3, 0.0F, false));
		Base12.cubeList.add(new ModelBox(Base12, 194, 197, -1.0F, 0.0625F, 1.0F, 5, 1, 1, 0.0F, false));
		Base12.cubeList.add(new ModelBox(Base12, 172, 93, -2.0F, 0.0625F, 5.0F, 3, 1, 1, 0.0F, false));
		Base12.cubeList.add(new ModelBox(Base12, 228, 113, 1.5F, 0.0625F, 5.0F, 1, 1, 1, 0.0F, false));
		Base12.cubeList.add(new ModelBox(Base12, 210, 138, 2.9375F, -0.0625F, 1.0F, 1, 1, 1, -0.0625F, false));
		Base12.cubeList.add(new ModelBox(Base12, 210, 138, -0.9375F, -0.0625F, 1.0F, 1, 1, 1, -0.0625F, false));
		Base12.cubeList.add(new ModelBox(Base12, 185, 241, 1.5F, -0.125F, 5.0F, 1, 1, 1, -0.0625F, false));
		Base12.cubeList.add(new ModelBox(Base12, 121, 234, 2.9375F, -0.25F, 1.0F, 1, 1, 1, -0.125F, false));
		Base12.cubeList.add(new ModelBox(Base12, 121, 234, -0.9375F, -0.25F, 1.0F, 1, 1, 1, -0.125F, false));
		Base12.cubeList.add(new ModelBox(Base12, 206, 113, -0.75F, 0.0625F, 2.375F, 2, 1, 2, 0.0F, false));
		Base12.cubeList.add(new ModelBox(Base12, 220, 159, -0.75F, -0.3125F, 2.375F, 2, 1, 2, -0.125F, false));
		Base12.cubeList.add(new ModelBox(Base12, 206, 113, 1.75F, 0.0625F, 2.375F, 2, 1, 2, 0.0F, false));
		Base12.cubeList.add(new ModelBox(Base12, 220, 159, 1.75F, -0.3125F, 2.375F, 2, 1, 2, -0.125F, false));
		Base12.cubeList.add(new ModelBox(Base12, 227, 101, -1.4375F, -0.375F, 0.375F, 2, 1, 1, -0.4375F, false));
		Base12.cubeList.add(new ModelBox(Base12, 227, 101, 2.4375F, -0.375F, 0.375F, 2, 1, 1, -0.4375F, false));
		Base12.cubeList.add(new ModelBox(Base12, 227, 101, 1.125F, -0.375F, 0.375F, 2, 1, 1, -0.4375F, false));
		Base12.cubeList.add(new ModelBox(Base12, 227, 101, -0.125F, -0.375F, 0.375F, 2, 1, 1, -0.4375F, false));

		Box2 = new RendererModel(this);
		Box2.setRotationPoint(0.0F, 0.0F, 0.0F);
		RadBox.addChild(Box2);
		Box2.cubeList.add(new ModelBox(Box2, 152, 85, -4.0F, -14.5F, -11.5F, 3, 2, 3, -0.125F, false));

		Base13 = new RendererModel(this);
		Base13.setRotationPoint(-3.0311F, -6.6875F, 1.75F);
		Box2.addChild(Base13);
		setRotationAngle(Base13, 0.4538F, -1.0472F, 0.0F);
		

		bone5 = new RendererModel(this);
		bone5.setRotationPoint(0.5F, -11.5F, -13.0F);
		Base13.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 200, 149, -4.8439F, -0.9375F, 3.375F, 2, 1, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 224, 109, -3.4689F, -0.9375F, 2.375F, 1, 1, 1, -0.0625F, false));
		bone5.cubeList.add(new ModelBox(bone5, 224, 109, -2.4689F, -0.9375F, 2.375F, 1, 1, 1, -0.0625F, false));
		bone5.cubeList.add(new ModelBox(bone5, 224, 109, -1.4689F, -0.9375F, 2.375F, 1, 1, 1, -0.0625F, false));
		bone5.cubeList.add(new ModelBox(bone5, 224, 109, -0.4689F, -0.9375F, 2.375F, 1, 1, 1, -0.0625F, false));
		bone5.cubeList.add(new ModelBox(bone5, 224, 109, 0.5311F, -0.9375F, 2.375F, 1, 1, 1, -0.0625F, false));
		bone5.cubeList.add(new ModelBox(bone5, 224, 109, 1.5311F, -0.9375F, 2.375F, 1, 1, 1, -0.0625F, false));
		bone5.cubeList.add(new ModelBox(bone5, 79, 229, -4.8439F, -1.3125F, 3.375F, 2, 1, 2, -0.125F, false));
		bone5.cubeList.add(new ModelBox(bone5, 185, 241, -3.4689F, -1.125F, 2.375F, 1, 1, 1, -0.125F, false));
		bone5.cubeList.add(new ModelBox(bone5, 185, 241, -2.4689F, -1.125F, 2.375F, 1, 1, 1, -0.125F, false));
		bone5.cubeList.add(new ModelBox(bone5, 185, 241, -1.4689F, -1.125F, 2.375F, 1, 1, 1, -0.125F, false));
		bone5.cubeList.add(new ModelBox(bone5, 185, 241, -0.4689F, -1.125F, 2.375F, 1, 1, 1, -0.125F, false));
		bone5.cubeList.add(new ModelBox(bone5, 185, 241, 0.5311F, -1.125F, 2.375F, 1, 1, 1, -0.125F, false));
		bone5.cubeList.add(new ModelBox(bone5, 185, 241, 1.5311F, -1.125F, 2.375F, 1, 1, 1, -0.125F, false));
		bone5.cubeList.add(new ModelBox(bone5, 208, 109, -2.4689F, -1.1875F, 3.25F, 2, 1, 2, -0.25F, false));
		bone5.cubeList.add(new ModelBox(bone5, 208, 109, -0.2814F, -1.1875F, 3.25F, 2, 1, 2, -0.25F, false));
		bone5.cubeList.add(new ModelBox(bone5, 224, 109, -3.9689F, -1.375F, 0.875F, 7, 1, 2, -0.5F, false));
		bone5.cubeList.add(new ModelBox(bone5, 224, 109, -2.9689F, -1.375F, 4.875F, 5, 1, 3, -0.4375F, false));
		bone5.cubeList.add(new ModelBox(bone5, 200, 149, 2.0311F, -0.9375F, 3.375F, 2, 1, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 79, 229, 2.0311F, -1.3125F, 3.375F, 2, 1, 2, -0.125F, false));

		TMControls = new RendererModel(this);
		TMControls.setRotationPoint(0.0F, 0.0F, 0.0F);
		MainBase.addChild(TMControls);
		

		HandbrakeAll = new RendererModel(this);
		HandbrakeAll.setRotationPoint(0.0F, 0.0F, 0.0F);
		TMControls.addChild(HandbrakeAll);
		

		Base = new RendererModel(this);
		Base.setRotationPoint(0.5F, -12.5F, -13.0F);
		HandbrakeAll.addChild(Base);
		setRotationAngle(Base, 0.4538F, 0.0F, 0.0F);
		Base.cubeList.add(new ModelBox(Base, 248, 110, -4.5F, 0.0F, 1.0F, 1, 1, 3, 0.0F, false));
		Base.cubeList.add(new ModelBox(Base, 206, 147, -4.5F, -0.25F, 1.0F, 1, 1, 3, -0.125F, false));

		handbrakelever = new RendererModel(this);
		handbrakelever.setRotationPoint(0.5F, -12.5F, -13.0F);
		HandbrakeAll.addChild(handbrakelever);
		setRotationAngle(handbrakelever, 0.4538F, 0.0F, 0.0F);
		handbrakelever.cubeList.add(new ModelBox(handbrakelever, 55, 230, -4.5F, -0.5F, 3.0F, 1, 1, 1, -0.1875F, false));

		ThrottleAll = new RendererModel(this);
		ThrottleAll.setRotationPoint(2.375F, 0.0F, 0.0F);
		TMControls.addChild(ThrottleAll);
		

		Base2 = new RendererModel(this);
		Base2.setRotationPoint(0.5F, -12.5F, -13.0F);
		ThrottleAll.addChild(Base2);
		setRotationAngle(Base2, 0.4538F, 0.0F, 0.0F);
		Base2.cubeList.add(new ModelBox(Base2, 248, 110, -4.5F, 0.0F, 1.0F, 1, 1, 3, 0.0F, false));
		Base2.cubeList.add(new ModelBox(Base2, 206, 147, -4.5F, -0.25F, 1.0F, 1, 1, 3, -0.125F, false));

		throttle = new RendererModel(this);
		throttle.setRotationPoint(0.5F, -12.5F, -13.0F);
		ThrottleAll.addChild(throttle);
		setRotationAngle(throttle, 0.4538F, 0.0F, 0.0F);
		throttle.cubeList.add(new ModelBox(throttle, 118, 223, -4.5F, -0.5F, 3.0F, 1, 1, 1, -0.1875F, false));

		verticallanding3 = new RendererModel(this);
		verticallanding3.setRotationPoint(1.625F, 0.0F, 0.0F);
		TMControls.addChild(verticallanding3);
		

		Base3 = new RendererModel(this);
		Base3.setRotationPoint(0.5F, -12.5F, -13.0F);
		verticallanding3.addChild(Base3);
		setRotationAngle(Base3, 0.4538F, 0.0F, 0.0F);
		Base3.cubeList.add(new ModelBox(Base3, 198, 105, -4.9375F, 0.0F, 2.5F, 1, 1, 1, 0.0F, false));
		Base3.cubeList.add(new ModelBox(Base3, 128, 226, -4.9375F, -0.25F, 2.5F, 1, 1, 1, -0.125F, false));

		DoorSwitch = new RendererModel(this);
		DoorSwitch.setRotationPoint(0.0F, 0.0F, 0.0F);
		TMControls.addChild(DoorSwitch);
		setRotationAngle(DoorSwitch, 0.0F, -1.0472F, 0.0F);
		

		Base4 = new RendererModel(this);
		Base4.setRotationPoint(2.875F, -12.5F, -13.0F);
		DoorSwitch.addChild(Base4);
		setRotationAngle(Base4, 0.4538F, 0.0F, 0.0F);
		Base4.cubeList.add(new ModelBox(Base4, 223, 102, -3.375F, 0.0F, 1.0F, 1, 1, 3, 0.0F, false));
		Base4.cubeList.add(new ModelBox(Base4, 188, 146, -3.375F, -0.25F, 1.0F, 1, 1, 3, -0.125F, false));

		doorcontrol = new RendererModel(this);
		doorcontrol.setRotationPoint(2.875F, -12.5F, -13.0F);
		DoorSwitch.addChild(doorcontrol);
		setRotationAngle(doorcontrol, 0.4538F, 0.0F, 0.0F);
		doorcontrol.cubeList.add(new ModelBox(doorcontrol, 122, 228, -3.375F, -0.5F, 1.0F, 1, 1, 1, -0.1875F, false));

		Controls26 = new RendererModel(this);
		Controls26.setRotationPoint(0.0F, 0.0F, 0.0F);
		MainBase.addChild(Controls26);
		

		Indicators = new RendererModel(this);
		Indicators.setRotationPoint(4.875F, 0.0F, 0.0F);
		Controls26.addChild(Indicators);
		

		Base5 = new RendererModel(this);
		Base5.setRotationPoint(1.5F, -12.5F, -13.0F);
		Indicators.addChild(Base5);
		setRotationAngle(Base5, 0.4538F, 0.0F, 0.0F);
		Base5.cubeList.add(new ModelBox(Base5, 196, 104, -6.0F, 0.1875F, 1.1875F, 2, 1, 1, 0.1875F, false));
		Base5.cubeList.add(new ModelBox(Base5, 201, 150, -6.9375F, -1.0F, 0.1875F, 2, 3, 3, -0.875F, false));
		Base5.cubeList.add(new ModelBox(Base5, 127, 230, -6.9375F, -1.125F, 1.1875F, 2, 3, 2, -0.873F, false));
		Base5.cubeList.add(new ModelBox(Base5, 201, 150, -6.5625F, -1.0F, 0.1875F, 2, 3, 3, -0.875F, false));
		Base5.cubeList.add(new ModelBox(Base5, 71, 227, -6.5625F, -1.125F, 1.1875F, 2, 3, 2, -0.873F, false));
		Base5.cubeList.add(new ModelBox(Base5, 201, 150, -6.1875F, -1.0F, 0.1875F, 2, 3, 3, -0.875F, false));
		Base5.cubeList.add(new ModelBox(Base5, 71, 227, -6.1875F, -1.125F, 1.1875F, 2, 3, 2, -0.873F, false));
		Base5.cubeList.add(new ModelBox(Base5, 201, 150, -5.8125F, -1.0F, 0.1875F, 2, 3, 3, -0.875F, false));
		Base5.cubeList.add(new ModelBox(Base5, 71, 227, -5.8125F, -1.125F, 1.1875F, 2, 3, 2, -0.873F, false));
		Base5.cubeList.add(new ModelBox(Base5, 201, 150, -5.4375F, -1.0F, 0.1875F, 2, 3, 3, -0.875F, false));
		Base5.cubeList.add(new ModelBox(Base5, 71, 227, -5.4375F, -1.125F, 1.1875F, 2, 3, 2, -0.873F, false));
		Base5.cubeList.add(new ModelBox(Base5, 201, 150, -5.0625F, -1.0F, 0.1875F, 2, 3, 3, -0.875F, false));
		Base5.cubeList.add(new ModelBox(Base5, 71, 227, -5.0625F, -1.125F, 1.1875F, 2, 3, 2, -0.873F, false));

		Switches = new RendererModel(this);
		Switches.setRotationPoint(6.0625F, 0.0F, 0.0F);
		Controls26.addChild(Switches);
		

		Base6 = new RendererModel(this);
		Base6.setRotationPoint(1.5F, -12.5F, -13.0F);
		Switches.addChild(Base6);
		setRotationAngle(Base6, 0.4538F, 0.0F, 0.0F);
		Base6.cubeList.add(new ModelBox(Base6, 196, 110, -6.0F, 0.1875F, 2.6875F, 2, 1, 1, 0.1875F, false));
		Base6.cubeList.add(new ModelBox(Base6, 183, 145, -6.9375F, -1.0F, 1.6875F, 2, 3, 3, -0.875F, false));
		Base6.cubeList.add(new ModelBox(Base6, 183, 145, -6.5625F, -1.0F, 1.6875F, 2, 3, 3, -0.875F, false));
		Base6.cubeList.add(new ModelBox(Base6, 183, 145, -6.1875F, -1.0F, 1.6875F, 2, 3, 3, -0.875F, false));
		Base6.cubeList.add(new ModelBox(Base6, 183, 145, -5.8125F, -1.0F, 1.6875F, 2, 3, 3, -0.875F, false));
		Base6.cubeList.add(new ModelBox(Base6, 183, 145, -5.4375F, -1.0F, 1.6875F, 2, 3, 3, -0.875F, false));
		Base6.cubeList.add(new ModelBox(Base6, 183, 145, -5.0625F, -1.0F, 1.6875F, 2, 3, 3, -0.875F, false));

		Switch = new RendererModel(this);
		Switch.setRotationPoint(-5.9375F, 0.125F, 3.1875F);
		Base6.addChild(Switch);
		setRotationAngle(Switch, -0.6109F, 0.0F, 0.0F);
		Switch.cubeList.add(new ModelBox(Switch, 200, 106, -1.0F, -1.75F, -1.0F, 2, 3, 2, -0.9375F, false));
		Switch.cubeList.add(new ModelBox(Switch, 118, 233, -1.0F, -1.75F, -1.0F, 2, 2, 2, -0.875F, false));

		Switch2 = new RendererModel(this);
		Switch2.setRotationPoint(-5.5625F, 0.125F, 3.1875F);
		Base6.addChild(Switch2);
		setRotationAngle(Switch2, 0.6981F, 0.0F, 0.0F);
		Switch2.cubeList.add(new ModelBox(Switch2, 180, 108, -1.0F, -1.75F, -1.0F, 2, 3, 2, -0.9375F, false));
		Switch2.cubeList.add(new ModelBox(Switch2, 118, 233, -1.0F, -1.75F, -1.0F, 2, 2, 2, -0.875F, false));

		Switch3 = new RendererModel(this);
		Switch3.setRotationPoint(-5.1875F, 0.125F, 3.1875F);
		Base6.addChild(Switch3);
		setRotationAngle(Switch3, 0.5236F, 0.0F, 0.0F);
		Switch3.cubeList.add(new ModelBox(Switch3, 200, 106, -1.0F, -1.75F, -1.0F, 2, 3, 2, -0.9375F, false));
		Switch3.cubeList.add(new ModelBox(Switch3, 118, 233, -1.0F, -1.75F, -1.0F, 2, 2, 2, -0.875F, false));

		Switch4 = new RendererModel(this);
		Switch4.setRotationPoint(-4.8125F, 0.125F, 3.1875F);
		Base6.addChild(Switch4);
		setRotationAngle(Switch4, -0.1745F, 0.0F, 0.0F);
		Switch4.cubeList.add(new ModelBox(Switch4, 200, 106, -1.0F, -1.75F, -1.0F, 2, 3, 2, -0.9375F, false));
		Switch4.cubeList.add(new ModelBox(Switch4, 118, 233, -1.0F, -1.75F, -1.0F, 2, 2, 2, -0.875F, false));

		Switch5 = new RendererModel(this);
		Switch5.setRotationPoint(-4.4375F, 0.125F, 3.1875F);
		Base6.addChild(Switch5);
		setRotationAngle(Switch5, -0.8727F, 0.0F, 0.0F);
		Switch5.cubeList.add(new ModelBox(Switch5, 200, 106, -1.0F, -1.75F, -1.0F, 2, 3, 2, -0.9375F, false));
		Switch5.cubeList.add(new ModelBox(Switch5, 118, 233, -1.0F, -1.75F, -1.0F, 2, 2, 2, -0.875F, false));

		Switch6 = new RendererModel(this);
		Switch6.setRotationPoint(-4.0625F, 0.125F, 3.1875F);
		Base6.addChild(Switch6);
		setRotationAngle(Switch6, 0.8727F, 0.0F, 0.0F);
		Switch6.cubeList.add(new ModelBox(Switch6, 188, 96, -1.0F, -1.75F, -1.0F, 2, 3, 2, -0.9375F, false));
		Switch6.cubeList.add(new ModelBox(Switch6, 118, 233, -1.0F, -1.75F, -1.0F, 2, 2, 2, -0.875F, false));

		Switches2 = new RendererModel(this);
		Switches2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Controls26.addChild(Switches2);
		setRotationAngle(Switches2, 0.0F, -1.0472F, 0.0F);
		

		Base8 = new RendererModel(this);
		Base8.setRotationPoint(7.5625F, -12.5F, -13.0F);
		Switches2.addChild(Base8);
		setRotationAngle(Base8, 0.4538F, 0.0F, 0.0F);
		Base8.cubeList.add(new ModelBox(Base8, 205, 123, -8.5625F, 0.1875F, 4.6875F, 2, 1, 1, 0.1875F, false));
		Base8.cubeList.add(new ModelBox(Base8, 185, 134, -9.5F, -1.0F, 3.6875F, 2, 3, 3, -0.875F, false));
		Base8.cubeList.add(new ModelBox(Base8, 185, 134, -9.125F, -1.0F, 3.6875F, 2, 3, 3, -0.875F, false));
		Base8.cubeList.add(new ModelBox(Base8, 185, 134, -8.75F, -1.0F, 3.6875F, 2, 3, 3, -0.875F, false));
		Base8.cubeList.add(new ModelBox(Base8, 185, 134, -8.375F, -1.0F, 3.6875F, 2, 3, 3, -0.875F, false));
		Base8.cubeList.add(new ModelBox(Base8, 185, 134, -8.0F, -1.0F, 3.6875F, 2, 3, 3, -0.875F, false));
		Base8.cubeList.add(new ModelBox(Base8, 185, 134, -7.625F, -1.0F, 3.6875F, 2, 3, 3, -0.875F, false));

		refuel = new RendererModel(this);
		refuel.setRotationPoint(-9.0F, 0.125F, 5.1875F);
		Base8.addChild(refuel);
		setRotationAngle(refuel, -0.1745F, 0.0F, 0.0F);
		refuel.cubeList.add(new ModelBox(refuel, 197, 96, -0.5F, -1.75F, -1.0F, 2, 3, 2, -0.9375F, false));
		refuel.cubeList.add(new ModelBox(refuel, 118, 230, -0.5F, -1.75F, -1.0F, 2, 2, 2, -0.875F, false));

		Switch8 = new RendererModel(this);
		Switch8.setRotationPoint(-9.0F, 0.125F, 5.1875F);
		Base8.addChild(Switch8);
		setRotationAngle(Switch8, -0.1745F, 0.0F, 0.0F);
		Switch8.cubeList.add(new ModelBox(Switch8, 197, 96, -0.125F, -1.75F, -1.0F, 2, 3, 2, -0.9375F, false));
		Switch8.cubeList.add(new ModelBox(Switch8, 118, 230, -0.125F, -1.75F, -1.0F, 2, 2, 2, -0.875F, false));

		refuel2 = new RendererModel(this);
		refuel2.setRotationPoint(-9.0F, 0.125F, 5.1875F);
		Base8.addChild(refuel2);
		setRotationAngle(refuel2, -0.1745F, 0.0F, 0.0F);
		refuel2.cubeList.add(new ModelBox(refuel2, 197, 96, 0.25F, -1.75F, -1.0F, 2, 3, 2, -0.9375F, false));
		refuel2.cubeList.add(new ModelBox(refuel2, 118, 230, 0.25F, -1.75F, -1.0F, 2, 2, 2, -0.875F, false));

		Switch10 = new RendererModel(this);
		Switch10.setRotationPoint(-9.0F, 0.125F, 5.1875F);
		Base8.addChild(Switch10);
		setRotationAngle(Switch10, -0.1745F, 0.0F, 0.0F);
		Switch10.cubeList.add(new ModelBox(Switch10, 197, 96, 0.625F, -1.75F, -1.0F, 2, 3, 2, -0.9375F, false));
		Switch10.cubeList.add(new ModelBox(Switch10, 118, 230, 0.625F, -1.75F, -1.0F, 2, 2, 2, -0.875F, false));

		Switch11 = new RendererModel(this);
		Switch11.setRotationPoint(-9.0F, 0.125F, 5.1875F);
		Base8.addChild(Switch11);
		setRotationAngle(Switch11, -0.1745F, 0.0F, 0.0F);
		Switch11.cubeList.add(new ModelBox(Switch11, 197, 96, 1.0F, -1.75F, -1.0F, 2, 3, 2, -0.9375F, false));
		Switch11.cubeList.add(new ModelBox(Switch11, 118, 230, 1.0F, -1.75F, -1.0F, 2, 2, 2, -0.875F, false));

		refuel3 = new RendererModel(this);
		refuel3.setRotationPoint(-9.0F, 0.125F, 5.1875F);
		Base8.addChild(refuel3);
		setRotationAngle(refuel3, -0.1745F, 0.0F, 0.0F);
		refuel3.cubeList.add(new ModelBox(refuel3, 197, 96, 1.375F, -1.75F, -1.0F, 2, 3, 2, -0.9375F, false));
		refuel3.cubeList.add(new ModelBox(refuel3, 118, 230, 1.375F, -1.75F, -1.0F, 2, 2, 2, -0.875F, false));

		SpeakersLightsGrates = new RendererModel(this);
		SpeakersLightsGrates.setRotationPoint(1.625F, 0.0F, 0.0F);
		Controls26.addChild(SpeakersLightsGrates);
		

		Base7 = new RendererModel(this);
		Base7.setRotationPoint(0.5F, -12.5F, -13.0F);
		SpeakersLightsGrates.addChild(Base7);
		setRotationAngle(Base7, 0.4538F, 0.0F, 0.0F);
		Base7.cubeList.add(new ModelBox(Base7, 214, 99, -4.625F, -0.0625F, 4.375F, 1, 1, 1, -0.0625F, false));
		Base7.cubeList.add(new ModelBox(Base7, 185, 241, -4.625F, -0.1875F, 4.375F, 1, 1, 1, -0.125F, false));
		Base7.cubeList.add(new ModelBox(Base7, 214, 99, -0.625F, -0.0625F, 4.375F, 1, 1, 1, -0.0625F, false));
		Base7.cubeList.add(new ModelBox(Base7, 186, 120, 0.5F, -0.0625F, 4.0625F, 1, 1, 2, -0.125F, false));
		Base7.cubeList.add(new ModelBox(Base7, 185, 241, -0.625F, -0.1875F, 4.375F, 1, 1, 1, -0.125F, false));
		Base7.cubeList.add(new ModelBox(Base7, 66, 242, 0.5F, -0.4375F, 4.0625F, 1, 1, 2, -0.1875F, false));
		Base7.cubeList.add(new ModelBox(Base7, 214, 99, -1.625F, -0.0625F, 5.0F, 1, 1, 1, -0.0625F, false));
		Base7.cubeList.add(new ModelBox(Base7, 185, 241, -1.625F, -0.1875F, 5.0F, 1, 1, 1, -0.125F, false));
		Base7.cubeList.add(new ModelBox(Base7, 214, 99, -3.625F, -0.0625F, 5.0F, 1, 1, 1, -0.0625F, false));
		Base7.cubeList.add(new ModelBox(Base7, 185, 241, -3.625F, -0.1875F, 5.0F, 1, 1, 1, -0.125F, false));
		Base7.cubeList.add(new ModelBox(Base7, 214, 99, -2.625F, -0.0625F, 5.0F, 1, 1, 1, -0.0625F, false));
		Base7.cubeList.add(new ModelBox(Base7, 185, 241, -2.625F, -0.1875F, 5.0F, 1, 1, 1, -0.125F, false));
		Base7.cubeList.add(new ModelBox(Base7, 215, 113, -3.125F, -0.0625F, 4.0F, 2, 1, 1, -0.0625F, false));
		Base7.cubeList.add(new ModelBox(Base7, 198, 113, -3.125F, -0.0625F, 6.0F, 2, 1, 1, -0.0625F, false));

		SpeakersLightsGrates2 = new RendererModel(this);
		SpeakersLightsGrates2.setRotationPoint(-1.625F, 0.0F, 0.0F);
		SpeakersLightsGrates.addChild(SpeakersLightsGrates2);
		setRotationAngle(SpeakersLightsGrates2, 0.0F, -1.0472F, 0.0F);
		

		Base11 = new RendererModel(this);
		Base11.setRotationPoint(2.125F, -12.5F, -13.0F);
		SpeakersLightsGrates2.addChild(Base11);
		setRotationAngle(Base11, 0.4538F, 0.0F, 0.0F);
		Base11.cubeList.add(new ModelBox(Base11, 220, 111, -7.0709F, -0.0488F, 1.4031F, 1, 1, 1, -0.0625F, false));
		Base11.cubeList.add(new ModelBox(Base11, 185, 241, -7.125F, -0.1875F, 1.375F, 1, 1, 1, -0.125F, false));
		Base11.cubeList.add(new ModelBox(Base11, 220, 111, 1.875F, -0.0625F, 1.375F, 1, 1, 1, -0.0625F, false));
		Base11.cubeList.add(new ModelBox(Base11, 185, 241, 1.875F, -0.1875F, 1.375F, 1, 1, 1, -0.125F, false));
		Base11.cubeList.add(new ModelBox(Base11, 220, 111, 0.875F, -0.0625F, 3.0F, 1, 1, 1, -0.0625F, false));
		Base11.cubeList.add(new ModelBox(Base11, 220, 111, -0.125F, -0.0625F, 4.5F, 1, 1, 1, -0.0625F, false));
		Base11.cubeList.add(new ModelBox(Base11, 185, 241, 0.875F, -0.1875F, 3.0F, 1, 1, 1, -0.125F, false));
		Base11.cubeList.add(new ModelBox(Base11, 185, 241, -0.125F, -0.1875F, 4.5F, 1, 1, 1, -0.125F, false));
		Base11.cubeList.add(new ModelBox(Base11, 220, 111, -6.1334F, -0.0488F, 3.0281F, 1, 1, 1, -0.0625F, false));
		Base11.cubeList.add(new ModelBox(Base11, 220, 111, -5.1875F, -0.0625F, 4.5F, 1, 1, 1, -0.0625F, false));
		Base11.cubeList.add(new ModelBox(Base11, 185, 241, -6.1875F, -0.1875F, 3.0F, 1, 1, 1, -0.125F, false));
		Base11.cubeList.add(new ModelBox(Base11, 185, 241, -5.1875F, -0.1875F, 4.5F, 1, 1, 1, -0.125F, false));

		RedBall2 = new RendererModel(this);
		RedBall2.setRotationPoint(-1.625F, 0.0F, 0.0F);
		SpeakersLightsGrates.addChild(RedBall2);
		setRotationAngle(RedBall2, 0.0F, -1.0472F, 0.0F);
		

		Base10 = new RendererModel(this);
		Base10.setRotationPoint(2.125F, -12.5F, -13.0F);
		RedBall2.addChild(Base10);
		setRotationAngle(Base10, 0.4538F, 0.0F, 0.0F);
		Base10.cubeList.add(new ModelBox(Base10, 75, 229, 0.625F, 0.0F, 1.0F, 1, 1, 1, 0.0F, false));
		Base10.cubeList.add(new ModelBox(Base10, 126, 225, 0.625F, -0.25F, 1.0F, 1, 1, 1, -0.125F, false));

		RedBall = new RendererModel(this);
		RedBall.setRotationPoint(-1.625F, 0.0F, 0.0F);
		SpeakersLightsGrates.addChild(RedBall);
		setRotationAngle(RedBall, 0.0F, -1.0472F, 0.0F);
		

		Base9 = new RendererModel(this);
		Base9.setRotationPoint(2.125F, -12.5F, -13.0F);
		RedBall.addChild(Base9);
		setRotationAngle(Base9, 0.4538F, 0.0F, 0.0F);
		Base9.cubeList.add(new ModelBox(Base9, 75, 229, -5.875F, 0.0F, 1.0F, 1, 1, 1, 0.0F, false));
		Base9.cubeList.add(new ModelBox(Base9, 126, 225, -5.875F, -0.25F, 1.0F, 1, 1, 1, -0.125F, false));

		TimeRotor = new RendererModel(this);
		TimeRotor.setRotationPoint(0.0F, -2.5F, 0.0F);
		MainBase.addChild(TimeRotor);
		

		Centre = new RendererModel(this);
		Centre.setRotationPoint(0.0F, 0.0F, 0.0F);
		TimeRotor.addChild(Centre);
		Centre.cubeList.add(new ModelBox(Centre, 122, 229, -0.5F, -19.0F, -0.5F, 1, 9, 1, -0.125F, false));
		Centre.cubeList.add(new ModelBox(Centre, 201, 243, -0.5F, -17.5F, -0.5F, 1, 1, 1, 0.375F, false));
		Centre.cubeList.add(new ModelBox(Centre, 194, 152, -1.0F, -17.5F, -0.5F, 2, 1, 1, 0.25F, false));
		Centre.cubeList.add(new ModelBox(Centre, 194, 152, -0.5F, -17.5F, -1.0F, 1, 1, 2, 0.25F, false));

		Ring = new RendererModel(this);
		Ring.setRotationPoint(0.0F, 0.0F, 0.0F);
		TimeRotor.addChild(Ring);
		

		bone = new RendererModel(this);
		bone.setRotationPoint(0.0F, -16.5F, 0.0F);
		Ring.addChild(bone);
		setRotationAngle(bone, -0.1745F, 0.0F, 0.7854F);
		bone.cubeList.add(new ModelBox(bone, 196, 235, 0.9142F, 0.8927F, -3.2544F, 1, 1, 7, -0.25F, false));

		an = new RendererModel(this);
		an.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring.addChild(an);
		an.cubeList.add(new ModelBox(an, 214, 100, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));

		an4 = new RendererModel(this);
		an4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring.addChild(an4);
		setRotationAngle(an4, 0.0F, -1.5708F, 0.0F);
		an4.cubeList.add(new ModelBox(an4, 209, 114, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));

		an5 = new RendererModel(this);
		an5.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring.addChild(an5);
		setRotationAngle(an5, 0.0F, -2.0944F, 0.0F);
		an5.cubeList.add(new ModelBox(an5, 209, 114, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));

		an6 = new RendererModel(this);
		an6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring.addChild(an6);
		setRotationAngle(an6, 0.0F, -2.618F, 0.0F);
		an6.cubeList.add(new ModelBox(an6, 209, 114, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));

		an7 = new RendererModel(this);
		an7.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring.addChild(an7);
		setRotationAngle(an7, 0.0F, 3.1416F, 0.0F);
		an7.cubeList.add(new ModelBox(an7, 209, 114, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));

		an10 = new RendererModel(this);
		an10.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring.addChild(an10);
		setRotationAngle(an10, 0.0F, 1.5708F, 0.0F);
		an10.cubeList.add(new ModelBox(an10, 214, 100, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));

		an11 = new RendererModel(this);
		an11.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring.addChild(an11);
		setRotationAngle(an11, 0.0F, 1.0472F, 0.0F);
		an11.cubeList.add(new ModelBox(an11, 214, 100, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));

		an12 = new RendererModel(this);
		an12.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring.addChild(an12);
		setRotationAngle(an12, 0.0F, 0.5236F, 0.0F);
		an12.cubeList.add(new ModelBox(an12, 214, 100, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));

		Ring3 = new RendererModel(this);
		Ring3.setRotationPoint(0.0F, -4.5F, 0.0F);
		TimeRotor.addChild(Ring3);
		setRotationAngle(Ring3, 0.0F, 1.5708F, 0.0F);
		

		bone3 = new RendererModel(this);
		bone3.setRotationPoint(0.0F, -16.5F, 0.0F);
		Ring3.addChild(bone3);
		setRotationAngle(bone3, -0.1745F, 0.0F, 0.7854F);
		bone3.cubeList.add(new ModelBox(bone3, 48, 230, 0.9142F, 0.8927F, -3.2544F, 1, 1, 7, -0.25F, false));

		an2 = new RendererModel(this);
		an2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring3.addChild(an2);
		an2.cubeList.add(new ModelBox(an2, 60, 232, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));

		an3 = new RendererModel(this);
		an3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring3.addChild(an3);
		setRotationAngle(an3, 0.0F, -1.5708F, 0.0F);
		an3.cubeList.add(new ModelBox(an3, 106, 223, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));

		an8 = new RendererModel(this);
		an8.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring3.addChild(an8);
		setRotationAngle(an8, 0.0F, -2.0944F, 0.0F);
		an8.cubeList.add(new ModelBox(an8, 106, 223, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));

		an9 = new RendererModel(this);
		an9.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring3.addChild(an9);
		setRotationAngle(an9, 0.0F, -2.618F, 0.0F);
		an9.cubeList.add(new ModelBox(an9, 106, 223, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));

		an13 = new RendererModel(this);
		an13.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring3.addChild(an13);
		setRotationAngle(an13, 0.0F, 3.1416F, 0.0F);
		an13.cubeList.add(new ModelBox(an13, 106, 223, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));

		an14 = new RendererModel(this);
		an14.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring3.addChild(an14);
		setRotationAngle(an14, 0.0F, 1.5708F, 0.0F);
		an14.cubeList.add(new ModelBox(an14, 60, 232, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));

		an19 = new RendererModel(this);
		an19.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring3.addChild(an19);
		setRotationAngle(an19, 0.0F, 1.0472F, 0.0F);
		an19.cubeList.add(new ModelBox(an19, 60, 232, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));

		an20 = new RendererModel(this);
		an20.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring3.addChild(an20);
		setRotationAngle(an20, 0.0F, 0.5236F, 0.0F);
		an20.cubeList.add(new ModelBox(an20, 60, 232, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));

		Ring2 = new RendererModel(this);
		Ring2.setRotationPoint(0.0F, -1.0F, 0.0F);
		TimeRotor.addChild(Ring2);
		

		bone2 = new RendererModel(this);
		bone2.setRotationPoint(0.0F, -16.5F, 0.0F);
		Ring2.addChild(bone2);
		setRotationAngle(bone2, -0.1309F, -1.5708F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 119, 220, -0.5F, 1.4829F, -3.2389F, 1, 1, 7, -0.25F, false));

		an15 = new RendererModel(this);
		an15.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring2.addChild(an15);
		setRotationAngle(an15, 0.0F, -1.0472F, 0.0F);
		an15.cubeList.add(new ModelBox(an15, 60, 232, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));

		an16 = new RendererModel(this);
		an16.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring2.addChild(an16);
		setRotationAngle(an16, 0.0F, -1.5708F, 0.0F);
		an16.cubeList.add(new ModelBox(an16, 60, 232, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));

		an17 = new RendererModel(this);
		an17.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring2.addChild(an17);
		setRotationAngle(an17, 0.0F, -2.0944F, 0.0F);
		an17.cubeList.add(new ModelBox(an17, 60, 232, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));

		an18 = new RendererModel(this);
		an18.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring2.addChild(an18);
		setRotationAngle(an18, 0.0F, -2.618F, 0.0F);
		an18.cubeList.add(new ModelBox(an18, 60, 232, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));

		an21 = new RendererModel(this);
		an21.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring2.addChild(an21);
		setRotationAngle(an21, 0.0F, 2.0944F, 0.0F);
		an21.cubeList.add(new ModelBox(an21, 122, 231, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));

		an22 = new RendererModel(this);
		an22.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring2.addChild(an22);
		setRotationAngle(an22, 0.0F, 1.5708F, 0.0F);
		an22.cubeList.add(new ModelBox(an22, 122, 231, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));

		an23 = new RendererModel(this);
		an23.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring2.addChild(an23);
		setRotationAngle(an23, 0.0F, 1.0472F, 0.0F);
		an23.cubeList.add(new ModelBox(an23, 122, 231, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));

		an24 = new RendererModel(this);
		an24.setRotationPoint(0.0F, 0.0F, 0.0F);
		Ring2.addChild(an24);
		setRotationAngle(an24, 0.0F, 0.5236F, 0.0F);
		an24.cubeList.add(new ModelBox(an24, 122, 231, -1.0F, -15.0F, -3.0F, 2, 1, 1, -0.25F, false));
		an24.cubeList.add(new ModelBox(an24, 121, 227, 0.0F, -18.5F, -3.0F, 1, 4, 1, -0.25F, false));
		an24.cubeList.add(new ModelBox(an24, 60, 232, -1.0F, -18.5F, 2.0F, 1, 4, 1, -0.25F, false));

		Panelstands = new RendererModel(this);
		Panelstands.setRotationPoint(0.0F, 0.0F, 0.0F);
		MainBase.addChild(Panelstands);
		

		Stand = new RendererModel(this);
		Stand.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panelstands.addChild(Stand);
		

		Dividers = new RendererModel(this);
		Dividers.setRotationPoint(0.0F, 0.0F, 0.0F);
		Stand.addChild(Dividers);
		

		r1 = new RendererModel(this);
		r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Dividers.addChild(r1);
		

		Panel1 = new RendererModel(this);
		Panel1.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r1.addChild(Panel1);
		setRotationAngle(Panel1, 0.0F, -0.1309F, 0.0F);
		Panel1.cubeList.add(new ModelBox(Panel1, 184, 240, 1.797F, -5.75F, -1.0238F, 7, 12, 1, -0.25F, false));

		Panel2 = new RendererModel(this);
		Panel2.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r1.addChild(Panel2);
		setRotationAngle(Panel2, 0.0F, 0.1309F, 0.0F);
		Panel2.cubeList.add(new ModelBox(Panel2, 184, 240, 1.7982F, -5.75F, -0.4847F, 7, 12, 1, -0.25F, false));

		r2 = new RendererModel(this);
		r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Dividers.addChild(r2);
		setRotationAngle(r2, 0.0F, -1.0472F, 0.0F);
		

		Panel3 = new RendererModel(this);
		Panel3.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r2.addChild(Panel3);
		setRotationAngle(Panel3, 0.0F, -0.1309F, 0.0F);
		Panel3.cubeList.add(new ModelBox(Panel3, 210, 196, 1.797F, -5.75F, -1.0238F, 7, 12, 1, -0.25F, false));

		Panel4 = new RendererModel(this);
		Panel4.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r2.addChild(Panel4);
		setRotationAngle(Panel4, 0.0F, 0.1309F, 0.0F);
		Panel4.cubeList.add(new ModelBox(Panel4, 184, 240, 1.7982F, -5.75F, -0.4847F, 7, 12, 1, -0.25F, false));

		r3 = new RendererModel(this);
		r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Dividers.addChild(r3);
		setRotationAngle(r3, 0.0F, -2.0944F, 0.0F);
		

		Panel5 = new RendererModel(this);
		Panel5.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r3.addChild(Panel5);
		setRotationAngle(Panel5, 0.0F, -0.1309F, 0.0F);
		Panel5.cubeList.add(new ModelBox(Panel5, 184, 240, 1.797F, -5.75F, -1.0238F, 7, 12, 1, -0.25F, false));

		Panel6 = new RendererModel(this);
		Panel6.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r3.addChild(Panel6);
		setRotationAngle(Panel6, 0.0F, 0.1309F, 0.0F);
		Panel6.cubeList.add(new ModelBox(Panel6, 184, 240, 1.7982F, -5.75F, -0.4847F, 7, 12, 1, -0.25F, false));

		r4 = new RendererModel(this);
		r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Dividers.addChild(r4);
		setRotationAngle(r4, 0.0F, 3.1416F, 0.0F);
		

		Panel7 = new RendererModel(this);
		Panel7.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r4.addChild(Panel7);
		setRotationAngle(Panel7, 0.0F, -0.1309F, 0.0F);
		Panel7.cubeList.add(new ModelBox(Panel7, 184, 240, 1.797F, -5.75F, -1.0238F, 7, 12, 1, -0.25F, false));

		Panel8 = new RendererModel(this);
		Panel8.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r4.addChild(Panel8);
		setRotationAngle(Panel8, 0.0F, 0.1309F, 0.0F);
		Panel8.cubeList.add(new ModelBox(Panel8, 184, 240, 1.7982F, -5.75F, -0.4847F, 7, 12, 1, -0.25F, false));

		r5 = new RendererModel(this);
		r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		Dividers.addChild(r5);
		setRotationAngle(r5, 0.0F, 2.0944F, 0.0F);
		

		Panel9 = new RendererModel(this);
		Panel9.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r5.addChild(Panel9);
		setRotationAngle(Panel9, 0.0F, -0.1309F, 0.0F);
		Panel9.cubeList.add(new ModelBox(Panel9, 184, 240, 1.797F, -5.75F, -1.0238F, 7, 12, 1, -0.25F, false));

		Panel10 = new RendererModel(this);
		Panel10.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r5.addChild(Panel10);
		setRotationAngle(Panel10, 0.0F, 0.1309F, 0.0F);
		Panel10.cubeList.add(new ModelBox(Panel10, 184, 240, 1.7982F, -5.75F, -0.4847F, 7, 12, 1, -0.25F, false));

		r6 = new RendererModel(this);
		r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Dividers.addChild(r6);
		setRotationAngle(r6, 0.0F, 1.0472F, 0.0F);
		

		Panel11 = new RendererModel(this);
		Panel11.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r6.addChild(Panel11);
		setRotationAngle(Panel11, 0.0F, -0.1309F, 0.0F);
		Panel11.cubeList.add(new ModelBox(Panel11, 184, 240, 1.797F, -5.75F, -1.0238F, 7, 12, 1, -0.25F, false));

		Panel12 = new RendererModel(this);
		Panel12.setRotationPoint(-9.75F, -6.0F, 0.25F);
		r6.addChild(Panel12);
		setRotationAngle(Panel12, 0.0F, 0.1309F, 0.0F);
		Panel12.cubeList.add(new ModelBox(Panel12, 184, 240, 1.7982F, -5.75F, -0.4847F, 7, 12, 1, -0.25F, false));

		Edgeing = new RendererModel(this);
		Edgeing.setRotationPoint(0.0F, 0.0F, 0.0F);
		Dividers.addChild(Edgeing);
		

		p1 = new RendererModel(this);
		p1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edgeing.addChild(p1);
		p1.cubeList.add(new ModelBox(p1, 192, 140, -8.0F, -11.75F, -0.5F, 16, 12, 1, -0.25F, false));
		p1.cubeList.add(new ModelBox(p1, 174, 106, -14.0F, -12.0625F, -1.0F, 28, 1, 2, -0.25F, false));

		p2 = new RendererModel(this);
		p2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edgeing.addChild(p2);
		setRotationAngle(p2, 0.0F, -1.0472F, 0.0F);
		p2.cubeList.add(new ModelBox(p2, 202, 148, -8.0F, -11.75F, -0.5F, 16, 12, 1, -0.25F, false));
		p2.cubeList.add(new ModelBox(p2, 174, 106, -14.0F, -12.0625F, -1.0F, 28, 1, 2, -0.25F, false));

		p3 = new RendererModel(this);
		p3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edgeing.addChild(p3);
		setRotationAngle(p3, 0.0F, -2.0944F, 0.0F);
		p3.cubeList.add(new ModelBox(p3, 202, 148, -8.0F, -11.75F, -0.5F, 16, 12, 1, -0.25F, false));
		p3.cubeList.add(new ModelBox(p3, 174, 106, -14.0F, -12.0625F, -1.0F, 28, 1, 2, -0.25F, false));

		InnerStandPanels = new RendererModel(this);
		InnerStandPanels.setRotationPoint(0.0F, 0.0F, 0.0F);
		Stand.addChild(InnerStandPanels);
		

		BaseSlants = new RendererModel(this);
		BaseSlants.setRotationPoint(0.0F, 0.0F, 0.0F);
		InnerStandPanels.addChild(BaseSlants);
		

		r7 = new RendererModel(this);
		r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		BaseSlants.addChild(r7);
		r7.cubeList.add(new ModelBox(r7, 202, 148, -4.0F, -0.75F, -7.0F, 8, 1, 1, -0.25F, false));
		r7.cubeList.add(new ModelBox(r7, 208, 106, -3.0F, -15.75F, -4.5F, 6, 15, 1, -0.25F, false));
		r7.cubeList.add(new ModelBox(r7, 204, 106, -4.0F, -16.375F, -6.875F, 8, 2, 7, -0.125F, false));
		r7.cubeList.add(new ModelBox(r7, 189, 144, -4.0F, -17.625F, -6.4375F, 8, 2, 3, -0.625F, false));

		Slant = new RendererModel(this);
		Slant.setRotationPoint(0.0F, -0.5F, -8.5F);
		r7.addChild(Slant);
		setRotationAngle(Slant, 0.4363F, 0.0F, 0.0F);
		Slant.cubeList.add(new ModelBox(Slant, 193, 152, -3.5F, 0.4896F, 1.336F, 7, 1, 2, -0.25F, false));
		Slant.cubeList.add(new ModelBox(Slant, 210, 196, 3.0F, 0.4896F, 1.336F, 1, 1, 1, -0.25F, false));
		Slant.cubeList.add(new ModelBox(Slant, 210, 196, -4.0F, 0.4896F, 1.336F, 1, 1, 1, -0.25F, false));
		Slant.cubeList.add(new ModelBox(Slant, 193, 152, -3.0F, 0.4896F, 2.836F, 6, 1, 2, -0.25F, false));

		r8 = new RendererModel(this);
		r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		BaseSlants.addChild(r8);
		setRotationAngle(r8, 0.0F, -1.0472F, 0.0F);
		r8.cubeList.add(new ModelBox(r8, 202, 148, -4.0F, -0.75F, -7.0F, 8, 1, 1, -0.25F, false));
		r8.cubeList.add(new ModelBox(r8, 208, 106, -3.0F, -15.75F, -4.5F, 6, 15, 1, -0.25F, false));
		r8.cubeList.add(new ModelBox(r8, 204, 106, -4.0F, -16.375F, -6.875F, 8, 2, 7, -0.125F, false));
		r8.cubeList.add(new ModelBox(r8, 189, 144, -4.0F, -17.625F, -6.4375F, 8, 2, 3, -0.625F, false));

		Slant2 = new RendererModel(this);
		Slant2.setRotationPoint(0.0F, -0.5F, -8.5F);
		r8.addChild(Slant2);
		setRotationAngle(Slant2, 0.4363F, 0.0F, 0.0F);
		Slant2.cubeList.add(new ModelBox(Slant2, 193, 152, -3.5F, 0.4896F, 1.336F, 7, 1, 2, -0.25F, false));
		Slant2.cubeList.add(new ModelBox(Slant2, 210, 196, 3.0F, 0.4896F, 1.336F, 1, 1, 1, -0.25F, false));
		Slant2.cubeList.add(new ModelBox(Slant2, 210, 196, -4.0F, 0.4896F, 1.336F, 1, 1, 1, -0.25F, false));
		Slant2.cubeList.add(new ModelBox(Slant2, 193, 152, -3.0F, 0.4896F, 2.836F, 6, 1, 2, -0.25F, false));

		r9 = new RendererModel(this);
		r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		BaseSlants.addChild(r9);
		setRotationAngle(r9, 0.0F, -2.0944F, 0.0F);
		r9.cubeList.add(new ModelBox(r9, 202, 148, -4.0F, -0.75F, -7.0F, 8, 1, 1, -0.25F, false));
		r9.cubeList.add(new ModelBox(r9, 208, 106, -3.0F, -15.75F, -4.5F, 6, 15, 1, -0.25F, false));
		r9.cubeList.add(new ModelBox(r9, 204, 106, -4.0F, -16.375F, -6.875F, 8, 2, 7, -0.125F, false));
		r9.cubeList.add(new ModelBox(r9, 189, 144, -4.0F, -17.625F, -6.4375F, 8, 2, 3, -0.625F, false));

		Slant3 = new RendererModel(this);
		Slant3.setRotationPoint(0.0F, -0.5F, -8.5F);
		r9.addChild(Slant3);
		setRotationAngle(Slant3, 0.4363F, 0.0F, 0.0F);
		Slant3.cubeList.add(new ModelBox(Slant3, 193, 152, -3.5F, 0.4896F, 1.336F, 7, 1, 2, -0.25F, false));
		Slant3.cubeList.add(new ModelBox(Slant3, 210, 196, 3.0F, 0.4896F, 1.336F, 1, 1, 1, -0.25F, false));
		Slant3.cubeList.add(new ModelBox(Slant3, 210, 196, -4.0F, 0.4896F, 1.336F, 1, 1, 1, -0.25F, false));
		Slant3.cubeList.add(new ModelBox(Slant3, 193, 152, -3.0F, 0.4896F, 2.836F, 6, 1, 2, -0.25F, false));

		r10 = new RendererModel(this);
		r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		BaseSlants.addChild(r10);
		setRotationAngle(r10, 0.0F, 3.1416F, 0.0F);
		r10.cubeList.add(new ModelBox(r10, 202, 148, -4.0F, -0.75F, -7.0F, 8, 1, 1, -0.25F, false));
		r10.cubeList.add(new ModelBox(r10, 208, 106, -3.0F, -15.75F, -4.5F, 6, 15, 1, -0.25F, false));
		r10.cubeList.add(new ModelBox(r10, 204, 106, -4.0F, -16.375F, -6.875F, 8, 2, 7, -0.125F, false));
		r10.cubeList.add(new ModelBox(r10, 189, 144, -4.0F, -17.625F, -6.4375F, 8, 2, 3, -0.625F, false));

		Slant4 = new RendererModel(this);
		Slant4.setRotationPoint(0.0F, -0.5F, -8.5F);
		r10.addChild(Slant4);
		setRotationAngle(Slant4, 0.4363F, 0.0F, 0.0F);
		Slant4.cubeList.add(new ModelBox(Slant4, 193, 152, -3.5F, 0.4896F, 1.336F, 7, 1, 2, -0.25F, false));
		Slant4.cubeList.add(new ModelBox(Slant4, 210, 196, 3.0F, 0.4896F, 1.336F, 1, 1, 1, -0.25F, false));
		Slant4.cubeList.add(new ModelBox(Slant4, 210, 196, -4.0F, 0.4896F, 1.336F, 1, 1, 1, -0.25F, false));
		Slant4.cubeList.add(new ModelBox(Slant4, 193, 152, -3.0F, 0.4896F, 2.836F, 6, 1, 2, -0.25F, false));

		r11 = new RendererModel(this);
		r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		BaseSlants.addChild(r11);
		setRotationAngle(r11, 0.0F, 2.0944F, 0.0F);
		r11.cubeList.add(new ModelBox(r11, 202, 148, -4.0F, -0.75F, -7.0F, 8, 1, 1, -0.25F, false));
		r11.cubeList.add(new ModelBox(r11, 208, 106, -3.0F, -15.75F, -4.5F, 6, 15, 1, -0.25F, false));
		r11.cubeList.add(new ModelBox(r11, 204, 106, -4.0F, -16.375F, -6.875F, 8, 2, 7, -0.125F, false));
		r11.cubeList.add(new ModelBox(r11, 189, 144, -4.0F, -17.625F, -6.4375F, 8, 2, 3, -0.625F, false));

		Slant5 = new RendererModel(this);
		Slant5.setRotationPoint(0.0F, -0.5F, -8.5F);
		r11.addChild(Slant5);
		setRotationAngle(Slant5, 0.4363F, 0.0F, 0.0F);
		Slant5.cubeList.add(new ModelBox(Slant5, 193, 152, -3.5F, 0.4896F, 1.336F, 7, 1, 2, -0.25F, false));
		Slant5.cubeList.add(new ModelBox(Slant5, 210, 196, 3.0F, 0.4896F, 1.336F, 1, 1, 1, -0.25F, false));
		Slant5.cubeList.add(new ModelBox(Slant5, 210, 196, -4.0F, 0.4896F, 1.336F, 1, 1, 1, -0.25F, false));
		Slant5.cubeList.add(new ModelBox(Slant5, 193, 152, -3.0F, 0.4896F, 2.836F, 6, 1, 2, -0.25F, false));

		r12 = new RendererModel(this);
		r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		BaseSlants.addChild(r12);
		setRotationAngle(r12, 0.0F, 1.0472F, 0.0F);
		r12.cubeList.add(new ModelBox(r12, 202, 148, -4.0F, -0.75F, -7.0F, 8, 1, 1, -0.25F, false));
		r12.cubeList.add(new ModelBox(r12, 208, 106, -3.0F, -15.75F, -4.5F, 6, 15, 1, -0.25F, false));
		r12.cubeList.add(new ModelBox(r12, 204, 106, -4.0F, -16.375F, -6.875F, 8, 2, 7, -0.125F, false));
		r12.cubeList.add(new ModelBox(r12, 189, 144, -4.0F, -17.625F, -6.4375F, 8, 2, 3, -0.625F, false));

		Slant6 = new RendererModel(this);
		Slant6.setRotationPoint(0.0F, -0.5F, -8.5F);
		r12.addChild(Slant6);
		setRotationAngle(Slant6, 0.4363F, 0.0F, 0.0F);
		Slant6.cubeList.add(new ModelBox(Slant6, 193, 152, -3.5F, 0.4896F, 1.336F, 7, 1, 2, -0.25F, false));
		Slant6.cubeList.add(new ModelBox(Slant6, 210, 196, 3.0F, 0.4896F, 1.336F, 1, 1, 1, -0.25F, false));
		Slant6.cubeList.add(new ModelBox(Slant6, 210, 196, -4.0F, 0.4896F, 1.336F, 1, 1, 1, -0.25F, false));
		Slant6.cubeList.add(new ModelBox(Slant6, 193, 152, -3.0F, 0.4896F, 2.836F, 6, 1, 2, -0.25F, false));

		Panels = new RendererModel(this);
		Panels.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panelstands.addChild(Panels);
		

		Undercarrage = new RendererModel(this);
		Undercarrage.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(Undercarrage);
		

		Rot0 = new RendererModel(this);
		Rot0.setRotationPoint(0.0F, 0.0F, 0.0F);
		Undercarrage.addChild(Rot0);
		Rot0.cubeList.add(new ModelBox(Rot0, 222, 146, -7.0F, -12.5F, -13.0F, 14, 1, 2, 0.0F, false));
		Rot0.cubeList.add(new ModelBox(Rot0, 207, 111, -6.5067F, -12.5F, -12.953F, 13, 1, 1, 0.125F, false));
		Rot0.cubeList.add(new ModelBox(Rot0, 207, 111, -6.5067F, -12.5F, 11.953F, 13, 1, 1, 0.125F, false));
		Rot0.cubeList.add(new ModelBox(Rot0, 222, 146, -7.0F, -12.5F, 11.0F, 14, 1, 2, 0.0F, false));
		Rot0.cubeList.add(new ModelBox(Rot0, 222, 146, -7.0F, -12.5625F, -12.0F, 14, 1, 24, -0.125F, false));

		Rot60 = new RendererModel(this);
		Rot60.setRotationPoint(0.0F, 0.0F, 0.0F);
		Undercarrage.addChild(Rot60);
		setRotationAngle(Rot60, 0.0F, -1.0472F, 0.0F);
		Rot60.cubeList.add(new ModelBox(Rot60, 222, 146, -7.0F, -12.5F, -13.0F, 14, 1, 2, 0.0F, false));
		Rot60.cubeList.add(new ModelBox(Rot60, 222, 146, -7.0F, -12.5F, 11.0F, 14, 1, 2, 0.0F, false));
		Rot60.cubeList.add(new ModelBox(Rot60, 222, 146, -7.0F, -12.5625F, -12.0F, 14, 1, 24, -0.125F, false));
		Rot60.cubeList.add(new ModelBox(Rot60, 207, 111, -6.5067F, -12.5F, -12.953F, 13, 1, 1, 0.125F, false));
		Rot60.cubeList.add(new ModelBox(Rot60, 207, 111, -6.5067F, -12.5F, 11.953F, 13, 1, 1, 0.125F, false));

		Rot120 = new RendererModel(this);
		Rot120.setRotationPoint(0.0F, 0.0F, 0.0F);
		Undercarrage.addChild(Rot120);
		setRotationAngle(Rot120, 0.0F, -2.0944F, 0.0F);
		Rot120.cubeList.add(new ModelBox(Rot120, 222, 146, -7.0F, -12.5F, -13.0F, 14, 1, 2, 0.0F, false));
		Rot120.cubeList.add(new ModelBox(Rot120, 222, 146, -7.0F, -12.5F, 11.0F, 14, 1, 2, 0.0F, false));
		Rot120.cubeList.add(new ModelBox(Rot120, 222, 146, -7.0F, -12.5625F, -12.0F, 14, 1, 24, -0.125F, false));
		Rot120.cubeList.add(new ModelBox(Rot120, 207, 111, -6.5067F, -12.5F, -12.953F, 13, 1, 1, 0.125F, false));
		Rot120.cubeList.add(new ModelBox(Rot120, 207, 111, -6.5067F, -12.5F, 11.953F, 13, 1, 1, 0.125F, false));

		PanelDividers = new RendererModel(this);
		PanelDividers.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(PanelDividers);
		

		r0 = new RendererModel(this);
		r0.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelDividers.addChild(r0);
		r0.cubeList.add(new ModelBox(r0, 222, 146, 13.0625F, -13.0F, -1.0F, 2, 2, 2, -0.25F, false));

		Slant7 = new RendererModel(this);
		Slant7.setRotationPoint(15.1717F, -12.9561F, 0.0F);
		r0.addChild(Slant7);
		setRotationAngle(Slant7, 0.0F, 0.0F, 0.384F);
		Slant7.cubeList.add(new ModelBox(Slant7, 222, 146, -9.0058F, 0.0757F, -1.0F, 9, 2, 2, -0.25F, false));

		r60 = new RendererModel(this);
		r60.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelDividers.addChild(r60);
		setRotationAngle(r60, 0.0F, -1.0472F, 0.0F);
		r60.cubeList.add(new ModelBox(r60, 222, 146, 13.0625F, -13.0F, -1.0F, 2, 2, 2, -0.25F, false));

		Slant8 = new RendererModel(this);
		Slant8.setRotationPoint(15.1717F, -12.9561F, 0.0F);
		r60.addChild(Slant8);
		setRotationAngle(Slant8, 0.0F, 0.0F, 0.384F);
		Slant8.cubeList.add(new ModelBox(Slant8, 222, 146, -9.0058F, 0.0757F, -1.0F, 9, 2, 2, -0.25F, false));

		r120 = new RendererModel(this);
		r120.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelDividers.addChild(r120);
		setRotationAngle(r120, 0.0F, -2.0944F, 0.0F);
		r120.cubeList.add(new ModelBox(r120, 222, 146, 13.0625F, -13.0F, -1.0F, 2, 2, 2, -0.25F, false));

		Slant9 = new RendererModel(this);
		Slant9.setRotationPoint(15.1717F, -12.9561F, 0.0F);
		r120.addChild(Slant9);
		setRotationAngle(Slant9, 0.0F, 0.0F, 0.384F);
		Slant9.cubeList.add(new ModelBox(Slant9, 222, 146, -9.0058F, 0.0757F, -1.0F, 9, 2, 2, -0.25F, false));

		r180 = new RendererModel(this);
		r180.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelDividers.addChild(r180);
		setRotationAngle(r180, 0.0F, 3.1416F, 0.0F);
		r180.cubeList.add(new ModelBox(r180, 222, 146, 13.0625F, -13.0F, -1.0F, 2, 2, 2, -0.25F, false));

		Slant10 = new RendererModel(this);
		Slant10.setRotationPoint(15.1717F, -12.9561F, 0.0F);
		r180.addChild(Slant10);
		setRotationAngle(Slant10, 0.0F, 0.0F, 0.384F);
		Slant10.cubeList.add(new ModelBox(Slant10, 222, 146, -9.0058F, 0.0757F, -1.0F, 9, 2, 2, -0.25F, false));

		r_120 = new RendererModel(this);
		r_120.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelDividers.addChild(r_120);
		setRotationAngle(r_120, 0.0F, 2.0944F, 0.0F);
		r_120.cubeList.add(new ModelBox(r_120, 222, 146, 13.0625F, -13.0F, -1.0F, 2, 2, 2, -0.25F, false));

		Slant11 = new RendererModel(this);
		Slant11.setRotationPoint(15.1717F, -12.9561F, 0.0F);
		r_120.addChild(Slant11);
		setRotationAngle(Slant11, 0.0F, 0.0F, 0.384F);
		Slant11.cubeList.add(new ModelBox(Slant11, 222, 146, -9.0058F, 0.0757F, -1.0F, 9, 2, 2, -0.25F, false));

		r_60 = new RendererModel(this);
		r_60.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelDividers.addChild(r_60);
		setRotationAngle(r_60, 0.0F, 1.0472F, 0.0F);
		r_60.cubeList.add(new ModelBox(r_60, 222, 146, 13.0625F, -13.0F, -1.0F, 2, 2, 2, -0.25F, false));

		Slant12 = new RendererModel(this);
		Slant12.setRotationPoint(15.1717F, -12.9561F, 0.0F);
		r_60.addChild(Slant12);
		setRotationAngle(Slant12, 0.0F, 0.0F, 0.384F);
		Slant12.cubeList.add(new ModelBox(Slant12, 222, 146, -9.0058F, 0.0757F, -1.0F, 9, 2, 2, -0.25F, false));

		CPanel1 = new RendererModel(this);
		CPanel1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(CPanel1);
		

		Main = new RendererModel(this);
		Main.setRotationPoint(0.5F, -12.5F, -13.0F);
		CPanel1.addChild(Main);
		setRotationAngle(Main, 0.4538F, 0.0F, 0.0F);
		Main.cubeList.add(new ModelBox(Main, 222, 146, -7.5F, 0.125F, 0.0F, 14, 1, 2, 0.0F, false));
		Main.cubeList.add(new ModelBox(Main, 222, 146, -6.5F, 0.125F, 2.0F, 12, 1, 2, 0.0F, false));
		Main.cubeList.add(new ModelBox(Main, 222, 146, -5.5F, 0.125F, 4.0F, 10, 1, 2, 0.0F, false));
		Main.cubeList.add(new ModelBox(Main, 222, 146, -4.5F, 0.125F, 6.0F, 8, 1, 1, 0.0F, false));

		CPanel2 = new RendererModel(this);
		CPanel2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(CPanel2);
		setRotationAngle(CPanel2, 0.0F, -1.0472F, 0.0F);
		

		Main2 = new RendererModel(this);
		Main2.setRotationPoint(0.5F, -12.5F, -13.0F);
		CPanel2.addChild(Main2);
		setRotationAngle(Main2, 0.4538F, 0.0F, 0.0F);
		Main2.cubeList.add(new ModelBox(Main2, 222, 146, -7.5F, 0.125F, 0.0F, 14, 1, 2, 0.0F, false));
		Main2.cubeList.add(new ModelBox(Main2, 222, 146, -3.5F, -0.3125F, 1.0F, 6, 1, 1, -0.375F, false));
		Main2.cubeList.add(new ModelBox(Main2, 222, 146, -3.5F, -0.3125F, 3.75F, 6, 1, 1, -0.375F, false));
		Main2.cubeList.add(new ModelBox(Main2, 222, 146, -6.5F, 0.125F, 2.0F, 12, 1, 2, 0.0F, false));
		Main2.cubeList.add(new ModelBox(Main2, 222, 146, -5.5F, 0.125F, 4.0F, 10, 1, 2, 0.0F, false));
		Main2.cubeList.add(new ModelBox(Main2, 222, 146, -4.5F, 0.125F, 6.0F, 8, 1, 1, 0.0F, false));

		CPanel3 = new RendererModel(this);
		CPanel3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(CPanel3);
		setRotationAngle(CPanel3, 0.0F, -2.0944F, 0.0F);
		

		Main3 = new RendererModel(this);
		Main3.setRotationPoint(0.5F, -12.5F, -13.0F);
		CPanel3.addChild(Main3);
		setRotationAngle(Main3, 0.4538F, 0.0F, 0.0F);
		Main3.cubeList.add(new ModelBox(Main3, 222, 146, -7.5F, 0.125F, 0.0F, 14, 1, 2, 0.0F, false));
		Main3.cubeList.add(new ModelBox(Main3, 222, 146, -6.5F, 0.125F, 2.0F, 12, 1, 2, 0.0F, false));
		Main3.cubeList.add(new ModelBox(Main3, 222, 146, -5.5F, 0.125F, 4.0F, 10, 1, 2, 0.0F, false));
		Main3.cubeList.add(new ModelBox(Main3, 222, 146, -4.5F, 0.125F, 6.0F, 8, 1, 1, 0.0F, false));

		CPanel4 = new RendererModel(this);
		CPanel4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(CPanel4);
		setRotationAngle(CPanel4, 0.0F, 3.1416F, 0.0F);
		

		Main4 = new RendererModel(this);
		Main4.setRotationPoint(0.5F, -12.5F, -13.0F);
		CPanel4.addChild(Main4);
		setRotationAngle(Main4, 0.4538F, 0.0F, 0.0F);
		Main4.cubeList.add(new ModelBox(Main4, 222, 146, -7.5F, 0.125F, 0.0F, 14, 1, 2, 0.0F, false));
		Main4.cubeList.add(new ModelBox(Main4, 222, 146, -6.5F, 0.125F, 2.0F, 12, 1, 2, 0.0F, false));
		Main4.cubeList.add(new ModelBox(Main4, 222, 146, -5.5F, 0.125F, 4.0F, 10, 1, 2, 0.0F, false));
		Main4.cubeList.add(new ModelBox(Main4, 222, 146, -4.5F, 0.125F, 6.0F, 8, 1, 1, 0.0F, false));

		CPanel5 = new RendererModel(this);
		CPanel5.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(CPanel5);
		setRotationAngle(CPanel5, 0.0F, 2.0944F, 0.0F);
		

		Main5 = new RendererModel(this);
		Main5.setRotationPoint(0.5F, -12.5F, -13.0F);
		CPanel5.addChild(Main5);
		setRotationAngle(Main5, 0.4538F, 0.0F, 0.0F);
		Main5.cubeList.add(new ModelBox(Main5, 222, 146, -7.5F, 0.125F, 0.0F, 14, 1, 2, 0.0F, false));
		Main5.cubeList.add(new ModelBox(Main5, 222, 146, -6.5F, 0.125F, 2.0F, 12, 1, 2, 0.0F, false));
		Main5.cubeList.add(new ModelBox(Main5, 222, 146, -5.5F, 0.125F, 4.0F, 10, 1, 2, 0.0F, false));
		Main5.cubeList.add(new ModelBox(Main5, 222, 146, -4.5F, 0.125F, 6.0F, 8, 1, 1, 0.0F, false));

		CPanel6 = new RendererModel(this);
		CPanel6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(CPanel6);
		setRotationAngle(CPanel6, 0.0F, 1.0472F, 0.0F);
		

		Main6 = new RendererModel(this);
		Main6.setRotationPoint(0.5F, -12.5F, -13.0F);
		CPanel6.addChild(Main6);
		setRotationAngle(Main6, 0.4538F, 0.0F, 0.0F);
		Main6.cubeList.add(new ModelBox(Main6, 222, 146, -7.5F, 0.125F, 0.0F, 14, 1, 2, 0.0F, false));
		Main6.cubeList.add(new ModelBox(Main6, 222, 146, -6.5F, 0.125F, 2.0F, 12, 1, 2, 0.0F, false));
		Main6.cubeList.add(new ModelBox(Main6, 222, 146, -5.5F, 0.125F, 4.0F, 10, 1, 2, 0.0F, false));
		Main6.cubeList.add(new ModelBox(Main6, 222, 146, -4.5F, 0.125F, 6.0F, 8, 1, 1, 0.0F, false));
	}

		public void render(ConsoleTile tile) {


		net.tardis.mod.controls.RandomiserControl randomiserControl = tile.getControl(RandomiserControl.class);
		this.RandomiserControl.rotateAngleY = (float) Math.toRadians(randomiserControl.getAnimationProgress() * 720.0F );

		Direction consoleFacing = tile.getExteriorDirection();
		if (consoleFacing == Direction.SOUTH) {
			facingcontrol.rotateAngleY = (float) Math.toRadians(0f);
		} else if (consoleFacing == Direction.NORTH) {
			facingcontrol.rotateAngleY = (float) Math.toRadians(180f);
		} else if (consoleFacing == Direction.EAST) {
			facingcontrol.rotateAngleY = (float) Math.toRadians(270f);
		}else if (consoleFacing == Direction.WEST) {
			facingcontrol.rotateAngleY = (float) Math.toRadians(90f);
		}

		HandbrakeControl handbrake = tile.getControl(HandbrakeControl.class);
		if (!handbrake.isFree()) {
			handbrakelever.offsetZ = -0.1F;
			handbrakelever.offsetY = 0.05F;
			handbrakelever.offsetX = 0.0F;
		} else {
			handbrakelever.offsetZ = -0.01F;
			handbrakelever.offsetY = 0.005F;
			handbrakelever.offsetX = 0.0F;
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
		this.TimeRotor.offsetY = - (float)Math.cos((double)tile.flightTicks * 0.1D) * 0.05F;

		net.tardis.mod.controls.RandomiserControl random = tile.getControl(RandomiserControl.class);
		float randomOff = random.getAnimationTicks() == 0 ? 0 : 0.006F;
		//this.random_but_1.offsetY = this.random_but_6.offsetY = this.random_but_8.offsetY = randomOff;

		ThrottleControl throttleA = tile.getControl(ThrottleControl.class);
		this.throttle.offsetZ = -0.1F + throttleA.getAmount() * 0.1F;
		this.throttle.offsetY = 0.05F + throttleA.getAmount() * -0.05F;
		tile.getDoor().ifPresent(door -> {
			this.doorcontrol.offsetZ = door.getOpenState() == EnumDoorState.CLOSED ? -0.0F : 0.11F;
			this.doorcontrol.offsetY = door.getOpenState() == EnumDoorState.CLOSED ? -0.0F : -0.055F;
		});

		IncModControl inc = tile.getControl(IncModControl.class);
		this.Switch.rotateAngleX = (float) Math.toRadians(((inc.index / (float)IncModControl.COORD_MODS.length) * 100.0F) - 50.0F);

		XControl x = tile.getControl(XControl.class);
		//this.x.offsetY = x.getAnimationTicks() == 0 ? 0 : 0.006F;

		YControl y = tile.getControl(YControl.class);
		//this.y.offsetY = y.getAnimationTicks() == 0 ? 0 : 0.006F;

		ZControl z = tile.getControl(ZControl.class);
		//this.z.offsetY = z.getAnimationTicks() == 0 ? 0 : 0.006F;

		MainBase.render(0.0625F);

		GlStateManager.pushMatrix();

		GlStateManager.translated(-0.12, 0.555, -0.68);
		GlStateManager.rotated(0, 1, 0, 0);

		//TODO Find out wtf this below is
		//WorldText text = new WorldText(0.22F, 0.15F, 0.002F, 0xFFFFFF);
		//text.renderMonitor(Helper.getConsoleText(tile));

		GlStateManager.scaled(0.4D, 0.3D, 0.4D); //Size of sonic in port
		GlStateManager.translated(2.025D, -0.725D, 2.175D); //Location XYZ
		GlStateManager.rotated(200.0D, -2.1D, -0.25D, 1.0D); //Rotation
		GlStateManager.translated(0.3D, -0.25D, 0.25D); //Not sure
		Minecraft.getInstance().getItemRenderer().renderItem(tile.getSonicItem(), ItemCameraTransforms.TransformType.NONE);
		GlStateManager.popMatrix();
	}
	//DOES THIS WORK?

//Run in debug mode, make change, ctrl + s, then that keybind, then in game F3 + T.
	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
