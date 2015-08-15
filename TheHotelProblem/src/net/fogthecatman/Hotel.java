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

	public int numFloors;
	public Floor[] hotelFloors;
	
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
	
	//Gets and Sets
	public int getFloors()
	{
		return numFloors;
	}
	
	public void setFloors(int numFloors)
	{
		this.numFloors = numFloors;	
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
