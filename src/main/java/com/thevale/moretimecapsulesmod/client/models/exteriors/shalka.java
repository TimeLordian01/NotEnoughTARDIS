package com.thevale.moretimecapsulesmod.client.models.exteriors;// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class shalka extends EntityModel {
	private final RendererModel Shell;
	private final RendererModel Base;
	private final RendererModel PCB;
	private final RendererModel PCB2;
	private final RendererModel PCB3;
	private final RendererModel PCB4;
	private final RendererModel Walls1;
	private final RendererModel Right2;
	private final RendererModel Left2;
	private final RendererModel Walls2;
	private final RendererModel Right3;
	private final RendererModel Left3;
	private final RendererModel Walls3;
	private final RendererModel Right4;
	private final RendererModel Left4;
	private final RendererModel LeftDoor;
	private final RendererModel RightDoor;

	public shalka() {
		textureWidth = 512;
		textureHeight = 512;

		Shell = new RendererModel(this);
		Shell.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Base = new RendererModel(this);
		Base.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Base);
		Base.cubeList.add(new ModelBox(Base, 0, 0, -10.5F, -1.0F, -10.5F, 21, 1, 21, 0.0F, false));
		Base.cubeList.add(new ModelBox(Base, 84, 0, -9.5F, -43.625F, -9.5F, 19, 2, 19, 0.0F, false));
		Base.cubeList.add(new ModelBox(Base, 160, 0, -8.5F, -44.625F, -8.5F, 17, 1, 17, 0.0F, false));
		Base.cubeList.add(new ModelBox(Base, 394, 25, -2.0F, -45.375F, -2.0F, 4, 1, 4, 0.0F, false));
		Base.cubeList.add(new ModelBox(Base, 394, 25, -2.0F, -50.125F, -2.0F, 4, 1, 4, -0.125F, false));
		Base.cubeList.add(new ModelBox(Base, 394, 25, 1.0F, -49.375F, -2.0F, 1, 4, 1, 0.0F, false));
		Base.cubeList.add(new ModelBox(Base, 196, 49, -1.5F, -49.375F, -1.5F, 3, 4, 3, 0.0F, false));
		Base.cubeList.add(new ModelBox(Base, 394, 25, -2.0F, -49.375F, -2.0F, 1, 4, 1, 0.0F, false));
		Base.cubeList.add(new ModelBox(Base, 394, 25, -2.0F, -49.375F, 1.0F, 1, 4, 1, 0.0F, false));
		Base.cubeList.add(new ModelBox(Base, 394, 25, 1.0F, -49.375F, 1.0F, 1, 4, 1, 0.0F, false));
		Base.cubeList.add(new ModelBox(Base, 228, 0, 8.375F, -41.75F, -9.375F, 1, 40, 1, 0.75F, false));
		Base.cubeList.add(new ModelBox(Base, 233, 0, -9.375F, -41.75F, -9.375F, 1, 40, 1, 0.75F, false));
		Base.cubeList.add(new ModelBox(Base, 236, 0, -9.375F, -41.75F, 8.375F, 1, 40, 1, 0.75F, false));
		Base.cubeList.add(new ModelBox(Base, 240, 0, 8.375F, -41.75F, 8.375F, 1, 40, 1, 0.75F, false));
		Base.cubeList.add(new ModelBox(Base, 248, 0, 7.75F, -38.5F, -9.25F, 1, 37, 1, 0.5F, false));
		Base.cubeList.add(new ModelBox(Base, 272, 0, -9.25F, -38.5F, -8.75F, 1, 37, 1, 0.5F, false));
		Base.cubeList.add(new ModelBox(Base, 264, 0, -8.75F, -38.5F, 8.25F, 1, 37, 1, 0.5F, false));
		Base.cubeList.add(new ModelBox(Base, 256, 0, 8.25F, -38.5F, 7.75F, 1, 37, 1, 0.5F, false));
		Base.cubeList.add(new ModelBox(Base, 252, 0, 8.25F, -38.5F, -8.75F, 1, 37, 1, 0.5F, false));
		Base.cubeList.add(new ModelBox(Base, 244, 0, -8.75F, -38.5F, -9.25F, 1, 37, 1, 0.5F, false));
		Base.cubeList.add(new ModelBox(Base, 268, 0, -9.25F, -38.5F, 7.75F, 1, 37, 1, 0.5F, false));
		Base.cubeList.add(new ModelBox(Base, 260, 0, 7.75F, -38.5F, 8.25F, 1, 37, 1, 0.5F, false));
		Base.cubeList.add(new ModelBox(Base, 276, 0, 6.5F, -38.75F, -9.5F, 1, 38, 1, -0.25F, false));
		Base.cubeList.add(new ModelBox(Base, 288, 0, -9.5F, -38.75F, -7.5F, 1, 38, 1, -0.25F, false));
		Base.cubeList.add(new ModelBox(Base, 284, 0, -7.5F, -38.75F, 8.5F, 1, 38, 1, -0.25F, false));
		Base.cubeList.add(new ModelBox(Base, 280, 0, 8.5F, -38.75F, 6.5F, 1, 38, 1, -0.25F, false));
		Base.cubeList.add(new ModelBox(Base, 280, 0, 8.5F, -38.75F, -7.5F, 1, 38, 1, -0.25F, false));
		Base.cubeList.add(new ModelBox(Base, 276, 0, -7.5F, -38.75F, -9.5F, 1, 38, 1, -0.25F, false));
		Base.cubeList.add(new ModelBox(Base, 288, 0, -9.5F, -38.75F, 6.5F, 1, 38, 1, -0.25F, false));
		Base.cubeList.add(new ModelBox(Base, 284, 0, 6.5F, -38.75F, 8.5F, 1, 38, 1, -0.25F, false));

		PCB = new RendererModel(this);
		PCB.setRotationPoint(0.0F, -1.75F, 0.0F);
		Shell.addChild(PCB);
		PCB.cubeList.add(new ModelBox(PCB, 421, 14, -8.0F, -37.25F, -11.375F, 16, 1, 3, -0.25F, false));
		PCB.cubeList.add(new ModelBox(PCB, 421, 14, -8.0625F, -39.6875F, -11.4375F, 2, 3, 3, -0.3125F, false));
		PCB.cubeList.add(new ModelBox(PCB, 421, 14, 6.0625F, -39.6875F, -11.4375F, 2, 3, 3, -0.3125F, false));
		PCB.cubeList.add(new ModelBox(PCB, 186, 18, -7.0F, -39.6875F, -10.8125F, 14, 3, 1, -0.3125F, false));
		PCB.cubeList.add(new ModelBox(PCB, 421, 14, -8.0F, -40.125F, -11.375F, 16, 1, 3, -0.25F, false));

		PCB2 = new RendererModel(this);
		PCB2.setRotationPoint(0.0F, -1.75F, 0.0F);
		Shell.addChild(PCB2);
		PCB2.cubeList.add(new ModelBox(PCB2, 421, 14, -11.375F, -37.25F, -8.0F, 3, 1, 16, -0.25F, false));
		PCB2.cubeList.add(new ModelBox(PCB2, 421, 14, -11.4375F, -39.6875F, 6.0625F, 3, 3, 2, -0.3125F, false));
		PCB2.cubeList.add(new ModelBox(PCB2, 421, 14, -11.4375F, -39.6875F, -8.0625F, 3, 3, 2, -0.3125F, false));
		PCB2.cubeList.add(new ModelBox(PCB2, 198, 22, -10.8125F, -39.6875F, -7.0F, 1, 3, 14, -0.3125F, false));
		PCB2.cubeList.add(new ModelBox(PCB2, 421, 14, -11.375F, -40.125F, -8.0F, 3, 1, 16, -0.25F, false));

		PCB3 = new RendererModel(this);
		PCB3.setRotationPoint(0.0F, -1.75F, 0.0F);
		Shell.addChild(PCB3);
		PCB3.cubeList.add(new ModelBox(PCB3, 421, 14, -8.0F, -37.25F, 8.375F, 16, 1, 3, -0.25F, false));
		PCB3.cubeList.add(new ModelBox(PCB3, 421, 14, 6.0625F, -39.6875F, 8.4375F, 2, 3, 3, -0.3125F, false));
		PCB3.cubeList.add(new ModelBox(PCB3, 421, 14, -8.0625F, -39.6875F, 8.4375F, 2, 3, 3, -0.3125F, false));
		PCB3.cubeList.add(new ModelBox(PCB3, 186, 18, -7.0F, -39.6875F, 9.8125F, 14, 3, 1, -0.3125F, false));
		PCB3.cubeList.add(new ModelBox(PCB3, 421, 14, -8.0F, -40.125F, 8.375F, 16, 1, 3, -0.25F, false));

		PCB4 = new RendererModel(this);
		PCB4.setRotationPoint(0.0F, -1.75F, 0.0F);
		Shell.addChild(PCB4);
		PCB4.cubeList.add(new ModelBox(PCB4, 421, 14, 8.375F, -37.25F, -8.0F, 3, 1, 16, -0.25F, false));
		PCB4.cubeList.add(new ModelBox(PCB4, 421, 14, 8.4375F, -39.6875F, -8.0625F, 3, 3, 2, -0.3125F, false));
		PCB4.cubeList.add(new ModelBox(PCB4, 421, 14, 8.4375F, -39.6875F, 6.0625F, 3, 3, 2, -0.3125F, false));
		PCB4.cubeList.add(new ModelBox(PCB4, 198, 22, 9.8125F, -39.6875F, -7.0F, 1, 3, 14, -0.3125F, false));
		PCB4.cubeList.add(new ModelBox(PCB4, 421, 14, 8.375F, -40.125F, -8.0F, 3, 1, 16, -0.25F, false));

		Walls1 = new RendererModel(this);
		Walls1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Walls1);
		Walls1.cubeList.add(new ModelBox(Walls1, 331, 6, -8.8125F, -33.5625F, -6.625F, 1, 1, 7, -0.25F, true));
		Walls1.cubeList.add(new ModelBox(Walls1, 331, 6, -8.8125F, -33.5625F, -6.625F, 1, 1, 7, -0.25F, true));
		Walls1.cubeList.add(new ModelBox(Walls1, 331, 6, -8.75F, -37.6875F, -2.875F, 1, 9, 1, -0.25F, true));
		Walls1.cubeList.add(new ModelBox(Walls1, 331, 6, -8.75F, -37.6875F, -2.875F, 1, 9, 1, -0.25F, true));
		Walls1.cubeList.add(new ModelBox(Walls1, 331, 6, -8.75F, -37.6875F, -4.625F, 1, 9, 1, -0.25F, true));
		Walls1.cubeList.add(new ModelBox(Walls1, 331, 6, -8.75F, -37.6875F, -4.625F, 1, 9, 1, -0.25F, true));
		Walls1.cubeList.add(new ModelBox(Walls1, 331, 6, -8.75F, -37.6875F, 1.875F, 1, 9, 1, -0.25F, false));
		Walls1.cubeList.add(new ModelBox(Walls1, 331, 6, -8.75F, -37.6875F, 1.875F, 1, 9, 1, -0.25F, false));
		Walls1.cubeList.add(new ModelBox(Walls1, 331, 6, -8.8125F, -33.5625F, -0.375F, 1, 1, 7, -0.25F, false));
		Walls1.cubeList.add(new ModelBox(Walls1, 331, 6, -8.8125F, -33.5625F, -0.375F, 1, 1, 7, -0.25F, false));
		Walls1.cubeList.add(new ModelBox(Walls1, 331, 6, -8.75F, -37.6875F, 3.625F, 1, 9, 1, -0.25F, false));
		Walls1.cubeList.add(new ModelBox(Walls1, 331, 6, -8.75F, -37.6875F, 3.625F, 1, 9, 1, -0.25F, false));

		Right2 = new RendererModel(this);
		Right2.setRotationPoint(7.2344F, -22.8438F, -8.7396F);
		Walls1.addChild(Right2);
		Right2.cubeList.add(new ModelBox(Right2, 310, 0, -16.2344F, -15.9063F, 1.2396F, 1, 38, 2, -0.25F, false));
		Right2.cubeList.add(new ModelBox(Right2, 331, 6, -16.2344F, 19.1563F, 2.3646F, 1, 3, 6, -0.3125F, false));
		Right2.cubeList.add(new ModelBox(Right2, 331, 6, -16.2344F, 10.6563F, 2.3646F, 1, 2, 6, -0.3125F, false));
		Right2.cubeList.add(new ModelBox(Right2, 331, 6, -16.2344F, 2.1563F, 2.3646F, 1, 2, 6, -0.3125F, false));
		Right2.cubeList.add(new ModelBox(Right2, 331, 6, -16.1719F, -6.7188F, 2.3646F, 1, 2, 6, -0.3125F, false));
		Right2.cubeList.add(new ModelBox(Right2, 331, 6, -16.2344F, -15.7188F, 2.3646F, 1, 2, 6, -0.3125F, false));
		Right2.cubeList.add(new ModelBox(Right2, 196, 40, -16.1094F, -14.5313F, 2.1146F, 1, 9, 7, -0.4375F, false));
		Right2.cubeList.add(new ModelBox(Right2, 497, 7, -16.2344F, -6.0938F, 1.9271F, 1, 26, 7, -0.4375F, false));
		Right2.cubeList.add(new ModelBox(Right2, 288, 0, -16.2344F, -15.9063F, 7.7396F, 1, 38, 1, -0.25F, false));
		Right2.cubeList.add(new ModelBox(Right2, 288, 0, -16.2344F, -15.9063F, 8.2396F, 1, 38, 1, -0.25F, false));

		Left2 = new RendererModel(this);
		Left2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls1.addChild(Left2);
		Left2.cubeList.add(new ModelBox(Left2, 310, 0, -9.0F, -38.75F, 5.5F, 1, 38, 2, -0.25F, false));
		Left2.cubeList.add(new ModelBox(Left2, 288, 0, -9.5F, -38.75F, -0.5F, 1, 38, 1, -0.25F, false));
		Left2.cubeList.add(new ModelBox(Left2, 288, 0, -9.0F, -38.75F, 0.0F, 1, 38, 1, -0.25F, false));
		Left2.cubeList.add(new ModelBox(Left2, 331, 6, -9.0F, -3.6875F, 0.375F, 1, 3, 6, -0.3125F, false));
		Left2.cubeList.add(new ModelBox(Left2, 462, 8, -9.0F, -28.9375F, -0.5625F, 1, 26, 7, -0.4375F, false));
		Left2.cubeList.add(new ModelBox(Left2, 331, 6, -9.0F, -12.1875F, 0.375F, 1, 2, 6, -0.3125F, false));
		Left2.cubeList.add(new ModelBox(Left2, 331, 6, -9.0F, -20.6875F, 0.375F, 1, 2, 6, -0.3125F, false));
		Left2.cubeList.add(new ModelBox(Left2, 196, 40, -8.875F, -37.375F, -0.375F, 1, 9, 7, -0.4375F, false));
		Left2.cubeList.add(new ModelBox(Left2, 331, 6, -8.9375F, -29.5625F, 0.375F, 1, 2, 6, -0.3125F, false));
		Left2.cubeList.add(new ModelBox(Left2, 331, 6, -9.0F, -38.5625F, 0.375F, 1, 2, 6, -0.3125F, false));

		Walls2 = new RendererModel(this);
		Walls2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Walls2);
		Walls2.cubeList.add(new ModelBox(Walls2, 331, 6, -6.625F, -33.5625F, 7.8125F, 7, 1, 1, -0.25F, true));
		Walls2.cubeList.add(new ModelBox(Walls2, 331, 6, -6.625F, -33.5625F, 7.8125F, 7, 1, 1, -0.25F, true));
		Walls2.cubeList.add(new ModelBox(Walls2, 331, 6, -2.875F, -37.6875F, 7.75F, 1, 9, 1, -0.25F, true));
		Walls2.cubeList.add(new ModelBox(Walls2, 331, 6, -2.875F, -37.6875F, 7.75F, 1, 9, 1, -0.25F, true));
		Walls2.cubeList.add(new ModelBox(Walls2, 331, 6, -4.625F, -37.6875F, 7.75F, 1, 9, 1, -0.25F, true));
		Walls2.cubeList.add(new ModelBox(Walls2, 331, 6, -4.625F, -37.6875F, 7.75F, 1, 9, 1, -0.25F, true));
		Walls2.cubeList.add(new ModelBox(Walls2, 331, 6, 1.875F, -37.6875F, 7.75F, 1, 9, 1, -0.25F, false));
		Walls2.cubeList.add(new ModelBox(Walls2, 331, 6, 1.875F, -37.6875F, 7.75F, 1, 9, 1, -0.25F, false));
		Walls2.cubeList.add(new ModelBox(Walls2, 331, 6, -0.375F, -33.5625F, 7.8125F, 7, 1, 1, -0.25F, false));
		Walls2.cubeList.add(new ModelBox(Walls2, 331, 6, -0.375F, -33.5625F, 7.8125F, 7, 1, 1, -0.25F, false));
		Walls2.cubeList.add(new ModelBox(Walls2, 331, 6, 3.625F, -37.6875F, 7.75F, 1, 9, 1, -0.25F, false));
		Walls2.cubeList.add(new ModelBox(Walls2, 331, 6, 3.625F, -37.6875F, 7.75F, 1, 9, 1, -0.25F, false));

		Right3 = new RendererModel(this);
		Right3.setRotationPoint(7.2344F, -22.8438F, -8.7396F);
		Walls2.addChild(Right3);
		Right3.cubeList.add(new ModelBox(Right3, 304, 0, -14.7344F, -15.9063F, 16.7396F, 2, 38, 1, -0.25F, false));
		Right3.cubeList.add(new ModelBox(Right3, 331, 6, -13.6094F, 19.1563F, 16.7396F, 6, 3, 1, -0.3125F, false));
		Right3.cubeList.add(new ModelBox(Right3, 331, 6, -13.6094F, 10.6563F, 16.7396F, 6, 2, 1, -0.3125F, false));
		Right3.cubeList.add(new ModelBox(Right3, 331, 6, -13.6094F, 2.1563F, 16.7396F, 6, 2, 1, -0.3125F, false));
		Right3.cubeList.add(new ModelBox(Right3, 331, 6, -13.6094F, -6.7188F, 16.6771F, 6, 2, 1, -0.3125F, false));
		Right3.cubeList.add(new ModelBox(Right3, 331, 6, -13.6094F, -15.7188F, 16.7396F, 6, 2, 1, -0.3125F, false));
		Right3.cubeList.add(new ModelBox(Right3, 195, 25, -13.8594F, -14.5313F, 16.6146F, 7, 9, 1, -0.4375F, false));
		Right3.cubeList.add(new ModelBox(Right3, 385, 15, -14.0469F, -6.0938F, 16.7396F, 7, 26, 1, -0.4375F, false));
		Right3.cubeList.add(new ModelBox(Right3, 284, 0, -8.2344F, -15.9063F, 16.7396F, 1, 38, 1, -0.25F, false));
		Right3.cubeList.add(new ModelBox(Right3, 284, 0, -7.7344F, -15.9063F, 16.7396F, 1, 38, 1, -0.25F, false));

		Left3 = new RendererModel(this);
		Left3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls2.addChild(Left3);
		Left3.cubeList.add(new ModelBox(Left3, 304, 0, 5.5F, -38.75F, 8.0F, 2, 38, 1, -0.25F, false));
		Left3.cubeList.add(new ModelBox(Left3, 284, 0, -0.5F, -38.75F, 8.5F, 1, 38, 1, -0.25F, false));
		Left3.cubeList.add(new ModelBox(Left3, 284, 0, 0.0F, -38.75F, 8.0F, 1, 38, 1, -0.25F, false));
		Left3.cubeList.add(new ModelBox(Left3, 331, 6, 0.375F, -3.6875F, 8.0F, 6, 3, 1, -0.3125F, false));
		Left3.cubeList.add(new ModelBox(Left3, 385, 15, -0.5625F, -28.9375F, 8.0F, 7, 26, 1, -0.4375F, false));
		Left3.cubeList.add(new ModelBox(Left3, 331, 6, 0.375F, -12.1875F, 8.0F, 6, 2, 1, -0.3125F, false));
		Left3.cubeList.add(new ModelBox(Left3, 331, 6, 0.375F, -20.6875F, 8.0F, 6, 2, 1, -0.3125F, false));
		Left3.cubeList.add(new ModelBox(Left3, 195, 25, -0.375F, -37.375F, 7.875F, 7, 9, 1, -0.4375F, false));
		Left3.cubeList.add(new ModelBox(Left3, 331, 6, 0.375F, -29.5625F, 7.9375F, 6, 2, 1, -0.3125F, false));
		Left3.cubeList.add(new ModelBox(Left3, 331, 6, 0.375F, -38.5625F, 8.0F, 6, 2, 1, -0.3125F, false));

		Walls3 = new RendererModel(this);
		Walls3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Shell.addChild(Walls3);
		Walls3.cubeList.add(new ModelBox(Walls3, 331, 6, 7.8125F, -33.5625F, -0.375F, 1, 1, 7, -0.25F, true));
		Walls3.cubeList.add(new ModelBox(Walls3, 331, 6, 7.8125F, -33.5625F, -0.375F, 1, 1, 7, -0.25F, true));
		Walls3.cubeList.add(new ModelBox(Walls3, 331, 6, 7.75F, -37.6875F, 1.875F, 1, 9, 1, -0.25F, true));
		Walls3.cubeList.add(new ModelBox(Walls3, 331, 6, 7.75F, -37.6875F, 1.875F, 1, 9, 1, -0.25F, true));
		Walls3.cubeList.add(new ModelBox(Walls3, 331, 6, 7.75F, -37.6875F, 3.625F, 1, 9, 1, -0.25F, true));
		Walls3.cubeList.add(new ModelBox(Walls3, 331, 6, 7.75F, -37.6875F, 3.625F, 1, 9, 1, -0.25F, true));
		Walls3.cubeList.add(new ModelBox(Walls3, 331, 6, 7.75F, -37.6875F, -2.875F, 1, 9, 1, -0.25F, false));
		Walls3.cubeList.add(new ModelBox(Walls3, 331, 6, 7.75F, -37.6875F, -2.875F, 1, 9, 1, -0.25F, false));
		Walls3.cubeList.add(new ModelBox(Walls3, 331, 6, 7.8125F, -33.5625F, -6.625F, 1, 1, 7, -0.25F, false));
		Walls3.cubeList.add(new ModelBox(Walls3, 331, 6, 7.8125F, -33.5625F, -6.625F, 1, 1, 7, -0.25F, false));
		Walls3.cubeList.add(new ModelBox(Walls3, 331, 6, 7.75F, -37.6875F, -4.625F, 1, 9, 1, -0.25F, false));
		Walls3.cubeList.add(new ModelBox(Walls3, 331, 6, 7.75F, -37.6875F, -4.625F, 1, 9, 1, -0.25F, false));

		Right4 = new RendererModel(this);
		Right4.setRotationPoint(7.2344F, -22.8438F, -8.7396F);
		Walls3.addChild(Right4);
		Right4.cubeList.add(new ModelBox(Right4, 298, 0, 0.7656F, -15.9063F, 14.2396F, 1, 38, 2, -0.25F, false));
		Right4.cubeList.add(new ModelBox(Right4, 331, 6, 0.7656F, 19.1563F, 9.1146F, 1, 3, 6, -0.3125F, false));
		Right4.cubeList.add(new ModelBox(Right4, 331, 6, 0.7656F, 10.6563F, 9.1146F, 1, 2, 6, -0.3125F, false));
		Right4.cubeList.add(new ModelBox(Right4, 331, 6, 0.7656F, 2.1563F, 9.1146F, 1, 2, 6, -0.3125F, false));
		Right4.cubeList.add(new ModelBox(Right4, 331, 6, 0.7031F, -6.7188F, 9.1146F, 1, 2, 6, -0.3125F, false));
		Right4.cubeList.add(new ModelBox(Right4, 331, 6, 0.7656F, -15.7188F, 9.1146F, 1, 2, 6, -0.3125F, false));
		Right4.cubeList.add(new ModelBox(Right4, 196, 40, 0.6406F, -14.5313F, 8.3646F, 1, 9, 7, -0.4375F, false));
		Right4.cubeList.add(new ModelBox(Right4, 427, 3, 0.7656F, -6.0938F, 8.5521F, 1, 26, 7, -0.4375F, false));
		Right4.cubeList.add(new ModelBox(Right4, 280, 0, 0.7656F, -15.9063F, 8.7396F, 1, 38, 1, -0.25F, false));
		Right4.cubeList.add(new ModelBox(Right4, 280, 0, 0.7656F, -15.9063F, 8.2396F, 1, 38, 1, -0.25F, false));

		Left4 = new RendererModel(this);
		Left4.setRotationPoint(0.0F, 0.0F, 0.0F);
		Walls3.addChild(Left4);
		Left4.cubeList.add(new ModelBox(Left4, 298, 0, 8.0F, -38.75F, -7.5F, 1, 38, 2, -0.25F, false));
		Left4.cubeList.add(new ModelBox(Left4, 280, 0, 8.5F, -38.75F, -0.5F, 1, 38, 1, -0.25F, false));
		Left4.cubeList.add(new ModelBox(Left4, 280, 0, 8.0F, -38.75F, -1.0F, 1, 38, 1, -0.25F, false));
		Left4.cubeList.add(new ModelBox(Left4, 331, 6, 8.0F, -3.6875F, -6.375F, 1, 3, 6, -0.3125F, false));
		Left4.cubeList.add(new ModelBox(Left4, 385, 5, 8.0F, -28.9375F, -6.4375F, 1, 26, 7, -0.4375F, false));
		Left4.cubeList.add(new ModelBox(Left4, 331, 6, 8.0F, -12.1875F, -6.375F, 1, 2, 6, -0.3125F, false));
		Left4.cubeList.add(new ModelBox(Left4, 331, 6, 8.0F, -20.6875F, -6.375F, 1, 2, 6, -0.3125F, false));
		Left4.cubeList.add(new ModelBox(Left4, 196, 40, 7.875F, -37.375F, -6.625F, 1, 9, 7, -0.4375F, false));
		Left4.cubeList.add(new ModelBox(Left4, 331, 6, 7.9375F, -29.5625F, -6.375F, 1, 2, 6, -0.3125F, false));
		Left4.cubeList.add(new ModelBox(Left4, 331, 6, 8.0F, -38.5625F, -6.375F, 1, 2, 6, -0.3125F, false));

		LeftDoor = new RendererModel(this);
		LeftDoor.setRotationPoint(-7.2118F, 0.5729F, -8.7951F);
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 292, 0, -0.2882F, -15.3229F, -0.2049F, 2, 38, 1, -0.25F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 276, 0, 6.7118F, -15.3229F, -0.7049F, 1, 38, 1, -0.25F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 276, 0, 6.2118F, -15.3229F, -0.2049F, 1, 38, 1, -0.25F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 331, 6, 0.8368F, 19.7396F, -0.2049F, 6, 3, 1, -0.3125F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 385, 15, 0.7743F, 3.4896F, -0.2049F, 7, 17, 1, -0.4375F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 331, 6, 0.8368F, 11.2396F, -0.2049F, 6, 2, 1, -0.3125F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 331, 6, 0.8368F, 2.7396F, -0.2049F, 6, 2, 1, -0.3125F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 414, 24, 0.4618F, -4.0729F, -0.2049F, 2, 7, 1, -0.4375F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 216, 18, 1.4618F, -4.0729F, -0.0799F, 5, 7, 1, -0.4375F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 414, 24, 5.4618F, -4.0729F, -0.2049F, 2, 7, 1, -0.4375F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 414, 24, 0.5868F, 2.0521F, -0.2049F, 7, 2, 1, -0.4375F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 195, 25, 0.5868F, -13.9479F, -0.0799F, 7, 9, 1, -0.4375F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 414, 24, 0.5868F, -5.1979F, -0.2049F, 7, 2, 1, -0.4375F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 331, 6, 0.8368F, -6.1354F, -0.1424F, 6, 2, 1, -0.3125F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 331, 6, 0.8368F, -15.1354F, -0.2049F, 6, 2, 1, -0.3125F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 331, 6, 2.5868F, -14.2604F, 0.0451F, 1, 9, 1, -0.25F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 331, 6, 4.3368F, -14.2604F, 0.0451F, 1, 9, 1, -0.25F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 331, 6, 0.5868F, -10.1354F, -0.0174F, 7, 1, 1, -0.25F, false));

		RightDoor = new RendererModel(this);
		RightDoor.setRotationPoint(7.2344F, 1.1563F, -8.7396F);
		RightDoor.cubeList.add(new ModelBox(RightDoor, 292, 0, -1.7344F, -15.9063F, -0.2604F, 2, 38, 1, -0.25F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 331, 6, -6.8594F, 19.1563F, -0.2604F, 6, 3, 1, -0.3125F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 331, 6, -6.8594F, 10.6563F, -0.2604F, 6, 2, 1, -0.3125F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 331, 6, -6.8594F, 2.1563F, -0.2604F, 6, 2, 1, -0.3125F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 331, 6, -6.8594F, -6.7188F, -0.1979F, 6, 2, 1, -0.3125F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 331, 6, -6.8594F, -15.7188F, -0.2604F, 6, 2, 1, -0.3125F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 331, 6, -5.3594F, -14.8438F, -0.0104F, 1, 9, 1, -0.25F, true));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 331, 6, -3.6094F, -14.8438F, -0.0104F, 1, 9, 1, -0.25F, true));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 331, 6, -7.6094F, -10.7188F, -0.0729F, 7, 1, 1, -0.25F, true));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 195, 25, -7.6094F, -14.5313F, -0.1354F, 7, 9, 1, -0.4375F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 385, 15, -7.4219F, -6.0938F, -0.2604F, 7, 26, 1, -0.4375F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 276, 0, -7.2344F, -15.9063F, -0.2604F, 1, 38, 1, -0.25F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 276, 0, -7.7344F, -15.9063F, -0.2604F, 1, 38, 1, -0.25F, false));
	}

public void render(ExteriorTile tile) {
		EnumDoorState state = tile.getOpen();
        switch(state) {
        case ONE:
            this.RightDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.ONE));
            this.LeftDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.CLOSED));
            break;
        case BOTH:
            this.RightDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.ONE));
            this.LeftDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.BOTH));
            break;
        case CLOSED:
            this.RightDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.CLOSED));
            this.LeftDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.SHALKA.getRotationForState(EnumDoorState.CLOSED));
        }
		this.Shell.render(0.0625F);
        this.RightDoor.render(0.0625F);
        this.LeftDoor.render(0.0625F);
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}