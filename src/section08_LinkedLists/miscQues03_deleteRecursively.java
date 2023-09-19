package section08_LinkedLists;

import java.util.Scanner;

public class miscQues03_deleteRecursively {
	public static Node<Integer> deleteRecursively(Node<Integer> head,int position){
		if(position==0) {
			
			head=head.next;
			return head;
			
		}
		Node<Integer> smallhead=deleteRecursively(head.next, position-1);
		head.next=smallhead;
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = Node.takeInput();
		Scanner scn = new Scanner(System.in);
		int position=scn.nextInt();
		head=deleteRecursively(head,position);
		head.printList(head);
	}
 
}
