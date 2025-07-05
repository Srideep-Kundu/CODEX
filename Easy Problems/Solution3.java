//https://www.geeksforgeeks.org/problems/floor-in-bst/1

class Solution3 {
    public static int floor(TreeNode root, int x) {
        
        int floor = -1;
        while(root != null){
            if(root.val == x){
                floor = root.val;
                return floor;
            }
            else if(root.val > x){
                root = root.left;
            }
            else{
                floor = root.val;
                root = root.right;
            }
        }
        return floor;
    }
}
