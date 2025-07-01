//https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.HashMap;

class Solution1 {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int maxlen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(r < s.length()){
            if(map.containsKey(s.charAt(r))){
                if(map.get(s.charAt(r)) >= l){
                    l = map.get(s.charAt(r)) + 1;
                }
            }
            int len = r - l + 1;
            map.put(s.charAt(r), r);
            maxlen = Math.max(len, maxlen);
            r++;

        }

        return maxlen;

    }
}