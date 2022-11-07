package net.theredgenesect.redsinternet.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab THE_INTERNET_TAB = new CreativeModeTab("theinternettab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.COMPUTER.get());
        }
    };
}
