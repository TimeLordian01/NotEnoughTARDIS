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
import net.tardis.mod.subsystem.StabilizerSubsystem;
import net.tardis.mod.subsystem.Subsystem;
import net.tardis.mod.tileentities.ConsoleTile;

public class CoralConsole extends Model {
	private final RendererModel AllConsole;
	private final RendererModel Monitor;
	private final RendererModel Cube88;
	private final RendererModel Cube98;
	private final RendererModel Cube99;
	private final RendererModel Cube100;
	private final RendererModel Cube89;
	private final RendererModel Cube90;
	private final RendererModel Cube91;
	private final RendererModel Cube92;
	private final RendererModel Cube93;
	private final RendererModel Cube94;
	private final RendererModel Cube95;
	private final RendererModel Cube96;
	private final RendererModel Cube97;
	private final RendererModel Controls;
	private final RendererModel HelmicRegulator;
	private final RendererModel Rotation;
	private final RendererModel bone93;
	private final RendererModel LockingDownMechanism;
	private final RendererModel Rotation5;
	private final RendererModel Wheel;
	private final RendererModel SmallLever;
	private final RendererModel BigLever;
	private final RendererModel Throttle;
	private final RendererModel Rotation6;
	private final RendererModel Wheel2;
	private final RendererModel SmallLever2;
	private final RendererModel BigLever2;
	private final RendererModel LookingControl;
	private final RendererModel Rotation13;
	private final RendererModel Rotor;
	private final RendererModel FastReturn;
	private final RendererModel Cylinder;
	private final RendererModel PumpHandle;
	private final RendererModel FloatMode;
	private final RendererModel Pivot;
	private final RendererModel Cylinder4;
	private final RendererModel Cylinder3;
	private final RendererModel Handbrake2;
	private final RendererModel HPivot;
	private final RendererModel Cylinder6;
	private final RendererModel Cylinder7;
	private final RendererModel IncrementModifier;
	private final RendererModel bone94;
	private final RendererModel bone96;
	private final RendererModel bone95;
	private final RendererModel Needle;
	private final RendererModel Handbrake;
	private final RendererModel Base;
	private final RendererModel Handle;
	private final RendererModel Pump2;
	private final RendererModel Cylinder5;
	private final RendererModel PumoHandle3;
	private final RendererModel Pump;
	private final RendererModel Cylinder2;
	private final RendererModel PumoHandle2;
	private final RendererModel Pump3;
	private final RendererModel Cylinder8;
	private final RendererModel PumoHandle4;
	private final RendererModel TimeRotor;
	private final RendererModel Innards;
	private final RendererModel Tubes;
	private final RendererModel Movable;
	private final RendererModel Lower;
	private final RendererModel bone37;
	private final RendererModel bone38;
	private final RendererModel bone39;
	private final RendererModel bone40;
	private final RendererModel bone41;
	private final RendererModel bone42;
	private final RendererModel bone43;
	private final RendererModel bone44;
	private final RendererModel bone45;
	private final RendererModel bone46;
	private final RendererModel bone47;
	private final RendererModel Lower2;
	private final RendererModel bone48;
	private final RendererModel bone49;
	private final RendererModel bone50;
	private final RendererModel bone51;
	private final RendererModel bone52;
	private final RendererModel bone53;
	private final RendererModel bone54;
	private final RendererModel bone55;
	private final RendererModel bone56;
	private final RendererModel bone57;
	private final RendererModel bone58;
	private final RendererModel Upper;
	private final RendererModel bone59;
	private final RendererModel bone60;
	private final RendererModel bone61;
	private final RendererModel bone62;
	private final RendererModel bone63;
	private final RendererModel bone64;
	private final RendererModel bone65;
	private final RendererModel bone66;
	private final RendererModel bone67;
	private final RendererModel bone68;
	private final RendererModel bone69;
	private final RendererModel Upper2;
	private final RendererModel bone70;
	private final RendererModel bone71;
	private final RendererModel bone72;
	private final RendererModel bone73;
	private final RendererModel bone74;
	private final RendererModel bone75;
	private final RendererModel bone76;
	private final RendererModel bone77;
	private final RendererModel bone78;
	private final RendererModel bone79;
	private final RendererModel bone80;
	private final RendererModel Console;
	private final RendererModel LighterCoral;
	private final RendererModel Block1;
	private final RendererModel Block2;
	private final RendererModel Block3;
	private final RendererModel Block4;
	private final RendererModel Block5;
	private final RendererModel Block6;
	private final RendererModel Block7;
	private final RendererModel Block8;
	private final RendererModel Block9;
	private final RendererModel Block10;
	private final RendererModel Block11;
	private final RendererModel Block12;
	private final RendererModel Coral;
	private final RendererModel Edge5;
	private final RendererModel Cube20;
	private final RendererModel Cube21;
	private final RendererModel Cube22;
	private final RendererModel Cube23;
	private final RendererModel Cube24;
	private final RendererModel Cube25;
	private final RendererModel Cube26;
	private final RendererModel Cube27;
	private final RendererModel Cube37;
	private final RendererModel Edge2;
	private final RendererModel Cube2;
	private final RendererModel Cube3;
	private final RendererModel Cube4;
	private final RendererModel Cube5;
	private final RendererModel Cube6;
	private final RendererModel Cube7;
	private final RendererModel Cube8;
	private final RendererModel Cube9;
	private final RendererModel Cube10;
	private final RendererModel Edge3;
	private final RendererModel Cube11;
	private final RendererModel Cube12;
	private final RendererModel Cube13;
	private final RendererModel Cube14;
	private final RendererModel Cube15;
	private final RendererModel Cube16;
	private final RendererModel Cube17;
	private final RendererModel Cube18;
	private final RendererModel Cube19;
	private final RendererModel Edge4;
	private final RendererModel Cube28;
	private final RendererModel Cube29;
	private final RendererModel Cube30;
	private final RendererModel Cube31;
	private final RendererModel Cube32;
	private final RendererModel Cube33;
	private final RendererModel Cube34;
	private final RendererModel Cube35;
	private final RendererModel Cube36;
	private final RendererModel Edge6;
	private final RendererModel Cube38;
	private final RendererModel Cube39;
	private final RendererModel Cube40;
	private final RendererModel Cube41;
	private final RendererModel Cube42;
	private final RendererModel Cube43;
	private final RendererModel Cube44;
	private final RendererModel Cube45;
	private final RendererModel Cube46;
	private final RendererModel Edge7;
	private final RendererModel Cube47;
	private final RendererModel Cube48;
	private final RendererModel Cube49;
	private final RendererModel Cube50;
	private final RendererModel Cube51;
	private final RendererModel Cube52;
	private final RendererModel Cube53;
	private final RendererModel Cube54;
	private final RendererModel Cube66;
	private final RendererModel UpperRing;
	private final RendererModel Cube1;
	private final RendererModel UpperRoof;
	private final RendererModel Cube55;
	private final RendererModel UpperRoof2;
	private final RendererModel Cube56;
	private final RendererModel UpperRoof3;
	private final RendererModel Cube57;
	private final RendererModel UpperRoof4;
	private final RendererModel Cube58;
	private final RendererModel UpperRoof5;
	private final RendererModel Cube59;
	private final RendererModel UpperRoof6;
	private final RendererModel Cube60;
	private final RendererModel UpperRoof7;
	private final RendererModel Cube61;
	private final RendererModel UpperRoof8;
	private final RendererModel Cube62;
	private final RendererModel UpperRoof9;
	private final RendererModel Cube63;
	private final RendererModel UpperRoof10;
	private final RendererModel Panels;
	private final RendererModel Panel1;
	private final RendererModel Cube64;
	private final RendererModel Cube65;
	private final RendererModel bone;
	private final RendererModel Panel2;
	private final RendererModel Cube67;
	private final RendererModel Cube68;
	private final RendererModel bone2;
	private final RendererModel Panel3;
	private final RendererModel Cube69;
	private final RendererModel Cube70;
	private final RendererModel bone3;
	private final RendererModel Panel4;
	private final RendererModel Cube71;
	private final RendererModel Cube72;
	private final RendererModel bone4;
	private final RendererModel Panel5;
	private final RendererModel Cube73;
	private final RendererModel Cube74;
	private final RendererModel bone5;
	private final RendererModel Panel6;
	private final RendererModel Cube75;
	private final RendererModel Cube76;
	private final RendererModel bone6;
	private final RendererModel Pipes;
	private final RendererModel Set1;
	private final RendererModel bone7;
	private final RendererModel bone8;
	private final RendererModel bone10;
	private final RendererModel bone9;
	private final RendererModel Set2;
	private final RendererModel bone11;
	private final RendererModel bone12;
	private final RendererModel bone13;
	private final RendererModel bone14;
	private final RendererModel Set3;
	private final RendererModel bone15;
	private final RendererModel bone16;
	private final RendererModel bone17;
	private final RendererModel bone18;
	private final RendererModel Set4;
	private final RendererModel bone19;
	private final RendererModel bone20;
	private final RendererModel bone21;
	private final RendererModel bone22;
	private final RendererModel Set5;
	private final RendererModel bone23;
	private final RendererModel bone24;
	private final RendererModel bone25;
	private final RendererModel bone26;
	private final RendererModel Set6;
	private final RendererModel bone27;
	private final RendererModel bone28;
	private final RendererModel bone29;
	private final RendererModel bone30;
	private final RendererModel UnderConsole;
	private final RendererModel part1;
	private final RendererModel bone33;
	private final RendererModel part2;
	private final RendererModel bone31;
	private final RendererModel part3;
	private final RendererModel bone32;
	private final RendererModel part4;
	private final RendererModel bone34;
	private final RendererModel part5;
	private final RendererModel bone35;
	private final RendererModel part6;
	private final RendererModel bone36;
	private final RendererModel CPanel1;
	private final RendererModel Cube78;
	private final RendererModel bone81;
	private final RendererModel Cube77;
	private final RendererModel CEdge2;
	private final RendererModel Rotation2;
	private final RendererModel Rotation3;
	private final RendererModel bone82;
	private final RendererModel bone83;
	private final RendererModel Rotation4;
	private final RendererModel Rotation11;
	private final RendererModel CEdge3;
	private final RendererModel Rotation8;
	private final RendererModel bone88;
	private final RendererModel bone103;
	private final RendererModel CPanel2;
	private final RendererModel Cube81;
	private final RendererModel bone89;
	private final RendererModel bone90;
	private final RendererModel Cube82;
	private final RendererModel bone91;
	private final RendererModel bone92;
	private final RendererModel CPanel3;
	private final RendererModel Cube79;
	private final RendererModel bone84;
	private final RendererModel bone87;
	private final RendererModel bone86;
	private final RendererModel bone85;
	private final RendererModel Cube80;
	private final RendererModel CEdge4;
	private final RendererModel Rotation7;
	private final RendererModel Rotation10;
	private final RendererModel CPanel4;
	private final RendererModel Rotation9;
	private final RendererModel Cube83;
	private final RendererModel Cube84;
	private final RendererModel CEdge5;
	private final RendererModel Rotation12;
	private final RendererModel CPanel5;
	private final RendererModel Cube85;
	private final RendererModel bone97;
	private final RendererModel bone99;
	private final RendererModel Cube86;
	private final RendererModel bone101;
	private final RendererModel CPanel6;
	private final RendererModel Cube87;
	private final RendererModel bone102;

	public CoralConsole() {
		textureWidth = 256;
		textureHeight = 256;

		AllConsole = new RendererModel(this);
		AllConsole.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Monitor = new RendererModel(this);
		Monitor.setRotationPoint(0.0F, 0.0F, 0.0F);
		AllConsole.addChild(Monitor);
		setRotationAngle(Monitor, 0.0F, 2.2689F, 0.0F);
		

		Cube88 = new RendererModel(this);
		Cube88.setRotationPoint(0.0F, 1.25F, 0.0F);
		Monitor.addChild(Cube88);
		Cube88.cubeList.add(new ModelBox(Cube88, 57, 109, -5.91F, -21.0F, -2.0F, 2, 1, 4, -0.115F, false));

		Cube98 = new RendererModel(this);
		Cube98.setRotationPoint(-1.75F, 1.25F, -1.5F);
		Monitor.addChild(Cube98);
		Cube98.cubeList.add(new ModelBox(Cube98, 57, 109, -6.91F, -21.0F, 1.0F, 3, 1, 1, -0.115F, false));

		Cube99 = new RendererModel(this);
		Cube99.setRotationPoint(-4.5F, 0.75F, -1.5F);
		Monitor.addChild(Cube99);
		setRotationAngle(Cube99, 0.0F, 0.0F, 0.0873F);
		Cube99.cubeList.add(new ModelBox(Cube99, 101, 166, -7.6998F, -19.8909F, -2.0F, 3, 1, 7, -0.24F, false));

		Cube100 = new RendererModel(this);
		Cube100.setRotationPoint(-4.5F, 0.0F, -1.5F);
		Monitor.addChild(Cube100);
		setRotationAngle(Cube100, 0.0F, 0.0F, 0.0873F);
		Cube100.cubeList.add(new ModelBox(Cube100, 116, 156, -5.6344F, -24.6638F, -2.0F, 1, 6, 7, -0.24F, false));
		Cube100.cubeList.add(new ModelBox(Cube100, 116, 156, -6.1544F, -24.6638F, 4.0F, 1, 6, 1, -0.24F, false));
		Cube100.cubeList.add(new ModelBox(Cube100, 116, 156, -6.1544F, -24.6638F, -2.0F, 1, 6, 1, -0.24F, false));
		Cube100.cubeList.add(new ModelBox(Cube100, 116, 156, -6.1544F, -24.6638F, -1.48F, 1, 1, 6, -0.24F, false));
		Cube100.cubeList.add(new ModelBox(Cube100, 116, 156, -6.1544F, -19.6638F, -1.48F, 1, 1, 6, -0.24F, false));
		Cube100.cubeList.add(new ModelBox(Cube100, 196, 153, -5.8844F, -24.6638F, -2.0F, 1, 6, 7, -0.365F, false));

		Cube89 = new RendererModel(this);
		Cube89.setRotationPoint(0.0F, 1.25F, 0.0F);
		Monitor.addChild(Cube89);
		setRotationAngle(Cube89, 0.0F, -0.6283F, 0.0F);
		Cube89.cubeList.add(new ModelBox(Cube89, 57, 109, -5.91F, -21.0F, -2.0F, 2, 1, 4, -0.125F, false));

		Cube90 = new RendererModel(this);
		Cube90.setRotationPoint(0.0F, 1.25F, 0.0F);
		Monitor.addChild(Cube90);
		setRotationAngle(Cube90, 0.0F, 0.6283F, 0.0F);
		Cube90.cubeList.add(new ModelBox(Cube90, 57, 109, -5.91F, -21.0F, -2.0F, 2, 1, 4, -0.11F, false));

		Cube91 = new RendererModel(this);
		Cube91.setRotationPoint(0.0F, 1.25F, 0.0F);
		Monitor.addChild(Cube91);
		setRotationAngle(Cube91, 0.0F, -1.2566F, 0.0F);
		Cube91.cubeList.add(new ModelBox(Cube91, 57, 109, -5.91F, -21.0F, -2.0F, 2, 1, 4, -0.1F, false));

		Cube92 = new RendererModel(this);
		Cube92.setRotationPoint(0.0F, 1.25F, 0.0F);
		Monitor.addChild(Cube92);
		setRotationAngle(Cube92, 0.0F, 1.2566F, 0.0F);
		Cube92.cubeList.add(new ModelBox(Cube92, 57, 109, -5.91F, -21.0F, -2.0F, 2, 1, 4, -0.105F, false));

		Cube93 = new RendererModel(this);
		Cube93.setRotationPoint(0.0F, 1.25F, 0.0F);
		Monitor.addChild(Cube93);
		setRotationAngle(Cube93, 0.0F, -1.885F, 0.0F);
		Cube93.cubeList.add(new ModelBox(Cube93, 57, 109, -5.91F, -21.0F, -2.0F, 2, 1, 4, -0.105F, false));

		Cube94 = new RendererModel(this);
		Cube94.setRotationPoint(0.0F, 1.25F, 0.0F);
		Monitor.addChild(Cube94);
		setRotationAngle(Cube94, 0.0F, 1.885F, 0.0F);
		Cube94.cubeList.add(new ModelBox(Cube94, 57, 109, -5.91F, -21.0F, -2.0F, 2, 1, 4, -0.1F, false));

		Cube95 = new RendererModel(this);
		Cube95.setRotationPoint(0.0F, 1.25F, 0.0F);
		Monitor.addChild(Cube95);
		setRotationAngle(Cube95, 0.0F, -2.5133F, 0.0F);
		Cube95.cubeList.add(new ModelBox(Cube95, 57, 109, -5.91F, -21.0F, -2.0F, 2, 1, 4, -0.11F, false));

		Cube96 = new RendererModel(this);
		Cube96.setRotationPoint(0.0F, 1.25F, 0.0F);
		Monitor.addChild(Cube96);
		setRotationAngle(Cube96, 0.0F, 2.5133F, 0.0F);
		Cube96.cubeList.add(new ModelBox(Cube96, 57, 109, -5.91F, -21.0F, -2.0F, 2, 1, 4, -0.125F, false));

		Cube97 = new RendererModel(this);
		Cube97.setRotationPoint(0.0F, 1.25F, 0.0F);
		Monitor.addChild(Cube97);
		setRotationAngle(Cube97, 0.0F, 3.1416F, 0.0F);
		Cube97.cubeList.add(new ModelBox(Cube97, 57, 109, -5.91F, -21.0F, -2.0F, 2, 1, 4, -0.115F, false));

		Controls = new RendererModel(this);
		Controls.setRotationPoint(0.0F, 0.0F, 0.0F);
		AllConsole.addChild(Controls);
		

		HelmicRegulator = new RendererModel(this);
		HelmicRegulator.setRotationPoint(0.0F, -1.0F, 1.125F);
		Controls.addChild(HelmicRegulator);
		

		Rotation = new RendererModel(this);
		Rotation.setRotationPoint(0.0F, -15.1995F, -12.0796F);
		HelmicRegulator.addChild(Rotation);
		setRotationAngle(Rotation, 0.3491F, 0.0F, 0.0F);
		Rotation.cubeList.add(new ModelBox(Rotation, 41, 212, -1.5F, -0.5F, -2.5F, 3, 1, 6, -0.125F, false));
		Rotation.cubeList.add(new ModelBox(Rotation, 46, 220, -0.5F, -1.75F, -3.625F, 1, 1, 2, -0.251F, false));
		Rotation.cubeList.add(new ModelBox(Rotation, 37, 225, -1.875F, -1.875F, -3.0F, 2, 2, 7, -0.75F, false));
		Rotation.cubeList.add(new ModelBox(Rotation, 37, 225, -0.25F, -1.875F, -3.0F, 2, 2, 7, -0.75F, false));
		Rotation.cubeList.add(new ModelBox(Rotation, 37, 225, -1.0F, -1.875F, -3.0F, 2, 2, 7, -0.75F, false));
		Rotation.cubeList.add(new ModelBox(Rotation, 52, 105, 0.625F, -1.25F, -1.5F, 1, 2, 1, -0.254F, false));
		Rotation.cubeList.add(new ModelBox(Rotation, 52, 105, -1.625F, -1.25F, -1.5F, 1, 2, 1, -0.254F, false));
		Rotation.cubeList.add(new ModelBox(Rotation, 52, 105, 0.625F, -1.25F, 1.375F, 1, 2, 1, -0.254F, false));
		Rotation.cubeList.add(new ModelBox(Rotation, 52, 105, -1.625F, -1.25F, 1.375F, 1, 2, 1, -0.254F, false));

		bone93 = new RendererModel(this);
		bone93.setRotationPoint(-0.625F, -13.2844F, 12.9352F);
		Rotation.addChild(bone93);
		bone93.cubeList.add(new ModelBox(bone93, 52, 105, -0.875F, 11.4094F, -15.3102F, 3, 2, 2, -0.625F, false));

		LockingDownMechanism = new RendererModel(this);
		LockingDownMechanism.setRotationPoint(0.0F, -1.0F, 0.0F);
		Controls.addChild(LockingDownMechanism);
		setRotationAngle(LockingDownMechanism, 0.0F, 2.0944F, 0.0F);
		

		Rotation5 = new RendererModel(this);
		Rotation5.setRotationPoint(0.0F, -15.1995F, -10.9546F);
		LockingDownMechanism.addChild(Rotation5);
		setRotationAngle(Rotation5, 0.5236F, 0.0F, 0.0F);
		Rotation5.cubeList.add(new ModelBox(Rotation5, 43, 221, -1.5F, -0.75F, -4.0F, 3, 1, 4, -0.125F, false));
		Rotation5.cubeList.add(new ModelBox(Rotation5, 43, 221, -1.875F, -2.25F, -4.5F, 2, 3, 5, -0.875F, false));
		Rotation5.cubeList.add(new ModelBox(Rotation5, 43, 221, -1.875F, -3.0F, -4.125F, 2, 3, 4, -0.876F, false));
		Rotation5.cubeList.add(new ModelBox(Rotation5, 43, 221, -0.875F, -3.0F, -4.125F, 2, 3, 4, -0.876F, false));
		Rotation5.cubeList.add(new ModelBox(Rotation5, 43, 221, -0.875F, -2.25F, -4.5F, 2, 3, 5, -0.875F, false));
		Rotation5.cubeList.add(new ModelBox(Rotation5, 43, 221, 0.125F, -2.0F, -3.0F, 1, 3, 2, -0.125F, false));

		Wheel = new RendererModel(this);
		Wheel.setRotationPoint(1.0F, -1.875F, -2.0F);
		Rotation5.addChild(Wheel);
		Wheel.cubeList.add(new ModelBox(Wheel, 108, 162, -0.5F, -1.5F, -1.5F, 1, 3, 3, -0.475F, false));

		SmallLever = new RendererModel(this);
		SmallLever.setRotationPoint(0.0F, -1.75F, -2.25F);
		Rotation5.addChild(SmallLever);
		setRotationAngle(SmallLever, -0.0873F, 0.0F, 0.0F);
		SmallLever.cubeList.add(new ModelBox(SmallLever, 52, 115, -0.625F, -0.5F, -2.375F, 1, 1, 3, -0.375F, false));
		SmallLever.cubeList.add(new ModelBox(SmallLever, 52, 115, -0.625F, -0.75F, -2.375F, 1, 1, 3, -0.375F, false));
		SmallLever.cubeList.add(new ModelBox(SmallLever, 149, 209, -0.375F, -0.75F, -2.375F, 1, 1, 1, -0.375F, false));
		SmallLever.cubeList.add(new ModelBox(SmallLever, 52, 115, -0.875F, -0.75F, -0.375F, 1, 1, 1, -0.375F, false));
		SmallLever.cubeList.add(new ModelBox(SmallLever, 149, 209, -0.375F, -0.5F, -2.375F, 1, 1, 1, -0.375F, false));
		SmallLever.cubeList.add(new ModelBox(SmallLever, 52, 115, -0.875F, -0.5F, -0.375F, 1, 1, 1, -0.375F, false));

		BigLever = new RendererModel(this);
		BigLever.setRotationPoint(-0.5F, -1.875F, -2.0F);
		Rotation5.addChild(BigLever);
		BigLever.cubeList.add(new ModelBox(BigLever, 78, 113, -0.625F, -0.375F, -1.375F, 1, 1, 2, -0.375F, false));
		BigLever.cubeList.add(new ModelBox(BigLever, 78, 113, -0.625F, -0.625F, -1.375F, 1, 1, 2, -0.375F, false));
		BigLever.cubeList.add(new ModelBox(BigLever, 78, 113, -0.625F, -0.75F, -2.625F, 1, 1, 2, -0.375F, false));
		BigLever.cubeList.add(new ModelBox(BigLever, 78, 113, -0.625F, -0.75F, -2.875F, 1, 1, 1, -0.375F, false));
		BigLever.cubeList.add(new ModelBox(BigLever, 78, 113, -0.625F, -0.75F, -3.125F, 1, 1, 1, -0.375F, false));
		BigLever.cubeList.add(new ModelBox(BigLever, 78, 113, -0.625F, -0.5F, -1.625F, 1, 1, 1, -0.375F, false));
		BigLever.cubeList.add(new ModelBox(BigLever, 148, 208, -1.125F, -1.5F, -3.625F, 3, 2, 2, -0.875F, false));

		Throttle = new RendererModel(this);
		Throttle.setRotationPoint(0.0F, -1.0F, 0.0F);
		Controls.addChild(Throttle);
		setRotationAngle(Throttle, 0.0F, -1.0472F, 0.0F);
		

		Rotation6 = new RendererModel(this);
		Rotation6.setRotationPoint(0.0F, -15.1995F, -10.9546F);
		Throttle.addChild(Rotation6);
		setRotationAngle(Rotation6, 0.5236F, 0.0F, 0.0F);
		Rotation6.cubeList.add(new ModelBox(Rotation6, 48, 212, -1.5F, -0.75F, -4.0F, 3, 1, 4, -0.125F, false));
		Rotation6.cubeList.add(new ModelBox(Rotation6, 48, 212, -1.875F, -2.25F, -4.5F, 2, 3, 5, -0.875F, false));
		Rotation6.cubeList.add(new ModelBox(Rotation6, 48, 212, -1.875F, -3.0F, -4.125F, 2, 3, 4, -0.876F, false));
		Rotation6.cubeList.add(new ModelBox(Rotation6, 48, 212, -0.875F, -3.0F, -4.125F, 2, 3, 4, -0.876F, false));
		Rotation6.cubeList.add(new ModelBox(Rotation6, 48, 212, -0.875F, -2.25F, -4.5F, 2, 3, 5, -0.875F, false));
		Rotation6.cubeList.add(new ModelBox(Rotation6, 48, 212, 0.125F, -2.0F, -3.0F, 1, 3, 2, -0.125F, false));

		Wheel2 = new RendererModel(this);
		Wheel2.setRotationPoint(1.0F, -1.875F, -2.0F);
		Rotation6.addChild(Wheel2);
		setRotationAngle(Wheel2, 1.1345F, 0.0F, 0.0F);
		Wheel2.cubeList.add(new ModelBox(Wheel2, 108, 162, -0.5F, -1.5F, -1.5F, 1, 3, 3, -0.475F, false));

		SmallLever2 = new RendererModel(this);
		SmallLever2.setRotationPoint(0.0F, -1.875F, -2.25F);
		Rotation6.addChild(SmallLever2);
		setRotationAngle(SmallLever2, -0.7854F, 0.0F, 0.0F);
		SmallLever2.cubeList.add(new ModelBox(SmallLever2, 58, 97, -0.625F, -0.375F, -2.375F, 1, 1, 3, -0.375F, false));
		SmallLever2.cubeList.add(new ModelBox(SmallLever2, 58, 97, -0.625F, -0.625F, -2.375F, 1, 1, 3, -0.375F, false));
		SmallLever2.cubeList.add(new ModelBox(SmallLever2, 148, 211, -0.375F, -0.625F, -2.375F, 1, 1, 1, -0.375F, false));
		SmallLever2.cubeList.add(new ModelBox(SmallLever2, 58, 97, -0.875F, -0.625F, -0.375F, 1, 1, 1, -0.375F, false));
		SmallLever2.cubeList.add(new ModelBox(SmallLever2, 148, 211, -0.375F, -0.375F, -2.375F, 1, 1, 1, -0.375F, false));
		SmallLever2.cubeList.add(new ModelBox(SmallLever2, 58, 97, -0.875F, -0.375F, -0.375F, 1, 1, 1, -0.375F, false));

		BigLever2 = new RendererModel(this);
		BigLever2.setRotationPoint(0.0F, -1.625F, -2.25F);
		Rotation6.addChild(BigLever2);
		setRotationAngle(BigLever2, -2.5307F, 0.0F, 0.0F);
		BigLever2.cubeList.add(new ModelBox(BigLever2, 57, 112, -1.125F, -0.625F, -1.125F, 1, 1, 2, -0.375F, false));
		BigLever2.cubeList.add(new ModelBox(BigLever2, 57, 112, -1.125F, -0.875F, -1.125F, 1, 1, 2, -0.375F, false));
		BigLever2.cubeList.add(new ModelBox(BigLever2, 57, 112, -1.125F, -1.0F, -2.375F, 1, 1, 2, -0.375F, false));
		BigLever2.cubeList.add(new ModelBox(BigLever2, 57, 112, -1.125F, -1.0F, -2.625F, 1, 1, 1, -0.375F, false));
		BigLever2.cubeList.add(new ModelBox(BigLever2, 57, 112, -1.125F, -1.0F, -2.875F, 1, 1, 1, -0.375F, false));
		BigLever2.cubeList.add(new ModelBox(BigLever2, 57, 112, -1.125F, -0.75F, -1.375F, 1, 1, 1, -0.375F, false));
		BigLever2.cubeList.add(new ModelBox(BigLever2, 164, 208, -1.625F, -1.75F, -3.375F, 3, 2, 2, -0.875F, false));

		LookingControl = new RendererModel(this);
		LookingControl.setRotationPoint(0.0F, -10.75F, 0.0F);
		Controls.addChild(LookingControl);
		setRotationAngle(LookingControl, 0.6109F, -1.0472F, 0.0F);
		

		Rotation13 = new RendererModel(this);
		Rotation13.setRotationPoint(0.0F, -15.1995F, -10.9546F);
		LookingControl.addChild(Rotation13);
		setRotationAngle(Rotation13, 0.5236F, 0.0F, 0.0F);
		Rotation13.cubeList.add(new ModelBox(Rotation13, 64, 116, -1.0F, 3.125F, -3.0F, 2, 2, 2, -0.5F, false));

		Rotor = new RendererModel(this);
		Rotor.setRotationPoint(0.0F, 3.625F, -2.0F);
		Rotation13.addChild(Rotor);
		setRotationAngle(Rotor, 0.0F, -0.5236F, 0.0F);
		Rotor.cubeList.add(new ModelBox(Rotor, 74, 111, -0.625F, -0.5F, -0.5F, 2, 1, 1, -0.3625F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 39, 158, 0.275F, -0.5F, -0.5F, 1, 1, 1, -0.425F, false));
		Rotor.cubeList.add(new ModelBox(Rotor, 69, 104, 0.525F, -0.65F, -0.5F, 1, 1, 1, -0.3F, false));

		FastReturn = new RendererModel(this);
		FastReturn.setRotationPoint(0.0F, -1.0F, 0.0F);
		Controls.addChild(FastReturn);
		setRotationAngle(FastReturn, 0.0F, 0.8552F, 0.0F);
		

		Cylinder = new RendererModel(this);
		Cylinder.setRotationPoint(0.0F, -16.8245F, -10.9546F);
		FastReturn.addChild(Cylinder);
		setRotationAngle(Cylinder, 0.2618F, 0.0F, 0.0F);
		Cylinder.cubeList.add(new ModelBox(Cylinder, 178, 156, -1.5F, 4.625F, -6.5F, 1, 4, 1, -0.15F, false));

		PumpHandle = new RendererModel(this);
		PumpHandle.setRotationPoint(0.0F, -16.8245F, -10.9546F);
		FastReturn.addChild(PumpHandle);
		setRotationAngle(PumpHandle, 0.2618F, 0.0F, 0.0F);
		PumpHandle.cubeList.add(new ModelBox(PumpHandle, 40, 206, -1.5F, 3.125F, -6.5F, 1, 4, 1, -0.25F, false));
		PumpHandle.cubeList.add(new ModelBox(PumpHandle, 40, 206, -1.5F, 3.75F, -6.5F, 1, 1, 1, -0.125F, false));
		PumpHandle.cubeList.add(new ModelBox(PumpHandle, 40, 206, -1.5F, 1.875F, -6.5F, 1, 2, 1, -0.125F, false));

		FloatMode = new RendererModel(this);
		FloatMode.setRotationPoint(0.0F, 0.0F, 0.0F);
		Controls.addChild(FloatMode);
		setRotationAngle(FloatMode, 0.0F, 1.0996F, 0.0F);
		

		Pivot = new RendererModel(this);
		Pivot.setRotationPoint(-0.875F, -9.25F, -14.375F);
		FloatMode.addChild(Pivot);
		

		Cylinder4 = new RendererModel(this);
		Cylinder4.setRotationPoint(0.875F, -8.5745F, 3.4204F);
		Pivot.addChild(Cylinder4);
		setRotationAngle(Cylinder4, 0.3491F, 0.0F, 0.0F);
		Cylinder4.cubeList.add(new ModelBox(Cylinder4, 42, 231, -1.25F, 1.7146F, -7.5953F, 1, 3, 1, -0.399F, false));
		Cylinder4.cubeList.add(new ModelBox(Cylinder4, 42, 231, -1.25F, 1.7146F, -7.7953F, 1, 3, 1, -0.399F, false));

		Cylinder3 = new RendererModel(this);
		Cylinder3.setRotationPoint(0.875F, -8.5745F, 3.4204F);
		Pivot.addChild(Cylinder3);
		setRotationAngle(Cylinder3, 0.6981F, 0.0F, 0.0F);
		Cylinder3.cubeList.add(new ModelBox(Cylinder3, 42, 231, -1.25F, 1.125F, -8.625F, 1, 4, 1, -0.4F, false));
		Cylinder3.cubeList.add(new ModelBox(Cylinder3, 42, 231, -1.25F, 0.125F, -8.425F, 1, 5, 1, -0.4F, false));
		Cylinder3.cubeList.add(new ModelBox(Cylinder3, 42, 231, -1.25F, 1.125F, -8.825F, 1, 4, 1, -0.4F, false));

		Handbrake2 = new RendererModel(this);
		Handbrake2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Controls.addChild(Handbrake2);
		setRotationAngle(Handbrake2, 0.0F, -2.3038F, 0.0F);
		

		HPivot = new RendererModel(this);
		HPivot.setRotationPoint(-1.7114F, -10.25F, -15.3039F);
		Handbrake2.addChild(HPivot);
		setRotationAngle(HPivot, 0.8727F, -1.3963F, -0.2618F);
		

		Cylinder6 = new RendererModel(this);
		Cylinder6.setRotationPoint(0.875F, -8.5745F, 3.4204F);
		HPivot.addChild(Cylinder6);
		setRotationAngle(Cylinder6, 0.3491F, 0.0F, 0.0F);
		Cylinder6.cubeList.add(new ModelBox(Cylinder6, 45, 210, -1.25F, 1.7146F, -7.5953F, 1, 3, 1, -0.399F, false));
		Cylinder6.cubeList.add(new ModelBox(Cylinder6, 45, 210, -1.25F, 1.7146F, -7.7953F, 1, 3, 1, -0.399F, false));

		Cylinder7 = new RendererModel(this);
		Cylinder7.setRotationPoint(0.875F, -8.5745F, 3.4204F);
		HPivot.addChild(Cylinder7);
		setRotationAngle(Cylinder7, 0.6981F, 0.0F, 0.0F);
		Cylinder7.cubeList.add(new ModelBox(Cylinder7, 43, 214, -1.25F, 1.125F, -8.625F, 1, 4, 1, -0.4F, false));
		Cylinder7.cubeList.add(new ModelBox(Cylinder7, 43, 214, -1.25F, 0.125F, -8.425F, 1, 5, 1, -0.4F, false));
		Cylinder7.cubeList.add(new ModelBox(Cylinder7, 43, 214, -1.25F, 0.125F, -8.225F, 1, 5, 1, -0.4F, false));
		Cylinder7.cubeList.add(new ModelBox(Cylinder7, 43, 214, -1.25F, 1.125F, -8.825F, 1, 4, 1, -0.4F, false));

		IncrementModifier = new RendererModel(this);
		IncrementModifier.setRotationPoint(0.0F, -30.3589F, 0.0F);
		Controls.addChild(IncrementModifier);
		setRotationAngle(IncrementModifier, 0.2618F, -2.0944F, 0.0F);
		IncrementModifier.cubeList.add(new ModelBox(IncrementModifier, 63, 99, 0.0F, 9.8601F, -12.8045F, 2, 2, 2, -0.625F, false));
		IncrementModifier.cubeList.add(new ModelBox(IncrementModifier, 63, 99, -1.875F, 9.6101F, -13.3045F, 2, 2, 3, -0.875F, false));
		IncrementModifier.cubeList.add(new ModelBox(IncrementModifier, 59, 121, -1.75F, 9.6101F, -13.5545F, 2, 2, 2, -0.875F, false));
		IncrementModifier.cubeList.add(new ModelBox(IncrementModifier, 63, 120, -1.75F, 9.6101F, -12.0545F, 2, 2, 2, -0.875F, false));
		IncrementModifier.cubeList.add(new ModelBox(IncrementModifier, 63, 120, -1.5625F, 9.6101F, -11.8045F, 2, 2, 2, -0.875F, false));
		IncrementModifier.cubeList.add(new ModelBox(IncrementModifier, 59, 121, -1.5625F, 9.6101F, -13.8045F, 2, 2, 2, -0.875F, false));

		bone94 = new RendererModel(this);
		bone94.setRotationPoint(0.875F, 10.6101F, -11.8045F);
		IncrementModifier.addChild(bone94);
		setRotationAngle(bone94, 0.0F, -0.6109F, 0.0F);
		bone94.cubeList.add(new ModelBox(bone94, 59, 121, -2.3454F, -1.0F, -1.0437F, 3, 2, 2, -0.875F, false));
		bone94.cubeList.add(new ModelBox(bone94, 57, 125, -2.5954F, -1.0F, -1.0437F, 2, 2, 2, -0.875F, false));

		bone96 = new RendererModel(this);
		bone96.setRotationPoint(0.875F, 10.6101F, -11.8045F);
		IncrementModifier.addChild(bone96);
		setRotationAngle(bone96, 0.0F, 0.6109F, 0.0F);
		bone96.cubeList.add(new ModelBox(bone96, 63, 99, -2.3454F, -1.0F, -0.9563F, 3, 2, 2, -0.875F, false));
		bone96.cubeList.add(new ModelBox(bone96, 63, 120, -2.5954F, -1.0F, -0.9563F, 2, 2, 2, -0.875F, false));

		bone95 = new RendererModel(this);
		bone95.setRotationPoint(0.875F, 10.6101F, -11.8045F);
		IncrementModifier.addChild(bone95);
		setRotationAngle(bone95, 0.0F, -0.6109F, 0.0F);
		

		Needle = new RendererModel(this);
		Needle.setRotationPoint(0.875F, 10.4851F, -11.8045F);
		IncrementModifier.addChild(Needle);
		setRotationAngle(Needle, 0.0F, -0.4363F, 0.0F);
		Needle.cubeList.add(new ModelBox(Needle, 63, 99, -3.0F, -1.0F, -1.0F, 4, 2, 2, -0.875F, false));

		Handbrake = new RendererModel(this);
		Handbrake.setRotationPoint(0.0F, -15.1995F, 0.0F);
		Controls.addChild(Handbrake);
		setRotationAngle(Handbrake, 0.5236F, 3.1416F, 0.0F);
		

		Base = new RendererModel(this);
		Base.setRotationPoint(0.0F, -11.6026F, -1.1875F);
		Handbrake.addChild(Base);
		setRotationAngle(Base, -0.2618F, 0.0F, 0.0F);
		Base.cubeList.add(new ModelBox(Base, 96, 161, -1.0F, 6.6509F, -6.8147F, 2, 1, 4, -0.124F, false));
		Base.cubeList.add(new ModelBox(Base, 96, 161, 0.5F, 6.6509F, -5.5647F, 1, 1, 2, -0.124F, false));
		Base.cubeList.add(new ModelBox(Base, 96, 161, -1.25F, 5.7759F, -7.0647F, 1, 2, 2, -0.376F, false));
		Base.cubeList.add(new ModelBox(Base, 96, 161, 0.25F, 5.7759F, -7.0647F, 1, 2, 2, -0.376F, false));
		Base.cubeList.add(new ModelBox(Base, 96, 161, -1.25F, 5.6509F, -5.8147F, 1, 2, 1, -0.375F, false));
		Base.cubeList.add(new ModelBox(Base, 96, 161, -1.25F, 5.6509F, -6.0647F, 1, 2, 1, -0.375F, false));
		Base.cubeList.add(new ModelBox(Base, 96, 161, 0.25F, 5.6509F, -5.8147F, 1, 2, 1, -0.375F, false));
		Base.cubeList.add(new ModelBox(Base, 96, 161, 0.25F, 5.6509F, -6.0647F, 1, 2, 1, -0.375F, false));
		Base.cubeList.add(new ModelBox(Base, 96, 161, -1.25F, 5.5259F, -5.5647F, 1, 2, 2, -0.375F, false));
		Base.cubeList.add(new ModelBox(Base, 96, 161, 0.25F, 5.5259F, -5.5647F, 1, 2, 2, -0.375F, false));
		Base.cubeList.add(new ModelBox(Base, 96, 161, -0.375F, 5.5259F, -5.5647F, 2, 2, 2, -0.625F, false));
		Base.cubeList.add(new ModelBox(Base, 96, 161, -1.25F, 5.4009F, -4.3147F, 1, 2, 1, -0.375F, false));
		Base.cubeList.add(new ModelBox(Base, 96, 161, 0.25F, 5.4009F, -4.3147F, 1, 2, 1, -0.375F, false));
		Base.cubeList.add(new ModelBox(Base, 96, 161, -1.25F, 5.4009F, -4.0647F, 1, 2, 1, -0.375F, false));
		Base.cubeList.add(new ModelBox(Base, 96, 161, 0.25F, 5.4009F, -4.0647F, 1, 2, 1, -0.375F, false));
		Base.cubeList.add(new ModelBox(Base, 96, 161, -1.25F, 5.2759F, -3.8147F, 1, 2, 1, -0.375F, false));
		Base.cubeList.add(new ModelBox(Base, 96, 161, 0.25F, 5.2759F, -3.8147F, 1, 2, 1, -0.375F, false));
		Base.cubeList.add(new ModelBox(Base, 96, 161, -1.25F, 5.2759F, -3.5647F, 1, 2, 1, -0.375F, false));
		Base.cubeList.add(new ModelBox(Base, 96, 161, 0.25F, 5.2759F, -3.5647F, 1, 2, 1, -0.375F, false));
		Base.cubeList.add(new ModelBox(Base, 96, 161, -1.0F, 5.1509F, -3.5647F, 2, 2, 1, -0.375F, false));
		Base.cubeList.add(new ModelBox(Base, 96, 161, -1.0F, 6.2759F, -6.8147F, 2, 1, 2, -0.25F, false));
		Base.cubeList.add(new ModelBox(Base, 96, 161, -1.0F, 5.9009F, -5.8147F, 2, 1, 2, -0.25F, false));
		Base.cubeList.add(new ModelBox(Base, 96, 161, -1.0F, 5.7759F, -4.8147F, 2, 1, 2, -0.25F, false));
		Base.cubeList.add(new ModelBox(Base, 149, 154, -1.0F, 5.0259F, -4.8147F, 2, 2, 2, -0.875F, false));
		Base.cubeList.add(new ModelBox(Base, 149, 154, -1.0F, 5.0259F, -5.1897F, 2, 2, 2, -0.875F, false));
		Base.cubeList.add(new ModelBox(Base, 147, 180, -0.625F, 5.0259F, -4.8147F, 2, 2, 2, -0.875F, false));
		Base.cubeList.add(new ModelBox(Base, 147, 180, -0.625F, 5.0259F, -5.1897F, 2, 2, 2, -0.875F, false));

		Handle = new RendererModel(this);
		Handle.setRotationPoint(1.0F, -6.1026F, -7.375F);
		Handbrake.addChild(Handle);
		setRotationAngle(Handle, -0.5236F, 0.0F, 0.0F);
		Handle.cubeList.add(new ModelBox(Handle, 57, 98, -0.875F, -2.9741F, -1.0022F, 2, 5, 2, -0.875F, false));
		Handle.cubeList.add(new ModelBox(Handle, 49, 100, -0.875F, -2.9741F, -1.0022F, 2, 2, 2, -0.85F, false));

		Pump2 = new RendererModel(this);
		Pump2.setRotationPoint(0.0F, -1.0F, 0.0F);
		Controls.addChild(Pump2);
		setRotationAngle(Pump2, 0.0F, 1.9024F, 0.0F);
		

		Cylinder5 = new RendererModel(this);
		Cylinder5.setRotationPoint(0.0F, -16.8245F, -10.9546F);
		Pump2.addChild(Cylinder5);
		setRotationAngle(Cylinder5, 0.2618F, 0.0F, 0.0F);
		Cylinder5.cubeList.add(new ModelBox(Cylinder5, 176, 142, -1.5F, 4.625F, -6.5F, 1, 4, 1, -0.15F, false));

		PumoHandle3 = new RendererModel(this);
		PumoHandle3.setRotationPoint(0.0F, -16.8245F, -10.9546F);
		Pump2.addChild(PumoHandle3);
		setRotationAngle(PumoHandle3, 0.2618F, 0.0F, 0.0F);
		PumoHandle3.cubeList.add(new ModelBox(PumoHandle3, 32, 231, -1.5F, 3.125F, -6.5F, 1, 4, 1, -0.25F, false));
		PumoHandle3.cubeList.add(new ModelBox(PumoHandle3, 32, 231, -1.5F, 3.75F, -6.5F, 1, 1, 1, -0.125F, false));
		PumoHandle3.cubeList.add(new ModelBox(PumoHandle3, 32, 231, -1.5F, 1.875F, -6.5F, 1, 2, 1, -0.125F, false));

		Pump = new RendererModel(this);
		Pump.setRotationPoint(0.0F, -1.0F, 0.0F);
		Controls.addChild(Pump);
		setRotationAngle(Pump, 0.0F, 2.1468F, 0.0F);
		

		Cylinder2 = new RendererModel(this);
		Cylinder2.setRotationPoint(0.0F, -16.8245F, -10.9546F);
		Pump.addChild(Cylinder2);
		setRotationAngle(Cylinder2, 0.2618F, 0.0F, 0.0F);
		Cylinder2.cubeList.add(new ModelBox(Cylinder2, 178, 149, -1.5F, 4.625F, -6.5F, 1, 4, 1, -0.15F, false));

		PumoHandle2 = new RendererModel(this);
		PumoHandle2.setRotationPoint(0.0F, -16.8245F, -10.9546F);
		Pump.addChild(PumoHandle2);
		setRotationAngle(PumoHandle2, 0.2618F, 0.0F, 0.0F);
		PumoHandle2.cubeList.add(new ModelBox(PumoHandle2, 32, 231, -1.5F, 3.25F, -6.5F, 1, 4, 1, -0.25F, false));
		PumoHandle2.cubeList.add(new ModelBox(PumoHandle2, 32, 231, -1.5F, 3.875F, -6.5F, 1, 1, 1, -0.125F, false));
		PumoHandle2.cubeList.add(new ModelBox(PumoHandle2, 32, 231, -1.5F, 2.0F, -6.5F, 1, 2, 1, -0.125F, false));

		Pump3 = new RendererModel(this);
		Pump3.setRotationPoint(0.0F, -1.0F, 0.0F);
		Controls.addChild(Pump3);
		setRotationAngle(Pump3, 0.0F, -2.042F, 0.0F);
		

		Cylinder8 = new RendererModel(this);
		Cylinder8.setRotationPoint(0.0F, -16.8245F, -10.9546F);
		Pump3.addChild(Cylinder8);
		setRotationAngle(Cylinder8, 0.2618F, 0.0F, 0.0F);
		Cylinder8.cubeList.add(new ModelBox(Cylinder8, 173, 143, -1.5F, 4.625F, -6.5F, 1, 4, 1, -0.15F, false));

		PumoHandle4 = new RendererModel(this);
		PumoHandle4.setRotationPoint(0.0F, -16.8245F, -10.9546F);
		Pump3.addChild(PumoHandle4);
		setRotationAngle(PumoHandle4, 0.2618F, 0.0F, 0.0F);
		PumoHandle4.cubeList.add(new ModelBox(PumoHandle4, 65, 105, -1.5F, 3.125F, -6.5F, 1, 4, 1, -0.25F, false));
		PumoHandle4.cubeList.add(new ModelBox(PumoHandle4, 65, 105, -1.5F, 3.75F, -6.5F, 1, 1, 1, -0.125F, false));
		PumoHandle4.cubeList.add(new ModelBox(PumoHandle4, 65, 105, -1.5F, 1.875F, -6.5F, 1, 2, 1, -0.125F, false));

		TimeRotor = new RendererModel(this);
		TimeRotor.setRotationPoint(0.0F, 0.0F, 0.0F);
		AllConsole.addChild(TimeRotor);
		

		Innards = new RendererModel(this);
		Innards.setRotationPoint(0.0F, 0.0F, 0.0F);
		TimeRotor.addChild(Innards);
		

		Tubes = new RendererModel(this);
		Tubes.setRotationPoint(0.0F, 0.0F, 0.0F);
		Innards.addChild(Tubes);
		Tubes.cubeList.add(new ModelBox(Tubes, 248, 222, -3.5F, -48.5F, -1.0F, 2, 32, 2, 0.0F, false));
		Tubes.cubeList.add(new ModelBox(Tubes, 248, 222, -1.0F, -48.5F, -3.5F, 2, 32, 2, 0.0F, false));
		Tubes.cubeList.add(new ModelBox(Tubes, 248, 222, -1.0F, -48.5F, 1.5F, 2, 32, 2, 0.0F, false));
		Tubes.cubeList.add(new ModelBox(Tubes, 248, 222, 1.5F, -48.5F, -1.0F, 2, 32, 2, 0.0F, false));

		Movable = new RendererModel(this);
		Movable.setRotationPoint(0.0F, 0.0F, 0.0F);
		Innards.addChild(Movable);
		

		Lower = new RendererModel(this);
		Lower.setRotationPoint(0.0F, -21.25F, 0.0F);
		Movable.addChild(Lower);
		Lower.cubeList.add(new ModelBox(Lower, 225, 236, 1.7F, -1.0F, -1.0F, 2, 1, 2, 0.01F, false));

		bone37 = new RendererModel(this);
		bone37.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower.addChild(bone37);
		setRotationAngle(bone37, 0.0F, -0.5236F, 0.0F);
		bone37.cubeList.add(new ModelBox(bone37, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.0F, false));

		bone38 = new RendererModel(this);
		bone38.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower.addChild(bone38);
		setRotationAngle(bone38, 0.0F, -1.0472F, 0.0F);
		bone38.cubeList.add(new ModelBox(bone38, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.01F, false));

		bone39 = new RendererModel(this);
		bone39.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower.addChild(bone39);
		setRotationAngle(bone39, 0.0F, -1.5708F, 0.0F);
		bone39.cubeList.add(new ModelBox(bone39, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.0F, false));

		bone40 = new RendererModel(this);
		bone40.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower.addChild(bone40);
		setRotationAngle(bone40, 0.0F, -2.0944F, 0.0F);
		bone40.cubeList.add(new ModelBox(bone40, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.01F, false));

		bone41 = new RendererModel(this);
		bone41.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower.addChild(bone41);
		setRotationAngle(bone41, 0.0F, -2.618F, 0.0F);
		bone41.cubeList.add(new ModelBox(bone41, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.0F, false));

		bone42 = new RendererModel(this);
		bone42.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower.addChild(bone42);
		setRotationAngle(bone42, 0.0F, 3.1416F, 0.0F);
		bone42.cubeList.add(new ModelBox(bone42, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.01F, false));

		bone43 = new RendererModel(this);
		bone43.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower.addChild(bone43);
		setRotationAngle(bone43, 0.0F, 2.618F, 0.0F);
		bone43.cubeList.add(new ModelBox(bone43, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.0F, false));

		bone44 = new RendererModel(this);
		bone44.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower.addChild(bone44);
		setRotationAngle(bone44, 0.0F, 2.0944F, 0.0F);
		bone44.cubeList.add(new ModelBox(bone44, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.01F, false));

		bone45 = new RendererModel(this);
		bone45.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower.addChild(bone45);
		setRotationAngle(bone45, 0.0F, 1.5708F, 0.0F);
		bone45.cubeList.add(new ModelBox(bone45, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.0F, false));

		bone46 = new RendererModel(this);
		bone46.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower.addChild(bone46);
		setRotationAngle(bone46, 0.0F, 1.0472F, 0.0F);
		bone46.cubeList.add(new ModelBox(bone46, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.01F, false));

		bone47 = new RendererModel(this);
		bone47.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower.addChild(bone47);
		setRotationAngle(bone47, 0.0F, 0.5236F, 0.0F);
		bone47.cubeList.add(new ModelBox(bone47, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.0F, false));

		Lower2 = new RendererModel(this);
		Lower2.setRotationPoint(0.0F, -1.5F, 0.0F);
		Lower.addChild(Lower2);
		Lower2.cubeList.add(new ModelBox(Lower2, 225, 236, 1.7F, -1.0F, -1.0F, 2, 1, 2, 0.01F, false));

		bone48 = new RendererModel(this);
		bone48.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower2.addChild(bone48);
		setRotationAngle(bone48, 0.0F, -0.5236F, 0.0F);
		bone48.cubeList.add(new ModelBox(bone48, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.0F, false));

		bone49 = new RendererModel(this);
		bone49.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower2.addChild(bone49);
		setRotationAngle(bone49, 0.0F, -1.0472F, 0.0F);
		bone49.cubeList.add(new ModelBox(bone49, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.01F, false));

		bone50 = new RendererModel(this);
		bone50.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower2.addChild(bone50);
		setRotationAngle(bone50, 0.0F, -1.5708F, 0.0F);
		bone50.cubeList.add(new ModelBox(bone50, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.0F, false));

		bone51 = new RendererModel(this);
		bone51.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower2.addChild(bone51);
		setRotationAngle(bone51, 0.0F, -2.0944F, 0.0F);
		bone51.cubeList.add(new ModelBox(bone51, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.01F, false));

		bone52 = new RendererModel(this);
		bone52.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower2.addChild(bone52);
		setRotationAngle(bone52, 0.0F, -2.618F, 0.0F);
		bone52.cubeList.add(new ModelBox(bone52, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.0F, false));

		bone53 = new RendererModel(this);
		bone53.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower2.addChild(bone53);
		setRotationAngle(bone53, 0.0F, 3.1416F, 0.0F);
		bone53.cubeList.add(new ModelBox(bone53, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.01F, false));

		bone54 = new RendererModel(this);
		bone54.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower2.addChild(bone54);
		setRotationAngle(bone54, 0.0F, 2.618F, 0.0F);
		bone54.cubeList.add(new ModelBox(bone54, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.0F, false));

		bone55 = new RendererModel(this);
		bone55.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower2.addChild(bone55);
		setRotationAngle(bone55, 0.0F, 2.0944F, 0.0F);
		bone55.cubeList.add(new ModelBox(bone55, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.01F, false));

		bone56 = new RendererModel(this);
		bone56.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower2.addChild(bone56);
		setRotationAngle(bone56, 0.0F, 1.5708F, 0.0F);
		bone56.cubeList.add(new ModelBox(bone56, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.0F, false));

		bone57 = new RendererModel(this);
		bone57.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower2.addChild(bone57);
		setRotationAngle(bone57, 0.0F, 1.0472F, 0.0F);
		bone57.cubeList.add(new ModelBox(bone57, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.01F, false));

		bone58 = new RendererModel(this);
		bone58.setRotationPoint(0.0F, -0.125F, 0.0F);
		Lower2.addChild(bone58);
		setRotationAngle(bone58, 0.0F, 0.5236F, 0.0F);
		bone58.cubeList.add(new ModelBox(bone58, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.0F, false));

		Upper = new RendererModel(this);
		Upper.setRotationPoint(0.0F, -44.0F, 0.0F);
		Movable.addChild(Upper);
		Upper.cubeList.add(new ModelBox(Upper, 225, 236, 1.7F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));

		bone59 = new RendererModel(this);
		bone59.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper.addChild(bone59);
		setRotationAngle(bone59, 0.0F, -0.5236F, 0.0F);
		bone59.cubeList.add(new ModelBox(bone59, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.01F, false));

		bone60 = new RendererModel(this);
		bone60.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper.addChild(bone60);
		setRotationAngle(bone60, 0.0F, -1.0472F, 0.0F);
		bone60.cubeList.add(new ModelBox(bone60, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.0F, false));

		bone61 = new RendererModel(this);
		bone61.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper.addChild(bone61);
		setRotationAngle(bone61, 0.0F, -1.5708F, 0.0F);
		bone61.cubeList.add(new ModelBox(bone61, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.01F, false));

		bone62 = new RendererModel(this);
		bone62.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper.addChild(bone62);
		setRotationAngle(bone62, 0.0F, -2.0944F, 0.0F);
		bone62.cubeList.add(new ModelBox(bone62, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.0F, false));

		bone63 = new RendererModel(this);
		bone63.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper.addChild(bone63);
		setRotationAngle(bone63, 0.0F, -2.618F, 0.0F);
		bone63.cubeList.add(new ModelBox(bone63, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.01F, false));

		bone64 = new RendererModel(this);
		bone64.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper.addChild(bone64);
		setRotationAngle(bone64, 0.0F, 3.1416F, 0.0F);
		bone64.cubeList.add(new ModelBox(bone64, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.0F, false));

		bone65 = new RendererModel(this);
		bone65.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper.addChild(bone65);
		setRotationAngle(bone65, 0.0F, 2.618F, 0.0F);
		bone65.cubeList.add(new ModelBox(bone65, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.01F, false));

		bone66 = new RendererModel(this);
		bone66.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper.addChild(bone66);
		setRotationAngle(bone66, 0.0F, 2.0944F, 0.0F);
		bone66.cubeList.add(new ModelBox(bone66, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.0F, false));

		bone67 = new RendererModel(this);
		bone67.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper.addChild(bone67);
		setRotationAngle(bone67, 0.0F, 1.5708F, 0.0F);
		bone67.cubeList.add(new ModelBox(bone67, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.01F, false));

		bone68 = new RendererModel(this);
		bone68.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper.addChild(bone68);
		setRotationAngle(bone68, 0.0F, 1.0472F, 0.0F);
		bone68.cubeList.add(new ModelBox(bone68, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.0F, false));

		bone69 = new RendererModel(this);
		bone69.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper.addChild(bone69);
		setRotationAngle(bone69, 0.0F, 0.5236F, 0.0F);
		bone69.cubeList.add(new ModelBox(bone69, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.01F, false));

		Upper2 = new RendererModel(this);
		Upper2.setRotationPoint(0.0F, -1.5F, 0.0F);
		Upper.addChild(Upper2);
		Upper2.cubeList.add(new ModelBox(Upper2, 225, 236, 1.7F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));

		bone70 = new RendererModel(this);
		bone70.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper2.addChild(bone70);
		setRotationAngle(bone70, 0.0F, -0.5236F, 0.0F);
		bone70.cubeList.add(new ModelBox(bone70, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.01F, false));

		bone71 = new RendererModel(this);
		bone71.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper2.addChild(bone71);
		setRotationAngle(bone71, 0.0F, -1.0472F, 0.0F);
		bone71.cubeList.add(new ModelBox(bone71, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.0F, false));

		bone72 = new RendererModel(this);
		bone72.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper2.addChild(bone72);
		setRotationAngle(bone72, 0.0F, -1.5708F, 0.0F);
		bone72.cubeList.add(new ModelBox(bone72, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.01F, false));

		bone73 = new RendererModel(this);
		bone73.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper2.addChild(bone73);
		setRotationAngle(bone73, 0.0F, -2.0944F, 0.0F);
		bone73.cubeList.add(new ModelBox(bone73, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.0F, false));

		bone74 = new RendererModel(this);
		bone74.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper2.addChild(bone74);
		setRotationAngle(bone74, 0.0F, -2.618F, 0.0F);
		bone74.cubeList.add(new ModelBox(bone74, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.01F, false));

		bone75 = new RendererModel(this);
		bone75.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper2.addChild(bone75);
		setRotationAngle(bone75, 0.0F, 3.1416F, 0.0F);
		bone75.cubeList.add(new ModelBox(bone75, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.0F, false));

		bone76 = new RendererModel(this);
		bone76.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper2.addChild(bone76);
		setRotationAngle(bone76, 0.0F, 2.618F, 0.0F);
		bone76.cubeList.add(new ModelBox(bone76, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.01F, false));

		bone77 = new RendererModel(this);
		bone77.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper2.addChild(bone77);
		setRotationAngle(bone77, 0.0F, 2.0944F, 0.0F);
		bone77.cubeList.add(new ModelBox(bone77, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.0F, false));

		bone78 = new RendererModel(this);
		bone78.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper2.addChild(bone78);
		setRotationAngle(bone78, 0.0F, 1.5708F, 0.0F);
		bone78.cubeList.add(new ModelBox(bone78, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.01F, false));

		bone79 = new RendererModel(this);
		bone79.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper2.addChild(bone79);
		setRotationAngle(bone79, 0.0F, 1.0472F, 0.0F);
		bone79.cubeList.add(new ModelBox(bone79, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.0F, false));

		bone80 = new RendererModel(this);
		bone80.setRotationPoint(0.0F, -0.125F, 0.0F);
		Upper2.addChild(bone80);
		setRotationAngle(bone80, 0.0F, 0.5236F, 0.0F);
		bone80.cubeList.add(new ModelBox(bone80, 225, 236, 1.7F, -0.875F, -1.0F, 2, 1, 2, 0.01F, false));

		Console = new RendererModel(this);
		Console.setRotationPoint(0.0F, 0.0F, 0.0F);
		AllConsole.addChild(Console);
		

		LighterCoral = new RendererModel(this);
		LighterCoral.setRotationPoint(0.0F, -1.0F, 0.0F);
		Console.addChild(LighterCoral);
		

		Block1 = new RendererModel(this);
		Block1.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block1);
		Block1.cubeList.add(new ModelBox(Block1, 95, 219, -4.0F, -11.5F, -14.935F, 8, 2, 3, 0.01F, false));
		Block1.cubeList.add(new ModelBox(Block1, 95, 219, -4.0F, -11.75F, -14.81F, 8, 2, 2, 0.0F, false));

		Block2 = new RendererModel(this);
		Block2.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block2);
		setRotationAngle(Block2, 0.0F, 0.5236F, 0.0F);
		Block2.cubeList.add(new ModelBox(Block2, 95, 219, -4.0F, -11.5F, -14.935F, 8, 2, 3, 0.0F, false));
		Block2.cubeList.add(new ModelBox(Block2, 95, 219, -4.0F, -11.75F, -14.81F, 8, 2, 2, 0.01F, false));

		Block3 = new RendererModel(this);
		Block3.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block3);
		setRotationAngle(Block3, 0.0F, -0.5236F, 0.0F);
		Block3.cubeList.add(new ModelBox(Block3, 95, 219, -4.0F, -11.5F, -14.935F, 8, 2, 3, 0.0F, false));
		Block3.cubeList.add(new ModelBox(Block3, 95, 219, -4.0F, -11.75F, -14.81F, 8, 2, 2, 0.01F, false));

		Block4 = new RendererModel(this);
		Block4.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block4);
		setRotationAngle(Block4, 0.0F, -1.0472F, 0.0F);
		Block4.cubeList.add(new ModelBox(Block4, 95, 219, -4.0F, -11.5F, -14.935F, 8, 2, 3, 0.01F, false));
		Block4.cubeList.add(new ModelBox(Block4, 95, 219, -4.0F, -11.75F, -14.81F, 8, 2, 2, 0.0F, false));

		Block5 = new RendererModel(this);
		Block5.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block5);
		setRotationAngle(Block5, 0.0F, -1.5708F, 0.0F);
		Block5.cubeList.add(new ModelBox(Block5, 95, 219, -4.0F, -11.5F, -14.935F, 8, 2, 3, 0.0F, false));
		Block5.cubeList.add(new ModelBox(Block5, 95, 219, -4.0F, -11.75F, -14.81F, 8, 2, 2, 0.01F, false));

		Block6 = new RendererModel(this);
		Block6.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block6);
		setRotationAngle(Block6, 0.0F, -2.0944F, 0.0F);
		Block6.cubeList.add(new ModelBox(Block6, 95, 219, -4.0F, -11.5F, -14.935F, 8, 2, 3, 0.01F, false));
		Block6.cubeList.add(new ModelBox(Block6, 95, 219, -4.0F, -11.75F, -14.81F, 8, 2, 2, 0.0F, false));

		Block7 = new RendererModel(this);
		Block7.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block7);
		setRotationAngle(Block7, 0.0F, -2.618F, 0.0F);
		Block7.cubeList.add(new ModelBox(Block7, 95, 219, -4.0F, -11.5F, -14.935F, 8, 2, 3, 0.0F, false));
		Block7.cubeList.add(new ModelBox(Block7, 95, 219, -4.0F, -11.75F, -14.81F, 8, 2, 2, 0.01F, false));

		Block8 = new RendererModel(this);
		Block8.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block8);
		setRotationAngle(Block8, 0.0F, 3.1416F, 0.0F);
		Block8.cubeList.add(new ModelBox(Block8, 95, 219, -4.0F, -11.5F, -14.935F, 8, 2, 3, 0.01F, false));
		Block8.cubeList.add(new ModelBox(Block8, 95, 219, -4.0F, -11.75F, -14.81F, 8, 2, 2, 0.0F, false));

		Block9 = new RendererModel(this);
		Block9.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block9);
		setRotationAngle(Block9, 0.0F, 2.618F, 0.0F);
		Block9.cubeList.add(new ModelBox(Block9, 95, 219, -4.0F, -11.5F, -14.935F, 8, 2, 3, 0.0F, false));
		Block9.cubeList.add(new ModelBox(Block9, 95, 219, -4.0F, -11.75F, -14.81F, 8, 2, 2, 0.01F, false));

		Block10 = new RendererModel(this);
		Block10.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block10);
		setRotationAngle(Block10, 0.0F, 2.0944F, 0.0F);
		Block10.cubeList.add(new ModelBox(Block10, 95, 219, -4.0F, -11.5F, -14.935F, 8, 2, 3, 0.01F, false));
		Block10.cubeList.add(new ModelBox(Block10, 95, 219, -4.0F, -11.75F, -14.81F, 8, 2, 2, 0.0F, false));

		Block11 = new RendererModel(this);
		Block11.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block11);
		setRotationAngle(Block11, 0.0F, 1.5708F, 0.0F);
		Block11.cubeList.add(new ModelBox(Block11, 95, 219, -4.0F, -11.5F, -14.935F, 8, 2, 3, 0.0F, false));
		Block11.cubeList.add(new ModelBox(Block11, 95, 219, -4.0F, -11.75F, -14.81F, 8, 2, 2, 0.01F, false));

		Block12 = new RendererModel(this);
		Block12.setRotationPoint(0.0F, 0.0F, 0.0F);
		LighterCoral.addChild(Block12);
		setRotationAngle(Block12, 0.0F, 1.0472F, 0.0F);
		Block12.cubeList.add(new ModelBox(Block12, 95, 219, -4.0F, -11.5F, -14.935F, 8, 2, 3, 0.01F, false));
		Block12.cubeList.add(new ModelBox(Block12, 95, 219, -4.0F, -11.75F, -14.81F, 8, 2, 2, 0.0F, false));

		Coral = new RendererModel(this);
		Coral.setRotationPoint(0.0F, -0.5F, 0.0F);
		Console.addChild(Coral);
		

		Edge5 = new RendererModel(this);
		Edge5.setRotationPoint(0.0F, 0.0F, 0.0F);
		Coral.addChild(Edge5);
		

		Cube20 = new RendererModel(this);
		Cube20.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge5.addChild(Cube20);
		setRotationAngle(Cube20, 0.6981F, 0.0F, 0.0F);
		Cube20.cubeList.add(new ModelBox(Cube20, 163, 227, -1.5F, -17.1696F, -5.7406F, 3, 2, 2, 0.005F, false));

		Cube21 = new RendererModel(this);
		Cube21.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge5.addChild(Cube21);
		setRotationAngle(Cube21, -0.5236F, 0.0F, 0.0F);
		Cube21.cubeList.add(new ModelBox(Cube21, 163, 227, -1.5F, -5.076F, -19.5975F, 3, 2, 2, 0.005F, false));

		Cube22 = new RendererModel(this);
		Cube22.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge5.addChild(Cube22);
		setRotationAngle(Cube22, -1.0472F, 0.0F, 0.0F);
		Cube22.cubeList.add(new ModelBox(Cube22, 163, 227, -1.5F, 2.4028F, -19.5099F, 3, 3, 2, 0.0F, false));

		Cube23 = new RendererModel(this);
		Cube23.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge5.addChild(Cube23);
		setRotationAngle(Cube23, -1.309F, 0.0F, 0.0F);
		Cube23.cubeList.add(new ModelBox(Cube23, 163, 227, -1.5F, 2.3705F, -18.2233F, 3, 5, 2, 0.005F, false));

		Cube24 = new RendererModel(this);
		Cube24.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge5.addChild(Cube24);
		setRotationAngle(Cube24, -1.3963F, 0.0F, 0.0F);
		Cube24.cubeList.add(new ModelBox(Cube24, 163, 227, -1.5F, 0.9497F, -17.9473F, 3, 3, 2, 0.0F, false));

		Cube25 = new RendererModel(this);
		Cube25.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge5.addChild(Cube25);
		setRotationAngle(Cube25, 0.7854F, 0.0F, 0.0F);
		Cube25.cubeList.add(new ModelBox(Cube25, 163, 227, -1.5F, -15.6122F, -4.3967F, 3, 2, 2, 0.0F, false));

		Cube26 = new RendererModel(this);
		Cube26.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge5.addChild(Cube26);
		setRotationAngle(Cube26, 0.9599F, 0.0F, 0.0F);
		Cube26.cubeList.add(new ModelBox(Cube26, 163, 227, -1.5F, -14.1688F, -1.9661F, 3, 5, 4, 0.005F, false));

		Cube27 = new RendererModel(this);
		Cube27.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge5.addChild(Cube27);
		setRotationAngle(Cube27, 1.1345F, 0.0F, 0.0F);
		Cube27.cubeList.add(new ModelBox(Cube27, 163, 227, -1.5F, -9.3709F, -0.3441F, 3, 5, 4, 0.0F, false));
		Cube27.cubeList.add(new ModelBox(Cube27, 146, 217, -1.5F, -5.8084F, -5.3441F, 3, 2, 5, 0.005F, false));

		Cube37 = new RendererModel(this);
		Cube37.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge5.addChild(Cube37);
		Cube37.cubeList.add(new ModelBox(Cube37, 163, 227, -1.5F, -12.4626F, -15.4339F, 3, 3, 2, 0.0F, false));

		Edge2 = new RendererModel(this);
		Edge2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Coral.addChild(Edge2);
		setRotationAngle(Edge2, 0.0F, -1.0472F, 0.0F);
		

		Cube2 = new RendererModel(this);
		Cube2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge2.addChild(Cube2);
		setRotationAngle(Cube2, 0.6981F, 0.0F, 0.0F);
		Cube2.cubeList.add(new ModelBox(Cube2, 163, 227, -1.5F, -17.1696F, -5.7406F, 3, 2, 2, 0.005F, false));

		Cube3 = new RendererModel(this);
		Cube3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge2.addChild(Cube3);
		setRotationAngle(Cube3, -0.5236F, 0.0F, 0.0F);
		Cube3.cubeList.add(new ModelBox(Cube3, 163, 227, -1.5F, -5.076F, -19.5975F, 3, 2, 2, 0.005F, false));

		Cube4 = new RendererModel(this);
		Cube4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge2.addChild(Cube4);
		setRotationAngle(Cube4, -1.0472F, 0.0F, 0.0F);
		Cube4.cubeList.add(new ModelBox(Cube4, 163, 227, -1.5F, 2.4028F, -19.5099F, 3, 3, 2, 0.0F, false));

		Cube5 = new RendererModel(this);
		Cube5.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge2.addChild(Cube5);
		setRotationAngle(Cube5, -1.309F, 0.0F, 0.0F);
		Cube5.cubeList.add(new ModelBox(Cube5, 163, 227, -1.5F, 2.3705F, -18.2233F, 3, 5, 2, 0.005F, false));

		Cube6 = new RendererModel(this);
		Cube6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge2.addChild(Cube6);
		setRotationAngle(Cube6, -1.3963F, 0.0F, 0.0F);
		Cube6.cubeList.add(new ModelBox(Cube6, 163, 227, -1.5F, 0.9497F, -17.9473F, 3, 3, 2, 0.0F, false));

		Cube7 = new RendererModel(this);
		Cube7.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge2.addChild(Cube7);
		setRotationAngle(Cube7, 0.7854F, 0.0F, 0.0F);
		Cube7.cubeList.add(new ModelBox(Cube7, 163, 227, -1.5F, -15.6122F, -4.3967F, 3, 2, 2, 0.0F, false));

		Cube8 = new RendererModel(this);
		Cube8.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge2.addChild(Cube8);
		setRotationAngle(Cube8, 0.9599F, 0.0F, 0.0F);
		Cube8.cubeList.add(new ModelBox(Cube8, 163, 227, -1.5F, -14.1688F, -1.9661F, 3, 5, 4, 0.005F, false));

		Cube9 = new RendererModel(this);
		Cube9.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge2.addChild(Cube9);
		setRotationAngle(Cube9, 1.1345F, 0.0F, 0.0F);
		Cube9.cubeList.add(new ModelBox(Cube9, 163, 227, -1.5F, -9.3709F, -0.3441F, 3, 5, 4, 0.0F, false));
		Cube9.cubeList.add(new ModelBox(Cube9, 146, 217, -1.5F, -5.8084F, -5.3441F, 3, 2, 5, 0.005F, false));

		Cube10 = new RendererModel(this);
		Cube10.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge2.addChild(Cube10);
		Cube10.cubeList.add(new ModelBox(Cube10, 163, 227, -1.5F, -12.4626F, -15.4339F, 3, 3, 2, 0.0F, false));

		Edge3 = new RendererModel(this);
		Edge3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Coral.addChild(Edge3);
		setRotationAngle(Edge3, 0.0F, -2.0944F, 0.0F);
		

		Cube11 = new RendererModel(this);
		Cube11.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge3.addChild(Cube11);
		setRotationAngle(Cube11, 0.6981F, 0.0F, 0.0F);
		Cube11.cubeList.add(new ModelBox(Cube11, 163, 227, -1.5F, -17.1696F, -5.7406F, 3, 2, 2, 0.005F, false));

		Cube12 = new RendererModel(this);
		Cube12.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge3.addChild(Cube12);
		setRotationAngle(Cube12, -0.5236F, 0.0F, 0.0F);
		Cube12.cubeList.add(new ModelBox(Cube12, 163, 227, -1.5F, -5.076F, -19.5975F, 3, 2, 2, 0.005F, false));

		Cube13 = new RendererModel(this);
		Cube13.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge3.addChild(Cube13);
		setRotationAngle(Cube13, -1.0472F, 0.0F, 0.0F);
		Cube13.cubeList.add(new ModelBox(Cube13, 163, 227, -1.5F, 2.4028F, -19.5099F, 3, 3, 2, 0.0F, false));

		Cube14 = new RendererModel(this);
		Cube14.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge3.addChild(Cube14);
		setRotationAngle(Cube14, -1.309F, 0.0F, 0.0F);
		Cube14.cubeList.add(new ModelBox(Cube14, 163, 227, -1.5F, 2.3705F, -18.2233F, 3, 5, 2, 0.005F, false));

		Cube15 = new RendererModel(this);
		Cube15.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge3.addChild(Cube15);
		setRotationAngle(Cube15, -1.3963F, 0.0F, 0.0F);
		Cube15.cubeList.add(new ModelBox(Cube15, 163, 227, -1.5F, 0.9497F, -17.9473F, 3, 3, 2, 0.0F, false));

		Cube16 = new RendererModel(this);
		Cube16.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge3.addChild(Cube16);
		setRotationAngle(Cube16, 0.7854F, 0.0F, 0.0F);
		Cube16.cubeList.add(new ModelBox(Cube16, 163, 227, -1.5F, -15.6122F, -4.3967F, 3, 2, 2, 0.0F, false));

		Cube17 = new RendererModel(this);
		Cube17.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge3.addChild(Cube17);
		setRotationAngle(Cube17, 0.9599F, 0.0F, 0.0F);
		Cube17.cubeList.add(new ModelBox(Cube17, 163, 227, -1.5F, -14.1688F, -1.9661F, 3, 10, 4, 0.005F, false));

		Cube18 = new RendererModel(this);
		Cube18.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge3.addChild(Cube18);
		setRotationAngle(Cube18, 1.1345F, 0.0F, 0.0F);
		Cube18.cubeList.add(new ModelBox(Cube18, 163, 227, -1.5F, -9.3709F, 3.6559F, 3, 5, 0, 0.0F, false));
		Cube18.cubeList.add(new ModelBox(Cube18, 146, 217, -1.5F, -5.8084F, -5.3441F, 3, 2, 5, 0.005F, false));

		Cube19 = new RendererModel(this);
		Cube19.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge3.addChild(Cube19);
		Cube19.cubeList.add(new ModelBox(Cube19, 163, 227, -1.5F, -12.4626F, -15.4339F, 3, 3, 2, 0.0F, false));

		Edge4 = new RendererModel(this);
		Edge4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Coral.addChild(Edge4);
		setRotationAngle(Edge4, 0.0F, 3.1416F, 0.0F);
		

		Cube28 = new RendererModel(this);
		Cube28.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge4.addChild(Cube28);
		setRotationAngle(Cube28, 0.6981F, 0.0F, 0.0F);
		Cube28.cubeList.add(new ModelBox(Cube28, 163, 227, -1.5F, -17.1696F, -5.7406F, 3, 2, 2, 0.005F, false));

		Cube29 = new RendererModel(this);
		Cube29.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge4.addChild(Cube29);
		setRotationAngle(Cube29, -0.5236F, 0.0F, 0.0F);
		Cube29.cubeList.add(new ModelBox(Cube29, 163, 227, -1.5F, -5.076F, -19.5975F, 3, 2, 2, 0.005F, false));

		Cube30 = new RendererModel(this);
		Cube30.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge4.addChild(Cube30);
		setRotationAngle(Cube30, -1.0472F, 0.0F, 0.0F);
		Cube30.cubeList.add(new ModelBox(Cube30, 163, 227, -1.5F, 2.4028F, -19.5099F, 3, 3, 2, 0.0F, false));

		Cube31 = new RendererModel(this);
		Cube31.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge4.addChild(Cube31);
		setRotationAngle(Cube31, -1.309F, 0.0F, 0.0F);
		Cube31.cubeList.add(new ModelBox(Cube31, 163, 227, -1.5F, 2.3705F, -18.2233F, 3, 5, 2, 0.005F, false));

		Cube32 = new RendererModel(this);
		Cube32.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge4.addChild(Cube32);
		setRotationAngle(Cube32, -1.3963F, 0.0F, 0.0F);
		Cube32.cubeList.add(new ModelBox(Cube32, 163, 227, -1.5F, 0.9497F, -17.9473F, 3, 3, 2, 0.0F, false));

		Cube33 = new RendererModel(this);
		Cube33.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge4.addChild(Cube33);
		setRotationAngle(Cube33, 0.7854F, 0.0F, 0.0F);
		Cube33.cubeList.add(new ModelBox(Cube33, 163, 227, -1.5F, -15.6122F, -4.3967F, 3, 2, 2, 0.0F, false));

		Cube34 = new RendererModel(this);
		Cube34.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge4.addChild(Cube34);
		setRotationAngle(Cube34, 0.9599F, 0.0F, 0.0F);
		Cube34.cubeList.add(new ModelBox(Cube34, 163, 227, -1.5F, -14.1688F, -1.9661F, 3, 5, 4, 0.005F, false));

		Cube35 = new RendererModel(this);
		Cube35.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge4.addChild(Cube35);
		setRotationAngle(Cube35, 1.1345F, 0.0F, 0.0F);
		Cube35.cubeList.add(new ModelBox(Cube35, 163, 227, -1.5F, -9.3709F, -0.3441F, 3, 5, 4, 0.0F, false));
		Cube35.cubeList.add(new ModelBox(Cube35, 146, 217, -1.5F, -5.8084F, -5.3441F, 3, 2, 5, 0.005F, false));

		Cube36 = new RendererModel(this);
		Cube36.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge4.addChild(Cube36);
		Cube36.cubeList.add(new ModelBox(Cube36, 163, 227, -1.5F, -12.4626F, -15.4339F, 3, 3, 2, 0.0F, false));

		Edge6 = new RendererModel(this);
		Edge6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Coral.addChild(Edge6);
		setRotationAngle(Edge6, 0.0F, 2.0944F, 0.0F);
		

		Cube38 = new RendererModel(this);
		Cube38.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge6.addChild(Cube38);
		setRotationAngle(Cube38, 0.6981F, 0.0F, 0.0F);
		Cube38.cubeList.add(new ModelBox(Cube38, 163, 227, -1.5F, -17.1696F, -5.7406F, 3, 2, 2, 0.005F, false));

		Cube39 = new RendererModel(this);
		Cube39.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge6.addChild(Cube39);
		setRotationAngle(Cube39, -0.5236F, 0.0F, 0.0F);
		Cube39.cubeList.add(new ModelBox(Cube39, 163, 227, -1.5F, -5.076F, -19.5975F, 3, 2, 2, 0.005F, false));

		Cube40 = new RendererModel(this);
		Cube40.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge6.addChild(Cube40);
		setRotationAngle(Cube40, -1.0472F, 0.0F, 0.0F);
		Cube40.cubeList.add(new ModelBox(Cube40, 163, 227, -1.5F, 2.4028F, -19.5099F, 3, 3, 2, 0.0F, false));

		Cube41 = new RendererModel(this);
		Cube41.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge6.addChild(Cube41);
		setRotationAngle(Cube41, -1.309F, 0.0F, 0.0F);
		Cube41.cubeList.add(new ModelBox(Cube41, 163, 227, -1.5F, 2.3705F, -18.2233F, 3, 5, 2, 0.005F, false));

		Cube42 = new RendererModel(this);
		Cube42.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge6.addChild(Cube42);
		setRotationAngle(Cube42, -1.3963F, 0.0F, 0.0F);
		Cube42.cubeList.add(new ModelBox(Cube42, 163, 227, -1.5F, 0.9497F, -17.9473F, 3, 3, 2, 0.0F, false));

		Cube43 = new RendererModel(this);
		Cube43.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge6.addChild(Cube43);
		setRotationAngle(Cube43, 0.7854F, 0.0F, 0.0F);
		Cube43.cubeList.add(new ModelBox(Cube43, 163, 227, -1.5F, -15.6122F, -4.3967F, 3, 2, 2, 0.0F, false));

		Cube44 = new RendererModel(this);
		Cube44.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge6.addChild(Cube44);
		setRotationAngle(Cube44, 0.9599F, 0.0F, 0.0F);
		Cube44.cubeList.add(new ModelBox(Cube44, 163, 227, -1.5F, -14.1688F, -1.9661F, 3, 5, 4, 0.005F, false));

		Cube45 = new RendererModel(this);
		Cube45.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge6.addChild(Cube45);
		setRotationAngle(Cube45, 1.1345F, 0.0F, 0.0F);
		Cube45.cubeList.add(new ModelBox(Cube45, 163, 227, -1.5F, -9.3709F, -0.3441F, 3, 5, 4, 0.0F, false));
		Cube45.cubeList.add(new ModelBox(Cube45, 146, 217, -1.5F, -5.8084F, -5.3441F, 3, 2, 5, 0.005F, false));

		Cube46 = new RendererModel(this);
		Cube46.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge6.addChild(Cube46);
		Cube46.cubeList.add(new ModelBox(Cube46, 163, 227, -1.5F, -12.4626F, -15.4339F, 3, 3, 2, 0.0F, false));

		Edge7 = new RendererModel(this);
		Edge7.setRotationPoint(0.0F, 0.0F, 0.0F);
		Coral.addChild(Edge7);
		setRotationAngle(Edge7, 0.0F, 1.0472F, 0.0F);
		

		Cube47 = new RendererModel(this);
		Cube47.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge7.addChild(Cube47);
		setRotationAngle(Cube47, 0.6981F, 0.0F, 0.0F);
		Cube47.cubeList.add(new ModelBox(Cube47, 163, 227, -1.5F, -17.1696F, -5.7406F, 3, 2, 2, 0.005F, false));

		Cube48 = new RendererModel(this);
		Cube48.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge7.addChild(Cube48);
		setRotationAngle(Cube48, -0.5236F, 0.0F, 0.0F);
		Cube48.cubeList.add(new ModelBox(Cube48, 163, 227, -1.5F, -5.076F, -19.5975F, 3, 2, 2, 0.005F, false));

		Cube49 = new RendererModel(this);
		Cube49.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge7.addChild(Cube49);
		setRotationAngle(Cube49, -1.0472F, 0.0F, 0.0F);
		Cube49.cubeList.add(new ModelBox(Cube49, 163, 227, -1.5F, 2.4028F, -19.5099F, 3, 3, 2, 0.0F, false));

		Cube50 = new RendererModel(this);
		Cube50.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge7.addChild(Cube50);
		setRotationAngle(Cube50, -1.309F, 0.0F, 0.0F);
		Cube50.cubeList.add(new ModelBox(Cube50, 163, 227, -1.5F, 2.3705F, -18.2233F, 3, 5, 2, 0.005F, false));

		Cube51 = new RendererModel(this);
		Cube51.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge7.addChild(Cube51);
		setRotationAngle(Cube51, -1.3963F, 0.0F, 0.0F);
		Cube51.cubeList.add(new ModelBox(Cube51, 163, 227, -1.5F, 0.9497F, -17.9473F, 3, 3, 2, 0.0F, false));

		Cube52 = new RendererModel(this);
		Cube52.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge7.addChild(Cube52);
		setRotationAngle(Cube52, 0.7854F, 0.0F, 0.0F);
		Cube52.cubeList.add(new ModelBox(Cube52, 163, 227, -1.5F, -15.6122F, -4.3967F, 3, 2, 2, 0.0F, false));

		Cube53 = new RendererModel(this);
		Cube53.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge7.addChild(Cube53);
		setRotationAngle(Cube53, 0.9599F, 0.0F, 0.0F);
		Cube53.cubeList.add(new ModelBox(Cube53, 163, 227, -1.5F, -14.1688F, -1.9661F, 3, 5, 4, 0.005F, false));

		Cube54 = new RendererModel(this);
		Cube54.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge7.addChild(Cube54);
		setRotationAngle(Cube54, 1.1345F, 0.0F, 0.0F);
		Cube54.cubeList.add(new ModelBox(Cube54, 163, 227, -1.5F, -9.3709F, -0.3441F, 3, 5, 4, 0.0F, false));
		Cube54.cubeList.add(new ModelBox(Cube54, 146, 217, -1.5F, -5.8084F, -5.3441F, 3, 2, 5, 0.005F, false));

		Cube66 = new RendererModel(this);
		Cube66.setRotationPoint(0.0F, 0.0F, 0.0F);
		Edge7.addChild(Cube66);
		Cube66.cubeList.add(new ModelBox(Cube66, 163, 227, -1.5F, -12.4626F, -15.4339F, 3, 3, 2, 0.0F, false));

		UpperRing = new RendererModel(this);
		UpperRing.setRotationPoint(0.0F, 0.0F, 0.0F);
		Console.addChild(UpperRing);
		

		Cube1 = new RendererModel(this);
		Cube1.setRotationPoint(0.0F, 0.0F, 0.0F);
		UpperRing.addChild(Cube1);
		Cube1.cubeList.add(new ModelBox(Cube1, 97, 221, -6.16F, -18.5F, -2.0F, 2, 2, 4, 0.01F, false));
		Cube1.cubeList.add(new ModelBox(Cube1, 97, 221, -6.16F, -21.0F, -2.0F, 2, 1, 4, 0.01F, false));
		Cube1.cubeList.add(new ModelBox(Cube1, 97, 221, -5.66F, -20.25F, -2.0F, 2, 2, 4, -0.24F, false));
		Cube1.cubeList.add(new ModelBox(Cube1, 97, 221, -5.66F, -51.25F, -2.0F, 2, 5, 4, -0.24F, false));
		Cube1.cubeList.add(new ModelBox(Cube1, 97, 221, -6.16F, -49.75F, -2.0F, 6, 2, 4, 0.0F, false));
		Cube1.cubeList.add(new ModelBox(Cube1, 97, 221, -7.66F, -52.875F, -2.5F, 6, 2, 5, 0.0F, false));
		Cube1.cubeList.add(new ModelBox(Cube1, 97, 221, -9.2019F, -80.7838F, -3.0F, 2, 24, 6, 0.0F, false));
		Cube1.cubeList.add(new ModelBox(Cube1, 97, 221, -6.16F, -49.75F, -2.0F, 6, 2, 4, 0.0F, false));
		Cube1.cubeList.add(new ModelBox(Cube1, 97, 221, -6.16F, -17.5F, -2.0F, 6, 1, 4, 0.0F, false));

		UpperRoof = new RendererModel(this);
		UpperRoof.setRotationPoint(-2.75F, -47.5F, 0.0F);
		Cube1.addChild(UpperRoof);
		setRotationAngle(UpperRoof, 0.0F, 0.0F, -0.1745F);
		UpperRoof.cubeList.add(new ModelBox(UpperRoof, 97, 221, -3.902F, -12.146F, -2.5F, 2, 7, 5, 0.0F, false));

		Cube55 = new RendererModel(this);
		Cube55.setRotationPoint(0.0F, 0.0F, 0.0F);
		UpperRing.addChild(Cube55);
		setRotationAngle(Cube55, 0.0F, -0.6283F, 0.0F);
		Cube55.cubeList.add(new ModelBox(Cube55, 97, 221, -6.16F, -18.5F, -2.0F, 2, 2, 4, 0.01F, false));
		Cube55.cubeList.add(new ModelBox(Cube55, 97, 221, -6.16F, -21.0F, -2.0F, 2, 1, 4, 0.01F, false));
		Cube55.cubeList.add(new ModelBox(Cube55, 97, 221, -5.66F, -20.25F, -2.0F, 2, 2, 4, -0.24F, false));
		Cube55.cubeList.add(new ModelBox(Cube55, 97, 221, -5.66F, -51.25F, -2.0F, 2, 5, 4, -0.24F, false));
		Cube55.cubeList.add(new ModelBox(Cube55, 97, 221, -6.16F, -49.75F, -2.0F, 6, 2, 4, 0.0F, false));
		Cube55.cubeList.add(new ModelBox(Cube55, 97, 221, -7.66F, -52.875F, -2.5F, 6, 2, 5, 0.0F, false));
		Cube55.cubeList.add(new ModelBox(Cube55, 97, 221, -9.2019F, -80.7838F, -3.0F, 2, 24, 6, 0.0F, false));
		Cube55.cubeList.add(new ModelBox(Cube55, 97, 221, -6.16F, -49.75F, -2.0F, 6, 2, 4, 0.0F, false));
		Cube55.cubeList.add(new ModelBox(Cube55, 97, 221, -6.16F, -17.5F, -2.0F, 6, 1, 4, 0.0F, false));

		UpperRoof2 = new RendererModel(this);
		UpperRoof2.setRotationPoint(-2.75F, -47.5F, 0.0F);
		Cube55.addChild(UpperRoof2);
		setRotationAngle(UpperRoof2, 0.0F, 0.0F, -0.1745F);
		UpperRoof2.cubeList.add(new ModelBox(UpperRoof2, 97, 221, -3.902F, -12.146F, -2.5F, 2, 7, 5, 0.0F, false));

		Cube56 = new RendererModel(this);
		Cube56.setRotationPoint(0.0F, 0.0F, 0.0F);
		UpperRing.addChild(Cube56);
		setRotationAngle(Cube56, 0.0F, -1.2566F, 0.0F);
		Cube56.cubeList.add(new ModelBox(Cube56, 97, 221, -6.16F, -18.5F, -2.0F, 2, 2, 4, 0.01F, false));
		Cube56.cubeList.add(new ModelBox(Cube56, 97, 221, -6.16F, -21.0F, -2.0F, 2, 1, 4, 0.01F, false));
		Cube56.cubeList.add(new ModelBox(Cube56, 97, 221, -5.66F, -20.25F, -2.0F, 2, 2, 4, -0.24F, false));
		Cube56.cubeList.add(new ModelBox(Cube56, 97, 221, -5.66F, -51.25F, -2.0F, 2, 5, 4, -0.24F, false));
		Cube56.cubeList.add(new ModelBox(Cube56, 97, 221, -6.16F, -49.75F, -2.0F, 6, 2, 4, 0.0F, false));
		Cube56.cubeList.add(new ModelBox(Cube56, 97, 221, -7.66F, -52.875F, -2.5F, 6, 2, 5, 0.0F, false));
		Cube56.cubeList.add(new ModelBox(Cube56, 97, 221, -9.2019F, -80.7838F, -3.0F, 2, 24, 6, 0.0F, false));
		Cube56.cubeList.add(new ModelBox(Cube56, 97, 221, -6.16F, -49.75F, -2.0F, 6, 2, 4, 0.0F, false));
		Cube56.cubeList.add(new ModelBox(Cube56, 97, 221, -6.16F, -17.5F, -2.0F, 6, 1, 4, 0.0F, false));

		UpperRoof3 = new RendererModel(this);
		UpperRoof3.setRotationPoint(-2.75F, -47.5F, 0.0F);
		Cube56.addChild(UpperRoof3);
		setRotationAngle(UpperRoof3, 0.0F, 0.0F, -0.1745F);
		UpperRoof3.cubeList.add(new ModelBox(UpperRoof3, 97, 221, -3.902F, -12.146F, -2.5F, 2, 7, 5, 0.0F, false));

		Cube57 = new RendererModel(this);
		Cube57.setRotationPoint(0.0F, 0.0F, 0.0F);
		UpperRing.addChild(Cube57);
		setRotationAngle(Cube57, 0.0F, -1.885F, 0.0F);
		Cube57.cubeList.add(new ModelBox(Cube57, 97, 221, -6.16F, -18.5F, -2.0F, 2, 2, 4, 0.01F, false));
		Cube57.cubeList.add(new ModelBox(Cube57, 97, 221, -6.16F, -21.0F, -2.0F, 2, 1, 4, 0.01F, false));
		Cube57.cubeList.add(new ModelBox(Cube57, 97, 221, -5.66F, -20.25F, -2.0F, 2, 2, 4, -0.24F, false));
		Cube57.cubeList.add(new ModelBox(Cube57, 97, 221, -5.66F, -51.25F, -2.0F, 2, 5, 4, -0.24F, false));
		Cube57.cubeList.add(new ModelBox(Cube57, 97, 221, -6.16F, -49.75F, -2.0F, 6, 2, 4, 0.0F, false));
		Cube57.cubeList.add(new ModelBox(Cube57, 97, 221, -7.66F, -52.875F, -2.5F, 6, 2, 5, 0.0F, false));
		Cube57.cubeList.add(new ModelBox(Cube57, 97, 221, -9.2019F, -80.7838F, -3.0F, 2, 24, 6, 0.0F, false));
		Cube57.cubeList.add(new ModelBox(Cube57, 97, 221, -6.16F, -49.75F, -2.0F, 6, 2, 4, 0.0F, false));
		Cube57.cubeList.add(new ModelBox(Cube57, 97, 221, -6.16F, -17.5F, -2.0F, 6, 1, 4, 0.0F, false));

		UpperRoof4 = new RendererModel(this);
		UpperRoof4.setRotationPoint(-2.75F, -47.5F, 0.0F);
		Cube57.addChild(UpperRoof4);
		setRotationAngle(UpperRoof4, 0.0F, 0.0F, -0.1745F);
		UpperRoof4.cubeList.add(new ModelBox(UpperRoof4, 97, 221, -3.902F, -12.146F, -2.5F, 2, 7, 5, 0.0F, false));

		Cube58 = new RendererModel(this);
		Cube58.setRotationPoint(0.0F, 0.0F, 0.0F);
		UpperRing.addChild(Cube58);
		setRotationAngle(Cube58, 0.0F, -2.5133F, 0.0F);
		Cube58.cubeList.add(new ModelBox(Cube58, 97, 221, -6.16F, -18.5F, -2.0F, 2, 2, 4, 0.01F, false));
		Cube58.cubeList.add(new ModelBox(Cube58, 97, 221, -6.16F, -21.0F, -2.0F, 2, 1, 4, 0.01F, false));
		Cube58.cubeList.add(new ModelBox(Cube58, 97, 221, -5.66F, -20.25F, -2.0F, 2, 2, 4, -0.24F, false));
		Cube58.cubeList.add(new ModelBox(Cube58, 97, 221, -5.66F, -51.25F, -2.0F, 2, 5, 4, -0.24F, false));
		Cube58.cubeList.add(new ModelBox(Cube58, 97, 221, -6.16F, -49.75F, -2.0F, 6, 2, 4, 0.0F, false));
		Cube58.cubeList.add(new ModelBox(Cube58, 97, 221, -7.66F, -52.875F, -2.5F, 6, 2, 5, 0.0F, false));
		Cube58.cubeList.add(new ModelBox(Cube58, 97, 221, -9.2019F, -80.7838F, -3.0F, 2, 24, 6, 0.0F, false));
		Cube58.cubeList.add(new ModelBox(Cube58, 97, 221, -6.16F, -49.75F, -2.0F, 6, 2, 4, 0.0F, false));
		Cube58.cubeList.add(new ModelBox(Cube58, 97, 221, -6.16F, -17.5F, -2.0F, 6, 1, 4, 0.0F, false));

		UpperRoof5 = new RendererModel(this);
		UpperRoof5.setRotationPoint(-2.75F, -47.5F, 0.0F);
		Cube58.addChild(UpperRoof5);
		setRotationAngle(UpperRoof5, 0.0F, 0.0F, -0.1745F);
		UpperRoof5.cubeList.add(new ModelBox(UpperRoof5, 97, 221, -3.902F, -12.146F, -2.5F, 2, 7, 5, 0.0F, false));

		Cube59 = new RendererModel(this);
		Cube59.setRotationPoint(0.0F, 0.0F, 0.0F);
		UpperRing.addChild(Cube59);
		setRotationAngle(Cube59, 0.0F, 3.1416F, 0.0F);
		Cube59.cubeList.add(new ModelBox(Cube59, 97, 221, -6.16F, -18.5F, -2.0F, 2, 2, 4, 0.01F, false));
		Cube59.cubeList.add(new ModelBox(Cube59, 97, 221, -6.16F, -21.0F, -2.0F, 2, 1, 4, 0.01F, false));
		Cube59.cubeList.add(new ModelBox(Cube59, 97, 221, -5.66F, -20.25F, -2.0F, 2, 2, 4, -0.24F, false));
		Cube59.cubeList.add(new ModelBox(Cube59, 97, 221, -5.66F, -51.25F, -2.0F, 2, 5, 4, -0.24F, false));
		Cube59.cubeList.add(new ModelBox(Cube59, 97, 221, -6.16F, -49.75F, -2.0F, 6, 2, 4, 0.0F, false));
		Cube59.cubeList.add(new ModelBox(Cube59, 97, 221, -7.66F, -52.875F, -2.5F, 6, 2, 5, 0.0F, false));
		Cube59.cubeList.add(new ModelBox(Cube59, 97, 221, -9.2019F, -80.7838F, -3.0F, 2, 24, 6, 0.0F, false));
		Cube59.cubeList.add(new ModelBox(Cube59, 97, 221, -6.16F, -49.75F, -2.0F, 6, 2, 4, 0.0F, false));
		Cube59.cubeList.add(new ModelBox(Cube59, 97, 221, -6.16F, -17.5F, -2.0F, 6, 1, 4, 0.0F, false));

		UpperRoof6 = new RendererModel(this);
		UpperRoof6.setRotationPoint(-2.75F, -47.5F, 0.0F);
		Cube59.addChild(UpperRoof6);
		setRotationAngle(UpperRoof6, 0.0F, 0.0F, -0.1745F);
		UpperRoof6.cubeList.add(new ModelBox(UpperRoof6, 97, 221, -3.902F, -12.146F, -2.5F, 2, 7, 5, 0.0F, false));

		Cube60 = new RendererModel(this);
		Cube60.setRotationPoint(0.0F, 0.0F, 0.0F);
		UpperRing.addChild(Cube60);
		setRotationAngle(Cube60, 0.0F, 2.5133F, 0.0F);
		Cube60.cubeList.add(new ModelBox(Cube60, 97, 221, -6.16F, -18.5F, -2.0F, 2, 2, 4, 0.01F, false));
		Cube60.cubeList.add(new ModelBox(Cube60, 97, 221, -6.16F, -21.0F, -2.0F, 2, 1, 4, 0.01F, false));
		Cube60.cubeList.add(new ModelBox(Cube60, 97, 221, -5.66F, -20.25F, -2.0F, 2, 2, 4, -0.24F, false));
		Cube60.cubeList.add(new ModelBox(Cube60, 97, 221, -5.66F, -51.25F, -2.0F, 2, 5, 4, -0.24F, false));
		Cube60.cubeList.add(new ModelBox(Cube60, 97, 221, -6.16F, -49.75F, -2.0F, 6, 2, 4, 0.0F, false));
		Cube60.cubeList.add(new ModelBox(Cube60, 97, 221, -7.66F, -52.875F, -2.5F, 6, 2, 5, 0.0F, false));
		Cube60.cubeList.add(new ModelBox(Cube60, 97, 221, -9.2019F, -80.7838F, -3.0F, 2, 24, 6, 0.0F, false));
		Cube60.cubeList.add(new ModelBox(Cube60, 97, 221, -6.16F, -49.75F, -2.0F, 6, 2, 4, 0.0F, false));
		Cube60.cubeList.add(new ModelBox(Cube60, 97, 221, -6.16F, -17.5F, -2.0F, 6, 1, 4, 0.0F, false));

		UpperRoof7 = new RendererModel(this);
		UpperRoof7.setRotationPoint(-2.75F, -47.5F, 0.0F);
		Cube60.addChild(UpperRoof7);
		setRotationAngle(UpperRoof7, 0.0F, 0.0F, -0.1745F);
		UpperRoof7.cubeList.add(new ModelBox(UpperRoof7, 97, 221, -3.902F, -12.146F, -2.5F, 2, 7, 5, 0.0F, false));

		Cube61 = new RendererModel(this);
		Cube61.setRotationPoint(0.0F, 0.0F, 0.0F);
		UpperRing.addChild(Cube61);
		setRotationAngle(Cube61, 0.0F, 1.885F, 0.0F);
		Cube61.cubeList.add(new ModelBox(Cube61, 97, 221, -6.16F, -18.5F, -2.0F, 2, 2, 4, 0.01F, false));
		Cube61.cubeList.add(new ModelBox(Cube61, 97, 221, -6.16F, -21.0F, -2.0F, 2, 1, 4, 0.01F, false));
		Cube61.cubeList.add(new ModelBox(Cube61, 97, 221, -5.66F, -20.25F, -2.0F, 2, 2, 4, -0.24F, false));
		Cube61.cubeList.add(new ModelBox(Cube61, 97, 221, -5.66F, -51.25F, -2.0F, 2, 5, 4, -0.24F, false));
		Cube61.cubeList.add(new ModelBox(Cube61, 97, 221, -6.16F, -49.75F, -2.0F, 6, 2, 4, 0.0F, false));
		Cube61.cubeList.add(new ModelBox(Cube61, 97, 221, -7.66F, -52.875F, -2.5F, 6, 2, 5, 0.0F, false));
		Cube61.cubeList.add(new ModelBox(Cube61, 97, 221, -9.2019F, -80.7838F, -3.0F, 2, 24, 6, 0.0F, false));
		Cube61.cubeList.add(new ModelBox(Cube61, 97, 221, -6.16F, -49.75F, -2.0F, 6, 2, 4, 0.0F, false));
		Cube61.cubeList.add(new ModelBox(Cube61, 97, 221, -6.16F, -17.5F, -2.0F, 6, 1, 4, 0.0F, false));

		UpperRoof8 = new RendererModel(this);
		UpperRoof8.setRotationPoint(-2.75F, -47.5F, 0.0F);
		Cube61.addChild(UpperRoof8);
		setRotationAngle(UpperRoof8, 0.0F, 0.0F, -0.1745F);
		UpperRoof8.cubeList.add(new ModelBox(UpperRoof8, 97, 221, -3.902F, -12.146F, -2.5F, 2, 7, 5, 0.0F, false));

		Cube62 = new RendererModel(this);
		Cube62.setRotationPoint(0.0F, 0.0F, 0.0F);
		UpperRing.addChild(Cube62);
		setRotationAngle(Cube62, 0.0F, 1.2566F, 0.0F);
		Cube62.cubeList.add(new ModelBox(Cube62, 97, 221, -6.16F, -18.5F, -2.0F, 2, 2, 4, 0.01F, false));
		Cube62.cubeList.add(new ModelBox(Cube62, 97, 221, -6.16F, -21.0F, -2.0F, 2, 1, 4, 0.01F, false));
		Cube62.cubeList.add(new ModelBox(Cube62, 97, 221, -5.66F, -20.25F, -2.0F, 2, 2, 4, -0.24F, false));
		Cube62.cubeList.add(new ModelBox(Cube62, 97, 221, -5.66F, -51.25F, -2.0F, 2, 5, 4, -0.24F, false));
		Cube62.cubeList.add(new ModelBox(Cube62, 97, 221, -6.16F, -49.75F, -2.0F, 6, 2, 4, 0.0F, false));
		Cube62.cubeList.add(new ModelBox(Cube62, 97, 221, -7.66F, -52.875F, -2.5F, 6, 2, 5, 0.0F, false));
		Cube62.cubeList.add(new ModelBox(Cube62, 97, 221, -9.2019F, -80.7838F, -3.0F, 2, 24, 6, 0.0F, false));
		Cube62.cubeList.add(new ModelBox(Cube62, 97, 221, -6.16F, -49.75F, -2.0F, 6, 2, 4, 0.0F, false));
		Cube62.cubeList.add(new ModelBox(Cube62, 97, 221, -6.16F, -17.5F, -2.0F, 6, 1, 4, 0.0F, false));

		UpperRoof9 = new RendererModel(this);
		UpperRoof9.setRotationPoint(-2.75F, -47.5F, 0.0F);
		Cube62.addChild(UpperRoof9);
		setRotationAngle(UpperRoof9, 0.0F, 0.0F, -0.1745F);
		UpperRoof9.cubeList.add(new ModelBox(UpperRoof9, 97, 221, -3.902F, -12.146F, -2.5F, 2, 7, 5, 0.0F, false));

		Cube63 = new RendererModel(this);
		Cube63.setRotationPoint(0.0F, 0.0F, 0.0F);
		UpperRing.addChild(Cube63);
		setRotationAngle(Cube63, 0.0F, 0.6283F, 0.0F);
		Cube63.cubeList.add(new ModelBox(Cube63, 97, 221, -6.16F, -18.5F, -2.0F, 2, 2, 4, 0.01F, false));
		Cube63.cubeList.add(new ModelBox(Cube63, 97, 221, -6.16F, -21.0F, -2.0F, 2, 1, 4, 0.01F, false));
		Cube63.cubeList.add(new ModelBox(Cube63, 97, 221, -5.66F, -20.25F, -2.0F, 2, 2, 4, -0.24F, false));
		Cube63.cubeList.add(new ModelBox(Cube63, 97, 221, -5.66F, -51.25F, -2.0F, 2, 5, 4, -0.24F, false));
		Cube63.cubeList.add(new ModelBox(Cube63, 97, 221, -6.16F, -49.75F, -2.0F, 6, 2, 4, 0.0F, false));
		Cube63.cubeList.add(new ModelBox(Cube63, 97, 221, -7.66F, -52.875F, -2.5F, 6, 2, 5, 0.0F, false));
		Cube63.cubeList.add(new ModelBox(Cube63, 97, 221, -9.2019F, -80.7838F, -3.0F, 2, 24, 6, 0.0F, false));
		Cube63.cubeList.add(new ModelBox(Cube63, 97, 221, -6.16F, -49.75F, -2.0F, 6, 2, 4, 0.0F, false));
		Cube63.cubeList.add(new ModelBox(Cube63, 97, 221, -6.16F, -17.5F, -2.0F, 6, 1, 4, 0.0F, false));

		UpperRoof10 = new RendererModel(this);
		UpperRoof10.setRotationPoint(-2.75F, -47.5F, 0.0F);
		Cube63.addChild(UpperRoof10);
		setRotationAngle(UpperRoof10, 0.0F, 0.0F, -0.1745F);
		UpperRoof10.cubeList.add(new ModelBox(UpperRoof10, 97, 221, -3.902F, -12.146F, -2.5F, 2, 7, 5, 0.0F, false));

		Panels = new RendererModel(this);
		Panels.setRotationPoint(0.0F, 0.5F, 0.0F);
		Console.addChild(Panels);
		

		Panel1 = new RendererModel(this);
		Panel1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(Panel1);
		

		Cube64 = new RendererModel(this);
		Cube64.setRotationPoint(10.75F, -13.75F, 0.0F);
		Panel1.addChild(Cube64);
		setRotationAngle(Cube64, 0.0F, 0.0F, 0.8727F);
		Cube64.cubeList.add(new ModelBox(Cube64, 204, 217, -0.5216F, -0.938F, -6.0F, 4, 1, 12, 0.0F, false));

		Cube65 = new RendererModel(this);
		Cube65.setRotationPoint(5.25F, -13.75F, -0.5F);
		Panel1.addChild(Cube65);
		setRotationAngle(Cube65, 0.0F, 0.0F, 0.4363F);
		Cube65.cubeList.add(new ModelBox(Cube65, 204, 217, 2.9084F, -3.395F, -4.5F, 2, 1, 10, 0.0F, false));
		Cube65.cubeList.add(new ModelBox(Cube65, 204, 217, 0.9084F, -3.395F, -3.5F, 2, 1, 8, 0.0F, false));
		Cube65.cubeList.add(new ModelBox(Cube65, 204, 217, -1.0916F, -3.395F, -2.5F, 2, 1, 6, 0.0F, false));

		bone = new RendererModel(this);
		bone.setRotationPoint(4.9435F, -1.7658F, 0.0F);
		Cube65.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, -0.1745F);
		bone.cubeList.add(new ModelBox(bone, 204, 217, -7.6605F, -2.6525F, -2.5F, 2, 1, 6, 0.0F, false));

		Panel2 = new RendererModel(this);
		Panel2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(Panel2);
		setRotationAngle(Panel2, 0.0F, -1.0472F, 0.0F);
		

		Cube67 = new RendererModel(this);
		Cube67.setRotationPoint(10.75F, -13.75F, 0.0F);
		Panel2.addChild(Cube67);
		setRotationAngle(Cube67, 0.0F, 0.0F, 0.8727F);
		Cube67.cubeList.add(new ModelBox(Cube67, 204, 217, -0.5216F, -0.938F, -6.0F, 4, 1, 12, 0.0F, false));

		Cube68 = new RendererModel(this);
		Cube68.setRotationPoint(5.25F, -13.75F, -0.5F);
		Panel2.addChild(Cube68);
		setRotationAngle(Cube68, 0.0F, 0.0F, 0.4363F);
		Cube68.cubeList.add(new ModelBox(Cube68, 204, 217, 2.9084F, -3.395F, -4.5F, 2, 1, 10, 0.0F, false));
		Cube68.cubeList.add(new ModelBox(Cube68, 204, 217, 0.9084F, -3.395F, -3.5F, 2, 1, 8, 0.0F, false));
		Cube68.cubeList.add(new ModelBox(Cube68, 204, 217, -1.0916F, -3.395F, -2.5F, 2, 1, 6, 0.0F, false));

		bone2 = new RendererModel(this);
		bone2.setRotationPoint(4.9435F, -1.7658F, 0.0F);
		Cube68.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.1745F);
		bone2.cubeList.add(new ModelBox(bone2, 204, 217, -7.6605F, -2.6525F, -2.5F, 2, 1, 6, 0.0F, false));

		Panel3 = new RendererModel(this);
		Panel3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(Panel3);
		setRotationAngle(Panel3, 0.0F, -2.0944F, 0.0F);
		

		Cube69 = new RendererModel(this);
		Cube69.setRotationPoint(10.75F, -13.75F, 0.0F);
		Panel3.addChild(Cube69);
		setRotationAngle(Cube69, 0.0F, 0.0F, 0.8727F);
		Cube69.cubeList.add(new ModelBox(Cube69, 204, 217, -0.5216F, -0.938F, -6.0F, 4, 1, 12, 0.0F, false));

		Cube70 = new RendererModel(this);
		Cube70.setRotationPoint(5.25F, -13.75F, -0.5F);
		Panel3.addChild(Cube70);
		setRotationAngle(Cube70, 0.0F, 0.0F, 0.4363F);
		Cube70.cubeList.add(new ModelBox(Cube70, 204, 217, 2.9084F, -3.395F, -4.5F, 2, 1, 10, 0.0F, false));
		Cube70.cubeList.add(new ModelBox(Cube70, 204, 217, 0.9084F, -3.395F, -3.5F, 2, 1, 8, 0.0F, false));
		Cube70.cubeList.add(new ModelBox(Cube70, 204, 217, -1.0916F, -3.395F, -2.5F, 2, 1, 6, 0.0F, false));

		bone3 = new RendererModel(this);
		bone3.setRotationPoint(4.9435F, -1.7658F, 0.0F);
		Cube70.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, -0.1745F);
		bone3.cubeList.add(new ModelBox(bone3, 204, 217, -7.6605F, -2.6525F, -2.5F, 2, 1, 6, 0.0F, false));

		Panel4 = new RendererModel(this);
		Panel4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(Panel4);
		setRotationAngle(Panel4, 0.0F, 3.1416F, 0.0F);
		

		Cube71 = new RendererModel(this);
		Cube71.setRotationPoint(10.75F, -13.75F, 0.0F);
		Panel4.addChild(Cube71);
		setRotationAngle(Cube71, 0.0F, 0.0F, 0.8727F);
		Cube71.cubeList.add(new ModelBox(Cube71, 204, 217, -0.5216F, -0.938F, -6.0F, 4, 1, 12, 0.0F, false));

		Cube72 = new RendererModel(this);
		Cube72.setRotationPoint(5.25F, -13.75F, -0.5F);
		Panel4.addChild(Cube72);
		setRotationAngle(Cube72, 0.0F, 0.0F, 0.4363F);
		Cube72.cubeList.add(new ModelBox(Cube72, 204, 217, 2.9084F, -3.395F, -4.5F, 2, 1, 10, 0.0F, false));
		Cube72.cubeList.add(new ModelBox(Cube72, 204, 217, 0.9084F, -3.395F, -3.5F, 2, 1, 8, 0.0F, false));
		Cube72.cubeList.add(new ModelBox(Cube72, 204, 217, -1.0916F, -3.395F, -2.5F, 2, 1, 6, 0.0F, false));

		bone4 = new RendererModel(this);
		bone4.setRotationPoint(4.9435F, -1.7658F, 0.0F);
		Cube72.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, -0.1745F);
		bone4.cubeList.add(new ModelBox(bone4, 204, 217, -7.6605F, -2.6525F, -2.5F, 2, 1, 6, 0.0F, false));

		Panel5 = new RendererModel(this);
		Panel5.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(Panel5);
		setRotationAngle(Panel5, 0.0F, 2.0944F, 0.0F);
		

		Cube73 = new RendererModel(this);
		Cube73.setRotationPoint(10.75F, -13.75F, 0.0F);
		Panel5.addChild(Cube73);
		setRotationAngle(Cube73, 0.0F, 0.0F, 0.8727F);
		Cube73.cubeList.add(new ModelBox(Cube73, 204, 217, -0.5216F, -0.938F, -6.0F, 4, 1, 12, 0.0F, false));

		Cube74 = new RendererModel(this);
		Cube74.setRotationPoint(5.25F, -13.75F, -0.5F);
		Panel5.addChild(Cube74);
		setRotationAngle(Cube74, 0.0F, 0.0F, 0.4363F);
		Cube74.cubeList.add(new ModelBox(Cube74, 204, 217, 2.9084F, -3.395F, -4.5F, 2, 1, 10, 0.0F, false));
		Cube74.cubeList.add(new ModelBox(Cube74, 204, 217, 0.9084F, -3.395F, -3.5F, 2, 1, 8, 0.0F, false));
		Cube74.cubeList.add(new ModelBox(Cube74, 204, 217, -1.0916F, -3.395F, -2.5F, 2, 1, 6, 0.0F, false));

		bone5 = new RendererModel(this);
		bone5.setRotationPoint(4.9435F, -1.7658F, 0.0F);
		Cube74.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, -0.1745F);
		bone5.cubeList.add(new ModelBox(bone5, 204, 217, -7.6605F, -2.6525F, -2.5F, 2, 1, 6, 0.0F, false));

		Panel6 = new RendererModel(this);
		Panel6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Panels.addChild(Panel6);
		setRotationAngle(Panel6, 0.0F, 1.0472F, 0.0F);
		

		Cube75 = new RendererModel(this);
		Cube75.setRotationPoint(10.75F, -13.75F, 0.0F);
		Panel6.addChild(Cube75);
		setRotationAngle(Cube75, 0.0F, 0.0F, 0.8727F);
		Cube75.cubeList.add(new ModelBox(Cube75, 204, 217, -0.5216F, -0.938F, -6.0F, 4, 1, 12, 0.0F, false));

		Cube76 = new RendererModel(this);
		Cube76.setRotationPoint(5.25F, -13.75F, -0.5F);
		Panel6.addChild(Cube76);
		setRotationAngle(Cube76, 0.0F, 0.0F, 0.4363F);
		Cube76.cubeList.add(new ModelBox(Cube76, 204, 217, 2.9084F, -3.395F, -4.5F, 2, 1, 10, 0.0F, false));
		Cube76.cubeList.add(new ModelBox(Cube76, 204, 217, 0.9084F, -3.395F, -3.5F, 2, 1, 8, 0.0F, false));
		Cube76.cubeList.add(new ModelBox(Cube76, 204, 217, -1.0916F, -3.395F, -2.5F, 2, 1, 6, 0.0F, false));

		bone6 = new RendererModel(this);
		bone6.setRotationPoint(4.9435F, -1.7658F, 0.0F);
		Cube76.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, -0.1745F);
		bone6.cubeList.add(new ModelBox(bone6, 204, 217, -7.6605F, -2.6525F, -2.5F, 2, 1, 6, 0.0F, false));

		Pipes = new RendererModel(this);
		Pipes.setRotationPoint(0.0F, 0.0F, 0.0F);
		Console.addChild(Pipes);
		

		Set1 = new RendererModel(this);
		Set1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pipes.addChild(Set1);
		Set1.cubeList.add(new ModelBox(Set1, 47, 231, 12.5F, -11.25F, -1.5F, 1, 2, 3, 0.0F, false));
		Set1.cubeList.add(new ModelBox(Set1, 47, 231, 11.75F, -10.125F, -1.5F, 1, 2, 3, 0.0F, false));
		Set1.cubeList.add(new ModelBox(Set1, 47, 231, 10.875F, -9.25F, -1.5F, 1, 2, 3, 0.0F, false));

		bone7 = new RendererModel(this);
		bone7.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set1.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.2208F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 47, 231, 11.7682F, 0.125F, -1.6642F, 1, 2, 3, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 47, 231, 10.9144F, 1.0F, -1.8559F, 1, 2, 3, 0.0F, false));

		bone8 = new RendererModel(this);
		bone8.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set1.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.4416F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 47, 231, 11.8219F, 0.125F, -1.8205F, 1, 2, 3, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 47, 231, 11.0309F, 1.0F, -2.1945F, 1, 2, 3, 0.0F, false));

		bone10 = new RendererModel(this);
		bone10.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set1.addChild(bone10);
		setRotationAngle(bone10, 0.0F, -0.2208F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 47, 231, 11.7682F, 0.125F, -1.3358F, 1, 2, 3, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 47, 231, 10.9144F, 1.0F, -1.1441F, 1, 2, 3, 0.0F, false));

		bone9 = new RendererModel(this);
		bone9.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set1.addChild(bone9);
		setRotationAngle(bone9, 0.0F, -0.4416F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 47, 231, 11.8219F, 0.125F, -1.1795F, 1, 2, 3, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 47, 231, 11.0309F, 1.0F, -0.8055F, 1, 2, 3, 0.0F, false));

		Set2 = new RendererModel(this);
		Set2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pipes.addChild(Set2);
		setRotationAngle(Set2, 0.0F, -1.0472F, 0.0F);
		Set2.cubeList.add(new ModelBox(Set2, 47, 231, 12.5F, -11.25F, -1.5F, 1, 2, 3, 0.0F, false));
		Set2.cubeList.add(new ModelBox(Set2, 47, 231, 11.75F, -10.125F, -1.5F, 1, 2, 3, 0.0F, false));
		Set2.cubeList.add(new ModelBox(Set2, 47, 231, 10.875F, -9.25F, -1.5F, 1, 2, 3, 0.0F, false));

		bone11 = new RendererModel(this);
		bone11.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set2.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.2208F, 0.0F);
		bone11.cubeList.add(new ModelBox(bone11, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 47, 231, 11.7682F, 0.125F, -1.6642F, 1, 2, 3, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 47, 231, 10.9144F, 1.0F, -1.8559F, 1, 2, 3, 0.0F, false));

		bone12 = new RendererModel(this);
		bone12.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set2.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.4416F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 47, 231, 11.8219F, 0.125F, -1.8205F, 1, 2, 3, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 47, 231, 11.0309F, 1.0F, -2.1945F, 1, 2, 3, 0.0F, false));

		bone13 = new RendererModel(this);
		bone13.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set2.addChild(bone13);
		setRotationAngle(bone13, 0.0F, -0.2208F, 0.0F);
		bone13.cubeList.add(new ModelBox(bone13, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 47, 231, 11.7682F, 0.125F, -1.3358F, 1, 2, 3, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 47, 231, 10.9144F, 1.0F, -1.1441F, 1, 2, 3, 0.0F, false));

		bone14 = new RendererModel(this);
		bone14.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set2.addChild(bone14);
		setRotationAngle(bone14, 0.0F, -0.4416F, 0.0F);
		bone14.cubeList.add(new ModelBox(bone14, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 47, 231, 11.8219F, 0.125F, -1.1795F, 1, 2, 3, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 47, 231, 11.0309F, 1.0F, -0.8055F, 1, 2, 3, 0.0F, false));

		Set3 = new RendererModel(this);
		Set3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pipes.addChild(Set3);
		setRotationAngle(Set3, 0.0F, -2.0944F, 0.0F);
		Set3.cubeList.add(new ModelBox(Set3, 47, 231, 12.5F, -11.25F, -1.5F, 1, 2, 3, 0.0F, false));
		Set3.cubeList.add(new ModelBox(Set3, 47, 231, 11.75F, -10.125F, -1.5F, 1, 2, 3, 0.0F, false));
		Set3.cubeList.add(new ModelBox(Set3, 47, 231, 10.875F, -9.25F, -1.5F, 1, 2, 3, 0.0F, false));

		bone15 = new RendererModel(this);
		bone15.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set3.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.2208F, 0.0F);
		bone15.cubeList.add(new ModelBox(bone15, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 47, 231, 11.7682F, 0.125F, -1.6642F, 1, 2, 3, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 47, 231, 10.9144F, 1.0F, -1.8559F, 1, 2, 3, 0.0F, false));

		bone16 = new RendererModel(this);
		bone16.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set3.addChild(bone16);
		setRotationAngle(bone16, 0.0F, 0.4416F, 0.0F);
		bone16.cubeList.add(new ModelBox(bone16, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 47, 231, 11.8219F, 0.125F, -1.8205F, 1, 2, 3, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 47, 231, 11.0309F, 1.0F, -2.1945F, 1, 2, 3, 0.0F, false));

		bone17 = new RendererModel(this);
		bone17.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set3.addChild(bone17);
		setRotationAngle(bone17, 0.0F, -0.2208F, 0.0F);
		bone17.cubeList.add(new ModelBox(bone17, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 47, 231, 11.7682F, 0.125F, -1.3358F, 1, 2, 3, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 47, 231, 10.9144F, 1.0F, -1.1441F, 1, 2, 3, 0.0F, false));

		bone18 = new RendererModel(this);
		bone18.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set3.addChild(bone18);
		setRotationAngle(bone18, 0.0F, -0.4416F, 0.0F);
		bone18.cubeList.add(new ModelBox(bone18, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 47, 231, 11.8219F, 0.125F, -1.1795F, 1, 2, 3, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 47, 231, 11.0309F, 1.0F, -0.8055F, 1, 2, 3, 0.0F, false));

		Set4 = new RendererModel(this);
		Set4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pipes.addChild(Set4);
		setRotationAngle(Set4, 0.0F, 3.1416F, 0.0F);
		Set4.cubeList.add(new ModelBox(Set4, 47, 231, 12.5F, -11.25F, -1.5F, 1, 2, 3, 0.0F, false));
		Set4.cubeList.add(new ModelBox(Set4, 47, 231, 11.75F, -10.125F, -1.5F, 1, 2, 3, 0.0F, false));
		Set4.cubeList.add(new ModelBox(Set4, 47, 231, 10.875F, -9.25F, -1.5F, 1, 2, 3, 0.0F, false));

		bone19 = new RendererModel(this);
		bone19.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set4.addChild(bone19);
		setRotationAngle(bone19, 0.0F, 0.2208F, 0.0F);
		bone19.cubeList.add(new ModelBox(bone19, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 47, 231, 11.7682F, 0.125F, -1.6642F, 1, 2, 3, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 47, 231, 10.9144F, 1.0F, -1.8559F, 1, 2, 3, 0.0F, false));

		bone20 = new RendererModel(this);
		bone20.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set4.addChild(bone20);
		setRotationAngle(bone20, 0.0F, 0.4416F, 0.0F);
		bone20.cubeList.add(new ModelBox(bone20, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 47, 231, 11.8219F, 0.125F, -1.8205F, 1, 2, 3, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 47, 231, 11.0309F, 1.0F, -2.1945F, 1, 2, 3, 0.0F, false));

		bone21 = new RendererModel(this);
		bone21.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set4.addChild(bone21);
		setRotationAngle(bone21, 0.0F, -0.2208F, 0.0F);
		bone21.cubeList.add(new ModelBox(bone21, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 47, 231, 11.7682F, 0.125F, -1.3358F, 1, 2, 3, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 47, 231, 10.9144F, 1.0F, -1.1441F, 1, 2, 3, 0.0F, false));

		bone22 = new RendererModel(this);
		bone22.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set4.addChild(bone22);
		setRotationAngle(bone22, 0.0F, -0.4416F, 0.0F);
		bone22.cubeList.add(new ModelBox(bone22, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 47, 231, 11.8219F, 0.125F, -1.1795F, 1, 2, 3, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 47, 231, 11.0309F, 1.0F, -0.8055F, 1, 2, 3, 0.0F, false));

		Set5 = new RendererModel(this);
		Set5.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pipes.addChild(Set5);
		setRotationAngle(Set5, 0.0F, 2.0944F, 0.0F);
		Set5.cubeList.add(new ModelBox(Set5, 47, 231, 12.5F, -11.25F, -1.5F, 1, 2, 3, 0.0F, false));
		Set5.cubeList.add(new ModelBox(Set5, 47, 231, 11.75F, -10.125F, -1.5F, 1, 2, 3, 0.0F, false));
		Set5.cubeList.add(new ModelBox(Set5, 47, 231, 10.875F, -9.25F, -1.5F, 1, 2, 3, 0.0F, false));

		bone23 = new RendererModel(this);
		bone23.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set5.addChild(bone23);
		setRotationAngle(bone23, 0.0F, 0.2208F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 47, 231, 11.7682F, 0.125F, -1.6642F, 1, 2, 3, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 47, 231, 10.9144F, 1.0F, -1.8559F, 1, 2, 3, 0.0F, false));

		bone24 = new RendererModel(this);
		bone24.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set5.addChild(bone24);
		setRotationAngle(bone24, 0.0F, 0.4416F, 0.0F);
		bone24.cubeList.add(new ModelBox(bone24, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone24.cubeList.add(new ModelBox(bone24, 47, 231, 11.8219F, 0.125F, -1.8205F, 1, 2, 3, 0.0F, false));
		bone24.cubeList.add(new ModelBox(bone24, 47, 231, 11.0309F, 1.0F, -2.1945F, 1, 2, 3, 0.0F, false));

		bone25 = new RendererModel(this);
		bone25.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set5.addChild(bone25);
		setRotationAngle(bone25, 0.0F, -0.2208F, 0.0F);
		bone25.cubeList.add(new ModelBox(bone25, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone25.cubeList.add(new ModelBox(bone25, 47, 231, 11.7682F, 0.125F, -1.3358F, 1, 2, 3, 0.0F, false));
		bone25.cubeList.add(new ModelBox(bone25, 47, 231, 10.9144F, 1.0F, -1.1441F, 1, 2, 3, 0.0F, false));

		bone26 = new RendererModel(this);
		bone26.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set5.addChild(bone26);
		setRotationAngle(bone26, 0.0F, -0.4416F, 0.0F);
		bone26.cubeList.add(new ModelBox(bone26, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 47, 231, 11.8219F, 0.125F, -1.1795F, 1, 2, 3, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 47, 231, 11.0309F, 1.0F, -0.8055F, 1, 2, 3, 0.0F, false));

		Set6 = new RendererModel(this);
		Set6.setRotationPoint(0.0F, 0.0F, 0.0F);
		Pipes.addChild(Set6);
		setRotationAngle(Set6, 0.0F, 1.0472F, 0.0F);
		Set6.cubeList.add(new ModelBox(Set6, 47, 231, 12.5F, -11.25F, -1.5F, 1, 2, 3, 0.0F, false));
		Set6.cubeList.add(new ModelBox(Set6, 47, 231, 11.75F, -10.125F, -1.5F, 1, 2, 3, 0.0F, false));
		Set6.cubeList.add(new ModelBox(Set6, 47, 231, 10.875F, -9.25F, -1.5F, 1, 2, 3, 0.0F, false));

		bone27 = new RendererModel(this);
		bone27.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set6.addChild(bone27);
		setRotationAngle(bone27, 0.0F, 0.2208F, 0.0F);
		bone27.cubeList.add(new ModelBox(bone27, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 47, 231, 11.7682F, 0.125F, -1.6642F, 1, 2, 3, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 47, 231, 10.9144F, 1.0F, -1.8559F, 1, 2, 3, 0.0F, false));

		bone28 = new RendererModel(this);
		bone28.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set6.addChild(bone28);
		setRotationAngle(bone28, 0.0F, 0.4416F, 0.0F);
		bone28.cubeList.add(new ModelBox(bone28, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone28.cubeList.add(new ModelBox(bone28, 47, 231, 11.8219F, 0.125F, -1.8205F, 1, 2, 3, 0.0F, false));
		bone28.cubeList.add(new ModelBox(bone28, 47, 231, 11.0309F, 1.0F, -2.1945F, 1, 2, 3, 0.0F, false));

		bone29 = new RendererModel(this);
		bone29.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set6.addChild(bone29);
		setRotationAngle(bone29, 0.0F, -0.2208F, 0.0F);
		bone29.cubeList.add(new ModelBox(bone29, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone29.cubeList.add(new ModelBox(bone29, 47, 231, 11.7682F, 0.125F, -1.3358F, 1, 2, 3, 0.0F, false));
		bone29.cubeList.add(new ModelBox(bone29, 47, 231, 10.9144F, 1.0F, -1.1441F, 1, 2, 3, 0.0F, false));

		bone30 = new RendererModel(this);
		bone30.setRotationPoint(0.0F, -10.25F, 0.0F);
		Set6.addChild(bone30);
		setRotationAngle(bone30, 0.0F, -0.4416F, 0.0F);
		bone30.cubeList.add(new ModelBox(bone30, 47, 231, 12.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 47, 231, 11.8219F, 0.125F, -1.1795F, 1, 2, 3, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 47, 231, 11.0309F, 1.0F, -0.8055F, 1, 2, 3, 0.0F, false));

		UnderConsole = new RendererModel(this);
		UnderConsole.setRotationPoint(0.0F, 0.0F, 0.0F);
		Console.addChild(UnderConsole);
		

		part1 = new RendererModel(this);
		part1.setRotationPoint(0.0F, 0.0F, 0.0F);
		UnderConsole.addChild(part1);
		part1.cubeList.add(new ModelBox(part1, 225, 222, 4.375F, -7.75F, -2.0F, 1, 4, 4, 0.0F, false));
		part1.cubeList.add(new ModelBox(part1, 225, 222, 5.375F, -8.375F, -3.0F, 6, 1, 6, 0.0F, false));
		part1.cubeList.add(new ModelBox(part1, 225, 222, 7.75F, -8.375F, -5.0F, 3, 1, 2, 0.0F, false));
		part1.cubeList.add(new ModelBox(part1, 225, 222, 7.75F, -8.375F, 3.0F, 3, 1, 2, 0.0F, false));

		bone33 = new RendererModel(this);
		bone33.setRotationPoint(4.5F, 0.25F, -1.0F);
		part1.addChild(bone33);
		setRotationAngle(bone33, 0.0F, 0.0F, 0.2618F);
		bone33.cubeList.add(new ModelBox(bone33, 225, 222, -1.1901F, -4.0902F, -1.0F, 1, 7, 4, 0.0F, false));

		part2 = new RendererModel(this);
		part2.setRotationPoint(0.0F, 0.0F, 0.0F);
		UnderConsole.addChild(part2);
		setRotationAngle(part2, 0.0F, -1.0472F, 0.0F);
		part2.cubeList.add(new ModelBox(part2, 225, 222, 4.375F, -7.75F, -2.0F, 1, 4, 4, 0.0F, false));
		part2.cubeList.add(new ModelBox(part2, 225, 222, 5.375F, -8.375F, -3.0F, 6, 1, 6, 0.0F, false));
		part2.cubeList.add(new ModelBox(part2, 225, 222, 7.75F, -8.375F, -5.0F, 3, 1, 2, 0.0F, false));
		part2.cubeList.add(new ModelBox(part2, 225, 222, 7.75F, -8.375F, 3.0F, 3, 1, 2, 0.0F, false));

		bone31 = new RendererModel(this);
		bone31.setRotationPoint(4.5F, 0.25F, -1.0F);
		part2.addChild(bone31);
		setRotationAngle(bone31, 0.0F, 0.0F, 0.2618F);
		bone31.cubeList.add(new ModelBox(bone31, 225, 222, -1.1901F, -4.0902F, -1.0F, 1, 7, 4, 0.0F, false));

		part3 = new RendererModel(this);
		part3.setRotationPoint(0.0F, 0.0F, 0.0F);
		UnderConsole.addChild(part3);
		setRotationAngle(part3, 0.0F, -2.0944F, 0.0F);
		part3.cubeList.add(new ModelBox(part3, 225, 222, 4.375F, -7.75F, -2.0F, 1, 4, 4, 0.0F, false));
		part3.cubeList.add(new ModelBox(part3, 225, 222, 5.375F, -8.375F, -3.0F, 6, 1, 6, 0.0F, false));
		part3.cubeList.add(new ModelBox(part3, 225, 222, 7.75F, -8.375F, -5.0F, 3, 1, 2, 0.0F, false));
		part3.cubeList.add(new ModelBox(part3, 225, 222, 7.75F, -8.375F, 3.0F, 3, 1, 2, 0.0F, false));

		bone32 = new RendererModel(this);
		bone32.setRotationPoint(4.5F, 0.25F, -1.0F);
		part3.addChild(bone32);
		setRotationAngle(bone32, 0.0F, 0.0F, 0.2618F);
		bone32.cubeList.add(new ModelBox(bone32, 225, 222, -1.1901F, -4.0902F, -1.0F, 1, 7, 4, 0.0F, false));

		part4 = new RendererModel(this);
		part4.setRotationPoint(0.0F, 0.0F, 0.0F);
		UnderConsole.addChild(part4);
		setRotationAngle(part4, 0.0F, 3.1416F, 0.0F);
		part4.cubeList.add(new ModelBox(part4, 225, 222, 4.375F, -7.75F, -2.0F, 1, 4, 4, 0.0F, false));
		part4.cubeList.add(new ModelBox(part4, 225, 222, 5.375F, -8.375F, -3.0F, 6, 1, 6, 0.0F, false));
		part4.cubeList.add(new ModelBox(part4, 225, 222, 7.75F, -8.375F, -5.0F, 3, 1, 2, 0.0F, false));
		part4.cubeList.add(new ModelBox(part4, 225, 222, 7.75F, -8.375F, 3.0F, 3, 1, 2, 0.0F, false));

		bone34 = new RendererModel(this);
		bone34.setRotationPoint(4.5F, 0.25F, -1.0F);
		part4.addChild(bone34);
		setRotationAngle(bone34, 0.0F, 0.0F, 0.2618F);
		bone34.cubeList.add(new ModelBox(bone34, 225, 222, -1.1901F, -4.0902F, -1.0F, 1, 7, 4, 0.0F, false));

		part5 = new RendererModel(this);
		part5.setRotationPoint(0.0F, 0.0F, 0.0F);
		UnderConsole.addChild(part5);
		setRotationAngle(part5, 0.0F, 2.0944F, 0.0F);
		part5.cubeList.add(new ModelBox(part5, 225, 222, 4.375F, -7.75F, -2.0F, 1, 4, 4, 0.0F, false));
		part5.cubeList.add(new ModelBox(part5, 225, 222, 5.375F, -8.375F, -3.0F, 6, 1, 6, 0.0F, false));
		part5.cubeList.add(new ModelBox(part5, 225, 222, 7.75F, -8.375F, -5.0F, 3, 1, 2, 0.0F, false));
		part5.cubeList.add(new ModelBox(part5, 225, 222, 7.75F, -8.375F, 3.0F, 3, 1, 2, 0.0F, false));

		bone35 = new RendererModel(this);
		bone35.setRotationPoint(4.5F, 0.25F, -1.0F);
		part5.addChild(bone35);
		setRotationAngle(bone35, 0.0F, 0.0F, 0.2618F);
		bone35.cubeList.add(new ModelBox(bone35, 225, 222, -1.1901F, -4.0902F, -1.0F, 1, 7, 4, 0.0F, false));

		part6 = new RendererModel(this);
		part6.setRotationPoint(0.0F, 0.0F, 0.0F);
		UnderConsole.addChild(part6);
		setRotationAngle(part6, 0.0F, 1.0472F, 0.0F);
		part6.cubeList.add(new ModelBox(part6, 225, 222, 4.375F, -7.75F, -2.0F, 1, 4, 4, 0.0F, false));
		part6.cubeList.add(new ModelBox(part6, 225, 222, 5.375F, -8.375F, -3.0F, 6, 1, 6, 0.0F, false));
		part6.cubeList.add(new ModelBox(part6, 225, 222, 7.75F, -8.375F, -5.0F, 3, 1, 2, 0.0F, false));
		part6.cubeList.add(new ModelBox(part6, 225, 222, 7.75F, -8.375F, 3.0F, 3, 1, 2, 0.0F, false));

		bone36 = new RendererModel(this);
		bone36.setRotationPoint(4.5F, 0.25F, -1.0F);
		part6.addChild(bone36);
		setRotationAngle(bone36, 0.0F, 0.0F, 0.2618F);
		bone36.cubeList.add(new ModelBox(bone36, 225, 222, -1.1901F, -4.0902F, -1.0F, 1, 7, 4, 0.0F, false));

		CPanel1 = new RendererModel(this);
		CPanel1.setRotationPoint(0.0F, -0.125F, 0.0F);
		Console.addChild(CPanel1);
		setRotationAngle(CPanel1, 0.0F, 2.0944F, 0.0F);
		

		Cube78 = new RendererModel(this);
		Cube78.setRotationPoint(10.75F, -13.25F, 0.0F);
		CPanel1.addChild(Cube78);
		setRotationAngle(Cube78, 0.0F, 0.0F, 0.4363F);
		Cube78.cubeList.add(new ModelBox(Cube78, 66, 109, -2.6995F, -1.0513F, -3.0F, 2, 1, 2, 0.0F, false));
		Cube78.cubeList.add(new ModelBox(Cube78, 145, 148, -4.0886F, -1.6178F, -0.5F, 1, 1, 1, 0.125F, false));

		bone81 = new RendererModel(this);
		bone81.setRotationPoint(-10.75F, 0.5F, 0.0F);
		Cube78.addChild(bone81);
		setRotationAngle(bone81, 0.0F, -0.2618F, 0.0F);
		bone81.cubeList.add(new ModelBox(bone81, 66, 109, 8.1614F, -1.4928F, -0.5F, 2, 1, 1, 0.125F, false));

		Cube77 = new RendererModel(this);
		Cube77.setRotationPoint(10.75F, -13.25F, 0.0F);
		CPanel1.addChild(Cube77);
		setRotationAngle(Cube77, 0.0F, 0.0F, 0.8727F);
		Cube77.cubeList.add(new ModelBox(Cube77, 104, 157, -0.6466F, -0.938F, -4.0F, 2, 1, 5, 0.0F, false));
		Cube77.cubeList.add(new ModelBox(Cube77, 66, 109, 0.3534F, -0.938F, 1.375F, 1, 1, 3, 0.0F, false));

		CEdge2 = new RendererModel(this);
		CEdge2.setRotationPoint(0.0F, -1.0F, 0.0F);
		Console.addChild(CEdge2);
		setRotationAngle(CEdge2, 0.0F, 1.0472F, 0.0F);
		

		Rotation2 = new RendererModel(this);
		Rotation2.setRotationPoint(0.0F, -15.6995F, -10.9546F);
		CEdge2.addChild(Rotation2);
		setRotationAngle(Rotation2, 0.9599F, 0.0F, 0.0F);
		Rotation2.cubeList.add(new ModelBox(Rotation2, 60, 118, -1.0F, -1.875F, -5.625F, 2, 1, 2, -0.125F, false));

		Rotation3 = new RendererModel(this);
		Rotation3.setRotationPoint(0.0F, -14.1995F, -10.9546F);
		CEdge2.addChild(Rotation3);
		setRotationAngle(Rotation3, 0.5236F, 0.0F, 0.0F);
		Rotation3.cubeList.add(new ModelBox(Rotation3, 60, 118, -1.5F, -1.5F, -3.125F, 2, 1, 2, -0.125F, false));

		bone82 = new RendererModel(this);
		bone82.setRotationPoint(0.0F, -11.6026F, 9.7671F);
		Rotation3.addChild(bone82);
		setRotationAngle(bone82, -0.2618F, 0.0F, 0.0F);
		bone82.cubeList.add(new ModelBox(bone82, 73, 113, -1.0F, 12.4009F, -6.8147F, 1, 1, 3, 0.0F, false));
		bone82.cubeList.add(new ModelBox(bone82, 177, 156, -1.25F, 11.6551F, -4.7824F, 1, 2, 1, -0.375F, false));
		bone82.cubeList.add(new ModelBox(bone82, 177, 156, -1.25F, 11.6551F, -5.2824F, 1, 2, 1, -0.375F, false));
		bone82.cubeList.add(new ModelBox(bone82, 177, 156, -0.75F, 11.6551F, -5.2824F, 1, 2, 1, -0.375F, false));
		bone82.cubeList.add(new ModelBox(bone82, 177, 156, -1.25F, 11.6551F, -5.6574F, 1, 2, 1, -0.375F, false));
		bone82.cubeList.add(new ModelBox(bone82, 177, 156, -0.75F, 11.6551F, -5.6574F, 1, 2, 1, -0.375F, false));
		bone82.cubeList.add(new ModelBox(bone82, 177, 156, -1.25F, 11.6551F, -6.0324F, 1, 2, 1, -0.375F, false));
		bone82.cubeList.add(new ModelBox(bone82, 177, 156, -0.75F, 11.6551F, -6.0324F, 1, 2, 1, -0.375F, false));
		bone82.cubeList.add(new ModelBox(bone82, 177, 156, -1.25F, 11.6551F, -6.4074F, 1, 2, 1, -0.375F, false));
		bone82.cubeList.add(new ModelBox(bone82, 177, 156, -0.75F, 11.6551F, -6.4074F, 1, 2, 1, -0.375F, false));
		bone82.cubeList.add(new ModelBox(bone82, 177, 156, -1.25F, 11.6551F, -6.7824F, 1, 2, 1, -0.375F, false));
		bone82.cubeList.add(new ModelBox(bone82, 177, 156, -0.75F, 11.6551F, -6.7824F, 1, 2, 1, -0.375F, false));

		bone83 = new RendererModel(this);
		bone83.setRotationPoint(0.0F, -11.6026F, 9.7671F);
		Rotation3.addChild(bone83);
		setRotationAngle(bone83, -0.2618F, 0.0F, 0.0F);
		bone83.cubeList.add(new ModelBox(bone83, 68, 114, -0.5F, 12.1594F, -4.0F, 2, 1, 2, -0.25F, false));

		Rotation4 = new RendererModel(this);
		Rotation4.setRotationPoint(0.0F, -14.8245F, -10.9546F);
		CEdge2.addChild(Rotation4);
		setRotationAngle(Rotation4, 0.4363F, 0.0F, 0.0F);
		Rotation4.cubeList.add(new ModelBox(Rotation4, 68, 114, 0.375F, -1.375F, 0.5F, 1, 1, 1, -0.25F, false));
		Rotation4.cubeList.add(new ModelBox(Rotation4, 196, 166, 0.375F, -1.375F, -3.125F, 1, 1, 4, -0.125F, false));

		Rotation11 = new RendererModel(this);
		Rotation11.setRotationPoint(0.0F, -14.6995F, 0.0F);
		CEdge2.addChild(Rotation11);
		setRotationAngle(Rotation11, 0.2618F, -2.0944F, 0.0F);
		Rotation11.cubeList.add(new ModelBox(Rotation11, 36, 165, -1.125F, -4.375F, -6.7046F, 1, 1, 1, -0.25F, false));
		Rotation11.cubeList.add(new ModelBox(Rotation11, 196, 166, -1.125F, -4.375F, -10.3296F, 1, 1, 4, -0.125F, false));
		Rotation11.cubeList.add(new ModelBox(Rotation11, 54, 111, 0.125F, -4.375F, -9.9546F, 1, 1, 1, -0.125F, false));

		CEdge3 = new RendererModel(this);
		CEdge3.setRotationPoint(0.0F, -1.0F, 0.0F);
		Console.addChild(CEdge3);
		setRotationAngle(CEdge3, 0.0F, 2.0944F, 0.0F);
		

		Rotation8 = new RendererModel(this);
		Rotation8.setRotationPoint(0.0F, -14.1995F, -10.9546F);
		CEdge3.addChild(Rotation8);
		setRotationAngle(Rotation8, 0.5236F, 0.0F, 0.0F);
		

		bone88 = new RendererModel(this);
		bone88.setRotationPoint(0.0F, -11.6026F, 9.7671F);
		Rotation8.addChild(bone88);
		setRotationAngle(bone88, -0.2618F, 0.0F, 0.0F);
		bone88.cubeList.add(new ModelBox(bone88, 180, 155, -0.5F, 11.9094F, -6.0F, 2, 2, 2, -0.375F, false));
		bone88.cubeList.add(new ModelBox(bone88, 180, 155, -0.5F, 11.0344F, -6.0F, 2, 2, 2, -0.5F, false));
		bone88.cubeList.add(new ModelBox(bone88, 101, 161, -2.25F, 11.0344F, -4.25F, 3, 2, 2, -0.625F, false));
		bone88.cubeList.add(new ModelBox(bone88, 56, 106, -0.25F, 11.5344F, -3.75F, 1, 1, 1, -0.1F, false));
		bone88.cubeList.add(new ModelBox(bone88, 56, 106, -2.25F, 11.5344F, -3.75F, 1, 1, 1, -0.1F, false));
		bone88.cubeList.add(new ModelBox(bone88, 56, 106, -2.5F, 11.5344F, -3.75F, 1, 1, 1, -0.225F, false));
		bone88.cubeList.add(new ModelBox(bone88, 180, 155, -0.5F, 10.5344F, -6.0F, 2, 2, 2, -0.75F, false));

		bone103 = new RendererModel(this);
		bone103.setRotationPoint(-2.25F, 12.0344F, -3.25F);
		bone88.addChild(bone103);
		setRotationAngle(bone103, 0.0F, 0.0F, -0.3491F);
		bone103.cubeList.add(new ModelBox(bone103, 115, 165, -1.25F, -0.5F, -0.5F, 2, 1, 1, -0.35F, false));

		CPanel2 = new RendererModel(this);
		CPanel2.setRotationPoint(0.0F, -0.125F, 0.0F);
		Console.addChild(CPanel2);
		setRotationAngle(CPanel2, 0.0F, 3.1416F, 0.0F);
		

		Cube81 = new RendererModel(this);
		Cube81.setRotationPoint(10.75F, -13.25F, 0.0F);
		CPanel2.addChild(Cube81);
		setRotationAngle(Cube81, 0.0F, 0.0F, 0.4363F);
		Cube81.cubeList.add(new ModelBox(Cube81, 59, 113, -4.2774F, -1.0889F, -2.0F, 3, 1, 1, 0.125F, false));
		Cube81.cubeList.add(new ModelBox(Cube81, 203, 179, -4.2774F, -1.7139F, -2.0F, 3, 1, 1, 0.0F, false));
		Cube81.cubeList.add(new ModelBox(Cube81, 55, 111, -4.0886F, -1.6178F, -0.5F, 1, 1, 1, 0.125F, false));

		bone89 = new RendererModel(this);
		bone89.setRotationPoint(0.5F, 0.5F, 1.375F);
		Cube81.addChild(bone89);
		bone89.cubeList.add(new ModelBox(bone89, 211, 180, 0.5859F, -1.6295F, -1.0227F, 1, 2, 1, -0.4F, false));
		bone89.cubeList.add(new ModelBox(bone89, 211, 180, 0.5859F, -1.6295F, -0.3977F, 1, 2, 1, -0.4F, false));
		bone89.cubeList.add(new ModelBox(bone89, 66, 113, 0.5859F, -1.2545F, -0.3977F, 1, 2, 1, -0.375F, false));
		bone89.cubeList.add(new ModelBox(bone89, 66, 113, 0.5859F, -1.2545F, -1.0227F, 1, 2, 1, -0.375F, false));

		bone90 = new RendererModel(this);
		bone90.setRotationPoint(-10.75F, 0.5F, 1.875F);
		Cube81.addChild(bone90);
		setRotationAngle(bone90, 0.0F, -0.0873F, 0.0F);
		bone90.cubeList.add(new ModelBox(bone90, 55, 111, 8.1385F, -1.7662F, -0.0273F, 2, 2, 1, -0.25F, false));
		bone90.cubeList.add(new ModelBox(bone90, 66, 113, 9.0859F, -2.0045F, -0.0227F, 1, 2, 1, -0.375F, false));
		bone90.cubeList.add(new ModelBox(bone90, 178, 176, 9.0859F, -2.3795F, -0.0227F, 1, 2, 1, -0.4F, false));
		bone90.cubeList.add(new ModelBox(bone90, 55, 111, 8.1385F, -1.7662F, -0.6523F, 2, 2, 1, -0.25F, false));
		bone90.cubeList.add(new ModelBox(bone90, 66, 113, 9.0859F, -2.0045F, -0.6477F, 1, 2, 1, -0.375F, false));
		bone90.cubeList.add(new ModelBox(bone90, 178, 176, 9.0859F, -2.3795F, -0.6477F, 1, 2, 1, -0.4F, false));

		Cube82 = new RendererModel(this);
		Cube82.setRotationPoint(10.75F, -13.25F, 0.0F);
		CPanel2.addChild(Cube82);
		setRotationAngle(Cube82, 0.0F, 0.0F, 0.8727F);
		Cube82.cubeList.add(new ModelBox(Cube82, 68, 116, -0.7716F, -1.188F, 2.0F, 2, 1, 2, -0.25F, false));
		Cube82.cubeList.add(new ModelBox(Cube82, 68, 116, -0.7716F, -1.188F, 0.125F, 2, 1, 2, -0.25F, false));
		Cube82.cubeList.add(new ModelBox(Cube82, 68, 116, 0.3534F, -0.938F, -2.5F, 1, 1, 1, 0.0F, false));

		bone91 = new RendererModel(this);
		bone91.setRotationPoint(0.5F, 0.5F, -0.75F);
		Cube82.addChild(bone91);
		setRotationAngle(bone91, 0.0F, 0.0F, -0.4363F);
		bone91.cubeList.add(new ModelBox(bone91, 70, 112, -2.7716F, -1.938F, 0.625F, 2, 1, 2, -0.25F, false));
		bone91.cubeList.add(new ModelBox(bone91, 70, 112, -2.5216F, -2.938F, 0.875F, 2, 2, 2, -0.7F, false));
		bone91.cubeList.add(new ModelBox(bone91, 70, 112, -2.3966F, -2.938F, 0.875F, 3, 2, 2, -0.925F, false));
		bone91.cubeList.add(new ModelBox(bone91, 66, 122, -1.2466F, -2.938F, 0.875F, 2, 3, 2, -0.925F, false));
		bone91.cubeList.add(new ModelBox(bone91, 70, 112, -2.7716F, -2.938F, 0.25F, 2, 2, 2, -0.75F, false));

		bone92 = new RendererModel(this);
		bone92.setRotationPoint(0.8522F, 0.4692F, -0.5F);
		Cube82.addChild(bone92);
		setRotationAngle(bone92, 0.0F, 0.0F, -0.2618F);
		bone92.cubeList.add(new ModelBox(bone92, 244, 184, -1.3812F, -1.5119F, -2.0F, 1, 1, 1, 0.125F, false));

		CPanel3 = new RendererModel(this);
		CPanel3.setRotationPoint(0.0F, -0.125F, 0.0F);
		Console.addChild(CPanel3);
		setRotationAngle(CPanel3, 0.0F, -2.0944F, 0.0F);
		

		Cube79 = new RendererModel(this);
		Cube79.setRotationPoint(10.75F, -13.25F, 0.0F);
		CPanel3.addChild(Cube79);
		setRotationAngle(Cube79, 0.0F, 0.0F, 0.4363F);
		Cube79.cubeList.add(new ModelBox(Cube79, 170, 222, -4.0886F, -0.7428F, -0.5F, 1, 1, 1, 0.375F, false));

		bone84 = new RendererModel(this);
		bone84.setRotationPoint(0.5F, 0.5F, -0.5F);
		Cube79.addChild(bone84);
		setRotationAngle(bone84, 0.0F, -0.1745F, 0.4363F);
		bone84.cubeList.add(new ModelBox(bone84, 58, 117, -0.3386F, -0.9928F, 4.0F, 2, 2, 1, 0.125F, false));

		bone87 = new RendererModel(this);
		bone87.setRotationPoint(0.5F, 0.5F, -0.5F);
		Cube79.addChild(bone87);
		setRotationAngle(bone87, 0.0F, 0.1745F, 0.4363F);
		bone87.cubeList.add(new ModelBox(bone87, 58, 117, -0.3386F, -0.9928F, -4.0F, 2, 2, 1, 0.125F, false));

		bone86 = new RendererModel(this);
		bone86.setRotationPoint(0.5F, 0.5F, -0.75F);
		Cube79.addChild(bone86);
		bone86.cubeList.add(new ModelBox(bone86, 61, 99, -3.5216F, -1.938F, -2.125F, 2, 1, 2, -0.25F, false));
		bone86.cubeList.add(new ModelBox(bone86, 103, 176, -3.5216F, -2.313F, -2.125F, 2, 1, 2, -0.375F, false));

		bone85 = new RendererModel(this);
		bone85.setRotationPoint(0.0F, 0.0F, 0.25F);
		bone86.addChild(bone85);
		setRotationAngle(bone85, 0.0F, 0.0F, 0.4363F);
		bone85.cubeList.add(new ModelBox(bone85, 153, 222, -0.0216F, -0.938F, -2.5F, 1, 1, 2, 0.25F, false));
		bone85.cubeList.add(new ModelBox(bone85, 153, 222, -0.0216F, -1.063F, 0.25F, 1, 1, 2, 0.125F, false));

		Cube80 = new RendererModel(this);
		Cube80.setRotationPoint(10.75F, -13.25F, 0.0F);
		CPanel3.addChild(Cube80);
		setRotationAngle(Cube80, 0.0F, 0.0F, 0.6109F);
		Cube80.cubeList.add(new ModelBox(Cube80, 66, 120, -1.3966F, -1.438F, 0.5F, 2, 1, 2, -0.25F, false));
		Cube80.cubeList.add(new ModelBox(Cube80, 171, 174, -1.3966F, -1.188F, -3.0F, 2, 1, 6, -0.125F, false));
		Cube80.cubeList.add(new ModelBox(Cube80, 119, 166, -1.3966F, -1.813F, -1.0F, 2, 2, 2, -0.625F, false));
		Cube80.cubeList.add(new ModelBox(Cube80, 116, 175, -3.6466F, -1.563F, 0.75F, 2, 2, 2, -0.625F, false));
		Cube80.cubeList.add(new ModelBox(Cube80, 116, 175, -4.5216F, -1.563F, 0.75F, 2, 2, 2, -0.625F, false));
		Cube80.cubeList.add(new ModelBox(Cube80, 220, 206, -1.3966F, -2.063F, -1.0F, 2, 2, 2, -0.75F, false));
		Cube80.cubeList.add(new ModelBox(Cube80, 108, 165, -3.6466F, -1.813F, 0.75F, 2, 2, 2, -0.75F, false));
		Cube80.cubeList.add(new ModelBox(Cube80, 108, 165, -4.5216F, -1.813F, 0.75F, 2, 2, 2, -0.75F, false));
		Cube80.cubeList.add(new ModelBox(Cube80, 66, 120, -1.3966F, -1.438F, -2.5F, 2, 1, 2, -0.25F, false));

		CEdge4 = new RendererModel(this);
		CEdge4.setRotationPoint(0.0F, -1.0F, 0.0F);
		Console.addChild(CEdge4);
		setRotationAngle(CEdge4, 0.0F, 3.1416F, 0.0F);
		

		Rotation7 = new RendererModel(this);
		Rotation7.setRotationPoint(0.0F, -15.6995F, -10.9546F);
		CEdge4.addChild(Rotation7);
		setRotationAngle(Rotation7, 0.6109F, 0.0F, 0.0F);
		Rotation7.cubeList.add(new ModelBox(Rotation7, 66, 116, -1.0F, -0.625F, -4.625F, 2, 1, 2, -0.125F, false));

		Rotation10 = new RendererModel(this);
		Rotation10.setRotationPoint(0.0F, -14.8245F, -10.9546F);
		CEdge4.addChild(Rotation10);
		setRotationAngle(Rotation10, 0.4363F, 0.0F, 0.0F);
		Rotation10.cubeList.add(new ModelBox(Rotation10, 174, 216, -1.0F, -1.4243F, -4.3499F, 2, 1, 1, -0.375F, false));
		Rotation10.cubeList.add(new ModelBox(Rotation10, 66, 116, -1.0F, -1.1743F, -4.3499F, 1, 2, 1, -0.375F, false));
		Rotation10.cubeList.add(new ModelBox(Rotation10, 66, 116, 0.0F, -1.1743F, -4.3499F, 1, 2, 1, -0.375F, false));

		CPanel4 = new RendererModel(this);
		CPanel4.setRotationPoint(0.0F, -0.125F, 0.0F);
		Console.addChild(CPanel4);
		setRotationAngle(CPanel4, 0.0F, -1.0472F, 0.0F);
		

		Rotation9 = new RendererModel(this);
		Rotation9.setRotationPoint(0.0F, -15.6995F, 0.0F);
		CPanel4.addChild(Rotation9);
		setRotationAngle(Rotation9, 0.4363F, -1.3963F, 0.0F);
		Rotation9.cubeList.add(new ModelBox(Rotation9, 180, 153, -0.125F, -4.125F, -7.9546F, 1, 1, 1, -0.25F, false));
		Rotation9.cubeList.add(new ModelBox(Rotation9, 201, 172, -0.125F, -4.125F, -10.5796F, 1, 1, 3, -0.125F, false));

		Cube83 = new RendererModel(this);
		Cube83.setRotationPoint(10.75F, -13.25F, 0.0F);
		CPanel4.addChild(Cube83);
		setRotationAngle(Cube83, 0.0F, 0.0F, 0.4363F);
		Cube83.cubeList.add(new ModelBox(Cube83, 90, 98, -2.6995F, -1.0513F, -3.0F, 2, 1, 1, 0.0F, false));
		Cube83.cubeList.add(new ModelBox(Cube83, 144, 148, -1.6995F, -1.5513F, -3.0F, 1, 1, 1, -0.375F, false));
		Cube83.cubeList.add(new ModelBox(Cube83, 209, 184, -2.0745F, -1.5513F, -3.0F, 1, 1, 1, -0.375F, false));
		Cube83.cubeList.add(new ModelBox(Cube83, 39, 212, -2.4495F, -1.5513F, -3.0F, 1, 1, 1, -0.375F, false));
		Cube83.cubeList.add(new ModelBox(Cube83, 139, 176, -2.8245F, -1.5513F, -3.0F, 1, 1, 1, -0.375F, false));
		Cube83.cubeList.add(new ModelBox(Cube83, 148, 149, -4.0886F, -1.6178F, -0.5F, 1, 1, 1, 0.125F, false));

		Cube84 = new RendererModel(this);
		Cube84.setRotationPoint(10.75F, -13.25F, 0.0F);
		CPanel4.addChild(Cube84);
		setRotationAngle(Cube84, 0.0F, 0.0F, 0.8727F);
		Cube84.cubeList.add(new ModelBox(Cube84, 91, 165, -0.6466F, -0.938F, -2.0F, 2, 1, 2, 0.0F, false));
		Cube84.cubeList.add(new ModelBox(Cube84, 173, 148, -0.6466F, -1.063F, -4.25F, 2, 1, 2, -0.125F, false));
		Cube84.cubeList.add(new ModelBox(Cube84, 162, 216, -0.6466F, -0.938F, 2.625F, 2, 1, 1, 0.0F, false));

		CEdge5 = new RendererModel(this);
		CEdge5.setRotationPoint(0.0F, -1.0F, 0.0F);
		Console.addChild(CEdge5);
		setRotationAngle(CEdge5, 0.0F, -2.0944F, 0.0F);
		

		Rotation12 = new RendererModel(this);
		Rotation12.setRotationPoint(0.0F, -14.8245F, -10.9546F);
		CEdge5.addChild(Rotation12);
		setRotationAngle(Rotation12, 0.4363F, 0.0F, 0.0F);
		Rotation12.cubeList.add(new ModelBox(Rotation12, 179, 215, -1.0F, -1.4243F, -4.3499F, 2, 1, 1, -0.375F, false));
		Rotation12.cubeList.add(new ModelBox(Rotation12, 52, 97, -1.0F, -1.7993F, -3.5999F, 2, 2, 2, -0.5F, false));
		Rotation12.cubeList.add(new ModelBox(Rotation12, 52, 97, -1.5F, -1.7993F, -1.7249F, 2, 2, 2, -0.625F, false));
		Rotation12.cubeList.add(new ModelBox(Rotation12, 52, 97, -1.75F, -1.5493F, -2.5999F, 2, 2, 2, -0.875F, false));
		Rotation12.cubeList.add(new ModelBox(Rotation12, 52, 97, -0.375F, -1.4243F, -2.3499F, 2, 2, 3, -0.625F, false));
		Rotation12.cubeList.add(new ModelBox(Rotation12, 60, 107, -1.0F, -1.1743F, -4.3499F, 1, 2, 1, -0.375F, false));
		Rotation12.cubeList.add(new ModelBox(Rotation12, 60, 107, 0.0F, -1.1743F, -4.3499F, 1, 2, 1, -0.375F, false));

		CPanel5 = new RendererModel(this);
		CPanel5.setRotationPoint(0.0F, -0.125F, 0.0F);
		Console.addChild(CPanel5);
		

		Cube85 = new RendererModel(this);
		Cube85.setRotationPoint(10.75F, -13.25F, 0.0F);
		CPanel5.addChild(Cube85);
		setRotationAngle(Cube85, 0.0F, 0.0F, 0.4363F);
		Cube85.cubeList.add(new ModelBox(Cube85, 92, 162, -4.0886F, -0.7428F, -0.5F, 1, 1, 1, 0.375F, false));

		bone97 = new RendererModel(this);
		bone97.setRotationPoint(0.5F, 0.5F, -0.5F);
		Cube85.addChild(bone97);
		setRotationAngle(bone97, 0.0F, -0.1745F, 0.4363F);
		bone97.cubeList.add(new ModelBox(bone97, 49, 116, 0.1614F, -1.1178F, 3.75F, 1, 2, 1, 0.375F, false));
		bone97.cubeList.add(new ModelBox(bone97, 96, 159, 0.1614F, -1.6178F, 3.75F, 1, 3, 1, 0.25F, false));

		bone99 = new RendererModel(this);
		bone99.setRotationPoint(0.5F, 0.5F, -0.75F);
		Cube85.addChild(bone99);
		bone99.cubeList.add(new ModelBox(bone99, 71, 110, -3.3479F, -2.157F, -1.0F, 2, 2, 4, -0.5F, false));

		Cube86 = new RendererModel(this);
		Cube86.setRotationPoint(10.75F, -13.25F, 0.0F);
		CPanel5.addChild(Cube86);
		setRotationAngle(Cube86, 0.0F, 0.0F, 0.6109F);
		

		bone101 = new RendererModel(this);
		bone101.setRotationPoint(0.2235F, 0.541F, -0.5F);
		Cube86.addChild(bone101);
		setRotationAngle(bone101, 0.0F, 0.0F, 0.2618F);
		bone101.cubeList.add(new ModelBox(bone101, 230, 174, -0.7716F, -1.563F, -3.75F, 2, 1, 6, -0.125F, false));
		bone101.cubeList.add(new ModelBox(bone101, 230, 174, -0.2716F, -2.438F, -3.875F, 2, 2, 2, -0.875F, false));
		bone101.cubeList.add(new ModelBox(bone101, 49, 116, -0.2716F, -2.813F, -3.875F, 2, 3, 2, -0.9F, false));
		bone101.cubeList.add(new ModelBox(bone101, 230, 174, -0.2716F, -2.438F, -1.5F, 2, 2, 2, -0.875F, false));
		bone101.cubeList.add(new ModelBox(bone101, 49, 116, -0.2716F, -2.813F, -1.5F, 2, 3, 2, -0.9F, false));
		bone101.cubeList.add(new ModelBox(bone101, 230, 174, -0.2716F, -2.438F, -0.5F, 2, 2, 2, -0.875F, false));
		bone101.cubeList.add(new ModelBox(bone101, 49, 116, -0.2716F, -2.813F, -0.5F, 2, 3, 2, -0.9F, false));
		bone101.cubeList.add(new ModelBox(bone101, 230, 174, -0.2716F, -2.438F, -3.5F, 2, 2, 2, -0.875F, false));
		bone101.cubeList.add(new ModelBox(bone101, 49, 116, -0.2716F, -2.813F, -3.5F, 2, 3, 2, -0.9F, false));
		bone101.cubeList.add(new ModelBox(bone101, 230, 174, -0.2716F, -2.438F, -1.125F, 2, 2, 2, -0.875F, false));
		bone101.cubeList.add(new ModelBox(bone101, 49, 116, -0.2716F, -2.813F, -1.125F, 2, 3, 2, -0.9F, false));
		bone101.cubeList.add(new ModelBox(bone101, 230, 174, -0.2716F, -2.438F, -0.125F, 2, 2, 2, -0.875F, false));
		bone101.cubeList.add(new ModelBox(bone101, 49, 116, -0.2716F, -2.813F, -0.125F, 2, 3, 2, -0.9F, false));

		CPanel6 = new RendererModel(this);
		CPanel6.setRotationPoint(0.0F, -0.125F, 0.0F);
		Console.addChild(CPanel6);
		setRotationAngle(CPanel6, 0.0F, 1.0472F, 0.0F);
		

		Cube87 = new RendererModel(this);
		Cube87.setRotationPoint(10.75F, -13.25F, 0.0F);
		CPanel6.addChild(Cube87);
		setRotationAngle(Cube87, 0.0F, 0.0F, 0.4363F);
		Cube87.cubeList.add(new ModelBox(Cube87, 207, 182, -0.5886F, -1.3678F, 1.75F, 1, 1, 1, 0.125F, false));
		Cube87.cubeList.add(new ModelBox(Cube87, 103, 176, -1.5886F, -1.1178F, 0.0F, 1, 1, 1, 0.125F, false));
		Cube87.cubeList.add(new ModelBox(Cube87, 161, 217, -4.1749F, -0.8209F, -1.375F, 1, 1, 1, 0.25F, false));
		Cube87.cubeList.add(new ModelBox(Cube87, 239, 180, -1.1749F, -0.8209F, -3.625F, 1, 1, 1, 0.25F, false));

		bone102 = new RendererModel(this);
		bone102.setRotationPoint(0.5F, 0.5F, -0.5F);
		Cube87.addChild(bone102);
		setRotationAngle(bone102, 0.0F, 0.0F, 0.4363F);
		bone102.cubeList.add(new ModelBox(bone102, 156, 210, -0.5886F, -0.8678F, -0.5F, 1, 1, 1, 0.25F, false));
	}

	public void render(ConsoleTile tile) {


		net.tardis.mod.controls.RandomiserControl randomiserControl = tile.getControl(RandomiserControl.class);
		this.Wheel.rotateAngleX = (float) Math.toRadians(randomiserControl.getAnimationProgress() * 720.0F );

		Direction consoleFacing = tile.getExteriorDirection();
		if (consoleFacing == Direction.SOUTH) {
			Rotor.rotateAngleY = (float) Math.toRadians(0f);
		} else if (consoleFacing == Direction.NORTH) {
			Rotor.rotateAngleY = (float) Math.toRadians(180f);
		} else if (consoleFacing == Direction.EAST) {
			Rotor.rotateAngleY = (float) Math.toRadians(270f);
		}else if (consoleFacing == Direction.WEST) {
			Rotor.rotateAngleY = (float) Math.toRadians(90f);
		}

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
		if (landingTypeControl.getLandType() == LandingTypeControl.EnumLandType.DOWN) {
			PumoHandle2.offsetY = 0.0F;
			PumoHandle2.offsetZ = 0.00F;
		} else {
			PumoHandle2.offsetY = -0.1355F;
			PumoHandle2.offsetZ = -0.035F;
		}


		this.Upper.offsetY = 0.275f - ((float)Math.cos((double)tile.flightTicks * 0.1D)) * 0.275F;
        this.Lower.offsetY = - 0.275f + (float)Math.cos((double)tile.flightTicks * 0.1D) * 0.275F;

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
		this.SmallLever2.rotateAngleX = -0.1F + throttleA.getAmount() * 60;
		tile.getDoor().ifPresent(door -> {
			this.HPivot.rotateAngleX = (float) Math.toRadians(door.getOpenState() == EnumDoorState.CLOSED ? 30F : 0F);
		});

		IncModControl inc = tile.getControl(IncModControl.class);
		this.SmallLever.rotateAngleX = (float) Math.toRadians(((inc.index / (float)IncModControl.COORD_MODS.length) * -180f) - 20f);

		XControl x = tile.getControl(XControl.class);
		//this.x.offsetY = x.getAnimationTicks() == 0 ? 0 : 0.006F;

		YControl y = tile.getControl(YControl.class);
		//this.y.offsetY = y.getAnimationTicks() == 0 ? 0 : 0.006F;

		ZControl z = tile.getControl(ZControl.class);
		//this.z.offsetY = z.getAnimationTicks() == 0 ? 0 : 0.006F;

		AllConsole.render(0.0625F);

		GlStateManager.pushMatrix();

		GlStateManager.translated(-0.12, 0.555, -0.68);
		GlStateManager.rotated(0, 1, 0, 0);

		//TODO Find out wtf this below is
		//WorldText text = new WorldText(0.22F, 0.15F, 0.002F, 0xFFFFFF);
		//text.renderMonitor(Helper.getConsoleText(tile));

		GlStateManager.scaled(0.4D, 0.3D, 0.4D); //Size of sonic in port
		GlStateManager.translated(1.25, -0.75, 2.55); //Location XYZ
		GlStateManager.rotated(180d, -0.0, 0.0D, 0.05); //Rotation
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
