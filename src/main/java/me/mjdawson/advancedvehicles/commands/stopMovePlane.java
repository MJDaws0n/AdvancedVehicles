package me.mjdawson.advancedvehicles.commands;

import me.mjdawson.advancedvehicles.AdvancedVehicles;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import static  me.mjdawson.advancedvehicles.commands.moveplane.planemoving;

public class stopMovePlane implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (planemoving == "false") {
            sender.sendMessage("§bThe Plane Is Not Moving");
        } else {
            planemoving = "false";
            sender.sendMessage("§bPlane Stopped");
            AdvancedVehicles.scheduleSyncDelayedTask(new Runnable(){
                public void run(){
                    planemoving = "true";
                }
            }, 4);
        }
        return true;
    }
}
