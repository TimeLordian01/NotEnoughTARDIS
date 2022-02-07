package com.thevale.moretimecapsulesmod.tileentities.consoles;


import com.thevale.moretimecapsulesmod.tileentities.ValeTiles;
import net.minecraft.entity.EntitySize;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.vector.Vector3d;
import net.tardis.mod.controls.*;
import net.tardis.mod.registries.ControlRegistry;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.console.misc.ControlOverride;


public class SmithConsoleTile extends ConsoleTile {

       public static final AxisAlignedBB RENDER_BOX = new AxisAlignedBB(-2, -1, -2, 2, 2.5, 2);

    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        return RENDER_BOX.offset(this.getPos());
    }

    public SmithConsoleTile() {
        this(ValeTiles.console_smith.get());
  }

    public SmithConsoleTile(TileEntityType<?> type) {
        super(type);
        this.controlOverrides.put(FacingControl.class, new ControlOverride(new Vector3d(-0.51, 0.969, 0.01),EntitySize.flexible(0.25F, 0.25F)));          //Spin2 (Gyroscope)
        this.controlOverrides.put(StabilizerControl.class, new ControlOverride(new Vector3d(0.275, 0.438, -0.988),EntitySize.flexible(0.1875F, 0.1875F)));      //blueboringers
        this.controlOverrides.put(TelepathicControl.class, new ControlOverride(new Vector3d(0.631, 0.5, 0.802),EntitySize.flexible(0.3125F, 0.3125F)));      //typewriter
        this.controlOverrides.put(CommunicatorControl.class, new ControlOverride(new Vector3d(0.249, 0.875, 0.434),EntitySize.flexible(0.3125F, 0.3125F)));    //phone
        this.controlOverrides.put(RefuelerControl.class, new ControlOverride(new Vector3d(-0.707, 0.594, 0.617),EntitySize.flexible(0.25F, 0.25F)));        // part (minilever)
        this.controlOverrides.put(RandomiserControl.class, new ControlOverride(new Vector3d(-0.814, 0.531, 0.007),EntitySize.flexible(0.25F, 0.25F)));      //RandomiserPivot
        this.controlOverrides.put(HandbrakeControl.class, new ControlOverride(new Vector3d(0.933, 0.594, 0.414),EntitySize.flexible(0.25F, 0.25F)));       //redset1 lev 1 and 2
        this.controlOverrides.put(DoorControl.class, new ControlOverride(new Vector3d(0.566, 0.594, -0.548),EntitySize.flexible(0.25F, 0.25F)));            //switch (PhaseSwitch)
        this.controlOverrides.put(IncModControl.class, new ControlOverride(new Vector3d(1.019, 0.281, 0.33), EntitySize.flexible(0.25F, 0.25F)));           //lever 2 (weird lever)
        this.controlOverrides.put(DimensionControl.class, new ControlOverride(new Vector3d(-0.451, 0.562, -0.693),EntitySize.flexible(0.1875F, 0.1875F)));        //helmic regulator
        this.controlOverrides.put(LandingTypeControl.class, new ControlOverride(new Vector3d(-0.034, 0.594, 0.884),EntitySize.flexible(0.24999999999999994F, 0.25F))); //     //pump3
        this.controlOverrides.put(SonicPortControl.class, new ControlOverride(new Vector3d(0.784, 0.562, -0.001),EntitySize.flexible(0.3125F, 0.3125F)));       //gravatomic accelerator
        this.controlOverrides.put(XControl.class, new ControlOverride(new Vector3d(-1.179, 0.406, -0.156),EntitySize.flexible(0.125F, 0.125F)));                //keyboard
        this.controlOverrides.put(YControl.class, new ControlOverride(new Vector3d(-1.181, 0.406, 0.013),EntitySize.flexible(0.125F, 0.125F)));                //keyboard
        this.controlOverrides.put(ZControl.class, new ControlOverride(new Vector3d(-1.182, 0.406, 0.149),EntitySize.flexible(0.125F, 0.125F)));                //keyboard
        this.controlOverrides.put(ThrottleControl.class, new ControlOverride(new Vector3d(-0.792, 0.625, -0.601),EntitySize.flexible(0.1875F, 0.1875F)));         //throttle
        this.controlOverrides.put(FastReturnControl.class, new ControlOverride(new Vector3d(0.237, 0.281, -1.056),EntitySize.flexible(0.125F, 0.125F)));       //redbutton
        this.controlOverrides.put(MonitorControl.class, new ControlOverride(new Vector3d(-0.165, 1.406, -0.895), EntitySize.flexible(0.5F, 0.5F)));          //monitor
    }


}