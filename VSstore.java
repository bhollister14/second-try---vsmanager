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

public class VSstore 
{
	//just puts the textData into arrays
	public static ArrayList<String[]> openActor(ArrayList<String[]> castList, FileReader fr, String textData) throws IOException
	{
		ArrayList<String[]> output = new ArrayList<String[]>();
		String complete = new String("");
		complete+=textData; 
		//complete takes the value of textData (since complete is empty)
		//if it's still empty, there's no data, just return the empty arrayList
		if (complete.equals(""))
		{
			return output;
		}
		
		//for counting the required size of castList (String[] must be 8)
		int countHashOne = 0;
		for (int l=0; l<complete.length()-1; l++)
		{
			if (complete.substring(l, l+1).equals("#"))
				countHashOne++;
		}
		int needLists = countHashOne-1;
		String[] actorData = new String[8];
		for (int s=0; s<needLists; s++)
		{
			output.add(actorData);
		}
		
		//for adding the text portions using the markers (neglecting markers in arrays)
		int countHash = 0;
		//goes through every letter/character for special chars
		for (int k=0; k<complete.length()-1; k++)
		{
			//when the name one is found, add the rest of the stuff 
			//  right after it to the other elements of the string[] for that castList index
			if (complete.substring(k, k+1).equals("#"))
			{
				castList.get(countHash)[0] = complete.substring(complete.indexOf("#")+1, complete.indexOf("~"));
				castList.get(countHash)[1] = complete.substring(complete.indexOf("~")+1, complete.indexOf("!"));
				castList.get(countHash)[2] = complete.substring(complete.indexOf("!")+1, complete.indexOf("%"));
				castList.get(countHash)[3] = complete.substring(complete.indexOf("%")+1, complete.indexOf("&"));
				castList.get(countHash)[4] = complete.substring(complete.indexOf("&")+1, complete.indexOf("*"));
				castList.get(countHash)[5] = complete.substring(complete.indexOf("*")+1, complete.indexOf("<"));
				castList.get(countHash)[6] = complete.substring(complete.indexOf("<")+1, complete.indexOf(">"));
				//just in case this is the last person needed to list... stop looking for #
				if (complete.indexOf("#")!=-1)
				{
					castList.get(countHash)[7] = complete.substring(complete.indexOf(">")+1, complete.indexOf("#"));
				}
				else
				{
					castList.get(countHash)[7] = complete.substring(complete.indexOf(">")+1);
				}
				//to the next person!
				countHash++;
			}
		}
		return output;
	}
	
	//  !!!  consider leaving markers while elements are in the arrays, just omit them when printing strings
	
	public static void saveActor(ArrayList<String[]> castList, FileWriter fw) throws IOException
	{
		String toSave = new String();
		//adds markers and puts elements into a single string
		//q controls which string array elements are being taken from
		//w controls what character is given; corresponds to index in string[]
		for (int q=0; q<castList.size(); q++)
		{
			for (int w=0; w<8; w++)
			{
				if (w==0)
				{
					toSave+=castList.get(q)[0]+"#";
				}
				if (w==1)
				{
					toSave+=castList.get(q)[1]+"~";
				}
				if (w==2)
				{
					toSave+=castList.get(q)[2]+"!";
				}
				if (w==3)
				{
					toSave+=castList.get(q)[3]+"%";
				}
				if (w==4)
				{
					toSave+=castList.get(q)[4]+"&";
				}
				if (w==5)
				{
					toSave+=castList.get(q)[5]+"*";
				}
				if (w==6)
				{
					toSave+=castList.get(q)[6]+"<";
				}
				if (w==7)
				{
					toSave+=castList.get(q)[7]+">";
				}
			}
		}
		//writes to the file
		fw.write(toSave);
		fw.flush();
		fw.close();
		//prints what was written
		System.out.println(toSave);
	}
}
