/*
 *	Author: Yunu Choi
 *  Date: 11/5/2024
*/
import java.util.Scanner;

class starter {
	public static int intLen(int i) {
		//Only works in this code for domain of (0-9999)
		if (i > 999) {
			return 4;
		}
		if (i > 99) {
			return 3;
		}
		if (i > 9) {
			return 2;
		}
		return 1;
	}
	
	public static String numWSpace(int i) {
		String returnVal = new String("");
		int spaceLen = 5 - intLen(i);
		for (int c = 0; c < spaceLen; c++) {
			returnVal += " ";
		}
		returnVal += i;
		return returnVal;
	}
	
	public static void main(String args[]) {
		int length = 1001;
		int[] mult3 = new int[length];
		int[] subLen = new int[length];
		for (int i = 0; i < length; i++) {
			mult3[i] = (i + 1) * 3;
			subLen[i] = length - (i + 1);
		}
		System.out.println("Index|Mult3|SubLen");
		for (int i = 0; i < length; i++) {
			System.out.println("" + numWSpace(i) + "|" + numWSpace(mult3[i]) + "|" + numWSpace(subLen[i]));
		}
	}
}
