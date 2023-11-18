package section08_LinkedLists;

import practice.Node;

public class Ques05_MidPointOfLinkedList {
	public static Node<Integer> midPoint(Node<Integer> head){
		Node<Integer> slow= head;
		Node<Integer> fast = head;
		while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
            if(fast.next!=null){
                fast=fast.next;
                
            }

        }
		return slow;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head= Node.takeInput();
		Node<Integer> mid = midPoint(head);
		System.out.println(mid.data);

	}

}
