class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String temp = prefix;
            char[] chars = strs[i].toCharArray();
            int len = Math.min(temp.length(), chars.length);
            int j = 0;
            for (; j < len; j++) {
                if (temp.charAt(j) != chars[j]) {
                    break;
                }
            }
            prefix = (j > 0) ? temp.substring(0, j) : "";
        }
        return prefix;
    }
}