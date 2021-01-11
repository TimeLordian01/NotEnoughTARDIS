package com.thevale.moretimecapsulesmod.client.models.exteriors;// Made with Blockbench 3.7.4
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

public class Fenix_Exterior extends EntityModel {
	private final RendererModel box_body;
	private final RendererModel pbs;
	private final RendererModel lampposts;
	private final RendererModel bone3;
	private final RendererModel bone5;
	private final RendererModel bone;
	private final RendererModel bone4;
	private final RendererModel pillers;
	private final RendererModel bone2;
	private final RendererModel walls;
	private final RendererModel doorborders;
	private final RendererModel windows;
	private final RendererModel glass;
	private final RendererModel wall_doors;
	private final RendererModel lamp;
	private final RendererModel boti;
	private final RendererModel r_door;
	private final RendererModel window2;
	private final RendererModel l_door;
	private final RendererModel window;

	public Fenix_Exterior() {
		textureWidth = 512;
		textureHeight = 512;

		box_body = new RendererModel(this);
		box_body.setRotationPoint(0.0F, 24.0F, 0.0F);
		box_body.cubeList.add(new ModelBox(box_body, 0, 0, -19.5F, -3.0F, -19.5F, 39, 3, 39, 0.0F, false));
		box_body.cubeList.add(new ModelBox(box_body, 0, 77, -16.5F, -71.0F, -16.5F, 33, 5, 33, 0.0F, false));
		box_body.cubeList.add(new ModelBox(box_body, 0, 42, -17.0F, -66.0F, -17.0F, 34, 1, 34, 0.0F, false));
		box_body.cubeList.add(new ModelBox(box_body, 10, 42, -2.5F, -73.0F, -2.5F, 5, 2, 5, 0.0F, false));
		box_body.cubeList.add(new ModelBox(box_body, 13, 68, -2.5F, -77.0F, -2.5F, 5, 1, 5, 0.0F, false));

		pbs = new RendererModel(this);
		pbs.setRotationPoint(0.0F, -8.0F, 0.0F);
		box_body.addChild(pbs);
		pbs.cubeList.add(new ModelBox(pbs, 99, 90, -15.5F, -57.0F, -19.5F, 31, 5, 3, 0.0F, false));
		pbs.cubeList.add(new ModelBox(pbs, 99, 82, -15.5F, -57.0F, 16.5F, 31, 5, 3, 0.0F, false));
		pbs.cubeList.add(new ModelBox(pbs, 101, 101, 16.5F, -57.0F, -15.5F, 3, 5, 31, 0.0F, false));
		pbs.cubeList.add(new ModelBox(pbs, 105, 46, -19.5F, -57.0F, -15.5F, 3, 5, 31, 0.0F, false));

		lampposts = new RendererModel(this);
		lampposts.setRotationPoint(-1.5F, -74.0F, -1.5F);
		box_body.addChild(lampposts);
		

		bone3 = new RendererModel(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		lampposts.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.7854F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 22, 14, 0.0F, -2.0F, -0.6464F, 0, 3, 1, 0.0F, false));

		bone5 = new RendererModel(this);
		bone5.setRotationPoint(0.0F, 0.0F, 3.0F);
		lampposts.addChild(bone5);
		setRotationAngle(bone5, 0.0F, -0.7854F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 22, 4, 0.0F, -2.0F, -0.3536F, 0, 3, 1, 0.0F, false));

		bone = new RendererModel(this);
		bone.setRotationPoint(3.0F, 0.0F, 0.0F);
		lampposts.addChild(bone);
		setRotationAngle(bone, 0.0F, -0.7854F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 22, 21, 0.0F, -2.0F, -0.6464F, 0, 3, 1, 0.0F, false));

		bone4 = new RendererModel(this);
		bone4.setRotationPoint(3.0F, 0.0F, 3.0F);
		lampposts.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.7854F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 22, 9, 0.0F, -2.0F, -0.3536F, 0, 3, 1, 0.0F, false));

		pillers = new RendererModel(this);
		pillers.setRotationPoint(0.0F, -8.0F, 0.0F);
		box_body.addChild(pillers);
		pillers.cubeList.add(new ModelBox(pillers, 138, 138, 14.5F, -59.0F, 14.5F, 4, 64, 4, 0.0F, false));
		pillers.cubeList.add(new ModelBox(pillers, 78, 146, -18.5F, -59.0F, -18.5F, 4, 64, 4, 0.0F, false));
		pillers.cubeList.add(new ModelBox(pillers, 122, 137, -18.5F, -59.0F, 14.5F, 4, 64, 4, 0.0F, false));
		pillers.cubeList.add(new ModelBox(pillers, 62, 146, 14.5F, -59.0F, -18.5F, 4, 64, 4, 0.0F, false));

		bone2 = new RendererModel(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		pillers.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 22, 5, 14.5F, -61.0F, 14.5F, 3, 2, 3, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 22, 15, -17.5F, -61.0F, -17.5F, 3, 2, 3, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 22, 0, -17.5F, -61.0F, 14.5F, 3, 2, 3, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 22, 10, 14.5F, -61.0F, -17.5F, 3, 2, 3, 0.0F, false));

		walls = new RendererModel(this);
		walls.setRotationPoint(0.0F, -8.0F, 0.0F);
		box_body.addChild(walls);
		

		doorborders = new RendererModel(this);
		doorborders.setRotationPoint(0.0F, 0.0F, 0.0F);
		walls.addChild(doorborders);
		doorborders.cubeList.add(new ModelBox(doorborders, 62, 115, -17.25F, -52.0F, -14.5F, 1, 2, 29, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 102, 193, -17.25F, -50.0F, -14.5F, 1, 55, 1, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 98, 193, -17.25F, -50.0F, 13.5F, 1, 55, 1, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 102, 42, -14.5F, -52.0F, -17.25F, 29, 2, 1, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 99, 98, -14.5F, -52.0F, 16.25F, 29, 2, 1, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 117, 0, 16.25F, -52.0F, -14.5F, 1, 2, 29, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 197, 0, -14.5F, -50.0F, -17.25F, 1, 55, 1, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 193, 0, -14.5F, -50.0F, 16.25F, 1, 55, 1, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 106, 193, 16.25F, -50.0F, 13.5F, 1, 55, 1, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 195, 112, 13.5F, -50.0F, -17.25F, 1, 55, 1, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 193, 56, 13.5F, -50.0F, 16.25F, 1, 55, 1, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 110, 193, 16.25F, -50.0F, -14.5F, 1, 55, 1, 0.0F, false));

		windows = new RendererModel(this);
		windows.setRotationPoint(0.0F, 8.0F, 0.0F);
		walls.addChild(windows);
		windows.cubeList.add(new ModelBox(windows, 201, 33, 15.25F, -56.0F, -12.5F, 1, 1, 10, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 200, 161, -16.25F, -56.0F, -12.5F, 1, 1, 10, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 105, 115, -12.5F, -56.0F, 15.25F, 10, 1, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 201, 0, 15.25F, -56.0F, 2.5F, 1, 1, 10, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 200, 46, -16.25F, -56.0F, 2.5F, 1, 1, 10, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 0, 108, 2.5F, -56.0F, 15.25F, 10, 1, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 201, 22, 15.25F, -46.0F, -12.5F, 1, 1, 10, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 199, 150, -16.25F, -46.0F, -12.5F, 1, 1, 10, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 102, 74, -12.5F, -46.0F, 15.25F, 10, 1, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 201, 11, 15.25F, -46.0F, 2.5F, 1, 1, 10, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 12, 28, -16.25F, -46.0F, 2.5F, 1, 1, 10, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 0, 74, 2.5F, -46.0F, 15.25F, 10, 1, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 150, 113, 15.25F, -51.0F, -11.5F, 1, 1, 8, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 0, 95, -16.25F, -51.0F, -11.5F, 1, 1, 8, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 0, 71, -11.5F, -51.0F, 15.25F, 8, 1, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 99, 101, 15.25F, -51.0F, 3.5F, 1, 1, 8, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 0, 60, -16.25F, -51.0F, 3.5F, 1, 1, 8, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 0, 69, 3.5F, -51.0F, 15.25F, 8, 1, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 97, 115, 15.25F, -55.0F, -12.5F, 1, 9, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 106, 58, -16.25F, -55.0F, -12.5F, 1, 9, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 24, 49, -12.5F, -55.0F, 15.25F, 1, 9, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 62, 115, 15.25F, -55.0F, 11.5F, 1, 9, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 106, 45, -16.25F, -55.0F, 11.5F, 1, 9, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 20, 49, 11.5F, -55.0F, 15.25F, 1, 9, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 93, 115, 15.25F, -55.0F, -3.5F, 1, 9, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 102, 58, -16.25F, -55.0F, -3.5F, 1, 9, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 30, 42, -3.5F, -55.0F, 15.25F, 1, 9, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 78, 115, 15.25F, -55.0F, 2.5F, 1, 9, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 102, 45, -16.25F, -55.0F, 2.5F, 1, 9, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 34, 10, 2.5F, -55.0F, 15.25F, 1, 9, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 86, 115, 15.25F, -55.0F, -6.5F, 1, 9, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 28, 95, -16.25F, -55.0F, -6.5F, 1, 9, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 34, 0, -6.5F, -55.0F, 15.25F, 1, 9, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 74, 115, 15.25F, -55.0F, 5.5F, 1, 9, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 28, 85, -16.25F, -55.0F, 5.5F, 1, 9, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 32, 28, 5.5F, -55.0F, 15.25F, 1, 9, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 82, 115, 15.25F, -55.0F, -9.5F, 1, 9, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 28, 62, -16.25F, -55.0F, -9.5F, 1, 9, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 28, 28, -9.5F, -55.0F, 15.25F, 1, 9, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 66, 115, 15.25F, -55.0F, 8.5F, 1, 9, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 28, 52, -16.25F, -55.0F, 8.5F, 1, 9, 1, 0.0F, false));
		windows.cubeList.add(new ModelBox(windows, 24, 28, 8.5F, -55.0F, 15.25F, 1, 9, 1, 0.0F, false));

		glass = new RendererModel(this);
		glass.setRotationPoint(7.0F, -45.0F, 16.5F);
		windows.addChild(glass);
		glass.cubeList.add(new ModelBox(glass, 201, 57, -18.5F, -10.0F, -1.5F, 8, 9, 1, 0.0F, false));
		glass.cubeList.add(new ModelBox(glass, 0, 42, -23.0F, -10.0F, -13.0F, 1, 9, 8, 0.0F, false));
		glass.cubeList.add(new ModelBox(glass, 10, 51, -23.0F, -10.0F, -28.0F, 1, 9, 8, 0.0F, false));
		glass.cubeList.add(new ModelBox(glass, 0, 77, 8.0F, -10.0F, -28.0F, 1, 9, 8, 0.0F, false));
		glass.cubeList.add(new ModelBox(glass, 10, 86, 8.0F, -10.0F, -13.0F, 1, 9, 8, 0.0F, false));
		glass.cubeList.add(new ModelBox(glass, 158, 201, -3.5F, -10.0F, -1.5F, 8, 9, 1, 0.0F, false));

		wall_doors = new RendererModel(this);
		wall_doors.setRotationPoint(-1.0F, 5.0F, 17.5F);
		walls.addChild(wall_doors);
		wall_doors.cubeList.add(new ModelBox(wall_doors, 12, 173, 16.5F, -55.0F, -20.0F, 1, 55, 2, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 0, 173, -15.5F, -55.0F, -20.0F, 1, 55, 2, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 24, 173, -1.5F, -55.0F, -2.0F, 2, 55, 1, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 6, 173, 16.5F, -55.0F, -17.0F, 1, 55, 2, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 116, 146, -15.5F, -55.0F, -17.0F, 1, 55, 2, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 18, 173, 1.5F, -55.0F, -2.0F, 2, 55, 1, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 176, 158, 16.5F, -16.0F, -30.0F, 1, 2, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 138, 113, -15.5F, -16.0F, -30.0F, 1, 2, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 138, 36, -11.5F, -16.0F, -2.0F, 10, 2, 1, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 142, 45, 16.5F, -16.0F, -15.0F, 1, 2, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 138, 101, -15.5F, -16.0F, -15.0F, 1, 2, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 93, 137, 3.5F, -16.0F, -2.0F, 10, 2, 1, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 94, 193, 16.5F, -55.0F, -31.0F, 1, 55, 1, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 176, 176, -15.5F, -55.0F, -31.0F, 1, 55, 1, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 50, 173, -12.5F, -55.0F, -2.0F, 1, 55, 1, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 189, 56, 16.5F, -55.0F, -5.0F, 1, 55, 1, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 58, 173, -15.5F, -55.0F, -5.0F, 1, 55, 1, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 46, 173, 13.5F, -55.0F, -2.0F, 1, 55, 1, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 160, 2, 16.5F, -29.0F, -30.0F, 1, 2, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 62, 127, -15.5F, -29.0F, -30.0F, 1, 2, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 93, 129, -11.5F, -29.0F, -2.0F, 10, 2, 1, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 142, 57, 16.5F, -29.0F, -15.0F, 1, 2, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 117, 12, -15.5F, -29.0F, -15.0F, 1, 2, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 117, 34, 3.5F, -29.0F, -2.0F, 10, 2, 1, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 154, 59, 16.5F, -42.0F, -30.0F, 1, 2, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 117, 0, -15.5F, -42.0F, -30.0F, 1, 2, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 117, 31, -11.5F, -42.0F, -2.0F, 10, 2, 1, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 148, 12, 16.5F, -42.0F, -15.0F, 1, 2, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 105, 117, -15.5F, -42.0F, -15.0F, 1, 2, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 117, 24, 3.5F, -42.0F, -2.0F, 10, 2, 1, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 114, 61, 16.5F, -3.0F, -30.0F, 1, 3, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 102, 58, -15.5F, -3.0F, -30.0F, 1, 3, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 10, 81, -11.5F, -3.0F, -2.0F, 10, 3, 1, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 114, 48, 16.5F, -3.0F, -15.0F, 1, 3, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 102, 45, -15.5F, -3.0F, -15.0F, 1, 3, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 10, 77, 3.5F, -3.0F, -2.0F, 10, 3, 1, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 167, 72, 16.0F, -40.0F, -15.0F, 1, 37, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 94, 146, 16.0F, -40.0F, -30.0F, 1, 37, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 167, 21, -15.0F, -40.0F, -15.0F, 1, 37, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 154, 154, -15.0F, -40.0F, -30.0F, 1, 37, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 169, 119, 3.5F, -40.0F, -2.5F, 10, 37, 1, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 0, 0, -11.5F, -40.0F, -2.5F, 10, 37, 1, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 188, 168, 16.5F, -55.0F, -30.0F, 1, 2, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 93, 115, -15.5F, -55.0F, -30.0F, 1, 2, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 114, 45, -11.5F, -55.0F, -2.0F, 10, 2, 1, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 148, 0, 16.5F, -55.0F, -15.0F, 1, 2, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 62, 115, -15.5F, -55.0F, -15.0F, 1, 2, 10, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 109, 105, 3.5F, -55.0F, -2.0F, 10, 2, 1, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 191, 112, 17.0F, -55.0F, -18.0F, 1, 55, 1, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 54, 173, -16.0F, -55.0F, -18.0F, 1, 55, 1, 0.0F, false));
		wall_doors.cubeList.add(new ModelBox(wall_doors, 42, 173, 0.5F, -55.0F, -1.5F, 1, 55, 1, 0.0F, false));

		lamp = new RendererModel(this);
		lamp.setRotationPoint(0.0F, 24.0F, 0.0F);
		lamp.cubeList.add(new ModelBox(lamp, 22, 22, -1.5F, -76.0F, -1.5F, 3, 3, 3, 0.0F, false));

		boti = new RendererModel(this);
		boti.setRotationPoint(0.0F, 24.0F, 0.0F);
		boti.cubeList.add(new ModelBox(boti, 0, 115, -15.0F, -60.0F, -15.5F, 30, 57, 1, 0.0F, false));

		r_door = new RendererModel(this);
		r_door.setRotationPoint(13.5F, 24.0F, -16.25F);
		r_door.cubeList.add(new ModelBox(r_door, 31, 20, -8.0F, -39.5F, 0.225F, 4, 4, 0, 0.0F, false));
		r_door.cubeList.add(new ModelBox(r_door, 0, 104, -11.0F, -6.0F, -0.25F, 10, 3, 1, 0.0F, false));
		r_door.cubeList.add(new ModelBox(r_door, 139, 31, -11.0F, -58.0F, -0.25F, 10, 2, 1, 0.0F, false));
		r_door.cubeList.add(new ModelBox(r_door, 62, 139, -11.0F, -19.0F, -0.25F, 10, 2, 1, 0.0F, false));
		r_door.cubeList.add(new ModelBox(r_door, 138, 128, -11.0F, -32.0F, -0.25F, 10, 2, 1, 0.0F, false));
		r_door.cubeList.add(new ModelBox(r_door, 138, 125, -11.0F, -45.0F, -0.25F, 10, 2, 1, 0.0F, false));
		r_door.cubeList.add(new ModelBox(r_door, 30, 173, -13.0F, -58.0F, -0.25F, 2, 55, 1, 0.0F, false));
		r_door.cubeList.add(new ModelBox(r_door, 189, 0, -1.0F, -58.0F, -0.25F, 1, 55, 1, 0.0F, false));
		r_door.cubeList.add(new ModelBox(r_door, 180, 180, -11.0F, -43.0F, 0.25F, 10, 37, 1, 0.0F, false));
		r_door.cubeList.add(new ModelBox(r_door, 22, 20, -12.5F, -31.5F, -0.5F, 1, 1, 1, 0.0F, false));
		r_door.cubeList.add(new ModelBox(r_door, 0, 42, -12.5F, -40.0F, -0.65F, 1, 5, 1, 0.0F, false));

		window2 = new RendererModel(this);
		window2.setRotationPoint(-13.5F, 0.0F, 16.25F);
		r_door.addChild(window2);
		window2.cubeList.add(new ModelBox(window2, 201, 67, 3.5F, -55.0F, -16.0F, 8, 9, 1, 0.0F, false));
		window2.cubeList.add(new ModelBox(window2, 121, 0, 2.5F, -55.0F, -16.25F, 1, 9, 1, 0.0F, false));
		window2.cubeList.add(new ModelBox(window2, 117, 12, 5.5F, -55.0F, -16.25F, 1, 9, 1, 0.0F, false));
		window2.cubeList.add(new ModelBox(window2, 117, 0, 8.5F, -55.0F, -16.25F, 1, 9, 1, 0.0F, false));
		window2.cubeList.add(new ModelBox(window2, 117, 117, 11.5F, -55.0F, -16.25F, 1, 9, 1, 0.0F, false));
		window2.cubeList.add(new ModelBox(window2, 139, 34, 2.5F, -56.0F, -16.25F, 10, 1, 1, 0.0F, false));
		window2.cubeList.add(new ModelBox(window2, 117, 37, 3.5F, -51.0F, -16.25F, 8, 1, 1, 0.0F, false));
		window2.cubeList.add(new ModelBox(window2, 117, 27, 2.5F, -46.0F, -16.25F, 10, 1, 1, 0.0F, false));

		l_door = new RendererModel(this);
		l_door.setRotationPoint(-13.5F, 24.0F, -16.25F);
		l_door.cubeList.add(new ModelBox(l_door, 109, 101, 1.0F, -6.0F, -0.25F, 10, 3, 1, 0.0F, false));
		l_door.cubeList.add(new ModelBox(l_door, 148, 24, 1.0F, -58.0F, -0.25F, 10, 2, 1, 0.0F, false));
		l_door.cubeList.add(new ModelBox(l_door, 142, 74, 1.0F, -19.0F, -0.25F, 10, 2, 1, 0.0F, false));
		l_door.cubeList.add(new ModelBox(l_door, 142, 71, 1.0F, -32.0F, -0.25F, 10, 2, 1, 0.0F, false));
		l_door.cubeList.add(new ModelBox(l_door, 93, 140, 1.0F, -45.0F, -0.25F, 10, 2, 1, 0.0F, false));
		l_door.cubeList.add(new ModelBox(l_door, 36, 173, 11.0F, -58.0F, -0.25F, 2, 55, 1, 0.0F, false));
		l_door.cubeList.add(new ModelBox(l_door, 154, 201, 0.0F, -58.0F, -0.25F, 1, 55, 1, 0.0F, false));
		l_door.cubeList.add(new ModelBox(l_door, 197, 56, 13.0F, -58.0F, -0.75F, 1, 55, 1, 0.0F, false));
		l_door.cubeList.add(new ModelBox(l_door, 199, 112, 1.0F, -43.0F, 0.25F, 10, 37, 1, 0.0F, false));

		window = new RendererModel(this);
		window.setRotationPoint(13.5F, 0.0F, 16.25F);
		l_door.addChild(window);
		window.cubeList.add(new ModelBox(window, 201, 77, -11.5F, -55.0F, -16.0F, 8, 9, 1, 0.0F, false));
		window.cubeList.add(new ModelBox(window, 84, 125, -3.5F, -55.0F, -16.25F, 1, 9, 1, 0.0F, false));
		window.cubeList.add(new ModelBox(window, 121, 12, -6.5F, -55.0F, -16.25F, 1, 9, 1, 0.0F, false));
		window.cubeList.add(new ModelBox(window, 121, 117, -9.5F, -55.0F, -16.25F, 1, 9, 1, 0.0F, false));
		window.cubeList.add(new ModelBox(window, 125, 117, -12.5F, -55.0F, -16.25F, 1, 9, 1, 0.0F, false));
		window.cubeList.add(new ModelBox(window, 62, 142, -12.5F, -56.0F, -16.25F, 10, 1, 1, 0.0F, false));
		window.cubeList.add(new ModelBox(window, 150, 137, -11.5F, -51.0F, -16.25F, 8, 1, 1, 0.0F, false));
		window.cubeList.add(new ModelBox(window, 148, 27, -12.5F, -46.0F, -16.25F, 10, 1, 1, 0.0F, false));
	}

public void render(ExteriorTile tile) {
		EnumDoorState state = tile.getOpen();
		GlStateManager.pushMatrix();
        GlStateManager.enableRescaleNormal();
        GlStateManager.translated(0.0D, 0.45, 0.0D);
        GlStateManager.scalef(0.7F, 0.7F, 0.7F);
        switch(state) {
        case ONE:
            this.r_door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.FENIX.getRotationForState(EnumDoorState.ONE));
            this.l_door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.FENIX.getRotationForState(EnumDoorState.CLOSED));
            break;
        case BOTH:
        	this.r_door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.FENIX.getRotationForState(EnumDoorState.ONE));
            this.l_door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.FENIX.getRotationForState(EnumDoorState.BOTH));
            break;
        case CLOSED:
            this.r_door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.FENIX.getRotationForState(EnumDoorState.CLOSED));
            this.l_door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.FENIX.getRotationForState(EnumDoorState.CLOSED));
        }
		this.box_body.render(0.0625F);
        this.boti.render(0.0625F);
        this.r_door.render(0.0625F);
        this.l_door.render(0.0625F);
        float glow = tile.getLightLevel();
        ModelHelper.renderPartBrightness(glow, new RendererModel[]{this.lamp});
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}