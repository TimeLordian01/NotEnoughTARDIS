package com.thevale.moretimecapsulesmod.registry;

import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import com.thevale.moretimecapsulesmod.blocks.ValeBlocks;
import com.thevale.moretimecapsulesmod.texturevariants.TextureVariants;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.tardis.mod.exterior.IExterior;
import net.tardis.mod.exterior.TwoBlockBasicExterior;
import net.tardis.mod.misc.DoorSounds;

@Mod.EventBusSubscriber(
        modid = Moretimecapsulesmod.MODID,
        bus = Mod.EventBusSubscriber.Bus.MOD
)
public class ExteriorRegistry{
    public static TwoBlockBasicExterior SHALKA;
    public static TwoBlockBasicExterior PTORED;
    public static TwoBlockBasicExterior WARDROBE;
    public static TwoBlockBasicExterior ORGAN;
    public static TwoBlockBasicExterior canon05;

    @SubscribeEvent
    public static void register(FMLCommonSetupEvent event){
        SHALKA = register(new ResourceLocation("moretimecapsulesmod", "shalkaentity"),
                new TwoBlockBasicExterior(() -> ValeBlocks.exterior_shalka.get().getDefaultState(), true,
                        EnumDoorTypes.SHALKA, DoorSounds.BASE, new ResourceLocation("moretimecapsulesmod",
                        "textures/gui/exteriors/shalkaexterior.png")));
        PTORED = register(new ResourceLocation("moretimecapsulesmod", "ptored"),
                new TwoBlockBasicExterior(() -> ValeBlocks.exterior_ptored.get().getDefaultState(), true,
                        EnumDoorTypes.PTORED, DoorSounds.BASE, new ResourceLocation("moretimecapsulesmod",
                        "textures/gui/exteriors/ptoredexterior.png")));
        WARDROBE = register(new ResourceLocation("moretimecapsulesmod", "wardrobe_oak_variant"),
                new TwoBlockBasicExterior(() -> ValeBlocks.exterior_wardrobe.get().getDefaultState(), true,
                        EnumDoorTypes.WARDROBE, DoorSounds.BASE, new ResourceLocation("moretimecapsulesmod",
                        "textures/gui/exteriors/shalkaexterior.png"), TextureVariants.WARDROBE));
        ORGAN = register(new ResourceLocation("moretimecapsulesmod", "organexterior"),
                new TwoBlockBasicExterior(() -> ValeBlocks.exterior_organ.get().getDefaultState(), true,
                        EnumDoorTypes.ORGAN, DoorSounds.BASE, new ResourceLocation("moretimecapsulesmod",
                        "textures/gui/exteriors/organexterior.png")));
        canon05 = register(new ResourceLocation("moretimecapsulesmod", "fiveexterior"),
                new TwoBlockBasicExterior(() -> ValeBlocks.exterior_canon05.get().getDefaultState(), true,
                        EnumDoorTypes.CANON05, DoorSounds.BASE, new ResourceLocation("moretimecapsulesmod",
                        "textures/gui/exteriors/fiveexterior.png")));
    }

    public static <T extends IExterior> T register(ResourceLocation key, T ext) {
        ext.setRegistryName(key);
        net.tardis.mod.exterior.ExteriorRegistry.getRegistry().put(key, ext);
        return ext;
    }
}
