package Lab3_Exercises.Lab3;
/**
* To check string is positive or negative
* @author Y.K.Sai Ramya
*
*/
	import static org.junit.Assert.*;
	import org.junit.Before;
	import org.junit.Test;
	import java.util.*;
	public class PostiveStringTest {
		 private PostiveString ps;
			  private static String EMPTY_STRING="";
			  private static String SINGLE_STRING="A";
			  private static String DOUBLE_STRING="LN";
			  private static String ANY_NO_STRING="XAV";
			  
			@Before
			  public void setup() {
				  ps=new PostiveString  ();
			  }
				@Test
				public void testStringCalculator_GivenEmptyString_ShouldReturnAsInteger() {
					boolean result=ps.checkString(EMPTY_STRING);
					assertEquals(false,result);
				}
				
				@Test
				public void testStringCalculator_GiveSingleIntegerString_ShouldReturnInteger() {
					boolean result=ps.checkString(SINGLE_STRING);
					assertEquals(true,result);
				}
				@Test
				public void testStringCalculator_GiveIntegerString_ShouldReturnInteger() {
					boolean result=ps.checkString(ANY_NO_STRING);
					assertEquals(false,result);
					
				}
				@Test
				public void testStringCalculator_GiveAnyIntegerString_ShouldReturnInteger() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the string");
				String input=sc.next();
				boolean result =ps.checkString(input);
				if(result==true) {
					System.out.println("Positive in TestClass");
					
				}
				else {
					System.out.println("Negative in TestClass");
					
				}
				
				
			


			


}
	}
