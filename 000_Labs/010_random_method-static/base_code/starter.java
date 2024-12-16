/*
 *	Author:  Yunu Choi
 *  Date: 9/11/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		System.out.println("A number between 0 - 9: " + (int)(Math.random() * 10));
		System.out.println("A number between 1 - 10: " + (int)(Math.random() * 10 + 1.0));
		System.out.println("A number between 2.5 - 3.5: " + (Math.random() + 2.5));
		System.out.print("A number between 14 - 589: " + (Math.random() * 575 + 14.0));
	}
}
