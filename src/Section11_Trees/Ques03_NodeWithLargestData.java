package Section11_Trees;

public class Ques03_NodeWithLargestData {

	public static int nodeWithLargestData(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int ans = root.data;
		int n = root.children.size();
		for(int i=0;i<n;i++) {
			if(root.children.get(i).data>ans) {
				int smallAns = nodeWithLargestData(root.children.get(i));
				if(smallAns>ans) {
					ans =smallAns;
				}
				
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = TreeNode.takeInputLevelWise();
		int ans = nodeWithLargestData(root);
		System.out.println(ans);
	}

}
