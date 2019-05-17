import java.util.*;
public class PrintPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pLength = 5;
		
		int var = 1;
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i < pLength ; i++){
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			for(int j = 0 ; j <= i ; j++ ){
				list.add(var++);
			}
			
			result.add(list);
		}
		
		
		result.remove(3);
		
		result.size();
		
		System.out.println(result);
	}
}
