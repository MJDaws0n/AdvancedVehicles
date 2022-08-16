package me.mjdawson.advancedvehicles;

import me.mjdawson.advancedvehicles.commands.moveplane;
import me.mjdawson.advancedvehicles.commands.plane;
import me.mjdawson.advancedvehicles.commands.removePlane;
import me.mjdawson.advancedvehicles.commands.stopMovePlane;
import me.mjdawson.advancedvehicles.events.openPlane;
import me.mjdawson.advancedvehicles.events.tabComleteDisabled;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import static  me.mjdawson.advancedvehicles.commands.moveplane.planemoving;

public final class AdvancedVehicles extends JavaPlugin {

    public static AdvancedVehicles instance;

    public void onLoad(){
        instance = this;
    }
    public static int scheduleSyncDelayedTask(Runnable runnable, int delay){
        return Bukkit.getScheduler().scheduleSyncDelayedTask(instance, runnable, delay);
    }

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§8[§aAV§8] §bAdvancedVehicles Plugin Loaded");
        Bukkit.getConsoleSender().sendMessage("§8[§aAV§8] §bPlugin by MJDawson");
        getCommand("plane").setExecutor(new plane());
        getCommand("moveplane").setExecutor(new moveplane());
        getCommand("stopmovingplane").setExecutor(new stopMovePlane());
        getCommand("removeplane").setExecutor(new removePlane());
        new tabComleteDisabled(this);
        getServer().getPluginManager().registerEvents(new openPlane(), this);
        planemoving = "true";
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§8[§aAV§8] §bAdvancedVehicles Plugin closed");
        Bukkit.getConsoleSender().sendMessage("§8[§aAV§8] §bSee Ya :");
        Bukkit.getConsoleSender().sendMessage("§8[§aAV§8] §bPlugin by MJDawson https://youtube.com/mjdawson");
    }

}
