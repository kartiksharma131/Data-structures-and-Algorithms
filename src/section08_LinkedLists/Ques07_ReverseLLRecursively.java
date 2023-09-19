package section08_LinkedLists;

public class Ques07_ReverseLLRecursively {
	public static Node<Integer> reverseRecursively(Node<Integer> head){
		if(head==null||head.next==null) {
			return head;
		}
		Node<Integer> reversedTail =head.next;
		Node<Integer> finalHead = reverseRecursively(head.next);
		reversedTail.next=head; 
		head.next=null;
		return finalHead;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = Node.takeInput();
		head = reverseRecursively(head);
		head.printList(head);

	}

} 
