import java.util.*;
class Book{
	int id;    
	String name,author,publisher;    
	int quantity;    
	public Book(int id, String name, String author, String publisher, int quantity) {    
	    this.id = id;    
	    this.name = name;    
	    this.author = author;    
	    this.publisher = publisher;    
	    this.quantity = quantity;    
	}    
}

public class LinkedHmEx {
			public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Book> book = new LinkedHashMap<Integer,Book>();
		Book b1= new Book(1001, "C","KC Himaya", "Gitam", 100);
		Book b2= new Book(1045, "C++","KCVB Himaya", "Lakshmi", 18);
		Book b3= new Book(102, "Java","Sun", "Gitam", 85);
		Book b4= new Book(1067, "PHP","KChkj Himaya", "Garuda", 10);
	book.put(1, b1);	
	book.put(2, b2);
	book.put(3, b3);
	book.put(4, b4);
	System.out.println("Printing elements inside book map");
	for(Map.Entry<Integer,Book> m:book.entrySet()){
		int key=m.getKey();
		Book b = m.getValue();
		System.out.println(key+"  Deatails");
		System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		
	}
	}

}
