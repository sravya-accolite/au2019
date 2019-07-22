package com;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Maplist {

	public static void main(String[] args) {
		
		Book b1=new Book ("Beyond Religion: Ethics for a Whole World","Dalai Lama",1000);
		Book b2=new Book ("I Witness: Partial Observations","Kapil Sibal",800);
		Book b3=new Book("The Art of Living - A Guide to Contentment, Joy and Fulfilment","Dalai Lama",1100);
		Book b4=new Book ("Pax Indica: India and the world of the 21st Century","Dr. Shashi Tharoor",1200);
		Book b5=new Book("The Day I Stopped Drinking Milk","Sudha Murthy",1300);
		Book b6=new Book("The Shadow Of The Crescent Moon","Dalai Lama",1400);
		Book b7=new Book("The Hanging of Afzal Guru	","Arundhati Roy",900);
		Book b8=new Book("Kashmir: The Unwritten History","Christopher Snedden",1100);
		Book b9=new Book("For the New Generation","Kiran Bedi",1200);
		//Book b10=new Book("India - My Beloved","Dominique Lapierre",400);
		
		List<Book> l=new ArrayList<>();
		l.add(b1);
	l.add(b2);
		l.add(b3);
		l.add(b4);
		l.add(b5);
		l.add(b6);
		l.add(b7);
		l.add(b8);
		l.add(b9);
HashMap<String,Integer> h=new HashMap<>();
for(Book b:l)
{
	String s=b.getAuthorName();
	if(h.containsKey(s))
		h.put(s, h.get(s) + 1);
	else
		h.put(s, 1);	
}
//HashMap having Author Name and No of Books written greater than 2
System.out.println("Authors who have written more than 2 books:");
for (Map.Entry<String,Integer> entry : h.entrySet()) {
	if(entry.getValue()>2)
		System.out.println(entry.getKey());
}


}

}