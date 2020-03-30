class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        long xl = Math.abs(x);
        long res = 0;

        while (xl > 0) {
            res = res * 10 + xl % 10;
            xl /= 10;
            if (res > Integer.MAX_VALUE) {
                return 0;
            }
        }

        return (int) (isNegative ? -res : res);
    }
}
