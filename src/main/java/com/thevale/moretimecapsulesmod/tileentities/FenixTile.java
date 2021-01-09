package com.thevale.moretimecapsulesmod.tileentities;

import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.AxisAlignedBB;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class FenixTile extends ExteriorTile {

public static final AxisAlignedBB RENDER = new AxisAlignedBB(-1, -1, -1, 2, 2, 2);
public FenixTile() {
    super(ValeTiles.exterior_fenix);
}

    public FenixTile(TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }

    @Override
    public AxisAlignedBB getDoorAABB() {
        if (world!= null && world.getBlockState(getPos()).has(BlockStateProperties.HORIZONTAL_FACING)){
            switch(world.getBlockState(this.getPos()).get(BlockStateProperties.HORIZONTAL_FACING)) {
                case EAST: return new AxisAlignedBB(0.5, -1, 0, 1.1, 1, 1);
                case SOUTH: return new AxisAlignedBB(0, -1, 0.5, 1, 1, 1.1);
                case WEST: return new AxisAlignedBB(-0.1, -1, 0, 0.5, 1, 1);
                default: return new AxisAlignedBB(0, 0, -0.1, 1, 2, 0.5);
            }
        }
        return new AxisAlignedBB(0, 0, 0, 0, 0, 0);
        }
    }

