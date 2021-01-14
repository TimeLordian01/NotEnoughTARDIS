package com.thevale.moretimecapsulesmod.blocks;

import com.thevale.moretimecapsulesmod.Moretimecapsulesmod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import net.tardis.mod.blocks.ConsoleBlock;
import net.tardis.mod.blocks.ExteriorBlock;
import net.tardis.mod.items.TItemProperties;
import net.tardis.mod.misc.INeedItem;

import java.util.ArrayList;
import java.util.List;


@ObjectHolder("moretimecapsulesmod")
@Mod.EventBusSubscriber(modid="moretimecapsulesmod",bus= Mod.EventBusSubscriber.Bus.MOD)


public class ValeBlocks {
    public static List<Item> ITEMS = new ArrayList<Item>();
    public static List<Block> BLOCKS = new ArrayList<Block>();

    public static ExteriorBlock exterior_shalka = register(new ExteriorBlock(),"exterior_shalka",null,false);
    public static ExteriorBlock exterior_ptored = register(new ExteriorBlock(),"exterior_ptored",null,false);
    public static ExteriorBlock exterior_wardrobe = register(new ExteriorBlock(),"exterior_wardrobe",null,false);
    public static ExteriorBlock exterior_elevator = register(new ExteriorBlock(),"exterior_elevator",null,false);
    public static ExteriorBlock exterior_organ = register(new ExteriorBlock(),"exterior_organ",null,false);
    public static ExteriorBlock exterior_canon05 = register(new ExteriorBlock(),"exterior_canon05",null,false);

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Block> event) {
        for(Block block : BLOCKS) {
            event.getRegistry().registerAll(block);
        }
    }

    public static <T extends Block> T register(T block, String name, ItemGroup group, boolean hasItem) {
        ResourceLocation loc = new ResourceLocation(Moretimecapsulesmod.MODID, name);
        block.setRegistryName(loc);

        if(hasItem) {
            if(block instanceof INeedItem) {
                ITEMS.add(((INeedItem)block).getItem().setRegistryName(loc));
            }
            else ITEMS.add(new BlockItem(block, TItemProperties.BLOCK.group(group)).setRegistryName(loc));
        }

        BLOCKS.add(block);

        return block;
    }

    public static <T extends Block> T register(T block, String name, ItemGroup group){
        return register(block, name, group, true);
    }

    public static <T extends Block> T register(T block, String name) {
        return register(block, name, null);
    }
}