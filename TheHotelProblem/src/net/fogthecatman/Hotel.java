package net.fogthecatman;

/*
 * This object keeps track of floors and sets
 * amount of rooms on each floor located in the 
 * method getRoomsByFloor().
 */
public class Hotel {

	private final int numFloors;
	private final Floor[] hotelFloors;
	
	/**
	 * Constructs a new Hotel object with the given room layout. 
	 * 
	 * The layout is defined by the length and values of the floorRooms argument.
	 * The length of the array is the number of floors to create and the value
	 * of each element is the number of rooms to create on that floor.
	 * 
	 * e.g. the array [3,2,1] would produce a Hotel with three rooms on the first
	 * floor, two rooms on the second floor, and one room on the third floor. 
	 * 
	 * @param floorRooms An array containing the number of rooms on each floor
	 */
	public Hotel(int[] floorRooms)
	{
		numFloors = floorRooms.length;
		hotelFloors = new Floor[numFloors];
		getRoomsByFloor(floorRooms);
	}
	
	public int getFloorRooms(int floor)
	{
		if (floor >= 1 && floor <= numFloors)
		{
			return hotelFloors[floor - 1].getRooms();
		}
		else
		{
			return 0;
		}
	}

	//Gets and Sets
	public int getFloors()
	{
		return numFloors;
	}

	/**
	 * Sets the clean state of the Room with the given room number
	 * on the floor with the given floor number.
	 * 
	 * @param floor The floor number of the room
	 * @param room The room number
	 * @param isClean The clean status of the room
	 */
	public void setIsClean(int floor, int room, boolean isClean)
	{
		if (floor >= 1 && floor <= numFloors)
		{
			hotelFloors[floor - 1].setIsClean(room, isClean);
			
			return;
		}
		else
		{
			System.out.println("There is no floor " + floor + " in this hotel!");
		}
	}

	public String toString()
	{
		String object = "";
		
		object += "\nThis Hotel Object\n" 
				+ "\tNumber Floors: " + numFloors;
		
		for(int j = 0; j < hotelFloors.length; j++)
		{
			object += hotelFloors[j].toString();
		}
		
		object += "\n";
		
		return object;
	}
	
	private void getRoomsByFloor(int[] floorRooms)
	{
		/*loop through each floor and assign it a specific amount of rooms*/
		for (int i = 0; i < floorRooms.length; i++)
		{
			Floor newFloor = new Floor(i + 1, floorRooms[i]);
			hotelFloors[i] = newFloor;
		}
	}
}
