package com.thevale.moretimecapsulesmod.consoles;


import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import com.thevale.moretimecapsulesmod.blocks.ValeBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.tardis.mod.Tardis;
import net.tardis.mod.registries.Console;
import net.tardis.mod.registries.IRegisterable;
import net.tardis.mod.registries.TardisRegistries;

import java.util.function.Supplier;


@Mod.EventBusSubscriber(modid = Moretimecapsulesmod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class VConsoles implements IRegisterable<Console> {

    public static Console VALE;
    public static Console CORAL2;
    public static Console SMITH;

    @Override
    public Console setRegistryName(ResourceLocation resourceLocation) {
        return null;
    }

    @Override
    public ResourceLocation getRegistryName() {
        return null;
    }

    @SubscribeEvent
    public static void eventBusSubscriber(FMLCommonSetupEvent event) {
        TardisRegistries.registerRegisters(() -> {
            VALE = register(new Console(() -> ValeBlocks.console_vale.get().getDefaultState(), new ResourceLocation(Moretimecapsulesmod.MODID,"textures/gui/consoles/valeconsole.png")), "vale", new ResourceLocation(Moretimecapsulesmod.MODID,"vale"));
            CORAL2 = register(new Console(() -> ValeBlocks.console_coral2.get().getDefaultState(), new ResourceLocation(Moretimecapsulesmod.MODID,"textures/gui/consoles/coralconsole.png")), "coral2", new ResourceLocation(Moretimecapsulesmod.MODID,"coral2"));
            SMITH = register(new Console(() -> ValeBlocks.console_smith.get().getDefaultState(), new ResourceLocation(Moretimecapsulesmod.MODID,"textures/gui/consoles/smithconsole.png")), "smith", new ResourceLocation(Moretimecapsulesmod.MODID,"smith"));


        });

    }

    private static Console register(Console console, String name, ResourceLocation resourceLocation) {
        console.setRegistryName(new ResourceLocation(Tardis.MODID, name));
        TardisRegistries.CONSOLE_REGISTRY.register(console.getRegistryName(), console);
        return console;
    }

}