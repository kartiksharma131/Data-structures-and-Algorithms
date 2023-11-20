package Section11_Trees;

import java.util.Scanner;

public class Ques00_TreeTheory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeNode<Integer> root = new TreeNode<Integer>(1);
//		root.children.add(new TreeNode<Integer>(2));
//		root.children.add(new TreeNode<Integer>(3));
//		root.children.add(new TreeNode<Integer>(4));
//		root.children.get(1).add(new TreeNode<Integer>(5));
//		root.children.get(1).add(new TreeNode<Integer>(6));
		
		/*
		TreeNode<Integer> node1 = new TreeNode<Integer>(2);
		TreeNode<Integer> node2 = new TreeNode<Integer>(3);
		TreeNode<Integer> node3 = new TreeNode<Integer>(4);
		TreeNode<Integer> node4 = new TreeNode<Integer>(5);
		TreeNode<Integer> node5 = new TreeNode<Integer>(6);
		TreeNode<Integer> node6 = new TreeNode<Integer>(7);
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		node2.children.add(node4);
		node2.children.add(node5);
		node2.children.add(node6);
		*/
		
		//Scanner scn = new Scanner(System.in);
		//TreeNode<Integer> root = TreeNode.takeInput(scn);
		//TreeNode.printTree(root);
		
		TreeNode<Integer> root2 =  TreeNode.takeInputLevelWise();
		TreeNode.printTree(root2);
		System.out.println(TreeNode.noOfNodes(root2));
	}

}
