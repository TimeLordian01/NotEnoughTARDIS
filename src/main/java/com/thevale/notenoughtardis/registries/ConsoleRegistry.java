package com.thevale.notenoughtardis.registries;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.tardis.mod.misc.Console;

public class ConsoleRegistry {
    public static final DeferredRegister<Console> CONSOLES = DeferredRegister.create(Console.class, com.thevale.notenoughtardis.NotEnoughTardis.MODID);

    public static final RegistryObject<VConsoles> SMITH = CONSOLES.register("smith", () -> new VConsoles(() -> ValeBlocks.console_smith.get().getDefaultState(), "smithconsole"));
    public static final RegistryObject<VConsoles> VTOYOTA = CONSOLES.register("vtoyota", () -> new VConsoles(() -> ValeBlocks.console_vtoyota.get().getDefaultState(), "vtoyotaconsole"));
    public static final RegistryObject<VConsoles> VALE = CONSOLES.register("vale", () -> new VConsoles(() -> ValeBlocks.console_vale.get().getDefaultState(), "valeconsole"));
}
