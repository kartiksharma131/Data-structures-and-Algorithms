package section11_treesRevision;

import java.util.Scanner;

public class BinaryTreeUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=  new Scanner(System.in);
		TreeNode<Integer> root =TreeNode.takeInputLevelWise();
		TreeNode.printBinaryTree(root);
	}

}
