class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        int len = s.length();

        for (int i = 0; i < numRows; i++) {
            boolean fromBelow = true;
            for (int j = i; j < len;) {
                sb.append(s.charAt(j));

                int backFromBelow = 2 * ((numRows - 1 ) - i);
                int backFromAbove = 2 * i;

                if (fromBelow) {
                    j += (backFromBelow > 0) ? backFromBelow : backFromAbove;
                    fromBelow = false;
                } else {
                    j += (backFromAbove > 0) ? backFromAbove : backFromBelow;
                    fromBelow = true;
                }
            }
        }

        return sb.toString();
    }
}