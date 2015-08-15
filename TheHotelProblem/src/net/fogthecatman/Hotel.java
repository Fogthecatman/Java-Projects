package net.fogthecatman;

/*
 * 
 * The Hotel Object is created in Driver.java
 * 
 * This object keeps track of floors and sets
 * amount of rooms on each floor located in the 
 * method getRoomsByFloor().
 * 
 * 
 */
import java.util.Scanner;

public class Hotel {

	private int numFloors;
	private Floor[] hotelFloors;
	
	public Hotel(int setFloors)
	{
		numFloors = setFloors;
		hotelFloors = new Floor[numFloors];
		getRoomsByFloor();
	}
	
	public Hotel()
	{
		/*Default Constructor*/
		numFloors = 5;
		hotelFloors = new Floor[numFloors];
		getRoomsByFloor();
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
	
	public void setFloors(int numFloors)
	{
		this.numFloors = numFloors;	
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
	
	public void getRoomsByFloor()
	{
		int numRooms;
		Scanner keyboard = new Scanner(System.in);
		/*loop through each floor and assign it a specific amount of rooms*/
		for(int i = 0; i < numFloors; i++)
		{
			System.out.println("\nInput the number of rooms on Floor-"+ (i + 1) + ": ");
			numRooms = keyboard.nextInt();
			Floor newFloor = new Floor(numRooms);
			hotelFloors[i] = newFloor;
			System.out.print(newFloor);	
		}
	}
}
