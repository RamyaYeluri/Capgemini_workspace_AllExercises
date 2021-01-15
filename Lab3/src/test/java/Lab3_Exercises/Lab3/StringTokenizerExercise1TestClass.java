package Lab3_Exercises.Lab3;
/**
 * reads a line of integers and then displays each integer and the sum of all integers
 */
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StringTokenizerExercise1TestClass{
	 private StringTokenizerExercise1 st;
		  private static String EMPTY_STRING="";
		  private static String SINGLE_STRING="1";
		  private static String DOUBLE_STRING="3+9";
		  private static String ANY_NO_STRING="11+3+5+6";
		  
		@Before
		  public void setup() {
			  st=new StringTokenizerExercise1();
		  }
			@Test
			public void testStringCalculator_GivenEmptyString_ShouldReturnAsInteger() {
				int result=st.sum(EMPTY_STRING);
				assertEquals(0,result);
			}
			
			@Test
			public void testStringCalculator_GiveSingleIntegerString_ShouldReturnInteger() {
				int result=st.sum(SINGLE_STRING);
				assertEquals(1,result);
			}
			@Test
			public void testStringCalculator_GiveIntegerString_ShouldReturnInteger() {
				int result=st.sum(ANY_NO_STRING);
				assertEquals(25,result);
			}


		
	
		

}

