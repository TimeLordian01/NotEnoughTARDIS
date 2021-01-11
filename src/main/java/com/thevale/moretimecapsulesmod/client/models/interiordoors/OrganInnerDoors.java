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

public class OrganInnerDoors extends Model implements IInteriorDoorRenderer {
	public static final ResourceLocation TEXTURE = new ResourceLocation("moretimecapsulesmod", "textures/interiordoor/organdoor.png");
	private final RendererModel bb_main;
	private final RendererModel Door;

	public OrganInnerDoors() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new RendererModel(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 99, 1, 6.0F, -31.0F, -7.3125F, 2, 29, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 99, 1, -8.0F, -31.0F, -7.3125F, 2, 29, 2, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 92, 23, -8.0F, -32.0F, -7.3125F, 16, 1, 2, 0.0F, true));
		bb_main.cubeList.add(new ModelBox(bb_main, 92, 23, -8.0F, -2.0F, -7.3125F, 16, 2, 2, 0.0F, true));

		Door = new RendererModel(this);
		Door.setRotationPoint(7.0F, 7.75F, -6.5625F);
		Door.cubeList.add(new ModelBox(Door, 0, 0, -13.0F, -14.75F, -0.75F, 13, 29, 1, 0.0F, false));
		Door.cubeList.add(new ModelBox(Door, 0, 40, -12.0F, -0.75F, -0.25F, 1, 2, 1, 0.0F, false));
	}

		@Override
		 public void render(DoorEntity door) {
        EnumDoorState state = door.getOpenState();
		GlStateManager.pushMatrix();
        GlStateManager.enableRescaleNormal();
        GlStateManager.rotated(0.0D, 0.0D, 180.0D, 0.0D);
        GlStateManager.scalef(1.0F, 1.0F, 1.0F);
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

        this.Door.render(0.0625F);
        this.bb_main.render(0.0625F);
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
    }

	public ResourceLocation getTexture() {
        return TEXTURE;
    }
}
