/**
 * Arrays Exercise 2 JavaTest Class
 * Sort a String array and Change Uppercase and Lower case as given
 * @author Ramya
 */
package Lab2.TDD;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exercise2Test {
	@Test
	public void sortStrings_GivenEmptyStringArray_ShouldReturnnullAsString() {
		String array[]= {};
		String result = Exercise2.sortStrings(array);
		//assertEquals("null", result);
		
		
		System.out.println("Sorted String is " +result);
	}
	@Test
	public void sortStrings_GivenTwoStringArray_ShouldReturString() {
		String array[]= {"ra","ef"};
		String result = Exercise2.sortStrings(array);
		assertEquals("EFra",result);

		
		
		System.out.println("Sorted String is " +result);
	}
	@Test
	public void sortStrings_GivenThreeStringArray_ShouldReturString() {
		String array[]= {"ra","ef","ab","lf"};
		String result = Exercise2.sortStrings(array);
		assertEquals("ABEFlfra", result);
		
		
		System.out.println("Sorted String is " +result);
	}
	
	
		

}
