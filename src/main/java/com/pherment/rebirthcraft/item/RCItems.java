package com.pherment.rebirthcraft.item;

import com.pherment.rebirthcraft.RCTab;
import com.pherment.rebirthcraft.RebirthCraft;
import com.pherment.rebirthcraft.block.RCBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RCItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RebirthCraft.MOD_ID);

    /* =============== ITEMS ================== */

    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            () -> new Item(new Item.Properties().tab(RCTab.RCTab)));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties().tab(RCTab.RCTab)));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget",
            () -> new Item(new Item.Properties().tab(RCTab.RCTab)));
    public static final RegistryObject<Item> PLATINUM_MANA_INGOT = ITEMS.register("platinum_mana_ingot",
            () -> new Item(new Item.Properties().tab(RCTab.RCTab)));
    public static final RegistryObject<Item> PLATINUM_HEADPIECE = ITEMS.register("platinum_headpiece",
            () -> new Item(new Item.Properties().tab(RCTab.RCTab)));
    public static final RegistryObject<Item> BUC_STICK = ITEMS.register("buc_stick",
            () -> new Item(new Item.Properties().tab(RCTab.RCTab)));

    /* =============== BLOCKS ================== */
    public static final RegistryObject<Item> PLATINUM_ORE = ITEMS.register("platinum_ore",
            () -> new BlockItem(RCBlocks.PLATINUM_ORE.get(),
                    new Item.Properties().tab(RCTab.RCTab)));
    public static final RegistryObject<Item> DEEPSLATE_PLATINUM_ORE = ITEMS.register("deepslate_platinum_ore",
            () -> new BlockItem(RCBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                    new Item.Properties().tab(RCTab.RCTab)));
    public static final RegistryObject<Item> BUC_LOG = ITEMS.register("buc_log",
            () -> new BlockItem(RCBlocks.BUC_LOG.get(),
                    new Item.Properties().tab(RCTab.RCTab)));
    public static final RegistryObject<Item> BUC_LEAVES = ITEMS.register("buc_leaves",
            () -> new BlockItem(RCBlocks.BUC_LEAVES.get(),
                    new Item.Properties().tab(RCTab.RCTab)));
    public static final RegistryObject<Item> DEADLY_ROSE = ITEMS.register("deadly_rose",
            () -> new BlockItem(RCBlocks.DEADLY_ROSE.get(),
                    new Item.Properties().tab(RCTab.RCTab)));

/* ========= REGISTER ============ */
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}