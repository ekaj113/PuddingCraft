package com.cryingsky.puddingcraft.common.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CraftingBlock extends Block {
    public CraftingBlock() {
        super(AbstractBlock.Properties.create(Material.WOOD));
    }

    // TODO: add gui and crafting capabilities
}
