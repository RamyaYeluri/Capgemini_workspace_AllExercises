package Lab3_Exercises.Lab3;
/**
 * @ author Y.K.Sai Ramya
 * Replace consonant with next consonant
 */
import java.util.*;
public class ConsonantReplace {
	private static String alterString(String input)
    {
		StringBuilder sb = new StringBuilder("");
    	
    	char c;
        char[] array =input .toCharArray(); 
        int length=array.length;
        for(int i=0;i<length;i++)
        {
        	if(input.charAt(i)!='a' &&input.charAt(i)!='e' && input.charAt(i)!='i' && input.charAt(i)!='o' && input.charAt(i)!='u' && input.charAt(i)!='A' && input.charAt(i)!='E' && input.charAt(i)!='I' &&input.charAt(i)!='O' &&input.charAt(i)!='U')
        	{
        		c=(char)(array[i]+1);
        		System.out.print(c);
        	}
        	else 
        	{
        		c=array[i];
        		System.out.print(c);
        	}
        	
        	sb=sb.append(c);
        }
    	return sb.toString();
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String string = sc.nextLine();
        System.out.println("Replaced string is : " );
        alterString(string);
	    
        
       
       
		
	}

}
