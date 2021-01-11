
/**
 * Arrays Exercise 3 Java Class
 * Reverse a Integer array and Sort it
 * @author Ramya
 */
package Lab2.TDD;
 
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class Exercise3Test {
	
	
	

	
	@Test
	public void getSorted_GivenEmptyIntegerArray_ShouldReturn0AsInteger() {
		int array[]= {};
		int result = Exercise3.getSorted(array);
		assertEquals(0, result);
		
		System.out.println("Sorted  " +result);
	}
	@Test
	public void getSorted_GivenOneIntegerArray_ShouldReturnInteger() {
		//int length = 0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int length=sc.nextInt();
		int []array2 = new int[length] ;
		for(int i=0; i<length; i++) {
			System.out.println("Enter the value");
			array2[i]=sc.nextInt();
		}
		System.out.println("Array is "+ Arrays.toString(array2));
		//int array[]= {21};
		int result = Exercise3.getSorted(array2);
		//assertEquals(12, result);
		System.out.println("Sorted" +result);
	}
	@Test
	public void getSorted_GivenTwoIntegerArray_ShouldReturn0AsInteger() {
		int array[]= {32,12};
		int result = Exercise3.getSorted(array);
	
		Arrays.sort(array);
		StringBuilder sb1 = new StringBuilder();
		
		for(int i: array) {
			sb1.append(i);
		}
		
		int ar=Integer.parseInt(sb1.toString()) ;
	  assertEquals(ar,result);
		System.out.println("Sorted" +result);
	}
}
