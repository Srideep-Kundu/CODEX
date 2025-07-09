//https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/

class Solution15 {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = max(nums);
        while(low <= high){
            int mid = low + (high - low) / 2;
            int sum = divide(nums, mid);
            if(sum <= threshold) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
    public int max(int[] nums){
        int max = 0;
        for(int element : nums){
            max = Math.max(max, element);
        }
        return max;
    }
    public int divide(int[] nums, int mid){
        int sum = 0;
        for(int element : nums){
            sum += Math.ceil((double)element / mid);
        }
        return sum;
    }
}