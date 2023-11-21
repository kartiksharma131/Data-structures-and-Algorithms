package section12_BinaryTrees;

import java.util.Scanner;

public class Ques03_inOrderTraversal {

	public static void inOrderTraversal(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		inOrderTraversal(root.left);
		System.out.println(root.data);
		inOrderTraversal(root.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		BinaryTreeNode<Integer> root = BinaryTreeNode.takeInput(scn);
		inOrderTraversal(root);

	}

}
