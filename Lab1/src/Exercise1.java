/**
 * sum of cubes of digits
 * @author Ramya
 *
 */
import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);   
		 int number= s.nextInt();
		int sum=0;

		while(number!=0) 
		{
		int digit= number%10;
		sum=sum+digit*digit*digit; 
		
		number=number/10; 
		}
		System.out.println("The sum of cubes of digits of the given number is " +sum);


		


	}

}
