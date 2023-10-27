package practice;

import java.util.LinkedList;
import java.util.Scanner;

import section08_LinkedLists.miscQues01_TakeInputLinkedList;

public class practice {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = Node.takeInput(); 
		// Node.printList(head);
		//System.out.println(Node.size(head));
		//Node<Integer> newHead = Node.deleteAtPosition(head,5);
		//int ans = Node.midPointOfll(head);
		head = Node.reverLLIteratively(head);
		Node.printList(head);
		
		
	}

}
