package me.mjdawson.advancedvehicles.events;

import me.mjdawson.advancedvehicles.AdvancedVehicles;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandSendEvent;

import java.util.ArrayList;
import java.util.List;

public class tabComleteDisabled implements Listener {
    public tabComleteDisabled(AdvancedVehicles plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }
    @EventHandler
    public void onPlayerTab(PlayerCommandSendEvent e) {
        List<String> blockedCommands = new ArrayList<>();
        blockedCommands.add("moveplane");
        e.getCommands().removeAll(blockedCommands);
    }

}
