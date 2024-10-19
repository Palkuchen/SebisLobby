package de.palkuchen.kuchencraft.sebislobby.protection;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Arrays;
import java.util.List;

public class ProtectionEvents implements Listener {

    private static final List<Material> BLOCKED_INTERACT =
            Arrays.asList(Material.CHEST, Material.TRAPPED_CHEST);

    @EventHandler
    public void onFoodLevelChange(FoodLevelChangeEvent event) {
        event.setFoodLevel(20);
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        event.setCancelled(true);
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        event.setCancelled(true);
    }

    @EventHandler
    public void onDamage(EntityDamageEvent event) {
        event.setCancelled(true);
    }

    @EventHandler
    public void onInteractWithBlock(PlayerInteractEvent event) {
        if (event.getClickedBlock() == null) {return;}
        event.setCancelled(BLOCKED_INTERACT.contains(event.getClickedBlock().getType()));
    }
}
