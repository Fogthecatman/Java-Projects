package net.fogthecatman;

/*
 * The Room Object keeps track of whether
 * it is clean or not.
 */

public class Room {
	
	private boolean isClean = true;
	
	public Room()
	{
		/*Default Constructor*/
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
