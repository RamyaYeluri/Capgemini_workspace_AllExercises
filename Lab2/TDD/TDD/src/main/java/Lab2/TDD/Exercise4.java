/**
*@Author Ramya
*Java class to remove duplicates in int array
*/
package Lab2.TDD;
import java.util.*;

public class Exercise4 {
	public static void main(String args[]) {
	int []array=getInputArray();
	array = modifyArray(array); 
	int length = array.length;
	System.out.print("Modified Array----> ");
	for(int index=0;index<length;index++) {
		System.out.print(array[index]+" ");
	}

}
static public  int[] modifyArray(int[] array) {
		Arrays.sort(array);
		int length = array.length;
		if(length==0) {
			return array;
		}
		int nextIndex = 0;
		int tempArray[]=new int[length];
        for (int currentIndex=0; currentIndex<length-1; currentIndex++){  
            if (array[currentIndex] != array[currentIndex+1]){  
                tempArray[nextIndex++] = array[currentIndex];  
            }  
        }  
        tempArray[nextIndex++] = array[length-1];  
        int modifiedArray[]=new int[nextIndex];
        for(int index=0;index<nextIndex;index++) {
        	modifiedArray[index]=tempArray[index];
        }
		return modifiedArray;
	}

	
	private static int[] getInputArray() {
		Scanner sc = new Scanner(System.in);
		int size=0;
		System.out.println("Enter the size of the array");
		size = sc.nextInt();
		int [] array = new int[size];
		System.out.println("Enter the numbers of the array");
		for(int index=0;index<size;index++) {
			array[index]=sc.nextInt();
		}
		return array;
	}


}
