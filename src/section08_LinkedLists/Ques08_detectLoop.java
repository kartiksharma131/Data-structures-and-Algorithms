package section08_LinkedLists;

public class Ques08_detectLoop {
	public static boolean detectLoop(Node<Integer> head) {
		Node<Integer> fast = head;
		Node<Integer> slow=head;
		while(fast.next!=null && fast.next.next!=null) {
			fast=fast.next.next;
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
		Node<Integer> temp1=head;
		Node<Integer> temp2=head;
		int i=3;
		int j=0;
		while(j<i) {
			temp1=temp1.next;
			j++;
		}
		while(temp2.next!=null) {
			temp2=temp2.next;
		}
		temp2.next=temp1;
		boolean ans = detectLoop(head);
		if(ans) {
			System.out.println("loop present");
		}
		else {
			System.out.println("not present");
		}
	}

}
