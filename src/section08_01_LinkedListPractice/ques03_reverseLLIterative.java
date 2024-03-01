package section08_01_LinkedListPractice;

public class ques03_reverseLLIterative {

	public static Node<Integer> reverseLLIteratively(Node<Integer> head){
		Node<Integer> temp = head;
		Node<Integer> prev = null;
		Node<Integer> front = temp.next;
		while(temp!=null) {
			front = temp.next;
			temp.next=prev;
			prev=temp;
			temp=front;
		}
		return prev; 
	}
	
	public static Node<Integer> reverseLLRecursive(Node<Integer> head){
		if(head==null|| head.next==null) {
			return head;
		}
		Node<Integer> newHead= reverseLLRecursive(head.next);
		Node<Integer> front = head.next;
		front.next=head;
		head.next=null;
		return newHead;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = Node.takeInput();
		Node<Integer> reversedHead = reverseLLRecursive(head);
		Node.printList(reversedHead);
		
	}

}
