package com.pherment.rebirthcraft;

import com.mojang.logging.LogUtils;
import com.pherment.rebirthcraft.block.RCBlocks;
import com.pherment.rebirthcraft.item.RCItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(RebirthCraft.MOD_ID)
public class RebirthCraft
{
    public static final String MOD_ID = "rebirthcraft";

    private static final Logger LOGGER = LogUtils.getLogger();

    public RebirthCraft()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        RCItems.register(modEventBus);
        RCBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            ItemBlockRenderTypes.setRenderLayer(RCBlocks.BUC_LEAVES.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(RCBlocks.DEADLY_ROSE.get(), RenderType.cutout());
        }
    }
}
