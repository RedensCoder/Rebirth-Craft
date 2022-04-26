package com.pherment.RebirthCraft;

import com.mojang.logging.LogUtils;
import com.pherment.RebirthCraft.Items.RCItems;
import com.pherment.RebirthCraft.blocks.RCBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RebirthCraft.Mod_Id)

public class RebirthCraft {
    public static final String Mod_Id = "rebirthcraft";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public RebirthCraft() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        RCItems.itemRegister(eventBus);
        RCBlocks.blockRegister(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    public void clientSetup(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(RCBlocks.DEADLY_ROSE.get(), RenderType.cutout());
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO");
        LOGGER.info("DIRT BLOCK -> {}", Blocks.DIRT.getRegistryName());
    }
}
