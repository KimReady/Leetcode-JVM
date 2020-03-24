class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val set = hashSetOf<Char>()
        val n = s.length
        var begin = 0
        var end = 0
        var answer = 0

        while (end < n) {
            if (s[end] in set) {
                set.remove(s[begin++])
            } else {
                set.add(s[end++])
                answer = Integer.max(answer, end - begin)
            }
        }
        return answer
    }
}