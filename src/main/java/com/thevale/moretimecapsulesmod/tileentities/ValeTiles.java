package com.thevale.moretimecapsulesmod.tileentities;


import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import com.thevale.moretimecapsulesmod.blocks.ValeBlocks;
import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.tardis.mod.blocks.TileBlock;
import net.tardis.mod.tileentities.TTiles;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = Moretimecapsulesmod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ValeTiles {
    public static List<TileEntityType<?>> TYPES = new ArrayList<TileEntityType<?>>();

    public static TileEntityType<ShalkaTile>exterior_shalka = register(ShalkaTile::new,"exterior_shalka", ValeBlocks.exterior_shalka);
    public static TileEntityType<PtoredTile>exterior_ptored = register(PtoredTile::new,"exterior_ptored", ValeBlocks.exterior_ptored);
    public static TileEntityType<FenixTile>exterior_fenix = register(FenixTile::new,"exterior_fenix", ValeBlocks.exterior_fenix);
    public static TileEntityType<WardrobeTile>exterior_wardrobe = register(WardrobeTile::new,"exterior_wardrobe", ValeBlocks.exterior_wardrobe);

    @SubscribeEvent
    public static void register(RegistryEvent.Register<TileEntityType<?>> event) {
        for(TileEntityType<?> type : TYPES) {
            event.getRegistry().register(type);
        }
    }

    public static <T extends TileEntity> TileEntityType<T> register(Supplier<T> tile, String name, Block... validBlock) {
        TileEntityType<T> type = TileEntityType.Builder.create(tile, validBlock).build(null);
        type.setRegistryName(Moretimecapsulesmod.MODID, name);
        TYPES.add(type);
        for(Block block : validBlock) {
            if(block instanceof TileBlock) {
                ((TileBlock)block).setTileEntity(type);
            }
        }
        return type;
    }
}
