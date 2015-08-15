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
	
	public static int floorNumInc = 0;
	public int floorNum;
	public int numRooms;
	public Room[] floorRooms;
	
	public Floor(int setRooms)
	{
		floorNumInc++;
		floorNum = floorNumInc;
		numRooms = setRooms;
		floorRooms = new Room[numRooms];
		setRoomsOnFloor();
	}
	public Floor()
	{
		numRooms = 5;
	}
	
	//Gets and Sets
	public int getRooms()
	{
		return numRooms;
	}
	
	public void setRooms(int numRooms)
	{
		this.numRooms = numRooms; 
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
