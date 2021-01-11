/**
 * @author Ramya
 * Java Class
 * Find Second Smallest Number in array
 */package Lab2.TDD;
import java.util.Arrays;
public class Exercise1 {
static  int	getSecondSmallest( int array[]) {
	
	 int l=array.length;
	if(l==0) {
		return 0;
	}
	else {
		 Arrays.sort(array);  
		 return array[1];
	}
	
	
	
}

}