//https://leetcode.com/problems/max-consecutive-ones-iii/description/

class Solution2 {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int maxlen = 0;
        int zeroes = 0;
        while(right < nums.length){
            if(nums[right] == 0) zeroes++;
            if(zeroes > k){
                if(nums[left] == 0) zeroes--;
                left++;
            }
            else{
                int len = right - left + 1;
                maxlen = Math.max(len, maxlen);
            }
            right++;
        }
        return maxlen;
    }
}
