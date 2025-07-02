//https://leetcode.com/problems/longest-repeating-character-replacement/description/

class Solution4 {
    public int characterReplacement(String s, int k) {
        int left = 0, maxlen = 0, maxfreq = 0;
        int[] hash = new int[26];
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            hash[c - 'A']++;
            maxfreq = Math.max(maxfreq, hash[c - 'A']);
            int len = right - left + 1;
            if(len - maxfreq > k){
                hash[s.charAt(left) - 'A']--;
                left++;
            }
            else{
                maxlen = Math.max(maxlen, len);
            }
        }
        return maxlen;
    }
}