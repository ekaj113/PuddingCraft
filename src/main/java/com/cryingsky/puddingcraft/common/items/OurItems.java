package com.cryingsky.puddingcraft.common.items;

import com.cryingsky.puddingcraft.common.util.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class OurItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MODID);

    // Items
    public static final RegistryObject<Item> PUDDING = ITEMS.register("pudding_item", PuddingItem::new);
}
