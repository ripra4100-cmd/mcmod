package com.soulboundlegacy;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafxmod.FXModLauncher;

@Mod("soulboundlegacy")
public class SoulBoundLegacy {
    public static final String MOD_ID = "soulboundlegacy";
    
    public SoulBoundLegacy(FXModLauncher modEventBus) {
        IEventBus modEventBus = modEventBus.getModEventBus();
        modEventBus.addListener(this::commonSetup);
    }
    
    private void commonSetup(final FMLCommonSetupEvent event) {
        // Inicijalizacija moda
    }
}