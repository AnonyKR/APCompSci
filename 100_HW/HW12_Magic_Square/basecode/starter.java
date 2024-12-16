import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter how many magic squares you want to see: ");
		int[] specialSquares = CVMath.specialSquare(sc.nextInt());
		for (int i = 0; i < specialSquares.length; i++) {
			System.out.println(specialSquares[i]);
		}
	}
}
