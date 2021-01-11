package com.thevale.moretimecapsulesmod.client.renders.exteriors;

import com.mojang.blaze3d.platform.GlStateManager;
import com.thevale.moretimecapsulesmod.client.models.exteriors.Fenix_Exterior;
import com.thevale.moretimecapsulesmod.client.models.exteriors.Killer_tardis;
import com.thevale.moretimecapsulesmod.tileentities.FenixTile;
import com.thevale.moretimecapsulesmod.tileentities.KomixTile;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.client.renderers.exteriors.ExteriorRenderer;
import net.tardis.mod.misc.WorldText;


public class KomixRender extends ExteriorRenderer<KomixTile> {
public static final ResourceLocation TEXTURE = new ResourceLocation("moretimecapsulesmod","textures/exteriors/killerkomix_box.png");
public static Killer_tardis MODEL = new Killer_tardis();
public static WorldText TEXT = new WorldText(0.87F, 0.125F, 0.015F, 0x000000);


    public void renderExterior(KomixTile tile) {
        GlStateManager.pushMatrix();
        GlStateManager.translated(0, -1, 0);
        Minecraft.getInstance().getTextureManager().bindTexture(TEXTURE);
        MODEL.render(tile);

        GlStateManager.popMatrix();
    }

    public void renderExterior(KomixRender KomixRender) {

    }
}
