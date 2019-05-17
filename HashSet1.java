import java.util.*;
public class HashSet1 {
	
	public static void main (String args[]){
		HashSet<String> set = new HashSet<String>();
			
		set.add("Ravi");
		set.add("Vijay");
		set.add("Hema");
		set.add("Amani");
		
		System.out.println("Elements inside set are "+ set);
		set.remove("Hema");
		
		System.out.println("Elements inside set after removing an element "+ set);
		HashSet<String> set2 = new HashSet<String>();
		set2.add("Ajay");
		set2.add("gourav");
		
		set.addAll(set2);
		
		System.out.println("Elements inside set after combing both sets"+set);
		
		set.removeAll(set2);
		System.out.println("Elements inside set removing both sets"+set);
		
		set.removeIf(str -> str.contains("Vijay") );
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println("Remaining elements in set are" +itr.next());
		}
		
	}
}
