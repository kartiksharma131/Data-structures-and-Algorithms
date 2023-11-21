package section12_BinaryTrees;

import java.util.Scanner;

public class Ques12_diameterOfBinaryTree {

	public static int height(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		return 1+ Math.max(height(root.left),height(root.right));
		
	}
	public static int diameter(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		int ans = leftHeight+rightHeight;
		
		int ans2 = diameter(root.left);
		int ans3= diameter(root.right);
		return Math.max(ans,Math.max(ans2,ans3));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		BinaryTreeNode<Integer> root = BinaryTreeNode.takeInput(scn);
		int ans = diameter(root);
		System.out.println("ans");
	}

}
