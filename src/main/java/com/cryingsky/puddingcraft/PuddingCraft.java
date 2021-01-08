package com.cryingsky.puddingcraft;

import com.cryingsky.puddingcraft.common.blocks.OurBlocks;
import com.cryingsky.puddingcraft.common.items.OurItems;
import com.cryingsky.puddingcraft.common.util.Reference;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.MODID)
public class PuddingCraft {

    public static final Logger LOG = LogManager.getLogger();

    public PuddingCraft() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        OurItems.ITEMS.register(eventBus);
        OurBlocks.BLOCKS.register(eventBus);
    }
}
