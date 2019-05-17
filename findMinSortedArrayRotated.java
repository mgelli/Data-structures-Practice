
public class findMinSortedArrayRotated {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {4,5,6,7,0,1,2};
		
		int index = findMin(array);
		System.out.println("result is "+index);

	}

	private static int findMin(int[] array) {
		// TODO Auto-generated method stub
		if(array==null || array.length==0)
	        return -1;
	 
	    int i=0; 
	    int j=array.length-1;
	 
	    while(i<=j){
	        if(array[i]<=array[j])
	            return array[i];
	 
	        int m=(i+j)/2;
	 
	        if(array[m]>=array[i]){
	            i=m+1;
	        }else{
	            j=m;
	        }
	    }
	 
	    return -1;
	}
	
}
