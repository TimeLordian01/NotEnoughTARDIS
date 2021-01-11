package com.thevale.moretimecapsulesmod.client.renders.exteriors;

import com.mojang.blaze3d.platform.GlStateManager;
import com.thevale.moretimecapsulesmod.client.models.exteriors.Elevator_TwoExterior;
import com.thevale.moretimecapsulesmod.client.models.exteriors.Fenix_Exterior;
import com.thevale.moretimecapsulesmod.tileentities.ElevatorTile;
import com.thevale.moretimecapsulesmod.tileentities.FenixTile;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.misc.WorldText;


public class ElevatorRender extends ExteriorRenderer<ElevatorTile> {
    public static final ResourceLocation TEXTURE = new ResourceLocation("moretimecapsulesmod", "textures/exteriors/lift_texture.png");
    public static Elevator_TwoExterior MODEL = new Elevator_TwoExterior();
    public static WorldText TEXT = new WorldText(0.87F, 0.125F, 0.015F, 0x000000);


    public void renderExterior(ElevatorTile tile) {
        GlStateManager.pushMatrix();
        GlStateManager.translated(0, -1, 0);
        Minecraft.getInstance().getTextureManager().bindTexture(TEXTURE);
        MODEL.render(tile);

        GlStateManager.popMatrix();
    }
}