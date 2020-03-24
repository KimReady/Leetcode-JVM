import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set set = new HashSet();
        int n = s.length();
        int begin = 0, end = 0;
        int ans = 0;

        while(end < n) {
            if(set.contains(s.charAt(end))) {
                set.remove(s.charAt(begin++));
            } else {
                set.add(s.charAt(end++));
                ans = Math.max(ans, end - begin);
            }
        }
        return ans;
    }
}