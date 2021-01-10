package com.cryingsky.puddingcraft.common.items;

import com.cryingsky.puddingcraft.common.util.Reference;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class WeedPuddingItem extends Item {

    // both in seconds
    private static final int SLOWNESS_TIME = 90;
    private static final int HUNGER_TIME = 15;

    public WeedPuddingItem() {
        super(OurItems.itemProperties().food(PUDDING));
    }

    private static final Food PUDDING
            = new Food.Builder().hunger(8).saturation(0.8F).setAlwaysEdible()
            .effect(() -> new EffectInstance(Effects.SLOWNESS, SLOWNESS_TIME * Reference.TICKS_PER_SECOND, 0), 1)
            .effect(() -> new EffectInstance(Effects.HUNGER, HUNGER_TIME * Reference.TICKS_PER_SECOND, 0), 1).build();
}
