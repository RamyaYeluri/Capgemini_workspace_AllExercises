<<<<<<< HEAD
=======
/**
*Select color and print output
*Switch case
*/
>>>>>>> 
import java.util.Scanner;
public class Exercise2 {

	private static void signaloutput( String n)
	{
		if(n.equalsIgnoreCase("red"))
			System.out.println("stop");
		
		else 
			if(n.equalsIgnoreCase("yellow"))
			System.out.println("wait");
		else
			if(n.equalsIgnoreCase("green"))
			System.out.println("go");
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Code : ");
		String code = sc.next();
		signaloutput(code);
		sc.close();
	}
}
