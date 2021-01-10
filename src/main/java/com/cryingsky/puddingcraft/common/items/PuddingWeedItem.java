package com.cryingsky.puddingcraft.common.items;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;

public class PuddingWeedItem extends Item {
    public PuddingWeedItem() {
        super(OurItems.itemProperties().food(PUDDING));
    }

    // avery is a gay
    private static final Food PUDDING = new Food.Builder().hunger(8).saturation(0.8F).hunger(3).effect(new EffectInstance(Effect.get(2)), 1).build();
}
