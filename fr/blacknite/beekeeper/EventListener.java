package fr.blacknite.beekeeper;

import org.bukkit.Material;
import org.bukkit.entity.Bee;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

public class EventListener implements Listener {
	
	@EventHandler
	public void onPlayerInteract(EntityDamageByEntityEvent event) {
		if(event.getEntity() instanceof Player) {
			if(event.getDamager() instanceof Bee) {
				Player player = (Player) event.getEntity();
				ItemStack helmet = player.getInventory().getHelmet();
				ItemStack chestplate = player.getInventory().getChestplate();
				ItemStack leggings = player.getInventory().getLeggings();
				ItemStack boots = player.getInventory().getBoots();
				if(helmet != null && helmet.getType() == Material.CHAINMAIL_HELMET && chestplate.getType() == Material.CHAINMAIL_CHESTPLATE && leggings.getType() == Material.CHAINMAIL_LEGGINGS && boots.getType() == Material.CHAINMAIL_BOOTS) {
					event.setCancelled(true);
				}
			}
		}		
	}
}
