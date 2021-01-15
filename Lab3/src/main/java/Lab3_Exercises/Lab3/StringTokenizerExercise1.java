package Lab3_Exercises.Lab3;
import java.util.*;
/**
 * 
 * @author Y.K.Sai Ramya
 * To add integers in string using stringTokenizer
 *
 */
public class StringTokenizerExercise1 {
	public static  int sum(String input) {
		int number,sum=0;
	StringTokenizer str = new StringTokenizer(input, "+");
    while (str.hasMoreTokens()) {
        String temp = str.nextToken();
        number = Integer.parseInt(temp);
        System.out.println(number);
        sum = sum + number;
    }
    
    return sum;
}


	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter integers with + symbol:");
		        String string = sc.nextLine();
		       int result= sum(string);
		       System.out.println("sum of the integers is: " + result);
		       
		}
}
