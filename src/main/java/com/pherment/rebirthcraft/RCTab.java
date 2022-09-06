package com.pherment.rebirthcraft;

import com.pherment.rebirthcraft.item.RCItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class RCTab {
    public static final CreativeModeTab RCTab = new CreativeModeTab("rebirthcraft_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RCItems.PLATINUM_INGOT.get());
        }
    };
}
