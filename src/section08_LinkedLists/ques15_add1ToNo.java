package section08_LinkedLists;

public class ques15_add1ToNo {
	public static Node<Integer> reverse(Node<Integer> head){
		Node<Integer> temp = head;
		Node<Integer> prev = null;
		Node<Integer> front=null;
		while(temp!=null) {
			front=temp.next;
			temp.next=prev;
			prev=temp;
			temp=front;
		}
		return prev;
	}
	
	public static Node<Integer> add1(Node<Integer> head){
		Node<Integer> newHead = reverse(head);
		int carry=1;
		Node<Integer> temp = newHead;
		int sum=0;
		while(temp.next!=null) {
			sum=temp.data+carry;
			temp.data= sum%10;
			carry = sum/10;
			temp=temp.next;
			
		}
		sum=temp.data+carry;
		temp.data=sum%10;
		carry=sum/10;
		if(carry>0) {
			Node<Integer> newNode = new Node<Integer>(carry);
			temp.next=newNode;
		}
		
		head = reverse(newHead);
		return head;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = Node.takeInput();
		Node<Integer> ans = add1(head);
		Node<Integer> temp = ans;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}

}
