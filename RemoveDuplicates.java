import java.util.*;
public class RemoveDuplicates {

	public static void main(String args[]){
		
		int givenArray[] = {1,1,2,3,3,4,4};
		
		int newLength=removeDuplicates(givenArray);
		
		System.out.println(newLength);
	}

	
	private static int removeDuplicates(int[] arr) {
		
		int j = 0;
		int i = 1;
	 
		while (i < arr.length) {
			if (arr[i] != arr[j]) {
				j++;
				arr[j] = arr[i];
			}
	 
	                i++;
		}
	 
		return j + 1;
}
	
}
