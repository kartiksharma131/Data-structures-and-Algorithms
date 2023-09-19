package section08_LinkedLists;

import java.util.Scanner;

public class miscQues02_insertRecursively {
	public static Node<Integer> insertRecursively(Node<Integer> head,int pos,int element){
		if(pos==0) {
			Node<Integer> newNode = new Node<Integer>(element);
			newNode.next=head;
			
			return newNode; 
		}
		Node<Integer> smallHead=insertRecursively(head.next,pos-1,element);
		head.next=smallHead;
		return head;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=Node.takeInput();
		Scanner scn = new Scanner(System.in);
		int pos=scn.nextInt();
		int element=scn.nextInt();
		head = insertRecursively(head,pos,element);
		head.printList(head);
	}

}
