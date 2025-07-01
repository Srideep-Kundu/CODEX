//https://www.geeksforgeeks.org/problems/fruit-into-baskets-1663137462/1

import java.util.HashMap;

class Solution3 {
    public int totalElements(int[] arr) {
        // code here
        int left = 0, right = 0, maxlen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(right < arr.length){
            if(map.containsKey(arr[right])) map.put(arr[right], map.get(arr[right])+1);
            else map.put(arr[right], 1);
            
            if(map.size() > 2){
                map.put(arr[left], map.get(arr[left])-1);
                if(map.get(arr[left])==0) map.remove(arr[left]);
                left++;
            }
            else{
                maxlen = Math.max(maxlen, right - left + 1);
            }
            right++;
        }
        return maxlen;
    }
}
