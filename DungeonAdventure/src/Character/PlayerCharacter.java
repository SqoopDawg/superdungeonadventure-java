package Character;

import java.util.Dictionary;

import Item.*;

public class PlayerCharacter extends Character{

	public PlayerCharacter(String name, int health, Weapon equippedWeapon, Dictionary<String, Integer> moveset,
			boolean alive) {
		super(name, health, equippedWeapon, moveset, alive);
	}
	

	
}

