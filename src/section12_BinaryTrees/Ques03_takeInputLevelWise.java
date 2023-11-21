package section12_BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ques03_takeInputLevelWise {

	public static BinaryTreeNode<Integer> takeInputLevelWise() {
		System.out.println("Enter data for the root");
		Scanner scn = new Scanner(System.in);
		int rootData=scn.nextInt();
		if(rootData==-1) {
			return null;
		}
		Queue<BinaryTreeNode<Integer>> pendingNodes= new LinkedList<BinaryTreeNode<Integer>>();
		BinaryTreeNode<Integer> root =new BinaryTreeNode<Integer>(rootData);
		pendingNodes.add(root);
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = pendingNodes.poll();
			System.out.println("Enter left child data for "+frontNode);
			int leftChildData = scn.nextInt();
			if(leftChildData!=-1) {
				frontNode.left=new BinaryTreeNode<Integer>(leftChildData); 
				pendingNodes.add(frontNode.left);
			}
			System.out.println("Enter right child data for "+frontNode);
			int rightChildData = scn.nextInt();
			if(rightChildData!=-1) {
				frontNode.right = new BinaryTreeNode<Integer>(rightChildData);
				pendingNodes.add(frontNode.right);
			}
			
		}
		return root;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		BinaryTreeNode.printTree(root);
	}

}
