package com.pherment.rebirthcraft.block;

import com.pherment.rebirthcraft.RebirthCraft;
import com.pherment.rebirthcraft.item.ModItems;
import com.pherment.rebirthcraft.item.RebirthCraftTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, RebirthCraft.MOD_ID);

    public static final RegistryObject<Block> Platinum_Ore = registerBlock("platinum_ore", () ->
            new Block(BlockBehaviour.Properties.of(Material.STONE).strength(4f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> Buc_Log = registerBlock("buc_log", () ->
            new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(1f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> Buc_Plank = registerBlock("buc_plank", () ->
            new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(1f).requiresCorrectToolForDrops()));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(RebirthCraftTab.REBIRTHCRAFT_TAB)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
