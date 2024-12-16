/* 
    Lecture note example - Variables (String, int, double)
*/

class LectureVariables{
    public static void main(String args[]) {
        String name = new String("Eric");
        int num = -28;
        double money = -20.0;
        System.out.println(name + " lives in TN.");
        System.out.println(name + " has " + num + " pets.");
        System.out.print(name + " has $" + money + " to feed pets.");
        System.out.print(num + money);
	}
}