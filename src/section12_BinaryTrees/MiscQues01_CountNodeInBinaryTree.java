package section12_BinaryTrees;

import java.util.Scanner;

public class MiscQues01_CountNodeInBinaryTree {

	public static int countNodes(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int ans = 1+countNodes(root.left)+countNodes(root.right);
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		BinaryTreeNode<Integer> root = BinaryTreeNode.takeInput(scn);
		int ans = countNodes(root);
		System.out.println(ans);
	}

}
