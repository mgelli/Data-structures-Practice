
public class PrintMatrixClockwise {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int[][] result= new int[n][n];
			result=	generateMatrix(n);
		//printMatrix(result);
		
	}

	private static void printMatrix(int[][] result) {
		// TODO Auto-generated method stub
		int i=0,j=0;
		System.out.println("Length of array is :"+result.length);
		System.out.println("          ");
		for(i=0;i<result.length;i++){
			for(j=0;j<result[i].length;j++){
				System.out.println(result[i][j]);
			}
			
		}
		
		
	}

	private static int[][] generateMatrix(int n) {
		// TODO Auto-generated method stub
		
		int[][] result = new int[n][n];
		int x=0;
		int y=0;
		int total = n*n;
		int step=0;
		
		for(int i=0;i<total;){
			while(y+step<n){
				i++;
				result[x][y]=i;
				System.out.println(result[x][y]);
				y++;
			}
			y--;
			x++;
			while(x+step<n){
				i++;
				result[x][y]=i;
				System.out.println(result[x][y]);
				x++;
			}
			x--;
			y--;
			while(y>=0+step){
				i++;
				result[x][y]=i;
				System.out.println(result[x][y]);
				y--;
			}
			y++;
			x--;
			step++;
			while(x>=0+step){
				i++;
				result[x][y]=i;
				System.out.println(result[x][y]);
				x--;
			}
			x++;
			y++;
		}
				
		return result;
	}

}
