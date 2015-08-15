package net.fogthecatman;

/*
 * The Room Object keeps track of whether
 * it is clean or not. Users can access this object
 * from the @floorRooms Array in the Floor Object.
 * 
 */

public class Room {
	
	private boolean isClean = true;
	
	public Room()
	{
		/*Default Constructor*/
	}
	public Room(boolean isClean)
	{
		this.isClean = isClean;
	}
	
	//Gets and Sets
	public boolean getIsClean()
	{
		return isClean;
	}
	
	public void setIsClean(boolean setClean)
	{
		isClean = setClean;	
	}
	
	public String toString()
	{
		return "\t\tIs Clean?: " + isClean;
	}

}
