package com.thevale.moretimecapsulesmod.registry;

import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import com.thevale.moretimecapsulesmod.blocks.ValeBlocks;
import com.thevale.moretimecapsulesmod.texturevariants.TextureVariants;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.exterior.TwoBlockBasicExterior;


public class ExteriorRegistry{

    public static void register(){
            net.tardis.mod.exterior.ExteriorRegistry.register(new ResourceLocation(Moretimecapsulesmod.MODID,"shalka"),
                new TwoBlockBasicExterior(() -> ValeBlocks.exterior_shalka.getDefaultState(),true, EnumDoorTypes.SHALKA,new ResourceLocation(Moretimecapsulesmod.MODID,"textures/gui/exteriors/shalkaexterior.png")));
            net.tardis.mod.exterior.ExteriorRegistry.register(new ResourceLocation(Moretimecapsulesmod.MODID,"ptored"),
                new TwoBlockBasicExterior(() -> ValeBlocks.exterior_ptored.getDefaultState(),true, EnumDoorTypes.PTORED,new ResourceLocation(Moretimecapsulesmod.MODID,"textures/gui/exteriors/ptoredexterior.png")));
            net.tardis.mod.exterior.ExteriorRegistry.register(new ResourceLocation(Moretimecapsulesmod.MODID,"fenix"),
                new TwoBlockBasicExterior(() -> ValeBlocks.exterior_fenix.getDefaultState(),true, EnumDoorTypes.FENIX,new ResourceLocation(Moretimecapsulesmod.MODID,"textures/gui/exteriors/fenixexterior.png")));
            net.tardis.mod.exterior.ExteriorRegistry.register(new ResourceLocation(Moretimecapsulesmod.MODID,"wardrobe"),
                new TwoBlockBasicExterior(() -> ValeBlocks.exterior_wardrobe.getDefaultState(),true, EnumDoorTypes.WARDROBE,new ResourceLocation(Moretimecapsulesmod.MODID,"textures/gui/exteriors/wardrobeexterior.png"), TextureVariants.WARDROBE));
            net.tardis.mod.exterior.ExteriorRegistry.register(new ResourceLocation(Moretimecapsulesmod.MODID,"elevator"),
                new TwoBlockBasicExterior(() -> ValeBlocks.exterior_elevator.getDefaultState(),true, EnumDoorTypes.ELEVATOR,new ResourceLocation(Moretimecapsulesmod.MODID,"textures/gui/exteriors/elevatorexterior.png")));
            net.tardis.mod.exterior.ExteriorRegistry.register(new ResourceLocation(Moretimecapsulesmod.MODID,"killerkomix"),
                new TwoBlockBasicExterior(() -> ValeBlocks.exterior_komix.getDefaultState(),true, EnumDoorTypes.KOMIX,new ResourceLocation(Moretimecapsulesmod.MODID,"textures/gui/exteriors/killerkomix_box.png")));
            net.tardis.mod.exterior.ExteriorRegistry.register(new ResourceLocation(Moretimecapsulesmod.MODID,"organ"),
                new TwoBlockBasicExterior(() -> ValeBlocks.exterior_organ.getDefaultState(),true, EnumDoorTypes.ORGAN,new ResourceLocation(Moretimecapsulesmod.MODID,"textures/gui/exteriors/organexterior.png")));

    }
}
