package Section11_Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeInputRowWise {

	public static TreeNode<Integer> takeInputLevelWise(){
		System.out.println("Enter root data");
		Scanner scn = new Scanner(System.in);
		int rootData = scn.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		Queue<TreeNode<Integer>> pendingNodes = new LinkedList<TreeNode<Integer>>();
		pendingNodes.add(root);
		while(!pendingNodes.isEmpty()) {
			TreeNode<Integer> frontNode= pendingNodes.poll();
			System.out.println("Enter the no of children for node "+frontNode.data);
			int n = scn.nextInt();
			for(int i=0;i<n;i++) {
				System.out.println("Enter the "+(i+1)+" child for" + frontNode.data);
				int child  = scn.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(child);
				frontNode.children.add(childNode);
				pendingNodes.add(childNode);
				
			}
		}
		return root;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInputLevelWise();
	}
	
	

}
