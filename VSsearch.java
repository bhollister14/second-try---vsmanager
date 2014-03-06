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
		String anotherSearch = new String("");
		while (keepSearch)
		{
			System.out.println("What would you like to search by? \n(1)name \n(2)scene \n(3)role \n(4)grade \n(5)height \n(6)weight \n(7)measurements \n(8)notes");
			int selectSearchOption = kb.nextInt();
			if (selectSearchOption==1)
			{
				searchResults = searchByName(searchResults);
			}
			VSsearch.displayResults(searchResults);
			System.out.println("Would you like to use these results in another search? (Y/N)");
			anotherSearch = kb.nextLine(); //WHY DOES THIS GET IGNORED UGH **DON'T IGNORE MEEEEE**
			anotherSearch = kb.nextLine(); //for some reason when i add it twice it works???
			if (anotherSearch.equals("N"))
			{
				keepSearch = false;
				searchResults = VSsearch.clearSearch(searchResults);
			}
		}
	}
	
	public static ArrayList<String[]> searchByName(ArrayList<String[]> searchResults)
	{	
		Scanner kb = new Scanner(System.in);
		ArrayList<String[]> outputS = new ArrayList<String[]>();
		//outputS = searchResults;

		String[] actor = new String[8];
		System.out.println("Search by name:");
		String findName = kb.nextLine(); //enter letters to search by
		
		for (int v=0; v<searchResults.size(); v++)
		{ //look through all the names for matches
			actor = searchResults.get(v); 
			if (searchResults.get(v)[0].indexOf(findName)>=0)
			{ //if it matches add the String[] to the output
				outputS.add(actor);
				//break; //had out of error heap space blah thing until i added this line
			}
		}
		return outputS;
	}
	
	public static void displayResults(ArrayList<String[]> searchResults)
	{
		String display = new String("");
		String[] actors2 = new String[8];
		display = "";
		for (int h=0; h<searchResults.size(); h++)
		{
			actors2 = searchResults.get(h);
			for (int g=0; g<8; g++)
			{
				display+=actors2[g]+"\n";
				break; //take out later--just for testing
			}
			display+="\n";
		}
		System.out.println(display+searchResults.size());
	}
	
	public static ArrayList<String[]> clearSearch(ArrayList<String[]> searchResults)
	{
		for (int d=0; d<searchResults.size(); d++)
		{
			searchResults.remove(d);
		}
		return searchResults;
	}
}

//PRINTS OUT THE ORIGINAL ACTORS **PLUS** THE SEARCH RESULTS
