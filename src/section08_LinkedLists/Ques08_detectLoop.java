package section08_LinkedLists;

import practice.Node;

public class Ques08_detectLoop {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = Node.takeInput();
		boolean ans = detectLoop(head);
		if(ans) {
			System.out.println("loop present");
		}
		else {
			System.out.println("not present");
		}
	}

}
