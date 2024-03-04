package section08_LinkedLists;

public class Ques16_addTwoLL {

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
	public static Node<Integer> add2LL(Node<Integer> head1,Node<Integer> head2){
		Node<Integer> newNode1 = reverse(head1);
		Node<Integer> newNode2 = reverse(head2);
		
		Node<Integer> ans = new Node<Integer>(0);
		Node<Integer> temp3 =ans;
		Node<Integer> temp1 = newNode1;
		Node<Integer> temp2 = newNode2;
		int sum=0;
		int carry=0;
		int ansData=0;
		while(temp1.next!=null||temp2.next!=null) {
			sum=carry+temp1.data+temp2.data;
			ansData = sum%10;
			carry=sum/10;
			temp3.data =ansData;
			Node<Integer> newNode = new Node<Integer>(0);
			temp3.next=newNode;
			temp1=temp1.next;
			temp2=temp2.next;
			temp3=temp3.next;
			
			
		}
		if(carry==0) {
			return reverse(ans);
		}
		else {
			Node<Integer> newNode = new Node<Integer>(carry);
			temp3.next=newNode;
			return reverse(ans);
		}
		
		return reverse(ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> head1= Node.takeInput();
		Node<Integer> head2= Node.takeInput();
		
		Node<Integer> ans= add2LL(head1,head2);
		Node<Integer> temp = ans;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}

}
