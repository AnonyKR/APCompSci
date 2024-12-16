/*
 *	Author:  Yunu Choi
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void toString(String a) {
		System.out.println(a);
	}
	
	public static void toStringCombined(String a, String b) {
		System.out.println(a + " " + b);	
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence!");
		String n = sc.nextLine();
		System.out.println("Write a sentence!");
		String m = sc.nextLine();
		System.out.println("\nThis is using the methods!");
		toString(n);
		toStringCombined(n,m);
	}
}
