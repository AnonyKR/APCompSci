/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void printAnimals() {
        System.out.println("  __      _\no'')}____//\n `_/      )\n (_(_/-(_/");
    }
    
    public static void greeting(String name) {
        System.out.println("Hello, " + name);
    }
    
    public static double raisePay(double pay, int raisePercent) {
        return (pay * (raisePercent + 100) / 100);
    }
    
    public static void main(String args[]) {
        for(int i = 0; i < 5; i++) {
            //printAnimals();
        }
        //greeting(new String("Mike"));
        System.out.println(raisePay(1000,10));
	}
}