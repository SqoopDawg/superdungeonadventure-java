//CHARACTER CLASS
//Character - an interactive entity

package Character;

import java.util.Dictionary;

import Item.*;

public abstract class Character {
	
	String name;
	int health;
	Weapon equippedWeapon;
	Dictionary<String,Integer> moveset;
	boolean alive;
	
	public Character(String name, int health, Weapon equippedWeapon, Dictionary<String,Integer> moveset, boolean alive) {
		this.name = name;
		this.health = health;
		this.equippedWeapon = equippedWeapon;
		this.moveset = moveset;
		this.alive = true;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}

	public Weapon getEquippedWeapon() {
		return equippedWeapon;
	}

	public Dictionary<String, Integer> getMoveset() {
		return moveset;
	}

	public boolean isAlive() {
		return alive;
	}
	
	public void isDead() {
		this.alive = false;
	}

}
