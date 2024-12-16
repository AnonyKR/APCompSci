/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hi " + name + "!");
        System.out.print("Please type integer : ");
        int number1 = sc.nextInt();
        System.out.print("Please type another integer : ");
        sc.nextLine()
        int number2 = sc.nextInt();
        System.out.print((number1 + number2));
        String food = sc.nextLine();
	}
}