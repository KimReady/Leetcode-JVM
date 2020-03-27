class Solution {
    fun longestPalindrome(s: String): String {
        var answer = ""
        for (middle in s.indices) {
            val oddCase = s.getPalindrome(middle, middle)
            val evenCase = s.getPalindrome(middle, middle + 1)
            answer = if (oddCase.length > answer.length) oddCase else answer
            answer = if (evenCase.length > answer.length) evenCase else answer
        }
        return answer
    }

    private fun String.getPalindrome(l: Int, r: Int): String {
        var left = l
        var right = r
        while (0 <= left && right < length) {
            if (this[left] != this[right]) break
            left--
            right++
        }
        return substring(left + 1, right)
    }
}
