package com.bloofer.stuff.registry;

import com.bloofer.stuff.testmod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block STONY_DIRT = new Block(FabricBlockSettings
            .of(Material.ORGANIC_PRODUCT)
            .breakByHand(true)
            .strength(0.6f, 3f)
            .sounds(BlockSoundGroup.ROOTED_DIRT));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(testmod.MOD_ID, "stony_dirt"), STONY_DIRT);
    }
}
