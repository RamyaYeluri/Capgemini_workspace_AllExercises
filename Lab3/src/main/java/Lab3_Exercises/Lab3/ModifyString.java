
		/**
		 * Accepts a number and modify it as per the requirement 

		 * @author Y.K.Sai Ramya
		 */
package Lab3_Exercises.Lab3;
import java.util.Scanner;
import java.lang.Math; 

public class ModifyString {
	private static int modifyNumber(String string)
	{
		StringBuilder st = new StringBuilder("");
		char []ch=string.toCharArray();
		int len=string.length();
		int first,second,result;
		for(int i=0;i<len-1;i++)
		{
			first=(int)(ch[i]);
			second=(int)(ch[i+1]);
			result=Math.abs(first-second);
			st=st.append(result);
		}
		return Integer.parseInt(st.toString());
	}


			public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter string");
			 String str=sc.next();
			 System.out.print("Result is: " +modifyNumber(str));
				}
		    
			}

		