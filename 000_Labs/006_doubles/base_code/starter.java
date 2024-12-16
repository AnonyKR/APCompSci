/*
 *	Author:  Yunu Choi
 *  Date: 8/29/2024
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		double tf = 32.0; //temperature fahrenheit
		double tc = (tf - 32.0) * (5.0/9.0); //temerature celsius
		System.out.print("The Celsius value for ");
		System.out.print(tf);
		System.out.print(" degrees Fahrenheit is ");
		System.out.print(tc);
		System.out.print(" degrees.");
	}
}
