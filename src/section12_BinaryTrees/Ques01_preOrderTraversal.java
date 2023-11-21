package section12_BinaryTrees;

import java.util.Scanner;

public class Ques01_preOrderTraversal {

	public static void preOrderTraversal(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data+" ");
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		BinaryTreeNode<Integer> root = BinaryTreeNode.takeInput(scn);
		preOrderTraversal(root);
	}

}
