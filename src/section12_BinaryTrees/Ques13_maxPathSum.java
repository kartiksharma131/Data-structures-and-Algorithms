package section12_BinaryTrees;

import java.util.Scanner;

public class Ques13_maxPathSum {
	public static int maxSumPath(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int ans = maxSumPath(root.left)+root.data+maxSumPath(root.right);
		return Math.max(ans,Math.max(maxSumPath(root.left), maxSumPath(root.right)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		BinaryTreeNode<Integer> root = BinaryTreeNode.takeInput(scn);
		int ans = maxSumPath(root);
		System.out.println(ans);
	}

}
