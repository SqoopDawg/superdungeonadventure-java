//INVENTORY CLASS
//Inventory - something that can store items

package Inventory;

import java.util.ArrayList;
import java.util.List;
import Item.*;

public class Inventory {
	
	List<Item> inventory;
	
	public Inventory() {
		this.inventory = new ArrayList<Item>();
	}

	public List<Item> getInventory() {
		return inventory;
	}
	
	public void showInventory() {
		int inventorySize = this.inventory.size();
		for (int item = 0; item < inventorySize; item++) {
			System.out.println("|\t" + (String) this.inventory.get(item).getName());
		}
	}
	
	public void addItem(Item item) {
		this.inventory.add(item);
	}
	
	public void dropItem(Item item) {
		int inventorySize = this.inventory.size();
		for (int drop = 0; drop < inventorySize; drop++) {
			if(this.inventory.get(drop).getItemId() == item.getItemId()) {
				this.inventory.remove(drop);
				break;
			}
		}
	}
	
	public boolean isEmpty() {
		if(this.inventory.isEmpty()) {
			return true;
		}
		return false;
	}
	
	public static void main(String args[]) {
		
		Inventory inv = new Inventory();
		HealthPotion healthp = new HealthPotion();
		inv.addItem(healthp);
		inv.addItem(healthp);
		inv.addItem(healthp);
		inv.showInventory();
		inv.dropItem(healthp);
		inv.showInventory();
		System.out.println(inv.isEmpty());
		
	}
	
}
