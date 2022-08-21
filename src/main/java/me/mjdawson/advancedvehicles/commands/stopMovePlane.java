package me.mjdawson.advancedvehicles.commands;

import me.mjdawson.advancedvehicles.AdvancedVehicles;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import static  me.mjdawson.advancedvehicles.commands.moveplane.planemoving;

public class stopMovePlane implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (planemoving == "false") {
            sender.sendMessage("§bThe Plane Is Not Moving");
        } else {
            planemoving = "false";
            sender.sendMessage("§bPlane Stopped");
            Player player =  (Player) sender;
            Villager mob = (Villager)player.getWorld().spawn(player.getLocation(), Villager.class);
            mob.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION,2147483647, 50));
            AdvancedVehicles.scheduleSyncDelayedTask(new Runnable(){
                public void run(){
                    planemoving = "true";
                }
            }, 4);
        }
        return true;
    }
}
