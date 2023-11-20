package Section11_Trees;

public class Ques02_NoOfNodesInTree {

	public static int noOfNodes(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int ans=1;
		int n = root.children.size();
		for(int i=0;i<root.children.size();i++) {
			ans = ans+noOfNodes(root.children.get(i));
		}
		return ans;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = TreeNode.takeInputLevelWise();
		int ans = noOfNodes(root);
		System.out.println(ans);
	}

}
