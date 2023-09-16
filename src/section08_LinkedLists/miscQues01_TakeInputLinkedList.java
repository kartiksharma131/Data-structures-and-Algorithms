package section08_LinkedLists;

import java.util.Scanner;

public class miscQues01_TakeInputLinkedList {
	public static Node<Integer> takeInput(){
		Node<Integer> head =null;
		Scanner scn=new Scanner(System.in);
		int data=scn.nextInt();
		while(data!=-1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head==null) {
				head = newNode;
			}
			else {
				Node<Integer> temp = head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=newNode;
			}
			data=scn.nextInt();
		}
		return head;
	}
	public static Node<Integer> takeInputBetter(){
		Node<Integer> head =null;
		Node<Integer> tail =null;
		Scanner scn=new Scanner(System.in);
		int data=scn.nextInt();
		while(data!=-1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head==null) {
				head = newNode;
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
	public static void printList(Node<Integer> head) {
		Node<Integer> temp=head;
		
		while(temp!=null) {
			System.out.println(temp.data);
			
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head= takeInputBetter();
		printList(head);
	}

}
