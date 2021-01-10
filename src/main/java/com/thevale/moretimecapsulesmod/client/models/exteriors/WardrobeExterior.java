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

public class WardrobeExterior extends EntityModel {
	private final RendererModel LeftDoor;
	private final RendererModel Walls;
	private final RendererModel RightDoor;

	public WardrobeExterior() {
		textureWidth = 128;
		textureHeight = 128;

		LeftDoor = new RendererModel(this);
		LeftDoor.setRotationPoint(-6.2734F, 10.3125F, -3.6016F);
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 101, 126, 0.2734F, 10.6875F, 0.0391F, 6, 1, 1, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 8, 105, 5.2734F, -10.6875F, -0.0234F, 1, 22, 1, 0.001F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 101, 126, 0.2734F, 3.4375F, 0.0391F, 6, 1, 1, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 101, 126, 0.2734F, -4.1875F, 0.0391F, 6, 1, 1, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 101, 126, 0.2734F, -11.1875F, -0.0234F, 6, 1, 1, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 8, 105, -0.3516F, -10.6875F, -0.0234F, 1, 22, 1, 0.001F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 48, 111, 5.0234F, -2.1875F, -0.5234F, 1, 2, 1, -0.375F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 30, 105, 0.4609F, -11.1875F, -0.0234F, 6, 22, 1, -0.125F, false));

		Walls = new RendererModel(this);
		Walls.setRotationPoint(7.5F, 1.0F, 2.0F);
		Walls.cubeList.add(new ModelBox(Walls, 46, 120, -15.5F, 21.5F, -6.5F, 2, 2, 2, -0.5F, false));
		Walls.cubeList.add(new ModelBox(Walls, 46, 120, -15.5F, 21.5F, 0.5F, 2, 2, 2, -0.5F, false));
		Walls.cubeList.add(new ModelBox(Walls, 46, 120, -1.5F, 21.5F, -6.5F, 2, 2, 2, -0.5F, false));
		Walls.cubeList.add(new ModelBox(Walls, 46, 120, -1.5F, 21.5F, 0.5F, 2, 2, 2, -0.5F, false));
		Walls.cubeList.add(new ModelBox(Walls, 46, 116, -16.0F, 20.625F, -7.0F, 17, 2, 10, -0.5F, false));
		Walls.cubeList.add(new ModelBox(Walls, 46, 105, -16.0F, -4.0F, -7.0F, 17, 2, 10, -0.5F, false));
		Walls.cubeList.add(new ModelBox(Walls, 48, 86, -13.5F, -3.875F, -6.0F, 12, 1, 8, 0.0F, false));
		Walls.cubeList.add(new ModelBox(Walls, 47, 95, -15.5F, 20.4375F, -6.5F, 16, 2, 9, -0.5F, false));
		Walls.cubeList.add(new ModelBox(Walls, 48, 106, -15.5F, -3.375F, -6.5F, 16, 2, 9, -0.5F, false));
		Walls.cubeList.add(new ModelBox(Walls, 0, 102, -1.25F, -3.375F, -5.75F, 1, 25, 1, 0.0F, false));
		Walls.cubeList.add(new ModelBox(Walls, 48, 117, -1.625F, -2.375F, -5.6875F, 1, 1, 1, 0.01F, false));
		Walls.cubeList.add(new ModelBox(Walls, 48, 117, -1.625F, 20.625F, -5.6875F, 1, 1, 1, 0.01F, false));
		Walls.cubeList.add(new ModelBox(Walls, 48, 117, -14.375F, -2.375F, -5.6875F, 1, 1, 1, 0.01F, false));
		Walls.cubeList.add(new ModelBox(Walls, 48, 117, -14.375F, 20.625F, -5.6875F, 1, 1, 1, 0.01F, false));
		Walls.cubeList.add(new ModelBox(Walls, 0, 102, -14.75F, -3.375F, -5.75F, 1, 25, 1, 0.0F, false));
		Walls.cubeList.add(new ModelBox(Walls, 0, 102, -1.25F, -3.375F, 0.75F, 1, 25, 1, 0.0F, false));
		Walls.cubeList.add(new ModelBox(Walls, 0, 102, -14.75F, -3.375F, 0.75F, 1, 25, 1, 0.0F, false));
		Walls.cubeList.add(new ModelBox(Walls, 14, 98, -14.375F, -2.375F, -5.0F, 1, 24, 6, 0.0F, false));
		Walls.cubeList.add(new ModelBox(Walls, 14, 98, -1.625F, -2.375F, -5.0F, 1, 24, 6, 0.0F, false));
		Walls.cubeList.add(new ModelBox(Walls, 0, 73, -14.0F, -2.375F, 0.5F, 13, 23, 1, 0.0F, false));
		Walls.cubeList.add(new ModelBox(Walls, 4, 103, -1.875F, -2.375F, 0.625F, 1, 24, 1, 0.0F, false));
		Walls.cubeList.add(new ModelBox(Walls, 4, 103, -14.125F, -2.375F, 0.625F, 1, 24, 1, 0.0F, false));
		Walls.cubeList.add(new ModelBox(Walls, 4, 103, -8.0F, -2.375F, 0.625F, 1, 24, 1, 0.0F, false));
		Walls.cubeList.add(new ModelBox(Walls, 101, 124, -13.5F, 20.0F, 0.5625F, 12, 1, 1, 0.0F, false));
		Walls.cubeList.add(new ModelBox(Walls, 101, 124, -13.5F, -1.875F, 0.5625F, 12, 1, 1, 0.0F, false));
		Walls.cubeList.add(new ModelBox(Walls, 101, 124, -13.5F, 5.125F, 0.5625F, 12, 1, 1, 0.0F, false));
		Walls.cubeList.add(new ModelBox(Walls, 101, 124, -13.5F, 12.75F, 0.5625F, 12, 1, 1, 0.0F, false));
		Walls.cubeList.add(new ModelBox(Walls, 101, 117, -14.5F, 12.75F, -5.0F, 1, 1, 6, 0.01F, false));
		Walls.cubeList.add(new ModelBox(Walls, 101, 117, -1.5F, 12.75F, -5.0F, 1, 1, 6, 0.01F, false));
		Walls.cubeList.add(new ModelBox(Walls, 101, 117, -14.5F, 5.125F, -5.0F, 1, 1, 6, 0.01F, false));
		Walls.cubeList.add(new ModelBox(Walls, 101, 117, -1.5F, 5.125F, -5.0F, 1, 1, 6, 0.01F, false));
		Walls.cubeList.add(new ModelBox(Walls, 101, 117, -14.5F, -1.875F, -5.0F, 1, 1, 6, 0.01F, false));
		Walls.cubeList.add(new ModelBox(Walls, 101, 117, -1.5F, -1.875F, -5.0F, 1, 1, 6, 0.01F, false));

		RightDoor = new RendererModel(this);
		RightDoor.setRotationPoint(6.2734F, 11.1875F, -3.6016F);
		RightDoor.cubeList.add(new ModelBox(RightDoor, 101, 126, -6.2734F, 9.8125F, 0.0391F, 6, 1, 1, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 8, 105, -6.2734F, -11.5625F, -0.0234F, 1, 22, 1, 0.001F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 101, 126, -6.2734F, 2.5625F, 0.0391F, 6, 1, 1, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 101, 126, -6.2734F, -5.0625F, 0.0391F, 6, 1, 1, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 101, 126, -6.2734F, -12.0625F, -0.0234F, 6, 1, 1, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 8, 105, -0.6484F, -11.5625F, -0.0234F, 1, 22, 1, 0.001F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 48, 111, -6.0234F, -3.0625F, -0.5234F, 1, 2, 1, -0.375F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 30, 105, -6.4609F, -12.0625F, -0.0234F, 6, 22, 1, -0.125F, false));
	}

	public void render(ExteriorTile tile) {
		EnumDoorState state = tile.getOpen();
		GlStateManager.pushMatrix();
		GlStateManager.enableRescaleNormal();
		GlStateManager.translated(0.0D, -0.75D, 0.0D);
		GlStateManager.scalef(1.5F, 1.5F, 1.5F);
		switch (state) {
			case ONE:
				this.RightDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.ONE));
				this.LeftDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.CLOSED));
				break;
			case BOTH:
				this.RightDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.ONE));
				this.LeftDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.BOTH));
				break;
			case CLOSED:
				this.RightDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.CLOSED));
				this.LeftDoor.rotateAngleY = (float) Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.CLOSED));
		}
		this.Walls.render(0.0625F);
		this.RightDoor.render(0.0625F);
		this.LeftDoor.render(0.0625F);
		GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}