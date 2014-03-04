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

public class VSsearch 
{
	public static void searchOption(ArrayList<String[]> searchResults)
	{
		Scanner kb = new Scanner(System.in);
		boolean keepSearch = true;
		while (keepSearch)
		{
			System.out.println("What would you like to search by? \n(0)name \n(1)scene \n(2)role \n(3)grade \n(4)height \n(5)weight \n(6)measurements \n(7)notes");
			int selectSearchOption = kb.nextInt();
			if (selectSearchOption==0)
			{
				searchResults = searchByName(searchResults);
			}
			System.out.println("Would you like to use these results in another search? (Y/N");
			String doAnotherSearch = kb.nextLine();
			if (doAnotherSearch.equals("N"))
			{
				keepSearch = false;
			}
		}
	}
	
	public static ArrayList<String[]> searchByName(ArrayList<String[]> searchResults)
	{	
		Scanner kb = new Scanner(System.in);
		ArrayList<String[]> output = new ArrayList<String[]>();
		output = searchResults;
		String[] actor = new String[8];
		System.out.println("Search by name:");
		String findName = kb.nextLine();
		for (int v=0; v<searchResults.size(); v++)
		{
			actor = searchResults.get(v);
			if (actor[0].indexOf(findName)>=0)
			{
				output.add(actor);
			}
		}
		return output;
	}
	
	public static void displayResults(ArrayList<String[]> searchResults)
	{
		String display = new String("");
		String[] actors = new String[8];
		for (int h=0; h<searchResults.size(); h++)
		{
			actors = searchResults.get(h);
			for (int g=0; g<8; g++)
			{
				display+=actors[g]+"\n";
			}
			display+="\n";
		}
		System.out.println(display);
	}
}
