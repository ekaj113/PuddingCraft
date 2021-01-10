package com.cryingsky.puddingcraft.common.items;

import com.cryingsky.puddingcraft.PuddingCraft;
import com.cryingsky.puddingcraft.common.blocks.OurBlocks;
import com.cryingsky.puddingcraft.common.util.Reference;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class OurItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MODID);

    // Items
    public static final RegistryObject<Item> PUDDING_ITEM = ITEMS.register("pudding_item", PuddingItem::new);
    public static final RegistryObject<Item> PUDDING_EDIBLE_ITEM = ITEMS.register("pudding_edible_item", PuddingItem::new);

    // Blocks
    public static final RegistryObject<Item> CRAFTING_BLOCK = ITEMS.register("crafting_block", () -> new BlockItem(OurBlocks.CRAFTING_BLOCK.get(), itemProperties()));

    // Properties used by PuddingCraft
    public static Item.Properties itemProperties() {
        return new Item.Properties().group(PuddingCraft.creativeTab);
    }
}
