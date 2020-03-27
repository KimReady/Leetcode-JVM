class Solution {
    private int len;
    private char[] chars;
    public String longestPalindrome(String s) {
        String answer = "";
        len = s.length();
        chars = s.toCharArray();

        for (int middle = 0; middle < len; middle++) {
            String oddCase = getPalindrome(s, middle, middle);
            String evenCase = getPalindrome(s, middle, middle + 1);

            answer = (oddCase.length() > answer.length()) ? oddCase : answer;
            answer = (evenCase.length() > answer.length()) ? evenCase : answer;
        }
        return answer;
    }

    private String getPalindrome(String s, int left, int right) {
        for (; 0 <= left && right < len; left--, right++) {
            if (chars[left] != chars[right]) break;
        }
        return s.substring(left + 1, right);
    }
}