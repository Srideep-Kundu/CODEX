//https://leetcode.com/problems/delete-node-in-a-bst/description/


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution12 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val == key) return helper(root);
        TreeNode curr = root;
        while(curr != null){
            if(key > curr.val){
                if(curr.right != null && curr.right.val == key){
                    curr.right = helper(curr.right);
                    return root;
                }
                else{
                    curr = curr.right;
                }
            }
            else {
                if(curr.left != null && curr.left.val == key){
                    curr.left = helper(curr.left);
                    return root;
                }
                else{
                    curr = curr.left;
                }
            }
        }
        return root;
    }
    public TreeNode helper(TreeNode root){
        if(root.left == null) return root.right;
        else if(root.right == null) return root.left;
        TreeNode rightChild = root.right;
        TreeNode lastRight = findLastRight(root.left);
        lastRight.right = rightChild;
        return root.left;
    }
    public TreeNode findLastRight(TreeNode root){
        if(root.right == null) return root;
        return findLastRight(root.right);
    }
}
