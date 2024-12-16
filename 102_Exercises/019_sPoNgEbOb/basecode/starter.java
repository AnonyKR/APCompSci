/*
	Author: Yunu Choi
	Date: 12/5/2024
*/
import java.util.*;

class starter {
	public static boolean letterCheck(String one) {
		if (one.length() != 1) {
			return false;
		}
		String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		for (int i = 0; i < letters.length; i++) {
			if (one.toLowerCase().equals(letters[i])) {
				return true;
			}
		}
		return false;
	}
	
	public static String spongeCase(String inVal) {
		String outVal = new String("");
		boolean toUpper = false;
		for (int i = 0; i < inVal.length(); i++) {
			if(letterCheck(inVal.substring(i, i + 1))) {
				if(toUpper) {
					outVal += inVal.substring(i, i + 1).toUpperCase();
				} else {
					outVal += inVal.substring(i, i + 1).toLowerCase();
				}
				toUpper = !toUpper;
			} else {
				outVal += inVal.substring(i, i + 1);
				if(!inVal.substring(i, i + 1).equals("-")) {
					toUpper = false;
				}
			}
		}
		return outVal;
	} 
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word or phrase:");
		String inVal = sc.nextLine();
		String outVal = spongeCase(inVal);
		System.out.println("\nYour word/phrase as sPoNgE cAsE:");
		System.out.println(outVal);
	}
}
