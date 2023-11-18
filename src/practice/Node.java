package practice;

import java.util.Scanner;

public class Node<T> {
	public T data;
	public Node<T> next;
	Node(T data){
		this.data=data;
		this.next=null;
	}
	public static Node<Integer> takeInput() {
		Scanner scn =new Scanner(System.in);
		int data=scn.nextInt();
		Node<Integer> head = null;
		Node<Integer> tail = null;
		while(data!=-1) {
			Node<Integer> newnode = new Node<>(data);
			if(head==null) {
				head=newnode;
				tail=newnode;
			}
			else {
				tail.next=newnode;
				tail=newnode;
			}
			data = scn.nextInt();
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
	public static int size(Node<Integer> head) {
		int ans=0;
		Node<Integer> temp = head;
		while(temp!=null) {
			ans++;
			temp=temp.next;
		}
		return ans;
	}
	public static Node<Integer> insertAtBeginning(Node<Integer> head, int data){
		Node<Integer> newNode = new Node<>(data);
		newNode.next=head;
		head= newNode;
		return head;
	}
	
	public static Node<Integer> insertAtGivenPosition(Node<Integer> head, int pos, int data ){
		Node<Integer> temp = head;
		Node<Integer> newNode = new Node<>(data);
		int count=0;
		if(pos==0) {
			head = insertAtBeginning(head, data);
		}
		else if(pos==size(head)) {
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next= newNode;
		}
		else {
			while(count<pos-1) {
				temp=temp.next;
				count++;
			}
			newNode.next=temp.next;
			temp.next = newNode;
		}
		return head;
	}
	
	public static Node<Integer> deleteAtBeginning(Node<Integer> head){
		head = head.next;
		return head;
	}
	public static Node<Integer> deleteAtEnd(Node<Integer> head){
		Node<Integer> temp = head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
		return head;
	}
	public static Node<Integer> deleteAtPosition(Node<Integer> head,int pos){
		Node<Integer> temp = head;
		int count =0;
		if(pos==0) {
			head= deleteAtBeginning(head);
		}
		else if(pos==size(head)-1||pos>=size(head)-1) {
			head = deleteAtEnd(head);
		}
		else {
			while(count<pos-1) {
				temp=temp.next;
				count++;
			}
			temp.next=temp.next.next;
		}
		return head;
	}
	
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
	
	public static int midPointOfll(Node<Integer> head) {
		Node<Integer> slow= head;
		Node<Integer> fast = head;
		while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
            if(fast.next!=null){
                fast=fast.next;
                
            }

        }
		return slow.data;
	}
	public static Node<Integer> reverLLIteratively(Node<Integer> head){
		Node<Integer> curr = head;
		Node<Integer> prev = null;
		Node<Integer> temp;
		while(curr!=null) {
			temp = curr.next;
			curr.next=prev;
			prev = curr;
			curr=temp;
		}
		
		return prev;
	}
	public static boolean detectLoop(Node<Integer> head) {
		if(head==null) {
			return false;
		}
		Node<Integer> slow = head;
		Node<Integer> fast =head;
		while(slow!=null &&fast!=null) {
			fast=fast.next;
			if(fast!=null) {
				fast=fast.next;
				
			}
			slow=slow.next;
			if(fast==slow) {
				return true;
			}
		}
		return false;
	}
	
}
