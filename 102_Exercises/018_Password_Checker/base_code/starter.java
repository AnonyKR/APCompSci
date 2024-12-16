import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		int[] strengh = new int[4]; //in order [0, 1, 2, 3]
		String[] specialChar = {"!", "@", "#", "$", "%", "^", "&", "*"};
		boolean[] condition = new boolean[2]; //in order [condition 1, condition 2]
        for (int x = 0; x < passwords.length; x++) {
            if (passwords[x].length() >= 8) {
                condition[0] = true;
            } else {
                condition[0] = false;
            }
            condition[1] = false;
            for (int n = 0; n < specialChar.length; n++) {
                if (passwords[x].contains(specialChar[n])) {
                    condition[1] = true;
                    break;
                }
            }
            if (condition[0] && condition[1]) {
                strengh[3]++;
            } else if (!condition[0] && condition[1]) {
                strengh[2]++;
            } else if (condition[0] && !condition[1]) {
                strengh[1]++;
            } else if (!condition[0] && !condition[1]) {
                strengh[0]++;
            } else {
                System.out.println("BUG! Strengh decision");
            }
        }
        System.out.println("There are " + strengh[1] + " passwords of strength 1 with 8 or more characters.");
        System.out.println("There are " + strengh[2] + " passwords of strength 2 with a special symbol.");
        System.out.println("There are " + strengh[3] + " passwords of strength 3 with both strength 1 and 2.");
        System.out.println("There are " + strengh[0] + " passwords with no strength.");
		
	}
}
