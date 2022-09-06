package com.pherment.rebirthcraft.block;

import com.pherment.rebirthcraft.RebirthCraft;
import com.pherment.rebirthcraft.block.custom.RCRotatedBlock;
import net.minecraft.world.effect.MobEffect;
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
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RebirthCraft.MOD_ID);
    /* ======= BLOCKS ======= */
    public static final RegistryObject<Block> PLATINUM_ORE = BLOCKS.register("platinum_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_PLATINUM_ORE = BLOCKS.register("deepslate_platinum_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(8f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BUC_LOG = BLOCKS.register("buc_log",
            () -> new RCRotatedBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> BUC_LEAVES = BLOCKS.register("buc_leaves",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> DEADLY_ROSE = BLOCKS.register("deadly_rose",
            () -> new FlowerBlock(MobEffects.DARKNESS, 10, BlockBehaviour.Properties.copy(Blocks.WITHER_ROSE)));

    /* ======= REGISTER ======= */
    public static void register(IEventBus eventBus) { BLOCKS.register(eventBus); }
}