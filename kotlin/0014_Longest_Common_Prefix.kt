class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) {
            return ""
        }
        strs[0].forEachIndexed { i, ch ->
            for (j in 1 until strs.size) {
                if (i >= strs[j].length || ch != strs[j][i]) {
                    return strs[0].substring(0 until i)
                }
            }
        }
        return strs[0]
    }
}