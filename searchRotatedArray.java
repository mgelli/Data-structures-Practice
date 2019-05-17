
public class searchRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {4,5,6,7,0,1,2};
		int target = 0;
		int index = binarySearch(array,target);
		System.out.println("result is "+index);
	}

	private static int binarySearch(int[] array, int target) {
		// TODO Auto-generated method stub
		int left =0;
		int right = array.length-1;
		while(left<=right){
		int mid = left + (right-left)/2;
		System.out.println(mid);
		if(array[mid]==target){
			return mid;
		}
		if(array[left]<array[mid]){
			if(array[left]<=target && target<array[mid]){
				right = mid-1;
			}
			else{
				left  = mid + 1;
			}
			
		}
		else{
			if(array[mid]<target&& target<=array[right]){
                left=mid+1;
            }else{
                right=mid-1;
            }
		}
		
		}
 return 0;
	}

}
