import java.util.Scanner;

/**
 * 
 * @author Ramya
 *Number is increasing order
 */
public class Exercise7 {
	public static boolean checkNumber(int number) {
		int n1=0;
		boolean flag=true;
			n1 = number % 10;
		    number = number/10;
		      while(number>0){
		       if(n1 <= number % 10){  
		               flag=false; 
		              // break;
			
		}
		         
		           n1 = number % 10;
			       number = number/10;
		       
			         
		       }
		       return flag;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter integer");
		int number=sc.nextInt();
		boolean res= checkNumber(number);
		System.out.println(res);
	}

}
