package Map;

import Inventory.*;
import Item.*;

public class Room {
	
	int roomId, roomNorth, roomEast, roomSouth, roomWest, roomUp, roomDown;
	String roomName, roomDescription, visitedDescription;
	boolean lockedRoomNorth, lockedRoomEast, lockedRoomSouth, lockedRoomWest, lockedRoomUp, lockedRoomDown, visited;
	Inventory roomInventory;
	
	public Room(int roomId, String roomName, String roomDescription, String visitedDescription, Inventory roomInventory, 
				int roomNorth, int roomEast, int roomSouth, int roomWest, int roomUp, int roomDown, boolean lockedRoomNorth, 
				boolean lockedRoomEast, boolean lockedRoomSouth, boolean lockedRoomWest) {
		this.roomId = roomId;
		this.roomName = roomName;
		this.roomDescription = roomDescription;
		this.visitedDescription = visitedDescription;
		this.roomInventory = roomInventory;
		this.roomNorth = roomNorth;
		this.roomEast = roomEast;
		this.roomSouth = roomSouth;
		this.roomWest = roomWest;
		this.roomUp = roomUp;
		this.roomDown = roomDown;
		this.lockedRoomNorth = lockedRoomNorth;
		this.lockedRoomEast = lockedRoomEast;
		this.lockedRoomSouth = lockedRoomSouth;
		this.lockedRoomWest = lockedRoomWest;
		this.visited = false;
	}

	public int getRoomId() {
		return roomId;
	}

	public int getRoomNorth() {
		return roomNorth;
	}

	public int getRoomEast() {
		return roomEast;
	}

	public int getRoomSouth() {
		return roomSouth;
	}

	public int getRoomWest() {
		return roomWest;
	}

	public int getRoomUp() {
		return roomUp;
	}

	public int getRoomDown() {
		return roomDown;
	}

	public String getRoomName() {
		return roomName;
	}

	public String getRoomDescription() {
		return roomDescription;
	}

	public String getVisitedDescription() {
		return visitedDescription;
	}

	public boolean isLockedRoomNorth() {
		return lockedRoomNorth;
	}

	public boolean isLockedRoomEast() {
		return lockedRoomEast;
	}

	public boolean isLockedRoomSouth() {
		return lockedRoomSouth;
	}

	public boolean isLockedRoomWest() {
		return lockedRoomWest;
	}

	public boolean isLockedRoomUp() {
		return lockedRoomUp;
	}

	public boolean isLockedRoomDown() {
		return lockedRoomDown;
	}

	public boolean isVisited() {
		return visited;
	}

	public Inventory getRoomInventory() {
		return roomInventory;
	}
	
	public void updateDescription() {
		this.roomDescription = this.visitedDescription;
	}
	
	public void unlockNorthRoom() {
		this.lockedRoomNorth = false;
	}
	
	public void unlockEastRoom() {
		this.lockedRoomEast = false;
	}
	
	public void unlockSouthRoom() {
		this.lockedRoomSouth = false;
	}
	
	public void unlockWestRoom() {
		this.lockedRoomWest = false;
	}
	
	public void hasBeenVisited() {
		this.visited = true;
		this.updateDescription();
	}

}
