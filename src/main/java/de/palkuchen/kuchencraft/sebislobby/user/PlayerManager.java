package de.palkuchen.kuchencraft.sebislobby.user;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PlayerManager {

    private final Map<UUID, CustomPlayer> customPlayerMap = new HashMap<>();

    public CustomPlayer getPlayer(Player player) {
        UUID uuid = player.getUniqueId();
        return customPlayerMap.computeIfAbsent(uuid, this::loadPlayer);
    }

    private CustomPlayer loadPlayer(UUID uuid) {
        Bukkit.getLogger().info("lol");
        return new CustomPlayer();
    }

    public void removePlayer(Player player) {
        customPlayerMap.remove(player.getUniqueId());
    }
}
