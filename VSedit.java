import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/* open castList
 * extract text from castList
 * 	groups will have one number
 *  the rest of the data will follow in their own indexes
 * sort
 * 	>by last name
 *  >by first name
 *  >by scene
 *  >by grade
 */

public class VSedit 
{
		public static ArrayList<String[]> addActor(ArrayList<String[]> castList)
		{
			Scanner kb = new Scanner(System.in);
			
			//yay output
			ArrayList<String[]> outputD = new ArrayList<String[]>();
			outputD = castList;
			
			//adds a new String[] to castList (first output)
			String[] actorData = new String[8];
			int arraySize = outputD.size();
			outputD.add(actorData); 
			
			//input ALL the data
			System.out.println("Actor name:");
			outputD.get(arraySize)[0]=kb.nextLine();
			System.out.println("Actor scene:");
			outputD.get(arraySize)[1]=kb.nextLine();
			System.out.println("Actor role:");
			outputD.get(arraySize)[2]=kb.nextLine();
			System.out.println("Actor grade:");
			outputD.get(arraySize)[3]=kb.nextLine();
			System.out.println("Actor height:");
			outputD.get(arraySize)[4]=kb.nextLine();
			System.out.println("Actor weight:");
			outputD.get(arraySize)[5]=kb.nextLine();
			System.out.println("Actor measurements:");
			outputD.get(arraySize)[6]=kb.nextLine();
			System.out.println("Actor notes:");
			outputD.get(arraySize)[7]=kb.nextLine();
			return outputD;
		}
		
		public static ArrayList<String[]> editActor(ArrayList<String[]> castList)
		{
			Scanner kb = new Scanner(System.in);
			
			//yay output
			ArrayList<String[]> outputE = new ArrayList<String[]>();
			outputE = castList;
			
			System.out.println("Whose data would you like to edit?");
			String changePerson = new String(kb.nextLine());
			String[] temp = outputE.get(0);
			
			for (int k=0; k<outputE.size(); k++)
			{//ERROR: NO CHANGES CAN BE MADE??
				temp = outputE.get(k);
				System.out.println("Temp 0 = " + temp[0]);
				if (temp[0].equals(changePerson))
				{ //allows for specific changes based on person's name (same k, same person)
					System.out.println("What would you like to change? \n(0)name \n(1)scene \n(2)role \n(3)grade \n(4)height \n(5)weight \n(6)measurements \n(7)notes");
					int ansAction;
					ansAction = kb.nextInt();
					System.out.println(ansAction);
					String input = new String("");
					if (ansAction>=0 && ansAction<=7)
					{
					if (ansAction==0)
					{
						System.out.println("current name: "+temp[0]);
						System.out.println("What would you like to change it to?");
						input = kb.nextLine();
						temp[0] = input;
						//String test = kb.nextLine();
						//temp[0] = test;
						//System.out.println(temp[0]);
					}
					else if (ansAction==1)
					{
						System.out.println("current scene: "+temp[1]);
						System.out.println("What would you like to change it to?");
						input = kb.nextLine();
						temp[1] = input;
					}
					else if (ansAction==2)
					{
						System.out.println("current role: "+temp[2]);
						System.out.println("What would you like to change it to?");
						input = kb.nextLine();
						temp[2] = input;
					}
					else if (ansAction==3)
					{
						System.out.println("current grade: "+temp[3]);
						System.out.println("What would you like to change it to?");
						input = kb.nextLine();
						temp[3] = input;
					}
					else if (ansAction==4)
					{
						System.out.println("current height: "+temp[4]);
						System.out.println("What would you like to change it to?");
						input = kb.nextLine();
						temp[4] = input;
					}
					else if (ansAction==5)
					{
						System.out.println("current weight: "+temp[5]);
						System.out.println("What would you like to change it to?");
						input = kb.nextLine();
						temp[5] = input;
					}
					else if (ansAction==6)
					{
						System.out.println("current measurements: "+temp[6]);
						System.out.println("What would you like to change it to?");
						input = kb.nextLine();
						temp[6] = input;
					}
					else if (ansAction==7)
					{
						System.out.println("current notes: "+temp[7]);
						System.out.println("What would you like to change it to?");
						input = kb.nextLine();
						temp[7] = input;
					}
					input = kb.nextLine();
					temp[ansAction] = input;
					System.out.println("Your changes have been made.");
					}
					else
					{
						//added for debugging
						System.out.println("No changes have been made.");
					}
					
				}
			}
			return outputE;
		}
		
		public static ArrayList<String[]> delActor(ArrayList<String[]> castList)
		{
			Scanner kb = new Scanner(System.in);
			
			//yay output
			ArrayList<String[]> outputL = new ArrayList<String[]>();
			outputL = castList;
			
			System.out.println("Whose data would you like to delete?");
			String ansDel = new String(kb.nextLine());
			
			//input a name (index 0 is name), we'll get rid of him/her
			for (int k=0; k<outputL.size(); k++)
			{
				if (outputL.get(k)[0].equals(ansDel))
				{
					System.out.println("Are you sure? (Y/N)");
					if (kb.nextLine().equals("Y"))
					{
						outputL.remove(k);
						System.out.println("Actor successfully deleted.");
					}
					else
					{
						System.out.println("No changes have been made.");
					}
				}
			}
			return outputL;
		}
}
