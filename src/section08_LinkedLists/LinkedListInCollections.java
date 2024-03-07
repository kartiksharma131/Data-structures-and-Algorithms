package section08_LinkedLists;

import java.util.LinkedList;

public class LinkedListInCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//collections has a doubly list implementation
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println(list.size());
		list.add(20);
		list.add(30);
		list.addFirst( 10);
		list.add(0, 40);
		System.out.println(list.size());
		System.out.println(list.get(0));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		list.set(0, 400);
		list.
		System.out.println(list.get(0));
		
	}

}
