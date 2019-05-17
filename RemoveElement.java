import java.util.*;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={1,3,5,1,3,1,7,1,6};
		int elem = 1;
		int arrayLength=newLength(array,elem);
		System.out.println("Array new length is "+arrayLength);

	}

	private static int newLength(int[] array, int elem) {
		// TODO Auto-generated method stub
		int length=array.length;
		System.out.println("Array  length is "+length);
		for(int i=0;i<array.length;i++){
			if(array[i]==elem){
				length--;
			}
			
		}
		return length;
		
	}

}
