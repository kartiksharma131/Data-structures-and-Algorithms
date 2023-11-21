package section12_BinaryTrees;

import java.util.Scanner;

public class Ques02_postOrderTraversal {

	public static void postOrderTraversal(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.println(root.data+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		BinaryTreeNode<Integer> root = BinaryTreeNode.takeInput(scn);
		postOrderTraversal(root);
	}

}
