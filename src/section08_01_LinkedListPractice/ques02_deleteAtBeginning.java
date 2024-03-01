package section08_01_LinkedListPractice;

public class ques02_deleteAtBeginning {

	public static Node<Integer> deleteAtBeginning(Node<Integer> head){
		return head.next;
	}
	
	public static Node<Integer> deleteLastNode(Node<Integer> head){
		Node<Integer> temp = head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next=null;
		return head;
	}
	
	public static int lengthOfLL(Node<Integer> head) {
		Node<Integer> temp = head;
		int length=0;
		while(temp!=null) {
			length++;
			temp=temp.next;
		}
		return length;
	}
	
	public static boolean searchElement(Node<Integer> head, int element) {
		Node<Integer> temp = head;
		while(temp!=null) {
			if(temp.data==element) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	
	public static int middleOfLL(Node<Integer> head) {
		Node<Integer> fast = head;
		Node<Integer> slow =head;
		while(fast.next!=null) {
			
			fast=fast.next;
			if(fast.next!=null) {
				fast=fast.next;
			}
			slow=slow.next;
		}
		return slow.data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = Node.takeInput();
		//Node<Integer> newHead = deleteAtBeginning(head);
		
		//newHead = deleteLastNode(newHead);
		//newHead.printList(newHead);
		//int length = lengthOfLL(newHead);
		//System.out.println(length);
		
		int ans = middleOfLL(head);
		System.out.println(ans);

	}

}
