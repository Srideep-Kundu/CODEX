//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/

class Solution11 {
    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0;
        int rsum = 0;
        for(int i = 0; i < k; i++){
            lsum += cardPoints[i];
        }
        int size = cardPoints.length - 1;
        int max = lsum;
        for(int i = 0; i < k; i++){
            lsum -= cardPoints[k - 1 - i];
            rsum += cardPoints[size--];
            max = Math.max(max, lsum + rsum);
        }
       
        return max;
    }
}