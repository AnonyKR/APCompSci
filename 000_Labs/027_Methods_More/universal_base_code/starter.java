/*
 *	Author:  Yunu Choi
 *  Date: 10/10/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		myCharacter randP1 = new myCharacter();
		randP1.myToString();
		randP1.setAll("Wizard", 4, 5, 6, 7);
		randP1.myToString();
	}
}
