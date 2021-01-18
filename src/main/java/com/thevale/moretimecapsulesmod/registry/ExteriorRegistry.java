package com.thevale.moretimecapsulesmod.registry;

import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import com.thevale.moretimecapsulesmod.blocks.ValeBlocks;
import com.thevale.moretimecapsulesmod.texturevariants.TextureVariants;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.exterior.TwoBlockBasicExterior;
import net.tardis.mod.misc.DoorSounds;


public class ExteriorRegistry{

    public static void register(){
            net.tardis.mod.exterior.ExteriorRegistry.register(new ResourceLocation(Moretimecapsulesmod.MODID,"shalka"),
                new TwoBlockBasicExterior(() -> ValeBlocks.exterior_shalka.getDefaultState(),true, EnumDoorTypes.SHALKA, DoorSounds.BASE,new ResourceLocation(Moretimecapsulesmod.MODID,"textures/gui/exteriors/shalkaexterior.png")));
            net.tardis.mod.exterior.ExteriorRegistry.register(new ResourceLocation(Moretimecapsulesmod.MODID,"ptored"),
                new TwoBlockBasicExterior(() -> ValeBlocks.exterior_ptored.getDefaultState(),true, EnumDoorTypes.PTORED, DoorSounds.BASE,new ResourceLocation(Moretimecapsulesmod.MODID,"textures/gui/exteriors/ptoredexterior.png")));
            net.tardis.mod.exterior.ExteriorRegistry.register(new ResourceLocation(Moretimecapsulesmod.MODID,"wardrobe"),
                new TwoBlockBasicExterior(() -> ValeBlocks.exterior_wardrobe.getDefaultState(),true, EnumDoorTypes.WARDROBE,DoorSounds.BASE,new ResourceLocation(Moretimecapsulesmod.MODID,"textures/gui/exteriors/wardrobeexterior.png"), TextureVariants.WARDROBE));
            net.tardis.mod.exterior.ExteriorRegistry.register(new ResourceLocation(Moretimecapsulesmod.MODID,"elevator"),
                new TwoBlockBasicExterior(() -> ValeBlocks.exterior_elevator.getDefaultState(),true, EnumDoorTypes.ELEVATOR,DoorSounds.BASE,new ResourceLocation(Moretimecapsulesmod.MODID,"textures/gui/exteriors/elevatorexterior.png")));
            net.tardis.mod.exterior.ExteriorRegistry.register(new ResourceLocation(Moretimecapsulesmod.MODID,"killerkomix"),
                new TwoBlockBasicExterior(() -> ValeBlocks.exterior_organ.getDefaultState(),true, EnumDoorTypes.ORGAN,DoorSounds.BASE,new ResourceLocation(Moretimecapsulesmod.MODID,"textures/gui/exteriors/organexterior.png")));
            net.tardis.mod.exterior.ExteriorRegistry.register(new ResourceLocation(Moretimecapsulesmod.MODID,"canon05"),
                new TwoBlockBasicExterior(() -> ValeBlocks.exterior_canon05.getDefaultState(),true, EnumDoorTypes.CANON05,DoorSounds.BASE,new ResourceLocation(Moretimecapsulesmod.MODID,"textures/gui/exteriors/fiveexterior.png")));
            net.tardis.mod.exterior.ExteriorRegistry.register(new ResourceLocation(Moretimecapsulesmod.MODID,"portal"),
                new TwoBlockBasicExterior(() -> ValeBlocks.exterior_portal.getDefaultState(),true, EnumDoorTypes.PORTAL,DoorSounds.BASE,new ResourceLocation(Moretimecapsulesmod.MODID,"textures/gui/exteriors/portalexterior.png")));

    }
}
