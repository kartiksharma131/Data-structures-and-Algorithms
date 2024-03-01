package section08_01_LinkedListPractice;

public class ques01_insertNodeAtBeginning {
	public static Node<Integer> insertAtbeginning(int data, Node<Integer> head) {
		Node<Integer> newNode = new Node<Integer>(data);
		newNode.next = head;
		head=newNode;
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = Node.takeInput();
		int n = 10;
		Node<Integer> newHead = insertAtbeginning(n,head);
		Node.printList(newHead);
	}

}
