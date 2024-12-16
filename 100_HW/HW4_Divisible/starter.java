/*
 *	Author: Yunu Choi
 *  Date: 9/26/2024
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static boolean dvb(int from, int by) {
		//divisible
		return (from % by == 0);	
	}
	
	public static void allTry(int inVal) {
		if (dvb(inVal, 2)) {
			System.out.println("\n" + inVal + " is divisible by 2!");
		} else {
			System.out.println("\n" + inVal + " is not divisible by 2!");
		}
		
		if (!(dvb(inVal, 3)) && !(dvb(inVal, 4)) && !(dvb(inVal, 5))) {
			System.out.println(inVal + " is not divisible by 3, 4, or 5!");
		} else {
			for (int i = 3; i <= 5; i++) {
				if (dvb(inVal, i)) {
					System.out.println(inVal + " is divisible by " + i + "!");
				}
			}
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int a = sc.nextInt();
		System.out.print("Please enter another integer: ");
		int b = sc.nextInt();
		allTry(a);
		allTry(b);
	}
}
