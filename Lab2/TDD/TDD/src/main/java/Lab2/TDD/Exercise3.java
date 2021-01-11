/**
 * Arrays Exercise 3 JavaTest Class
 * Reverse a Integer array and Sort it
 * @author Ramya
 */
package Lab2.TDD;
import java.util.Arrays;
public class Exercise3 {
			
		static public int getSorted(int[] array) {
			int length = array.length;
			if(length==0) {
				return 0;
			}
			else {
			for(int index=0;index<length;index++) {
				StringBuilder sb = new StringBuilder();
				sb.append(array[index]+"");
				sb.reverse();
				array[index]=Integer.parseInt(sb.toString());
			}
			Arrays.sort(array);
			StringBuilder sb1 = new StringBuilder();
			
			for(int i: array) {
				sb1.append(i);
			}
			//return array;
		
			//int array
			return Integer.parseInt(sb1.toString()) ;
		}
}
}


	


