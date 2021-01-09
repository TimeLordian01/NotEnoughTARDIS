package com.thevale.moretimecapsulesmod.client.models.interiordoors;// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.platform.GlStateManager;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.models.interiordoors.IInteriorDoorRenderer;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;

public class Classic_Interiordoor extends Model implements IInteriorDoorRenderer {
	public static final ResourceLocation TEXTURE = new ResourceLocation("moretimecapsulesmod", "textures/interiordoor/hartnelldoor_stayledmk2.png");
	private final RendererModel door_suround;
	private final RendererModel boti;
	private final RendererModel door_r;
	private final RendererModel door_l;

	public Classic_Interiordoor() {
		textureWidth = 128;
		textureHeight = 128;

		door_suround = new RendererModel(this);
		door_suround.setRotationPoint(1.0F, 24.0F, 0.0F);
		door_suround.cubeList.add(new ModelBox(door_suround, 0, 49, 12.0F, -48.0F, -8.0F, 3, 48, 16, 0.0F, false));
		door_suround.cubeList.add(new ModelBox(door_suround, 38, 49, -17.0F, -48.0F, -8.0F, 3, 48, 16, 0.0F, false));

		boti = new RendererModel(this);
		boti.setRotationPoint(0.0F, 24.0F, 0.0F);
		boti.cubeList.add(new ModelBox(boti, 0, 0, -16.0F, -48.0F, -7.0F, 32, 48, 1, 0.0F, false));

		door_r = new RendererModel(this);
		door_r.setRotationPoint(16.0F, 0.0F, -7.5F);
		door_r.cubeList.add(new ModelBox(door_r, 66, 0, -16.0F, -24.0F, -0.5F, 16, 48, 1, 0.0F, false));

		door_l = new RendererModel(this);
		door_l.setRotationPoint(-16.0F, 0.0F, -7.5F);
		door_l.cubeList.add(new ModelBox(door_l, 76, 76, 0.0F, -24.0F, -0.5F, 16, 48, 1, 0.0F, false));
	}

	@Override
		 public void render(DoorEntity door) {
        EnumDoorState state = door.getOpenState();
		GlStateManager.pushMatrix();
        GlStateManager.enableRescaleNormal();
        GlStateManager.rotated(180.0D, 0.0D, 1.0D, 0.0D);
        GlStateManager.scalef(1.0F, 1.0F, 1.0F);
        switch(state) {
        case ONE:
            this.door_r.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.CLASSICINTERIORDOOR.getRotationForState(EnumDoorState.ONE));
            this.door_l.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.CLASSICINTERIORDOOR.getRotationForState(EnumDoorState.CLOSED));
            break;
        case BOTH:
            this.door_r.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.CLASSICINTERIORDOOR.getRotationForState(EnumDoorState.ONE));
            this.door_l.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.CLASSICINTERIORDOOR.getRotationForState(EnumDoorState.BOTH));
            break;
        case CLOSED:
            this.door_r.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.CLASSICINTERIORDOOR.getRotationForState(EnumDoorState.CLOSED));
            this.door_l.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.CLASSICINTERIORDOOR.getRotationForState(EnumDoorState.CLOSED));
        }

        this.door_r.render(0.0625F);
        this.door_l.render(0.0625F);
        this.door_suround.render(0.0625F);
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
    }

	public ResourceLocation getTexture() {
        return TEXTURE;
    }
}
