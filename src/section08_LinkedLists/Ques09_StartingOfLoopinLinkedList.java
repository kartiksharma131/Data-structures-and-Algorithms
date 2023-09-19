package section08_LinkedLists;

public class Ques09_StartingOfLoopinLinkedList {
	public static int loopStart(Node<Integer> head) {
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		if(head==null||head.next==null||head.next.next==null){
			return -1;

		}
		
		while(fast.next!=null && fast.next.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
			if(fast==slow) {
				break;
			}
		}
		Node<Integer> temp = head;
		while(temp!=slow) {
			temp=temp.next;
			slow=slow.next;
		}
		return temp.data;
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
		int ans = loopStart(head);
		System.out.println(ans);
	}

}
