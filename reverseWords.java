
public class reverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String given="THE SKY IS BLUE";
		char[] charArray= given.toCharArray();
		reverseString(charArray);
		printString(charArray);
	}

	private static void printString(char[] charArray) {
		// TODO Auto-generated method stub
		for(int i=0;i<charArray.length;i++){
			System.out.print(charArray[i]);
		}
		
	}

	private static void reverseString(char[] charArray) {
		// TODO Auto-generated method stub
		int i = 0;
		for(int j=0;j<charArray.length;j++){
			if(charArray[j]==' '){
				rotateWord(charArray,i,j-1);
				i=j+1;
			}
		}
		rotateWord(charArray,i,charArray.length-1);
		rotateWord(charArray,0,charArray.length-1);
	}

	private static void rotateWord(char[] array, int i, int j) {
		// TODO Auto-generated method stub
		while(i<j){
			char temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			i++;
			j--;
			
		}
	}

}
