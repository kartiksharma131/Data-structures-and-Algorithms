package section12_BinaryTrees;

import java.util.Scanner;

public class Ques10_HeightOfBinaryTree {
	public static int heightBinaryTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
			
		}
		int ans = 1+Math.max(heightBinaryTree(root.left),heightBinaryTree(root.right));
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		BinaryTreeNode<Integer> root = BinaryTreeNode.takeInput(scn);
		int height = heightBinaryTree(root);
		System.out.println(height);
	}

}
