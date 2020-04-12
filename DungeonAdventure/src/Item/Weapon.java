package Item;

public class Weapon extends Item{
	
	int damage;
	
	public Weapon() {
		super();
		damage = 0;
	}
	
	public Weapon(String name, String description, int item_id, int damage) {
		super(name,description,item_id);
		this.damage = damage;
	}

	public int getDamage() {
		return damage;
	}

}
