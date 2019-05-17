import java.util.*;
public class Search2DMatrix {

	public static void main(String args[]){
		int [][] matrix = {	{1, 3, 5, 7},
							{10, 11, 16, 20},
							{23, 30, 34, 50}};
		int target = 50;
		boolean result = searchIndex(matrix,target);
		System.out.println(result);
		
	}

	private static boolean searchIndex(int[][] matrix, int target) {
		// TODO Auto-generated method stub
		if(matrix == null||matrix.length==0||matrix[0].length==0){
			return false;
		}
		int m = matrix.length;
		int n = matrix[0].length;
		
		int s = 0;
		int e = m*n-1;
		while(s<=e){
			int mid = (s+e)/2;
			int midX=mid/n;
            int midY=mid%n;
            System.out.println(mid+"   "+midX+"    "+"     "+midY);
            if(matrix[midX][midY]==target){
            	return true;
            }
            else if(matrix[midX][midY]>target){
            	
            	e=mid-1;
            }
            else{
            	s = mid+1;
            }
		}
		return false;
	}

	
}
