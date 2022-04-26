package com.pherment.RebirthCraft;

import com.pherment.RebirthCraft.Items.RCItems;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class RCCreativeTab {
    public static final CreativeModeTab RebirthCraft_Tab = new CreativeModeTab("RebirthCraft") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RCItems.PLATINUM_INGOT.get());
        }
    };
}
