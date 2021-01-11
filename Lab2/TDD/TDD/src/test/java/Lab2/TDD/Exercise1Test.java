/**
 * @author Ramya
 * Test Class
 * Find Second Smallest Number in array
 */
package Lab2.TDD;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exercise1Test {
	@Test
	public void getSecondSmallest_GivenEmptyIntegerArray_ShouldReturn0AsInteger() {
		int array[]= {};
		int result = Exercise1.getSecondSmallest(array);
		assertEquals(0, result);
		System.out.println("Second smallest " +result);
	}
	@Test
	public void getSecondSmallest_GivenTwoIntegersArray_ShouldReturn10AsInteger() {
		int array[]= {3,10};
		int result = Exercise1.getSecondSmallest(array);
		assertEquals(10, result);
		System.out.println("Second smallest " +result);
	
	}
	@Test
	public void getSecondSmallest_GivenThreeIntegerArray_ShouldReturnIvalidAsString() {
		int array[]= {10,11,12};
		int result = Exercise1.getSecondSmallest(array);
		assertEquals(11, result);
		System.out.println("Second smallest " +result);
	
	}
	
		
	}


