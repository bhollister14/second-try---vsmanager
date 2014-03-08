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
			if (selectSearchOption==2)
			{
				searchResults = searchByScene(searchResults);
			}
			if (selectSearchOption==3)
			{
				searchResults = searchByRole(searchResults);
			}
			if (selectSearchOption==4)
			{
				searchResults = searchByGrade(searchResults);
			}
			if (selectSearchOption==5)
			{
				searchResults = searchByHeight(searchResults);
			}
			if (selectSearchOption==6)
			{
				searchResults = searchByWeight(searchResults);
			}
			if (selectSearchOption==7)
			{
				searchResults = searchByMeasurements(searchResults);
			}
			if (selectSearchOption==8)
			{
				searchResults = searchByNotes(searchResults);
			}
			VSsearch.displayResults(searchResults);
			System.out.println("Would you like to use these results in another search? (Y/N)");
			anotherSearch = kb.nextLine(); //WHY DOES THIS GET IGNORED UGH **DON'T IGNORE MEEEEE**
			anotherSearch = kb.nextLine(); //for some reason when i add it twice it works???
			if (anotherSearch.equals("N") || anotherSearch.equals("n"))
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
	
	public static ArrayList<String[]> searchByScene(ArrayList<String[]> searchResults)
	{	
		Scanner kb = new Scanner(System.in);
		ArrayList<String[]> outputS = new ArrayList<String[]>();
		//outputS = searchResults;

		String[] actor = new String[8];
		System.out.println("Search by scene:");
		String findName = kb.nextLine(); //enter letters to search by
		
		for (int v=0; v<searchResults.size(); v++)
		{ //look through all the names for matches
			actor = searchResults.get(v); 
			if (searchResults.get(v)[1].indexOf(findName)>=0)
			{ //if it matches add the String[] to the output
				outputS.add(actor);
				//break; //had out of error heap space blah thing until i added this line
			}
		}
		return outputS;
	}
	
	public static ArrayList<String[]> searchByRole(ArrayList<String[]> searchResults)
	{	
		Scanner kb = new Scanner(System.in);
		ArrayList<String[]> outputS = new ArrayList<String[]>();
		//outputS = searchResults;

		String[] actor = new String[8];
		System.out.println("Search by role:");
		String findName = kb.nextLine(); //enter letters to search by
		
		for (int v=0; v<searchResults.size(); v++)
		{ //look through all the names for matches
			actor = searchResults.get(v); 
			if (searchResults.get(v)[2].indexOf(findName)>=0)
			{ //if it matches add the String[] to the output
				outputS.add(actor);
				//break; //had out of error heap space blah thing until i added this line
			}
		}
		return outputS;
	}
	
	public static ArrayList<String[]> searchByGrade(ArrayList<String[]> searchResults)
	{	
		Scanner kb = new Scanner(System.in);
		ArrayList<String[]> outputS = new ArrayList<String[]>();
		//outputS = searchResults;

		String[] actor = new String[8];
		System.out.println("Search by grade:");
		String findName = kb.nextLine(); //enter letters to search by
		
		for (int v=0; v<searchResults.size(); v++)
		{ //look through all the names for matches
			actor = searchResults.get(v); 
			if (searchResults.get(v)[3].indexOf(findName)>=0)
			{ //if it matches add the String[] to the output
				outputS.add(actor);
				//break; //had out of error heap space blah thing until i added this line
			}
		}
		return outputS;
	}
	
	public static ArrayList<String[]> searchByHeight(ArrayList<String[]> searchResults)
	{	
		Scanner kb = new Scanner(System.in);
		ArrayList<String[]> outputS = new ArrayList<String[]>();
		//outputS = searchResults;

		String[] actor = new String[8];
		System.out.println("Search by height:");
		String findName = kb.nextLine(); //enter letters to search by
		
		for (int v=0; v<searchResults.size(); v++)
		{ //look through all the names for matches
			actor = searchResults.get(v); 
			if (searchResults.get(v)[4].indexOf(findName)>=0)
			{ //if it matches add the String[] to the output
				outputS.add(actor);
				//break; //had out of error heap space blah thing until i added this line
			}
		}
		return outputS;
	}
	
	public static ArrayList<String[]> searchByWeight(ArrayList<String[]> searchResults)
	{	
		Scanner kb = new Scanner(System.in);
		ArrayList<String[]> outputS = new ArrayList<String[]>();
		//outputS = searchResults;

		String[] actor = new String[8];
		System.out.println("Search by weight:");
		String findName = kb.nextLine(); //enter letters to search by
		
		for (int v=0; v<searchResults.size(); v++)
		{ //look through all the names for matches
			actor = searchResults.get(v); 
			if (searchResults.get(v)[5].indexOf(findName)>=0)
			{ //if it matches add the String[] to the output
				outputS.add(actor);
				//break; //had out of error heap space blah thing until i added this line
			}
		}
		return outputS;
	}
	
	public static ArrayList<String[]> searchByMeasurements(ArrayList<String[]> searchResults)
	{	
		Scanner kb = new Scanner(System.in);
		ArrayList<String[]> outputS = new ArrayList<String[]>();
		//outputS = searchResults;

		String[] actor = new String[8];
		System.out.println("Search by measurement:");
		String findName = kb.nextLine(); //enter letters to search by
		
		for (int v=0; v<searchResults.size(); v++)
		{ //look through all the names for matches
			actor = searchResults.get(v); 
			if (searchResults.get(v)[6].indexOf(findName)>=0)
			{ //if it matches add the String[] to the output
				outputS.add(actor);
				//break; //had out of error heap space blah thing until i added this line
			}
		}
		return outputS;
	}
	
	public static ArrayList<String[]> searchByNotes(ArrayList<String[]> searchResults)
	{	
		Scanner kb = new Scanner(System.in);
		ArrayList<String[]> outputS = new ArrayList<String[]>();
		//outputS = searchResults;

		String[] actor = new String[8];
		System.out.println("Search by note:");
		String findName = kb.nextLine(); //enter letters to search by
		
		for (int v=0; v<searchResults.size(); v++)
		{ //look through all the names for matches
			actor = searchResults.get(v); 
			if (searchResults.get(v)[7].indexOf(findName)>=0)
			{ //if it matches add the String[] to the output
				outputS.add(actor);
				//break; //had out of error heap space blah thing until i added this line
			}
		}
		return outputS;
	}
	
	public static void displayResults(ArrayList<String[]> searchResults)
	{
		if (searchResults.size() == 0)
		{
			System.out.println("No actors found matching your search terms.");
		}
		String display = new String("");
		String[] actors2 = new String[8];
		display = "";
		for (int h=0; h<searchResults.size(); h++)
		{
			actors2 = searchResults.get(h);
			for (int g=0; g<8; g++)
			{
				display+=actors2[g]+"\n";
				//break; //take out later--just for testing
			}
			display+="\n";
		}
		System.out.println(display);
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
