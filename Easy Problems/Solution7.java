//https://leetcode.com/problems/row-with-maximum-ones/description/

class Solution7 {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxSum = 0;
        int index = 0;
        for(int i = 0; i < mat.length; i++){
            int sum = 0;
            for(int j = 0; j < mat[i].length; j++){
                sum += mat[i][j];
            }
            if(sum > maxSum) {
                index = i;
                maxSum = sum;
            }
        }
        return new int[] {index, maxSum};
    }
}
