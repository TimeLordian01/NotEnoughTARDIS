package com.thevale.moretimecapsulesmod.tileentities.consoles;


import com.thevale.moretimecapsulesmod.registries.ConsoleRegistry;
import com.thevale.moretimecapsulesmod.registries.ValeTiles;
import net.minecraft.entity.EntitySize;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.vector.Vector3d;
import net.tardis.mod.controls.*;
import net.tardis.mod.registries.ControlRegistry;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.console.misc.ControlOverride;


public class CoralConsoleTile extends ConsoleTile {

       public static final AxisAlignedBB RENDER_BOX = new AxisAlignedBB(-2, -1, -2, 2, 2.5, 2);

    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        return RENDER_BOX.offset(this.getPos());
    }

    public CoralConsoleTile() {
        this(ValeTiles.console_coral2.get());
        this.registerControlEntry(ControlRegistry.MONITOR.get());
  }


    public CoralConsoleTile(TileEntityType<?> type) {
        super(type);
        this.controlOverrides.put(FacingControl.class, new ControlOverride(new Vector3d(0.919, 0.094, 0.528),EntitySize.flexible(0.25F, 0.25F)));
        this.controlOverrides.put(StabilizerControl.class, new ControlOverride(new Vector3d(1.029, 0.156, -0.441),EntitySize.flexible(0.25F, 0.25F)));
        this.controlOverrides.put(TelepathicControl.class, new ControlOverride(new Vector3d(0.832, 0.031, 0.086),EntitySize.flexible(0.375F, 0.375F)));
        this.controlOverrides.put(CommunicatorControl.class, new ControlOverride(new Vector3d(0.489, 0.375, -0.517),EntitySize.flexible(0.1875F, 0.1875F)));
        this.controlOverrides.put(RefuelerControl.class, new ControlOverride(new Vector3d(-0.419, 0.5, -0.463),EntitySize.flexible(0.1875F, 0.1875F)));
        this.controlOverrides.put(RandomiserControl.class, new ControlOverride(new Vector3d(-0.905, 0.438, -0.369),EntitySize.flexible(0.1875F, 0.1875F)));
        this.controlOverrides.put(HandbrakeControl.class, new ControlOverride(new Vector3d(-0.01, 0.438, -0.672),EntitySize.flexible(0.3125F, 0.3125F)));
        this.controlOverrides.put(DoorControl.class, new ControlOverride(new Vector3d(0.908, 0.219, -0.732),EntitySize.flexible(0.25F, 0.25F)));
        this.controlOverrides.put(IncModControl.class, new ControlOverride(new Vector3d(-0.921, 0.469, -0.569),EntitySize.flexible(0.125F, 0.125F)));
        this.controlOverrides.put(DimensionControl.class, new ControlOverride(new Vector3d(-0.523, 0.219, 0.673),EntitySize.flexible(0.25F, 0.25F)));
        this.controlOverrides.put(LandingTypeControl.class, new ControlOverride(new Vector3d(-0.901, 0.188, -0.655),EntitySize.flexible(0.1875F, 0.1875F)));
        this.controlOverrides.put(SonicPortControl.class, new ControlOverride(new Vector3d(0.552, 0.406, 0),EntitySize.flexible(0.25F, 0.25F)));
        this.controlOverrides.put(XControl.class, new ControlOverride(new Vector3d(-0.296, 0.281, -0.736),EntitySize.flexible(0.125F, 0.125F)));
        this.controlOverrides.put(YControl.class, new ControlOverride(new Vector3d(-0.492, 0.156, -0.74),EntitySize.flexible(0.125F, 0.125F)));
        this.controlOverrides.put(ZControl.class, new ControlOverride(new Vector3d(-0.491, 0.281, -0.622),EntitySize.flexible(0.125F, 0.125F)));
        this.controlOverrides.put(ThrottleControl.class, new ControlOverride(new Vector3d(0.926, 0.438, 0.491),EntitySize.flexible(0.3125F, 0.3125F)));
        this.controlOverrides.put(FastReturnControl.class, new ControlOverride(new Vector3d(0.428, 0.281, 0.69),EntitySize.flexible(0.25F, 0.25F)));
        this.controlOverrides.put(MonitorControl.class, new ControlOverride(new Vector3d(0.511, 0.875, -0.508),EntitySize.flexible(0.3125F, 0.3125F)));
    }


}