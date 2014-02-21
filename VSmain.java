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
		System.out.println("(note: all commands in parentheses are case-sensitive.)");
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
		
		//for reading from and writing to files
		FileWriter fw = new FileWriter(filename+".txt", true);
		FileReader fr = new FileReader(filename+".txt");
		BufferedReader textReader = new BufferedReader(fr);
		String textData = new String();
		textData = textReader.readLine();
		textReader.close();
		//(makes a new clean file to write to later, during save)
		File file = new File(filename+".txt");
		
		//test code, to see what was in the .txt file
		System.out.println(textData);
		
		//arrayList of string arrays to hold the data while application is running
		ArrayList<String[]> castList = new ArrayList<String[]>();
		castList = VSstore.openActor(castList, fr, textData);
		
		//loop to display the menu after completing actions
		boolean runProgram = true;
		while (runProgram)
		{
			VSmain.selectAction(castList, fw);
		}
	}
	
	//just lets the user choose what to do... names are pretty self-explanatory
	public static void selectAction(ArrayList<String[]> castList, FileWriter fw) throws IOException
	{
		Scanner kba = new Scanner(System.in);
		System.out.println("What would you like to do? \n(1)add actor \n(2)edit actor \n(3)delete actor \n(4)save");
		int ansAction = kba.nextInt();
		if (ansAction==1)
		{
			//adds a new String[] to castList and prompts input for each element of String[]
			castList = VSedit.addActor(castList);
		}
		if (ansAction==2)
		{
			//asks for a name, then asks what part to change; input change
			castList = VSedit.editActor(castList);
		}
		if (ansAction==3)
		{
			//give a name, deletes an actor
			castList = VSedit.delActor(castList);
		}
		if (ansAction==4)
		{
			//puts data from arrays, translates it (adds markers), turns into single string, writes to file
			VSstore.saveActor(castList, fw);
		}
	}
}
