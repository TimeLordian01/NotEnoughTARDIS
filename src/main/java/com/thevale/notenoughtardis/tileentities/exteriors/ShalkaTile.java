package com.thevale.notenoughtardis.tileentities.exteriors;

import com.thevale.notenoughtardis.registries.ValeTiles;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.AxisAlignedBB;
import net.tardis.mod.tileentities.exteriors.ExteriorTile;

public class ShalkaTile extends ExteriorTile {
    AxisAlignedBB NORTH_DOOR = new AxisAlignedBB(0, 0, -0.1, 1, 2, 0.5);

    public static final AxisAlignedBB RENDER = new AxisAlignedBB(-1, -1, -1, 2, 2, 2);
    public ShalkaTile() { super(ValeTiles.exterior_shalka.get()); }

    @Override
    public AxisAlignedBB getDoorAABB() {
        if (world!= null && world.getBlockState(getPos()).hasProperty(BlockStateProperties.HORIZONTAL_FACING)){
            switch(world.getBlockState(this.getPos()).get(BlockStateProperties.HORIZONTAL_FACING)) {
                case EAST: return new AxisAlignedBB(0.5, -1, 0, 1.1, 1, 1);
                case SOUTH: return new AxisAlignedBB(0, -1, 0.5, 1, 1, 1.1);
                case WEST: return new AxisAlignedBB(-0.1, -1, 0, 0.5, 1, 1);
                default: return NORTH_DOOR;
            }
        }
        return new AxisAlignedBB(0, 0, 0, 0, 0, 0);
    }

    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        return RENDER.offset(this.getPos());
    }
}