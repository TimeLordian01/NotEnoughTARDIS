package com.thevale.moretimecapsulesmod.client.renders.exteriors;

import com.mojang.blaze3d.platform.GlStateManager;
import com.thevale.moretimecapsulesmod.client.models.exteriors.OrganExterior;
import com.thevale.moretimecapsulesmod.client.models.exteriors.PTORed;
import com.thevale.moretimecapsulesmod.tileentities.OrganTile;
import com.thevale.moretimecapsulesmod.tileentities.PtoredTile;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.misc.WorldText;


public class OrganRender extends ExteriorRenderer<OrganTile> {
public static final ResourceLocation TEXTURE = new ResourceLocation("moretimecapsulesmod","textures/exteriors/organexterior.png");
public static OrganExterior MODEL = new OrganExterior();
public static WorldText TEXT = new WorldText(0.87F, 0.125F, 0.015F, 0x000000);


    public void renderExterior(OrganTile tile) {
        GlStateManager.pushMatrix();
        GlStateManager.translated(0, -1, 0);
        Minecraft.getInstance().getTextureManager().bindTexture(TEXTURE);
        MODEL.render(tile);

        GlStateManager.popMatrix();
    }
}
