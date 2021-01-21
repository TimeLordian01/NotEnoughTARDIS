package com.thevale.moretimecapsulesmod.items;

import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ValeItems {
    public static final DeferredRegister<Item> ITEMS;

    public static <T extends Item> T createItem(T item) {
        return item;
    }

    static {
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Moretimecapsulesmod.MODID);
    }
}
