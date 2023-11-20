package section08_LinkedLists;

public class Ques09_StartingOfLoopinLinkedList {
	public static int loopStart(Node<Integer> head) {
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		while(slow!=null && fast!=null) {
			fast=fast.next;
			if(fast!=null) {
				fast=fast.next;
			}
			slow=slow.next;
			if(slow==fast) {
				break;
			}
		}
		slow=head;
		while(slow!=fast) {
			slow=slow.next;
			fast=fast.next;
		}
		return slow.data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = Node.takeInput();
		
		int ans = loopStart(head);
		System.out.println(ans);
	}

}
