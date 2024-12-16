/*
 *	Author:
 *  Date:
*/

import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the file name of one of the text files in the \'books\' folder: (Ex: test.txt)");
		String textFile = sc.nextLine();		// This is one of the files in the 'books' folder. It MUST exist.
		String[] arr = fillArray(textFile);		// Uses the fillArray method that has been built below. This fills the array 'arr' with each word individually in the text file.
		System.out.println();


		/*
			The only time you should use Scanner with (System.in) is within the 'main' method.
			At no point should any other method use Scanner(System.in)
		*/
		while(true){
			System.out.println("What action would you like to take?");
			System.out.println("1. Check text file (file)");
			System.out.println("2. Print the text given (print)");
			System.out.println("3. Print the text backwards (printBack)");
			System.out.println("4. Print a certain number of words (printNum)");
			System.out.println("5. Change the text file (change)");
			System.out.println("6. Check the number of words in a text (check)");
			System.out.println("7. Most common word (common)");
			String choice = sc.nextLine();
			System.out.println();

			// Your code goes here.
			switch (choice) {
				case "1","file":
					System.out.println(textFile);
					break;
				case "2","print":
					printsArray(arr);
					break;
				case "3","printBack","printback":
					printsArrayBack(arr);
					break;
				case "4","printNum","printnum":
					System.out.println("How many words of the text would you like to print? ");
					printsNumber(arr, sc.nextInt());
					sc.nextLine();
					break;
				case "5","change":
					System.out.println("What is the file name of the text? (Ex: joe.txt)");
					textFile = sc.nextLine();
					arr = fillArray(textFile);	
					break;
				case "6","check":
					System.out.println("What word/phrase would you like to check?");
					String check = sc.nextLine();
					System.out.println("There are  " + checksArray(arr, check) + " many " + check + " in " + textFile);
					break;
				case "7","common":
					System.out.println("The most common word in the text is: " + mostCommon(arr));
					break;
				default:
					System.out.println("Invalid Input.");
			}
			System.out.println("----------");
		}
	}


	/* ---------------------------------------------------------------------------------------
		The printsArray method prints the entire array given.
	*/
	public static void printsArray(String[] arr){
		System.out.println("------------------------------------Printing Forward------------------------------------");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n------------------------------------Printing Forward------------------------------------");
	}


	/* ---------------------------------------------------------------------------------------
		The printsArrayBack method prints the entire array given in opposite order.
	*/
	public static void printsArrayBack(String[] arr){
		System.out.println("------------------------------------Printing Backward------------------------------------");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[arr.length - i - 1] + " ");
		}
		System.out.println("\n------------------------------------Printing Backward------------------------------------");
	}


	/* ---------------------------------------------------------------------------------------
		The printsNumber method prints "num" words out of the entire given array.
		If the number is larger than the number of words in the array, it tells the user too large and to try again.
			This should immediately end the method.
	*/
	public static void printsNumber(String[] arr, int num){
		System.out.println("------------------------------------Printing " + num + " Number of Words------------------------------------");
		for(int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n------------------------------------Printing " + num + " Number of Words------------------------------------");
	}


	/* ---------------------------------------------------------------------------------------
		The checksArray method checks the given array for a given String.
		It counts the number of occurences that the given String shows up.
		The count is returned to the call.
	*/
	public static int checksArray(String[] arr, String check){
		int c = 0; // Counter
		for(int i = 0; i < arr.length; i++) {
			if(check.equals(arr[i])) {
				c++;
			}
		}
		return c;
	}


	/* ---------------------------------------------------------------------------------------
		The mostCommon method finds the most common word in the given array.
		It returns the String of the most common word.
		This is a harder method but is doable!
		Do this one last!
	*/
	public static String mostCommon(String[] arr){
		String most = " ";
		String current = " ";
		int mostAppear = 1;
		int currentAppear = 0;
		String[] order = arr;
		Arrays.sort(order); // method found in java array documentation
		for (int i = 0; i < order.length; i++) {
			if(!order[i].equals(current)) {
				if(mostAppear < currentAppear) {
					most = order[i-1];
					mostAppear = currentAppear;
				}
				currentAppear = 0;
				current = order[i];
			}
			currentAppear++;
		}
		return most;	//space is returned if every word is unique (also in case of tie, first come first served)
	}




	// ---------------------------------------------------------------------------------------
	/*
		The fillArray method returns an array filled of all of the words in a given text file (String).
		Each word is slotted into its own index in the array.
		The array length is the number of words in the text file.
		A precondition is that "String args" must be a valid .txt file stored in the "books" folder.
	*/
	public static String[] fillArray(String arg) throws FileNotFoundException {
		File text = new File("./books/" + arg);
		Scanner sc = new Scanner(text);
		int lineNumber = 0;
		while(sc.hasNext()){
			sc.next();
			lineNumber++;
		}

		String[] arr = new String[lineNumber];
		sc = new Scanner(text);
		for(int i = 0; i < lineNumber; i++){
			arr[i] = sc.next();
        }
		return arr;
	}

}
