class Solution {
    public String intToRoman(int num) {
        int[] dividers = {1000, 500, 100, 50, 10, 5, 1};
        String[] romans = {"M", "D", "C", "L", "X", "V", "I"};
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while (num > 0) {
            int target = num / dividers[idx];
            num %= dividers[idx];
            if (target == 4) {
                if (sb.length() > 0 && sb.substring(sb.length() - 1).equals(romans[idx - 1])) {
                    sb.deleteCharAt(sb.length() - 1);
                    sb.append(romans[idx]);
                    sb.append(romans[idx - 2]);
                } else {
                    sb.append(romans[idx]);
                    sb.append(romans[idx - 1]);
                }
            } else if (target > 0) {
                for (int i = 0; i < target; i++) {
                    sb.append(romans[idx]);
                }
            }
            idx++;
        }
        return sb.toString();
    }
}