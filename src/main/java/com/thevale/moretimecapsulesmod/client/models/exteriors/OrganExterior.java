package com.thevale.moretimecapsulesmod.client.models.exteriors;// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.vector.Vector3f;
import net.tardis.mod.client.models.exteriors.ExteriorModel;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class OrganExterior extends ExteriorModel {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer Door;
	private final ModelRenderer bb_main2;

	public OrganExterior() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(59, 19).addBox(-10.0F, -9.0F, -6.0F, 20.0F, 4.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(-10.0F, -9.0F, -8.0F, 2.0F, 9.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(8.0F, -9.0F, -8.0F, 2.0F, 9.0F, 1.0F, 0.0F, true);
		bb_main.setTextureOffset(0, 0).addBox(-10.0F, -6.0F, -6.0F, 7.0F, 6.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(3.0F, -6.0F, -6.0F, 7.0F, 6.0F, 1.0F, 0.0F, true);
		bb_main.setTextureOffset(0, 0).addBox(-3.0F, -5.0F, -6.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(114, 31).addBox(-3.0F, -4.5F, -6.25F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(114, 31).addBox(-4.0F, -4.5F, -6.25F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(114, 31).addBox(3.0F, -4.5F, -6.25F, 1.0F, 5.0F, 1.0F, 0.0F, true);
		bb_main.setTextureOffset(0, 0).addBox(-10.0F, -9.0F, -5.0F, 20.0F, 9.0F, 12.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-10.0F, -13.0F, -1.0F, 20.0F, 4.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-10.0F, -10.0F, -6.0F, 20.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(-10.0F, -9.5F, -7.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 30).addBox(-10.0F, -1.0F, -7.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(8.0F, -9.5F, -7.5F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		bb_main.setTextureOffset(0, 30).addBox(8.0F, -1.0F, -7.0F, 2.0F, 1.0F, 1.0F, 0.0F, true);
		bb_main.setTextureOffset(12, 40).addBox(-8.0F, -11.0F, -6.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(12, 40).addBox(-7.0F, -11.0F, -6.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(12, 40).addBox(-5.0F, -11.0F, -6.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(12, 40).addBox(-6.0F, -11.0F, -6.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(12, 40).addBox(-4.0F, -11.0F, -6.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(12, 40).addBox(1.0F, -11.0F, -6.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(12, 40).addBox(0.0F, -11.0F, -6.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(12, 40).addBox(-1.0F, -11.0F, -6.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(12, 40).addBox(-2.0F, -11.0F, -6.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(12, 40).addBox(-3.0F, -11.0F, -6.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(12, 40).addBox(3.0F, -11.0F, -6.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(12, 40).addBox(4.0F, -11.0F, -6.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(12, 40).addBox(2.0F, -11.0F, -6.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(12, 40).addBox(6.0F, -11.0F, -6.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(12, 40).addBox(7.0F, -11.0F, -6.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(12, 40).addBox(5.0F, -11.0F, -6.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 39).addBox(6.5625F, -11.3125F, -5.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 39).addBox(4.75F, -11.3125F, -5.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 39).addBox(1.25F, -11.3125F, -5.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 39).addBox(3.0F, -11.3125F, -5.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 39).addBox(-5.75F, -11.3125F, -5.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 39).addBox(-4.0F, -11.3125F, -5.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 39).addBox(-0.5F, -11.3125F, -5.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(3, 41).addBox(-2.25F, -11.3125F, -5.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 39).addBox(-7.75F, -11.3125F, -5.75F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 23).addBox(-10.0F, -13.0F, -4.0F, 20.0F, 4.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(20, 4).addBox(-10.0F, -12.0F, -6.5F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(2, 5).addBox(8.0F, -12.0F, -6.5F, 2.0F, 2.0F, 3.0F, 0.0F, true);
		bb_main.setTextureOffset(110, 21).addBox(-10.0F, -10.0F, -7.0F, 20.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-10.0F, -32.0F, 4.0F, 20.0F, 13.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(-9.0F, -16.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(-9.5F, -15.5F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(-9.5F, -14.5F, -1.5F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(-9.5F, -13.5F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(8.5F, -15.5F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bb_main.setTextureOffset(110, 0).addBox(8.0F, -16.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bb_main.setTextureOffset(110, 0).addBox(8.5F, -14.5F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bb_main.setTextureOffset(110, 0).addBox(8.5F, -13.5F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bb_main.setTextureOffset(110, 0).addBox(-8.5F, -16.5F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(-8.0F, -17.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(-7.5F, -17.5F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(-8.0F, -18.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(-8.5F, -17.5F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(-7.5F, -18.5F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(-6.75F, -18.25F, -1.5F, 13.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(6.0F, -18.25F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bb_main.setTextureOffset(110, 0).addBox(6.5F, -17.5F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bb_main.setTextureOffset(110, 0).addBox(7.0F, -17.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bb_main.setTextureOffset(110, 0).addBox(7.5F, -16.5F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bb_main.setTextureOffset(110, 0).addBox(7.5F, -17.5F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bb_main.setTextureOffset(110, 0).addBox(6.5F, -18.5F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bb_main.setTextureOffset(110, 0).addBox(7.0F, -18.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bb_main.setTextureOffset(1, 45).addBox(-6.5F, -27.0F, 2.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 45).addBox(-4.5F, -28.0F, 2.5F, 1.0F, 9.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 45).addBox(-2.5F, -29.0F, 2.5F, 1.0F, 10.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 45).addBox(-0.5F, -29.0F, 2.5F, 1.0F, 10.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 45).addBox(1.5F, -29.0F, 2.5F, 1.0F, 10.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 45).addBox(3.5F, -28.0F, 2.5F, 1.0F, 9.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 45).addBox(5.5F, -27.0F, 2.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(1, 45).addBox(7.5F, -26.0F, 2.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(35, 9).addBox(-10.0F, -19.0F, -1.0F, 20.0F, 6.0F, 8.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-10.0F, -32.0F, 2.25F, 1.0F, 13.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(4, 56).addBox(-0.5F, -26.25F, 2.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(4, 56).addBox(-2.5F, -25.25F, 2.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(4, 56).addBox(-4.5F, -24.25F, 2.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(4, 56).addBox(-6.5F, -23.25F, 2.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(4, 56).addBox(-8.5F, -22.25F, 2.25F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(4, 56).addBox(7.5F, -22.25F, 2.25F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bb_main.setTextureOffset(4, 56).addBox(5.5F, -23.25F, 2.25F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bb_main.setTextureOffset(4, 56).addBox(3.5F, -24.25F, 2.25F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bb_main.setTextureOffset(4, 56).addBox(1.5F, -25.25F, 2.25F, 1.0F, 1.0F, 1.0F, 0.0F, true);
		bb_main.setTextureOffset(0, 0).addBox(9.0F, -32.0F, 2.25F, 1.0F, 13.0F, 3.0F, 0.0F, true);
		bb_main.setTextureOffset(0, 0).addBox(-10.0F, -32.0F, 2.25F, 20.0F, 2.0F, 3.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(8.0F, -28.0F, 3.5F, 1.0F, 2.0F, 2.0F, 0.0F, true);
		bb_main.setTextureOffset(110, 0).addBox(7.5F, -29.5F, 3.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		bb_main.setTextureOffset(110, 0).addBox(7.5F, -28.5F, 3.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		bb_main.setTextureOffset(110, 0).addBox(7.0F, -29.0F, 3.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		bb_main.setTextureOffset(110, 0).addBox(6.5F, -29.5F, 3.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		bb_main.setTextureOffset(110, 0).addBox(6.0F, -30.25F, 3.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		bb_main.setTextureOffset(110, 0).addBox(6.5F, -30.5F, 3.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		bb_main.setTextureOffset(110, 0).addBox(7.0F, -30.0F, 3.5F, 1.0F, 1.0F, 2.0F, 0.0F, true);
		bb_main.setTextureOffset(110, 0).addBox(-9.0F, -28.0F, 3.5F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(-8.5F, -28.5F, 3.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(-8.0F, -29.0F, 3.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(-7.5F, -29.5F, 3.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(-7.0F, -30.25F, 3.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(-7.5F, -30.5F, 3.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(-8.5F, -29.5F, 3.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		bb_main.setTextureOffset(110, 0).addBox(-8.0F, -30.0F, 3.5F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-8.0F, -22.5F, 3.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.6981F, 0.0F);
		cube_r1.setTextureOffset(1, 45).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, true);

		cube_r2_r1 = new ModelRenderer(this);
		cube_r2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		cube_r1.addChild(cube_r2_r1);
		setRotationAngle(cube_r2_r1, 0.0F, -0.9599F, 0.0F);
		cube_r2_r1.setTextureOffset(1, 45).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, true);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.0F, -24.0F, 3.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.6981F, 0.0F);
		cube_r2.setTextureOffset(1, 45).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 10.0F, 1.0F, 0.0F, true);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-4.0F, -23.5F, 3.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.6981F, 0.0F);
		cube_r3.setTextureOffset(1, 45).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, 0.0F, true);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-6.0F, -23.0F, 3.0F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.7854F, 0.0F);
		cube_r4.setTextureOffset(1, 45).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, true);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(8.0F, -22.5F, 3.0F);
		bb_main.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.6981F, 0.0F);
		cube_r5.setTextureOffset(1, 45).addBox(-0.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(6.0F, -23.0F, 3.0F);
		bb_main.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.7854F, 0.0F);
		cube_r6.setTextureOffset(1, 45).addBox(-0.5F, -4.0F, -0.5F, 1.0F, 8.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(4.0F, -23.5F, 3.0F);
		bb_main.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.6981F, 0.0F);
		cube_r7.setTextureOffset(1, 45).addBox(-0.5F, -4.5F, -0.5F, 1.0F, 9.0F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(2.0F, -24.0F, 3.0F);
		bb_main.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.6981F, 0.0F);
		cube_r8.setTextureOffset(1, 45).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 10.0F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -24.0F, 3.0F);
		bb_main.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.6981F, 0.0F);
		cube_r9.setTextureOffset(1, 45).addBox(-0.5F, -5.0F, -0.5F, 1.0F, 10.0F, 1.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(6.0F, -26.5F, 3.0F);
		bb_main.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -1.0996F);
		cube_r10.setTextureOffset(41, 19).addBox(-0.5F, -7.5F, -0.75F, 2.0F, 11.0F, 2.0F, 0.0F, true);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-6.0F, -26.5F, 3.0F);
		bb_main.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 1.0996F);
		cube_r11.setTextureOffset(41, 19).addBox(-1.5F, -7.5F, -0.75F, 2.0F, 11.0F, 2.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, -14.0F, -2.25F);
		bb_main.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.6545F, 0.0F, 0.0F);
		cube_r12.setTextureOffset(62, 25).addBox(-8.0F, -2.0F, 0.5F, 16.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, -1.0F, -6.5F);
		bb_main.addChild(cube_r13);
		setRotationAngle(cube_r13, -1.0472F, 0.0F, 0.0F);
		cube_r13.setTextureOffset(66, 10).addBox(-3.0F, -2.0F, -0.5F, 6.0F, 3.0F, 1.0F, 0.0F, false);

		Door = new ModelRenderer(this);
		Door.setRotationPoint(7.0F, 7.75F, 7.0625F);
		Door.setTextureOffset(0, 60).addBox(-12.0F, -0.75F, 0.1875F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		Door.setTextureOffset(72, 0).addBox(-13.0F, -14.75F, -0.3125F, 13.0F, 29.0F, 1.0F, 0.0F, false);

		bb_main2 = new ModelRenderer(this);
		bb_main2.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main2.setTextureOffset(100, 98).addBox(-6.0F, -31.0F, 6.125F, 13.0F, 29.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(ExteriorTile tile, float v, MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float v1){
		EnumDoorState state = tile.getOpen();
		matrixStack.push();
		matrixStack.rotate(Vector3f.YP.rotationDegrees(180));
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
		this.bb_main.render(matrixStack, buffer, packedLight, packedOverlay);
		this.bb_main2.render(matrixStack, buffer, packedLight, packedOverlay);
		this.Door.render(matrixStack, buffer, packedLight, packedOverlay);
	    matrixStack.pop();
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public void render(MatrixStack matrixStackIn, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {

	}
}