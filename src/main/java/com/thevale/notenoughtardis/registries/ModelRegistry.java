package com.thevale.notenoughtardis.registries;

import com.thevale.notenoughtardis.client.models.interiordoors.*;
import com.thevale.notenoughtardis.client.renders.consoles.VToyotaConsoleRender;
import com.thevale.notenoughtardis.client.renders.consoles.SmithConsoleRender;
import com.thevale.notenoughtardis.client.renders.consoles.ValeConsoleRender;
import com.thevale.notenoughtardis.client.renders.exteriors.*;
import com.thevale.notenoughtardis.util.EnumDoorTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.tardis.mod.client.TRenderTypes;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = com.thevale.notenoughtardis.NotEnoughTardis.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class ModelRegistry {
    @SubscribeEvent
    public static void Register(FMLClientSetupEvent event) {
        // Render Stuff
        event.enqueueWork(() -> {
            RenderTypeLookup.setRenderLayer(ValeBlocks.console_vale.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ValeBlocks.console_smith.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ValeBlocks.console_vtoyota.get(), RenderType.getTranslucent());
            RenderTypeLookup.setRenderLayer(ValeBlocks.exterior_wardrobe.get(), TRenderTypes.getTranslucent());
            RenderTypeLookup.setRenderLayer(ValeBlocks.exterior_shalka.get(), TRenderTypes.getTranslucent());
            RenderTypeLookup.setRenderLayer(ValeBlocks.exterior_ptored.get(), TRenderTypes.getTranslucent());
            RenderTypeLookup.setRenderLayer(ValeBlocks.exterior_organ.get(), TRenderTypes.getTranslucent());
            RenderTypeLookup.setRenderLayer(ValeBlocks.exterior_canon05.get(), TRenderTypes.getTranslucent());
                });
        //Exteriors
        ClientRegistry.bindTileEntityRenderer(ValeTiles.exterior_shalka.get(), ShalkaRender::new);
        EnumDoorTypes.SHALKA.setInteriorDoorModel(new ShalkaInteriorDoor());
        ClientRegistry.bindTileEntityRenderer(ValeTiles.exterior_ptored.get(), PtoredRender::new);
        EnumDoorTypes.PTORED.setInteriorDoorModel(new Ptoredinteriordoormodel());
        ClientRegistry.bindTileEntityRenderer(ValeTiles.exterior_wardrobe.get(), WardrobeRender::new);
        EnumDoorTypes.WARDROBE.setInteriorDoorModel(new WardrobeInteriorDoorModel());
        ClientRegistry.bindTileEntityRenderer(ValeTiles.exterior_organ.get(), OrganRender::new);
        EnumDoorTypes.ORGAN.setInteriorDoorModel(new OrganInnerDoors());
        ClientRegistry.bindTileEntityRenderer(ValeTiles.exterior_canon05.get(), FiveRender::new);
        EnumDoorTypes.CANON05.setInteriorDoorModel(new FiveInteriorDoor());

        //Consoles
        ClientRegistry.bindTileEntityRenderer(ValeTiles.console_vale.get(), ValeConsoleRender::new);
        ClientRegistry.bindTileEntityRenderer(ValeTiles.cosnsole_vtoyota.get(), VToyotaConsoleRender::new);
        ClientRegistry.bindTileEntityRenderer(ValeTiles.console_smith.get(), SmithConsoleRender::new);
    }

}
