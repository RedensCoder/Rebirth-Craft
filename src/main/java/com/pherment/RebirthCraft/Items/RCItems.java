package com.pherment.RebirthCraft.Items;

import com.pherment.RebirthCraft.RCCreativeTab;
import com.pherment.RebirthCraft.RebirthCraft;
import com.pherment.RebirthCraft.blocks.RCBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RCItems {
        private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RebirthCraft.Mod_Id);

        // ITEMS
        public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
                        () -> new Item(new Item.Properties().tab(RCCreativeTab.RebirthCraft_Tab)));
        public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget",
                        () -> new Item(new Item.Properties().tab(RCCreativeTab.RebirthCraft_Tab)));
        public static final RegistryObject<Item> PLATINUM_HEADPIECE = ITEMS.register("platinum_headpiece", () -> new Item(new Item.Properties().tab(RCCreativeTab.RebirthCraft_Tab)));

        // BLOCKS
        public static final RegistryObject<Item> PLATINUM_ORE = ITEMS.register("platinum_ore",
                        () -> new BlockItem(RCBlocks.PLATINUM_ORE.get(),
                                        new Item.Properties().tab(RCCreativeTab.RebirthCraft_Tab)));
        public static final RegistryObject<Item> DEEPSLATE_PLATINUM_ORE = ITEMS.register("deepslate_platinum_ore", () -> new BlockItem(RCBlocks.DEEPSLATE_PLATINUM_ORE.get(), new Item.Properties().tab(RCCreativeTab.RebirthCraft_Tab)));

        // FLOWERS
        public static final RegistryObject<Item> DEADLY_ROSE = ITEMS.register("deadly_rose",
                () -> new BlockItem(RCBlocks.DEADLY_ROSE.get(),
                        new Item.Properties().tab(RCCreativeTab.RebirthCraft_Tab)));
        public static void itemRegister(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}