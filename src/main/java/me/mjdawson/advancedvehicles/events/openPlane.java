package me.mjdawson.advancedvehicles.events;
import org.bukkit.Bukkit;
import org.bukkit.GameRule;
import org.bukkit.World;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import java.util.UUID;

public class openPlane implements Listener {

    @EventHandler
    public void onEntityClick(PlayerInteractAtEntityEvent event) {
            if(event.getRightClicked() instanceof ArmorStand){
                Entity entity = event.getRightClicked();
                if (openPlane.checkEquals(event.getRightClicked().getUniqueId(), UUID.fromString("1b3961a0-1b39-8e09-1543-5abb1ffdefc7"))) {
                    World world = (World) Bukkit.getWorld("world");
                    World tempWorld = Bukkit.getWorld("world");
                    boolean gameRuleSEND_COMMAND_FEEDBACK = tempWorld.getGameRuleValue(GameRule.SEND_COMMAND_FEEDBACK);
                    boolean gameRuleLOG_ADMIN_COMMANDS = tempWorld.getGameRuleValue(GameRule.LOG_ADMIN_COMMANDS);
                    tempWorld.setGameRule(GameRule.SEND_COMMAND_FEEDBACK, false);
                    tempWorld.setGameRule(GameRule.LOG_ADMIN_COMMANDS, false);
                    event.getPlayer().sendMessage("§bEntered Plane");
                    Bukkit.dispatchCommand(event.getPlayer(), "execute at @e[tag=plane] run tp " + event.getPlayer().getDisplayName() + " ~ ~ ~3");
                    Bukkit.dispatchCommand(event.getPlayer(), "execute at " + event.getPlayer().getDisplayName() + " run tag @s add InPlane");
                    tempWorld.setGameRule(GameRule.SEND_COMMAND_FEEDBACK, gameRuleSEND_COMMAND_FEEDBACK);
                    tempWorld.setGameRule(GameRule.LOG_ADMIN_COMMANDS, gameRuleLOG_ADMIN_COMMANDS);
                }
                if (openPlane.checkEquals(event.getRightClicked().getUniqueId(), UUID.fromString("1aa0cb20-1b39-8e09-1543-5abb1ffdefc7"))) {
                    World world = (World) Bukkit.getWorld("world");
                    World tempWorld = Bukkit.getWorld("world");
                    boolean gameRuleSEND_COMMAND_FEEDBACK = tempWorld.getGameRuleValue(GameRule.SEND_COMMAND_FEEDBACK);
                    boolean gameRuleLOG_ADMIN_COMMANDS = tempWorld.getGameRuleValue(GameRule.LOG_ADMIN_COMMANDS);
                    tempWorld.setGameRule(GameRule.SEND_COMMAND_FEEDBACK, false);
                    tempWorld.setGameRule(GameRule.LOG_ADMIN_COMMANDS, false);
                    event.getPlayer().sendMessage("§bEntered Plane");
                    Bukkit.dispatchCommand(event.getPlayer(), "execute at @e[tag=plane] run tp " + event.getPlayer().getDisplayName() + " ~ ~ ~3");
                    Bukkit.dispatchCommand(event.getPlayer(), "execute at " + event.getPlayer().getDisplayName() + " run tag @s add InPlane");
                    tempWorld.setGameRule(GameRule.SEND_COMMAND_FEEDBACK, gameRuleSEND_COMMAND_FEEDBACK);
                    tempWorld.setGameRule(GameRule.LOG_ADMIN_COMMANDS, gameRuleLOG_ADMIN_COMMANDS);
                }
            }
        }
    private Object entity() {
        return true;
    }

    public static boolean checkEquals(Object o1, Object o2) {
        if (o1 == null || o2 == null) {
            return false;
        }
        return o1 instanceof Number && o2 instanceof Number
                ? ((Number) o1).doubleValue() == ((Number) o2).doubleValue()
                : o1.equals(o2);
    }
}