package com.thevale.moretimecapsulesmod.client.models.interiordoors;// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.models.interiordoors.IInteriorDoorRenderer;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;

public class Elevator_Two_InteriorDoors extends Model implements IInteriorDoorRenderer {
   public static final ResourceLocation TEXTURE = new ResourceLocation("moretimecapsulesmod", "textures/interiordoor/lift_door_texture.png");

	private final RendererModel front;
	private final RendererModel backing;
	private final RendererModel bone;
	private final RendererModel bone2;
	private final RendererModel front_panels;
	private final RendererModel keyhole;
	private final RendererModel doors;
	private final RendererModel thin;
	private final RendererModel thick;

	public Elevator_Two_InteriorDoors() {
		textureWidth = 512;
		textureHeight = 512;

		front = new RendererModel(this);
		front.setRotationPoint(1.0F, 24.0F, -12.0F);
		

		backing = new RendererModel(this);
		backing.setRotationPoint(0.0F, 0.0F, 0.0F);
		front.addChild(backing);
		backing.cubeList.add(new ModelBox(backing, 0, 0, -71.0F, -161.0F, 54.0F, 34, 161, 12, 0.0F, false));
		backing.cubeList.add(new ModelBox(backing, 92, 92, 35.0F, -160.0F, 54.0F, 34, 160, 12, 0.0F, false));
		backing.cubeList.add(new ModelBox(backing, 92, 13, -49.0F, -184.0F, 54.0F, 101, 2, 12, 0.0F, false));
		backing.cubeList.add(new ModelBox(backing, 92, 0, -37.0F, -161.0F, 54.0F, 106, 1, 12, 0.0F, false));
		backing.cubeList.add(new ModelBox(backing, 268, 189, -49.0F, -182.0F, 64.0F, 101, 21, 2, 0.0F, false));
		backing.cubeList.add(new ModelBox(backing, 184, 100, 52.0F, -184.0F, 54.0F, 17, 23, 12, 0.0F, false));
		backing.cubeList.add(new ModelBox(backing, 172, 65, -71.0F, -184.0F, 54.0F, 22, 23, 12, 0.0F, false));
		backing.cubeList.add(new ModelBox(backing, 92, 79, -39.0F, -173.0F, 60.0F, 3, 3, 4, 0.0F, false));
		backing.cubeList.add(new ModelBox(backing, 268, 212, -36.0F, -179.0F, 62.0F, 88, 1, 1, 0.0F, false));
		backing.cubeList.add(new ModelBox(backing, 92, 59, -33.0F, -168.0F, 62.0F, 85, 1, 1, 0.0F, false));
		backing.cubeList.add(new ModelBox(backing, 92, 63, -23.0F, -167.0F, 59.0F, 75, 1, 1, 0.0F, false));
		backing.cubeList.add(new ModelBox(backing, 92, 61, -23.0F, -164.0F, 59.0F, 75, 1, 1, 0.0F, false));
		backing.cubeList.add(new ModelBox(backing, 92, 65, -19.0F, -171.0F, 57.0F, 19, 10, 4, 0.0F, false));
		backing.cubeList.add(new ModelBox(backing, 80, 0, -22.0F, -169.0F, 58.0F, 8, 8, 2, 0.0F, false));
		backing.cubeList.add(new ModelBox(backing, 0, 0, -28.0F, -168.0F, 59.0F, 5, 5, 1, 0.0F, false));
		backing.cubeList.add(new ModelBox(backing, 0, 6, -26.0F, -166.0F, 58.0F, 1, 1, 3, 0.0F, false));
		backing.cubeList.add(new ModelBox(backing, 92, 92, -26.0F, -166.0F, 57.0F, 1, 5, 1, 0.0F, false));
		backing.cubeList.add(new ModelBox(backing, 8, 6, -26.0F, -166.0F, 61.0F, 1, 5, 1, 0.0F, false));

		bone = new RendererModel(this);
		bone.setRotationPoint(-37.5F, -171.5F, 62.0F);
		backing.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, 0.4363F);
		bone.cubeList.add(new ModelBox(bone, 138, 65, -7.5F, -7.5F, -1.0F, 15, 15, 2, 0.0F, false));

		bone2 = new RendererModel(this);
		bone2.setRotationPoint(40.5F, -171.5F, 62.0F);
		backing.addChild(bone2);
		

		front_panels = new RendererModel(this);
		front_panels.setRotationPoint(0.0F, 0.0F, 3.0F);
		front.addChild(front_panels);
		front_panels.cubeList.add(new ModelBox(front_panels, 132, 264, -57.0F, -188.0F, 62.0F, 20, 188, 4, 0.0F, false));
		front_panels.cubeList.add(new ModelBox(front_panels, 84, 264, 35.0F, -188.0F, 62.0F, 20, 188, 4, 0.0F, false));
		front_panels.cubeList.add(new ModelBox(front_panels, 92, 27, -37.0F, -188.0F, 62.0F, 72, 28, 4, 0.0F, false));

		keyhole = new RendererModel(this);
		keyhole.setRotationPoint(0.0F, 0.0F, -0.5F);
		front_panels.addChild(keyhole);
		

		doors = new RendererModel(this);
		doors.setRotationPoint(1.0F, 24.0F, -9.0F);
		

		thin = new RendererModel(this);
		thin.setRotationPoint(0.0F, 0.0F, 0.0F);
		doors.addChild(thin);
		thin.cubeList.add(new ModelBox(thin, 184, 184, -37.0F, -160.0F, 58.0F, 40, 160, 2, 0.0F, false));
		thin.cubeList.add(new ModelBox(thin, 0, 173, -37.0F, -160.0F, 54.0F, 40, 160, 2, 0.0F, false));

		thick = new RendererModel(this);
		thick.setRotationPoint(0.0F, 0.0F, 0.0F);
		doors.addChild(thick);
		thick.cubeList.add(new ModelBox(thick, 0, 335, -1.0F, -160.0F, 60.0F, 36, 160, 2, 0.0F, false));
		thick.cubeList.add(new ModelBox(thick, 268, 268, -1.0F, -160.0F, 52.0F, 36, 160, 2, 0.0F, false));
		thick.cubeList.add(new ModelBox(thick, 268, 27, -1.0F, -160.0F, 56.0F, 36, 160, 2, 0.0F, false));
	}

public void render(DoorEntity door) {
		 EnumDoorState state = door.getOpenState();
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
		this.front.render(0.0625F);
		this.doors.render(0.0625F);
		GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
	}

	public void setRotationAngle(RendererModel modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	@Override
	public ResourceLocation getTexture() {
		return TEXTURE;
	}
}