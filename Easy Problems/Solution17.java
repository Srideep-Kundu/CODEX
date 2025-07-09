//https://leetcode.com/problems/rotate-string/description/

class Solution17 {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)) return true;
        for(int i = 0; i < s.length() - 1; i++){
            String str = s.substring(i + 1) + s.substring(0, i + 1);
            if(str.equals(goal)) return true;
        }
        return false;
    }
}