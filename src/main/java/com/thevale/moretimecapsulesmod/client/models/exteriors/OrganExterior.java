package com.thevale.moretimecapsulesmod.client.models.exteriors;// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.platform.GlStateManager;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class OrganExterior extends EntityModel {
	private final RendererModel bb_main;
	private final RendererModel cube_r1;
	private final RendererModel cube_r2_r1;
	private final RendererModel cube_r2;
	private final RendererModel cube_r3;
	private final RendererModel cube_r4;
	private final RendererModel cube_r5;
	private final RendererModel cube_r6;
	private final RendererModel cube_r7;
	private final RendererModel cube_r8;
	private final RendererModel cube_r9;
	private final RendererModel cube_r10;
	private final RendererModel cube_r11;
	private final RendererModel cube_r12;
	private final RendererModel cube_r13;
	private final RendererModel Door;
	private final RendererModel bb_main2;

	public OrganExterior() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new RendererModel(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 59, 19, -10.0F, -9.0F, -6.0F, 20, 4, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, -10.0F, -9.0F, -8.0F, 2, 9, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, 8.0F, -9.0F, -8.0F, 2, 9, 1, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -10.0F, -6.0F, -6.0F, 7, 6, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 3.0F, -6.0F, -6.0F, 7, 6, 1, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -3.0F, -5.0F, -6.0F, 6, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 114, 31, -3.0F, -4.5F, -6.25F, 6, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 114, 31, -4.0F, -4.5F, -6.25F, 1, 5, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 114, 31, 3.0F, -4.5F, -6.25F, 1, 5, 1, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -10.0F, -9.0F, -5.0F, 20, 9, 12, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -10.0F, -13.0F, -1.0F, 20, 4, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -10.0F, -10.0F, -6.0F, 20, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, -10.0F, -9.5F, -7.5F, 2, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 30, -10.0F, -1.0F, -7.0F, 2, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, 8.0F, -9.5F, -7.5F, 2, 1, 1, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 30, 8.0F, -1.0F, -7.0F, 2, 1, 1, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 40, -8.0F, -11.0F, -6.5F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 40, -7.0F, -11.0F, -6.5F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 40, -5.0F, -11.0F, -6.5F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 40, -6.0F, -11.0F, -6.5F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 40, -4.0F, -11.0F, -6.5F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 40, 1.0F, -11.0F, -6.5F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 40, 0.0F, -11.0F, -6.5F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 40, -1.0F, -11.0F, -6.5F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 40, -2.0F, -11.0F, -6.5F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 40, -3.0F, -11.0F, -6.5F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 40, 3.0F, -11.0F, -6.5F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 40, 4.0F, -11.0F, -6.5F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 40, 2.0F, -11.0F, -6.5F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 40, 6.0F, -11.0F, -6.5F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 40, 7.0F, -11.0F, -6.5F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 40, 5.0F, -11.0F, -6.5F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 39, 6.5625F, -11.3125F, -5.75F, 1, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 39, 4.75F, -11.3125F, -5.75F, 1, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 39, 1.25F, -11.3125F, -5.75F, 1, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 39, 3.0F, -11.3125F, -5.75F, 1, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 39, -5.75F, -11.3125F, -5.75F, 1, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 39, -4.0F, -11.3125F, -5.75F, 1, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 39, -0.5F, -11.3125F, -5.75F, 1, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 3, 41, -2.25F, -11.3125F, -5.75F, 1, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 39, -7.75F, -11.3125F, -5.75F, 1, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 23, -10.0F, -13.0F, -4.0F, 20, 4, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 20, 4, -10.0F, -12.0F, -6.5F, 2, 2, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 2, 5, 8.0F, -12.0F, -6.5F, 2, 2, 3, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 21, -10.0F, -10.0F, -7.0F, 20, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -10.0F, -32.0F, 4.0F, 20, 13, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, -9.0F, -16.0F, -1.5F, 1, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, -9.5F, -15.5F, -1.5F, 1, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, -9.5F, -14.5F, -1.5F, 1, 1, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, -9.5F, -13.5F, -1.5F, 1, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, 8.5F, -15.5F, -1.5F, 1, 1, 1, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, 8.0F, -16.0F, -1.5F, 1, 1, 1, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, 8.5F, -14.5F, -1.5F, 1, 1, 1, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, 8.5F, -13.5F, -1.5F, 1, 1, 1, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, -8.5F, -16.5F, -1.5F, 1, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, -8.0F, -17.0F, -1.5F, 1, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, -7.5F, -17.5F, -1.5F, 1, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, -8.0F, -18.0F, -1.5F, 1, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, -8.5F, -17.5F, -1.5F, 1, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, -7.5F, -18.5F, -1.5F, 1, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, -6.75F, -18.25F, -1.5F, 13, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, 6.0F, -18.25F, -1.5F, 1, 1, 1, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, 6.5F, -17.5F, -1.5F, 1, 1, 1, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, 7.0F, -17.0F, -1.5F, 1, 1, 1, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, 7.5F, -16.5F, -1.5F, 1, 1, 1, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, 7.5F, -17.5F, -1.5F, 1, 1, 1, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, 6.5F, -18.5F, -1.5F, 1, 1, 1, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, 7.0F, -18.0F, -1.5F, 1, 1, 1, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 1, 45, -6.5F, -27.0F, 2.5F, 1, 8, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 1, 45, -4.5F, -28.0F, 2.5F, 1, 9, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 1, 45, -2.5F, -29.0F, 2.5F, 1, 10, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 1, 45, -0.5F, -29.0F, 2.5F, 1, 10, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 1, 45, 1.5F, -29.0F, 2.5F, 1, 10, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 1, 45, 3.5F, -28.0F, 2.5F, 1, 9, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 1, 45, 5.5F, -27.0F, 2.5F, 1, 8, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 1, 45, 7.5F, -26.0F, 2.5F, 1, 7, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 35, 9, -10.0F, -19.0F, -1.0F, 20, 6, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -10.0F, -32.0F, 2.25F, 1, 13, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 4, 56, -0.5F, -26.25F, 2.25F, 1, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 4, 56, -2.5F, -25.25F, 2.25F, 1, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 4, 56, -4.5F, -24.25F, 2.25F, 1, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 4, 56, -6.5F, -23.25F, 2.25F, 1, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 4, 56, -8.5F, -22.25F, 2.25F, 1, 1, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 4, 56, 7.5F, -22.25F, 2.25F, 1, 1, 1, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 4, 56, 5.5F, -23.25F, 2.25F, 1, 1, 1, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 4, 56, 3.5F, -24.25F, 2.25F, 1, 1, 1, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 4, 56, 1.5F, -25.25F, 2.25F, 1, 1, 1, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, 9.0F, -32.0F, 2.25F, 1, 13, 3, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -10.0F, -32.0F, 2.25F, 20, 2, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, 8.0F, -28.0F, 3.5F, 1, 2, 2, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, 7.5F, -29.5F, 3.5F, 1, 1, 2, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, 7.5F, -28.5F, 3.5F, 1, 1, 2, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, 7.0F, -29.0F, 3.5F, 1, 1, 2, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, 6.5F, -29.5F, 3.5F, 1, 1, 2, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, 6.0F, -30.25F, 3.5F, 1, 1, 2, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, 6.5F, -30.5F, 3.5F, 1, 1, 2, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, 7.0F, -30.0F, 3.5F, 1, 1, 2, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, -9.0F, -28.0F, 3.5F, 1, 2, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, -8.5F, -28.5F, 3.5F, 1, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, -8.0F, -29.0F, 3.5F, 1, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, -7.5F, -29.5F, 3.5F, 1, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, -7.0F, -30.25F, 3.5F, 1, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, -7.5F, -30.5F, 3.5F, 1, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, -8.5F, -29.5F, 3.5F, 1, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 110, 0, -8.0F, -30.0F, 3.5F, 1, 1, 2, 0.0F, false));

		cube_r1 = new RendererModel(this);
		cube_r1.setRotationPoint(-8.0F, -22.5F, 3.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.6981F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 45, -0.5F, -3.5F, -0.5F, 1, 7, 1, 0.0F, true));

		cube_r2_r1 = new RendererModel(this);
		cube_r2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		cube_r1.addChild(cube_r2_r1);
		setRotationAngle(cube_r2_r1, 0.0F, -0.9599F, 0.0F);
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 1, 45, -0.5F, -3.5F, -0.5F, 1, 7, 1, 0.0F, true));

		cube_r2 = new RendererModel(this);
		cube_r2.setRotationPoint(-2.0F, -24.0F, 3.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.6981F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 45, -0.5F, -5.0F, -0.5F, 1, 10, 1, 0.0F, true));

		cube_r3 = new RendererModel(this);
		cube_r3.setRotationPoint(-4.0F, -23.5F, 3.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.6981F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 45, -0.5F, -4.5F, -0.5F, 1, 9, 1, 0.0F, true));

		cube_r4 = new RendererModel(this);
		cube_r4.setRotationPoint(-6.0F, -23.0F, 3.0F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.7854F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 45, -0.5F, -4.0F, -0.5F, 1, 8, 1, 0.0F, true));

		cube_r5 = new RendererModel(this);
		cube_r5.setRotationPoint(8.0F, -22.5F, 3.0F);
		bb_main.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.6981F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 1, 45, -0.5F, -3.5F, -0.5F, 1, 7, 1, 0.0F, false));

		cube_r6 = new RendererModel(this);
		cube_r6.setRotationPoint(6.0F, -23.0F, 3.0F);
		bb_main.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.7854F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 1, 45, -0.5F, -4.0F, -0.5F, 1, 8, 1, 0.0F, false));

		cube_r7 = new RendererModel(this);
		cube_r7.setRotationPoint(4.0F, -23.5F, 3.0F);
		bb_main.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.6981F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 1, 45, -0.5F, -4.5F, -0.5F, 1, 9, 1, 0.0F, false));

		cube_r8 = new RendererModel(this);
		cube_r8.setRotationPoint(2.0F, -24.0F, 3.0F);
		bb_main.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.6981F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 1, 45, -0.5F, -5.0F, -0.5F, 1, 10, 1, 0.0F, false));

		cube_r9 = new RendererModel(this);
		cube_r9.setRotationPoint(0.0F, -24.0F, 3.0F);
		bb_main.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.6981F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 1, 45, -0.5F, -5.0F, -0.5F, 1, 10, 1, 0.0F, false));

		cube_r10 = new RendererModel(this);
		cube_r10.setRotationPoint(6.0F, -26.5F, 3.0F);
		bb_main.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -1.0996F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 41, 19, -0.5F, -7.5F, -0.75F, 2, 11, 2, 0.0F, true));

		cube_r11 = new RendererModel(this);
		cube_r11.setRotationPoint(-6.0F, -26.5F, 3.0F);
		bb_main.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 1.0996F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 41, 19, -1.5F, -7.5F, -0.75F, 2, 11, 2, 0.0F, false));

		cube_r12 = new RendererModel(this);
		cube_r12.setRotationPoint(0.0F, -14.0F, -2.25F);
		bb_main.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.6545F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 62, 25, -8.0F, -2.0F, 0.5F, 16, 3, 1, 0.0F, false));

		cube_r13 = new RendererModel(this);
		cube_r13.setRotationPoint(0.0F, -1.0F, -6.5F);
		bb_main.addChild(cube_r13);
		setRotationAngle(cube_r13, -1.0472F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 66, 10, -3.0F, -2.0F, -0.5F, 6, 3, 1, 0.0F, false));

		Door = new RendererModel(this);
		Door.setRotationPoint(7.0F, 7.75F, 7.0625F);
		Door.cubeList.add(new ModelBox(Door, 0, 60, -12.0F, -0.75F, 0.1875F, 1, 2, 1, 0.0F, false));
		Door.cubeList.add(new ModelBox(Door, 72, 0, -13.0F, -14.75F, -0.3125F, 13, 29, 1, 0.0F, false));

		bb_main2 = new RendererModel(this);
		bb_main2.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main2.cubeList.add(new ModelBox(bb_main2, 100, 98, -6.0F, -31.0F, 6.125F, 13, 29, 1, 0.0F, false));
	}

public void render(ExteriorTile tile) {
		EnumDoorState state = tile.getOpen();
		GlStateManager.pushMatrix();
        GlStateManager.enableRescaleNormal();
        GlStateManager.rotated(180.0D, 0.0D, 180.0D, 0.0D);
		switch(state) {
        case ONE:
            this.Door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.ORGAN.getRotationForState(EnumDoorState.ONE));
            break;
        case BOTH:
            this.Door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.ORGAN.getRotationForState(EnumDoorState.BOTH));
            break;
        case CLOSED:
            this.Door.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.ORGAN.getRotationForState(EnumDoorState.CLOSED));
        }
		this.bb_main.render(0.0625F);
		this.bb_main2.render(0.0625F);
		this.Door.render(0.0625F);
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}