package section08_LinkedLists;

public class Ques11_paliindromeLinkedListOrNot {
	public static Node<Integer> reverse(Node<Integer> head){
		Node<Integer> curr=head;
		Node<Integer> temp;
		Node<Integer> prev=null ;
		while(curr!=null) {
			temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr= temp;
			
		}
		return prev;
	}
	public static boolean pallindromeOrNot(Node<Integer> head){
		Node<Integer> slow = head;
		Node<Integer> fast = head;
		while(fast.next!=null &&fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		
		
		slow.next=reverse(slow.next);
		slow=slow.next;
		Node<Integer> dummy=head;
		while(slow!=null) {
			if(slow.data==dummy.data) {
				slow=slow.next;
				dummy=dummy.next;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = Node.takeInput();
		
		boolean ans = pallindromeOrNot(head);
		if(ans) {
			System.out.println("pallindrome");
		}
		else {
			System.out.println("Not pallindrome");
		}
		
		
	}

}
