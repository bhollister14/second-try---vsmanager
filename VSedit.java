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
			ArrayList<String[]> output = new ArrayList<String[]>();
			output = castList;
			
			//adds a new String[] to castList (first output)
			String[] actorData = new String[8];
			int arraySize = output.size();
			output.add(actorData); 
			
			//input ALL the data
			System.out.println("Actor name:");
			output.get(arraySize)[0]=kb.nextLine();
			System.out.println("Actor scene:");
			output.get(arraySize)[1]=kb.nextLine();
			System.out.println("Actor role:");
			output.get(arraySize)[2]=kb.nextLine();
			System.out.println("Actor grade:");
			output.get(arraySize)[3]=kb.nextLine();
			System.out.println("Actor height:");
			output.get(arraySize)[4]=kb.nextLine();
			System.out.println("Actor weight:");
			output.get(arraySize)[5]=kb.nextLine();
			System.out.println("Actor measurements:");
			output.get(arraySize)[6]=kb.nextLine();
			System.out.println("Actor notes:");
			output.get(arraySize)[7]=kb.nextLine();
			return output;
		}
		
		public static ArrayList<String[]> editActor(ArrayList<String[]> castList)
		{
			Scanner kb = new Scanner(System.in);
			
			//yay output
			ArrayList<String[]> output = new ArrayList<String[]>();
			output = castList;
			
			System.out.println("Whose data would you like to edit?");
			String changePerson = new String(kb.nextLine());
			
			for (int k=0; k<output.size(); k++)
			{//ERROR: NO CHANGES CAN BE MADE??
				if (output.get(k)[0].equals(changePerson))
				{ //allows for specific changes based on person's name (same k, same person)
					System.out.println("What would you like to change? \n(0)name \n(1)scene \n(2)role \n(3)grade \n(4)height \n(5)weight \n(6)measurements \n(7)notes");
					int ansAction = kb.nextInt();
					if (ansAction==0)
					{
						System.out.println("current name: "+output.get(k)[0]);
						System.out.println("What would you like to change it to?");
						output.get(k)[0] = kb.nextLine();
					}
					else if (ansAction==1)
					{
						System.out.println("current scene: "+output.get(k)[1]);
						System.out.println("What would you like to change it to?");
						output.get(k)[1] = kb.nextLine();
					}
					else if (ansAction==2)
					{
						System.out.println("current role: "+output.get(k)[2]);
						System.out.println("What would you like to change it to?");
						output.get(k)[2] = kb.nextLine();
					}
					else if (ansAction==3)
					{
						System.out.println("current grade: "+output.get(k)[3]);
						System.out.println("What would you like to change it to?");
						output.get(k)[3] = kb.nextLine();
					}
					else if (ansAction==4)
					{
						System.out.println("current height: "+output.get(k)[4]);
						System.out.println("What would you like to change it to?");
						output.get(k)[4] = kb.nextLine();
					}
					else if (ansAction==5)
					{
						System.out.println("current weight: "+output.get(k)[5]);
						System.out.println("What would you like to change it to?");
						output.get(k)[5] = kb.nextLine();
					}
					else if (ansAction==6)
					{
						System.out.println("current measurements: "+output.get(k)[6]);
						System.out.println("What would you like to change it to?");
						output.get(k)[6] = kb.nextLine();
					}
					else if (ansAction==7)
					{
						System.out.println("current notes: "+output.get(k)[7]);
						System.out.println("What would you like to change it to?");
						output.get(k)[7] = kb.nextLine();
					}
					else
					{
						//added for [unsuccessful] debugging
						System.out.println("No changes have been made.");
					}
					System.out.println("Your changes have been made.");
				}
			}
			return output;
		}
		
		public static ArrayList<String[]> delActor(ArrayList<String[]> castList)
		{
			Scanner kb = new Scanner(System.in);
			
			//yay output
			ArrayList<String[]> output = new ArrayList<String[]>();
			output = castList;
			
			System.out.println("Whose data would you like to delete?");
			String ansDel = new String(kb.nextLine());
			
			//input a name (index 0 is name), we'll get rid of him/her
			for (int k=0; k<output.size(); k++)
			{
				if (output.get(k)[0].equals(ansDel))
				{
					System.out.println("Are you sure? (Y/N)");
					if (kb.nextLine().equals("Y"))
					{
						output.remove(k);
						System.out.println("Actor successfully deleted.");
					}
					else
					{
						System.out.println("No changes have been made.");
					}
				}
			}
			return output;
		}
}
