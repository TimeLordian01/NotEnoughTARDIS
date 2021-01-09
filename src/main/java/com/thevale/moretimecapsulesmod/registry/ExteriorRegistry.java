package com.thevale.moretimecapsulesmod.registry;

import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import com.thevale.moretimecapsulesmod.blocks.ValeBlocks;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.exterior.TwoBlockBasicExterior;
import net.tardis.mod.registries.TardisRegistries;

public class ExteriorRegistry{

    public static TwoBlockBasicExterior TELE2;

    public static void register(){
            net.tardis.mod.exterior.ExteriorRegistry.register(new ResourceLocation(Moretimecapsulesmod.MODID,"shalka"),
                new TwoBlockBasicExterior(() -> ValeBlocks.exterior_shalka.getDefaultState(),true, EnumDoorTypes.SHALKA,new ResourceLocation(Moretimecapsulesmod.MODID,"textures/gui/exteriors/shalka.png")));
            net.tardis.mod.exterior.ExteriorRegistry.register(new ResourceLocation(Moretimecapsulesmod.MODID,"ptored"),
                new TwoBlockBasicExterior(() -> ValeBlocks.exterior_ptored.getDefaultState(),true, EnumDoorTypes.PTORED,new ResourceLocation(Moretimecapsulesmod.MODID,"textures/gui/exteriors/ptored.png")));
            net.tardis.mod.exterior.ExteriorRegistry.register(new ResourceLocation(Moretimecapsulesmod.MODID,"fenix"),
                new TwoBlockBasicExterior(() -> ValeBlocks.exterior_fenix.getDefaultState(),true, EnumDoorTypes.FENIX,new ResourceLocation(Moretimecapsulesmod.MODID,"textures/gui/exteriors/fenixicon.png")));

    }
}
