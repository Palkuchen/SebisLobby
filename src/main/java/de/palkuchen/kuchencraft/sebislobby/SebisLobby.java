package de.palkuchen.kuchencraft.sebislobby;

import de.palkuchen.kuchencraft.sebislobby.protection.ProtectionEvents;
import de.palkuchen.kuchencraft.sebislobby.user.ConnectionEvents;
import de.palkuchen.kuchencraft.sebislobby.user.PlayerManager;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public final class SebisLobby extends JavaPlugin {

    private final PlayerManager playerManager = new PlayerManager();

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new ProtectionEvents(), this);
        getServer().getPluginManager().registerEvents(new ConnectionEvents(playerManager), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
