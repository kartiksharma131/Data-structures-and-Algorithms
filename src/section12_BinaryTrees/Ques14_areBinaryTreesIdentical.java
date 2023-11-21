package section12_BinaryTrees;

import java.util.Scanner;

public class Ques14_areBinaryTreesIdentical {
	
	public static boolean isSameTree(BinaryTreeNode<Integer> root1,BinaryTreeNode<Integer> root2) {
		if(root1==null&& root2==null) {
			return true;
		}
        else if (root1 == null || root2 == null)
            return false;
		return ((root1.data==root2.data) && isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		BinaryTreeNode<Integer> root1 = BinaryTreeNode.takeInput(scn);
		BinaryTreeNode<Integer> root2 = BinaryTreeNode.takeInput(scn);
		boolean ans = isSameTree(root1,root2);
		if(ans) {
			System.out.println("identical");
		}
		else {
			System.out.println("Not identical");
		}
		
	}

}
