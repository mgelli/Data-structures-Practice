
public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {	{9,13,5,2},
							{1,11,7,6},
							{3,7,4,1},
							{6,0,7,10}	};
		rotateMatrix(matrix);
		
	}

	private static void rotateMatrix(int[][] matrix) {
		// TODO Auto-generated method stub
		
		int n = matrix.length;
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < Math.ceil(((double) n) / 2.); j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[n-1-j][i];
				matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
				matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
				matrix[j][n-1-i] = temp;
			}
		}
		
		
		//printing matrix after rotation
		int i=0,j=0;
		System.out.println("Length of array is :"+matrix.length);
		System.out.println("          ");
		for(i=0;i<matrix.length;i++){
			for(j=0;j<matrix[i].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("  ");
		}
	}

}
