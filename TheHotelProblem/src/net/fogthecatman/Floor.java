package net.fogthecatman;

/*
 * The Floor Object keeps track of it's specific 
 * amount of rooms. Each Floor can have a different
 * amount of rooms. 
 * 
 * The @flootNumInc variable keeps track of the created
 * floors and sets the new number to @floorNum.
 * 
 * 
 */

public class Floor {

	private final int floorNum;
	private final int numRooms;
	private final Room[] floorRooms;

	public Floor(int floorNum, int setRooms)
	{
		this.floorNum = floorNum;
		numRooms = setRooms;
		floorRooms = new Room[numRooms];
		setRoomsOnFloor();
	}

	/**
	 * Checks to see if this floor has a room with the given number.
	 * 
	 * @param roomNum The room number to test
	 * @return true if this floor has a room with this number, false otherwise
	 */
	public boolean hasRoom(int roomNum)
	{
		return roomNum > 0 && roomNum <= floorRooms.length;
	}

	/**
	 * Sets the clean state of the Room with the given room number.
	 *  
	 * @param room The room number
	 * @param isClean The clean status of the room
	 */
	public void setIsClean(int room, boolean isClean)
	{
		if (room > 0 && room < numRooms)
		{
			floorRooms[room - 1].setIsClean(isClean);
		}
		else
		{
			System.out.println("The is no room " + room + " on this floor!");
		}
	}

	/*
	 * This toString method is called whenever the object is
	 * referenced. The for loop in this method adds the toString
	 * information to this floor object for easy access.
	 * 
	 */
	public String toString()
	{
		String object = "";

		object += "\nThis Floor Object-" + floorNum + ":\n"
				+ "Number of Rooms: " + numRooms;

		for(int j = 0; j < floorRooms.length; j++)
		{
			object += 	 "\n\tRoom Number-" + (j + 1) + "\n"
					+ floorRooms[j].toString();
		}

		object += "\n";

		return object;

	}

	public void setRoomsOnFloor()
	{
		for(int i = 0; i < numRooms; i++)
		{
			Room newRoom = new Room();
			floorRooms[i] = newRoom;		//Adds rooms to floor array
		}
	}

}
