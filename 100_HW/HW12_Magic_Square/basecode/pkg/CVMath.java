package pkg;

public class CVMath {	
	public static int[] specialSquare(int total) {
		int[] foundVals = new int[total];
		foundVals = getSpecialSquare(1,1,total,foundVals);
		return foundVals;
	}
	
	public static int[] getSpecialSquare(int square, int row, int timesLeft, int[] specialSquaresGot) {
		if (timesLeft == 0) {
			return specialSquaresGot;
		}
		int base = square;
		int length = row;
		while(true) {
			if(base * base == length * (length + 1) / 2) {
				int[] temp = specialSquaresGot; 
				temp[temp.length - timesLeft] = base * base;
				return getSpecialSquare(base + 1, length + 1, timesLeft - 1, temp);
			} else if (base * base > length * (length + 1) / 2) {
				length++;
			} else {
				base++;
			}
		}
	}
}
