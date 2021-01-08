package com.cryingsky.puddingcraft.common.items;

import com.cryingsky.puddingcraft.PuddingCraft;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class PuddingItem extends Item {
    public PuddingItem() {
        super(new Item.Properties().group(PuddingCraft.creativeTab).food(PUDDING));
    }

    private static final Food PUDDING = new Food.Builder().hunger(8).saturation(0.8F).build();
}
