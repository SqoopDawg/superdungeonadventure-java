package Map;

import java.util.List;

public class Map {
	
	List<Room> roomArray;
	
	public Map(List<Room> roomArray) {
		
		this.roomArray = roomArray;
	}

	public List<Room> getRoomArray() {
		return roomArray;
	}

}
