package section08_LinkedLists;

import java.util.Scanner;

public class Ques01_InsertNode {
	public static Node<Integer> takeInput(){
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
	public  static int size(Node<Integer> head) {
		Node<Integer> temp = head;
		int ans=0;
		while(temp!=null) {
			ans++;
			temp=temp.next;
		}
		return ans;
	}
	public static void printList(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static Node<Integer> insertNode(Node<Integer> head,int data,int position) {
		Node<Integer> newNode= new Node<Integer>(data);
		Node<Integer> temp=head;
		 
		int i=0;
		if(position==0) {
			newNode.next=head;
			head=newNode;
			return head;
		}
		while(i<position-1) {
			temp=temp.next;
			i++;
		}
		
		newNode.next=temp.next;
		temp.next=newNode;
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		Scanner scn = new Scanner(System.in);
		int data=scn.nextInt();
		int position=scn.nextInt();
		head = insertNode(head,data,position);
		printList(head);
		
		
		
	}

}
