package de.palkuchen.kuchencraft.sebislobby;

import de.palkuchen.kuchencraft.sebislobby.protection.ProtectionEvents;
import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public final class SebisLobby extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new ProtectionEvents(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
