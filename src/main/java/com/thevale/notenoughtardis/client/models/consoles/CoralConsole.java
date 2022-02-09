package com.thevale.notenoughtardis.client.models.consoles;// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.notenoughtardis.tileentities.consoles.CoralConsoleTile;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.client.models.TileModel;
import net.tardis.mod.controls.*;
import net.tardis.mod.enums.EnumDoorState;

public class CoralConsole extends EntityModel<Entity> implements TileModel<CoralConsoleTile> {
	private final ModelRenderer AllConsole;
	private final ModelRenderer Monitor;
	private final ModelRenderer Cube88;
	private final ModelRenderer Cube98;
	private final ModelRenderer Cube99;
	private final ModelRenderer Cube100;
	private final ModelRenderer Cube89;
	private final ModelRenderer Cube90;
	private final ModelRenderer Cube91;
	private final ModelRenderer Cube92;
	private final ModelRenderer Cube93;
	private final ModelRenderer Cube94;
	private final ModelRenderer Cube95;
	private final ModelRenderer Cube96;
	private final ModelRenderer Cube97;
	private final ModelRenderer Controls;
	private final ModelRenderer HelmicRegulator;
	private final ModelRenderer Rotation;
	private final ModelRenderer bone93;
	private final ModelRenderer LockingDownMechanism;
	private final ModelRenderer Rotation5;
	private final ModelRenderer Wheel;
	private final ModelRenderer SmallLever;
	private final ModelRenderer BigLever;
	private final ModelRenderer Throttle;
	private final ModelRenderer Rotation6;
	private final ModelRenderer Wheel2;
	private final ModelRenderer SmallLever2;
	private final ModelRenderer BigLever2;
	private final ModelRenderer LookingControl;
	private final ModelRenderer Rotation13;
	private final ModelRenderer Rotor;
	private final ModelRenderer FastReturn;
	private final ModelRenderer Cylinder;
	private final ModelRenderer PumpHandle;
	private final ModelRenderer FloatMode;
	private final ModelRenderer Pivot;
	private final ModelRenderer Cylinder4;
	private final ModelRenderer Cylinder3;
	private final ModelRenderer Handbrake2;
	private final ModelRenderer HPivot;
	private final ModelRenderer Cylinder6;
	private final ModelRenderer Cylinder7;
	private final ModelRenderer IncrementModifier;
	private final ModelRenderer bone94;
	private final ModelRenderer bone96;
	private final ModelRenderer bone95;
	private final ModelRenderer Needle;
	private final ModelRenderer Handbrake;
	private final ModelRenderer Base;
	private final ModelRenderer Handle;
	private final ModelRenderer Pump2;
	private final ModelRenderer Cylinder5;
	private final ModelRenderer PumoHandle3;
	private final ModelRenderer Pump;
	private final ModelRenderer Cylinder2;
	private final ModelRenderer PumoHandle2;
	private final ModelRenderer Pump3;
	private final ModelRenderer Cylinder8;
	private final ModelRenderer PumoHandle4;
	private final ModelRenderer TimeRotor;
	private final ModelRenderer Innards;
	private final ModelRenderer Tubes;
	private final ModelRenderer Movable;
	private final ModelRenderer Lower;
	private final ModelRenderer bone37;
	private final ModelRenderer bone38;
	private final ModelRenderer bone39;
	private final ModelRenderer bone40;
	private final ModelRenderer bone41;
	private final ModelRenderer bone42;
	private final ModelRenderer bone43;
	private final ModelRenderer bone44;
	private final ModelRenderer bone45;
	private final ModelRenderer bone46;
	private final ModelRenderer bone47;
	private final ModelRenderer Lower2;
	private final ModelRenderer bone48;
	private final ModelRenderer bone49;
	private final ModelRenderer bone50;
	private final ModelRenderer bone51;
	private final ModelRenderer bone52;
	private final ModelRenderer bone53;
	private final ModelRenderer bone54;
	private final ModelRenderer bone55;
	private final ModelRenderer bone56;
	private final ModelRenderer bone57;
	private final ModelRenderer bone58;
	private final ModelRenderer Upper;
	private final ModelRenderer bone59;
	private final ModelRenderer bone60;
	private final ModelRenderer bone61;
	private final ModelRenderer bone62;
	private final ModelRenderer bone63;
	private final ModelRenderer bone64;
	private final ModelRenderer bone65;
	private final ModelRenderer bone66;
	private final ModelRenderer bone67;
	private final ModelRenderer bone68;
	private final ModelRenderer bone69;
	private final ModelRenderer Upper2;
	private final ModelRenderer bone70;
	private final ModelRenderer bone71;
	private final ModelRenderer bone72;
	private final ModelRenderer bone73;
	private final ModelRenderer bone74;
	private final ModelRenderer bone75;
	private final ModelRenderer bone76;
	private final ModelRenderer bone77;
	private final ModelRenderer bone78;
	private final ModelRenderer bone79;
	private final ModelRenderer bone80;
	private final ModelRenderer Console;
	private final ModelRenderer LighterCoral;
	private final ModelRenderer Block1;
	private final ModelRenderer Block2;
	private final ModelRenderer Block3;
	private final ModelRenderer Block4;
	private final ModelRenderer Block5;
	private final ModelRenderer Block6;
	private final ModelRenderer Block7;
	private final ModelRenderer Block8;
	private final ModelRenderer Block9;
	private final ModelRenderer Block10;
	private final ModelRenderer Block11;
	private final ModelRenderer Block12;
	private final ModelRenderer Coral;
	private final ModelRenderer Edge5;
	private final ModelRenderer Cube20;
	private final ModelRenderer Cube21;
	private final ModelRenderer Cube22;
	private final ModelRenderer Cube23;
	private final ModelRenderer Cube24;
	private final ModelRenderer Cube25;
	private final ModelRenderer Cube26;
	private final ModelRenderer Cube27;
	private final ModelRenderer Cube37;
	private final ModelRenderer Edge2;
	private final ModelRenderer Cube2;
	private final ModelRenderer Cube3;
	private final ModelRenderer Cube4;
	private final ModelRenderer Cube5;
	private final ModelRenderer Cube6;
	private final ModelRenderer Cube7;
	private final ModelRenderer Cube8;
	private final ModelRenderer Cube9;
	private final ModelRenderer Cube10;
	private final ModelRenderer Edge3;
	private final ModelRenderer Cube11;
	private final ModelRenderer Cube12;
	private final ModelRenderer Cube13;
	private final ModelRenderer Cube14;
	private final ModelRenderer Cube15;
	private final ModelRenderer Cube16;
	private final ModelRenderer Cube17;
	private final ModelRenderer Cube18;
	private final ModelRenderer Cube19;
	private final ModelRenderer Edge4;
	private final ModelRenderer Cube28;
	private final ModelRenderer Cube29;
	private final ModelRenderer Cube30;
	private final ModelRenderer Cube31;
	private final ModelRenderer Cube32;
	private final ModelRenderer Cube33;
	private final ModelRenderer Cube34;
	private final ModelRenderer Cube35;
	private final ModelRenderer Cube36;
	private final ModelRenderer Edge6;
	private final ModelRenderer Cube38;
	private final ModelRenderer Cube39;
	private final ModelRenderer Cube40;
	private final ModelRenderer Cube41;
	private final ModelRenderer Cube42;
	private final ModelRenderer Cube43;
	private final ModelRenderer Cube44;
	private final ModelRenderer Cube45;
	private final ModelRenderer Cube46;
	private final ModelRenderer Edge7;
	private final ModelRenderer Cube47;
	private final ModelRenderer Cube48;
	private final ModelRenderer Cube49;
	private final ModelRenderer Cube50;
	private final ModelRenderer Cube51;
	private final ModelRenderer Cube52;
	private final ModelRenderer Cube53;
	private final ModelRenderer Cube54;
	private final ModelRenderer Cube66;
	private final ModelRenderer UpperRing;
	private final ModelRenderer Cube1;
	private final ModelRenderer UpperRoof;
	private final ModelRenderer Cube55;
	private final ModelRenderer UpperRoof2;
	private final ModelRenderer Cube56;
	private final ModelRenderer UpperRoof3;
	private final ModelRenderer Cube57;
	private final ModelRenderer UpperRoof4;
	private final ModelRenderer Cube58;
	private final ModelRenderer UpperRoof5;
	private final ModelRenderer Cube59;
	private final ModelRenderer UpperRoof6;
	private final ModelRenderer Cube60;
	private final ModelRenderer UpperRoof7;
	private final ModelRenderer Cube61;
	private final ModelRenderer UpperRoof8;
	private final ModelRenderer Cube62;
	private final ModelRenderer UpperRoof9;
	private final ModelRenderer Cube63;
	private final ModelRenderer UpperRoof10;
	private final ModelRenderer Panels;
	private final ModelRenderer Panel1;
	private final ModelRenderer Cube64;
	private final ModelRenderer Cube65;
	private final ModelRenderer bone;
	private final ModelRenderer Panel2;
	private final ModelRenderer Cube67;
	private final ModelRenderer Cube68;
	private final ModelRenderer bone2;
	private final ModelRenderer Panel3;
	private final ModelRenderer Cube69;
	private final ModelRenderer Cube70;
	private final ModelRenderer bone3;
	private final ModelRenderer Panel4;
	private final ModelRenderer Cube71;
	private final ModelRenderer Cube72;
	private final ModelRenderer bone4;
	private final ModelRenderer Panel5;
	private final ModelRenderer Cube73;
	private final ModelRenderer Cube74;
	private final ModelRenderer bone5;
	private final ModelRenderer Panel6;
	private final ModelRenderer Cube75;
	private final ModelRenderer Cube76;
	private final ModelRenderer bone6;
	private final ModelRenderer Pipes;
	private final ModelRenderer Set1;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone10;
	private final ModelRenderer bone9;
	private final ModelRenderer Set2;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer Set3;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer Set4;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer Set5;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer bone25;
	private final ModelRenderer bone26;
	private final ModelRenderer Set6;
	private final ModelRenderer bone27;
	private final ModelRenderer bone28;
	private final ModelRenderer bone29;
	private final ModelRenderer bone30;
	private final ModelRenderer UnderConsole;
	private final ModelRenderer part1;
	private final ModelRenderer bone33;
	private final ModelRenderer part2;
	private final ModelRenderer bone31;
	private final ModelRenderer part3;
	private final ModelRenderer bone32;
	private final ModelRenderer part4;
	private final ModelRenderer bone34;
	private final ModelRenderer part5;
	private final ModelRenderer bone35;
	private final ModelRenderer part6;
	private final ModelRenderer bone36;
	private final ModelRenderer CPanel1;
	private final ModelRenderer Cube78;
	private final ModelRenderer bone81;
	private final ModelRenderer Cube77;
	private final ModelRenderer CEdge2;
	private final ModelRenderer Rotation2;
	private final ModelRenderer Rotation3;
	private final ModelRenderer bone82;
	private final ModelRenderer bone83;
	private final ModelRenderer Rotation4;
	private final ModelRenderer Rotation11;
	private final ModelRenderer CEdge3;
	private final ModelRenderer Rotation8;
	private final ModelRenderer bone88;
	private final ModelRenderer bone103;
	private final ModelRenderer CPanel2;
	private final ModelRenderer Cube81;
	private final ModelRenderer bone89;
	private final ModelRenderer bone90;
	private final ModelRenderer Cube82;
	private final ModelRenderer bone91;
	private final ModelRenderer bone92;
	private final ModelRenderer CPanel3;
	private final ModelRenderer Cube79;
	private final ModelRenderer bone84;
	private final ModelRenderer bone87;
	private final ModelRenderer bone86;
	private final ModelRenderer bone85;
	private final ModelRenderer Cube80;
	private final ModelRenderer CEdge4;
	private final ModelRenderer Rotation7;
	private final ModelRenderer Rotation10;
	private final ModelRenderer CPanel4;
	private final ModelRenderer Rotation9;
	private final ModelRenderer Cube83;
	private final ModelRenderer Cube84;
	private final ModelRenderer CEdge5;
	private final ModelRenderer Rotation12;
	private final ModelRenderer CPanel5;
	private final ModelRenderer Cube85;
	private final ModelRenderer bone97;
	private final ModelRenderer bone99;
	private final ModelRenderer Cube86;
	private final ModelRenderer bone101;
	private final ModelRenderer CPanel6;
	private final ModelRenderer Cube87;
	private final ModelRenderer bone102;

	public CoralConsole() {
		textureWidth = 256;
		textureHeight = 256;

		AllConsole = new ModelRenderer(this);
		AllConsole.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Monitor = new ModelRenderer(this);
		Monitor.setRotationPoint(0.0F, 0.0F, 0.0F);
		AllConsole.addChild(Monitor);
		setRotationAngle(Monitor, 0.0F, 2.2689F, 0.0F);
		

		Cube88 = new ModelRenderer(this);
		Cube88.setRotationPoint(0.0F, 1.25F, 0.0F);
		Monitor.addChild(Cube88);
		Cube88.setTextureOffset(57, 109).addBox(-5.91F, -21.0F, -2.0F, 2.0F, 1.0F, 4.0F, -0.115F, false);

		Cube98 = new ModelRenderer(this);
		Cube98.setRotationPoint(-1.75F, 1.25F, -1.5F);
		Monitor.addChild(Cube98);
		Cube98.setTextureOffset(57, 109).addBox(-6.91F, -21.0F, 1.0F, 3.0F, 1.0F, 1.0F, -0.115F, false);

		Cube99 = new ModelRenderer(this);
		Cube99.setRotationPoint(-4.5F, 0.75F, -1.5F);
		Monitor.addChild(Cube99);
		setRotationAngle(Cube99, 0.0F, 0.0F, 0.0873F);
		Cube99.setTextureOffset(101, 166).addBox(-7.6998F, -19.8909F, -2.0F, 3.0F, 1.0F, 7.0F, -0.24F, false);

		Cube100 = new ModelRenderer(this);
		Cube100.setRotationPoint(-4.5F, 0.0F, -1.5F);
		Monitor.addChild(Cube100);
		setRotationAngle(Cube100, 0.0F, 0.0F, 0.0873F);
		Cube100.setTextureOffset(116, 156).addBox(-5.6344F, -24.6638F, -2.0F, 1.0F, 6.0F, 7.0F, -0.24F, false);
		Cube100.setTextureOffset(116, 156).addBox(-6.1544F, -24.6638F, 4.0F, 1.0F, 6.0F, 1.0F, -0.24F, false);
		Cube100.setTextureOffset(116, 156).addBox(-6.1544F, -24.6638F, -2.0F, 1.0F, 6.0F, 1.0F, -0.24F, false);
		Cube100.setTextureOffset(116, 156).addBox(-6.1544F, -24.6638F, -1.48F, 1.0F, 1.0F, 6.0F, -0.24F, false);
		Cube100.setTextureOffset(116, 156).addBox(-6.1544F, -19.6638F, -1.48F, 1.0F, 1.0F, 6.0F, -0.24F, false);
		Cube100.setTextureOffset(196, 153).addBox(-5.8844F, -24.6638F, -2.0F, 1.0F, 6.0F, 7.0F, -0.365F, false);

		Cube89 = new ModelRenderer(this);
		Cube89.setRotationPoint(0.0F, 1.25F, 0.0F);
		Monitor.addChild(Cube89);
		setRotationAngle(Cube89, 0.0F, -0.6283F, 0.0F);
		Cube89.setTextureOffset(57, 109).addBox(-5.91F, -21.0F, -2.0F, 2.0F, 1.0F, 4.0F, -0.125F, false);

		Cube90 = new ModelRenderer(this);
		Cube90.setRotationPoint(0.0F, 1.25F, 0.0F);
		Monitor.addChild(Cube90);
		setRotationAngle(Cube90, 0.0F, 0.6283F, 0.0F);
		Cube90.setTextureOffset(57, 109).addBox(-5.91F, -21.0F, -2.0F, 2.0F, 1.0F, 4.0F, -0.11F, false);

		Cube91 = new ModelRenderer(this);
		Cube91.setRotationPoint(0.0F, 1.25F, 0.0F);
		Monitor.addChild(Cube91);
		setRotationAngle(Cube91, 0.0F, -1.2566F, 0.0F);
		Cube91.setTextureOffset(57, 109).addBox(-5.91F, -21.0F, -2.0F, 2.0F, 1.0F, 4.0F, -0.1F, false);

		Cube92 = new ModelRenderer(this);
		Cube92.setRotationPoint(0.0F, 1.25F, 0.0F);
		Monitor.addChild(Cube92);
		setRotationAngle(Cube92, 0.0F, 1.2566F, 0.0F);
		Cube92.setTextureOffset(57, 109).addBox(-5.91F, -21.0F, -2.0F, 2.0F, 1.0F, 4.0F, -0.105F, false);

		Cube93 = new ModelRenderer(this);
		Cube93.setRotationPoint(0.0F, 1.25F, 0.0F);
		Monitor.addChild(Cube93);
		setRotationAngle(Cube93, 0.0F, -1.885F, 0.0F);
		Cube93.setTextureOffset(57, 109).addBox(-5.91F, -21.0F, -2.0F, 2.0F, 1.0F, 4.0F, -0.105F, false);

		Cube94 = new ModelRenderer(this);
		Cube94.setRotationPoint(0.0F, 1.25F, 0.0F);
		Monitor.addChild(Cube94);
		setRotationAngle(Cube94, 0.0F, 1.885F, 0.0F);
		Cube94.setTextureOffset(57, 109).addBox(-5.91F, -21.0F, -2.0F, 2.0F, 1.0F, 4.0F, -0.1F, false);

		Cube95 = new ModelRenderer(this);
		Cube95.setRotationPoint(0.0F, 1.25F, 0.0F);
		Monitor.addChild(Cube95);
		setRotationAngle(Cube95, 0.0F, -2.5133F, 0.0F);
		Cube95.setTextureOffset(57, 109).addBox(-5.91F, -21.0F, -2.0F, 2.0F, 1.0F, 4.0F, -0.11F, false);

		Cube96 = new ModelRenderer(this);
		Cube96.setRotationPoint(0.0F, 1.25F, 0.0F);
		Monitor.addChild(Cube96);
		setRotationAngle(Cube96, 0.0F, 2.5133F, 0.0F);
		Cube96.setTextureOffset(57, 109).addBox(-5.91F, -21.0F, -2.0F, 2.0F, 1.0F, 4.0F, -0.125F, false);

		Cube97 = new ModelRenderer(this);
		Cube97.setRotationPoint(0.0F, 1.25F, 0.0F);
		Monitor.addChild(Cube97);
		setRotationAngle(Cube97, 0.0F, 3.1416F, 0.0F);
		Cube97.setTextureOffset(57, 109).addBox(-5.91F, -21.0F, -2.0F, 2.0F, 1.0F, 4.0F, -0.115F, false);

		Controls = new ModelRenderer(this);
		Controls.setRotationPoint(0.0F, 0.0F, 0.0F);
		AllConsole.addChild(Controls);
		

		HelmicRegulator = new ModelRenderer(this);
		HelmicRegulator.setRotationPoint(0.0F, -1.0F, 1.125F);
		Controls.addChild(HelmicRegulator);
		

		Rotation = new ModelRenderer(this);
		Rotation.setRotationPoint(0.0F, -15.1995F, -12.0796F);
		HelmicRegulator.addChild(Rotation);
		setRotationAngle(Rotation, 0.3491F, 0.0F, 0.0F);
		Rotation.setTextureOffset(41, 212).addBox(-1.5F, -0.5F, -2.5F, 3.0F, 1.0F, 6.0F, -0.125F, false);
		Rotation.setTextureOffset(46, 220).addBox(-0.5F, -1.75F, -3.625F, 1.0F, 1.0F, 2.0F, -0.251F, false);
		Rotation.setTextureOffset(37, 225).addBox(-1.875F, -1.875F, -3.0F, 2.0F, 2.0F, 7.0F, -0.75F, false);
		Rotation.setTextureOffset(37, 225).addBox(-0.25F, -1.875F, -3.0F, 2.0F, 2.0F, 7.0F, -0.75F, false);
		Rotation.setTextureOffset(37, 225).addBox(-1.0F, -1.875F, -3.0F, 2.0F, 2.0F, 7.0F, -0.75F, false);
		Rotation.setTextureOffset(52, 105).addBox(0.625F, -1.25F, -1.5F, 1.0F, 2.0F, 1.0F, -0.254F, false);
		Rotation.setTextureOffset(52, 105).addBox(-1.625F, -1.25F, -1.5F, 1.0F, 2.0F, 1.0F, -0.254F, false);
		Rotation.setTextureOffset(52, 105).addBox(0.625F, -1.25F, 1.375F, 1.0F, 2.0F, 1.0F, -0.254F, false);
		Rotation.setTextureOffset(52, 105).addBox(-1.625F, -1.25F, 1.375F, 1.0F, 2.0F, 1.0F, -0.254F, false);

		bone93 = new ModelRenderer(this);
		bone93.setRotationPoint(-0.625F, -13.2844F, 12.9352F);
		Rotation.addChild(bone93);
		bone93.setTextureOffset(52, 105).addBox(-0.875F, 11.4094F, -15.3102F, 3.0F, 2.0F, 2.0F, -0.625F, false);

		LockingDownMechanism = new ModelRenderer(this);
		LockingDownMechanism.setRotationPoint(0.0F, -1.0F, 0.0F);
		Controls.addChild(LockingDownMechanism);
		setRotationAngle(LockingDownMechanism, 0.0F, 2.0944F, 0.0F);
		

		Rotation5 = new ModelRenderer(this);
		Rotation5.setRotationPoint(0.0F, -15.1995F, -10.9546F);
		LockingDownMechanism.addChild(Rotation5);
		setRotationAngle(Rotation5, 0.5236F, 0.0F, 0.0F);
		Rotation5.setTextureOffset(43, 221).addBox(-1.5F, -0.75F, -4.0F, 3.0F, 1.0F, 4.0F, -0.125F, false);
		Rotation5.setTextureOffset(43, 221).addBox(-1.875F, -2.25F, -4.5F, 2.0F, 3.0F, 5.0F, -0.875F, false);
		Rotation5.setTextureOffset(43, 221).addBox(-1.875F, -3.0F, -4.125F, 2.0F, 3.0F, 4.0F, -0.876F, false);
		Rotation5.setTextureOffset(43, 221).addBox(-0.875F, -3.0F, -4.125F, 2.0F, 3.0F, 4.0F, -0.876F, false);
		Rotation5.setTextureOffset(43, 221).addBox(-0.875F, -2.25F, -4.5F, 2.0F, 3.0F, 5.0F, -0.875F, false);
		Rotation5.setTextureOffset(43, 221).addBox(0.125F, -2.0F, -3.0F, 1.0F, 3.0F, 2.0F, -0.125F, false);

		Wheel = new ModelRenderer(this);
		Wheel.setRotationPoint(1.0F, -1.875F, -2.0F);
		Rotation5.addChild(Wheel);
		Wheel.setTextureOffset(108, 162).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, -0.475F, false);

		SmallLever = new ModelRenderer(this);
		SmallLever.setRotationPoint(0.0F, -1.75F, -2.25F);
		Rotation5.addChild(SmallLever);
		setRotationAngle(SmallLever, -0.0873F, 0.0F, 0.0F);
		SmallLever.setTextureOffset(52, 115).addBox(-0.625F, -0.5F, -2.375F, 1.0F, 1.0F, 3.0F, -0.375F, false);
		SmallLever.setTextureOffset(52, 115).addBox(-0.625F, -0.75F, -2.375F, 1.0F, 1.0F, 3.0F, -0.375F, false);
		SmallLever.setTextureOffset(149, 209).addBox(-0.375F, -0.75F, -2.375F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		SmallLever.setTextureOffset(52, 115).addBox(-0.875F, -0.75F, -0.375F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		SmallLever.setTextureOffset(149, 209).addBox(-0.375F, -0.5F, -2.375F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		SmallLever.setTextureOffset(52, 115).addBox(-0.875F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, -0.375F, false);

		BigLever = new ModelRenderer(this);
		BigLever.setRotationPoint(-0.5F, -1.875F, -2.0F);
		Rotation5.addChild(BigLever);
		BigLever.setTextureOffset(78, 113).addBox(-0.625F, -0.375F, -1.375F, 1.0F, 1.0F, 2.0F, -0.375F, false);
		BigLever.setTextureOffset(78, 113).addBox(-0.625F, -0.625F, -1.375F, 1.0F, 1.0F, 2.0F, -0.375F, false);
		BigLever.setTextureOffset(78, 113).addBox(-0.625F, -0.75F, -2.625F, 1.0F, 1.0F, 2.0F, -0.375F, false);
		BigLever.setTextureOffset(78, 113).addBox(-0.625F, -0.75F, -2.875F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		BigLever.setTextureOffset(78, 113).addBox(-0.625F, -0.75F, -3.125F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		BigLever.setTextureOffset(78, 113).addBox(-0.625F, -0.5F, -1.625F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		BigLever.setTextureOffset(148, 208).addBox(-1.125F, -1.5F, -3.625F, 3.0F, 2.0F, 2.0F, -0.875F, false);

		Throttle = new ModelRenderer(this);
		Throttle.setRotationPoint(0.0F, -1.0F, 0.0F);
		Controls.addChild(Throttle);
		setRotationAngle(Throttle, 0.0F, -1.0472F, 0.0F);
		

		Rotation6 = new ModelRenderer(this);
		Rotation6.setRotationPoint(0.0F, -15.1995F, -10.9546F);
		Throttle.addChild(Rotation6);
		setRotationAngle(Rotation6, 0.5236F, 0.0F, 0.0F);
		Rotation6.setTextureOffset(48, 212).addBox(-1.5F, -0.75F, -4.0F, 3.0F, 1.0F, 4.0F, -0.125F, false);
		Rotation6.setTextureOffset(48, 212).addBox(-1.875F, -2.25F, -4.5F, 2.0F, 3.0F, 5.0F, -0.875F, false);
		Rotation6.setTextureOffset(48, 212).addBox(-1.875F, -3.0F, -4.125F, 2.0F, 3.0F, 4.0F, -0.876F, false);
		Rotation6.setTextureOffset(48, 212).addBox(-0.875F, -3.0F, -4.125F, 2.0F, 3.0F, 4.0F, -0.876F, false);
		Rotation6.setTextureOffset(48, 212).addBox(-0.875F, -2.25F, -4.5F, 2.0F, 3.0F, 5.0F, -0.875F, false);
		Rotation6.setTextureOffset(48, 212).addBox(0.125F, -2.0F, -3.0F, 1.0F, 3.0F, 2.0F, -0.125F, false);

		Wheel2 = new ModelRenderer(this);
		Wheel2.setRotationPoint(1.0F, -1.875F, -2.0F);
		Rotation6.addChild(Wheel2);
		setRotationAngle(Wheel2, 1.1345F, 0.0F, 0.0F);
		Wheel2.setTextureOffset(108, 162).addBox(-0.5F, -1.5F, -1.5F, 1.0F, 3.0F, 3.0F, -0.475F, false);

		SmallLever2 = new ModelRenderer(this);
		SmallLever2.setRotationPoint(0.0F, -1.875F, -2.25F);
		Rotation6.addChild(SmallLever2);
		setRotationAngle(SmallLever2, -0.7854F, 0.0F, 0.0F);
		SmallLever2.setTextureOffset(58, 97).addBox(-0.625F, -0.375F, -2.375F, 1.0F, 1.0F, 3.0F, -0.375F, false);
		SmallLever2.setTextureOffset(58, 97).addBox(-0.625F, -0.625F, -2.375F, 1.0F, 1.0F, 3.0F, -0.375F, false);
		SmallLever2.setTextureOffset(148, 211).addBox(-0.375F, -0.625F, -2.375F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		SmallLever2.setTextureOffset(58, 97).addBox(-0.875F, -0.625F, -0.375F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		SmallLever2.setTextureOffset(148, 211).addBox(-0.375F, -0.375F, -2.375F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		SmallLever2.setTextureOffset(58, 97).addBox(-0.875F, -0.375F, -0.375F, 1.0F, 1.0F, 1.0F, -0.375F, false);

		BigLever2 = new ModelRenderer(this);
		BigLever2.setRotationPoint(0.0F, -1.625F, -2.25F);
		Rotation6.addChild(BigLever2);
		setRotationAngle(BigLever2, -2.5307F, 0.0F, 0.0F);
		BigLever2.setTextureOffset(57, 112).addBox(-1.125F, -0.625F, -1.125F, 1.0F, 1.0F, 2.0F, -0.375F, false);
		BigLever2.setTextureOffset(57, 112).addBox(-1.125F, -0.875F, -1.125F, 1.0F, 1.0F, 2.0F, -0.375F, false);
		BigLever2.setTextureOffset(57, 112).addBox(-1.125F, -1.0F, -2.375F, 1.0F, 1.0F, 2.0F, -0.375F, false);
		BigLever2.setTextureOffset(57, 112).addBox(-1.125F, -1.0F, -2.625F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		BigLever2.setTextureOffset(57, 112).addBox(-1.125F, -1.0F, -2.875F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		BigLever2.setTextureOffset(57, 112).addBox(-1.125F, -0.75F, -1.375F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		BigLever2.setTextureOffset(164, 208).addBox(-1.625F, -1.75F, -3.375F, 3.0F, 2.0F, 2.0F, -0.875F, false);

		LookingControl = new ModelRenderer(this);
		LookingControl.setRotationPoint(0.0F, -10.75F, 0.0F);
		Controls.addChild(LookingControl);
		setRotationAngle(LookingControl, 0.6109F, -1.0472F, 0.0F);
		

		Rotation13 = new ModelRenderer(this);
		Rotation13.setRotationPoint(0.0F, -15.1995F, -10.9546F);
		LookingControl.addChild(Rotation13);
		setRotationAngle(Rotation13, 0.5236F, 0.0F, 0.0F);
		Rotation13.setTextureOffset(64, 116).addBox(-1.0F, 3.125F, -3.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);

		Rotor = new ModelRenderer(this);
		Rotor.setRotationPoint(0.0F, 3.625F, -2.0F);
		Rotation13.addChild(Rotor);
		setRotationAngle(Rotor, 0.0F, -0.5236F, 0.0F);
		Rotor.setTextureOffset(74, 111).addBox(-0.625F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.3625F, false);
		Rotor.setTextureOffset(39, 158).addBox(0.275F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, -0.425F, false);
		Rotor.setTextureOffset(69, 104).addBox(0.525F, -0.65F, -0.5F, 1.0F, 1.0F, 1.0F, -0.3F, false);

		FastReturn = new ModelRenderer(this);
		FastReturn.setRotationPoint(0.0F, -1.0F, 0.0F);
		Controls.addChild(FastReturn);
		setRotationAngle(FastReturn, 0.0F, 0.8552F, 0.0F);
		

		Cylinder = new ModelRenderer(this);
		Cylinder.setRotationPoint(0.0F, -16.8245F, -10.9546F);
		FastReturn.addChild(Cylinder);
		setRotationAngle(Cylinder, 0.2618F, 0.0F, 0.0F);
		Cylinder.setTextureOffset(178, 156).addBox(-1.5F, 4.625F, -6.5F, 1.0F, 4.0F, 1.0F, -0.15F, false);

		PumpHandle = new ModelRenderer(this);
		PumpHandle.setRotationPoint(0.0F, -16.8245F, -10.9546F);
		FastReturn.addChild(PumpHandle);
		setRotationAngle(PumpHandle, 0.2618F, 0.0F, 0.0F);
		PumpHandle.setTextureOffset(40, 206).addBox(-1.5F, 3.125F, -6.5F, 1.0F, 4.0F, 1.0F, -0.25F, false);
		PumpHandle.setTextureOffset(40, 206).addBox(-1.5F, 3.75F, -6.5F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		PumpHandle.setTextureOffset(40, 206).addBox(-1.5F, 1.875F, -6.5F, 1.0F, 2.0F, 1.0F, -0.125F, false);

		FloatMode = new ModelRenderer(this);
		FloatMode.setRotationPoint(0.0F, 0.0F, 0.0F);
		Controls.addChild(FloatMode);
		setRotationAngle(FloatMode, 0.0F, 1.0996F, 0.0F);
		

		Pivot = new ModelRenderer(this);
		Pivot.setRotationPoint(-0.875F, -9.25F, -14.375F);
		FloatMode.addChild(Pivot);
		

		Cylinder4 = new ModelRenderer(this);
		Cylinder4.setRotationPoint(0.875F, -8.5745F, 3.4204F);
		Pivot.addChild(Cylinder4);
		setRotationAngle(Cylinder4, 0.3491F, 0.0F, 0.0F);
		Cylinder4.setTextureOffset(42, 231).addBox(-1.25F, 1.7146F, -7.5953F, 1.0F, 3.0F, 1.0F, -0.399F, false);
		Cylinder4.setTextureOffset(42, 231).addBox(-1.25F, 1.7146F, -7.7953F, 1.0F, 3.0F, 1.0F, -0.399F, false);

		Cylinder3 = new ModelRenderer(this);
		Cylinder3.setRotationPoint(0.875F, -8.5745F, 3.4204F);
		Pivot.addChild(Cylinder3);
		setRotationAngle(Cylinder3, 0.6981F, 0.0F, 0.0F);
		Cylinder3.setTextureOffset(42, 231).addBox(-1.25F, 1.125F, -8.625F, 1.0F, 4.0F, 1.0F, -0.4F, false);
		Cylinder3.setTextureOffset(42, 231).addBox(-1.25F, 0.125F, -8.425F, 1.0F, 5.0F, 1.0F, -0.4F, false);
		Cylinder3.setTextureOffset(42, 231).addBox(-1.25F, 1.125F, -8.825F, 1.0F, 4.0F, 1.0F, -0.4F, false);

		Handbrake2 = new ModelRenderer(this);
		Handbrake2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Controls.addChild(Handbrake2);
		setRotationAngle(Handbrake2, 0.0F, -2.3038F, 0.0F);
		

		HPivot = new ModelRenderer(this);
		HPivot.setRotationPoint(-1.7114F, -10.25F, -15.3039F);
		Handbrake2.addChild(HPivot);
		setRotationAngle(HPivot, 0.8727F, -1.3963F, -0.2618F);
		

		Cylinder6 = new ModelRenderer(this);
		Cylinder6.setRotationPoint(0.875F, -8.5745F, 3.4204F);
		HPivot.addChild(Cylinder6);
		setRotationAngle(Cylinder6, 0.3491F, 0.0F, 0.0F);
		Cylinder6.setTextureOffset(45, 210).addBox(-1.25F, 1.7146F, -7.5953F, 1.0F, 3.0F, 1.0F, -0.399F, false);
		Cylinder6.setTextureOffset(45, 210).addBox(-1.25F, 1.7146F, -7.7953F, 1.0F, 3.0F, 1.0F, -0.399F, false);

		Cylinder7 = new ModelRenderer(this);
		Cylinder7.setRotationPoint(0.875F, -8.5745F, 3.4204F);
		HPivot.addChild(Cylinder7);
		setRotationAngle(Cylinder7, 0.6981F, 0.0F, 0.0F);
		Cylinder7.setTextureOffset(43, 214).addBox(-1.25F, 1.125F, -8.625F, 1.0F, 4.0F, 1.0F, -0.4F, false);
		Cylinder7.setTextureOffset(43, 214).addBox(-1.25F, 0.125F, -8.425F, 1.0F, 5.0F, 1.0F, -0.4F, false);
		Cylinder7.setTextureOffset(43, 214).addBox(-1.25F, 0.125F, -8.225F, 1.0F, 5.0F, 1.0F, -0.4F, false);
		Cylinder7.setTextureOffset(43, 214).addBox(-1.25F, 1.125F, -8.825F, 1.0F, 4.0F, 1.0F, -0.4F, false);

		IncrementModifier = new ModelRenderer(this);
		IncrementModifier.setRotationPoint(0.0F, -30.3589F, 0.0F);
		Controls.addChild(IncrementModifier);
		setRotationAngle(IncrementModifier, 0.2618F, -2.0944F, 0.0F);
		IncrementModifier.setTextureOffset(63, 99).addBox(0.0F, 9.8601F, -12.8045F, 2.0F, 2.0F, 2.0F, -0.625F, false);
		IncrementModifier.setTextureOffset(63, 99).addBox(-1.875F, 9.6101F, -13.3045F, 2.0F, 2.0F, 3.0F, -0.875F, false);
		IncrementModifier.setTextureOffset(59, 121).addBox(-1.75F, 9.6101F, -13.5545F, 2.0F, 2.0F, 2.0F, -0.875F, false);
		IncrementModifier.setTextureOffset(63, 120).addBox(-1.75F, 9.6101F, -12.0545F, 2.0F, 2.0F, 2.0F, -0.875F, false);
		IncrementModifier.setTextureOffset(63, 120).addBox(-1.5625F, 9.6101F, -11.8045F, 2.0F, 2.0F, 2.0F, -0.875F, false);
		IncrementModifier.setTextureOffset(59, 121).addBox(-1.5625F, 9.6101F, -13.8045F, 2.0F, 2.0F, 2.0F, -0.875F, false);

		bone94 = new ModelRenderer(this);
		bone94.setRotationPoint(0.875F, 10.6101F, -11.8045F);
		IncrementModifier.addChild(bone94);
		setRotationAngle(bone94, 0.0F, -0.6109F, 0.0F);
		bone94.setTextureOffset(59, 121).addBox(-2.3454F, -1.0F, -1.0437F, 3.0F, 2.0F, 2.0F, -0.875F, false);
		bone94.setTextureOffset(57, 125).addBox(-2.5954F, -1.0F, -1.0437F, 2.0F, 2.0F, 2.0F, -0.875F, false);

		bone96 = new ModelRenderer(this);
		bone96.setRotationPoint(0.875F, 10.6101F, -11.8045F);
		IncrementModifier.addChild(bone96);
		setRotationAngle(bone96, 0.0F, 0.6109F, 0.0F);
		bone96.setTextureOffset(63, 99).addBox(-2.3454F, -1.0F, -0.9563F, 3.0F, 2.0F, 2.0F, -0.875F, false);
		bone96.setTextureOffset(63, 120).addBox(-2.5954F, -1.0F, -0.9563F, 2.0F, 2.0F, 2.0F, -0.875F, false);

		bone95 = new ModelRenderer(this);
		bone95.setRotationPoint(0.875F, 10.6101F, -11.8045F);
		IncrementModifier.addChild(bone95);
		setRotationAngle(bone95, 0.0F, -0.6109F, 0.0F);
		

		Needle = new ModelRenderer(this);
		Needle.setRotationPoint(0.875F, 10.4851F, -11.8045F);
		IncrementModifier.addChild(Needle);
		setRotationAngle(Needle, 0.0F, -0.4363F, 0.0F);
		Needle.setTextureOffset(63, 99).addBox(-3.0F, -1.0F, -1.0F, 4.0F, 2.0F, 2.0F, -0.875F, false);

		Handbrake = new ModelRenderer(this);
		Handbrake.setRotationPoint(0.0F, -15.1995F, 0.0F);
		Controls.addChild(Handbrake);
		setRotationAngle(Handbrake, 0.5236F, 3.1416F, 0.0F);
		

		Base = new ModelRenderer(this);
		Base.setRotationPoint(0.0F, -11.6026F, -1.1875F);
		Handbrake.addChild(Base);
		setRotationAngle(Base, -0.2618F, 0.0F, 0.0F);
		Base.setTextureOffset(96, 161).addBox(-1.0F, 6.6509F, -6.8147F, 2.0F, 1.0F, 4.0F, -0.124F, false);
		Base.setTextureOffset(96, 161).addBox(0.5F, 6.6509F, -5.5647F, 1.0F, 1.0F, 2.0F, -0.124F, false);
		Base.setTextureOffset(96, 161).addBox(-1.25F, 5.7759F, -7.0647F, 1.0F, 2.0F, 2.0F, -0.376F, false);
		Base.setTextureOffset(96, 161).addBox(0.25F, 5.7759F, -7.0647F, 1.0F, 2.0F, 2.0F, -0.376F, false);
		Base.setTextureOffset(96, 161).addBox(-1.25F, 5.6509F, -5.8147F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		Base.setTextureOffset(96, 161).addBox(-1.25F, 5.6509F, -6.0647F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		Base.setTextureOffset(96, 161).addBox(0.25F, 5.6509F, -5.8147F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		Base.setTextureOffset(96, 161).addBox(0.25F, 5.6509F, -6.0647F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		Base.setTextureOffset(96, 161).addBox(-1.25F, 5.5259F, -5.5647F, 1.0F, 2.0F, 2.0F, -0.375F, false);
		Base.setTextureOffset(96, 161).addBox(0.25F, 5.5259F, -5.5647F, 1.0F, 2.0F, 2.0F, -0.375F, false);
		Base.setTextureOffset(96, 161).addBox(-0.375F, 5.5259F, -5.5647F, 2.0F, 2.0F, 2.0F, -0.625F, false);
		Base.setTextureOffset(96, 161).addBox(-1.25F, 5.4009F, -4.3147F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		Base.setTextureOffset(96, 161).addBox(0.25F, 5.4009F, -4.3147F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		Base.setTextureOffset(96, 161).addBox(-1.25F, 5.4009F, -4.0647F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		Base.setTextureOffset(96, 161).addBox(0.25F, 5.4009F, -4.0647F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		Base.setTextureOffset(96, 161).addBox(-1.25F, 5.2759F, -3.8147F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		Base.setTextureOffset(96, 161).addBox(0.25F, 5.2759F, -3.8147F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		Base.setTextureOffset(96, 161).addBox(-1.25F, 5.2759F, -3.5647F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		Base.setTextureOffset(96, 161).addBox(0.25F, 5.2759F, -3.5647F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		Base.setTextureOffset(96, 161).addBox(-1.0F, 5.1509F, -3.5647F, 2.0F, 2.0F, 1.0F, -0.375F, false);
		Base.setTextureOffset(96, 161).addBox(-1.0F, 6.2759F, -6.8147F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		Base.setTextureOffset(96, 161).addBox(-1.0F, 5.9009F, -5.8147F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		Base.setTextureOffset(96, 161).addBox(-1.0F, 5.7759F, -4.8147F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		Base.setTextureOffset(149, 154).addBox(-1.0F, 5.0259F, -4.8147F, 2.0F, 2.0F, 2.0F, -0.875F, false);
		Base.setTextureOffset(149, 154).addBox(-1.0F, 5.0259F, -5.1897F, 2.0F, 2.0F, 2.0F, -0.875F, false);
		Base.setTextureOffset(147, 180).addBox(-0.625F, 5.0259F, -4.8147F, 2.0F, 2.0F, 2.0F, -0.875F, false);
		Base.setTextureOffset(147, 180).addBox(-0.625F, 5.0259F, -5.1897F, 2.0F, 2.0F, 2.0F, -0.875F, false);

		Handle = new ModelRenderer(this);
		Handle.setRotationPoint(1.0F, -6.1026F, -7.375F);
		Handbrake.addChild(Handle);
		setRotationAngle(Handle, -0.5236F, 0.0F, 0.0F);
		Handle.setTextureOffset(57, 98).addBox(-0.875F, -2.9741F, -1.0022F, 2.0F, 5.0F, 2.0F, -0.875F, false);
		Handle.setTextureOffset(49, 100).addBox(-0.875F, -2.9741F, -1.0022F, 2.0F, 2.0F, 2.0F, -0.85F, false);

		Pump2 = new ModelRenderer(this);
		Pump2.setRotationPoint(0.0F, -1.0F, 0.0F);
		Controls.addChild(Pump2);
		setRotationAngle(Pump2, 0.0F, 1.9024F, 0.0F);
		

		Cylinder5 = new ModelRenderer(this);
		Cylinder5.setRotationPoint(0.0F, -16.8245F, -10.9546F);
		Pump2.addChild(Cylinder5);
		setRotationAngle(Cylinder5, 0.2618F, 0.0F, 0.0F);
		Cylinder5.setTextureOffset(176, 142).addBox(-1.5F, 4.625F, -6.5F, 1.0F, 4.0F, 1.0F, -0.15F, false);

		PumoHandle3 = new ModelRenderer(this);
		PumoHandle3.setRotationPoint(0.0F, -16.8245F, -10.9546F);
		Pump2.addChild(PumoHandle3);
		setRotationAngle(PumoHandle3, 0.2618F, 0.0F, 0.0F);
		PumoHandle3.setTextureOffset(32, 231).addBox(-1.5F, 3.125F, -6.5F, 1.0F, 4.0F, 1.0F, -0.25F, false);
		PumoHandle3.setTextureOffset(32, 231).addBox(-1.5F, 3.75F, -6.5F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		PumoHandle3.setTextureOffset(32, 231).addBox(-1.5F, 1.875F, -6.5F, 1.0F, 2.0F, 1.0F, -0.125F, false);

		Pump = new ModelRenderer(this);
		Pump.setRotationPoint(0.0F, -1.0F, 0.0F);
		Controls.addChild(Pump);
		setRotationAngle(Pump, 0.0F, 2.1468F, 0.0F);
		

		Cylinder2 = new ModelRenderer(this);
		Cylinder2.setRotationPoint(0.0F, -16.8245F, -10.9546F);
		Pump.addChild(Cylinder2);
		setRotationAngle(Cylinder2, 0.2618F, 0.0F, 0.0F);
		Cylinder2.setTextureOffset(178, 149).addBox(-1.5F, 4.625F, -6.5F, 1.0F, 4.0F, 1.0F, -0.15F, false);

		PumoHandle2 = new ModelRenderer(this);
		PumoHandle2.setRotationPoint(0.0F, -16.8245F, -10.9546F);
		Pump.addChild(PumoHandle2);
		setRotationAngle(PumoHandle2, 0.2618F, 0.0F, 0.0F);
		PumoHandle2.setTextureOffset(32, 231).addBox(-1.5F, 3.25F, -6.5F, 1.0F, 4.0F, 1.0F, -0.25F, false);
		PumoHandle2.setTextureOffset(32, 231).addBox(-1.5F, 3.875F, -6.5F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		PumoHandle2.setTextureOffset(32, 231).addBox(-1.5F, 2.0F, -6.5F, 1.0F, 2.0F, 1.0F, -0.125F, false);

		Pump3 = new ModelRenderer(this);
		Pump3.setRotationPoint(0.0F, -1.0F, 0.0F);
		Controls.addChild(Pump3);
		setRotationAngle(Pump3, 0.0F, -2.042F, 0.0F);
		

		Cylinder8 = new ModelRenderer(this);
		Cylinder8.setRotationPoint(0.0F, -16.8245F, -10.9546F);
		Pump3.addChild(Cylinder8);
		setRotationAngle(Cylinder8, 0.2618F, 0.0F, 0.0F);
		Cylinder8.setTextureOffset(173, 143).addBox(-1.5F, 4.625F, -6.5F, 1.0F, 4.0F, 1.0F, -0.15F, false);

		PumoHandle4 = new ModelRenderer(this);
		PumoHandle4.setRotationPoint(0.0F, -16.8245F, -10.9546F);
		Pump3.addChild(PumoHandle4);
		setRotationAngle(PumoHandle4, 0.2618F, 0.0F, 0.0F);
		PumoHandle4.setTextureOffset(65, 105).addBox(-1.5F, 3.125F, -6.5F, 1.0F, 4.0F, 1.0F, -0.25F, false);
		PumoHandle4.setTextureOffset(65, 105).addBox(-1.5F, 3.75F, -6.5F, 1.0F, 1.0F, 1.0F, -0.125F, false);
		PumoHandle4.setTextureOffset(65, 105).addBox(-1.5F, 1.875F, -6.5F, 1.0F, 2.0F, 1.0F, -0.125F, false);

		TimeRotor = new ModelRenderer(this);
		TimeRotor.setRotationPoint(0.0F, 0.0F, 0.0F);
		AllConsole.addChild(TimeRotor);
		

		Innards = new ModelRenderer(this);
		Innards.setRotationPoint(0.0F, 0.0F, 0.0F);
		TimeRotor.addChild(Innards);
		

		Tubes = new ModelRenderer(this);
		Tubes.setRotationPoint(0.0F, 0.0F, 0.0F);
		Innards.addChild(Tubes);
		Tubes.setTextureOffset(248, 222).addBox(-3.5F, -48.5F, -1.0F, 2.0F, 32.0F, 2.0F, 0.0F, false);
		Tubes.setTextureOffset(248, 222).addBox(-1.0F, -48.5F, -3.5F, 2.0F, 32.0F, 2.0F, 0.0F, false);
		Tubes.setTextureOffset(248, 222).addBox(-1.0F, -48.5F, 1.5F, 2.0F, 32.0F, 2.0F, 0.0F, false);
		Tubes.setTextureOffset(248, 222).addBox(1.5F, -48.5F, -1.0F, 2.0F, 32.0F, 2.0F, 0.0F, false);

		Movable = new ModelRenderer(this);
		Movable.setRotationPoint(0.0F, 0.0F, 0.0F);
		Innards.addChild(Movable);
		

		Lower = new ModelRenderer(this);
		Lower.setRotationPoint(0.0F, -21.25F, 0.0F);
		Movable.addChild(Lower);
		Lower.setTextureOffset(225, 236).addBox(1.7F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower.addChild(bone37);
		setRotationAngle(bone37, 0.0F, -0.5236F, 0.0F);
		bone37.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower.addChild(bone38);
		setRotationAngle(bone38, 0.0F, -1.0472F, 0.0F);
		bone38.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower.addChild(bone39);
		setRotationAngle(bone39, 0.0F, -1.5708F, 0.0F);
		bone39.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower.addChild(bone40);
		setRotationAngle(bone40, 0.0F, -2.0944F, 0.0F);
		bone40.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower.addChild(bone41);
		setRotationAngle(bone41, 0.0F, -2.618F, 0.0F);
		bone41.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower.addChild(bone42);
		setRotationAngle(bone42, 0.0F, 3.1416F, 0.0F);
		bone42.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower.addChild(bone43);
		setRotationAngle(bone43, 0.0F, 2.618F, 0.0F);
		bone43.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower.addChild(bone44);
		setRotationAngle(bone44, 0.0F, 2.0944F, 0.0F);
		bone44.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower.addChild(bone45);
		setRotationAngle(bone45, 0.0F, 1.5708F, 0.0F);
		bone45.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower.addChild(bone46);
		setRotationAngle(bone46, 0.0F, 1.0472F, 0.0F);
		bone46.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower.addChild(bone47);
		setRotationAngle(bone47, 0.0F, 0.5236F, 0.0F);
		bone47.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		Lower2 = new ModelRenderer(this);
		Lower2.setRotationPoint(0.0F, -1.5F, 0.0F);
		Lower.addChild(Lower2);
		Lower2.setTextureOffset(225, 236).addBox(1.7F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower2.addChild(bone48);
		setRotationAngle(bone48, 0.0F, -0.5236F, 0.0F);
		bone48.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower2.addChild(bone49);
		setRotationAngle(bone49, 0.0F, -1.0472F, 0.0F);
		bone49.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower2.addChild(bone50);
		setRotationAngle(bone50, 0.0F, -1.5708F, 0.0F);
		bone50.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower2.addChild(bone51);
		setRotationAngle(bone51, 0.0F, -2.0944F, 0.0F);
		bone51.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower2.addChild(bone52);
		setRotationAngle(bone52, 0.0F, -2.618F, 0.0F);
		bone52.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower2.addChild(bone53);
		setRotationAngle(bone53, 0.0F, 3.1416F, 0.0F);
		bone53.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		bone54 = new ModelRenderer(this);
		bone54.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower2.addChild(bone54);
		setRotationAngle(bone54, 0.0F, 2.618F, 0.0F);
		bone54.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone55 = new ModelRenderer(this);
		bone55.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower2.addChild(bone55);
		setRotationAngle(bone55, 0.0F, 2.0944F, 0.0F);
		bone55.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		bone56 = new ModelRenderer(this);
		bone56.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower2.addChild(bone56);
		setRotationAngle(bone56, 0.0F, 1.5708F, 0.0F);
		bone56.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone57 = new ModelRenderer(this);
		bone57.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower2.addChild(bone57);
		setRotationAngle(bone57, 0.0F, 1.0472F, 0.0F);
		bone57.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		bone58 = new ModelRenderer(this);
		bone58.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower2.addChild(bone58);
		setRotationAngle(bone58, 0.0F, 0.5236F, 0.0F);
		bone58.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		Upper = new ModelRenderer(this);
		Upper.setRotationPoint(0.0F, -44.0F, 0.0F);
		Movable.addChild(Upper);
		Upper.setTextureOffset(225, 236).addBox(1.7F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone59 = new ModelRenderer(this);
		bone59.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper.addChild(bone59);
		setRotationAngle(bone59, 0.0F, -0.5236F, 0.0F);
		bone59.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		bone60 = new ModelRenderer(this);
		bone60.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper.addChild(bone60);
		setRotationAngle(bone60, 0.0F, -1.0472F, 0.0F);
		bone60.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone61 = new ModelRenderer(this);
		bone61.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper.addChild(bone61);
		setRotationAngle(bone61, 0.0F, -1.5708F, 0.0F);
		bone61.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		bone62 = new ModelRenderer(this);
		bone62.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper.addChild(bone62);
		setRotationAngle(bone62, 0.0F, -2.0944F, 0.0F);
		bone62.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone63 = new ModelRenderer(this);
		bone63.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper.addChild(bone63);
		setRotationAngle(bone63, 0.0F, -2.618F, 0.0F);
		bone63.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		bone64 = new ModelRenderer(this);
		bone64.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper.addChild(bone64);
		setRotationAngle(bone64, 0.0F, 3.1416F, 0.0F);
		bone64.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone65 = new ModelRenderer(this);
		bone65.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper.addChild(bone65);
		setRotationAngle(bone65, 0.0F, 2.618F, 0.0F);
		bone65.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		bone66 = new ModelRenderer(this);
		bone66.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper.addChild(bone66);
		setRotationAngle(bone66, 0.0F, 2.0944F, 0.0F);
		bone66.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone67 = new ModelRenderer(this);
		bone67.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper.addChild(bone67);
		setRotationAngle(bone67, 0.0F, 1.5708F, 0.0F);
		bone67.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		bone68 = new ModelRenderer(this);
		bone68.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper.addChild(bone68);
		setRotationAngle(bone68, 0.0F, 1.0472F, 0.0F);
		bone68.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone69 = new ModelRenderer(this);
		bone69.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper.addChild(bone69);
		setRotationAngle(bone69, 0.0F, 0.5236F, 0.0F);
		bone69.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		Upper2 = new ModelRenderer(this);
		Upper2.setRotationPoint(0.0F, -1.5F, 0.0F);
		Upper.addChild(Upper2);
		Upper2.setTextureOffset(225, 236).addBox(1.7F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone70 = new ModelRenderer(this);
		bone70.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper2.addChild(bone70);
		setRotationAngle(bone70, 0.0F, -0.5236F, 0.0F);
		bone70.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		bone71 = new ModelRenderer(this);
		bone71.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper2.addChild(bone71);
		setRotationAngle(bone71, 0.0F, -1.0472F, 0.0F);
		bone71.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone72 = new ModelRenderer(this);
		bone72.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper2.addChild(bone72);
		setRotationAngle(bone72, 0.0F, -1.5708F, 0.0F);
		bone72.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		bone73 = new ModelRenderer(this);
		bone73.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper2.addChild(bone73);
		setRotationAngle(bone73, 0.0F, -2.0944F, 0.0F);
		bone73.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone74 = new ModelRenderer(this);
		bone74.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper2.addChild(bone74);
		setRotationAngle(bone74, 0.0F, -2.618F, 0.0F);
		bone74.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		bone75 = new ModelRenderer(this);
		bone75.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper2.addChild(bone75);
		setRotationAngle(bone75, 0.0F, 3.1416F, 0.0F);
		bone75.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone76 = new ModelRenderer(this);
		bone76.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper2.addChild(bone76);
		setRotationAngle(bone76, 0.0F, 2.618F, 0.0F);
		bone76.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		bone77 = new ModelRenderer(this);
		bone77.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper2.addChild(bone77);
		setRotationAngle(bone77, 0.0F, 2.0944F, 0.0F);
		bone77.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone78 = new ModelRenderer(this);
		bone78.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper2.addChild(bone78);
		setRotationAngle(bone78, 0.0F, 1.5708F, 0.0F);
		bone78.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		bone79 = new ModelRenderer(this);
		bone79.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper2.addChild(bone79);
		setRotationAngle(bone79, 0.0F, 1.0472F, 0.0F);
		bone79.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		bone80 = new ModelRenderer(this);
		bone80.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper2.addChild(bone80);
		setRotationAngle(bone80, 0.0F, 0.5236F, 0.0F);
		bone80.setTextureOffset(225, 236).addBox(1.7F, -0.875F, -1.0F, 2.0F, 1.0F, 2.0F, 0.01F, false);

		Console = new ModelRenderer(this);
		Console.setRotationPoint(0.0F, 0.0F, 0.0F);
		AllConsole.addChild(Console);
		

		LighterCoral = new ModelRenderer(this);
		LighterCoral.setRotationPoint(0.0F, -1.0F, 0.0F);
		Console.addChild(LighterCoral);
		

		Block1 = new ModelRenderer(this);
		Block1.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block1);
		Block1.setTextureOffset(95, 219).addBox(-4.0F, -11.5F, -14.935F, 8.0F, 2.0F, 3.0F, 0.01F, false);
		Block1.setTextureOffset(95, 219).addBox(-4.0F, -11.75F, -14.81F, 8.0F, 2.0F, 2.0F, 0.0F, false);

		Block2 = new ModelRenderer(this);
		Block2.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block2);
		setRotationAngle(Block2, 0.0F, 0.5236F, 0.0F);
		Block2.setTextureOffset(95, 219).addBox(-4.0F, -11.5F, -14.935F, 8.0F, 2.0F, 3.0F, 0.0F, false);
		Block2.setTextureOffset(95, 219).addBox(-4.0F, -11.75F, -14.81F, 8.0F, 2.0F, 2.0F, 0.01F, false);

		Block3 = new ModelRenderer(this);
		Block3.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block3);
		setRotationAngle(Block3, 0.0F, -0.5236F, 0.0F);
		Block3.setTextureOffset(95, 219).addBox(-4.0F, -11.5F, -14.935F, 8.0F, 2.0F, 3.0F, 0.0F, false);
		Block3.setTextureOffset(95, 219).addBox(-4.0F, -11.75F, -14.81F, 8.0F, 2.0F, 2.0F, 0.01F, false);

		Block4 = new ModelRenderer(this);
		Block4.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block4);
		setRotationAngle(Block4, 0.0F, -1.0472F, 0.0F);
		Block4.setTextureOffset(95, 219).addBox(-4.0F, -11.5F, -14.935F, 8.0F, 2.0F, 3.0F, 0.01F, false);
		Block4.setTextureOffset(95, 219).addBox(-4.0F, -11.75F, -14.81F, 8.0F, 2.0F, 2.0F, 0.0F, false);

		Block5 = new ModelRenderer(this);
		Block5.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block5);
		setRotationAngle(Block5, 0.0F, -1.5708F, 0.0F);
		Block5.setTextureOffset(95, 219).addBox(-4.0F, -11.5F, -14.935F, 8.0F, 2.0F, 3.0F, 0.0F, false);
		Block5.setTextureOffset(95, 219).addBox(-4.0F, -11.75F, -14.81F, 8.0F, 2.0F, 2.0F, 0.01F, false);

		Block6 = new ModelRenderer(this);
		Block6.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block6);
		setRotationAngle(Block6, 0.0F, -2.0944F, 0.0F);
		Block6.setTextureOffset(95, 219).addBox(-4.0F, -11.5F, -14.935F, 8.0F, 2.0F, 3.0F, 0.01F, false);
		Block6.setTextureOffset(95, 219).addBox(-4.0F, -11.75F, -14.81F, 8.0F, 2.0F, 2.0F, 0.0F, false);

		Block7 = new ModelRenderer(this);
		Block7.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block7);
		setRotationAngle(Block7, 0.0F, -2.618F, 0.0F);
		Block7.setTextureOffset(95, 219).addBox(-4.0F, -11.5F, -14.935F, 8.0F, 2.0F, 3.0F, 0.0F, false);
		Block7.setTextureOffset(95, 219).addBox(-4.0F, -11.75F, -14.81F, 8.0F, 2.0F, 2.0F, 0.01F, false);

		Block8 = new ModelRenderer(this);
		Block8.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block8);
		setRotationAngle(Block8, 0.0F, 3.1416F, 0.0F);
		Block8.setTextureOffset(95, 219).addBox(-4.0F, -11.5F, -14.935F, 8.0F, 2.0F, 3.0F, 0.01F, false);
		Block8.setTextureOffset(95, 219).addBox(-4.0F, -11.75F, -14.81F, 8.0F, 2.0F, 2.0F, 0.0F, false);

		Block9 = new ModelRenderer(this);
		Block9.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block9);
		setRotationAngle(Block9, 0.0F, 2.618F, 0.0F);
		Block9.setTextureOffset(95, 219).addBox(-4.0F, -11.5F, -14.935F, 8.0F, 2.0F, 3.0F, 0.0F, false);
		Block9.setTextureOffset(95, 219).addBox(-4.0F, -11.75F, -14.81F, 8.0F, 2.0F, 2.0F, 0.01F, false);

		Block10 = new ModelRenderer(this);
		Block10.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block10);
		setRotationAngle(Block10, 0.0F, 2.0944F, 0.0F);
		Block10.setTextureOffset(95, 219).addBox(-4.0F, -11.5F, -14.935F, 8.0F, 2.0F, 3.0F, 0.01F, false);
		Block10.setTextureOffset(95, 219).addBox(-4.0F, -11.75F, -14.81F, 8.0F, 2.0F, 2.0F, 0.0F, false);

		Block11 = new ModelRenderer(this);
		Block11.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block11);
		setRotationAngle(Block11, 0.0F, 1.5708F, 0.0F);
		Block11.setTextureOffset(95, 219).addBox(-4.0F, -11.5F, -14.935F, 8.0F, 2.0F, 3.0F, 0.0F, false);
		Block11.setTextureOffset(95, 219).addBox(-4.0F, -11.75F, -14.81F, 8.0F, 2.0F, 2.0F, 0.01F, false);

		Block12 = new ModelRenderer(this);
		Block12.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block12);
		setRotationAngle(Block12, 0.0F, 1.0472F, 0.0F);
		Block12.setTextureOffset(95, 219).addBox(-4.0F, -11.5F, -14.935F, 8.0F, 2.0F, 3.0F, 0.01F, false);
		Block12.setTextureOffset(95, 219).addBox(-4.0F, -11.75F, -14.81F, 8.0F, 2.0F, 2.0F, 0.0F, false);

		Coral = new ModelRenderer(this);
		Coral.setRotationPoint(0.0F, -0.5F, 0.0F);
		Console.addChild(Coral);
		

		Edge5 = new ModelRenderer(this);
		Edge5.setRotationPoint(0.0F, 0.0F, 0.0F);
		Coral.addChild(Edge5);
		

		Cube20 = new ModelRenderer(this);
		Cube20.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge5.addChild(Cube20);
		setRotationAngle(Cube20, 0.6981F, 0.0F, 0.0F);
		Cube20.setTextureOffset(163, 227).addBox(-1.5F, -17.1696F, -5.7406F, 3.0F, 2.0F, 2.0F, 0.005F, false);

		Cube21 = new ModelRenderer(this);
		Cube21.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge5.addChild(Cube21);
		setRotationAngle(Cube21, -0.5236F, 0.0F, 0.0F);
		Cube21.setTextureOffset(163, 227).addBox(-1.5F, -5.076F, -19.5975F, 3.0F, 2.0F, 2.0F, 0.005F, false);

		Cube22 = new ModelRenderer(this);
		Cube22.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge5.addChild(Cube22);
		setRotationAngle(Cube22, -1.0472F, 0.0F, 0.0F);
		Cube22.setTextureOffset(163, 227).addBox(-1.5F, 2.4028F, -19.5099F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		Cube23 = new ModelRenderer(this);
		Cube23.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge5.addChild(Cube23);
		setRotationAngle(Cube23, -1.309F, 0.0F, 0.0F);
		Cube23.setTextureOffset(163, 227).addBox(-1.5F, 2.3705F, -18.2233F, 3.0F, 5.0F, 2.0F, 0.005F, false);

		Cube24 = new ModelRenderer(this);
		Cube24.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge5.addChild(Cube24);
		setRotationAngle(Cube24, -1.3963F, 0.0F, 0.0F);
		Cube24.setTextureOffset(163, 227).addBox(-1.5F, 0.9497F, -17.9473F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		Cube25 = new ModelRenderer(this);
		Cube25.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge5.addChild(Cube25);
		setRotationAngle(Cube25, 0.7854F, 0.0F, 0.0F);
		Cube25.setTextureOffset(163, 227).addBox(-1.5F, -15.6122F, -4.3967F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		Cube26 = new ModelRenderer(this);
		Cube26.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge5.addChild(Cube26);
		setRotationAngle(Cube26, 0.9599F, 0.0F, 0.0F);
		Cube26.setTextureOffset(163, 227).addBox(-1.5F, -14.1688F, -1.9661F, 3.0F, 5.0F, 4.0F, 0.005F, false);

		Cube27 = new ModelRenderer(this);
		Cube27.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge5.addChild(Cube27);
		setRotationAngle(Cube27, 1.1345F, 0.0F, 0.0F);
		Cube27.setTextureOffset(163, 227).addBox(-1.5F, -9.3709F, -0.3441F, 3.0F, 5.0F, 4.0F, 0.0F, false);
		Cube27.setTextureOffset(146, 217).addBox(-1.5F, -5.8084F, -5.3441F, 3.0F, 2.0F, 5.0F, 0.005F, false);

		Cube37 = new ModelRenderer(this);
		Cube37.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge5.addChild(Cube37);
		Cube37.setTextureOffset(163, 227).addBox(-1.5F, -12.4626F, -15.4339F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		Edge2 = new ModelRenderer(this);
		Edge2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Coral.addChild(Edge2);
		setRotationAngle(Edge2, 0.0F, -1.0472F, 0.0F);
		

		Cube2 = new ModelRenderer(this);
		Cube2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge2.addChild(Cube2);
		setRotationAngle(Cube2, 0.6981F, 0.0F, 0.0F);
		Cube2.setTextureOffset(163, 227).addBox(-1.5F, -17.1696F, -5.7406F, 3.0F, 2.0F, 2.0F, 0.005F, false);

		Cube3 = new ModelRenderer(this);
		Cube3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge2.addChild(Cube3);
		setRotationAngle(Cube3, -0.5236F, 0.0F, 0.0F);
		Cube3.setTextureOffset(163, 227).addBox(-1.5F, -5.076F, -19.5975F, 3.0F, 2.0F, 2.0F, 0.005F, false);

		Cube4 = new ModelRenderer(this);
		Cube4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge2.addChild(Cube4);
		setRotationAngle(Cube4, -1.0472F, 0.0F, 0.0F);
		Cube4.setTextureOffset(163, 227).addBox(-1.5F, 2.4028F, -19.5099F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		Cube5 = new ModelRenderer(this);
		Cube5.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge2.addChild(Cube5);
		setRotationAngle(Cube5, -1.309F, 0.0F, 0.0F);
		Cube5.setTextureOffset(163, 227).addBox(-1.5F, 2.3705F, -18.2233F, 3.0F, 5.0F, 2.0F, 0.005F, false);

		Cube6 = new ModelRenderer(this);
		Cube6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge2.addChild(Cube6);
		setRotationAngle(Cube6, -1.3963F, 0.0F, 0.0F);
		Cube6.setTextureOffset(163, 227).addBox(-1.5F, 0.9497F, -17.9473F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		Cube7 = new ModelRenderer(this);
		Cube7.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge2.addChild(Cube7);
		setRotationAngle(Cube7, 0.7854F, 0.0F, 0.0F);
		Cube7.setTextureOffset(163, 227).addBox(-1.5F, -15.6122F, -4.3967F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		Cube8 = new ModelRenderer(this);
		Cube8.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge2.addChild(Cube8);
		setRotationAngle(Cube8, 0.9599F, 0.0F, 0.0F);
		Cube8.setTextureOffset(163, 227).addBox(-1.5F, -14.1688F, -1.9661F, 3.0F, 5.0F, 4.0F, 0.005F, false);

		Cube9 = new ModelRenderer(this);
		Cube9.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge2.addChild(Cube9);
		setRotationAngle(Cube9, 1.1345F, 0.0F, 0.0F);
		Cube9.setTextureOffset(163, 227).addBox(-1.5F, -9.3709F, -0.3441F, 3.0F, 5.0F, 4.0F, 0.0F, false);
		Cube9.setTextureOffset(146, 217).addBox(-1.5F, -5.8084F, -5.3441F, 3.0F, 2.0F, 5.0F, 0.005F, false);

		Cube10 = new ModelRenderer(this);
		Cube10.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge2.addChild(Cube10);
		Cube10.setTextureOffset(163, 227).addBox(-1.5F, -12.4626F, -15.4339F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		Edge3 = new ModelRenderer(this);
		Edge3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Coral.addChild(Edge3);
		setRotationAngle(Edge3, 0.0F, -2.0944F, 0.0F);
		

		Cube11 = new ModelRenderer(this);
		Cube11.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge3.addChild(Cube11);
		setRotationAngle(Cube11, 0.6981F, 0.0F, 0.0F);
		Cube11.setTextureOffset(163, 227).addBox(-1.5F, -17.1696F, -5.7406F, 3.0F, 2.0F, 2.0F, 0.005F, false);

		Cube12 = new ModelRenderer(this);
		Cube12.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge3.addChild(Cube12);
		setRotationAngle(Cube12, -0.5236F, 0.0F, 0.0F);
		Cube12.setTextureOffset(163, 227).addBox(-1.5F, -5.076F, -19.5975F, 3.0F, 2.0F, 2.0F, 0.005F, false);

		Cube13 = new ModelRenderer(this);
		Cube13.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge3.addChild(Cube13);
		setRotationAngle(Cube13, -1.0472F, 0.0F, 0.0F);
		Cube13.setTextureOffset(163, 227).addBox(-1.5F, 2.4028F, -19.5099F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		Cube14 = new ModelRenderer(this);
		Cube14.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge3.addChild(Cube14);
		setRotationAngle(Cube14, -1.309F, 0.0F, 0.0F);
		Cube14.setTextureOffset(163, 227).addBox(-1.5F, 2.3705F, -18.2233F, 3.0F, 5.0F, 2.0F, 0.005F, false);

		Cube15 = new ModelRenderer(this);
		Cube15.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge3.addChild(Cube15);
		setRotationAngle(Cube15, -1.3963F, 0.0F, 0.0F);
		Cube15.setTextureOffset(163, 227).addBox(-1.5F, 0.9497F, -17.9473F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		Cube16 = new ModelRenderer(this);
		Cube16.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge3.addChild(Cube16);
		setRotationAngle(Cube16, 0.7854F, 0.0F, 0.0F);
		Cube16.setTextureOffset(163, 227).addBox(-1.5F, -15.6122F, -4.3967F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		Cube17 = new ModelRenderer(this);
		Cube17.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge3.addChild(Cube17);
		setRotationAngle(Cube17, 0.9599F, 0.0F, 0.0F);
		Cube17.setTextureOffset(163, 227).addBox(-1.5F, -14.1688F, -1.9661F, 3.0F, 10.0F, 4.0F, 0.005F, false);

		Cube18 = new ModelRenderer(this);
		Cube18.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge3.addChild(Cube18);
		setRotationAngle(Cube18, 1.1345F, 0.0F, 0.0F);
		Cube18.setTextureOffset(163, 227).addBox(-1.5F, -9.3709F, 3.6559F, 3.0F, 5.0F, 0.0F, 0.0F, false);
		Cube18.setTextureOffset(146, 217).addBox(-1.5F, -5.8084F, -5.3441F, 3.0F, 2.0F, 5.0F, 0.005F, false);

		Cube19 = new ModelRenderer(this);
		Cube19.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge3.addChild(Cube19);
		Cube19.setTextureOffset(163, 227).addBox(-1.5F, -12.4626F, -15.4339F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		Edge4 = new ModelRenderer(this);
		Edge4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Coral.addChild(Edge4);
		setRotationAngle(Edge4, 0.0F, 3.1416F, 0.0F);
		

		Cube28 = new ModelRenderer(this);
		Cube28.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge4.addChild(Cube28);
		setRotationAngle(Cube28, 0.6981F, 0.0F, 0.0F);
		Cube28.setTextureOffset(163, 227).addBox(-1.5F, -17.1696F, -5.7406F, 3.0F, 2.0F, 2.0F, 0.005F, false);

		Cube29 = new ModelRenderer(this);
		Cube29.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge4.addChild(Cube29);
		setRotationAngle(Cube29, -0.5236F, 0.0F, 0.0F);
		Cube29.setTextureOffset(163, 227).addBox(-1.5F, -5.076F, -19.5975F, 3.0F, 2.0F, 2.0F, 0.005F, false);

		Cube30 = new ModelRenderer(this);
		Cube30.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge4.addChild(Cube30);
		setRotationAngle(Cube30, -1.0472F, 0.0F, 0.0F);
		Cube30.setTextureOffset(163, 227).addBox(-1.5F, 2.4028F, -19.5099F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		Cube31 = new ModelRenderer(this);
		Cube31.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge4.addChild(Cube31);
		setRotationAngle(Cube31, -1.309F, 0.0F, 0.0F);
		Cube31.setTextureOffset(163, 227).addBox(-1.5F, 2.3705F, -18.2233F, 3.0F, 5.0F, 2.0F, 0.005F, false);

		Cube32 = new ModelRenderer(this);
		Cube32.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge4.addChild(Cube32);
		setRotationAngle(Cube32, -1.3963F, 0.0F, 0.0F);
		Cube32.setTextureOffset(163, 227).addBox(-1.5F, 0.9497F, -17.9473F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		Cube33 = new ModelRenderer(this);
		Cube33.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge4.addChild(Cube33);
		setRotationAngle(Cube33, 0.7854F, 0.0F, 0.0F);
		Cube33.setTextureOffset(163, 227).addBox(-1.5F, -15.6122F, -4.3967F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		Cube34 = new ModelRenderer(this);
		Cube34.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge4.addChild(Cube34);
		setRotationAngle(Cube34, 0.9599F, 0.0F, 0.0F);
		Cube34.setTextureOffset(163, 227).addBox(-1.5F, -14.1688F, -1.9661F, 3.0F, 5.0F, 4.0F, 0.005F, false);

		Cube35 = new ModelRenderer(this);
		Cube35.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge4.addChild(Cube35);
		setRotationAngle(Cube35, 1.1345F, 0.0F, 0.0F);
		Cube35.setTextureOffset(163, 227).addBox(-1.5F, -9.3709F, -0.3441F, 3.0F, 5.0F, 4.0F, 0.0F, false);
		Cube35.setTextureOffset(146, 217).addBox(-1.5F, -5.8084F, -5.3441F, 3.0F, 2.0F, 5.0F, 0.005F, false);

		Cube36 = new ModelRenderer(this);
		Cube36.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge4.addChild(Cube36);
		Cube36.setTextureOffset(163, 227).addBox(-1.5F, -12.4626F, -15.4339F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		Edge6 = new ModelRenderer(this);
		Edge6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Coral.addChild(Edge6);
		setRotationAngle(Edge6, 0.0F, 2.0944F, 0.0F);
		

		Cube38 = new ModelRenderer(this);
		Cube38.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge6.addChild(Cube38);
		setRotationAngle(Cube38, 0.6981F, 0.0F, 0.0F);
		Cube38.setTextureOffset(163, 227).addBox(-1.5F, -17.1696F, -5.7406F, 3.0F, 2.0F, 2.0F, 0.005F, false);

		Cube39 = new ModelRenderer(this);
		Cube39.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge6.addChild(Cube39);
		setRotationAngle(Cube39, -0.5236F, 0.0F, 0.0F);
		Cube39.setTextureOffset(163, 227).addBox(-1.5F, -5.076F, -19.5975F, 3.0F, 2.0F, 2.0F, 0.005F, false);

		Cube40 = new ModelRenderer(this);
		Cube40.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge6.addChild(Cube40);
		setRotationAngle(Cube40, -1.0472F, 0.0F, 0.0F);
		Cube40.setTextureOffset(163, 227).addBox(-1.5F, 2.4028F, -19.5099F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		Cube41 = new ModelRenderer(this);
		Cube41.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge6.addChild(Cube41);
		setRotationAngle(Cube41, -1.309F, 0.0F, 0.0F);
		Cube41.setTextureOffset(163, 227).addBox(-1.5F, 2.3705F, -18.2233F, 3.0F, 5.0F, 2.0F, 0.005F, false);

		Cube42 = new ModelRenderer(this);
		Cube42.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge6.addChild(Cube42);
		setRotationAngle(Cube42, -1.3963F, 0.0F, 0.0F);
		Cube42.setTextureOffset(163, 227).addBox(-1.5F, 0.9497F, -17.9473F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		Cube43 = new ModelRenderer(this);
		Cube43.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge6.addChild(Cube43);
		setRotationAngle(Cube43, 0.7854F, 0.0F, 0.0F);
		Cube43.setTextureOffset(163, 227).addBox(-1.5F, -15.6122F, -4.3967F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		Cube44 = new ModelRenderer(this);
		Cube44.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge6.addChild(Cube44);
		setRotationAngle(Cube44, 0.9599F, 0.0F, 0.0F);
		Cube44.setTextureOffset(163, 227).addBox(-1.5F, -14.1688F, -1.9661F, 3.0F, 5.0F, 4.0F, 0.005F, false);

		Cube45 = new ModelRenderer(this);
		Cube45.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge6.addChild(Cube45);
		setRotationAngle(Cube45, 1.1345F, 0.0F, 0.0F);
		Cube45.setTextureOffset(163, 227).addBox(-1.5F, -9.3709F, -0.3441F, 3.0F, 5.0F, 4.0F, 0.0F, false);
		Cube45.setTextureOffset(146, 217).addBox(-1.5F, -5.8084F, -5.3441F, 3.0F, 2.0F, 5.0F, 0.005F, false);

		Cube46 = new ModelRenderer(this);
		Cube46.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge6.addChild(Cube46);
		Cube46.setTextureOffset(163, 227).addBox(-1.5F, -12.4626F, -15.4339F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		Edge7 = new ModelRenderer(this);
		Edge7.setRotationPoint(0.0F, 0.0F, 0.0F);
		Coral.addChild(Edge7);
		setRotationAngle(Edge7, 0.0F, 1.0472F, 0.0F);
		

		Cube47 = new ModelRenderer(this);
		Cube47.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge7.addChild(Cube47);
		setRotationAngle(Cube47, 0.6981F, 0.0F, 0.0F);
		Cube47.setTextureOffset(163, 227).addBox(-1.5F, -17.1696F, -5.7406F, 3.0F, 2.0F, 2.0F, 0.005F, false);

		Cube48 = new ModelRenderer(this);
		Cube48.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge7.addChild(Cube48);
		setRotationAngle(Cube48, -0.5236F, 0.0F, 0.0F);
		Cube48.setTextureOffset(163, 227).addBox(-1.5F, -5.076F, -19.5975F, 3.0F, 2.0F, 2.0F, 0.005F, false);

		Cube49 = new ModelRenderer(this);
		Cube49.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge7.addChild(Cube49);
		setRotationAngle(Cube49, -1.0472F, 0.0F, 0.0F);
		Cube49.setTextureOffset(163, 227).addBox(-1.5F, 2.4028F, -19.5099F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		Cube50 = new ModelRenderer(this);
		Cube50.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge7.addChild(Cube50);
		setRotationAngle(Cube50, -1.309F, 0.0F, 0.0F);
		Cube50.setTextureOffset(163, 227).addBox(-1.5F, 2.3705F, -18.2233F, 3.0F, 5.0F, 2.0F, 0.005F, false);

		Cube51 = new ModelRenderer(this);
		Cube51.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge7.addChild(Cube51);
		setRotationAngle(Cube51, -1.3963F, 0.0F, 0.0F);
		Cube51.setTextureOffset(163, 227).addBox(-1.5F, 0.9497F, -17.9473F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		Cube52 = new ModelRenderer(this);
		Cube52.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge7.addChild(Cube52);
		setRotationAngle(Cube52, 0.7854F, 0.0F, 0.0F);
		Cube52.setTextureOffset(163, 227).addBox(-1.5F, -15.6122F, -4.3967F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		Cube53 = new ModelRenderer(this);
		Cube53.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge7.addChild(Cube53);
		setRotationAngle(Cube53, 0.9599F, 0.0F, 0.0F);
		Cube53.setTextureOffset(163, 227).addBox(-1.5F, -14.1688F, -1.9661F, 3.0F, 5.0F, 4.0F, 0.005F, false);

		Cube54 = new ModelRenderer(this);
		Cube54.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge7.addChild(Cube54);
		setRotationAngle(Cube54, 1.1345F, 0.0F, 0.0F);
		Cube54.setTextureOffset(163, 227).addBox(-1.5F, -9.3709F, -0.3441F, 3.0F, 5.0F, 4.0F, 0.0F, false);
		Cube54.setTextureOffset(146, 217).addBox(-1.5F, -5.8084F, -5.3441F, 3.0F, 2.0F, 5.0F, 0.005F, false);

		Cube66 = new ModelRenderer(this);
		Cube66.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge7.addChild(Cube66);
		Cube66.setTextureOffset(163, 227).addBox(-1.5F, -12.4626F, -15.4339F, 3.0F, 3.0F, 2.0F, 0.0F, false);

		UpperRing = new ModelRenderer(this);
		UpperRing.setRotationPoint(0.0F, 0.0F, 0.0F);
		Console.addChild(UpperRing);
		

		Cube1 = new ModelRenderer(this);
		Cube1.setRotationPoint(0.0F, 0.0F, 0.0F);
		UpperRing.addChild(Cube1);
		Cube1.setTextureOffset(97, 221).addBox(-6.16F, -18.5F, -2.0F, 2.0F, 2.0F, 4.0F, 0.01F, false);
		Cube1.setTextureOffset(97, 221).addBox(-6.16F, -21.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.01F, false);
		Cube1.setTextureOffset(97, 221).addBox(-5.66F, -20.25F, -2.0F, 2.0F, 2.0F, 4.0F, -0.24F, false);
		Cube1.setTextureOffset(97, 221).addBox(-5.66F, -51.25F, -2.0F, 2.0F, 5.0F, 4.0F, -0.24F, false);
		Cube1.setTextureOffset(97, 221).addBox(-6.16F, -49.75F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		Cube1.setTextureOffset(97, 221).addBox(-7.66F, -52.875F, -2.5F, 6.0F, 2.0F, 5.0F, 0.0F, false);
		Cube1.setTextureOffset(97, 221).addBox(-9.2019F, -80.7838F, -3.0F, 2.0F, 24.0F, 6.0F, 0.0F, false);
		Cube1.setTextureOffset(97, 221).addBox(-6.16F, -49.75F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		Cube1.setTextureOffset(97, 221).addBox(-6.16F, -17.5F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		UpperRoof = new ModelRenderer(this);
		UpperRoof.setRotationPoint(-2.75F, -47.5F, 0.0F);
		Cube1.addChild(UpperRoof);
		setRotationAngle(UpperRoof, 0.0F, 0.0F, -0.1745F);
		UpperRoof.setTextureOffset(97, 221).addBox(-3.902F, -12.146F, -2.5F, 2.0F, 7.0F, 5.0F, 0.0F, false);

		Cube55 = new ModelRenderer(this);
		Cube55.setRotationPoint(0.0F, 0.0F, 0.0F);
		UpperRing.addChild(Cube55);
		setRotationAngle(Cube55, 0.0F, -0.6283F, 0.0F);
		Cube55.setTextureOffset(97, 221).addBox(-6.16F, -18.5F, -2.0F, 2.0F, 2.0F, 4.0F, 0.01F, false);
		Cube55.setTextureOffset(97, 221).addBox(-6.16F, -21.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.01F, false);
		Cube55.setTextureOffset(97, 221).addBox(-5.66F, -20.25F, -2.0F, 2.0F, 2.0F, 4.0F, -0.24F, false);
		Cube55.setTextureOffset(97, 221).addBox(-5.66F, -51.25F, -2.0F, 2.0F, 5.0F, 4.0F, -0.24F, false);
		Cube55.setTextureOffset(97, 221).addBox(-6.16F, -49.75F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		Cube55.setTextureOffset(97, 221).addBox(-7.66F, -52.875F, -2.5F, 6.0F, 2.0F, 5.0F, 0.0F, false);
		Cube55.setTextureOffset(97, 221).addBox(-9.2019F, -80.7838F, -3.0F, 2.0F, 24.0F, 6.0F, 0.0F, false);
		Cube55.setTextureOffset(97, 221).addBox(-6.16F, -49.75F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		Cube55.setTextureOffset(97, 221).addBox(-6.16F, -17.5F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		UpperRoof2 = new ModelRenderer(this);
		UpperRoof2.setRotationPoint(-2.75F, -47.5F, 0.0F);
		Cube55.addChild(UpperRoof2);
		setRotationAngle(UpperRoof2, 0.0F, 0.0F, -0.1745F);
		UpperRoof2.setTextureOffset(97, 221).addBox(-3.902F, -12.146F, -2.5F, 2.0F, 7.0F, 5.0F, 0.0F, false);

		Cube56 = new ModelRenderer(this);
		Cube56.setRotationPoint(0.0F, 0.0F, 0.0F);
		UpperRing.addChild(Cube56);
		setRotationAngle(Cube56, 0.0F, -1.2566F, 0.0F);
		Cube56.setTextureOffset(97, 221).addBox(-6.16F, -18.5F, -2.0F, 2.0F, 2.0F, 4.0F, 0.01F, false);
		Cube56.setTextureOffset(97, 221).addBox(-6.16F, -21.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.01F, false);
		Cube56.setTextureOffset(97, 221).addBox(-5.66F, -20.25F, -2.0F, 2.0F, 2.0F, 4.0F, -0.24F, false);
		Cube56.setTextureOffset(97, 221).addBox(-5.66F, -51.25F, -2.0F, 2.0F, 5.0F, 4.0F, -0.24F, false);
		Cube56.setTextureOffset(97, 221).addBox(-6.16F, -49.75F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		Cube56.setTextureOffset(97, 221).addBox(-7.66F, -52.875F, -2.5F, 6.0F, 2.0F, 5.0F, 0.0F, false);
		Cube56.setTextureOffset(97, 221).addBox(-9.2019F, -80.7838F, -3.0F, 2.0F, 24.0F, 6.0F, 0.0F, false);
		Cube56.setTextureOffset(97, 221).addBox(-6.16F, -49.75F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		Cube56.setTextureOffset(97, 221).addBox(-6.16F, -17.5F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		UpperRoof3 = new ModelRenderer(this);
		UpperRoof3.setRotationPoint(-2.75F, -47.5F, 0.0F);
		Cube56.addChild(UpperRoof3);
		setRotationAngle(UpperRoof3, 0.0F, 0.0F, -0.1745F);
		UpperRoof3.setTextureOffset(97, 221).addBox(-3.902F, -12.146F, -2.5F, 2.0F, 7.0F, 5.0F, 0.0F, false);

		Cube57 = new ModelRenderer(this);
		Cube57.setRotationPoint(0.0F, 0.0F, 0.0F);
		UpperRing.addChild(Cube57);
		setRotationAngle(Cube57, 0.0F, -1.885F, 0.0F);
		Cube57.setTextureOffset(97, 221).addBox(-6.16F, -18.5F, -2.0F, 2.0F, 2.0F, 4.0F, 0.01F, false);
		Cube57.setTextureOffset(97, 221).addBox(-6.16F, -21.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.01F, false);
		Cube57.setTextureOffset(97, 221).addBox(-5.66F, -20.25F, -2.0F, 2.0F, 2.0F, 4.0F, -0.24F, false);
		Cube57.setTextureOffset(97, 221).addBox(-5.66F, -51.25F, -2.0F, 2.0F, 5.0F, 4.0F, -0.24F, false);
		Cube57.setTextureOffset(97, 221).addBox(-6.16F, -49.75F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		Cube57.setTextureOffset(97, 221).addBox(-7.66F, -52.875F, -2.5F, 6.0F, 2.0F, 5.0F, 0.0F, false);
		Cube57.setTextureOffset(97, 221).addBox(-9.2019F, -80.7838F, -3.0F, 2.0F, 24.0F, 6.0F, 0.0F, false);
		Cube57.setTextureOffset(97, 221).addBox(-6.16F, -49.75F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		Cube57.setTextureOffset(97, 221).addBox(-6.16F, -17.5F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		UpperRoof4 = new ModelRenderer(this);
		UpperRoof4.setRotationPoint(-2.75F, -47.5F, 0.0F);
		Cube57.addChild(UpperRoof4);
		setRotationAngle(UpperRoof4, 0.0F, 0.0F, -0.1745F);
		UpperRoof4.setTextureOffset(97, 221).addBox(-3.902F, -12.146F, -2.5F, 2.0F, 7.0F, 5.0F, 0.0F, false);

		Cube58 = new ModelRenderer(this);
		Cube58.setRotationPoint(0.0F, 0.0F, 0.0F);
		UpperRing.addChild(Cube58);
		setRotationAngle(Cube58, 0.0F, -2.5133F, 0.0F);
		Cube58.setTextureOffset(97, 221).addBox(-6.16F, -18.5F, -2.0F, 2.0F, 2.0F, 4.0F, 0.01F, false);
		Cube58.setTextureOffset(97, 221).addBox(-6.16F, -21.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.01F, false);
		Cube58.setTextureOffset(97, 221).addBox(-5.66F, -20.25F, -2.0F, 2.0F, 2.0F, 4.0F, -0.24F, false);
		Cube58.setTextureOffset(97, 221).addBox(-5.66F, -51.25F, -2.0F, 2.0F, 5.0F, 4.0F, -0.24F, false);
		Cube58.setTextureOffset(97, 221).addBox(-6.16F, -49.75F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		Cube58.setTextureOffset(97, 221).addBox(-7.66F, -52.875F, -2.5F, 6.0F, 2.0F, 5.0F, 0.0F, false);
		Cube58.setTextureOffset(97, 221).addBox(-9.2019F, -80.7838F, -3.0F, 2.0F, 24.0F, 6.0F, 0.0F, false);
		Cube58.setTextureOffset(97, 221).addBox(-6.16F, -49.75F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		Cube58.setTextureOffset(97, 221).addBox(-6.16F, -17.5F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		UpperRoof5 = new ModelRenderer(this);
		UpperRoof5.setRotationPoint(-2.75F, -47.5F, 0.0F);
		Cube58.addChild(UpperRoof5);
		setRotationAngle(UpperRoof5, 0.0F, 0.0F, -0.1745F);
		UpperRoof5.setTextureOffset(97, 221).addBox(-3.902F, -12.146F, -2.5F, 2.0F, 7.0F, 5.0F, 0.0F, false);

		Cube59 = new ModelRenderer(this);
		Cube59.setRotationPoint(0.0F, 0.0F, 0.0F);
		UpperRing.addChild(Cube59);
		setRotationAngle(Cube59, 0.0F, 3.1416F, 0.0F);
		Cube59.setTextureOffset(97, 221).addBox(-6.16F, -18.5F, -2.0F, 2.0F, 2.0F, 4.0F, 0.01F, false);
		Cube59.setTextureOffset(97, 221).addBox(-6.16F, -21.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.01F, false);
		Cube59.setTextureOffset(97, 221).addBox(-5.66F, -20.25F, -2.0F, 2.0F, 2.0F, 4.0F, -0.24F, false);
		Cube59.setTextureOffset(97, 221).addBox(-5.66F, -51.25F, -2.0F, 2.0F, 5.0F, 4.0F, -0.24F, false);
		Cube59.setTextureOffset(97, 221).addBox(-6.16F, -49.75F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		Cube59.setTextureOffset(97, 221).addBox(-7.66F, -52.875F, -2.5F, 6.0F, 2.0F, 5.0F, 0.0F, false);
		Cube59.setTextureOffset(97, 221).addBox(-9.2019F, -80.7838F, -3.0F, 2.0F, 24.0F, 6.0F, 0.0F, false);
		Cube59.setTextureOffset(97, 221).addBox(-6.16F, -49.75F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		Cube59.setTextureOffset(97, 221).addBox(-6.16F, -17.5F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		UpperRoof6 = new ModelRenderer(this);
		UpperRoof6.setRotationPoint(-2.75F, -47.5F, 0.0F);
		Cube59.addChild(UpperRoof6);
		setRotationAngle(UpperRoof6, 0.0F, 0.0F, -0.1745F);
		UpperRoof6.setTextureOffset(97, 221).addBox(-3.902F, -12.146F, -2.5F, 2.0F, 7.0F, 5.0F, 0.0F, false);

		Cube60 = new ModelRenderer(this);
		Cube60.setRotationPoint(0.0F, 0.0F, 0.0F);
		UpperRing.addChild(Cube60);
		setRotationAngle(Cube60, 0.0F, 2.5133F, 0.0F);
		Cube60.setTextureOffset(97, 221).addBox(-6.16F, -18.5F, -2.0F, 2.0F, 2.0F, 4.0F, 0.01F, false);
		Cube60.setTextureOffset(97, 221).addBox(-6.16F, -21.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.01F, false);
		Cube60.setTextureOffset(97, 221).addBox(-5.66F, -20.25F, -2.0F, 2.0F, 2.0F, 4.0F, -0.24F, false);
		Cube60.setTextureOffset(97, 221).addBox(-5.66F, -51.25F, -2.0F, 2.0F, 5.0F, 4.0F, -0.24F, false);
		Cube60.setTextureOffset(97, 221).addBox(-6.16F, -49.75F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		Cube60.setTextureOffset(97, 221).addBox(-7.66F, -52.875F, -2.5F, 6.0F, 2.0F, 5.0F, 0.0F, false);
		Cube60.setTextureOffset(97, 221).addBox(-9.2019F, -80.7838F, -3.0F, 2.0F, 24.0F, 6.0F, 0.0F, false);
		Cube60.setTextureOffset(97, 221).addBox(-6.16F, -49.75F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		Cube60.setTextureOffset(97, 221).addBox(-6.16F, -17.5F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		UpperRoof7 = new ModelRenderer(this);
		UpperRoof7.setRotationPoint(-2.75F, -47.5F, 0.0F);
		Cube60.addChild(UpperRoof7);
		setRotationAngle(UpperRoof7, 0.0F, 0.0F, -0.1745F);
		UpperRoof7.setTextureOffset(97, 221).addBox(-3.902F, -12.146F, -2.5F, 2.0F, 7.0F, 5.0F, 0.0F, false);

		Cube61 = new ModelRenderer(this);
		Cube61.setRotationPoint(0.0F, 0.0F, 0.0F);
		UpperRing.addChild(Cube61);
		setRotationAngle(Cube61, 0.0F, 1.885F, 0.0F);
		Cube61.setTextureOffset(97, 221).addBox(-6.16F, -18.5F, -2.0F, 2.0F, 2.0F, 4.0F, 0.01F, false);
		Cube61.setTextureOffset(97, 221).addBox(-6.16F, -21.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.01F, false);
		Cube61.setTextureOffset(97, 221).addBox(-5.66F, -20.25F, -2.0F, 2.0F, 2.0F, 4.0F, -0.24F, false);
		Cube61.setTextureOffset(97, 221).addBox(-5.66F, -51.25F, -2.0F, 2.0F, 5.0F, 4.0F, -0.24F, false);
		Cube61.setTextureOffset(97, 221).addBox(-6.16F, -49.75F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		Cube61.setTextureOffset(97, 221).addBox(-7.66F, -52.875F, -2.5F, 6.0F, 2.0F, 5.0F, 0.0F, false);
		Cube61.setTextureOffset(97, 221).addBox(-9.2019F, -80.7838F, -3.0F, 2.0F, 24.0F, 6.0F, 0.0F, false);
		Cube61.setTextureOffset(97, 221).addBox(-6.16F, -49.75F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		Cube61.setTextureOffset(97, 221).addBox(-6.16F, -17.5F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		UpperRoof8 = new ModelRenderer(this);
		UpperRoof8.setRotationPoint(-2.75F, -47.5F, 0.0F);
		Cube61.addChild(UpperRoof8);
		setRotationAngle(UpperRoof8, 0.0F, 0.0F, -0.1745F);
		UpperRoof8.setTextureOffset(97, 221).addBox(-3.902F, -12.146F, -2.5F, 2.0F, 7.0F, 5.0F, 0.0F, false);

		Cube62 = new ModelRenderer(this);
		Cube62.setRotationPoint(0.0F, 0.0F, 0.0F);
		UpperRing.addChild(Cube62);
		setRotationAngle(Cube62, 0.0F, 1.2566F, 0.0F);
		Cube62.setTextureOffset(97, 221).addBox(-6.16F, -18.5F, -2.0F, 2.0F, 2.0F, 4.0F, 0.01F, false);
		Cube62.setTextureOffset(97, 221).addBox(-6.16F, -21.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.01F, false);
		Cube62.setTextureOffset(97, 221).addBox(-5.66F, -20.25F, -2.0F, 2.0F, 2.0F, 4.0F, -0.24F, false);
		Cube62.setTextureOffset(97, 221).addBox(-5.66F, -51.25F, -2.0F, 2.0F, 5.0F, 4.0F, -0.24F, false);
		Cube62.setTextureOffset(97, 221).addBox(-6.16F, -49.75F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		Cube62.setTextureOffset(97, 221).addBox(-7.66F, -52.875F, -2.5F, 6.0F, 2.0F, 5.0F, 0.0F, false);
		Cube62.setTextureOffset(97, 221).addBox(-9.2019F, -80.7838F, -3.0F, 2.0F, 24.0F, 6.0F, 0.0F, false);
		Cube62.setTextureOffset(97, 221).addBox(-6.16F, -49.75F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		Cube62.setTextureOffset(97, 221).addBox(-6.16F, -17.5F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		UpperRoof9 = new ModelRenderer(this);
		UpperRoof9.setRotationPoint(-2.75F, -47.5F, 0.0F);
		Cube62.addChild(UpperRoof9);
		setRotationAngle(UpperRoof9, 0.0F, 0.0F, -0.1745F);
		UpperRoof9.setTextureOffset(97, 221).addBox(-3.902F, -12.146F, -2.5F, 2.0F, 7.0F, 5.0F, 0.0F, false);

		Cube63 = new ModelRenderer(this);
		Cube63.setRotationPoint(0.0F, 0.0F, 0.0F);
		UpperRing.addChild(Cube63);
		setRotationAngle(Cube63, 0.0F, 0.6283F, 0.0F);
		Cube63.setTextureOffset(97, 221).addBox(-6.16F, -18.5F, -2.0F, 2.0F, 2.0F, 4.0F, 0.01F, false);
		Cube63.setTextureOffset(97, 221).addBox(-6.16F, -21.0F, -2.0F, 2.0F, 1.0F, 4.0F, 0.01F, false);
		Cube63.setTextureOffset(97, 221).addBox(-5.66F, -20.25F, -2.0F, 2.0F, 2.0F, 4.0F, -0.24F, false);
		Cube63.setTextureOffset(97, 221).addBox(-5.66F, -51.25F, -2.0F, 2.0F, 5.0F, 4.0F, -0.24F, false);
		Cube63.setTextureOffset(97, 221).addBox(-6.16F, -49.75F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		Cube63.setTextureOffset(97, 221).addBox(-7.66F, -52.875F, -2.5F, 6.0F, 2.0F, 5.0F, 0.0F, false);
		Cube63.setTextureOffset(97, 221).addBox(-9.2019F, -80.7838F, -3.0F, 2.0F, 24.0F, 6.0F, 0.0F, false);
		Cube63.setTextureOffset(97, 221).addBox(-6.16F, -49.75F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		Cube63.setTextureOffset(97, 221).addBox(-6.16F, -17.5F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		UpperRoof10 = new ModelRenderer(this);
		UpperRoof10.setRotationPoint(-2.75F, -47.5F, 0.0F);
		Cube63.addChild(UpperRoof10);
		setRotationAngle(UpperRoof10, 0.0F, 0.0F, -0.1745F);
		UpperRoof10.setTextureOffset(97, 221).addBox(-3.902F, -12.146F, -2.5F, 2.0F, 7.0F, 5.0F, 0.0F, false);

		Panels = new ModelRenderer(this);
		Panels.setRotationPoint(0.0F, 0.5F, 0.0F);
		Console.addChild(Panels);
		

		Panel1 = new ModelRenderer(this);
		Panel1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(Panel1);
		

		Cube64 = new ModelRenderer(this);
		Cube64.setRotationPoint(10.75F, -13.75F, 0.0F);
		Panel1.addChild(Cube64);
		setRotationAngle(Cube64, 0.0F, 0.0F, 0.8727F);
		Cube64.setTextureOffset(204, 217).addBox(-0.5216F, -0.938F, -6.0F, 4.0F, 1.0F, 12.0F, 0.0F, false);

		Cube65 = new ModelRenderer(this);
		Cube65.setRotationPoint(5.25F, -13.75F, -0.5F);
		Panel1.addChild(Cube65);
		setRotationAngle(Cube65, 0.0F, 0.0F, 0.4363F);
		Cube65.setTextureOffset(204, 217).addBox(2.9084F, -3.395F, -4.5F, 2.0F, 1.0F, 10.0F, 0.0F, false);
		Cube65.setTextureOffset(204, 217).addBox(0.9084F, -3.395F, -3.5F, 2.0F, 1.0F, 8.0F, 0.0F, false);
		Cube65.setTextureOffset(204, 217).addBox(-1.0916F, -3.395F, -2.5F, 2.0F, 1.0F, 6.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(4.9435F, -1.7658F, 0.0F);
		Cube65.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, -0.1745F);
		bone.setTextureOffset(204, 217).addBox(-7.6605F, -2.6525F, -2.5F, 2.0F, 1.0F, 6.0F, 0.0F, false);

		Panel2 = new ModelRenderer(this);
		Panel2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(Panel2);
		setRotationAngle(Panel2, 0.0F, -1.0472F, 0.0F);
		

		Cube67 = new ModelRenderer(this);
		Cube67.setRotationPoint(10.75F, -13.75F, 0.0F);
		Panel2.addChild(Cube67);
		setRotationAngle(Cube67, 0.0F, 0.0F, 0.8727F);
		Cube67.setTextureOffset(204, 217).addBox(-0.5216F, -0.938F, -6.0F, 4.0F, 1.0F, 12.0F, 0.0F, false);

		Cube68 = new ModelRenderer(this);
		Cube68.setRotationPoint(5.25F, -13.75F, -0.5F);
		Panel2.addChild(Cube68);
		setRotationAngle(Cube68, 0.0F, 0.0F, 0.4363F);
		Cube68.setTextureOffset(204, 217).addBox(2.9084F, -3.395F, -4.5F, 2.0F, 1.0F, 10.0F, 0.0F, false);
		Cube68.setTextureOffset(204, 217).addBox(0.9084F, -3.395F, -3.5F, 2.0F, 1.0F, 8.0F, 0.0F, false);
		Cube68.setTextureOffset(204, 217).addBox(-1.0916F, -3.395F, -2.5F, 2.0F, 1.0F, 6.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(4.9435F, -1.7658F, 0.0F);
		Cube68.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.1745F);
		bone2.setTextureOffset(204, 217).addBox(-7.6605F, -2.6525F, -2.5F, 2.0F, 1.0F, 6.0F, 0.0F, false);

		Panel3 = new ModelRenderer(this);
		Panel3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(Panel3);
		setRotationAngle(Panel3, 0.0F, -2.0944F, 0.0F);
		

		Cube69 = new ModelRenderer(this);
		Cube69.setRotationPoint(10.75F, -13.75F, 0.0F);
		Panel3.addChild(Cube69);
		setRotationAngle(Cube69, 0.0F, 0.0F, 0.8727F);
		Cube69.setTextureOffset(204, 217).addBox(-0.5216F, -0.938F, -6.0F, 4.0F, 1.0F, 12.0F, 0.0F, false);

		Cube70 = new ModelRenderer(this);
		Cube70.setRotationPoint(5.25F, -13.75F, -0.5F);
		Panel3.addChild(Cube70);
		setRotationAngle(Cube70, 0.0F, 0.0F, 0.4363F);
		Cube70.setTextureOffset(204, 217).addBox(2.9084F, -3.395F, -4.5F, 2.0F, 1.0F, 10.0F, 0.0F, false);
		Cube70.setTextureOffset(204, 217).addBox(0.9084F, -3.395F, -3.5F, 2.0F, 1.0F, 8.0F, 0.0F, false);
		Cube70.setTextureOffset(204, 217).addBox(-1.0916F, -3.395F, -2.5F, 2.0F, 1.0F, 6.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(4.9435F, -1.7658F, 0.0F);
		Cube70.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, -0.1745F);
		bone3.setTextureOffset(204, 217).addBox(-7.6605F, -2.6525F, -2.5F, 2.0F, 1.0F, 6.0F, 0.0F, false);

		Panel4 = new ModelRenderer(this);
		Panel4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(Panel4);
		setRotationAngle(Panel4, 0.0F, 3.1416F, 0.0F);
		

		Cube71 = new ModelRenderer(this);
		Cube71.setRotationPoint(10.75F, -13.75F, 0.0F);
		Panel4.addChild(Cube71);
		setRotationAngle(Cube71, 0.0F, 0.0F, 0.8727F);
		Cube71.setTextureOffset(204, 217).addBox(-0.5216F, -0.938F, -6.0F, 4.0F, 1.0F, 12.0F, 0.0F, false);

		Cube72 = new ModelRenderer(this);
		Cube72.setRotationPoint(5.25F, -13.75F, -0.5F);
		Panel4.addChild(Cube72);
		setRotationAngle(Cube72, 0.0F, 0.0F, 0.4363F);
		Cube72.setTextureOffset(204, 217).addBox(2.9084F, -3.395F, -4.5F, 2.0F, 1.0F, 10.0F, 0.0F, false);
		Cube72.setTextureOffset(204, 217).addBox(0.9084F, -3.395F, -3.5F, 2.0F, 1.0F, 8.0F, 0.0F, false);
		Cube72.setTextureOffset(204, 217).addBox(-1.0916F, -3.395F, -2.5F, 2.0F, 1.0F, 6.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(4.9435F, -1.7658F, 0.0F);
		Cube72.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, -0.1745F);
		bone4.setTextureOffset(204, 217).addBox(-7.6605F, -2.6525F, -2.5F, 2.0F, 1.0F, 6.0F, 0.0F, false);

		Panel5 = new ModelRenderer(this);
		Panel5.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(Panel5);
		setRotationAngle(Panel5, 0.0F, 2.0944F, 0.0F);
		

		Cube73 = new ModelRenderer(this);
		Cube73.setRotationPoint(10.75F, -13.75F, 0.0F);
		Panel5.addChild(Cube73);
		setRotationAngle(Cube73, 0.0F, 0.0F, 0.8727F);
		Cube73.setTextureOffset(204, 217).addBox(-0.5216F, -0.938F, -6.0F, 4.0F, 1.0F, 12.0F, 0.0F, false);

		Cube74 = new ModelRenderer(this);
		Cube74.setRotationPoint(5.25F, -13.75F, -0.5F);
		Panel5.addChild(Cube74);
		setRotationAngle(Cube74, 0.0F, 0.0F, 0.4363F);
		Cube74.setTextureOffset(204, 217).addBox(2.9084F, -3.395F, -4.5F, 2.0F, 1.0F, 10.0F, 0.0F, false);
		Cube74.setTextureOffset(204, 217).addBox(0.9084F, -3.395F, -3.5F, 2.0F, 1.0F, 8.0F, 0.0F, false);
		Cube74.setTextureOffset(204, 217).addBox(-1.0916F, -3.395F, -2.5F, 2.0F, 1.0F, 6.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(4.9435F, -1.7658F, 0.0F);
		Cube74.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, -0.1745F);
		bone5.setTextureOffset(204, 217).addBox(-7.6605F, -2.6525F, -2.5F, 2.0F, 1.0F, 6.0F, 0.0F, false);

		Panel6 = new ModelRenderer(this);
		Panel6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(Panel6);
		setRotationAngle(Panel6, 0.0F, 1.0472F, 0.0F);
		

		Cube75 = new ModelRenderer(this);
		Cube75.setRotationPoint(10.75F, -13.75F, 0.0F);
		Panel6.addChild(Cube75);
		setRotationAngle(Cube75, 0.0F, 0.0F, 0.8727F);
		Cube75.setTextureOffset(204, 217).addBox(-0.5216F, -0.938F, -6.0F, 4.0F, 1.0F, 12.0F, 0.0F, false);

		Cube76 = new ModelRenderer(this);
		Cube76.setRotationPoint(5.25F, -13.75F, -0.5F);
		Panel6.addChild(Cube76);
		setRotationAngle(Cube76, 0.0F, 0.0F, 0.4363F);
		Cube76.setTextureOffset(204, 217).addBox(2.9084F, -3.395F, -4.5F, 2.0F, 1.0F, 10.0F, 0.0F, false);
		Cube76.setTextureOffset(204, 217).addBox(0.9084F, -3.395F, -3.5F, 2.0F, 1.0F, 8.0F, 0.0F, false);
		Cube76.setTextureOffset(204, 217).addBox(-1.0916F, -3.395F, -2.5F, 2.0F, 1.0F, 6.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(4.9435F, -1.7658F, 0.0F);
		Cube76.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, -0.1745F);
		bone6.setTextureOffset(204, 217).addBox(-7.6605F, -2.6525F, -2.5F, 2.0F, 1.0F, 6.0F, 0.0F, false);

		Pipes = new ModelRenderer(this);
		Pipes.setRotationPoint(0.0F, 0.0F, 0.0F);
		Console.addChild(Pipes);
		

		Set1 = new ModelRenderer(this);
		Set1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pipes.addChild(Set1);
		Set1.setTextureOffset(47, 231).addBox(12.5F, -11.25F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Set1.setTextureOffset(47, 231).addBox(11.75F, -10.125F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Set1.setTextureOffset(47, 231).addBox(10.875F, -9.25F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set1.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.2208F, 0.0F);
		bone7.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone7.setTextureOffset(47, 231).addBox(11.7682F, 0.125F, -1.6642F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone7.setTextureOffset(47, 231).addBox(10.9144F, 1.0F, -1.8559F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set1.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.4416F, 0.0F);
		bone8.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone8.setTextureOffset(47, 231).addBox(11.8219F, 0.125F, -1.8205F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone8.setTextureOffset(47, 231).addBox(11.0309F, 1.0F, -2.1945F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set1.addChild(bone10);
		setRotationAngle(bone10, 0.0F, -0.2208F, 0.0F);
		bone10.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone10.setTextureOffset(47, 231).addBox(11.7682F, 0.125F, -1.3358F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone10.setTextureOffset(47, 231).addBox(10.9144F, 1.0F, -1.1441F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set1.addChild(bone9);
		setRotationAngle(bone9, 0.0F, -0.4416F, 0.0F);
		bone9.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone9.setTextureOffset(47, 231).addBox(11.8219F, 0.125F, -1.1795F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone9.setTextureOffset(47, 231).addBox(11.0309F, 1.0F, -0.8055F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		Set2 = new ModelRenderer(this);
		Set2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pipes.addChild(Set2);
		setRotationAngle(Set2, 0.0F, -1.0472F, 0.0F);
		Set2.setTextureOffset(47, 231).addBox(12.5F, -11.25F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Set2.setTextureOffset(47, 231).addBox(11.75F, -10.125F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Set2.setTextureOffset(47, 231).addBox(10.875F, -9.25F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set2.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.2208F, 0.0F);
		bone11.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone11.setTextureOffset(47, 231).addBox(11.7682F, 0.125F, -1.6642F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone11.setTextureOffset(47, 231).addBox(10.9144F, 1.0F, -1.8559F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set2.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.4416F, 0.0F);
		bone12.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone12.setTextureOffset(47, 231).addBox(11.8219F, 0.125F, -1.8205F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone12.setTextureOffset(47, 231).addBox(11.0309F, 1.0F, -2.1945F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set2.addChild(bone13);
		setRotationAngle(bone13, 0.0F, -0.2208F, 0.0F);
		bone13.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone13.setTextureOffset(47, 231).addBox(11.7682F, 0.125F, -1.3358F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone13.setTextureOffset(47, 231).addBox(10.9144F, 1.0F, -1.1441F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set2.addChild(bone14);
		setRotationAngle(bone14, 0.0F, -0.4416F, 0.0F);
		bone14.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone14.setTextureOffset(47, 231).addBox(11.8219F, 0.125F, -1.1795F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone14.setTextureOffset(47, 231).addBox(11.0309F, 1.0F, -0.8055F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		Set3 = new ModelRenderer(this);
		Set3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pipes.addChild(Set3);
		setRotationAngle(Set3, 0.0F, -2.0944F, 0.0F);
		Set3.setTextureOffset(47, 231).addBox(12.5F, -11.25F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Set3.setTextureOffset(47, 231).addBox(11.75F, -10.125F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Set3.setTextureOffset(47, 231).addBox(10.875F, -9.25F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set3.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.2208F, 0.0F);
		bone15.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone15.setTextureOffset(47, 231).addBox(11.7682F, 0.125F, -1.6642F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone15.setTextureOffset(47, 231).addBox(10.9144F, 1.0F, -1.8559F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set3.addChild(bone16);
		setRotationAngle(bone16, 0.0F, 0.4416F, 0.0F);
		bone16.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone16.setTextureOffset(47, 231).addBox(11.8219F, 0.125F, -1.8205F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone16.setTextureOffset(47, 231).addBox(11.0309F, 1.0F, -2.1945F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set3.addChild(bone17);
		setRotationAngle(bone17, 0.0F, -0.2208F, 0.0F);
		bone17.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone17.setTextureOffset(47, 231).addBox(11.7682F, 0.125F, -1.3358F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone17.setTextureOffset(47, 231).addBox(10.9144F, 1.0F, -1.1441F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set3.addChild(bone18);
		setRotationAngle(bone18, 0.0F, -0.4416F, 0.0F);
		bone18.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone18.setTextureOffset(47, 231).addBox(11.8219F, 0.125F, -1.1795F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone18.setTextureOffset(47, 231).addBox(11.0309F, 1.0F, -0.8055F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		Set4 = new ModelRenderer(this);
		Set4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pipes.addChild(Set4);
		setRotationAngle(Set4, 0.0F, 3.1416F, 0.0F);
		Set4.setTextureOffset(47, 231).addBox(12.5F, -11.25F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Set4.setTextureOffset(47, 231).addBox(11.75F, -10.125F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Set4.setTextureOffset(47, 231).addBox(10.875F, -9.25F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set4.addChild(bone19);
		setRotationAngle(bone19, 0.0F, 0.2208F, 0.0F);
		bone19.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone19.setTextureOffset(47, 231).addBox(11.7682F, 0.125F, -1.6642F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone19.setTextureOffset(47, 231).addBox(10.9144F, 1.0F, -1.8559F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set4.addChild(bone20);
		setRotationAngle(bone20, 0.0F, 0.4416F, 0.0F);
		bone20.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone20.setTextureOffset(47, 231).addBox(11.8219F, 0.125F, -1.8205F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone20.setTextureOffset(47, 231).addBox(11.0309F, 1.0F, -2.1945F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set4.addChild(bone21);
		setRotationAngle(bone21, 0.0F, -0.2208F, 0.0F);
		bone21.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone21.setTextureOffset(47, 231).addBox(11.7682F, 0.125F, -1.3358F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone21.setTextureOffset(47, 231).addBox(10.9144F, 1.0F, -1.1441F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set4.addChild(bone22);
		setRotationAngle(bone22, 0.0F, -0.4416F, 0.0F);
		bone22.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone22.setTextureOffset(47, 231).addBox(11.8219F, 0.125F, -1.1795F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone22.setTextureOffset(47, 231).addBox(11.0309F, 1.0F, -0.8055F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		Set5 = new ModelRenderer(this);
		Set5.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pipes.addChild(Set5);
		setRotationAngle(Set5, 0.0F, 2.0944F, 0.0F);
		Set5.setTextureOffset(47, 231).addBox(12.5F, -11.25F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Set5.setTextureOffset(47, 231).addBox(11.75F, -10.125F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Set5.setTextureOffset(47, 231).addBox(10.875F, -9.25F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set5.addChild(bone23);
		setRotationAngle(bone23, 0.0F, 0.2208F, 0.0F);
		bone23.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone23.setTextureOffset(47, 231).addBox(11.7682F, 0.125F, -1.6642F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone23.setTextureOffset(47, 231).addBox(10.9144F, 1.0F, -1.8559F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set5.addChild(bone24);
		setRotationAngle(bone24, 0.0F, 0.4416F, 0.0F);
		bone24.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone24.setTextureOffset(47, 231).addBox(11.8219F, 0.125F, -1.8205F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone24.setTextureOffset(47, 231).addBox(11.0309F, 1.0F, -2.1945F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set5.addChild(bone25);
		setRotationAngle(bone25, 0.0F, -0.2208F, 0.0F);
		bone25.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone25.setTextureOffset(47, 231).addBox(11.7682F, 0.125F, -1.3358F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone25.setTextureOffset(47, 231).addBox(10.9144F, 1.0F, -1.1441F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set5.addChild(bone26);
		setRotationAngle(bone26, 0.0F, -0.4416F, 0.0F);
		bone26.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone26.setTextureOffset(47, 231).addBox(11.8219F, 0.125F, -1.1795F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone26.setTextureOffset(47, 231).addBox(11.0309F, 1.0F, -0.8055F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		Set6 = new ModelRenderer(this);
		Set6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pipes.addChild(Set6);
		setRotationAngle(Set6, 0.0F, 1.0472F, 0.0F);
		Set6.setTextureOffset(47, 231).addBox(12.5F, -11.25F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Set6.setTextureOffset(47, 231).addBox(11.75F, -10.125F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Set6.setTextureOffset(47, 231).addBox(10.875F, -9.25F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set6.addChild(bone27);
		setRotationAngle(bone27, 0.0F, 0.2208F, 0.0F);
		bone27.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone27.setTextureOffset(47, 231).addBox(11.7682F, 0.125F, -1.6642F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone27.setTextureOffset(47, 231).addBox(10.9144F, 1.0F, -1.8559F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set6.addChild(bone28);
		setRotationAngle(bone28, 0.0F, 0.4416F, 0.0F);
		bone28.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone28.setTextureOffset(47, 231).addBox(11.8219F, 0.125F, -1.8205F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone28.setTextureOffset(47, 231).addBox(11.0309F, 1.0F, -2.1945F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set6.addChild(bone29);
		setRotationAngle(bone29, 0.0F, -0.2208F, 0.0F);
		bone29.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone29.setTextureOffset(47, 231).addBox(11.7682F, 0.125F, -1.3358F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone29.setTextureOffset(47, 231).addBox(10.9144F, 1.0F, -1.1441F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set6.addChild(bone30);
		setRotationAngle(bone30, 0.0F, -0.4416F, 0.0F);
		bone30.setTextureOffset(47, 231).addBox(12.5F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone30.setTextureOffset(47, 231).addBox(11.8219F, 0.125F, -1.1795F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		bone30.setTextureOffset(47, 231).addBox(11.0309F, 1.0F, -0.8055F, 1.0F, 2.0F, 3.0F, 0.0F, false);

		UnderConsole = new ModelRenderer(this);
		UnderConsole.setRotationPoint(0.0F, 0.0F, 0.0F);
		Console.addChild(UnderConsole);
		

		part1 = new ModelRenderer(this);
		part1.setRotationPoint(0.0F, 0.0F, 0.0F);
		UnderConsole.addChild(part1);
		part1.setTextureOffset(225, 222).addBox(4.375F, -7.75F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
		part1.setTextureOffset(225, 222).addBox(5.375F, -8.375F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		part1.setTextureOffset(225, 222).addBox(7.75F, -8.375F, -5.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		part1.setTextureOffset(225, 222).addBox(7.75F, -8.375F, 3.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(4.5F, 0.25F, -1.0F);
		part1.addChild(bone33);
		setRotationAngle(bone33, 0.0F, 0.0F, 0.2618F);
		bone33.setTextureOffset(225, 222).addBox(-1.1901F, -4.0902F, -1.0F, 1.0F, 7.0F, 4.0F, 0.0F, false);

		part2 = new ModelRenderer(this);
		part2.setRotationPoint(0.0F, 0.0F, 0.0F);
		UnderConsole.addChild(part2);
		setRotationAngle(part2, 0.0F, -1.0472F, 0.0F);
		part2.setTextureOffset(225, 222).addBox(4.375F, -7.75F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
		part2.setTextureOffset(225, 222).addBox(5.375F, -8.375F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		part2.setTextureOffset(225, 222).addBox(7.75F, -8.375F, -5.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		part2.setTextureOffset(225, 222).addBox(7.75F, -8.375F, 3.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(4.5F, 0.25F, -1.0F);
		part2.addChild(bone31);
		setRotationAngle(bone31, 0.0F, 0.0F, 0.2618F);
		bone31.setTextureOffset(225, 222).addBox(-1.1901F, -4.0902F, -1.0F, 1.0F, 7.0F, 4.0F, 0.0F, false);

		part3 = new ModelRenderer(this);
		part3.setRotationPoint(0.0F, 0.0F, 0.0F);
		UnderConsole.addChild(part3);
		setRotationAngle(part3, 0.0F, -2.0944F, 0.0F);
		part3.setTextureOffset(225, 222).addBox(4.375F, -7.75F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
		part3.setTextureOffset(225, 222).addBox(5.375F, -8.375F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		part3.setTextureOffset(225, 222).addBox(7.75F, -8.375F, -5.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		part3.setTextureOffset(225, 222).addBox(7.75F, -8.375F, 3.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(4.5F, 0.25F, -1.0F);
		part3.addChild(bone32);
		setRotationAngle(bone32, 0.0F, 0.0F, 0.2618F);
		bone32.setTextureOffset(225, 222).addBox(-1.1901F, -4.0902F, -1.0F, 1.0F, 7.0F, 4.0F, 0.0F, false);

		part4 = new ModelRenderer(this);
		part4.setRotationPoint(0.0F, 0.0F, 0.0F);
		UnderConsole.addChild(part4);
		setRotationAngle(part4, 0.0F, 3.1416F, 0.0F);
		part4.setTextureOffset(225, 222).addBox(4.375F, -7.75F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
		part4.setTextureOffset(225, 222).addBox(5.375F, -8.375F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		part4.setTextureOffset(225, 222).addBox(7.75F, -8.375F, -5.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		part4.setTextureOffset(225, 222).addBox(7.75F, -8.375F, 3.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(4.5F, 0.25F, -1.0F);
		part4.addChild(bone34);
		setRotationAngle(bone34, 0.0F, 0.0F, 0.2618F);
		bone34.setTextureOffset(225, 222).addBox(-1.1901F, -4.0902F, -1.0F, 1.0F, 7.0F, 4.0F, 0.0F, false);

		part5 = new ModelRenderer(this);
		part5.setRotationPoint(0.0F, 0.0F, 0.0F);
		UnderConsole.addChild(part5);
		setRotationAngle(part5, 0.0F, 2.0944F, 0.0F);
		part5.setTextureOffset(225, 222).addBox(4.375F, -7.75F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
		part5.setTextureOffset(225, 222).addBox(5.375F, -8.375F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		part5.setTextureOffset(225, 222).addBox(7.75F, -8.375F, -5.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		part5.setTextureOffset(225, 222).addBox(7.75F, -8.375F, 3.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(4.5F, 0.25F, -1.0F);
		part5.addChild(bone35);
		setRotationAngle(bone35, 0.0F, 0.0F, 0.2618F);
		bone35.setTextureOffset(225, 222).addBox(-1.1901F, -4.0902F, -1.0F, 1.0F, 7.0F, 4.0F, 0.0F, false);

		part6 = new ModelRenderer(this);
		part6.setRotationPoint(0.0F, 0.0F, 0.0F);
		UnderConsole.addChild(part6);
		setRotationAngle(part6, 0.0F, 1.0472F, 0.0F);
		part6.setTextureOffset(225, 222).addBox(4.375F, -7.75F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
		part6.setTextureOffset(225, 222).addBox(5.375F, -8.375F, -3.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		part6.setTextureOffset(225, 222).addBox(7.75F, -8.375F, -5.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);
		part6.setTextureOffset(225, 222).addBox(7.75F, -8.375F, 3.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(4.5F, 0.25F, -1.0F);
		part6.addChild(bone36);
		setRotationAngle(bone36, 0.0F, 0.0F, 0.2618F);
		bone36.setTextureOffset(225, 222).addBox(-1.1901F, -4.0902F, -1.0F, 1.0F, 7.0F, 4.0F, 0.0F, false);

		CPanel1 = new ModelRenderer(this);
		CPanel1.setRotationPoint(0.0F, -0.125F, 0.0F);
		Console.addChild(CPanel1);
		setRotationAngle(CPanel1, 0.0F, 2.0944F, 0.0F);
		

		Cube78 = new ModelRenderer(this);
		Cube78.setRotationPoint(10.75F, -13.25F, 0.0F);
		CPanel1.addChild(Cube78);
		setRotationAngle(Cube78, 0.0F, 0.0F, 0.4363F);
		Cube78.setTextureOffset(66, 109).addBox(-2.6995F, -1.0513F, -3.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Cube78.setTextureOffset(145, 148).addBox(-4.0886F, -1.6178F, -0.5F, 1.0F, 1.0F, 1.0F, 0.125F, false);

		bone81 = new ModelRenderer(this);
		bone81.setRotationPoint(-10.75F, 0.5F, 0.0F);
		Cube78.addChild(bone81);
		setRotationAngle(bone81, 0.0F, -0.2618F, 0.0F);
		bone81.setTextureOffset(66, 109).addBox(8.1614F, -1.4928F, -0.5F, 2.0F, 1.0F, 1.0F, 0.125F, false);

		Cube77 = new ModelRenderer(this);
		Cube77.setRotationPoint(10.75F, -13.25F, 0.0F);
		CPanel1.addChild(Cube77);
		setRotationAngle(Cube77, 0.0F, 0.0F, 0.8727F);
		Cube77.setTextureOffset(104, 157).addBox(-0.6466F, -0.938F, -4.0F, 2.0F, 1.0F, 5.0F, 0.0F, false);
		Cube77.setTextureOffset(66, 109).addBox(0.3534F, -0.938F, 1.375F, 1.0F, 1.0F, 3.0F, 0.0F, false);

		CEdge2 = new ModelRenderer(this);
		CEdge2.setRotationPoint(0.0F, -1.0F, 0.0F);
		Console.addChild(CEdge2);
		setRotationAngle(CEdge2, 0.0F, 1.0472F, 0.0F);
		

		Rotation2 = new ModelRenderer(this);
		Rotation2.setRotationPoint(0.0F, -15.6995F, -10.9546F);
		CEdge2.addChild(Rotation2);
		setRotationAngle(Rotation2, 0.9599F, 0.0F, 0.0F);
		Rotation2.setTextureOffset(60, 118).addBox(-1.0F, -1.875F, -5.625F, 2.0F, 1.0F, 2.0F, -0.125F, false);

		Rotation3 = new ModelRenderer(this);
		Rotation3.setRotationPoint(0.0F, -14.1995F, -10.9546F);
		CEdge2.addChild(Rotation3);
		setRotationAngle(Rotation3, 0.5236F, 0.0F, 0.0F);
		Rotation3.setTextureOffset(60, 118).addBox(-1.5F, -1.5F, -3.125F, 2.0F, 1.0F, 2.0F, -0.125F, false);

		bone82 = new ModelRenderer(this);
		bone82.setRotationPoint(0.0F, -11.6026F, 9.7671F);
		Rotation3.addChild(bone82);
		setRotationAngle(bone82, -0.2618F, 0.0F, 0.0F);
		bone82.setTextureOffset(73, 113).addBox(-1.0F, 12.4009F, -6.8147F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bone82.setTextureOffset(177, 156).addBox(-1.25F, 11.6551F, -4.7824F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		bone82.setTextureOffset(177, 156).addBox(-1.25F, 11.6551F, -5.2824F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		bone82.setTextureOffset(177, 156).addBox(-0.75F, 11.6551F, -5.2824F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		bone82.setTextureOffset(177, 156).addBox(-1.25F, 11.6551F, -5.6574F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		bone82.setTextureOffset(177, 156).addBox(-0.75F, 11.6551F, -5.6574F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		bone82.setTextureOffset(177, 156).addBox(-1.25F, 11.6551F, -6.0324F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		bone82.setTextureOffset(177, 156).addBox(-0.75F, 11.6551F, -6.0324F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		bone82.setTextureOffset(177, 156).addBox(-1.25F, 11.6551F, -6.4074F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		bone82.setTextureOffset(177, 156).addBox(-0.75F, 11.6551F, -6.4074F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		bone82.setTextureOffset(177, 156).addBox(-1.25F, 11.6551F, -6.7824F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		bone82.setTextureOffset(177, 156).addBox(-0.75F, 11.6551F, -6.7824F, 1.0F, 2.0F, 1.0F, -0.375F, false);

		bone83 = new ModelRenderer(this);
		bone83.setRotationPoint(0.0F, -11.6026F, 9.7671F);
		Rotation3.addChild(bone83);
		setRotationAngle(bone83, -0.2618F, 0.0F, 0.0F);
		bone83.setTextureOffset(68, 114).addBox(-0.5F, 12.1594F, -4.0F, 2.0F, 1.0F, 2.0F, -0.25F, false);

		Rotation4 = new ModelRenderer(this);
		Rotation4.setRotationPoint(0.0F, -14.8245F, -10.9546F);
		CEdge2.addChild(Rotation4);
		setRotationAngle(Rotation4, 0.4363F, 0.0F, 0.0F);
		Rotation4.setTextureOffset(68, 114).addBox(0.375F, -1.375F, 0.5F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		Rotation4.setTextureOffset(196, 166).addBox(0.375F, -1.375F, -3.125F, 1.0F, 1.0F, 4.0F, -0.125F, false);

		Rotation11 = new ModelRenderer(this);
		Rotation11.setRotationPoint(0.0F, -14.6995F, 0.0F);
		CEdge2.addChild(Rotation11);
		setRotationAngle(Rotation11, 0.2618F, -2.0944F, 0.0F);
		Rotation11.setTextureOffset(36, 165).addBox(-1.125F, -4.375F, -6.7046F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		Rotation11.setTextureOffset(196, 166).addBox(-1.125F, -4.375F, -10.3296F, 1.0F, 1.0F, 4.0F, -0.125F, false);
		Rotation11.setTextureOffset(54, 111).addBox(0.125F, -4.375F, -9.9546F, 1.0F, 1.0F, 1.0F, -0.125F, false);

		CEdge3 = new ModelRenderer(this);
		CEdge3.setRotationPoint(0.0F, -1.0F, 0.0F);
		Console.addChild(CEdge3);
		setRotationAngle(CEdge3, 0.0F, 2.0944F, 0.0F);
		

		Rotation8 = new ModelRenderer(this);
		Rotation8.setRotationPoint(0.0F, -14.1995F, -10.9546F);
		CEdge3.addChild(Rotation8);
		setRotationAngle(Rotation8, 0.5236F, 0.0F, 0.0F);
		

		bone88 = new ModelRenderer(this);
		bone88.setRotationPoint(0.0F, -11.6026F, 9.7671F);
		Rotation8.addChild(bone88);
		setRotationAngle(bone88, -0.2618F, 0.0F, 0.0F);
		bone88.setTextureOffset(180, 155).addBox(-0.5F, 11.9094F, -6.0F, 2.0F, 2.0F, 2.0F, -0.375F, false);
		bone88.setTextureOffset(180, 155).addBox(-0.5F, 11.0344F, -6.0F, 2.0F, 2.0F, 2.0F, -0.5F, false);
		bone88.setTextureOffset(101, 161).addBox(-2.25F, 11.0344F, -4.25F, 3.0F, 2.0F, 2.0F, -0.625F, false);
		bone88.setTextureOffset(56, 106).addBox(-0.25F, 11.5344F, -3.75F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		bone88.setTextureOffset(56, 106).addBox(-2.25F, 11.5344F, -3.75F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		bone88.setTextureOffset(56, 106).addBox(-2.5F, 11.5344F, -3.75F, 1.0F, 1.0F, 1.0F, -0.225F, false);
		bone88.setTextureOffset(180, 155).addBox(-0.5F, 10.5344F, -6.0F, 2.0F, 2.0F, 2.0F, -0.75F, false);

		bone103 = new ModelRenderer(this);
		bone103.setRotationPoint(-2.25F, 12.0344F, -3.25F);
		bone88.addChild(bone103);
		setRotationAngle(bone103, 0.0F, 0.0F, -0.3491F);
		bone103.setTextureOffset(115, 165).addBox(-1.25F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, -0.35F, false);

		CPanel2 = new ModelRenderer(this);
		CPanel2.setRotationPoint(0.0F, -0.125F, 0.0F);
		Console.addChild(CPanel2);
		setRotationAngle(CPanel2, 0.0F, 3.1416F, 0.0F);
		

		Cube81 = new ModelRenderer(this);
		Cube81.setRotationPoint(10.75F, -13.25F, 0.0F);
		CPanel2.addChild(Cube81);
		setRotationAngle(Cube81, 0.0F, 0.0F, 0.4363F);
		Cube81.setTextureOffset(59, 113).addBox(-4.2774F, -1.0889F, -2.0F, 3.0F, 1.0F, 1.0F, 0.125F, false);
		Cube81.setTextureOffset(203, 179).addBox(-4.2774F, -1.7139F, -2.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		Cube81.setTextureOffset(55, 111).addBox(-4.0886F, -1.6178F, -0.5F, 1.0F, 1.0F, 1.0F, 0.125F, false);

		bone89 = new ModelRenderer(this);
		bone89.setRotationPoint(0.5F, 0.5F, 1.375F);
		Cube81.addChild(bone89);
		bone89.setTextureOffset(211, 180).addBox(0.5859F, -1.6295F, -1.0227F, 1.0F, 2.0F, 1.0F, -0.4F, false);
		bone89.setTextureOffset(211, 180).addBox(0.5859F, -1.6295F, -0.3977F, 1.0F, 2.0F, 1.0F, -0.4F, false);
		bone89.setTextureOffset(66, 113).addBox(0.5859F, -1.2545F, -0.3977F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		bone89.setTextureOffset(66, 113).addBox(0.5859F, -1.2545F, -1.0227F, 1.0F, 2.0F, 1.0F, -0.375F, false);

		bone90 = new ModelRenderer(this);
		bone90.setRotationPoint(-10.75F, 0.5F, 1.875F);
		Cube81.addChild(bone90);
		setRotationAngle(bone90, 0.0F, -0.0873F, 0.0F);
		bone90.setTextureOffset(55, 111).addBox(8.1385F, -1.7662F, -0.0273F, 2.0F, 2.0F, 1.0F, -0.25F, false);
		bone90.setTextureOffset(66, 113).addBox(9.0859F, -2.0045F, -0.0227F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		bone90.setTextureOffset(178, 176).addBox(9.0859F, -2.3795F, -0.0227F, 1.0F, 2.0F, 1.0F, -0.4F, false);
		bone90.setTextureOffset(55, 111).addBox(8.1385F, -1.7662F, -0.6523F, 2.0F, 2.0F, 1.0F, -0.25F, false);
		bone90.setTextureOffset(66, 113).addBox(9.0859F, -2.0045F, -0.6477F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		bone90.setTextureOffset(178, 176).addBox(9.0859F, -2.3795F, -0.6477F, 1.0F, 2.0F, 1.0F, -0.4F, false);

		Cube82 = new ModelRenderer(this);
		Cube82.setRotationPoint(10.75F, -13.25F, 0.0F);
		CPanel2.addChild(Cube82);
		setRotationAngle(Cube82, 0.0F, 0.0F, 0.8727F);
		Cube82.setTextureOffset(68, 116).addBox(-0.7716F, -1.188F, 2.0F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		Cube82.setTextureOffset(68, 116).addBox(-0.7716F, -1.188F, 0.125F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		Cube82.setTextureOffset(68, 116).addBox(0.3534F, -0.938F, -2.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		bone91 = new ModelRenderer(this);
		bone91.setRotationPoint(0.5F, 0.5F, -0.75F);
		Cube82.addChild(bone91);
		setRotationAngle(bone91, 0.0F, 0.0F, -0.4363F);
		bone91.setTextureOffset(70, 112).addBox(-2.7716F, -1.938F, 0.625F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		bone91.setTextureOffset(70, 112).addBox(-2.5216F, -2.938F, 0.875F, 2.0F, 2.0F, 2.0F, -0.7F, false);
		bone91.setTextureOffset(70, 112).addBox(-2.3966F, -2.938F, 0.875F, 3.0F, 2.0F, 2.0F, -0.925F, false);
		bone91.setTextureOffset(66, 122).addBox(-1.2466F, -2.938F, 0.875F, 2.0F, 3.0F, 2.0F, -0.925F, false);
		bone91.setTextureOffset(70, 112).addBox(-2.7716F, -2.938F, 0.25F, 2.0F, 2.0F, 2.0F, -0.75F, false);

		bone92 = new ModelRenderer(this);
		bone92.setRotationPoint(0.8522F, 0.4692F, -0.5F);
		Cube82.addChild(bone92);
		setRotationAngle(bone92, 0.0F, 0.0F, -0.2618F);
		bone92.setTextureOffset(244, 184).addBox(-1.3812F, -1.5119F, -2.0F, 1.0F, 1.0F, 1.0F, 0.125F, false);

		CPanel3 = new ModelRenderer(this);
		CPanel3.setRotationPoint(0.0F, -0.125F, 0.0F);
		Console.addChild(CPanel3);
		setRotationAngle(CPanel3, 0.0F, -2.0944F, 0.0F);
		

		Cube79 = new ModelRenderer(this);
		Cube79.setRotationPoint(10.75F, -13.25F, 0.0F);
		CPanel3.addChild(Cube79);
		setRotationAngle(Cube79, 0.0F, 0.0F, 0.4363F);
		Cube79.setTextureOffset(170, 222).addBox(-4.0886F, -0.7428F, -0.5F, 1.0F, 1.0F, 1.0F, 0.375F, false);

		bone84 = new ModelRenderer(this);
		bone84.setRotationPoint(0.5F, 0.5F, -0.5F);
		Cube79.addChild(bone84);
		setRotationAngle(bone84, 0.0F, -0.1745F, 0.4363F);
		bone84.setTextureOffset(58, 117).addBox(-0.3386F, -0.9928F, 4.0F, 2.0F, 2.0F, 1.0F, 0.125F, false);

		bone87 = new ModelRenderer(this);
		bone87.setRotationPoint(0.5F, 0.5F, -0.5F);
		Cube79.addChild(bone87);
		setRotationAngle(bone87, 0.0F, 0.1745F, 0.4363F);
		bone87.setTextureOffset(58, 117).addBox(-0.3386F, -0.9928F, -4.0F, 2.0F, 2.0F, 1.0F, 0.125F, false);

		bone86 = new ModelRenderer(this);
		bone86.setRotationPoint(0.5F, 0.5F, -0.75F);
		Cube79.addChild(bone86);
		bone86.setTextureOffset(61, 99).addBox(-3.5216F, -1.938F, -2.125F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		bone86.setTextureOffset(103, 176).addBox(-3.5216F, -2.313F, -2.125F, 2.0F, 1.0F, 2.0F, -0.375F, false);

		bone85 = new ModelRenderer(this);
		bone85.setRotationPoint(0.0F, 0.0F, 0.25F);
		bone86.addChild(bone85);
		setRotationAngle(bone85, 0.0F, 0.0F, 0.4363F);
		bone85.setTextureOffset(153, 222).addBox(-0.0216F, -0.938F, -2.5F, 1.0F, 1.0F, 2.0F, 0.25F, false);
		bone85.setTextureOffset(153, 222).addBox(-0.0216F, -1.063F, 0.25F, 1.0F, 1.0F, 2.0F, 0.125F, false);

		Cube80 = new ModelRenderer(this);
		Cube80.setRotationPoint(10.75F, -13.25F, 0.0F);
		CPanel3.addChild(Cube80);
		setRotationAngle(Cube80, 0.0F, 0.0F, 0.6109F);
		Cube80.setTextureOffset(66, 120).addBox(-1.3966F, -1.438F, 0.5F, 2.0F, 1.0F, 2.0F, -0.25F, false);
		Cube80.setTextureOffset(171, 174).addBox(-1.3966F, -1.188F, -3.0F, 2.0F, 1.0F, 6.0F, -0.125F, false);
		Cube80.setTextureOffset(119, 166).addBox(-1.3966F, -1.813F, -1.0F, 2.0F, 2.0F, 2.0F, -0.625F, false);
		Cube80.setTextureOffset(116, 175).addBox(-3.6466F, -1.563F, 0.75F, 2.0F, 2.0F, 2.0F, -0.625F, false);
		Cube80.setTextureOffset(116, 175).addBox(-4.5216F, -1.563F, 0.75F, 2.0F, 2.0F, 2.0F, -0.625F, false);
		Cube80.setTextureOffset(220, 206).addBox(-1.3966F, -2.063F, -1.0F, 2.0F, 2.0F, 2.0F, -0.75F, false);
		Cube80.setTextureOffset(108, 165).addBox(-3.6466F, -1.813F, 0.75F, 2.0F, 2.0F, 2.0F, -0.75F, false);
		Cube80.setTextureOffset(108, 165).addBox(-4.5216F, -1.813F, 0.75F, 2.0F, 2.0F, 2.0F, -0.75F, false);
		Cube80.setTextureOffset(66, 120).addBox(-1.3966F, -1.438F, -2.5F, 2.0F, 1.0F, 2.0F, -0.25F, false);

		CEdge4 = new ModelRenderer(this);
		CEdge4.setRotationPoint(0.0F, -1.0F, 0.0F);
		Console.addChild(CEdge4);
		setRotationAngle(CEdge4, 0.0F, 3.1416F, 0.0F);
		

		Rotation7 = new ModelRenderer(this);
		Rotation7.setRotationPoint(0.0F, -15.6995F, -10.9546F);
		CEdge4.addChild(Rotation7);
		setRotationAngle(Rotation7, 0.6109F, 0.0F, 0.0F);
		Rotation7.setTextureOffset(66, 116).addBox(-1.0F, -0.625F, -4.625F, 2.0F, 1.0F, 2.0F, -0.125F, false);

		Rotation10 = new ModelRenderer(this);
		Rotation10.setRotationPoint(0.0F, -14.8245F, -10.9546F);
		CEdge4.addChild(Rotation10);
		setRotationAngle(Rotation10, 0.4363F, 0.0F, 0.0F);
		Rotation10.setTextureOffset(174, 216).addBox(-1.0F, -1.4243F, -4.3499F, 2.0F, 1.0F, 1.0F, -0.375F, false);
		Rotation10.setTextureOffset(66, 116).addBox(-1.0F, -1.1743F, -4.3499F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		Rotation10.setTextureOffset(66, 116).addBox(0.0F, -1.1743F, -4.3499F, 1.0F, 2.0F, 1.0F, -0.375F, false);

		CPanel4 = new ModelRenderer(this);
		CPanel4.setRotationPoint(0.0F, -0.125F, 0.0F);
		Console.addChild(CPanel4);
		setRotationAngle(CPanel4, 0.0F, -1.0472F, 0.0F);
		

		Rotation9 = new ModelRenderer(this);
		Rotation9.setRotationPoint(0.0F, -15.6995F, 0.0F);
		CPanel4.addChild(Rotation9);
		setRotationAngle(Rotation9, 0.4363F, -1.3963F, 0.0F);
		Rotation9.setTextureOffset(180, 153).addBox(-0.125F, -4.125F, -7.9546F, 1.0F, 1.0F, 1.0F, -0.25F, false);
		Rotation9.setTextureOffset(201, 172).addBox(-0.125F, -4.125F, -10.5796F, 1.0F, 1.0F, 3.0F, -0.125F, false);

		Cube83 = new ModelRenderer(this);
		Cube83.setRotationPoint(10.75F, -13.25F, 0.0F);
		CPanel4.addChild(Cube83);
		setRotationAngle(Cube83, 0.0F, 0.0F, 0.4363F);
		Cube83.setTextureOffset(90, 98).addBox(-2.6995F, -1.0513F, -3.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		Cube83.setTextureOffset(144, 148).addBox(-1.6995F, -1.5513F, -3.0F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		Cube83.setTextureOffset(209, 184).addBox(-2.0745F, -1.5513F, -3.0F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		Cube83.setTextureOffset(39, 212).addBox(-2.4495F, -1.5513F, -3.0F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		Cube83.setTextureOffset(139, 176).addBox(-2.8245F, -1.5513F, -3.0F, 1.0F, 1.0F, 1.0F, -0.375F, false);
		Cube83.setTextureOffset(148, 149).addBox(-4.0886F, -1.6178F, -0.5F, 1.0F, 1.0F, 1.0F, 0.125F, false);

		Cube84 = new ModelRenderer(this);
		Cube84.setRotationPoint(10.75F, -13.25F, 0.0F);
		CPanel4.addChild(Cube84);
		setRotationAngle(Cube84, 0.0F, 0.0F, 0.8727F);
		Cube84.setTextureOffset(91, 165).addBox(-0.6466F, -0.938F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Cube84.setTextureOffset(173, 148).addBox(-0.6466F, -1.063F, -4.25F, 2.0F, 1.0F, 2.0F, -0.125F, false);
		Cube84.setTextureOffset(162, 216).addBox(-0.6466F, -0.938F, 2.625F, 2.0F, 1.0F, 1.0F, 0.0F, false);

		CEdge5 = new ModelRenderer(this);
		CEdge5.setRotationPoint(0.0F, -1.0F, 0.0F);
		Console.addChild(CEdge5);
		setRotationAngle(CEdge5, 0.0F, -2.0944F, 0.0F);
		

		Rotation12 = new ModelRenderer(this);
		Rotation12.setRotationPoint(0.0F, -14.8245F, -10.9546F);
		CEdge5.addChild(Rotation12);
		setRotationAngle(Rotation12, 0.4363F, 0.0F, 0.0F);
		Rotation12.setTextureOffset(179, 215).addBox(-1.0F, -1.4243F, -4.3499F, 2.0F, 1.0F, 1.0F, -0.375F, false);
		Rotation12.setTextureOffset(52, 97).addBox(-1.0F, -1.7993F, -3.5999F, 2.0F, 2.0F, 2.0F, -0.5F, false);
		Rotation12.setTextureOffset(52, 97).addBox(-1.5F, -1.7993F, -1.7249F, 2.0F, 2.0F, 2.0F, -0.625F, false);
		Rotation12.setTextureOffset(52, 97).addBox(-1.75F, -1.5493F, -2.5999F, 2.0F, 2.0F, 2.0F, -0.875F, false);
		Rotation12.setTextureOffset(52, 97).addBox(-0.375F, -1.4243F, -2.3499F, 2.0F, 2.0F, 3.0F, -0.625F, false);
		Rotation12.setTextureOffset(60, 107).addBox(-1.0F, -1.1743F, -4.3499F, 1.0F, 2.0F, 1.0F, -0.375F, false);
		Rotation12.setTextureOffset(60, 107).addBox(0.0F, -1.1743F, -4.3499F, 1.0F, 2.0F, 1.0F, -0.375F, false);

		CPanel5 = new ModelRenderer(this);
		CPanel5.setRotationPoint(0.0F, -0.125F, 0.0F);
		Console.addChild(CPanel5);
		

		Cube85 = new ModelRenderer(this);
		Cube85.setRotationPoint(10.75F, -13.25F, 0.0F);
		CPanel5.addChild(Cube85);
		setRotationAngle(Cube85, 0.0F, 0.0F, 0.4363F);
		Cube85.setTextureOffset(92, 162).addBox(-4.0886F, -0.7428F, -0.5F, 1.0F, 1.0F, 1.0F, 0.375F, false);

		bone97 = new ModelRenderer(this);
		bone97.setRotationPoint(0.5F, 0.5F, -0.5F);
		Cube85.addChild(bone97);
		setRotationAngle(bone97, 0.0F, -0.1745F, 0.4363F);
		bone97.setTextureOffset(49, 116).addBox(0.1614F, -1.1178F, 3.75F, 1.0F, 2.0F, 1.0F, 0.375F, false);
		bone97.setTextureOffset(96, 159).addBox(0.1614F, -1.6178F, 3.75F, 1.0F, 3.0F, 1.0F, 0.25F, false);

		bone99 = new ModelRenderer(this);
		bone99.setRotationPoint(0.5F, 0.5F, -0.75F);
		Cube85.addChild(bone99);
		bone99.setTextureOffset(71, 110).addBox(-3.3479F, -2.157F, -1.0F, 2.0F, 2.0F, 4.0F, -0.5F, false);

		Cube86 = new ModelRenderer(this);
		Cube86.setRotationPoint(10.75F, -13.25F, 0.0F);
		CPanel5.addChild(Cube86);
		setRotationAngle(Cube86, 0.0F, 0.0F, 0.6109F);
		

		bone101 = new ModelRenderer(this);
		bone101.setRotationPoint(0.2235F, 0.541F, -0.5F);
		Cube86.addChild(bone101);
		setRotationAngle(bone101, 0.0F, 0.0F, 0.2618F);
		bone101.setTextureOffset(230, 174).addBox(-0.7716F, -1.563F, -3.75F, 2.0F, 1.0F, 6.0F, -0.125F, false);
		bone101.setTextureOffset(230, 174).addBox(-0.2716F, -2.438F, -3.875F, 2.0F, 2.0F, 2.0F, -0.875F, false);
		bone101.setTextureOffset(49, 116).addBox(-0.2716F, -2.813F, -3.875F, 2.0F, 3.0F, 2.0F, -0.9F, false);
		bone101.setTextureOffset(230, 174).addBox(-0.2716F, -2.438F, -1.5F, 2.0F, 2.0F, 2.0F, -0.875F, false);
		bone101.setTextureOffset(49, 116).addBox(-0.2716F, -2.813F, -1.5F, 2.0F, 3.0F, 2.0F, -0.9F, false);
		bone101.setTextureOffset(230, 174).addBox(-0.2716F, -2.438F, -0.5F, 2.0F, 2.0F, 2.0F, -0.875F, false);
		bone101.setTextureOffset(49, 116).addBox(-0.2716F, -2.813F, -0.5F, 2.0F, 3.0F, 2.0F, -0.9F, false);
		bone101.setTextureOffset(230, 174).addBox(-0.2716F, -2.438F, -3.5F, 2.0F, 2.0F, 2.0F, -0.875F, false);
		bone101.setTextureOffset(49, 116).addBox(-0.2716F, -2.813F, -3.5F, 2.0F, 3.0F, 2.0F, -0.9F, false);
		bone101.setTextureOffset(230, 174).addBox(-0.2716F, -2.438F, -1.125F, 2.0F, 2.0F, 2.0F, -0.875F, false);
		bone101.setTextureOffset(49, 116).addBox(-0.2716F, -2.813F, -1.125F, 2.0F, 3.0F, 2.0F, -0.9F, false);
		bone101.setTextureOffset(230, 174).addBox(-0.2716F, -2.438F, -0.125F, 2.0F, 2.0F, 2.0F, -0.875F, false);
		bone101.setTextureOffset(49, 116).addBox(-0.2716F, -2.813F, -0.125F, 2.0F, 3.0F, 2.0F, -0.9F, false);

		CPanel6 = new ModelRenderer(this);
		CPanel6.setRotationPoint(0.0F, -0.125F, 0.0F);
		Console.addChild(CPanel6);
		setRotationAngle(CPanel6, 0.0F, 1.0472F, 0.0F);
		

		Cube87 = new ModelRenderer(this);
		Cube87.setRotationPoint(10.75F, -13.25F, 0.0F);
		CPanel6.addChild(Cube87);
		setRotationAngle(Cube87, 0.0F, 0.0F, 0.4363F);
		Cube87.setTextureOffset(207, 182).addBox(-0.5886F, -1.3678F, 1.75F, 1.0F, 1.0F, 1.0F, 0.125F, false);
		Cube87.setTextureOffset(103, 176).addBox(-1.5886F, -1.1178F, 0.0F, 1.0F, 1.0F, 1.0F, 0.125F, false);
		Cube87.setTextureOffset(161, 217).addBox(-4.1749F, -0.8209F, -1.375F, 1.0F, 1.0F, 1.0F, 0.25F, false);
		Cube87.setTextureOffset(239, 180).addBox(-1.1749F, -0.8209F, -3.625F, 1.0F, 1.0F, 1.0F, 0.25F, false);

		bone102 = new ModelRenderer(this);
		bone102.setRotationPoint(0.5F, 0.5F, -0.5F);
		Cube87.addChild(bone102);
		setRotationAngle(bone102, 0.0F, 0.0F, 0.4363F);
		bone102.setTextureOffset(156, 210).addBox(-0.5886F, -0.8678F, -0.5F, 1.0F, 1.0F, 1.0F, 0.25F, false);
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
	public void render(CoralConsoleTile tile, float v, MatrixStack matrixStack, IVertexBuilder iVertexBuilder, int i, int i1, float v1, float v2, float v3, float v4) {
	/*
		RandomiserControl randomiserControl = tile.getControl(RandomiserControl.class);
		this.Wheel.rotateAngleX = (float) Math.toRadians(randomiserControl.getAnimationProgress() * 720.0F );

		HandbrakeControl handbrake = tile.getControl(HandbrakeControl.class);
		if (!handbrake.isFree()) {
			Handle.rotateAngleX = (float) (Math.toRadians(-30f));
		} else {
			Handle.rotateAngleX = (float) (Math.toRadians(30f));
		}

		RefuelerControl refuelerControl = tile.getControl(RefuelerControl.class);
		if (refuelerControl.isRefueling()) {
			bone103.rotateAngleZ = (float) (Math.toRadians(20));
		} else {
			bone103.rotateAngleZ = (float) (Math.toRadians(-20));
		}

		LandingTypeControl landingTypeControl = tile.getControl(LandingTypeControl.class);


		this.Upper.rotationPointY = 0.275f - ((float)Math.cos((double)tile.flightTicks * 0.1D)) * 0.275F;
		this.Lower.rotationPointY = - 0.275f + (float)Math.cos((double)tile.flightTicks * 0.1D) * 0.275F;


       tile.getSubsystem(StabilizerSubsystem.class).ifPresent(sys ->{
       			if (sys.isActivated()) {
       				PumoHandle4.offsetY = -0.1355F;
       				PumoHandle4.offsetZ = -0.035F;
				} else{
       				PumoHandle4.offsetY = -0.0F;
       				PumoHandle4.offsetZ = -0.0F;
       			} System.out.println(sys.isActivated());
       		}
       );

		net.tardis.mod.controls.RandomiserControl random = tile.getControl(RandomiserControl.class);
		float randomOff = random.getAnimationTicks() == 0 ? 0 : 0.006F;



		ThrottleControl throttleA = tile.getControl(ThrottleControl.class);
		this.SmallLever2.rotateAngleX = -0.1F + throttleA.getAmount() * 60;
		tile.getDoor().ifPresent(door -> {
			this.HPivot.rotateAngleX = (float) Math.toRadians(door.getOpenState() == EnumDoorState.CLOSED ? 30F : 0F);
		});

		IncModControl inc = tile.getControl(IncModControl.class);
		this.SmallLever.rotateAngleX = (float) Math.toRadians(((inc.index / (float)IncModControl.COORD_MODS.length) * -180f) - 20f);

		XControl x = tile.getControl(XControl.class);


		YControl y = tile.getControl(YControl.class);
;

		ZControl z = tile.getControl(ZControl.class);

		*/
		AllConsole.render(matrixStack, iVertexBuilder, i, i1);

		matrixStack.push();

		matrixStack.translate(-0.12, 0.555, -0.68);
		matrixStack.rotate(Vector3f.XP.rotation(1));

		//TODO Find out wtf this below is
		//WorldText text = new WorldText(0.22F, 0.15F, 0.002F, 0xFFFFFF);
		//text.renderMonitor(Helper.getConsoleText(tile));

		matrixStack.scale(0.4F, 0.3F, 0.4F); //Size of sonic in port
		matrixStack.translate(1.25, -0.75, 2.55); //Location XYZ
		matrixStack.rotate(Vector3f.ZP.rotation(0.05F)); //Rotation
		matrixStack.pop();
	}

	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
	}
}