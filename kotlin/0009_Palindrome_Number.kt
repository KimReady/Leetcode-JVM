class Solution {
    fun isPalindrome(x: Int): Boolean {
        return when {
            x < 0 -> false
            x < 10 -> true
            else -> {
                var res = 0
                var y = x
                while (y > 0) {
                    res = res * 10 + y % 10
                    y /= 10
                }
                res == x
            }
        }
    }
}