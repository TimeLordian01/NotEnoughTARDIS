package com.thevale.moretimecapsulesmod.registry;

import com.thevale.moretimecapsulesmod.client.models.interiordoors.*;
import com.thevale.moretimecapsulesmod.client.renders.exteriors.*;
import com.thevale.moretimecapsulesmod.tileentities.*;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = "moretimecapsulesmod", bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModelRegistry {
    @SubscribeEvent
    public static void Register(FMLClientSetupEvent event) {
        ClientRegistry.bindTileEntitySpecialRenderer(ShalkaTile.class , new ShalkaRender());
        EnumDoorTypes.SHALKA.setInteriorDoorModel(new ShalkaInteriorDoor());
        ClientRegistry.bindTileEntitySpecialRenderer(PtoredTile.class , new PtoredRender());
        EnumDoorTypes.PTORED.setInteriorDoorModel(new Ptoredinteriordoor());
        ClientRegistry.bindTileEntitySpecialRenderer(WardrobeTile.class , new WardrobeRender());
        EnumDoorTypes.WARDROBE.setInteriorDoorModel(new WardrobeInteriorDoorModel());
        ClientRegistry.bindTileEntitySpecialRenderer(ElevatorTile.class , new ElevatorRender());
        EnumDoorTypes.ELEVATOR.setInteriorDoorModel(new Elevator_Two_InteriorDoors());
        ClientRegistry.bindTileEntitySpecialRenderer(OrganTile.class , new OrganRender());
        EnumDoorTypes.ORGAN.setInteriorDoorModel(new OrganInnerDoors());
        ClientRegistry.bindTileEntitySpecialRenderer(FiveTile.class , new FiveRender());
        EnumDoorTypes.CANON05.setInteriorDoorModel(new FiveInteriorDoor());
        ClientRegistry.bindTileEntitySpecialRenderer(PortalTile.class , new PortalRender());
        EnumDoorTypes.PORTAL.setInteriorDoorModel(new Portalinteriordoor());
    }

}
