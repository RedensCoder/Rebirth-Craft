package com.pherment.rebirthcraft.gen;

import com.pherment.rebirthcraft.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {
    Platinum_Ore(Lazy.of(ModBlocks.Platinum_Ore), 8, 55, 15, 3);

    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int maxHeight;
    private final int minHeight;
    private final int veinsPerChunk;

    OreType(Lazy<Block> block, int maxVeinSize, int maxHeight, int minHeight, int veinsPerChunk) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.maxHeight = maxHeight;
        this.minHeight = minHeight;
        this.veinsPerChunk = veinsPerChunk;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getVeinsPerChunk() {
        return veinsPerChunk;
    }
    public static OreType get(Block block) {
        for (OreType ore : values()) {
            if (block == ore.block) {
                return ore;
            }
        }
        return null;
    }
}
