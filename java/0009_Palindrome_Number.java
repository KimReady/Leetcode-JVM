class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        }

        int res = 0;
        int y = x;

        while (y > 0) {
            res = res * 10 + y % 10;
            y /= 10;
        }

        return res == x;
    }
}