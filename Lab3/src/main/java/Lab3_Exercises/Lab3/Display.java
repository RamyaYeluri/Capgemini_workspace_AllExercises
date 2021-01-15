package Lab3_Exercises.Lab3;
/**
 * author @Y.K.Sai Ramya
 * To count number of lines,words,characters in text
 */
import java.util.*;

public class Display {
	 public static void display() {
    String input="ramya is doing # coding";
    String []words=input.split("\\s+");
    String []lines=input.split("#");
    System.out.println("No of characters = "+input.length());
    System.out.println("No of lines = "+lines.length);
    System.out.println("No of words = "+words.length);
	}
	public static void main(String[] args) {
		
		 display();
		
	}

}
