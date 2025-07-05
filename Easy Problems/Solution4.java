//https://leetcode.com/problems/insert-into-a-binary-search-tree/description/

class Solution4 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) return new TreeNode(val);
        TreeNode curr = root;
        while(curr != null){
            if(val < curr.val){
                if(curr.left != null) curr = curr.left;
                else {
                    curr.left = new TreeNode(val);
                    return root;
                }
            }
            else{
                if(curr.right != null) curr = curr.right;
                else{
                    curr.right = new TreeNode(val);
                    return root;
                }
            }   
        }
        return root; 
    }
}