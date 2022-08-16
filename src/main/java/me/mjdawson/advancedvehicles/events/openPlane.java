package me.mjdawson.advancedvehicles.events;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.EquipmentSlot;

public class openPlane implements Listener {

    @EventHandler
    public void onEntityClick(PlayerInteractEntityEvent event) {
        if (!(event.getHand() == EquipmentSlot.HAND)) return;
        Player player = event.getPlayer();
        if (event.getRightClicked() instanceof Villager) {
            player.sendMessage("Works with a villager!");
        }
        if(event.getRightClicked() instanceof ArmorStand) {
            player.sendMessage("Does not work with an armor stand!");
        }
    }

}
