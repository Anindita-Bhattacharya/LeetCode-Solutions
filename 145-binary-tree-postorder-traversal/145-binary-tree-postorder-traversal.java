class Solution {
    private final List<Integer> list = new LinkedList<>();
    
    public List<Integer> postorderTraversal(final TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            list.add(root.val);    
        }
        
        return list;
    }
}