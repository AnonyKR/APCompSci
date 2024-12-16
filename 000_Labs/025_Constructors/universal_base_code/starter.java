/*
 *	Author:  Yunu Choi
 *  Date: 10/10/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		myCharacter randPerson = new myCharacter();
		System.out.println(randPerson.role);
		myCharacter theMage = new myCharacter(new String("Wizard"));
		System.out.println(theMage.role);

		
	}
}
