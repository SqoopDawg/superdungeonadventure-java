//ITEM CLASS
//Item - something that can be put in an inventory

package Item;

public abstract class Item {
	
	String name, description;
	int itemId;
	
	public Item() {
		name = "";
	}
	
	public Item(String name, String description, int itemId) {
		this.name = name;
		this.description = description;
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getItemId() {
		return itemId;
	}

	
}

