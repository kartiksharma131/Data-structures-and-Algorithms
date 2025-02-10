package section11_treesRevision;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeNode<T> {
	T data;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode(T data) {
		this.data= data;
	}
	
	public static TreeNode takeInput(Scanner scn){
		int rootData;
		System.out.println("enter root data");
		rootData = scn.nextInt();
		if(rootData == -1) {
			return null;
		}
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		root.left = takeInput(scn);
		root.right = takeInput(scn);
		return root;
	}
	
	public static void printBinaryTree(TreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		String toBePrinted = root.data+": ";
		if(root.left!=null) {
			toBePrinted+= root.left.data +", ";
		}
		if(root.right!=null) {
			toBePrinted+= root.right.data ;
		}
		System.out.println(toBePrinted);
		printBinaryTree(root.left);
		printBinaryTree(root.right);
	}
	
	public static TreeNode<Integer> takeInputLevelWise(){
		Scanner scn = new Scanner(System.in);
		Queue<TreeNode<Integer>> pendingNodes = new LinkedList<TreeNode<Integer>>();
		System.out.println("Enter Root Data");
		int rootData = scn.nextInt();
		if(rootData == -1) {
			return null;
		}
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.add(root);
		while(!pendingNodes.isEmpty()) {
			TreeNode<Integer> front = pendingNodes.remove();
			System.out.println("enter left child of "+ front.data);
			int leftChild  = scn.nextInt();
			if(leftChild!=-1) {
				TreeNode<Integer> leftChildNode = new TreeNode<Integer>(leftChild);
				pendingNodes.add(leftChildNode);
				front.left=leftChildNode;
			}
			System.out.println("enter right child of "+ front.data);
			int rightChild  = scn.nextInt();
			if(rightChild!=-1) {
				TreeNode<Integer> rightChildNode = new TreeNode<Integer>(rightChild);
				pendingNodes.add(rightChildNode);
				front.right= rightChildNode;
			}
		}
		return root;
	}
}
