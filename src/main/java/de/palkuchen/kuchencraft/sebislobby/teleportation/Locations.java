package de.palkuchen.kuchencraft.sebislobby.teleportation;

import org.bukkit.Bukkit;
import org.bukkit.Location;

public enum Locations {
    SPAWN(new Location(Bukkit.getWorld("world"), -1500, 31, 888, 90, 0));

    private final Location location;

    Locations(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }
}
