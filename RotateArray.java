import java.util.*;
public class RotateArray{
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateArray rArray = new RotateArray();
		int arr[] = {1,2,3,4,5,6,7};
		int k=3;
		rotateArray(arr,k);
		printArray(arr);
		

	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		System.out.print("Elements in the array are  [");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
			
		}
		System.out.print("]");
	}

	private static void rotateArray(int intArray[], int k) {
		// TODO Auto-generated method stub
		int a = intArray.length-k;
		reverse(intArray,0,a-1);
		reverse(intArray,a,intArray.length-1);
		reverse(intArray,0,intArray.length-1);
		
		
		
	}

	private static void reverse(int[] intArray, int left, int right) {
		// TODO Auto-generated method stub
		
		
		while(left<right){
			int temp=intArray[left];
			intArray[left]=intArray[right];
			intArray[right]=temp;
			left++;
			right--;
		}
	}

}
