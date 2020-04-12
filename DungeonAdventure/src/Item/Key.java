package Item;

public class Key extends Item{
	
	int room_id;
	int door_id;
	
	public Key() {
		super();
		room_id = 0;
		door_id = 0;
	}
	
	public Key(String name, String description, int item_id, int room_id, int door_id) {
		super(name,description,item_id);
		this.room_id = room_id;
		this.door_id = door_id;
	}

	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public int getDoor_id() {
		return door_id;
	}

	public void setDoor_id(int door_id) {
		this.door_id = door_id;
	}
	
}
