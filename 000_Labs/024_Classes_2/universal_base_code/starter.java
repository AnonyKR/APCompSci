/*
 *	Author:  Yunu Choi
 *  Date: 10/1/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		myCharacter cha1 = new myCharacter();
		System.out.println("Your role is " + cha1.role);
		System.out.println("Your strength trait is " + cha1.str);
		System.out.println("Your dexterity trait is " + cha1.dex);
		System.out.println("Your intelligence trait is " + cha1.intel);
		System.out.println("Your charisma trait is " + cha1.cha);
	}
}
