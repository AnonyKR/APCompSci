/*
 *	Author:  Yunu Choi
 *  Date: 9/11/2024
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		/*
		System.out.println("Maximum = " + Math.max(13 - 6 * 11, 30 % 7 * (-2)));
		System.out.println("Square root = " + Math.sqrt(3 * 8 + 31 / 7));
		System.out.println("Power = " + Math.pow(37 / 3, 35 % 21));
		System.out.print("Max = " + Math.max(Math.pow(2, 14 % 3), Math.sqrt(2*6)));
		*/
		
		//For extra
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a double: ");
		double x = sc.nextDouble();
		System.out.print("Please enter another double: ");
		double y = sc.nextDouble();
		System.out.println("\nMaximum number of x and y is: " + Math.max(x,y));
		System.out.println("Square root of y is: " + Math.sqrt(y));
		System.out.print("Power of x and y is: " + Math.pow(x,y));
	}
}
