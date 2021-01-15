package Lab3_Exercises.Lab3;
import java.util.*;
/**
 * To check string is positive or negative
 * @author Y.K.Sai Ramya
 *
 */
public class PostiveString {
	public static boolean checkString(String string)
	{
		int length=string.length();
		if(length==0) {
			return false;
		}
		else
		{
		char []arr=string.toCharArray();
		for(int index=0;index<length-1;index++)
		{
			if(arr[index]>arr[index+1])
				return false;
		}
		return true;
	}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
	    String string=sc.next();
	    
		if(checkString(string))
	    	System.out.print("Positive string");
	    else
	    	System.out.print("Negative string");
		}
		
}
	

	


