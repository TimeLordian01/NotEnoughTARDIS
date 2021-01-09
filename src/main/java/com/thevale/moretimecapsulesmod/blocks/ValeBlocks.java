package com.thevale.moretimecapsulesmod.blocks;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import net.tardis.mod.blocks.ExteriorBlock;
import net.tardis.mod.blocks.TBlocks;


@ObjectHolder("moretimecapsulesmod")
@Mod.EventBusSubscriber(modid="moretimecapsulesmod",bus= Mod.EventBusSubscriber.Bus.MOD)


public class ValeBlocks extends TBlocks {
    public static ExteriorBlock exterior_shalka = register(new ExteriorBlock(),"exterior_shalka",null,false);
    public static ExteriorBlock exterior_ptored = register(new ExteriorBlock(),"exterior_ptored",null,false);
    public static ExteriorBlock exterior_fenix = register(new ExteriorBlock(),"exterior_fenix",null,false);
}
