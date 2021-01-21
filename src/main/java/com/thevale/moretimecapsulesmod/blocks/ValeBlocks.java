package com.thevale.moretimecapsulesmod.blocks;

import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import com.thevale.moretimecapsulesmod.items.ValeItems;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;
import net.tardis.mod.blocks.ConsoleBlock;
import net.tardis.mod.blocks.ExteriorBlock;
import net.tardis.mod.itemgroups.TItemGroups;
import net.tardis.mod.items.TItemProperties;
import net.tardis.mod.items.TItems;
import net.tardis.mod.misc.INeedItem;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ValeBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Moretimecapsulesmod.MODID);

    //Exteriors
    public static RegistryObject<Block> exterior_shalka = register("exterior_shalka", () -> setUpBlock(new ExteriorBlock()), false);
    public static RegistryObject<Block> exterior_ptored = register("exterior_ptored", () -> setUpBlock(new ExteriorBlock()), false);
    public static RegistryObject<Block> exterior_wardrobe = register("exterior_wardrobe", () -> setUpBlock(new ExteriorBlock()), false);
    public static RegistryObject<Block> exterior_organ = register("exterior_organ", () -> setUpBlock(new ExteriorBlock()), false);
    public static RegistryObject<Block> exterior_canon05 = register("exterior_canon05", () -> setUpBlock(new ExteriorBlock()), false);

    //Consoles
    public static RegistryObject<Block> console_vale = register("console_vale", () -> setUpBlock(new VConsoleBlock()), false);
    public static RegistryObject<Block> console_coral2 = register("console_coral2", () -> setUpBlock(new VConsoleBlock()), false);
    public static RegistryObject<Block> console_smith = register("console_smith", () -> setUpBlock(new VConsoleBlock()), false);

    private static Block setUpBlock(Block block) {
        return block;
    }

    public static <T extends Block> RegistryObject<T> register(String id, Supplier<T> blockSupplier, ItemGroup itemGroup) {
        RegistryObject<T> registryObject = BLOCKS.register(id, blockSupplier);
        ValeItems.ITEMS.register(id, () -> new BlockItem(registryObject.get(), (new Item.Properties()).group(itemGroup)));
        return registryObject;
    }

    public static <T extends Block> RegistryObject<T> register(String id, Supplier<T> blockSupplier) {
        RegistryObject<T> registryObject = BLOCKS.register(id, blockSupplier);
        ValeItems.ITEMS.register(id, () -> new BlockItem(registryObject.get(), (new Item.Properties()).group(TItemGroups.FUTURE)));
        return registryObject;
    }

    public static <T extends Block> RegistryObject<T> register(String id, Supplier<T> blockSupplier, boolean hasItem) {
        RegistryObject<T> registryObject = BLOCKS.register(id, blockSupplier);
        if (hasItem && blockSupplier.get() instanceof INeedItem) {
            ValeItems.ITEMS.register(id, () -> ((INeedItem)blockSupplier.get()).getItem());
        }

        return registryObject;
    }
}