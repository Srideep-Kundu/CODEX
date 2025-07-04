//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/

public class Solution9 {
    public int shipWithinDays(int[] weights, int days) {
        int low = 1;
        int high = sum(weights);
        while(low <= high){
            int mid = high + (low - high) / 2;
            if(possible(weights, mid, days)) high = mid - 1;
            else low = mid + 1;
        }
        return low;
    }
    public int sum(int[] arr){
        int sum = 0;
        for(int element : arr){
            sum += element;
        }
        return sum;
    }
    public boolean possible(int[] arr, int capacity, int days){
        int sum = 0;
        int noOfDays = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > capacity) return false;
            sum += arr[i];
            if(sum <= capacity) continue;
            else{
                noOfDays++;
                i = i - 1;
                sum = 0;
            }
        }
        if(sum != 0) noOfDays++;
        return noOfDays <= days;
    }

} 