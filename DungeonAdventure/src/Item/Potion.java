package Item;

public class Potion extends Item{
	
	int amount_restored;
	
	public Potion() {
		super();
		amount_restored = 0;
	}
	
	public Potion(String name, String description, int item_id, int amount_restored) {
		super(name,description,item_id);
		this.amount_restored = amount_restored;
	}

	public int getAmount_restored() {
		return amount_restored;
	}

	public void setAmount_restored(int amount_restored) {
		this.amount_restored = amount_restored;
	}
	

}
