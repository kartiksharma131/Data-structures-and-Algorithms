package section08_LinkedLists;

import java.util.Scanner;

public class Node<T> {
	T data;
	Node<T> next;
	Node(T data){
		this.data=data;
		this.next=null;
	}
	public static  Node<Integer> takeInput(){
		Node<Integer> head = null;
		Node<Integer> tail =null;
		Scanner scn = new Scanner(System.in);
		int data=scn.nextInt();
		while(data!=-1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head==null) {
				
				head=newNode;
				tail=newNode;
			}
			else {
				tail.next=newNode;
				tail=tail.next;
			}
			data=scn.nextInt();
		}
		return head;
	}
	public void printList(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
