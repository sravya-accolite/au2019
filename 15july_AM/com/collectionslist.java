package com;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.*;

	public class collectionslist {

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
			Book b10=new Book("India - My Beloved","Dominique Lapierre",400);
			
			List<Book> bl=new ArrayList<>();
			bl.add(b1);
			bl.add(b2);
			bl.add(b3);
			bl.add(b4);
			bl.add(b5);
			bl.add(b6);
			bl.add(b7);
			bl.add(b8);
			bl.add(b9);
			
			
			System.out.println("List of Books,");
			for(Book b:bl)
				System.out.println(b);
			//sorting based on price using comparable
			Collections.sort(bl);
			System.out.println("Sorted List-Based on Price,using comparable");
			for(Book b:bl)
				System.out.println(b);
			//sorting based on price using comparator
			bl.sort(new bookcomparator());
			System.out.println("Sorted List-Based on Price and name,using comparable");
			for(Book b:bl)
				System.out.println(b);
			Iterator iter = bl.iterator();
			while (iter.hasNext()) {
				Book cur = (Book) iter.next();
				cur.decreaseCost();
			}
			System.out.println("Books after discount of 20%,");
			for(Book b:bl)
				System.out.println(b);
			
		}

	}
