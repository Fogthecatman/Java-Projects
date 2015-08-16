package net.fogthecatman;
/*
 * This Program keeps track/sets/gets the functions of a hotel
 * You can set/get whether or no a specific room on a specific 
 * floor of the hotel is dirty or clean.
 * 
 * Uses Basic OOP to understand how to store and access objects 
 * and object arrays.
 * 
 * Created 8/15/2015
 * 
 */


import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args)
	{	
		//Objects
		Scanner keyboard = new Scanner(System.in);
		
		//Variables
		int inFloors, isDirtyNum, floorInt, roomInt;
		String input = "", floorInput = "", roomInput = "";
		boolean continueLoop = true;
		boolean isRoomClean = false;
		boolean goodInput = false;
		
		//Processing
		System.out.println("Welcome to Hotel Dirty Calculator!");
		input = getInput(keyboard, "Please input the amount of floors: ");
		
		inFloors = Integer.parseInt(input);
		
		int[] floorRooms = new int[inFloors];
		
		for (int i = 0; i < inFloors; i++)
		{
			System.out.println("\nInput the number of rooms on Floor-"+ (i + 1) + ": ");
			floorRooms[i] = keyboard.nextInt();
		}
				
		Hotel myHotel = new Hotel(floorRooms);

		/*Loop as long as I want the program running*/
		while(continueLoop)
		{
			/* Ask for the floor number until we get a valid answer. */
			while (true)
			{
				floorInput = getInput(keyboard, "\nInput What Floor to Access: ");
				floorInt = Integer.parseInt(floorInput);

				if (myHotel.hasFloor(floorInt))
				{
					break;
				}
				else
				{
					System.out.println("There is no floor " + floorInt + "!");
				}
			}

			/* Ask for the room number until we get a valid answer. */
			while (true)
			{
				roomInput = getInput(keyboard, "\nInput What Room to Access: ");
				roomInt = Integer.parseInt(roomInput);

				if (myHotel.hasRoom(floorInt, roomInt))
				{
					break;
				}
				else
				{
					System.out.println("There is no room " + roomInt + " on floor " + floorInt + "!");
				}
			}

			/*
			 * Here is a validation loop checking for a correct input
			 * user should only input a 0 or 1 at this point.
			 * 
			 */
			goodInput = false;
			while(!goodInput)
			{
				input = getInput(keyboard, "Is Room Clean or Dirty? (1: Clean, 0: Dirty): ");
				isDirtyNum = Character.getNumericValue(input.charAt(0));
				
				if(isDirtyNum == 1)
				{
					isRoomClean = true;
					goodInput = true;
				}
				else if(isDirtyNum == 0)
				{
					isRoomClean = false;
					goodInput = true;
				}
				else
				{
					System.out.println("BAD INPUT");
					goodInput = false;
				}
			}				

			myHotel.setIsClean(floorInt, roomInt, isRoomClean);
				
			String quitInput = getInput(keyboard, "Would you like to stop? (y/n): ");
			if(quitInput.equals("y"))
			{
				/*Exit the loop */
				continueLoop = false;
			}
			
			
		}
		//Closing Scanner
		keyboard.close();
		//Check hotel when done!
		System.out.println("\n=================");
		System.out.println(myHotel);
		System.out.println("\n```````````\nEND OF PROGRAM\n```````````");
		
	}
	
	public static String getInput(Scanner keyboard, String inputMsg)
	{
		String returnStmt;
		System.out.println(inputMsg);
		returnStmt = keyboard.next();
		return returnStmt;
	}

}
