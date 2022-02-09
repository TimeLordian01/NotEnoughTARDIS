package com.thevale.notenoughtardis.registries;

import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ValeItems {
    public static final DeferredRegister<Item> ITEMS;

    public static <T extends Item> T createItem(T item) {
        return item;
    }

    static {
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, com.thevale.notenoughtardis.NotEnoughTardis.MODID);
    }
}
