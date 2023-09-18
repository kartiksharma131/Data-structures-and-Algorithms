package section08_LinkedLists;

public class Ques03_LengthOfLinkedList {
	public static int getLength(Node<Integer> head) {
		int ans=0;
		Node<Integer> temp = head;
		while(temp!=null) {
			ans++;
			temp=temp.next;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=Node.takeInput() ;
		int length = getLength(head);
		System.out.println(length);
	}

}
