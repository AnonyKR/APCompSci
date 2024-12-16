/* 
    Lecture note example - String Methods!
    length() - Returns the number of characters in a String
    substring(int) - Starts from the given int and returns to the end of the String
    substring(int, int) - Starts from the first int and returns until the last int (NOT including last int index)
    indexOf(String) - Returns the index of the first instance of a given String
    indexOf(String, int) - Returns the index of the first instance of a given String STARTING at the int index given
*/
import java.util.*;

class LectureStringMethods{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a sentence");
        String words = sc.nextLine();
        while(words.contains(" ")) {
            int spaceLoc = words.indexOf(" ");
            System.out.println(words.substring(0, spaceLoc));
            words = words.substring(spaceLoc + 1);
        }
        System.out.println(words);
	}
}