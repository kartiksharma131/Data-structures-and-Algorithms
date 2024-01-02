package Section11_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeNode<T> {
	public T data;
	public ArrayList<TreeNode<T>> children;
	
	public TreeNode(T data) {
		this.data=data;
		children = new ArrayList<TreeNode<T>>();
	}

	public static TreeNode<Integer> takeInput(Scanner scn) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter next node data");
		int n=scn.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter the number of children");
		int children = scn.nextInt();
		for(int i=0;i<children;i++) {
			TreeNode<Integer> child = takeInput(scn);
			root.children.add(child);
		}
		
		return root;
	}
	public static void printTree(TreeNode<Integer> root) {
		String s = root.data +":";
		for(int i=0;i<root.children.size();i++) {
			s=s+root.children.get(i).data + ',' ;
			
			
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++) {
			printTree(root.children.get(i));
		}
		
	}
	
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
	
}
