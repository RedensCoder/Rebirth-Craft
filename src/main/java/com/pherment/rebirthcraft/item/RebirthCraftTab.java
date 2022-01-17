package com.pherment.rebirthcraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class RebirthCraftTab {
    public static final CreativeModeTab REBIRTHCRAFT_TAB = new CreativeModeTab("rebirthcraft_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.Platinum_Ingot.get());
        }
    };
}
