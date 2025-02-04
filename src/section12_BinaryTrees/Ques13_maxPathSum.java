package section12_BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

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
		//Scanner scn = new Scanner(System.in);
		//BinaryTreeNode<Integer> root = BinaryTreeNode.takeInput(scn);
		//int ans = maxSumPath(root);
		//System.out.println(ans);
		
		List<Integer> salary = new ArrayList<>();
		salary.add(1000);
		salary.add(5000);
		salary.add(2000);
		salary.add(4000);
		salary.add(6000);
		Stream<Integer> str = salary.stream().filter((Integer sal)-> sal>=3000);
		List<Integer> list = str.toList();
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		long count = salary.stream().filter((Integer sal)-> sal>3000).count();
		System.out.println(count);
		
		
	}

}
