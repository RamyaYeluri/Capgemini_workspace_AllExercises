import java.util.Scanner;

/**
 * 
 * @author Ramya
 * Check power of 2
 *
 */
import java.util.*;
public class Exercise8 {
public static boolean checkNumber(int n) {
	boolean flag=true;
	if(n<=0) {
		flag=false;
	}
	while(n!=1) {
		if(n%2!=0)
			flag=false;
			n=n/2;

	}
	return flag;
}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter integer");
		int number=sc.nextInt();
		boolean res= checkNumber(number);
		System.out.println(res);
	}

	}


