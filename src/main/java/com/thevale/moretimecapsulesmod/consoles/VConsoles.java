package com.thevale.moretimecapsulesmod.consoles;


import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import com.thevale.moretimecapsulesmod.blocks.ValeBlocks;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.tardis.mod.Tardis;
import net.tardis.mod.registries.Console;
import net.tardis.mod.registries.IRegisterable;
import net.tardis.mod.registries.TardisRegistries;


@Mod.EventBusSubscriber(modid = Moretimecapsulesmod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class VConsoles implements IRegisterable<Console> {

    public static Console VALE;

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
            VALE = register(new Console(() -> ValeBlocks.console_vale.getDefaultState(), new ResourceLocation(Moretimecapsulesmod.MODID,"textures/gui/consoles/valeconsole.png")), "vale", new ResourceLocation(Moretimecapsulesmod.MODID,"vale"));


        });
    }

    private static Console register(Console console, String name, ResourceLocation resourceLocation) {
        console.setRegistryName(new ResourceLocation(Tardis.MODID, name));
        TardisRegistries.CONSOLE_REGISTRY.register(console.getRegistryName(), console);
        return console;
    }

}