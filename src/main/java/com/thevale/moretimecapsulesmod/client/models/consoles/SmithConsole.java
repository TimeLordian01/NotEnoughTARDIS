package com.thevale.moretimecapsulesmod.client.models.consoles;// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.moretimecapsulesmod.tileentities.consoles.SmithConsoleTile;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.client.models.TileModel;
import net.tardis.mod.controls.*;
import net.tardis.mod.enums.EnumDoorState;

public class SmithConsole extends EntityModel<Entity> implements TileModel<SmithConsoleTile> {
	private final ModelRenderer EntireModel;
	private final ModelRenderer MonitorRotation;
	private final ModelRenderer a1;
	private final ModelRenderer bone127;
	private final ModelRenderer a2;
	private final ModelRenderer a3;
	private final ModelRenderer Scissors;
	private final ModelRenderer LeftSide;
	private final ModelRenderer RightSide;
	private final ModelRenderer MonitorBox;
	private final ModelRenderer MonitorRing;
	private final ModelRenderer a4;
	private final ModelRenderer a5;
	private final ModelRenderer a6;
	private final ModelRenderer a7;
	private final ModelRenderer a8;
	private final ModelRenderer a9;
	private final ModelRenderer a10;
	private final ModelRenderer a11;
	private final ModelRenderer a12;
	private final ModelRenderer a13;
	private final ModelRenderer a14;
	private final ModelRenderer ControlSet6;
	private final ModelRenderer Idk;
	private final ModelRenderer bone123;
	private final ModelRenderer Spin4;
	private final ModelRenderer bone125;
	private final ModelRenderer WibblyLever;
	private final ModelRenderer Main7;
	private final ModelRenderer DoorControlLever;
	private final ModelRenderer threeswitches;
	private final ModelRenderer Switch1;
	private final ModelRenderer Base5;
	private final ModelRenderer Part6;
	private final ModelRenderer Switch3;
	private final ModelRenderer bone124;
	private final ModelRenderer Base6;
	private final ModelRenderer Part7;
	private final ModelRenderer Switch4;
	private final ModelRenderer Base7;
	private final ModelRenderer Part8;
	private final ModelRenderer WeirdLeverThing;
	private final ModelRenderer Base8;
	private final ModelRenderer Lever2;
	private final ModelRenderer bone126;
	private final ModelRenderer Pump4;
	private final ModelRenderer MainRot3;
	private final ModelRenderer Base9;
	private final ModelRenderer ControlSet5;
	private final ModelRenderer RedSet2;
	private final ModelRenderer LeversRot4;
	private final ModelRenderer Lev3;
	private final ModelRenderer Lev4;
	private final ModelRenderer GravityAccelerator;
	private final ModelRenderer bone119;
	private final ModelRenderer bone120;
	private final ModelRenderer Spin3;
	private final ModelRenderer bone122;
	private final ModelRenderer RotaryHandle;
	private final ModelRenderer Handle2;
	private final ModelRenderer Pump;
	private final ModelRenderer MainRot2;
	private final ModelRenderer Base4;
	private final ModelRenderer bone121;
	private final ModelRenderer ZigZagPlotter;
	private final ModelRenderer Moveable;
	private final ModelRenderer ControlSet4;
	private final ModelRenderer Phone;
	private final ModelRenderer Typewriter;
	private final ModelRenderer rot;
	private final ModelRenderer Dials4;
	private final ModelRenderer Base3;
	private final ModelRenderer ControlSet3;
	private final ModelRenderer RedSet1;
	private final ModelRenderer LeversRot2;
	private final ModelRenderer Lev1;
	private final ModelRenderer Lev2;
	private final ModelRenderer RANDOMPARTS;
	private final ModelRenderer LeversRot3;
	private final ModelRenderer bone102;
	private final ModelRenderer LightBars;
	private final ModelRenderer MiniLever;
	private final ModelRenderer Part;
	private final ModelRenderer Taps;
	private final ModelRenderer Tap1;
	private final ModelRenderer bone103;
	private final ModelRenderer bone104;
	private final ModelRenderer bone105;
	private final ModelRenderer bone106;
	private final ModelRenderer Tap2;
	private final ModelRenderer bone107;
	private final ModelRenderer bone108;
	private final ModelRenderer bone109;
	private final ModelRenderer bone110;
	private final ModelRenderer Tap3;
	private final ModelRenderer bone111;
	private final ModelRenderer bone112;
	private final ModelRenderer bone113;
	private final ModelRenderer bone114;
	private final ModelRenderer ControlSet2;
	private final ModelRenderer WeridLever;
	private final ModelRenderer LeversRot;
	private final ModelRenderer Levers;
	private final ModelRenderer Dials;
	private final ModelRenderer Dial1;
	private final ModelRenderer Dials2;
	private final ModelRenderer Dial2;
	private final ModelRenderer KeyBoard;
	private final ModelRenderer bone92;
	private final ModelRenderer AtomAccelerator;
	private final ModelRenderer bone89;
	private final ModelRenderer bone90;
	private final ModelRenderer Spin;
	private final ModelRenderer bone91;
	private final ModelRenderer Gyroscope;
	private final ModelRenderer Frame;
	private final ModelRenderer bone93;
	private final ModelRenderer bone94;
	private final ModelRenderer Spin2;
	private final ModelRenderer bone98;
	private final ModelRenderer bone99;
	private final ModelRenderer bone100;
	private final ModelRenderer bone95;
	private final ModelRenderer bone96;
	private final ModelRenderer bone97;
	private final ModelRenderer ControlSet1;
	private final ModelRenderer HelmicRegulator;
	private final ModelRenderer baserotation;
	private final ModelRenderer part1;
	private final ModelRenderer part2;
	private final ModelRenderer part3;
	private final ModelRenderer part4;
	private final ModelRenderer part5;
	private final ModelRenderer Throttle;
	private final ModelRenderer MainRot;
	private final ModelRenderer Base;
	private final ModelRenderer Handle;
	private final ModelRenderer PhaseSwitch;
	private final ModelRenderer Base2;
	private final ModelRenderer Switch;
	private final ModelRenderer RotaryHandles;
	private final ModelRenderer Rotor1;
	private final ModelRenderer H1;
	private final ModelRenderer Rotor2;
	private final ModelRenderer H2;
	private final ModelRenderer bone87;
	private final ModelRenderer Handbrake;
	private final ModelRenderer Rot2;
	private final ModelRenderer ControlsBetweenPanels;
	private final ModelRenderer Pumps;
	private final ModelRenderer p1;
	private final ModelRenderer bone116;
	private final ModelRenderer bone117;
	private final ModelRenderer p2and3;
	private final ModelRenderer PUMP3;
	private final ModelRenderer PUMP2;
	private final ModelRenderer bone118;
	private final ModelRenderer SpinnyThings;
	private final ModelRenderer Sp1;
	private final ModelRenderer bone85;
	private final ModelRenderer Sp3;
	private final ModelRenderer bone88;
	private final ModelRenderer Sp2;
	private final ModelRenderer bone86;
	private final ModelRenderer Sp4;
	private final ModelRenderer bone115;
	private final ModelRenderer TimeRotor;
	private final ModelRenderer TimeRotorInner;
	private final ModelRenderer Moving;
	private final ModelRenderer Stationary;
	private final ModelRenderer TimeRotorShell;
	private final ModelRenderer TimeRotorlOWER;
	private final ModelRenderer b2;
	private final ModelRenderer b3;
	private final ModelRenderer b4;
	private final ModelRenderer b5;
	private final ModelRenderer b6;
	private final ModelRenderer TrRing1;
	private final ModelRenderer b7;
	private final ModelRenderer b8;
	private final ModelRenderer b9;
	private final ModelRenderer b10;
	private final ModelRenderer b11;
	private final ModelRenderer b12;
	private final ModelRenderer b13;
	private final ModelRenderer b14;
	private final ModelRenderer b15;
	private final ModelRenderer b16;
	private final ModelRenderer b17;
	private final ModelRenderer b18;
	private final ModelRenderer TrRing6;
	private final ModelRenderer b19;
	private final ModelRenderer b20;
	private final ModelRenderer b21;
	private final ModelRenderer b22;
	private final ModelRenderer b23;
	private final ModelRenderer b24;
	private final ModelRenderer b25;
	private final ModelRenderer b26;
	private final ModelRenderer b27;
	private final ModelRenderer b28;
	private final ModelRenderer b29;
	private final ModelRenderer b30;
	private final ModelRenderer TrRing7;
	private final ModelRenderer b31;
	private final ModelRenderer b42;
	private final ModelRenderer b32;
	private final ModelRenderer b33;
	private final ModelRenderer b34;
	private final ModelRenderer b35;
	private final ModelRenderer b36;
	private final ModelRenderer b37;
	private final ModelRenderer b38;
	private final ModelRenderer b39;
	private final ModelRenderer b40;
	private final ModelRenderer b41;
	private final ModelRenderer TrRing8;
	private final ModelRenderer b43;
	private final ModelRenderer b44;
	private final ModelRenderer b45;
	private final ModelRenderer b46;
	private final ModelRenderer b47;
	private final ModelRenderer b48;
	private final ModelRenderer b49;
	private final ModelRenderer b50;
	private final ModelRenderer b51;
	private final ModelRenderer b52;
	private final ModelRenderer b53;
	private final ModelRenderer b54;
	private final ModelRenderer tRRing2;
	private final ModelRenderer b55;
	private final ModelRenderer b56;
	private final ModelRenderer b57;
	private final ModelRenderer b58;
	private final ModelRenderer b59;
	private final ModelRenderer b60;
	private final ModelRenderer b61;
	private final ModelRenderer b62;
	private final ModelRenderer b63;
	private final ModelRenderer b64;
	private final ModelRenderer b65;
	private final ModelRenderer b66;
	private final ModelRenderer TrRing3;
	private final ModelRenderer b67;
	private final ModelRenderer b68;
	private final ModelRenderer b69;
	private final ModelRenderer b70;
	private final ModelRenderer b71;
	private final ModelRenderer b72;
	private final ModelRenderer b73;
	private final ModelRenderer b74;
	private final ModelRenderer b75;
	private final ModelRenderer b76;
	private final ModelRenderer b77;
	private final ModelRenderer b78;
	private final ModelRenderer TrRing4;
	private final ModelRenderer b79;
	private final ModelRenderer b80;
	private final ModelRenderer b81;
	private final ModelRenderer b82;
	private final ModelRenderer b83;
	private final ModelRenderer b84;
	private final ModelRenderer b85;
	private final ModelRenderer b86;
	private final ModelRenderer b87;
	private final ModelRenderer b88;
	private final ModelRenderer b89;
	private final ModelRenderer b90;
	private final ModelRenderer TrRing5;
	private final ModelRenderer b91;
	private final ModelRenderer b92;
	private final ModelRenderer b93;
	private final ModelRenderer b94;
	private final ModelRenderer b95;
	private final ModelRenderer b96;
	private final ModelRenderer b97;
	private final ModelRenderer b98;
	private final ModelRenderer b99;
	private final ModelRenderer b100;
	private final ModelRenderer b101;
	private final ModelRenderer b102;
	private final ModelRenderer Console;
	private final ModelRenderer PanelLayout;
	private final ModelRenderer Panel1;
	private final ModelRenderer Side1;
	private final ModelRenderer bone5;
	private final ModelRenderer bone3;
	private final ModelRenderer bone6;
	private final ModelRenderer bone;
	private final ModelRenderer Side2;
	private final ModelRenderer bone2;
	private final ModelRenderer bone4;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer Main;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer Panel2;
	private final ModelRenderer Side3;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer Side4;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer Main2;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer bone25;
	private final ModelRenderer bone26;
	private final ModelRenderer bone27;
	private final ModelRenderer bone28;
	private final ModelRenderer Panel3;
	private final ModelRenderer Side5;
	private final ModelRenderer bone29;
	private final ModelRenderer bone30;
	private final ModelRenderer bone31;
	private final ModelRenderer bone32;
	private final ModelRenderer Side6;
	private final ModelRenderer bone33;
	private final ModelRenderer bone34;
	private final ModelRenderer bone35;
	private final ModelRenderer bone36;
	private final ModelRenderer Main3;
	private final ModelRenderer bone37;
	private final ModelRenderer bone38;
	private final ModelRenderer bone101;
	private final ModelRenderer bone39;
	private final ModelRenderer bone40;
	private final ModelRenderer bone41;
	private final ModelRenderer bone42;
	private final ModelRenderer Panel4;
	private final ModelRenderer Side7;
	private final ModelRenderer bone43;
	private final ModelRenderer bone44;
	private final ModelRenderer bone45;
	private final ModelRenderer bone46;
	private final ModelRenderer Side8;
	private final ModelRenderer bone47;
	private final ModelRenderer bone48;
	private final ModelRenderer bone49;
	private final ModelRenderer bone50;
	private final ModelRenderer Main4;
	private final ModelRenderer bone51;
	private final ModelRenderer bone52;
	private final ModelRenderer bone53;
	private final ModelRenderer bone54;
	private final ModelRenderer bone55;
	private final ModelRenderer bone56;
	private final ModelRenderer Panel5;
	private final ModelRenderer Side9;
	private final ModelRenderer bone57;
	private final ModelRenderer bone58;
	private final ModelRenderer bone59;
	private final ModelRenderer bone60;
	private final ModelRenderer Side10;
	private final ModelRenderer bone61;
	private final ModelRenderer bone62;
	private final ModelRenderer bone63;
	private final ModelRenderer bone64;
	private final ModelRenderer Main5;
	private final ModelRenderer bone65;
	private final ModelRenderer bone66;
	private final ModelRenderer bone67;
	private final ModelRenderer bone68;
	private final ModelRenderer bone69;
	private final ModelRenderer bone70;
	private final ModelRenderer Panel6;
	private final ModelRenderer Side11;
	private final ModelRenderer bone71;
	private final ModelRenderer bone72;
	private final ModelRenderer bone73;
	private final ModelRenderer bone74;
	private final ModelRenderer Side12;
	private final ModelRenderer bone75;
	private final ModelRenderer bone76;
	private final ModelRenderer bone77;
	private final ModelRenderer bone78;
	private final ModelRenderer Main6;
	private final ModelRenderer bone79;
	private final ModelRenderer bone80;
	private final ModelRenderer bone81;
	private final ModelRenderer bone82;
	private final ModelRenderer bone83;
	private final ModelRenderer bone84;

	public SmithConsole() {
		textureWidth = 128;
		textureHeight = 128;

		EntireModel = new ModelRenderer(this);
		EntireModel.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(EntireModel, 0.0F, -0.5236F, 0.0F);


		MonitorRotation = new ModelRenderer(this);
		MonitorRotation.setRotationPoint(0.0F, 0.0F, 0.0F);
		EntireModel.addChild(MonitorRotation);
		setRotationAngle(MonitorRotation, 0.0F, -1.2217F, 0.0F);


		a1 = new ModelRenderer(this);
		a1.setRotationPoint(0.0F, -56.58F, 0.0F);
		MonitorRotation.addChild(a1);
		a1.setTextureOffset(10, 0).addBox(-12.25F, 14.2225F, -3.5F, 1.0F, 2.0F, 7.0F, -0.3125F, false);
		a1.setTextureOffset(10, 0).addBox(-12.2505F, 22.9439F, -3.5163F, 1.0F, 1.0F, 7.0F, -0.3125F, false);
		a1.setTextureOffset(10, 0).addBox(-12.2505F, 23.3189F, -6.0163F, 1.0F, 1.0F, 12.0F, -0.3125F, false);
		a1.setTextureOffset(10, 0).addBox(-12.2505F, 32.0689F, -6.0163F, 1.0F, 1.0F, 12.0F, -0.3125F, false);
		a1.setTextureOffset(10, 0).addBox(-12.2505F, 28.0689F, 3.6087F, 1.0F, 1.0F, 2.0F, -0.3125F, false);
		a1.setTextureOffset(10, 0).addBox(-12.2505F, 28.0689F, -5.6413F, 1.0F, 1.0F, 2.0F, -0.3125F, false);
		a1.setTextureOffset(10, 0).addBox(-12.2505F, 23.6939F, 4.9837F, 1.0F, 9.0F, 1.0F, -0.3125F, false);
		a1.setTextureOffset(10, 0).addBox(-12.2505F, 23.6939F, -6.0163F, 1.0F, 9.0F, 1.0F, -0.3125F, false);

		bone127 = new ModelRenderer(this);
		bone127.setRotationPoint(-2.655F, 33.4875F, -1.38F);
		a1.addChild(bone127);
		bone127.setTextureOffset(10, 20).addBox(-9.5955F, -1.4186F, -3.6363F, 1.0F, 1.0F, 10.0F, -0.25F, false);

		a2 = new ModelRenderer(this);
		a2.setRotationPoint(0.0F, -56.58F, 0.0F);
		MonitorRotation.addChild(a2);
		setRotationAngle(a2, 0.0F, -0.5236F, 0.0F);
		a2.setTextureOffset(10, 0).addBox(-12.25F, 14.2225F, -3.5F, 1.0F, 2.0F, 7.0F, -0.3125F, false);
		a2.setTextureOffset(10, 0).addBox(-11.9375F, 14.2225F, -3.5F, 7.0F, 2.0F, 1.0F, -0.312F, false);

		a3 = new ModelRenderer(this);
		a3.setRotationPoint(0.0F, -56.58F, 0.0F);
		MonitorRotation.addChild(a3);
		setRotationAngle(a3, 0.0F, 0.5236F, 0.0F);
		a3.setTextureOffset(10, 0).addBox(-12.25F, 14.2225F, -3.5F, 1.0F, 2.0F, 7.0F, -0.3125F, false);
		a3.setTextureOffset(10, 0).addBox(-11.9375F, 14.2225F, 2.5F, 7.0F, 2.0F, 1.0F, -0.312F, false);

		Scissors = new ModelRenderer(this);
		Scissors.setRotationPoint(0.0F, 0.375F, 0.0F);
		MonitorRotation.addChild(Scissors);


		LeftSide = new ModelRenderer(this);
		LeftSide.setRotationPoint(-11.75F, -40.8575F, 3.0F);
		Scissors.addChild(LeftSide);
		setRotationAngle(LeftSide, 0.1745F, 0.0F, 0.0F);
		LeftSide.setTextureOffset(10, 11).addBox(-0.5F, -0.7937F, -7.3931F, 1.0F, 1.0F, 8.0F, -0.3125F, false);
		LeftSide.setTextureOffset(10, 11).addBox(-0.501F, 1.7509F, -7.7075F, 1.0F, 1.0F, 8.0F, -0.3125F, false);
		LeftSide.setTextureOffset(10, 11).addBox(-0.501F, 4.2737F, -8.1513F, 1.0F, 1.0F, 8.0F, -0.3125F, false);
		LeftSide.setTextureOffset(10, 11).addBox(-0.5005F, 0.6149F, -6.7775F, 1.0F, 1.0F, 8.0F, -0.3125F, false);
		LeftSide.setTextureOffset(10, 11).addBox(-0.5005F, 3.1376F, -7.2214F, 1.0F, 1.0F, 8.0F, -0.3125F, false);
		LeftSide.setTextureOffset(10, 11).addBox(-0.5005F, 5.6604F, -7.6652F, 1.0F, 1.0F, 8.0F, -0.31F, false);

		RightSide = new ModelRenderer(this);
		RightSide.setRotationPoint(-11.75F, -40.8575F, -3.0F);
		Scissors.addChild(RightSide);
		setRotationAngle(RightSide, -0.1745F, 0.0F, 0.0F);
		RightSide.setTextureOffset(10, 11).addBox(-0.5F, -0.7937F, -0.6069F, 1.0F, 1.0F, 8.0F, -0.312F, false);
		RightSide.setTextureOffset(10, 11).addBox(-0.5F, 1.7287F, -0.1611F, 1.0F, 1.0F, 8.0F, -0.312F, false);
		RightSide.setTextureOffset(10, 11).addBox(-0.501F, 4.2274F, 0.4138F, 1.0F, 1.0F, 8.0F, -0.312F, false);
		RightSide.setTextureOffset(10, 11).addBox(-0.5005F, 0.5919F, -1.0922F, 1.0F, 1.0F, 8.0F, -0.312F, false);
		RightSide.setTextureOffset(10, 11).addBox(-0.5005F, 3.1143F, -0.6464F, 1.0F, 1.0F, 8.0F, -0.312F, false);
		RightSide.setTextureOffset(10, 11).addBox(-0.5005F, 5.6367F, -0.2007F, 1.0F, 1.0F, 8.0F, -0.31F, false);

		MonitorBox = new ModelRenderer(this);
		MonitorBox.setRotationPoint(0.0F, 0.625F, 0.0F);
		MonitorRotation.addChild(MonitorBox);
		MonitorBox.setTextureOffset(50, 9).addBox(-12.8755F, -30.7611F, -3.5163F, 2.0F, 4.0F, 7.0F, 0.0F, false);
		MonitorBox.setTextureOffset(10, 5).addBox(-11.7505F, -31.7611F, -4.5163F, 1.0F, 6.0F, 9.0F, 0.0F, false);
		MonitorBox.setTextureOffset(10, 32).addBox(-13.3755F, -32.3861F, -5.0163F, 3.0F, 2.0F, 10.0F, -0.3125F, false);
		MonitorBox.setTextureOffset(10, 32).addBox(-13.3755F, -27.0111F, -5.0163F, 3.0F, 2.0F, 10.0F, -0.3125F, false);
		MonitorBox.setTextureOffset(10, 32).addBox(-13.3755F, -31.1986F, 2.9837F, 3.0F, 5.0F, 2.0F, -0.3128F, false);
		MonitorBox.setTextureOffset(10, 32).addBox(-13.3755F, -31.1986F, -5.0163F, 3.0F, 5.0F, 2.0F, -0.3128F, false);

		MonitorRing = new ModelRenderer(this);
		MonitorRing.setRotationPoint(0.0F, -41.25F, 0.0F);
		EntireModel.addChild(MonitorRing);


		a4 = new ModelRenderer(this);
		a4.setRotationPoint(0.0F, -15.33F, 0.0F);
		MonitorRing.addChild(a4);
		setRotationAngle(a4, 0.0F, 2.618F, 0.0F);
		a4.setTextureOffset(10, 0).addBox(-6.5625F, 14.2225F, -2.0F, 1.0F, 2.0F, 4.0F, -0.3125F, false);

		a5 = new ModelRenderer(this);
		a5.setRotationPoint(0.0F, -15.33F, 0.0F);
		MonitorRing.addChild(a5);
		setRotationAngle(a5, 0.0F, 2.0944F, 0.0F);
		a5.setTextureOffset(10, 0).addBox(-6.5625F, 14.2225F, -2.0F, 1.0F, 2.0F, 4.0F, -0.3125F, false);

		a6 = new ModelRenderer(this);
		a6.setRotationPoint(0.0F, -15.33F, 0.0F);
		MonitorRing.addChild(a6);
		setRotationAngle(a6, 0.0F, 1.5708F, 0.0F);
		a6.setTextureOffset(10, 0).addBox(-6.5625F, 14.2225F, -2.0F, 1.0F, 2.0F, 4.0F, -0.3125F, false);

		a7 = new ModelRenderer(this);
		a7.setRotationPoint(0.0F, -15.33F, 0.0F);
		MonitorRing.addChild(a7);
		setRotationAngle(a7, 0.0F, 1.0472F, 0.0F);
		a7.setTextureOffset(10, 0).addBox(-6.5625F, 14.2225F, -2.0F, 1.0F, 2.0F, 4.0F, -0.3125F, false);

		a8 = new ModelRenderer(this);
		a8.setRotationPoint(0.0F, -15.33F, 0.0F);
		MonitorRing.addChild(a8);
		setRotationAngle(a8, 0.0F, 0.5236F, 0.0F);
		a8.setTextureOffset(10, 0).addBox(-6.5625F, 14.2225F, -2.0F, 1.0F, 2.0F, 4.0F, -0.3125F, false);

		a9 = new ModelRenderer(this);
		a9.setRotationPoint(0.0F, -15.33F, 0.0F);
		MonitorRing.addChild(a9);
		a9.setTextureOffset(10, 0).addBox(-6.5625F, 14.2225F, -2.0F, 1.0F, 2.0F, 4.0F, -0.3125F, false);

		a10 = new ModelRenderer(this);
		a10.setRotationPoint(0.0F, -15.33F, 0.0F);
		MonitorRing.addChild(a10);
		setRotationAngle(a10, 0.0F, -0.5236F, 0.0F);
		a10.setTextureOffset(10, 0).addBox(-6.5625F, 14.2225F, -2.0F, 1.0F, 2.0F, 4.0F, -0.3125F, false);

		a11 = new ModelRenderer(this);
		a11.setRotationPoint(0.0F, -15.33F, 0.0F);
		MonitorRing.addChild(a11);
		setRotationAngle(a11, 0.0F, -1.0472F, 0.0F);
		a11.setTextureOffset(10, 0).addBox(-6.5625F, 14.2225F, -2.0F, 1.0F, 2.0F, 4.0F, -0.3125F, false);

		a12 = new ModelRenderer(this);
		a12.setRotationPoint(0.0F, -15.33F, 0.0F);
		MonitorRing.addChild(a12);
		setRotationAngle(a12, 0.0F, -1.5708F, 0.0F);
		a12.setTextureOffset(10, 0).addBox(-6.5625F, 14.2225F, -2.0F, 1.0F, 2.0F, 4.0F, -0.3125F, false);
		a12.setTextureOffset(10, 0).addBox(-6.5625F, 14.2225F, -1.0F, 3.0F, 2.0F, 2.0F, -0.5625F, false);
		a12.setTextureOffset(10, 0).addBox(3.5625F, 14.2225F, -1.0F, 3.0F, 2.0F, 2.0F, -0.5625F, true);

		a13 = new ModelRenderer(this);
		a13.setRotationPoint(0.0F, -15.33F, 0.0F);
		MonitorRing.addChild(a13);
		setRotationAngle(a13, 0.0F, -2.0944F, 0.0F);
		a13.setTextureOffset(10, 0).addBox(-6.5625F, 14.2225F, -2.0F, 1.0F, 2.0F, 4.0F, -0.3125F, false);

		a14 = new ModelRenderer(this);
		a14.setRotationPoint(0.0F, -15.33F, 0.0F);
		MonitorRing.addChild(a14);
		setRotationAngle(a14, 0.0F, -2.618F, 0.0F);
		a14.setTextureOffset(10, 0).addBox(-6.5625F, 14.2225F, -2.0F, 1.0F, 2.0F, 4.0F, -0.3125F, false);

		ControlSet6 = new ModelRenderer(this);
		ControlSet6.setRotationPoint(0.0F, 0.0F, 0.0F);
		EntireModel.addChild(ControlSet6);


		Idk = new ModelRenderer(this);
		Idk.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet6.addChild(Idk);
		setRotationAngle(Idk, 0.0F, 1.0472F, 0.0F);


		bone123 = new ModelRenderer(this);
		bone123.setRotationPoint(-0.5F, -14.0F, -11.0F);
		Idk.addChild(bone123);
		setRotationAngle(bone123, 0.6109F, 0.0F, 0.0F);
		bone123.setTextureOffset(41, 84).addBox(-0.5F, -0.8125F, 1.625F, 2.0F, 1.0F, 2.0F, -0.1875F, false);

		Spin4 = new ModelRenderer(this);
		Spin4.setRotationPoint(0.5F, -1.625F, 0.625F);
		bone123.addChild(Spin4);
		setRotationAngle(Spin4, -3.1416F, 0.0F, 3.1416F);
		Spin4.setTextureOffset(69, 46).addBox(-0.5F, -0.5625F, -2.0F, 1.0F, 3.0F, 1.0F, -0.365F, false);
		Spin4.setTextureOffset(69, 46).addBox(-0.5F, -0.5625F, -3.0F, 1.0F, 3.0F, 1.0F, -0.365F, false);

		bone125 = new ModelRenderer(this);
		bone125.setRotationPoint(0.0F, -0.5F, 0.0F);
		Spin4.addChild(bone125);
		setRotationAngle(bone125, 0.0F, 0.0F, 1.5708F);
		bone125.setTextureOffset(43, 16).addBox(0.1875F, -0.5F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		WibblyLever = new ModelRenderer(this);
		WibblyLever.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet6.addChild(WibblyLever);
		setRotationAngle(WibblyLever, 0.0F, 1.0472F, 0.0F);


		Main7 = new ModelRenderer(this);
		Main7.setRotationPoint(-3.25F, -16.1875F, -8.5625F);
		WibblyLever.addChild(Main7);
		Main7.setTextureOffset(20, 23).addBox(-1.1231F, -0.9926F, -0.6671F, 2.0F, 2.0F, 2.0F, -0.5625F, false);

		DoorControlLever = new ModelRenderer(this);
		DoorControlLever.setRotationPoint(-3.3731F, -16.6801F, -8.685F);
		WibblyLever.addChild(DoorControlLever);
		setRotationAngle(DoorControlLever, 0.5672F, 0.0F, 0.0F);
		DoorControlLever.setTextureOffset(63, 40).addBox(-1.5F, -1.0F, -0.9821F, 3.0F, 2.0F, 2.0F, -0.86F, false);
		DoorControlLever.setTextureOffset(39, 87).addBox(-0.125F, -0.5F, -2.7321F, 1.0F, 1.0F, 3.0F, -0.375F, false);
		DoorControlLever.setTextureOffset(39, 87).addBox(-0.375F, -0.5F, -2.7321F, 1.0F, 1.0F, 3.0F, -0.375F, false);
		DoorControlLever.setTextureOffset(46, 36).addBox(-0.375F, -0.5F, -5.2321F, 1.0F, 1.0F, 4.0F, -0.376F, false);
		DoorControlLever.setTextureOffset(39, 87).addBox(-0.625F, -0.5F, -2.7321F, 1.0F, 1.0F, 3.0F, -0.375F, false);
		DoorControlLever.setTextureOffset(46, 36).addBox(-0.625F, -0.5F, -5.2321F, 1.0F, 1.0F, 4.0F, -0.376F, false);
		DoorControlLever.setTextureOffset(39, 87).addBox(-0.875F, -0.5F, -2.7321F, 1.0F, 1.0F, 3.0F, -0.375F, false);

		threeswitches = new ModelRenderer(this);
		threeswitches.setRotationPoint(0.0F, 0.4375F, 0.0F);
		ControlSet6.addChild(threeswitches);
		setRotationAngle(threeswitches, 0.0F, 1.0472F, 0.0F);


		Switch1 = new ModelRenderer(this);
		Switch1.setRotationPoint(1.125F, -13.125F, -13.0F);
		threeswitches.addChild(Switch1);
		setRotationAngle(Switch1, 0.4363F, 0.0F, 0.0F);


		Base5 = new ModelRenderer(this);
		Base5.setRotationPoint(1.0F, 0.0F, 0.0F);
		Switch1.addChild(Base5);
		Base5.setTextureOffset(47, 32).addBox(-1.0F, -1.375F, 0.5F, 2.0F, 1.0F, 1.0F, -0.375F, false);

		Part6 = new ModelRenderer(this);
		Part6.setRotationPoint(1.375F, 0.0F, 0.0F);
		Switch1.addChild(Part6);
		Part6.setTextureOffset(71, 29).addBox(-0.875F, -2.125F, 0.5F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		Part6.setTextureOffset(47, 32).addBox(-0.875F, -2.125F, 0.5F, 1.0F, 2.0F, 1.0F, -0.4375F, false);

		Switch3 = new ModelRenderer(this);
		Switch3.setRotationPoint(1.125F, -13.125F, -13.0F);
		threeswitches.addChild(Switch3);
		setRotationAngle(Switch3, 0.4363F, 0.0F, 0.0F);


		bone124 = new ModelRenderer(this);
		bone124.setRotationPoint(-0.125F, -0.8725F, 1.0F);
		Switch3.addChild(bone124);


		Base6 = new ModelRenderer(this);
		Base6.setRotationPoint(0.0F, -0.005F, 0.0F);
		bone124.addChild(Base6);
		setRotationAngle(Base6, 0.0F, -0.7854F, 0.0F);
		Base6.setTextureOffset(47, 32).addBox(0.125F, -0.4975F, -0.5F, 2.0F, 1.0F, 1.0F, -0.375F, false);

		Part7 = new ModelRenderer(this);
		Part7.setRotationPoint(1.125F, 0.0025F, 0.0F);
		Base6.addChild(Part7);
		Part7.setTextureOffset(71, 29).addBox(-0.5F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		Part7.setTextureOffset(47, 32).addBox(-0.5F, -1.25F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4375F, false);

		Switch4 = new ModelRenderer(this);
		Switch4.setRotationPoint(0.75F, -13.125F, -13.0F);
		threeswitches.addChild(Switch4);
		setRotationAngle(Switch4, 0.4363F, 0.0F, 0.0F);


		Base7 = new ModelRenderer(this);
		Base7.setRotationPoint(1.0F, 0.0F, 0.0F);
		Switch4.addChild(Base7);
		Base7.setTextureOffset(47, 32).addBox(-1.25F, -1.375F, 1.125F, 1.0F, 1.0F, 2.0F, -0.375F, false);

		Part8 = new ModelRenderer(this);
		Part8.setRotationPoint(0.25F, -0.875F, 2.0625F);
		Switch4.addChild(Part8);
		Part8.setTextureOffset(71, 29).addBox(-0.5F, -1.25F, -0.5F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		Part8.setTextureOffset(47, 32).addBox(-0.5F, -1.25F, -0.5F, 1.0F, 2.0F, 1.0F, -0.4375F, false);

		WeirdLeverThing = new ModelRenderer(this);
		WeirdLeverThing.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet6.addChild(WeirdLeverThing);
		setRotationAngle(WeirdLeverThing, 0.0F, -2.0944F, 0.0F);


		Base8 = new ModelRenderer(this);
		Base8.setRotationPoint(0.0F, 0.0F, 0.0F);
		WeirdLeverThing.addChild(Base8);
		Base8.setTextureOffset(80, 55).addBox(5.0F, -13.0F, 13.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Base8.setTextureOffset(74, 75).addBox(-4.875F, -12.375F, 13.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Base8.setTextureOffset(80, 55).addBox(2.0F, -13.0F, 13.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Base8.setTextureOffset(80, 55).addBox(2.0F, -13.0F, 14.0F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		Base8.setTextureOffset(80, 55).addBox(2.125F, -13.0F, 13.5F, 3.0F, 1.0F, 1.0F, -0.0625F, false);
		Base8.setTextureOffset(80, 55).addBox(5.0F, -12.6875F, 13.5F, 1.0F, 4.0F, 1.0F, -0.0625F, false);

		Lever2 = new ModelRenderer(this);
		Lever2.setRotationPoint(2.5F, -12.5625F, 15.0F);
		Base8.addChild(Lever2);
		setRotationAngle(Lever2, 0.0F, 0.0F, -0.2618F);
		Lever2.setTextureOffset(80, 55).addBox(-0.5F, -0.4375F, -0.5F, 1.0F, 5.0F, 1.0F, -0.1875F, false);
		Lever2.setTextureOffset(80, 55).addBox(-0.5F, 3.5625F, 0.0625F, 1.0F, 1.0F, 2.0F, -0.25F, false);

		bone126 = new ModelRenderer(this);
		bone126.setRotationPoint(4.0F, -11.0625F, 14.0F);
		Base8.addChild(bone126);
		setRotationAngle(bone126, 0.0F, 0.0F, -0.7854F);
		bone126.setTextureOffset(80, 55).addBox(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, -0.1875F, false);

		Pump4 = new ModelRenderer(this);
		Pump4.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet6.addChild(Pump4);
		setRotationAngle(Pump4, 0.0F, 0.5236F, 0.0F);


		MainRot3 = new ModelRenderer(this);
		MainRot3.setRotationPoint(-1.3125F, -14.0625F, -12.5F);
		Pump4.addChild(MainRot3);
		setRotationAngle(MainRot3, 0.4712F, 0.0F, 0.0F);


		Base9 = new ModelRenderer(this);
		Base9.setRotationPoint(-0.5F, 14.6138F, 12.4325F);
		MainRot3.addChild(Base9);
		Base9.setTextureOffset(65, 21).addBox(0.0F, -15.8125F, -9.0F, 1.0F, 1.0F, 3.0F, 0.0629F, false);
		Base9.setTextureOffset(17, 22).addBox(0.0F, -15.0329F, -14.8972F, 1.0F, 1.0F, 3.0F, 0.0629F, false);
		Base9.setTextureOffset(65, 21).addBox(0.0F, -15.8125F, -11.5F, 1.0F, 1.0F, 4.0F, -0.1246F, false);

		ControlSet5 = new ModelRenderer(this);
		ControlSet5.setRotationPoint(0.0F, 0.0F, 0.0F);
		EntireModel.addChild(ControlSet5);


		RedSet2 = new ModelRenderer(this);
		RedSet2.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet5.addChild(RedSet2);
		setRotationAngle(RedSet2, 0.0F, 2.618F, 0.0F);


		LeversRot4 = new ModelRenderer(this);
		LeversRot4.setRotationPoint(0.875F, -11.9284F, -8.3862F);
		RedSet2.addChild(LeversRot4);
		setRotationAngle(LeversRot4, 0.4712F, 0.0F, 0.0F);
		LeversRot4.setTextureOffset(63, 38).addBox(-0.0625F, -4.5267F, -3.1931F, 1.0F, 1.0F, 3.0F, 0.1875F, false);
		LeversRot4.setTextureOffset(82, 54).addBox(-0.0625F, -4.5892F, 0.8069F, 1.0F, 1.0F, 1.0F, 0.0625F, false);
		LeversRot4.setTextureOffset(63, 38).addBox(-0.0625F, -4.2767F, -3.1931F, 1.0F, 1.0F, 3.0F, 0.25F, false);
		LeversRot4.setTextureOffset(68, 32).addBox(-0.0625F, -4.0892F, 0.8069F, 1.0F, 1.0F, 1.0F, 0.25F, false);
		LeversRot4.setTextureOffset(69, 32).addBox(-0.4375F, -5.0892F, -2.3181F, 1.0F, 1.0F, 1.0F, -0.25F, false);

		Lev3 = new ModelRenderer(this);
		Lev3.setRotationPoint(0.0625F, -4.5892F, -1.8181F);
		LeversRot4.addChild(Lev3);
		setRotationAngle(Lev3, 0.9163F, 0.0F, 0.0F);
		Lev3.setTextureOffset(39, 87).addBox(-0.5F, -2.8125F, -0.5F, 1.0F, 3.0F, 1.0F, -0.3125F, false);
		Lev3.setTextureOffset(78, 71).addBox(-0.75F, -2.8125F, -0.5F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		Lev3.setTextureOffset(78, 71).addBox(-0.25F, -2.8125F, -0.5F, 1.0F, 1.0F, 1.0F, -0.25F, false);

		Lev4 = new ModelRenderer(this);
		Lev4.setRotationPoint(0.8125F, -4.5892F, -1.8181F);
		LeversRot4.addChild(Lev4);
		setRotationAngle(Lev4, 0.2182F, 0.0F, 0.0F);
		Lev4.setTextureOffset(39, 87).addBox(-0.5F, -1.6875F, -0.5F, 1.0F, 2.0F, 1.0F, -0.3125F, false);
		Lev4.setTextureOffset(39, 87).addBox(-0.3125F, -2.75F, -0.5F, 1.0F, 2.0F, 1.0F, -0.3125F, false);
		Lev4.setTextureOffset(44, 39).addBox(-0.3125F, -2.875F, -0.5F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		Lev4.setTextureOffset(44, 39).addBox(0.1875F, -2.875F, -0.5F, 1.0F, 1.0F, 1.0F, -0.25F, false);

		GravityAccelerator = new ModelRenderer(this);
		GravityAccelerator.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet5.addChild(GravityAccelerator);
		setRotationAngle(GravityAccelerator, 0.0F, 2.0944F, 0.0F);


		bone119 = new ModelRenderer(this);
		bone119.setRotationPoint(-0.5F, -14.0F, -11.0F);
		GravityAccelerator.addChild(bone119);
		setRotationAngle(bone119, 0.6109F, 0.0F, 0.0F);
		bone119.setTextureOffset(41, 84).addBox(-0.5F, -0.625F, -0.375F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		bone120 = new ModelRenderer(this);
		bone120.setRotationPoint(0.5F, 0.1702F, -1.7316F);
		bone119.addChild(bone120);
		setRotationAngle(bone120, -0.2182F, 0.0F, 0.0F);
		bone120.setTextureOffset(80, 54).addBox(-1.0F, -1.0F, -1.1875F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		Spin3 = new ModelRenderer(this);
		Spin3.setRotationPoint(0.5F, -1.625F, 0.625F);
		bone119.addChild(Spin3);
		setRotationAngle(Spin3, -3.1416F, 1.5272F, 3.1416F);
		Spin3.setTextureOffset(94, 57).addBox(-0.5F, -1.4375F, 0.0F, 1.0F, 3.0F, 1.0F, -0.365F, false);
		Spin3.setTextureOffset(94, 57).addBox(-0.5F, -1.4375F, -1.0F, 1.0F, 3.0F, 1.0F, -0.365F, false);
		Spin3.setTextureOffset(94, 57).addBox(-1.0F, 0.1875F, -1.0F, 2.0F, 1.0F, 2.0F, -0.1875F, false);

		bone122 = new ModelRenderer(this);
		bone122.setRotationPoint(0.4272F, -0.9506F, -0.0004F);
		Spin3.addChild(bone122);
		setRotationAngle(bone122, 0.0F, 0.0F, -2.138F);
		bone122.setTextureOffset(92, 57).addBox(-1.0F, -0.9375F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		RotaryHandle = new ModelRenderer(this);
		RotaryHandle.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet5.addChild(RotaryHandle);
		setRotationAngle(RotaryHandle, 0.0F, -1.0472F, 0.0F);
		RotaryHandle.setTextureOffset(65, 31).addBox(4.375F, -12.3125F, 13.625F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		RotaryHandle.setTextureOffset(44, 11).addBox(4.375F, -12.3125F, 13.3125F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Handle2 = new ModelRenderer(this);
		Handle2.setRotationPoint(4.875F, -11.8125F, 14.875F);
		RotaryHandle.addChild(Handle2);
		Handle2.setTextureOffset(65, 31).addBox(-0.5F, -0.5F, -0.6875F, 1.0F, 1.0F, 1.0F, -0.3125F, false);
		Handle2.setTextureOffset(65, 31).addBox(-0.5F, 0.8125F, -0.6875F, 1.0F, 1.0F, 1.0F, -0.3125F, false);
		Handle2.setTextureOffset(65, 31).addBox(-0.5F, -0.25F, -0.6875F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		Handle2.setTextureOffset(65, 31).addBox(-0.5F, 0.8125F, -0.375F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		Handle2.setTextureOffset(65, 31).addBox(-0.5F, 0.8125F, -0.0625F, 1.0F, 1.0F, 1.0F, -0.32F, false);

		Pump = new ModelRenderer(this);
		Pump.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet5.addChild(Pump);
		setRotationAngle(Pump, 0.0F, 1.5708F, 0.0F);


		MainRot2 = new ModelRenderer(this);
		MainRot2.setRotationPoint(-1.3125F, -14.0625F, -12.5F);
		Pump.addChild(MainRot2);
		setRotationAngle(MainRot2, 0.4712F, 0.0F, 0.0F);


		Base4 = new ModelRenderer(this);
		Base4.setRotationPoint(-0.5F, 13.5F, 13.0F);
		MainRot2.addChild(Base4);
		Base4.setTextureOffset(22, 24).addBox(0.0F, -15.8125F, -11.5F, 1.0F, 1.0F, 3.0F, 0.065F, false);
		Base4.setTextureOffset(45, 31).addBox(0.0F, -15.8125F, -9.5F, 1.0F, 1.0F, 4.0F, -0.1246F, false);

		bone121 = new ModelRenderer(this);
		bone121.setRotationPoint(0.5F, -15.3125F, -10.0F);
		Base4.addChild(bone121);
		setRotationAngle(bone121, 0.6545F, 0.0F, 0.0F);
		bone121.setTextureOffset(39, 87).addBox(-0.5F, -1.3351F, -3.9602F, 1.0F, 1.0F, 3.0F, 0.0629F, false);
		bone121.setTextureOffset(39, 87).addBox(-0.5F, 0.3351F, -2.1656F, 1.0F, 1.0F, 3.0F, 0.0629F, false);

		ZigZagPlotter = new ModelRenderer(this);
		ZigZagPlotter.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet5.addChild(ZigZagPlotter);
		setRotationAngle(ZigZagPlotter, 0.0F, -1.0472F, 0.0F);
		ZigZagPlotter.setTextureOffset(17, 25).addBox(-5.5F, -12.9375F, 13.1875F, 2.0F, 2.0F, 2.0F, -0.4375F, false);
		ZigZagPlotter.setTextureOffset(95, 73).addBox(-5.5F, -12.9375F, 13.9375F, 2.0F, 2.0F, 3.0F, -0.5625F, false);

		Moveable = new ModelRenderer(this);
		Moveable.setRotationPoint(-3.5F, -10.9375F, 14.375F);
		ZigZagPlotter.addChild(Moveable);
		Moveable.setTextureOffset(65, 43).addBox(-1.8125F, -2.875F, -0.375F, 2.0F, 3.0F, 2.0F, -0.875F, false);
		Moveable.setTextureOffset(65, 43).addBox(-1.8125F, -3.0625F, -0.375F, 2.0F, 2.0F, 2.0F, -0.8125F, false);

		ControlSet4 = new ModelRenderer(this);
		ControlSet4.setRotationPoint(0.0F, 0.0F, 0.0F);
		EntireModel.addChild(ControlSet4);


		Phone = new ModelRenderer(this);
		Phone.setRotationPoint(-1.0625F, -19.5F, 10.5F);
		ControlSet4.addChild(Phone);
		Phone.setTextureOffset(47, 33).addBox(0.0625F, -2.192F, -4.5915F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		Phone.setTextureOffset(39, 87).addBox(0.125F, -2.192F, -4.404F, 1.0F, 3.0F, 1.0F, -0.0625F, false);
		Phone.setTextureOffset(39, 87).addBox(0.375F, -2.192F, -4.404F, 1.0F, 3.0F, 1.0F, -0.0624F, false);
		Phone.setTextureOffset(65, 42).addBox(1.1875F, -2.192F, -4.279F, 1.0F, 3.0F, 1.0F, -0.1875F, false);

		Typewriter = new ModelRenderer(this);
		Typewriter.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet4.addChild(Typewriter);


		rot = new ModelRenderer(this);
		rot.setRotationPoint(-1.5F, -13.5F, 13.5F);
		Typewriter.addChild(rot);
		setRotationAngle(rot, -0.5236F, 0.0F, 0.0F);
		rot.setTextureOffset(90, 56).addBox(-2.5F, -0.5F, -3.5F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		rot.setTextureOffset(96, 64).addBox(-0.5F, -0.692F, -5.779F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		rot.setTextureOffset(96, 64).addBox(-0.5F, -0.692F, -5.779F, 4.0F, 2.0F, 2.0F, 0.0F, false);
		rot.setTextureOffset(94, 68).addBox(-2.5F, -0.7706F, -2.1563F, 4.0F, 1.0F, 4.0F, -0.25F, false);
		rot.setTextureOffset(94, 68).addBox(-2.5F, -0.7706F, -2.1563F, 4.0F, 1.0F, 4.0F, -0.25F, false);
		rot.setTextureOffset(90, 56).addBox(-2.5F, -1.4375F, -1.5F, 4.0F, 1.0F, 1.0F, -0.01F, false);
		rot.setTextureOffset(63, 44).addBox(-2.5F, -1.5F, -3.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		rot.setTextureOffset(63, 44).addBox(-2.5F, -1.5251F, -2.4063F, 4.0F, 1.0F, 1.0F, -0.125F, false);
		rot.setTextureOffset(63, 44).addBox(0.75F, -1.5876F, -3.4063F, 1.0F, 1.0F, 2.0F, -0.26F, false);
		rot.setTextureOffset(63, 44).addBox(-3.25F, -2.0876F, -3.9063F, 2.0F, 2.0F, 3.0F, -0.76F, false);

		Dials4 = new ModelRenderer(this);
		Dials4.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet4.addChild(Dials4);
		setRotationAngle(Dials4, 0.0F, -2.618F, 0.0F);


		Base3 = new ModelRenderer(this);
		Base3.setRotationPoint(1.3125F, -14.8125F, -12.75F);
		Dials4.addChild(Base3);
		setRotationAngle(Base3, 0.48F, 0.0F, 0.0F);
		Base3.setTextureOffset(39, 87).addBox(-0.5F, 0.2207F, -0.8752F, 1.0F, 1.0F, 1.0F, -0.0625F, false);
		Base3.setTextureOffset(39, 87).addBox(-0.5F, 0.2207F, 0.3748F, 1.0F, 1.0F, 1.0F, -0.0625F, false);

		ControlSet3 = new ModelRenderer(this);
		ControlSet3.setRotationPoint(0.0F, 0.0F, 0.0F);
		EntireModel.addChild(ControlSet3);


		RedSet1 = new ModelRenderer(this);
		RedSet1.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet3.addChild(RedSet1);
		setRotationAngle(RedSet1, 0.0F, -1.5708F, 0.0F);


		LeversRot2 = new ModelRenderer(this);
		LeversRot2.setRotationPoint(0.875F, -11.9284F, -8.3862F);
		RedSet1.addChild(LeversRot2);
		setRotationAngle(LeversRot2, 0.4712F, 0.0F, 0.0F);
		LeversRot2.setTextureOffset(62, 41).addBox(-0.0625F, -4.5267F, -3.1931F, 1.0F, 1.0F, 3.0F, 0.1875F, false);
		LeversRot2.setTextureOffset(48, 65).addBox(-0.0625F, -4.5892F, 0.8069F, 1.0F, 1.0F, 1.0F, 0.0625F, false);
		LeversRot2.setTextureOffset(62, 41).addBox(-0.0625F, -4.2767F, -3.1931F, 1.0F, 1.0F, 3.0F, 0.25F, false);
		LeversRot2.setTextureOffset(33, 45).addBox(-0.0625F, -4.0892F, 0.8069F, 1.0F, 1.0F, 1.0F, 0.25F, false);
		LeversRot2.setTextureOffset(62, 41).addBox(-0.4375F, -5.0892F, -2.3181F, 1.0F, 1.0F, 1.0F, -0.25F, false);

		Lev1 = new ModelRenderer(this);
		Lev1.setRotationPoint(0.0625F, -4.5892F, -1.8181F);
		LeversRot2.addChild(Lev1);
		setRotationAngle(Lev1, -0.6981F, 0.0F, 0.0F);
		Lev1.setTextureOffset(40, 9).addBox(-0.5F, -2.8125F, -0.5F, 1.0F, 3.0F, 1.0F, -0.3125F, false);
		Lev1.setTextureOffset(76, 71).addBox(-0.75F, -2.8125F, -0.5F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		Lev1.setTextureOffset(76, 71).addBox(-0.25F, -2.8125F, -0.5F, 1.0F, 1.0F, 1.0F, -0.25F, false);

		Lev2 = new ModelRenderer(this);
		Lev2.setRotationPoint(0.8125F, -4.5892F, -1.8181F);
		LeversRot2.addChild(Lev2);
		setRotationAngle(Lev2, 1.0036F, 0.0F, 0.0F);
		Lev2.setTextureOffset(43, 14).addBox(-0.5F, -1.6875F, -0.5F, 1.0F, 2.0F, 1.0F, -0.3125F, false);
		Lev2.setTextureOffset(43, 14).addBox(-0.3125F, -2.75F, -0.5F, 1.0F, 2.0F, 1.0F, -0.3125F, false);
		Lev2.setTextureOffset(49, 33).addBox(-0.3125F, -2.875F, -0.5F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		Lev2.setTextureOffset(49, 33).addBox(0.1875F, -2.875F, -0.5F, 1.0F, 1.0F, 1.0F, -0.25F, false);

		RANDOMPARTS = new ModelRenderer(this);
		RANDOMPARTS.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet3.addChild(RANDOMPARTS);
		setRotationAngle(RANDOMPARTS, 0.0F, -2.618F, 0.0F);


		LeversRot3 = new ModelRenderer(this);
		LeversRot3.setRotationPoint(-0.875F, -11.9284F, -8.3862F);
		RANDOMPARTS.addChild(LeversRot3);
		setRotationAngle(LeversRot3, 0.4712F, 0.0F, 0.0F);
		LeversRot3.setTextureOffset(24, 49).addBox(-0.9375F, -5.1517F, 0.8069F, 1.0F, 1.0F, 1.0F, 0.0625F, false);
		LeversRot3.setTextureOffset(39, 84).addBox(-0.9375F, -4.0892F, 0.8069F, 1.0F, 1.0F, 1.0F, 0.25F, false);
		LeversRot3.setTextureOffset(39, 84).addBox(-0.9375F, -4.0892F, -2.1306F, 1.0F, 1.0F, 2.0F, 0.25F, false);
		LeversRot3.setTextureOffset(39, 84).addBox(-0.9375F, -5.9017F, -0.6306F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		LeversRot3.setTextureOffset(39, 84).addBox(-1.4375F, -5.8392F, 0.3069F, 2.0F, 1.0F, 2.0F, -0.375F, false);

		bone102 = new ModelRenderer(this);
		bone102.setRotationPoint(-0.4375F, -6.4017F, -0.1306F);
		LeversRot3.addChild(bone102);
		setRotationAngle(bone102, 0.5236F, 0.0F, 0.0F);
		bone102.setTextureOffset(39, 84).addBox(-0.5F, -0.8047F, -0.9542F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		bone102.setTextureOffset(39, 84).addBox(-0.5F, -0.8047F, -0.9542F, 1.0F, 1.0F, 1.0F, -0.3125F, false);

		LightBars = new ModelRenderer(this);
		LightBars.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet3.addChild(LightBars);
		setRotationAngle(LightBars, 0.0F, -2.0944F, 0.0F);
		LightBars.setTextureOffset(46, 63).addBox(-2.6752F, -22.0625F, -8.1875F, 2.0F, 6.0F, 2.0F, -0.5F, false);
		LightBars.setTextureOffset(46, 63).addBox(0.8248F, -22.0625F, -8.1875F, 2.0F, 6.0F, 2.0F, -0.5F, false);

		MiniLever = new ModelRenderer(this);
		MiniLever.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet3.addChild(MiniLever);
		setRotationAngle(MiniLever, 0.0F, -2.0944F, 0.0F);
		MiniLever.setTextureOffset(40, 86).addBox(-0.5F, -20.25F, -7.0625F, 1.0F, 2.0F, 2.0F, -0.125F, false);
		MiniLever.setTextureOffset(62, 37).addBox(-0.5F, -20.25F, -7.1875F, 1.0F, 2.0F, 2.0F, -0.1875F, false);

		Part = new ModelRenderer(this);
		Part.setRotationPoint(-0.375F, -19.1875F, -6.875F);
		MiniLever.addChild(Part);
		setRotationAngle(Part, -0.9163F, 0.0F, 0.0F);
		Part.setTextureOffset(50, 38).addBox(-0.5F, -0.5F, -1.5625F, 1.0F, 1.0F, 2.0F, -0.4F, false);
		Part.setTextureOffset(50, 38).addBox(-0.5F, -0.5F, -1.6875F, 1.0F, 1.0F, 1.0F, -0.37F, false);

		Taps = new ModelRenderer(this);
		Taps.setRotationPoint(0.0F, 1.0F, 0.0F);
		ControlSet3.addChild(Taps);
		setRotationAngle(Taps, 0.0F, -2.0944F, 0.0F);


		Tap1 = new ModelRenderer(this);
		Tap1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Taps.addChild(Tap1);
		Tap1.setTextureOffset(84, 56).addBox(-3.0F, -15.75F, -13.5F, 1.0F, 2.0F, 1.0F, -0.375F, false);

		bone103 = new ModelRenderer(this);
		bone103.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap1.addChild(bone103);
		bone103.setTextureOffset(41, 47).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.4375F, false);

		bone104 = new ModelRenderer(this);
		bone104.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap1.addChild(bone104);
		setRotationAngle(bone104, 0.0F, -0.7854F, 0.0F);
		bone104.setTextureOffset(41, 47).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.4375F, false);

		bone105 = new ModelRenderer(this);
		bone105.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap1.addChild(bone105);
		setRotationAngle(bone105, 0.0F, -1.5708F, 0.0F);
		bone105.setTextureOffset(41, 47).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.4375F, false);

		bone106 = new ModelRenderer(this);
		bone106.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap1.addChild(bone106);
		setRotationAngle(bone106, 0.0F, -2.3562F, 0.0F);
		bone106.setTextureOffset(41, 47).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.4375F, false);

		Tap2 = new ModelRenderer(this);
		Tap2.setRotationPoint(-0.5513F, -0.9375F, 1.5452F);
		Taps.addChild(Tap2);
		Tap2.setTextureOffset(81, 53).addBox(-3.5F, -16.25F, -14.0F, 2.0F, 3.0F, 2.0F, -0.875F, false);

		bone107 = new ModelRenderer(this);
		bone107.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap2.addChild(bone107);
		bone107.setTextureOffset(41, 47).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.4375F, false);

		bone108 = new ModelRenderer(this);
		bone108.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap2.addChild(bone108);
		setRotationAngle(bone108, 0.0F, -0.7854F, 0.0F);
		bone108.setTextureOffset(41, 47).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.4375F, false);

		bone109 = new ModelRenderer(this);
		bone109.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap2.addChild(bone109);
		setRotationAngle(bone109, 0.0F, -1.5708F, 0.0F);
		bone109.setTextureOffset(41, 47).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.4375F, false);

		bone110 = new ModelRenderer(this);
		bone110.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap2.addChild(bone110);
		setRotationAngle(bone110, 0.0F, -2.3562F, 0.0F);
		bone110.setTextureOffset(41, 47).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.4375F, false);

		Tap3 = new ModelRenderer(this);
		Tap3.setRotationPoint(0.4771F, -0.5F, 0.9514F);
		Taps.addChild(Tap3);
		Tap3.setTextureOffset(81, 53).addBox(-3.5F, -16.25F, -14.0F, 2.0F, 3.0F, 2.0F, -0.875F, false);

		bone111 = new ModelRenderer(this);
		bone111.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap3.addChild(bone111);
		bone111.setTextureOffset(41, 47).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.4375F, false);

		bone112 = new ModelRenderer(this);
		bone112.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap3.addChild(bone112);
		setRotationAngle(bone112, 0.0F, -0.7854F, 0.0F);
		bone112.setTextureOffset(41, 47).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.4375F, false);

		bone113 = new ModelRenderer(this);
		bone113.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap3.addChild(bone113);
		setRotationAngle(bone113, 0.0F, -1.5708F, 0.0F);
		bone113.setTextureOffset(41, 47).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.4375F, false);

		bone114 = new ModelRenderer(this);
		bone114.setRotationPoint(-2.5F, -15.25F, -13.0F);
		Tap3.addChild(bone114);
		setRotationAngle(bone114, 0.0F, -2.3562F, 0.0F);
		bone114.setTextureOffset(41, 47).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.4375F, false);

		ControlSet2 = new ModelRenderer(this);
		ControlSet2.setRotationPoint(0.0F, 0.0F, 0.0F);
		EntireModel.addChild(ControlSet2);


		WeridLever = new ModelRenderer(this);
		WeridLever.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet2.addChild(WeridLever);
		setRotationAngle(WeridLever, 0.0F, -0.5236F, 0.0F);


		LeversRot = new ModelRenderer(this);
		LeversRot.setRotationPoint(0.875F, -11.9284F, -8.3862F);
		WeridLever.addChild(LeversRot);
		setRotationAngle(LeversRot, 0.4712F, 0.0F, 0.0F);
		LeversRot.setTextureOffset(81, 55).addBox(-0.0625F, -4.6517F, -3.1931F, 1.0F, 1.0F, 2.0F, 0.125F, false);
		LeversRot.setTextureOffset(43, 85).addBox(-0.0625F, -4.2767F, -3.1931F, 1.0F, 1.0F, 2.0F, 0.25F, false);

		Levers = new ModelRenderer(this);
		Levers.setRotationPoint(0.4375F, -4.4017F, -2.9431F);
		LeversRot.addChild(Levers);
		setRotationAngle(Levers, 0.5236F, 0.0F, 0.0F);
		Levers.setTextureOffset(68, 39).addBox(-1.1875F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, -0.375F, false);
		Levers.setTextureOffset(68, 39).addBox(-1.1875F, -2.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3125F, false);
		Levers.setTextureOffset(68, 39).addBox(0.1875F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, -0.375F, false);
		Levers.setTextureOffset(68, 39).addBox(0.1875F, -2.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3125F, false);

		Dials = new ModelRenderer(this);
		Dials.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet2.addChild(Dials);
		setRotationAngle(Dials, 0.0F, -1.5708F, 0.0F);


		Dial1 = new ModelRenderer(this);
		Dial1.setRotationPoint(-0.875F, -11.9284F, -8.3862F);
		Dials.addChild(Dial1);
		setRotationAngle(Dial1, 0.4712F, 0.0F, 0.0F);
		Dial1.setTextureOffset(67, 73).addBox(-0.9375F, -4.6517F, -3.1931F, 1.0F, 1.0F, 1.0F, 0.125F, false);
		Dial1.setTextureOffset(67, 73).addBox(-0.9375F, -4.6517F, -1.6931F, 1.0F, 1.0F, 1.0F, 0.125F, false);
		Dial1.setTextureOffset(48, 34).addBox(-0.9375F, -4.2767F, -3.1931F, 1.0F, 1.0F, 2.0F, 0.25F, false);
		Dial1.setTextureOffset(48, 34).addBox(-0.9375F, -4.2767F, -2.6931F, 1.0F, 1.0F, 2.0F, 0.24F, false);
		Dial1.setTextureOffset(48, 67).addBox(-0.9375F, -3.9982F, -0.085F, 1.0F, 1.0F, 2.0F, 0.24F, false);

		Dials2 = new ModelRenderer(this);
		Dials2.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet2.addChild(Dials2);
		setRotationAngle(Dials2, 0.0F, -0.5236F, 0.0F);


		Dial2 = new ModelRenderer(this);
		Dial2.setRotationPoint(0.875F, -11.9284F, -8.3862F);
		Dials2.addChild(Dial2);
		setRotationAngle(Dial2, 0.4712F, 0.0F, 0.0F);
		Dial2.setTextureOffset(21, 45).addBox(-1.0625F, -4.9982F, -0.085F, 3.0F, 2.0F, 3.0F, -0.76F, false);
		Dial2.setTextureOffset(21, 45).addBox(-0.4375F, -4.5527F, 0.5631F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		Dial2.setTextureOffset(21, 45).addBox(-0.4375F, -5.8652F, 0.5631F, 1.0F, 2.0F, 1.0F, -0.3125F, false);
		Dial2.setTextureOffset(21, 45).addBox(0.375F, -4.5527F, 0.5631F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		Dial2.setTextureOffset(21, 45).addBox(0.375F, -5.8652F, 0.5631F, 1.0F, 2.0F, 1.0F, -0.3125F, false);

		KeyBoard = new ModelRenderer(this);
		KeyBoard.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet2.addChild(KeyBoard);
		setRotationAngle(KeyBoard, 0.0F, -1.0472F, 0.0F);


		bone92 = new ModelRenderer(this);
		bone92.setRotationPoint(-0.5F, -11.75F, -14.0F);
		KeyBoard.addChild(bone92);
		setRotationAngle(bone92, 0.7592F, 0.0F, 0.0F);
		bone92.setTextureOffset(103, 40).addBox(-2.5F, -1.006F, -1.9566F, 6.0F, 1.0F, 3.0F, -0.375F, false);

		AtomAccelerator = new ModelRenderer(this);
		AtomAccelerator.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet2.addChild(AtomAccelerator);
		setRotationAngle(AtomAccelerator, 0.0F, -1.0472F, 0.0F);


		bone89 = new ModelRenderer(this);
		bone89.setRotationPoint(-0.5F, -14.0F, -11.0F);
		AtomAccelerator.addChild(bone89);
		setRotationAngle(bone89, 0.6109F, 0.0F, 0.0F);
		bone89.setTextureOffset(82, 57).addBox(-0.5F, -0.625F, -0.375F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		bone89.setTextureOffset(82, 57).addBox(-0.5F, -1.0F, -0.375F, 2.0F, 1.0F, 2.0F, -0.1875F, false);

		bone90 = new ModelRenderer(this);
		bone90.setRotationPoint(0.5F, 0.5F, -0.5F);
		bone89.addChild(bone90);
		setRotationAngle(bone90, -0.2182F, 0.0F, 0.0F);
		bone90.setTextureOffset(75, 71).addBox(-1.0F, -1.7982F, -2.3032F, 2.0F, 2.0F, 2.0F, -0.6875F, false);
		bone90.setTextureOffset(61, 56).addBox(-2.5F, -1.7982F, -1.8032F, 2.0F, 2.0F, 2.0F, -0.6875F, false);

		Spin = new ModelRenderer(this);
		Spin.setRotationPoint(0.5F, 0.5F, -0.5F);
		bone89.addChild(Spin);
		Spin.setTextureOffset(82, 57).addBox(-0.5F, -2.9375F, 0.625F, 1.0F, 2.0F, 1.0F, -0.375F, false);

		bone91 = new ModelRenderer(this);
		bone91.setRotationPoint(0.0F, -2.125F, 1.125F);
		Spin.addChild(bone91);
		bone91.setTextureOffset(40, 46).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, -0.365F, false);
		bone91.setTextureOffset(46, 69).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 1.0F, 2.0F, -0.364F, false);
		bone91.setTextureOffset(76, 70).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, -0.375F, false);

		Gyroscope = new ModelRenderer(this);
		Gyroscope.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet2.addChild(Gyroscope);
		setRotationAngle(Gyroscope, 0.0F, -1.0472F, 0.0F);


		Frame = new ModelRenderer(this);
		Frame.setRotationPoint(0.0F, 0.0F, 0.0F);
		Gyroscope.addChild(Frame);
		Frame.setTextureOffset(50, 70).addBox(-3.25F, -18.5F, -8.25F, 1.0F, 2.0F, 1.0F, -0.25F, false);
		Frame.setTextureOffset(43, 68).addBox(2.25F, -18.5F, -8.25F, 1.0F, 2.0F, 1.0F, -0.25F, false);
		Frame.setTextureOffset(43, 68).addBox(-1.5178F, -20.2678F, -8.25F, 3.0F, 1.0F, 1.0F, -0.25F, false);
		Frame.setTextureOffset(43, 68).addBox(-0.75F, -20.5803F, -9.0F, 2.0F, 1.0F, 2.0F, -0.3126F, false);
		Frame.setTextureOffset(43, 68).addBox(-0.75F, -20.5803F, -8.5F, 2.0F, 1.0F, 2.0F, -0.3124F, false);
		Frame.setTextureOffset(43, 68).addBox(-1.25F, -20.5803F, -8.5F, 2.0F, 1.0F, 2.0F, -0.3125F, false);
		Frame.setTextureOffset(43, 68).addBox(-1.25F, -20.5803F, -9.0F, 2.0F, 1.0F, 2.0F, -0.3124F, false);

		bone93 = new ModelRenderer(this);
		bone93.setRotationPoint(3.0607F, -18.25F, -7.75F);
		Frame.addChild(bone93);
		setRotationAngle(bone93, 0.0F, 0.0F, -0.7854F);
		bone93.setTextureOffset(43, 68).addBox(-0.7929F, -2.7929F, -0.5F, 1.0F, 3.0F, 1.0F, -0.2501F, false);

		bone94 = new ModelRenderer(this);
		bone94.setRotationPoint(-2.7678F, -19.0429F, -7.75F);
		Frame.addChild(bone94);
		setRotationAngle(bone94, 0.0F, 0.0F, 0.7854F);
		bone94.setTextureOffset(43, 68).addBox(0.1464F, -2.0251F, -0.5F, 1.0F, 3.0F, 1.0F, -0.2501F, false);

		Spin2 = new ModelRenderer(this);
		Spin2.setRotationPoint(0.0F, -20.9151F, -7.75F);
		Gyroscope.addChild(Spin2);
		setRotationAngle(Spin2, -3.1416F, 2.5307F, 3.1416F);
		Spin2.setTextureOffset(43, 68).addBox(-1.0F, -0.6651F, -0.5F, 2.0F, 1.0F, 1.0F, -0.375F, false);
		Spin2.setTextureOffset(43, 68).addBox(0.0752F, -1.7571F, -0.5F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		Spin2.setTextureOffset(43, 68).addBox(-0.1748F, -1.7571F, -0.5F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		Spin2.setTextureOffset(43, 68).addBox(-1.25F, 0.0224F, -1.25F, 2.0F, 1.0F, 2.0F, -0.375F, false);
		Spin2.setTextureOffset(43, 68).addBox(-0.75F, 0.0224F, -1.25F, 2.0F, 1.0F, 2.0F, -0.374F, false);
		Spin2.setTextureOffset(43, 68).addBox(-1.25F, 0.0224F, -0.75F, 2.0F, 1.0F, 2.0F, -0.377F, false);
		Spin2.setTextureOffset(43, 68).addBox(-0.75F, 0.0224F, -0.75F, 2.0F, 1.0F, 2.0F, -0.375F, false);

		bone98 = new ModelRenderer(this);
		bone98.setRotationPoint(0.75F, -1.7276F, 0.0F);
		Spin2.addChild(bone98);
		setRotationAngle(bone98, 0.0F, 0.0F, 0.7854F);
		bone98.setTextureOffset(43, 68).addBox(0.4799F, 0.6566F, -0.5F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		bone98.setTextureOffset(43, 68).addBox(-0.1659F, -0.0955F, -0.5F, 1.0F, 1.0F, 1.0F, -0.375F, false);

		bone99 = new ModelRenderer(this);
		bone99.setRotationPoint(0.75F, -1.7276F, 0.0F);
		Spin2.addChild(bone99);
		setRotationAngle(bone99, 0.0F, 0.0F, 0.3054F);
		bone99.setTextureOffset(43, 68).addBox(-0.1213F, 0.8002F, -0.5F, 1.0F, 1.0F, 1.0F, -0.375F, false);

		bone100 = new ModelRenderer(this);
		bone100.setRotationPoint(0.75F, -1.7276F, 0.0F);
		Spin2.addChild(bone100);
		bone100.setTextureOffset(43, 68).addBox(-0.498F, 0.6473F, -0.5F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		bone100.setTextureOffset(43, 68).addBox(-0.498F, 0.3973F, -0.5F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		bone100.setTextureOffset(43, 68).addBox(-0.498F, 0.1473F, -0.5F, 1.0F, 1.0F, 1.0F, -0.375F, false);

		bone95 = new ModelRenderer(this);
		bone95.setRotationPoint(-0.3125F, -1.1026F, 0.0F);
		Spin2.addChild(bone95);
		setRotationAngle(bone95, 0.0F, 0.0F, -1.2654F);
		bone95.setTextureOffset(43, 68).addBox(-2.1354F, -0.4117F, -0.5F, 2.0F, 1.0F, 1.0F, -0.375F, false);
		bone95.setTextureOffset(43, 68).addBox(-1.7604F, -0.4117F, -0.5F, 3.0F, 1.0F, 1.0F, -0.3749F, false);

		bone96 = new ModelRenderer(this);
		bone96.setRotationPoint(0.3125F, -1.1026F, 0.0F);
		Spin2.addChild(bone96);
		setRotationAngle(bone96, 0.0F, 0.0F, 1.2654F);
		bone96.setTextureOffset(43, 68).addBox(0.1354F, -0.4117F, -0.5F, 2.0F, 1.0F, 1.0F, -0.375F, false);
		bone96.setTextureOffset(43, 68).addBox(-1.1146F, -0.4117F, -0.5F, 3.0F, 1.0F, 1.0F, -0.3749F, false);

		bone97 = new ModelRenderer(this);
		bone97.setRotationPoint(-0.3125F, -1.9776F, 0.0F);
		Spin2.addChild(bone97);
		setRotationAngle(bone97, 0.0F, 0.0F, -0.7854F);
		bone97.setTextureOffset(43, 68).addBox(-2.1172F, -0.342F, -0.5F, 3.0F, 1.0F, 1.0F, -0.3125F, false);
		bone97.setTextureOffset(43, 68).addBox(-1.7422F, -0.342F, -0.5F, 3.0F, 1.0F, 1.0F, -0.3124F, false);

		ControlSet1 = new ModelRenderer(this);
		ControlSet1.setRotationPoint(0.0F, 0.0F, 0.0F);
		EntireModel.addChild(ControlSet1);


		HelmicRegulator = new ModelRenderer(this);
		HelmicRegulator.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet1.addChild(HelmicRegulator);


		baserotation = new ModelRenderer(this);
		baserotation.setRotationPoint(-1.0F, -14.1875F, -11.625F);
		HelmicRegulator.addChild(baserotation);
		setRotationAngle(baserotation, 0.6021F, 0.0F, 0.0F);
		baserotation.setTextureOffset(68, 71).addBox(-0.125F, -0.3125F, -0.5F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		baserotation.setTextureOffset(68, 71).addBox(1.125F, -0.3125F, -0.5F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		baserotation.setTextureOffset(68, 71).addBox(0.5F, -0.3125F, 1.5F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		baserotation.setTextureOffset(68, 71).addBox(-0.5625F, -0.3125F, 0.6875F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		baserotation.setTextureOffset(68, 71).addBox(1.5625F, -0.3125F, 0.6875F, 1.0F, 1.0F, 1.0F, -0.25F, false);

		part1 = new ModelRenderer(this);
		part1.setRotationPoint(0.0F, 0.0F, 0.0F);
		baserotation.addChild(part1);
		part1.setTextureOffset(80, 70).addBox(1.125F, -1.125F, -0.5F, 1.0F, 2.0F, 1.0F, -0.3125F, false);
		part1.setTextureOffset(80, 70).addBox(1.375F, -1.125F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3125F, false);

		part2 = new ModelRenderer(this);
		part2.setRotationPoint(0.375F, -0.375F, 0.0F);
		baserotation.addChild(part2);
		part2.setTextureOffset(80, 70).addBox(-0.5F, -0.75F, -0.5F, 1.0F, 2.0F, 1.0F, -0.3125F, false);
		part2.setTextureOffset(80, 70).addBox(-0.25F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3125F, false);

		part3 = new ModelRenderer(this);
		part3.setRotationPoint(-0.0625F, -0.375F, 1.1875F);
		baserotation.addChild(part3);
		part3.setTextureOffset(80, 70).addBox(-0.25F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3125F, false);
		part3.setTextureOffset(80, 70).addBox(-0.5F, -0.75F, -0.5F, 1.0F, 2.0F, 1.0F, -0.3125F, false);

		part4 = new ModelRenderer(this);
		part4.setRotationPoint(1.0F, -0.375F, 2.0F);
		baserotation.addChild(part4);
		part4.setTextureOffset(80, 70).addBox(-0.5F, -0.75F, -0.5F, 1.0F, 2.0F, 1.0F, -0.3125F, false);
		part4.setTextureOffset(80, 70).addBox(-0.25F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3125F, false);

		part5 = new ModelRenderer(this);
		part5.setRotationPoint(2.0625F, -0.375F, 1.1875F);
		baserotation.addChild(part5);
		part5.setTextureOffset(80, 70).addBox(-0.5F, -0.75F, -0.5F, 1.0F, 2.0F, 1.0F, -0.3125F, false);
		part5.setTextureOffset(80, 70).addBox(-0.25F, -0.75F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3125F, false);

		Throttle = new ModelRenderer(this);
		Throttle.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet1.addChild(Throttle);
		setRotationAngle(Throttle, 0.0F, -0.5236F, 0.0F);


		MainRot = new ModelRenderer(this);
		MainRot.setRotationPoint(-1.3125F, -14.0625F, -12.5F);
		Throttle.addChild(MainRot);
		setRotationAngle(MainRot, 0.4712F, 0.0F, 0.0F);


		Base = new ModelRenderer(this);
		Base.setRotationPoint(-0.5F, 13.5F, 13.0F);
		MainRot.addChild(Base);
		Base.setTextureOffset(66, 70).addBox(-0.25F, -15.3125F, -13.5F, 1.0F, 1.0F, 3.0F, -0.0001F, false);
		Base.setTextureOffset(66, 70).addBox(-0.3125F, -15.6875F, -12.75F, 1.0F, 1.0F, 2.0F, -0.0624F, false);
		Base.setTextureOffset(66, 70).addBox(-0.3125F, -15.6875F, -13.25F, 1.0F, 1.0F, 2.0F, -0.0623F, false);
		Base.setTextureOffset(66, 70).addBox(0.1875F, -15.3125F, -13.5F, 1.0F, 1.0F, 3.0F, 0.0005F, false);
		Base.setTextureOffset(66, 70).addBox(0.25F, -15.6875F, -12.75F, 1.0F, 1.0F, 2.0F, -0.0626F, false);
		Base.setTextureOffset(66, 70).addBox(0.25F, -15.6875F, -13.25F, 1.0F, 1.0F, 2.0F, -0.0625F, false);
		Base.setTextureOffset(94, 28).addBox(0.3125F, -16.0625F, -13.375F, 1.0F, 1.0F, 1.0F, -0.3125F, false);
		Base.setTextureOffset(94, 28).addBox(-0.375F, -16.0625F, -13.375F, 1.0F, 1.0F, 1.0F, -0.3125F, false);
		Base.setTextureOffset(94, 28).addBox(0.3125F, -16.0625F, -12.5F, 1.0F, 1.0F, 1.0F, -0.3125F, false);
		Base.setTextureOffset(94, 28).addBox(0.3125F, -16.0625F, -11.625F, 1.0F, 1.0F, 1.0F, -0.3125F, false);
		Base.setTextureOffset(94, 28).addBox(-0.375F, -16.0625F, -12.5F, 1.0F, 1.0F, 1.0F, -0.3125F, false);
		Base.setTextureOffset(94, 28).addBox(-0.375F, -16.0625F, -11.625F, 1.0F, 1.0F, 1.0F, -0.3125F, false);
		Base.setTextureOffset(66, 70).addBox(-0.1875F, -14.8125F, -13.5F, 1.0F, 1.0F, 3.0F, 0.063F, false);
		Base.setTextureOffset(66, 70).addBox(0.125F, -14.8125F, -13.5F, 1.0F, 1.0F, 3.0F, 0.0629F, false);

		Handle = new ModelRenderer(this);
		Handle.setRotationPoint(-0.0313F, -1.1563F, 1.0F);
		MainRot.addChild(Handle);
		setRotationAngle(Handle, 1.6581F, 0.0F, 0.0F);
		Handle.setTextureOffset(24, 12).addBox(-1.2188F, -2.4688F, -0.5F, 1.0F, 3.0F, 1.0F, -0.375F, false);
		Handle.setTextureOffset(24, 12).addBox(-1.2188F, -2.4688F, -0.5F, 1.0F, 2.0F, 1.0F, -0.374F, false);
		Handle.setTextureOffset(24, 12).addBox(-1.0313F, -2.7813F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3125F, false);
		Handle.setTextureOffset(24, 12).addBox(-0.7813F, -2.7813F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3124F, false);
		Handle.setTextureOffset(24, 12).addBox(0.0313F, -2.7813F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3115F, false);
		Handle.setTextureOffset(24, 12).addBox(-0.2188F, -2.7813F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3124F, false);
		Handle.setTextureOffset(24, 12).addBox(0.2188F, -2.4688F, -0.5F, 1.0F, 3.0F, 1.0F, -0.375F, false);
		Handle.setTextureOffset(24, 12).addBox(0.2188F, -2.4688F, -0.5F, 1.0F, 2.0F, 1.0F, -0.374F, false);

		PhaseSwitch = new ModelRenderer(this);
		PhaseSwitch.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet1.addChild(PhaseSwitch);
		setRotationAngle(PhaseSwitch, 0.0F, 0.5236F, 0.0F);


		Base2 = new ModelRenderer(this);
		Base2.setRotationPoint(1.3125F, -14.8125F, -12.75F);
		PhaseSwitch.addChild(Base2);
		setRotationAngle(Base2, 0.48F, 0.0F, 0.0F);
		Base2.setTextureOffset(42, 13).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, -0.0625F, false);
		Base2.setTextureOffset(42, 13).addBox(-0.5F, -0.375F, -1.6875F, 1.0F, 1.0F, 1.0F, -0.1875F, false);
		Base2.setTextureOffset(42, 13).addBox(-0.5F, -0.375F, 1.875F, 1.0F, 1.0F, 1.0F, -0.1875F, false);
		Base2.setTextureOffset(45, 33).addBox(-0.5F, -0.375F, -1.375F, 1.0F, 1.0F, 4.0F, -0.25F, false);
		Base2.setTextureOffset(42, 13).addBox(-0.25F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, -0.1875F, false);

		Switch = new ModelRenderer(this);
		Switch.setRotationPoint(1.75F, -15.0625F, -12.375F);
		PhaseSwitch.addChild(Switch);
		setRotationAngle(Switch, 0.48F, -0.6981F, 0.0F);
		Switch.setTextureOffset(42, 13).addBox(1.625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		Switch.setTextureOffset(42, 13).addBox(-0.375F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, -0.3125F, false);

		RotaryHandles = new ModelRenderer(this);
		RotaryHandles.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet1.addChild(RotaryHandles);


		Rotor1 = new ModelRenderer(this);
		Rotor1.setRotationPoint(-5.1875F, -12.1875F, -13.6875F);
		RotaryHandles.addChild(Rotor1);
		Rotor1.setTextureOffset(79, 58).addBox(-0.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, -0.1875F, false);

		H1 = new ModelRenderer(this);
		H1.setRotationPoint(2.0F, 4.0F, -3.0F);
		Rotor1.addChild(H1);
		H1.setTextureOffset(79, 58).addBox(-2.5F, -4.5F, 1.0F, 1.0F, 1.0F, 2.0F, -0.375F, false);
		H1.setTextureOffset(79, 58).addBox(-2.5F, -3.5F, 0.8125F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		H1.setTextureOffset(79, 58).addBox(-2.5F, -4.5F, 1.0F, 1.0F, 2.0F, 1.0F, -0.365F, false);

		Rotor2 = new ModelRenderer(this);
		Rotor2.setRotationPoint(-4.125F, -12.1875F, -13.6875F);
		RotaryHandles.addChild(Rotor2);
		Rotor2.setTextureOffset(79, 58).addBox(-0.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, -0.1875F, false);

		H2 = new ModelRenderer(this);
		H2.setRotationPoint(0.0F, 0.0F, -0.8333F);
		Rotor2.addChild(H2);
		setRotationAngle(H2, 0.0F, 0.0F, 0.5236F);
		H2.setTextureOffset(79, 58).addBox(-0.5F, -0.5F, -0.1667F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		H2.setTextureOffset(79, 58).addBox(-0.5F, 0.5F, -1.4167F, 1.0F, 1.0F, 2.0F, -0.375F, false);
		H2.setTextureOffset(79, 58).addBox(-0.5F, -0.5F, -0.4167F, 1.0F, 2.0F, 1.0F, -0.365F, false);

		bone87 = new ModelRenderer(this);
		bone87.setRotationPoint(10.375F, 0.0F, 0.125F);
		Rotor2.addChild(bone87);
		setRotationAngle(bone87, 0.0F, -0.5236F, 0.0F);
		bone87.setTextureOffset(79, 58).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.125F, false);

		Handbrake = new ModelRenderer(this);
		Handbrake.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlSet1.addChild(Handbrake);
		setRotationAngle(Handbrake, 0.0F, 1.5708F, 0.0F);


		Rot2 = new ModelRenderer(this);
		Rot2.setRotationPoint(12.875F, -11.25F, 7.25F);
		Handbrake.addChild(Rot2);
		setRotationAngle(Rot2, -0.1745F, 0.6109F, 0.0F);
		Rot2.setTextureOffset(48, 32).addBox(-0.5F, -1.5F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Rot2.setTextureOffset(48, 32).addBox(-0.5F, -4.125F, 0.25F, 1.0F, 4.0F, 1.0F, -0.125F, false);
		Rot2.setTextureOffset(48, 32).addBox(-0.5F, -6.625F, 0.625F, 1.0F, 4.0F, 1.0F, -0.0625F, false);

		ControlsBetweenPanels = new ModelRenderer(this);
		ControlsBetweenPanels.setRotationPoint(0.0F, 0.0F, 0.0F);
		EntireModel.addChild(ControlsBetweenPanels);


		Pumps = new ModelRenderer(this);
		Pumps.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlsBetweenPanels.addChild(Pumps);
		setRotationAngle(Pumps, 0.0F, 2.0944F, 0.0F);
		Pumps.setTextureOffset(48, 32).addBox(-15.375F, -12.25F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		p1 = new ModelRenderer(this);
		p1.setRotationPoint(-13.3125F, -10.75F, 0.0F);
		Pumps.addChild(p1);
		setRotationAngle(p1, 0.0F, 0.0F, -0.2182F);
		p1.setTextureOffset(44, 66).addBox(-0.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		bone116 = new ModelRenderer(this);
		bone116.setRotationPoint(0.5F, 0.5F, -0.5F);
		p1.addChild(bone116);
		bone116.setTextureOffset(44, 66).addBox(-1.0F, -4.6875F, 0.0F, 1.0F, 3.0F, 1.0F, -0.0625F, false);

		bone117 = new ModelRenderer(this);
		bone117.setRotationPoint(0.5F, 0.5F, -0.5F);
		p1.addChild(bone117);
		bone117.setTextureOffset(44, 66).addBox(-1.0F, -4.6875F, -1.0F, 1.0F, 1.0F, 2.0F, -0.25F, false);

		p2and3 = new ModelRenderer(this);
		p2and3.setRotationPoint(-13.3125F, -10.75F, 0.0F);
		Pumps.addChild(p2and3);
		setRotationAngle(p2and3, 0.0F, 0.0F, -0.2182F);
		p2and3.setTextureOffset(44, 66).addBox(1.5F, -2.5F, -0.5F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		PUMP3 = new ModelRenderer(this);
		PUMP3.setRotationPoint(0.5F, 0.5F, -0.5F);
		p2and3.addChild(PUMP3);
		PUMP3.setTextureOffset(17, 24).addBox(1.0F, -7.125F, 0.3125F, 1.0F, 2.0F, 1.0F, -0.3F, false);
		PUMP3.setTextureOffset(14, 36).addBox(1.0F, -6.125F, 0.3125F, 1.0F, 3.0F, 1.0F, -0.3125F, false);
		PUMP3.setTextureOffset(17, 24).addBox(1.0F, -6.125F, 0.3125F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		PUMP3.setTextureOffset(17, 24).addBox(1.0F, -7.375F, 0.3125F, 1.0F, 1.0F, 1.0F, -0.25F, false);

		PUMP2 = new ModelRenderer(this);
		PUMP2.setRotationPoint(0.5F, 0.5F, -0.5F);
		p2and3.addChild(PUMP2);
		PUMP2.setTextureOffset(17, 24).addBox(1.0F, -5.375F, -0.25F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		PUMP2.setTextureOffset(16, 43).addBox(1.0F, -5.375F, -0.25F, 1.0F, 3.0F, 1.0F, -0.3125F, false);
		PUMP2.setTextureOffset(17, 24).addBox(1.0F, -6.375F, -0.25F, 1.0F, 2.0F, 1.0F, -0.3F, false);
		PUMP2.setTextureOffset(17, 24).addBox(1.0F, -6.625F, -0.25F, 1.0F, 1.0F, 1.0F, -0.25F, false);

		bone118 = new ModelRenderer(this);
		bone118.setRotationPoint(0.5F, 0.5F, -0.5F);
		p2and3.addChild(bone118);
		bone118.setTextureOffset(44, 66).addBox(1.0F, -4.6875F, 0.3125F, 1.0F, 3.0F, 1.0F, -0.25F, false);
		bone118.setTextureOffset(44, 66).addBox(1.0F, -4.6875F, -0.25F, 1.0F, 3.0F, 1.0F, -0.25F, false);

		SpinnyThings = new ModelRenderer(this);
		SpinnyThings.setRotationPoint(0.0F, 0.0F, 0.0F);
		ControlsBetweenPanels.addChild(SpinnyThings);


		Sp1 = new ModelRenderer(this);
		Sp1.setRotationPoint(0.0F, 0.0F, 0.0F);
		SpinnyThings.addChild(Sp1);


		bone85 = new ModelRenderer(this);
		bone85.setRotationPoint(13.0F, -13.75F, 0.0F);
		Sp1.addChild(bone85);
		setRotationAngle(bone85, 0.0F, 0.0F, 0.48F);
		bone85.setTextureOffset(21, 47).addBox(-2.875F, -1.375F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone85.setTextureOffset(41, 9).addBox(-3.375F, -1.875F, -1.0F, 1.0F, 2.0F, 2.0F, -0.25F, false);
		bone85.setTextureOffset(41, 9).addBox(0.625F, -1.875F, -1.0F, 1.0F, 2.0F, 2.0F, -0.25F, false);

		Sp3 = new ModelRenderer(this);
		Sp3.setRotationPoint(0.0F, 0.0F, 0.0F);
		SpinnyThings.addChild(Sp3);
		setRotationAngle(Sp3, 0.0F, 1.0472F, 0.0F);


		bone88 = new ModelRenderer(this);
		bone88.setRotationPoint(13.0F, -13.75F, 0.0F);
		Sp3.addChild(bone88);
		setRotationAngle(bone88, 0.0F, 0.0F, 0.48F);
		bone88.setTextureOffset(21, 47).addBox(-2.875F, -1.375F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone88.setTextureOffset(41, 9).addBox(-3.375F, -1.875F, -1.0F, 1.0F, 2.0F, 2.0F, -0.25F, false);
		bone88.setTextureOffset(41, 9).addBox(0.625F, -1.875F, -1.0F, 1.0F, 2.0F, 2.0F, -0.25F, false);

		Sp2 = new ModelRenderer(this);
		Sp2.setRotationPoint(0.0F, 0.0F, 0.0F);
		SpinnyThings.addChild(Sp2);
		setRotationAngle(Sp2, 0.0F, 2.0944F, 0.0F);


		bone86 = new ModelRenderer(this);
		bone86.setRotationPoint(13.0F, -13.75F, 0.0F);
		Sp2.addChild(bone86);
		setRotationAngle(bone86, 0.0F, 0.0F, 0.48F);
		bone86.setTextureOffset(21, 47).addBox(-2.875F, -1.375F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone86.setTextureOffset(41, 9).addBox(-3.375F, -1.875F, -1.0F, 1.0F, 2.0F, 2.0F, -0.25F, false);
		bone86.setTextureOffset(41, 9).addBox(0.625F, -1.875F, -1.0F, 1.0F, 2.0F, 2.0F, -0.25F, false);

		Sp4 = new ModelRenderer(this);
		Sp4.setRotationPoint(0.0F, 0.0F, 0.0F);
		SpinnyThings.addChild(Sp4);
		setRotationAngle(Sp4, 0.0F, -2.0944F, 0.0F);


		bone115 = new ModelRenderer(this);
		bone115.setRotationPoint(13.0F, -13.75F, 0.0F);
		Sp4.addChild(bone115);
		setRotationAngle(bone115, 0.0F, 0.0F, 0.48F);
		bone115.setTextureOffset(21, 47).addBox(-2.875F, -1.375F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bone115.setTextureOffset(41, 9).addBox(-3.375F, -1.875F, -1.0F, 1.0F, 2.0F, 2.0F, -0.25F, false);
		bone115.setTextureOffset(41, 9).addBox(0.625F, -1.875F, -1.0F, 1.0F, 2.0F, 2.0F, -0.25F, false);

		TimeRotor = new ModelRenderer(this);
		TimeRotor.setRotationPoint(0.0F, 0.0F, 0.0F);
		EntireModel.addChild(TimeRotor);
		setRotationAngle(TimeRotor, 0.0F, -0.5236F, 0.0F);


		TimeRotorInner = new ModelRenderer(this);
		TimeRotorInner.setRotationPoint(0.0F, 0.0F, 0.0F);
		TimeRotor.addChild(TimeRotorInner);


		Moving = new ModelRenderer(this);
		Moving.setRotationPoint(0.0F, 0.0F, 0.0F);
		TimeRotorInner.addChild(Moving);
		setRotationAngle(Moving, 0.0F, -0.7854F, 0.0F);
		Moving.setTextureOffset(58, 0).addBox(-2.0F, -29.5F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		Moving.setTextureOffset(58, 0).addBox(-1.0F, -34.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Moving.setTextureOffset(58, 0).addBox(-1.0F, -37.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Moving.setTextureOffset(58, 0).addBox(-1.0F, -40.5F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Moving.setTextureOffset(58, 0).addBox(-1.0F, -43.25F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
		Moving.setTextureOffset(58, 0).addBox(-1.0F, -43.8125F, -1.0F, 2.0F, 2.0F, 2.0F, -0.125F, false);
		Moving.setTextureOffset(58, 0).addBox(-1.0F, -45.0625F, -1.0F, 2.0F, 2.0F, 2.0F, -0.25F, false);
		Moving.setTextureOffset(58, 0).addBox(-1.0F, -46.0F, -1.0F, 2.0F, 33.0F, 2.0F, -0.5F, false);
		Moving.setTextureOffset(60, 0).addBox(-1.0F, -47.75F, -1.0F, 2.0F, 3.0F, 2.0F, -0.625F, false);
		Moving.setTextureOffset(58, 0).addBox(-1.0F, -48.1875F, -1.0F, 2.0F, 2.0F, 2.0F, -0.5625F, false);

		Stationary = new ModelRenderer(this);
		Stationary.setRotationPoint(0.5F, -25.5F, 0.0F);
		TimeRotorInner.addChild(Stationary);
		Stationary.setTextureOffset(58, 0).addBox(-2.5F, -30.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		Stationary.setTextureOffset(58, 0).addBox(-2.5F, -32.0625F, -2.0F, 4.0F, 4.0F, 4.0F, -0.1875F, false);
		Stationary.setTextureOffset(58, 0).addBox(-2.5F, -36.375F, -2.0F, 4.0F, 6.0F, 4.0F, -0.5625F, false);
		Stationary.setTextureOffset(58, 0).addBox(-2.5F, -41.75F, -2.0F, 4.0F, 8.0F, 4.0F, -1.25F, false);

		TimeRotorShell = new ModelRenderer(this);
		TimeRotorShell.setRotationPoint(0.0F, 0.0F, 0.0F);
		TimeRotor.addChild(TimeRotorShell);


		TimeRotorlOWER = new ModelRenderer(this);
		TimeRotorlOWER.setRotationPoint(0.0F, -22.25F, 0.0F);
		TimeRotorShell.addChild(TimeRotorlOWER);


		b2 = new ModelRenderer(this);
		b2.setRotationPoint(0.0F, 0.25F, 0.0F);
		TimeRotorlOWER.addChild(b2);
		setRotationAngle(b2, 0.0F, -0.5236F, -0.0436F);
		b2.setTextureOffset(0, 0).addBox(-3.7216F, -43.0F, -2.006F, 1.0F, 66.0F, 3.0F, 0.0F, false);

		b3 = new ModelRenderer(this);
		b3.setRotationPoint(0.0F, 0.25F, 0.0F);
		TimeRotorlOWER.addChild(b3);
		setRotationAngle(b3, 0.0F, -2.618F, 0.0436F);
		b3.setTextureOffset(0, 0).addBox(-3.7216F, -43.0F, -0.994F, 1.0F, 66.0F, 3.0F, 0.0F, false);

		b4 = new ModelRenderer(this);
		b4.setRotationPoint(0.0F, 0.25F, 0.0F);
		TimeRotorlOWER.addChild(b4);
		setRotationAngle(b4, 0.0F, 3.1416F, 0.0436F);
		b4.setTextureOffset(0, 0).addBox(-3.72F, -43.0F, -1.0F, 1.0F, 66.0F, 2.0F, 0.0F, false);

		b5 = new ModelRenderer(this);
		b5.setRotationPoint(0.0F, 0.25F, 0.0F);
		TimeRotorlOWER.addChild(b5);
		setRotationAngle(b5, 0.0F, 2.618F, 0.0436F);
		b5.setTextureOffset(0, 0).addBox(-3.7216F, -43.0F, -2.006F, 1.0F, 66.0F, 3.0F, 0.0F, false);

		b6 = new ModelRenderer(this);
		b6.setRotationPoint(0.0F, 0.25F, 0.0F);
		TimeRotorlOWER.addChild(b6);
		setRotationAngle(b6, 0.0F, 0.5236F, -0.0436F);
		b6.setTextureOffset(0, 0).addBox(-3.7216F, -43.0F, -0.994F, 1.0F, 66.0F, 3.0F, 0.0F, false);

		TrRing1 = new ModelRenderer(this);
		TrRing1.setRotationPoint(0.0F, -24.75F, 0.0F);
		TimeRotorShell.addChild(TrRing1);


		b7 = new ModelRenderer(this);
		b7.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b7);
		b7.setTextureOffset(50, 0).addBox(-4.22F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5F, false);

		b8 = new ModelRenderer(this);
		b8.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b8);
		setRotationAngle(b8, 0.0F, -0.5236F, 0.0F);
		b8.setTextureOffset(50, 0).addBox(-4.22F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5F, false);

		b9 = new ModelRenderer(this);
		b9.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b9);
		setRotationAngle(b9, 0.0F, -1.0472F, 0.0F);
		b9.setTextureOffset(50, 0).addBox(-4.22F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5F, false);

		b10 = new ModelRenderer(this);
		b10.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b10);
		setRotationAngle(b10, 0.0F, -1.5708F, 0.0F);
		b10.setTextureOffset(50, 0).addBox(-4.22F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5F, false);

		b11 = new ModelRenderer(this);
		b11.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b11);
		setRotationAngle(b11, 0.0F, -2.0944F, 0.0F);
		b11.setTextureOffset(50, 0).addBox(-4.22F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5F, false);

		b12 = new ModelRenderer(this);
		b12.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b12);
		setRotationAngle(b12, 0.0F, -2.618F, 0.0F);
		b12.setTextureOffset(50, 0).addBox(-4.22F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5F, false);

		b13 = new ModelRenderer(this);
		b13.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b13);
		setRotationAngle(b13, 0.0F, 3.1416F, 0.0F);
		b13.setTextureOffset(50, 0).addBox(-4.22F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5F, false);

		b14 = new ModelRenderer(this);
		b14.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b14);
		setRotationAngle(b14, 0.0F, 2.618F, 0.0F);
		b14.setTextureOffset(50, 0).addBox(-4.22F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5F, false);

		b15 = new ModelRenderer(this);
		b15.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b15);
		setRotationAngle(b15, 0.0F, 2.0944F, 0.0F);
		b15.setTextureOffset(50, 0).addBox(-4.22F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5F, false);

		b16 = new ModelRenderer(this);
		b16.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b16);
		setRotationAngle(b16, 0.0F, 1.5708F, 0.0F);
		b16.setTextureOffset(50, 0).addBox(-4.22F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5F, false);

		b17 = new ModelRenderer(this);
		b17.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b17);
		setRotationAngle(b17, 0.0F, 1.0472F, 0.0F);
		b17.setTextureOffset(50, 0).addBox(-4.22F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5F, false);

		b18 = new ModelRenderer(this);
		b18.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing1.addChild(b18);
		setRotationAngle(b18, 0.0F, 0.5236F, 0.0F);
		b18.setTextureOffset(50, 0).addBox(-4.22F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5F, false);

		TrRing6 = new ModelRenderer(this);
		TrRing6.setRotationPoint(0.0F, -17.25F, 0.0F);
		TimeRotorShell.addChild(TrRing6);


		b19 = new ModelRenderer(this);
		b19.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b19);
		b19.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b20 = new ModelRenderer(this);
		b20.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b20);
		setRotationAngle(b20, 0.0F, -0.5236F, 0.0F);
		b20.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b21 = new ModelRenderer(this);
		b21.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b21);
		setRotationAngle(b21, 0.0F, -1.0472F, 0.0F);
		b21.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b22 = new ModelRenderer(this);
		b22.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b22);
		setRotationAngle(b22, 0.0F, -1.5708F, 0.0F);
		b22.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b23 = new ModelRenderer(this);
		b23.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b23);
		setRotationAngle(b23, 0.0F, -2.0944F, 0.0F);
		b23.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b24 = new ModelRenderer(this);
		b24.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b24);
		setRotationAngle(b24, 0.0F, -2.618F, 0.0F);
		b24.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b25 = new ModelRenderer(this);
		b25.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b25);
		setRotationAngle(b25, 0.0F, 3.1416F, 0.0F);
		b25.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b26 = new ModelRenderer(this);
		b26.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b26);
		setRotationAngle(b26, 0.0F, 2.618F, 0.0F);
		b26.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b27 = new ModelRenderer(this);
		b27.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b27);
		setRotationAngle(b27, 0.0F, 2.0944F, 0.0F);
		b27.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b28 = new ModelRenderer(this);
		b28.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b28);
		setRotationAngle(b28, 0.0F, 1.5708F, 0.0F);
		b28.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b29 = new ModelRenderer(this);
		b29.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b29);
		setRotationAngle(b29, 0.0F, 1.0472F, 0.0F);
		b29.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b30 = new ModelRenderer(this);
		b30.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing6.addChild(b30);
		setRotationAngle(b30, 0.0F, 0.5236F, 0.0F);
		b30.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		TrRing7 = new ModelRenderer(this);
		TrRing7.setRotationPoint(0.0F, -10.75F, 0.0F);
		TimeRotorShell.addChild(TrRing7);


		b31 = new ModelRenderer(this);
		b31.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b31);
		b31.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b42 = new ModelRenderer(this);
		b42.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b42);
		setRotationAngle(b42, 0.0F, -0.5236F, 0.0F);
		b42.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b32 = new ModelRenderer(this);
		b32.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b32);
		setRotationAngle(b32, 0.0F, -1.0472F, 0.0F);
		b32.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b33 = new ModelRenderer(this);
		b33.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b33);
		setRotationAngle(b33, 0.0F, -1.5708F, 0.0F);
		b33.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b34 = new ModelRenderer(this);
		b34.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b34);
		setRotationAngle(b34, 0.0F, -2.0944F, 0.0F);
		b34.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b35 = new ModelRenderer(this);
		b35.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b35);
		setRotationAngle(b35, 0.0F, -2.618F, 0.0F);
		b35.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b36 = new ModelRenderer(this);
		b36.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b36);
		setRotationAngle(b36, 0.0F, 3.1416F, 0.0F);
		b36.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b37 = new ModelRenderer(this);
		b37.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b37);
		setRotationAngle(b37, 0.0F, 2.618F, 0.0F);
		b37.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b38 = new ModelRenderer(this);
		b38.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b38);
		setRotationAngle(b38, 0.0F, 2.0944F, 0.0F);
		b38.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b39 = new ModelRenderer(this);
		b39.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b39);
		setRotationAngle(b39, 0.0F, 1.5708F, 0.0F);
		b39.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b40 = new ModelRenderer(this);
		b40.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b40);
		setRotationAngle(b40, 0.0F, 1.0472F, 0.0F);
		b40.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b41 = new ModelRenderer(this);
		b41.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing7.addChild(b41);
		setRotationAngle(b41, 0.0F, 0.5236F, 0.0F);
		b41.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		TrRing8 = new ModelRenderer(this);
		TrRing8.setRotationPoint(0.0F, -4.25F, 0.0F);
		TimeRotorShell.addChild(TrRing8);


		b43 = new ModelRenderer(this);
		b43.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b43);
		b43.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b44 = new ModelRenderer(this);
		b44.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b44);
		setRotationAngle(b44, 0.0F, -0.5236F, 0.0F);
		b44.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b45 = new ModelRenderer(this);
		b45.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b45);
		setRotationAngle(b45, 0.0F, -1.0472F, 0.0F);
		b45.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b46 = new ModelRenderer(this);
		b46.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b46);
		setRotationAngle(b46, 0.0F, -1.5708F, 0.0F);
		b46.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b47 = new ModelRenderer(this);
		b47.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b47);
		setRotationAngle(b47, 0.0F, -2.0944F, 0.0F);
		b47.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b48 = new ModelRenderer(this);
		b48.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b48);
		setRotationAngle(b48, 0.0F, -2.618F, 0.0F);
		b48.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b49 = new ModelRenderer(this);
		b49.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b49);
		setRotationAngle(b49, 0.0F, 3.1416F, 0.0F);
		b49.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b50 = new ModelRenderer(this);
		b50.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b50);
		setRotationAngle(b50, 0.0F, 2.618F, 0.0F);
		b50.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b51 = new ModelRenderer(this);
		b51.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b51);
		setRotationAngle(b51, 0.0F, 2.0944F, 0.0F);
		b51.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b52 = new ModelRenderer(this);
		b52.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b52);
		setRotationAngle(b52, 0.0F, 1.5708F, 0.0F);
		b52.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b53 = new ModelRenderer(this);
		b53.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b53);
		setRotationAngle(b53, 0.0F, 1.0472F, 0.0F);
		b53.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		b54 = new ModelRenderer(this);
		b54.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing8.addChild(b54);
		setRotationAngle(b54, 0.0F, 0.5236F, 0.0F);
		b54.setTextureOffset(50, 5).addBox(-4.0325F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.5625F, false);

		tRRing2 = new ModelRenderer(this);
		tRRing2.setRotationPoint(0.0F, -32.75F, 0.0F);
		TimeRotorShell.addChild(tRRing2);


		b55 = new ModelRenderer(this);
		b55.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b55);
		b55.setTextureOffset(50, 0).addBox(-4.4075F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.4375F, false);

		b56 = new ModelRenderer(this);
		b56.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b56);
		setRotationAngle(b56, 0.0F, -0.5236F, 0.0F);
		b56.setTextureOffset(50, 0).addBox(-4.4075F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.4375F, false);

		b57 = new ModelRenderer(this);
		b57.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b57);
		setRotationAngle(b57, 0.0F, -1.0472F, 0.0F);
		b57.setTextureOffset(50, 0).addBox(-4.4075F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.4375F, false);

		b58 = new ModelRenderer(this);
		b58.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b58);
		setRotationAngle(b58, 0.0F, -1.5708F, 0.0F);
		b58.setTextureOffset(50, 0).addBox(-4.4075F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.4375F, false);

		b59 = new ModelRenderer(this);
		b59.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b59);
		setRotationAngle(b59, 0.0F, -2.0944F, 0.0F);
		b59.setTextureOffset(50, 0).addBox(-4.4075F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.4375F, false);

		b60 = new ModelRenderer(this);
		b60.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b60);
		setRotationAngle(b60, 0.0F, -2.618F, 0.0F);
		b60.setTextureOffset(50, 0).addBox(-4.4075F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.4375F, false);

		b61 = new ModelRenderer(this);
		b61.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b61);
		setRotationAngle(b61, 0.0F, 3.1416F, 0.0F);
		b61.setTextureOffset(50, 0).addBox(-4.4075F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.4375F, false);

		b62 = new ModelRenderer(this);
		b62.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b62);
		setRotationAngle(b62, 0.0F, 2.618F, 0.0F);
		b62.setTextureOffset(50, 0).addBox(-4.4075F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.4375F, false);

		b63 = new ModelRenderer(this);
		b63.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b63);
		setRotationAngle(b63, 0.0F, 2.0944F, 0.0F);
		b63.setTextureOffset(50, 0).addBox(-4.4075F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.4375F, false);

		b64 = new ModelRenderer(this);
		b64.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b64);
		setRotationAngle(b64, 0.0F, 1.5708F, 0.0F);
		b64.setTextureOffset(50, 0).addBox(-4.4075F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.4375F, false);

		b65 = new ModelRenderer(this);
		b65.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b65);
		setRotationAngle(b65, 0.0F, 1.0472F, 0.0F);
		b65.setTextureOffset(50, 0).addBox(-4.4075F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.4375F, false);

		b66 = new ModelRenderer(this);
		b66.setRotationPoint(0.0F, 0.25F, 0.0F);
		tRRing2.addChild(b66);
		setRotationAngle(b66, 0.0F, 0.5236F, 0.0F);
		b66.setTextureOffset(50, 0).addBox(-4.4075F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.4375F, false);

		TrRing3 = new ModelRenderer(this);
		TrRing3.setRotationPoint(0.0F, -41.25F, 0.0F);
		TimeRotorShell.addChild(TrRing3);


		b67 = new ModelRenderer(this);
		b67.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b67);
		b67.setTextureOffset(50, 0).addBox(-4.595F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.375F, false);

		b68 = new ModelRenderer(this);
		b68.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b68);
		setRotationAngle(b68, 0.0F, -0.5236F, 0.0F);
		b68.setTextureOffset(50, 0).addBox(-4.595F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.375F, false);

		b69 = new ModelRenderer(this);
		b69.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b69);
		setRotationAngle(b69, 0.0F, -1.0472F, 0.0F);
		b69.setTextureOffset(50, 0).addBox(-4.595F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.375F, false);

		b70 = new ModelRenderer(this);
		b70.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b70);
		setRotationAngle(b70, 0.0F, -1.5708F, 0.0F);
		b70.setTextureOffset(50, 0).addBox(-4.595F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.375F, false);

		b71 = new ModelRenderer(this);
		b71.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b71);
		setRotationAngle(b71, 0.0F, -2.0944F, 0.0F);
		b71.setTextureOffset(50, 0).addBox(-4.595F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.375F, false);

		b72 = new ModelRenderer(this);
		b72.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b72);
		setRotationAngle(b72, 0.0F, -2.618F, 0.0F);
		b72.setTextureOffset(50, 0).addBox(-4.595F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.375F, false);

		b73 = new ModelRenderer(this);
		b73.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b73);
		setRotationAngle(b73, 0.0F, 3.1416F, 0.0F);
		b73.setTextureOffset(50, 0).addBox(-4.595F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.375F, false);

		b74 = new ModelRenderer(this);
		b74.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b74);
		setRotationAngle(b74, 0.0F, 2.618F, 0.0F);
		b74.setTextureOffset(50, 0).addBox(-4.595F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.375F, false);

		b75 = new ModelRenderer(this);
		b75.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b75);
		setRotationAngle(b75, 0.0F, 2.0944F, 0.0F);
		b75.setTextureOffset(50, 0).addBox(-4.595F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.375F, false);

		b76 = new ModelRenderer(this);
		b76.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b76);
		setRotationAngle(b76, 0.0F, 1.5708F, 0.0F);
		b76.setTextureOffset(50, 0).addBox(-4.595F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.375F, false);

		b77 = new ModelRenderer(this);
		b77.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b77);
		setRotationAngle(b77, 0.0F, 1.0472F, 0.0F);
		b77.setTextureOffset(50, 0).addBox(-4.595F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.375F, false);

		b78 = new ModelRenderer(this);
		b78.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing3.addChild(b78);
		setRotationAngle(b78, 0.0F, 0.5236F, 0.0F);
		b78.setTextureOffset(50, 0).addBox(-4.595F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.375F, false);

		TrRing4 = new ModelRenderer(this);
		TrRing4.setRotationPoint(0.0F, -50.75F, 0.0F);
		TimeRotorShell.addChild(TrRing4);


		b79 = new ModelRenderer(this);
		b79.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b79);
		b79.setTextureOffset(50, 0).addBox(-4.7825F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.3125F, false);

		b80 = new ModelRenderer(this);
		b80.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b80);
		setRotationAngle(b80, 0.0F, -0.5236F, 0.0F);
		b80.setTextureOffset(50, 0).addBox(-4.7825F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.3125F, false);

		b81 = new ModelRenderer(this);
		b81.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b81);
		setRotationAngle(b81, 0.0F, -1.0472F, 0.0F);
		b81.setTextureOffset(50, 0).addBox(-4.7825F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.3125F, false);

		b82 = new ModelRenderer(this);
		b82.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b82);
		setRotationAngle(b82, 0.0F, -1.5708F, 0.0F);
		b82.setTextureOffset(50, 0).addBox(-4.7825F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.3125F, false);

		b83 = new ModelRenderer(this);
		b83.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b83);
		setRotationAngle(b83, 0.0F, -2.0944F, 0.0F);
		b83.setTextureOffset(50, 0).addBox(-4.7825F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.3125F, false);

		b84 = new ModelRenderer(this);
		b84.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b84);
		setRotationAngle(b84, 0.0F, -2.618F, 0.0F);
		b84.setTextureOffset(50, 0).addBox(-4.7825F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.3125F, false);

		b85 = new ModelRenderer(this);
		b85.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b85);
		setRotationAngle(b85, 0.0F, 3.1416F, 0.0F);
		b85.setTextureOffset(50, 0).addBox(-4.7825F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.3125F, false);

		b86 = new ModelRenderer(this);
		b86.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b86);
		setRotationAngle(b86, 0.0F, 2.618F, 0.0F);
		b86.setTextureOffset(50, 0).addBox(-4.7825F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.3125F, false);

		b87 = new ModelRenderer(this);
		b87.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b87);
		setRotationAngle(b87, 0.0F, 2.0944F, 0.0F);
		b87.setTextureOffset(50, 0).addBox(-4.7825F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.3125F, false);

		b88 = new ModelRenderer(this);
		b88.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b88);
		setRotationAngle(b88, 0.0F, 1.5708F, 0.0F);
		b88.setTextureOffset(50, 0).addBox(-4.7825F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.3125F, false);

		b89 = new ModelRenderer(this);
		b89.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b89);
		setRotationAngle(b89, 0.0F, 1.0472F, 0.0F);
		b89.setTextureOffset(50, 0).addBox(-4.7825F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.3125F, false);

		b90 = new ModelRenderer(this);
		b90.setRotationPoint(0.0F, 0.25F, 0.0F);
		TrRing4.addChild(b90);
		setRotationAngle(b90, 0.0F, 0.5236F, 0.0F);
		b90.setTextureOffset(50, 0).addBox(-4.7825F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.3125F, false);

		TrRing5 = new ModelRenderer(this);
		TrRing5.setRotationPoint(0.0F, 0.0F, 0.0F);
		TimeRotorShell.addChild(TrRing5);


		b91 = new ModelRenderer(this);
		b91.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b91);
		b91.setTextureOffset(50, 0).addBox(-5.095F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.1875F, false);

		b92 = new ModelRenderer(this);
		b92.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b92);
		setRotationAngle(b92, 0.0F, -0.5236F, 0.0F);
		b92.setTextureOffset(50, 0).addBox(-5.095F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.1875F, false);

		b93 = new ModelRenderer(this);
		b93.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b93);
		setRotationAngle(b93, 0.0F, -1.0472F, 0.0F);
		b93.setTextureOffset(50, 0).addBox(-5.095F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.1875F, false);

		b94 = new ModelRenderer(this);
		b94.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b94);
		setRotationAngle(b94, 0.0F, -1.5708F, 0.0F);
		b94.setTextureOffset(50, 0).addBox(-5.095F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.1875F, false);

		b95 = new ModelRenderer(this);
		b95.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b95);
		setRotationAngle(b95, 0.0F, -2.0944F, 0.0F);
		b95.setTextureOffset(50, 0).addBox(-5.095F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.1875F, false);

		b96 = new ModelRenderer(this);
		b96.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b96);
		setRotationAngle(b96, 0.0F, -2.618F, 0.0F);
		b96.setTextureOffset(50, 0).addBox(-5.095F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.1875F, false);

		b97 = new ModelRenderer(this);
		b97.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b97);
		setRotationAngle(b97, 0.0F, 3.1416F, 0.0F);
		b97.setTextureOffset(50, 0).addBox(-5.095F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.1875F, false);

		b98 = new ModelRenderer(this);
		b98.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b98);
		setRotationAngle(b98, 0.0F, 2.618F, 0.0F);
		b98.setTextureOffset(50, 0).addBox(-5.095F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.1875F, false);

		b99 = new ModelRenderer(this);
		b99.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b99);
		setRotationAngle(b99, 0.0F, 2.0944F, 0.0F);
		b99.setTextureOffset(50, 0).addBox(-5.095F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.1875F, false);

		b100 = new ModelRenderer(this);
		b100.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b100);
		setRotationAngle(b100, 0.0F, 1.5708F, 0.0F);
		b100.setTextureOffset(50, 0).addBox(-5.095F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.1875F, false);

		b101 = new ModelRenderer(this);
		b101.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b101);
		setRotationAngle(b101, 0.0F, 1.0472F, 0.0F);
		b101.setTextureOffset(50, 0).addBox(-5.095F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.1875F, false);

		b102 = new ModelRenderer(this);
		b102.setRotationPoint(0.0F, -60.5F, 0.0F);
		TrRing5.addChild(b102);
		setRotationAngle(b102, 0.0F, 0.5236F, 0.0F);
		b102.setTextureOffset(50, 0).addBox(-5.095F, -1.5F, -1.5F, 1.0F, 2.0F, 3.0F, -0.1875F, false);

		Console = new ModelRenderer(this);
		Console.setRotationPoint(0.0F, 0.0F, 0.0F);
		EntireModel.addChild(Console);


		PanelLayout = new ModelRenderer(this);
		PanelLayout.setRotationPoint(0.0F, 0.0F, 0.0F);
		Console.addChild(PanelLayout);


		Panel1 = new ModelRenderer(this);
		Panel1.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelLayout.addChild(Panel1);
		setRotationAngle(Panel1, 0.0F, 0.5236F, 0.0F);


		Side1 = new ModelRenderer(this);
		Side1.setRotationPoint(-0.9252F, 0.0F, 0.1875F);
		Panel1.addChild(Side1);
		Side1.setTextureOffset(78, 15).addBox(1.25F, -15.25F, -9.625F, 2.0F, 16.0F, 6.0F, -0.24F, false);
		Side1.setTextureOffset(94, 7).addBox(1.25F, -13.3415F, -15.5335F, 2.0F, 3.0F, 5.0F, -0.25F, false);
		Side1.setTextureOffset(96, 18).addBox(1.25F, -15.3415F, -11.0335F, 2.0F, 6.0F, 2.0F, -0.25F, false);
		Side1.setTextureOffset(106, 28).addBox(1.25F, -21.75F, -7.625F, 2.0F, 8.0F, 4.0F, -0.25F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.4085F, -7.5F, -12.125F);
		Side1.addChild(bone5);
		setRotationAngle(bone5, -0.5236F, 0.0F, 0.0F);
		bone5.setTextureOffset(78, 37).addBox(0.8415F, -3.8481F, -4.5311F, 2.0F, 3.0F, 8.0F, -0.241F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.4085F, 0.0F, -12.125F);
		Side1.addChild(bone3);
		setRotationAngle(bone3, 0.2443F, 0.0F, 0.0F);
		bone3.setTextureOffset(78, 0).addBox(0.8415F, -1.0593F, -3.0464F, 2.0F, 3.0F, 6.0F, -0.24F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.9085F, -0.8588F, -10.5031F);
		Side1.addChild(bone6);
		setRotationAngle(bone6, 0.48F, 0.0F, 0.0F);
		bone6.setTextureOffset(78, 9).addBox(0.3415F, -0.4909F, 0.0589F, 2.0F, 3.0F, 3.0F, -0.25F, false);
		bone6.setTextureOffset(108, 7).addBox(0.3415F, -13.3078F, 1.1581F, 2.0F, 3.0F, 7.0F, -0.25F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone6.addChild(bone);
		setRotationAngle(bone, 0.2182F, 0.0F, 0.0F);
		bone.setTextureOffset(108, 17).addBox(0.5F, -5.1299F, 0.3275F, 2.0F, 4.0F, 7.0F, -0.25F, false);

		Side2 = new ModelRenderer(this);
		Side2.setRotationPoint(-0.3248F, 0.0F, -0.1875F);
		Panel1.addChild(Side2);
		setRotationAngle(Side2, 0.0F, -1.0472F, 0.0F);
		Side2.setTextureOffset(78, 15).addBox(-2.0F, -15.25F, -9.625F, 2.0F, 16.0F, 6.0F, -0.24F, false);
		Side2.setTextureOffset(94, 7).addBox(-2.0F, -13.3415F, -15.5335F, 2.0F, 3.0F, 5.0F, -0.25F, false);
		Side2.setTextureOffset(96, 18).addBox(-2.0F, -15.3415F, -11.0335F, 2.0F, 6.0F, 2.0F, -0.25F, false);
		Side2.setTextureOffset(106, 28).addBox(-2.0F, -21.75F, -7.625F, 2.0F, 8.0F, 4.0F, -0.25F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.3415F, -7.5F, -12.125F);
		Side2.addChild(bone2);
		setRotationAngle(bone2, -0.5236F, 0.0F, 0.0F);
		bone2.setTextureOffset(78, 37).addBox(-0.6585F, -3.8481F, -4.5311F, 2.0F, 3.0F, 8.0F, -0.241F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.3415F, 0.0F, -12.125F);
		Side2.addChild(bone4);
		setRotationAngle(bone4, 0.2443F, 0.0F, 0.0F);
		bone4.setTextureOffset(78, 0).addBox(-0.6585F, -1.0593F, -3.0464F, 2.0F, 3.0F, 6.0F, -0.24F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-0.8415F, -0.8588F, -10.5031F);
		Side2.addChild(bone7);
		setRotationAngle(bone7, 0.48F, 0.0F, 0.0F);
		bone7.setTextureOffset(78, 9).addBox(-1.1585F, -0.4909F, 0.0589F, 2.0F, 3.0F, 3.0F, -0.25F, false);
		bone7.setTextureOffset(108, 7).addBox(-1.1585F, -13.3078F, 1.1581F, 2.0F, 3.0F, 7.0F, -0.25F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone7.addChild(bone8);
		setRotationAngle(bone8, 0.2182F, 0.0F, 0.0F);
		bone8.setTextureOffset(108, 17).addBox(-1.0F, -5.1299F, 0.3275F, 2.0F, 4.0F, 7.0F, -0.25F, false);

		Main = new ModelRenderer(this);
		Main.setRotationPoint(2.5F, -13.3415F, -13.0335F);
		Panel1.addChild(Main);
		setRotationAngle(Main, 0.0F, -0.5236F, 0.0F);
		Main.setTextureOffset(94, 2).addBox(-1.6875F, 0.0F, -1.7611F, 12.0F, 3.0F, 2.0F, -0.25F, false);
		Main.setTextureOffset(94, 18).addBox(2.75F, -3.0F, 5.7389F, 4.0F, 17.0F, 2.0F, -0.25F, false);
		Main.setTextureOffset(93, 26).addBox(2.75F, -1.0F, 7.2389F, 3.0F, 3.0F, 2.0F, -0.25F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main.addChild(bone9);
		setRotationAngle(bone9, -1.1606F, 0.0F, 0.0F);
		bone9.setTextureOffset(40, 56).addBox(-6.0F, -2.1519F, 1.1256F, 12.0F, 3.0F, 2.0F, -0.25F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main.addChild(bone10);
		setRotationAngle(bone10, -0.9861F, 0.0F, 0.0F);
		bone10.setTextureOffset(40, 56).addBox(-4.9375F, -3.3841F, 1.4349F, 10.0F, 2.0F, 2.0F, -0.25F, false);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main.addChild(bone11);
		setRotationAngle(bone11, -0.9512F, 0.0F, 0.0F);
		bone11.setTextureOffset(40, 56).addBox(-3.9375F, -4.8234F, 1.5433F, 8.0F, 2.0F, 2.0F, -0.25F, false);
		bone11.setTextureOffset(43, 56).addBox(-3.4375F, -6.3234F, 1.5433F, 7.0F, 2.0F, 2.0F, -0.25F, false);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main.addChild(bone12);
		setRotationAngle(bone12, -0.8203F, 0.0F, 0.0F);
		bone12.setTextureOffset(43, 56).addBox(-2.4375F, -7.5374F, 2.3207F, 5.0F, 2.0F, 2.0F, -0.25F, false);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main.addChild(bone13);
		setRotationAngle(bone13, -0.2967F, 0.0F, 0.0F);
		bone13.setTextureOffset(12, 72).addBox(-1.9375F, -7.044F, 5.4788F, 4.0F, 3.0F, 2.0F, -0.25F, false);
		bone13.setTextureOffset(45, 28).addBox(-0.3125F, -7.5221F, 5.3951F, 2.0F, 2.0F, 2.0F, -0.25F, false);
		bone13.setTextureOffset(48, 30).addBox(-0.3125F, -6.0221F, 5.3951F, 2.0F, 1.0F, 2.0F, -0.25F, false);

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main.addChild(bone14);
		setRotationAngle(bone14, 0.0087F, 0.0F, 0.0F);
		bone14.setTextureOffset(16, 64).addBox(-1.875F, -6.0563F, 7.1247F, 4.0F, 2.0F, 3.0F, -0.25F, false);

		Panel2 = new ModelRenderer(this);
		Panel2.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelLayout.addChild(Panel2);
		setRotationAngle(Panel2, 0.0F, -0.5236F, 0.0F);


		Side3 = new ModelRenderer(this);
		Side3.setRotationPoint(-0.9252F, 0.0F, 0.1875F);
		Panel2.addChild(Side3);
		Side3.setTextureOffset(78, 15).addBox(1.25F, -15.25F, -9.625F, 2.0F, 16.0F, 6.0F, -0.24F, false);
		Side3.setTextureOffset(94, 7).addBox(1.25F, -13.3415F, -15.5335F, 2.0F, 3.0F, 5.0F, -0.25F, false);
		Side3.setTextureOffset(96, 18).addBox(1.25F, -15.3415F, -11.0335F, 2.0F, 6.0F, 2.0F, -0.25F, false);
		Side3.setTextureOffset(106, 28).addBox(1.25F, -21.75F, -7.625F, 2.0F, 8.0F, 4.0F, -0.25F, false);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.4085F, -7.5F, -12.125F);
		Side3.addChild(bone15);
		setRotationAngle(bone15, -0.5236F, 0.0F, 0.0F);
		bone15.setTextureOffset(78, 37).addBox(0.8415F, -3.8481F, -4.5311F, 2.0F, 3.0F, 8.0F, -0.241F, false);

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.4085F, 0.0F, -12.125F);
		Side3.addChild(bone16);
		setRotationAngle(bone16, 0.2443F, 0.0F, 0.0F);
		bone16.setTextureOffset(78, 0).addBox(0.8415F, -1.0593F, -3.0464F, 2.0F, 3.0F, 6.0F, -0.24F, false);

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.9085F, -0.8588F, -10.5031F);
		Side3.addChild(bone17);
		setRotationAngle(bone17, 0.48F, 0.0F, 0.0F);
		bone17.setTextureOffset(78, 9).addBox(0.3415F, -0.4909F, 0.0589F, 2.0F, 3.0F, 3.0F, -0.25F, false);
		bone17.setTextureOffset(108, 7).addBox(0.3415F, -13.3078F, 1.1581F, 2.0F, 3.0F, 7.0F, -0.25F, false);

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone17.addChild(bone18);
		setRotationAngle(bone18, 0.2182F, 0.0F, 0.0F);
		bone18.setTextureOffset(108, 17).addBox(0.5F, -5.1299F, 0.3275F, 2.0F, 4.0F, 7.0F, -0.25F, false);

		Side4 = new ModelRenderer(this);
		Side4.setRotationPoint(-0.3248F, 0.0F, -0.1875F);
		Panel2.addChild(Side4);
		setRotationAngle(Side4, 0.0F, -1.0472F, 0.0F);
		Side4.setTextureOffset(78, 15).addBox(-2.0F, -15.25F, -9.625F, 2.0F, 16.0F, 6.0F, -0.24F, false);
		Side4.setTextureOffset(94, 7).addBox(-2.0F, -13.3415F, -15.5335F, 2.0F, 3.0F, 5.0F, -0.25F, false);
		Side4.setTextureOffset(96, 18).addBox(-2.0F, -15.3415F, -11.0335F, 2.0F, 6.0F, 2.0F, -0.25F, false);
		Side4.setTextureOffset(106, 28).addBox(-2.0F, -21.75F, -7.625F, 2.0F, 8.0F, 4.0F, -0.25F, false);

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-1.3415F, -7.5F, -12.125F);
		Side4.addChild(bone19);
		setRotationAngle(bone19, -0.5236F, 0.0F, 0.0F);
		bone19.setTextureOffset(78, 37).addBox(-0.6585F, -3.8481F, -4.5311F, 2.0F, 3.0F, 8.0F, -0.241F, false);

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-1.3415F, 0.0F, -12.125F);
		Side4.addChild(bone20);
		setRotationAngle(bone20, 0.2443F, 0.0F, 0.0F);
		bone20.setTextureOffset(78, 0).addBox(-0.6585F, -1.0593F, -3.0464F, 2.0F, 3.0F, 6.0F, -0.24F, false);

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-0.8415F, -0.8588F, -10.5031F);
		Side4.addChild(bone21);
		setRotationAngle(bone21, 0.48F, 0.0F, 0.0F);
		bone21.setTextureOffset(78, 9).addBox(-1.1585F, -0.4909F, 0.0589F, 2.0F, 3.0F, 3.0F, -0.25F, false);
		bone21.setTextureOffset(108, 7).addBox(-1.1585F, -13.3078F, 1.1581F, 2.0F, 3.0F, 7.0F, -0.25F, false);

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone21.addChild(bone22);
		setRotationAngle(bone22, 0.2182F, 0.0F, 0.0F);
		bone22.setTextureOffset(108, 17).addBox(-1.0F, -5.1299F, 0.3275F, 2.0F, 4.0F, 7.0F, -0.25F, false);

		Main2 = new ModelRenderer(this);
		Main2.setRotationPoint(2.5F, -13.3415F, -13.0335F);
		Panel2.addChild(Main2);
		setRotationAngle(Main2, 0.0F, -0.5236F, 0.0F);
		Main2.setTextureOffset(94, 2).addBox(-1.6875F, 0.0F, -1.7611F, 12.0F, 3.0F, 2.0F, -0.25F, false);
		Main2.setTextureOffset(96, 2).addBox(-1.6875F, 0.0F, -2.0111F, 3.0F, 3.0F, 2.0F, -0.249F, false);
		Main2.setTextureOffset(96, 2).addBox(7.3125F, 0.0F, -2.0111F, 3.0F, 3.0F, 2.0F, -0.249F, false);
		Main2.setTextureOffset(94, 18).addBox(2.75F, -3.0F, 5.7389F, 4.0F, 17.0F, 2.0F, -0.25F, false);
		Main2.setTextureOffset(93, 26).addBox(2.75F, -1.0F, 7.2389F, 3.0F, 3.0F, 2.0F, -0.25F, false);

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main2.addChild(bone23);
		setRotationAngle(bone23, -1.1606F, 0.0F, 0.0F);
		bone23.setTextureOffset(40, 56).addBox(-6.0F, -2.1519F, 1.1256F, 12.0F, 3.0F, 2.0F, -0.25F, false);

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main2.addChild(bone24);
		setRotationAngle(bone24, -0.9861F, 0.0F, 0.0F);
		bone24.setTextureOffset(41, 55).addBox(-4.9375F, -3.3841F, 1.4349F, 4.0F, 2.0F, 2.0F, -0.25F, false);
		bone24.setTextureOffset(50, 54).addBox(1.0625F, -3.3841F, 1.4349F, 4.0F, 2.0F, 2.0F, -0.25F, false);

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main2.addChild(bone25);
		setRotationAngle(bone25, -0.9512F, 0.0F, 0.0F);
		bone25.setTextureOffset(41, 55).addBox(-3.9375F, -4.8234F, 1.5433F, 3.0F, 2.0F, 2.0F, -0.25F, false);
		bone25.setTextureOffset(50, 54).addBox(1.0625F, -4.8234F, 1.5433F, 3.0F, 2.0F, 2.0F, -0.25F, false);
		bone25.setTextureOffset(41, 55).addBox(-1.4375F, -4.8234F, 1.5433F, 3.0F, 1.0F, 2.0F, -0.25F, false);
		bone25.setTextureOffset(45, 57).addBox(-3.4375F, -6.3234F, 1.5433F, 7.0F, 2.0F, 2.0F, -0.25F, false);

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main2.addChild(bone26);
		setRotationAngle(bone26, -0.8203F, 0.0F, 0.0F);
		bone26.setTextureOffset(50, 54).addBox(-2.4375F, -7.5374F, 2.3207F, 5.0F, 2.0F, 2.0F, -0.25F, false);

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main2.addChild(bone27);
		setRotationAngle(bone27, -0.2967F, 0.0F, 0.0F);
		bone27.setTextureOffset(12, 72).addBox(-1.9375F, -7.044F, 5.4788F, 4.0F, 3.0F, 2.0F, -0.25F, false);

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main2.addChild(bone28);
		setRotationAngle(bone28, 0.0087F, 0.0F, 0.0F);
		bone28.setTextureOffset(16, 66).addBox(-1.875F, -8.0563F, 7.1247F, 4.0F, 4.0F, 3.0F, -0.25F, false);

		Panel3 = new ModelRenderer(this);
		Panel3.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelLayout.addChild(Panel3);
		setRotationAngle(Panel3, 0.0F, -1.5708F, 0.0F);


		Side5 = new ModelRenderer(this);
		Side5.setRotationPoint(-0.9252F, 0.0F, 0.1875F);
		Panel3.addChild(Side5);
		Side5.setTextureOffset(78, 15).addBox(1.25F, -15.25F, -9.625F, 2.0F, 16.0F, 6.0F, -0.24F, false);
		Side5.setTextureOffset(94, 7).addBox(1.25F, -13.3415F, -15.5335F, 2.0F, 3.0F, 5.0F, -0.25F, false);
		Side5.setTextureOffset(96, 18).addBox(1.25F, -15.3415F, -11.0335F, 2.0F, 6.0F, 2.0F, -0.25F, false);
		Side5.setTextureOffset(106, 28).addBox(1.25F, -21.75F, -7.625F, 2.0F, 8.0F, 4.0F, -0.25F, false);

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(0.4085F, -7.5F, -12.125F);
		Side5.addChild(bone29);
		setRotationAngle(bone29, -0.5236F, 0.0F, 0.0F);
		bone29.setTextureOffset(78, 37).addBox(0.8415F, -3.8481F, -4.5311F, 2.0F, 3.0F, 8.0F, -0.241F, false);

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(0.4085F, 0.0F, -12.125F);
		Side5.addChild(bone30);
		setRotationAngle(bone30, 0.2443F, 0.0F, 0.0F);
		bone30.setTextureOffset(78, 0).addBox(0.8415F, -1.0593F, -3.0464F, 2.0F, 3.0F, 6.0F, -0.24F, false);

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(0.9085F, -0.8588F, -10.5031F);
		Side5.addChild(bone31);
		setRotationAngle(bone31, 0.48F, 0.0F, 0.0F);
		bone31.setTextureOffset(78, 9).addBox(0.3415F, -0.4909F, 0.0589F, 2.0F, 3.0F, 3.0F, -0.25F, false);
		bone31.setTextureOffset(108, 7).addBox(0.3415F, -13.3078F, 1.1581F, 2.0F, 3.0F, 7.0F, -0.25F, false);

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone31.addChild(bone32);
		setRotationAngle(bone32, 0.2182F, 0.0F, 0.0F);
		bone32.setTextureOffset(108, 17).addBox(0.5F, -5.1299F, 0.3275F, 2.0F, 4.0F, 7.0F, -0.25F, false);

		Side6 = new ModelRenderer(this);
		Side6.setRotationPoint(-0.3248F, 0.0F, -0.1875F);
		Panel3.addChild(Side6);
		setRotationAngle(Side6, 0.0F, -1.0472F, 0.0F);
		Side6.setTextureOffset(78, 15).addBox(-2.0F, -15.25F, -9.625F, 2.0F, 16.0F, 6.0F, -0.24F, false);
		Side6.setTextureOffset(94, 7).addBox(-2.0F, -13.3415F, -15.5335F, 2.0F, 3.0F, 5.0F, -0.25F, false);
		Side6.setTextureOffset(96, 18).addBox(-2.0F, -15.3415F, -11.0335F, 2.0F, 6.0F, 2.0F, -0.25F, false);
		Side6.setTextureOffset(106, 28).addBox(-2.0F, -21.75F, -7.625F, 2.0F, 8.0F, 4.0F, -0.25F, false);

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-1.3415F, -7.5F, -12.125F);
		Side6.addChild(bone33);
		setRotationAngle(bone33, -0.5236F, 0.0F, 0.0F);
		bone33.setTextureOffset(78, 37).addBox(-0.6585F, -3.8481F, -4.5311F, 2.0F, 3.0F, 8.0F, -0.241F, false);

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(-1.3415F, 0.0F, -12.125F);
		Side6.addChild(bone34);
		setRotationAngle(bone34, 0.2443F, 0.0F, 0.0F);
		bone34.setTextureOffset(78, 0).addBox(-0.6585F, -1.0593F, -3.0464F, 2.0F, 3.0F, 6.0F, -0.24F, false);

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(-0.8415F, -0.8588F, -10.5031F);
		Side6.addChild(bone35);
		setRotationAngle(bone35, 0.48F, 0.0F, 0.0F);
		bone35.setTextureOffset(78, 9).addBox(-1.1585F, -0.4909F, 0.0589F, 2.0F, 3.0F, 3.0F, -0.25F, false);
		bone35.setTextureOffset(108, 7).addBox(-1.1585F, -13.3078F, 1.1581F, 2.0F, 3.0F, 7.0F, -0.25F, false);

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone35.addChild(bone36);
		setRotationAngle(bone36, 0.2182F, 0.0F, 0.0F);
		bone36.setTextureOffset(108, 17).addBox(-1.0F, -5.1299F, 0.3275F, 2.0F, 4.0F, 7.0F, -0.25F, false);

		Main3 = new ModelRenderer(this);
		Main3.setRotationPoint(2.5F, -13.3415F, -13.0335F);
		Panel3.addChild(Main3);
		setRotationAngle(Main3, 0.0F, -0.5236F, 0.0F);
		Main3.setTextureOffset(94, 2).addBox(-1.6875F, 0.0F, -1.7611F, 12.0F, 3.0F, 2.0F, -0.25F, false);
		Main3.setTextureOffset(39, 84).addBox(8.125F, 0.5F, -2.1361F, 2.0F, 2.0F, 2.0F, -0.4375F, false);
		Main3.setTextureOffset(94, 18).addBox(2.75F, -3.0F, 5.7389F, 4.0F, 17.0F, 2.0F, -0.25F, false);
		Main3.setTextureOffset(93, 26).addBox(2.75F, -1.0F, 7.2389F, 3.0F, 3.0F, 2.0F, -0.25F, false);

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main3.addChild(bone37);
		setRotationAngle(bone37, -1.1606F, 0.0F, 0.0F);
		bone37.setTextureOffset(40, 56).addBox(-6.0F, -2.1519F, 1.1256F, 12.0F, 3.0F, 2.0F, -0.25F, false);

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main3.addChild(bone38);
		setRotationAngle(bone38, -0.9861F, 0.0F, 0.0F);
		bone38.setTextureOffset(40, 56).addBox(-4.9375F, -3.3841F, 1.4349F, 10.0F, 2.0F, 2.0F, -0.25F, false);

		bone101 = new ModelRenderer(this);
		bone101.setRotationPoint(1.0625F, -2.3841F, 2.3308F);
		bone38.addChild(bone101);
		setRotationAngle(bone101, 0.0F, 0.0F, -0.2182F);
		bone101.setTextureOffset(37, 15).addBox(-2.0F, -0.6875F, -1.0208F, 4.0F, 2.0F, 2.0F, -0.24F, false);
		bone101.setTextureOffset(48, 66).addBox(-1.6845F, -0.36F, -1.0373F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone101.setTextureOffset(39, 84).addBox(0.3155F, -0.36F, -1.0373F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bone101.setTextureOffset(48, 66).addBox(-1.6845F, -0.36F, -2.4748F, 1.0F, 1.0F, 2.0F, -0.375F, false);
		bone101.setTextureOffset(37, 15).addBox(0.375F, -0.6875F, -1.0833F, 2.0F, 2.0F, 2.0F, -0.3125F, false);
		bone101.setTextureOffset(37, 15).addBox(-2.375F, -0.6875F, -1.0833F, 2.0F, 2.0F, 2.0F, -0.3125F, false);

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main3.addChild(bone39);
		setRotationAngle(bone39, -0.9512F, 0.0F, 0.0F);
		bone39.setTextureOffset(40, 56).addBox(-3.9375F, -4.8234F, 1.5433F, 8.0F, 2.0F, 2.0F, -0.25F, false);
		bone39.setTextureOffset(39, 52).addBox(-3.4375F, -6.3234F, 1.5433F, 7.0F, 2.0F, 2.0F, -0.25F, false);

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main3.addChild(bone40);
		setRotationAngle(bone40, -0.8203F, 0.0F, 0.0F);
		bone40.setTextureOffset(40, 56).addBox(-2.4375F, -7.5374F, 2.3207F, 5.0F, 2.0F, 2.0F, -0.25F, false);

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main3.addChild(bone41);
		setRotationAngle(bone41, -0.2967F, 0.0F, 0.0F);
		bone41.setTextureOffset(12, 72).addBox(-1.9375F, -7.044F, 5.4788F, 4.0F, 3.0F, 2.0F, -0.25F, false);

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main3.addChild(bone42);
		setRotationAngle(bone42, 0.0087F, 0.0F, 0.0F);
		bone42.setTextureOffset(12, 72).addBox(-1.875F, -6.0563F, 7.1247F, 4.0F, 2.0F, 3.0F, -0.25F, false);

		Panel4 = new ModelRenderer(this);
		Panel4.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelLayout.addChild(Panel4);
		setRotationAngle(Panel4, 0.0F, -2.618F, 0.0F);


		Side7 = new ModelRenderer(this);
		Side7.setRotationPoint(-0.9252F, 0.0F, 0.1875F);
		Panel4.addChild(Side7);
		Side7.setTextureOffset(78, 15).addBox(1.25F, -15.25F, -9.625F, 2.0F, 16.0F, 6.0F, -0.24F, false);
		Side7.setTextureOffset(94, 7).addBox(1.25F, -13.3415F, -15.5335F, 2.0F, 3.0F, 5.0F, -0.25F, false);
		Side7.setTextureOffset(96, 18).addBox(1.25F, -15.3415F, -11.0335F, 2.0F, 6.0F, 2.0F, -0.25F, false);
		Side7.setTextureOffset(106, 28).addBox(1.25F, -21.75F, -7.625F, 2.0F, 8.0F, 4.0F, -0.25F, false);

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(0.4085F, -7.5F, -12.125F);
		Side7.addChild(bone43);
		setRotationAngle(bone43, -0.5236F, 0.0F, 0.0F);
		bone43.setTextureOffset(78, 37).addBox(0.8415F, -3.8481F, -4.5311F, 2.0F, 3.0F, 8.0F, -0.241F, false);

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(0.4085F, 0.0F, -12.125F);
		Side7.addChild(bone44);
		setRotationAngle(bone44, 0.2443F, 0.0F, 0.0F);
		bone44.setTextureOffset(78, 0).addBox(0.8415F, -1.0593F, -3.0464F, 2.0F, 3.0F, 6.0F, -0.24F, false);

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(0.9085F, -0.8588F, -10.5031F);
		Side7.addChild(bone45);
		setRotationAngle(bone45, 0.48F, 0.0F, 0.0F);
		bone45.setTextureOffset(78, 9).addBox(0.3415F, -0.4909F, 0.0589F, 2.0F, 3.0F, 3.0F, -0.25F, false);
		bone45.setTextureOffset(108, 7).addBox(0.3415F, -13.3078F, 1.1581F, 2.0F, 3.0F, 7.0F, -0.25F, false);

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone45.addChild(bone46);
		setRotationAngle(bone46, 0.2182F, 0.0F, 0.0F);
		bone46.setTextureOffset(108, 17).addBox(0.5F, -5.1299F, 0.3275F, 2.0F, 4.0F, 7.0F, -0.25F, false);

		Side8 = new ModelRenderer(this);
		Side8.setRotationPoint(-0.3248F, 0.0F, -0.1875F);
		Panel4.addChild(Side8);
		setRotationAngle(Side8, 0.0F, -1.0472F, 0.0F);
		Side8.setTextureOffset(78, 15).addBox(-2.0F, -15.25F, -9.625F, 2.0F, 16.0F, 6.0F, -0.24F, false);
		Side8.setTextureOffset(94, 7).addBox(-2.0F, -13.3415F, -15.5335F, 2.0F, 3.0F, 5.0F, -0.25F, false);
		Side8.setTextureOffset(96, 18).addBox(-2.0F, -15.3415F, -11.0335F, 2.0F, 6.0F, 2.0F, -0.25F, false);
		Side8.setTextureOffset(106, 28).addBox(-2.0F, -21.75F, -7.625F, 2.0F, 8.0F, 4.0F, -0.25F, false);

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(-1.3415F, -7.5F, -12.125F);
		Side8.addChild(bone47);
		setRotationAngle(bone47, -0.5236F, 0.0F, 0.0F);
		bone47.setTextureOffset(78, 37).addBox(-0.6585F, -3.8481F, -4.5311F, 2.0F, 3.0F, 8.0F, -0.241F, false);

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(-1.3415F, 0.0F, -12.125F);
		Side8.addChild(bone48);
		setRotationAngle(bone48, 0.2443F, 0.0F, 0.0F);
		bone48.setTextureOffset(78, 0).addBox(-0.6585F, -1.0593F, -3.0464F, 2.0F, 3.0F, 6.0F, -0.24F, false);

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(-0.8415F, -0.8588F, -10.5031F);
		Side8.addChild(bone49);
		setRotationAngle(bone49, 0.48F, 0.0F, 0.0F);
		bone49.setTextureOffset(78, 9).addBox(-1.1585F, -0.4909F, 0.0589F, 2.0F, 3.0F, 3.0F, -0.25F, false);
		bone49.setTextureOffset(108, 7).addBox(-1.1585F, -13.3078F, 1.1581F, 2.0F, 3.0F, 7.0F, -0.25F, false);

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone49.addChild(bone50);
		setRotationAngle(bone50, 0.2182F, 0.0F, 0.0F);
		bone50.setTextureOffset(108, 17).addBox(-1.0F, -5.1299F, 0.3275F, 2.0F, 4.0F, 7.0F, -0.25F, false);

		Main4 = new ModelRenderer(this);
		Main4.setRotationPoint(2.5F, -13.3415F, -13.0335F);
		Panel4.addChild(Main4);
		setRotationAngle(Main4, 0.0F, -0.5236F, 0.0F);
		Main4.setTextureOffset(94, 2).addBox(-1.6875F, 0.0F, -1.7611F, 12.0F, 3.0F, 2.0F, -0.25F, false);
		Main4.setTextureOffset(94, 18).addBox(2.75F, -3.0F, 5.7389F, 4.0F, 17.0F, 2.0F, -0.25F, false);
		Main4.setTextureOffset(93, 26).addBox(2.75F, -1.0F, 7.2389F, 3.0F, 3.0F, 2.0F, -0.25F, false);

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main4.addChild(bone51);
		setRotationAngle(bone51, -1.1606F, 0.0F, 0.0F);
		bone51.setTextureOffset(40, 56).addBox(-6.0F, -2.1519F, 1.1256F, 12.0F, 3.0F, 2.0F, -0.25F, false);

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main4.addChild(bone52);
		setRotationAngle(bone52, -0.9861F, 0.0F, 0.0F);
		bone52.setTextureOffset(40, 56).addBox(-4.9375F, -3.3841F, 1.4349F, 10.0F, 2.0F, 2.0F, -0.25F, false);

		bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main4.addChild(bone53);
		setRotationAngle(bone53, -0.9512F, 0.0F, 0.0F);
		bone53.setTextureOffset(40, 56).addBox(-3.9375F, -4.8234F, 1.5433F, 8.0F, 2.0F, 2.0F, -0.25F, false);
		bone53.setTextureOffset(41, 56).addBox(-3.4375F, -6.3234F, 1.5433F, 7.0F, 2.0F, 2.0F, -0.25F, false);

		bone54 = new ModelRenderer(this);
		bone54.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main4.addChild(bone54);
		setRotationAngle(bone54, -0.8203F, 0.0F, 0.0F);
		bone54.setTextureOffset(50, 54).addBox(-2.4375F, -7.5374F, 2.3207F, 5.0F, 2.0F, 2.0F, -0.25F, false);

		bone55 = new ModelRenderer(this);
		bone55.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main4.addChild(bone55);
		setRotationAngle(bone55, -0.2967F, 0.0F, 0.0F);
		bone55.setTextureOffset(12, 72).addBox(-1.9375F, -7.044F, 5.4788F, 4.0F, 3.0F, 2.0F, -0.25F, false);

		bone56 = new ModelRenderer(this);
		bone56.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main4.addChild(bone56);
		setRotationAngle(bone56, 0.0087F, 0.0F, 0.0F);
		bone56.setTextureOffset(16, 66).addBox(-1.875F, -8.0563F, 7.1247F, 4.0F, 4.0F, 3.0F, -0.25F, false);

		Panel5 = new ModelRenderer(this);
		Panel5.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelLayout.addChild(Panel5);
		setRotationAngle(Panel5, 0.0F, 2.618F, 0.0F);


		Side9 = new ModelRenderer(this);
		Side9.setRotationPoint(-0.9252F, 0.0F, 0.1875F);
		Panel5.addChild(Side9);
		Side9.setTextureOffset(78, 15).addBox(1.25F, -15.25F, -9.625F, 2.0F, 16.0F, 6.0F, -0.24F, false);
		Side9.setTextureOffset(94, 7).addBox(1.25F, -13.3415F, -15.5335F, 2.0F, 3.0F, 5.0F, -0.25F, false);
		Side9.setTextureOffset(96, 18).addBox(1.25F, -15.3415F, -11.0335F, 2.0F, 6.0F, 2.0F, -0.25F, false);
		Side9.setTextureOffset(106, 28).addBox(1.25F, -21.75F, -7.625F, 2.0F, 8.0F, 4.0F, -0.25F, false);

		bone57 = new ModelRenderer(this);
		bone57.setRotationPoint(0.4085F, -7.5F, -12.125F);
		Side9.addChild(bone57);
		setRotationAngle(bone57, -0.5236F, 0.0F, 0.0F);
		bone57.setTextureOffset(78, 37).addBox(0.8415F, -3.8481F, -4.5311F, 2.0F, 3.0F, 8.0F, -0.241F, false);

		bone58 = new ModelRenderer(this);
		bone58.setRotationPoint(0.4085F, 0.0F, -12.125F);
		Side9.addChild(bone58);
		setRotationAngle(bone58, 0.2443F, 0.0F, 0.0F);
		bone58.setTextureOffset(78, 0).addBox(0.8415F, -1.0593F, -3.0464F, 2.0F, 3.0F, 6.0F, -0.24F, false);

		bone59 = new ModelRenderer(this);
		bone59.setRotationPoint(0.9085F, -0.8588F, -10.5031F);
		Side9.addChild(bone59);
		setRotationAngle(bone59, 0.48F, 0.0F, 0.0F);
		bone59.setTextureOffset(78, 9).addBox(0.3415F, -0.4909F, 0.0589F, 2.0F, 3.0F, 3.0F, -0.25F, false);
		bone59.setTextureOffset(108, 7).addBox(0.3415F, -13.3078F, 1.1581F, 2.0F, 3.0F, 7.0F, -0.25F, false);

		bone60 = new ModelRenderer(this);
		bone60.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone59.addChild(bone60);
		setRotationAngle(bone60, 0.2182F, 0.0F, 0.0F);
		bone60.setTextureOffset(108, 17).addBox(0.5F, -5.1299F, 0.3275F, 2.0F, 4.0F, 7.0F, -0.25F, false);

		Side10 = new ModelRenderer(this);
		Side10.setRotationPoint(-0.3248F, 0.0F, -0.1875F);
		Panel5.addChild(Side10);
		setRotationAngle(Side10, 0.0F, -1.0472F, 0.0F);
		Side10.setTextureOffset(78, 15).addBox(-2.0F, -15.25F, -9.625F, 2.0F, 16.0F, 6.0F, -0.24F, false);
		Side10.setTextureOffset(94, 7).addBox(-2.0F, -13.3415F, -15.5335F, 2.0F, 3.0F, 5.0F, -0.25F, false);
		Side10.setTextureOffset(96, 18).addBox(-2.0F, -15.3415F, -11.0335F, 2.0F, 6.0F, 2.0F, -0.25F, false);
		Side10.setTextureOffset(106, 28).addBox(-2.0F, -21.75F, -7.625F, 2.0F, 8.0F, 4.0F, -0.25F, false);

		bone61 = new ModelRenderer(this);
		bone61.setRotationPoint(-1.3415F, -7.5F, -12.125F);
		Side10.addChild(bone61);
		setRotationAngle(bone61, -0.5236F, 0.0F, 0.0F);
		bone61.setTextureOffset(78, 37).addBox(-0.6585F, -3.8481F, -4.5311F, 2.0F, 3.0F, 8.0F, -0.241F, false);

		bone62 = new ModelRenderer(this);
		bone62.setRotationPoint(-1.3415F, 0.0F, -12.125F);
		Side10.addChild(bone62);
		setRotationAngle(bone62, 0.2443F, 0.0F, 0.0F);
		bone62.setTextureOffset(78, 0).addBox(-0.6585F, -1.0593F, -3.0464F, 2.0F, 3.0F, 6.0F, -0.24F, false);

		bone63 = new ModelRenderer(this);
		bone63.setRotationPoint(-0.8415F, -0.8588F, -10.5031F);
		Side10.addChild(bone63);
		setRotationAngle(bone63, 0.48F, 0.0F, 0.0F);
		bone63.setTextureOffset(78, 9).addBox(-1.1585F, -0.4909F, 0.0589F, 2.0F, 3.0F, 3.0F, -0.25F, false);
		bone63.setTextureOffset(108, 7).addBox(-1.1585F, -13.3078F, 1.1581F, 2.0F, 3.0F, 7.0F, -0.25F, false);

		bone64 = new ModelRenderer(this);
		bone64.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone63.addChild(bone64);
		setRotationAngle(bone64, 0.2182F, 0.0F, 0.0F);
		bone64.setTextureOffset(108, 17).addBox(-1.0F, -5.1299F, 0.3275F, 2.0F, 4.0F, 7.0F, -0.25F, false);

		Main5 = new ModelRenderer(this);
		Main5.setRotationPoint(2.5F, -13.3415F, -13.0335F);
		Panel5.addChild(Main5);
		setRotationAngle(Main5, 0.0F, -0.5236F, 0.0F);
		Main5.setTextureOffset(94, 2).addBox(-1.6875F, 0.0F, -1.7611F, 12.0F, 3.0F, 2.0F, -0.25F, false);
		Main5.setTextureOffset(94, 18).addBox(2.75F, -3.0F, 5.7389F, 4.0F, 17.0F, 2.0F, -0.25F, false);
		Main5.setTextureOffset(93, 26).addBox(2.75F, -1.0F, 7.2389F, 3.0F, 3.0F, 2.0F, -0.25F, false);

		bone65 = new ModelRenderer(this);
		bone65.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main5.addChild(bone65);
		setRotationAngle(bone65, -1.1606F, 0.0F, 0.0F);
		bone65.setTextureOffset(40, 56).addBox(-6.0F, -2.1519F, 1.1256F, 12.0F, 3.0F, 2.0F, -0.25F, false);

		bone66 = new ModelRenderer(this);
		bone66.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main5.addChild(bone66);
		setRotationAngle(bone66, -0.9861F, 0.0F, 0.0F);
		bone66.setTextureOffset(41, 51).addBox(-5.0F, -3.3841F, 1.4349F, 4.0F, 2.0F, 2.0F, -0.25F, false);
		bone66.setTextureOffset(50, 54).addBox(1.0F, -3.3841F, 1.4349F, 4.0F, 2.0F, 2.0F, -0.25F, false);

		bone67 = new ModelRenderer(this);
		bone67.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main5.addChild(bone67);
		setRotationAngle(bone67, -0.9512F, 0.0F, 0.0F);
		bone67.setTextureOffset(41, 51).addBox(-4.0F, -4.8234F, 1.5433F, 3.0F, 2.0F, 2.0F, -0.25F, false);
		bone67.setTextureOffset(50, 54).addBox(1.0F, -4.8234F, 1.5433F, 3.0F, 2.0F, 2.0F, -0.25F, false);
		bone67.setTextureOffset(42, 57).addBox(-1.5F, -4.8234F, 1.5433F, 3.0F, 1.0F, 2.0F, -0.25F, false);
		bone67.setTextureOffset(42, 54).addBox(-3.4375F, -6.3234F, 1.5433F, 7.0F, 2.0F, 2.0F, -0.25F, false);

		bone68 = new ModelRenderer(this);
		bone68.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main5.addChild(bone68);
		setRotationAngle(bone68, -0.8203F, 0.0F, 0.0F);
		bone68.setTextureOffset(50, 54).addBox(-2.4375F, -7.5374F, 2.3207F, 5.0F, 2.0F, 2.0F, -0.25F, false);

		bone69 = new ModelRenderer(this);
		bone69.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main5.addChild(bone69);
		setRotationAngle(bone69, -0.2967F, 0.0F, 0.0F);
		bone69.setTextureOffset(12, 72).addBox(-1.9375F, -7.044F, 5.4788F, 4.0F, 3.0F, 2.0F, -0.25F, false);

		bone70 = new ModelRenderer(this);
		bone70.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main5.addChild(bone70);
		setRotationAngle(bone70, 0.0087F, 0.0F, 0.0F);
		bone70.setTextureOffset(20, 7).addBox(-1.875F, -6.0563F, 7.1247F, 4.0F, 2.0F, 3.0F, -0.25F, false);
		bone70.setTextureOffset(20, 7).addBox(-1.875F, -6.0563F, 4.6247F, 1.0F, 1.0F, 3.0F, -0.25F, false);
		bone70.setTextureOffset(20, 7).addBox(1.125F, -6.0563F, 4.6247F, 1.0F, 1.0F, 3.0F, -0.25F, false);
		bone70.setTextureOffset(20, 7).addBox(-1.375F, -6.0563F, 4.6247F, 3.0F, 1.0F, 1.0F, -0.25F, false);
		bone70.setTextureOffset(20, 7).addBox(-0.875F, -6.8063F, 5.31F, 2.0F, 2.0F, 2.0F, -0.25F, false);

		Panel6 = new ModelRenderer(this);
		Panel6.setRotationPoint(0.0F, 0.0F, 0.0F);
		PanelLayout.addChild(Panel6);
		setRotationAngle(Panel6, 0.0F, 1.5708F, 0.0F);


		Side11 = new ModelRenderer(this);
		Side11.setRotationPoint(-0.9252F, 0.0F, 0.1875F);
		Panel6.addChild(Side11);
		Side11.setTextureOffset(78, 15).addBox(1.25F, -15.25F, -9.625F, 2.0F, 16.0F, 6.0F, -0.24F, false);
		Side11.setTextureOffset(94, 7).addBox(1.25F, -13.3415F, -15.5335F, 2.0F, 3.0F, 5.0F, -0.25F, false);
		Side11.setTextureOffset(96, 18).addBox(1.25F, -15.3415F, -11.0335F, 2.0F, 6.0F, 2.0F, -0.25F, false);
		Side11.setTextureOffset(106, 28).addBox(1.25F, -21.75F, -7.625F, 2.0F, 8.0F, 4.0F, -0.25F, false);

		bone71 = new ModelRenderer(this);
		bone71.setRotationPoint(0.4085F, -7.5F, -12.125F);
		Side11.addChild(bone71);
		setRotationAngle(bone71, -0.5236F, 0.0F, 0.0F);
		bone71.setTextureOffset(78, 37).addBox(0.8415F, -3.8481F, -4.5311F, 2.0F, 3.0F, 8.0F, -0.25F, false);

		bone72 = new ModelRenderer(this);
		bone72.setRotationPoint(0.4085F, 0.0F, -12.125F);
		Side11.addChild(bone72);
		setRotationAngle(bone72, 0.2443F, 0.0F, 0.0F);
		bone72.setTextureOffset(78, 0).addBox(0.8415F, -1.0593F, -3.0464F, 2.0F, 3.0F, 6.0F, -0.24F, false);

		bone73 = new ModelRenderer(this);
		bone73.setRotationPoint(0.9085F, -0.8588F, -10.5031F);
		Side11.addChild(bone73);
		setRotationAngle(bone73, 0.48F, 0.0F, 0.0F);
		bone73.setTextureOffset(78, 9).addBox(0.3415F, -0.4909F, 0.0589F, 2.0F, 3.0F, 3.0F, -0.25F, false);
		bone73.setTextureOffset(108, 7).addBox(0.3415F, -13.3078F, 1.1581F, 2.0F, 3.0F, 7.0F, -0.25F, false);

		bone74 = new ModelRenderer(this);
		bone74.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone73.addChild(bone74);
		setRotationAngle(bone74, 0.2182F, 0.0F, 0.0F);
		bone74.setTextureOffset(108, 17).addBox(0.5F, -5.1299F, 0.3275F, 2.0F, 4.0F, 7.0F, -0.25F, false);

		Side12 = new ModelRenderer(this);
		Side12.setRotationPoint(-0.3248F, 0.0F, -0.1875F);
		Panel6.addChild(Side12);
		setRotationAngle(Side12, 0.0F, -1.0472F, 0.0F);
		Side12.setTextureOffset(78, 15).addBox(-2.0F, -15.25F, -9.625F, 2.0F, 16.0F, 6.0F, -0.24F, false);
		Side12.setTextureOffset(94, 7).addBox(-2.0F, -13.3415F, -15.5335F, 2.0F, 3.0F, 5.0F, -0.25F, false);
		Side12.setTextureOffset(96, 18).addBox(-2.0F, -15.3415F, -11.0335F, 2.0F, 6.0F, 2.0F, -0.25F, false);
		Side12.setTextureOffset(106, 28).addBox(-2.0F, -21.75F, -7.625F, 2.0F, 8.0F, 4.0F, -0.25F, false);

		bone75 = new ModelRenderer(this);
		bone75.setRotationPoint(-1.3415F, -7.5F, -12.125F);
		Side12.addChild(bone75);
		setRotationAngle(bone75, -0.5236F, 0.0F, 0.0F);
		bone75.setTextureOffset(78, 37).addBox(-0.6585F, -3.8481F, -4.5311F, 2.0F, 3.0F, 8.0F, -0.241F, false);

		bone76 = new ModelRenderer(this);
		bone76.setRotationPoint(-1.3415F, 0.0F, -12.125F);
		Side12.addChild(bone76);
		setRotationAngle(bone76, 0.2443F, 0.0F, 0.0F);
		bone76.setTextureOffset(78, 0).addBox(-0.6585F, -1.0593F, -3.0464F, 2.0F, 3.0F, 6.0F, -0.24F, false);

		bone77 = new ModelRenderer(this);
		bone77.setRotationPoint(-0.8415F, -0.8588F, -10.5031F);
		Side12.addChild(bone77);
		setRotationAngle(bone77, 0.48F, 0.0F, 0.0F);
		bone77.setTextureOffset(78, 9).addBox(-1.1585F, -0.4909F, 0.0589F, 2.0F, 3.0F, 3.0F, -0.25F, false);
		bone77.setTextureOffset(108, 7).addBox(-1.1585F, -13.3078F, 1.1581F, 2.0F, 3.0F, 7.0F, -0.25F, false);

		bone78 = new ModelRenderer(this);
		bone78.setRotationPoint(-0.1585F, -7.6993F, 6.3243F);
		bone77.addChild(bone78);
		setRotationAngle(bone78, 0.2182F, 0.0F, 0.0F);
		bone78.setTextureOffset(108, 17).addBox(-1.0F, -5.1299F, 0.3275F, 2.0F, 4.0F, 7.0F, -0.25F, false);

		Main6 = new ModelRenderer(this);
		Main6.setRotationPoint(2.5F, -13.3415F, -13.0335F);
		Panel6.addChild(Main6);
		setRotationAngle(Main6, 0.0F, -0.5236F, 0.0F);
		Main6.setTextureOffset(94, 2).addBox(-1.6875F, 0.0F, -1.7611F, 12.0F, 3.0F, 2.0F, -0.25F, false);
		Main6.setTextureOffset(94, 18).addBox(2.75F, -3.0F, 5.7389F, 4.0F, 17.0F, 2.0F, -0.25F, false);
		Main6.setTextureOffset(93, 26).addBox(2.75F, -1.0F, 7.2389F, 3.0F, 3.0F, 2.0F, -0.25F, false);

		bone79 = new ModelRenderer(this);
		bone79.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main6.addChild(bone79);
		setRotationAngle(bone79, -1.1606F, 0.0F, 0.0F);
		bone79.setTextureOffset(40, 56).addBox(-6.0F, -2.1519F, 1.1256F, 12.0F, 3.0F, 2.0F, -0.25F, false);
		bone79.setTextureOffset(38, 11).addBox(3.25F, -0.6519F, 1.1256F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bone79.setTextureOffset(40, 47).addBox(3.25F, -0.6519F, -0.1244F, 1.0F, 1.0F, 2.0F, -0.25F, false);

		bone80 = new ModelRenderer(this);
		bone80.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main6.addChild(bone80);
		setRotationAngle(bone80, -0.9861F, 0.0F, 0.0F);
		bone80.setTextureOffset(40, 56).addBox(-4.9375F, -3.3841F, 1.4349F, 10.0F, 2.0F, 2.0F, -0.25F, false);

		bone81 = new ModelRenderer(this);
		bone81.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main6.addChild(bone81);
		setRotationAngle(bone81, -0.9512F, 0.0F, 0.0F);
		bone81.setTextureOffset(50, 54).addBox(-2.6875F, -4.8234F, 1.5433F, 2.0F, 2.0F, 2.0F, -0.25F, false);
		bone81.setTextureOffset(50, 54).addBox(0.75F, -4.8234F, 1.5433F, 2.0F, 2.0F, 2.0F, -0.25F, false);
		bone81.setTextureOffset(50, 54).addBox(-4.1875F, -3.8234F, 1.5433F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		bone81.setTextureOffset(50, 54).addBox(2.25F, -3.8234F, 1.5433F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		bone81.setTextureOffset(50, 54).addBox(-1.5F, -4.0734F, 1.5433F, 3.0F, 2.0F, 2.0F, -0.251F, false);
		bone81.setTextureOffset(50, 54).addBox(-1.5F, -7.4484F, 1.5433F, 3.0F, 2.0F, 2.0F, -0.251F, false);
		bone81.setTextureOffset(50, 54).addBox(-4.1875F, -4.3234F, 1.5433F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		bone81.setTextureOffset(50, 54).addBox(2.25F, -4.3234F, 1.5433F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		bone81.setTextureOffset(50, 54).addBox(-3.1875F, -4.8234F, 1.5433F, 1.0F, 1.0F, 2.0F, -0.25F, false);
		bone81.setTextureOffset(50, 54).addBox(2.75F, -4.8234F, 1.5433F, 1.0F, 1.0F, 2.0F, -0.25F, false);
		bone81.setTextureOffset(50, 54).addBox(-3.6875F, -4.8234F, 1.5433F, 1.0F, 1.0F, 2.0F, -0.25F, false);
		bone81.setTextureOffset(50, 54).addBox(2.25F, -4.8234F, 1.5433F, 1.0F, 1.0F, 2.0F, -0.25F, false);
		bone81.setTextureOffset(50, 54).addBox(-2.6875F, -6.3234F, 1.5433F, 2.0F, 2.0F, 2.0F, -0.25F, false);
		bone81.setTextureOffset(50, 54).addBox(0.75F, -6.3234F, 1.5433F, 2.0F, 2.0F, 2.0F, -0.25F, false);
		bone81.setTextureOffset(50, 54).addBox(-3.1875F, -6.3234F, 1.5433F, 1.0F, 2.0F, 2.0F, -0.25F, false);
		bone81.setTextureOffset(50, 54).addBox(2.25F, -6.3234F, 1.5433F, 1.0F, 2.0F, 2.0F, -0.25F, false);

		bone82 = new ModelRenderer(this);
		bone82.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main6.addChild(bone82);
		setRotationAngle(bone82, -0.8203F, 0.0F, 0.0F);
		bone82.setTextureOffset(50, 54).addBox(-2.4375F, -7.5374F, 2.3207F, 5.0F, 2.0F, 2.0F, -0.25F, false);

		bone83 = new ModelRenderer(this);
		bone83.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main6.addChild(bone83);
		setRotationAngle(bone83, -0.2967F, 0.0F, 0.0F);
		bone83.setTextureOffset(12, 72).addBox(-1.9375F, -7.044F, 5.4788F, 4.0F, 3.0F, 2.0F, -0.25F, false);

		bone84 = new ModelRenderer(this);
		bone84.setRotationPoint(4.3125F, -1.25F, -1.5111F);
		Main6.addChild(bone84);
		setRotationAngle(bone84, 0.0087F, 0.0F, 0.0F);
		bone84.setTextureOffset(16, 66).addBox(-1.875F, -8.0563F, 7.1247F, 4.0F, 4.0F, 3.0F, -0.25F, false);
		bone84.setTextureOffset(28, 0).addBox(-1.375F, -6.1188F, 6.5622F, 2.0F, 2.0F, 3.0F, -0.625F, false);
		bone84.setTextureOffset(28, 0).addBox(-2.1563F, -6.1184F, 6.5538F, 2.0F, 2.0F, 3.0F, -0.625F, false);
		bone84.setTextureOffset(28, 0).addBox(-0.5625F, -6.1188F, 6.5622F, 2.0F, 2.0F, 3.0F, -0.625F, false);
		bone84.setTextureOffset(44, 32).addBox(-1.4375F, -7.3688F, 6.6356F, 3.0F, 2.0F, 2.0F, -0.5F, false);
		bone84.setTextureOffset(28, 0).addBox(0.2188F, -6.1184F, 6.5538F, 2.0F, 2.0F, 3.0F, -0.625F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void render(SmithConsoleTile tile, float v, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v1, float v2, float v3, float v4) {
		net.tardis.mod.controls.RandomiserControl randomiserControl = tile.getControl(RandomiserControl.class);
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

		EntireModel.render(matrixStack, iVertexBuilder, i, i1);

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

	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {

	}
}