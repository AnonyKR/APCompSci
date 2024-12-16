/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class character {
	String role = new String("Wizard");
	int str = 5;
	int dex = 5;
	int intel = 5;
	int cha = 5;
}

class starter {
	public static void main(String args[]) {
		character cha = new character();
		System.out.println("Your role is " + cha.role);
		System.out.println("Your strength trait is " + cha.str);
		System.out.println("Your dexterity trait is " + cha.dex);
		System.out.println("Your intelligence trait is " + cha.intel);
		System.out.println("Your charisma trait is " + cha.cha);
	}
}
