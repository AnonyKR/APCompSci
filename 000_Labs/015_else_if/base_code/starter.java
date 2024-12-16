/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Pick a number between 1 - 1000: ");
		int inVal = sc.nextInt();
		int answer = (int)(Math.random() * 1000 + 1);
		if (inVal == answer) {
			System.out.println("Your number was the random number. The number was " + answer + ".");
		} else if (inVal < answer) {
			System.out.println("Your number was smaller than the number. The number was " + answer + ".");
		} else {
			System.out.println("Your number was larger than the number. The number was " + answer + ".");
		}
	}
}
