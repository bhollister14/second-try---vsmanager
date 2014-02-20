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
		public ArrayList<String> addActor(ArrayList<String> castList)
		{
			Scanner kb = new Scanner(System.in);
			ArrayList<String> output = new ArrayList<String>();
			output = castList;
			String[] actorDataOne = new String[8];
			castList.add(actorDataOne);
			System.out.println("What would you like to do? (ADD ACTOR)");
			String action = kb.nextLine();
			if (action.equals("add actor"))
			{   
				//only works if the ArrayList is empty
				System.out.println("Actor name:");
				output.get(output.size()-1)[0]=kb.nextLine();
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
			return output;
		}
}
