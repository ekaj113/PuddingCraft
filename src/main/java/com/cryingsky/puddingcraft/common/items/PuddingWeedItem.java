package com.cryingsky.puddingcraft.common.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class PuddingWeedItem extends Item {
    public PuddingWeedItem() {
        super(OurItems.itemProperties().food(PUDDING));
    }

    private static final Food PUDDING
            = new Food.Builder().hunger(8).saturation(0.8F)
            .effect(() -> new EffectInstance(Effects.SLOWNESS, 90, 1), 1)
            .effect(() -> new EffectInstance(Effects.HUNGER, 15, 1), 1).build();
}
