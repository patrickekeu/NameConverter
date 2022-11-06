import java.util.Scanner;

// Patrick Ekeu
// Lab 4: Dates
// September 14, 2020

public class Dates {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		String date, month, day, year;
		int slash1, slash2, yearInt;
		System.out.print("Enter a date in the format mm/dd/yyyy or mm/dd/yy: ");
		date = input.next();
		date = date.strip();
		slash1 = date.indexOf("/");
		slash2 = date.lastIndexOf("/");
		
		//separates user input into month, day, and year
		month = date.substring(0, slash1);
		day = date.substring(slash1 + 1, slash2);
		year = date.substring(slash2 + 1);
		yearInt = Integer.parseInt(year);
	
		if (yearInt < 100) // if the user puts in two digits for the year, instead of four 
		{
			if (yearInt < 20)
			{
				year = "20" + year;
			}
			else
			{
				year = "19" + year;
			}
		}
		
		System.out.println("This date in the European format is " + day + "/" + month + "/" + year);
		
		input.close();
	}

}
