/*
 *	Author:  Yunu Choi
 *  Date: 9/26/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static int pow(int base, int top) {
		int outVal = base;
		for (int i = 0; i < top - 1; i++) {
			outVal *= base;
		}
		return outVal;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your base number?");
		int a = sc.nextInt();
		System.out.println("What is your exponent number?");
		int b = sc.nextInt();
		System.out.print("Your answer is: " + pow(a, b));
	}
}
