package com.thevale.moretimecapsulesmod.registries;

import net.minecraft.block.material.Material;
import net.tardis.mod.blocks.TileBlock;
import net.tardis.mod.misc.IDontBreak;

public class VConsoleBlock extends TileBlock implements IDontBreak {
    public VConsoleBlock() {
        super(Properties.create(Material.BARRIER).variableOpacity().hardnessAndResistance(99999F, 99999F));
    }
}
