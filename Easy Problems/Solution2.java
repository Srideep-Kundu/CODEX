//https://www.geeksforgeeks.org/problems/implementing-ceil-in-bst/1

class Solution2 {
    int findCeil(TreeNode root, int key) {
        // code here
        int ceil = -1;
        while(root != null){
            if(root.val == key){
                ceil = root.val;
                return ceil;
            }
            else if(root.val < key){
                root = root.right;
            }
            else{
                ceil = root.val;
                root = root.left;
            }
        }
        return ceil;
    }
}
