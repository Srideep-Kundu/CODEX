//https://leetcode.com/problems/count-number-of-nice-subarrays/

class Solution6 {
    public int numberOfSubarrays(int[] nums, int k) {
        return helper(nums, k) - helper(nums, k - 1);
    }
    public int helper(int[] nums, int goal) {
        if(goal < 0) return 0;
        int left = 0, sum = 0, count = 0;
        for(int right = 0; right < nums.length; right++) {
            sum += nums[right] % 2;
            while(sum > goal){
                sum -= nums[left] % 2;
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}
