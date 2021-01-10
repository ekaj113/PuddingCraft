package com.cryingsky.puddingcraft.common.blocks;

import com.cryingsky.puddingcraft.common.util.Reference;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class OurBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MODID);

    public static final RegistryObject<Block> CRAFTING_BLOCK = BLOCKS.register("crafting_block", CraftingBlock::new);
}
