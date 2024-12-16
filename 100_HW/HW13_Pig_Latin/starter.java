/*
   * Author: Yunu Choi
   * Date: 12/4/2024
   * Collaborator(s):
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String rawIn = sc.nextLine();
		String copyIn = rawIn;
		int wordNum = 1;
		while (copyIn.contains(" ")) {
			copyIn = copyIn.substring(copyIn.indexOf(" ") + 1);
			wordNum++;
		}
		String[] wordsIn = new String[wordNum];
		String[] wordsOut = new String[wordNum];
		int i = 0;
		while (rawIn.contains(" ")) {
			wordsIn[i] = rawIn.substring(0, rawIn.indexOf(" "));
			rawIn = rawIn.substring(rawIn.indexOf(" ") + 1);
			i++;
		}
		wordsIn[i] = rawIn;
		String[] vowels = {"a", "e", "i", "o", "u", "A", "E", "I", "O", "U"};
		for (int n = 0; n < wordsIn.length; n++) {
			int vowelLoc = -1;
			for (int m = 0; m < wordsIn[n].length(); m++) {
				String check = wordsIn[n].substring(m, m + 1);
				for (int k = 0; k < vowels.length; k++) {
					if(check.equals(vowels[k])) {
						vowelLoc = m;
						break;
					}
				}
				if (vowelLoc != -1) {
					break;
				}
			}
			if (vowelLoc == -1) {
				wordsOut[n] = wordsIn[n] + "ay";
			} else if (vowelLoc == 0) {
				wordsOut[n] = wordsIn[n] + "-way";
			} else {
				wordsOut[n] = wordsIn[n].substring(vowelLoc) + "-" + wordsIn[n].substring(0, vowelLoc);
			}
		}
		System.out.println("Here's your sentence in Pig Latin!");
		for (int l = 0; l < wordsOut.length; l++) {
			System.out.print(wordsOut[l] + " ");
		}
	}
}
