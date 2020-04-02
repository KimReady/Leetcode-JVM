class Solution {
    public int myAtoi(String _str) {
        String str = _str.trim();
        if (str.isEmpty()) {
            return 0;
        }

        char[] chars = str.toCharArray();
        int sign = 0;
        if (!isNumeric(chars[0])) {
            if (str.length() == 1) {
                return 0;
            } else if (chars[0] == '-') {
                sign = -1;
            } else if (chars[0] == '+') {
                sign = 1;
            } else {
                return 0;
            }
        }

        int end = (sign != 0) ? 1 : 0;
        int res = 0;
        int beforeMax = Integer.MAX_VALUE / 10;
        while (end < chars.length && isNumeric(chars[end])) {
            int num = chars[end] - '0';
            if (res > beforeMax) {
                return (sign < 0) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            } else if (res == beforeMax) {
                if (sign < 0 && num > 8) {
                    return Integer.MIN_VALUE;
                } else if (sign >= 0 && num > 7) {
                    return Integer.MAX_VALUE;
                }
            }
            res = (res * 10) + num;
            end++;
        }

        return (sign < 0) ? -res : res;
    }

    private boolean isNumeric(char ch) {
        return '0' <= ch && ch <= '9';
    }
}