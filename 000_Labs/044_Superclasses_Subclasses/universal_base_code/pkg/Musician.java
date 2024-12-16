/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Musician extends Performer{
	String instrument;

	public Musician() {
		this.instrument = "Cello";
	}

    public Musician(String instrument) {
        this.instrument = instrument;
    }
    
    public String getInstrument() {
        return this.instrument;
    }
    
    public void playInstrument() {
        System.out.println(this.instrument + " is played beautifully.");
    }
}

