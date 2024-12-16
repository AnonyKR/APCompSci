/* 
    Lecture note example - Classes
*/
package pkg;

public class Car{
    String color;
    double topSpeed;
    String model;
    int horsePower;
    boolean isElectric;
    
    public Car() {
        color = "black";
        topSpeed = 115.22;
        model = "Cybertruck";
        horsePower = 600;
        isElectric = true;
    }
    
    public Car(String c, double s, String m) {
        color = c;
        topSpeed = s;
        model = m;
        horsePower = 500;
        isElectric = false;
    }
    
    public void vroom() {
        int count =  0;
        while (count < topSpeed) {
            System.out.println(model + " goes vroom");
            count += 10;
        }
    }
}