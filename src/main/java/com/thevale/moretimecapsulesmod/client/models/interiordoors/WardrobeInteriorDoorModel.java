package com.thevale.moretimecapsulesmod.client.models.interiordoors;// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.platform.GlStateManager;
import com.thevale.moretimecapsulesmod.client.models.exteriors.WardrobeExterior;
import com.thevale.moretimecapsulesmod.client.renders.exteriors.WardrobeRender;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.models.interiordoors.IInteriorDoorRenderer;
import net.tardis.mod.entity.DoorEntity;
import net.tardis.mod.enums.EnumDoorState;
import net.tardis.mod.helper.TardisHelper;
import net.tardis.mod.tileentities.ConsoleTile;

public class WardrobeInteriorDoorModel extends Model implements IInteriorDoorRenderer {
	private final RendererModel LeftDoor;
	private final RendererModel Walls;
	private final RendererModel RightDoor;

	public WardrobeInteriorDoorModel() {
		textureWidth = 128;
		textureHeight = 128;

		LeftDoor = new RendererModel(this);
		LeftDoor.setRotationPoint(-6.2734F, 10.3125F, -7.8516F);
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 101, 126, 0.2734F, 12.0625F, 0.0391F, 6, 1, 1, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 8, 105, 5.2734F, -9.3125F, -0.0234F, 1, 22, 1, 0.001F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 101, 126, 0.2734F, 4.8125F, 0.0391F, 6, 1, 1, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 101, 126, 0.2734F, -2.8125F, 0.0391F, 6, 1, 1, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 101, 126, 0.2734F, -9.8125F, -0.0234F, 6, 1, 1, 0.0F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 8, 105, -0.3516F, -9.3125F, -0.0234F, 1, 22, 1, 0.001F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 61, 109, 5.0234F, -0.8125F, -0.5234F, 1, 2, 2, -0.375F, false));
		LeftDoor.cubeList.add(new ModelBox(LeftDoor, 30, 105, 0.4609F, -9.8125F, -0.0234F, 6, 22, 1, -0.125F, false));

		Walls = new RendererModel(this);
		Walls.setRotationPoint(7.5F, 1.0F, 2.0F);
		Walls.cubeList.add(new ModelBox(Walls, 0, 102, -1.25F, -2.0F, -10.0F, 1, 25, 1, 0.0F, false));
		Walls.cubeList.add(new ModelBox(Walls, 48, 117, -1.625F, -1.0F, -9.9375F, 1, 1, 1, 0.01F, false));
		Walls.cubeList.add(new ModelBox(Walls, 48, 117, -1.625F, 22.0F, -9.9375F, 1, 1, 1, 0.01F, false));
		Walls.cubeList.add(new ModelBox(Walls, 48, 117, -14.375F, -1.0F, -9.9375F, 1, 1, 1, 0.01F, false));
		Walls.cubeList.add(new ModelBox(Walls, 48, 117, -14.375F, 22.0F, -9.9375F, 1, 1, 1, 0.01F, false));
		Walls.cubeList.add(new ModelBox(Walls, 0, 102, -14.75F, -2.0F, -10.0F, 1, 25, 1, 0.0F, false));
		Walls.cubeList.add(new ModelBox(Walls, 57, 120, -14.5F, -2.25F, -9.875F, 14, 2, 1, -0.1875F, false));
		Walls.cubeList.add(new ModelBox(Walls, 0, 0, -14.5F, -1.75F, -10.625F, 14, 25, 1, -0.1875F, false));
		Walls.cubeList.add(new ModelBox(Walls, 57, 120, -14.5F, 22.25F, -9.875F, 14, 2, 1, -0.1875F, false));

		RightDoor = new RendererModel(this);
		RightDoor.setRotationPoint(6.2734F, 11.1875F, -7.8516F);
		RightDoor.cubeList.add(new ModelBox(RightDoor, 101, 126, -6.2734F, 11.1875F, 0.0391F, 6, 1, 1, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 8, 105, -6.2734F, -10.1875F, -0.0234F, 1, 22, 1, 0.001F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 101, 126, -6.2734F, 3.9375F, 0.0391F, 6, 1, 1, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 101, 126, -6.2734F, -3.6875F, 0.0391F, 6, 1, 1, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 101, 126, -6.2734F, -10.6875F, -0.0234F, 6, 1, 1, 0.0F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 8, 105, -0.6484F, -10.1875F, -0.0234F, 1, 22, 1, 0.001F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 66, 119, -6.0234F, -1.6875F, -0.5234F, 1, 2, 2, -0.375F, false));
		RightDoor.cubeList.add(new ModelBox(RightDoor, 30, 105, -6.4609F, -10.6875F, -0.0234F, 6, 22, 1, -0.125F, false));
	}

		@Override
		 public void render(DoorEntity door) {
        EnumDoorState state = door.getOpenState();
		GlStateManager.pushMatrix();
        GlStateManager.enableRescaleNormal();
        GlStateManager.translated(0.0D, -0.75D, 0.3D);
        GlStateManager.scalef(1.5F, 1.5F, 1.5F);
        switch(state) {
        case ONE:
            this.RightDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.ONE));
            this.LeftDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.CLOSED));
            break;
        case BOTH:
            this.RightDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.ONE));
            this.LeftDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.BOTH));
            break;
        case CLOSED:
            this.RightDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.CLOSED));
            this.LeftDoor.rotateAngleY = (float)Math.toRadians(EnumDoorTypes.WARDROBE.getRotationForState(EnumDoorState.CLOSED));
        }

        this.LeftDoor.render(0.0625F);
        this.RightDoor.render(0.0625F);
        this.Walls.render(0.0625F);
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
    }

	@Override
    public ResourceLocation getTexture() {
        ConsoleTile tile = TardisHelper.getConsoleInWorld(Minecraft.getInstance().world).orElse(null);
        if(tile != null) {
            int index = tile.getExteriorManager().getExteriorVariant();
            if(tile.getExterior().getVariants() != null && index < tile.getExterior().getVariants().length)
                return tile.getExterior().getVariants()[index].getTexture();
        }
        return WardrobeRender.TEXTURE;
    }
}