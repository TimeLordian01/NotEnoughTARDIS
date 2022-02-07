package com.thevale.moretimecapsulesmod.registries;

import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import com.thevale.moretimecapsulesmod.texturevariants.TextureVariants;
import com.thevale.moretimecapsulesmod.util.EnumDoorTypes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.tardis.mod.exterior.AbstractExterior;
import net.tardis.mod.exterior.TwoBlockBasicExterior;
import net.tardis.mod.misc.DoorSounds;
import net.tardis.mod.misc.TexVariant;

@Mod.EventBusSubscriber(
        modid = Moretimecapsulesmod.MODID,
        bus = Mod.EventBusSubscriber.Bus.MOD
)
public class ExteriorRegistry {


    public static final DeferredRegister<AbstractExterior> EXTERIORS = DeferredRegister.create(AbstractExterior.class, Moretimecapsulesmod.MODID);

    public static final RegistryObject<AbstractExterior> canon05 = EXTERIORS.register("2005exterior", () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_canon05.get().getDefaultState(), true, EnumDoorTypes.CANON05, DoorSounds.WOOD, new ResourceLocation(Moretimecapsulesmod.MODID, "textures/gui/exteriors/fiveexterior.png")));
    public static final RegistryObject<AbstractExterior> organ = EXTERIORS.register("organ", () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_organ.get().getDefaultState(), true, EnumDoorTypes.ORGAN, DoorSounds.WOOD, new ResourceLocation(Moretimecapsulesmod.MODID, "textures/gui/exteriors/organexterior.png")));
    public static final RegistryObject<AbstractExterior> ptored = EXTERIORS.register("ptored", () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_ptored.get().getDefaultState(), true, EnumDoorTypes.PTORED, DoorSounds.WOOD, new ResourceLocation(Moretimecapsulesmod.MODID, "textures/gui/exteriors/ptoredexterior.png")));
    public static final RegistryObject<AbstractExterior> shalka = EXTERIORS.register("shalka", () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_shalka.get().getDefaultState(), true, EnumDoorTypes.SHALKA, DoorSounds.WOOD, new ResourceLocation(Moretimecapsulesmod.MODID, "textures/gui/exteriors/shalkaexterior.png")));
    public static final RegistryObject<AbstractExterior> wardrobe = EXTERIORS.register("wardrobe", () -> new TwoBlockBasicExterior(() -> ValeBlocks.exterior_wardrobe.get().getDefaultState(), true, EnumDoorTypes.WARDROBE, DoorSounds.WOOD, new ResourceLocation(Moretimecapsulesmod.MODID, "textures/gui/exteriors/wardrobeexterior.png"), TextureVariants.WARDROBE));

}
