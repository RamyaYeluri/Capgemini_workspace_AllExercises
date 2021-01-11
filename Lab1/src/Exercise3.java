
/**
 * 
 * @author Ramya 
 *Fibanocci recursive and non recursive
 */
import java.util.*;
public class Exercise3 {
	public static int fib(int j) {
		   if ((j == 0) || (j == 1))
		      return j;
		   else
		      return fib(j - 1) + fib(j - 2);
		}
	 
	public static void main(String args[]) {;
	
		int n1=0,n2=1,n3,i,n;    
		 
		 Scanner sc =new Scanner(System.in);
		 System.out.print("enter value"); 
		 n=sc.nextInt();
		 
		 System.out.println("Non-recursive " ); 
		 System.out.println(n2);
		 
		 for(i=2;i<n;++i)
		 {    
		  n3=n1+n2;    
		  System.out.println(n3+ " ");    
		  n1=n2;    
		  n2=n3;    
		 } 
		 System.out.println("Recursive " ); 
		 for(int j = 1; j < n; j++){
				System.out.println(fib(j) +" ");
			}
		 
	}

}
