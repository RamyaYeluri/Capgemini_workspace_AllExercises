/**
 * 
 * @author Ramya
 *Sum of numbers divisible by 3 or 5
 */
import java.util.*;
public class Exercise5 {
	
	public static int calculateSum(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
		if((i%3==0)||(i%5==0)){
			sum=sum+i;
			
		}}
		return sum;
		
				
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter integer");
		int n=sc.nextInt();
		
		System.out.println("Sum is " +calculateSum(n));
		
		
		
		// TODO Auto-generated method stub

	}

}
