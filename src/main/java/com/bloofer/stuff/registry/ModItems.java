package com.bloofer.stuff.registry;

import com.bloofer.stuff.testmod;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //items

    public static final Item NORMAL_PILLS = new Item(new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).alwaysEdible()
                    .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 60, 0), 0.2f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 80, 0), 0.2f)
                    .build())
    );

    //block items

    public static final BlockItem STONY_DIRT = new BlockItem(ModBlocks.STONY_DIRT, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(testmod.MOD_ID, "normal_pills"), NORMAL_PILLS);
        Registry.register(Registry.ITEM, new Identifier(testmod.MOD_ID, "stony_dirt"), STONY_DIRT);
    }

}
