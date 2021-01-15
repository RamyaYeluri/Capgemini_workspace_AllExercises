package Lab3_Exercises.Lab3;
import java.util.*;
/**
 * 
 * @author Y.K.Sai Ramya
 * To print mirror image of string
 *
 */
public class MirrorImage {
	public static String getImage(String input) {
		String output=null;
		StringBuilder sb=new StringBuilder(input);  
	    sb.reverse();   
	String	reverse=sb.toString();
	output=input+"|"+reverse;
		return output;
		
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String string = sc.nextLine();
        String image=getImage(string);
        System.out.println("Mirror image is " +image);
	}

}
