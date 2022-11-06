import java.util.Scanner;

public class Names {
	
	// Patrick Ekeu
	// Lab 3: Names
	// September 5, 2020

	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		
		String name;
		String n1, n2, n3;
		int len, space1, space2, space3;
		
		System.out.println("Hello! What is your full name?");
		name = input.nextLine();
		len = name.length();
		space1 = name.indexOf(" ");
		space2 = name.lastIndexOf(" ");
		space3 = name.indexOf(" ", space1);
		
		n1 = name.substring(0, 1); // First initial
		n2 = name.substring(space3 + 1, space3 + 2); // Middle initial
		n3 = name.substring(space2 + 1, len); // Last name
		
		System.out.println("Thank you, " + n3 + ", " + n1 + "." + n2 + ".");
		
		input.close();

	}

}
