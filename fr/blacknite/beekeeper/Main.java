package fr.blacknite.beekeeper;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new EventListener(), this);
		
		craft();
	}
	
	public void craft() {
		// Helmet
		
		ItemStack helmet = new ItemStack(Material.CHAINMAIL_HELMET);
		
		ItemMeta helmetmeta = helmet.getItemMeta();

		helmetmeta.setDisplayName(ChatColor.GRAY + "Casque " + ChatColor.YELLOW + "D'apiculteur");

		helmet.setItemMeta(helmetmeta);
		
		NamespacedKey helmetkey = new NamespacedKey(this, "casque_apiculteur");

			ShapedRecipe helmetrecipe = new ShapedRecipe(helmetkey, helmet);

			helmetrecipe.shape("PPP", "P P");

			helmetrecipe.setIngredient('P', Material.PHANTOM_MEMBRANE);

			Bukkit.addRecipe(helmetrecipe);
	        
		// Chestplate
			
		ItemStack chestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
			
		ItemMeta chestplatemeta = chestplate.getItemMeta();

		chestplatemeta.setDisplayName(ChatColor.GRAY + "Plastron " + ChatColor.YELLOW + "D'apiculteur");

		chestplate.setItemMeta(helmetmeta);
			
		NamespacedKey chestplatekey = new NamespacedKey(this, "plastron_apiculteur");

			ShapedRecipe chestplaterecipe = new ShapedRecipe(chestplatekey, chestplate);

			chestplaterecipe.shape("P P", "PPP", "PPP");

			chestplaterecipe.setIngredient('P', Material.PHANTOM_MEMBRANE);

			Bukkit.addRecipe(chestplaterecipe);
			
		
		// Leggings
			
		ItemStack leggings = new ItemStack(Material.CHAINMAIL_LEGGINGS);
				
		ItemMeta leggingsmeta = leggings.getItemMeta();

		leggingsmeta.setDisplayName(ChatColor.GRAY + "Jambières " + ChatColor.YELLOW + "D'apiculteur");

		leggings.setItemMeta(leggingsmeta);
				
		NamespacedKey leggingskey = new NamespacedKey(this, "jambiere_apiculteur");

			ShapedRecipe leggingsrecipe = new ShapedRecipe(leggingskey, leggings);

			leggingsrecipe.shape("PPP", "P P", "P P");

			leggingsrecipe.setIngredient('P', Material.PHANTOM_MEMBRANE);

			Bukkit.addRecipe(leggingsrecipe);
			
		// Boots
			
		ItemStack boots = new ItemStack(Material.CHAINMAIL_BOOTS);
					
		ItemMeta bootsmeta = boots.getItemMeta();

		bootsmeta.setDisplayName(ChatColor.GRAY + "Bottes " + ChatColor.YELLOW + "D'apiculteur");

		boots.setItemMeta(bootsmeta);
					
		NamespacedKey bootskey = new NamespacedKey(this, "botte_apiculteur");

			ShapedRecipe bootsrecipe = new ShapedRecipe(bootskey, boots);

			bootsrecipe.shape("   ", "P P", "P P");

			bootsrecipe.setIngredient('P', Material.PHANTOM_MEMBRANE);

			Bukkit.addRecipe(bootsrecipe);
	}
	
	@Override
	public void onDisable() {	
	}
}