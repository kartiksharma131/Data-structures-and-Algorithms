package section08_LinkedLists;

public class Ques10_LengthOfLoop {
	public static int loopLength(Node<Integer> head ) {
		if(head==null) {
			return 0;
		}
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		while(slow!=null&& fast!=null) {
			fast=fast.next;
			if(fast!=null) {
				fast=fast.next;
			}
			if(fast==null) {
				return 0;
			}
			slow=slow.next;
			if(fast==slow) {
				break;
			}
		}
		int ans = 1;
		fast=fast.next;
		while(fast!=slow) {
			fast=fast.next;
			ans++;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = Node.takeInput();
		
		int ans = loopLength(head);
		System.out.println(ans);
	}

}
