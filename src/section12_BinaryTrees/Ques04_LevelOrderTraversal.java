package section12_BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Ques04_LevelOrderTraversal {

	public static List<List<Integer>> levelOrderTraversal(BinaryTreeNode<Integer> root){
		List<List<Integer>> list =  new ArrayList<List<Integer>>();
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();
		if(root==null) {
			return list;
		}
		q.add(root);
		while(!q.isEmpty()) {
			int numSize = q.size();
			List<Integer> newList =new ArrayList<Integer>();
			for(int i=0;i<numSize;i++) {
				if(q.peek().left!=null) {
					q.add(q.peek().left);
				}
				if(q.peek().right!=null);{
					q.add(q.peek().right);
				}
				newList.add(q.peek().data);
			}
			list.add(newList);
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		BinaryTreeNode<Integer> root = BinaryTreeNode.takeInput(scn);
		
		List<List<Integer>> list = levelOrderTraversal(root);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
