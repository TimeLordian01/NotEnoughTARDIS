package com.thevale.moretimecapsulesmod.client;

import com.thevale.moretimecapsulesmod.client.models.interiordoors.Classic_Interiordoor;
import com.thevale.moretimecapsulesmod.client.models.interiordoors.Ptoredinteriordoor;
import com.thevale.moretimecapsulesmod.client.models.interiordoors.ShalkaInteriorDoor;
import com.thevale.moretimecapsulesmod.client.models.interiordoors.WardrobeInteriorDoorModel;
import com.thevale.moretimecapsulesmod.client.renders.exteriors.FenixRender;
import com.thevale.moretimecapsulesmod.client.renders.exteriors.PtoredRender;
import com.thevale.moretimecapsulesmod.client.renders.exteriors.ShalkaRender;
import com.thevale.moretimecapsulesmod.client.renders.exteriors.WardrobeRender;
import com.thevale.moretimecapsulesmod.tileentities.FenixTile;
import com.thevale.moretimecapsulesmod.tileentities.PtoredTile;
import com.thevale.moretimecapsulesmod.tileentities.ShalkaTile;
import com.thevale.moretimecapsulesmod.tileentities.WardrobeTile;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.tardis.mod.client.models.interiordoors.TTCapsuleInteriorModel;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = "moretimecapsulesmod", bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModelRegistry {
    @SubscribeEvent
    public static void Register(FMLClientSetupEvent event) {
        ClientRegistry.bindTileEntitySpecialRenderer(ShalkaTile.class , new ShalkaRender());
        EnumDoorTypes.SHALKA.setInteriorDoorModel(new ShalkaInteriorDoor());
        ClientRegistry.bindTileEntitySpecialRenderer(PtoredTile.class , new PtoredRender());
        EnumDoorTypes.PTORED.setInteriorDoorModel(new Ptoredinteriordoor());
        ClientRegistry.bindTileEntitySpecialRenderer(FenixTile.class , new FenixRender());
        EnumDoorTypes.FENIX.setInteriorDoorModel(new Classic_Interiordoor());
        ClientRegistry.bindTileEntitySpecialRenderer(WardrobeTile.class , new WardrobeRender());
        EnumDoorTypes.WARDROBE.setInteriorDoorModel(new WardrobeInteriorDoorModel());
    }

}
