import java.util.*;
public class IsomorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="foo",s2="egg";
		boolean valid =validIsomorphic(s1,s2);

		System.out.println(valid);
	}

	private static boolean validIsomorphic(String s1, String s2) {
		// TODO Auto-generated method stub
		if(s1.length()!=s2.length())
			return false;
		HashMap<Character,Character> map1 = new HashMap<>();
		HashMap<Character,Character> map2 = new HashMap<>();
		for(int i=0;i<s1.length();i++){
			char charS1 = s1.charAt(i);
			char charS2 = s2.charAt(i);
			
			if(map1.containsKey(charS1)){
				if(charS2 !=map1.get(charS1)){
					return false;
				}
			}
			else{
				if(map2.containsKey(charS2)){
					return false;
				}
				map1.put(charS1, charS2);
				map2.put(charS2, charS1);
			}
		}
		
		
		return true;
	}

	
}
