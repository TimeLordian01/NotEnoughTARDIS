package com.thevale.moretimecapsulesmod.tileentities;


import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import com.thevale.moretimecapsulesmod.blocks.ValeBlocks;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.common.Mod;
import net.tardis.mod.tileentities.TTiles;

@Mod.EventBusSubscriber(modid = Moretimecapsulesmod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ValeTiles extends TTiles {
    public static TileEntityType<ShalkaTile>exterior_shalka = register(ShalkaTile::new,"exterior_shalka", ValeBlocks.exterior_shalka);
    public static TileEntityType<PtoredTile>exterior_ptored = register(PtoredTile::new,"exterior_ptored", ValeBlocks.exterior_ptored);
    public static TileEntityType<FenixTile>exterior_fenix = register(FenixTile::new,"exterior_fenix", ValeBlocks.exterior_fenix);
}
