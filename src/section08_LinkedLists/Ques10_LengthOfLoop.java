package section08_LinkedLists;

public class Ques10_LengthOfLoop {
	public static int loopLength(Node<Integer> head ) {
		if(head==null||head.next==null||head.next.next==null) {
			return 0;
		}
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		while(fast.next!=null &&fast.next.next==null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				break;
			}
		}
		Node<Integer> temp =slow;
		int ans=1;
		temp=temp.next;
		while(temp!=slow) {
			temp=temp.next;
			ans++;
		}
		return ans;
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
		
		int ans = loopLength(head);
		System.out.println(ans);
	}

}
