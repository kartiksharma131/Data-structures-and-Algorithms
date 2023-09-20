package section08_LinkedLists;

public class Ques14_deleteMiddleNode {
	public static Node<Integer> deleteMiddle(Node<Integer> head){
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		Node<Integer> prev=null;
		while(fast.next!=null&&fast.next.next!=null) {
			prev=slow;
			slow=slow.next;
			fast=fast.next.next;
		}
		prev.next=slow.next;
		slow.next=null;
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head =  Node.takeInput();
		head =deleteMiddle(head);
		head.printList(head);
	}

}
