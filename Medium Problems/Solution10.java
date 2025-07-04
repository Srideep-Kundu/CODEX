//https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/

class Solution10 {
    public int numberOfSubstrings(String s) {
        int[] lastSeen = {-1, -1, -1};
        int c = 0;
        for(int i = 0; i < s.length(); i++){
            lastSeen[s.charAt(i) - 'a'] = i;
            c += 1 + Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2]));
        }
        return c;
    }
}
