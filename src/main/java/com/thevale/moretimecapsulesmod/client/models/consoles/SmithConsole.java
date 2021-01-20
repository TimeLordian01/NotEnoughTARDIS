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

public class SmithConsole extends Model {
	private final RendererModel EntireModel;
	private final RendererModel MonitorRotation;
	private final RendererModel a1;
	private final RendererModel bone127;
	private final RendererModel a2;
	private final RendererModel a3;
	private final RendererModel Scissors;
	private final RendererModel LeftSide;
	private final RendererModel RightSide;
	private final RendererModel MonitorBox;
	private final RendererModel MonitorRing;
	private final RendererModel a;
	private final RendererModel a4;
	private final RendererModel a5;
	private final RendererModel a6;
	private final RendererModel a7;
	private final RendererModel a8;
	private final RendererModel a9;
	private final RendererModel a10;
	private final RendererModel a11;
	private final RendererModel a12;
	private final RendererModel a13;
	private final RendererModel a14;
	private final RendererModel ControlSet6;
	private final RendererModel Idk;
	private final RendererModel bone123;
	private final RendererModel Spin4;
	private final RendererModel bone125;
	private final RendererModel WibblyLever;
	private final RendererModel Main7;
	private final RendererModel DoorControlLever;
	private final RendererModel threeswitches;
	private final RendererModel Switch1;
	private final RendererModel Base5;
	private final RendererModel Part6;
	private final RendererModel Switch3;
	private final RendererModel bone124;
	private final RendererModel Base6;
	private final RendererModel Part7;
	private final RendererModel Switch4;
	private final RendererModel Base7;
	private final RendererModel Part8;
	private final RendererModel WeirdLeverThing;
	private final RendererModel Base8;
	private final RendererModel Lever2;
	private final RendererModel bone126;
	private final RendererModel Pump4;
	private final RendererModel MainRot3;
	private final RendererModel Base9;
	private final RendererModel ControlSet5;
	private final RendererModel RedSet2;
	private final RendererModel LeversRot4;
	private final RendererModel Lev3;
	private final RendererModel Lev4;
	private final RendererModel GravityAccelerator;
	private final RendererModel bone119;
	private final RendererModel bone120;
	private final RendererModel Spin3;
	private final RendererModel bone122;
	private final RendererModel RotaryHandle;
	private final RendererModel Handle2;
	private final RendererModel Pump;
	private final RendererModel MainRot2;
	private final RendererModel Base4;
	private final RendererModel bone121;
	private final RendererModel ZigZagPlotter;
	private final RendererModel Moveable;
	private final RendererModel ControlSet4;
	private final RendererModel Phone;
	private final RendererModel Typewriter;
	private final RendererModel rot;
	private final RendererModel Dials4;
	private final RendererModel Base3;
	private final RendererModel ControlSet3;
	private final RendererModel RedSet1;
	private final RendererModel LeversRot2;
	private final RendererModel Lev1;
	private final RendererModel Lev2;
	private final RendererModel RANDOMPARTS;
	private final RendererModel LeversRot3;
	private final RendererModel bone102;
	private final RendererModel LightBars;
	private final RendererModel MiniLever;
	private final RendererModel Part;
	private final RendererModel Taps;
	private final RendererModel Tap1;
	private final RendererModel bone103;
	private final RendererModel bone104;
	private final RendererModel bone105;
	private final RendererModel bone106;
	private final RendererModel Tap2;
	private final RendererModel bone107;
	private final RendererModel bone108;
	private final RendererModel bone109;
	private final RendererModel bone110;
	private final RendererModel Tap3;
	private final RendererModel bone111;
	private final RendererModel bone112;
	private final RendererModel bone113;
	private final RendererModel bone114;
	private final RendererModel ControlSet2;
	private final RendererModel WeridLever;
	private final RendererModel LeversRot;
	private final RendererModel Levers;
	private final RendererModel Dials;
	private final RendererModel Dial1;
	private final RendererModel Dials2;
	private final RendererModel Dial2;
	private final RendererModel KeyBoard;
	private final RendererModel bone92;
	private final RendererModel AtomAccelerator;
	private final RendererModel bone89;
	private final RendererModel bone90;
	private final RendererModel Spin;
	private final RendererModel bone91;
	private final RendererModel Gyroscope;
	private final RendererModel Frame;
	private final RendererModel bone93;
	private final RendererModel bone94;
	private final RendererModel Spin2;
	private final RendererModel bone98;
	private final RendererModel bone99;
	private final RendererModel bone100;
	private final RendererModel bone95;
	private final RendererModel bone96;
	private final RendererModel bone97;
	private final RendererModel ControlSet1;
	private final RendererModel HelmicRegulator;
	private final RendererModel baserotation;
	private final RendererModel part1;
	private final RendererModel part2;
	private final RendererModel part3;
	private final RendererModel part4;
	private final RendererModel part5;
	private final RendererModel Throttle;
	private final RendererModel MainRot;
	private final RendererModel Base;
	private final RendererModel Handle;
	private final RendererModel PhaseSwitch;
	private final RendererModel Base2;
	private final RendererModel Switch;
	private final RendererModel RotaryHandles;
	private final RendererModel Rotor1;
	private final RendererModel H1;
	private final RendererModel Rotor2;
	private final RendererModel H2;
	private final RendererModel bone87;
	private final RendererModel Handbrake;
	private final RendererModel Rot2;
	private final RendererModel ControlsBetweenPanels;
	private final RendererModel Pumps;
	private final RendererModel p1;
	private final RendererModel bone116;
	private final RendererModel bone117;
	private final RendererModel p2and3;
	private final RendererModel PUMP3;
	private final RendererModel PUMP2;
	private final RendererModel bone118;
	private final RendererModel SpinnyThings;
	private final RendererModel Sp1;
	private final RendererModel bone85;
	private final RendererModel Sp3;
	private final RendererModel bone88;
	private final RendererModel Sp2;
	private final RendererModel bone86;
	private final RendererModel Sp4;
	private final RendererModel bone115;
	private final RendererModel TimeRotor;
	private final RendererModel TimeRotorInner;
	private final RendererModel Moving;
	private final RendererModel Stationary;
	private final RendererModel TimeRotorShell;
	private final RendererModel TimeRotorlOWER;
	private final RendererModel b;
	private final RendererModel b2;
	private final RendererModel b3;
	private final RendererModel b4;
	private final RendererModel b5;
	private final RendererModel b6;
	private final RendererModel TrRing1;
	private final RendererModel b7;
	private final RendererModel b8;
	private final RendererModel b9;
	private final RendererModel b10;
	private final RendererModel b11;
	private final RendererModel b12;
	private final RendererModel b13;
	private final RendererModel b14;
	private final RendererModel b15;
	private final RendererModel b16;
	private final RendererModel b17;
	private final RendererModel b18;
	private final RendererModel TrRing6;
	private final RendererModel b19;
	private final RendererModel b20;
	private final RendererModel b21;
	private final RendererModel b22;
	private final RendererModel b23;
	private final RendererModel b24;
	private final RendererModel b25;
	private final RendererModel b26;
	private final RendererModel b27;
	private final RendererModel b28;
	private final RendererModel b29;
	private final RendererModel b30;
	private final RendererModel TrRing7;
	private final RendererModel b31;
	private final RendererModel b42;
	private final RendererModel b32;
	private final RendererModel b33;
	private final RendererModel b34;
	private final RendererModel b35;
	private final RendererModel b36;
	private final RendererModel b37;
	private final RendererModel b38;
	private final RendererModel b39;
	private final RendererModel b40;
	private final RendererModel b41;
	private final RendererModel TrRing8;
	private final RendererModel b43;
	private final RendererModel b44;
	private final RendererModel b45;
	private final RendererModel b46;
	private final RendererModel b47;
	private final RendererModel b48;
	private final RendererModel b49;
	private final RendererModel b50;
	private final RendererModel b51;
	private final RendererModel b52;
	private final RendererModel b53;
	private final RendererModel b54;
	private final RendererModel tRRing2;
	private final RendererModel b55;
	private final RendererModel b56;
	private final RendererModel b57;
	private final RendererModel b58;
	private final RendererModel b59;
	private final RendererModel b60;
	private final RendererModel b61;
	private final RendererModel b62;
	private final RendererModel b63;
	private final RendererModel b64;
	private final RendererModel b65;
	private final RendererModel b66;
	private final RendererModel TrRing3;
	private final RendererModel b67;
	private final RendererModel b68;
	private final RendererModel b69;
	private final RendererModel b70;
	private final RendererModel b71;
	private final RendererModel b72;
	private final RendererModel b73;
	private final RendererModel b74;
	private final RendererModel b75;
	private final RendererModel b76;
	private final RendererModel b77;
	private final RendererModel b78;
	private final RendererModel TrRing4;
	private final RendererModel b79;
	private final RendererModel b80;
	private final RendererModel b81;
	private final RendererModel b82;
	private final RendererModel b83;
	private final RendererModel b84;
	private final RendererModel b85;
	private final RendererModel b86;
	private final RendererModel b87;
	private final RendererModel b88;
	private final RendererModel b89;
	private final RendererModel b90;
	private final RendererModel TrRing5;
	private final RendererModel b91;
	private final RendererModel b92;
	private final RendererModel b93;
	private final RendererModel b94;
	private final RendererModel b95;
	private final RendererModel b96;
	private final RendererModel b97;
	private final RendererModel b98;
	private final RendererModel b99;
	private final RendererModel b100;
	private final RendererModel b101;
	private final RendererModel b102;
	private final RendererModel Console;
	private final RendererModel PanelLayout;
	private final RendererModel Panel1;
	private final RendererModel Side1;
	private final RendererModel bone5;
	private final RendererModel bone3;
	private final RendererModel bone6;
	private final RendererModel bone;
	private final RendererModel Side2;
	private final RendererModel bone2;
	private final RendererModel bone4;
	private final RendererModel bone7;
	private final RendererModel bone8;
	private final RendererModel Main;
	private final RendererModel bone9;
	private final RendererModel bone10;
	private final RendererModel bone11;
	private final RendererModel bone12;
	private final RendererModel bone13;
	private final RendererModel bone14;
	private final RendererModel Panel2;
	private final RendererModel Side3;
	private final RendererModel bone15;
	private final RendererModel bone16;
	private final RendererModel bone17;
	private final RendererModel bone18;
	private final RendererModel Side4;
	private final RendererModel bone19;
	private final RendererModel bone20;
	private final RendererModel bone21;
	private final RendererModel bone22;
	private final RendererModel Main2;
	private final RendererModel bone23;
	private final RendererModel bone24;
	private final RendererModel bone25;
	private final RendererModel bone26;
	private final RendererModel bone27;
	private final RendererModel bone28;
	private final RendererModel Panel3;
	private final RendererModel Side5;
	private final RendererModel bone29;
	private final RendererModel bone30;
	private final RendererModel bone31;
	private final RendererModel bone32;
	private final RendererModel Side6;
	private final RendererModel bone33;
	private final RendererModel bone34;
	private final RendererModel bone35;
	private final RendererModel bone36;
	private final RendererModel Main3;
	private final RendererModel bone37;
	private final RendererModel bone38;
	private final RendererModel bone101;
	private final RendererModel bone39;
	private final RendererModel bone40;
	private final RendererModel bone41;
	private final RendererModel bone42;
	private final RendererModel Panel4;
	private final RendererModel Side7;
	private final RendererModel bone43;
	private final RendererModel bone44;
	private final RendererModel bone45;
	private final RendererModel bone46;
	private final RendererModel Side8;
	private final RendererModel bone47;
	private final RendererModel bone48;
	private final RendererModel bone49;
	private final RendererModel bone50;
	private final RendererModel Main4;
	private final RendererModel bone51;
	private final RendererModel bone52;
	private final RendererModel bone53;
	private final RendererModel bone54;
	private final RendererModel bone55;
	private final RendererModel bone56;
	private final RendererModel Panel5;
	private final RendererModel Side9;
	private final RendererModel bone57;
	private final RendererModel bone58;
	private final RendererModel bone59;
	private final RendererModel bone60;
	private final RendererModel Side10;
	private final RendererModel bone61;
	private final RendererModel bone62;
	private final RendererModel bone63;
	private final RendererModel bone64;
	private final RendererModel Main5;
	private final RendererModel bone65;
	private final RendererModel bone66;
	private final RendererModel bone67;
	private final RendererModel bone68;
	private final RendererModel bone69;
	private final RendererModel bone70;
	private final RendererModel Panel6;
	private final RendererModel Side11;
	private final RendererModel bone71;
	private final RendererModel bone72;
	private final RendererModel bone73;
	private final RendererModel bone74;
	private final RendererModel Side12;
	private final RendererModel bone75;
	private final RendererModel bone76;
	private final RendererModel bone77;
	private final RendererModel bone78;
	private final RendererModel Main6;
	private final RendererModel bone79;
	private final RendererModel bone80;
	private final RendererModel bone81;
	private final RendererModel bone82;
	private final RendererModel bone83;
	private final RendererModel bone84;

	public SmithConsole() {
		textureWidth = 128;
		textureHeight = 128;

		EntireModel = new RendererModel(this);
		EntireModel.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(EntireModel, 0.0F, -0.5236F, 0.0F);
		

		MonitorRotation = new RendererModel(this);
		MonitorRotation.setRotationPoint(0.0F, 0.0F, 0.0F);
		EntireModel.addChild(MonitorRotation);
		setRotationAngle(MonitorRotation, 0.0F, -1.2217F, 0.0F);
		

		a1 = new RendererModel(this);
		a1.setRotationPoint(0.0F, -56.58F, 0.0F);
		MonitorRotation.addChild(a1);
		a1.cubeList.add(new ModelBox(a1, 10, 0, -12.25F, 14.2225F, -3.5F, 1, 2, 7, -0.3125F, false));
		a1.cubeList.add(new ModelBox(a1, 10, 0, -12.2505F, 22.9439F, -3.5163F, 1, 1, 7, -0.3125F, false));
		a1.cubeList.add(new ModelBox(a1, 10, 0, -12.2505F, 23.3189F, -6.0163F, 1, 1, 12, -0.3125F, false));
		a1.cubeList.add(new ModelBox(a1, 10, 0, -12.2505F, 32.0689F, -6.0163F, 1, 1, 12, -0.3125F, false));
		a1.cubeList.add(new ModelBox(a1, 10, 0, -12.2505F, 28.0689F, 3.6087F, 1, 1, 2, -0.3125F, false));
		a1.cubeList.add(new ModelBox(a1, 10, 0, -12.2505F, 28.0689F, -5.6413F, 1, 1, 2, -0.3125F, false));
		a1.cubeList.add(new ModelBox(a1, 10, 0, -12.2505F, 23.6939F, 4.9837F, 1, 9, 1, -0.3125F, false));
		a1.cubeList.add(new ModelBox(a1, 10, 0, -12.2505F, 23.6939F, -6.0163F, 1, 9, 1, -0.3125F, false));

		bone127 = new RendererModel(this);
		bone127.setRotationPoint(-2.655F, 33.4875F, -1.38F);
		a1.addChild(bone127);
		bone127.cubeList.add(new ModelBox(bone127, 10, 20, -9.5955F, -1.4186F, -3.6363F, 1, 1, 10, -0.25F, false));

		a2 = new RendererModel(this);
		a2.setRotationPoint(0.0F, -56.58F, 0.0F);
		MonitorRotation.addChild(a2);
		setRotationAngle(a2, 0.0F, -0.5236F, 0.0F);
		a2.cubeList.add(new ModelBox(a2, 10, 0, -12.25F, 14.2225F, -3.5F, 1, 2, 7, -0.3125F, false));
		a2.cubeList.add(new ModelBox(a2, 10, 0, -11.9375F, 14.2225F, -3.5F, 7, 2, 1, -0.312F, false));

		a3 = new RendererModel(this);
		a3.setRotationPoint(0.0F, -56.58F, 0.0F);
		MonitorRotation.addChild(a3);
		setRotationAngle(a3, 0.0F, 0.5236F, 0.0F);
		a3.cubeList.add(new ModelBox(a3, 10, 0, -12.25F, 14.2225F, -3.5F, 1, 2, 7, -0.3125F, false));
		a3.cubeList.add(new ModelBox(a3, 10, 0, -11.9375F, 14.2225F, 2.5F, 7, 2, 1, -0.312F, false));

		Scissors = new RendererModel(this);
		Scissors.setRotationPoint(0.0F, 0.375F, 0.0F);
		MonitorRotation.addChild(Scissors);
		

		LeftSide = new RendererModel(this);
		LeftSide.setRotationPoint(-11.75F, -40.8575F, 3.0F);
		Scissors.addChild(LeftSide);
		setRotationAngle(LeftSide, 0.1745F, 0.0F, 0.0F);
		LeftSide.cubeList.add(new ModelBox(LeftSide, 10, 11, -0.5F, -0.7937F, -7.3931F, 1, 1, 8, -0.3125F, false));
		LeftSide.cubeList.add(new ModelBox(LeftSide, 10, 11, -0.501F, 1.7509F, -7.7075F, 1, 1, 8, -0.3125F, false));
		LeftSide.cubeList.add(new ModelBox(LeftSide, 10, 11, -0.501F, 4.2737F, -8.1513F, 1, 1, 8, -0.3125F, false));
		LeftSide.cubeList.add(new ModelBox(LeftSide, 10, 11, -0.5005F, 0.6149F, -6.7775F, 1, 1, 8, -0.3125F, false));
		LeftSide.cubeList.add(new ModelBox(LeftSide, 10, 11, -0.5005F, 3.1376F, -7.2214F, 1, 1, 8, -0.3125F, false));
		LeftSide.cubeList.add(new ModelBox(LeftSide, 10, 11, -0.5005F, 5.6604F, -7.6652F, 1, 1, 8, -0.31F, false));

		RightSide = new RendererModel(this);
		RightSide.setRotationPoint(-11.75F, -40.8575F, -3.0F);
		Scissors.addChild(RightSide);
		setRotationAngle(RightSide, -0.1745F, 0.0F, 0.0F);
		RightSide.cubeList.add(new ModelBox(RightSide, 10, 11, -0.5F, -0.7937F, -0.6069F, 1, 1, 8, -0.312F, false));
		RightSide.cubeList.add(new ModelBox(RightSide, 10, 11, -0.5F, 1.7287F, -0.1611F, 1, 1, 8, -0.312F, false));
		RightSide.cubeList.add(new ModelBox(RightSide, 10, 11, -0.501F, 4.2274F, 0.4138F, 1, 1, 8, -0.312F, false));
		RightSide.cubeList.add(new ModelBox(RightSide, 10, 11, -0.5005F, 0.5919F, -1.0922F, 1, 1, 8, -0.312F, false));
		RightSide.cubeList.add(new ModelBox(RightSide, 10, 11, -0.5005F, 3.1143F, -0.6464F, 1, 1, 8, -0.312F, false));
		RightSide.cubeList.add(new ModelBox(RightSide, 10, 11, -0.5005F, 5.6367F, -0.2007F, 1, 1, 8, -0.31F, false));

		MonitorBox = new RendererModel(this);
		MonitorBox.setRotationPoint(0.0F, 0.625F, 0.0F);
		MonitorRotation.addChild(MonitorBox);
		MonitorBox.cubeList.add(new ModelBox(MonitorBox, 50, 9, -12.8755F, -30.7611F, -3.5163F, 2, 4, 7, 0.0F, false));
		MonitorBox.cubeList.add(new ModelBox(MonitorBox, 10, 5, -11.7505F, -31.7611F, -4.5163F, 1, 6, 9, 0.0F, false));
		MonitorBox.cubeList.add(new ModelBox(MonitorBox, 10, 32, -13.3755F, -32.3861F, -5.0163F, 3, 2, 10, -0.3125F, false));
		MonitorBox.cubeList.add(new ModelBox(MonitorBox, 10, 32, -13.3755F, -27.0111F, -5.0163F, 3, 2, 10, -0.3125F, false));
		MonitorBox.cubeList.add(new ModelBox(MonitorBox, 10, 32, -13.3755F, -31.1986F, 2.9837F, 3, 5, 2, -0.3128F, false));
		MonitorBox.cubeList.add(new ModelBox(MonitorBox, 10, 32, -13.3755F, -31.1986F, -5.0163F, 3, 5, 2, -0.3128F, false));

		MonitorRing = new RendererModel(this);
		MonitorRing.setRotationPoint(0.0F, -41.25F, 0.0F);
		EntireModel.addChild(MonitorRing);
		

		a = new RendererModel(this);
		a.setRotationPoint(0.0F, -15.33F, 0.0F);
		MonitorRing.addChild(a);
		setRotationAngle(a, 0.0F, 3.1416F, 0.0F);
		a.cubeList.add(new ModelBox(a, 10, 0, -6.5625F, 14.2225F, -2.0F, 1, 2, 4, -0.3125F, false));

		a4 = new RendererModel(this);
		a4.setRotationPoint(0.0F, -15.33F, 0.0F);
		MonitorRing.addChild(a4);
		setRotationAngle(a4, 0.0F, 2.618F, 0.0F);
		a4.cubeList.add(new ModelBox(a4, 10, 0, -6.5625F, 14.2225F, -2.0F, 1, 2, 4, -0.3125F, false));

		a5 = new RendererModel(this);
		a5.setRotationPoint(0.0F, -15.33F, 0.0F);
		MonitorRing.addChild(a5);
		setRotationAngle(a5, 0.0F, 2.0944F, 0.0F);
		a5.cubeList.add(new ModelBox(a5, 10, 0, -6.5625F, 14.2225F, -2.0F, 1, 2, 4, -0.3125F, false));

		a6 = new RendererModel(this);
		a6.setRotationPoint(0.0F, -15.33F, 0.0F);
		MonitorRing.addChild(a6);
		setRotationAngle(a6, 0.0F, 1.5708F, 0.0F);
		a6.cubeList.add(new ModelBox(a6, 10, 0, -6.5625F, 14.2225F, -2.0F, 1, 2, 4, -0.3125F, false));

		a7 = new RendererModel(this);
		a7.setRotationPoint(0.0F, -15.33F, 0.0F);
		MonitorRing.addChild(a7);
		setRotationAngle(a7, 0.0F, 1.0472F, 0.0F);
		a7.cubeList.add(new ModelBox(a7, 10, 0, -6.5625F, 14.2225F, -2.0F, 1, 2, 4, -0.3125F, false));

		a8 = new RendererModel(this);
		a8.setRotationPoint(0.0F, -15.33F, 0.0F);
		MonitorRing.addChild(a8);
		setRotationAngle(a8, 0.0F, 0.5236F, 0.0F);
		a8.cubeList.add(new ModelBox(a8, 10, 0, -6.5625F, 14.2225F, -2.0F, 1, 2, 4, -0.3125F, false));

		a9 = new RendererModel(this);
		a9.setRotationPoint(0.0F, -15.33F, 0.0F);
		MonitorRing.addChild(a9);
		a9.cubeList.add(new ModelBox(a9, 10, 0, -6.5625F, 14.2225F, -2.0F, 1, 2, 4, -0.3125F, false));

		a10 = new RendererModel(this);
		a10.setRotationPoint(0.0F, -15.33F, 0.0F);
		MonitorRing.addChild(a10);
		setRotationAngle(a10, 0.0F, -0.5236F, 0.0F);
		a10.cubeList.add(new ModelBox(a10, 10, 0, -6.5625F, 14.2225F, -2.0F, 1, 2, 4, -0.3125F, false));

		a11 = new RendererModel(this);
		a11.setRotationPoint(0.0F, -15.33F, 0.0F);
		MonitorRing.addChild(a11);
		setRotationAngle(a11, 0.0F, -1.0472F, 0.0F);
		a11.cubeList.add(new ModelBox(a11, 10, 0, -6.5625F, 14.2225F, -2.0F, 1, 2, 4, -0.3125F, false));

		a12 = new RendererModel(this);
		a12.setRotationPoint(0.0F, -15.33F, 0.0F);
		MonitorRing.addChild(a12);
		setRotationAngle(a12, 0.0F, -1.5708F, 0.0F);
		a12.cubeList.add(new ModelBox(a12, 10, 0, -6.5625F, 14.2225F, -2.0F, 1, 2, 4, -0.3125F, false));
		a12.cubeList.add(new ModelBox(a12, 10, 0, -6.5625F, 14.2225F, -1.0F, 3, 2, 2, -0.5625F, false));
		a12.cubeList.add(new ModelBox(a12, 10, 0, 3.5625F, 14.2225F, -1.0F, 3, 2, 2, -0.5625F, true));

		a13 = new RendererModel(this);
		a13.setRotationPoint(0.0F, -15.33F, 0.0F);
		MonitorRing.addChild(a13);
		setRotationAngle(a13, 0.0F, -2.0944F, 0.0F);
		a13.cubeList.add(new ModelBox(a13, 10, 0, -6.5625F, 14.2225F, -2.0F, 1, 2, 4, -0.3125F, false));

		a14 = new RendererModel(this);
		a14.setRotationPoint(0.0F, -15.33F, 0.0F);
		MonitorRing.addChild(a14);
		setRotationAngle(a14, 0.0F, -2.618F, 0.0F);
		a14.cubeList.add(new ModelBox(a14, 10, 0, -6.5625F, 14.2225F, -2.0F, 1, 2, 4, -0.3125F, false));

		ControlSet6 = new RendererModel(this);
		ControlSet6.setRotationPoint(0.0F, 0.0F, 0.0F);
		EntireModel.addChild(ControlSet6);
		

		Idk = new RendererModel(this);
		Idk.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet6.addChild(Idk);
		setRotationAngle(Idk, 0.0F, 1.0472F, 0.0F);
		

		bone123 = new RendererModel(this);
		bone123.setRotationPoint(-0.5F, -14.0F, -11.0F);
		Idk.addChild(bone123);
		setRotationAngle(bone123, 0.6109F, 0.0F, 0.0F);
		bone123.cubeList.add(new ModelBox(bone123, 41, 84, -0.5F, -0.8125F, 1.625F, 2, 1, 2, -0.1875F, false));

		Spin4 = new RendererModel(this);
		Spin4.setRotationPoint(0.5F, -1.625F, 0.625F);
		bone123.addChild(Spin4);
		setRotationAngle(Spin4, -3.1416F, 0.0F, 3.1416F);
		Spin4.cubeList.add(new ModelBox(Spin4, 69, 46, -0.5F, -0.5625F, -2.0F, 1, 3, 1, -0.365F, false));
		Spin4.cubeList.add(new ModelBox(Spin4, 69, 46, -0.5F, -0.5625F, -3.0F, 1, 3, 1, -0.365F, false));

		bone125 = new RendererModel(this);
		bone125.setRotationPoint(0.0F, -0.5F, 0.0F);
		Spin4.addChild(bone125);
		setRotationAngle(bone125, 0.0F, 0.0F, 1.5708F);
		bone125.cubeList.add(new ModelBox(bone125, 43, 16, 0.1875F, -0.5F, -2.5F, 1, 1, 1, 0.0F, false));

		WibblyLever = new RendererModel(this);
		WibblyLever.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet6.addChild(WibblyLever);
		setRotationAngle(WibblyLever, 0.0F, 1.0472F, 0.0F);
		

		Main7 = new RendererModel(this);
		Main7.setRotationPoint(-3.25F, -16.1875F, -8.5625F);
		WibblyLever.addChild(Main7);
		Main7.cubeList.add(new ModelBox(Main7, 20, 23, -1.1231F, -0.9926F, -0.6671F, 2, 2, 2, -0.5625F, false));

		DoorControlLever = new RendererModel(this);
		DoorControlLever.setRotationPoint(-3.3731F, -16.6801F, -8.685F);
		WibblyLever.addChild(DoorControlLever);
		setRotationAngle(DoorControlLever, 0.5672F, 0.0F, 0.0F);
		DoorControlLever.cubeList.add(new ModelBox(DoorControlLever, 63, 40, -1.5F, -1.0F, -0.9821F, 3, 2, 2, -0.86F, false));
		DoorControlLever.cubeList.add(new ModelBox(DoorControlLever, 39, 87, -0.125F, -0.5F, -2.7321F, 1, 1, 3, -0.375F, false));
		DoorControlLever.cubeList.add(new ModelBox(DoorControlLever, 39, 87, -0.375F, -0.5F, -2.7321F, 1, 1, 3, -0.375F, false));
		DoorControlLever.cubeList.add(new ModelBox(DoorControlLever, 46, 36, -0.375F, -0.5F, -5.2321F, 1, 1, 4, -0.376F, false));
		DoorControlLever.cubeList.add(new ModelBox(DoorControlLever, 39, 87, -0.625F, -0.5F, -2.7321F, 1, 1, 3, -0.375F, false));
		DoorControlLever.cubeList.add(new ModelBox(DoorControlLever, 46, 36, -0.625F, -0.5F, -5.2321F, 1, 1, 4, -0.376F, false));
		DoorControlLever.cubeList.add(new ModelBox(DoorControlLever, 39, 87, -0.875F, -0.5F, -2.7321F, 1, 1, 3, -0.375F, false));

		threeswitches = new RendererModel(this);
		threeswitches.setRotationPoint(0.0F, 0.4375F, 0.0F);
		ControlSet6.addChild(threeswitches);
		setRotationAngle(threeswitches, 0.0F, 1.0472F, 0.0F);
		

		Switch1 = new RendererModel(this);
		Switch1.setRotationPoint(1.125F, -13.125F, -13.0F);
		threeswitches.addChild(Switch1);
		setRotationAngle(Switch1, 0.4363F, 0.0F, 0.0F);
		

		Base5 = new RendererModel(this);
		Base5.setRotationPoint(1.0F, 0.0F, 0.0F);
		Switch1.addChild(Base5);
		Base5.cubeList.add(new ModelBox(Base5, 47, 32, -1.0F, -1.375F, 0.5F, 2, 1, 1, -0.375F, false));

		Part6 = new RendererModel(this);
		Part6.setRotationPoint(1.375F, 0.0F, 0.0F);
		Switch1.addChild(Part6);
		Part6.cubeList.add(new ModelBox(Part6, 71, 29, -0.875F, -2.125F, 0.5F, 1, 1, 1, -0.375F, false));
		Part6.cubeList.add(new ModelBox(Part6, 47, 32, -0.875F, -2.125F, 0.5F, 1, 2, 1, -0.4375F, false));

		Switch3 = new RendererModel(this);
		Switch3.setRotationPoint(1.125F, -13.125F, -13.0F);
		threeswitches.addChild(Switch3);
		setRotationAngle(Switch3, 0.4363F, 0.0F, 0.0F);
		

		bone124 = new RendererModel(this);
		bone124.setRotationPoint(-0.125F, -0.8725F, 1.0F);
		Switch3.addChild(bone124);
		

		Base6 = new RendererModel(this);
		Base6.setRotationPoint(0.0F, -0.005F, 0.0F);
		bone124.addChild(Base6);
		setRotationAngle(Base6, 0.0F, -0.7854F, 0.0F);
		Base6.cubeList.add(new ModelBox(Base6, 47, 32, 0.125F, -0.4975F, -0.5F, 2, 1, 1, -0.375F, false));

		Part7 = new RendererModel(this);
		Part7.setRotationPoint(1.125F, 0.0025F, 0.0F);
		Base6.addChild(Part7);
		Part7.cubeList.add(new ModelBox(Part7, 71, 29, -0.5F, -1.25F, -0.5F, 1, 1, 1, -0.375F, false));
		Part7.cubeList.add(new ModelBox(Part7, 47, 32, -0.5F, -1.25F, -0.5F, 1, 2, 1, -0.4375F, false));

		Switch4 = new RendererModel(this);
		Switch4.setRotationPoint(0.75F, -13.125F, -13.0F);
		threeswitches.addChild(Switch4);
		setRotationAngle(Switch4, 0.4363F, 0.0F, 0.0F);
		

		Base7 = new RendererModel(this);
		Base7.setRotationPoint(1.0F, 0.0F, 0.0F);
		Switch4.addChild(Base7);
		Base7.cubeList.add(new ModelBox(Base7, 47, 32, -1.25F, -1.375F, 1.125F, 1, 1, 2, -0.375F, false));

		Part8 = new RendererModel(this);
		Part8.setRotationPoint(0.25F, -0.875F, 2.0625F);
		Switch4.addChild(Part8);
		Part8.cubeList.add(new ModelBox(Part8, 71, 29, -0.5F, -1.25F, -0.5F, 1, 1, 1, -0.375F, false));
		Part8.cubeList.add(new ModelBox(Part8, 47, 32, -0.5F, -1.25F, -0.5F, 1, 2, 1, -0.4375F, false));

		WeirdLeverThing = new RendererModel(this);
		WeirdLeverThing.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet6.addChild(WeirdLeverThing);
		setRotationAngle(WeirdLeverThing, 0.0F, -2.0944F, 0.0F);
		

		Base8 = new RendererModel(this);
		Base8.setRotationPoint(0.0F, 0.0F, 0.0F);
		WeirdLeverThing.addChild(Base8);
		Base8.cubeList.add(new ModelBox(Base8, 80, 55, 5.0F, -13.0F, 13.5F, 1, 1, 1, 0.0F, false));
		Base8.cubeList.add(new ModelBox(Base8, 74, 75, -4.875F, -12.375F, 13.25F, 1, 1, 1, 0.0F, false));
		Base8.cubeList.add(new ModelBox(Base8, 80, 55, 2.0F, -13.0F, 13.5F, 1, 1, 1, 0.0F, false));
		Base8.cubeList.add(new ModelBox(Base8, 80, 55, 2.0F, -13.0F, 14.0F, 1, 1, 1, -0.25F, false));
		Base8.cubeList.add(new ModelBox(Base8, 80, 55, 2.125F, -13.0F, 13.5F, 3, 1, 1, -0.0625F, false));
		Base8.cubeList.add(new ModelBox(Base8, 80, 55, 5.0F, -12.6875F, 13.5F, 1, 4, 1, -0.0625F, false));

		Lever2 = new RendererModel(this);
		Lever2.setRotationPoint(2.5F, -12.5625F, 15.0F);
		Base8.addChild(Lever2);
		setRotationAngle(Lever2, 0.0F, 0.0F, -0.2618F);
		Lever2.cubeList.add(new ModelBox(Lever2, 80, 55, -0.5F, -0.4375F, -0.5F, 1, 5, 1, -0.1875F, false));
		Lever2.cubeList.add(new ModelBox(Lever2, 80, 55, -0.5F, 3.5625F, 0.0625F, 1, 1, 2, -0.25F, false));

		bone126 = new RendererModel(this);
		bone126.setRotationPoint(4.0F, -11.0625F, 14.0F);
		Base8.addChild(bone126);
		setRotationAngle(bone126, 0.0F, 0.0F, -0.7854F);
		bone126.cubeList.add(new ModelBox(bone126, 80, 55, -0.5F, -2.0F, -0.5F, 1, 4, 1, -0.1875F, false));

		Pump4 = new RendererModel(this);
		Pump4.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet6.addChild(Pump4);
		setRotationAngle(Pump4, 0.0F, 0.5236F, 0.0F);
		

		MainRot3 = new RendererModel(this);
		MainRot3.setRotationPoint(-1.3125F, -14.0625F, -12.5F);
		Pump4.addChild(MainRot3);
		setRotationAngle(MainRot3, 0.4712F, 0.0F, 0.0F);
		

		Base9 = new RendererModel(this);
		Base9.setRotationPoint(-0.5F, 14.6138F, 12.4325F);
		MainRot3.addChild(Base9);
		Base9.cubeList.add(new ModelBox(Base9, 65, 21, 0.0F, -15.8125F, -9.0F, 1, 1, 3, 0.0629F, false));
		Base9.cubeList.add(new ModelBox(Base9, 17, 22, 0.0F, -15.0329F, -14.8972F, 1, 1, 3, 0.0629F, false));
		Base9.cubeList.add(new ModelBox(Base9, 65, 21, 0.0F, -15.8125F, -11.5F, 1, 1, 4, -0.1246F, false));

		ControlSet5 = new RendererModel(this);
		ControlSet5.setRotationPoint(0.0F, 0.0F, 0.0F);
		EntireModel.addChild(ControlSet5);
		

		RedSet2 = new RendererModel(this);
		RedSet2.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet5.addChild(RedSet2);
		setRotationAngle(RedSet2, 0.0F, 2.618F, 0.0F);
		

		LeversRot4 = new RendererModel(this);
		LeversRot4.setRotationPoint(0.875F, -11.9284F, -8.3862F);
		RedSet2.addChild(LeversRot4);
		setRotationAngle(LeversRot4, 0.4712F, 0.0F, 0.0F);
		LeversRot4.cubeList.add(new ModelBox(LeversRot4, 63, 38, -0.0625F, -4.5267F, -3.1931F, 1, 1, 3, 0.1875F, false));
		LeversRot4.cubeList.add(new ModelBox(LeversRot4, 82, 54, -0.0625F, -4.5892F, 0.8069F, 1, 1, 1, 0.0625F, false));
		LeversRot4.cubeList.add(new ModelBox(LeversRot4, 63, 38, -0.0625F, -4.2767F, -3.1931F, 1, 1, 3, 0.25F, false));
		LeversRot4.cubeList.add(new ModelBox(LeversRot4, 68, 32, -0.0625F, -4.0892F, 0.8069F, 1, 1, 1, 0.25F, false));
		LeversRot4.cubeList.add(new ModelBox(LeversRot4, 69, 32, -0.4375F, -5.0892F, -2.3181F, 1, 1, 1, -0.25F, false));

		Lev3 = new RendererModel(this);
		Lev3.setRotationPoint(0.0625F, -4.5892F, -1.8181F);
		LeversRot4.addChild(Lev3);
		setRotationAngle(Lev3, 0.9163F, 0.0F, 0.0F);
		Lev3.cubeList.add(new ModelBox(Lev3, 39, 87, -0.5F, -2.8125F, -0.5F, 1, 3, 1, -0.3125F, false));
		Lev3.cubeList.add(new ModelBox(Lev3, 78, 71, -0.75F, -2.8125F, -0.5F, 1, 1, 1, -0.25F, false));
		Lev3.cubeList.add(new ModelBox(Lev3, 78, 71, -0.25F, -2.8125F, -0.5F, 1, 1, 1, -0.25F, false));

		Lev4 = new RendererModel(this);
		Lev4.setRotationPoint(0.8125F, -4.5892F, -1.8181F);
		LeversRot4.addChild(Lev4);
		setRotationAngle(Lev4, 0.2182F, 0.0F, 0.0F);
		Lev4.cubeList.add(new ModelBox(Lev4, 39, 87, -0.5F, -1.6875F, -0.5F, 1, 2, 1, -0.3125F, false));
		Lev4.cubeList.add(new ModelBox(Lev4, 39, 87, -0.3125F, -2.75F, -0.5F, 1, 2, 1, -0.3125F, false));
		Lev4.cubeList.add(new ModelBox(Lev4, 44, 39, -0.3125F, -2.875F, -0.5F, 1, 1, 1, -0.25F, false));
		Lev4.cubeList.add(new ModelBox(Lev4, 44, 39, 0.1875F, -2.875F, -0.5F, 1, 1, 1, -0.25F, false));

		GravityAccelerator = new RendererModel(this);
		GravityAccelerator.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet5.addChild(GravityAccelerator);
		setRotationAngle(GravityAccelerator, 0.0F, 2.0944F, 0.0F);
		

		bone119 = new RendererModel(this);
		bone119.setRotationPoint(-0.5F, -14.0F, -11.0F);
		GravityAccelerator.addChild(bone119);
		setRotationAngle(bone119, 0.6109F, 0.0F, 0.0F);
		bone119.cubeList.add(new ModelBox(bone119, 41, 84, -0.5F, -0.625F, -0.375F, 2, 2, 2, 0.0F, false));

		bone120 = new RendererModel(this);
		bone120.setRotationPoint(0.5F, 0.1702F, -1.7316F);
		bone119.addChild(bone120);
		setRotationAngle(bone120, -0.2182F, 0.0F, 0.0F);
		bone120.cubeList.add(new ModelBox(bone120, 80, 54, -1.0F, -1.0F, -1.1875F, 2, 2, 2, 0.0F, false));

		Spin3 = new RendererModel(this);
		Spin3.setRotationPoint(0.5F, -1.625F, 0.625F);
		bone119.addChild(Spin3);
		setRotationAngle(Spin3, -3.1416F, 1.5272F, 3.1416F);
		Spin3.cubeList.add(new ModelBox(Spin3, 94, 57, -0.5F, -1.4375F, 0.0F, 1, 3, 1, -0.365F, false));
		Spin3.cubeList.add(new ModelBox(Spin3, 94, 57, -0.5F, -1.4375F, -1.0F, 1, 3, 1, -0.365F, false));
		Spin3.cubeList.add(new ModelBox(Spin3, 94, 57, -1.0F, 0.1875F, -1.0F, 2, 1, 2, -0.1875F, false));

		bone122 = new RendererModel(this);
		bone122.setRotationPoint(0.4272F, -0.9506F, -0.0004F);
		Spin3.addChild(bone122);
		setRotationAngle(bone122, 0.0F, 0.0F, -2.138F);
		bone122.cubeList.add(new ModelBox(bone122, 92, 57, -1.0F, -0.9375F, -0.5F, 2, 1, 1, 0.0F, false));

		RotaryHandle = new RendererModel(this);
		RotaryHandle.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet5.addChild(RotaryHandle);
		setRotationAngle(RotaryHandle, 0.0F, -1.0472F, 0.0F);
		RotaryHandle.cubeList.add(new ModelBox(RotaryHandle, 65, 31, 4.375F, -12.3125F, 13.625F, 1, 1, 1, -0.125F, false));
		RotaryHandle.cubeList.add(new ModelBox(RotaryHandle, 44, 11, 4.375F, -12.3125F, 13.3125F, 1, 1, 1, 0.0F, false));

		Handle2 = new RendererModel(this);
		Handle2.setRotationPoint(4.875F, -11.8125F, 14.875F);
		RotaryHandle.addChild(Handle2);
		Handle2.cubeList.add(new ModelBox(Handle2, 65, 31, -0.5F, -0.5F, -0.6875F, 1, 1, 1, -0.3125F, false));
		Handle2.cubeList.add(new ModelBox(Handle2, 65, 31, -0.5F, 0.8125F, -0.6875F, 1, 1, 1, -0.3125F, false));
		Handle2.cubeList.add(new ModelBox(Handle2, 65, 31, -0.5F, -0.25F, -0.6875F, 1, 2, 1, -0.375F, false));
		Handle2.cubeList.add(new ModelBox(Handle2, 65, 31, -0.5F, 0.8125F, -0.375F, 1, 1, 1, -0.375F, false));
		Handle2.cubeList.add(new ModelBox(Handle2, 65, 31, -0.5F, 0.8125F, -0.0625F, 1, 1, 1, -0.32F, false));

		Pump = new RendererModel(this);
		Pump.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet5.addChild(Pump);
		setRotationAngle(Pump, 0.0F, 1.5708F, 0.0F);
		

		MainRot2 = new RendererModel(this);
		MainRot2.setRotationPoint(-1.3125F, -14.0625F, -12.5F);
		Pump.addChild(MainRot2);
		setRotationAngle(MainRot2, 0.4712F, 0.0F, 0.0F);
		

		Base4 = new RendererModel(this);
		Base4.setRotationPoint(-0.5F, 13.5F, 13.0F);
		MainRot2.addChild(Base4);
		Base4.cubeList.add(new ModelBox(Base4, 22, 24, 0.0F, -15.8125F, -11.5F, 1, 1, 3, 0.065F, false));
		Base4.cubeList.add(new ModelBox(Base4, 45, 31, 0.0F, -15.8125F, -9.5F, 1, 1, 4, -0.1246F, false));

		bone121 = new RendererModel(this);
		bone121.setRotationPoint(0.5F, -15.3125F, -10.0F);
		Base4.addChild(bone121);
		setRotationAngle(bone121, 0.6545F, 0.0F, 0.0F);
		bone121.cubeList.add(new ModelBox(bone121, 39, 87, -0.5F, -1.3351F, -3.9602F, 1, 1, 3, 0.0629F, false));
		bone121.cubeList.add(new ModelBox(bone121, 39, 87, -0.5F, 0.3351F, -2.1656F, 1, 1, 3, 0.0629F, false));

		ZigZagPlotter = new RendererModel(this);
		ZigZagPlotter.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet5.addChild(ZigZagPlotter);
		setRotationAngle(ZigZagPlotter, 0.0F, -1.0472F, 0.0F);
		ZigZagPlotter.cubeList.add(new ModelBox(ZigZagPlotter, 17, 25, -5.5F, -12.9375F, 13.1875F, 2, 2, 2, -0.4375F, false));
		ZigZagPlotter.cubeList.add(new ModelBox(ZigZagPlotter, 95, 73, -5.5F, -12.9375F, 13.9375F, 2, 2, 3, -0.5625F, false));

		Moveable = new RendererModel(this);
		Moveable.setRotationPoint(-3.5F, -10.9375F, 14.375F);
		ZigZagPlotter.addChild(Moveable);
		Moveable.cubeList.add(new ModelBox(Moveable, 65, 43, -1.8125F, -2.875F, -0.375F, 2, 3, 2, -0.875F, false));
		Moveable.cubeList.add(new ModelBox(Moveable, 65, 43, -1.8125F, -3.0625F, -0.375F, 2, 2, 2, -0.8125F, false));

		ControlSet4 = new RendererModel(this);
		ControlSet4.setRotationPoint(0.0F, 0.0F, 0.0F);
		EntireModel.addChild(ControlSet4);
		

		Phone = new RendererModel(this);
		Phone.setRotationPoint(-1.0625F, -19.5F, 10.5F);
		ControlSet4.addChild(Phone);
		Phone.cubeList.add(new ModelBox(Phone, 47, 33, 0.0625F, -2.192F, -4.5915F, 2, 3, 1, 0.0F, false));
		Phone.cubeList.add(new ModelBox(Phone, 39, 87, 0.125F, -2.192F, -4.404F, 1, 3, 1, -0.0625F, false));
		Phone.cubeList.add(new ModelBox(Phone, 39, 87, 0.375F, -2.192F, -4.404F, 1, 3, 1, -0.0624F, false));
		Phone.cubeList.add(new ModelBox(Phone, 65, 42, 1.1875F, -2.192F, -4.279F, 1, 3, 1, -0.1875F, false));

		Typewriter = new RendererModel(this);
		Typewriter.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet4.addChild(Typewriter);
		

		rot = new RendererModel(this);
		rot.setRotationPoint(-1.5F, -13.5F, 13.5F);
		Typewriter.addChild(rot);
		setRotationAngle(rot, -0.5236F, 0.0F, 0.0F);
		rot.cubeList.add(new ModelBox(rot, 90, 56, -2.5F, -0.5F, -3.5F, 4, 1, 4, 0.0F, false));
		rot.cubeList.add(new ModelBox(rot, 96, 64, -0.5F, -0.692F, -5.779F, 4, 2, 2, 0.0F, false));
		rot.cubeList.add(new ModelBox(rot, 96, 64, -0.5F, -0.692F, -5.779F, 4, 2, 2, 0.0F, false));
		rot.cubeList.add(new ModelBox(rot, 94, 68, -2.5F, -0.7706F, -2.1563F, 4, 1, 4, -0.25F, false));
		rot.cubeList.add(new ModelBox(rot, 94, 68, -2.5F, -0.7706F, -2.1563F, 4, 1, 4, -0.25F, false));
		rot.cubeList.add(new ModelBox(rot, 90, 56, -2.5F, -1.4375F, -1.5F, 4, 1, 1, -0.01F, false));
		rot.cubeList.add(new ModelBox(rot, 63, 44, -2.5F, -1.5F, -3.5F, 4, 1, 1, 0.0F, false));
		rot.cubeList.add(new ModelBox(rot, 63, 44, -2.5F, -1.5251F, -2.4063F, 4, 1, 1, -0.125F, false));
		rot.cubeList.add(new ModelBox(rot, 63, 44, 0.75F, -1.5876F, -3.4063F, 1, 1, 2, -0.26F, false));
		rot.cubeList.add(new ModelBox(rot, 63, 44, -3.25F, -2.0876F, -3.9063F, 2, 2, 3, -0.76F, false));

		Dials4 = new RendererModel(this);
		Dials4.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet4.addChild(Dials4);
		setRotationAngle(Dials4, 0.0F, -2.618F, 0.0F);
		

		Base3 = new RendererModel(this);
		Base3.setRotationPoint(1.3125F, -14.8125F, -12.75F);
		Dials4.addChild(Base3);
		setRotationAngle(Base3, 0.48F, 0.0F, 0.0F);
		Base3.cubeList.add(new ModelBox(Base3, 39, 87, -0.5F, 0.2207F, -0.8752F, 1, 1, 1, -0.0625F, false));
		Base3.cubeList.add(new ModelBox(Base3, 39, 87, -0.5F, 0.2207F, 0.3748F, 1, 1, 1, -0.0625F, false));

		ControlSet3 = new RendererModel(this);
		ControlSet3.setRotationPoint(0.0F, 0.0F, 0.0F);
		EntireModel.addChild(ControlSet3);
		

		RedSet1 = new RendererModel(this);
		RedSet1.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet3.addChild(RedSet1);
		setRotationAngle(RedSet1, 0.0F, -1.5708F, 0.0F);
		

		LeversRot2 = new RendererModel(this);
		LeversRot2.setRotationPoint(0.875F, -11.9284F, -8.3862F);
		RedSet1.addChild(LeversRot2);
		setRotationAngle(LeversRot2, 0.4712F, 0.0F, 0.0F);
		LeversRot2.cubeList.add(new ModelBox(LeversRot2, 62, 41, -0.0625F, -4.5267F, -3.1931F, 1, 1, 3, 0.1875F, false));
		LeversRot2.cubeList.add(new ModelBox(LeversRot2, 48, 65, -0.0625F, -4.5892F, 0.8069F, 1, 1, 1, 0.0625F, false));
		LeversRot2.cubeList.add(new ModelBox(LeversRot2, 62, 41, -0.0625F, -4.2767F, -3.1931F, 1, 1, 3, 0.25F, false));
		LeversRot2.cubeList.add(new ModelBox(LeversRot2, 33, 45, -0.0625F, -4.0892F, 0.8069F, 1, 1, 1, 0.25F, false));
		LeversRot2.cubeList.add(new ModelBox(LeversRot2, 62, 41, -0.4375F, -5.0892F, -2.3181F, 1, 1, 1, -0.25F, false));

		Lev1 = new RendererModel(this);
		Lev1.setRotationPoint(0.0625F, -4.5892F, -1.8181F);
		LeversRot2.addChild(Lev1);
		setRotationAngle(Lev1, -0.6981F, 0.0F, 0.0F);
		Lev1.cubeList.add(new ModelBox(Lev1, 40, 9, -0.5F, -2.8125F, -0.5F, 1, 3, 1, -0.3125F, false));
		Lev1.cubeList.add(new ModelBox(Lev1, 76, 71, -0.75F, -2.8125F, -0.5F, 1, 1, 1, -0.25F, false));
		Lev1.cubeList.add(new ModelBox(Lev1, 76, 71, -0.25F, -2.8125F, -0.5F, 1, 1, 1, -0.25F, false));

		Lev2 = new RendererModel(this);
		Lev2.setRotationPoint(0.8125F, -4.5892F, -1.8181F);
		LeversRot2.addChild(Lev2);
		setRotationAngle(Lev2, 1.0036F, 0.0F, 0.0F);
		Lev2.cubeList.add(new ModelBox(Lev2, 43, 14, -0.5F, -1.6875F, -0.5F, 1, 2, 1, -0.3125F, false));
		Lev2.cubeList.add(new ModelBox(Lev2, 43, 14, -0.3125F, -2.75F, -0.5F, 1, 2, 1, -0.3125F, false));
		Lev2.cubeList.add(new ModelBox(Lev2, 49, 33, -0.3125F, -2.875F, -0.5F, 1, 1, 1, -0.25F, false));
		Lev2.cubeList.add(new ModelBox(Lev2, 49, 33, 0.1875F, -2.875F, -0.5F, 1, 1, 1, -0.25F, false));

		RANDOMPARTS = new RendererModel(this);
		RANDOMPARTS.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet3.addChild(RANDOMPARTS);
		setRotationAngle(RANDOMPARTS, 0.0F, -2.618F, 0.0F);
		

		LeversRot3 = new RendererModel(this);
		LeversRot3.setRotationPoint(-0.875F, -11.9284F, -8.3862F);
		RANDOMPARTS.addChild(LeversRot3);
		setRotationAngle(LeversRot3, 0.4712F, 0.0F, 0.0F);
		LeversRot3.cubeList.add(new ModelBox(LeversRot3, 24, 49, -0.9375F, -5.1517F, 0.8069F, 1, 1, 1, 0.0625F, false));
		LeversRot3.cubeList.add(new ModelBox(LeversRot3, 39, 84, -0.9375F, -4.0892F, 0.8069F, 1, 1, 1, 0.25F, false));
		LeversRot3.cubeList.add(new ModelBox(LeversRot3, 39, 84, -0.9375F, -4.0892F, -2.1306F, 1, 1, 2, 0.25F, false));
		LeversRot3.cubeList.add(new ModelBox(LeversRot3, 39, 84, -0.9375F, -5.9017F, -0.6306F, 1, 2, 1, -0.375F, false));
		LeversRot3.cubeList.add(new ModelBox(LeversRot3, 39, 84, -1.4375F, -5.8392F, 0.3069F, 2, 1, 2, -0.375F, false));

		bone102 = new RendererModel(this);
		bone102.setRotationPoint(-0.4375F, -6.4017F, -0.1306F);
		LeversRot3.addChild(bone102);
		setRotationAngle(bone102, 0.5236F, 0.0F, 0.0F);
		bone102.cubeList.add(new ModelBox(bone102, 39, 84, -0.5F, -0.8047F, -0.9542F, 1, 2, 1, -0.375F, false));
		bone102.cubeList.add(new ModelBox(bone102, 39, 84, -0.5F, -0.8047F, -0.9542F, 1, 1, 1, -0.3125F, false));

		LightBars = new RendererModel(this);
		LightBars.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet3.addChild(LightBars);
		setRotationAngle(LightBars, 0.0F, -2.0944F, 0.0F);
		LightBars.cubeList.add(new ModelBox(LightBars, 46, 63, -2.6752F, -22.0625F, -8.1875F, 2, 6, 2, -0.5F, false));
		LightBars.cubeList.add(new ModelBox(LightBars, 46, 63, 0.8248F, -22.0625F, -8.1875F, 2, 6, 2, -0.5F, false));

		MiniLever = new RendererModel(this);
		MiniLever.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet3.addChild(MiniLever);
		setRotationAngle(MiniLever, 0.0F, -2.0944F, 0.0F);
		MiniLever.cubeList.add(new ModelBox(MiniLever, 40, 86, -0.5F, -20.25F, -7.0625F, 1, 2, 2, -0.125F, false));
		MiniLever.cubeList.add(new ModelBox(MiniLever, 62, 37, -0.5F, -20.25F, -7.1875F, 1, 2, 2, -0.1875F, false));

		Part = new RendererModel(this);
		Part.setRotationPoint(-0.375F, -19.1875F, -6.875F);
		MiniLever.addChild(Part);
		setRotationAngle(Part, -0.9163F, 0.0F, 0.0F);
		Part.cubeList.add(new ModelBox(Part, 50, 38, -0.5F, -0.5F, -1.5625F, 1, 1, 2, -0.4F, false));
		Part.cubeList.add(new ModelBox(Part, 50, 38, -0.5F, -0.5F, -1.6875F, 1, 1, 1, -0.37F, false));

		Taps = new RendererModel(this);
		Taps.setRotationPoint(0.0F, 1.0F, 0.0F);
		ControlSet3.addChild(Taps);
		setRotationAngle(Taps, 0.0F, -2.0944F, 0.0F);
		

		Tap1 = new RendererModel(this);
		Tap1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Taps.addChild(Tap1);
		Tap1.cubeList.add(new ModelBox(Tap1, 84, 56, -3.0F, -15.75F, -13.5F, 1, 2, 1, -0.375F, false));

		bone103 = new RendererModel(this);
		bone103.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap1.addChild(bone103);
		bone103.cubeList.add(new ModelBox(bone103, 41, 47, -1.0F, -0.5F, -0.5F, 2, 1, 1, -0.4375F, false));

		bone104 = new RendererModel(this);
		bone104.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap1.addChild(bone104);
		setRotationAngle(bone104, 0.0F, -0.7854F, 0.0F);
		bone104.cubeList.add(new ModelBox(bone104, 41, 47, -1.0F, -0.5F, -0.5F, 2, 1, 1, -0.4375F, false));

		bone105 = new RendererModel(this);
		bone105.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap1.addChild(bone105);
		setRotationAngle(bone105, 0.0F, -1.5708F, 0.0F);
		bone105.cubeList.add(new ModelBox(bone105, 41, 47, -1.0F, -0.5F, -0.5F, 2, 1, 1, -0.4375F, false));

		bone106 = new RendererModel(this);
		bone106.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap1.addChild(bone106);
		setRotationAngle(bone106, 0.0F, -2.3562F, 0.0F);
		bone106.cubeList.add(new ModelBox(bone106, 41, 47, -1.0F, -0.5F, -0.5F, 2, 1, 1, -0.4375F, false));

		Tap2 = new RendererModel(this);
		Tap2.setRotationPoint(-0.5513F, -0.9375F, 1.5452F);
		Taps.addChild(Tap2);
		Tap2.cubeList.add(new ModelBox(Tap2, 81, 53, -3.5F, -16.25F, -14.0F, 2, 3, 2, -0.875F, false));

		bone107 = new RendererModel(this);
		bone107.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap2.addChild(bone107);
		bone107.cubeList.add(new ModelBox(bone107, 41, 47, -1.0F, -0.5F, -0.5F, 2, 1, 1, -0.4375F, false));

		bone108 = new RendererModel(this);
		bone108.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap2.addChild(bone108);
		setRotationAngle(bone108, 0.0F, -0.7854F, 0.0F);
		bone108.cubeList.add(new ModelBox(bone108, 41, 47, -1.0F, -0.5F, -0.5F, 2, 1, 1, -0.4375F, false));

		bone109 = new RendererModel(this);
		bone109.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap2.addChild(bone109);
		setRotationAngle(bone109, 0.0F, -1.5708F, 0.0F);
		bone109.cubeList.add(new ModelBox(bone109, 41, 47, -1.0F, -0.5F, -0.5F, 2, 1, 1, -0.4375F, false));

		bone110 = new RendererModel(this);
		bone110.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap2.addChild(bone110);
		setRotationAngle(bone110, 0.0F, -2.3562F, 0.0F);
		bone110.cubeList.add(new ModelBox(bone110, 41, 47, -1.0F, -0.5F, -0.5F, 2, 1, 1, -0.4375F, false));

		Tap3 = new RendererModel(this);
		Tap3.setRotationPoint(0.4771F, -0.5F, 0.9514F);
		Taps.addChild(Tap3);
		Tap3.cubeList.add(new ModelBox(Tap3, 81, 53, -3.5F, -16.25F, -14.0F, 2, 3, 2, -0.875F, false));

		bone111 = new RendererModel(this);
		bone111.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap3.addChild(bone111);
		bone111.cubeList.add(new ModelBox(bone111, 41, 47, -1.0F, -0.5F, -0.5F, 2, 1, 1, -0.4375F, false));

		bone112 = new RendererModel(this);
		bone112.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap3.addChild(bone112);
		setRotationAngle(bone112, 0.0F, -0.7854F, 0.0F);
		bone112.cubeList.add(new ModelBox(bone112, 41, 47, -1.0F, -0.5F, -0.5F, 2, 1, 1, -0.4375F, false));

		bone113 = new RendererModel(this);
		bone113.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap3.addChild(bone113);
		setRotationAngle(bone113, 0.0F, -1.5708F, 0.0F);
		bone113.cubeList.add(new ModelBox(bone113, 41, 47, -1.0F, -0.5F, -0.5F, 2, 1, 1, -0.4375F, false));

		bone114 = new RendererModel(this);
		bone114.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap3.addChild(bone114);
		setRotationAngle(bone114, 0.0F, -2.3562F, 0.0F);
		bone114.cubeList.add(new ModelBox(bone114, 41, 47, -1.0F, -0.5F, -0.5F, 2, 1, 1, -0.4375F, false));

		ControlSet2 = new RendererModel(this);
		ControlSet2.setRotationPoint(0.0F, 0.0F, 0.0F);
		EntireModel.addChild(ControlSet2);
		

		WeridLever = new RendererModel(this);
		WeridLever.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet2.addChild(WeridLever);
		setRotationAngle(WeridLever, 0.0F, -0.5236F, 0.0F);
		

		LeversRot = new RendererModel(this);
		LeversRot.setRotationPoint(0.875F, -11.9284F, -8.3862F);
		WeridLever.addChild(LeversRot);
		setRotationAngle(LeversRot, 0.4712F, 0.0F, 0.0F);
		LeversRot.cubeList.add(new ModelBox(LeversRot, 81, 55, -0.0625F, -4.6517F, -3.1931F, 1, 1, 2, 0.125F, false));
		LeversRot.cubeList.add(new ModelBox(LeversRot, 43, 85, -0.0625F, -4.2767F, -3.1931F, 1, 1, 2, 0.25F, false));

		Levers = new RendererModel(this);
		Levers.setRotationPoint(0.4375F, -4.4017F, -2.9431F);
		LeversRot.addChild(Levers);
		setRotationAngle(Levers, 0.5236F, 0.0F, 0.0F);
		Levers.cubeList.add(new ModelBox(Levers, 68, 39, -1.1875F, -2.5F, -0.5F, 1, 3, 1, -0.375F, false));
		Levers.cubeList.add(new ModelBox(Levers, 68, 39, -1.1875F, -2.5F, -0.5F, 1, 1, 1, -0.3125F, false));
		Levers.cubeList.add(new ModelBox(Levers, 68, 39, 0.1875F, -2.5F, -0.5F, 1, 3, 1, -0.375F, false));
		Levers.cubeList.add(new ModelBox(Levers, 68, 39, 0.1875F, -2.5F, -0.5F, 1, 1, 1, -0.3125F, false));

		Dials = new RendererModel(this);
		Dials.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet2.addChild(Dials);
		setRotationAngle(Dials, 0.0F, -1.5708F, 0.0F);
		

		Dial1 = new RendererModel(this);
		Dial1.setRotationPoint(-0.875F, -11.9284F, -8.3862F);
		Dials.addChild(Dial1);
		setRotationAngle(Dial1, 0.4712F, 0.0F, 0.0F);
		Dial1.cubeList.add(new ModelBox(Dial1, 67, 73, -0.9375F, -4.6517F, -3.1931F, 1, 1, 1, 0.125F, false));
		Dial1.cubeList.add(new ModelBox(Dial1, 67, 73, -0.9375F, -4.6517F, -1.6931F, 1, 1, 1, 0.125F, false));
		Dial1.cubeList.add(new ModelBox(Dial1, 48, 34, -0.9375F, -4.2767F, -3.1931F, 1, 1, 2, 0.25F, false));
		Dial1.cubeList.add(new ModelBox(Dial1, 48, 34, -0.9375F, -4.2767F, -2.6931F, 1, 1, 2, 0.24F, false));
		Dial1.cubeList.add(new ModelBox(Dial1, 48, 67, -0.9375F, -3.9982F, -0.085F, 1, 1, 2, 0.24F, false));

		Dials2 = new RendererModel(this);
		Dials2.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet2.addChild(Dials2);
		setRotationAngle(Dials2, 0.0F, -0.5236F, 0.0F);
		

		Dial2 = new RendererModel(this);
		Dial2.setRotationPoint(0.875F, -11.9284F, -8.3862F);
		Dials2.addChild(Dial2);
		setRotationAngle(Dial2, 0.4712F, 0.0F, 0.0F);
		Dial2.cubeList.add(new ModelBox(Dial2, 21, 45, -1.0625F, -4.9982F, -0.085F, 3, 2, 3, -0.76F, false));
		Dial2.cubeList.add(new ModelBox(Dial2, 21, 45, -0.4375F, -4.5527F, 0.5631F, 1, 1, 1, -0.25F, false));
		Dial2.cubeList.add(new ModelBox(Dial2, 21, 45, -0.4375F, -5.8652F, 0.5631F, 1, 2, 1, -0.3125F, false));
		Dial2.cubeList.add(new ModelBox(Dial2, 21, 45, 0.375F, -4.5527F, 0.5631F, 1, 1, 1, -0.25F, false));
		Dial2.cubeList.add(new ModelBox(Dial2, 21, 45, 0.375F, -5.8652F, 0.5631F, 1, 2, 1, -0.3125F, false));

		KeyBoard = new RendererModel(this);
		KeyBoard.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet2.addChild(KeyBoard);
		setRotationAngle(KeyBoard, 0.0F, -1.0472F, 0.0F);
		

		bone92 = new RendererModel(this);
		bone92.setRotationPoint(-0.5F, -11.75F, -14.0F);
		KeyBoard.addChild(bone92);
		setRotationAngle(bone92, 0.7592F, 0.0F, 0.0F);
		bone92.cubeList.add(new ModelBox(bone92, 103, 40, -2.5F, -1.006F, -1.9566F, 6, 1, 3, -0.375F, false));

		AtomAccelerator = new RendererModel(this);
		AtomAccelerator.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet2.addChild(AtomAccelerator);
		setRotationAngle(AtomAccelerator, 0.0F, -1.0472F, 0.0F);
		

		bone89 = new RendererModel(this);
		bone89.setRotationPoint(-0.5F, -14.0F, -11.0F);
		AtomAccelerator.addChild(bone89);
		setRotationAngle(bone89, 0.6109F, 0.0F, 0.0F);
		bone89.cubeList.add(new ModelBox(bone89, 82, 57, -0.5F, -0.625F, -0.375F, 2, 2, 2, 0.0F, false));
		bone89.cubeList.add(new ModelBox(bone89, 82, 57, -0.5F, -1.0F, -0.375F, 2, 1, 2, -0.1875F, false));

		bone90 = new RendererModel(this);
		bone90.setRotationPoint(0.5F, 0.5F, -0.5F);
		bone89.addChild(bone90);
		setRotationAngle(bone90, -0.2182F, 0.0F, 0.0F);
		bone90.cubeList.add(new ModelBox(bone90, 75, 71, -1.0F, -1.7982F, -2.3032F, 2, 2, 2, -0.6875F, false));
		bone90.cubeList.add(new ModelBox(bone90, 61, 56, -2.5F, -1.7982F, -1.8032F, 2, 2, 2, -0.6875F, false));

		Spin = new RendererModel(this);
		Spin.setRotationPoint(0.5F, 0.5F, -0.5F);
		bone89.addChild(Spin);
		Spin.cubeList.add(new ModelBox(Spin, 82, 57, -0.5F, -2.9375F, 0.625F, 1, 2, 1, -0.375F, false));

		bone91 = new RendererModel(this);
		bone91.setRotationPoint(0.0F, -2.125F, 1.125F);
		Spin.addChild(bone91);
		bone91.cubeList.add(new ModelBox(bone91, 40, 46, -0.5F, -1.0F, -1.0F, 1, 2, 2, -0.365F, false));
		bone91.cubeList.add(new ModelBox(bone91, 46, 69, -1.0F, -0.5F, -1.0F, 2, 1, 2, -0.364F, false));
		bone91.cubeList.add(new ModelBox(bone91, 76, 70, -1.0F, -1.0F, -0.5F, 2, 2, 1, -0.375F, false));

		Gyroscope = new RendererModel(this);
		Gyroscope.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet2.addChild(Gyroscope);
		setRotationAngle(Gyroscope, 0.0F, -1.0472F, 0.0F);
		

		Frame = new RendererModel(this);
		Frame.setRotationPoint(0.0F, 0.0F, 0.0F);
		Gyroscope.addChild(Frame);
		Frame.cubeList.add(new ModelBox(Frame, 50, 70, -3.25F, -18.5F, -8.25F, 1, 2, 1, -0.25F, false));
		Frame.cubeList.add(new ModelBox(Frame, 43, 68, 2.25F, -18.5F, -8.25F, 1, 2, 1, -0.25F, false));
		Frame.cubeList.add(new ModelBox(Frame, 43, 68, -1.5178F, -20.2678F, -8.25F, 3, 1, 1, -0.25F, false));
		Frame.cubeList.add(new ModelBox(Frame, 43, 68, -0.75F, -20.5803F, -9.0F, 2, 1, 2, -0.3126F, false));
		Frame.cubeList.add(new ModelBox(Frame, 43, 68, -0.75F, -20.5803F, -8.5F, 2, 1, 2, -0.3124F, false));
		Frame.cubeList.add(new ModelBox(Frame, 43, 68, -1.25F, -20.5803F, -8.5F, 2, 1, 2, -0.3125F, false));
		Frame.cubeList.add(new ModelBox(Frame, 43, 68, -1.25F, -20.5803F, -9.0F, 2, 1, 2, -0.3124F, false));

		bone93 = new RendererModel(this);
		bone93.setRotationPoint(3.0607F, -18.25F, -7.75F);
		Frame.addChild(bone93);
		setRotationAngle(bone93, 0.0F, 0.0F, -0.7854F);
		bone93.cubeList.add(new ModelBox(bone93, 43, 68, -0.7929F, -2.7929F, -0.5F, 1, 3, 1, -0.2501F, false));

		bone94 = new RendererModel(this);
		bone94.setRotationPoint(-2.7678F, -19.0429F, -7.75F);
		Frame.addChild(bone94);
		setRotationAngle(bone94, 0.0F, 0.0F, 0.7854F);
		bone94.cubeList.add(new ModelBox(bone94, 43, 68, 0.1464F, -2.0251F, -0.5F, 1, 3, 1, -0.2501F, false));

		Spin2 = new RendererModel(this);
		Spin2.setRotationPoint(0.0F, -20.9151F, -7.75F);
		Gyroscope.addChild(Spin2);
		setRotationAngle(Spin2, -3.1416F, 2.5307F, 3.1416F);
		Spin2.cubeList.add(new ModelBox(Spin2, 43, 68, -1.0F, -0.6651F, -0.5F, 2, 1, 1, -0.375F, false));
		Spin2.cubeList.add(new ModelBox(Spin2, 43, 68, 0.0752F, -1.7571F, -0.5F, 1, 1, 1, -0.375F, false));
		Spin2.cubeList.add(new ModelBox(Spin2, 43, 68, -0.1748F, -1.7571F, -0.5F, 1, 1, 1, -0.375F, false));
		Spin2.cubeList.add(new ModelBox(Spin2, 43, 68, -1.25F, 0.0224F, -1.25F, 2, 1, 2, -0.375F, false));
		Spin2.cubeList.add(new ModelBox(Spin2, 43, 68, -0.75F, 0.0224F, -1.25F, 2, 1, 2, -0.374F, false));
		Spin2.cubeList.add(new ModelBox(Spin2, 43, 68, -1.25F, 0.0224F, -0.75F, 2, 1, 2, -0.377F, false));
		Spin2.cubeList.add(new ModelBox(Spin2, 43, 68, -0.75F, 0.0224F, -0.75F, 2, 1, 2, -0.375F, false));

		bone98 = new RendererModel(this);
		bone98.setRotationPoint(0.75F, -1.7276F, 0.0F);
		Spin2.addChild(bone98);
		setRotationAngle(bone98, 0.0F, 0.0F, 0.7854F);
		bone98.cubeList.add(new ModelBox(bone98, 43, 68, 0.4799F, 0.6566F, -0.5F, 1, 1, 1, -0.375F, false));
		bone98.cubeList.add(new ModelBox(bone98, 43, 68, -0.1659F, -0.0955F, -0.5F, 1, 1, 1, -0.375F, false));

		bone99 = new RendererModel(this);
		bone99.setRotationPoint(0.75F, -1.7276F, 0.0F);
		Spin2.addChild(bone99);
		setRotationAngle(bone99, 0.0F, 0.0F, 0.3054F);
		bone99.cubeList.add(new ModelBox(bone99, 43, 68, -0.1213F, 0.8002F, -0.5F, 1, 1, 1, -0.375F, false));

		bone100 = new RendererModel(this);
		bone100.setRotationPoint(0.75F, -1.7276F, 0.0F);
		Spin2.addChild(bone100);
		bone100.cubeList.add(new ModelBox(bone100, 43, 68, -0.498F, 0.6473F, -0.5F, 1, 1, 1, -0.375F, false));
		bone100.cubeList.add(new ModelBox(bone100, 43, 68, -0.498F, 0.3973F, -0.5F, 1, 1, 1, -0.375F, false));
		bone100.cubeList.add(new ModelBox(bone100, 43, 68, -0.498F, 0.1473F, -0.5F, 1, 1, 1, -0.375F, false));

		bone95 = new RendererModel(this);
		bone95.setRotationPoint(-0.3125F, -1.1026F, 0.0F);
		Spin2.addChild(bone95);
		setRotationAngle(bone95, 0.0F, 0.0F, -1.2654F);
		bone95.cubeList.add(new ModelBox(bone95, 43, 68, -2.1354F, -0.4117F, -0.5F, 2, 1, 1, -0.375F, false));
		bone95.cubeList.add(new ModelBox(bone95, 43, 68, -1.7604F, -0.4117F, -0.5F, 3, 1, 1, -0.3749F, false));

		bone96 = new RendererModel(this);
		bone96.setRotationPoint(0.3125F, -1.1026F, 0.0F);
		Spin2.addChild(bone96);
		setRotationAngle(bone96, 0.0F, 0.0F, 1.2654F);
		bone96.cubeList.add(new ModelBox(bone96, 43, 68, 0.1354F, -0.4117F, -0.5F, 2, 1, 1, -0.375F, false));
		bone96.cubeList.add(new ModelBox(bone96, 43, 68, -1.1146F, -0.4117F, -0.5F, 3, 1, 1, -0.3749F, false));

		bone97 = new RendererModel(this);
		bone97.setRotationPoint(-0.3125F, -1.9776F, 0.0F);
		Spin2.addChild(bone97);
		setRotationAngle(bone97, 0.0F, 0.0F, -0.7854F);
		bone97.cubeList.add(new ModelBox(bone97, 43, 68, -2.1172F, -0.342F, -0.5F, 3, 1, 1, -0.3125F, false));
		bone97.cubeList.add(new ModelBox(bone97, 43, 68, -1.7422F, -0.342F, -0.5F, 3, 1, 1, -0.3124F, false));

		ControlSet1 = new RendererModel(this);
		ControlSet1.setRotationPoint(0.0F, 0.0F, 0.0F);
		EntireModel.addChild(ControlSet1);
		

		HelmicRegulator = new RendererModel(this);
		HelmicRegulator.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet1.addChild(HelmicRegulator);
		

		baserotation = new RendererModel(this);
		baserotation.setRotationPoint(-1.0F, -14.1875F, -11.625F);
		HelmicRegulator.addChild(baserotation);
		setRotationAngle(baserotation, 0.6021F, 0.0F, 0.0F);
		baserotation.cubeList.add(new ModelBox(baserotation, 68, 71, -0.125F, -0.3125F, -0.5F, 1, 1, 1, -0.25F, false));
		baserotation.cubeList.add(new ModelBox(baserotation, 68, 71, 1.125F, -0.3125F, -0.5F, 1, 1, 1, -0.25F, false));
		baserotation.cubeList.add(new ModelBox(baserotation, 68, 71, 0.5F, -0.3125F, 1.5F, 1, 1, 1, -0.25F, false));
		baserotation.cubeList.add(new ModelBox(baserotation, 68, 71, -0.5625F, -0.3125F, 0.6875F, 1, 1, 1, -0.25F, false));
		baserotation.cubeList.add(new ModelBox(baserotation, 68, 71, 1.5625F, -0.3125F, 0.6875F, 1, 1, 1, -0.25F, false));

		part1 = new RendererModel(this);
		part1.setRotationPoint(0.0F, 0.0F, 0.0F);
		baserotation.addChild(part1);
		part1.cubeList.add(new ModelBox(part1, 80, 70, 1.125F, -1.125F, -0.5F, 1, 2, 1, -0.3125F, false));
		part1.cubeList.add(new ModelBox(part1, 80, 70, 1.375F, -1.125F, -0.5F, 1, 1, 1, -0.3125F, false));

		part2 = new RendererModel(this);
		part2.setRotationPoint(0.375F, -0.375F, 0.0F);
		baserotation.addChild(part2);
		part2.cubeList.add(new ModelBox(part2, 80, 70, -0.5F, -0.75F, -0.5F, 1, 2, 1, -0.3125F, false));
		part2.cubeList.add(new ModelBox(part2, 80, 70, -0.25F, -0.75F, -0.5F, 1, 1, 1, -0.3125F, false));

		part3 = new RendererModel(this);
		part3.setRotationPoint(-0.0625F, -0.375F, 1.1875F);
		baserotation.addChild(part3);
		part3.cubeList.add(new ModelBox(part3, 80, 70, -0.25F, -0.75F, -0.5F, 1, 1, 1, -0.3125F, false));
		part3.cubeList.add(new ModelBox(part3, 80, 70, -0.5F, -0.75F, -0.5F, 1, 2, 1, -0.3125F, false));

		part4 = new RendererModel(this);
		part4.setRotationPoint(1.0F, -0.375F, 2.0F);
		baserotation.addChild(part4);
		part4.cubeList.add(new ModelBox(part4, 80, 70, -0.5F, -0.75F, -0.5F, 1, 2, 1, -0.3125F, false));
		part4.cubeList.add(new ModelBox(part4, 80, 70, -0.25F, -0.75F, -0.5F, 1, 1, 1, -0.3125F, false));

		part5 = new RendererModel(this);
		part5.setRotationPoint(2.0625F, -0.375F, 1.1875F);
		baserotation.addChild(part5);
		part5.cubeList.add(new ModelBox(part5, 80, 70, -0.5F, -0.75F, -0.5F, 1, 2, 1, -0.3125F, false));
		part5.cubeList.add(new ModelBox(part5, 80, 70, -0.25F, -0.75F, -0.5F, 1, 1, 1, -0.3125F, false));

		Throttle = new RendererModel(this);
		Throttle.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet1.addChild(Throttle);
		setRotationAngle(Throttle, 0.0F, -0.5236F, 0.0F);
		

		MainRot = new RendererModel(this);
		MainRot.setRotationPoint(-1.3125F, -14.0625F, -12.5F);
		Throttle.addChild(MainRot);
		setRotationAngle(MainRot, 0.4712F, 0.0F, 0.0F);
		

		Base = new RendererModel(this);
		Base.setRotationPoint(-0.5F, 13.5F, 13.0F);
		MainRot.addChild(Base);
		Base.cubeList.add(new ModelBox(Base, 66, 70, -0.25F, -15.3125F, -13.5F, 1, 1, 3, -0.0001F, false));
		Base.cubeList.add(new ModelBox(Base, 66, 70, -0.3125F, -15.6875F, -12.75F, 1, 1, 2, -0.0624F, false));
		Base.cubeList.add(new ModelBox(Base, 66, 70, -0.3125F, -15.6875F, -13.25F, 1, 1, 2, -0.0623F, false));
		Base.cubeList.add(new ModelBox(Base, 66, 70, 0.1875F, -15.3125F, -13.5F, 1, 1, 3, 0.0005F, false));
		Base.cubeList.add(new ModelBox(Base, 66, 70, 0.25F, -15.6875F, -12.75F, 1, 1, 2, -0.0626F, false));
		Base.cubeList.add(new ModelBox(Base, 66, 70, 0.25F, -15.6875F, -13.25F, 1, 1, 2, -0.0625F, false));
		Base.cubeList.add(new ModelBox(Base, 94, 28, 0.3125F, -16.0625F, -13.375F, 1, 1, 1, -0.3125F, false));
		Base.cubeList.add(new ModelBox(Base, 94, 28, -0.375F, -16.0625F, -13.375F, 1, 1, 1, -0.3125F, false));
		Base.cubeList.add(new ModelBox(Base, 94, 28, 0.3125F, -16.0625F, -12.5F, 1, 1, 1, -0.3125F, false));
		Base.cubeList.add(new ModelBox(Base, 94, 28, 0.3125F, -16.0625F, -11.625F, 1, 1, 1, -0.3125F, false));
		Base.cubeList.add(new ModelBox(Base, 94, 28, -0.375F, -16.0625F, -12.5F, 1, 1, 1, -0.3125F, false));
		Base.cubeList.add(new ModelBox(Base, 94, 28, -0.375F, -16.0625F, -11.625F, 1, 1, 1, -0.3125F, false));
		Base.cubeList.add(new ModelBox(Base, 66, 70, -0.1875F, -14.8125F, -13.5F, 1, 1, 3, 0.063F, false));
		Base.cubeList.add(new ModelBox(Base, 66, 70, 0.125F, -14.8125F, -13.5F, 1, 1, 3, 0.0629F, false));

		Handle = new RendererModel(this);
		Handle.setRotationPoint(-0.0313F, -1.1563F, 1.0F);
		MainRot.addChild(Handle);
		setRotationAngle(Handle, 1.6581F, 0.0F, 0.0F);
		Handle.cubeList.add(new ModelBox(Handle, 24, 12, -1.2188F, -2.4688F, -0.5F, 1, 3, 1, -0.375F, false));
		Handle.cubeList.add(new ModelBox(Handle, 24, 12, -1.2188F, -2.4688F, -0.5F, 1, 2, 1, -0.374F, false));
		Handle.cubeList.add(new ModelBox(Handle, 24, 12, -1.0313F, -2.7813F, -0.5F, 1, 1, 1, -0.3125F, false));
		Handle.cubeList.add(new ModelBox(Handle, 24, 12, -0.7813F, -2.7813F, -0.5F, 1, 1, 1, -0.3124F, false));
		Handle.cubeList.add(new ModelBox(Handle, 24, 12, 0.0313F, -2.7813F, -0.5F, 1, 1, 1, -0.3115F, false));
		Handle.cubeList.add(new ModelBox(Handle, 24, 12, -0.2188F, -2.7813F, -0.5F, 1, 1, 1, -0.3124F, false));
		Handle.cubeList.add(new ModelBox(Handle, 24, 12, 0.2188F, -2.4688F, -0.5F, 1, 3, 1, -0.375F, false));
		Handle.cubeList.add(new ModelBox(Handle, 24, 12, 0.2188F, -2.4688F, -0.5F, 1, 2, 1, -0.374F, false));

		PhaseSwitch = new RendererModel(this);
		PhaseSwitch.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet1.addChild(PhaseSwitch);
		setRotationAngle(PhaseSwitch, 0.0F, 0.5236F, 0.0F);
		

		Base2 = new RendererModel(this);
		Base2.setRotationPoint(1.3125F, -14.8125F, -12.75F);
		PhaseSwitch.addChild(Base2);
		setRotationAngle(Base2, 0.48F, 0.0F, 0.0F);
		Base2.cubeList.add(new ModelBox(Base2, 42, 13, -0.5F, -0.5F, -0.5F, 1, 1, 2, -0.0625F, false));
		Base2.cubeList.add(new ModelBox(Base2, 42, 13, -0.5F, -0.375F, -1.6875F, 1, 1, 1, -0.1875F, false));
		Base2.cubeList.add(new ModelBox(Base2, 42, 13, -0.5F, -0.375F, 1.875F, 1, 1, 1, -0.1875F, false));
		Base2.cubeList.add(new ModelBox(Base2, 45, 33, -0.5F, -0.375F, -1.375F, 1, 1, 4, -0.25F, false));
		Base2.cubeList.add(new ModelBox(Base2, 42, 13, -0.25F, -0.5F, 0.0F, 1, 1, 1, -0.1875F, false));

		Switch = new RendererModel(this);
		Switch.setRotationPoint(1.75F, -15.0625F, -12.375F);
		PhaseSwitch.addChild(Switch);
		setRotationAngle(Switch, 0.48F, -0.6981F, 0.0F);
		Switch.cubeList.add(new ModelBox(Switch, 42, 13, 1.625F, -0.5F, -0.5F, 1, 1, 1, -0.25F, false));
		Switch.cubeList.add(new ModelBox(Switch, 42, 13, -0.375F, -0.5F, -0.5F, 3, 1, 1, -0.3125F, false));

		RotaryHandles = new RendererModel(this);
		RotaryHandles.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet1.addChild(RotaryHandles);
		

		Rotor1 = new RendererModel(this);
		Rotor1.setRotationPoint(-5.1875F, -12.1875F, -13.6875F);
		RotaryHandles.addChild(Rotor1);
		Rotor1.cubeList.add(new ModelBox(Rotor1, 79, 58, -0.5F, -0.5F, -0.625F, 1, 1, 1, -0.1875F, false));

		H1 = new RendererModel(this);
		H1.setRotationPoint(2.0F, 4.0F, -3.0F);
		Rotor1.addChild(H1);
		H1.cubeList.add(new ModelBox(H1, 79, 58, -2.5F, -4.5F, 1.0F, 1, 1, 2, -0.375F, false));
		H1.cubeList.add(new ModelBox(H1, 79, 58, -2.5F, -3.5F, 0.8125F, 1, 1, 1, -0.375F, false));
		H1.cubeList.add(new ModelBox(H1, 79, 58, -2.5F, -4.5F, 1.0F, 1, 2, 1, -0.365F, false));

		Rotor2 = new RendererModel(this);
		Rotor2.setRotationPoint(-4.125F, -12.1875F, -13.6875F);
		RotaryHandles.addChild(Rotor2);
		Rotor2.cubeList.add(new ModelBox(Rotor2, 79, 58, -0.5F, -0.5F, -0.625F, 1, 1, 1, -0.1875F, false));

		H2 = new RendererModel(this);
		H2.setRotationPoint(0.0F, 0.0F, -0.8333F);
		Rotor2.addChild(H2);
		setRotationAngle(H2, 0.0F, 0.0F, 0.5236F);
		H2.cubeList.add(new ModelBox(H2, 79, 58, -0.5F, -0.5F, -0.1667F, 1, 1, 1, -0.375F, false));
		H2.cubeList.add(new ModelBox(H2, 79, 58, -0.5F, 0.5F, -1.4167F, 1, 1, 2, -0.375F, false));
		H2.cubeList.add(new ModelBox(H2, 79, 58, -0.5F, -0.5F, -0.4167F, 1, 2, 1, -0.365F, false));

		bone87 = new RendererModel(this);
		bone87.setRotationPoint(10.375F, 0.0F, 0.125F);
		Rotor2.addChild(bone87);
		setRotationAngle(bone87, 0.0F, -0.5236F, 0.0F);
		bone87.cubeList.add(new ModelBox(bone87, 79, 58, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.125F, false));

		Handbrake = new RendererModel(this);
		Handbrake.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet1.addChild(Handbrake);
		setRotationAngle(Handbrake, 0.0F, 1.5708F, 0.0F);
		

		Rot2 = new RendererModel(this);
		Rot2.setRotationPoint(12.875F, -11.25F, 7.25F);
		Handbrake.addChild(Rot2);
		setRotationAngle(Rot2, -0.1745F, 0.6109F, 0.0F);
		Rot2.cubeList.add(new ModelBox(Rot2, 48, 32, -0.5F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));
		Rot2.cubeList.add(new ModelBox(Rot2, 48, 32, -0.5F, -4.125F, 0.25F, 1, 4, 1, -0.125F, false));
		Rot2.cubeList.add(new ModelBox(Rot2, 48, 32, -0.5F, -6.625F, 0.625F, 1, 4, 1, -0.0625F, false));

		ControlsBetweenPanels = new RendererModel(this);
		ControlsBetweenPanels.setRotationPoint(0.0F, 0.0F, 0.0F);
		EntireModel.addChild(ControlsBetweenPanels);
		

		Pumps = new RendererModel(this);
		Pumps.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlsBetweenPanels.addChild(Pumps);
		setRotationAngle(Pumps, 0.0F, 2.0944F, 0.0F);
		Pumps.cubeList.add(new ModelBox(Pumps, 48, 32, -15.375F, -12.25F, -1.0F, 1, 1, 2, 0.0F, false));

		p1 = new RendererModel(this);
		p1.setRotationPoint(-13.3125F, -10.75F, 0.0F);
		Pumps.addChild(p1);
		setRotationAngle(p1, 0.0F, 0.0F, -0.2182F);
		p1.cubeList.add(new ModelBox(p1, 44, 66, -0.5F, -2.5F, -0.5F, 1, 3, 1, 0.0F, false));

		bone116 = new RendererModel(this);
		bone116.setRotationPoint(0.5F, 0.5F, -0.5F);
		p1.addChild(bone116);
		bone116.cubeList.add(new ModelBox(bone116, 44, 66, -1.0F, -4.6875F, 0.0F, 1, 3, 1, -0.0625F, false));

		bone117 = new RendererModel(this);
		bone117.setRotationPoint(0.5F, 0.5F, -0.5F);
		p1.addChild(bone117);
		bone117.cubeList.add(new ModelBox(bone117, 44, 66, -1.0F, -4.6875F, -1.0F, 1, 1, 2, -0.25F, false));

		p2and3 = new RendererModel(this);
		p2and3.setRotationPoint(-13.3125F, -10.75F, 0.0F);
		Pumps.addChild(p2and3);
		setRotationAngle(p2and3, 0.0F, 0.0F, -0.2182F);
		p2and3.cubeList.add(new ModelBox(p2and3, 44, 66, 1.5F, -2.5F, -0.5F, 1, 3, 1, 0.0F, false));

		PUMP3 = new RendererModel(this);
		PUMP3.setRotationPoint(0.5F, 0.5F, -0.5F);
		p2and3.addChild(PUMP3);
		PUMP3.cubeList.add(new ModelBox(PUMP3, 17, 24, 1.0F, -7.125F, 0.3125F, 1, 2, 1, -0.3F, false));
		PUMP3.cubeList.add(new ModelBox(PUMP3, 14, 36, 1.0F, -6.125F, 0.3125F, 1, 3, 1, -0.3125F, false));
		PUMP3.cubeList.add(new ModelBox(PUMP3, 17, 24, 1.0F, -6.125F, 0.3125F, 1, 1, 1, -0.25F, false));
		PUMP3.cubeList.add(new ModelBox(PUMP3, 17, 24, 1.0F, -7.375F, 0.3125F, 1, 1, 1, -0.25F, false));

		PUMP2 = new RendererModel(this);
		PUMP2.setRotationPoint(0.5F, 0.5F, -0.5F);
		p2and3.addChild(PUMP2);
		PUMP2.cubeList.add(new ModelBox(PUMP2, 17, 24, 1.0F, -5.375F, -0.25F, 1, 1, 1, -0.25F, false));
		PUMP2.cubeList.add(new ModelBox(PUMP2, 16, 43, 1.0F, -5.375F, -0.25F, 1, 3, 1, -0.3125F, false));
		PUMP2.cubeList.add(new ModelBox(PUMP2, 17, 24, 1.0F, -6.375F, -0.25F, 1, 2, 1, -0.3F, false));
		PUMP2.cubeList.add(new ModelBox(PUMP2, 17, 24, 1.0F, -6.625F, -0.25F, 1, 1, 1, -0.25F, false));

		bone118 = new RendererModel(this);
		bone118.setRotationPoint(0.5F, 0.5F, -0.5F);
		p2and3.addChild(bone118);
		bone118.cubeList.add(new ModelBox(bone118, 44, 66, 1.0F, -4.6875F, 0.3125F, 1, 3, 1, -0.25F, false));
		bone118.cubeList.add(new ModelBox(bone118, 44, 66, 1.0F, -4.6875F, -0.25F, 1, 3, 1, -0.25F, false));

		SpinnyThings = new RendererModel(this);
		SpinnyThings.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlsBetweenPanels.addChild(SpinnyThings);
		

		Sp1 = new RendererModel(this);
		Sp1.setRotationPoint(0.0F, 0.0F, 0.0F);
		SpinnyThings.addChild(Sp1);
		

		bone85 = new RendererModel(this);
		bone85.setRotationPoint(13.0F, -13.75F, 0.0F);
		Sp1.addChild(bone85);
		setRotationAngle(bone85, 0.0F, 0.0F, 0.48F);
		bone85.cubeList.add(new ModelBox(bone85, 21, 47, -2.875F, -1.375F, -0.5F, 4, 1, 1, 0.0F, false));
		bone85.cubeList.add(new ModelBox(bone85, 41, 9, -3.375F, -1.875F, -1.0F, 1, 2, 2, -0.25F, false));
		bone85.cubeList.add(new ModelBox(bone85, 41, 9, 0.625F, -1.875F, -1.0F, 1, 2, 2, -0.25F, false));

		Sp3 = new RendererModel(this);
		Sp3.setRotationPoint(0.0F, 0.0F, 0.0F);
		SpinnyThings.addChild(Sp3);
		setRotationAngle(Sp3, 0.0F, 1.0472F, 0.0F);
		

		bone88 = new RendererModel(this);
		bone88.setRotationPoint(13.0F, -13.75F, 0.0F);
		Sp3.addChild(bone88);
		setRotationAngle(bone88, 0.0F, 0.0F, 0.48F);
		bone88.cubeList.add(new ModelBox(bone88, 21, 47, -2.875F, -1.375F, -0.5F, 4, 1, 1, 0.0F, false));
		bone88.cubeList.add(new ModelBox(bone88, 41, 9, -3.375F, -1.875F, -1.0F, 1, 2, 2, -0.25F, false));
		bone88.cubeList.add(new ModelBox(bone88, 41, 9, 0.625F, -1.875F, -1.0F, 1, 2, 2, -0.25F, false));

		Sp2 = new RendererModel(this);
		Sp2.setRotationPoint(0.0F, 0.0F, 0.0F);
		SpinnyThings.addChild(Sp2);
		setRotationAngle(Sp2, 0.0F, 2.0944F, 0.0F);
		

		bone86 = new RendererModel(this);
		bone86.setRotationPoint(13.0F, -13.75F, 0.0F);
		Sp2.addChild(bone86);
		setRotationAngle(bone86, 0.0F, 0.0F, 0.48F);
		bone86.cubeList.add(new ModelBox(bone86, 21, 47, -2.875F, -1.375F, -0.5F, 4, 1, 1, 0.0F, false));
		bone86.cubeList.add(new ModelBox(bone86, 41, 9, -3.375F, -1.875F, -1.0F, 1, 2, 2, -0.25F, false));
		bone86.cubeList.add(new ModelBox(bone86, 41, 9, 0.625F, -1.875F, -1.0F, 1, 2, 2, -0.25F, false));

		Sp4 = new RendererModel(this);
		Sp4.setRotationPoint(0.0F, 0.0F, 0.0F);
		SpinnyThings.addChild(Sp4);
		setRotationAngle(Sp4, 0.0F, -2.0944F, 0.0F);
		

		bone115 = new RendererModel(this);
		bone115.setRotationPoint(13.0F, -13.75F, 0.0F);
		Sp4.addChild(bone115);
		setRotationAngle(bone115, 0.0F, 0.0F, 0.48F);
		bone115.cubeList.add(new ModelBox(bone115, 21, 47, -2.875F, -1.375F, -0.5F, 4, 1, 1, 0.0F, false));
		bone115.cubeList.add(new ModelBox(bone115, 41, 9, -3.375F, -1.875F, -1.0F, 1, 2, 2, -0.25F, false));
		bone115.cubeList.add(new ModelBox(bone115, 41, 9, 0.625F, -1.875F, -1.0F, 1, 2, 2, -0.25F, false));

		TimeRotor = new RendererModel(this);
		TimeRotor.setRotationPoint(0.0F, 0.0F, 0.0F);
		EntireModel.addChild(TimeRotor);
		setRotationAngle(TimeRotor, 0.0F, -0.5236F, 0.0F);
		

		TimeRotorInner = new RendererModel(this);
		TimeRotorInner.setRotationPoint(0.0F, 0.0F, 0.0F);
		TimeRotor.addChild(TimeRotorInner);
		

		Moving = new RendererModel(this);
		Moving.setRotationPoint(0.0F, 0.0F, 0.0F);
		TimeRotorInner.addChild(Moving);
		setRotationAngle(Moving, 0.0F, -0.7854F, 0.0F);
		Moving.cubeList.add(new ModelBox(Moving, 58, 0, -2.0F, -29.5F, -2.0F, 4, 4, 4, 0.0F, false));
		Moving.cubeList.add(new ModelBox(Moving, 58, 0, -1.0F, -34.5F, -1.0F, 2, 2, 2, 0.0F, false));
		Moving.cubeList.add(new ModelBox(Moving, 58, 0, -1.0F, -37.5F, -1.0F, 2, 2, 2, 0.0F, false));
		Moving.cubeList.add(new ModelBox(Moving, 58, 0, -1.0F, -40.5F, -1.0F, 2, 2, 2, 0.0F, false));
		Moving.cubeList.add(new ModelBox(Moving, 58, 0, -1.0F, -43.25F, -1.0F, 2, 2, 2, 0.0F, false));
		Moving.cubeList.add(new ModelBox(Moving, 58, 0, -1.0F, -43.8125F, -1.0F, 2, 2, 2, -0.125F, false));
		Moving.cubeList.add(new ModelBox(Moving, 58, 0, -1.0F, -45.0625F, -1.0F, 2, 2, 2, -0.25F, false));
		Moving.cubeList.add(new ModelBox(Moving, 58, 0, -1.0F, -46.0F, -1.0F, 2, 33, 2, -0.5F, false));
		Moving.cubeList.add(new ModelBox(Moving, 60, 0, -1.0F, -47.75F, -1.0F, 2, 3, 2, -0.625F, false));
		Moving.cubeList.add(new ModelBox(Moving, 58, 0, -1.0F, -48.1875F, -1.0F, 2, 2, 2, -0.5625F, false));

		Stationary = new RendererModel(this);
		Stationary.setRotationPoint(0.5F, -25.5F, 0.0F);
		TimeRotorInner.addChild(Stationary);
		Stationary.cubeList.add(new ModelBox(Stationary, 58, 0, -2.5F, -30.0F, -2.0F, 4, 4, 4, 0.0F, false));
		Stationary.cubeList.add(new ModelBox(Stationary, 58, 0, -2.5F, -32.0625F, -2.0F, 4, 4, 4, -0.1875F, false));
		Stationary.cubeList.add(new ModelBox(Stationary, 58, 0, -2.5F, -36.375F, -2.0F, 4, 6, 4, -0.5625F, false));
		Stationary.cubeList.add(new ModelBox(Stationary, 58, 0, -2.5F, -41.75F, -2.0F, 4, 8, 4, -1.25F, false));

		TimeRotorShell = new RendererModel(this);
		TimeRotorShell.setRotationPoint(0.0F, 0.0F, 0.0F);
		TimeRotor.addChild(TimeRotorShell);
		

		TimeRotorlOWER = new RendererModel(this);
		TimeRotorlOWER.setRotationPoint(0.0F, -22.25F, 0.0F);
		TimeRotorShell.addChild(TimeRotorlOWER);
		

		b = new RendererModel(this);
		b.setRotationPoint(0.0F, 0.25F, 0.0F);
		TimeRotorlOWER.addChild(b);
		setRotationAngle(b, 0.0F, 0.0F, -0.0436F);
		b.cubeList.add(new ModelBox(b, 0, 0, -3.72F, -43.0F, -1.0F, 1, 66, 2, 0.0F, false));

		b2 = new RendererModel(this);
		b2.setRotationPoint(0.0F, 0.25F, 0.0F);
		TimeRotorlOWER.addChild(b2);
		setRotationAngle(b2, 0.0F, -0.5236F, -0.0436F);
		b2.cubeList.add(new ModelBox(b2, 0, 0, -3.7216F, -43.0F, -2.006F, 1, 66, 3, 0.0F, false));

		b3 = new RendererModel(this);
		b3.setRotationPoint(0.0F, 0.25F, 0.0F);
		TimeRotorlOWER.addChild(b3);
		setRotationAngle(b3, 0.0F, -2.618F, 0.0436F);
		b3.cubeList.add(new ModelBox(b3, 0, 0, -3.7216F, -43.0F, -0.994F, 1, 66, 3, 0.0F, false));

		b4 = new RendererModel(this);
		b4.setRotationPoint(0.0F, 0.25F, 0.0F);
		TimeRotorlOWER.addChild(b4);
		setRotationAngle(b4, 0.0F, 3.1416F, 0.0436F);
		b4.cubeList.add(new ModelBox(b4, 0, 0, -3.72F, -43.0F, -1.0F, 1, 66, 2, 0.0F, false));

		b5 = new RendererModel(this);
		b5.setRotationPoint(0.0F, 0.25F, 0.0F);
		TimeRotorlOWER.addChild(b5);
		setRotationAngle(b5, 0.0F, 2.618F, 0.0436F);
		b5.cubeList.add(new ModelBox(b5, 0, 0, -3.7216F, -43.0F, -2.006F, 1, 66, 3, 0.0F, false));

		b6 = new RendererModel(this);
		b6.setRotationPoint(0.0F, 0.25F, 0.0F);
		TimeRotorlOWER.addChild(b6);
		setRotationAngle(b6, 0.0F, 0.5236F, -0.0436F);
		b6.cubeList.add(new ModelBox(b6, 0, 0, -3.7216F, -43.0F, -0.994F, 1, 66, 3, 0.0F, false));

		TrRing1 = new RendererModel(this);
		TrRing1.setRotationPoint(0.0F, -24.75F, 0.0F);
		TimeRotorShell.addChild(TrRing1);
		

		b7 = new RendererModel(this);
		b7.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b7);
		b7.cubeList.add(new ModelBox(b7, 50, 0, -4.22F, -1.5F, -1.5F, 1, 2, 3, -0.5F, false));

		b8 = new RendererModel(this);
		b8.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b8);
		setRotationAngle(b8, 0.0F, -0.5236F, 0.0F);
		b8.cubeList.add(new ModelBox(b8, 50, 0, -4.22F, -1.5F, -1.5F, 1, 2, 3, -0.5F, false));

		b9 = new RendererModel(this);
		b9.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b9);
		setRotationAngle(b9, 0.0F, -1.0472F, 0.0F);
		b9.cubeList.add(new ModelBox(b9, 50, 0, -4.22F, -1.5F, -1.5F, 1, 2, 3, -0.5F, false));

		b10 = new RendererModel(this);
		b10.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b10);
		setRotationAngle(b10, 0.0F, -1.5708F, 0.0F);
		b10.cubeList.add(new ModelBox(b10, 50, 0, -4.22F, -1.5F, -1.5F, 1, 2, 3, -0.5F, false));

		b11 = new RendererModel(this);
		b11.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b11);
		setRotationAngle(b11, 0.0F, -2.0944F, 0.0F);
		b11.cubeList.add(new ModelBox(b11, 50, 0, -4.22F, -1.5F, -1.5F, 1, 2, 3, -0.5F, false));

		b12 = new RendererModel(this);
		b12.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b12);
		setRotationAngle(b12, 0.0F, -2.618F, 0.0F);
		b12.cubeList.add(new ModelBox(b12, 50, 0, -4.22F, -1.5F, -1.5F, 1, 2, 3, -0.5F, false));

		b13 = new RendererModel(this);
		b13.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b13);
		setRotationAngle(b13, 0.0F, 3.1416F, 0.0F);
		b13.cubeList.add(new ModelBox(b13, 50, 0, -4.22F, -1.5F, -1.5F, 1, 2, 3, -0.5F, false));

		b14 = new RendererModel(this);
		b14.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b14);
		setRotationAngle(b14, 0.0F, 2.618F, 0.0F);
		b14.cubeList.add(new ModelBox(b14, 50, 0, -4.22F, -1.5F, -1.5F, 1, 2, 3, -0.5F, false));

		b15 = new RendererModel(this);
		b15.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b15);
		setRotationAngle(b15, 0.0F, 2.0944F, 0.0F);
		b15.cubeList.add(new ModelBox(b15, 50, 0, -4.22F, -1.5F, -1.5F, 1, 2, 3, -0.5F, false));

		b16 = new RendererModel(this);
		b16.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b16);
		setRotationAngle(b16, 0.0F, 1.5708F, 0.0F);
		b16.cubeList.add(new ModelBox(b16, 50, 0, -4.22F, -1.5F, -1.5F, 1, 2, 3, -0.5F, false));

		b17 = new RendererModel(this);
		b17.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b17);
		setRotationAngle(b17, 0.0F, 1.0472F, 0.0F);
		b17.cubeList.add(new ModelBox(b17, 50, 0, -4.22F, -1.5F, -1.5F, 1, 2, 3, -0.5F, false));

		b18 = new RendererModel(this);
		b18.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b18);
		setRotationAngle(b18, 0.0F, 0.5236F, 0.0F);
		b18.cubeList.add(new ModelBox(b18, 50, 0, -4.22F, -1.5F, -1.5F, 1, 2, 3, -0.5F, false));

		TrRing6 = new RendererModel(this);
		TrRing6.setRotationPoint(0.0F, -17.25F, 0.0F);
		TimeRotorShell.addChild(TrRing6);
		

		b19 = new RendererModel(this);
		b19.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b19);
		b19.cubeList.add(new ModelBox(b19, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b20 = new RendererModel(this);
		b20.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b20);
		setRotationAngle(b20, 0.0F, -0.5236F, 0.0F);
		b20.cubeList.add(new ModelBox(b20, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b21 = new RendererModel(this);
		b21.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b21);
		setRotationAngle(b21, 0.0F, -1.0472F, 0.0F);
		b21.cubeList.add(new ModelBox(b21, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b22 = new RendererModel(this);
		b22.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b22);
		setRotationAngle(b22, 0.0F, -1.5708F, 0.0F);
		b22.cubeList.add(new ModelBox(b22, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b23 = new RendererModel(this);
		b23.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b23);
		setRotationAngle(b23, 0.0F, -2.0944F, 0.0F);
		b23.cubeList.add(new ModelBox(b23, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b24 = new RendererModel(this);
		b24.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b24);
		setRotationAngle(b24, 0.0F, -2.618F, 0.0F);
		b24.cubeList.add(new ModelBox(b24, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b25 = new RendererModel(this);
		b25.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b25);
		setRotationAngle(b25, 0.0F, 3.1416F, 0.0F);
		b25.cubeList.add(new ModelBox(b25, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b26 = new RendererModel(this);
		b26.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b26);
		setRotationAngle(b26, 0.0F, 2.618F, 0.0F);
		b26.cubeList.add(new ModelBox(b26, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b27 = new RendererModel(this);
		b27.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b27);
		setRotationAngle(b27, 0.0F, 2.0944F, 0.0F);
		b27.cubeList.add(new ModelBox(b27, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b28 = new RendererModel(this);
		b28.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b28);
		setRotationAngle(b28, 0.0F, 1.5708F, 0.0F);
		b28.cubeList.add(new ModelBox(b28, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b29 = new RendererModel(this);
		b29.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b29);
		setRotationAngle(b29, 0.0F, 1.0472F, 0.0F);
		b29.cubeList.add(new ModelBox(b29, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b30 = new RendererModel(this);
		b30.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b30);
		setRotationAngle(b30, 0.0F, 0.5236F, 0.0F);
		b30.cubeList.add(new ModelBox(b30, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		TrRing7 = new RendererModel(this);
		TrRing7.setRotationPoint(0.0F, -10.75F, 0.0F);
		TimeRotorShell.addChild(TrRing7);
		

		b31 = new RendererModel(this);
		b31.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b31);
		b31.cubeList.add(new ModelBox(b31, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b42 = new RendererModel(this);
		b42.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b42);
		setRotationAngle(b42, 0.0F, -0.5236F, 0.0F);
		b42.cubeList.add(new ModelBox(b42, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b32 = new RendererModel(this);
		b32.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b32);
		setRotationAngle(b32, 0.0F, -1.0472F, 0.0F);
		b32.cubeList.add(new ModelBox(b32, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b33 = new RendererModel(this);
		b33.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b33);
		setRotationAngle(b33, 0.0F, -1.5708F, 0.0F);
		b33.cubeList.add(new ModelBox(b33, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b34 = new RendererModel(this);
		b34.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b34);
		setRotationAngle(b34, 0.0F, -2.0944F, 0.0F);
		b34.cubeList.add(new ModelBox(b34, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b35 = new RendererModel(this);
		b35.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b35);
		setRotationAngle(b35, 0.0F, -2.618F, 0.0F);
		b35.cubeList.add(new ModelBox(b35, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b36 = new RendererModel(this);
		b36.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b36);
		setRotationAngle(b36, 0.0F, 3.1416F, 0.0F);
		b36.cubeList.add(new ModelBox(b36, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b37 = new RendererModel(this);
		b37.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b37);
		setRotationAngle(b37, 0.0F, 2.618F, 0.0F);
		b37.cubeList.add(new ModelBox(b37, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b38 = new RendererModel(this);
		b38.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b38);
		setRotationAngle(b38, 0.0F, 2.0944F, 0.0F);
		b38.cubeList.add(new ModelBox(b38, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b39 = new RendererModel(this);
		b39.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b39);
		setRotationAngle(b39, 0.0F, 1.5708F, 0.0F);
		b39.cubeList.add(new ModelBox(b39, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b40 = new RendererModel(this);
		b40.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b40);
		setRotationAngle(b40, 0.0F, 1.0472F, 0.0F);
		b40.cubeList.add(new ModelBox(b40, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b41 = new RendererModel(this);
		b41.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b41);
		setRotationAngle(b41, 0.0F, 0.5236F, 0.0F);
		b41.cubeList.add(new ModelBox(b41, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		TrRing8 = new RendererModel(this);
		TrRing8.setRotationPoint(0.0F, -4.25F, 0.0F);
		TimeRotorShell.addChild(TrRing8);
		

		b43 = new RendererModel(this);
		b43.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b43);
		b43.cubeList.add(new ModelBox(b43, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b44 = new RendererModel(this);
		b44.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b44);
		setRotationAngle(b44, 0.0F, -0.5236F, 0.0F);
		b44.cubeList.add(new ModelBox(b44, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b45 = new RendererModel(this);
		b45.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b45);
		setRotationAngle(b45, 0.0F, -1.0472F, 0.0F);
		b45.cubeList.add(new ModelBox(b45, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b46 = new RendererModel(this);
		b46.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b46);
		setRotationAngle(b46, 0.0F, -1.5708F, 0.0F);
		b46.cubeList.add(new ModelBox(b46, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b47 = new RendererModel(this);
		b47.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b47);
		setRotationAngle(b47, 0.0F, -2.0944F, 0.0F);
		b47.cubeList.add(new ModelBox(b47, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b48 = new RendererModel(this);
		b48.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b48);
		setRotationAngle(b48, 0.0F, -2.618F, 0.0F);
		b48.cubeList.add(new ModelBox(b48, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b49 = new RendererModel(this);
		b49.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b49);
		setRotationAngle(b49, 0.0F, 3.1416F, 0.0F);
		b49.cubeList.add(new ModelBox(b49, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b50 = new RendererModel(this);
		b50.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b50);
		setRotationAngle(b50, 0.0F, 2.618F, 0.0F);
		b50.cubeList.add(new ModelBox(b50, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b51 = new RendererModel(this);
		b51.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b51);
		setRotationAngle(b51, 0.0F, 2.0944F, 0.0F);
		b51.cubeList.add(new ModelBox(b51, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b52 = new RendererModel(this);
		b52.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b52);
		setRotationAngle(b52, 0.0F, 1.5708F, 0.0F);
		b52.cubeList.add(new ModelBox(b52, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b53 = new RendererModel(this);
		b53.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b53);
		setRotationAngle(b53, 0.0F, 1.0472F, 0.0F);
		b53.cubeList.add(new ModelBox(b53, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		b54 = new RendererModel(this);
		b54.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b54);
		setRotationAngle(b54, 0.0F, 0.5236F, 0.0F);
		b54.cubeList.add(new ModelBox(b54, 50, 5, -4.0325F, -1.5F, -1.5F, 1, 2, 3, -0.5625F, false));

		tRRing2 = new RendererModel(this);
		tRRing2.setRotationPoint(0.0F, -32.75F, 0.0F);
		TimeRotorShell.addChild(tRRing2);
		

		b55 = new RendererModel(this);
		b55.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b55);
		b55.cubeList.add(new ModelBox(b55, 50, 0, -4.4075F, -1.5F, -1.5F, 1, 2, 3, -0.4375F, false));

		b56 = new RendererModel(this);
		b56.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b56);
		setRotationAngle(b56, 0.0F, -0.5236F, 0.0F);
		b56.cubeList.add(new ModelBox(b56, 50, 0, -4.4075F, -1.5F, -1.5F, 1, 2, 3, -0.4375F, false));

		b57 = new RendererModel(this);
		b57.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b57);
		setRotationAngle(b57, 0.0F, -1.0472F, 0.0F);
		b57.cubeList.add(new ModelBox(b57, 50, 0, -4.4075F, -1.5F, -1.5F, 1, 2, 3, -0.4375F, false));

		b58 = new RendererModel(this);
		b58.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b58);
		setRotationAngle(b58, 0.0F, -1.5708F, 0.0F);
		b58.cubeList.add(new ModelBox(b58, 50, 0, -4.4075F, -1.5F, -1.5F, 1, 2, 3, -0.4375F, false));

		b59 = new RendererModel(this);
		b59.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b59);
		setRotationAngle(b59, 0.0F, -2.0944F, 0.0F);
		b59.cubeList.add(new ModelBox(b59, 50, 0, -4.4075F, -1.5F, -1.5F, 1, 2, 3, -0.4375F, false));

		b60 = new RendererModel(this);
		b60.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b60);
		setRotationAngle(b60, 0.0F, -2.618F, 0.0F);
		b60.cubeList.add(new ModelBox(b60, 50, 0, -4.4075F, -1.5F, -1.5F, 1, 2, 3, -0.4375F, false));

		b61 = new RendererModel(this);
		b61.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b61);
		setRotationAngle(b61, 0.0F, 3.1416F, 0.0F);
		b61.cubeList.add(new ModelBox(b61, 50, 0, -4.4075F, -1.5F, -1.5F, 1, 2, 3, -0.4375F, false));

		b62 = new RendererModel(this);
		b62.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b62);
		setRotationAngle(b62, 0.0F, 2.618F, 0.0F);
		b62.cubeList.add(new ModelBox(b62, 50, 0, -4.4075F, -1.5F, -1.5F, 1, 2, 3, -0.4375F, false));

		b63 = new RendererModel(this);
		b63.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b63);
		setRotationAngle(b63, 0.0F, 2.0944F, 0.0F);
		b63.cubeList.add(new ModelBox(b63, 50, 0, -4.4075F, -1.5F, -1.5F, 1, 2, 3, -0.4375F, false));

		b64 = new RendererModel(this);
		b64.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b64);
		setRotationAngle(b64, 0.0F, 1.5708F, 0.0F);
		b64.cubeList.add(new ModelBox(b64, 50, 0, -4.4075F, -1.5F, -1.5F, 1, 2, 3, -0.4375F, false));

		b65 = new RendererModel(this);
		b65.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b65);
		setRotationAngle(b65, 0.0F, 1.0472F, 0.0F);
		b65.cubeList.add(new ModelBox(b65, 50, 0, -4.4075F, -1.5F, -1.5F, 1, 2, 3, -0.4375F, false));

		b66 = new RendererModel(this);
		b66.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b66);
		setRotationAngle(b66, 0.0F, 0.5236F, 0.0F);
		b66.cubeList.add(new ModelBox(b66, 50, 0, -4.4075F, -1.5F, -1.5F, 1, 2, 3, -0.4375F, false));

		TrRing3 = new RendererModel(this);
		TrRing3.setRotationPoint(0.0F, -41.25F, 0.0F);
		TimeRotorShell.addChild(TrRing3);
		

		b67 = new RendererModel(this);
		b67.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b67);
		b67.cubeList.add(new ModelBox(b67, 50, 0, -4.595F, -1.5F, -1.5F, 1, 2, 3, -0.375F, false));

		b68 = new RendererModel(this);
		b68.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b68);
		setRotationAngle(b68, 0.0F, -0.5236F, 0.0F);
		b68.cubeList.add(new ModelBox(b68, 50, 0, -4.595F, -1.5F, -1.5F, 1, 2, 3, -0.375F, false));

		b69 = new RendererModel(this);
		b69.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b69);
		setRotationAngle(b69, 0.0F, -1.0472F, 0.0F);
		b69.cubeList.add(new ModelBox(b69, 50, 0, -4.595F, -1.5F, -1.5F, 1, 2, 3, -0.375F, false));

		b70 = new RendererModel(this);
		b70.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b70);
		setRotationAngle(b70, 0.0F, -1.5708F, 0.0F);
		b70.cubeList.add(new ModelBox(b70, 50, 0, -4.595F, -1.5F, -1.5F, 1, 2, 3, -0.375F, false));

		b71 = new RendererModel(this);
		b71.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b71);
		setRotationAngle(b71, 0.0F, -2.0944F, 0.0F);
		b71.cubeList.add(new ModelBox(b71, 50, 0, -4.595F, -1.5F, -1.5F, 1, 2, 3, -0.375F, false));

		b72 = new RendererModel(this);
		b72.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b72);
		setRotationAngle(b72, 0.0F, -2.618F, 0.0F);
		b72.cubeList.add(new ModelBox(b72, 50, 0, -4.595F, -1.5F, -1.5F, 1, 2, 3, -0.375F, false));

		b73 = new RendererModel(this);
		b73.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b73);
		setRotationAngle(b73, 0.0F, 3.1416F, 0.0F);
		b73.cubeList.add(new ModelBox(b73, 50, 0, -4.595F, -1.5F, -1.5F, 1, 2, 3, -0.375F, false));

		b74 = new RendererModel(this);
		b74.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b74);
		setRotationAngle(b74, 0.0F, 2.618F, 0.0F);
		b74.cubeList.add(new ModelBox(b74, 50, 0, -4.595F, -1.5F, -1.5F, 1, 2, 3, -0.375F, false));

		b75 = new RendererModel(this);
		b75.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b75);
		setRotationAngle(b75, 0.0F, 2.0944F, 0.0F);
		b75.cubeList.add(new ModelBox(b75, 50, 0, -4.595F, -1.5F, -1.5F, 1, 2, 3, -0.375F, false));

		b76 = new RendererModel(this);
		b76.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b76);
		setRotationAngle(b76, 0.0F, 1.5708F, 0.0F);
		b76.cubeList.add(new ModelBox(b76, 50, 0, -4.595F, -1.5F, -1.5F, 1, 2, 3, -0.375F, false));

		b77 = new RendererModel(this);
		b77.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b77);
		setRotationAngle(b77, 0.0F, 1.0472F, 0.0F);
		b77.cubeList.add(new ModelBox(b77, 50, 0, -4.595F, -1.5F, -1.5F, 1, 2, 3, -0.375F, false));

		b78 = new RendererModel(this);
		b78.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b78);
		setRotationAngle(b78, 0.0F, 0.5236F, 0.0F);
		b78.cubeList.add(new ModelBox(b78, 50, 0, -4.595F, -1.5F, -1.5F, 1, 2, 3, -0.375F, false));

		TrRing4 = new RendererModel(this);
		TrRing4.setRotationPoint(0.0F, -50.75F, 0.0F);
		TimeRotorShell.addChild(TrRing4);
		

		b79 = new RendererModel(this);
		b79.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b79);
		b79.cubeList.add(new ModelBox(b79, 50, 0, -4.7825F, -1.5F, -1.5F, 1, 2, 3, -0.3125F, false));

		b80 = new RendererModel(this);
		b80.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b80);
		setRotationAngle(b80, 0.0F, -0.5236F, 0.0F);
		b80.cubeList.add(new ModelBox(b80, 50, 0, -4.7825F, -1.5F, -1.5F, 1, 2, 3, -0.3125F, false));

		b81 = new RendererModel(this);
		b81.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b81);
		setRotationAngle(b81, 0.0F, -1.0472F, 0.0F);
		b81.cubeList.add(new ModelBox(b81, 50, 0, -4.7825F, -1.5F, -1.5F, 1, 2, 3, -0.3125F, false));

		b82 = new RendererModel(this);
		b82.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b82);
		setRotationAngle(b82, 0.0F, -1.5708F, 0.0F);
		b82.cubeList.add(new ModelBox(b82, 50, 0, -4.7825F, -1.5F, -1.5F, 1, 2, 3, -0.3125F, false));

		b83 = new RendererModel(this);
		b83.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b83);
		setRotationAngle(b83, 0.0F, -2.0944F, 0.0F);
		b83.cubeList.add(new ModelBox(b83, 50, 0, -4.7825F, -1.5F, -1.5F, 1, 2, 3, -0.3125F, false));

		b84 = new RendererModel(this);
		b84.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b84);
		setRotationAngle(b84, 0.0F, -2.618F, 0.0F);
		b84.cubeList.add(new ModelBox(b84, 50, 0, -4.7825F, -1.5F, -1.5F, 1, 2, 3, -0.3125F, false));

		b85 = new RendererModel(this);
		b85.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b85);
		setRotationAngle(b85, 0.0F, 3.1416F, 0.0F);
		b85.cubeList.add(new ModelBox(b85, 50, 0, -4.7825F, -1.5F, -1.5F, 1, 2, 3, -0.3125F, false));

		b86 = new RendererModel(this);
		b86.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b86);
		setRotationAngle(b86, 0.0F, 2.618F, 0.0F);
		b86.cubeList.add(new ModelBox(b86, 50, 0, -4.7825F, -1.5F, -1.5F, 1, 2, 3, -0.3125F, false));

		b87 = new RendererModel(this);
		b87.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b87);
		setRotationAngle(b87, 0.0F, 2.0944F, 0.0F);
		b87.cubeList.add(new ModelBox(b87, 50, 0, -4.7825F, -1.5F, -1.5F, 1, 2, 3, -0.3125F, false));

		b88 = new RendererModel(this);
		b88.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b88);
		setRotationAngle(b88, 0.0F, 1.5708F, 0.0F);
		b88.cubeList.add(new ModelBox(b88, 50, 0, -4.7825F, -1.5F, -1.5F, 1, 2, 3, -0.3125F, false));

		b89 = new RendererModel(this);
		b89.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b89);
		setRotationAngle(b89, 0.0F, 1.0472F, 0.0F);
		b89.cubeList.add(new ModelBox(b89, 50, 0, -4.7825F, -1.5F, -1.5F, 1, 2, 3, -0.3125F, false));

		b90 = new RendererModel(this);
		b90.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b90);
		setRotationAngle(b90, 0.0F, 0.5236F, 0.0F);
		b90.cubeList.add(new ModelBox(b90, 50, 0, -4.7825F, -1.5F, -1.5F, 1, 2, 3, -0.3125F, false));

		TrRing5 = new RendererModel(this);
		TrRing5.setRotationPoint(0.0F, 0.0F, 0.0F);
		TimeRotorShell.addChild(TrRing5);
		

		b91 = new RendererModel(this);
		b91.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b91);
		b91.cubeList.add(new ModelBox(b91, 50, 0, -5.095F, -1.5F, -1.5F, 1, 2, 3, -0.1875F, false));

		b92 = new RendererModel(this);
		b92.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b92);
		setRotationAngle(b92, 0.0F, -0.5236F, 0.0F);
		b92.cubeList.add(new ModelBox(b92, 50, 0, -5.095F, -1.5F, -1.5F, 1, 2, 3, -0.1875F, false));

		b93 = new RendererModel(this);
		b93.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b93);
		setRotationAngle(b93, 0.0F, -1.0472F, 0.0F);
		b93.cubeList.add(new ModelBox(b93, 50, 0, -5.095F, -1.5F, -1.5F, 1, 2, 3, -0.1875F, false));

		b94 = new RendererModel(this);
		b94.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b94);
		setRotationAngle(b94, 0.0F, -1.5708F, 0.0F);
		b94.cubeList.add(new ModelBox(b94, 50, 0, -5.095F, -1.5F, -1.5F, 1, 2, 3, -0.1875F, false));

		b95 = new RendererModel(this);
		b95.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b95);
		setRotationAngle(b95, 0.0F, -2.0944F, 0.0F);
		b95.cubeList.add(new ModelBox(b95, 50, 0, -5.095F, -1.5F, -1.5F, 1, 2, 3, -0.1875F, false));

		b96 = new RendererModel(this);
		b96.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b96);
		setRotationAngle(b96, 0.0F, -2.618F, 0.0F);
		b96.cubeList.add(new ModelBox(b96, 50, 0, -5.095F, -1.5F, -1.5F, 1, 2, 3, -0.1875F, false));

		b97 = new RendererModel(this);
		b97.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b97);
		setRotationAngle(b97, 0.0F, 3.1416F, 0.0F);
		b97.cubeList.add(new ModelBox(b97, 50, 0, -5.095F, -1.5F, -1.5F, 1, 2, 3, -0.1875F, false));

		b98 = new RendererModel(this);
		b98.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b98);
		setRotationAngle(b98, 0.0F, 2.618F, 0.0F);
		b98.cubeList.add(new ModelBox(b98, 50, 0, -5.095F, -1.5F, -1.5F, 1, 2, 3, -0.1875F, false));

		b99 = new RendererModel(this);
		b99.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b99);
		setRotationAngle(b99, 0.0F, 2.0944F, 0.0F);
		b99.cubeList.add(new ModelBox(b99, 50, 0, -5.095F, -1.5F, -1.5F, 1, 2, 3, -0.1875F, false));

		b100 = new RendererModel(this);
		b100.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b100);
		setRotationAngle(b100, 0.0F, 1.5708F, 0.0F);
		b100.cubeList.add(new ModelBox(b100, 50, 0, -5.095F, -1.5F, -1.5F, 1, 2, 3, -0.1875F, false));

		b101 = new RendererModel(this);
		b101.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b101);
		setRotationAngle(b101, 0.0F, 1.0472F, 0.0F);
		b101.cubeList.add(new ModelBox(b101, 50, 0, -5.095F, -1.5F, -1.5F, 1, 2, 3, -0.1875F, false));

		b102 = new RendererModel(this);
		b102.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b102);
		setRotationAngle(b102, 0.0F, 0.5236F, 0.0F);
		b102.cubeList.add(new ModelBox(b102, 50, 0, -5.095F, -1.5F, -1.5F, 1, 2, 3, -0.1875F, false));

		Console = new RendererModel(this);
		Console.setRotationPoint(0.0F, 0.0F, 0.0F);
		EntireModel.addChild(Console);
		

		PanelLayout = new RendererModel(this);
		PanelLayout.setRotationPoint(0.0F, 0.0F, 0.0F);
		Console.addChild(PanelLayout);
		

		Panel1 = new RendererModel(this);
		Panel1.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelLayout.addChild(Panel1);
		setRotationAngle(Panel1, 0.0F, 0.5236F, 0.0F);
		

		Side1 = new RendererModel(this);
		Side1.setRotationPoint(-0.9252F, 0.0F, 0.1875F);
		Panel1.addChild(Side1);
		Side1.cubeList.add(new ModelBox(Side1, 78, 15, 1.25F, -15.25F, -9.625F, 2, 16, 6, -0.24F, false));
		Side1.cubeList.add(new ModelBox(Side1, 94, 7, 1.25F, -13.3415F, -15.5335F, 2, 3, 5, -0.25F, false));
		Side1.cubeList.add(new ModelBox(Side1, 96, 18, 1.25F, -15.3415F, -11.0335F, 2, 6, 2, -0.25F, false));
		Side1.cubeList.add(new ModelBox(Side1, 106, 28, 1.25F, -21.75F, -7.625F, 2, 8, 4, -0.25F, false));

		bone5 = new RendererModel(this);
		bone5.setRotationPoint(0.4085F, -7.5F, -12.125F);
		Side1.addChild(bone5);
		setRotationAngle(bone5, -0.5236F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 78, 37, 0.8415F, -3.8481F, -4.5311F, 2, 3, 8, -0.241F, false));

		bone3 = new RendererModel(this);
		bone3.setRotationPoint(0.4085F, 0.0F, -12.125F);
		Side1.addChild(bone3);
		setRotationAngle(bone3, 0.2443F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 78, 0, 0.8415F, -1.0593F, -3.0464F, 2, 3, 6, -0.24F, false));

		bone6 = new RendererModel(this);
		bone6.setRotationPoint(0.9085F, -0.8588F, -10.5031F);
		Side1.addChild(bone6);
		setRotationAngle(bone6, 0.48F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 78, 9, 0.3415F, -0.4909F, 0.0589F, 2, 3, 3, -0.25F, false));
		bone6.cubeList.add(new ModelBox(bone6, 108, 7, 0.3415F, -13.3078F, 1.1581F, 2, 3, 7, -0.25F, false));

		bone = new RendererModel(this);
		bone.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone6.addChild(bone);
		setRotationAngle(bone, 0.2182F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 108, 17, 0.5F, -5.1299F, 0.3275F, 2, 4, 7, -0.25F, false));

		Side2 = new RendererModel(this);
		Side2.setRotationPoint(-0.3248F, 0.0F, -0.1875F);
		Panel1.addChild(Side2);
		setRotationAngle(Side2, 0.0F, -1.0472F, 0.0F);
		Side2.cubeList.add(new ModelBox(Side2, 78, 15, -2.0F, -15.25F, -9.625F, 2, 16, 6, -0.24F, false));
		Side2.cubeList.add(new ModelBox(Side2, 94, 7, -2.0F, -13.3415F, -15.5335F, 2, 3, 5, -0.25F, false));
		Side2.cubeList.add(new ModelBox(Side2, 96, 18, -2.0F, -15.3415F, -11.0335F, 2, 6, 2, -0.25F, false));
		Side2.cubeList.add(new ModelBox(Side2, 106, 28, -2.0F, -21.75F, -7.625F, 2, 8, 4, -0.25F, false));

		bone2 = new RendererModel(this);
		bone2.setRotationPoint(-1.3415F, -7.5F, -12.125F);
		Side2.addChild(bone2);
		setRotationAngle(bone2, -0.5236F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 78, 37, -0.6585F, -3.8481F, -4.5311F, 2, 3, 8, -0.241F, false));

		bone4 = new RendererModel(this);
		bone4.setRotationPoint(-1.3415F, 0.0F, -12.125F);
		Side2.addChild(bone4);
		setRotationAngle(bone4, 0.2443F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 78, 0, -0.6585F, -1.0593F, -3.0464F, 2, 3, 6, -0.24F, false));

		bone7 = new RendererModel(this);
		bone7.setRotationPoint(-0.8415F, -0.8588F, -10.5031F);
		Side2.addChild(bone7);
		setRotationAngle(bone7, 0.48F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 78, 9, -1.1585F, -0.4909F, 0.0589F, 2, 3, 3, -0.25F, false));
		bone7.cubeList.add(new ModelBox(bone7, 108, 7, -1.1585F, -13.3078F, 1.1581F, 2, 3, 7, -0.25F, false));

		bone8 = new RendererModel(this);
		bone8.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone7.addChild(bone8);
		setRotationAngle(bone8, 0.2182F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 108, 17, -1.0F, -5.1299F, 0.3275F, 2, 4, 7, -0.25F, false));

		Main = new RendererModel(this);
		Main.setRotationPoint(2.5F, -13.3415F, -13.0335F);
		Panel1.addChild(Main);
		setRotationAngle(Main, 0.0F, -0.5236F, 0.0F);
		Main.cubeList.add(new ModelBox(Main, 94, 2, -1.6875F, 0.0F, -1.7611F, 12, 3, 2, -0.25F, false));
		Main.cubeList.add(new ModelBox(Main, 94, 18, 2.75F, -3.0F, 5.7389F, 4, 17, 2, -0.25F, false));
		Main.cubeList.add(new ModelBox(Main, 93, 26, 2.75F, -1.0F, 7.2389F, 3, 3, 2, -0.25F, false));

		bone9 = new RendererModel(this);
		bone9.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main.addChild(bone9);
		setRotationAngle(bone9, -1.1606F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 40, 56, -6.0F, -2.1519F, 1.1256F, 12, 3, 2, -0.25F, false));

		bone10 = new RendererModel(this);
		bone10.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main.addChild(bone10);
		setRotationAngle(bone10, -0.9861F, 0.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 40, 56, -4.9375F, -3.3841F, 1.4349F, 10, 2, 2, -0.25F, false));

		bone11 = new RendererModel(this);
		bone11.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main.addChild(bone11);
		setRotationAngle(bone11, -0.9512F, 0.0F, 0.0F);
		bone11.cubeList.add(new ModelBox(bone11, 40, 56, -3.9375F, -4.8234F, 1.5433F, 8, 2, 2, -0.25F, false));
		bone11.cubeList.add(new ModelBox(bone11, 43, 56, -3.4375F, -6.3234F, 1.5433F, 7, 2, 2, -0.25F, false));

		bone12 = new RendererModel(this);
		bone12.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main.addChild(bone12);
		setRotationAngle(bone12, -0.8203F, 0.0F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 43, 56, -2.4375F, -7.5374F, 2.3207F, 5, 2, 2, -0.25F, false));

		bone13 = new RendererModel(this);
		bone13.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main.addChild(bone13);
		setRotationAngle(bone13, -0.2967F, 0.0F, 0.0F);
		bone13.cubeList.add(new ModelBox(bone13, 12, 72, -1.9375F, -7.044F, 5.4788F, 4, 3, 2, -0.25F, false));
		bone13.cubeList.add(new ModelBox(bone13, 45, 28, -0.3125F, -7.5221F, 5.3951F, 2, 2, 2, -0.25F, false));
		bone13.cubeList.add(new ModelBox(bone13, 48, 30, -0.3125F, -6.0221F, 5.3951F, 2, 1, 2, -0.25F, false));

		bone14 = new RendererModel(this);
		bone14.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main.addChild(bone14);
		setRotationAngle(bone14, 0.0087F, 0.0F, 0.0F);
		bone14.cubeList.add(new ModelBox(bone14, 16, 64, -1.875F, -6.0563F, 7.1247F, 4, 2, 3, -0.25F, false));

		Panel2 = new RendererModel(this);
		Panel2.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelLayout.addChild(Panel2);
		setRotationAngle(Panel2, 0.0F, -0.5236F, 0.0F);
		

		Side3 = new RendererModel(this);
		Side3.setRotationPoint(-0.9252F, 0.0F, 0.1875F);
		Panel2.addChild(Side3);
		Side3.cubeList.add(new ModelBox(Side3, 78, 15, 1.25F, -15.25F, -9.625F, 2, 16, 6, -0.24F, false));
		Side3.cubeList.add(new ModelBox(Side3, 94, 7, 1.25F, -13.3415F, -15.5335F, 2, 3, 5, -0.25F, false));
		Side3.cubeList.add(new ModelBox(Side3, 96, 18, 1.25F, -15.3415F, -11.0335F, 2, 6, 2, -0.25F, false));
		Side3.cubeList.add(new ModelBox(Side3, 106, 28, 1.25F, -21.75F, -7.625F, 2, 8, 4, -0.25F, false));

		bone15 = new RendererModel(this);
		bone15.setRotationPoint(0.4085F, -7.5F, -12.125F);
		Side3.addChild(bone15);
		setRotationAngle(bone15, -0.5236F, 0.0F, 0.0F);
		bone15.cubeList.add(new ModelBox(bone15, 78, 37, 0.8415F, -3.8481F, -4.5311F, 2, 3, 8, -0.241F, false));

		bone16 = new RendererModel(this);
		bone16.setRotationPoint(0.4085F, 0.0F, -12.125F);
		Side3.addChild(bone16);
		setRotationAngle(bone16, 0.2443F, 0.0F, 0.0F);
		bone16.cubeList.add(new ModelBox(bone16, 78, 0, 0.8415F, -1.0593F, -3.0464F, 2, 3, 6, -0.24F, false));

		bone17 = new RendererModel(this);
		bone17.setRotationPoint(0.9085F, -0.8588F, -10.5031F);
		Side3.addChild(bone17);
		setRotationAngle(bone17, 0.48F, 0.0F, 0.0F);
		bone17.cubeList.add(new ModelBox(bone17, 78, 9, 0.3415F, -0.4909F, 0.0589F, 2, 3, 3, -0.25F, false));
		bone17.cubeList.add(new ModelBox(bone17, 108, 7, 0.3415F, -13.3078F, 1.1581F, 2, 3, 7, -0.25F, false));

		bone18 = new RendererModel(this);
		bone18.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone17.addChild(bone18);
		setRotationAngle(bone18, 0.2182F, 0.0F, 0.0F);
		bone18.cubeList.add(new ModelBox(bone18, 108, 17, 0.5F, -5.1299F, 0.3275F, 2, 4, 7, -0.25F, false));

		Side4 = new RendererModel(this);
		Side4.setRotationPoint(-0.3248F, 0.0F, -0.1875F);
		Panel2.addChild(Side4);
		setRotationAngle(Side4, 0.0F, -1.0472F, 0.0F);
		Side4.cubeList.add(new ModelBox(Side4, 78, 15, -2.0F, -15.25F, -9.625F, 2, 16, 6, -0.24F, false));
		Side4.cubeList.add(new ModelBox(Side4, 94, 7, -2.0F, -13.3415F, -15.5335F, 2, 3, 5, -0.25F, false));
		Side4.cubeList.add(new ModelBox(Side4, 96, 18, -2.0F, -15.3415F, -11.0335F, 2, 6, 2, -0.25F, false));
		Side4.cubeList.add(new ModelBox(Side4, 106, 28, -2.0F, -21.75F, -7.625F, 2, 8, 4, -0.25F, false));

		bone19 = new RendererModel(this);
		bone19.setRotationPoint(-1.3415F, -7.5F, -12.125F);
		Side4.addChild(bone19);
		setRotationAngle(bone19, -0.5236F, 0.0F, 0.0F);
		bone19.cubeList.add(new ModelBox(bone19, 78, 37, -0.6585F, -3.8481F, -4.5311F, 2, 3, 8, -0.241F, false));

		bone20 = new RendererModel(this);
		bone20.setRotationPoint(-1.3415F, 0.0F, -12.125F);
		Side4.addChild(bone20);
		setRotationAngle(bone20, 0.2443F, 0.0F, 0.0F);
		bone20.cubeList.add(new ModelBox(bone20, 78, 0, -0.6585F, -1.0593F, -3.0464F, 2, 3, 6, -0.24F, false));

		bone21 = new RendererModel(this);
		bone21.setRotationPoint(-0.8415F, -0.8588F, -10.5031F);
		Side4.addChild(bone21);
		setRotationAngle(bone21, 0.48F, 0.0F, 0.0F);
		bone21.cubeList.add(new ModelBox(bone21, 78, 9, -1.1585F, -0.4909F, 0.0589F, 2, 3, 3, -0.25F, false));
		bone21.cubeList.add(new ModelBox(bone21, 108, 7, -1.1585F, -13.3078F, 1.1581F, 2, 3, 7, -0.25F, false));

		bone22 = new RendererModel(this);
		bone22.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone21.addChild(bone22);
		setRotationAngle(bone22, 0.2182F, 0.0F, 0.0F);
		bone22.cubeList.add(new ModelBox(bone22, 108, 17, -1.0F, -5.1299F, 0.3275F, 2, 4, 7, -0.25F, false));

		Main2 = new RendererModel(this);
		Main2.setRotationPoint(2.5F, -13.3415F, -13.0335F);
		Panel2.addChild(Main2);
		setRotationAngle(Main2, 0.0F, -0.5236F, 0.0F);
		Main2.cubeList.add(new ModelBox(Main2, 94, 2, -1.6875F, 0.0F, -1.7611F, 12, 3, 2, -0.25F, false));
		Main2.cubeList.add(new ModelBox(Main2, 96, 2, -1.6875F, 0.0F, -2.0111F, 3, 3, 2, -0.249F, false));
		Main2.cubeList.add(new ModelBox(Main2, 96, 2, 7.3125F, 0.0F, -2.0111F, 3, 3, 2, -0.249F, false));
		Main2.cubeList.add(new ModelBox(Main2, 94, 18, 2.75F, -3.0F, 5.7389F, 4, 17, 2, -0.25F, false));
		Main2.cubeList.add(new ModelBox(Main2, 93, 26, 2.75F, -1.0F, 7.2389F, 3, 3, 2, -0.25F, false));

		bone23 = new RendererModel(this);
		bone23.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main2.addChild(bone23);
		setRotationAngle(bone23, -1.1606F, 0.0F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 40, 56, -6.0F, -2.1519F, 1.1256F, 12, 3, 2, -0.25F, false));

		bone24 = new RendererModel(this);
		bone24.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main2.addChild(bone24);
		setRotationAngle(bone24, -0.9861F, 0.0F, 0.0F);
		bone24.cubeList.add(new ModelBox(bone24, 41, 55, -4.9375F, -3.3841F, 1.4349F, 4, 2, 2, -0.25F, false));
		bone24.cubeList.add(new ModelBox(bone24, 50, 54, 1.0625F, -3.3841F, 1.4349F, 4, 2, 2, -0.25F, false));

		bone25 = new RendererModel(this);
		bone25.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main2.addChild(bone25);
		setRotationAngle(bone25, -0.9512F, 0.0F, 0.0F);
		bone25.cubeList.add(new ModelBox(bone25, 41, 55, -3.9375F, -4.8234F, 1.5433F, 3, 2, 2, -0.25F, false));
		bone25.cubeList.add(new ModelBox(bone25, 50, 54, 1.0625F, -4.8234F, 1.5433F, 3, 2, 2, -0.25F, false));
		bone25.cubeList.add(new ModelBox(bone25, 41, 55, -1.4375F, -4.8234F, 1.5433F, 3, 1, 2, -0.25F, false));
		bone25.cubeList.add(new ModelBox(bone25, 45, 57, -3.4375F, -6.3234F, 1.5433F, 7, 2, 2, -0.25F, false));

		bone26 = new RendererModel(this);
		bone26.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main2.addChild(bone26);
		setRotationAngle(bone26, -0.8203F, 0.0F, 0.0F);
		bone26.cubeList.add(new ModelBox(bone26, 50, 54, -2.4375F, -7.5374F, 2.3207F, 5, 2, 2, -0.25F, false));

		bone27 = new RendererModel(this);
		bone27.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main2.addChild(bone27);
		setRotationAngle(bone27, -0.2967F, 0.0F, 0.0F);
		bone27.cubeList.add(new ModelBox(bone27, 12, 72, -1.9375F, -7.044F, 5.4788F, 4, 3, 2, -0.25F, false));

		bone28 = new RendererModel(this);
		bone28.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main2.addChild(bone28);
		setRotationAngle(bone28, 0.0087F, 0.0F, 0.0F);
		bone28.cubeList.add(new ModelBox(bone28, 16, 66, -1.875F, -8.0563F, 7.1247F, 4, 4, 3, -0.25F, false));

		Panel3 = new RendererModel(this);
		Panel3.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelLayout.addChild(Panel3);
		setRotationAngle(Panel3, 0.0F, -1.5708F, 0.0F);
		

		Side5 = new RendererModel(this);
		Side5.setRotationPoint(-0.9252F, 0.0F, 0.1875F);
		Panel3.addChild(Side5);
		Side5.cubeList.add(new ModelBox(Side5, 78, 15, 1.25F, -15.25F, -9.625F, 2, 16, 6, -0.24F, false));
		Side5.cubeList.add(new ModelBox(Side5, 94, 7, 1.25F, -13.3415F, -15.5335F, 2, 3, 5, -0.25F, false));
		Side5.cubeList.add(new ModelBox(Side5, 96, 18, 1.25F, -15.3415F, -11.0335F, 2, 6, 2, -0.25F, false));
		Side5.cubeList.add(new ModelBox(Side5, 106, 28, 1.25F, -21.75F, -7.625F, 2, 8, 4, -0.25F, false));

		bone29 = new RendererModel(this);
		bone29.setRotationPoint(0.4085F, -7.5F, -12.125F);
		Side5.addChild(bone29);
		setRotationAngle(bone29, -0.5236F, 0.0F, 0.0F);
		bone29.cubeList.add(new ModelBox(bone29, 78, 37, 0.8415F, -3.8481F, -4.5311F, 2, 3, 8, -0.241F, false));

		bone30 = new RendererModel(this);
		bone30.setRotationPoint(0.4085F, 0.0F, -12.125F);
		Side5.addChild(bone30);
		setRotationAngle(bone30, 0.2443F, 0.0F, 0.0F);
		bone30.cubeList.add(new ModelBox(bone30, 78, 0, 0.8415F, -1.0593F, -3.0464F, 2, 3, 6, -0.24F, false));

		bone31 = new RendererModel(this);
		bone31.setRotationPoint(0.9085F, -0.8588F, -10.5031F);
		Side5.addChild(bone31);
		setRotationAngle(bone31, 0.48F, 0.0F, 0.0F);
		bone31.cubeList.add(new ModelBox(bone31, 78, 9, 0.3415F, -0.4909F, 0.0589F, 2, 3, 3, -0.25F, false));
		bone31.cubeList.add(new ModelBox(bone31, 108, 7, 0.3415F, -13.3078F, 1.1581F, 2, 3, 7, -0.25F, false));

		bone32 = new RendererModel(this);
		bone32.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone31.addChild(bone32);
		setRotationAngle(bone32, 0.2182F, 0.0F, 0.0F);
		bone32.cubeList.add(new ModelBox(bone32, 108, 17, 0.5F, -5.1299F, 0.3275F, 2, 4, 7, -0.25F, false));

		Side6 = new RendererModel(this);
		Side6.setRotationPoint(-0.3248F, 0.0F, -0.1875F);
		Panel3.addChild(Side6);
		setRotationAngle(Side6, 0.0F, -1.0472F, 0.0F);
		Side6.cubeList.add(new ModelBox(Side6, 78, 15, -2.0F, -15.25F, -9.625F, 2, 16, 6, -0.24F, false));
		Side6.cubeList.add(new ModelBox(Side6, 94, 7, -2.0F, -13.3415F, -15.5335F, 2, 3, 5, -0.25F, false));
		Side6.cubeList.add(new ModelBox(Side6, 96, 18, -2.0F, -15.3415F, -11.0335F, 2, 6, 2, -0.25F, false));
		Side6.cubeList.add(new ModelBox(Side6, 106, 28, -2.0F, -21.75F, -7.625F, 2, 8, 4, -0.25F, false));

		bone33 = new RendererModel(this);
		bone33.setRotationPoint(-1.3415F, -7.5F, -12.125F);
		Side6.addChild(bone33);
		setRotationAngle(bone33, -0.5236F, 0.0F, 0.0F);
		bone33.cubeList.add(new ModelBox(bone33, 78, 37, -0.6585F, -3.8481F, -4.5311F, 2, 3, 8, -0.241F, false));

		bone34 = new RendererModel(this);
		bone34.setRotationPoint(-1.3415F, 0.0F, -12.125F);
		Side6.addChild(bone34);
		setRotationAngle(bone34, 0.2443F, 0.0F, 0.0F);
		bone34.cubeList.add(new ModelBox(bone34, 78, 0, -0.6585F, -1.0593F, -3.0464F, 2, 3, 6, -0.24F, false));

		bone35 = new RendererModel(this);
		bone35.setRotationPoint(-0.8415F, -0.8588F, -10.5031F);
		Side6.addChild(bone35);
		setRotationAngle(bone35, 0.48F, 0.0F, 0.0F);
		bone35.cubeList.add(new ModelBox(bone35, 78, 9, -1.1585F, -0.4909F, 0.0589F, 2, 3, 3, -0.25F, false));
		bone35.cubeList.add(new ModelBox(bone35, 108, 7, -1.1585F, -13.3078F, 1.1581F, 2, 3, 7, -0.25F, false));

		bone36 = new RendererModel(this);
		bone36.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone35.addChild(bone36);
		setRotationAngle(bone36, 0.2182F, 0.0F, 0.0F);
		bone36.cubeList.add(new ModelBox(bone36, 108, 17, -1.0F, -5.1299F, 0.3275F, 2, 4, 7, -0.25F, false));

		Main3 = new RendererModel(this);
		Main3.setRotationPoint(2.5F, -13.3415F, -13.0335F);
		Panel3.addChild(Main3);
		setRotationAngle(Main3, 0.0F, -0.5236F, 0.0F);
		Main3.cubeList.add(new ModelBox(Main3, 94, 2, -1.6875F, 0.0F, -1.7611F, 12, 3, 2, -0.25F, false));
		Main3.cubeList.add(new ModelBox(Main3, 39, 84, 8.125F, 0.5F, -2.1361F, 2, 2, 2, -0.4375F, false));
		Main3.cubeList.add(new ModelBox(Main3, 94, 18, 2.75F, -3.0F, 5.7389F, 4, 17, 2, -0.25F, false));
		Main3.cubeList.add(new ModelBox(Main3, 93, 26, 2.75F, -1.0F, 7.2389F, 3, 3, 2, -0.25F, false));

		bone37 = new RendererModel(this);
		bone37.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main3.addChild(bone37);
		setRotationAngle(bone37, -1.1606F, 0.0F, 0.0F);
		bone37.cubeList.add(new ModelBox(bone37, 40, 56, -6.0F, -2.1519F, 1.1256F, 12, 3, 2, -0.25F, false));

		bone38 = new RendererModel(this);
		bone38.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main3.addChild(bone38);
		setRotationAngle(bone38, -0.9861F, 0.0F, 0.0F);
		bone38.cubeList.add(new ModelBox(bone38, 40, 56, -4.9375F, -3.3841F, 1.4349F, 10, 2, 2, -0.25F, false));

		bone101 = new RendererModel(this);
		bone101.setRotationPoint(1.0625F, -2.3841F, 2.3308F);
		bone38.addChild(bone101);
		setRotationAngle(bone101, 0.0F, 0.0F, -0.2182F);
		bone101.cubeList.add(new ModelBox(bone101, 37, 15, -2.0F, -0.6875F, -1.0208F, 4, 2, 2, -0.24F, false));
		bone101.cubeList.add(new ModelBox(bone101, 48, 66, -1.6845F, -0.36F, -1.0373F, 1, 1, 1, 0.0F, false));
		bone101.cubeList.add(new ModelBox(bone101, 39, 84, 0.3155F, -0.36F, -1.0373F, 1, 1, 1, 0.0F, false));
		bone101.cubeList.add(new ModelBox(bone101, 48, 66, -1.6845F, -0.36F, -2.4748F, 1, 1, 2, -0.375F, false));
		bone101.cubeList.add(new ModelBox(bone101, 37, 15, 0.375F, -0.6875F, -1.0833F, 2, 2, 2, -0.3125F, false));
		bone101.cubeList.add(new ModelBox(bone101, 37, 15, -2.375F, -0.6875F, -1.0833F, 2, 2, 2, -0.3125F, false));

		bone39 = new RendererModel(this);
		bone39.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main3.addChild(bone39);
		setRotationAngle(bone39, -0.9512F, 0.0F, 0.0F);
		bone39.cubeList.add(new ModelBox(bone39, 40, 56, -3.9375F, -4.8234F, 1.5433F, 8, 2, 2, -0.25F, false));
		bone39.cubeList.add(new ModelBox(bone39, 39, 52, -3.4375F, -6.3234F, 1.5433F, 7, 2, 2, -0.25F, false));

		bone40 = new RendererModel(this);
		bone40.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main3.addChild(bone40);
		setRotationAngle(bone40, -0.8203F, 0.0F, 0.0F);
		bone40.cubeList.add(new ModelBox(bone40, 40, 56, -2.4375F, -7.5374F, 2.3207F, 5, 2, 2, -0.25F, false));

		bone41 = new RendererModel(this);
		bone41.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main3.addChild(bone41);
		setRotationAngle(bone41, -0.2967F, 0.0F, 0.0F);
		bone41.cubeList.add(new ModelBox(bone41, 12, 72, -1.9375F, -7.044F, 5.4788F, 4, 3, 2, -0.25F, false));

		bone42 = new RendererModel(this);
		bone42.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main3.addChild(bone42);
		setRotationAngle(bone42, 0.0087F, 0.0F, 0.0F);
		bone42.cubeList.add(new ModelBox(bone42, 12, 72, -1.875F, -6.0563F, 7.1247F, 4, 2, 3, -0.25F, false));

		Panel4 = new RendererModel(this);
		Panel4.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelLayout.addChild(Panel4);
		setRotationAngle(Panel4, 0.0F, -2.618F, 0.0F);
		

		Side7 = new RendererModel(this);
		Side7.setRotationPoint(-0.9252F, 0.0F, 0.1875F);
		Panel4.addChild(Side7);
		Side7.cubeList.add(new ModelBox(Side7, 78, 15, 1.25F, -15.25F, -9.625F, 2, 16, 6, -0.24F, false));
		Side7.cubeList.add(new ModelBox(Side7, 94, 7, 1.25F, -13.3415F, -15.5335F, 2, 3, 5, -0.25F, false));
		Side7.cubeList.add(new ModelBox(Side7, 96, 18, 1.25F, -15.3415F, -11.0335F, 2, 6, 2, -0.25F, false));
		Side7.cubeList.add(new ModelBox(Side7, 106, 28, 1.25F, -21.75F, -7.625F, 2, 8, 4, -0.25F, false));

		bone43 = new RendererModel(this);
		bone43.setRotationPoint(0.4085F, -7.5F, -12.125F);
		Side7.addChild(bone43);
		setRotationAngle(bone43, -0.5236F, 0.0F, 0.0F);
		bone43.cubeList.add(new ModelBox(bone43, 78, 37, 0.8415F, -3.8481F, -4.5311F, 2, 3, 8, -0.241F, false));

		bone44 = new RendererModel(this);
		bone44.setRotationPoint(0.4085F, 0.0F, -12.125F);
		Side7.addChild(bone44);
		setRotationAngle(bone44, 0.2443F, 0.0F, 0.0F);
		bone44.cubeList.add(new ModelBox(bone44, 78, 0, 0.8415F, -1.0593F, -3.0464F, 2, 3, 6, -0.24F, false));

		bone45 = new RendererModel(this);
		bone45.setRotationPoint(0.9085F, -0.8588F, -10.5031F);
		Side7.addChild(bone45);
		setRotationAngle(bone45, 0.48F, 0.0F, 0.0F);
		bone45.cubeList.add(new ModelBox(bone45, 78, 9, 0.3415F, -0.4909F, 0.0589F, 2, 3, 3, -0.25F, false));
		bone45.cubeList.add(new ModelBox(bone45, 108, 7, 0.3415F, -13.3078F, 1.1581F, 2, 3, 7, -0.25F, false));

		bone46 = new RendererModel(this);
		bone46.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone45.addChild(bone46);
		setRotationAngle(bone46, 0.2182F, 0.0F, 0.0F);
		bone46.cubeList.add(new ModelBox(bone46, 108, 17, 0.5F, -5.1299F, 0.3275F, 2, 4, 7, -0.25F, false));

		Side8 = new RendererModel(this);
		Side8.setRotationPoint(-0.3248F, 0.0F, -0.1875F);
		Panel4.addChild(Side8);
		setRotationAngle(Side8, 0.0F, -1.0472F, 0.0F);
		Side8.cubeList.add(new ModelBox(Side8, 78, 15, -2.0F, -15.25F, -9.625F, 2, 16, 6, -0.24F, false));
		Side8.cubeList.add(new ModelBox(Side8, 94, 7, -2.0F, -13.3415F, -15.5335F, 2, 3, 5, -0.25F, false));
		Side8.cubeList.add(new ModelBox(Side8, 96, 18, -2.0F, -15.3415F, -11.0335F, 2, 6, 2, -0.25F, false));
		Side8.cubeList.add(new ModelBox(Side8, 106, 28, -2.0F, -21.75F, -7.625F, 2, 8, 4, -0.25F, false));

		bone47 = new RendererModel(this);
		bone47.setRotationPoint(-1.3415F, -7.5F, -12.125F);
		Side8.addChild(bone47);
		setRotationAngle(bone47, -0.5236F, 0.0F, 0.0F);
		bone47.cubeList.add(new ModelBox(bone47, 78, 37, -0.6585F, -3.8481F, -4.5311F, 2, 3, 8, -0.241F, false));

		bone48 = new RendererModel(this);
		bone48.setRotationPoint(-1.3415F, 0.0F, -12.125F);
		Side8.addChild(bone48);
		setRotationAngle(bone48, 0.2443F, 0.0F, 0.0F);
		bone48.cubeList.add(new ModelBox(bone48, 78, 0, -0.6585F, -1.0593F, -3.0464F, 2, 3, 6, -0.24F, false));

		bone49 = new RendererModel(this);
		bone49.setRotationPoint(-0.8415F, -0.8588F, -10.5031F);
		Side8.addChild(bone49);
		setRotationAngle(bone49, 0.48F, 0.0F, 0.0F);
		bone49.cubeList.add(new ModelBox(bone49, 78, 9, -1.1585F, -0.4909F, 0.0589F, 2, 3, 3, -0.25F, false));
		bone49.cubeList.add(new ModelBox(bone49, 108, 7, -1.1585F, -13.3078F, 1.1581F, 2, 3, 7, -0.25F, false));

		bone50 = new RendererModel(this);
		bone50.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone49.addChild(bone50);
		setRotationAngle(bone50, 0.2182F, 0.0F, 0.0F);
		bone50.cubeList.add(new ModelBox(bone50, 108, 17, -1.0F, -5.1299F, 0.3275F, 2, 4, 7, -0.25F, false));

		Main4 = new RendererModel(this);
		Main4.setRotationPoint(2.5F, -13.3415F, -13.0335F);
		Panel4.addChild(Main4);
		setRotationAngle(Main4, 0.0F, -0.5236F, 0.0F);
		Main4.cubeList.add(new ModelBox(Main4, 94, 2, -1.6875F, 0.0F, -1.7611F, 12, 3, 2, -0.25F, false));
		Main4.cubeList.add(new ModelBox(Main4, 94, 18, 2.75F, -3.0F, 5.7389F, 4, 17, 2, -0.25F, false));
		Main4.cubeList.add(new ModelBox(Main4, 93, 26, 2.75F, -1.0F, 7.2389F, 3, 3, 2, -0.25F, false));

		bone51 = new RendererModel(this);
		bone51.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main4.addChild(bone51);
		setRotationAngle(bone51, -1.1606F, 0.0F, 0.0F);
		bone51.cubeList.add(new ModelBox(bone51, 40, 56, -6.0F, -2.1519F, 1.1256F, 12, 3, 2, -0.25F, false));

		bone52 = new RendererModel(this);
		bone52.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main4.addChild(bone52);
		setRotationAngle(bone52, -0.9861F, 0.0F, 0.0F);
		bone52.cubeList.add(new ModelBox(bone52, 40, 56, -4.9375F, -3.3841F, 1.4349F, 10, 2, 2, -0.25F, false));

		bone53 = new RendererModel(this);
		bone53.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main4.addChild(bone53);
		setRotationAngle(bone53, -0.9512F, 0.0F, 0.0F);
		bone53.cubeList.add(new ModelBox(bone53, 40, 56, -3.9375F, -4.8234F, 1.5433F, 8, 2, 2, -0.25F, false));
		bone53.cubeList.add(new ModelBox(bone53, 41, 56, -3.4375F, -6.3234F, 1.5433F, 7, 2, 2, -0.25F, false));

		bone54 = new RendererModel(this);
		bone54.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main4.addChild(bone54);
		setRotationAngle(bone54, -0.8203F, 0.0F, 0.0F);
		bone54.cubeList.add(new ModelBox(bone54, 50, 54, -2.4375F, -7.5374F, 2.3207F, 5, 2, 2, -0.25F, false));

		bone55 = new RendererModel(this);
		bone55.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main4.addChild(bone55);
		setRotationAngle(bone55, -0.2967F, 0.0F, 0.0F);
		bone55.cubeList.add(new ModelBox(bone55, 12, 72, -1.9375F, -7.044F, 5.4788F, 4, 3, 2, -0.25F, false));

		bone56 = new RendererModel(this);
		bone56.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main4.addChild(bone56);
		setRotationAngle(bone56, 0.0087F, 0.0F, 0.0F);
		bone56.cubeList.add(new ModelBox(bone56, 16, 66, -1.875F, -8.0563F, 7.1247F, 4, 4, 3, -0.25F, false));

		Panel5 = new RendererModel(this);
		Panel5.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelLayout.addChild(Panel5);
		setRotationAngle(Panel5, 0.0F, 2.618F, 0.0F);
		

		Side9 = new RendererModel(this);
		Side9.setRotationPoint(-0.9252F, 0.0F, 0.1875F);
		Panel5.addChild(Side9);
		Side9.cubeList.add(new ModelBox(Side9, 78, 15, 1.25F, -15.25F, -9.625F, 2, 16, 6, -0.24F, false));
		Side9.cubeList.add(new ModelBox(Side9, 94, 7, 1.25F, -13.3415F, -15.5335F, 2, 3, 5, -0.25F, false));
		Side9.cubeList.add(new ModelBox(Side9, 96, 18, 1.25F, -15.3415F, -11.0335F, 2, 6, 2, -0.25F, false));
		Side9.cubeList.add(new ModelBox(Side9, 106, 28, 1.25F, -21.75F, -7.625F, 2, 8, 4, -0.25F, false));

		bone57 = new RendererModel(this);
		bone57.setRotationPoint(0.4085F, -7.5F, -12.125F);
		Side9.addChild(bone57);
		setRotationAngle(bone57, -0.5236F, 0.0F, 0.0F);
		bone57.cubeList.add(new ModelBox(bone57, 78, 37, 0.8415F, -3.8481F, -4.5311F, 2, 3, 8, -0.241F, false));

		bone58 = new RendererModel(this);
		bone58.setRotationPoint(0.4085F, 0.0F, -12.125F);
		Side9.addChild(bone58);
		setRotationAngle(bone58, 0.2443F, 0.0F, 0.0F);
		bone58.cubeList.add(new ModelBox(bone58, 78, 0, 0.8415F, -1.0593F, -3.0464F, 2, 3, 6, -0.24F, false));

		bone59 = new RendererModel(this);
		bone59.setRotationPoint(0.9085F, -0.8588F, -10.5031F);
		Side9.addChild(bone59);
		setRotationAngle(bone59, 0.48F, 0.0F, 0.0F);
		bone59.cubeList.add(new ModelBox(bone59, 78, 9, 0.3415F, -0.4909F, 0.0589F, 2, 3, 3, -0.25F, false));
		bone59.cubeList.add(new ModelBox(bone59, 108, 7, 0.3415F, -13.3078F, 1.1581F, 2, 3, 7, -0.25F, false));

		bone60 = new RendererModel(this);
		bone60.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone59.addChild(bone60);
		setRotationAngle(bone60, 0.2182F, 0.0F, 0.0F);
		bone60.cubeList.add(new ModelBox(bone60, 108, 17, 0.5F, -5.1299F, 0.3275F, 2, 4, 7, -0.25F, false));

		Side10 = new RendererModel(this);
		Side10.setRotationPoint(-0.3248F, 0.0F, -0.1875F);
		Panel5.addChild(Side10);
		setRotationAngle(Side10, 0.0F, -1.0472F, 0.0F);
		Side10.cubeList.add(new ModelBox(Side10, 78, 15, -2.0F, -15.25F, -9.625F, 2, 16, 6, -0.24F, false));
		Side10.cubeList.add(new ModelBox(Side10, 94, 7, -2.0F, -13.3415F, -15.5335F, 2, 3, 5, -0.25F, false));
		Side10.cubeList.add(new ModelBox(Side10, 96, 18, -2.0F, -15.3415F, -11.0335F, 2, 6, 2, -0.25F, false));
		Side10.cubeList.add(new ModelBox(Side10, 106, 28, -2.0F, -21.75F, -7.625F, 2, 8, 4, -0.25F, false));

		bone61 = new RendererModel(this);
		bone61.setRotationPoint(-1.3415F, -7.5F, -12.125F);
		Side10.addChild(bone61);
		setRotationAngle(bone61, -0.5236F, 0.0F, 0.0F);
		bone61.cubeList.add(new ModelBox(bone61, 78, 37, -0.6585F, -3.8481F, -4.5311F, 2, 3, 8, -0.241F, false));

		bone62 = new RendererModel(this);
		bone62.setRotationPoint(-1.3415F, 0.0F, -12.125F);
		Side10.addChild(bone62);
		setRotationAngle(bone62, 0.2443F, 0.0F, 0.0F);
		bone62.cubeList.add(new ModelBox(bone62, 78, 0, -0.6585F, -1.0593F, -3.0464F, 2, 3, 6, -0.24F, false));

		bone63 = new RendererModel(this);
		bone63.setRotationPoint(-0.8415F, -0.8588F, -10.5031F);
		Side10.addChild(bone63);
		setRotationAngle(bone63, 0.48F, 0.0F, 0.0F);
		bone63.cubeList.add(new ModelBox(bone63, 78, 9, -1.1585F, -0.4909F, 0.0589F, 2, 3, 3, -0.25F, false));
		bone63.cubeList.add(new ModelBox(bone63, 108, 7, -1.1585F, -13.3078F, 1.1581F, 2, 3, 7, -0.25F, false));

		bone64 = new RendererModel(this);
		bone64.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone63.addChild(bone64);
		setRotationAngle(bone64, 0.2182F, 0.0F, 0.0F);
		bone64.cubeList.add(new ModelBox(bone64, 108, 17, -1.0F, -5.1299F, 0.3275F, 2, 4, 7, -0.25F, false));

		Main5 = new RendererModel(this);
		Main5.setRotationPoint(2.5F, -13.3415F, -13.0335F);
		Panel5.addChild(Main5);
		setRotationAngle(Main5, 0.0F, -0.5236F, 0.0F);
		Main5.cubeList.add(new ModelBox(Main5, 94, 2, -1.6875F, 0.0F, -1.7611F, 12, 3, 2, -0.25F, false));
		Main5.cubeList.add(new ModelBox(Main5, 94, 18, 2.75F, -3.0F, 5.7389F, 4, 17, 2, -0.25F, false));
		Main5.cubeList.add(new ModelBox(Main5, 93, 26, 2.75F, -1.0F, 7.2389F, 3, 3, 2, -0.25F, false));

		bone65 = new RendererModel(this);
		bone65.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main5.addChild(bone65);
		setRotationAngle(bone65, -1.1606F, 0.0F, 0.0F);
		bone65.cubeList.add(new ModelBox(bone65, 40, 56, -6.0F, -2.1519F, 1.1256F, 12, 3, 2, -0.25F, false));

		bone66 = new RendererModel(this);
		bone66.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main5.addChild(bone66);
		setRotationAngle(bone66, -0.9861F, 0.0F, 0.0F);
		bone66.cubeList.add(new ModelBox(bone66, 41, 51, -5.0F, -3.3841F, 1.4349F, 4, 2, 2, -0.25F, false));
		bone66.cubeList.add(new ModelBox(bone66, 50, 54, 1.0F, -3.3841F, 1.4349F, 4, 2, 2, -0.25F, false));

		bone67 = new RendererModel(this);
		bone67.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main5.addChild(bone67);
		setRotationAngle(bone67, -0.9512F, 0.0F, 0.0F);
		bone67.cubeList.add(new ModelBox(bone67, 41, 51, -4.0F, -4.8234F, 1.5433F, 3, 2, 2, -0.25F, false));
		bone67.cubeList.add(new ModelBox(bone67, 50, 54, 1.0F, -4.8234F, 1.5433F, 3, 2, 2, -0.25F, false));
		bone67.cubeList.add(new ModelBox(bone67, 42, 57, -1.5F, -4.8234F, 1.5433F, 3, 1, 2, -0.25F, false));
		bone67.cubeList.add(new ModelBox(bone67, 42, 54, -3.4375F, -6.3234F, 1.5433F, 7, 2, 2, -0.25F, false));

		bone68 = new RendererModel(this);
		bone68.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main5.addChild(bone68);
		setRotationAngle(bone68, -0.8203F, 0.0F, 0.0F);
		bone68.cubeList.add(new ModelBox(bone68, 50, 54, -2.4375F, -7.5374F, 2.3207F, 5, 2, 2, -0.25F, false));

		bone69 = new RendererModel(this);
		bone69.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main5.addChild(bone69);
		setRotationAngle(bone69, -0.2967F, 0.0F, 0.0F);
		bone69.cubeList.add(new ModelBox(bone69, 12, 72, -1.9375F, -7.044F, 5.4788F, 4, 3, 2, -0.25F, false));

		bone70 = new RendererModel(this);
		bone70.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main5.addChild(bone70);
		setRotationAngle(bone70, 0.0087F, 0.0F, 0.0F);
		bone70.cubeList.add(new ModelBox(bone70, 20, 7, -1.875F, -6.0563F, 7.1247F, 4, 2, 3, -0.25F, false));
		bone70.cubeList.add(new ModelBox(bone70, 20, 7, -1.875F, -6.0563F, 4.6247F, 1, 1, 3, -0.25F, false));
		bone70.cubeList.add(new ModelBox(bone70, 20, 7, 1.125F, -6.0563F, 4.6247F, 1, 1, 3, -0.25F, false));
		bone70.cubeList.add(new ModelBox(bone70, 20, 7, -1.375F, -6.0563F, 4.6247F, 3, 1, 1, -0.25F, false));
		bone70.cubeList.add(new ModelBox(bone70, 20, 7, -0.875F, -6.8063F, 5.31F, 2, 2, 2, -0.25F, false));

		Panel6 = new RendererModel(this);
		Panel6.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelLayout.addChild(Panel6);
		setRotationAngle(Panel6, 0.0F, 1.5708F, 0.0F);
		

		Side11 = new RendererModel(this);
		Side11.setRotationPoint(-0.9252F, 0.0F, 0.1875F);
		Panel6.addChild(Side11);
		Side11.cubeList.add(new ModelBox(Side11, 78, 15, 1.25F, -15.25F, -9.625F, 2, 16, 6, -0.24F, false));
		Side11.cubeList.add(new ModelBox(Side11, 94, 7, 1.25F, -13.3415F, -15.5335F, 2, 3, 5, -0.25F, false));
		Side11.cubeList.add(new ModelBox(Side11, 96, 18, 1.25F, -15.3415F, -11.0335F, 2, 6, 2, -0.25F, false));
		Side11.cubeList.add(new ModelBox(Side11, 106, 28, 1.25F, -21.75F, -7.625F, 2, 8, 4, -0.25F, false));

		bone71 = new RendererModel(this);
		bone71.setRotationPoint(0.4085F, -7.5F, -12.125F);
		Side11.addChild(bone71);
		setRotationAngle(bone71, -0.5236F, 0.0F, 0.0F);
		bone71.cubeList.add(new ModelBox(bone71, 78, 37, 0.8415F, -3.8481F, -4.5311F, 2, 3, 8, -0.25F, false));

		bone72 = new RendererModel(this);
		bone72.setRotationPoint(0.4085F, 0.0F, -12.125F);
		Side11.addChild(bone72);
		setRotationAngle(bone72, 0.2443F, 0.0F, 0.0F);
		bone72.cubeList.add(new ModelBox(bone72, 78, 0, 0.8415F, -1.0593F, -3.0464F, 2, 3, 6, -0.24F, false));

		bone73 = new RendererModel(this);
		bone73.setRotationPoint(0.9085F, -0.8588F, -10.5031F);
		Side11.addChild(bone73);
		setRotationAngle(bone73, 0.48F, 0.0F, 0.0F);
		bone73.cubeList.add(new ModelBox(bone73, 78, 9, 0.3415F, -0.4909F, 0.0589F, 2, 3, 3, -0.25F, false));
		bone73.cubeList.add(new ModelBox(bone73, 108, 7, 0.3415F, -13.3078F, 1.1581F, 2, 3, 7, -0.25F, false));

		bone74 = new RendererModel(this);
		bone74.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone73.addChild(bone74);
		setRotationAngle(bone74, 0.2182F, 0.0F, 0.0F);
		bone74.cubeList.add(new ModelBox(bone74, 108, 17, 0.5F, -5.1299F, 0.3275F, 2, 4, 7, -0.25F, false));

		Side12 = new RendererModel(this);
		Side12.setRotationPoint(-0.3248F, 0.0F, -0.1875F);
		Panel6.addChild(Side12);
		setRotationAngle(Side12, 0.0F, -1.0472F, 0.0F);
		Side12.cubeList.add(new ModelBox(Side12, 78, 15, -2.0F, -15.25F, -9.625F, 2, 16, 6, -0.24F, false));
		Side12.cubeList.add(new ModelBox(Side12, 94, 7, -2.0F, -13.3415F, -15.5335F, 2, 3, 5, -0.25F, false));
		Side12.cubeList.add(new ModelBox(Side12, 96, 18, -2.0F, -15.3415F, -11.0335F, 2, 6, 2, -0.25F, false));
		Side12.cubeList.add(new ModelBox(Side12, 106, 28, -2.0F, -21.75F, -7.625F, 2, 8, 4, -0.25F, false));

		bone75 = new RendererModel(this);
		bone75.setRotationPoint(-1.3415F, -7.5F, -12.125F);
		Side12.addChild(bone75);
		setRotationAngle(bone75, -0.5236F, 0.0F, 0.0F);
		bone75.cubeList.add(new ModelBox(bone75, 78, 37, -0.6585F, -3.8481F, -4.5311F, 2, 3, 8, -0.241F, false));

		bone76 = new RendererModel(this);
		bone76.setRotationPoint(-1.3415F, 0.0F, -12.125F);
		Side12.addChild(bone76);
		setRotationAngle(bone76, 0.2443F, 0.0F, 0.0F);
		bone76.cubeList.add(new ModelBox(bone76, 78, 0, -0.6585F, -1.0593F, -3.0464F, 2, 3, 6, -0.24F, false));

		bone77 = new RendererModel(this);
		bone77.setRotationPoint(-0.8415F, -0.8588F, -10.5031F);
		Side12.addChild(bone77);
		setRotationAngle(bone77, 0.48F, 0.0F, 0.0F);
		bone77.cubeList.add(new ModelBox(bone77, 78, 9, -1.1585F, -0.4909F, 0.0589F, 2, 3, 3, -0.25F, false));
		bone77.cubeList.add(new ModelBox(bone77, 108, 7, -1.1585F, -13.3078F, 1.1581F, 2, 3, 7, -0.25F, false));

		bone78 = new RendererModel(this);
		bone78.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone77.addChild(bone78);
		setRotationAngle(bone78, 0.2182F, 0.0F, 0.0F);
		bone78.cubeList.add(new ModelBox(bone78, 108, 17, -1.0F, -5.1299F, 0.3275F, 2, 4, 7, -0.25F, false));

		Main6 = new RendererModel(this);
		Main6.setRotationPoint(2.5F, -13.3415F, -13.0335F);
		Panel6.addChild(Main6);
		setRotationAngle(Main6, 0.0F, -0.5236F, 0.0F);
		Main6.cubeList.add(new ModelBox(Main6, 94, 2, -1.6875F, 0.0F, -1.7611F, 12, 3, 2, -0.25F, false));
		Main6.cubeList.add(new ModelBox(Main6, 94, 18, 2.75F, -3.0F, 5.7389F, 4, 17, 2, -0.25F, false));
		Main6.cubeList.add(new ModelBox(Main6, 93, 26, 2.75F, -1.0F, 7.2389F, 3, 3, 2, -0.25F, false));

		bone79 = new RendererModel(this);
		bone79.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main6.addChild(bone79);
		setRotationAngle(bone79, -1.1606F, 0.0F, 0.0F);
		bone79.cubeList.add(new ModelBox(bone79, 40, 56, -6.0F, -2.1519F, 1.1256F, 12, 3, 2, -0.25F, false));
		bone79.cubeList.add(new ModelBox(bone79, 38, 11, 3.25F, -0.6519F, 1.1256F, 1, 1, 2, 0.0F, false));
		bone79.cubeList.add(new ModelBox(bone79, 40, 47, 3.25F, -0.6519F, -0.1244F, 1, 1, 2, -0.25F, false));

		bone80 = new RendererModel(this);
		bone80.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main6.addChild(bone80);
		setRotationAngle(bone80, -0.9861F, 0.0F, 0.0F);
		bone80.cubeList.add(new ModelBox(bone80, 40, 56, -4.9375F, -3.3841F, 1.4349F, 10, 2, 2, -0.25F, false));

		bone81 = new RendererModel(this);
		bone81.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main6.addChild(bone81);
		setRotationAngle(bone81, -0.9512F, 0.0F, 0.0F);
		bone81.cubeList.add(new ModelBox(bone81, 50, 54, -2.6875F, -4.8234F, 1.5433F, 2, 2, 2, -0.25F, false));
		bone81.cubeList.add(new ModelBox(bone81, 50, 54, 0.75F, -4.8234F, 1.5433F, 2, 2, 2, -0.25F, false));
		bone81.cubeList.add(new ModelBox(bone81, 50, 54, -4.1875F, -3.8234F, 1.5433F, 2, 1, 2, -0.25F, false));
		bone81.cubeList.add(new ModelBox(bone81, 50, 54, 2.25F, -3.8234F, 1.5433F, 2, 1, 2, -0.25F, false));
		bone81.cubeList.add(new ModelBox(bone81, 50, 54, -1.5F, -4.0734F, 1.5433F, 3, 2, 2, -0.251F, false));
		bone81.cubeList.add(new ModelBox(bone81, 50, 54, -1.5F, -7.4484F, 1.5433F, 3, 2, 2, -0.251F, false));
		bone81.cubeList.add(new ModelBox(bone81, 50, 54, -4.1875F, -4.3234F, 1.5433F, 2, 1, 2, -0.25F, false));
		bone81.cubeList.add(new ModelBox(bone81, 50, 54, 2.25F, -4.3234F, 1.5433F, 2, 1, 2, -0.25F, false));
		bone81.cubeList.add(new ModelBox(bone81, 50, 54, -3.1875F, -4.8234F, 1.5433F, 1, 1, 2, -0.25F, false));
		bone81.cubeList.add(new ModelBox(bone81, 50, 54, 2.75F, -4.8234F, 1.5433F, 1, 1, 2, -0.25F, false));
		bone81.cubeList.add(new ModelBox(bone81, 50, 54, -3.6875F, -4.8234F, 1.5433F, 1, 1, 2, -0.25F, false));
		bone81.cubeList.add(new ModelBox(bone81, 50, 54, 2.25F, -4.8234F, 1.5433F, 1, 1, 2, -0.25F, false));
		bone81.cubeList.add(new ModelBox(bone81, 50, 54, -2.6875F, -6.3234F, 1.5433F, 2, 2, 2, -0.25F, false));
		bone81.cubeList.add(new ModelBox(bone81, 50, 54, 0.75F, -6.3234F, 1.5433F, 2, 2, 2, -0.25F, false));
		bone81.cubeList.add(new ModelBox(bone81, 50, 54, -3.1875F, -6.3234F, 1.5433F, 1, 2, 2, -0.25F, false));
		bone81.cubeList.add(new ModelBox(bone81, 50, 54, 2.25F, -6.3234F, 1.5433F, 1, 2, 2, -0.25F, false));

		bone82 = new RendererModel(this);
		bone82.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main6.addChild(bone82);
		setRotationAngle(bone82, -0.8203F, 0.0F, 0.0F);
		bone82.cubeList.add(new ModelBox(bone82, 50, 54, -2.4375F, -7.5374F, 2.3207F, 5, 2, 2, -0.25F, false));

		bone83 = new RendererModel(this);
		bone83.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main6.addChild(bone83);
		setRotationAngle(bone83, -0.2967F, 0.0F, 0.0F);
		bone83.cubeList.add(new ModelBox(bone83, 12, 72, -1.9375F, -7.044F, 5.4788F, 4, 3, 2, -0.25F, false));

		bone84 = new RendererModel(this);
		bone84.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main6.addChild(bone84);
		setRotationAngle(bone84, 0.0087F, 0.0F, 0.0F);
		bone84.cubeList.add(new ModelBox(bone84, 16, 66, -1.875F, -8.0563F, 7.1247F, 4, 4, 3, -0.25F, false));
		bone84.cubeList.add(new ModelBox(bone84, 28, 0, -1.375F, -6.1188F, 6.5622F, 2, 2, 3, -0.625F, false));
		bone84.cubeList.add(new ModelBox(bone84, 28, 0, -2.1563F, -6.1184F, 6.5538F, 2, 2, 3, -0.625F, false));
		bone84.cubeList.add(new ModelBox(bone84, 28, 0, -0.5625F, -6.1188F, 6.5622F, 2, 2, 3, -0.625F, false));
		bone84.cubeList.add(new ModelBox(bone84, 44, 32, -1.4375F, -7.3688F, 6.6356F, 3, 2, 2, -0.5F, false));
		bone84.cubeList.add(new ModelBox(bone84, 28, 0, 0.2188F, -6.1184F, 6.5538F, 2, 2, 3, -0.625F, false));
	}

	public void render(ConsoleTile tile) {


		net.tardis.mod.controls.RandomiserControl randomiserControl = tile.getControl(RandomiserControl.class);
		this.bone91.rotateAngleY = (float) Math.toRadians(randomiserControl.getAnimationProgress() * 720.0F );

		Direction consoleFacing = tile.getExteriorDirection();
		if (consoleFacing == Direction.SOUTH) {
			Spin2.rotateAngleY = (float) Math.toRadians(0f);
		} else if (consoleFacing == Direction.NORTH) {
			Spin2.rotateAngleY = (float) Math.toRadians(180f);
		} else if (consoleFacing == Direction.EAST) {
			Spin2.rotateAngleY = (float) Math.toRadians(270f);
		}else if (consoleFacing == Direction.WEST) {
			Spin2.rotateAngleY = (float) Math.toRadians(90f);
		}

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
		if (landingTypeControl.getLandType() == LandingTypeControl.EnumLandType.DOWN) {
			PUMP3.offsetY = 0.0F;
			PUMP3.offsetZ = 0.00F;
		} else {
			PUMP3.offsetY = -0.06F;
			//PUMP3.offsetZ = -0.035F;
		}


        this.Moving.offsetY = - 0.01f + (float)Math.cos((double)tile.flightTicks * 0.1D) * 0.15f;

       /* //Stabalizer
       tile.getSubsystem(StabilizerSubsystem.class).ifPresent(sys ->{
       			if (sys.isActivated()) {
       				PumoHandle4.offsetY = -0.1355F;
       				PumoHandle4.offsetZ = -0.035F;
				} else{
       				PumoHandle4.offsetY = -0.0F;
       				PumoHandle4.offsetZ = -0.0F;
       			} System.out.println(sys.isActivated());
       		}
       );*/

		net.tardis.mod.controls.RandomiserControl random = tile.getControl(RandomiserControl.class);
		float randomOff = random.getAnimationTicks() == 0 ? 0 : 0.006F;
		//this.random_but_1.offsetY = this.random_but_6.offsetY = this.random_but_8.offsetY = randomOff;


		ThrottleControl throttleA = tile.getControl(ThrottleControl.class);
		this.Handle.rotateAngleX = 1F + throttleA.getAmount() * 60;
		tile.getDoor().ifPresent(door -> {
			this.DoorControlLever.rotateAngleX = (float) Math.toRadians(door.getOpenState() == EnumDoorState.CLOSED ? 30F : 0F);
		});

		IncModControl inc = tile.getControl(IncModControl.class);
		this.Handle2.rotateAngleZ = (float) Math.toRadians(((inc.index / (float)IncModControl.COORD_MODS.length) * -180f) - 20f);

		XControl x = tile.getControl(XControl.class);
		//this.x.offsetY = x.getAnimationTicks() == 0 ? 0 : 0.006F;

		YControl y = tile.getControl(YControl.class);
		//this.y.offsetY = y.getAnimationTicks() == 0 ? 0 : 0.006F;

		ZControl z = tile.getControl(ZControl.class);
		//this.z.offsetY = z.getAnimationTicks() == 0 ? 0 : 0.006F;

		EntireModel.render(0.0625F);

		GlStateManager.pushMatrix();

		GlStateManager.translated(-1.3, 0.555, -0.68);
		GlStateManager.rotated(0.8, 1, 0, 0);

		//TODO Find out wtf this below is
		//WorldText text = new WorldText(0.22F, 0.15F, 0.002F, 0xFFFFFF);
		//text.renderMonitor(Helper.getConsoleText(tile));

		GlStateManager.scaled(0.4D, 0.3D, 0.4D); //Size of sonic in port
		GlStateManager.translated(1.1, -1.2, 2.55); //Location XYZ
		GlStateManager.rotated(180,-0, 0.0D, 0.5); //Rotation
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