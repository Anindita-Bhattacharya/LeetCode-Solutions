/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k)
    {
        
        ArrayList<Integer>a=new ArrayList<>();
        storevalue(root,a);
        Collections.sort(a);
        return a.get(k-1);
    }
    public void storevalue(TreeNode root,ArrayList<Integer> a)
    {
        if(root==null)
            return ;
        a.add(root.val);
        storevalue(root.left,a);
        storevalue(root.right,a);
    }
}