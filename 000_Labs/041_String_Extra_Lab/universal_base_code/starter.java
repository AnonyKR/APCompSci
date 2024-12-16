/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static String reverse(String inVal) {
		if(inVal.indexOf(" ") == -1) {
			return inVal;
		} else {
			int spaceLoc = inVal.indexOf(" ");
			return reverse(inVal.substring(spaceLoc + 1)) + " " + inVal.substring(0, spaceLoc);
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence.");
		String line = sc.nextLine();
		System.out.println(reverse(line));
	}
}
