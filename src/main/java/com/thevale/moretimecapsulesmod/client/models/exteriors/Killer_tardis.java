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

public class Killer_tardis extends EntityModel {
	private final RendererModel body;
	private final RendererModel lamp;
	private final RendererModel pillers;
	private final RendererModel doorborders;
	private final RendererModel roof;
	private final RendererModel pbs;
	private final RendererModel walls;
	private final RendererModel wallwindows;
	private final RendererModel wall;
	private final RendererModel doorstopes;
	private final RendererModel lamp_glow;
	private final RendererModel boti;
	private final RendererModel rightdoor;
	private final RendererModel window2;
	private final RendererModel leftdoor;
	private final RendererModel window;

	public Killer_tardis() {
		textureWidth = 512;
		textureHeight = 512;

		body = new RendererModel(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		lamp = new RendererModel(this);
		lamp.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(lamp);
		lamp.cubeList.add(new ModelBox(lamp, 0, 51, -3.5F, -78.0F, -3.5F, 7, 1, 7, 0.0F, false));
		lamp.cubeList.add(new ModelBox(lamp, 0, 43, -3.5F, -83.0F, -3.5F, 7, 1, 7, 0.0F, false));
		lamp.cubeList.add(new ModelBox(lamp, 0, 73, -2.5F, -84.0F, -2.5F, 5, 1, 5, 0.0F, false));
		lamp.cubeList.add(new ModelBox(lamp, 3, 24, -2.5F, -82.0F, 1.5F, 1, 4, 1, 0.0F, false));
		lamp.cubeList.add(new ModelBox(lamp, 30, 19, 1.5F, -82.0F, -2.5F, 1, 4, 1, 0.0F, false));
		lamp.cubeList.add(new ModelBox(lamp, 4, 19, 1.5F, -82.0F, 1.5F, 1, 4, 1, 0.0F, false));
		lamp.cubeList.add(new ModelBox(lamp, 30, 0, -2.5F, -82.0F, -2.5F, 1, 4, 1, 0.0F, false));

		pillers = new RendererModel(this);
		pillers.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(pillers);
		pillers.cubeList.add(new ModelBox(pillers, 154, 154, -19.5F, -73.0F, 15.5F, 4, 71, 4, 0.0F, false));
		pillers.cubeList.add(new ModelBox(pillers, 0, 0, -20.5F, -2.0F, -20.5F, 41, 2, 41, 0.0F, false));
		pillers.cubeList.add(new ModelBox(pillers, 80, 155, 15.5F, -73.0F, -19.5F, 4, 71, 4, 0.0F, false));
		pillers.cubeList.add(new ModelBox(pillers, 24, 65, 15.5F, -74.0F, -18.5F, 3, 1, 3, 0.0F, false));
		pillers.cubeList.add(new ModelBox(pillers, 28, 32, 15.5F, -74.0F, 15.5F, 3, 1, 3, 0.0F, false));
		pillers.cubeList.add(new ModelBox(pillers, 24, 61, -18.5F, -74.0F, -18.5F, 3, 1, 3, 0.0F, false));
		pillers.cubeList.add(new ModelBox(pillers, 28, 36, -18.5F, -74.0F, 15.5F, 3, 1, 3, 0.0F, false));
		pillers.cubeList.add(new ModelBox(pillers, 138, 150, 15.5F, -73.0F, 15.5F, 4, 71, 4, 0.0F, false));
		pillers.cubeList.add(new ModelBox(pillers, 64, 155, -19.5F, -73.0F, -19.5F, 4, 71, 4, 0.0F, false));

		doorborders = new RendererModel(this);
		doorborders.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(doorborders);
		doorborders.cubeList.add(new ModelBox(doorborders, 170, 223, 14.5F, -64.0F, -18.0F, 1, 62, 1, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 220, 113, -15.5F, -64.0F, 17.0F, 1, 62, 1, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 222, 222, -18.0F, -64.0F, -15.5F, 1, 62, 1, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 134, 219, 17.0F, -64.0F, 14.5F, 1, 62, 1, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 172, 76, -15.5F, -65.0F, -18.0F, 31, 1, 1, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 171, 78, -15.5F, -65.0F, 17.0F, 31, 1, 1, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 148, 113, -18.0F, -65.0F, -15.5F, 1, 1, 31, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 141, 33, 17.0F, -65.0F, -15.5F, 1, 1, 31, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 172, 73, -15.5F, -67.0F, -18.5F, 31, 2, 1, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 108, 76, -15.5F, -67.0F, 17.5F, 31, 2, 1, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 123, 0, -18.5F, -67.0F, -15.5F, 1, 2, 31, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 108, 43, 17.5F, -67.0F, -15.5F, 1, 2, 31, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 174, 223, -15.5F, -64.0F, -18.0F, 1, 62, 1, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 130, 219, 14.5F, -64.0F, 17.0F, 1, 62, 1, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 221, 8, -18.0F, -64.0F, 14.5F, 1, 62, 1, 0.0F, false));
		doorborders.cubeList.add(new ModelBox(doorborders, 126, 219, 17.0F, -64.0F, -15.5F, 1, 62, 1, 0.0F, false));

		roof = new RendererModel(this);
		roof.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(roof);
		roof.cubeList.add(new ModelBox(roof, 0, 43, -18.0F, -72.0F, -18.0F, 36, 1, 36, 0.0F, false));
		roof.cubeList.add(new ModelBox(roof, 0, 80, -17.5F, -75.0F, -17.5F, 35, 3, 35, 0.0F, false));
		roof.cubeList.add(new ModelBox(roof, 105, 80, -15.5F, -77.0F, -15.5F, 31, 2, 31, 0.0F, false));

		pbs = new RendererModel(this);
		pbs.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(pbs);
		pbs.cubeList.add(new ModelBox(pbs, 156, 0, -16.5F, -71.0F, -20.5F, 33, 4, 4, 0.0F, false));
		pbs.cubeList.add(new ModelBox(pbs, 107, 113, 16.5F, -71.0F, -16.5F, 4, 4, 33, 0.0F, false));
		pbs.cubeList.add(new ModelBox(pbs, 141, 65, -16.5F, -71.0F, 16.5F, 33, 4, 4, 0.0F, false));
		pbs.cubeList.add(new ModelBox(pbs, 64, 118, -20.5F, -71.0F, -16.5F, 4, 4, 33, 0.0F, false));

		walls = new RendererModel(this);
		walls.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(walls);
		

		wallwindows = new RendererModel(this);
		wallwindows.setRotationPoint(0.0F, 0.0F, 0.0F);
		walls.addChild(wallwindows);
		wallwindows.cubeList.add(new ModelBox(wallwindows, 174, 53, 16.0F, -50.0F, -12.5F, 1, 1, 10, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 156, 8, 16.0F, -50.0F, 2.5F, 1, 1, 10, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 170, 150, -17.0F, -50.0F, -12.5F, 1, 1, 10, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 12, 80, -12.5F, -50.0F, 16.0F, 10, 1, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 148, 124, -17.0F, -50.0F, 2.5F, 1, 1, 10, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 12, 112, 2.5F, -50.0F, 16.0F, 10, 1, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 0, 22, 15.75F, -61.0F, -11.5F, 1, 11, 8, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 10, 11, 15.75F, -61.0F, 3.5F, 1, 11, 8, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 20, 0, -16.75F, -61.0F, -11.5F, 1, 11, 8, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 181, 113, -11.5F, -61.0F, 15.75F, 8, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 0, 0, -16.75F, -61.0F, 3.5F, 1, 11, 8, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 181, 125, 3.5F, -61.0F, 15.75F, 8, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 174, 125, 16.0F, -61.0F, -12.5F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 163, 42, 16.0F, -61.0F, 11.5F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 170, 125, -17.0F, -61.0F, -12.5F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 32, 43, -12.5F, -61.0F, 16.0F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 149, 12, -17.0F, -61.0F, 11.5F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 130, 47, 11.5F, -61.0F, 16.0F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 174, 113, 16.0F, -61.0F, -9.5F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 149, 0, 16.0F, -61.0F, 8.5F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 170, 113, -17.0F, -61.0F, -9.5F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 28, 43, -9.5F, -61.0F, 16.0F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 145, 12, -17.0F, -61.0F, 8.5F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 130, 59, 8.5F, -61.0F, 16.0F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 174, 33, 16.0F, -61.0F, -6.5F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 145, 0, 16.0F, -61.0F, 5.5F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 167, 45, -17.0F, -61.0F, -6.5F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 37, 18, -6.5F, -61.0F, 16.0F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 86, 139, -17.0F, -61.0F, 5.5F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 134, 47, 5.5F, -61.0F, 16.0F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 76, 118, 16.0F, -56.0F, -11.5F, 1, 1, 8, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 117, 80, 16.0F, -56.0F, 3.5F, 1, 1, 8, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 117, 92, -17.0F, -56.0F, -11.5F, 1, 1, 8, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 15, 73, -11.5F, -56.0F, 16.0F, 8, 1, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 18, 32, -17.0F, -56.0F, 3.5F, 1, 1, 8, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 15, 75, 3.5F, -56.0F, 16.0F, 8, 1, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 170, 161, 16.0F, -61.0F, -3.5F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 90, 137, 16.0F, -61.0F, 2.5F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 167, 33, -17.0F, -61.0F, -3.5F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 93, 126, -3.5F, -61.0F, 16.0F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 134, 59, -17.0F, -61.0F, 2.5F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 86, 127, 2.5F, -61.0F, 16.0F, 1, 11, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 174, 42, 16.0F, -62.0F, -12.5F, 1, 1, 10, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 148, 113, 16.0F, -62.0F, 2.5F, 1, 1, 10, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 156, 19, -17.0F, -62.0F, -12.5F, 1, 1, 10, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 12, 59, -12.5F, -62.0F, 16.0F, 10, 1, 1, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 0, 104, -17.0F, -62.0F, 2.5F, 1, 1, 10, 0.0F, false));
		wallwindows.cubeList.add(new ModelBox(wallwindows, 105, 113, 2.5F, -62.0F, 16.0F, 10, 1, 1, 0.0F, false));

		wall = new RendererModel(this);
		wall.setRotationPoint(17.5F, -2.0F, 0.5F);
		walls.addChild(wall);
		wall.cubeList.add(new ModelBox(wall, 198, 198, -1.25F, -62.0F, -15.0F, 1, 62, 2, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 44, 185, -1.25F, -62.0F, 12.0F, 1, 62, 2, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 50, 185, -34.75F, -62.0F, -15.0F, 1, 62, 2, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 204, 204, -32.0F, -62.0F, 15.75F, 2, 62, 1, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 130, 155, -34.75F, -62.0F, 12.0F, 1, 62, 2, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 108, 208, -5.0F, -62.0F, 15.75F, 2, 62, 1, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 192, 192, -1.25F, -62.0F, -3.0F, 1, 62, 2, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 124, 155, -1.25F, -62.0F, 0.0F, 1, 62, 2, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 56, 185, -34.75F, -62.0F, -3.0F, 1, 62, 2, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 96, 208, -20.0F, -62.0F, 15.75F, 2, 62, 1, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 118, 155, -34.75F, -62.0F, 0.0F, 1, 62, 2, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 102, 208, -17.0F, -62.0F, 15.75F, 2, 62, 1, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 141, 43, -1.25F, -2.0F, -13.0F, 1, 2, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 108, 43, -1.25F, -2.0F, 2.0F, 1, 2, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 108, 55, -34.75F, -2.0F, -13.0F, 1, 2, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 12, 106, -30.0F, -2.0F, 15.75F, 10, 2, 1, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 105, 92, -34.75F, -2.0F, 2.0F, 1, 2, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 105, 105, -15.0F, -2.0F, 15.75F, 10, 2, 1, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 64, 130, -1.25F, -32.0F, -13.0F, 1, 2, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 105, 80, -1.25F, -32.0F, 2.0F, 1, 2, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 123, 0, -34.75F, -32.0F, -13.0F, 1, 2, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 105, 108, -30.0F, -32.0F, 15.75F, 10, 2, 1, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 12, 94, -34.75F, -32.0F, 2.0F, 1, 2, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 108, 67, -15.0F, -32.0F, 15.75F, 10, 2, 1, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 123, 12, -1.25F, -17.0F, -13.0F, 1, 2, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 0, 92, -1.25F, -17.0F, 2.0F, 1, 2, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 64, 118, -34.75F, -17.0F, -13.0F, 1, 2, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 12, 109, -30.0F, -17.0F, 15.75F, 10, 2, 1, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 12, 82, -34.75F, -17.0F, 2.0F, 1, 2, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 108, 70, -15.0F, -17.0F, 15.75F, 10, 2, 1, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 105, 130, -1.25F, -47.0F, -13.0F, 1, 2, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 0, 80, -1.25F, -47.0F, 2.0F, 1, 2, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 117, 120, -34.75F, -47.0F, -13.0F, 1, 2, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 123, 33, -30.0F, -47.0F, 15.5F, 10, 2, 1, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 12, 61, -34.75F, -47.0F, 2.0F, 1, 2, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 123, 36, -15.0F, -47.0F, 15.75F, 10, 2, 1, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 117, 132, -1.25F, -62.0F, -13.0F, 1, 2, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 0, 59, -1.25F, -62.0F, 2.0F, 1, 2, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 105, 118, -34.75F, -62.0F, -13.0F, 1, 2, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 123, 27, -30.0F, -62.0F, 15.75F, 10, 2, 1, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 18, 20, -34.75F, -62.0F, 2.0F, 1, 2, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 123, 24, -15.0F, -62.0F, 15.75F, 10, 2, 1, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 22, 185, -1.75F, -45.0F, -13.0F, 1, 43, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 170, 170, -1.75F, -45.0F, 2.0F, 1, 43, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 0, 185, -34.25F, -45.0F, -13.0F, 1, 43, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 187, 8, -30.0F, -45.0F, 15.25F, 10, 43, 1, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 96, 155, -34.25F, -45.0F, 2.0F, 1, 43, 10, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 222, 176, -15.0F, -45.0F, 15.25F, 10, 43, 1, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 118, 219, -35.25F, -62.0F, -1.0F, 1, 62, 1, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 114, 208, -18.0F, -62.0F, 16.25F, 1, 62, 1, 0.0F, false));
		wall.cubeList.add(new ModelBox(wall, 216, 113, -0.75F, -62.0F, -1.0F, 1, 62, 1, 0.0F, false));

		doorstopes = new RendererModel(this);
		doorstopes.setRotationPoint(3.5F, -64.75F, -18.25F);
		body.addChild(doorstopes);
		doorstopes.cubeList.add(new ModelBox(doorstopes, 4, 4, -8.0F, 0.85F, 0.0F, 1, 1, 1, 0.0F, false));
		doorstopes.cubeList.add(new ModelBox(doorstopes, 0, 0, -9.0F, -0.15F, 0.0F, 3, 1, 1, 0.0F, false));
		doorstopes.cubeList.add(new ModelBox(doorstopes, 0, 4, 0.0F, 0.85F, 0.0F, 1, 1, 1, 0.0F, false));
		doorstopes.cubeList.add(new ModelBox(doorstopes, 0, 2, -1.0F, -0.15F, 0.0F, 3, 1, 1, 0.0F, false));

		lamp_glow = new RendererModel(this);
		lamp_glow.setRotationPoint(0.0F, -56.0F, 0.0F);
		lamp_glow.cubeList.add(new ModelBox(lamp_glow, 10, 0, -2.0F, -2.0F, -2.0F, 4, 4, 4, 0.0F, false));

		boti = new RendererModel(this);
		boti.setRotationPoint(0.0F, 24.0F, 0.0F);
		boti.cubeList.add(new ModelBox(boti, 0, 118, -15.5F, -68.0F, -16.25F, 31, 66, 1, 0.0F, false));

		rightdoor = new RendererModel(this);
		rightdoor.setRotationPoint(-14.5F, 22.0F, -17.0F);
		rightdoor.cubeList.add(new ModelBox(rightdoor, 216, 216, 0.0F, -62.0F, -0.25F, 2, 62, 1, 0.0F, false));
		rightdoor.cubeList.add(new ModelBox(rightdoor, 215, 8, 12.0F, -62.0F, -0.25F, 2, 62, 1, 0.0F, false));
		rightdoor.cubeList.add(new ModelBox(rightdoor, 122, 219, 14.0F, -62.0F, -0.75F, 1, 62, 1, 0.0F, false));
		rightdoor.cubeList.add(new ModelBox(rightdoor, 148, 138, 2.0F, -2.0F, -0.25F, 10, 2, 1, 0.0F, false));
		rightdoor.cubeList.add(new ModelBox(rightdoor, 148, 135, 2.0F, -17.0F, -0.25F, 10, 2, 1, 0.0F, false));
		rightdoor.cubeList.add(new ModelBox(rightdoor, 64, 145, 2.0F, -47.0F, -0.25F, 10, 2, 1, 0.0F, false));
		rightdoor.cubeList.add(new ModelBox(rightdoor, 64, 148, 2.0F, -32.0F, -0.25F, 10, 2, 1, 0.0F, false));
		rightdoor.cubeList.add(new ModelBox(rightdoor, 145, 33, 2.0F, -62.0F, -0.25F, 10, 2, 1, 0.0F, false));
		rightdoor.cubeList.add(new ModelBox(rightdoor, 225, 8, 2.0F, -45.0F, 0.25F, 10, 43, 1, 0.0F, false));

		window2 = new RendererModel(this);
		window2.setRotationPoint(14.5F, 2.0F, 17.0F);
		rightdoor.addChild(window2);
		window2.cubeList.add(new ModelBox(window2, 196, 173, -3.5F, -61.0F, -17.0F, 1, 11, 1, 0.0F, false));
		window2.cubeList.add(new ModelBox(window2, 120, 45, -11.5F, -56.0F, -17.0F, 8, 1, 1, 0.0F, false));
		window2.cubeList.add(new ModelBox(window2, 198, 80, -12.5F, -61.0F, -17.0F, 1, 11, 1, 0.0F, false));
		window2.cubeList.add(new ModelBox(window2, 196, 52, -9.5F, -61.0F, -17.0F, 1, 11, 1, 0.0F, false));
		window2.cubeList.add(new ModelBox(window2, 182, 161, -11.5F, -61.0F, -16.75F, 8, 11, 1, 0.0F, false));
		window2.cubeList.add(new ModelBox(window2, 145, 36, -12.5F, -62.0F, -17.0F, 10, 1, 1, 0.0F, false));
		window2.cubeList.add(new ModelBox(window2, 192, 173, -6.5F, -61.0F, -17.0F, 1, 11, 1, 0.0F, false));
		window2.cubeList.add(new ModelBox(window2, 148, 141, -12.5F, -50.0F, -17.0F, 10, 1, 1, 0.0F, false));

		leftdoor = new RendererModel(this);
		leftdoor.setRotationPoint(14.5F, 22.0F, -17.0F);
		leftdoor.cubeList.add(new ModelBox(leftdoor, 210, 145, -2.0F, -62.0F, -0.25F, 2, 62, 1, 0.0F, false));
		leftdoor.cubeList.add(new ModelBox(leftdoor, 210, 210, -14.0F, -62.0F, -0.25F, 2, 62, 1, 0.0F, false));
		leftdoor.cubeList.add(new ModelBox(leftdoor, 144, 38, -12.0F, -2.0F, -0.25F, 10, 2, 1, 0.0F, false));
		leftdoor.cubeList.add(new ModelBox(leftdoor, 64, 142, -12.0F, -17.0F, -0.25F, 10, 2, 1, 0.0F, false));
		leftdoor.cubeList.add(new ModelBox(leftdoor, 141, 61, -12.0F, -47.0F, -0.25F, 10, 2, 1, 0.0F, false));
		leftdoor.cubeList.add(new ModelBox(leftdoor, 141, 58, -12.0F, -32.0F, -0.25F, 10, 2, 1, 0.0F, false));
		leftdoor.cubeList.add(new ModelBox(leftdoor, 141, 55, -12.0F, -62.0F, -0.25F, 10, 2, 1, 0.0F, false));
		leftdoor.cubeList.add(new ModelBox(leftdoor, 224, 113, -12.0F, -45.0F, 0.25F, 10, 43, 1, 0.0F, false));
		leftdoor.cubeList.add(new ModelBox(leftdoor, 0, 6, -13.5F, -31.5F, -0.5F, 1, 1, 1, 0.0F, false));
		leftdoor.cubeList.add(new ModelBox(leftdoor, 0, 19, -13.5F, -41.0F, -0.65F, 1, 5, 1, 0.0F, false));

		window = new RendererModel(this);
		window.setRotationPoint(-14.5F, 2.0F, 17.0F);
		leftdoor.addChild(window);
		window.cubeList.add(new ModelBox(window, 105, 144, 2.5F, -50.0F, -17.0F, 10, 1, 1, 0.0F, false));
		window.cubeList.add(new ModelBox(window, 182, 145, 3.5F, -61.0F, -16.75F, 8, 11, 1, 0.0F, false));
		window.cubeList.add(new ModelBox(window, 174, 161, 2.5F, -61.0F, -17.0F, 1, 11, 1, 0.0F, false));
		window.cubeList.add(new ModelBox(window, 178, 8, 5.5F, -61.0F, -17.0F, 1, 11, 1, 0.0F, false));
		window.cubeList.add(new ModelBox(window, 178, 33, 8.5F, -61.0F, -17.0F, 1, 11, 1, 0.0F, false));
		window.cubeList.add(new ModelBox(window, 120, 43, 3.5F, -56.0F, -17.0F, 8, 1, 1, 0.0F, false));
		window.cubeList.add(new ModelBox(window, 181, 19, 11.5F, -61.0F, -17.0F, 1, 11, 1, 0.0F, false));
		window.cubeList.add(new ModelBox(window, 117, 118, 2.5F, -62.0F, -17.0F, 10, 1, 1, 0.0F, false));
	}

public void render(ExteriorTile tile) {
		EnumDoorState state = tile.getOpen();
		GlStateManager.pushMatrix();
        GlStateManager.enableRescaleNormal();
        GlStateManager.translated(0.0D, 0.58, 0.0D);
        GlStateManager.scalef(0.6F, 0.6F, 0.6F);
        switch(state) {
        case ONE:
            this.leftdoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.KOMIX.getRotationForState(EnumDoorState.ONE));
            this.rightdoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.KOMIX.getRotationForState(EnumDoorState.CLOSED));
            break;
        case BOTH:
            this.leftdoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.KOMIX.getRotationForState(EnumDoorState.ONE));
            this.rightdoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.KOMIX.getRotationForState(EnumDoorState.BOTH));
            break;
        case CLOSED:
            this.rightdoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.KOMIX.getRotationForState(EnumDoorState.CLOSED));
            this.leftdoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.KOMIX.getRotationForState(EnumDoorState.CLOSED));
        }
		this.body.render(0.0625F);
        this.boti.render(0.0625F);
        this.rightdoor.render(0.0625F);
        this.leftdoor.render(0.0625F);
        float glow = tile.getLightLevel();
        ModelHelper.renderPartBrightness(glow, new RendererModel[]{this.lamp_glow});
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}