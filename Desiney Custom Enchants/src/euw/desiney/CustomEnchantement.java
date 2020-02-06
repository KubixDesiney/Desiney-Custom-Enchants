package euw.desiney;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

public  class CustomEnchantement extends Enchantment implements Listener {
	public CustomEnchantement(int id) {
		super(id);
	}
	@EventHandler
	public void onHit(EntityDamageByEntityEvent event) {
		if(event.getDamager() instanceof Player) {
			Player player = (Player) event.getDamager();
			
			ItemStack mainhand = player.getInventory().getItemInHand();
			
			if(mainhand.containsEnchantment(this)) {
				player.getWorld().createExplosion(event.getEntity().getLocation(), 1, false);
			}
		}
				
	}
	
	@Override
	public int getId() {
		return 101;
	}

	public boolean canEnchantItem(ItemStack arg0) {
		return true;
	}

	public boolean conflictsWith(Enchantment arg0) {
		return false;
	}

	public EnchantmentTarget getItemTarget() {
		return null;
	}

	public int getMaxLevel() {
		return 69;
	}

	public String getName() {
		return "God of War";
	}

	public int getStartLevel() {
		return 0;
	}

	}


