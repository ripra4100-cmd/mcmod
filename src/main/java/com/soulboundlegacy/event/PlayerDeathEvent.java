package com.soulboundlegacy.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.world.entity.player.Player;

@Mod.EventBusSubscriber(modid = "soulboundlegacy", bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.DEDICATED_SERVER)
public class PlayerDeathEvent {
    
    @SubscribeEvent
    public static void onPlayerDeath(net.minecraftforge.event.entity.living.LivingDeathEvent event) {
        if (event.getEntity() instanceof Player player) {
            // Provjeri da li je player ubijen od strane drugog igrača
            if (event.getSource().getEntity() instanceof Player attacker) {
                // Primijeni Fallen Soul status
                // Dodaj Legacy Points klanu
            }
        }
    }
}