package com.pherment.RebirthCraft.world;

import com.pherment.RebirthCraft.RebirthCraft;
import com.pherment.RebirthCraft.world.gen.RCFlowerGeneration;
import com.pherment.RebirthCraft.world.gen.RCOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = RebirthCraft.Mod_Id)
public class RCWorldEvent {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        RCOreGeneration.generateOres(event);
        RCFlowerGeneration.generateFlowers(event);
    }
}
