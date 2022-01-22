package com.pherment.rebirthcraft.item;

import com.pherment.rebirthcraft.RebirthCraft;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RebirthCraft.MOD_ID);

    public static final RegistryObject<Item> Platinum_Ingot = ITEMS.register("platinum_ingot", () -> new Item(new Item.Properties().tab(RebirthCraftTab.REBIRTHCRAFT_TAB)));
    public static final RegistryObject<Item> Platinum_Nugget = ITEMS.register("platinum_nugget", () -> new Item(new Item.Properties().tab(RebirthCraftTab.REBIRTHCRAFT_TAB)));
    public static final RegistryObject<Item> Platinum_Mana_Ingot = ITEMS.register("platinum_mana_ingot", () -> new Item(new Item.Properties().tab(RebirthCraftTab.REBIRTHCRAFT_TAB)));
    public static final RegistryObject<Item> Buc_stick = ITEMS.register("buc_stick", () -> new Item(new Item.Properties().tab(RebirthCraftTab.REBIRTHCRAFT_TAB)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
