package com.pherment.rebirthcraft.world;

import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.pherment.rebirthcraft.RebirthCraft;
import com.pherment.rebirthcraft.world.gen.ModOreGeneration;

@Mod.EventBusSubscriber(modid = RebirthCraft.MOD_ID)
public class WorldGenerationEvents {
    @SubscribeEvent
    public static void ModWorldGeneration(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
    }
}