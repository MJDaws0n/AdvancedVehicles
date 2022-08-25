package me.mjdawson.advancedvehicles.commands;

import me.mjdawson.advancedvehicles.AdvancedVehicles;
import org.bukkit.Bukkit;
import org.bukkit.GameRule;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class moveplane implements CommandExecutor {

    public static Object planemoving;
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (!(player.hasPermission("plane.move.hidden"))) {
                if (planemoving == "false") return true;
                planemoving = "true";
                World world = (World) Bukkit.getWorld("world");
                World tempWorld = Bukkit.getWorld("world");
                boolean gameRuleSEND_COMMAND_FEEDBACK = tempWorld.getGameRuleValue(GameRule.SEND_COMMAND_FEEDBACK);
                boolean gameRuleLOG_ADMIN_COMMANDS = tempWorld.getGameRuleValue(GameRule.LOG_ADMIN_COMMANDS);
                tempWorld.setGameRule(GameRule.SEND_COMMAND_FEEDBACK, false);
                tempWorld.setGameRule(GameRule.LOG_ADMIN_COMMANDS, false);
                Bukkit.dispatchCommand(player, "execute at @e[tag=plane] run clone ~-17 ~-7 ~28 ~17 ~8 ~-3 ~-17 ~-7 ~-4 replace move");
                Bukkit.dispatchCommand(player, "execute at @e[tag=InPlane] run tp ~ ~ ~-1");
                Bukkit.dispatchCommand(player, "execute at @e[tag=plane] as @e[tag=plane] run tp ~ ~ ~-1");
                Bukkit.dispatchCommand(player, "execute at 1b3961a0-1b39-8e09-1543-5abb1ffdefc7 as 1b3961a0-1b39-8e09-1543-5abb1ffdefc7 run tp ~ ~ ~-1");
                Bukkit.dispatchCommand(player, "execute at 1aa0cb20-1b39-8e09-1543-5abb1ffdefc7 as 1aa0cb20-1b39-8e09-1543-5abb1ffdefc7 run tp ~ ~ ~-1");
                Bukkit.dispatchCommand(player, "execute at 1a0834a0-1b39-8e09-1543-5abb1ffdefc7 as 1a0834a0-1b39-8e09-1543-5abb1ffdefc7 run tp ~ ~ ~-1");
                Bukkit.dispatchCommand(player, "execute at 196f9e20-1b39-8e09-1543-5abb1ffdefc7 as 196f9e20-1b39-8e09-1543-5abb1ffdefc7 run tp ~ ~ ~-1");
                AdvancedVehicles.scheduleSyncDelayedTask(new Runnable(){
                    public void run(){
                        Bukkit.dispatchCommand(player, "moveplane");
                     }
                }, 4);
                tempWorld.setGameRule(GameRule.SEND_COMMAND_FEEDBACK, gameRuleSEND_COMMAND_FEEDBACK);
                tempWorld.setGameRule(GameRule.LOG_ADMIN_COMMANDS, gameRuleLOG_ADMIN_COMMANDS);
            } else {
                if (planemoving == "false") return true;
                planemoving = "true";
                World world = (World) Bukkit.getWorld("world");
                World tempWorld = Bukkit.getWorld("world");
                boolean gameRuleSEND_COMMAND_FEEDBACK = tempWorld.getGameRuleValue(GameRule.SEND_COMMAND_FEEDBACK);
                boolean gameRuleLOG_ADMIN_COMMANDS = tempWorld.getGameRuleValue(GameRule.LOG_ADMIN_COMMANDS);
                tempWorld.setGameRule(GameRule.SEND_COMMAND_FEEDBACK, false);
                tempWorld.setGameRule(GameRule.LOG_ADMIN_COMMANDS, false);
                Bukkit.dispatchCommand(player, "execute at @e[tag=plane] run clone ~-17 ~-7 ~28 ~17 ~8 ~-3 ~-17 ~-7 ~-4 replace move");
                Bukkit.dispatchCommand(player, "execute at @e[tag=InPlane] run tp ~ ~ ~-1");
                Bukkit.dispatchCommand(player, "execute at @e[tag=plane] as @e[tag=plane] run tp ~ ~ ~-1");
                Bukkit.dispatchCommand(player, "execute at 1b3961a0-1b39-8e09-1543-5abb1ffdefc7 as 1b3961a0-1b39-8e09-1543-5abb1ffdefc7 run tp ~ ~ ~-1");
                Bukkit.dispatchCommand(player, "execute at 1aa0cb20-1b39-8e09-1543-5abb1ffdefc7 as 1aa0cb20-1b39-8e09-1543-5abb1ffdefc7 run tp ~ ~ ~-1");
                Bukkit.dispatchCommand(player, "execute at 1a0834a0-1b39-8e09-1543-5abb1ffdefc7 as 1a0834a0-1b39-8e09-1543-5abb1ffdefc7 run tp ~ ~ ~-1");
                Bukkit.dispatchCommand(player, "execute at 196f9e20-1b39-8e09-1543-5abb1ffdefc7 as 196f9e20-1b39-8e09-1543-5abb1ffdefc7 run tp ~ ~ ~-1");
                AdvancedVehicles.scheduleSyncDelayedTask(new Runnable(){
                    public void run(){
                        Bukkit.dispatchCommand(player, "moveplane");
                    }
                }, 4);
                tempWorld.setGameRule(GameRule.SEND_COMMAND_FEEDBACK, gameRuleSEND_COMMAND_FEEDBACK);
                tempWorld.setGameRule(GameRule.LOG_ADMIN_COMMANDS, gameRuleLOG_ADMIN_COMMANDS);
            }
        } else{
            sender.sendMessage("§bHow can the console move a plane?", "§bOnly players can run this");

        }



        return true;
    }
}
