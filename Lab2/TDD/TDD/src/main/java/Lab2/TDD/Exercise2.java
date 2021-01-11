
/**
 * Arrays Exercise 2 Java Class
 * Sort a String array and Change Uppercase and Lower case as given
 * @author Ramya
 */
 package Lab2.TDD;
import java.util.Arrays;
public class Exercise2 {
	public static String sortStrings(String[] arr) {
		Arrays.sort(arr);
		int size = arr.length;
		String ans[] = new String[size];
		if(size%2==0) {
			for(int i=0;i<size/2;i++) {
				ans[i] = arr[i].toUpperCase();
			}
			for(int i=size/2;i<size;i++) {
				ans[i] = arr[i].toLowerCase();
			}
		}
		
			else {
				for(int i=0;i<size/2+1;i++) {
					ans[i] = arr[i].toUpperCase();
				}
				for(int i=size/2+1;i<size;i++) {
					ans[i] = arr[i].toLowerCase();
				}
			}
		StringBuffer sb = new StringBuffer();
	      for(int i = 0; i <size; i++) {
	         sb.append(ans[i]);
	      }
	      String str = sb.toString();
	      return str;
		}

}
	
