package com.thevale.moretimecapsulesmod.tileentities.consoles;

import com.thevale.moretimecapsulesmod.registries.ValeTiles;
import com.thevale.moretimecapsulesmod.texturevariants.TextureVariants;
import net.minecraft.entity.EntitySize;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.vector.Vector3d;
import net.tardis.mod.controls.*;
import net.tardis.mod.tileentities.ConsoleTile;
import net.tardis.mod.tileentities.console.misc.ControlOverride;


public class ValeConsoleTile extends ConsoleTile {

       public static final AxisAlignedBB RENDER_BOX = new AxisAlignedBB(-2, -1, -2, 2, 2.5, 2);

    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        return RENDER_BOX.offset(this.getPos());
    }

    public ValeConsoleTile() {
        this(ValeTiles.console_vale.get());
  }

    public ValeConsoleTile(TileEntityType<?> type) {
        super(type);
        //this.registerControlEntry(ControlRegistry.MONITOR);
        this.controlOverrides.put(FacingControl.class, new ControlOverride(new Vector3d(0.914339917660391, 0.40625, -0.10809723771288376),EntitySize.flexible(0.125F, 0.125F)));
        this.controlOverrides.put(StabilizerControl.class, new ControlOverride(new Vector3d(0.5124365364936225, 0.40625, -0.653795842474419),EntitySize.flexible(0.125F, 0.125F)));
        this.controlOverrides.put(TelepathicControl.class, new ControlOverride(new Vector3d(-0.7515661356650123, 0.4375, 0.22506574191719442),EntitySize.flexible(0.1875F, 0.1875F)));
        this.controlOverrides.put(CommunicatorControl.class, new ControlOverride(new Vector3d(-0.5942022758154865, 0.46875, 0.40998211778201976),EntitySize.flexible(0.125F, 0.125F)));     //
        this.controlOverrides.put(RefuelerControl.class, new ControlOverride(new Vector3d(-0.5178859393174927, 0.53125, -0.29367501734119855),EntitySize.flexible(0.125F, 0.125F)));   //
        this.controlOverrides.put(RandomiserControl.class, new ControlOverride(new Vector3d(0.5749393612576679, 0.46875, -0.33177419490710763),EntitySize.flexible(0.125F, 0.125F)));  //
        this.controlOverrides.put(HandbrakeControl.class, new ControlOverride(new Vector3d(0.24881893560546353, 0.4375, -0.8128662997375451),EntitySize.flexible(0.1875F, 0.1875F))); //
        this.controlOverrides.put(DoorControl.class, new ControlOverride(new Vector3d(-0.7171458180411742, 0.46875, -0.4168227830327955),EntitySize.flexible(0.125F, 0.125F)));         //
        this.controlOverrides.put(IncModControl.class, new ControlOverride(new Vector3d(-0.1280989597405986, 0.40625, -0.7493352343162335),EntitySize.flexible(0.125F, 0.125F)));    //
        this.controlOverrides.put(DimensionControl.class, new ControlOverride(new Vector3d(0.016789978581062348, 0.34375, 0.7722908067099479),EntitySize.flexible(0.25F, 0.25F))); //
        this.controlOverrides.put(LandingTypeControl.class, new ControlOverride(new Vector3d(0.6729961433507958, 0.46875, -0.14861746114799756),EntitySize.flexible(0.125F, 0.125F)));     //
        this.controlOverrides.put(SonicPortControl.class, new ControlOverride(new Vector3d(-0.0015409706235525178, 0.59375, -0.4844905781441211),EntitySize.flexible(0.12500000000000006F, 0.125F))); //
        this.controlOverrides.put(XControl.class, new ControlOverride(new Vector3d(0.4328770600423075, 0.55, 0.5026767542881059),EntitySize.flexible(0.0625F, 0.0625F)));              //
        this.controlOverrides.put(YControl.class, new ControlOverride(new Vector3d(0.521435143003071, 0.5, 0.5550778250929418),EntitySize.flexible(0.0625F, 0.0625F)));            //
        this.controlOverrides.put(ZControl.class, new ControlOverride(new Vector3d(0.6024025331386262, 0.45, 0.6029873755430777),EntitySize.flexible(0.0625F, 0.0625F)));           //
        this.controlOverrides.put(ThrottleControl.class, new ControlOverride(new Vector3d(0.08281849287003873, 0.4375, -0.80196168578266),EntitySize.flexible(0.1875F, 0.1875F)));  //
        this.controlOverrides.put(FastReturnControl.class, new ControlOverride(new Vector3d(-0.22620537362467819, 0.53125, -0.6446594423166538),EntitySize.flexible(0.125F, 0.125F))); //
    }


}