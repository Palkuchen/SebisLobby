package de.palkuchen.kuchencraft.sebislobby.user;

import de.palkuchen.kuchencraft.sebislobby.teleportation.Locations;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class ConnectionEvents implements Listener {

    private final PlayerManager playerManager;

    public ConnectionEvents(PlayerManager playerManager) {
        this.playerManager = playerManager;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        CustomPlayer customPlayer = playerManager.getPlayer(player);
        if (!customPlayer.hasCustomSpawnLocation())
            player.teleport(Locations.SPAWN.getLocation());

    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        playerManager.removePlayer(event.getPlayer());
    }
}
