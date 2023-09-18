package section08_LinkedLists;

import java.util.Scanner;

public class Ques04_SearchElementInLinkedList {
	public static boolean searchElement(Node<Integer> head,int element) {
		Node<Integer> temp = head;
		while(temp!=null) {
			if(temp.data==element) {
				return true;
				
			}
			temp=temp.next;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = Node.takeInput();
		Scanner scn = new Scanner(System.in);
		int element = scn.nextInt();
		boolean ans = searchElement(head,element);
		if(ans) {
			System.out.println("present");
		}
		else {
			System.out.println("Not Present");
		}
	}

}
