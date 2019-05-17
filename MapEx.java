import java.util.*;
public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Kumar");
		map.put(2, "sindhu");
		map.put(3, "Sisira");
		
		
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+""+ m.getValue());
		}
		map.putIfAbsent(5, "harshit");
		HashMap<Integer,String> map2 = new HashMap<Integer,String>();
		map2.put(4,"Durga");
		map2.putAll(map);
		
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		for(Map.Entry m:map2.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		map2.remove(4);
		//after removing a element
		System.out.println("after removing an element");
		for(Map.Entry m:map2.entrySet()){
			
			System.out.println(m.getKey()+" "+m.getValue());
		}
		map2.putIfAbsent(3, "Sindhu");
		System.out.println("after adding  an element");
		for(Map.Entry m:map2.entrySet()){
			
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		map2.replace(5,"Jhansi");
		System.out.println("after replacing  an element");
		for(Map.Entry m:map2.entrySet()){
			
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
