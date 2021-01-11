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

public class Elevator_TwoExterior extends EntityModel {
	private final RendererModel lift;
	private final RendererModel front;
	private final RendererModel backing;
	private final RendererModel front_panels;
	private final RendererModel keyhole;
	private final RendererModel pad;
	private final RendererModel light;
	private final RendererModel doors;
	private final RendererModel thin;
	private final RendererModel thick;
	private final RendererModel walls;
	private final RendererModel left;
	private final RendererModel box;
	private final RendererModel panel_l;
	private final RendererModel screw_t3;
	private final RendererModel screw_t4;
	private final RendererModel right;
	private final RendererModel panel_r;
	private final RendererModel screws;
	private final RendererModel screw_t1;
	private final RendererModel screw_t2;
	private final RendererModel wirebox;
	private final RendererModel outline;
	private final RendererModel wire1;
	private final RendererModel wire2;
	private final RendererModel wire3;
	private final RendererModel wire4;
	private final RendererModel leds;
	private final RendererModel extra;
	private final RendererModel extra2;
	private final RendererModel back;
	private final RendererModel rebar;
	private final RendererModel roof;
	private final RendererModel hatch;

	public Elevator_TwoExterior() {
		textureWidth = 1024;
		textureHeight = 1024;

		lift = new RendererModel(this);
		lift.setRotationPoint(1.0F, 24.0F, -12.0F);
		lift.cubeList.add(new ModelBox(lift, 0, 0, -49.0F, 0.0F, -36.0F, 96, 0, 99, 0.0F, false));

		front = new RendererModel(this);
		front.setRotationPoint(0.0F, 0.0F, 0.0F);
		lift.addChild(front);
		

		backing = new RendererModel(this);
		backing.setRotationPoint(0.0F, 0.0F, 0.0F);
		front.addChild(backing);
		backing.cubeList.add(new ModelBox(backing, 360, 423, -71.0F, -184.0F, 54.0F, 34, 184, 12, 0.0F, false));
		backing.cubeList.add(new ModelBox(backing, 452, 452, 35.0F, -184.0F, 54.0F, 34, 184, 12, 0.0F, false));
		backing.cubeList.add(new ModelBox(backing, 92, 237, -37.0F, -184.0F, 54.0F, 72, 24, 12, 0.0F, false));

		front_panels = new RendererModel(this);
		front_panels.setRotationPoint(0.0F, 0.0F, 3.0F);
		front.addChild(front_panels);
		front_panels.cubeList.add(new ModelBox(front_panels, 132, 459, -57.0F, -188.0F, 62.0F, 20, 188, 4, 0.0F, false));
		front_panels.cubeList.add(new ModelBox(front_panels, 84, 459, 35.0F, -188.0F, 62.0F, 20, 188, 4, 0.0F, false));
		front_panels.cubeList.add(new ModelBox(front_panels, 492, 194, -37.0F, -188.0F, 62.0F, 72, 28, 4, 0.0F, false));

		keyhole = new RendererModel(this);
		keyhole.setRotationPoint(0.0F, 0.0F, -0.5F);
		front_panels.addChild(keyhole);
		keyhole.cubeList.add(new ModelBox(keyhole, 36, 222, -50.0F, -78.0F, 66.0F, 6, 5, 1, 0.0F, false));
		keyhole.cubeList.add(new ModelBox(keyhole, 120, 213, -49.0F, -77.0F, 66.25F, 4, 3, 1, 0.0F, false));
		keyhole.cubeList.add(new ModelBox(keyhole, 68, 195, -46.0F, -77.0F, 66.5F, 1, 3, 1, 0.0F, false));
		keyhole.cubeList.add(new ModelBox(keyhole, 62, 195, -49.0F, -77.0F, 66.5F, 1, 3, 1, 0.0F, false));
		keyhole.cubeList.add(new ModelBox(keyhole, 86, 174, -48.0F, -77.0F, 66.5F, 2, 1, 1, 0.0F, false));
		keyhole.cubeList.add(new ModelBox(keyhole, 92, 97, -48.0F, -75.0F, 66.5F, 2, 1, 1, 0.0F, false));

		pad = new RendererModel(this);
		pad.setRotationPoint(0.0F, 0.0F, 0.0F);
		front_panels.addChild(pad);
		pad.cubeList.add(new ModelBox(pad, 18, 174, -51.0F, -94.0F, 65.75F, 8, 15, 1, 0.0F, false));
		pad.cubeList.add(new ModelBox(pad, 36, 184, -49.0F, -93.0F, 66.5F, 4, 4, 1, 0.0F, false));
		pad.cubeList.add(new ModelBox(pad, 50, 222, -49.0F, -84.0F, 66.5F, 4, 4, 1, 0.0F, false));

		light = new RendererModel(this);
		light.setRotationPoint(-47.0F, -86.5F, 67.0F);
		pad.addChild(light);
		setRotationAngle(light, 0.0F, 0.0F, 0.7854F);
		light.cubeList.add(new ModelBox(light, 72, 174, -1.0F, -1.0F, -0.75F, 2, 2, 1, 0.0F, false));

		doors = new RendererModel(this);
		doors.setRotationPoint(0.0F, 0.0F, 3.0F);
		lift.addChild(doors);
		

		thin = new RendererModel(this);
		thin.setRotationPoint(0.0F, 0.0F, 0.0F);
		doors.addChild(thin);
		thin.cubeList.add(new ModelBox(thin, 0, 459, -37.0F, -160.0F, 58.0F, 40, 160, 2, 0.0F, false));
		thin.cubeList.add(new ModelBox(thin, 0, 0, -37.0F, -160.0F, 54.0F, 40, 160, 2, 0.0F, false));

		thick = new RendererModel(this);
		thick.setRotationPoint(0.0F, 0.0F, 0.0F);
		doors.addChild(thick);
		thick.cubeList.add(new ModelBox(thick, 484, 0, -1.0F, -160.0F, 60.0F, 36, 160, 2, 0.0F, false));
		thick.cubeList.add(new ModelBox(thick, 180, 459, -1.0F, -160.0F, 52.0F, 36, 160, 2, 0.0F, false));
		thick.cubeList.add(new ModelBox(thick, 256, 459, -1.0F, -160.0F, 56.0F, 36, 160, 2, 0.0F, false));

		walls = new RendererModel(this);
		walls.setRotationPoint(0.0F, 0.0F, 0.0F);
		lift.addChild(walls);
		

		left = new RendererModel(this);
		left.setRotationPoint(0.0F, 0.0F, 0.0F);
		walls.addChild(left);
		left.cubeList.add(new ModelBox(left, 180, 195, 45.0F, -176.0F, -36.0F, 2, 176, 88, 0.0F, false));

		box = new RendererModel(this);
		box.setRotationPoint(0.0F, 0.0F, 0.0F);
		left.addChild(box);
		box.cubeList.add(new ModelBox(box, 608, 560, 47.0F, -126.0F, 12.0F, 6, 2, 36, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 195, 53.0F, -125.0F, 13.0F, 1, 42, 34, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 0, 621, 47.0F, -124.0F, 46.0F, 6, 40, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 100, 220, 52.0F, -122.0F, 47.0F, 2, 10, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 92, 220, 52.0F, -96.0F, 47.0F, 2, 10, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 116, 224, 53.0F, -95.0F, 46.0F, 2, 8, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 117, 217, 51.0F, -106.0F, 11.0F, 4, 4, 3, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 108, 220, 53.0F, -121.0F, 46.0F, 2, 8, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 608, 598, 47.0F, -124.0F, 12.0F, 6, 40, 2, 0.0F, false));
		box.cubeList.add(new ModelBox(box, 608, 608, 47.0F, -84.0F, 12.0F, 6, 2, 36, 0.0F, false));

		panel_l = new RendererModel(this);
		panel_l.setRotationPoint(0.0F, 0.0F, 0.0F);
		left.addChild(panel_l);
		panel_l.cubeList.add(new ModelBox(panel_l, 544, 423, 47.0F, -73.0F, -30.0F, 2, 65, 32, 0.0F, false));
		panel_l.cubeList.add(new ModelBox(panel_l, 592, 0, 49.0F, -69.0F, -26.0F, 1, 57, 24, 0.0F, false));
		panel_l.cubeList.add(new ModelBox(panel_l, 360, 291, 49.0F, -72.0F, -26.0F, 1, 3, 24, 0.0F, false));
		panel_l.cubeList.add(new ModelBox(panel_l, 360, 264, 49.0F, -12.0F, -26.0F, 1, 3, 24, 0.0F, false));
		panel_l.cubeList.add(new ModelBox(panel_l, 12, 224, 49.0F, -11.0F, -29.0F, 1, 2, 2, 0.0F, false));
		panel_l.cubeList.add(new ModelBox(panel_l, 6, 224, 49.0F, -72.0F, -1.0F, 1, 2, 2, 0.0F, false));
		panel_l.cubeList.add(new ModelBox(panel_l, 84, 0, 49.0F, -69.0F, -29.0F, 1, 57, 3, 0.0F, false));
		panel_l.cubeList.add(new ModelBox(panel_l, 84, 84, 49.0F, -69.0F, -2.0F, 1, 57, 3, 0.0F, false));

		screw_t3 = new RendererModel(this);
		screw_t3.setRotationPoint(49.5F, -71.0F, -28.0F);
		panel_l.addChild(screw_t3);
		setRotationAngle(screw_t3, 0.7854F, 0.0F, 0.0F);
		screw_t3.cubeList.add(new ModelBox(screw_t3, 0, 224, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		screw_t4 = new RendererModel(this);
		screw_t4.setRotationPoint(49.5F, -10.0F, 0.0F);
		panel_l.addChild(screw_t4);
		setRotationAngle(screw_t4, -1.309F, 0.0F, 0.0F);
		screw_t4.cubeList.add(new ModelBox(screw_t4, 80, 215, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		right = new RendererModel(this);
		right.setRotationPoint(0.0F, 0.0F, 0.0F);
		walls.addChild(right);
		right.cubeList.add(new ModelBox(right, 0, 195, -49.0F, -176.0F, -36.0F, 2, 176, 88, 0.0F, false));

		panel_r = new RendererModel(this);
		panel_r.setRotationPoint(0.0F, 11.0F, 0.0F);
		right.addChild(panel_r);
		panel_r.cubeList.add(new ModelBox(panel_r, 562, 333, -51.0F, -136.0F, 14.0F, 1, 46, 32, 0.0F, false));
		panel_r.cubeList.add(new ModelBox(panel_r, 272, 195, -52.0F, -132.0F, 18.0F, 1, 38, 24, 0.0F, false));
		panel_r.cubeList.add(new ModelBox(panel_r, 360, 360, -52.0F, -94.0F, 18.0F, 1, 3, 24, 0.0F, false));
		panel_r.cubeList.add(new ModelBox(panel_r, 36, 195, -52.0F, -135.0F, 18.0F, 1, 3, 24, 0.0F, false));
		panel_r.cubeList.add(new ModelBox(panel_r, 410, 264, -52.0F, -132.0F, 42.0F, 1, 38, 3, 0.0F, false));
		panel_r.cubeList.add(new ModelBox(panel_r, 260, 237, -52.0F, -132.0F, 15.0F, 1, 38, 3, 0.0F, false));

		screws = new RendererModel(this);
		screws.setRotationPoint(0.0F, 0.0F, 0.0F);
		panel_r.addChild(screws);
		screws.cubeList.add(new ModelBox(screws, 74, 215, -52.0F, -93.0F, 15.0F, 1, 2, 2, 0.0F, false));
		screws.cubeList.add(new ModelBox(screws, 68, 215, -52.0F, -135.0F, 15.0F, 1, 2, 2, 0.0F, false));

		screw_t1 = new RendererModel(this);
		screw_t1.setRotationPoint(-51.5F, -134.0F, 44.0F);
		screws.addChild(screw_t1);
		setRotationAngle(screw_t1, 0.2618F, 0.0F, 0.0F);
		screw_t1.cubeList.add(new ModelBox(screw_t1, 62, 215, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		screw_t2 = new RendererModel(this);
		screw_t2.setRotationPoint(-51.5F, -92.0F, 44.0F);
		screws.addChild(screw_t2);
		setRotationAngle(screw_t2, -0.2618F, 0.0F, 0.0F);
		screw_t2.cubeList.add(new ModelBox(screw_t2, 85, 181, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		wirebox = new RendererModel(this);
		wirebox.setRotationPoint(0.0F, 12.0F, 0.0F);
		right.addChild(wirebox);
		wirebox.cubeList.add(new ModelBox(wirebox, 580, 488, -50.0F, -79.0F, -30.0F, 1, 40, 32, 0.0F, false));

		outline = new RendererModel(this);
		outline.setRotationPoint(0.0F, 0.0F, 0.0F);
		wirebox.addChild(outline);
		outline.cubeList.add(new ModelBox(outline, 312, 603, -53.0F, -39.0F, -32.0F, 6, 2, 36, 0.0F, false));
		outline.cubeList.add(new ModelBox(outline, 600, 270, -53.0F, -81.0F, -32.0F, 6, 2, 36, 0.0F, false));
		outline.cubeList.add(new ModelBox(outline, 322, 195, -53.0F, -79.0F, 2.0F, 6, 40, 2, 0.0F, false));
		outline.cubeList.add(new ModelBox(outline, 70, 222, -53.0F, -79.0F, -32.0F, 6, 40, 2, 0.0F, false));
		outline.cubeList.add(new ModelBox(outline, 50, 207, -54.0F, -77.0F, -33.0F, 2, 10, 2, 0.0F, false));
		outline.cubeList.add(new ModelBox(outline, 50, 195, -54.0F, -51.0F, -33.0F, 2, 10, 2, 0.0F, false));

		wire1 = new RendererModel(this);
		wire1.setRotationPoint(0.0F, 0.0F, 0.0F);
		wirebox.addChild(wire1);
		wire1.cubeList.add(new ModelBox(wire1, 92, 15, -52.0F, -53.0F, -1.0F, 1, 14, 1, 0.0F, false));
		wire1.cubeList.add(new ModelBox(wire1, 126, 195, -52.0F, -79.0F, -1.0F, 1, 13, 1, 0.0F, false));
		wire1.cubeList.add(new ModelBox(wire1, 28, 217, -54.0F, -65.0F, -1.0F, 1, 11, 1, 0.0F, false));
		wire1.cubeList.add(new ModelBox(wire1, 10, 180, -54.0F, -54.0F, -1.0F, 3, 1, 1, 0.0F, false));
		wire1.cubeList.add(new ModelBox(wire1, 0, 180, -54.0F, -66.0F, -1.0F, 3, 1, 1, 0.0F, false));

		wire2 = new RendererModel(this);
		wire2.setRotationPoint(0.0F, 0.0F, 0.0F);
		wirebox.addChild(wire2);
		wire2.cubeList.add(new ModelBox(wire2, 224, 208, -52.0F, -79.0F, -3.0F, 1, 12, 1, 0.0F, false));
		wire2.cubeList.add(new ModelBox(wire2, 64, 222, -54.0F, -66.0F, -3.0F, 1, 5, 1, 0.0F, false));
		wire2.cubeList.add(new ModelBox(wire2, 60, 222, -53.0F, -62.0F, -3.0F, 1, 5, 1, 0.0F, false));
		wire2.cubeList.add(new ModelBox(wire2, 36, 174, -54.0F, -58.0F, -3.0F, 1, 5, 1, 0.0F, false));
		wire2.cubeList.add(new ModelBox(wire2, 92, 83, -52.0F, -52.0F, -3.0F, 1, 13, 1, 0.0F, false));
		wire2.cubeList.add(new ModelBox(wire2, 10, 178, -54.0F, -53.0F, -3.0F, 3, 1, 1, 0.0F, false));
		wire2.cubeList.add(new ModelBox(wire2, 0, 178, -54.0F, -67.0F, -3.0F, 3, 1, 1, 0.0F, false));

		wire3 = new RendererModel(this);
		wire3.setRotationPoint(0.0F, 0.0F, 0.0F);
		wirebox.addChild(wire3);
		wire3.cubeList.add(new ModelBox(wire3, 92, 44, -51.0F, -79.0F, -5.0F, 1, 13, 1, 0.0F, false));
		wire3.cubeList.add(new ModelBox(wire3, 63, 188, -55.0F, -67.0F, -5.0F, 4, 1, 1, 0.0F, false));
		wire3.cubeList.add(new ModelBox(wire3, 92, 30, -55.0F, -66.0F, -5.0F, 1, 13, 1, 0.0F, false));
		wire3.cubeList.add(new ModelBox(wire3, 60, 183, -53.0F, -52.0F, -5.0F, 1, 2, 1, 0.0F, false));
		wire3.cubeList.add(new ModelBox(wire3, 79, 181, -51.0F, -49.0F, -5.0F, 1, 3, 1, 0.0F, false));
		wire3.cubeList.add(new ModelBox(wire3, 224, 224, -52.0F, -47.0F, -5.0F, 1, 8, 1, 0.0F, false));
		wire3.cubeList.add(new ModelBox(wire3, 10, 176, -53.0F, -50.0F, -5.0F, 3, 1, 1, 0.0F, false));
		wire3.cubeList.add(new ModelBox(wire3, 10, 174, -55.0F, -53.0F, -5.0F, 3, 1, 1, 0.0F, false));

		wire4 = new RendererModel(this);
		wire4.setRotationPoint(0.0F, 0.0F, 0.0F);
		wirebox.addChild(wire4);
		wire4.cubeList.add(new ModelBox(wire4, 224, 195, -52.0F, -51.0F, -7.0F, 1, 12, 1, 0.0F, false));
		wire4.cubeList.add(new ModelBox(wire4, 92, 0, -54.0F, -65.0F, -7.0F, 1, 14, 1, 0.0F, false));
		wire4.cubeList.add(new ModelBox(wire4, 128, 224, -53.0F, -72.0F, -7.0F, 1, 8, 1, 0.0F, false));
		wire4.cubeList.add(new ModelBox(wire4, 124, 224, -52.0F, -79.0F, -7.0F, 1, 8, 1, 0.0F, false));
		wire4.cubeList.add(new ModelBox(wire4, 84, 64, -54.0F, -51.0F, -7.0F, 2, 1, 1, 0.0F, false));

		leds = new RendererModel(this);
		leds.setRotationPoint(0.0F, -0.5F, 0.0F);
		wirebox.addChild(leds);
		leds.cubeList.add(new ModelBox(leds, 78, 195, -50.5F, -54.0F, -13.0F, 1, 4, 4, 0.0F, false));
		leds.cubeList.add(new ModelBox(leds, 62, 195, -50.5F, -49.0F, -13.0F, 1, 4, 4, 0.0F, false));
		leds.cubeList.add(new ModelBox(leds, 84, 144, -50.5F, -52.5F, -27.0F, 1, 10, 3, 0.0F, false));
		leds.cubeList.add(new ModelBox(leds, 79, 181, -50.5F, -44.0F, -13.0F, 1, 4, 4, 0.0F, false));
		leds.cubeList.add(new ModelBox(leds, 0, 174, -51.0F, -53.0F, -12.0F, 1, 2, 2, 0.0F, false));
		leds.cubeList.add(new ModelBox(leds, 84, 157, -51.0F, -48.0F, -12.0F, 1, 2, 2, 0.0F, false));
		leds.cubeList.add(new ModelBox(leds, 95, 57, -51.0F, -51.5F, -26.0F, 1, 8, 1, 0.0F, false));
		leds.cubeList.add(new ModelBox(leds, 84, 60, -51.0F, -43.0F, -12.0F, 1, 2, 2, 0.0F, false));

		extra = new RendererModel(this);
		extra.setRotationPoint(0.0F, 0.0F, 0.0F);
		wirebox.addChild(extra);
		extra.cubeList.add(new ModelBox(extra, 84, 60, -51.0F, -56.0F, -21.0F, 1, 17, 6, 0.0F, false));
		extra.cubeList.add(new ModelBox(extra, 36, 174, -51.0F, -60.0F, -30.0F, 1, 3, 7, 0.0F, false));
		extra.cubeList.add(new ModelBox(extra, 0, 195, -51.0F, -64.0F, -13.0F, 1, 7, 15, 0.0F, false));
		extra.cubeList.add(new ModelBox(extra, 52, 174, -51.0F, -65.0F, -30.0F, 1, 2, 7, 0.0F, false));
		extra.cubeList.add(new ModelBox(extra, 62, 195, -53.0F, -66.0F, -23.0F, 3, 10, 10, 0.0F, false));

		extra2 = new RendererModel(this);
		extra2.setRotationPoint(-50.0F, -72.0F, -18.0F);
		extra.addChild(extra2);
		setRotationAngle(extra2, 0.7854F, 0.0F, 0.0F);
		extra2.cubeList.add(new ModelBox(extra2, 0, 174, -1.0F, -4.3536F, -3.6464F, 1, 8, 8, 0.0F, false));

		back = new RendererModel(this);
		back.setRotationPoint(0.0F, 0.0F, 0.0F);
		walls.addChild(back);
		back.cubeList.add(new ModelBox(back, 292, 0, -47.0F, -176.0F, -36.0F, 94, 176, 2, 0.0F, false));

		rebar = new RendererModel(this);
		rebar.setRotationPoint(0.0F, 0.0F, 0.0F);
		walls.addChild(rebar);
		rebar.cubeList.add(new ModelBox(rebar, 592, 592, -51.0F, -176.0F, -38.0F, 4, 176, 4, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 576, 0, -3.0F, -176.0F, -38.0F, 4, 176, 4, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 14, 217, 5.0F, -172.0F, -37.0F, 4, 4, 3, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 0, 217, 5.0F, -12.0F, -37.0F, 4, 4, 3, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 106, 213, -43.0F, -172.0F, -37.0F, 4, 4, 3, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 92, 213, -43.0F, -12.0F, -37.0F, 4, 4, 3, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 36, 209, 13.0F, -172.0F, -37.0F, 4, 4, 3, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 112, 202, 13.0F, -12.0F, -37.0F, 4, 4, 3, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 92, 202, -35.0F, -172.0F, -37.0F, 4, 4, 3, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 36, 202, -35.0F, -12.0F, -37.0F, 4, 4, 3, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 17, 202, 21.0F, -172.0F, -37.0F, 4, 4, 3, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 0, 202, 21.0F, -12.0F, -37.0F, 4, 4, 3, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 112, 195, -27.0F, -172.0F, -37.0F, 4, 4, 3, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 92, 195, -27.0F, -12.0F, -37.0F, 4, 4, 3, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 36, 195, 29.0F, -172.0F, -37.0F, 4, 4, 3, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 17, 195, 29.0F, -12.0F, -37.0F, 4, 4, 3, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 0, 195, -19.0F, -172.0F, -37.0F, 4, 4, 3, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 49, 183, -19.0F, -12.0F, -37.0F, 4, 4, 3, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 65, 181, 37.0F, -172.0F, -37.0F, 4, 4, 3, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 75, 174, 37.0F, -12.0F, -37.0F, 4, 4, 3, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 61, 174, -11.0F, -172.0F, -37.0F, 4, 4, 3, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 45, 174, -11.0F, -12.0F, -37.0F, 4, 4, 3, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 576, 576, 45.0F, -176.0F, -38.0F, 4, 176, 4, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 560, 0, -51.0F, -176.0F, 6.0F, 4, 176, 4, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 560, 560, 45.0F, -176.0F, 6.0F, 4, 176, 4, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 544, 544, -51.0F, -176.0F, 50.0F, 4, 176, 4, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 332, 459, 45.0F, -176.0F, 50.0F, 4, 176, 4, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 596, 314, -51.0F, -4.0F, 10.0F, 2, 4, 40, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 592, 81, 47.0F, -4.0F, 10.0F, 2, 4, 40, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 584, 411, -51.0F, -4.0F, -34.0F, 2, 4, 40, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 556, 270, 47.0F, -4.0F, -34.0F, 2, 4, 40, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 0, 168, 1.0F, -4.0F, -38.0F, 44, 4, 2, 0.0F, false));
		rebar.cubeList.add(new ModelBox(rebar, 0, 162, -47.0F, -4.0F, -38.0F, 44, 4, 2, 0.0F, false));

		roof = new RendererModel(this);
		roof.setRotationPoint(0.0F, 0.0F, 0.0F);
		lift.addChild(roof);
		roof.cubeList.add(new ModelBox(roof, 0, 99, -51.0F, -180.0F, -38.0F, 100, 4, 92, 0.0F, false));

		hatch = new RendererModel(this);
		hatch.setRotationPoint(0.0F, 0.0F, 0.0F);
		roof.addChild(hatch);
		hatch.cubeList.add(new ModelBox(hatch, 272, 195, -39.0F, -181.0F, -26.0F, 76, 1, 68, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 360, 264, -35.0F, -190.0F, -22.0F, 68, 9, 60, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 360, 360, -36.0F, -190.0F, -23.0F, 70, 1, 62, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 552, 140, -37.0F, -194.0F, -12.0F, 14, 4, 40, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 92, 195, -31.0F, -196.0F, 0.0F, 2, 2, 16, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 92, 195, -23.0F, -192.0F, -12.0F, 46, 2, 40, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 620, 125, 13.0F, -193.0F, -8.0F, 6, 3, 31, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 365, 619, -7.0F, -193.0F, -8.0F, 6, 3, 31, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 614, 455, 3.0F, -193.0F, -8.0F, 6, 3, 31, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 492, 226, -17.0F, -193.0F, -8.0F, 6, 3, 31, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 384, 178, -37.0F, -194.0F, 28.0F, 72, 4, 12, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 360, 333, -37.0F, -194.0F, -24.0F, 72, 4, 12, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 556, 226, 23.0F, -194.0F, -12.0F, 12, 4, 40, 0.0F, false));
	}

public void render(ExteriorTile tile) {
		EnumDoorState state = tile.getOpen();
		GlStateManager.pushMatrix();
        GlStateManager.enableRescaleNormal();
        GlStateManager.translated(0.0D, 1.15D, 0.15D);
        GlStateManager.rotated(180.0D, 0.0D, 1.0D, 0.0D);
        GlStateManager.scalef(0.23F, 0.23F, 0.23F);

		switch(state) {

        case ONE:
            this.thin.offsetX = 2.2F;
            this.doors.offsetX = 0.0F;
            break;
        case BOTH:
            this.thin.offsetX = 2.2F;
            this.doors.offsetX = 1.9F;
            break;
        case CLOSED:
            this.thin.offsetX = 0.0F;
            this.doors.offsetX = 0.0F;
        }
		this.lift.render(0.0625F);

        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}