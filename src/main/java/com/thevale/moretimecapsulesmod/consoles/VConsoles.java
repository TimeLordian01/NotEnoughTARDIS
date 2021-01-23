package com.thevale.moretimecapsulesmod.consoles;


import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import net.minecraft.block.BlockState;
import net.minecraft.util.ResourceLocation;
import net.tardis.mod.misc.Console;

import java.util.function.Supplier;


public class VConsoles extends Console {
    private ResourceLocation registryName;
    private ResourceLocation imageLocation;
    private Supplier<BlockState> state;

    @Override
    public ResourceLocation getPreviewTexture() {
        return this.imageLocation;
    }

    public VConsoles(Supplier<BlockState> state, String imageLocation) {
        this(state, new ResourceLocation(Moretimecapsulesmod.MODID, "textures/gui/consoles/" + imageLocation + ".png"));
    }

    public VConsoles(Supplier<BlockState> state, ResourceLocation imageLocation) {
        super(state, imageLocation);
        this.state = state;
        this.imageLocation = imageLocation;
    }
}