package section12_BinaryTrees;

import java.util.Scanner;

public class Ques13_maxPathSum {
	public static int maxPathDown(BinaryTreeNode<Integer> root, int [] maxi) {
		if(root==null) {
			return 0;
		}
		int left = Math.max(0, maxPathDown(root.left, maxi));
		int right = Math.max(0, maxPathDown(root.right, maxi));
		maxi[0] = Math.max(maxi[0], right+left+root.data);
		return Math.max(left,right)+root.data;
	}
	public static int maxSumPath(BinaryTreeNode<Integer> root) {
		int [] maxi = new int[1];
		maxPathDown(root,maxi);
		return maxi[0];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		BinaryTreeNode<Integer> root = BinaryTreeNode.takeInput(scn);
		int ans = maxSumPath(root);
		System.out.println(ans);
	}

}
