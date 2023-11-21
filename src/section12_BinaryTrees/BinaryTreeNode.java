package section12_BinaryTrees;

import java.util.Scanner;

public class BinaryTreeNode<T> {
	public T data;
	public BinaryTreeNode<T> left;
	public BinaryTreeNode<T> right;
	
	public BinaryTreeNode(T data){
		this.data = data;
		this.left=null;
		this.right=null;
	}
	
	public static BinaryTreeNode<Integer> takeInput(Scanner scn){
		System.out.println("Enter root data");
		int rootData = scn.nextInt();
		if(rootData==-1) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		root.left=takeInput(scn);
		root.right=takeInput(scn);
		
		return root;
		
		
	}
	
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		String toBePrinted = root.data +": ";
		if(root.left!=null) {
			toBePrinted+="L"+root.left.data+", ";
		}
		if(root.right!=null) {
			toBePrinted+="R"+root.right.data;
		}
		System.out.println(toBePrinted);
		printTree(root.left);
		printTree(root.right);
	}
	
}
