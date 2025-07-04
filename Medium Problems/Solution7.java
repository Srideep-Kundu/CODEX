//https://leetcode.com/problems/koko-eating-bananas/description/


public class Solution7 {

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = max(piles);
        while(low <= high){
            int mid = high + (low - high) / 2;
            int time = hourlyTime(piles, mid);
            if(time <= h) high = mid - 1;
            else low = mid + 1;
        }
        return low;

    }

    public int max(int[] arr){
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= max) max = arr[i];
        }
        return max;
    }

    public int hourlyTime(int[] arr, int k){
        int time = 0;
        for(int element : arr){
            time += (int)Math.ceil((double)element / k);
        }
        return time;
    }

}

