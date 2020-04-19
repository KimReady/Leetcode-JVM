class Solution {
    public int romanToInt(String s) {
        int prev = getNumFromRoman(s.charAt(0));
        int total = 0;

        for (int i = 1; i < s.length(); i++) {
            int next = getNumFromRoman(s.charAt(i));
            if (prev < next) {
                total -= prev;
            } else {
                total += prev;
            }
            
            prev = next;
        }
        total += prev;

        return total;
    }

    private int getNumFromRoman(char roman) {
        switch(roman) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;
        }
    }
}