package section08_LinkedLists;

import java.util.ArrayList;

public class IntroductionToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			
		}
		list.add(2,5);
		System.out.println();
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
			
		}
		list.remove(2);
		System.out.println();
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
			
		}
		list.set(1,10);
		System.out.println();
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
			
		}  
		//for each loop
		for(int element:list) {
			System.out.println(element);
		}
		
		
	}

}
