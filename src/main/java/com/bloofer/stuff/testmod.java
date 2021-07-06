package com.bloofer.stuff;

import com.bloofer.stuff.registry.ModBlocks;
import com.bloofer.stuff.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class testmod implements ModInitializer {

    public static final String MOD_ID = "bfstuffs";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
