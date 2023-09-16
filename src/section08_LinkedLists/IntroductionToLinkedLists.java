package section08_LinkedLists;

public class IntroductionToLinkedLists {
	public static void printList(Node<Integer> head) {
		Node<Integer> temp=head;
		
		while(temp!=null) {
			System.out.println(temp.data);
			
			temp=temp.next;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer>  node1 = new Node<Integer>(10);
		//System.out.println(node1.data);
		//System.out.println(node1.next);
		Node<Integer> node2 = new Node<Integer>(20);
		Node<Integer> node3 = new Node<Integer>(30);
		Node<Integer> node4 = new Node<Integer>(40);
		//System.out.println(node2.data);
		//System.out.println(node2.next);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		Node<Integer> head=node1;
		printList(head);
		
		//System.out.println(node1.next.data);
	}

}
