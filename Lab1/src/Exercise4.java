import java.util.*;
public class Exercise4 {
public static void main(String args[]) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter integer");
	n=sc.nextInt();
	System.out.print("Prime numbers are ");
	for(int i=0;i<=n;i++) {
		if(i%2!=0) {
			System.out.print(i+ " ");
		}
	}
}
}
