//https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/


class Solution8 {
    public int minDays(int[] bloomDay, int m, int k) {
        int low = min(bloomDay);
        int high = max(bloomDay);
        int n = bloomDay.length;
        if(((long)m * k) > n) return -1;
        while(low <= high){
            int mid = high + (low - high)/ 2;
            boolean pos = possible(bloomDay, mid, m, k);
            if(pos) high = mid - 1;
            else low = mid + 1;
        }
        return low;

    }
    public int min(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int element : arr){
            if(element < min) min = element;
        }
        return min;
    }
    public int max(int[] arr){
        int max = 0;
        for(int element : arr){
            if(element > max) max = element;
        }
        return max;
    }
    public boolean possible(int[] arr, int day, int m, int k){
        int c = 0, noOfBouquets = 0;
        for(int element : arr){
            if(element <= day) c++;
            else {
                noOfBouquets += c / k;
                c = 0;
            }
        }
        noOfBouquets += c / k;
        return noOfBouquets >= m;
    }
}