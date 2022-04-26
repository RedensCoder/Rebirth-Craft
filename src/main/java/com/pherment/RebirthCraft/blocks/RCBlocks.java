package com.pherment.RebirthCraft.blocks;

import com.pherment.RebirthCraft.RebirthCraft;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RCBlocks {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            RebirthCraft.Mod_Id);

    public static final RegistryObject<Block> PLATINUM_ORE = BLOCKS.register("platinum_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(9f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_PLATINUM_ORE = BLOCKS.register("deepslate_platinum_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(10f).requiresCorrectToolForDrops()));

    // FLOWERS
    public static final RegistryObject<Block> DEADLY_ROSE = BLOCKS.register("deadly_rose",
            ()-> new FlowerBlock(MobEffects.WITHER, 10, BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()));

    public static void blockRegister(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
