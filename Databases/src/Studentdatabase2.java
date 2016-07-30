/* Gilbert Gomez 
 * A database with student Ids and names, including their associated home rooms 
 * made with third dimensional arrays.
 */

import java.util.*;

public class Studentdatabase2 

{
	
	public static void main(String[] args) throws Exception
	{
		while (true)
		{
			
		
	Scanner scan = new Scanner(System.in);
	String data[][][] = new String[4][2][4];
	//first array has student IDS and names.
	data[0][0][0] = "0054560";
	data[0][0][1] = "4214214";
	data[0][0][2] = "4134213";
	data[0][0][3] = "3412421";
	
	data[0][1][0] = "Gilbert";
	data[0][1][1] = "Bob";
	data[0][1][2] = "John";
	data[0][1][3] = "Matt";
	
	//Second array has Teachers with subjects
	data[1][0][0] = "Laroche";
	data[1][0][1] = "Suarez";
	data[1][0][2] = "Tosado";
	data[1][0][3] = "Portula";
	
	data[1][1][0] = "Programming";
	data[1][1][1] = "English";
	data[1][1][2] = "Biology";
	data[1][1][3] = "Spanish";
	
	
	// selection screen
			System.out.println("Select a student 1-4 or type quit to exit database.");
			String select = scan.nextLine();
			
			// Prints out the student and ID.
			if (select.equals("1"))
			{
				System.out.println
				(data[0][1][0] + "\t" +  data[0][0][0] + "\n" + data[1][0][0] + "\t" + data[1][1][0]);
				
				
			}
			else if (select.equals("2"))
			{
				System.out.println(data[0][1][1] + "\t" + data[0][0][1] + "\n" + data[1][0][1] + "\t" + data[1][1][1]);
				
			}
			else if (select.equals("3"))
			{
				
				System.out.println(data[0][1][2] + "\t" + data[0][0][2] + "\n" + data[1][0][2] + "\t" + data[1][1][2]);
				
			}
			else if (select.equals("4"))
			{
				
				System.out.println(data[0][1][3] + "\t" + data[0][0][3] + "\n" + data[1][0][3] + "\t" + data[1][1][3]);
			}
			
			
			// A option to quit.
			else if (select.equals("quit") || select.equals("Quit"))
			{
				System.exit(0);
				
			}
			
			// If the user inputs something else besides what's on the menu.
			else
			{
				System.out.println("Error");
			}
			
		}
	}
	
	
}