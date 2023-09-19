package section08_LinkedLists;

public class Ques06_ReverseLLIteratively {
	public static Node<Integer> reverseIterative(Node<Integer> head){
		Node<Integer> curr =head;
		Node<Integer> prev = null;
		Node<Integer> temp;
		while(curr!=null) {
			temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		return prev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = Node.takeInput();
		head = reverseIterative(head);
		head.printList(head);

	}

}
