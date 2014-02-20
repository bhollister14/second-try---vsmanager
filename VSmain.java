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

public class VSmain 
{
	public static void main(String[] args) throws IOException
	{
		//have you created a file?
		Scanner kb = new Scanner(System.in);
		System.out.println("Have you previously created a file? (Y/N)");
		String fileYN = new String(kb.nextLine());
		String filename = new String("");
		//>yes: please enter filename here, open that file, extract existing info
		if (fileYN.equals("Y"))
		{
			System.out.println("Please enter file name:");
			filename = kb.nextLine();
		}
		//>no: please enter filename here, create that file, open it, write default info
		else if (fileYN.equals("N"))
		{
			System.out.println("Please enter a file name:");
			filename = kb.nextLine();
			File file = new File(filename+".txt");
			file.createNewFile();
		}
		FileReader fr = new FileReader(filename+".txt");
		BufferedReader textReader = new BufferedReader(fr);
		String textData = new String();
		textData = textReader.readLine();
		textReader.close();
		//one filename, one filewriter, one filereader
		System.out.println(textData);
		
		//add actors
		ArrayList<String[]> castList = new ArrayList<String[]>();
		String[] actorDataOne = new String[8];
		castList.add(actorDataOne);
		System.out.println("What would you like to do? (ADD ACTOR)");
		String action = kb.nextLine();
		if (action.equals("add actor"))
		{   
			//only works if the ArrayList is empty
			System.out.println("Actor name:");
			castList.get(0)[0]=kb.nextLine();
			System.out.println("Actor scene:");
			castList.get(0)[1]=kb.nextLine();
			System.out.println("Actor role:");
			castList.get(0)[2]=kb.nextLine();
			System.out.println("Actor grade:");
			castList.get(0)[3]=kb.nextLine();
			System.out.println("Actor height:");
			castList.get(0)[4]=kb.nextLine();
			System.out.println("Actor weight:");
			castList.get(0)[5]=kb.nextLine();
			System.out.println("Actor measurements:");
			castList.get(0)[6]=kb.nextLine();
			System.out.println("Actor notes:");
			castList.get(0)[7]=kb.nextLine();
		}
		String output = new String("");
		for (String element:castList.get(0))
		{
			output+=element;
		}
		System.out.println(output);
		
		//delete actors
		System.out.println("What would you like to do? (DELETE ACTOR)");
		action = kb.nextLine();
		if (action.equals("delete actor"))
		{
			System.out.println("Whose data would you like to delete?");
			String ansDel = new String(kb.nextLine());
			for (int k=0; k<castList.size(); k++)
			{
				if (castList.get(k)[0].equals(ansDel))
				{
					System.out.println("Are you sure? (Y/N)");
					if (kb.nextLine().equals("Y"))
					{
						castList.remove(k);
						System.out.println("Actor successfully deleted.");
					}
				}
			}
		}
		
		//edit info
		System.out.println("What would you like to do? (EDIT ACTOR)");
		action = kb.nextLine();
		if (action.equals("edit actor"))
		{
			System.out.println("Whose data would you like to edit?");
			String changePerson = new String(kb.nextLine());
			for (int k=0; k<castList.size(); k++)
			{
				if (castList.get(k)[0].equals(changePerson))
				{
					System.out.println("What would you like to change? \n(0)name \n(1)scene \n(2)role \n(3)grade \n(4)height \n(5)weight \n(6)measurements \n(7)notes");
					int ansAction = kb.nextInt();
					if (ansAction==0)
					{
						System.out.println("current name: "+castList.get(k)[0]);
						System.out.println("What would you like to change it to?");
						castList.get(k)[0] = kb.nextLine();
					}
					if (ansAction==1)
					{
						System.out.println("current scene: "+castList.get(k)[1]);
						System.out.println("What would you like to change it to?");
						castList.get(k)[1] = kb.nextLine();
					}
					if (ansAction==2)
					{
						System.out.println("current role: "+castList.get(k)[2]);
						System.out.println("What would you like to change it to?");
						castList.get(k)[2] = kb.nextLine();
					}
					if (ansAction==3)
					{
						System.out.println("current grade: "+castList.get(k)[3]);
						System.out.println("What would you like to change it to?");
						castList.get(k)[3] = kb.nextLine();
					}
					if (ansAction==4)
					{
						System.out.println("current height: "+castList.get(k)[4]);
						System.out.println("What would you like to change it to?");
						castList.get(k)[4] = kb.nextLine();
					}
					if (ansAction==5)
					{
						System.out.println("current weight: "+castList.get(k)[5]);
						System.out.println("What would you like to change it to?");
						castList.get(k)[5] = kb.nextLine();
					}
					if (ansAction==6)
					{
						System.out.println("current measurements: "+castList.get(k)[6]);
						System.out.println("What would you like to change it to?");
						castList.get(k)[6] = kb.nextLine();
					}
					if (ansAction==7)
					{
						System.out.println("current notes: "+castList.get(k)[7]);
						System.out.println("What would you like to change it to?");
						castList.get(k)[7] = kb.nextLine();
					}
					System.out.println("Your changes have been made.");
				}
			}
		}
		
		//this part of code should be going back to the loop
		System.out.println("What would you like to do? (SAVE)");
		action = kb.nextLine();
		if (action.equals("save"))
		{
			
		}
	}
	public void selectAction(ArrayList<String> castList)
	{
		Scanner kba = new Scanner(System.in);
		System.out.println("What would you like to do? \n(1)add actor \n(2)edit actor \n(3)delete actor");
		int ansAction = kba.nextInt();
		if (ansAction==1)
		{
			VSedit.addActor(castList)
		}
		if (ansAction==2)
		{
			
		}
		if (ansAction==3)
		{
			
		}
	}
}
