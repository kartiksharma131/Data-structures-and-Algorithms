package section08_LinkedLists;

import java.util.Scanner;

public class Ques02_DeleteNode {
	public static Node<Integer> takeInput(){
		Scanner scn = new Scanner(System.in);
		Node<Integer> head= null;
		Node<Integer> tail=null;
		int data=scn.nextInt();
		while(data!=-1) {
			Node<Integer> newNode=new Node<Integer>(data);
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
	public static void printList(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static Node<Integer> deleteNode(Node<Integer> head,int data){
		if(head.data==data) {
			head=head.next;
			return head;
		}
		else {
			Node<Integer> curr=head.next;
			Node<Integer> prev = head;
			while(curr.data!=data) {
				curr=curr.next;
				prev=prev.next;
			}
			prev.next=curr.next;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		head = deleteNode(head,5);
		printList(head);
		
	}

}
