package section12_BinaryTrees;

import java.util.Scanner;

public class Ques11_HeightBalancedOrNot {
	
	public static int height(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
        
    }
    public static boolean isBalanced(BinaryTreeNode<Integer> root) {
        if(root==null){
            return true;
        }
        if(Math.abs(height(root.left)-height(root.right))>1){
            return false;
        }

        boolean leftAns = isBalanced(root.left);
        boolean rightAns = isBalanced(root.right);
        if(!leftAns||!rightAns){
            return false;
        }
        return true;
        
        
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		BinaryTreeNode<Integer> root = BinaryTreeNode.takeInput(scn);
		boolean ans = isBalanced(root);
		if(ans) {
			System.out.println("height balanced");
		}
		else {
			System.out.println("not height balanced");
		}

	}

}
