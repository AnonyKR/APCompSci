/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        /*
        boolean x = true;
        boolean y = false;
        //primitive data : lower case data 
        //ex) int, double, boolean, char, float, long, etc.
        boolean a = 5 > 3; //Greater than
        boolean b = 3 < 4; //Less than
        boolean c = 4 == 4; //Equal to
        boolean d = 4 != 5; //NOT Equal to
        boolean e = 3 >= 3; //Greater than or equal to
        boolean f = 4 <= 4; //Less than or equal to
        
        boolean h = ("Hello").equals("Hello"); 
        
        if ((a || b) && ((c && f) || (d || e))) {
            System.out.println("Works");
        } else if(false) {
            
        } else {
            
                
        }
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (int): ");
        int n = sc.nextInt();
        if (n > 10) {
            System.out.println("The number is greater than 10");
        } else if (n < 10) {
            System.out.println("The number is less than 10");
        } else {
            System.out.println("The number is 10");
        }
	}
}