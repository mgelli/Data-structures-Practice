import java.util.*;

class Pair{
	int a1;
	int a2;
}

public class moveZeros {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {0, 1, 0, 3, 12};
		int element= 0;
		moveZerosToRight(nums,element);
		
		System.out.println("Using one for loop");
		printArray(nums);
		System.out.println("Using stack");
		moveZerosToRightStack(nums,element);
		
		ArrayList<Pair> list = new ArrayList<Pair>();
		List<int[]> result = new ArrayList<int[]>();
		result.add(new int[]{1,2});
		
	}
	
	private static void moveZerosToRightStack(int[] nums, int element) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		int i=0,j=0;
		while(j<nums.length){
			if(nums[j]!=element){
				stack.push(nums[j]);
			}
			j++;
		}
		
		for(i=0;i<nums.length;i++){
			System.out.print(nums[i]+",");
		}
		while(!(stack.empty())){
			int out=stack.pop();
			System.out.print(out);
		}
		
		
	}

	private static void printArray(int[] nums) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+",");
		}
		
	}

	private static void moveZerosToRight(int[] nums, int element) {
		// TODO Auto-generated method stub
		int i=0,j=0;
		while(j<nums.length){
			if(nums[j]!=element){
				nums[i]=nums[j];
				i++;
			}
			j++;
		}
		
		while(i<nums.length){
			nums[i]=element;
			i++;
		}
		
		
	}

}
