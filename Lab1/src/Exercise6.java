/**
 * Difference of squares and sum
 * @author Ramya
 *
 */
import java.util.*;

public class Exercise6 {
	public static int calculateDifference(int  n) {
		int diff=0; int sq=0,sum=0;
		for(int i=0;i<=n;i++) {
		sq=sq+i*i;
		sum=sum+i;
		}
		diff=sq-sum;
		return diff;
	}
	public static void main(String args[]) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter integer");
		int n=sc.nextInt();
		int res= calculateDifference(n);
		System.out.println("Difference is " +res);
		
	}

}
